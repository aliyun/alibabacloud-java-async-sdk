// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceShareRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceShareRequest</p>
 */
public class CreateResourceShareRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("AllowExternalTargets")
    private Boolean allowExternalTargets;

    @Query
    @NameInMap("PermissionNames")
    private java.util.List < String > permissionNames;

    @Query
    @NameInMap("ResourceShareName")
    @Validation(required = true)
    private String resourceShareName;

    @Query
    @NameInMap("Resources")
    private java.util.List < Resources> resources;

    @Query
    @NameInMap("Targets")
    private java.util.List < String > targets;

    private CreateResourceShareRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.allowExternalTargets = builder.allowExternalTargets;
        this.permissionNames = builder.permissionNames;
        this.resourceShareName = builder.resourceShareName;
        this.resources = builder.resources;
        this.targets = builder.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceShareRequest create() {
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
     * @return allowExternalTargets
     */
    public Boolean getAllowExternalTargets() {
        return this.allowExternalTargets;
    }

    /**
     * @return permissionNames
     */
    public java.util.List < String > getPermissionNames() {
        return this.permissionNames;
    }

    /**
     * @return resourceShareName
     */
    public String getResourceShareName() {
        return this.resourceShareName;
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

    public static final class Builder extends Request.Builder<CreateResourceShareRequest, Builder> {
        private String regionId; 
        private Boolean allowExternalTargets; 
        private java.util.List < String > permissionNames; 
        private String resourceShareName; 
        private java.util.List < Resources> resources; 
        private java.util.List < String > targets; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceShareRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.allowExternalTargets = request.allowExternalTargets;
            this.permissionNames = request.permissionNames;
            this.resourceShareName = request.resourceShareName;
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
         * The information of the resource share.
         */
        public Builder allowExternalTargets(Boolean allowExternalTargets) {
            this.putQueryParameter("AllowExternalTargets", allowExternalTargets);
            this.allowExternalTargets = allowExternalTargets;
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
         * >  `Resources.N.ResourceId` and `Resources.N.ResourceType` must be used in pairs.
         */
        public Builder resourceShareName(String resourceShareName) {
            this.putQueryParameter("ResourceShareName", resourceShareName);
            this.resourceShareName = resourceShareName;
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
        public CreateResourceShareRequest build() {
            return new CreateResourceShareRequest(this);
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
             * The ID of a principal. Valid values:
             * <p>
             * 
             * *   If you set `AllowExternalTargets` to `false`, set this parameter to the ID of a resource directory, ID of a folder in a resource directory, or ID of a member in a resource directory.
             * *   If you set `AllowExternalTargets` to `true`, set this parameter to the ID of an independent Alibaba Cloud account, ID of a resource directory, ID of a folder in a resource directory, or ID of a member in a resource directory.
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
