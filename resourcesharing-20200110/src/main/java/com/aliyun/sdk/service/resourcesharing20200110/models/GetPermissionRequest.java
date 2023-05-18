// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPermissionRequest} extends {@link RequestModel}
 *
 * <p>GetPermissionRequest</p>
 */
public class GetPermissionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("PermissionName")
    @Validation(required = true)
    private String permissionName;

    @Query
    @NameInMap("PermissionVersion")
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the permission.
         */
        public Builder permissionName(String permissionName) {
            this.putQueryParameter("PermissionName", permissionName);
            this.permissionName = permissionName;
            return this;
        }

        /**
         * The version of the permission.
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
