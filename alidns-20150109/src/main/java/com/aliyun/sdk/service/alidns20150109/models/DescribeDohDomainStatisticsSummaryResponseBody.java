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
 * {@link DescribeDohDomainStatisticsSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDohDomainStatisticsSummaryResponseBody</p>
 */
public class DescribeDohDomainStatisticsSummaryResponseBody extends TeaModel {
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

    private DescribeDohDomainStatisticsSummaryResponseBody(Builder builder) {
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

    public static DescribeDohDomainStatisticsSummaryResponseBody create() {
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

        private Builder(DescribeDohDomainStatisticsSummaryResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.statistics = model.statistics;
            this.totalItems = model.totalItems;
            this.totalPages = model.totalPages;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0F32959D-417B-4D66-8463-68606605E3E2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The statistics list.</p>
         */
        public Builder statistics(java.util.List<Statistics> statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeDohDomainStatisticsSummaryResponseBody build() {
            return new DescribeDohDomainStatisticsSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDohDomainStatisticsSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDohDomainStatisticsSummaryResponseBody</p>
     */
    public static class Statistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("HttpCount")
        private Long httpCount;

        @com.aliyun.core.annotation.NameInMap("HttpsCount")
        private Long httpsCount;

        @com.aliyun.core.annotation.NameInMap("IpCount")
        private Long ipCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("V4HttpCount")
        private Long v4HttpCount;

        @com.aliyun.core.annotation.NameInMap("V4HttpsCount")
        private Long v4HttpsCount;

        @com.aliyun.core.annotation.NameInMap("V6HttpCount")
        private Long v6HttpCount;

        @com.aliyun.core.annotation.NameInMap("V6HttpsCount")
        private Long v6HttpsCount;

        private Statistics(Builder builder) {
            this.domainName = builder.domainName;
            this.httpCount = builder.httpCount;
            this.httpsCount = builder.httpsCount;
            this.ipCount = builder.ipCount;
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
            private String domainName; 
            private Long httpCount; 
            private Long httpsCount; 
            private Long ipCount; 
            private Long totalCount; 
            private Long v4HttpCount; 
            private Long v4HttpsCount; 
            private Long v6HttpCount; 
            private Long v6HttpsCount; 

            private Builder() {
            } 

            private Builder(Statistics model) {
                this.domainName = model.domainName;
                this.httpCount = model.httpCount;
                this.httpsCount = model.httpsCount;
                this.ipCount = model.ipCount;
                this.totalCount = model.totalCount;
                this.v4HttpCount = model.v4HttpCount;
                this.v4HttpsCount = model.v4HttpsCount;
                this.v6HttpCount = model.v6HttpCount;
                this.v6HttpsCount = model.v6HttpsCount;
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
             * <p>3141592653</p>
             */
            public Builder httpCount(Long httpCount) {
                this.httpCount = httpCount;
                return this;
            }

            /**
             * <p>The number of HTTPS requests.</p>
             * 
             * <strong>example:</strong>
             * <p>3141592653</p>
             */
            public Builder httpsCount(Long httpsCount) {
                this.httpsCount = httpsCount;
                return this;
            }

            /**
             * <p>The number of IP addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder ipCount(Long ipCount) {
                this.ipCount = ipCount;
                return this;
            }

            /**
             * <p>The total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>14141592653</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The number of IPv4-based HTTP requests.</p>
             * 
             * <strong>example:</strong>
             * <p>3141592653</p>
             */
            public Builder v4HttpCount(Long v4HttpCount) {
                this.v4HttpCount = v4HttpCount;
                return this;
            }

            /**
             * <p>The number of IPv4-based HTTPS requests.</p>
             * 
             * <strong>example:</strong>
             * <p>3141592653</p>
             */
            public Builder v4HttpsCount(Long v4HttpsCount) {
                this.v4HttpsCount = v4HttpsCount;
                return this;
            }

            /**
             * <p>The number of IPv6-based HTTP requests.</p>
             * 
             * <strong>example:</strong>
             * <p>3141592653</p>
             */
            public Builder v6HttpCount(Long v6HttpCount) {
                this.v6HttpCount = v6HttpCount;
                return this;
            }

            /**
             * <p>The number of IPv6-based HTTPS requests.</p>
             * 
             * <strong>example:</strong>
             * <p>3141592653</p>
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
