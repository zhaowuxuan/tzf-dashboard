package com.tzf.dashboard.modules.share.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 信息
 * </p>
 *
 * @author wuxuan
 * @since 2021-12-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("share_information")
@ApiModel(value="ShareInformation对象", description="信息")
public class ShareInformation implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String dm;

    @ApiModelProperty(value = "序号")
    private Integer xh;

    @ApiModelProperty(value = "名称")
    private String mc;

    @ApiModelProperty(value = "现价(元)")
    private BigDecimal xj;

    @ApiModelProperty(value = "涨跌幅(%)")
    private BigDecimal zdf;

    @ApiModelProperty(value = "最新股东户数(户)")
    private Long zxgdhs;

    @ApiModelProperty(value = "前十大流通股东名称")
    private String qsdltgdmc;

    @ApiModelProperty(value = "前十大流通股东持股比例合计(%)")
    private BigDecimal qsdltgdcgblhj;

    @ApiModelProperty(value = "前十大流通股东持股数量合计(股)")
    private Long qsdltgdcgslhj;

    @ApiModelProperty(value = "前十大流通股东持股市值(元)")
    private Long qsdltgdcgsz;

    @ApiModelProperty(value = "所属同花顺行业")
    private String ssthshy;

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
