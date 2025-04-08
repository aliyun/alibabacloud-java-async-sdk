// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link TimeRange} extends {@link TeaModel}
 *
 * <p>TimeRange</p>
 */
public class TimeRange extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("startTime")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(TimeRange model) {
            this.endTime = model.endTime;
            this.startTime = model.startTime;
        } 

        /**
         * <p>时间范围结束时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1688370894339</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>时间范围开始时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1688370894339</p>
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
