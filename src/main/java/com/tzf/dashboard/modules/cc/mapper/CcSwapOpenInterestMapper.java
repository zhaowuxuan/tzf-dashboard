package com.tzf.dashboard.modules.cc.mapper;

import com.tzf.dashboard.modules.cc.model.CcSwapOpenInterest;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wuxuan
 * @since 2021-12-29
 */
public interface CcSwapOpenInterestMapper extends BaseMapper<CcSwapOpenInterest> {
    CcSwapOpenInterest getCCNewerData(@Param("channel") String channel,@Param("inst_id") String inst_id,@Param("inst_type") String inst_type);
    List<CcSwapOpenInterest> getCCStockData(@Param("channel") String channel,@Param("inst_id") String inst_id,@Param("inst_type") String inst_type);
}
