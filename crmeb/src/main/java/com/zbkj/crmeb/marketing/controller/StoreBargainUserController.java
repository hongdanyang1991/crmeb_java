package com.zbkj.crmeb.marketing.controller;

import com.common.CommonPage;
import com.common.CommonResult;
import com.common.PageParamRequest;
import com.zbkj.crmeb.marketing.model.StoreBargainUser;
import com.zbkj.crmeb.marketing.request.StoreBargainUserSearchRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户参与砍价表 前端控制器
 */
@Slf4j
@RestController
@RequestMapping("api/admin/marketing/bargain/user")
@Api(tags = "营销 -- 用户参与砍价表")
public class StoreBargainUserController {

    /**
     * 分页显示砍价用户表
     * @param request 搜索条件
     * @param pageParamRequest 分页参数
     */
    @ApiOperation(value = "分页列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public CommonResult<CommonPage<StoreBargainUser>> getList(@Validated StoreBargainUserSearchRequest request, @Validated PageParamRequest pageParamRequest){
        return CommonResult.success(null);
    }

}
