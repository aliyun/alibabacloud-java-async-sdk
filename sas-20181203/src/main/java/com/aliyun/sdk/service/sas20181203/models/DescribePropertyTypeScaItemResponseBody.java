// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePropertyTypeScaItemResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyTypeScaItemResponseBody</p>
 */
public class DescribePropertyTypeScaItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("PropertyTypeItems")
    private java.util.List < PropertyTypeItems> propertyTypeItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>An array that consists of the middleware types.</p>
         */
        public Builder propertyTypeItems(java.util.List < PropertyTypeItems> propertyTypeItems) {
            this.propertyTypeItems = propertyTypeItems;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>B7A839E8-70AE-591D-8D9E-C5419A22****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePropertyTypeScaItemResponseBody build() {
            return new DescribePropertyTypeScaItemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePropertyTypeScaItemResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePropertyTypeScaItemResponseBody</p>
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
             * <p>20</p>
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
             * <p>69</p>
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
     * {@link DescribePropertyTypeScaItemResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePropertyTypeScaItemResponseBody</p>
     */
    public static class PropertyTypeItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The name of the middleware type.</p>
             * 
             * <strong>example:</strong>
             * <p>Docker Component</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the middleware. Valid values:</p>
             * <ul>
             * <li><strong>system_service</strong>: system service</li>
             * <li><strong>software_library</strong>: software library</li>
             * <li><strong>docker_component</strong>: container component</li>
             * <li><strong>database</strong>: database</li>
             * <li><strong>web_container</strong>: web container</li>
             * <li><strong>jar</strong>: JAR package</li>
             * <li><strong>web_framework</strong>: web framework</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>docker_component</p>
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
