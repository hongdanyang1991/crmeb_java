package com.zbkj.crmeb.marketing.request;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 砍价用户帮助搜索
 * @author hong
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("eb_store_bargain_user_help")
@ApiModel(value="StoreBargainUserHelpSearchRequest对象", description="砍价用户帮助搜索")
public class StoreBargainUserHelpSearchRequest  implements Serializable {

    private static final long serialVersionUID=1L;

}