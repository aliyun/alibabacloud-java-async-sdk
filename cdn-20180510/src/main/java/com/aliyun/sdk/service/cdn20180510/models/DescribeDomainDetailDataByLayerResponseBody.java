// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeDomainDetailDataByLayerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainDetailDataByLayerResponseBody</p>
 */
public class DescribeDomainDetailDataByLayerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The number of IPv6 requests per second.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The number of queries per second.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainDetailDataByLayerResponseBody build() {
            return new DescribeDomainDetailDataByLayerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainDetailDataByLayerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainDetailDataByLayerResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acc")
        private Long acc;

        @com.aliyun.core.annotation.NameInMap("Bps")
        private Float bps;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("HttpCode")
        private String httpCode;

        @com.aliyun.core.annotation.NameInMap("Ipv6Acc")
        private Long ipv6Acc;

        @com.aliyun.core.annotation.NameInMap("Ipv6Bps")
        private Float ipv6Bps;

        @com.aliyun.core.annotation.NameInMap("Ipv6Qps")
        private Float ipv6Qps;

        @com.aliyun.core.annotation.NameInMap("Ipv6Traf")
        private Long ipv6Traf;

        @com.aliyun.core.annotation.NameInMap("Qps")
        private Float qps;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Traf")
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
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder acc(Long acc) {
                this.acc = acc;
                return this;
            }

            /**
             * <p>The bandwidth of IPv6 requests. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>21060178715.146667</p>
             */
            public Builder bps(Float bps) {
                this.bps = bps;
                return this;
            }

            /**
             * <p>The number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <ul>
             * <li>You can call this operation up to 20 times per second per account.</li>
             * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
             * </ul>
             * <p><strong>Time granularity</strong></p>
             * <p>The following table describes the time granularity, the time period within which historical data is available, and the data delay, which vary with the maximum time range per query. </p>
             * <table>
             * <thead>
             * <tr>
             * <th>Time granularity</th>
             * <th>Maximum time range per query</th>
             * <th>Historical data available</th>
             * <th>Data delay</th>
             * </tr>
             * </thead>
             * <tbody><tr>
             * <td>5 minutes</td>
             * <td>3 days</td>
             * <td>93 days</td>
             * <td>15 minutes</td>
             * </tr>
             * <tr>
             * <td>1 hour</td>
             * <td>31 days</td>
             * <td>186 days</td>
             * <td>4 hours</td>
             * </tr>
             * <tr>
             * <td>1 days</td>
             * <td>366 days</td>
             * <td>366 days</td>
             * <td>04:00 on the next day</td>
             * </tr>
             * </tbody></table>
             * 
             * <strong>example:</strong>
             * <p>200:44349|206:1753719|304:45|403:1095|416:1|499:332</p>
             */
            public Builder httpCode(String httpCode) {
                this.httpCode = httpCode;
                return this;
            }

            /**
             * <p>The bandwidth. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ipv6Acc(Long ipv6Acc) {
                this.ipv6Acc = ipv6Acc;
                return this;
            }

            /**
             * <p>The number of IPv6 requests.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ipv6Bps(Float ipv6Bps) {
                this.ipv6Bps = ipv6Bps;
                return this;
            }

            /**
             * <p>The amount of network traffic generated by IPv6 requests. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ipv6Qps(Float ipv6Qps) {
                this.ipv6Qps = ipv6Qps;
                return this;
            }

            /**
             * <p>The proportions of HTTP status codes.</p>
             * 
             * <strong>example:</strong>
             * <p>141718944482</p>
             */
            public Builder ipv6Traf(Long ipv6Traf) {
                this.ipv6Traf = ipv6Traf;
                return this;
            }

            /**
             * <p>The number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>5998.47</p>
             */
            public Builder qps(Float qps) {
                this.qps = qps;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-07-05T22:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The bandwidth of IPv6 requests. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>789756701818</p>
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
    /**
     * 
     * {@link DescribeDomainDetailDataByLayerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainDetailDataByLayerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<DataModule> dataModule;

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
        public java.util.List<DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List<DataModule> dataModule; 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
