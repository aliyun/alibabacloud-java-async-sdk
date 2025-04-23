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
 * {@link DescribeRecordResolveStatisticsSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecordResolveStatisticsSummaryResponseBody</p>
 */
public class DescribeRecordResolveStatisticsSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Statistics")
    private java.util.List<Statistics> statistics;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeRecordResolveStatisticsSummaryResponseBody(Builder builder) {
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

    public static DescribeRecordResolveStatisticsSummaryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Statistics> getStatistics() {
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
        private java.util.List<Statistics> statistics; 
        private Integer totalItems; 
        private Integer totalPages; 

        private Builder() {
        } 

        private Builder(DescribeRecordResolveStatisticsSummaryResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.statistics = model.statistics;
            this.totalItems = model.totalItems;
            this.totalPages = model.totalPages;
        } 

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: <strong>1 to 500</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>389DFFA3-77A5-4A9E-BF3D-147C6F98A5BA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The statistics.</p>
         */
        public Builder statistics(java.util.List<Statistics> statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeRecordResolveStatisticsSummaryResponseBody build() {
            return new DescribeRecordResolveStatisticsSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRecordResolveStatisticsSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecordResolveStatisticsSummaryResponseBody</p>
     */
    public static class Statistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainType")
        private String domainType;

        @com.aliyun.core.annotation.NameInMap("SubDomain")
        private String subDomain;

        private Statistics(Builder builder) {
            this.count = builder.count;
            this.domainName = builder.domainName;
            this.domainType = builder.domainType;
            this.subDomain = builder.subDomain;
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

        /**
         * @return subDomain
         */
        public String getSubDomain() {
            return this.subDomain;
        }

        public static final class Builder {
            private String count; 
            private String domainName; 
            private String domainType; 
            private String subDomain; 

            private Builder() {
            } 

            private Builder(Statistics model) {
                this.count = model.count;
                this.domainName = model.domainName;
                this.domainType = model.domainType;
                this.subDomain = model.subDomain;
            } 

            /**
             * <p>The number of DNS requests.</p>
             * 
             * <strong>example:</strong>
             * <p>330</p>
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The subdomain name.</p>
             * 
             * <strong>example:</strong>
             * <p>tes.example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The type of the domain name. The parameter value is not case-sensitive. Valid values:</p>
             * <ul>
             * <li>PUBLIC (default): hosted public domain name</li>
             * <li>CACHE: cache-accelerated domain name</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC</p>
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * <p>The subdomain.</p>
             * 
             * <strong>example:</strong>
             * <p>test.example.com</p>
             */
            public Builder subDomain(String subDomain) {
                this.subDomain = subDomain;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
}
