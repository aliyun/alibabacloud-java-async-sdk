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
         * The IDs of the resources for which you want to query tags. You must specify at least one of resourceId and tags.
         */
        public Builder resourceId(java.util.List < String > resourceId) {
            String resourceIdShrink = shrink(resourceId, "resourceId", "json");
            this.putQueryParameter("resourceId", resourceIdShrink);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The type of the resource. Set the value to project.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The tags that you want to use to filter resources based on exact match. Each tag is a key-value pair. You must specify at least one of resourceId and tags.
         * <p>
         * 
         * You can enter up to 20 tags.
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
             * The key of the tag that you want to use to filter resources. For example, if you set the key to `"test-key"`, only resources to which the key is added are returned.``
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag that you want to use to filter resources. If you set the value to null, resources are filtered based only on the key of the tag.
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
