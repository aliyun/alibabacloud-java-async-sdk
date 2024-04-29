// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyScaItemResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyScaItemResponseBody</p>
 */
public class DescribePropertyScaItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("PropertyItems")
    private java.util.List < PropertyItems> propertyItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePropertyScaItemResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.propertyItems = builder.propertyItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyScaItemResponseBody create() {
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
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * An array that consists of the information about middleware fingerprints.
         */
        public Builder propertyItems(java.util.List < PropertyItems> propertyItems) {
            this.propertyItems = propertyItems;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePropertyScaItemResponseBody build() {
            return new DescribePropertyScaItemResponseBody(this);
        } 

    } 

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
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TypeDisplay")
        private String typeDisplay;

        private PropertyItems(Builder builder) {
            this.bizType = builder.bizType;
            this.count = builder.count;
            this.name = builder.name;
            this.typeDisplay = builder.typeDisplay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyItems create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
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

        /**
         * @return typeDisplay
         */
        public String getTypeDisplay() {
            return this.typeDisplay;
        }

        public static final class Builder {
            private String bizType; 
            private Integer count; 
            private String name; 
            private String typeDisplay; 

            /**
             * The type of the middleware, database, or web service. Valid values:
             * <p>
             * 
             * *   **system_service**: system service
             * *   **software_library**: software library
             * *   **docker_component**: container component
             * *   **database**: database
             * *   **web_container**: web container
             * *   **jar**: JAR package
             * *   **web_framework**: web framework
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * The number of servers on which the middleware is run.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The name of the middleware.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The display name of the middleware type.
             */
            public Builder typeDisplay(String typeDisplay) {
                this.typeDisplay = typeDisplay;
                return this;
            }

            public PropertyItems build() {
                return new PropertyItems(this);
            } 

        } 

    }
}
