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
 * {@link ModifyDatabaseConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyDatabaseConfigRequest</p>
 */
public class ModifyDatabaseConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabasePropertyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databasePropertyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabasePropertyValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databasePropertyValue;

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

    private ModifyDatabaseConfigRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.DBName = builder.DBName;
        this.databasePropertyName = builder.databasePropertyName;
        this.databasePropertyValue = builder.databasePropertyValue;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDatabaseConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return databasePropertyName
     */
    public String getDatabasePropertyName() {
        return this.databasePropertyName;
    }

    /**
     * @return databasePropertyValue
     */
    public String getDatabasePropertyValue() {
        return this.databasePropertyValue;
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

    public static final class Builder extends Request.Builder<ModifyDatabaseConfigRequest, Builder> {
        private String DBInstanceId; 
        private String DBName; 
        private String databasePropertyName; 
        private String databasePropertyValue; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDatabaseConfigRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.DBName = request.DBName;
            this.databasePropertyName = request.databasePropertyName;
            this.databasePropertyValue = request.databasePropertyValue;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-t4nnu1my39qr8****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The database name.</p>
         * <blockquote>
         * <p> You can specify only one database name.</p>
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
         * <p>The database property that you want to modify.</p>
         * <ul>
         * <li><strong>If you want to modify a property of the database</strong>, set this parameter to the name of the database property.</li>
         * <li><strong>If you want to archive data from the database to an OSS bucket</strong>, specify the database status. If you set this parameter to <code>covert_online_db_to_cold_storage</code>, the system converts an online database to a cold storage database. If you set this parameter to <code>convert_cold_storage_db_to_online</code>, the system converts a cold storage database to an online database.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>compatibility_level</p>
         */
        public Builder databasePropertyName(String databasePropertyName) {
            this.putQueryParameter("DatabasePropertyName", databasePropertyName);
            this.databasePropertyName = databasePropertyName;
            return this;
        }

        /**
         * <p>The value of the database property that you want to modify.</p>
         * <ul>
         * <li><strong>If you want to modify a property of the database</strong>, set this parameter to the property value.</li>
         * <li><strong>If you want to archive data from the database to an OSS bucket</strong>, set this parameter to <strong>1</strong>. The system converts a database to a cold storage database or an online database.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        public Builder databasePropertyValue(String databasePropertyValue) {
            this.putQueryParameter("DatabasePropertyValue", databasePropertyValue);
            this.databasePropertyValue = databasePropertyValue;
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
        public ModifyDatabaseConfigRequest build() {
            return new ModifyDatabaseConfigRequest(this);
        } 

    } 

}
