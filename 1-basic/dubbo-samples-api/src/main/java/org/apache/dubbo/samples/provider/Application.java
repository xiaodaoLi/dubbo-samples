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

package org.apache.dubbo.samples.provider;

import com.iwhalecloud.bss.pub.client.ILocalCacheRefreshServiceImpl;
import com.iwhalecloud.bss.pub.client.api.ILocalCacheRefreshService;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.apache.dubbo.config.bootstrap.builders.ProtocolBuilder;
import org.apache.dubbo.config.bootstrap.builders.ServiceBuilder;
import org.apache.dubbo.samples.api.GreetingsService;

public class Application {
    public static void main(String[] args) {
        DubboBootstrap.getInstance()
                .protocol(ProtocolBuilder.newBuilder().name("tri").port(50052).build())
                .service(ServiceBuilder.newBuilder().interfaceClass(GreetingsService.class).ref(new GreetingsServiceImpl()).build())
                .service(ServiceBuilder.newBuilder().interfaceClass(ILocalCacheRefreshService.class).ref(new ILocalCacheRefreshServiceImpl()).build())
                .start()
                .await();
    }

}
