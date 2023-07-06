package com.yupi.springbootinit.mapper;

import com.yupi.springbootinit.model.entity.Chart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.HashMap;
import java.util.List;

/**
* @author seedoilz
* @description 针对表【chart(图表信息表)】的数据库操作Mapper
* @createDate 2023-06-29 14:34:11
* @Entity com.yupi.springbootinit.model.entity.Chart
*/
public interface ChartMapper extends BaseMapper<Chart> {

    List<HashMap<String, Object>> queryChartData(String querySql);
}




