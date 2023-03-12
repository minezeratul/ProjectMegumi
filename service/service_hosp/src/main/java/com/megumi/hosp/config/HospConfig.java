package com.megumi.hosp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Minzeratul
 * @date 2023/3/12 15:28
 */


@Configuration
@MapperScan("com.megumi.hosp.mapper")
public class HospConfig {

}
