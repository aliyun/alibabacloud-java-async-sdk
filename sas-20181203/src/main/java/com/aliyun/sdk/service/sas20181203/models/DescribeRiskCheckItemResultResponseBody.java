// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskCheckItemResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskCheckItemResultResponseBody</p>
 */
public class DescribeRiskCheckItemResultResponseBody extends TeaModel {
    @NameInMap("PageContentResource")
    private PageContentResource pageContentResource;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeRiskCheckItemResultResponseBody(Builder builder) {
        this.pageContentResource = builder.pageContentResource;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskCheckItemResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageContentResource
     */
    public PageContentResource getPageContentResource() {
        return this.pageContentResource;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageContentResource pageContentResource; 
        private String requestId; 

        /**
         * PageContentResource.
         */
        public Builder pageContentResource(PageContentResource pageContentResource) {
            this.pageContentResource = pageContentResource;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRiskCheckItemResultResponseBody build() {
            return new DescribeRiskCheckItemResultResponseBody(this);
        } 

    } 

    public static class PageContentResource extends TeaModel {
        @NameInMap("ContentResource")
        private String contentResource;

        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageCount")
        private Integer pageCount;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageContentResource(Builder builder) {
            this.contentResource = builder.contentResource;
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageCount = builder.pageCount;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageContentResource create() {
            return builder().build();
        }

        /**
         * @return contentResource
         */
        public String getContentResource() {
            return this.contentResource;
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
         * @return pageCount
         */
        public Integer getPageCount() {
            return this.pageCount;
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
            private String contentResource; 
            private Integer count; 
            private Integer currentPage; 
            private Integer pageCount; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * ContentResource.
             */
            public Builder contentResource(String contentResource) {
                this.contentResource = contentResource;
                return this;
            }

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
             * PageCount.
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
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

            public PageContentResource build() {
                return new PageContentResource(this);
            } 

        } 

    }
}
