// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainListResponseBody</p>
 */
public class DescribeDomainListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainListResponseList")
    private java.util.List < DomainListResponseList> domainListResponseList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>An array that consists of the information about domain names.</p>
         */
        public Builder domainListResponseList(java.util.List < DomainListResponseList> domainListResponseList) {
            this.domainListResponseList = domainListResponseList;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0B48AB3C-84FC-424D-A01D-B9270EF46038</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainListResponseBody build() {
            return new DescribeDomainListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainListResponseBody</p>
     */
    public static class DomainListResponseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("IpList")
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
             * <p>The name of the domain or website.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The IP addresses of the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.XX.XX,1.0.XX.XX</p>
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
    /**
     * 
     * {@link DescribeDomainListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainListResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
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
