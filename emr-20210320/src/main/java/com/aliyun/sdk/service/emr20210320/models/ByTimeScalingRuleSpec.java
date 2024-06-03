// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ByTimeScalingRuleSpec} extends {@link TeaModel}
 *
 * <p>ByTimeScalingRuleSpec</p>
 */
public class ByTimeScalingRuleSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("LaunchTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long launchTime;

    @com.aliyun.core.annotation.NameInMap("RecurrenceType")
    private String recurrenceType;

    @com.aliyun.core.annotation.NameInMap("RecurrenceValue")
    private String recurrenceValue;

    private ByTimeScalingRuleSpec(Builder builder) {
        this.endTime = builder.endTime;
        this.launchTime = builder.launchTime;
        this.recurrenceType = builder.recurrenceType;
        this.recurrenceValue = builder.recurrenceValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ByTimeScalingRuleSpec create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return launchTime
     */
    public Long getLaunchTime() {
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

    public static final class Builder {
        private Long endTime; 
        private Long launchTime; 
        private String recurrenceType; 
        private String recurrenceValue; 

        /**
         * 重复执行定时任务的结束时间戳。单位为毫秒。
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * 启动时间戳。单位为毫秒。
         */
        public Builder launchTime(Long launchTime) {
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
         */
        public Builder recurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }

        public ByTimeScalingRuleSpec build() {
            return new ByTimeScalingRuleSpec(this);
        } 

    } 

}
