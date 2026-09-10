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
 * {@link CreateAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateAccountRequest</p>
 */
public class CreateAccountRequest extends Request {
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

    private CreateAccountRequest(Builder builder) {
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

    public static CreateAccountRequest create() {
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

    public static final class Builder extends Request.Builder<CreateAccountRequest, Builder> {
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

        private Builder(CreateAccountRequest request) {
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
         * <li>Cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>Is 2 to 256 characters in length.</li>
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
         * <li>Starts with a lowercase letter and ends with a letter or digit.</li>
         * <li>Contains only lowercase letters, digits, or underscores (_).</li>
         * <li>Is 2 to 16 characters in length.</li>
         * <li>Cannot use certain reserved usernames such as root or admin.</li>
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
         * <li>Contains at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
         * <li>Is 8 to 32 characters in length.</li>
         * <li>Special characters include <code>!@#$%^&amp;*()_+-=</code>.</li>
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
         * <p>The permissions of the account. Valid values: </p>
         * <ul>
         * <li><strong>ReadWrite</strong>: read and write</li>
         * <li><strong>ReadOnly</strong>: read-only</li>
         * <li><strong>DMLOnly</strong>: DML only</li>
         * <li><strong>DDLOnly</strong>: DDL only</li>
         * <li><strong>ReadIndex</strong>: read-only and index</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The DBName parameter must be specified for AccountPrivilege to take effect.</li>
         * <li>If you specify multiple database names for the DBName parameter, you must grant the corresponding permissions to each database. Separate multiple permissions with commas (,) and make sure that the total length of the AccountPrivilege string does not exceed 900 characters. For example, to grant read and write permissions on database DB1 and read-only permissions on database DB2, set DBName to <code>DB1,DB2</code> and set AccountPrivilege to <code>ReadWrite,ReadOnly</code>.</li>
         * <li>This parameter is supported only for standard accounts of PolarDB for MySQL clusters.</li>
         * </ul>
         * </blockquote>
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
         * <li><strong>Normal</strong>: standard account. </li>
         * <li><strong>Super</strong>: privileged account. </li>
         * <li><strong>DynamoDB</strong>: DynamoDB account.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If this parameter is left empty, a <strong>Super</strong> account is created by default.</li>
         * <li>If the cluster is a PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL cluster, you can create multiple privileged accounts for each cluster. Privileged accounts have more permissions than standard accounts. For more information, see <a href="https://help.aliyun.com/document_detail/68508.html">Create a database account</a>.</li>
         * <li>If the cluster is a PolarDB for MySQL cluster, you can create at most one privileged account for each cluster. Privileged accounts have more permissions than standard accounts. For more information, see <a href="https://help.aliyun.com/document_detail/68508.html">Create a database account</a>.</li>
         * <li>DynamoDB accounts are dedicated accounts created for the DynamoDB compatibility feature of PolarDB for PostgreSQL. For more information, see <a href="https://help.aliyun.com/document_detail/2979941.html">DynamoDB usage instructions</a>.</li>
         * </ul>
         * </blockquote>
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value. Make sure that the value is unique among different requests. The token is case-sensitive and cannot exceed 64 ASCII characters in length.</p>
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
         * <p>The name of the database that the account is authorized to access. You can specify multiple database names separated by commas (,).</p>
         * <blockquote>
         * <p>This parameter is supported only for standard accounts of PolarDB for MySQL clusters.</p>
         * </blockquote>
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
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li>Search: required when creating an account for a PolarDB Search node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Search</p>
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
         * <p>Specifies whether to grant permissions on all existing databases and all new databases in the current cluster. Valid values:</p>
         * <ul>
         * <li><p><strong>0 or empty</strong>: does not grant permissions.</p>
         * </li>
         * <li><p><strong>1</strong>: grants permissions.</p>
         * <blockquote>
         * <ul>
         * <li>The AccountPrivilege parameter must be specified for this parameter to take effect.</li>
         * <li>If this parameter is set to <code>1</code>, the permissions specified by AccountPrivilege are granted on all databases.</li>
         * </ul>
         * </blockquote>
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
        public CreateAccountRequest build() {
            return new CreateAccountRequest(this);
        } 

    } 

}
