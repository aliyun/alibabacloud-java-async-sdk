// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link UnbindConfigGroupRequest} extends {@link RequestModel}
 *
 * <p>UnbindConfigGroupRequest</p>
 */
public class UnbindConfigGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceInfos")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ResourceInfos> resourceInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private UnbindConfigGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceInfos = builder.resourceInfos;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindConfigGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceInfos
     */
    public java.util.List<ResourceInfos> getResourceInfos() {
        return this.resourceInfos;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UnbindConfigGroupRequest, Builder> {
        private String regionId; 
        private java.util.List<ResourceInfos> resourceInfos; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UnbindConfigGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceInfos = request.resourceInfos;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the region. Set the value to <code>cn-shanghai</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resources from which you want to unbind the configuration group.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resourceInfos(java.util.List<ResourceInfos> resourceInfos) {
            this.putQueryParameter("ResourceInfos", resourceInfos);
            this.resourceInfos = resourceInfos;
            return this;
        }

        /**
         * <p>The type of the configuration group.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>Timer: the scheduled task type.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Timer</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UnbindConfigGroupRequest build() {
            return new UnbindConfigGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link UnbindConfigGroupRequest} extends {@link TeaModel}
     *
     * <p>UnbindConfigGroupRequest</p>
     */
    public static class ResourceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
        private String resourceRegionId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private ResourceInfos(Builder builder) {
            this.productType = builder.productType;
            this.resourceId = builder.resourceId;
            this.resourceRegionId = builder.resourceRegionId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceInfos create() {
            return builder().build();
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceRegionId
         */
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String productType; 
            private String resourceId; 
            private String resourceRegionId; 
            private String resourceType; 

            /**
             * <p>The service type of the resource.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>CLOUD_DESKTOP: the cloud computer service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CLOUD_DESKTOP</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-ctwj0bk3l5nz****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The region ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chengdu</p>
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>RESOURCE_GROUP: the resource group.</li>
             * <li>CLOUD_DESKTOP: the cloud computer service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CLOUD_DESKTOP</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceInfos build() {
                return new ResourceInfos(this);
            } 

        } 

    }
}
