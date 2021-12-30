package com.tzf.dashboard.modules.share.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 列定义
 * </p>
 *
 * @author wuxuan
 * @since 2021-12-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("share_data_col_def")
@ApiModel(value="ShareDataColDef对象", description="列定义")
public class ShareDataColDef implements Serializable {

    private static final long serialVersionUID=1L;

    private String colDef;

    private String colDesc;


}
