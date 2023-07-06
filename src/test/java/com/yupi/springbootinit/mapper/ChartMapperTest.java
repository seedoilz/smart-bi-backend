package com.yupi.springbootinit.mapper;

import com.yupi.springbootinit.model.entity.Chart;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ChartMapperTest {

    @Resource
    private ChartMapper chartMapper;

    @Test
    void queryChartData() {
        List<HashMap<String, Object>> stringObjectMap = chartMapper.queryChartData("select * from chart");
    }
}