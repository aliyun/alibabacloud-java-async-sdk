// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TimeRange} extends {@link TeaModel}
 *
 * <p>TimeRange</p>
 */
public class TimeRange extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private TimeRange(Builder builder) {
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TimeRange create() {
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
         * <p>结束时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1676441972000</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>起始时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1676441971000</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public TimeRange build() {
            return new TimeRange(this);
        } 

    } 

}
