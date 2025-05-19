// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListInstanceResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceResourcesResponseBody</p>
 */
public class ListInstanceResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListInstanceResourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Resources> resources; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListInstanceResourcesResponseBody model) {
            this.requestId = model.requestId;
            this.resources = model.resources;
            this.totalCount = model.totalCount;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Resources.
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstanceResourcesResponseBody build() {
            return new ListInstanceResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResourcesResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("GmtCreateAt")
        private String gmtCreateAt;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedAt")
        private String gmtModifiedAt;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private Resources(Builder builder) {
            this.category = builder.category;
            this.config = builder.config;
            this.gmtCreateAt = builder.gmtCreateAt;
            this.gmtModifiedAt = builder.gmtModifiedAt;
            this.group = builder.group;
            this.resourceId = builder.resourceId;
            this.type = builder.type;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return gmtCreateAt
         */
        public String getGmtCreateAt() {
            return this.gmtCreateAt;
        }

        /**
         * @return gmtModifiedAt
         */
        public String getGmtModifiedAt() {
            return this.gmtModifiedAt;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String category; 
            private String config; 
            private String gmtCreateAt; 
            private String gmtModifiedAt; 
            private String group; 
            private String resourceId; 
            private String type; 
            private String uri; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.category = model.category;
                this.config = model.config;
                this.gmtCreateAt = model.gmtCreateAt;
                this.gmtModifiedAt = model.gmtModifiedAt;
                this.group = model.group;
                this.resourceId = model.resourceId;
                this.type = model.type;
                this.uri = model.uri;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * GmtCreateAt.
             */
            public Builder gmtCreateAt(String gmtCreateAt) {
                this.gmtCreateAt = gmtCreateAt;
                return this;
            }

            /**
             * GmtModifiedAt.
             */
            public Builder gmtModifiedAt(String gmtModifiedAt) {
                this.gmtModifiedAt = gmtModifiedAt;
                return this;
            }

            /**
             * Group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
