// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDomainsResponseBody</p>
 */
public class ListDomainsResponseBody extends TeaModel {
    @NameInMap("DomainInfos")
    private DomainInfos domainInfos;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    public static class DomainInfo extends TeaModel {
        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Resolved")
        private Long resolved;

        @NameInMap("Resolved6")
        private Long resolved6;

        @NameInMap("ResolvedHttps")
        private Long resolvedHttps;

        @NameInMap("ResolvedHttps6")
        private Long resolvedHttps6;

        private DomainInfo(Builder builder) {
            this.domainName = builder.domainName;
            this.resolved = builder.resolved;
            this.resolved6 = builder.resolved6;
            this.resolvedHttps = builder.resolvedHttps;
            this.resolvedHttps6 = builder.resolvedHttps6;
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

        public static final class Builder {
            private String domainName; 
            private Long resolved; 
            private Long resolved6; 
            private Long resolvedHttps; 
            private Long resolvedHttps6; 

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

            public DomainInfo build() {
                return new DomainInfo(this);
            } 

        } 

    }
    public static class DomainInfos extends TeaModel {
        @NameInMap("DomainInfo")
        private java.util.List < DomainInfo> domainInfo;

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
        public java.util.List < DomainInfo> getDomainInfo() {
            return this.domainInfo;
        }

        public static final class Builder {
            private java.util.List < DomainInfo> domainInfo; 

            /**
             * DomainInfo.
             */
            public Builder domainInfo(java.util.List < DomainInfo> domainInfo) {
                this.domainInfo = domainInfo;
                return this;
            }

            public DomainInfos build() {
                return new DomainInfos(this);
            } 

        } 

    }
}
