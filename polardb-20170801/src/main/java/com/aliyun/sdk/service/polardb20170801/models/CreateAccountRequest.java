// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateAccountRequest</p>
 */
public class CreateAccountRequest extends Request {
    @Query
    @NameInMap("AccountDescription")
    private String accountDescription;

    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("AccountPassword")
    @Validation(required = true)
    private String accountPassword;

    @Query
    @NameInMap("AccountPrivilege")
    @Validation(maxLength = 900)
    private String accountPrivilege;

    @Query
    @NameInMap("AccountType")
    private String accountType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("DBName")
    @Validation(maxLength = 6400)
    private String DBName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PrivForAllDB")
    private String privForAllDB;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
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
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.privForAllDB = request.privForAllDB;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The description of the account. The description must meet the following requirements:
         * <p>
         * 
         * *   It cannot start with `http://` or `https://`.
         * *   It must be 2 to 256 characters in length.
         */
        public Builder accountDescription(String accountDescription) {
            this.putQueryParameter("AccountDescription", accountDescription);
            this.accountDescription = accountDescription;
            return this;
        }

        /**
         * The name of the account. The name must meet the following requirements:
         * <p>
         * 
         * *   It must start with a lowercase letter and end with a letter or a digit.
         * *   It can contain lowercase letters, digits, and underscores (\_).
         * *   It must be 2 to 16 characters in length.
         * *   It cannot be root, admin, or another username that is reserved by the system.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * The password of the account. The password must meet the following requirements:
         * <p>
         * 
         * *   It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.
         * *   It must be 8 to 32 characters in length.
         * *   Special characters include `! @ # $ % ^ & * ( ) _ + - =`
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * The permissions that are granted to the account. Valid values:
         * <p>
         * 
         * *   **ReadWrite**: read and write permissions
         * *   **ReadOnly**: read-only permissions
         * *   **DMLOnly**: the permissions to execute only DML statements
         * *   **DDLOnly**: the permissions to execute only DDL statements
         * *   **ReadIndex**: the read and index permissions
         * 
         * > 
         * 
         * *   The `AccountPrivilege` parameter is valid only after you specify the `DBName` parameter.
         * 
         * *   If multiple database names are specified by the `DBName` parameter, you must grant permissions on the databases. Separate multiple permissions with commas (,). For example, if you want to grant the account the read and write permissions on DB1 and the read-only permissions on DB2, set `DBName` to `DB1,DB2`, and set `AccountPrivilege` to `ReadWrite,ReadOnly`.
         * *   This parameter is valid only for standard accounts of PolarDB for MySQL clusters.
         */
        public Builder accountPrivilege(String accountPrivilege) {
            this.putQueryParameter("AccountPrivilege", accountPrivilege);
            this.accountPrivilege = accountPrivilege;
            return this;
        }

        /**
         * The type of the account. Valid values:
         * <p>
         * 
         * *   **Normal**: standard account
         * *   **Super**: privileged account
         * 
         * > 
         * 
         * *   If you leave this parameter empty, the default value **Super** is used.
         * 
         * *   You can create multiple privileged accounts for a PolarDB for Oracle or PolarDB for PostgreSQL cluster. A privileged account is granted more permissions than a standard account. For more information about how to create a database account, see [Create a database account](~~68508~~).
         * *   You can create only one privileged account for a PolarDB for MySQL cluster. A privileged account is granted more permissions than a standard account. For more information about how to create a database account, see [Create a database account](~~68508~~).
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. The token is case-sensitive.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The name of the database that can be accessed by the account. To enter multiple database names, separate the names with commas (,).
         * <p>
         * 
         * > This parameter is valid only for standard accounts of PolarDB for MySQL clusters.
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
         * PrivForAllDB.
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
