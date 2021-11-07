package com.demo.server.ext.web.application.pagehelper;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vince Yuan
 * @date 03/02/2021
 */
@Api(value = "应用-PageHelper", tags = "应用-PageHelper")
@Slf4j
@RestController
@RequestMapping("/page/helper")
public class PageHelperController {
}
