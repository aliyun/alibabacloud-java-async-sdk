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
 * {@link DescribePdnsThreatStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePdnsThreatStatisticsResponseBody</p>
 */
public class DescribePdnsThreatStatisticsResponseBody extends TeaModel {
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

    private DescribePdnsThreatStatisticsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePdnsThreatStatisticsResponseBody create() {
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
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
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

        public DescribePdnsThreatStatisticsResponseBody build() {
            return new DescribePdnsThreatStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePdnsThreatStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePdnsThreatStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DohTotalCount")
        private Long dohTotalCount;

        @com.aliyun.core.annotation.NameInMap("DomainCount")
        private Long domainCount;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("LatestThreatTime")
        private Long latestThreatTime;

        @com.aliyun.core.annotation.NameInMap("MaxThreatLevel")
        private String maxThreatLevel;

        @com.aliyun.core.annotation.NameInMap("SourceIp")
        private String sourceIp;

        @com.aliyun.core.annotation.NameInMap("SubDomain")
        private String subDomain;

        @com.aliyun.core.annotation.NameInMap("ThreatLevel")
        private String threatLevel;

        @com.aliyun.core.annotation.NameInMap("ThreatType")
        private String threatType;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("UdpTotalCount")
        private Long udpTotalCount;

        private Data(Builder builder) {
            this.dohTotalCount = builder.dohTotalCount;
            this.domainCount = builder.domainCount;
            this.domainName = builder.domainName;
            this.latestThreatTime = builder.latestThreatTime;
            this.maxThreatLevel = builder.maxThreatLevel;
            this.sourceIp = builder.sourceIp;
            this.subDomain = builder.subDomain;
            this.threatLevel = builder.threatLevel;
            this.threatType = builder.threatType;
            this.totalCount = builder.totalCount;
            this.udpTotalCount = builder.udpTotalCount;
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
         * @return domainCount
         */
        public Long getDomainCount() {
            return this.domainCount;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return latestThreatTime
         */
        public Long getLatestThreatTime() {
            return this.latestThreatTime;
        }

        /**
         * @return maxThreatLevel
         */
        public String getMaxThreatLevel() {
            return this.maxThreatLevel;
        }

        /**
         * @return sourceIp
         */
        public String getSourceIp() {
            return this.sourceIp;
        }

        /**
         * @return subDomain
         */
        public String getSubDomain() {
            return this.subDomain;
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

        public static final class Builder {
            private Long dohTotalCount; 
            private Long domainCount; 
            private String domainName; 
            private Long latestThreatTime; 
            private String maxThreatLevel; 
            private String sourceIp; 
            private String subDomain; 
            private String threatLevel; 
            private String threatType; 
            private Long totalCount; 
            private Long udpTotalCount; 

            /**
             * DohTotalCount.
             */
            public Builder dohTotalCount(Long dohTotalCount) {
                this.dohTotalCount = dohTotalCount;
                return this;
            }

            /**
             * DomainCount.
             */
            public Builder domainCount(Long domainCount) {
                this.domainCount = domainCount;
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
             * LatestThreatTime.
             */
            public Builder latestThreatTime(Long latestThreatTime) {
                this.latestThreatTime = latestThreatTime;
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
             * SourceIp.
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
