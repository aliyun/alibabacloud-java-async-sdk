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

        private Builder() {
        } 

        private Builder(DescribeDomainStatisticsSummaryResponseBody model) {
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
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CC625C21-8832-4683-BF10-C3CFB1A4FA13</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The statistics on the Domain Name System (DNS) requests.</p>
         */
        public Builder statistics(Statistics statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * <p>The total number of data records.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>The total number of returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeDomainStatisticsSummaryResponseBody build() {
            return new DescribeDomainStatisticsSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainStatisticsSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainStatisticsSummaryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Statistic model) {
                this.count = model.count;
                this.domainName = model.domainName;
                this.domainType = model.domainType;
                this.resolveAnalysisStatus = model.resolveAnalysisStatus;
            } 

            /**
             * <p>The number of DNS requests.</p>
             * 
             * <strong>example:</strong>
             * <p>35509014</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>ali-gslb.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The type of the domain name. The parameter value is not case-sensitive. Valid values:</p>
             * <p>PUBLIC (default): hosted public domain name</p>
             * <p>CACHE: cache-accelerated domain name</p>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC</p>
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * <p>Indicates whether the DNS traffic analysis feature is enabled for the domain name. Valid values:</p>
             * <ul>
             * <li>OPEN</li>
             * <li>CLOSE</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OPEN</p>
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
    /**
     * 
     * {@link DescribeDomainStatisticsSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainStatisticsSummaryResponseBody</p>
     */
    public static class Statistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Statistic")
        private java.util.List<Statistic> statistic;

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
        public java.util.List<Statistic> getStatistic() {
            return this.statistic;
        }

        public static final class Builder {
            private java.util.List<Statistic> statistic; 

            private Builder() {
            } 

            private Builder(Statistics model) {
                this.statistic = model.statistic;
            } 

            /**
             * Statistic.
             */
            public Builder statistic(java.util.List<Statistic> statistic) {
                this.statistic = statistic;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
}
