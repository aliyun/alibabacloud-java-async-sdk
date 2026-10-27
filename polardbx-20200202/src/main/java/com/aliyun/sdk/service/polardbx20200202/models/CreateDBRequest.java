// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link CreateDBRequest} extends {@link RequestModel}
 *
 * <p>CreateDBRequest</p>
 */
public class CreateDBRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountPrivilege")
    private String accountPrivilege;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Charset")
    @com.aliyun.core.annotation.Validation(required = true)
    private String charset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbDescription")
    private String dbDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityAccountName")
    private String securityAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityAccountPassword")
    private String securityAccountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoragePoolName")
    private String storagePoolName;

    private CreateDBRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountPrivilege = builder.accountPrivilege;
        this.charset = builder.charset;
        this.DBInstanceName = builder.DBInstanceName;
        this.dbDescription = builder.dbDescription;
        this.dbName = builder.dbName;
        this.mode = builder.mode;
        this.regionId = builder.regionId;
        this.securityAccountName = builder.securityAccountName;
        this.securityAccountPassword = builder.securityAccountPassword;
        this.storagePoolName = builder.storagePoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBRequest create() {
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
     * @return charset
     */
    public String getCharset() {
        return this.charset;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return dbDescription
     */
    public String getDbDescription() {
        return this.dbDescription;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityAccountName
     */
    public String getSecurityAccountName() {
        return this.securityAccountName;
    }

    /**
     * @return securityAccountPassword
     */
    public String getSecurityAccountPassword() {
        return this.securityAccountPassword;
    }

    /**
     * @return storagePoolName
     */
    public String getStoragePoolName() {
        return this.storagePoolName;
    }

    public static final class Builder extends Request.Builder<CreateDBRequest, Builder> {
        private String accountName; 
        private String accountPrivilege; 
        private String charset; 
        private String DBInstanceName; 
        private String dbDescription; 
        private String dbName; 
        private String mode; 
        private String regionId; 
        private String securityAccountName; 
        private String securityAccountPassword; 
        private String storagePoolName; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountPrivilege = request.accountPrivilege;
            this.charset = request.charset;
            this.DBInstanceName = request.DBInstanceName;
            this.dbDescription = request.dbDescription;
            this.dbName = request.dbName;
            this.mode = request.mode;
            this.regionId = request.regionId;
            this.securityAccountName = request.securityAccountName;
            this.securityAccountPassword = request.securityAccountPassword;
            this.storagePoolName = request.storagePoolName;
        } 

        /**
         * <p>The name of the account to be authorized for the new database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testaccount</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The permissions granted to the new account on the database. Valid values:</p>
         * <ul>
         * <li><strong>ReadWrite</strong></li>
         * <li><strong>ReadOnly</strong></li>
         * <li><strong>DMLOnly</strong></li>
         * <li><strong>DDLOnly</strong></li>
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
         * <p>The character set. Valid values:</p>
         * <ul>
         * <li><strong>utf8</strong></li>
         * <li><strong>gbk</strong></li>
         * <li><strong>latin1</strong></li>
         * <li><strong>utf8mb4</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8mb4</p>
         */
        public Builder charset(String charset) {
            this.putQueryParameter("Charset", charset);
            this.charset = charset;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-**************</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The description of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>db for test</p>
         */
        public Builder dbDescription(String dbDescription) {
            this.putQueryParameter("DbDescription", dbDescription);
            this.dbDescription = dbDescription;
            return this;
        }

        /**
         * <p>The name of the database to be created.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The mode selected when creating the database. Valid values:</p>
         * <ul>
         * <li><strong>auto</strong>: The database supports automatic partitioning. You do not need to specify a partition key when creating a table.</li>
         * <li><strong>drds</strong>: The database does not support automatic partitioning. You must use the dedicated database and table sharding syntax and specify the shard keys when creating a table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The region where the instance resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the security administrator account.</p>
         * <blockquote>
         * <p>This parameter is required if the three-role mode is enabled. If the three-role mode is not enabled, this parameter is optional.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>securityAccount</p>
         */
        public Builder securityAccountName(String securityAccountName) {
            this.putQueryParameter("SecurityAccountName", securityAccountName);
            this.securityAccountName = securityAccountName;
            return this;
        }

        /**
         * <p>The password of the security administrator account.</p>
         * <blockquote>
         * <p>This parameter is required if the three-role mode is enabled. If the three-role mode is not enabled, this parameter is optional.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>securityPassword</p>
         */
        public Builder securityAccountPassword(String securityAccountPassword) {
            this.putQueryParameter("SecurityAccountPassword", securityAccountPassword);
            this.securityAccountPassword = securityAccountPassword;
            return this;
        }

        /**
         * <p>The name of the storage pool.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder storagePoolName(String storagePoolName) {
            this.putQueryParameter("StoragePoolName", storagePoolName);
            this.storagePoolName = storagePoolName;
            return this;
        }

        @Override
        public CreateDBRequest build() {
            return new CreateDBRequest(this);
        } 

    } 

}
