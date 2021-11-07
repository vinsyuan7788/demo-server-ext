package com.demo.server.ext.web.theory.algorithm.fundamental.idea;

import com.demo.base.common.response.bean.CommonResponse;
import com.demo.server.ext.common.utils.RestTemplateUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static com.demo.server.ext.common.utils.RestTemplateUtils.getJSONRequest;

/**
 * @author Vince Yuan
 * @date 04/11/2021
 */
@Api(value = "原理-基础算法-思想-迭代", tags = "原理-基础算法-思想-迭代")
@Slf4j
@RestController
@RequestMapping("/algorithm/fundamental/idea/iterative")
public class IterativeController {

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @Autowired
    private Environment environment;

    @ApiOperation(value = "数组-冒泡排序", notes = "数组-冒泡排序")
    @PostMapping("/bubbleSortInArray")
    public CommonResponse bubbleSortInArray() {
        RestTemplate restTemplate = RestTemplateUtils.getRestTemplate(restTemplateBuilder);
        return restTemplate.postForObject(RestTemplateUtils.getURL(RestTemplateUtils.HTTP_PROTOCOL, "/algorithm/fundamental/implementation/sort/bubbleSortInArray", environment), getJSONRequest(null), CommonResponse.class);
    }

    @ApiOperation(value = "数组-选择排序", notes = "数组-选择排序")
    @PostMapping("/selectSortInArray")
    public CommonResponse selectSortInArray() {
        RestTemplate restTemplate = RestTemplateUtils.getRestTemplate(restTemplateBuilder);
        return restTemplate.postForObject(RestTemplateUtils.getURL(RestTemplateUtils.HTTP_PROTOCOL, "/algorithm/fundamental/implementation/sort/selectSortInArray", environment), getJSONRequest(null), CommonResponse.class);
    }

    @ApiOperation(value = "数组-插入排序", notes = "数组-（直接）插入排序")
    @PostMapping("/insertSortInArray")
    public CommonResponse insertSortInArray() {
        RestTemplate restTemplate = RestTemplateUtils.getRestTemplate(restTemplateBuilder);
        return restTemplate.postForObject(RestTemplateUtils.getURL(RestTemplateUtils.HTTP_PROTOCOL, "/algorithm/fundamental/implementation/sort/insertSortInArray", environment), getJSONRequest(null), CommonResponse.class);
    }

    @ApiOperation(value = "数组-插入排序-二分搜索优化", notes = "数组-二分（或折半）插入排序")
    @PostMapping("/insertSortWithBinarySearchInArray")
    public CommonResponse insertSortWithBinarySearchInArray() {
        RestTemplate restTemplate = RestTemplateUtils.getRestTemplate(restTemplateBuilder);
        return restTemplate.postForObject(RestTemplateUtils.getURL(RestTemplateUtils.HTTP_PROTOCOL, "/algorithm/fundamental/implementation/sort/insertSortWithBinarySearchInArray", environment), getJSONRequest(null), CommonResponse.class);
    }

    @ApiOperation(value = "数组-插入排序-缩减增量分组优化", notes = "数组-希尔（或缩减增量）排序")
    @PostMapping("/insertSortWithDiminishingIncrementInArray")
    public CommonResponse insertSortWithDiminishingIncrementInArray() {
        RestTemplate restTemplate = RestTemplateUtils.getRestTemplate(restTemplateBuilder);
        return restTemplate.postForObject(RestTemplateUtils.getURL(RestTemplateUtils.HTTP_PROTOCOL, "/algorithm/fundamental/implementation/sort/insertSortWithDiminishingIncrementInArray", environment), getJSONRequest(null), CommonResponse.class);
    }

    @ApiOperation(value = "数组-堆排序", notes = "数组-堆排序")
    @PostMapping("/heapSortInArray")
    public CommonResponse heapSortInArray() {
        RestTemplate restTemplate = RestTemplateUtils.getRestTemplate(restTemplateBuilder);
        return restTemplate.postForObject(RestTemplateUtils.getURL(RestTemplateUtils.HTTP_PROTOCOL, "/algorithm/fundamental/implementation/sort/heapSortInArray", environment), getJSONRequest(null), CommonResponse.class);
    }
}
