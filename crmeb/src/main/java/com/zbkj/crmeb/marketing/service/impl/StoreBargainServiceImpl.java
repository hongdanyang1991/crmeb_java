package com.zbkj.crmeb.marketing.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.common.PageParamRequest;
import com.github.pagehelper.PageHelper;
import com.zbkj.crmeb.marketing.dao.StoreBargainDao;
import com.zbkj.crmeb.marketing.model.StoreBargain;
import com.zbkj.crmeb.marketing.request.StoreBargainSearchRequest;
import com.zbkj.crmeb.marketing.service.StoreBargainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hong
 * @description StoreBargainServiceImpl 接口实现
 */
@Service
public class StoreBargainServiceImpl extends ServiceImpl<StoreBargainDao, StoreBargain> implements StoreBargainService {

    @Resource
    private StoreBargainDao dao;

    @Override
    public List<StoreBargain> getList(StoreBargainSearchRequest request, PageParamRequest pageParamRequest) {
        PageHelper.startPage(pageParamRequest.getPage(), pageParamRequest.getLimit());
        LambdaQueryWrapper<StoreBargain> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.orderByDesc(StoreBargain::getSort).orderByDesc(StoreBargain::getId);
        return dao.selectList(lambdaQueryWrapper);
    }
}
