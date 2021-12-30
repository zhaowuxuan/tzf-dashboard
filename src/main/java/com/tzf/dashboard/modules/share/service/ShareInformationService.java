package com.tzf.dashboard.modules.share.service;

import com.tzf.dashboard.modules.share.model.ShareInformation;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 信息 服务类
 * </p>
 *
 * @author wuxuan
 * @since 2021-12-16
 */
public interface ShareInformationService extends IService<ShareInformation> {
    List<ShareInformation> getAllCode();
}
