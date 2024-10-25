// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDatabaseRequest} extends {@link RequestModel}
 *
 * <p>CreateDatabaseRequest</p>
 */
public class CreateDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountPrivilege")
    private String accountPrivilege;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CharacterSetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String characterSetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Collate")
    private String collate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ctype")
    private String ctype;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBDescription")
    private String DBDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the account that is authorized to access the database. You can call the <a href="https://help.aliyun.com/document_detail/98107.html">DescribeAccounts</a> operation to query account information.</p>
         * <blockquote>
         * <ul>
         * <li>You can specify only a standard account. By default, privileged accounts have all permissions on all databases. You do not need to grant privileged accounts the permissions to access the database.</li>
         * <li>This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters. This parameter is optional for PolarDB for MySQL clusters.</li>
         * </ul>
         * </blockquote>
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
         * <p>The permissions that are granted to the account. Valid values:</p>
         * <ul>
         * <li><strong>ReadWrite</strong>: read and write permissions.</li>
         * <li><strong>ReadOnly</strong>: read-only permissions.</li>
         * <li><strong>DMLOnly</strong>: the permissions to execute only DML statements.</li>
         * <li><strong>DDLOnly</strong>: the permissions to execute only DDL statements.</li>
         * <li><strong>ReadIndex</strong>: the read-only and index permissions.</li>
         * </ul>
         * <p>If you leave this parameter empty, the default value <strong>ReadWrite</strong> is used.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is valid only if you specify <strong>AccountName</strong>.</li>
         * <li>This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.</li>
         * <li>This parameter is optional for PolarDB for MySQL clusters.</li>
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
         * <p>The character set that is used by the cluster. For more information, see <a href="https://help.aliyun.com/document_detail/99716.html">Character set tables</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8</p>
         */
        public Builder characterSetName(String characterSetName) {
            this.putQueryParameter("CharacterSetName", characterSetName);
            this.characterSetName = characterSetName;
            return this;
        }

        /**
         * <p>The language that defines the collation rules in the database.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The language must be compatible with the character set that is specified by <strong>CharacterSetName</strong>.</p>
         * </li>
         * <li><p>This parameter is required for a PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL cluster. This parameter is optional for a PolarDB for MySQL cluster. To view the valid values of this parameter, perform the following steps: Log on to the PolarDB console and click the ID of the cluster. In the left-side navigation pane, choose <strong>Settings and Management</strong> &gt; <strong>Databases</strong>. Then, click <strong>Create Database</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>C</p>
         */
        public Builder collate(String collate) {
            this.putQueryParameter("Collate", collate);
            this.collate = collate;
            return this;
        }

        /**
         * <p>The language that indicates the character type of the database.</p>
         * <blockquote>
         * <ul>
         * <li>The language must be compatible with the character set that is specified by <strong>CharacterSetName</strong>.</li>
         * <li>The value that you specify must be the same as the value of <strong>Collate</strong>.</li>
         * <li>This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters. This parameter is optional for PolarDB for MySQL clusters.</li>
         * </ul>
         * </blockquote>
         * <p>To view the valid values for this parameter, perform the following steps: Log on to the PolarDB console and click the ID of a cluster. In the left-side navigation pane, choose <strong>Settings and Management</strong> &gt; <strong>Databases</strong>. Then, click <strong>Create Database</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>C</p>
         */
        public Builder ctype(String ctype) {
            this.putQueryParameter("Ctype", ctype);
            this.ctype = ctype;
            return this;
        }

        /**
         * <p>The ID of cluster.</p>
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
         * <p>The description of the database. The description must meet the following requirements:</p>
         * <ul>
         * <li>It cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>It must be 2 to 256 characters in length.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required for a PolarDB for Oracle or PolarDB for PostgreSQL cluster. This parameter is optional for a PolarDB for MySQL cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testdesc</p>
         */
        public Builder DBDescription(String DBDescription) {
            this.putQueryParameter("DBDescription", DBDescription);
            this.DBDescription = DBDescription;
            return this;
        }

        /**
         * <p>The name of the database. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name can contain lowercase letters, digits, hyphens (-), and underscores (_).</li>
         * <li>The name must start with a lowercase letter and end with a lowercase letter or a digit. The name must be 1 to 64 characters in length.</li>
         * </ul>
         * <blockquote>
         * <p>Do not use reserved words as database names, such as <code>test</code> or <code>mysql</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testDB</p>
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
