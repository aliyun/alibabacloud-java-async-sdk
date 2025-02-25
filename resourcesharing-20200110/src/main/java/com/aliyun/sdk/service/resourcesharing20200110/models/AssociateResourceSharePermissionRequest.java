// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AssociateResourceSharePermissionRequest} extends {@link RequestModel}
 *
 * <p>AssociateResourceSharePermissionRequest</p>
 */
public class AssociateResourceSharePermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermissionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String permissionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Replace")
    private Boolean replace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceShareId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the permission.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunRSDefaultPermissionVSwitch</p>
         */
        public Builder permissionName(String permissionName) {
            this.putQueryParameter("PermissionName", permissionName);
            this.permissionName = permissionName;
            return this;
        }

        /**
         * <p>Specifies whether to use the specified permission to replace an existing permission. Valid values:</p>
         * <ul>
         * <li>false: does not use the specified permission to replace an existing permission. This is the default value. If you set the value to false for a resource share that does not have associated permissions, the system associates the specified permission with the resource share. In a resource share, one resource type can have only one permission. If you set the value to false for a resource share that already has a permission for the resource type indicated by the specified permission, the system reports an error. This prevents you from replacing the existing permission by mistake.</li>
         * <li>true: uses the specified permission to replace an existing permission of the same resource type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder replace(Boolean replace) {
            this.putQueryParameter("Replace", replace);
            this.replace = replace;
            return this;
        }

        /**
         * <p>The ID of the resource share.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rs-6GRmdD3X****</p>
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
