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
 * {@link GrantAccountPrivilegeRequest} extends {@link RequestModel}
 *
 * <p>GrantAccountPrivilegeRequest</p>
 */
public class GrantAccountPrivilegeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountPrivilege")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountPrivilege;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private GrantAccountPrivilegeRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountPrivilege = builder.accountPrivilege;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBName = builder.DBName;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantAccountPrivilegeRequest create() {
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<GrantAccountPrivilegeRequest, Builder> {
        private String accountName; 
        private String accountPrivilege; 
        private String DBInstanceId; 
        private String DBName; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(GrantAccountPrivilegeRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountPrivilege = request.accountPrivilege;
            this.DBInstanceId = request.DBInstanceId;
            this.DBName = request.DBName;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The account name. You can call <a href="https://help.aliyun.com/document_detail/610454.html">DescribeAccounts</a> to query the account name.</p>
         * <p>This parameter is required.</p>
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
         * <p>The type of account permission. If you specify multiple values for DBName, you must specify the same number of permission types in the same order, separated by commas (,).</p>
         * <p>The supported permission types vary by database engine. Valid values:</p>
         * <blockquote>
         * <p>For more information about account permissions, see <a href="https://help.aliyun.com/document_detail/146395.html">MySQL/MariaDB permission list</a>, <a href="https://help.aliyun.com/document_detail/95692.html">SQL Server permission list</a>, and <a href="https://help.aliyun.com/document_detail/257684.html">PostgreSQL permission list</a>.</p>
         * </blockquote>
         * <details>
         * <summary>ApsaraDB RDS for MySQL/ApsaraDB RDS for MariaDB</summary>
         * 
         * <ul>
         * <li><strong>ReadWrite</strong>: read and write.</li>
         * <li><strong>ReadOnly</strong>: read-only.</li>
         * <li><strong>DDLOnly</strong>: DDL only.</li>
         * <li><strong>DMLOnly</strong>: DML only.</li>
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
         * <p><strong>DBOwner</strong>: database owner.</p>
         * <blockquote>
         * <p>For fine-grained permission management, see <a href="https://help.aliyun.com/document_detail/352149.html">Best practices for PostgreSQL permission management</a>.</p>
         * </blockquote>
         * </details>
         * 
         * <p>This parameter is required.</p>
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
         * <p>The instance ID. You can call <a href="https://help.aliyun.com/document_detail/610396.html">DescribeDBInstances</a> to query the instance ID.</p>
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
         * <p>The name of the database to which you want to grant access permissions. To grant permissions on multiple databases at a time, separate the database names with commas (,), such as <code>db1,db2,db3</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testDB1</p>
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
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
        public GrantAccountPrivilegeRequest build() {
            return new GrantAccountPrivilegeRequest(this);
        } 

    } 

}
