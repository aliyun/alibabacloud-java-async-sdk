// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDohAccountStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDohAccountStatisticsResponseBody</p>
 */
public class DescribeDohAccountStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Statistics")
    private java.util.List < Statistics> statistics;

    private DescribeDohAccountStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statistics = builder.statistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDohAccountStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statistics
     */
    public java.util.List < Statistics> getStatistics() {
        return this.statistics;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Statistics> statistics; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Statistics.
         */
        public Builder statistics(java.util.List < Statistics> statistics) {
            this.statistics = statistics;
            return this;
        }

        public DescribeDohAccountStatisticsResponseBody build() {
            return new DescribeDohAccountStatisticsResponseBody(this);
        } 

    } 

    public static class Statistics extends TeaModel {
        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("TotalCount")
        private Long totalCount;

        @NameInMap("V4HttpCount")
        private Long v4HttpCount;

        @NameInMap("V4HttpsCount")
        private Long v4HttpsCount;

        @NameInMap("V6HttpCount")
        private Long v6HttpCount;

        @NameInMap("V6HttpsCount")
        private Long v6HttpsCount;

        private Statistics(Builder builder) {
            this.timestamp = builder.timestamp;
            this.totalCount = builder.totalCount;
            this.v4HttpCount = builder.v4HttpCount;
            this.v4HttpsCount = builder.v4HttpsCount;
            this.v6HttpCount = builder.v6HttpCount;
            this.v6HttpsCount = builder.v6HttpsCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return v4HttpCount
         */
        public Long getV4HttpCount() {
            return this.v4HttpCount;
        }

        /**
         * @return v4HttpsCount
         */
        public Long getV4HttpsCount() {
            return this.v4HttpsCount;
        }

        /**
         * @return v6HttpCount
         */
        public Long getV6HttpCount() {
            return this.v6HttpCount;
        }

        /**
         * @return v6HttpsCount
         */
        public Long getV6HttpsCount() {
            return this.v6HttpsCount;
        }

        public static final class Builder {
            private Long timestamp; 
            private Long totalCount; 
            private Long v4HttpCount; 
            private Long v4HttpsCount; 
            private Long v6HttpCount; 
            private Long v6HttpsCount; 

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * V4HttpCount.
             */
            public Builder v4HttpCount(Long v4HttpCount) {
                this.v4HttpCount = v4HttpCount;
                return this;
            }

            /**
             * V4HttpsCount.
             */
            public Builder v4HttpsCount(Long v4HttpsCount) {
                this.v4HttpsCount = v4HttpsCount;
                return this;
            }

            /**
             * V6HttpCount.
             */
            public Builder v6HttpCount(Long v6HttpCount) {
                this.v6HttpCount = v6HttpCount;
                return this;
            }

            /**
             * V6HttpsCount.
             */
            public Builder v6HttpsCount(Long v6HttpsCount) {
                this.v6HttpsCount = v6HttpsCount;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
}
