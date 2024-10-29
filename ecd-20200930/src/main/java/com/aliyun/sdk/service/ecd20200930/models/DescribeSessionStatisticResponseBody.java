// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSessionStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSessionStatisticResponseBody</p>
 */
public class DescribeSessionStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Statistic")
    private java.util.List < Statistic> statistic;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeSessionStatisticResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statistic = builder.statistic;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSessionStatisticResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statistic
     */
    public java.util.List < Statistic> getStatistic() {
        return this.statistic;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Statistic> statistic; 
        private String totalCount; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C5528624-C6ED-5CA4-A4A2-7C30DBF2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The statistics.</p>
         */
        public Builder statistic(java.util.List < Statistic> statistic) {
            this.statistic = statistic;
            return this;
        }

        /**
         * <p>The total number of sessions returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSessionStatisticResponseBody build() {
            return new DescribeSessionStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSessionStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSessionStatisticResponseBody</p>
     */
    public static class Statistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("TimePoint")
        private Long timePoint;

        private Statistic(Builder builder) {
            this.count = builder.count;
            this.timePoint = builder.timePoint;
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
         * @return timePoint
         */
        public Long getTimePoint() {
            return this.timePoint;
        }

        public static final class Builder {
            private Long count; 
            private Long timePoint; 

            /**
             * <p>The total number of sessions in the time range.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The point in time.</p>
             * 
             * <strong>example:</strong>
             * <p>1690164443508</p>
             */
            public Builder timePoint(Long timePoint) {
                this.timePoint = timePoint;
                return this;
            }

            public Statistic build() {
                return new Statistic(this);
            } 

        } 

    }
}
