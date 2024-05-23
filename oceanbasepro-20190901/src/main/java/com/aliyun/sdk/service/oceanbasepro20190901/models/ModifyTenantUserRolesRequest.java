// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantUserRolesRequest} extends {@link RequestModel}
 *
 * <p>ModifyTenantUserRolesRequest</p>
 */
public class ModifyTenantUserRolesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    private String modifyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserRole")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the table.
         */
        public Builder modifyType(String modifyType) {
            this.putBodyParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * The operation that you want to perform.   
         * <p>
         * Set the value to **ModifyTenantUserRoles**.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * The role of the database account.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * The type of the account. Valid values:   
         * <p>
         * - Admin: the super administrator account.   
         * - Normal: a general account.
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
