// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link CreateAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateAccountRequest</p>
 */
public class CreateAccountRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountDescription")
    private String accountDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CharacterType")
    private String characterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

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
    @com.aliyun.core.annotation.NameInMap("Roles")
    private java.util.List<Roles> roles;

    private CreateAccountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accountDescription = builder.accountDescription;
        this.accountName = builder.accountName;
        this.accountPassword = builder.accountPassword;
        this.characterType = builder.characterType;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBName = builder.DBName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.roles = builder.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccountRequest create() {
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
     * @return accountDescription
     */
    public String getAccountDescription() {
        return this.accountDescription;
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return accountPassword
     */
    public String getAccountPassword() {
        return this.accountPassword;
    }

    /**
     * @return characterType
     */
    public String getCharacterType() {
        return this.characterType;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
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
     * @return roles
     */
    public java.util.List<Roles> getRoles() {
        return this.roles;
    }

    public static final class Builder extends Request.Builder<CreateAccountRequest, Builder> {
        private String regionId; 
        private String accountDescription; 
        private String accountName; 
        private String accountPassword; 
        private String characterType; 
        private String DBInstanceId; 
        private String DBName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Roles> roles; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accountDescription = request.accountDescription;
            this.accountName = request.accountName;
            this.accountPassword = request.accountPassword;
            this.characterType = request.characterType;
            this.DBInstanceId = request.DBInstanceId;
            this.DBName = request.DBName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.roles = request.roles;
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
         * <p>The account description.</p>
         * <ul>
         * <li>Regular expression: <code>^[a-zA-Z一-龥][a-zA-Z一-龥0-9_.-]{1,255}$</code>. The description must start with an English letter or Chinese character, followed by English letters, Chinese characters, digits, underscores (_), periods (.), or hyphens (-). The length must be 2 to 256 characters.</li>
         * <li>If the description is invalid, InvalidAccountDescription.Malformed is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder accountDescription(String accountDescription) {
            this.putQueryParameter("AccountDescription", accountDescription);
            this.accountDescription = accountDescription;
            return this;
        }

        /**
         * <p>The account name.</p>
         * <ul>
         * <li>Regular expression: <code>^[a-z]+[a-z0-9|_]*[a-z0-9]+$</code>. The name must start with a lowercase letter, end with a lowercase letter or digit, and can contain lowercase letters, digits, and underscores (_). The length must be 2 to 16 characters.</li>
         * <li>The reserved name <code>root</code> (case-insensitive, built-in system account) cannot be used.</li>
         * <li>The name cannot start with <code>__cloud</code> (reserved prefix for system accounts).</li>
         * <li>If the name is invalid, <code>InvalidAccountName.Malformed</code> is returned.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>admin1</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The account password.</p>
         * <ul>
         * <li>The length must be 8 to 32 characters. It can contain uppercase letters, lowercase letters, digits, and the following special characters: <code>!@#$%^&amp;*()_+-=</code>.</li>
         * <li>The password must contain at least <strong>three</strong> of the following four character types: uppercase letters, lowercase letters, digits, and special characters.</li>
         * <li>If the password is invalid, <code>InvalidAccountPassword.Malformed</code> is returned.</li>
         * </ul>
         * <blockquote>
         * <p>For information about how to handle special characters, see <a href="https://help.aliyun.com/document_detail/471568.html">How do I resolve the connection failure caused by special characters in the account name or password of a connection string?</a></p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test123456!</p>
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * <p>The account type.<br>Valid values:<br>- <code>normal</code>: replica set account. For a replica set instance, any value is processed as <code>normal</code>.<br>- <code>cs</code>: sharded cluster ConfigServer account.<br>- <code>db</code>: sharded cluster Shard direct connection account. For a sharded cluster instance, any value other than <code>cs</code> is processed as <code>db</code>.<br>Default value: <code>db</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>db</p>
         */
        public Builder characterType(String characterType) {
            this.putQueryParameter("CharacterType", characterType);
            this.characterType = characterType;
            return this;
        }

        /**
         * <p>The instance ID. For a sharded cluster instance, specify the sharded cluster ID. Account operations are executed from the perspective of the ConfigServer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-uf6e9433e955xxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The database to which the account belongs (authentication database).<br>
         * Default value: <code>admin</code>.<br>Rules: If this parameter is left empty, the request is allowed and the downstream system processes it as <code>admin</code>. If this parameter is specified, the length must be 1 to 63 characters. The value cannot contain <code>/</code>, <code>\\</code>, <code>.</code>, spaces, <code>&quot;</code>, or <code>$</code>, and cannot be <code>local</code>. Otherwise, <code>InvalidParameter</code> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
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
         * <p>The list of authorization roles for the account. <strong>Required for replica set and ConfigServer (cs) accounts</strong>. <strong>Prohibited for sharded cluster Shard direct connection (db) accounts</strong>.</p>
         * <ul>
         * <li><strong>Globally prohibited</strong> (returns <code>InvalidRoles.NotAllowed</code>): <code>root</code>, <code>clusterAdmin</code>, <code>hostManager</code>, <code>clusterManager</code>, <code>__system</code>, <code>__queryableBackup</code>, and <code>restore</code>.</li>
         * <li><strong>Can be authorized to any database (including admin)</strong>: <code>read</code>, <code>userAdmin</code>, and <code>enableSharding</code>.</li>
         * <li><strong>Can only be authorized to non-admin databases</strong> (returns <code>InvalidRoles.InvalidDB</code> if authorized to admin): <code>readWrite</code>, <code>dbAdmin</code>, and <code>dbOwner</code>.</li>
         * <li><strong>Can only be authorized to the admin database</strong>: <code>readAnyDatabase</code>, <code>readWriteAnyDatabase</code>, <code>userAdminAnyDatabase</code>, <code>dbAdminAnyDatabase</code>, <code>clusterMonitor</code>, <code>backup</code>, and <code>alibabaCloudAdmin</code>. (<code>alibabaCloudAdmin</code> is supported only for instances with kernel version 4.4 or later. For earlier versions, <code>InvalidRoles.NotAllowed</code> is returned.)</li>
         * <li><strong>Custom roles</strong>: Roles other than the preceding ones are considered custom roles and must already exist in the instance (you can query them by calling DescribeAccountRoles). Otherwise, <code>InvalidRoles.NotFound</code> is returned. <code>Roles.N.DBName</code> must be the same as the database where the role is defined. Otherwise, <code>InvalidRoles.DBNotMatch</code> is returned.</li>
         * <li>If <code>Roles</code> is missing as a whole, <code>MissingRoles</code> is returned. If <code>Roles.N.Role</code> and <code>Roles.N.DBName</code> do not appear in pairs, <code>InvalidRoles.Malformed</code> is returned. If <code>Roles</code> is passed for a sharded cluster Shard direct connection account, <code>InvalidRoles.NotSupported</code> is returned.</li>
         * </ul>
         */
        public Builder roles(java.util.List<Roles> roles) {
            this.putQueryParameter("Roles", roles);
            this.roles = roles;
            return this;
        }

        @Override
        public CreateAccountRequest build() {
            return new CreateAccountRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAccountRequest} extends {@link TeaModel}
     *
     * <p>CreateAccountRequest</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private Roles(Builder builder) {
            this.DBName = builder.DBName;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String DBName; 
            private String role; 

            private Builder() {
            } 

            private Builder(Roles model) {
                this.DBName = model.DBName;
                this.role = model.role;
            } 

            /**
             * <p>The database to which the account belongs (authentication database).<br>
             * Default value: <code>admin</code>.<br>Rules: If this parameter is left empty, the request is allowed and the downstream system processes it as <code>admin</code>. If this parameter is specified, the length must be 1 to 63 characters. The value cannot contain <code>/</code>, <code>\\</code>, <code>.</code>, spaces, <code>&quot;</code>, or <code>$</code>, and cannot be <code>local</code>. Otherwise, <code>InvalidParameter</code> is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The role name. It can be a built-in role or a custom role created on the instance. For value rules, see <a href="https://www.alibabacloud.com/help/en/mongodb/manage-database-accounts-through-the-console">Roles parameter description</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>read</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
}
