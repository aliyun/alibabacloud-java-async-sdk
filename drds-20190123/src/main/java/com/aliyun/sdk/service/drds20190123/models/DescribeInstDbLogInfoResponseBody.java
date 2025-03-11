// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeInstDbLogInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstDbLogInfoResponseBody</p>
 */
public class DescribeInstDbLogInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogTimeRange")
    private LogTimeRange logTimeRange;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeInstDbLogInfoResponseBody(Builder builder) {
        this.logTimeRange = builder.logTimeRange;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstDbLogInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return logTimeRange
     */
    public LogTimeRange getLogTimeRange() {
        return this.logTimeRange;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private LogTimeRange logTimeRange; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The time range for log query.</p>
         */
        public Builder logTimeRange(LogTimeRange logTimeRange) {
            this.logTimeRange = logTimeRange;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A5438952-70EE-4FA5-87A9-080DB0ASD45F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeInstDbLogInfoResponseBody build() {
            return new DescribeInstDbLogInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstDbLogInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstDbLogInfoResponseBody</p>
     */
    public static class LogTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportLatestTime")
        private Long supportLatestTime;

        @com.aliyun.core.annotation.NameInMap("SupportOldestTime")
        private Long supportOldestTime;

        private LogTimeRange(Builder builder) {
            this.supportLatestTime = builder.supportLatestTime;
            this.supportOldestTime = builder.supportOldestTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogTimeRange create() {
            return builder().build();
        }

        /**
         * @return supportLatestTime
         */
        public Long getSupportLatestTime() {
            return this.supportLatestTime;
        }

        /**
         * @return supportOldestTime
         */
        public Long getSupportOldestTime() {
            return this.supportOldestTime;
        }

        public static final class Builder {
            private Long supportLatestTime; 
            private Long supportOldestTime; 

            /**
             * <p>The start time of the query time range.</p>
             * 
             * <strong>example:</strong>
             * <p>1568267711</p>
             */
            public Builder supportLatestTime(Long supportLatestTime) {
                this.supportLatestTime = supportLatestTime;
                return this;
            }

            /**
             * <p>The end time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>1568367711</p>
             */
            public Builder supportOldestTime(Long supportOldestTime) {
                this.supportOldestTime = supportOldestTime;
                return this;
            }

            public LogTimeRange build() {
                return new LogTimeRange(this);
            } 

        } 

    }
}
