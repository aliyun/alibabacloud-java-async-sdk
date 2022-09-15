// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupRequest</p>
 */
public class CreateBackupRequest extends Request {
    @Query
    @NameInMap("BackupMethod")
    private String backupMethod;

    @Query
    @NameInMap("BackupStrategy")
    private String backupStrategy;

    @Query
    @NameInMap("BackupType")
    private String backupType;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DBName")
    private String DBName;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateBackupRequest(Builder builder) {
        super(builder);
        this.backupMethod = builder.backupMethod;
        this.backupStrategy = builder.backupStrategy;
        this.backupType = builder.backupType;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBName = builder.DBName;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupMethod
     */
    public String getBackupMethod() {
        return this.backupMethod;
    }

    /**
     * @return backupStrategy
     */
    public String getBackupStrategy() {
        return this.backupStrategy;
    }

    /**
     * @return backupType
     */
    public String getBackupType() {
        return this.backupType;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateBackupRequest, Builder> {
        private String backupMethod; 
        private String backupStrategy; 
        private String backupType; 
        private String DBInstanceId; 
        private String DBName; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackupRequest request) {
            super(request);
            this.backupMethod = request.backupMethod;
            this.backupStrategy = request.backupStrategy;
            this.backupType = request.backupType;
            this.DBInstanceId = request.DBInstanceId;
            this.DBName = request.DBName;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * BackupMethod.
         */
        public Builder backupMethod(String backupMethod) {
            this.putQueryParameter("BackupMethod", backupMethod);
            this.backupMethod = backupMethod;
            return this;
        }

        /**
         * BackupStrategy.
         */
        public Builder backupStrategy(String backupStrategy) {
            this.putQueryParameter("BackupStrategy", backupStrategy);
            this.backupStrategy = backupStrategy;
            return this;
        }

        /**
         * BackupType.
         */
        public Builder backupType(String backupType) {
            this.putQueryParameter("BackupType", backupType);
            this.backupType = backupType;
            return this;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
        public CreateBackupRequest build() {
            return new CreateBackupRequest(this);
        } 

    } 

}
