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
 * {@link CreateRbacRoleRequest} extends {@link RequestModel}
 *
 * <p>CreateRbacRoleRequest</p>
 */
public class CreateRbacRoleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleData")
    private String roleData;

    private CreateRbacRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.roleData = builder.roleData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRbacRoleRequest create() {
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

    public static final class Builder extends Request.Builder<CreateRbacRoleRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String roleData; 

        private Builder() {
            super();
        } 

        private Builder(CreateRbacRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.roleData = request.roleData;
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

        @Override
        public CreateRbacRoleRequest build() {
            return new CreateRbacRoleRequest(this);
        } 

    } 

}
