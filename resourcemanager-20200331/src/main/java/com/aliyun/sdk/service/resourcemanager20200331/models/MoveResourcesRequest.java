// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveResourcesRequest} extends {@link RequestModel}
 *
 * <p>MoveResourcesRequest</p>
 */
public class MoveResourcesRequest extends Request {
    @Query
    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    private String resourceGroupId;

    @Query
    @NameInMap("Resources")
    @Validation(required = true)
    private java.util.List < Resources> resources;

    private MoveResourcesRequest(Builder builder) {
        super(builder);
        this.resourceGroupId = builder.resourceGroupId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List < Resources> getResources() {
        return this.resources;
    }

    public static final class Builder extends Request.Builder<MoveResourcesRequest, Builder> {
        private String resourceGroupId; 
        private java.util.List < Resources> resources; 

        private Builder() {
            super();
        } 

        private Builder(MoveResourcesRequest request) {
            super(request);
            this.resourceGroupId = request.resourceGroupId;
            this.resources = request.resources;
        } 

        /**
         * The ID of the resource group to which you want to move the resources.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The resources that you want to move.
         * <p>
         * 
         * >  You can move a maximum of 10 resources at a time. If you want to move more than 10 resources, move them in batches.
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        @Override
        public MoveResourcesRequest build() {
            return new MoveResourcesRequest(this);
        } 

    } 

    public static class Resources extends TeaModel {
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Service")
        private String service;

        private Resources(Builder builder) {
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.service = builder.service;
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

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        public static final class Builder {
            private String regionId; 
            private String resourceId; 
            private String resourceType; 
            private String service; 

            /**
             * The region ID of the resource.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of the resource.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud service to which the resource belongs.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
