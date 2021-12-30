package com.tzf.dashboard.modules.share.controller;


import com.tzf.dashboard.common.api.CommonResult;
import com.tzf.dashboard.modules.share.model.ShareInformation;
import com.tzf.dashboard.modules.share.service.ShareInformationService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 信息 前端控制器
 * </p>
 *
 * @author wuxuan
 * @since 2021-12-16
 */
@RestController
@RequestMapping("/share")
public class ShareInformationController {

    @Autowired
    private ShareInformationService shareInformationService;

    @ApiOperation(value = "获取code")
    @RequestMapping(value = "/code",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<List<ShareInformation>> getShareCode(){
        List<ShareInformation> shareInformation = shareInformationService.getAllCode();
        return CommonResult.success(shareInformation);
    }
}

