// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link AddEncryptionDBRolePrivilegeRequest} extends {@link RequestModel}
 *
 * <p>AddEncryptionDBRolePrivilegeRequest</p>
 */
public class AddEncryptionDBRolePrivilegeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RolePrivilegeConfig")
    private String rolePrivilegeConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RolePrivilegeName")
    private String rolePrivilegeName;

    private AddEncryptionDBRolePrivilegeRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.rolePrivilegeConfig = builder.rolePrivilegeConfig;
        this.rolePrivilegeName = builder.rolePrivilegeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddEncryptionDBRolePrivilegeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return rolePrivilegeConfig
     */
    public String getRolePrivilegeConfig() {
        return this.rolePrivilegeConfig;
    }

    /**
     * @return rolePrivilegeName
     */
    public String getRolePrivilegeName() {
        return this.rolePrivilegeName;
    }

    public static final class Builder extends Request.Builder<AddEncryptionDBRolePrivilegeRequest, Builder> {
        private String DBClusterId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String rolePrivilegeConfig; 
        private String rolePrivilegeName; 

        private Builder() {
            super();
        } 

        private Builder(AddEncryptionDBRolePrivilegeRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.rolePrivilegeConfig = request.rolePrivilegeConfig;
            this.rolePrivilegeName = request.rolePrivilegeName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-******************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * RolePrivilegeConfig.
         */
        public Builder rolePrivilegeConfig(String rolePrivilegeConfig) {
            this.putQueryParameter("RolePrivilegeConfig", rolePrivilegeConfig);
            this.rolePrivilegeConfig = rolePrivilegeConfig;
            return this;
        }

        /**
         * RolePrivilegeName.
         */
        public Builder rolePrivilegeName(String rolePrivilegeName) {
            this.putQueryParameter("RolePrivilegeName", rolePrivilegeName);
            this.rolePrivilegeName = rolePrivilegeName;
            return this;
        }

        @Override
        public AddEncryptionDBRolePrivilegeRequest build() {
            return new AddEncryptionDBRolePrivilegeRequest(this);
        } 

    } 

}
