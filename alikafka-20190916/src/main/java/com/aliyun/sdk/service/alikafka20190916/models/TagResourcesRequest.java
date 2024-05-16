// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagResourcesRequest} extends {@link RequestModel}
 *
 * <p>TagResourcesRequest</p>
 */
public class TagResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Tag> tag;

    private TagResourcesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.tag = builder.tag;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<TagResourcesRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private java.util.List < String > resourceId; 
        private String resourceType; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(TagResourcesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.tag = request.tag;
        } 

        /**
         * The ID of the Message Queue for Apache RocketMQ instance which contains the resource to which you want to attach tags.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the region in which the resource is deployed.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The list of resource IDs.
         */
        public Builder resourceId(java.util.List < String > resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The type of the resources. The value is an enumerated value. Valid values:
         * <p>
         * 
         * *   **INSTANCE**
         * *   **TOPIC**
         * *   **CONSUMERGROUP**
         * 
         * >  The value of this parameter is not case-sensitive.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The tags that you want to add.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public TagResourcesRequest build() {
            return new TagResourcesRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * The tag key.
             * <p>
             * 
             * *   You must specify this parameter.
             * *   The tag key must be 1 to 128 characters in length and cannot start with `acs:` or `aliyun`. The tag key cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             * <p>
             * 
             * *   You can leave this parameter empty.
             * *   The tag value must be 1 to 128 characters in length and cannot start with acs: or aliyun. The tag key cannot contain http:// or https://.
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
