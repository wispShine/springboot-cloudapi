package com.goldenhome.common.utils;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by Sunny on 2020/1/13.
 */
@lombok.Data
public class Data<T> {

    @ApiModelProperty(required = true)
    private List<T> details;
}
