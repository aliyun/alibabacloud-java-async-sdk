// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListTagResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListTagResourcesRequest</p>
 */
public class ListTagResourcesRequest extends Request {
    @Query
    @NameInMap("resourceId")
    private java.util.List < String > resourceId;

    @Query
    @NameInMap("resourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("tags")
    private java.util.List < Tags> tags;

    private ListTagResourcesRequest(Builder builder) {
        super(builder);
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceId
     */
    public java.util.List < String > getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListTagResourcesRequest, Builder> {
        private java.util.List < String > resourceId; 
        private String resourceType; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListTagResourcesRequest request) {
            super(request);
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.tags = request.tags;
        } 

        /**
         * 查询的资源的 id 列表。resource id 与 tags 应至少存在一个。
         */
        public Builder resourceId(java.util.List < String > resourceId) {
            String resourceIdShrink = shrink(resourceId, "resourceId", "json");
            this.putQueryParameter("resourceId", resourceIdShrink);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * 资源类型。目前取值范围：project。
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * 精确查找时过滤的标签键值对。resource id 与 tags 应至少存在一个。
         */
        public Builder tags(java.util.List < Tags> tags) {
            String tagsShrink = shrink(tags, "tags", "json");
            this.putQueryParameter("tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public ListTagResourcesRequest build() {
            return new ListTagResourcesRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("key")
        @Validation(required = true)
        private String key;

        @NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * 精确过滤的标签的键。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 精确过滤的标签的值。
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
