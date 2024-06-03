// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TimeConstraint} extends {@link TeaModel}
 *
 * <p>TimeConstraint</p>
 */
public class TimeConstraint extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private TimeConstraint(Builder builder) {
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TimeConstraint create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String endTime; 
        private String startTime; 

        /**
         * 结束时间。取值范围：00:00:00至23:59:59
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * 开始时间。取值范围：00:00:00至23:59:59
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public TimeConstraint build() {
            return new TimeConstraint(this);
        } 

    } 

}
