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
 * {@link DeleteRbacRoleRequest} extends {@link RequestModel}
 *
 * <p>DeleteRbacRoleRequest</p>
 */
public class DeleteRbacRoleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleId")
    private String roleId;

    private DeleteRbacRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.roleId = builder.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRbacRoleRequest create() {
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
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    public static final class Builder extends Request.Builder<DeleteRbacRoleRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String roleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRbacRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.roleId = request.roleId;
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
         * RoleId.
         */
        public Builder roleId(String roleId) {
            this.putQueryParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        @Override
        public DeleteRbacRoleRequest build() {
            return new DeleteRbacRoleRequest(this);
        } 

    } 

}
