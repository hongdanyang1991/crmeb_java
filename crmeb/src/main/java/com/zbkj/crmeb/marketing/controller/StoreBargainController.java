package com.zbkj.crmeb.marketing.controller;

import com.common.CommonPage;
import com.common.CommonResult;
import com.common.PageParamRequest;
import com.zbkj.crmeb.marketing.model.StoreBargain;
import com.zbkj.crmeb.marketing.request.StoreBargainRequest;
import com.zbkj.crmeb.marketing.request.StoreBargainSearchRequest;
import com.zbkj.crmeb.marketing.response.StoreBargainInfoResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 砍价表 前端控制器
 */
@Slf4j
@RestController
@RequestMapping("api/admin/marketing/bargain")
@Api(tags = "营销 -- 砍价")
public class StoreBargainController {


    /**
     * 分页显示砍价表
     * @param request 搜索条件
     * @param pageParamRequest 分页参数
     */
    @ApiOperation(value = "分页列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public CommonResult<CommonPage<StoreBargain>> getList(@Validated StoreBargainSearchRequest request, @Validated PageParamRequest pageParamRequest){
        return CommonResult.success(null);
    }

    /**
     * 保存砍价表
     * @param request StoreCouponRequest 新增参数
     */
    @ApiOperation(value = "新增")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public CommonResult<String> save(@RequestBody @Validated StoreBargainRequest request){
        return CommonResult.success();
    }

    /**
     * 是否有效
     * @param id integer id
     */
    @ApiOperation(value = "修改")
    @RequestMapping(value = "/update/status", method = RequestMethod.POST)
    public CommonResult<String> updateStatus(@RequestParam Integer id, @RequestParam Boolean status){
        return CommonResult.success();
    }

    /**
     * 详情
     * @param id integer id
     */
    @ApiOperation(value = "详情")
    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public CommonResult<StoreBargainInfoResponse> info(@RequestParam Integer id){
        return CommonResult.success(null);
    }

}
