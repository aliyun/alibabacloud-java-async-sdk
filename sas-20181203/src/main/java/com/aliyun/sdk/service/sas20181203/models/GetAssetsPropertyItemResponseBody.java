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
 * {@link GetAssetsPropertyItemResponseBody} extends {@link TeaModel}
 *
 * <p>GetAssetsPropertyItemResponseBody</p>
 */
public class GetAssetsPropertyItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("PropertyItems")
    private java.util.List<PropertyItems> propertyItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAssetsPropertyItemResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.propertyItems = builder.propertyItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetsPropertyItemResponseBody create() {
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

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>An array that consists of the aggregation information about asset fingerprints.</p>
         */
        public Builder propertyItems(java.util.List<PropertyItems> propertyItems) {
            this.propertyItems = propertyItems;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>340D7FC4-D575-1661-8ACD-CFA7BE57****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAssetsPropertyItemResponseBody build() {
            return new GetAssetsPropertyItemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAssetsPropertyItemResponseBody} extends {@link TeaModel}
     *
     * <p>GetAssetsPropertyItemResponseBody</p>
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
             * <p>45</p>
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
     * {@link GetAssetsPropertyItemResponseBody} extends {@link TeaModel}
     *
     * <p>GetAssetsPropertyItemResponseBody</p>
     */
    public static class PropertyItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private PropertyItems(Builder builder) {
            this.count = builder.count;
            this.domain = builder.domain;
            this.moduleName = builder.moduleName;
            this.path = builder.path;
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
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private Integer count; 
            private String domain; 
            private String moduleName; 
            private String path; 

            /**
             * <p>The number of servers related to the asset fingerprints.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The endpoint.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>localhost</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The name of the module.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>lkm</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>alihids</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The path to the startup item.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>autorun</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>C:/Program Files/****</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public PropertyItems build() {
                return new PropertyItems(this);
            } 

        } 

    }
}
