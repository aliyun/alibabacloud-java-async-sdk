// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupPolicyRequest</p>
 */
public class ModifyBackupPolicyRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("BackupInterval")
    private String backupInterval;

    @Query
    @NameInMap("BackupRetentionPeriod")
    private Long backupRetentionPeriod;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("EnableBackupLog")
    private Long enableBackupLog;

    @Query
    @NameInMap("HighFrequencyBackupRetention")
    private Long highFrequencyBackupRetention;

    @Query
    @NameInMap("LogBackupRetentionPeriod")
    private Long logBackupRetentionPeriod;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PreferredBackupPeriod")
    @Validation(required = true)
    private String preferredBackupPeriod;

    @Query
    @NameInMap("PreferredBackupTime")
    @Validation(required = true)
    private String preferredBackupTime;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SnapshotBackupType")
    private String snapshotBackupType;

    private ModifyBackupPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupInterval = builder.backupInterval;
        this.backupRetentionPeriod = builder.backupRetentionPeriod;
        this.DBInstanceId = builder.DBInstanceId;
        this.enableBackupLog = builder.enableBackupLog;
        this.highFrequencyBackupRetention = builder.highFrequencyBackupRetention;
        this.logBackupRetentionPeriod = builder.logBackupRetentionPeriod;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.snapshotBackupType = builder.snapshotBackupType;
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return enableBackupLog
     */
    public Long getEnableBackupLog() {
        return this.enableBackupLog;
    }

    /**
     * @return highFrequencyBackupRetention
     */
    public Long getHighFrequencyBackupRetention() {
        return this.highFrequencyBackupRetention;
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

    public static final class Builder extends Request.Builder<ModifyBackupPolicyRequest, Builder> {
        private String regionId; 
        private String backupInterval; 
        private Long backupRetentionPeriod; 
        private String DBInstanceId; 
        private Long enableBackupLog; 
        private Long highFrequencyBackupRetention; 
        private Long logBackupRetentionPeriod; 
        private String ownerAccount; 
        private Long ownerId; 
        private String preferredBackupPeriod; 
        private String preferredBackupTime; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String snapshotBackupType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupInterval = request.backupInterval;
            this.backupRetentionPeriod = request.backupRetentionPeriod;
            this.DBInstanceId = request.DBInstanceId;
            this.enableBackupLog = request.enableBackupLog;
            this.highFrequencyBackupRetention = request.highFrequencyBackupRetention;
            this.logBackupRetentionPeriod = request.logBackupRetentionPeriod;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.preferredBackupPeriod = request.preferredBackupPeriod;
            this.preferredBackupTime = request.preferredBackupTime;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.snapshotBackupType = request.snapshotBackupType;
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
         * The frequency at which high-frequency backups are created. Valid values:
         * <p>
         * 
         * *   **-1**: disables high-frequency backup.
         * *   **15**: every 15 minutes.
         * *   **30**: every 30 minutes.
         * *   **60**: every hour.
         * *   **120**: every 2 hours.
         * *   **180**: every 3 hours.
         * *   **240**: every 4 hours.
         * *   **360**: every 6 hours.
         * *   **480**: every 8 hours.
         * *   **720**: every 12 hours.
         * 
         * > * If **SnapshotBackupType** is set to **Standard**, this parameter is set to **-1** and cannot be changed.
         * > * High-frequency backup takes effect only when **SnapshotBackupType** is set to **Flash** and the value of this parameter is greater than 0.
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
         * > * If your instance is created before September 10, 2021, backups are retained for seven days by default.
         * > * If your instance is created after September 10, 2021, backups are retained for 30 days by default.
         */
        public Builder backupRetentionPeriod(Long backupRetentionPeriod) {
            this.putQueryParameter("BackupRetentionPeriod", backupRetentionPeriod);
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Specifies whether to enable log backup. Default value: 0. Valid values:
         * <p>
         * 
         * *   **0**: disables log backup.
         * *   **1**: enables log backup.
         */
        public Builder enableBackupLog(Long enableBackupLog) {
            this.putQueryParameter("EnableBackupLog", enableBackupLog);
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * HighFrequencyBackupRetention.
         */
        public Builder highFrequencyBackupRetention(Long highFrequencyBackupRetention) {
            this.putQueryParameter("HighFrequencyBackupRetention", highFrequencyBackupRetention);
            this.highFrequencyBackupRetention = highFrequencyBackupRetention;
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
         * The day of a week on which to back up data. Valid values:
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
         * The time range to back up data. Specify the time in the *HH:mm*Z-*HH:mm*Z format. The time must be in UTC.
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
         * The snapshot backup type. Default value: Standard. Valid values:
         * <p>
         * 
         * *   **Flash**: single-digit second backup
         * *   **Standard**: standard backup
         */
        public Builder snapshotBackupType(String snapshotBackupType) {
            this.putQueryParameter("SnapshotBackupType", snapshotBackupType);
            this.snapshotBackupType = snapshotBackupType;
            return this;
        }

        @Override
        public ModifyBackupPolicyRequest build() {
            return new ModifyBackupPolicyRequest(this);
        } 

    } 

}
