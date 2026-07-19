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
 * {@link UpdateRbacRoleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRbacRoleRequest</p>
 */
public class UpdateRbacRoleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleData")
    private String roleData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleId")
    private String roleId;

    private UpdateRbacRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.roleData = builder.roleData;
        this.roleId = builder.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRbacRoleRequest create() {
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
     * @return roleData
     */
    public String getRoleData() {
        return this.roleData;
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    public static final class Builder extends Request.Builder<UpdateRbacRoleRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String roleData; 
        private String roleId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRbacRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.roleData = request.roleData;
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
         * RoleData.
         */
        public Builder roleData(String roleData) {
            this.putQueryParameter("RoleData", roleData);
            this.roleData = roleData;
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
        public UpdateRbacRoleRequest build() {
            return new UpdateRbacRoleRequest(this);
        } 

    } 

}
