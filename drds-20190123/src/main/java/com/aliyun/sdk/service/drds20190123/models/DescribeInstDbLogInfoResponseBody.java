// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstDbLogInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstDbLogInfoResponseBody</p>
 */
public class DescribeInstDbLogInfoResponseBody extends TeaModel {
    @NameInMap("LogTimeRange")
    private LogTimeRange logTimeRange;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * LogTimeRange.
         */
        public Builder logTimeRange(LogTimeRange logTimeRange) {
            this.logTimeRange = logTimeRange;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeInstDbLogInfoResponseBody build() {
            return new DescribeInstDbLogInfoResponseBody(this);
        } 

    } 

    public static class LogTimeRange extends TeaModel {
        @NameInMap("SupportLatestTime")
        private Long supportLatestTime;

        @NameInMap("SupportOldestTime")
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
             * SupportLatestTime.
             */
            public Builder supportLatestTime(Long supportLatestTime) {
                this.supportLatestTime = supportLatestTime;
                return this;
            }

            /**
             * SupportOldestTime.
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
