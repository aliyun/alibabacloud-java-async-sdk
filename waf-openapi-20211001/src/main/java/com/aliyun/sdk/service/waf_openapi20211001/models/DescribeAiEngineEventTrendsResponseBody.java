// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeAiEngineEventTrendsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAiEngineEventTrendsResponseBody</p>
 */
public class DescribeAiEngineEventTrendsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AggregateInterval")
    private String aggregateInterval;

    @com.aliyun.core.annotation.NameInMap("Points")
    private java.util.List<Points> points;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAiEngineEventTrendsResponseBody(Builder builder) {
        this.aggregateInterval = builder.aggregateInterval;
        this.points = builder.points;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiEngineEventTrendsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregateInterval
     */
    public String getAggregateInterval() {
        return this.aggregateInterval;
    }

    /**
     * @return points
     */
    public java.util.List<Points> getPoints() {
        return this.points;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String aggregateInterval; 
        private java.util.List<Points> points; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAiEngineEventTrendsResponseBody model) {
            this.aggregateInterval = model.aggregateInterval;
            this.points = model.points;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The aggregation interval, which is automatically selected based on the query time range. Valid values:</p>
         * <ul>
         * <li><strong>1m</strong>: 1 minute</li>
         * <li><strong>5m</strong>: 5 minutes</li>
         * <li><strong>15m</strong>: 15 minutes</li>
         * <li><strong>1h</strong>: 1 hour</li>
         * <li><strong>1d</strong>: 1 day</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1m</p>
         */
        public Builder aggregateInterval(String aggregateInterval) {
            this.aggregateInterval = aggregateInterval;
            return this;
        }

        /**
         * <p>The time series data of events aggregated by first discovery time, sorted in ascending order of time.</p>
         */
        public Builder points(java.util.List<Points> points) {
            this.points = points;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>01A****-1219-019A-8B44-2557C*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAiEngineEventTrendsResponseBody build() {
            return new DescribeAiEngineEventTrendsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAiEngineEventTrendsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAiEngineEventTrendsResponseBody</p>
     */
    public static class RiskCounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Critical")
        private Long critical;

        @com.aliyun.core.annotation.NameInMap("High")
        private Long high;

        @com.aliyun.core.annotation.NameInMap("Low")
        private Long low;

        @com.aliyun.core.annotation.NameInMap("Medium")
        private Long medium;

        private RiskCounts(Builder builder) {
            this.critical = builder.critical;
            this.high = builder.high;
            this.low = builder.low;
            this.medium = builder.medium;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskCounts create() {
            return builder().build();
        }

        /**
         * @return critical
         */
        public Long getCritical() {
            return this.critical;
        }

        /**
         * @return high
         */
        public Long getHigh() {
            return this.high;
        }

        /**
         * @return low
         */
        public Long getLow() {
            return this.low;
        }

        /**
         * @return medium
         */
        public Long getMedium() {
            return this.medium;
        }

        public static final class Builder {
            private Long critical; 
            private Long high; 
            private Long low; 
            private Long medium; 

            private Builder() {
            } 

            private Builder(RiskCounts model) {
                this.critical = model.critical;
                this.high = model.high;
                this.low = model.low;
                this.medium = model.medium;
            } 

            /**
             * <p>The number of critical events.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder critical(Long critical) {
                this.critical = critical;
                return this;
            }

            /**
             * <p>The number of high-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder high(Long high) {
                this.high = high;
                return this;
            }

            /**
             * <p>The number of low-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder low(Long low) {
                this.low = low;
                return this;
            }

            /**
             * <p>The number of medium-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder medium(Long medium) {
                this.medium = medium;
                return this;
            }

            public RiskCounts build() {
                return new RiskCounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAiEngineEventTrendsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAiEngineEventTrendsResponseBody</p>
     */
    public static class Points extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventCount")
        private Long eventCount;

        @com.aliyun.core.annotation.NameInMap("RiskCounts")
        private RiskCounts riskCounts;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        private Points(Builder builder) {
            this.eventCount = builder.eventCount;
            this.riskCounts = builder.riskCounts;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Points create() {
            return builder().build();
        }

        /**
         * @return eventCount
         */
        public Long getEventCount() {
            return this.eventCount;
        }

        /**
         * @return riskCounts
         */
        public RiskCounts getRiskCounts() {
            return this.riskCounts;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Long eventCount; 
            private RiskCounts riskCounts; 
            private Long time; 

            private Builder() {
            } 

            private Builder(Points model) {
                this.eventCount = model.eventCount;
                this.riskCounts = model.riskCounts;
                this.time = model.time;
            } 

            /**
             * <p>The number of events first discovered within the time period.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder eventCount(Long eventCount) {
                this.eventCount = eventCount;
                return this;
            }

            /**
             * <p>The number of events within the time period, aggregated by risk level.</p>
             */
            public Builder riskCounts(RiskCounts riskCounts) {
                this.riskCounts = riskCounts;
                return this;
            }

            /**
             * <p>The start time of the statistical period in the UNIX timestamp format. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1792973400000</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public Points build() {
                return new Points(this);
            } 

        } 

    }
}
