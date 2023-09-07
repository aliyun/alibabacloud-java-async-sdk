// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyTypeScaItemResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyTypeScaItemResponseBody</p>
 */
public class DescribePropertyTypeScaItemResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("PropertyTypeItems")
    private java.util.List < PropertyTypeItems> propertyTypeItems;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePropertyTypeScaItemResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.propertyTypeItems = builder.propertyTypeItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyTypeScaItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return propertyTypeItems
     */
    public java.util.List < PropertyTypeItems> getPropertyTypeItems() {
        return this.propertyTypeItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private java.util.List < PropertyTypeItems> propertyTypeItems; 
        private String requestId; 

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * An array that consists of the middleware types.
         */
        public Builder propertyTypeItems(java.util.List < PropertyTypeItems> propertyTypeItems) {
            this.propertyTypeItems = propertyTypeItems;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePropertyTypeScaItemResponseBody build() {
            return new DescribePropertyTypeScaItemResponseBody(this);
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
    public static class PropertyTypeItems extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        private PropertyTypeItems(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyTypeItems create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String type; 

            /**
             * The name of the middleware type.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the middleware. Valid values:
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
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PropertyTypeItems build() {
                return new PropertyTypeItems(this);
            } 

        } 

    }
}
