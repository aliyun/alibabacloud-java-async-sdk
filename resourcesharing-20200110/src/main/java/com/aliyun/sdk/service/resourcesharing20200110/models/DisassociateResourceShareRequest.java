// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisassociateResourceShareRequest} extends {@link RequestModel}
 *
 * <p>DisassociateResourceShareRequest</p>
 */
public class DisassociateResourceShareRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwner")
    private String resourceOwner;

    @Query
    @NameInMap("ResourceShareId")
    @Validation(required = true)
    private String resourceShareId;

    @Query
    @NameInMap("Resources")
    private java.util.List < Resources> resources;

    @Query
    @NameInMap("Targets")
    private java.util.List < String > targets;

    private DisassociateResourceShareRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceOwner = builder.resourceOwner;
        this.resourceShareId = builder.resourceShareId;
        this.resources = builder.resources;
        this.targets = builder.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisassociateResourceShareRequest create() {
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
     * @return resourceOwner
     */
    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * @return resourceShareId
     */
    public String getResourceShareId() {
        return this.resourceShareId;
    }

    /**
     * @return resources
     */
    public java.util.List < Resources> getResources() {
        return this.resources;
    }

    /**
     * @return targets
     */
    public java.util.List < String > getTargets() {
        return this.targets;
    }

    public static final class Builder extends Request.Builder<DisassociateResourceShareRequest, Builder> {
        private String regionId; 
        private String resourceOwner; 
        private String resourceShareId; 
        private java.util.List < Resources> resources; 
        private java.util.List < String > targets; 

        private Builder() {
            super();
        } 

        private Builder(DisassociateResourceShareRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceOwner = request.resourceOwner;
            this.resourceShareId = request.resourceShareId;
            this.resources = request.resources;
            this.targets = request.targets;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The information of the entities that are associated with the resource share.
         */
        public Builder resourceOwner(String resourceOwner) {
            this.putQueryParameter("ResourceOwner", resourceOwner);
            this.resourceOwner = resourceOwner;
            return this;
        }

        /**
         * The ID of a shared resource.
         * <p>
         * 
         * Valid values of N: 1 to 5. This indicates that a maximum of five shared resources can be specified at a time.
         * 
         * >  Resources.N.ResourceId and Resources.N.ResourceType must be used in pairs.
         */
        public Builder resourceShareId(String resourceShareId) {
            this.putQueryParameter("ResourceShareId", resourceShareId);
            this.resourceShareId = resourceShareId;
            return this;
        }

        /**
         * Resources.
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * Targets.
         */
        public Builder targets(java.util.List < String > targets) {
            this.putQueryParameter("Targets", targets);
            this.targets = targets;
            return this;
        }

        @Override
        public DisassociateResourceShareRequest build() {
            return new DisassociateResourceShareRequest(this);
        } 

    } 

    public static class Resources extends TeaModel {
        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        private Resources(Builder builder) {
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
            private String resourceId; 
            private String resourceType; 

            /**
             * The owner of the resource share. Valid values:
             * <p>
             * 
             * *   Self: The resource share belongs to the current account. This is the default value. If you are the management account or a member of a resource directory and you want to remove resources or principals from a resource share, set this parameter to Self.
             * *   OtherAccounts: The resource share belongs to another account. If you are not the management account or a member of a resource directory and you want to exit a resource share, set this parameter to OtherAccounts.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The ID of a principal.
             * <p>
             * 
             * Valid values of N: 1 to 5. This indicates that a maximum of five principals can be specified at a time.
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
