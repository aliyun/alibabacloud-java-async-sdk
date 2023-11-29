// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link TagResourcesRequest} extends {@link RequestModel}
 *
 * <p>TagResourcesRequest</p>
 */
public class TagResourcesRequest extends Request {
    @Body
    @NameInMap("resourceId")
    @Validation(required = true)
    private java.util.List < String > resourceId;

    @Body
    @NameInMap("resourceType")
    @Validation(required = true)
    private String resourceType;

    @Body
    @NameInMap("tags")
    @Validation(required = true)
    private java.util.List < Tags> tags;

    private TagResourcesRequest(Builder builder) {
        super(builder);
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagResourcesRequest create() {
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

    public static final class Builder extends Request.Builder<TagResourcesRequest, Builder> {
        private java.util.List < String > resourceId; 
        private String resourceType; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(TagResourcesRequest request) {
            super(request);
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.tags = request.tags;
        } 

        /**
         * The resource IDs. You can specify only one resource and add tags to the resource.
         */
        public Builder resourceId(java.util.List < String > resourceId) {
            this.putBodyParameter("resourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The type of the resource. Set the value to project.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The tags that you want to add to the resource. Up to 20 tags are supported at a time. Each tag is a key-value pair.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public TagResourcesRequest build() {
            return new TagResourcesRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("key")
        @Validation(required = true)
        private String key;

        @NameInMap("value")
        @Validation(required = true)
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
             * The key of the tag. The key must meet the following requirements:
             * <p>
             * 
             * *   The key must be `1 to 128` characters in length.
             * *   The key cannot contain `"http://"` or `"https://"`.
             * *   The key cannot start with `"acs:"` or `"aliyun"`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag. The value must meet the following requirements:
             * <p>
             * 
             * *   The value must be `1 to 128` characters in length.
             * *   The value cannot contain `"http://"` or `"https://"`.
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
