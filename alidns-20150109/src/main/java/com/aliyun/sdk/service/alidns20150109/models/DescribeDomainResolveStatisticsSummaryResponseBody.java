// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainResolveStatisticsSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainResolveStatisticsSummaryResponseBody</p>
 */
public class DescribeDomainResolveStatisticsSummaryResponseBody extends TeaModel {
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

    private DescribeDomainResolveStatisticsSummaryResponseBody(Builder builder) {
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

    public static DescribeDomainResolveStatisticsSummaryResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The statistics.
         */
        public Builder statistics(java.util.List < Statistics> statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * The total number of pages returned.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeDomainResolveStatisticsSummaryResponseBody build() {
            return new DescribeDomainResolveStatisticsSummaryResponseBody(this);
        } 

    } 

    public static class Statistics extends TeaModel {
        @NameInMap("Count")
        private String count;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainType")
        private String domainType;

        private Statistics(Builder builder) {
            this.count = builder.count;
            this.domainName = builder.domainName;
            this.domainType = builder.domainType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
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

        public static final class Builder {
            private String count; 
            private String domainName; 
            private String domainType; 

            /**
             * The number of resolution requests.
             */
            public Builder count(String count) {
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
             * The instance type. Valid values: PUBLIC and CACHE. PUBLIC indicates an authoritative domain name. CACHE indicates a cache-accelerated domain name.
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
}
