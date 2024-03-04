package org.apache.dubbo.samples.api;

import java.util.Date;

/**
 * @author huang.guangbing
 * @since 2024/3/4
 */
public interface DateService {
    /**
     * 获取当前日期
     * @return
     */
    String getCurrentDateStr();

    Date getCurrentDate();
}
