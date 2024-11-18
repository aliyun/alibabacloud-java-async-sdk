// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPermissionRequest} extends {@link RequestModel}
 *
 * <p>GetPermissionRequest</p>
 */
public class GetPermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermissionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String permissionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermissionVersion")
    private String permissionVersion;

    private GetPermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.permissionName = builder.permissionName;
        this.permissionVersion = builder.permissionVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPermissionRequest create() {
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
     * @return permissionVersion
     */
    public String getPermissionVersion() {
        return this.permissionVersion;
    }

    public static final class Builder extends Request.Builder<GetPermissionRequest, Builder> {
        private String regionId; 
        private String permissionName; 
        private String permissionVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetPermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.permissionName = request.permissionName;
            this.permissionVersion = request.permissionVersion;
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
         * <p>The version of the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder permissionVersion(String permissionVersion) {
            this.putQueryParameter("PermissionVersion", permissionVersion);
            this.permissionVersion = permissionVersion;
            return this;
        }

        @Override
        public GetPermissionRequest build() {
            return new GetPermissionRequest(this);
        } 

    } 

}
