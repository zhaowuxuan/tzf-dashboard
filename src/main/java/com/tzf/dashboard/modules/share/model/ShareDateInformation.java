package com.tzf.dashboard.modules.share.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 日期节点数据
 * </p>
 *
 * @author wuxuan
 * @since 2021-12-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("share_date_information")
@ApiModel(value="ShareDateInformation对象", description="日期节点数据")
public class ShareDateInformation implements Serializable {

    private static final long serialVersionUID=1L;

    private String dm;

    private Date dataDate;

    @ApiModelProperty(value = "a股流通市值(元)")
    private Long agltsz;

    @ApiModelProperty(value = "总市值(元)")
    private Long zsz;

    @ApiModelProperty(value = "总股本(股)")
    private Long zgb;

    @ApiModelProperty(value = "流通a股(股)")
    private Long ltag;

    @ApiModelProperty(value = "股息率(股票获利率)(%)")
    private BigDecimal gxl;

    @ApiModelProperty(value = "基本每股收益(元)")
    private BigDecimal jbmgsy;

    @ApiModelProperty(value = "净资产(元)")
    private Long jzc;

    @ApiModelProperty(value = "净利润(元)")
    private Long jlr;

    @ApiModelProperty(value = "营业收入(元)")
    private Long yysr;

    @ApiModelProperty(value = "资产总计(元)")
    private Long zczj;

    @ApiModelProperty(value = "每股资本公积(元)")
    private BigDecimal mgzbgj;

    @ApiModelProperty(value = "每股净资产(元)")
    private BigDecimal mgjzc;

    @ApiModelProperty(value = "每股经营现金流(元)")
    private BigDecimal mgjyxjl;

    @ApiModelProperty(value = "每股未分配利润(元)")
    private BigDecimal mgwfplr;


}
