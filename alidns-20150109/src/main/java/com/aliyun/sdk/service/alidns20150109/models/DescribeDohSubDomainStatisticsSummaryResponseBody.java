// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDohSubDomainStatisticsSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDohSubDomainStatisticsSummaryResponseBody</p>
 */
public class DescribeDohSubDomainStatisticsSummaryResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Statistics")
    private java.util.List < Statistics> statistics;

    @NameInMap("TotalItems")
    private Integer totalItems;

    @NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeDohSubDomainStatisticsSummaryResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.statistics = builder.statistics;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDohSubDomainStatisticsSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statistics
     */
    public java.util.List < Statistics> getStatistics() {
        return this.statistics;
    }

    /**
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < Statistics> statistics; 
        private Integer totalItems; 
        private Integer totalPages; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
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
         * Statistics.
         */
        public Builder statistics(java.util.List < Statistics> statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * TotalItems.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeDohSubDomainStatisticsSummaryResponseBody build() {
            return new DescribeDohSubDomainStatisticsSummaryResponseBody(this);
        } 

    } 

    public static class Statistics extends TeaModel {
        @NameInMap("HttpCount")
        private Long httpCount;

        @NameInMap("HttpsCount")
        private Long httpsCount;

        @NameInMap("IpCount")
        private Long ipCount;

        @NameInMap("SubDomain")
        private String subDomain;

        @NameInMap("TotalCount")
        private Long totalCount;

        @NameInMap("V4HttpCount")
        private Long v4HttpCount;

        @NameInMap("V4HttpsCount")
        private Long v4HttpsCount;

        @NameInMap("V6HttpCount")
        private Long v6HttpCount;

        @NameInMap("V6HttpsCount")
        private Long v6HttpsCount;

        private Statistics(Builder builder) {
            this.httpCount = builder.httpCount;
            this.httpsCount = builder.httpsCount;
            this.ipCount = builder.ipCount;
            this.subDomain = builder.subDomain;
            this.totalCount = builder.totalCount;
            this.v4HttpCount = builder.v4HttpCount;
            this.v4HttpsCount = builder.v4HttpsCount;
            this.v6HttpCount = builder.v6HttpCount;
            this.v6HttpsCount = builder.v6HttpsCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
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
         * @return subDomain
         */
        public String getSubDomain() {
            return this.subDomain;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
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
            private Long httpCount; 
            private Long httpsCount; 
            private Long ipCount; 
            private String subDomain; 
            private Long totalCount; 
            private Long v4HttpCount; 
            private Long v4HttpsCount; 
            private Long v6HttpCount; 
            private Long v6HttpsCount; 

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
             * SubDomain.
             */
            public Builder subDomain(String subDomain) {
                this.subDomain = subDomain;
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

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
}
