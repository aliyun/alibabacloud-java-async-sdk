// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeRiskCheckItemResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskCheckItemResultResponseBody</p>
 */
public class DescribeRiskCheckItemResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageContentResource")
    private PageContentResource pageContentResource;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRiskCheckItemResultResponseBody model) {
            this.pageContentResource = model.pageContentResource;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageContentResource(PageContentResource pageContentResource) {
            this.pageContentResource = pageContentResource;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3BFB4989-A108-46A4-954E-FF7EF02D1078</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRiskCheckItemResultResponseBody build() {
            return new DescribeRiskCheckItemResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRiskCheckItemResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskCheckItemResultResponseBody</p>
     */
    public static class PageContentResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentResource")
        private java.util.Map<String, ?> contentResource;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageCount")
        private Integer pageCount;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.Map<String, ?> getContentResource() {
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
            private java.util.Map<String, ?> contentResource; 
            private Integer count; 
            private Integer currentPage; 
            private Integer pageCount; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageContentResource model) {
                this.contentResource = model.contentResource;
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageCount = model.pageCount;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The data of the affected assets on each page in a dynamic table.</p>
             */
            public Builder contentResource(java.util.Map<String, ?> contentResource) {
                this.contentResource = contentResource;
                return this;
            }

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The total number of pages returned.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
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
             * <p>1</p>
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
