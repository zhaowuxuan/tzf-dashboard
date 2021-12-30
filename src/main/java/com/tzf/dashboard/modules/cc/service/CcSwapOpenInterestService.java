package com.tzf.dashboard.modules.cc.service;

import com.tzf.dashboard.modules.cc.model.CcSwapOpenInterest;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wuxuan
 * @since 2021-12-29
 */
public interface CcSwapOpenInterestService extends IService<CcSwapOpenInterest> {
    CcSwapOpenInterest getCCNewestData(String channel, String inst_id, String inst_type);

    List<CcSwapOpenInterest> getCCStockData(String channel,String inst_id,String inst_type);
}
