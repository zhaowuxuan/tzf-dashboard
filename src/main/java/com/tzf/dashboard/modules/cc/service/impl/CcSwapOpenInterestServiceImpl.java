package com.tzf.dashboard.modules.cc.service.impl;

import com.tzf.dashboard.modules.cc.model.CcSwapOpenInterest;
import com.tzf.dashboard.modules.cc.mapper.CcSwapOpenInterestMapper;
import com.tzf.dashboard.modules.cc.service.CcSwapOpenInterestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wuxuan
 * @since 2021-12-29
 */
@Service
public class CcSwapOpenInterestServiceImpl extends ServiceImpl<CcSwapOpenInterestMapper, CcSwapOpenInterest> implements CcSwapOpenInterestService {

    @Autowired
    private CcSwapOpenInterestMapper ccSwapOpenInterestMapper;


    @Override
    public CcSwapOpenInterest getCCNewestData(String channel, String inst_id, String inst_type){
        CcSwapOpenInterest ccSwapOpenInterest = ccSwapOpenInterestMapper.getCCNewerData(channel,inst_id,inst_type);
        return ccSwapOpenInterest;
    }

    @Override
    public List<CcSwapOpenInterest> getCCStockData(String channel,String inst_id, String inst_type){
        List<CcSwapOpenInterest> ccSwapOpenInterest = ccSwapOpenInterestMapper.getCCStockData(channel,inst_id,inst_type);
        return ccSwapOpenInterest;
    }
}
