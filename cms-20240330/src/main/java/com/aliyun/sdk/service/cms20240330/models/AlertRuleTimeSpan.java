// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AlertRuleTimeSpan} extends {@link TeaModel}
 *
 * <p>AlertRuleTimeSpan</p>
 */
public class AlertRuleTimeSpan extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dayOfWeek")
    private java.util.List < Integer > dayOfWeek;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("gmtOffset")
    private String gmtOffset;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    private AlertRuleTimeSpan(Builder builder) {
        this.dayOfWeek = builder.dayOfWeek;
        this.endTime = builder.endTime;
        this.gmtOffset = builder.gmtOffset;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleTimeSpan create() {
        return builder().build();
    }

    /**
     * @return dayOfWeek
     */
    public java.util.List < Integer > getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return gmtOffset
     */
    public String getGmtOffset() {
        return this.gmtOffset;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private java.util.List < Integer > dayOfWeek; 
        private String endTime; 
        private String gmtOffset; 
        private String startTime; 

        /**
         * dayOfWeek.
         */
        public Builder dayOfWeek(java.util.List < Integer > dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * gmtOffset.
         */
        public Builder gmtOffset(String gmtOffset) {
            this.gmtOffset = gmtOffset;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public AlertRuleTimeSpan build() {
            return new AlertRuleTimeSpan(this);
        } 

    } 

}
