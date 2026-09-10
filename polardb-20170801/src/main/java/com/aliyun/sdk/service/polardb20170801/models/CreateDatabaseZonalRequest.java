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
 * {@link CreateDatabaseZonalRequest} extends {@link RequestModel}
 *
 * <p>CreateDatabaseZonalRequest</p>
 */
public class CreateDatabaseZonalRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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

    private CreateDatabaseZonalRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountPrivilege = builder.accountPrivilege;
        this.characterSetName = builder.characterSetName;
        this.clientToken = builder.clientToken;
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

    public static CreateDatabaseZonalRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<CreateDatabaseZonalRequest, Builder> {
        private String accountName; 
        private String accountPrivilege; 
        private String characterSetName; 
        private String clientToken; 
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

        private Builder(CreateDatabaseZonalRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountPrivilege = request.accountPrivilege;
            this.characterSetName = request.characterSetName;
            this.clientToken = request.clientToken;
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
         * <p>The name of the account that is authorized to access the database.</p>
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
         * <li><p>ReadIndex: read-only and index permissions.</p>
         * </li>
         * </ul>
         * <p>If you do not specify this parameter, the default value is ReadWrite.</p>
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
         * <p>The character set.</p>
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
         * <p>A client token to ensure request idempotence. The client generates this token. The token must be unique across requests. It is case-sensitive and can be up to 64 ASCII characters long.</p>
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
         * <p>The locale setting. This specifies the collation for the new database.</p>
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
         * <p>The locale setting. This specifies the character classification for the database.</p>
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
         * <p>The description of the database. The description must meet the following requirements:</p>
         * <ul>
         * <li><p>It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * </li>
         * <li><p>It must be 2 to 256 characters in length.</p>
         * </li>
         * </ul>
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
         * <li><p>It must consist of lowercase letters, digits, hyphens (-), and underscores (_).</p>
         * </li>
         * <li><p>It must start with a letter and end with a letter or a digit. The name can be up to 64 characters long.</p>
         * </li>
         * </ul>
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
        public CreateDatabaseZonalRequest build() {
            return new CreateDatabaseZonalRequest(this);
        } 

    } 

}
