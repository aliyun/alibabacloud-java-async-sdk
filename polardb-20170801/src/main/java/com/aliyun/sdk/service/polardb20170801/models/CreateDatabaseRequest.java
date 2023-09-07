// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatabaseRequest} extends {@link RequestModel}
 *
 * <p>CreateDatabaseRequest</p>
 */
public class CreateDatabaseRequest extends Request {
    @Query
    @NameInMap("AccountName")
    private String accountName;

    @Query
    @NameInMap("AccountPrivilege")
    private String accountPrivilege;

    @Query
    @NameInMap("CharacterSetName")
    @Validation(required = true)
    private String characterSetName;

    @Query
    @NameInMap("Collate")
    private String collate;

    @Query
    @NameInMap("Ctype")
    private String ctype;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("DBDescription")
    private String DBDescription;

    @Query
    @NameInMap("DBName")
    @Validation(required = true)
    private String DBName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateDatabaseRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountPrivilege = builder.accountPrivilege;
        this.characterSetName = builder.characterSetName;
        this.collate = builder.collate;
        this.ctype = builder.ctype;
        this.DBClusterId = builder.DBClusterId;
        this.DBDescription = builder.DBDescription;
        this.DBName = builder.DBName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatabaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return accountPrivilege
     */
    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    /**
     * @return characterSetName
     */
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * @return collate
     */
    public String getCollate() {
        return this.collate;
    }

    /**
     * @return ctype
     */
    public String getCtype() {
        return this.ctype;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBDescription
     */
    public String getDBDescription() {
        return this.DBDescription;
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

    public static final class Builder extends Request.Builder<CreateDatabaseRequest, Builder> {
        private String accountName; 
        private String accountPrivilege; 
        private String characterSetName; 
        private String collate; 
        private String ctype; 
        private String DBClusterId; 
        private String DBDescription; 
        private String DBName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatabaseRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountPrivilege = request.accountPrivilege;
            this.characterSetName = request.characterSetName;
            this.collate = request.collate;
            this.ctype = request.ctype;
            this.DBClusterId = request.DBClusterId;
            this.DBDescription = request.DBDescription;
            this.DBName = request.DBName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The name of the account that is authorized to access the database. You can call the [DescribeAccounts](~~98107~~) operation to query account information.
         * <p>
         * >- You can specify only a standard account. By default, privileged accounts have all permissions on all databases. You do not need to grant privileged accounts the permissions to access the database.
         * >- This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters. This parameter is optional for PolarDB for MySQL clusters.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * The permissions that are granted to the account. Valid values:
         * <p>
         * 
         * *   **ReadWrite**: read and write permissions.
         * *   **ReadOnly**: read-only permissions.
         * *   **DMLOnly**: the permissions to execute only DML statements.
         * *   **DDLOnly**: the permissions to execute only DDL statements.
         * *   **ReadIndex**: the read-only and index permissions.
         * 
         * If you leave this parameter empty, the default value **ReadWrite** is used.
         * 
         * >- This parameter is valid only if you specify **AccountName**.
         * >- This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.
         * >- This parameter is optional for PolarDB for MySQL clusters.
         */
        public Builder accountPrivilege(String accountPrivilege) {
            this.putQueryParameter("AccountPrivilege", accountPrivilege);
            this.accountPrivilege = accountPrivilege;
            return this;
        }

        /**
         * The character set that is used by the cluster. For more information, see [Character set tables](~~99716~~).
         */
        public Builder characterSetName(String characterSetName) {
            this.putQueryParameter("CharacterSetName", characterSetName);
            this.characterSetName = characterSetName;
            return this;
        }

        /**
         * The language that indicates the collation of the databases that are created.
         * <p>
         * 
         * > 
         * 
         * *   The language must be compatible with the character set that is specified by **CharacterSetName**.
         * 
         * *   This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters. This parameter is not supported by PolarDB for MySQL clusters.
         * 
         * To view the valid values for this parameter, perform the following steps: Log on to the PolarDB console and click the ID of a cluster. In the left-side navigation pane, choose **Settings and Management** > **Databases**. Then, click **Create Database**.
         */
        public Builder collate(String collate) {
            this.putQueryParameter("Collate", collate);
            this.collate = collate;
            return this;
        }

        /**
         * The language that indicates the character type of the database.
         * <p>
         * 
         * >- The language must be compatible with the character set that is specified by **CharacterSetName**.
         * >- The value that you specify must be the same as the value of **Collate**.
         * >- This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters. This parameter is optional for PolarDB for MySQL clusters.
         * 
         * To view the valid values for this parameter, perform the following steps: Log on to the PolarDB console and click the ID of a cluster. In the left-side navigation pane, choose **Settings and Management** > **Databases**. Then, click **Create Database**.
         */
        public Builder ctype(String ctype) {
            this.putQueryParameter("Ctype", ctype);
            this.ctype = ctype;
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
         * The description of the database. The description must meet the following requirements:
         * <p>
         * 
         * *   It cannot start with `http://` or `https://`.
         * *   It must be 2 to 256 characters in length.
         * 
         * > This parameter is required for a PolarDB for Oracle or PolarDB for PostgreSQL cluster. This parameter is optional for a PolarDB for MySQL cluster.
         */
        public Builder DBDescription(String DBDescription) {
            this.putQueryParameter("DBDescription", DBDescription);
            this.DBDescription = DBDescription;
            return this;
        }

        /**
         * The name of the database. The name must meet the following requirements:
         * <p>
         * 
         * *   The name can contain lowercase letters, digits, hyphens (-), and underscores (\_).
         * *   The name must start with a lowercase letter and end with a lowercase letter or a digit. The name must be 1 to 64 characters in length.
         * 
         * > Do not use reserved words as database names, such as `test` or `mysql`.
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

        @Override
        public CreateDatabaseRequest build() {
            return new CreateDatabaseRequest(this);
        } 

    } 

}
