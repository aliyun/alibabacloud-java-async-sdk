// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link TransferResourcesOutofGroupRequest} extends {@link RequestModel}
 *
 * <p>TransferResourcesOutofGroupRequest</p>
 */
public class TransferResourcesOutofGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetResourceGroupId")
    private String targetResourceGroupId;

    private TransferResourcesOutofGroupRequest(Builder builder) {
        super(builder);
        this.businessChannel = builder.businessChannel;
        this.platform = builder.platform;
        this.resourceGroupId = builder.resourceGroupId;
        this.resources = builder.resources;
        this.targetResourceGroupId = builder.targetResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferResourcesOutofGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resources
     */
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    /**
     * @return targetResourceGroupId
     */
    public String getTargetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    public static final class Builder extends Request.Builder<TransferResourcesOutofGroupRequest, Builder> {
        private String businessChannel; 
        private String platform; 
        private String resourceGroupId; 
        private java.util.List<Resources> resources; 
        private String targetResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(TransferResourcesOutofGroupRequest request) {
            super(request);
            this.businessChannel = request.businessChannel;
            this.platform = request.platform;
            this.resourceGroupId = request.resourceGroupId;
            this.resources = request.resources;
            this.targetResourceGroupId = request.targetResourceGroupId;
        } 

        /**
         * BusinessChannel.
         */
        public Builder businessChannel(String businessChannel) {
            this.putQueryParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Resources.
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * TargetResourceGroupId.
         */
        public Builder targetResourceGroupId(String targetResourceGroupId) {
            this.putQueryParameter("TargetResourceGroupId", targetResourceGroupId);
            this.targetResourceGroupId = targetResourceGroupId;
            return this;
        }

        @Override
        public TransferResourcesOutofGroupRequest build() {
            return new TransferResourcesOutofGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link TransferResourcesOutofGroupRequest} extends {@link TeaModel}
     *
     * <p>TransferResourcesOutofGroupRequest</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private Resources(Builder builder) {
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
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
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String regionId; 
            private String resourceId; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.regionId = model.regionId;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
            } 

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
