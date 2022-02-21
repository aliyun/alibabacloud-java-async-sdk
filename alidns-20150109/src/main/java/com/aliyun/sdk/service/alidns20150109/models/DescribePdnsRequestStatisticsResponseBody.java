// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsRequestStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePdnsRequestStatisticsResponseBody</p>
 */
public class DescribePdnsRequestStatisticsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePdnsRequestStatisticsResponseBody build() {
            return new DescribePdnsRequestStatisticsResponseBody(this);
        } 

    } 

    public static class ThreatInfo extends TeaModel {
        @NameInMap("ThreatLevel")
        private String threatLevel;

        @NameInMap("ThreatType")
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
             * ThreatLevel.
             */
            public Builder threatLevel(String threatLevel) {
                this.threatLevel = threatLevel;
                return this;
            }

            /**
             * ThreatType.
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
    public static class Data extends TeaModel {
        @NameInMap("DohTotalCount")
        private Long dohTotalCount;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("HttpCount")
        private Long httpCount;

        @NameInMap("HttpsCount")
        private Long httpsCount;

        @NameInMap("IpCount")
        private Long ipCount;

        @NameInMap("MaxThreatLevel")
        private String maxThreatLevel;

        @NameInMap("SubDomain")
        private String subDomain;

        @NameInMap("ThreatCount")
        private Long threatCount;

        @NameInMap("ThreatInfo")
        private java.util.List < ThreatInfo> threatInfo;

        @NameInMap("TotalCount")
        private Long totalCount;

        @NameInMap("UdpTotalCount")
        private Long udpTotalCount;

        @NameInMap("V4Count")
        private Long v4Count;

        @NameInMap("V4HttpCount")
        private Long v4HttpCount;

        @NameInMap("V4HttpsCount")
        private Long v4HttpsCount;

        @NameInMap("V6Count")
        private Long v6Count;

        @NameInMap("V6HttpCount")
        private Long v6HttpCount;

        @NameInMap("V6HttpsCount")
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
        public java.util.List < ThreatInfo> getThreatInfo() {
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
            private java.util.List < ThreatInfo> threatInfo; 
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
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
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
             * MaxThreatLevel.
             */
            public Builder maxThreatLevel(String maxThreatLevel) {
                this.maxThreatLevel = maxThreatLevel;
                return this;
            }

            /**
             * SubDomain.
             */
            public Builder subDomain(String subDomain) {
                this.subDomain = subDomain;
                return this;
            }

            /**
             * ThreatCount.
             */
            public Builder threatCount(Long threatCount) {
                this.threatCount = threatCount;
                return this;
            }

            /**
             * ThreatInfo.
             */
            public Builder threatInfo(java.util.List < ThreatInfo> threatInfo) {
                this.threatInfo = threatInfo;
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
