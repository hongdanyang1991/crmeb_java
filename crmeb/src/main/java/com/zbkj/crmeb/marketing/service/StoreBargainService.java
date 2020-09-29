package com.zbkj.crmeb.marketing.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.PageParamRequest;
import com.zbkj.crmeb.marketing.model.StoreBargain;
import com.zbkj.crmeb.marketing.request.StoreBargainSearchRequest;

import java.util.List;

/**
 * @author hong
 * @description StoreBargainService 接口
 */

public interface StoreBargainService extends IService<StoreBargain> {

    List<StoreBargain> getList(StoreBargainSearchRequest request, PageParamRequest pageParamRequest);


}
