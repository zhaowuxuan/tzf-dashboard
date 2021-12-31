package com.tzf.dashboard.modules.cc.controller;


import cn.hutool.core.collection.CollUtil;
import com.tzf.dashboard.common.api.CommonResult;
import com.tzf.dashboard.modules.cc.model.CcSwapOpenInterest;
import com.tzf.dashboard.modules.cc.service.CcSwapOpenInterestService;
import com.tzf.dashboard.modules.ums.model.UmsRole;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wuxuan
 * @since 2021-12-29
 */
@RestController
@Api(tags = "CcSwapOpenInterestController", description = "合约持仓管理")
@RequestMapping("/cc/SwapOpenInterest")
public class CcSwapOpenInterestController {

    @Autowired
    private CcSwapOpenInterestService ccSwapOpenInterestService;

    @ApiOperation("获取最新合约数据")
    @RequestMapping(value = "/newest", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult newest(CcSwapOpenInterest ccSwapOpenInterest,@RequestParam("channel") String channel,@RequestParam("inst_id") String inst_id,@RequestParam("inst_type") String inst_type) {
        CcSwapOpenInterest ccSwapOpenInterests = ccSwapOpenInterestService.getCCNewestData(channel,inst_id,inst_type);
        System.out.println(ccSwapOpenInterests.toString());
        Map<String, Object> data = new HashMap<>();
        data.put("oi", ccSwapOpenInterests.getOi());
        data.put("oi_ccy", ccSwapOpenInterests.getOiCcy());
        data.put("ts", ccSwapOpenInterests.getTs());
        System.out.println(data.toString());
        if (!data.isEmpty()) {
            return CommonResult.success(data);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("存量数据")
    @RequestMapping(value = "/stock", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult stock(@RequestParam("channel") String channel,@RequestParam("inst_id") String inst_id,@RequestParam("inst_type") String inst_type){
        List<CcSwapOpenInterest> ccSwapOpenInterests = ccSwapOpenInterestService.getCCStockData(channel,inst_id,inst_type);
        System.out.println(ccSwapOpenInterests.size());
        Map<String, Object> data = new HashMap<>();
        if(CollUtil.isNotEmpty(ccSwapOpenInterests)){
            List<Long> oi = ccSwapOpenInterests.stream().map(CcSwapOpenInterest::getOi).collect(Collectors.toList());
            data.put("oi",oi);
            List<Long> oi_ccy = ccSwapOpenInterests.stream().map(CcSwapOpenInterest::getOiCcy).collect(Collectors.toList());
            data.put("oi_ccy",oi_ccy);
            List<Long> ts = ccSwapOpenInterests.stream().map(CcSwapOpenInterest::getTs).collect(Collectors.toList());
            data.put("ts",ts);
        }
        System.out.println(data.toString());
        if(!data.isEmpty()){
            return CommonResult.success(data);
        }else {
            return CommonResult.failed();
        }
    }
}

