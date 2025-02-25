// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DisassociateResourceSharePermissionRequest} extends {@link RequestModel}
 *
 * <p>DisassociateResourceSharePermissionRequest</p>
 */
public class DisassociateResourceSharePermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermissionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String permissionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceShareId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceShareId;

    private DisassociateResourceSharePermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.permissionName = builder.permissionName;
        this.resourceShareId = builder.resourceShareId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisassociateResourceSharePermissionRequest create() {
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
     * @return resourceShareId
     */
    public String getResourceShareId() {
        return this.resourceShareId;
    }

    public static final class Builder extends Request.Builder<DisassociateResourceSharePermissionRequest, Builder> {
        private String regionId; 
        private String permissionName; 
        private String resourceShareId; 

        private Builder() {
            super();
        } 

        private Builder(DisassociateResourceSharePermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.permissionName = request.permissionName;
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
         * <p>The name of the permission. For more information, see <a href="https://help.aliyun.com/document_detail/465474.html">Permission library</a>.</p>
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
        public DisassociateResourceSharePermissionRequest build() {
            return new DisassociateResourceSharePermissionRequest(this);
        } 

    } 

}
