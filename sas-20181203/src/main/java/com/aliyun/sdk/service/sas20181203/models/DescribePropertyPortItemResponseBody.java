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
 * {@link DescribePropertyPortItemResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyPortItemResponseBody</p>
 */
public class DescribePropertyPortItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("PropertyItems")
    private java.util.List<PropertyItems> propertyItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePropertyPortItemResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.propertyItems = builder.propertyItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyPortItemResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return propertyItems
     */
    public java.util.List<PropertyItems> getPropertyItems() {
        return this.propertyItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private java.util.List<PropertyItems> propertyItems; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePropertyPortItemResponseBody model) {
            this.pageInfo = model.pageInfo;
            this.propertyItems = model.propertyItems;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>An array that consists of the ports returned.</p>
         */
        public Builder propertyItems(java.util.List<PropertyItems> propertyItems) {
            this.propertyItems = propertyItems;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePropertyPortItemResponseBody build() {
            return new DescribePropertyPortItemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePropertyPortItemResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePropertyPortItemResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>163</p>
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
    /**
     * 
     * {@link DescribePropertyPortItemResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePropertyPortItemResponseBody</p>
     */
    public static class PropertyItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Proto")
        private String proto;

        private PropertyItems(Builder builder) {
            this.count = builder.count;
            this.port = builder.port;
            this.proto = builder.proto;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyItems create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return proto
         */
        public String getProto() {
            return this.proto;
        }

        public static final class Builder {
            private Integer count; 
            private String port; 
            private String proto; 

            private Builder() {
            } 

            private Builder(PropertyItems model) {
                this.count = model.count;
                this.port = model.port;
                this.proto = model.proto;
            } 

            /**
             * <p>The number of servers that use the port.</p>
             * 
             * <strong>example:</strong>
             * <p>495</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The number of the listening port.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The network protocol of the port.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            public PropertyItems build() {
                return new PropertyItems(this);
            } 

        } 

    }
}
