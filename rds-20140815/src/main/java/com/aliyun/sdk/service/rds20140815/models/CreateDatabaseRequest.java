// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    @com.aliyun.core.annotation.NameInMap("CollationName")
    private String collationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBDescription")
    private String DBDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

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
        this.collationName = builder.collationName;
        this.DBDescription = builder.DBDescription;
        this.DBInstanceId = builder.DBInstanceId;
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
     * @return collationName
     */
    public String getCollationName() {
        return this.collationName;
    }

    /**
     * @return DBDescription
     */
    public String getDBDescription() {
        return this.DBDescription;
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

    public static final class Builder extends Request.Builder<CreateDatabaseRequest, Builder> {
        private String accountName; 
        private String accountPrivilege; 
        private String characterSetName; 
        private String collationName; 
        private String DBDescription; 
        private String DBInstanceId; 
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
            this.collationName = request.collationName;
            this.DBDescription = request.DBDescription;
            this.DBInstanceId = request.DBInstanceId;
            this.DBName = request.DBName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The name of the account. You can call the <a href="https://help.aliyun.com/document_detail/610454.html">DescribeAccounts</a> operation to query the name.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The type of permission granted to the account. If you specify multiple database names, you must specify the same number of permission types in the same order and separate them with commas (,).</p>
         * <p>Different database engines support different permission types. Valid values:</p>
         * <blockquote>
         * <p>For more information about account permissions, see <a href="https://help.aliyun.com/document_detail/146395.html">Permission list for ApsaraDB RDS for MySQL and ApsaraDB RDS for MariaDB</a>, <a href="https://help.aliyun.com/document_detail/95692.html">Permission list for ApsaraDB RDS for SQL Server</a>, and <a href="https://help.aliyun.com/document_detail/257684.html">Permission list for ApsaraDB RDS for PostgreSQL</a>.</p>
         * </blockquote>
         * <details>
         * <summary>ApsaraDB RDS for MySQL and ApsaraDB RDS for MariaDB</summary>
         * 
         * <ul>
         * <li><strong>ReadWrite</strong>: read and write</li>
         * <li><strong>ReadOnly</strong>: read-only</li>
         * <li><strong>DDLOnly</strong>: DDL-only</li>
         * <li><strong>DMLOnly</strong>: DML-only</li>
         * </ul>
         * </details>
         * 
         * <details>
         * <summary>ApsaraDB RDS for SQL Server</summary>
         * 
         * <ul>
         * <li><strong>ReadWrite</strong>: read and write. This permission corresponds to the <code>db_datawriter</code> and <code>db_datareader</code> database roles in SQL Server.</li>
         * <li><strong>ReadOnly</strong>: read-only. This permission corresponds to the <code>db_datareader</code> database role in SQL Server.</li>
         * <li><strong>DBOwner</strong>: database owner. This permission corresponds to the <code>db_owner</code> database role in SQL Server.<blockquote>
         * <p>For more information about database-level roles, see <a href="https://learn.microsoft.com/en-us/sql/relational-databases/security/authentication-access/database-level-roles?view=sql-server-ver16">Microsoft official documentation</a>.</p>
         * </blockquote>
         * </details></li>
         * </ul>
         * <details>
         * <summary>ApsaraDB RDS for PostgreSQL</summary>
         * 
         * <p><strong>DBOwner</strong>: database owner</p>
         * <blockquote>
         * <p>For more information about fine-grained permission management for accounts, see <a href="https://help.aliyun.com/document_detail/352149.html">Best practices for permission management in ApsaraDB RDS for PostgreSQL</a>.</p>
         * </blockquote>
         * </details>
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
         * <p>The character set. Valid values:</p>
         * <ul>
         * <li>ApsaraDB RDS for MySQL and ApsaraDB RDS for MariaDB: <strong>utf8</strong>, <strong>gbk</strong>, <strong>latin1</strong>, and <strong>utf8mb4</strong>.</li>
         * <li>ApsaraDB RDS for SQL Server: <strong>Chinese_PRC_CI_AS</strong>, <strong>Chinese_PRC_CS_AS</strong>, <strong>SQL_Latin1_General_CP1_CI_AS</strong>, <strong>SQL_Latin1_General_CP1_CS_AS</strong>, and <strong>Chinese_PRC_BIN</strong>.</li>
         * <li>ApsaraDB RDS for PostgreSQL: You must configure the character set, collation, and ctype in the <code>character set,&lt;collation&gt;,&lt;ctype&gt;</code> format. Example: <code>UTF8,C,en_US.utf8</code>.<ul>
         * <li>Valid values for the character set: <strong>KOI8U, UTF8, WIN866, WIN874, WIN1250, WIN1251, WIN1252, WIN1253, WIN1254, WIN1255, WIN1256, WIN1257, WIN1258, EUC_CN, EUC_KR, EUC_TW, EUC_JP, EUC_JIS_2004, KOI8R, MULE_INTERNAL, LATIN1, LATIN2, LATIN3, LATIN4, LATIN5, LATIN6, LATIN7, LATIN8, LATIN9, LATIN10, ISO_8859_5, ISO_8859_6, ISO_8859_7, ISO_8859_8, and SQL_ASCII</strong>.</li>
         * <li>Valid values for <strong>collation</strong>: You can execute the <code>SELECT DISTINCT collname FROM pg_collation;</code> statement to query the values. If you do not configure this parameter, the default value is <strong>C</strong>.</li>
         * <li>Valid values for <strong>ctype</strong>: You can execute the <code>SELECT DISTINCT collctype FROM pg_collation;</code> statement to query the values. If you do not configure this parameter, the default value is <strong>en_US.utf8</strong>.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gbk</p>
         */
        public Builder characterSetName(String characterSetName) {
            this.putQueryParameter("CharacterSetName", characterSetName);
            this.characterSetName = characterSetName;
            return this;
        }

        /**
         * <p>The collation. This parameter is only supported for ApsaraDB RDS for MySQL instances. Specify a collation that matches the character set. For example, if the character set is utf8mb4, the collation must be utf8mb4_bin or utf8mb4_general_ci.</p>
         * 
         * <strong>example:</strong>
         * <p>gbk_chinese_ci</p>
         */
        public Builder collationName(String collationName) {
            this.putQueryParameter("CollationName", collationName);
            this.collationName = collationName;
            return this;
        }

        /**
         * <p>The description of the database. The description must be 2 to 256 characters in length. It must start with a Chinese or English letter and can contain digits, Chinese characters, English letters, underscores (_), and hyphens (-).</p>
         * <blockquote>
         * <p>It cannot start with http:// or https://.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        public Builder DBDescription(String DBDescription) {
            this.putQueryParameter("DBDescription", DBDescription);
            this.DBDescription = DBDescription;
            return this;
        }

        /**
         * <p>Instance ID of the instance. You can call the DescribeDBInstances operation to query instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * <blockquote>
         * <ul>
         * <li>The name must be 2 to 64 characters in length.</li>
         * <li>It must start with a letter and end with a letter or digit.</li>
         * <li>It can contain lowercase letters, digits, underscores (_), and hyphens (-).</li>
         * <li>The database name must be unique within the instance.</li>
         * <li>For other invalid characters, see <a href="https://help.aliyun.com/document_detail/26317.html">Reserved keywords</a>.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_mysql</p>
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
