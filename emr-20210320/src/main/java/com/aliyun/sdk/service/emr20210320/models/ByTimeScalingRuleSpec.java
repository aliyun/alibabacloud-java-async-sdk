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
         * <p>重复执行定时任务的结束时间戳。单位为毫秒。</p>
         * 
         * <strong>example:</strong>
         * <p>1639714800000</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>启动时间戳。单位为毫秒。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1639714634819</p>
         */
        public Builder launchTime(Long launchTime) {
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
         * 
         * <strong>example:</strong>
         * <p>MON,FRI,SUN</p>
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
