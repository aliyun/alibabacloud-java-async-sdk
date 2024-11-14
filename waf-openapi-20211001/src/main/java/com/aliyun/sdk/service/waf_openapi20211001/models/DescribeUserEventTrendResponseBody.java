// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserEventTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserEventTrendResponseBody</p>
 */
public class DescribeUserEventTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Trend")
    private java.util.List < Trend> trend;

    private DescribeUserEventTrendResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trend = builder.trend;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserEventTrendResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trend
     */
    public java.util.List < Trend> getTrend() {
        return this.trend;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Trend> trend; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F51E6DD6-B2D2-57C9-90F1-FAFD0A19DE00</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The trends of attacks.</p>
         */
        public Builder trend(java.util.List < Trend> trend) {
            this.trend = trend;
            return this;
        }

        public DescribeUserEventTrendResponseBody build() {
            return new DescribeUserEventTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserEventTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserEventTrendResponseBody</p>
     */
    public static class Trend extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventHigh")
        private Long eventHigh;

        @com.aliyun.core.annotation.NameInMap("EventLow")
        private Long eventLow;

        @com.aliyun.core.annotation.NameInMap("EventMedium")
        private Long eventMedium;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private Long timeStamp;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Trend(Builder builder) {
            this.eventHigh = builder.eventHigh;
            this.eventLow = builder.eventLow;
            this.eventMedium = builder.eventMedium;
            this.timeStamp = builder.timeStamp;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trend create() {
            return builder().build();
        }

        /**
         * @return eventHigh
         */
        public Long getEventHigh() {
            return this.eventHigh;
        }

        /**
         * @return eventLow
         */
        public Long getEventLow() {
            return this.eventLow;
        }

        /**
         * @return eventMedium
         */
        public Long getEventMedium() {
            return this.eventMedium;
        }

        /**
         * @return timeStamp
         */
        public Long getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Long eventHigh; 
            private Long eventLow; 
            private Long eventMedium; 
            private Long timeStamp; 
            private Long timestamp; 

            /**
             * <p>The number of high-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder eventHigh(Long eventHigh) {
                this.eventHigh = eventHigh;
                return this;
            }

            /**
             * <p>The number of low-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder eventLow(Long eventLow) {
                this.eventLow = eventLow;
                return this;
            }

            /**
             * <p>The number of medium-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder eventMedium(Long eventMedium) {
                this.eventMedium = eventMedium;
                return this;
            }

            /**
             * <p>The time at which the API was called. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1723435200</p>
             */
            public Builder timeStamp(Long timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The time at which the API was called. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1723435200</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Trend build() {
                return new Trend(this);
            } 

        } 

    }
}
