// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>结束时间戳。单位为毫秒。</p>
         * 
         * <strong>example:</strong>
         * <p>1639714800000</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>定时任务触发操作失败后，在此时间内重试。单位为秒，取值范围：0~3600。</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder launchExpirationTime(Integer launchExpirationTime) {
            this.launchExpirationTime = launchExpirationTime;
            return this;
        }

        /**
         * <p>启动时间。</p>
         * <p>This parameter is required.</p>
         */
        public Builder launchTime(String launchTime) {
            this.launchTime = launchTime;
            return this;
        }

        /**
         * <p>指定时间规则的执行类型。</p>
         * 
         * <strong>example:</strong>
         * <p>WEEKLY</p>
         */
        public Builder recurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }

        /**
         * <p>重复执行定时任务的数值。具体取值取决于 recurrenceType 设置。</p>
         * <ul>
         * <li>recurrenceType 取 MINUTELY 时，只能填一个数值，取值范围：1~1440。</li>
         * <li>recurrenceType 取 HOURLY 时，只能填一个数值，取值范围：1~24。</li>
         * <li>recurrenceType 取 DAILY 时，只能填一个数值，取值范围：1~31。</li>
         * <li>recurrenceType 取 WEEKLY 时，可以填入多个值，填多个值时使用英文逗号（,）分隔。周一到周天分别用MON，TUE，WED，THU，FRI，SAT，SUN代替。 比如 MON,FRI,SUN 代表周一、周五、周天。</li>
         * <li>recurrenceType 取 MONTHLY 时，格式为A-B或者A,B。A、B的取值范围为1~31，如果使用A-B时B必须大于A。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MON,FRI,SUN</p>
         */
        public Builder recurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }

        /**
         * <p>开始时间戳。单位为毫秒。</p>
         * 
         * <strong>example:</strong>
         * <p>1639714800000</p>
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
