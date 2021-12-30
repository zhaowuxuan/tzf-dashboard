package com.tzf.dashboard.modules.share.service.impl;

import com.tzf.dashboard.modules.share.model.ShareInformation;
import com.tzf.dashboard.modules.share.mapper.ShareInformationMapper;
import com.tzf.dashboard.modules.share.service.ShareInformationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 信息 服务实现类
 * </p>
 *
 * @author wuxuan
 * @since 2021-12-16
 */
@Service
public class ShareInformationServiceImpl extends ServiceImpl<ShareInformationMapper, ShareInformation> implements ShareInformationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShareInformationServiceImpl.class);

    @Autowired
    private ShareInformationService shareInformationService;

    @Autowired
    private ShareInformationMapper shareInformationMapper;

    @Override
    public List<ShareInformation> getAllCode() {
        return shareInformationMapper.getCodeList();
    }
}
