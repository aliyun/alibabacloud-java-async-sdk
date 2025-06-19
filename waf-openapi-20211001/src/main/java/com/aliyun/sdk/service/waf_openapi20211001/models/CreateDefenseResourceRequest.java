// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link CreateDefenseResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateDefenseResourceRequest</p>
 */
public class CreateDefenseResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomHeaders")
    private java.util.List<String> customHeaders;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Detail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String detail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerUserId")
    private String ownerUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pattern")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    @com.aliyun.core.annotation.Validation(required = true)
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resource")
    private String resource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroup")
    private String resourceGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOrigin")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceOrigin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XffStatus")
    private Integer xffStatus;

    private CreateDefenseResourceRequest(Builder builder) {
        super(builder);
        this.customHeaders = builder.customHeaders;
        this.description = builder.description;
        this.detail = builder.detail;
        this.instanceId = builder.instanceId;
        this.ownerUserId = builder.ownerUserId;
        this.pattern = builder.pattern;
        this.product = builder.product;
        this.regionId = builder.regionId;
        this.resource = builder.resource;
        this.resourceGroup = builder.resourceGroup;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.resourceOrigin = builder.resourceOrigin;
        this.tag = builder.tag;
        this.xffStatus = builder.xffStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDefenseResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customHeaders
     */
    public java.util.List<String> getCustomHeaders() {
        return this.customHeaders;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ownerUserId
     */
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    /**
     * @return pattern
     */
    public String getPattern() {
        return this.pattern;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return resourceGroup
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return resourceOrigin
     */
    public String getResourceOrigin() {
        return this.resourceOrigin;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return xffStatus
     */
    public Integer getXffStatus() {
        return this.xffStatus;
    }

    public static final class Builder extends Request.Builder<CreateDefenseResourceRequest, Builder> {
        private java.util.List<String> customHeaders; 
        private String description; 
        private String detail; 
        private String instanceId; 
        private String ownerUserId; 
        private String pattern; 
        private String product; 
        private String regionId; 
        private String resource; 
        private String resourceGroup; 
        private String resourceManagerResourceGroupId; 
        private String resourceOrigin; 
        private java.util.List<Tag> tag; 
        private Integer xffStatus; 

        private Builder() {
            super();
        } 

        private Builder(CreateDefenseResourceRequest request) {
            super(request);
            this.customHeaders = request.customHeaders;
            this.description = request.description;
            this.detail = request.detail;
            this.instanceId = request.instanceId;
            this.ownerUserId = request.ownerUserId;
            this.pattern = request.pattern;
            this.product = request.product;
            this.regionId = request.regionId;
            this.resource = request.resource;
            this.resourceGroup = request.resourceGroup;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.resourceOrigin = request.resourceOrigin;
            this.tag = request.tag;
            this.xffStatus = request.xffStatus;
        } 

        /**
         * CustomHeaders.
         */
        public Builder customHeaders(java.util.List<String> customHeaders) {
            String customHeadersShrink = shrink(customHeaders, "CustomHeaders", "json");
            this.putQueryParameter("CustomHeaders", customHeadersShrink);
            this.customHeaders = customHeaders;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;domain&quot;: &quot;zhhclb4test096-05111.test.com&quot;}</p>
         */
        public Builder detail(String detail) {
            this.putQueryParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v3prepaid_public_cn-4xl*******</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OwnerUserId.
         */
        public Builder ownerUserId(String ownerUserId) {
            this.putQueryParameter("OwnerUserId", ownerUserId);
            this.ownerUserId = ownerUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        public Builder pattern(String pattern) {
            this.putQueryParameter("Pattern", pattern);
            this.pattern = pattern;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Resource.
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * ResourceGroup.
         */
        public Builder resourceGroup(String resourceGroup) {
            this.putQueryParameter("ResourceGroup", resourceGroup);
            this.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * ResourceManagerResourceGroupId.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder resourceOrigin(String resourceOrigin) {
            this.putQueryParameter("ResourceOrigin", resourceOrigin);
            this.resourceOrigin = resourceOrigin;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * XffStatus.
         */
        public Builder xffStatus(Integer xffStatus) {
            this.putQueryParameter("XffStatus", xffStatus);
            this.xffStatus = xffStatus;
            return this;
        }

        @Override
        public CreateDefenseResourceRequest build() {
            return new CreateDefenseResourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDefenseResourceRequest} extends {@link TeaModel}
     *
     * <p>CreateDefenseResourceRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
