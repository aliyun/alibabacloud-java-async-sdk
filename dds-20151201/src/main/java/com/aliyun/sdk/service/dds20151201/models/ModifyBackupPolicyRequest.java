// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupPolicyRequest</p>
 */
public class ModifyBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupInterval")
    private String backupInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupRetentionPeriod")
    private Long backupRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupRetentionPolicyOnClusterDeletion")
    private Integer backupRetentionPolicyOnClusterDeletion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossBackupPeriod")
    private String crossBackupPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossBackupType")
    private String crossBackupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossLogRetentionType")
    private String crossLogRetentionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossLogRetentionValue")
    private Integer crossLogRetentionValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossRetentionType")
    private String crossRetentionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossRetentionValue")
    private Integer crossRetentionValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestRegion")
    private String destRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableBackupLog")
    private Long enableBackupLog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableCrossLogBackup")
    private Integer enableCrossLogBackup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HighFrequencyBackupRetention")
    private Long highFrequencyBackupRetention;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogBackupRetentionPeriod")
    private Long logBackupRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotBackupType")
    private String snapshotBackupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcRegion")
    private String srcRegion;

    private ModifyBackupPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupInterval = builder.backupInterval;
        this.backupRetentionPeriod = builder.backupRetentionPeriod;
        this.backupRetentionPolicyOnClusterDeletion = builder.backupRetentionPolicyOnClusterDeletion;
        this.crossBackupPeriod = builder.crossBackupPeriod;
        this.crossBackupType = builder.crossBackupType;
        this.crossLogRetentionType = builder.crossLogRetentionType;
        this.crossLogRetentionValue = builder.crossLogRetentionValue;
        this.crossRetentionType = builder.crossRetentionType;
        this.crossRetentionValue = builder.crossRetentionValue;
        this.DBInstanceId = builder.DBInstanceId;
        this.destRegion = builder.destRegion;
        this.enableBackupLog = builder.enableBackupLog;
        this.enableCrossLogBackup = builder.enableCrossLogBackup;
        this.highFrequencyBackupRetention = builder.highFrequencyBackupRetention;
        this.instanceType = builder.instanceType;
        this.logBackupRetentionPeriod = builder.logBackupRetentionPeriod;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.snapshotBackupType = builder.snapshotBackupType;
        this.srcRegion = builder.srcRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return backupInterval
     */
    public String getBackupInterval() {
        return this.backupInterval;
    }

    /**
     * @return backupRetentionPeriod
     */
    public Long getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * @return backupRetentionPolicyOnClusterDeletion
     */
    public Integer getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    /**
     * @return crossBackupPeriod
     */
    public String getCrossBackupPeriod() {
        return this.crossBackupPeriod;
    }

    /**
     * @return crossBackupType
     */
    public String getCrossBackupType() {
        return this.crossBackupType;
    }

    /**
     * @return crossLogRetentionType
     */
    public String getCrossLogRetentionType() {
        return this.crossLogRetentionType;
    }

    /**
     * @return crossLogRetentionValue
     */
    public Integer getCrossLogRetentionValue() {
        return this.crossLogRetentionValue;
    }

    /**
     * @return crossRetentionType
     */
    public String getCrossRetentionType() {
        return this.crossRetentionType;
    }

    /**
     * @return crossRetentionValue
     */
    public Integer getCrossRetentionValue() {
        return this.crossRetentionValue;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return destRegion
     */
    public String getDestRegion() {
        return this.destRegion;
    }

    /**
     * @return enableBackupLog
     */
    public Long getEnableBackupLog() {
        return this.enableBackupLog;
    }

    /**
     * @return enableCrossLogBackup
     */
    public Integer getEnableCrossLogBackup() {
        return this.enableCrossLogBackup;
    }

    /**
     * @return highFrequencyBackupRetention
     */
    public Long getHighFrequencyBackupRetention() {
        return this.highFrequencyBackupRetention;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return logBackupRetentionPeriod
     */
    public Long getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
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
     * @return preferredBackupPeriod
     */
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    /**
     * @return preferredBackupTime
     */
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
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
     * @return snapshotBackupType
     */
    public String getSnapshotBackupType() {
        return this.snapshotBackupType;
    }

    /**
     * @return srcRegion
     */
    public String getSrcRegion() {
        return this.srcRegion;
    }

    public static final class Builder extends Request.Builder<ModifyBackupPolicyRequest, Builder> {
        private String regionId; 
        private String backupInterval; 
        private Long backupRetentionPeriod; 
        private Integer backupRetentionPolicyOnClusterDeletion; 
        private String crossBackupPeriod; 
        private String crossBackupType; 
        private String crossLogRetentionType; 
        private Integer crossLogRetentionValue; 
        private String crossRetentionType; 
        private Integer crossRetentionValue; 
        private String DBInstanceId; 
        private String destRegion; 
        private Long enableBackupLog; 
        private Integer enableCrossLogBackup; 
        private Long highFrequencyBackupRetention; 
        private String instanceType; 
        private Long logBackupRetentionPeriod; 
        private String ownerAccount; 
        private Long ownerId; 
        private String preferredBackupPeriod; 
        private String preferredBackupTime; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String snapshotBackupType; 
        private String srcRegion; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupInterval = request.backupInterval;
            this.backupRetentionPeriod = request.backupRetentionPeriod;
            this.backupRetentionPolicyOnClusterDeletion = request.backupRetentionPolicyOnClusterDeletion;
            this.crossBackupPeriod = request.crossBackupPeriod;
            this.crossBackupType = request.crossBackupType;
            this.crossLogRetentionType = request.crossLogRetentionType;
            this.crossLogRetentionValue = request.crossLogRetentionValue;
            this.crossRetentionType = request.crossRetentionType;
            this.crossRetentionValue = request.crossRetentionValue;
            this.DBInstanceId = request.DBInstanceId;
            this.destRegion = request.destRegion;
            this.enableBackupLog = request.enableBackupLog;
            this.enableCrossLogBackup = request.enableCrossLogBackup;
            this.highFrequencyBackupRetention = request.highFrequencyBackupRetention;
            this.instanceType = request.instanceType;
            this.logBackupRetentionPeriod = request.logBackupRetentionPeriod;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.preferredBackupPeriod = request.preferredBackupPeriod;
            this.preferredBackupTime = request.preferredBackupTime;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.snapshotBackupType = request.snapshotBackupType;
            this.srcRegion = request.srcRegion;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The frequency at which high-frequency backup is created. Valid values:
         * <p>
         * 
         * *   **-1**: High-frequency backup is disabled.
         * *   **30**: High-frequency backups are generated every 30 minutes.
         * *   **60**: High-frequency backups are generated every 1 hour.
         * *   **120**: High-frequency backups are generated every 2 hours.
         * *   **180**: High-frequency backups are generated every 3 hours.
         * *   **240**: High-frequency backups are generated every 4 hours.
         * *   **360**: High-frequency backups are generated every 6 hours.
         * *   **480**: High-frequency backups are generated every 8 hours.
         * *   **720**: High-frequency backups are generated every 12 hours.
         * 
         * > 
         * 
         * *   If the **SnapshotBackupType** parameter is set to **Standard**, this parameter is set to -1 and cannot be changed.
         * 
         * *   High-frequency backup takes effect only when the **SnapshotBackupType** parameter is set to **Flash** and the value of this parameter is greater than 0.
         */
        public Builder backupInterval(String backupInterval) {
            this.putQueryParameter("BackupInterval", backupInterval);
            this.backupInterval = backupInterval;
            return this;
        }

        /**
         * The retention period of full backups.
         * <p>
         * 
         * > 
         * 
         * *   If your instance is created before September 10, 2021, backups are retained for seven days by default.
         * 
         * *   If your instance is created after September 10, 2021, backups are retained for 30 days by default.
         */
        public Builder backupRetentionPeriod(Long backupRetentionPeriod) {
            this.putQueryParameter("BackupRetentionPeriod", backupRetentionPeriod);
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * BackupRetentionPolicyOnClusterDeletion.
         */
        public Builder backupRetentionPolicyOnClusterDeletion(Integer backupRetentionPolicyOnClusterDeletion) {
            this.putQueryParameter("BackupRetentionPolicyOnClusterDeletion", backupRetentionPolicyOnClusterDeletion);
            this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
            return this;
        }

        /**
         * CrossBackupPeriod.
         */
        public Builder crossBackupPeriod(String crossBackupPeriod) {
            this.putQueryParameter("CrossBackupPeriod", crossBackupPeriod);
            this.crossBackupPeriod = crossBackupPeriod;
            return this;
        }

        /**
         * CrossBackupType.
         */
        public Builder crossBackupType(String crossBackupType) {
            this.putQueryParameter("CrossBackupType", crossBackupType);
            this.crossBackupType = crossBackupType;
            return this;
        }

        /**
         * CrossLogRetentionType.
         */
        public Builder crossLogRetentionType(String crossLogRetentionType) {
            this.putQueryParameter("CrossLogRetentionType", crossLogRetentionType);
            this.crossLogRetentionType = crossLogRetentionType;
            return this;
        }

        /**
         * CrossLogRetentionValue.
         */
        public Builder crossLogRetentionValue(Integer crossLogRetentionValue) {
            this.putQueryParameter("CrossLogRetentionValue", crossLogRetentionValue);
            this.crossLogRetentionValue = crossLogRetentionValue;
            return this;
        }

        /**
         * CrossRetentionType.
         */
        public Builder crossRetentionType(String crossRetentionType) {
            this.putQueryParameter("CrossRetentionType", crossRetentionType);
            this.crossRetentionType = crossRetentionType;
            return this;
        }

        /**
         * CrossRetentionValue.
         */
        public Builder crossRetentionValue(Integer crossRetentionValue) {
            this.putQueryParameter("CrossRetentionValue", crossRetentionValue);
            this.crossRetentionValue = crossRetentionValue;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DestRegion.
         */
        public Builder destRegion(String destRegion) {
            this.putQueryParameter("DestRegion", destRegion);
            this.destRegion = destRegion;
            return this;
        }

        /**
         * Specifies whether to enable the log backup feature. Valid values:
         * <p>
         * 
         * *   **0** (default): The log backup feature is disabled.
         * *   **1**: The log backup feature is enabled.
         */
        public Builder enableBackupLog(Long enableBackupLog) {
            this.putQueryParameter("EnableBackupLog", enableBackupLog);
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * EnableCrossLogBackup.
         */
        public Builder enableCrossLogBackup(Integer enableCrossLogBackup) {
            this.putQueryParameter("EnableCrossLogBackup", enableCrossLogBackup);
            this.enableCrossLogBackup = enableCrossLogBackup;
            return this;
        }

        /**
         * The number of days for which high-frequency backups are retained. Before you use this parameter, make sure that you specify the BackupInterval parameter. By default, high-frequency backups are retained for one day.
         */
        public Builder highFrequencyBackupRetention(Long highFrequencyBackupRetention) {
            this.putQueryParameter("HighFrequencyBackupRetention", highFrequencyBackupRetention);
            this.highFrequencyBackupRetention = highFrequencyBackupRetention;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The number of days for which log backups are retained. Default value: 7.
         * <p>
         * 
         * Valid values: 7 to 730.
         */
        public Builder logBackupRetentionPeriod(Long logBackupRetentionPeriod) {
            this.putQueryParameter("LogBackupRetentionPeriod", logBackupRetentionPeriod);
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
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
         * The day of a week when the system regularly backs up data. Valid values:
         * <p>
         * 
         * *   **Monday**
         * *   **Tuesday**
         * *   **Wednesday**
         * *   **Thursday**
         * *   **Friday**
         * *   **Saturday**
         * *   **Sunday**
         * 
         * >  Separate multiple values with commas (,).
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * The start time of the backup. Specify the time in the ISO 8601 standard in the *HH:mm*Z-*HH:mm*Z format. The time must be in UTC.
         * <p>
         * 
         * >  The time range is 1 hour.
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.putQueryParameter("PreferredBackupTime", preferredBackupTime);
            this.preferredBackupTime = preferredBackupTime;
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
         * The snapshot backup type. Valid values:
         * <p>
         * 
         * *   **Flash**: single-digit second backup
         * *   **Standard** (default): standard backup
         */
        public Builder snapshotBackupType(String snapshotBackupType) {
            this.putQueryParameter("SnapshotBackupType", snapshotBackupType);
            this.snapshotBackupType = snapshotBackupType;
            return this;
        }

        /**
         * SrcRegion.
         */
        public Builder srcRegion(String srcRegion) {
            this.putQueryParameter("SrcRegion", srcRegion);
            this.srcRegion = srcRegion;
            return this;
        }

        @Override
        public ModifyBackupPolicyRequest build() {
            return new ModifyBackupPolicyRequest(this);
        } 

    } 

}
