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
 * {@link DescribePropertyCronItemResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyCronItemResponseBody</p>
 */
public class DescribePropertyCronItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("PropertyItems")
    private java.util.List<PropertyItems> propertyItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePropertyCronItemResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.propertyItems = builder.propertyItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyCronItemResponseBody create() {
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

        private Builder(DescribePropertyCronItemResponseBody model) {
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
         * <p>An array that consists of scheduled tasks.</p>
         */
        public Builder propertyItems(java.util.List<PropertyItems> propertyItems) {
            this.propertyItems = propertyItems;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>291B49F9-1685-4005-9D34-606B6F78****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePropertyCronItemResponseBody build() {
            return new DescribePropertyCronItemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePropertyCronItemResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePropertyCronItemResponseBody</p>
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
             * <p>11</p>
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
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
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
     * {@link DescribePropertyCronItemResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePropertyCronItemResponseBody</p>
     */
    public static class PropertyItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private PropertyItems(Builder builder) {
            this.count = builder.count;
            this.source = builder.source;
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
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private Integer count; 
            private String source; 

            private Builder() {
            } 

            private Builder(PropertyItems model) {
                this.count = model.count;
                this.source = model.source;
            } 

            /**
             * <p>The number of servers on which the scheduled task is run.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The path to the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>/data</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public PropertyItems build() {
                return new PropertyItems(this);
            } 

        } 

    }
}
