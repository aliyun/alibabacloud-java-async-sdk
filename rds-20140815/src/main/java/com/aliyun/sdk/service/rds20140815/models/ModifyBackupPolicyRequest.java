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
 * {@link ModifyBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupPolicyRequest</p>
 */
public class ModifyBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdvancedDataPolicies")
    private java.util.List<AdvancedDataPolicies> advancedDataPolicies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdvancedLogPolicies")
    private java.util.List<AdvancedLogPolicies> advancedLogPolicies;

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
    @com.aliyun.core.annotation.NameInMap("EnableAdvancedBackupPolicy")
    private Integer enableAdvancedBackupPolicy;

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
        this.advancedDataPolicies = builder.advancedDataPolicies;
        this.advancedLogPolicies = builder.advancedLogPolicies;
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
        this.enableAdvancedBackupPolicy = builder.enableAdvancedBackupPolicy;
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
     * @return advancedDataPolicies
     */
    public java.util.List<AdvancedDataPolicies> getAdvancedDataPolicies() {
        return this.advancedDataPolicies;
    }

    /**
     * @return advancedLogPolicies
     */
    public java.util.List<AdvancedLogPolicies> getAdvancedLogPolicies() {
        return this.advancedLogPolicies;
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
     * @return enableAdvancedBackupPolicy
     */
    public Integer getEnableAdvancedBackupPolicy() {
        return this.enableAdvancedBackupPolicy;
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
        private java.util.List<AdvancedDataPolicies> advancedDataPolicies; 
        private java.util.List<AdvancedLogPolicies> advancedLogPolicies; 
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
        private Integer enableAdvancedBackupPolicy; 
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
            this.advancedDataPolicies = request.advancedDataPolicies;
            this.advancedLogPolicies = request.advancedLogPolicies;
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
            this.enableAdvancedBackupPolicy = request.enableAdvancedBackupPolicy;
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
         * AdvancedDataPolicies.
         */
        public Builder advancedDataPolicies(java.util.List<AdvancedDataPolicies> advancedDataPolicies) {
            this.putQueryParameter("AdvancedDataPolicies", advancedDataPolicies);
            this.advancedDataPolicies = advancedDataPolicies;
            return this;
        }

        /**
         * AdvancedLogPolicies.
         */
        public Builder advancedLogPolicies(java.util.List<AdvancedLogPolicies> advancedLogPolicies) {
            this.putQueryParameter("AdvancedLogPolicies", advancedLogPolicies);
            this.advancedLogPolicies = advancedLogPolicies;
            return this;
        }

        /**
         * <p>The number of archived backup files that are retained. Default value: <strong>1</strong>. Valid values:</p>
         * <ul>
         * <li>Valid values when <strong>ArchiveBackupKeepPolicy</strong> is set to <strong>ByMonth</strong>: <strong>1</strong> to <strong>31</strong>.</li>
         * <li>Valid values when <strong>ArchiveBackupKeepPolicy</strong> is set to <strong>ByWeek</strong>: <strong>1</strong> to <strong>7</strong>.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You do not need to specify this parameter when <strong>ArchiveBackupKeepPolicy</strong> is set to <strong>KeepAll</strong>.</li>
         * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder archiveBackupKeepCount(Integer archiveBackupKeepCount) {
            this.putQueryParameter("ArchiveBackupKeepCount", archiveBackupKeepCount);
            this.archiveBackupKeepCount = archiveBackupKeepCount;
            return this;
        }

        /**
         * <p>The retention period of archived backup files. The number of archived backup files that can be retained within the specified retention period is specified by <strong>ArchiveBackupKeepCount</strong>. Default value: <strong>0</strong>. Valid values:</p>
         * <ul>
         * <li><strong>ByMonth</strong></li>
         * <li><strong>ByWeek</strong></li>
         * <li><strong>KeepAll</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ByMonth</p>
         */
        public Builder archiveBackupKeepPolicy(String archiveBackupKeepPolicy) {
            this.putQueryParameter("ArchiveBackupKeepPolicy", archiveBackupKeepPolicy);
            this.archiveBackupKeepPolicy = archiveBackupKeepPolicy;
            return this;
        }

        /**
         * <p>The number of days for which the archived backup is retained. The default value <strong>0</strong> specifies that the backup archiving feature is disabled. Valid values: <strong>30</strong> to <strong>1095</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>365</p>
         */
        public Builder archiveBackupRetentionPeriod(String archiveBackupRetentionPeriod) {
            this.putQueryParameter("ArchiveBackupRetentionPeriod", archiveBackupRetentionPeriod);
            this.archiveBackupRetentionPeriod = archiveBackupRetentionPeriod;
            return this;
        }

        /**
         * <p>The frequency at which you want to perform a snapshot backup on the instance. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: No backup frequencies are specified.</li>
         * <li><strong>30</strong>: A snapshot backup is performed every 30 minutes.</li>
         * <li><strong>60</strong>: A snapshot backup is performed every 60 minutes.</li>
         * <li><strong>120</strong>: A snapshot backup is performed every 120 minutes.</li>
         * <li><strong>240</strong>: A snapshot backup is performed every 240 minutes.</li>
         * <li><strong>480</strong>: A snapshot backup is performed every 480 minutes.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You can configure a backup policy by using this parameter and the <strong>PreferredBackupPeriod</strong> parameter. For example, if you set <strong>PreferredBackupPeriod</strong> to Saturday,Sunday and BackupInterval to **-1**, a snapshot backup is performed on every Saturday and Sunday.</li>
         * <li>If the instance runs PostgreSQL, BackupInterval is supported only when the instance is equipped with cloud disks.</li>
         * <li>If the instance runs SQL Server, BackupInterval is supported only when the snapshot backup feature is enabled for the instance. For more information, see <a href="https://help.aliyun.com/document_detail/211143.html">Enable snapshot backups for an ApsaraDB RDS for SQL Server instance</a>.</li>
         * <li>If <strong>Category</strong> is set to <strong>Flash</strong>, BackupInterval is invalid.</li>
         * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder backupInterval(String backupInterval) {
            this.putQueryParameter("BackupInterval", backupInterval);
            this.backupInterval = backupInterval;
            return this;
        }

        /**
         * <p>Specifies whether to enable the log backup feature. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: enables the feature.</li>
         * <li><strong>Disabled</strong>: disables the feature.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter must be specified when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
         * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder backupLog(String backupLog) {
            this.putQueryParameter("BackupLog", backupLog);
            this.backupLog = backupLog;
            return this;
        }

        /**
         * <p>The backup method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Physical</strong>: physical backup</li>
         * <li><strong>Snapshot</strong>: snapshot backup</li>
         * </ul>
         * <p>Default value: <strong>Physical</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only on instances that run SQL Server with cloud disks.</li>
         * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Physical</p>
         */
        public Builder backupMethod(String backupMethod) {
            this.putQueryParameter("BackupMethod", backupMethod);
            this.backupMethod = backupMethod;
            return this;
        }

        /**
         * <p>The type of the backup. Valid values:</p>
         * <ul>
         * <li><strong>DataBackupPolicy</strong>: data backup</li>
         * <li><strong>LogBackupPolicy</strong>: log backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataBackupPolicy</p>
         */
        public Builder backupPolicyMode(String backupPolicyMode) {
            this.putQueryParameter("BackupPolicyMode", backupPolicyMode);
            this.backupPolicyMode = backupPolicyMode;
            return this;
        }

        /**
         * <p>Specifies whether the backup settings of a secondary instance are configured. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: secondary instance preferred</li>
         * <li><strong>2</strong>: primary instance preferred</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is suitable only for instances that run SQL Server on RDS Cluster Edition.</li>
         * <li>This parameter takes effect only when <strong>BackupMethod</strong> is set to <strong>Physical</strong>. If <strong>BackupMethod</strong> is set to <strong>Snapshot</strong>, backups are forcefully performed on the primary instance that runs SQL Server on RDS Cluster Edition.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder backupPriority(Integer backupPriority) {
            this.putQueryParameter("BackupPriority", backupPriority);
            this.backupPriority = backupPriority;
            return this;
        }

        /**
         * <p>The number of days for which you want to retain data backup files. Valid values: <strong>7 to 730</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter must be specified when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
         * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder backupRetentionPeriod(String backupRetentionPeriod) {
            this.putQueryParameter("BackupRetentionPeriod", backupRetentionPeriod);
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * <p>Specifies whether to enable the single-digit second backup feature. Valid values:</p>
         * <ul>
         * <li><strong>Flash</strong>: enables the feature.</li>
         * <li><strong>Standard</strong>: disables the feature.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The format that is used to compress backup data. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Backups are not compressed.</li>
         * <li><strong>1</strong>: The zlib tool is used to compress backups into .tar.gz files.</li>
         * <li><strong>2</strong>: The zlib tool is used to compress backups in parallel.</li>
         * <li><strong>4</strong>: The QuickLZ tool is used to compress backups into .xb.gz files. This compression format is supported for instances that run MySQL 5.6 or MySQL 5.7. Backups in this compression format can be used to restore individual databases and tables. For more information, see <a href="https://help.aliyun.com/document_detail/103175.html">Restore individual databases and tables of an ApsaraDB RDS for MySQL instance</a>.</li>
         * <li><strong>8</strong>: The QuickLZ tool is used to compress backups into .xb.gz files. This compression format is supported only for instances that run MySQL 8.0. Backups in this compression format cannot be used to restore individual databases and tables.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder compressType(String compressType) {
            this.putQueryParameter("CompressType", compressType);
            this.compressType = compressType;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * EnableAdvancedBackupPolicy.
         */
        public Builder enableAdvancedBackupPolicy(Integer enableAdvancedBackupPolicy) {
            this.putQueryParameter("EnableAdvancedBackupPolicy", enableAdvancedBackupPolicy);
            this.enableAdvancedBackupPolicy = enableAdvancedBackupPolicy;
            return this;
        }

        /**
         * <p>Specifies whether to enable the log backup feature. Valid values:</p>
         * <ul>
         * <li><strong>True</strong> or <strong>1</strong>: enables the log backup feature.</li>
         * <li><strong>False</strong> or <strong>0</strong>: disables the log backup feature.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You must specify this parameter when you set the <strong>BackupPolicyMode</strong> parameter to <strong>LogBackupPolicy</strong>.</p>
         * </li>
         * <li><p>This parameter takes effect only when you set the <strong>BackupPolicyMode</strong> parameter to <strong>LogBackupPolicy</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enableBackupLog(String enableBackupLog) {
            this.putQueryParameter("EnableBackupLog", enableBackupLog);
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * <p>Specifies whether to enable incremental backup. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): disables the feature.</li>
         * <li><strong>true</strong>: enables the feature.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only on instances that run SQL Server with cloud disks.</li>
         * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableIncrementDataBackup(Boolean enableIncrementDataBackup) {
            this.putQueryParameter("EnableIncrementDataBackup", enableIncrementDataBackup);
            this.enableIncrementDataBackup = enableIncrementDataBackup;
            return this;
        }

        /**
         * <p>Specifies whether to forcefully delete log backup files from the instance when the storage usage of the instance exceeds 80% or the amount of remaining storage on the instance is less than 5 GB. Valid values: <strong>Enable and Disable</strong>. You can retain the default value.</p>
         * <blockquote>
         * <ul>
         * <li>You must specify this parameter when you set the <strong>BackupPolicyMode</strong> parameter to <strong>LogBackupPolicy</strong>.</li>
         * <li>This parameter takes effect only when you set the <strong>BackupPolicyMode</strong> parameter to <strong>LogBackupPolicy</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder highSpaceUsageProtection(String highSpaceUsageProtection) {
            this.putQueryParameter("HighSpaceUsageProtection", highSpaceUsageProtection);
            this.highSpaceUsageProtection = highSpaceUsageProtection;
            return this;
        }

        /**
         * <p>The number of hours for which you want to retain log backup files on the instance. Valid values: <strong>0 to 168</strong>. The value 0 specifies that log backup files are not retained on the instance. The value 168 is calculated based on the following formula: 7 × 24.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter must be specified when <strong>BackupPolicyMode</strong> is set to <strong>LogBackupPolicy</strong>.</li>
         * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>LogBackupPolicy</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        public Builder localLogRetentionHours(String localLogRetentionHours) {
            this.putQueryParameter("LocalLogRetentionHours", localLogRetentionHours);
            this.localLogRetentionHours = localLogRetentionHours;
            return this;
        }

        /**
         * <p>The maximum storage usage that is allowed for log backup files on the instance. If the storage usage for log backup files on the instance exceeds the value of this parameter, the system deletes earlier log backup files until the storage usage falls below the value of this parameter. Valid values:<strong>0 to 50</strong>. You can retain the default value.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter must be specified when <strong>BackupPolicyMode</strong> is set to <strong>LogBackupPolicy</strong>.</li>
         * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>LogBackupPolicy</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder localLogRetentionSpace(String localLogRetentionSpace) {
            this.putQueryParameter("LocalLogRetentionSpace", localLogRetentionSpace);
            this.localLogRetentionSpace = localLogRetentionSpace;
            return this;
        }

        /**
         * <p>The frequency at which you want to back up the logs of the instance. Valid values:</p>
         * <ul>
         * <li><strong>LogInterval</strong>: A log backup is performed every 30 minutes.</li>
         * <li>The default value is the same as the data backup frequency.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The value <strong>LogInterval</strong> is supported only for instances that run SQL Server.</li>
         * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>LogInterval</p>
         */
        public Builder logBackupFrequency(String logBackupFrequency) {
            this.putQueryParameter("LogBackupFrequency", logBackupFrequency);
            this.logBackupFrequency = logBackupFrequency;
            return this;
        }

        /**
         * <p>The number of binary log files that you want to retain on the instance. Default value: <strong>60</strong>. Valid values: <strong>6</strong> to <strong>100</strong>.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter takes effect only when you set the <strong>BackupPolicyMode</strong> parameter to <strong>LogBackupPolicy</strong>.</p>
         * </li>
         * <li><p>If the instance runs MySQL, you can set this parameter to **-1**. The value **-1** specifies that an unlimited number of binary log files can be retained on the instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder logBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
            this.putQueryParameter("LogBackupLocalRetentionNumber", logBackupLocalRetentionNumber);
            this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
            return this;
        }

        /**
         * <p>The number of days for which the log backup is retained. Valid values: <strong>7 to 730</strong>. The log backup retention period cannot be longer than the data backup retention period.</p>
         * <blockquote>
         * <ul>
         * <li>If you enable the log backup feature, you can specify the log backup retention period. This parameter is supported for instances that run MySQL and PostgreSQL.</li>
         * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong> or <strong>LogBackupPolicy</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7</p>
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
         * <p>The backup cycle. Specify at least two days of the week and separate the days with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>Monday</strong></li>
         * <li><strong>Tuesday</strong></li>
         * <li><strong>Wednesday</strong></li>
         * <li><strong>Thursday</strong></li>
         * <li><strong>Friday</strong></li>
         * <li><strong>Saturday</strong></li>
         * <li><strong>Sunday</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You can configure a backup policy by using this parameter and the <strong>BackupInterval</strong> parameter. For example, if you set this parameter to Saturday,Sunday and the <strong>BackupInterval</strong> parameter to 30, a backup is performed every 30 minutes on every Saturday and Sunday.</li>
         * <li>This parameter must be specified when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
         * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Monday</p>
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * <p>The time at which you want to perform a backup. Specify the time in the ISO 8601 standard in the <em>HH:mm</em>Z-<em>HH:mm</em>Z format. The time must be in UTC.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter must be specified when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
         * <li>This parameter takes effect only when <strong>BackupPolicyMode</strong> is set to <strong>DataBackupPolicy</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>00:00Z-01:00Z</p>
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.putQueryParameter("PreferredBackupTime", preferredBackupTime);
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * <p>The policy that is used to retain archived backup files if the instance is released. Valid values:</p>
         * <ul>
         * <li><strong>None</strong>: No archived backup files are retained.</li>
         * <li><strong>Lastest</strong>: Only the last archived backup file is retained.</li>
         * <li><strong>All</strong>: All archived backup files are retained.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only when you set the <strong>BackupPolicyMode</strong> parameter to <strong>DataBackupPolicy</strong>.</li>
         * <li>If the instance uses cloud disks and was created on or after February 1, 2024, this parameter is automatically set to <strong>Lastest</strong>. If the instance uses local disks in the same scenario, this parameter is automatically set to <strong>None</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/2836955.html">Backup for deleted instances</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>None</p>
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

    /**
     * 
     * {@link ModifyBackupPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyBackupPolicyRequest</p>
     */
    public static class AdvancedDataPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("BakType")
        private String bakType;

        @com.aliyun.core.annotation.NameInMap("DestRegion")
        private String destRegion;

        @com.aliyun.core.annotation.NameInMap("DestType")
        private String destType;

        @com.aliyun.core.annotation.NameInMap("FilterKey")
        private String filterKey;

        @com.aliyun.core.annotation.NameInMap("FilterType")
        private String filterType;

        @com.aliyun.core.annotation.NameInMap("FilterValue")
        private String filterValue;

        @com.aliyun.core.annotation.NameInMap("OnlyPreserveOneEachDay")
        private Boolean onlyPreserveOneEachDay;

        @com.aliyun.core.annotation.NameInMap("OnlyPreserveOneEachHour")
        private Boolean onlyPreserveOneEachHour;

        @com.aliyun.core.annotation.NameInMap("RetentionType")
        private String retentionType;

        @com.aliyun.core.annotation.NameInMap("RetentionValue")
        private Integer retentionValue;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("SrcType")
        private String srcType;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private String strategyId;

        private AdvancedDataPolicies(Builder builder) {
            this.actionType = builder.actionType;
            this.bakType = builder.bakType;
            this.destRegion = builder.destRegion;
            this.destType = builder.destType;
            this.filterKey = builder.filterKey;
            this.filterType = builder.filterType;
            this.filterValue = builder.filterValue;
            this.onlyPreserveOneEachDay = builder.onlyPreserveOneEachDay;
            this.onlyPreserveOneEachHour = builder.onlyPreserveOneEachHour;
            this.retentionType = builder.retentionType;
            this.retentionValue = builder.retentionValue;
            this.srcRegion = builder.srcRegion;
            this.srcType = builder.srcType;
            this.strategyId = builder.strategyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedDataPolicies create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        /**
         * @return bakType
         */
        public String getBakType() {
            return this.bakType;
        }

        /**
         * @return destRegion
         */
        public String getDestRegion() {
            return this.destRegion;
        }

        /**
         * @return destType
         */
        public String getDestType() {
            return this.destType;
        }

        /**
         * @return filterKey
         */
        public String getFilterKey() {
            return this.filterKey;
        }

        /**
         * @return filterType
         */
        public String getFilterType() {
            return this.filterType;
        }

        /**
         * @return filterValue
         */
        public String getFilterValue() {
            return this.filterValue;
        }

        /**
         * @return onlyPreserveOneEachDay
         */
        public Boolean getOnlyPreserveOneEachDay() {
            return this.onlyPreserveOneEachDay;
        }

        /**
         * @return onlyPreserveOneEachHour
         */
        public Boolean getOnlyPreserveOneEachHour() {
            return this.onlyPreserveOneEachHour;
        }

        /**
         * @return retentionType
         */
        public String getRetentionType() {
            return this.retentionType;
        }

        /**
         * @return retentionValue
         */
        public Integer getRetentionValue() {
            return this.retentionValue;
        }

        /**
         * @return srcRegion
         */
        public String getSrcRegion() {
            return this.srcRegion;
        }

        /**
         * @return srcType
         */
        public String getSrcType() {
            return this.srcType;
        }

        /**
         * @return strategyId
         */
        public String getStrategyId() {
            return this.strategyId;
        }

        public static final class Builder {
            private String actionType; 
            private String bakType; 
            private String destRegion; 
            private String destType; 
            private String filterKey; 
            private String filterType; 
            private String filterValue; 
            private Boolean onlyPreserveOneEachDay; 
            private Boolean onlyPreserveOneEachHour; 
            private String retentionType; 
            private Integer retentionValue; 
            private String srcRegion; 
            private String srcType; 
            private String strategyId; 

            private Builder() {
            } 

            private Builder(AdvancedDataPolicies model) {
                this.actionType = model.actionType;
                this.bakType = model.bakType;
                this.destRegion = model.destRegion;
                this.destType = model.destType;
                this.filterKey = model.filterKey;
                this.filterType = model.filterType;
                this.filterValue = model.filterValue;
                this.onlyPreserveOneEachDay = model.onlyPreserveOneEachDay;
                this.onlyPreserveOneEachHour = model.onlyPreserveOneEachHour;
                this.retentionType = model.retentionType;
                this.retentionValue = model.retentionValue;
                this.srcRegion = model.srcRegion;
                this.srcType = model.srcType;
                this.strategyId = model.strategyId;
            } 

            /**
             * ActionType.
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * BakType.
             */
            public Builder bakType(String bakType) {
                this.bakType = bakType;
                return this;
            }

            /**
             * DestRegion.
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * DestType.
             */
            public Builder destType(String destType) {
                this.destType = destType;
                return this;
            }

            /**
             * FilterKey.
             */
            public Builder filterKey(String filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * FilterType.
             */
            public Builder filterType(String filterType) {
                this.filterType = filterType;
                return this;
            }

            /**
             * FilterValue.
             */
            public Builder filterValue(String filterValue) {
                this.filterValue = filterValue;
                return this;
            }

            /**
             * OnlyPreserveOneEachDay.
             */
            public Builder onlyPreserveOneEachDay(Boolean onlyPreserveOneEachDay) {
                this.onlyPreserveOneEachDay = onlyPreserveOneEachDay;
                return this;
            }

            /**
             * OnlyPreserveOneEachHour.
             */
            public Builder onlyPreserveOneEachHour(Boolean onlyPreserveOneEachHour) {
                this.onlyPreserveOneEachHour = onlyPreserveOneEachHour;
                return this;
            }

            /**
             * RetentionType.
             */
            public Builder retentionType(String retentionType) {
                this.retentionType = retentionType;
                return this;
            }

            /**
             * RetentionValue.
             */
            public Builder retentionValue(Integer retentionValue) {
                this.retentionValue = retentionValue;
                return this;
            }

            /**
             * SrcRegion.
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * SrcType.
             */
            public Builder srcType(String srcType) {
                this.srcType = srcType;
                return this;
            }

            /**
             * StrategyId.
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            public AdvancedDataPolicies build() {
                return new AdvancedDataPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyBackupPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyBackupPolicyRequest</p>
     */
    public static class AdvancedLogPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("DestRegion")
        private String destRegion;

        @com.aliyun.core.annotation.NameInMap("DestType")
        private String destType;

        @com.aliyun.core.annotation.NameInMap("EnableLogBackup")
        private Integer enableLogBackup;

        @com.aliyun.core.annotation.NameInMap("FilterKey")
        private String filterKey;

        @com.aliyun.core.annotation.NameInMap("FilterValue")
        private String filterValue;

        @com.aliyun.core.annotation.NameInMap("LogRetentionType")
        private String logRetentionType;

        @com.aliyun.core.annotation.NameInMap("LogRetentionValue")
        private Integer logRetentionValue;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("SrcType")
        private String srcType;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private String strategyId;

        private AdvancedLogPolicies(Builder builder) {
            this.actionType = builder.actionType;
            this.destRegion = builder.destRegion;
            this.destType = builder.destType;
            this.enableLogBackup = builder.enableLogBackup;
            this.filterKey = builder.filterKey;
            this.filterValue = builder.filterValue;
            this.logRetentionType = builder.logRetentionType;
            this.logRetentionValue = builder.logRetentionValue;
            this.srcRegion = builder.srcRegion;
            this.srcType = builder.srcType;
            this.strategyId = builder.strategyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedLogPolicies create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        /**
         * @return destRegion
         */
        public String getDestRegion() {
            return this.destRegion;
        }

        /**
         * @return destType
         */
        public String getDestType() {
            return this.destType;
        }

        /**
         * @return enableLogBackup
         */
        public Integer getEnableLogBackup() {
            return this.enableLogBackup;
        }

        /**
         * @return filterKey
         */
        public String getFilterKey() {
            return this.filterKey;
        }

        /**
         * @return filterValue
         */
        public String getFilterValue() {
            return this.filterValue;
        }

        /**
         * @return logRetentionType
         */
        public String getLogRetentionType() {
            return this.logRetentionType;
        }

        /**
         * @return logRetentionValue
         */
        public Integer getLogRetentionValue() {
            return this.logRetentionValue;
        }

        /**
         * @return srcRegion
         */
        public String getSrcRegion() {
            return this.srcRegion;
        }

        /**
         * @return srcType
         */
        public String getSrcType() {
            return this.srcType;
        }

        /**
         * @return strategyId
         */
        public String getStrategyId() {
            return this.strategyId;
        }

        public static final class Builder {
            private String actionType; 
            private String destRegion; 
            private String destType; 
            private Integer enableLogBackup; 
            private String filterKey; 
            private String filterValue; 
            private String logRetentionType; 
            private Integer logRetentionValue; 
            private String srcRegion; 
            private String srcType; 
            private String strategyId; 

            private Builder() {
            } 

            private Builder(AdvancedLogPolicies model) {
                this.actionType = model.actionType;
                this.destRegion = model.destRegion;
                this.destType = model.destType;
                this.enableLogBackup = model.enableLogBackup;
                this.filterKey = model.filterKey;
                this.filterValue = model.filterValue;
                this.logRetentionType = model.logRetentionType;
                this.logRetentionValue = model.logRetentionValue;
                this.srcRegion = model.srcRegion;
                this.srcType = model.srcType;
                this.strategyId = model.strategyId;
            } 

            /**
             * ActionType.
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * DestRegion.
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * DestType.
             */
            public Builder destType(String destType) {
                this.destType = destType;
                return this;
            }

            /**
             * EnableLogBackup.
             */
            public Builder enableLogBackup(Integer enableLogBackup) {
                this.enableLogBackup = enableLogBackup;
                return this;
            }

            /**
             * FilterKey.
             */
            public Builder filterKey(String filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * FilterValue.
             */
            public Builder filterValue(String filterValue) {
                this.filterValue = filterValue;
                return this;
            }

            /**
             * LogRetentionType.
             */
            public Builder logRetentionType(String logRetentionType) {
                this.logRetentionType = logRetentionType;
                return this;
            }

            /**
             * LogRetentionValue.
             */
            public Builder logRetentionValue(Integer logRetentionValue) {
                this.logRetentionValue = logRetentionValue;
                return this;
            }

            /**
             * SrcRegion.
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * SrcType.
             */
            public Builder srcType(String srcType) {
                this.srcType = srcType;
                return this;
            }

            /**
             * StrategyId.
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            public AdvancedLogPolicies build() {
                return new AdvancedLogPolicies(this);
            } 

        } 

    }
}
