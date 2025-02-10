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
 * {@link DescribePdnsRequestStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePdnsRequestStatisticsResponseBody</p>
 */
public class DescribePdnsRequestStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribePdnsRequestStatisticsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePdnsRequestStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The statistics on the DNS requests.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>20</strong>. Valid values: <strong>1 to 100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePdnsRequestStatisticsResponseBody build() {
            return new DescribePdnsRequestStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePdnsRequestStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePdnsRequestStatisticsResponseBody</p>
     */
    public static class ThreatInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ThreatLevel")
        private String threatLevel;

        @com.aliyun.core.annotation.NameInMap("ThreatType")
        private String threatType;

        private ThreatInfo(Builder builder) {
            this.threatLevel = builder.threatLevel;
            this.threatType = builder.threatType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ThreatInfo create() {
            return builder().build();
        }

        /**
         * @return threatLevel
         */
        public String getThreatLevel() {
            return this.threatLevel;
        }

        /**
         * @return threatType
         */
        public String getThreatType() {
            return this.threatType;
        }

        public static final class Builder {
            private String threatLevel; 
            private String threatType; 

            /**
             * <p>The current version does not support this parameter.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder threatLevel(String threatLevel) {
                this.threatLevel = threatLevel;
                return this;
            }

            /**
             * <p>The current version does not support this parameter.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder threatType(String threatType) {
                this.threatType = threatType;
                return this;
            }

            public ThreatInfo build() {
                return new ThreatInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePdnsRequestStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePdnsRequestStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DohTotalCount")
        private Long dohTotalCount;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("HttpCount")
        private Long httpCount;

        @com.aliyun.core.annotation.NameInMap("HttpsCount")
        private Long httpsCount;

        @com.aliyun.core.annotation.NameInMap("IpCount")
        private Long ipCount;

        @com.aliyun.core.annotation.NameInMap("MaxThreatLevel")
        private String maxThreatLevel;

        @com.aliyun.core.annotation.NameInMap("SubDomain")
        private String subDomain;

        @com.aliyun.core.annotation.NameInMap("ThreatCount")
        private Long threatCount;

        @com.aliyun.core.annotation.NameInMap("ThreatInfo")
        private java.util.List<ThreatInfo> threatInfo;

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
            this.domainName = builder.domainName;
            this.httpCount = builder.httpCount;
            this.httpsCount = builder.httpsCount;
            this.ipCount = builder.ipCount;
            this.maxThreatLevel = builder.maxThreatLevel;
            this.subDomain = builder.subDomain;
            this.threatCount = builder.threatCount;
            this.threatInfo = builder.threatInfo;
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
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
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
         * @return maxThreatLevel
         */
        public String getMaxThreatLevel() {
            return this.maxThreatLevel;
        }

        /**
         * @return subDomain
         */
        public String getSubDomain() {
            return this.subDomain;
        }

        /**
         * @return threatCount
         */
        public Long getThreatCount() {
            return this.threatCount;
        }

        /**
         * @return threatInfo
         */
        public java.util.List<ThreatInfo> getThreatInfo() {
            return this.threatInfo;
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
            private String domainName; 
            private Long httpCount; 
            private Long httpsCount; 
            private Long ipCount; 
            private String maxThreatLevel; 
            private String subDomain; 
            private Long threatCount; 
            private java.util.List<ThreatInfo> threatInfo; 
            private Long totalCount; 
            private Long udpTotalCount; 
            private Long v4Count; 
            private Long v4HttpCount; 
            private Long v4HttpsCount; 
            private Long v6Count; 
            private Long v6HttpCount; 
            private Long v6HttpsCount; 

            /**
             * <p>The total number of DoH requests, including the HTTP and HTTPS requests.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dohTotalCount(Long dohTotalCount) {
                this.dohTotalCount = dohTotalCount;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The number of HTTP requests.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder httpCount(Long httpCount) {
                this.httpCount = httpCount;
                return this;
            }

            /**
             * <p>The number of HTTPS requests. On the Traffic Analysis tab of the public DNS console, the value of this parameter includes the number of DNS over HTTPs (DoH) requests. Therefore, the number of DoH requests is not separately displayed in the console.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder httpsCount(Long httpsCount) {
                this.httpsCount = httpsCount;
                return this;
            }

            /**
             * <p>The number of source IP addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder ipCount(Long ipCount) {
                this.ipCount = ipCount;
                return this;
            }

            /**
             * <p>The current version does not support this parameter.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder maxThreatLevel(String maxThreatLevel) {
                this.maxThreatLevel = maxThreatLevel;
                return this;
            }

            /**
             * <p>The subdomain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder subDomain(String subDomain) {
                this.subDomain = subDomain;
                return this;
            }

            /**
             * <p>The current version does not support this parameter.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder threatCount(Long threatCount) {
                this.threatCount = threatCount;
                return this;
            }

            /**
             * <p>The current version does not support this parameter.</p>
             */
            public Builder threatInfo(java.util.List<ThreatInfo> threatInfo) {
                this.threatInfo = threatInfo;
                return this;
            }

            /**
             * <p>The total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The total number of UDP requests.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder udpTotalCount(Long udpTotalCount) {
                this.udpTotalCount = udpTotalCount;
                return this;
            }

            /**
             * <p>The number of IPv4-based requests.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder v4Count(Long v4Count) {
                this.v4Count = v4Count;
                return this;
            }

            /**
             * <p>The number of IPv4-based HTTP requests.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder v4HttpCount(Long v4HttpCount) {
                this.v4HttpCount = v4HttpCount;
                return this;
            }

            /**
             * <p>The number of IPv4-based HTTPS requests.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder v4HttpsCount(Long v4HttpsCount) {
                this.v4HttpsCount = v4HttpsCount;
                return this;
            }

            /**
             * <p>The number of IPv6-based requests.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder v6Count(Long v6Count) {
                this.v6Count = v6Count;
                return this;
            }

            /**
             * <p>The number of IPv6-based HTTP requests.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder v6HttpCount(Long v6HttpCount) {
                this.v6HttpCount = v6HttpCount;
                return this;
            }

            /**
             * <p>The number of IPv6-based HTTPS requests.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
