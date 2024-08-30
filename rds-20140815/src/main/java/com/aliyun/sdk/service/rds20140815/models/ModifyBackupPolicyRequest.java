// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupPolicyRequest</p>
 */
public class ModifyBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArchiveBackupKeepCount")
    private Integer archiveBackupKeepCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArchiveBackupKeepPolicy")
    private String archiveBackupKeepPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArchiveBackupRetentionPeriod")
    private String archiveBackupRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupInterval")
    private String backupInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupLog")
    private String backupLog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMethod")
    private String backupMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPolicyMode")
    private String backupPolicyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPriority")
    private Integer backupPriority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupRetentionPeriod")
    private String backupRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompressType")
    private String compressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableBackupLog")
    private String enableBackupLog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableIncrementDataBackup")
    private Boolean enableIncrementDataBackup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HighSpaceUsageProtection")
    private String highSpaceUsageProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalLogRetentionHours")
    private String localLogRetentionHours;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalLogRetentionSpace")
    private String localLogRetentionSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogBackupFrequency")
    private String logBackupFrequency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogBackupLocalRetentionNumber")
    private Integer logBackupLocalRetentionNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogBackupRetentionPeriod")
    private String logBackupRetentionPeriod;

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
    @com.aliyun.core.annotation.NameInMap("ReleasedKeepPolicy")
    private String releasedKeepPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyBackupPolicyRequest(Builder builder) {
        super(builder);
        this.archiveBackupKeepCount = builder.archiveBackupKeepCount;
        this.archiveBackupKeepPolicy = builder.archiveBackupKeepPolicy;
        this.archiveBackupRetentionPeriod = builder.archiveBackupRetentionPeriod;
        this.backupInterval = builder.backupInterval;
        this.backupLog = builder.backupLog;
        this.backupMethod = builder.backupMethod;
        this.backupPolicyMode = builder.backupPolicyMode;
        this.backupPriority = builder.backupPriority;
        this.backupRetentionPeriod = builder.backupRetentionPeriod;
        this.category = builder.category;
        this.compressType = builder.compressType;
        this.DBInstanceId = builder.DBInstanceId;
        this.enableBackupLog = builder.enableBackupLog;
        this.enableIncrementDataBackup = builder.enableIncrementDataBackup;
        this.highSpaceUsageProtection = builder.highSpaceUsageProtection;
        this.localLogRetentionHours = builder.localLogRetentionHours;
        this.localLogRetentionSpace = builder.localLogRetentionSpace;
        this.logBackupFrequency = builder.logBackupFrequency;
        this.logBackupLocalRetentionNumber = builder.logBackupLocalRetentionNumber;
        this.logBackupRetentionPeriod = builder.logBackupRetentionPeriod;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.releasedKeepPolicy = builder.releasedKeepPolicy;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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
     * @return archiveBackupKeepCount
     */
    public Integer getArchiveBackupKeepCount() {
        return this.archiveBackupKeepCount;
    }

    /**
     * @return archiveBackupKeepPolicy
     */
    public String getArchiveBackupKeepPolicy() {
        return this.archiveBackupKeepPolicy;
    }

    /**
     * @return archiveBackupRetentionPeriod
     */
    public String getArchiveBackupRetentionPeriod() {
        return this.archiveBackupRetentionPeriod;
    }

    /**
     * @return backupInterval
     */
    public String getBackupInterval() {
        return this.backupInterval;
    }

    /**
     * @return backupLog
     */
    public String getBackupLog() {
        return this.backupLog;
    }

    /**
     * @return backupMethod
     */
    public String getBackupMethod() {
        return this.backupMethod;
    }

    /**
     * @return backupPolicyMode
     */
    public String getBackupPolicyMode() {
        return this.backupPolicyMode;
    }

    /**
     * @return backupPriority
     */
    public Integer getBackupPriority() {
        return this.backupPriority;
    }

    /**
     * @return backupRetentionPeriod
     */
    public String getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return compressType
     */
    public String getCompressType() {
        return this.compressType;
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
    public String getEnableBackupLog() {
        return this.enableBackupLog;
    }

    /**
     * @return enableIncrementDataBackup
     */
    public Boolean getEnableIncrementDataBackup() {
        return this.enableIncrementDataBackup;
    }

    /**
     * @return highSpaceUsageProtection
     */
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
    }

    /**
     * @return localLogRetentionHours
     */
    public String getLocalLogRetentionHours() {
        return this.localLogRetentionHours;
    }

    /**
     * @return localLogRetentionSpace
     */
    public String getLocalLogRetentionSpace() {
        return this.localLogRetentionSpace;
    }

    /**
     * @return logBackupFrequency
     */
    public String getLogBackupFrequency() {
        return this.logBackupFrequency;
    }

    /**
     * @return logBackupLocalRetentionNumber
     */
    public Integer getLogBackupLocalRetentionNumber() {
        return this.logBackupLocalRetentionNumber;
    }

    /**
     * @return logBackupRetentionPeriod
     */
    public String getLogBackupRetentionPeriod() {
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
     * @return releasedKeepPolicy
     */
    public String getReleasedKeepPolicy() {
        return this.releasedKeepPolicy;
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

    public static final class Builder extends Request.Builder<ModifyBackupPolicyRequest, Builder> {
        private Integer archiveBackupKeepCount; 
        private String archiveBackupKeepPolicy; 
        private String archiveBackupRetentionPeriod; 
        private String backupInterval; 
        private String backupLog; 
        private String backupMethod; 
        private String backupPolicyMode; 
        private Integer backupPriority; 
        private String backupRetentionPeriod; 
        private String category; 
        private String compressType; 
        private String DBInstanceId; 
        private String enableBackupLog; 
        private Boolean enableIncrementDataBackup; 
        private String highSpaceUsageProtection; 
        private String localLogRetentionHours; 
        private String localLogRetentionSpace; 
        private String logBackupFrequency; 
        private Integer logBackupLocalRetentionNumber; 
        private String logBackupRetentionPeriod; 
        private String ownerAccount; 
        private Long ownerId; 
        private String preferredBackupPeriod; 
        private String preferredBackupTime; 
        private String releasedKeepPolicy; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupPolicyRequest request) {
            super(request);
            this.archiveBackupKeepCount = request.archiveBackupKeepCount;
            this.archiveBackupKeepPolicy = request.archiveBackupKeepPolicy;
            this.archiveBackupRetentionPeriod = request.archiveBackupRetentionPeriod;
            this.backupInterval = request.backupInterval;
            this.backupLog = request.backupLog;
            this.backupMethod = request.backupMethod;
            this.backupPolicyMode = request.backupPolicyMode;
            this.backupPriority = request.backupPriority;
            this.backupRetentionPeriod = request.backupRetentionPeriod;
            this.category = request.category;
            this.compressType = request.compressType;
            this.DBInstanceId = request.DBInstanceId;
            this.enableBackupLog = request.enableBackupLog;
            this.enableIncrementDataBackup = request.enableIncrementDataBackup;
            this.highSpaceUsageProtection = request.highSpaceUsageProtection;
            this.localLogRetentionHours = request.localLogRetentionHours;
            this.localLogRetentionSpace = request.localLogRetentionSpace;
            this.logBackupFrequency = request.logBackupFrequency;
            this.logBackupLocalRetentionNumber = request.logBackupLocalRetentionNumber;
            this.logBackupRetentionPeriod = request.logBackupRetentionPeriod;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.preferredBackupPeriod = request.preferredBackupPeriod;
            this.preferredBackupTime = request.preferredBackupTime;
            this.releasedKeepPolicy = request.releasedKeepPolicy;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The number of archived backup files that are retained. Default value: **1**. Valid values:
         * <p>
         * 
         * *   Valid values when **ArchiveBackupKeepPolicy** is set to **ByMonth**: **1** to **31**.
         * *   Valid values when **ArchiveBackupKeepPolicy** is set to **ByWeek**: **1** to **7**.
         * 
         * > *   You do not need to specify this parameter when **ArchiveBackupKeepPolicy** is set to **KeepAll**.
         * > *   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.
         */
        public Builder archiveBackupKeepCount(Integer archiveBackupKeepCount) {
            this.putQueryParameter("ArchiveBackupKeepCount", archiveBackupKeepCount);
            this.archiveBackupKeepCount = archiveBackupKeepCount;
            return this;
        }

        /**
         * The retention period of archived backup files. The number of archived backup files that can be retained within the specified retention period is specified by **ArchiveBackupKeepCount**. Default value: **0**. Valid values:
         * <p>
         * 
         * *   **ByMonth**
         * *   **ByWeek**
         * *   **KeepAll**
         * 
         * > This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.
         */
        public Builder archiveBackupKeepPolicy(String archiveBackupKeepPolicy) {
            this.putQueryParameter("ArchiveBackupKeepPolicy", archiveBackupKeepPolicy);
            this.archiveBackupKeepPolicy = archiveBackupKeepPolicy;
            return this;
        }

        /**
         * The number of days for which the archived backup is retained. The default value **0** specifies that the backup archiving feature is disabled. Valid values: **30** to **1095**.
         * <p>
         * 
         * > This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.
         */
        public Builder archiveBackupRetentionPeriod(String archiveBackupRetentionPeriod) {
            this.putQueryParameter("ArchiveBackupRetentionPeriod", archiveBackupRetentionPeriod);
            this.archiveBackupRetentionPeriod = archiveBackupRetentionPeriod;
            return this;
        }

        /**
         * The frequency at which you want to perform a snapshot backup on the instance. Valid values:
         * <p>
         * 
         * *   **-1**: No backup frequencies are specified.
         * *   **30**: A snapshot backup is performed every 30 minutes.
         * *   **60**: A snapshot backup is performed every 60 minutes.
         * *   **120**: A snapshot backup is performed every 120 minutes.
         * *   **240**: A snapshot backup is performed every 240 minutes.
         * *   **480**: A snapshot backup is performed every 480 minutes.
         * 
         * > *   You can configure a backup policy by using this parameter and the **PreferredBackupPeriod** parameter. For example, if you set **PreferredBackupPeriod** to Saturday,Sunday and BackupInterval to \*\*-1\*\*, a snapshot backup is performed on every Saturday and Sunday.
         * > *   If the instance runs PostgreSQL, BackupInterval is supported only when the instance is equipped with cloud disks.
         * > *   If the instance runs SQL Server, BackupInterval is supported only when the snapshot backup feature is enabled for the instance. For more information, see [Enable snapshot backups for an ApsaraDB RDS for SQL Server instance](~~211143~~).
         * > *   If **Category** is set to **Flash**, BackupInterval is invalid.
         * > *   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.
         */
        public Builder backupInterval(String backupInterval) {
            this.putQueryParameter("BackupInterval", backupInterval);
            this.backupInterval = backupInterval;
            return this;
        }

        /**
         * Specifies whether to enable the log backup feature. Valid values:
         * <p>
         * 
         * *   **Enable**: enables the feature.
         * *   **Disabled**: disables the feature.
         * 
         * > *   This parameter must be specified when **BackupPolicyMode** is set to **DataBackupPolicy**.
         * > *   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.
         */
        public Builder backupLog(String backupLog) {
            this.putQueryParameter("BackupLog", backupLog);
            this.backupLog = backupLog;
            return this;
        }

        /**
         * The backup method of the instance. Valid values:
         * <p>
         * 
         * *   **Physical**: physical backup
         * *   **Snapshot**: snapshot backup
         * 
         * Default value: **Physical**.
         * 
         * > *   This parameter takes effect only on instances that run SQL Server with cloud disks.
         * > *   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.
         */
        public Builder backupMethod(String backupMethod) {
            this.putQueryParameter("BackupMethod", backupMethod);
            this.backupMethod = backupMethod;
            return this;
        }

        /**
         * The type of the backup. Valid values:
         * <p>
         * 
         * *   **DataBackupPolicy**: data backup
         * *   **LogBackupPolicy**: log backup
         */
        public Builder backupPolicyMode(String backupPolicyMode) {
            this.putQueryParameter("BackupPolicyMode", backupPolicyMode);
            this.backupPolicyMode = backupPolicyMode;
            return this;
        }

        /**
         * Specifies whether the backup settings of a secondary instance are configured. Valid values:
         * <p>
         * 
         * *   **1**: secondary instance preferred
         * *   **2**: primary instance preferred
         * 
         * > *   This parameter is suitable only for instances that run SQL Server on RDS Cluster Edition.
         * > *   This parameter takes effect only when **BackupMethod** is set to **Physical**. If **BackupMethod** is set to **Snapshot**, backups are forcefully performed on the primary instance that runs SQL Server on RDS Cluster Edition.
         */
        public Builder backupPriority(Integer backupPriority) {
            this.putQueryParameter("BackupPriority", backupPriority);
            this.backupPriority = backupPriority;
            return this;
        }

        /**
         * The number of days for which you want to retain data backup files. Valid values: **7 to 730**.
         * <p>
         * 
         * > *   This parameter must be specified when **BackupPolicyMode** is set to **DataBackupPolicy**.
         * > *   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.
         */
        public Builder backupRetentionPeriod(String backupRetentionPeriod) {
            this.putQueryParameter("BackupRetentionPeriod", backupRetentionPeriod);
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * Specifies whether to enable the single-digit second backup feature. Valid values:
         * <p>
         * 
         * *   **Flash**: enables the feature.
         * *   **Standard**: disables the feature.
         * 
         * > This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The format that is used to compress backup data. Valid values:
         * <p>
         * 
         * *   **0**: Backups are not compressed.
         * *   **1**: The zlib tool is used to compress backups into .tar.gz files.
         * *   **2**: The zlib tool is used to compress backups in parallel.
         * *   **4**: The QuickLZ tool is used to compress backups into .xb.gz files. This compression format is supported for instances that run MySQL 5.6 or MySQL 5.7. Backups in this compression format can be used to restore individual databases and tables. For more information, see [Restore individual databases and tables of an ApsaraDB RDS for MySQL instance](~~103175~~).
         * *   **8**: The QuickLZ tool is used to compress backups into .xb.gz files. This compression format is supported only for instances that run MySQL 8.0. Backups in this compression format cannot be used to restore individual databases and tables.
         * 
         * > This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.
         */
        public Builder compressType(String compressType) {
            this.putQueryParameter("CompressType", compressType);
            this.compressType = compressType;
            return this;
        }

        /**
         * The instance ID. You can call the DescribeDBInstances operation to query the instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Specifies whether to enable the log backup feature. Valid values:
         * <p>
         * 
         * *   **True** or **1**: enables the log backup feature.
         * *   **False** or **0**: disables the log backup feature.
         * 
         * > 
         * 
         * *   You must specify this parameter when you set the **BackupPolicyMode** parameter to **LogBackupPolicy**.
         * 
         * *   This parameter takes effect only when you set the **BackupPolicyMode** parameter to **LogBackupPolicy**.
         */
        public Builder enableBackupLog(String enableBackupLog) {
            this.putQueryParameter("EnableBackupLog", enableBackupLog);
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * Specifies whether to enable incremental backup. Valid values:
         * <p>
         * 
         * *   **false** (default): disables the feature.
         * *   **true**: enables the feature.
         * 
         * > *   This parameter takes effect only on instances that run SQL Server with cloud disks.
         * > *   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.
         */
        public Builder enableIncrementDataBackup(Boolean enableIncrementDataBackup) {
            this.putQueryParameter("EnableIncrementDataBackup", enableIncrementDataBackup);
            this.enableIncrementDataBackup = enableIncrementDataBackup;
            return this;
        }

        /**
         * Specifies whether to forcefully delete log backup files from the instance when the storage usage of the instance exceeds 80% or the amount of remaining storage on the instance is less than 5 GB. Valid values: **Enable and Disable**. You can retain the default value.
         * <p>
         * 
         * > *   You must specify this parameter when you set the **BackupPolicyMode** parameter to **LogBackupPolicy**.
         * > *   This parameter takes effect only when you set the **BackupPolicyMode** parameter to **LogBackupPolicy**.
         */
        public Builder highSpaceUsageProtection(String highSpaceUsageProtection) {
            this.putQueryParameter("HighSpaceUsageProtection", highSpaceUsageProtection);
            this.highSpaceUsageProtection = highSpaceUsageProtection;
            return this;
        }

        /**
         * The number of hours for which you want to retain log backup files on the instance. Valid values: **0 to 168**. The value 0 specifies that log backup files are not retained on the instance. The value 168 is calculated based on the following formula: 7 × 24.
         * <p>
         * 
         * > *   This parameter must be specified when **BackupPolicyMode** is set to **LogBackupPolicy**.
         * > *   This parameter takes effect only when **BackupPolicyMode** is set to **LogBackupPolicy**.
         */
        public Builder localLogRetentionHours(String localLogRetentionHours) {
            this.putQueryParameter("LocalLogRetentionHours", localLogRetentionHours);
            this.localLogRetentionHours = localLogRetentionHours;
            return this;
        }

        /**
         * The maximum storage usage that is allowed for log backup files on the instance. If the storage usage for log backup files on the instance exceeds the value of this parameter, the system deletes earlier log backup files until the storage usage falls below the value of this parameter. Valid values:**0 to 50**. You can retain the default value.
         * <p>
         * 
         * > *   This parameter must be specified when **BackupPolicyMode** is set to **LogBackupPolicy**.
         * > *   This parameter takes effect only when **BackupPolicyMode** is set to **LogBackupPolicy**.
         */
        public Builder localLogRetentionSpace(String localLogRetentionSpace) {
            this.putQueryParameter("LocalLogRetentionSpace", localLogRetentionSpace);
            this.localLogRetentionSpace = localLogRetentionSpace;
            return this;
        }

        /**
         * The frequency at which you want to back up the logs of the instance. Valid values:
         * <p>
         * 
         * *   **LogInterval**: A log backup is performed every 30 minutes.
         * *   The default value is the same as the data backup frequency.
         * 
         * > *   The value **LogInterval** is supported only for instances that run SQL Server.
         * > *   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.
         */
        public Builder logBackupFrequency(String logBackupFrequency) {
            this.putQueryParameter("LogBackupFrequency", logBackupFrequency);
            this.logBackupFrequency = logBackupFrequency;
            return this;
        }

        /**
         * The number of binary log files that you want to retain on the instance. Default value: **60**. Valid values: **6** to **100**.
         * <p>
         * 
         * > 
         * 
         * *   This parameter takes effect only when you set the **BackupPolicyMode** parameter to **LogBackupPolicy**.
         * 
         * *   If the instance runs MySQL, you can set this parameter to \*\*-1\*\*. The value \*\*-1\*\* specifies that an unlimited number of binary log files can be retained on the instance.
         */
        public Builder logBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
            this.putQueryParameter("LogBackupLocalRetentionNumber", logBackupLocalRetentionNumber);
            this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
            return this;
        }

        /**
         * The number of days for which the log backup is retained. Valid values: **7 to 730**. The log backup retention period cannot be longer than the data backup retention period.
         * <p>
         * 
         * > *   If you enable the log backup feature, you can specify the log backup retention period. This parameter is supported for instances that run MySQL and PostgreSQL.
         * > *   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy** or **LogBackupPolicy**.
         */
        public Builder logBackupRetentionPeriod(String logBackupRetentionPeriod) {
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
         * The backup cycle. Specify at least two days of the week and separate the days with commas (,). Valid values:
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
         * > *   You can configure a backup policy by using this parameter and the **BackupInterval** parameter. For example, if you set this parameter to Saturday,Sunday and the **BackupInterval** parameter to 30, a backup is performed every 30 minutes on every Saturday and Sunday.
         * > *   This parameter must be specified when **BackupPolicyMode** is set to **DataBackupPolicy**.
         * > *   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * The time at which you want to perform a backup. Specify the time in the ISO 8601 standard in the *HH:mm*Z-*HH:mm*Z format. The time must be in UTC.
         * <p>
         * 
         * > *   This parameter must be specified when **BackupPolicyMode** is set to **DataBackupPolicy**.
         * > *   This parameter takes effect only when **BackupPolicyMode** is set to **DataBackupPolicy**.
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.putQueryParameter("PreferredBackupTime", preferredBackupTime);
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * The policy that is used to retain archived backup files if the instance is released. Valid values:
         * <p>
         * 
         * *   **None**: No archived backup files are retained.
         * *   **Lastest**: Only the last archived backup file is retained.
         * *   **All**: All archived backup files are retained.
         * 
         * > *   This parameter takes effect only when you set the **BackupPolicyMode** parameter to **DataBackupPolicy**.
         * > *   If the instance uses cloud disks and was created on or after February 1, 2024, this parameter is automatically set to **Lastest**. If the instance uses local disks in the same scenario, this parameter is automatically set to **None**. For more information, see [Backup for deleted instances](~~2836955~~).
         */
        public Builder releasedKeepPolicy(String releasedKeepPolicy) {
            this.putQueryParameter("ReleasedKeepPolicy", releasedKeepPolicy);
            this.releasedKeepPolicy = releasedKeepPolicy;
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
        public ModifyBackupPolicyRequest build() {
            return new ModifyBackupPolicyRequest(this);
        } 

    } 

}
