package com.iwhalecloud.bss.pub.client;

import com.alibaba.fastjson2.JSON;
import com.iwhalecloud.bss.pub.client.api.ILocalCacheRefreshService;
import com.iwhalecloud.bss.pub.client.dto.cache.CacheRefreshDTO;
import org.apache.dubbo.config.annotation.Service;

@Service(group = "hgb")
public class ILocalCacheRefreshServiceImpl implements ILocalCacheRefreshService {

    @Override
    public Object refresh(CacheRefreshDTO cacheRefreshDTO) {
        System.out.println("-----------------------------------------------------");
        System.out.println("ILocalCacheRefreshServiceImpl.refresh");
        System.out.println(JSON.toJSONString(cacheRefreshDTO));
        return "hgb success";
    }

}
