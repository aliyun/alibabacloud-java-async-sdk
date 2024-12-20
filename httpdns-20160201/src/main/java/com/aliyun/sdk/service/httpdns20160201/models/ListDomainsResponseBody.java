// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

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
 * {@link ListDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDomainsResponseBody</p>
 */
public class ListDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainInfos")
    private DomainInfos domainInfos;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListDomainsResponseBody(Builder builder) {
        this.domainInfos = builder.domainInfos;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainInfos
     */
    public DomainInfos getDomainInfos() {
        return this.domainInfos;
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
        private DomainInfos domainInfos; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * DomainInfos.
         */
        public Builder domainInfos(DomainInfos domainInfos) {
            this.domainInfos = domainInfos;
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

        public ListDomainsResponseBody build() {
            return new ListDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDomainsResponseBody</p>
     */
    public static class DomainInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Resolved")
        private Long resolved;

        @com.aliyun.core.annotation.NameInMap("Resolved6")
        private Long resolved6;

        @com.aliyun.core.annotation.NameInMap("ResolvedDoh")
        private Long resolvedDoh;

        @com.aliyun.core.annotation.NameInMap("ResolvedHttps")
        private Long resolvedHttps;

        @com.aliyun.core.annotation.NameInMap("ResolvedHttps6")
        private Long resolvedHttps6;

        @com.aliyun.core.annotation.NameInMap("TimeModified")
        private Long timeModified;

        private DomainInfo(Builder builder) {
            this.domainName = builder.domainName;
            this.resolved = builder.resolved;
            this.resolved6 = builder.resolved6;
            this.resolvedDoh = builder.resolvedDoh;
            this.resolvedHttps = builder.resolvedHttps;
            this.resolvedHttps6 = builder.resolvedHttps6;
            this.timeModified = builder.timeModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainInfo create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return resolved
         */
        public Long getResolved() {
            return this.resolved;
        }

        /**
         * @return resolved6
         */
        public Long getResolved6() {
            return this.resolved6;
        }

        /**
         * @return resolvedDoh
         */
        public Long getResolvedDoh() {
            return this.resolvedDoh;
        }

        /**
         * @return resolvedHttps
         */
        public Long getResolvedHttps() {
            return this.resolvedHttps;
        }

        /**
         * @return resolvedHttps6
         */
        public Long getResolvedHttps6() {
            return this.resolvedHttps6;
        }

        /**
         * @return timeModified
         */
        public Long getTimeModified() {
            return this.timeModified;
        }

        public static final class Builder {
            private String domainName; 
            private Long resolved; 
            private Long resolved6; 
            private Long resolvedDoh; 
            private Long resolvedHttps; 
            private Long resolvedHttps6; 
            private Long timeModified; 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Resolved.
             */
            public Builder resolved(Long resolved) {
                this.resolved = resolved;
                return this;
            }

            /**
             * Resolved6.
             */
            public Builder resolved6(Long resolved6) {
                this.resolved6 = resolved6;
                return this;
            }

            /**
             * ResolvedDoh.
             */
            public Builder resolvedDoh(Long resolvedDoh) {
                this.resolvedDoh = resolvedDoh;
                return this;
            }

            /**
             * ResolvedHttps.
             */
            public Builder resolvedHttps(Long resolvedHttps) {
                this.resolvedHttps = resolvedHttps;
                return this;
            }

            /**
             * ResolvedHttps6.
             */
            public Builder resolvedHttps6(Long resolvedHttps6) {
                this.resolvedHttps6 = resolvedHttps6;
                return this;
            }

            /**
             * TimeModified.
             */
            public Builder timeModified(Long timeModified) {
                this.timeModified = timeModified;
                return this;
            }

            public DomainInfo build() {
                return new DomainInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDomainsResponseBody</p>
     */
    public static class DomainInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainInfo")
        private java.util.List<DomainInfo> domainInfo;

        private DomainInfos(Builder builder) {
            this.domainInfo = builder.domainInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainInfos create() {
            return builder().build();
        }

        /**
         * @return domainInfo
         */
        public java.util.List<DomainInfo> getDomainInfo() {
            return this.domainInfo;
        }

        public static final class Builder {
            private java.util.List<DomainInfo> domainInfo; 

            /**
             * DomainInfo.
             */
            public Builder domainInfo(java.util.List<DomainInfo> domainInfo) {
                this.domainInfo = domainInfo;
                return this;
            }

            public DomainInfos build() {
                return new DomainInfos(this);
            } 

        } 

    }
}
