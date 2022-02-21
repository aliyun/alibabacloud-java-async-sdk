// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMigrateTaskForSQLServerRequest} extends {@link RequestModel}
 *
 * <p>CreateMigrateTaskForSQLServerRequest</p>
 */
public class CreateMigrateTaskForSQLServerRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DBName")
    @Validation(required = true)
    private String DBName;

    @Query
    @NameInMap("IsOnlineDB")
    @Validation(required = true)
    private String isOnlineDB;

    @Query
    @NameInMap("OSSUrls")
    @Validation(required = true)
    private String OSSUrls;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
    private String taskType;

    private CreateMigrateTaskForSQLServerRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.DBName = builder.DBName;
        this.isOnlineDB = builder.isOnlineDB;
        this.OSSUrls = builder.OSSUrls;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMigrateTaskForSQLServerRequest create() {
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
     * @return isOnlineDB
     */
    public String getIsOnlineDB() {
        return this.isOnlineDB;
    }

    /**
     * @return OSSUrls
     */
    public String getOSSUrls() {
        return this.OSSUrls;
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

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<CreateMigrateTaskForSQLServerRequest, Builder> {
        private String DBInstanceId; 
        private String DBName; 
        private String isOnlineDB; 
        private String OSSUrls; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateMigrateTaskForSQLServerRequest response) {
            super(response);
            this.DBInstanceId = response.DBInstanceId;
            this.DBName = response.DBName;
            this.isOnlineDB = response.isOnlineDB;
            this.OSSUrls = response.OSSUrls;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.taskType = response.taskType;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DBName.
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * IsOnlineDB.
         */
        public Builder isOnlineDB(String isOnlineDB) {
            this.putQueryParameter("IsOnlineDB", isOnlineDB);
            this.isOnlineDB = isOnlineDB;
            return this;
        }

        /**
         * OSSUrls.
         */
        public Builder OSSUrls(String OSSUrls) {
            this.putQueryParameter("OSSUrls", OSSUrls);
            this.OSSUrls = OSSUrls;
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

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public CreateMigrateTaskForSQLServerRequest build() {
            return new CreateMigrateTaskForSQLServerRequest(this);
        } 

    } 

}
