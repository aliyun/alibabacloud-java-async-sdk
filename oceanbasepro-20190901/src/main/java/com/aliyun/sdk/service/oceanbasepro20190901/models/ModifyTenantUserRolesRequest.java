// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link ModifyTenantUserRolesRequest} extends {@link RequestModel}
 *
 * <p>ModifyTenantUserRolesRequest</p>
 */
public class ModifyTenantUserRolesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GlobalPermissions")
    private String globalPermissions;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserType")
    private String userType;

    private ModifyTenantUserRolesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.globalPermissions = builder.globalPermissions;
        this.instanceId = builder.instanceId;
        this.modifyType = builder.modifyType;
        this.tenantId = builder.tenantId;
        this.userName = builder.userName;
        this.userRole = builder.userRole;
        this.userType = builder.userType;
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
     * @return globalPermissions
     */
    public String getGlobalPermissions() {
        return this.globalPermissions;
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

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<ModifyTenantUserRolesRequest, Builder> {
        private String regionId; 
        private String globalPermissions; 
        private String instanceId; 
        private String modifyType; 
        private String tenantId; 
        private String userName; 
        private String userRole; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTenantUserRolesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.globalPermissions = request.globalPermissions;
            this.instanceId = request.instanceId;
            this.modifyType = request.modifyType;
            this.tenantId = request.tenantId;
            this.userName = request.userName;
            this.userRole = request.userRole;
            this.userType = request.userType;
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
         * GlobalPermissions.
         */
        public Builder globalPermissions(String globalPermissions) {
            this.putBodyParameter("GlobalPermissions", globalPermissions);
            this.globalPermissions = globalPermissions;
            return this;
        }

        /**
         * <p>The type of the privilege modification operation.<br>Valid values:<br>update: updates all privileges. This is the default value.<br>add: adds a privilege.<br>delete: deletes a privilege.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>update</p>
         */
        public Builder modifyType(String modifyType) {
            this.putBodyParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * <p>The operation that you want to perform.<br>Set the value to <strong>ModifyTenantUserRoles</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ob2mr3oae0****</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The role of the database account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pay_test</p>
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>The type of the account. Valid values:   </p>
         * <ul>
         * <li>Admin: the super administrator account.   </li>
         * <li>Normal: a general account.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Database&quot;:&quot;20210824160559&quot;,&quot;Role&quot;:&quot;readwrite&quot;}]</p>
         */
        public Builder userRole(String userRole) {
            this.putBodyParameter("UserRole", userRole);
            this.userRole = userRole;
            return this;
        }

        /**
         * UserType.
         */
        public Builder userType(String userType) {
            this.putBodyParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public ModifyTenantUserRolesRequest build() {
            return new ModifyTenantUserRolesRequest(this);
        } 

    } 

}
