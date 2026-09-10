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
 * {@link CreateAccountZonalRequest} extends {@link RequestModel}
 *
 * <p>CreateAccountZonalRequest</p>
 */
public class CreateAccountZonalRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("AccountPrivilege")
    private String accountPrivilege;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivForAllDB")
    private String privForAllDB;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateAccountZonalRequest(Builder builder) {
        super(builder);
        this.accountDescription = builder.accountDescription;
        this.accountName = builder.accountName;
        this.accountPassword = builder.accountPassword;
        this.accountPrivilege = builder.accountPrivilege;
        this.accountType = builder.accountType;
        this.clientToken = builder.clientToken;
        this.DBClusterId = builder.DBClusterId;
        this.DBName = builder.DBName;
        this.nodeType = builder.nodeType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.privForAllDB = builder.privForAllDB;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccountZonalRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return accountPrivilege
     */
    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
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
     * @return privForAllDB
     */
    public String getPrivForAllDB() {
        return this.privForAllDB;
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

    public static final class Builder extends Request.Builder<CreateAccountZonalRequest, Builder> {
        private String accountDescription; 
        private String accountName; 
        private String accountPassword; 
        private String accountPrivilege; 
        private String accountType; 
        private String clientToken; 
        private String DBClusterId; 
        private String DBName; 
        private String nodeType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String privForAllDB; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccountZonalRequest request) {
            super(request);
            this.accountDescription = request.accountDescription;
            this.accountName = request.accountName;
            this.accountPassword = request.accountPassword;
            this.accountPrivilege = request.accountPrivilege;
            this.accountType = request.accountType;
            this.clientToken = request.clientToken;
            this.DBClusterId = request.DBClusterId;
            this.DBName = request.DBName;
            this.nodeType = request.nodeType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.privForAllDB = request.privForAllDB;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The description of the account. The description must meet the following requirements:</p>
         * <ul>
         * <li><p>Cannot start with <code>http://</code> or <code>https://</code>.</p>
         * </li>
         * <li><p>Be 2 to 256 characters in length.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testdes</p>
         */
        public Builder accountDescription(String accountDescription) {
            this.putQueryParameter("AccountDescription", accountDescription);
            this.accountDescription = accountDescription;
            return this;
        }

        /**
         * <p>The account name. The name must meet the following requirements:</p>
         * <ul>
         * <li><p>Start with a lowercase letter and end with a letter or a digit.</p>
         * </li>
         * <li><p>Contain only lowercase letters, digits, and underscores (_).</p>
         * </li>
         * <li><p>Be 2 to 16 characters in length.</p>
         * </li>
         * <li><p>Cannot be a reserved username, such as root or admin.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testacc</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The account password. The password must meet the following requirements:</p>
         * <ul>
         * <li><p>Contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         * </li>
         * <li><p>Be 8 to 32 characters in length.</p>
         * </li>
         * <li><p>Special characters are <code>!@#$%^&amp;*()_+-=</code>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test1111</p>
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * <p>The permissions of the account. Valid values:</p>
         * <ul>
         * <li><p>ReadWrite: read and write permissions.</p>
         * </li>
         * <li><p>ReadOnly: read-only permissions.</p>
         * </li>
         * <li><p>DMLOnly: DML permissions only.</p>
         * </li>
         * <li><p>DDLOnly: DDL permissions only.</p>
         * </li>
         * <li><p>ReadIndex: read and index permissions.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadWrite</p>
         */
        public Builder accountPrivilege(String accountPrivilege) {
            this.putQueryParameter("AccountPrivilege", accountPrivilege);
            this.accountPrivilege = accountPrivilege;
            return this;
        }

        /**
         * <p>The account type. Valid values:</p>
         * <ul>
         * <li><p>Normal: a standard account.</p>
         * </li>
         * <li><p>Super: a privileged account.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>A client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token is case-sensitive and can contain a maximum of 64 ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5c******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The name of the database that the destination account can access. You can specify multiple database names. Separate them with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
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
         * <p>Specifies whether to grant permissions on all current and future databases in the cluster. Valid values:</p>
         * <ul>
         * <li><p>0 or empty: Does not grant permissions.</p>
         * </li>
         * <li><p>1: Grants permissions.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder privForAllDB(String privForAllDB) {
            this.putQueryParameter("PrivForAllDB", privForAllDB);
            this.privForAllDB = privForAllDB;
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

        @Override
        public CreateAccountZonalRequest build() {
            return new CreateAccountZonalRequest(this);
        } 

    } 

}
