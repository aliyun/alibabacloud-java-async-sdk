// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateResourceSharePermissionRequest} extends {@link RequestModel}
 *
 * <p>AssociateResourceSharePermissionRequest</p>
 */
public class AssociateResourceSharePermissionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("PermissionName")
    @Validation(required = true)
    private String permissionName;

    @Query
    @NameInMap("Replace")
    private Boolean replace;

    @Query
    @NameInMap("ResourceShareId")
    @Validation(required = true)
    private String resourceShareId;

    private AssociateResourceSharePermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.permissionName = builder.permissionName;
        this.replace = builder.replace;
        this.resourceShareId = builder.resourceShareId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateResourceSharePermissionRequest create() {
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
     * @return permissionName
     */
    public String getPermissionName() {
        return this.permissionName;
    }

    /**
     * @return replace
     */
    public Boolean getReplace() {
        return this.replace;
    }

    /**
     * @return resourceShareId
     */
    public String getResourceShareId() {
        return this.resourceShareId;
    }

    public static final class Builder extends Request.Builder<AssociateResourceSharePermissionRequest, Builder> {
        private String regionId; 
        private String permissionName; 
        private Boolean replace; 
        private String resourceShareId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateResourceSharePermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.permissionName = request.permissionName;
            this.replace = request.replace;
            this.resourceShareId = request.resourceShareId;
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
         * PermissionName.
         */
        public Builder permissionName(String permissionName) {
            this.putQueryParameter("PermissionName", permissionName);
            this.permissionName = permissionName;
            return this;
        }

        /**
         * Replace.
         */
        public Builder replace(Boolean replace) {
            this.putQueryParameter("Replace", replace);
            this.replace = replace;
            return this;
        }

        /**
         * ResourceShareId.
         */
        public Builder resourceShareId(String resourceShareId) {
            this.putQueryParameter("ResourceShareId", resourceShareId);
            this.resourceShareId = resourceShareId;
            return this;
        }

        @Override
        public AssociateResourceSharePermissionRequest build() {
            return new AssociateResourceSharePermissionRequest(this);
        } 

    } 

}
