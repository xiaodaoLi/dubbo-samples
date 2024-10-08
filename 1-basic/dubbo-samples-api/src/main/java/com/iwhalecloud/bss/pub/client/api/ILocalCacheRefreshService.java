package com.iwhalecloud.bss.pub.client.api;

import com.iwhalecloud.bss.pub.client.dto.cache.CacheRefreshDTO;

/**
 * 缓存刷新接口，记录刷新日志
 *
 * @author hwjack
 */
public interface ILocalCacheRefreshService {

    /**
     * 统一刷新入口
     *
     * @param cacheRefreshDTO
     * @return
     */
    default Object refresh(CacheRefreshDTO cacheRefreshDTO) {
        return null;
    }

//    /**
//     * 查询缓存刷新日志统一入口
//     *
//     * @param batchNumber 批次号
//     * @param staffId 操作工号
//     * @param configId 缓存配置Id
//     * @param start 开始时间
//     * @param end 结束时间
//     * @return
//     */
//    default DataResult<List<CacheRefreshLogVO>> listCacheRefreshlog(String batchNumber, String staffId, String configId,
//                                                                    Date start, Date end) {
//        return null;
//    }

}
