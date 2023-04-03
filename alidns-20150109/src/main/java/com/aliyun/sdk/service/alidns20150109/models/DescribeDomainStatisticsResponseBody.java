// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainStatisticsResponseBody</p>
 */
public class DescribeDomainStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Statistics")
    private Statistics statistics;

    private DescribeDomainStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statistics = builder.statistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainStatisticsResponseBody create() {
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
    public Statistics getStatistics() {
        return this.statistics;
    }

    public static final class Builder {
        private String requestId; 
        private Statistics statistics; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of query volume records.
         */
        public Builder statistics(Statistics statistics) {
            this.statistics = statistics;
            return this;
        }

        public DescribeDomainStatisticsResponseBody build() {
            return new DescribeDomainStatisticsResponseBody(this);
        } 

    } 

    public static class Statistic extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("Timestamp")
        private Long timestamp;

        private Statistic(Builder builder) {
            this.count = builder.count;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistic create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Long count; 
            private Long timestamp; 

            /**
             * The number of queries.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The UNIX timestamp representing the collection time.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Statistic build() {
                return new Statistic(this);
            } 

        } 

    }
    public static class Statistics extends TeaModel {
        @NameInMap("Statistic")
        private java.util.List < Statistic> statistic;

        private Statistics(Builder builder) {
            this.statistic = builder.statistic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return statistic
         */
        public java.util.List < Statistic> getStatistic() {
            return this.statistic;
        }

        public static final class Builder {
            private java.util.List < Statistic> statistic; 

            /**
             * Statistic.
             */
            public Builder statistic(java.util.List < Statistic> statistic) {
                this.statistic = statistic;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
}
