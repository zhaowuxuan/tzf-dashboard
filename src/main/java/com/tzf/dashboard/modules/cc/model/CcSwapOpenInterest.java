package com.tzf.dashboard.modules.cc.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author wuxuan
 * @since 2021-12-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("cc_swap_open_interest")
@ApiModel(value="CcSwapOpenInterest对象", description="")
public class CcSwapOpenInterest implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "data_time")
    private Date dataTime;

    @ApiModelProperty(value = "channel")
    private String channel;

    @ApiModelProperty(value = "instId")
    private String instId;

    @ApiModelProperty(value = "instType")
    private String instType;

    @ApiModelProperty(value = "oi")
    private Long oi;

    @ApiModelProperty(value = "oi_ccy")
    private Long oiCcy;

    @ApiModelProperty(value = "ts")
    private Long ts;


}
