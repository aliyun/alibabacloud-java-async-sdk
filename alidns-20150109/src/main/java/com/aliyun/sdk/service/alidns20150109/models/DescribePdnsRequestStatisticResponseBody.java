// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePdnsRequestStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePdnsRequestStatisticResponseBody</p>
 */
public class DescribePdnsRequestStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePdnsRequestStatisticResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePdnsRequestStatisticResponseBody create() {
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

        public DescribePdnsRequestStatisticResponseBody build() {
            return new DescribePdnsRequestStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePdnsRequestStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePdnsRequestStatisticResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DohTotalCount")
        private Long dohTotalCount;

        @com.aliyun.core.annotation.NameInMap("HttpCount")
        private Long httpCount;

        @com.aliyun.core.annotation.NameInMap("HttpsCount")
        private Long httpsCount;

        @com.aliyun.core.annotation.NameInMap("IpCount")
        private Long ipCount;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("UdpTotalCount")
        private Long udpTotalCount;

        @com.aliyun.core.annotation.NameInMap("V4Count")
        private Long v4Count;

        @com.aliyun.core.annotation.NameInMap("V4HttpCount")
        private Long v4HttpCount;

        @com.aliyun.core.annotation.NameInMap("V4HttpsCount")
        private Long v4HttpsCount;

        @com.aliyun.core.annotation.NameInMap("V6Count")
        private Long v6Count;

        @com.aliyun.core.annotation.NameInMap("V6HttpCount")
        private Long v6HttpCount;

        @com.aliyun.core.annotation.NameInMap("V6HttpsCount")
        private Long v6HttpsCount;

        private Data(Builder builder) {
            this.dohTotalCount = builder.dohTotalCount;
            this.httpCount = builder.httpCount;
            this.httpsCount = builder.httpsCount;
            this.ipCount = builder.ipCount;
            this.timestamp = builder.timestamp;
            this.totalCount = builder.totalCount;
            this.udpTotalCount = builder.udpTotalCount;
            this.v4Count = builder.v4Count;
            this.v4HttpCount = builder.v4HttpCount;
            this.v4HttpsCount = builder.v4HttpsCount;
            this.v6Count = builder.v6Count;
            this.v6HttpCount = builder.v6HttpCount;
            this.v6HttpsCount = builder.v6HttpsCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dohTotalCount
         */
        public Long getDohTotalCount() {
            return this.dohTotalCount;
        }

        /**
         * @return httpCount
         */
        public Long getHttpCount() {
            return this.httpCount;
        }

        /**
         * @return httpsCount
         */
        public Long getHttpsCount() {
            return this.httpsCount;
        }

        /**
         * @return ipCount
         */
        public Long getIpCount() {
            return this.ipCount;
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
         * @return udpTotalCount
         */
        public Long getUdpTotalCount() {
            return this.udpTotalCount;
        }

        /**
         * @return v4Count
         */
        public Long getV4Count() {
            return this.v4Count;
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
         * @return v6Count
         */
        public Long getV6Count() {
            return this.v6Count;
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
            private Long dohTotalCount; 
            private Long httpCount; 
            private Long httpsCount; 
            private Long ipCount; 
            private Long timestamp; 
            private Long totalCount; 
            private Long udpTotalCount; 
            private Long v4Count; 
            private Long v4HttpCount; 
            private Long v4HttpsCount; 
            private Long v6Count; 
            private Long v6HttpCount; 
            private Long v6HttpsCount; 

            /**
             * DohTotalCount.
             */
            public Builder dohTotalCount(Long dohTotalCount) {
                this.dohTotalCount = dohTotalCount;
                return this;
            }

            /**
             * HttpCount.
             */
            public Builder httpCount(Long httpCount) {
                this.httpCount = httpCount;
                return this;
            }

            /**
             * HttpsCount.
             */
            public Builder httpsCount(Long httpsCount) {
                this.httpsCount = httpsCount;
                return this;
            }

            /**
             * IpCount.
             */
            public Builder ipCount(Long ipCount) {
                this.ipCount = ipCount;
                return this;
            }

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
             * UdpTotalCount.
             */
            public Builder udpTotalCount(Long udpTotalCount) {
                this.udpTotalCount = udpTotalCount;
                return this;
            }

            /**
             * V4Count.
             */
            public Builder v4Count(Long v4Count) {
                this.v4Count = v4Count;
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
             * V6Count.
             */
            public Builder v6Count(Long v6Count) {
                this.v6Count = v6Count;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
