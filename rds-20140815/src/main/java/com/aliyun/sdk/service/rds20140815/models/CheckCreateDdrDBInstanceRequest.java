// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckCreateDdrDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CheckCreateDdrDBInstanceRequest</p>
 */
public class CheckCreateDdrDBInstanceRequest extends Request {
    @Query
    @NameInMap("BackupSetId")
    private String backupSetId;

    @Query
    @NameInMap("DBInstanceClass")
    @Validation(required = true)
    private String DBInstanceClass;

    @Query
    @NameInMap("DBInstanceStorage")
    @Validation(required = true)
    private Integer DBInstanceStorage;

    @Query
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("EngineVersion")
    @Validation(required = true)
    private String engineVersion;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RestoreTime")
    private String restoreTime;

    @Query
    @NameInMap("RestoreType")
    @Validation(required = true)
    private String restoreType;

    @Query
    @NameInMap("SourceDBInstanceName")
    private String sourceDBInstanceName;

    @Query
    @NameInMap("SourceRegion")
    private String sourceRegion;

    private CheckCreateDdrDBInstanceRequest(Builder builder) {
        super(builder);
        this.backupSetId = builder.backupSetId;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceStorage = builder.DBInstanceStorage;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.restoreType = builder.restoreType;
        this.sourceDBInstanceName = builder.sourceDBInstanceName;
        this.sourceRegion = builder.sourceRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCreateDdrDBInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return DBInstanceStorage
     */
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return restoreTime
     */
    public String getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return restoreType
     */
    public String getRestoreType() {
        return this.restoreType;
    }

    /**
     * @return sourceDBInstanceName
     */
    public String getSourceDBInstanceName() {
        return this.sourceDBInstanceName;
    }

    /**
     * @return sourceRegion
     */
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    public static final class Builder extends Request.Builder<CheckCreateDdrDBInstanceRequest, Builder> {
        private String backupSetId; 
        private String DBInstanceClass; 
        private Integer DBInstanceStorage; 
        private String engine; 
        private String engineVersion; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String restoreType; 
        private String sourceDBInstanceName; 
        private String sourceRegion; 

        private Builder() {
            super();
        } 

        private Builder(CheckCreateDdrDBInstanceRequest request) {
            super(request);
            this.backupSetId = request.backupSetId;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceStorage = request.DBInstanceStorage;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.restoreType = request.restoreType;
            this.sourceDBInstanceName = request.sourceDBInstanceName;
            this.sourceRegion = request.sourceRegion;
        } 

        /**
         * BackupSetId.
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * DBInstanceClass.
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * DBInstanceStorage.
         */
        public Builder DBInstanceStorage(Integer DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * EngineVersion.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * RestoreTime.
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * RestoreType.
         */
        public Builder restoreType(String restoreType) {
            this.putQueryParameter("RestoreType", restoreType);
            this.restoreType = restoreType;
            return this;
        }

        /**
         * SourceDBInstanceName.
         */
        public Builder sourceDBInstanceName(String sourceDBInstanceName) {
            this.putQueryParameter("SourceDBInstanceName", sourceDBInstanceName);
            this.sourceDBInstanceName = sourceDBInstanceName;
            return this;
        }

        /**
         * SourceRegion.
         */
        public Builder sourceRegion(String sourceRegion) {
            this.putQueryParameter("SourceRegion", sourceRegion);
            this.sourceRegion = sourceRegion;
            return this;
        }

        @Override
        public CheckCreateDdrDBInstanceRequest build() {
            return new CheckCreateDdrDBInstanceRequest(this);
        } 

    } 

}
