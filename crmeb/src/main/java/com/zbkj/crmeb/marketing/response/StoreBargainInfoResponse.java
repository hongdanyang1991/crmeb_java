package com.zbkj.crmeb.marketing.response;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 优惠券记录表
 * @author hong
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="StoreBargainInfoResponse对象", description="砍价详情")
public class StoreBargainInfoResponse implements Serializable {

    private static final long serialVersionUID=1L;

}
