// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserAbnormalTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserAbnormalTrendResponseBody</p>
 */
public class DescribeUserAbnormalTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Trend")
    private java.util.List < Trend> trend;

    private DescribeUserAbnormalTrendResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trend = builder.trend;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserAbnormalTrendResponseBody create() {
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
         * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The trends of risks.</p>
         */
        public Builder trend(java.util.List < Trend> trend) {
            this.trend = trend;
            return this;
        }

        public DescribeUserAbnormalTrendResponseBody build() {
            return new DescribeUserAbnormalTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserAbnormalTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserAbnormalTrendResponseBody</p>
     */
    public static class Trend extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbnormalHigh")
        private Long abnormalHigh;

        @com.aliyun.core.annotation.NameInMap("AbnormalLow")
        private Long abnormalLow;

        @com.aliyun.core.annotation.NameInMap("AbnormalMedium")
        private Long abnormalMedium;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private Long timeStamp;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Trend(Builder builder) {
            this.abnormalHigh = builder.abnormalHigh;
            this.abnormalLow = builder.abnormalLow;
            this.abnormalMedium = builder.abnormalMedium;
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
         * @return abnormalHigh
         */
        public Long getAbnormalHigh() {
            return this.abnormalHigh;
        }

        /**
         * @return abnormalLow
         */
        public Long getAbnormalLow() {
            return this.abnormalLow;
        }

        /**
         * @return abnormalMedium
         */
        public Long getAbnormalMedium() {
            return this.abnormalMedium;
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
            private Long abnormalHigh; 
            private Long abnormalLow; 
            private Long abnormalMedium; 
            private Long timeStamp; 
            private Long timestamp; 

            /**
             * <p>The number of high risks.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder abnormalHigh(Long abnormalHigh) {
                this.abnormalHigh = abnormalHigh;
                return this;
            }

            /**
             * <p>The number of low risks.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder abnormalLow(Long abnormalLow) {
                this.abnormalLow = abnormalLow;
                return this;
            }

            /**
             * <p>The number of medium risks.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder abnormalMedium(Long abnormalMedium) {
                this.abnormalMedium = abnormalMedium;
                return this;
            }

            /**
             * <p>The time at which the API was called. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1722268800</p>
             */
            public Builder timeStamp(Long timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The time at which the API was called. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1722268800</p>
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
