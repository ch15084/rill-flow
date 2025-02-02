/*
 *  Copyright 2021-2023 Weibo, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.weibo.rill.flow.impl.dconfs;

import com.weibo.rill.flow.service.configuration.BeanConfig;
import com.weibo.rill.flow.service.dconfs.DynamicClientConfs;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Slf4j
@Data
@Component
public class DynamicClientConfsImpl implements DynamicClientConfs {
    private Map<String, BeanConfig> runtimeStorage = new ConcurrentHashMap<>();
    private Map<String, BeanConfig> longTermStorage = new ConcurrentHashMap<>();
    private Map<String, BeanConfig> customizedStorage = new ConcurrentHashMap<>();
    private Map<String, BeanConfig> httpConfig = new ConcurrentHashMap<>();
    private Map<String, BeanConfig> submitConfig = new ConcurrentHashMap<>();
}
