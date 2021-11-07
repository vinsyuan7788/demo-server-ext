package com.demo.server.ext.web.application.excel;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vince Yuan
 * @date 06/08/2021
 */
@Api(value = "应用-Excel-EasyPOI", tags = "应用-Excel-EasyPOI")
@Slf4j
@RestController
@RequestMapping("/excel/easy/poi")
public class PoiController {
}
