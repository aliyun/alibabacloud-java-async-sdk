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
         * <p>The username of the account.</p>
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
         * <p>The permissions that you want to grant to the account. The number of permissions must be the same as the number of databases that you specify for the DBName parameter. You can specify this parameter based on your business requirements. Valid values:</p>
         * <ul>
         * <li><strong>ReadWrite</strong>: read and write permissions</li>
         * <li><strong>ReadOnly</strong>: read-only permissions</li>
         * <li><strong>DDLOnly</strong>: DDL-only permissions</li>
         * <li><strong>DMLOnly</strong>: DML-only permissions</li>
         * <li><strong>DBOwner</strong>: database owner permissions</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the instance runs MySQL or MariaDB, you can set this parameter to <strong>ReadWrite</strong>, <strong>ReadOnly</strong>, <strong>DDLOnly</strong>, or <strong>DMLOnly</strong>.</p>
         * </li>
         * <li><p>If the instance runs SQL Server, you can set this parameter to <strong>ReadWrite</strong>, <strong>ReadOnly</strong>, or <strong>DBOwner</strong>.</p>
         * </li>
         * <li><p>If the instance runs PostgreSQL and uses cloud disks, you can set this parameter to <strong>DBOwner</strong>.</p>
         * </li>
         * </ul>
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
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the database on which you want to grant permissions. Separate multiple database names with commas (,).</p>
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
