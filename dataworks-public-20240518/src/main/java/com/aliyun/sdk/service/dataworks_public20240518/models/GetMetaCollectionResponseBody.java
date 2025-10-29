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
 * {@link GetMetaCollectionResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaCollectionResponseBody</p>
 */
public class GetMetaCollectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetaCollection")
    private MetaCollection metaCollection;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMetaCollectionResponseBody(Builder builder) {
        this.metaCollection = builder.metaCollection;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaCollectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metaCollection
     */
    public MetaCollection getMetaCollection() {
        return this.metaCollection;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MetaCollection metaCollection; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMetaCollectionResponseBody model) {
            this.metaCollection = model.metaCollection;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The collection details.</p>
         */
        public Builder metaCollection(MetaCollection metaCollection) {
            this.metaCollection = metaCollection;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AFAE64E-D1BE-432B-A9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMetaCollectionResponseBody build() {
            return new GetMetaCollectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMetaCollectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetaCollectionResponseBody</p>
     */
    public static class MetaCollection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Administrators")
        private java.util.List<Long> administrators;

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

        private MetaCollection(Builder builder) {
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

        public static MetaCollection create() {
            return builder().build();
        }

        /**
         * @return administrators
         */
        public java.util.List<Long> getAdministrators() {
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
            private java.util.List<Long> administrators; 
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

            private Builder(MetaCollection model) {
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
             * <p>The list of administrator IDs. Valid only for the album type. The IDs must belong to users in the same tenant. Multiple IDs can be specified.</p>
             */
            public Builder administrators(java.util.List<Long> administrators) {
                this.administrators = administrators;
                return this;
            }

            /**
             * <p>The creation time in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1668568601000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the creator.</p>
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
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The collection ID.</p>
             * 
             * <strong>example:</strong>
             * <p>category.123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The last modified time in milliseconds.</p>
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
             * <p>The parent collection ID. This parameter can be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>category.12</p>
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
             * <li>AlbumCategory: Album subcategory.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Category</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MetaCollection build() {
                return new MetaCollection(this);
            } 

        } 

    }
}
