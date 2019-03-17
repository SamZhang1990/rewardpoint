/*
 * Copyright 2017-2019 CodingApi .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.codingapi.txlcn.tm;

import com.codingapi.txlcn.tm.support.TxLcnManagerBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description:
 * Company: CodingApi
 * Date: 2018/11/29
 *
 * @author lorne
 */
@SpringBootApplication
@EnableEurekaClient
public class TMApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(TMApplication.class);
        springApplication.setBanner(new TxLcnManagerBanner());
        springApplication.run(args);
    }
}
