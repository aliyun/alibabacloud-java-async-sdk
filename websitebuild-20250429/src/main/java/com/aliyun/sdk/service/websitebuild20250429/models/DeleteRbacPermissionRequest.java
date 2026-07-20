// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link DeleteRbacPermissionRequest} extends {@link RequestModel}
 *
 * <p>DeleteRbacPermissionRequest</p>
 */
public class DeleteRbacPermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermissionId")
    private String permissionId;

    private DeleteRbacPermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.permissionId = builder.permissionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRbacPermissionRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return permissionId
     */
    public String getPermissionId() {
        return this.permissionId;
    }

    public static final class Builder extends Request.Builder<DeleteRbacPermissionRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String permissionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRbacPermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.permissionId = request.permissionId;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * PermissionId.
         */
        public Builder permissionId(String permissionId) {
            this.putQueryParameter("PermissionId", permissionId);
            this.permissionId = permissionId;
            return this;
        }

        @Override
        public DeleteRbacPermissionRequest build() {
            return new DeleteRbacPermissionRequest(this);
        } 

    } 

}
