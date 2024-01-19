package com.example.mqtt.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author: zhangxu
 * @date: 2023/8/4
 */
@Data
@TableName(value = "register")
@ApiModel(value = "register对象", description = "寄存器使能")
public class Register {

    @TableId
    private int id;

    @ApiModelProperty(value = "创建该数据项时的时间")
    private Date gmtCreate;

    @JsonProperty(value = "msgId")
    @ApiModelProperty(value = "消息id")
    private String msgId;

    @JsonProperty(value = "sn")
    @ApiModelProperty(value = "采集器编号")
    private String sn;

    @JsonProperty(value = "method")
    @ApiModelProperty(value = "电表编号")
    private String method;

    @JsonProperty(value = "YG")
    @ApiModelProperty(value = "瞬时有功功率")
    private float YG;

    @JsonProperty(value = "YGA")
    @ApiModelProperty(value = " 瞬时a相有功功率")
    private float YGA;

    @JsonProperty(value = "YGB")
    @ApiModelProperty(value = "瞬时b相有功功数")
    private float YGB;

    @JsonProperty(value = "YGC")
    @ApiModelProperty(value = "瞬时c相有功功率")
    private float YGC;

    @JsonProperty(value = "GLYS")
    @ApiModelProperty(value = "总功率因数")
    private float GLYS;

    @JsonProperty(value = "GLYSA")
    @ApiModelProperty(value = "a相功率因数")
    private float GLYSA;

    @JsonProperty(value = "GLYSB")
    @ApiModelProperty(value = "b相功率因数")
    private float GLYSB;

    @JsonProperty(value = "GLYSC")
    @ApiModelProperty(value = "c相功率因数")
    private float GLYSC;

    @JsonProperty(value = "PL")
    @ApiModelProperty(value = "电网频率")
    private float PL;

    @JsonProperty(value = "ZYG")
    @ApiModelProperty(value = "正相有功总电能")
    private float ZYG;

    @JsonProperty(value = "FYG")
    @ApiModelProperty(value = "反向有功总电能")
    private float FYG;

    @JsonProperty(value = "ZHYG")
    @ApiModelProperty(value = "组合有功总电能")
    private float ZHYG;

    @JsonProperty(value = "DSZHYG")
    @ApiModelProperty(value = "尖时段组合有功电能")
    private float DSZHYG;

    @JsonProperty(value = "FSZHYG")
    @ApiModelProperty(value = "峰时段组合有功电能")
    private float FSZHYG;

    @JsonProperty(value = "PSZHYG")
    @ApiModelProperty(value = "平时段组合有功电能")
    private float PSZHYG;

    @JsonProperty(value = "GSZHYG")
    @ApiModelProperty(value = "谷时段组合有功电能")
    private float GSZHYG;

    @JsonProperty(value = "DLA")
    @ApiModelProperty(value = "电流a")
    private float DLA;

    @JsonProperty(value = "DLB")
    @ApiModelProperty(value = "电流b")
    private float DLB;

    @JsonProperty(value = "DLC")
    @ApiModelProperty(value = "电流c")
    private float DLC;

    @JsonProperty(value = "DYA")
    @ApiModelProperty(value = "电压a")
    private float DYA;

    @JsonProperty(value = "DYB")
    @ApiModelProperty(value = "电压b")
    private float DYB;

    @JsonProperty(value = "DYC")
    @ApiModelProperty(value = "电压c")
    private float DYC;



}
