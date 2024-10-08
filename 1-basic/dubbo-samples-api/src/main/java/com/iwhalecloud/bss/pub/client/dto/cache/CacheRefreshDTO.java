package com.iwhalecloud.bss.pub.client.dto.cache;

import java.io.Serializable;

/**
 * 刷新缓存对象
 *
 * @author hwjack
 */
public class CacheRefreshDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 刷新接口名字 */
    private String interfaceName;

    /** 刷新方法 */
    private String methodName;

    private String code;

    /** 待刷新的key */
    private String key;

    /** 批次号 */
    private String batchNumber;

    /** 刷新缓存配置Id */
    private String configId;

    /** 操作工号 */
    private String staffId;

    /** 待刷新的节点 */
    private String refreshNodes;

    /** 缓存名称 */
    private String cacheName;

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getRefreshNodes() {
        return refreshNodes;
    }

    public void setRefreshNodes(String refreshNodes) {
        this.refreshNodes = refreshNodes;
    }

    public String getCacheName() {
        return cacheName;
    }

    public void setCacheName(String cacheName) {
        this.cacheName = cacheName;
    }

}
