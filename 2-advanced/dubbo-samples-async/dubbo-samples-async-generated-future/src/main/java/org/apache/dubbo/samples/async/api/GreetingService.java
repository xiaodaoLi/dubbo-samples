/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dubbo.samples.async.api;

import java.util.concurrent.CompletableFuture;

public interface GreetingService {

    String greeting(String name);

    default String replyGreeting(String name) {
        return "Fine, " + name;
    }

    /**
     * 服务端提供了CompletableFuture 签名的接口。
     * return CompletableFuture.supplyAsync() 业务执行已从 Dubbo 线程切换到业务线程，避免了对 Dubbo 线程池的阻塞
     * @param name
     * @param signal
     * @return
     */
    default CompletableFuture<String> greeting(String name, byte signal) {
        return CompletableFuture.completedFuture(greeting(name));
    }

}
