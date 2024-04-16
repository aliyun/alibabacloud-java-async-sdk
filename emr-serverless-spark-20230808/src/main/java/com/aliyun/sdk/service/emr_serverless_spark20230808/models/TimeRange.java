// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TimeRange} extends {@link TeaModel}
 *
 * <p>TimeRange</p>
 */
public class TimeRange extends TeaModel {
    @NameInMap("endTime")
    private Long endTime;

    @NameInMap("startTime")
    private Long startTime;

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
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private Long endTime; 
        private Long startTime; 

        /**
         * 时间范围结束时间。
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * 时间范围开始时间。
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        public TimeRange build() {
            return new TimeRange(this);
        } 

    } 

}
