// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSlowQueryTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowQueryTrendResponseBody</p>
 */
public class DescribeSlowQueryTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSlowQueryTrendResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowQueryTrendResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSlowQueryTrendResponseBody build() {
            return new DescribeSlowQueryTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSlowQueryTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowQueryTrendResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgDurationMs")
        private Long avgDurationMs;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("MaxDurationMs")
        private Long maxDurationMs;

        @com.aliyun.core.annotation.NameInMap("MinDurationMs")
        private Long minDurationMs;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Data(Builder builder) {
            this.avgDurationMs = builder.avgDurationMs;
            this.count = builder.count;
            this.maxDurationMs = builder.maxDurationMs;
            this.minDurationMs = builder.minDurationMs;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return avgDurationMs
         */
        public Long getAvgDurationMs() {
            return this.avgDurationMs;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return maxDurationMs
         */
        public Long getMaxDurationMs() {
            return this.maxDurationMs;
        }

        /**
         * @return minDurationMs
         */
        public Long getMinDurationMs() {
            return this.minDurationMs;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long avgDurationMs; 
            private Integer count; 
            private Long maxDurationMs; 
            private Long minDurationMs; 
            private String startTime; 

            /**
             * AvgDurationMs.
             */
            public Builder avgDurationMs(Long avgDurationMs) {
                this.avgDurationMs = avgDurationMs;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * MaxDurationMs.
             */
            public Builder maxDurationMs(Long maxDurationMs) {
                this.maxDurationMs = maxDurationMs;
                return this;
            }

            /**
             * MinDurationMs.
             */
            public Builder minDurationMs(Long minDurationMs) {
                this.minDurationMs = minDurationMs;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
