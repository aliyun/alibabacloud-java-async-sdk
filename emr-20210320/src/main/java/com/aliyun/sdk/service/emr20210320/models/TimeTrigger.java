// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TimeTrigger} extends {@link TeaModel}
 *
 * <p>TimeTrigger</p>
 */
public class TimeTrigger extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("LaunchExpirationTime")
    private Integer launchExpirationTime;

    @com.aliyun.core.annotation.NameInMap("LaunchTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String launchTime;

    @com.aliyun.core.annotation.NameInMap("RecurrenceType")
    private String recurrenceType;

    @com.aliyun.core.annotation.NameInMap("RecurrenceValue")
    private String recurrenceValue;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private TimeTrigger(Builder builder) {
        this.endTime = builder.endTime;
        this.launchExpirationTime = builder.launchExpirationTime;
        this.launchTime = builder.launchTime;
        this.recurrenceType = builder.recurrenceType;
        this.recurrenceValue = builder.recurrenceValue;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TimeTrigger create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return launchExpirationTime
     */
    public Integer getLaunchExpirationTime() {
        return this.launchExpirationTime;
    }

    /**
     * @return launchTime
     */
    public String getLaunchTime() {
        return this.launchTime;
    }

    /**
     * @return recurrenceType
     */
    public String getRecurrenceType() {
        return this.recurrenceType;
    }

    /**
     * @return recurrenceValue
     */
    public String getRecurrenceValue() {
        return this.recurrenceValue;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private Long endTime; 
        private Integer launchExpirationTime; 
        private String launchTime; 
        private String recurrenceType; 
        private String recurrenceValue; 
        private Long startTime; 

        /**
         * 结束时间戳。单位为毫秒。
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * 定时任务触发操作失败后，在此时间内重试。单位为秒，取值范围：0~3600。
         */
        public Builder launchExpirationTime(Integer launchExpirationTime) {
            this.launchExpirationTime = launchExpirationTime;
            return this;
        }

        /**
         * 启动时间。
         */
        public Builder launchTime(String launchTime) {
            this.launchTime = launchTime;
            return this;
        }

        /**
         * 指定时间规则的执行类型。
         */
        public Builder recurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }

        /**
         * 重复执行定时任务的数值。具体取值取决于 recurrenceType 设置。
         * <p>
         * - recurrenceType 取 MINUTELY 时，只能填一个数值，取值范围：1~1440。
         * - recurrenceType 取 HOURLY 时，只能填一个数值，取值范围：1~24。
         * - recurrenceType 取 DAILY 时，只能填一个数值，取值范围：1~31。
         * - recurrenceType 取 WEEKLY 时，可以填入多个值，填多个值时使用英文逗号（,）分隔。周一到周天分别用MON，TUE，WED，THU，FRI，SAT，SUN代替。 比如 MON,FRI,SUN 代表周一、周五、周天。
         * - recurrenceType 取 MONTHLY 时，格式为A-B或者A,B。A、B的取值范围为1~31，如果使用A-B时B必须大于A。
         */
        public Builder recurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }

        /**
         * 开始时间戳。单位为毫秒。
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        public TimeTrigger build() {
            return new TimeTrigger(this);
        } 

    } 

}
