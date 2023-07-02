package com.yupi.springbootinit.model.vo;

import lombok.Data;

/**
 * ai返回结果
 */
@Data
public class AiResponse {

    private String genChart;

    private String genResult;

    private Long chartId;
}
