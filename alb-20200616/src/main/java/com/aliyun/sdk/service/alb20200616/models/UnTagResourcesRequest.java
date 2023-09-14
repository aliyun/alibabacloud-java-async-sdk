// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnTagResourcesRequest} extends {@link RequestModel}
 *
 * <p>UnTagResourcesRequest</p>
 */
public class UnTagResourcesRequest extends Request {
    @Query
    @NameInMap("All")
    private Boolean all;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private java.util.List < String > resourceId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TagKey")
    private java.util.List < String > tagKey;

    private UnTagResourcesRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.tag = builder.tag;
        this.tagKey = builder.tagKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnTagResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return all
     */
    public Boolean getAll() {
        return this.all;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return tagKey
     */
    public java.util.List < String > getTagKey() {
        return this.tagKey;
    }

    public static final class Builder extends Request.Builder<UnTagResourcesRequest, Builder> {
        private Boolean all; 
        private java.util.List < String > resourceId; 
        private String resourceType; 
        private java.util.List < Tag> tag; 
        private java.util.List < String > tagKey; 

        private Builder() {
            super();
        } 

        private Builder(UnTagResourcesRequest request) {
            super(request);
            this.all = request.all;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.tag = request.tag;
            this.tagKey = request.tagKey;
        } 

        /**
         * Specifies whether to remove all tags from the specified resource. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * The IDs of the resources from which you want to remove tags.
         */
        public Builder resourceId(java.util.List < String > resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The type of the resource. Valid values:
         * <p>
         * 
         * *   **acl**: an access control list (ACL)
         * *   **loadbalancer**: an Application Load Balancer (ALB) instance
         * *   **securitypolicy**: a security policy
         * *   **servergroup**: a server group
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The tags that you want to remove.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The keys of the tags that you want to remove.
         */
        public Builder tagKey(java.util.List < String > tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        @Override
        public UnTagResourcesRequest build() {
            return new UnTagResourcesRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * The key of the tag that you want to remove. The key can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. The key cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag that you want to remove. The value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. The value cannot contain `http://` or `https://`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
