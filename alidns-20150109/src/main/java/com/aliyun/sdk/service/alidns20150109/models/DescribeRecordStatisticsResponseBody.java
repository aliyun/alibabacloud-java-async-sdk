// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeRecordStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecordStatisticsResponseBody</p>
 */
public class DescribeRecordStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Statistics")
    private Statistics statistics;

    private DescribeRecordStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statistics = builder.statistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecordStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRecordStatisticsResponseBody model) {
            this.requestId = model.requestId;
            this.statistics = model.statistics;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6AEC7A64-3CB1-4C49-8B35-0B901F1E26BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The statistics on the DNS requests.</p>
         */
        public Builder statistics(Statistics statistics) {
            this.statistics = statistics;
            return this;
        }

        public DescribeRecordStatisticsResponseBody build() {
            return new DescribeRecordStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRecordStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecordStatisticsResponseBody</p>
     */
    public static class Statistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
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

            private Builder() {
            } 

            private Builder(Statistic model) {
                this.count = model.count;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The number of DNS requests.</p>
             * 
             * <strong>example:</strong>
             * <p>15292887</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The statistical timestamp. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1556640000000</p>
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
    /**
     * 
     * {@link DescribeRecordStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecordStatisticsResponseBody</p>
     */
    public static class Statistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Statistic")
        private java.util.List<Statistic> statistic;

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
        public java.util.List<Statistic> getStatistic() {
            return this.statistic;
        }

        public static final class Builder {
            private java.util.List<Statistic> statistic; 

            private Builder() {
            } 

            private Builder(Statistics model) {
                this.statistic = model.statistic;
            } 

            /**
             * Statistic.
             */
            public Builder statistic(java.util.List<Statistic> statistic) {
                this.statistic = statistic;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
}
