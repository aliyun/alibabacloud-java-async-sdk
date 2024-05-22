// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainStatisticsSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainStatisticsSummaryResponseBody</p>
 */
public class DescribeDomainStatisticsSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Statistics")
    private Statistics statistics;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeDomainStatisticsSummaryResponseBody(Builder builder) {
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

    public static DescribeDomainStatisticsSummaryResponseBody create() {
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
    public Statistics getStatistics() {
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
        private Statistics statistics; 
        private Integer totalItems; 
        private Integer totalPages; 

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The statistics on the Domain Name System (DNS) requests.
         */
        public Builder statistics(Statistics statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * The total number of data records.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * The total number of returned pages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeDomainStatisticsSummaryResponseBody build() {
            return new DescribeDomainStatisticsSummaryResponseBody(this);
        } 

    } 

    public static class Statistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainType")
        private String domainType;

        @com.aliyun.core.annotation.NameInMap("resolveAnalysisStatus")
        private String resolveAnalysisStatus;

        private Statistic(Builder builder) {
            this.count = builder.count;
            this.domainName = builder.domainName;
            this.domainType = builder.domainType;
            this.resolveAnalysisStatus = builder.resolveAnalysisStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistic create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainType
         */
        public String getDomainType() {
            return this.domainType;
        }

        /**
         * @return resolveAnalysisStatus
         */
        public String getResolveAnalysisStatus() {
            return this.resolveAnalysisStatus;
        }

        public static final class Builder {
            private Long count; 
            private String domainName; 
            private String domainType; 
            private String resolveAnalysisStatus; 

            /**
             * The number of DNS requests.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The type of the domain name. The parameter value is not case-sensitive. Valid values:
             * <p>
             * 
             * PUBLIC (default): hosted public domain name
             * 
             * CACHE: cache-accelerated domain name
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * Indicates whether the DNS traffic analysis feature is enabled for the domain name. Valid values:
             * <p>
             * 
             * *   OPEN
             * *   CLOSE
             */
            public Builder resolveAnalysisStatus(String resolveAnalysisStatus) {
                this.resolveAnalysisStatus = resolveAnalysisStatus;
                return this;
            }

            public Statistic build() {
                return new Statistic(this);
            } 

        } 

    }
    public static class Statistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Statistic")
        private java.util.List < Statistic> statistic;

        private Statistics(Builder builder) {
            this.statistic = builder.statistic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return statistic
         */
        public java.util.List < Statistic> getStatistic() {
            return this.statistic;
        }

        public static final class Builder {
            private java.util.List < Statistic> statistic; 

            /**
             * Statistic.
             */
            public Builder statistic(java.util.List < Statistic> statistic) {
                this.statistic = statistic;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
}
