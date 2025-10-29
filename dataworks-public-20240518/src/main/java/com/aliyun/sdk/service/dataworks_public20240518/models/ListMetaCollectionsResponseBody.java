// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListMetaCollectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMetaCollectionsResponseBody</p>
 */
public class ListMetaCollectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListMetaCollectionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetaCollectionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListMetaCollectionsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Pagination information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E25887B7-579C-54A5-9C4F-83A0DE367DDE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMetaCollectionsResponseBody build() {
            return new ListMetaCollectionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMetaCollectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMetaCollectionsResponseBody</p>
     */
    public static class MetaCollections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Administrators")
        private java.util.List<String> administrators;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MetaCollections(Builder builder) {
            this.administrators = builder.administrators;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.description = builder.description;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.parentId = builder.parentId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaCollections create() {
            return builder().build();
        }

        /**
         * @return administrators
         */
        public java.util.List<String> getAdministrators() {
            return this.administrators;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> administrators; 
            private Long createTime; 
            private String createUser; 
            private String description; 
            private String id; 
            private Long modifyTime; 
            private String name; 
            private String parentId; 
            private String type; 

            private Builder() {
            } 

            private Builder(MetaCollections model) {
                this.administrators = model.administrators;
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.description = model.description;
                this.id = model.id;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.parentId = model.parentId;
                this.type = model.type;
            } 

            /**
             * <p>The list of administrator IDs. Supported only for album types. Administrators must be users within the same tenant. Multiple administrators can be specified.</p>
             */
            public Builder administrators(java.util.List<String> administrators) {
                this.administrators = administrators;
                return this;
            }

            /**
             * <p>The creation time in milliseconds (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1668568601000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creator user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>456789</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The collection description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The collection name.</p>
             * 
             * <strong>example:</strong>
             * <p>category.123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The modification time in milliseconds (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1668568601000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The collection name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_category</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the parent collection. Can be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>category.1</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The collection type. Valid values:</p>
             * <ul>
             * <li>Category</li>
             * <li>Album</li>
             * <li>AlbumCategory: Album subcategory</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Category</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MetaCollections build() {
                return new MetaCollections(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMetaCollectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMetaCollectionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetaCollections")
        private java.util.List<MetaCollections> metaCollections;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.metaCollections = builder.metaCollections;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return metaCollections
         */
        public java.util.List<MetaCollections> getMetaCollections() {
            return this.metaCollections;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
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
            private java.util.List<MetaCollections> metaCollections; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.metaCollections = model.metaCollections;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of collections.</p>
             */
            public Builder metaCollections(java.util.List<MetaCollections> metaCollections) {
                this.metaCollections = metaCollections;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
