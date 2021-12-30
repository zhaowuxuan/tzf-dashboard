package com.tzf.dashboard.modules.share.mapper;

import com.tzf.dashboard.modules.share.model.ShareInformation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 信息 Mapper 接口
 * </p>
 *
 * @author wuxuan
 * @since 2021-12-16
 */
public interface ShareInformationMapper extends BaseMapper<ShareInformation> {
    List<ShareInformation> getCodeList();
}
