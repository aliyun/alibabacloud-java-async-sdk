// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainListResponseBody</p>
 */
public class DescribeDomainListResponseBody extends TeaModel {
    @NameInMap("DomainListResponseList")
    private java.util.List < DomainListResponseList> domainListResponseList;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDomainListResponseBody(Builder builder) {
        this.domainListResponseList = builder.domainListResponseList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainListResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainListResponseList
     */
    public java.util.List < DomainListResponseList> getDomainListResponseList() {
        return this.domainListResponseList;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DomainListResponseList> domainListResponseList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * DomainListResponseList.
         */
        public Builder domainListResponseList(java.util.List < DomainListResponseList> domainListResponseList) {
            this.domainListResponseList = domainListResponseList;
            return this;
        }

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * DescribeDomainList
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainListResponseBody build() {
            return new DescribeDomainListResponseBody(this);
        } 

    } 

    public static class DomainListResponseList extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("IpList")
        private String ipList;

        private DomainListResponseList(Builder builder) {
            this.domain = builder.domain;
            this.ipList = builder.ipList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainListResponseList create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return ipList
         */
        public String getIpList() {
            return this.ipList;
        }

        public static final class Builder {
            private String domain; 
            private String ipList; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * IpList.
             */
            public Builder ipList(String ipList) {
                this.ipList = ipList;
                return this;
            }

            public DomainListResponseList build() {
                return new DomainListResponseList(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
