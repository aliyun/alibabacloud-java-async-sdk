// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyProcItemResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyProcItemResponseBody</p>
 */
public class DescribePropertyProcItemResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("PropertyItems")
    private java.util.List < PropertyItems> propertyItems;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePropertyProcItemResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.propertyItems = builder.propertyItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyProcItemResponseBody create() {
        return builder().build();
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
    public java.util.List < PropertyItems> getPropertyItems() {
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
        private java.util.List < PropertyItems> propertyItems; 
        private String requestId; 

        /**
         * The page number of the returned page.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The name of the process.
         */
        public Builder propertyItems(java.util.List < PropertyItems> propertyItems) {
            this.propertyItems = propertyItems;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePropertyProcItemResponseBody build() {
            return new DescribePropertyProcItemResponseBody(this);
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
             * An array that consists of the processes returned.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The number of entries returned on the current page.
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
    public static class PropertyItems extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Name")
        private String name;

        private PropertyItems(Builder builder) {
            this.count = builder.count;
            this.name = builder.name;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer count; 
            private String name; 

            /**
             * Queries information about all processes.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The number of servers on which the process runs.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public PropertyItems build() {
                return new PropertyItems(this);
            } 

        } 

    }
}
