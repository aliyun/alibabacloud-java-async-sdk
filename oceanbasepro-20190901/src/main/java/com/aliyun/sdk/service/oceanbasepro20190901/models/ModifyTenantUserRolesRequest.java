// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantUserRolesRequest} extends {@link RequestModel}
 *
 * <p>ModifyTenantUserRolesRequest</p>
 */
public class ModifyTenantUserRolesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("ModifyType")
    private String modifyType;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    @Body
    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    @Body
    @NameInMap("UserRole")
    @Validation(required = true)
    private String userRole;

    private ModifyTenantUserRolesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.modifyType = builder.modifyType;
        this.tenantId = builder.tenantId;
        this.userName = builder.userName;
        this.userRole = builder.userRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTenantUserRolesRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return userRole
     */
    public String getUserRole() {
        return this.userRole;
    }

    public static final class Builder extends Request.Builder<ModifyTenantUserRolesRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String modifyType; 
        private String tenantId; 
        private String userName; 
        private String userRole; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTenantUserRolesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.modifyType = request.modifyType;
            this.tenantId = request.tenantId;
            this.userName = request.userName;
            this.userRole = request.userRole;
        } 

        /**
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the OceanBase cluster.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The type of the privilege modification operation.   
         * <p>
         * Valid values:  
         * update: updates all privileges. This is the default value.  
         * add: adds a privilege.  
         * delete: deletes a privilege.
         */
        public Builder modifyType(String modifyType) {
            this.putBodyParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * The ID of the tenant.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * The name of the database account.   
         * <p>
         * You cannot use reserved keywords, such as SYS and root.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * The role of the database account.
         */
        public Builder userRole(String userRole) {
            this.putBodyParameter("UserRole", userRole);
            this.userRole = userRole;
            return this;
        }

        @Override
        public ModifyTenantUserRolesRequest build() {
            return new ModifyTenantUserRolesRequest(this);
        } 

    } 

}
