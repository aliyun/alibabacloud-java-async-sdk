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
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

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
        this.resourceGroupId = builder.resourceGroupId;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
        private String resourceGroupId; 
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
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.restoreType = request.restoreType;
            this.sourceDBInstanceName = request.sourceDBInstanceName;
            this.sourceRegion = request.sourceRegion;
        } 

        /**
         * The ID of the backup set that is used for the restoration. You can call the DescribeCrossRegionBackups operation to query the backup set ID.
         * <p>
         * 
         * >  This parameter must be specified when the **RestoreType** parameter is set to **0**.
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * The instance type of the destination instance. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~).
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * The storage capacity of the destination instance. Valid values: **5 to 2000**. Unit: GB. You can increase the storage capacity in increments of 5 GB. For more information, see [Primary instance types](~~26312~~).
         */
        public Builder DBInstanceStorage(Integer DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * The database engine of the destination instance. Valid values:
         * <p>
         * 
         * *   **MySQL**
         * *   **SQLServer**
         * *   **PostgreSQL**
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The major engine version of the destination instance. The value of this parameter varies based on the value of **Engine**.
         * <p>
         * 
         * *   Valid values when Engine is set to MySQL: **5.5, 5.6, 5.7, and 8.0**
         * *   Valid values when Engine is set to SQLServer: **2008r2, 08r2\_ent_ha, 2012, 2012\_ent_ha, 2012\_std_ha, 2012\_web, 2014\_std_ha, 2016\_ent_ha, 2016\_std_ha, 2016\_web, 2017\_std_ha, 2017\_ent, 2019\_std_ha, and 2019\_ent**
         * *   PostgreSQL: **10.0, 11.0, 12.0, 13.0, 14.0, and 15.0**
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
         * The region ID of the destination instance. You can call the DescribeRegions operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The resource group ID. You can call the DescribeDBInstanceAttribute to query the resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * The point in time to which you want to restore data. The point in time that you specify must be earlier than the current time. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         * <p>
         * 
         * > If you set **RestoreType** to **1**, you must also specify this parameter.
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * The method that is used to restore data. Valid values:
         * <p>
         * 
         * *   **0**: restores data from a backup set. If you set this parameter to 0, you must also specify the **BackupSetId** parameter.
         * *   **1**: restores data to a point in time. If you set this parameter to 1, you must also specify the **RestoreTime**, **SourceRegion**, and **SourceDBInstanceName** parameters.
         * 
         * Default value: **0**.
         */
        public Builder restoreType(String restoreType) {
            this.putQueryParameter("RestoreType", restoreType);
            this.restoreType = restoreType;
            return this;
        }

        /**
         * The ID of the source instance if you want to restore data to a point in time.
         * <p>
         * 
         * >  This parameter must be specified when the **RestoreType** parameter is set to **1**.
         */
        public Builder sourceDBInstanceName(String sourceDBInstanceName) {
            this.putQueryParameter("SourceDBInstanceName", sourceDBInstanceName);
            this.sourceDBInstanceName = sourceDBInstanceName;
            return this;
        }

        /**
         * The region ID of the source instance if you want to restore data to a point in time.
         * <p>
         * 
         * > If you set **RestoreType** to **1**, you must also specify this parameter.
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
