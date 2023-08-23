// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainDetailDataByLayerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainDetailDataByLayerResponseBody</p>
 */
public class DescribeDomainDetailDataByLayerResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDomainDetailDataByLayerResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainDetailDataByLayerResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The number of IPv6 requests per second.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The number of queries per second.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainDetailDataByLayerResponseBody build() {
            return new DescribeDomainDetailDataByLayerResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("Acc")
        private Long acc;

        @NameInMap("Bps")
        private Float bps;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("HttpCode")
        private String httpCode;

        @NameInMap("Ipv6Acc")
        private Long ipv6Acc;

        @NameInMap("Ipv6Bps")
        private Float ipv6Bps;

        @NameInMap("Ipv6Qps")
        private Float ipv6Qps;

        @NameInMap("Ipv6Traf")
        private Long ipv6Traf;

        @NameInMap("Qps")
        private Float qps;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("Traf")
        private Long traf;

        private DataModule(Builder builder) {
            this.acc = builder.acc;
            this.bps = builder.bps;
            this.domainName = builder.domainName;
            this.httpCode = builder.httpCode;
            this.ipv6Acc = builder.ipv6Acc;
            this.ipv6Bps = builder.ipv6Bps;
            this.ipv6Qps = builder.ipv6Qps;
            this.ipv6Traf = builder.ipv6Traf;
            this.qps = builder.qps;
            this.timeStamp = builder.timeStamp;
            this.traf = builder.traf;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return acc
         */
        public Long getAcc() {
            return this.acc;
        }

        /**
         * @return bps
         */
        public Float getBps() {
            return this.bps;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return httpCode
         */
        public String getHttpCode() {
            return this.httpCode;
        }

        /**
         * @return ipv6Acc
         */
        public Long getIpv6Acc() {
            return this.ipv6Acc;
        }

        /**
         * @return ipv6Bps
         */
        public Float getIpv6Bps() {
            return this.ipv6Bps;
        }

        /**
         * @return ipv6Qps
         */
        public Float getIpv6Qps() {
            return this.ipv6Qps;
        }

        /**
         * @return ipv6Traf
         */
        public Long getIpv6Traf() {
            return this.ipv6Traf;
        }

        /**
         * @return qps
         */
        public Float getQps() {
            return this.qps;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return traf
         */
        public Long getTraf() {
            return this.traf;
        }

        public static final class Builder {
            private Long acc; 
            private Float bps; 
            private String domainName; 
            private String httpCode; 
            private Long ipv6Acc; 
            private Float ipv6Bps; 
            private Float ipv6Qps; 
            private Long ipv6Traf; 
            private Float qps; 
            private String timeStamp; 
            private Long traf; 

            /**
             * The timestamp of the data returned.
             */
            public Builder acc(Long acc) {
                this.acc = acc;
                return this;
            }

            /**
             * The bandwidth of IPv6 requests. Unit: bit/s.
             */
            public Builder bps(Float bps) {
                this.bps = bps;
                return this;
            }

            /**
             * The number of requests.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * - You can call this operation up to 20 times per second per account.
             * <p>
             * - If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
             * 
             * **Time granularity**
             * 
             * The following table describes the time granularity, the time period within which historical data is available, and the data delay, which vary with the maximum time range per query. 
             * 
             * | Time granularity | Maximum time range per query | Historical data available | Data delay |
             * | ---------------- | ---------------------------- | ------------------------- | ---------- |
             * | 5 minutes | 3 days | 93 days | 15 minutes |
             * | 1 hour | 31 days | 186 days | 4 hours |
             * | 1 days | 366 days | 366 days | 04:00 on the next day |
             */
            public Builder httpCode(String httpCode) {
                this.httpCode = httpCode;
                return this;
            }

            /**
             * The bandwidth. Unit: bit/s.
             */
            public Builder ipv6Acc(Long ipv6Acc) {
                this.ipv6Acc = ipv6Acc;
                return this;
            }

            /**
             * The number of IPv6 requests.
             */
            public Builder ipv6Bps(Float ipv6Bps) {
                this.ipv6Bps = ipv6Bps;
                return this;
            }

            /**
             * The amount of network traffic generated by IPv6 requests. Unit: bytes.
             */
            public Builder ipv6Qps(Float ipv6Qps) {
                this.ipv6Qps = ipv6Qps;
                return this;
            }

            /**
             * The proportions of HTTP status codes.
             */
            public Builder ipv6Traf(Long ipv6Traf) {
                this.ipv6Traf = ipv6Traf;
                return this;
            }

            /**
             * The number of requests.
             */
            public Builder qps(Float qps) {
                this.qps = qps;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * The bandwidth of IPv6 requests. Unit: bit/s.
             */
            public Builder traf(Long traf) {
                this.traf = traf;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private Data(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataModule
         */
        public java.util.List < DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List < DataModule> dataModule; 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List < DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
