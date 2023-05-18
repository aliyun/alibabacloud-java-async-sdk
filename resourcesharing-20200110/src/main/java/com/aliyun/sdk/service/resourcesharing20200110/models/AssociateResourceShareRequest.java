// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateResourceShareRequest} extends {@link RequestModel}
 *
 * <p>AssociateResourceShareRequest</p>
 */
public class AssociateResourceShareRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("PermissionNames")
    private java.util.List < String > permissionNames;

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

    private AssociateResourceShareRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.permissionNames = builder.permissionNames;
        this.resourceShareId = builder.resourceShareId;
        this.resources = builder.resources;
        this.targets = builder.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateResourceShareRequest create() {
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
     * @return permissionNames
     */
    public java.util.List < String > getPermissionNames() {
        return this.permissionNames;
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

    public static final class Builder extends Request.Builder<AssociateResourceShareRequest, Builder> {
        private String regionId; 
        private java.util.List < String > permissionNames; 
        private String resourceShareId; 
        private java.util.List < Resources> resources; 
        private java.util.List < String > targets; 

        private Builder() {
            super();
        } 

        private Builder(AssociateResourceShareRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.permissionNames = request.permissionNames;
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
         * PermissionNames.
         */
        public Builder permissionNames(java.util.List < String > permissionNames) {
            this.putQueryParameter("PermissionNames", permissionNames);
            this.permissionNames = permissionNames;
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
        public AssociateResourceShareRequest build() {
            return new AssociateResourceShareRequest(this);
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
             * The name of a permission. If you do not configure this parameter, the system automatically associates the default permission for the specified resource type with the resource share. For more information, see [Permission library](~~465474~~).
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The ID of a principal.
             * <p>
             * 
             * *   If the value of `AllowExternalTargets` for the resource share is `false` in the response of the ListResourceShares operation, the resource share supports only resource sharing within a resource directory. In this case, you can set this parameter to the ID of the resource directory, ID of a folder in the resource directory, or ID of a member in the resource directory.
             * *   If the value of `AllowExternalTargets` for the resource share is `true` in the response of the ListResourceShares operation, the resource share supports both resource sharing within a resource directory and resource sharing outside a resource directory. In this case, you can set this parameter to the ID of an independent Alibaba Cloud account, ID of the resource directory, ID of a folder in the resource directory, or ID of a member in the resource directory.
             * 
             * For more information, see [Resource sharing modes](~~160622~~), [View the ID of a resource directory](~~111217~~), [View the ID of a folder](~~111223~~), or [View the ID of a member](~~111624~~).
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
