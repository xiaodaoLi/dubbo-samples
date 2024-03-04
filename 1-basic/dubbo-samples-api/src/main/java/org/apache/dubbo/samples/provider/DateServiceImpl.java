package org.apache.dubbo.samples.provider;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.dubbo.samples.api.DateService;

/**
 * @author huang.guangbing
 * @since 2024/3/4
 */
public class DateServiceImpl implements DateService {
    /**
     * 获取当前日期
     *
     * @return
     */
    @Override
    public String getCurrentDateStr() {
        final Date currentDate = new Date();
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(currentDate);
    }

    @Override
    public Date getCurrentDate() {
        return new Date();
    }
}
