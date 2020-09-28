package com.zbkj.crmeb.marketing.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("eb_store_bargain")
@ApiModel(value="StoreBargain对象", description="砍价表")
public class StoreBargain implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "砍价商品ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
}
