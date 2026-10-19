// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
    @com.aliyun.core.annotation.NameInMap("PreserveOneEachHour")
    private Boolean preserveOneEachHour;

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
        this.preserveOneEachHour = builder.preserveOneEachHour;
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
     * @return preserveOneEachHour
     */
    public Boolean getPreserveOneEachHour() {
        return this.preserveOneEachHour;
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
        private Boolean preserveOneEachHour; 
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
            this.preserveOneEachHour = request.preserveOneEachHour;
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
         * <p>The high-frequency backup frequency. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: Disables high-frequency backups.</li>
         * <li><strong>30</strong>: Every 30 minutes.</li>
         * <li><strong>60</strong>: Every 1 hour.</li>
         * <li><strong>120</strong>: Every 2 hours.</li>
         * <li><strong>180</strong>: Every 3 hours.</li>
         * <li><strong>240</strong>: Every 4 hours.</li>
         * <li><strong>360</strong>: Every 6 hours.</li>
         * <li><strong>480</strong>: Every 8 hours.</li>
         * <li><strong>720</strong>: Every 12 hours.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If <strong>SnapshotBackupType</strong> is set to <strong>Standard</strong>, this parameter must be set to <strong>-1</strong>.</li>
         * <li>If <strong>SnapshotBackupType</strong> is set to <strong>Flash</strong> and this parameter is set to a value greater than 0, high-frequency backups take effect.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder backupInterval(String backupInterval) {
            this.putQueryParameter("BackupInterval", backupInterval);
            this.backupInterval = backupInterval;
            return this;
        }

        /**
         * <p>The number of days for which full backups are retained.</p>
         * <blockquote>
         * <ul>
         * <li>For users who created instances before September 10, 2021, the default retention period is 7 days.</li>
         * <li>For new users who created instances on or after September 10, 2021, the default retention period is 30 days.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder backupRetentionPeriod(Long backupRetentionPeriod) {
            this.putQueryParameter("BackupRetentionPeriod", backupRetentionPeriod);
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * <p>The backup data retention policy. Valid values:</p>
         * <ul>
         * <li><p>0: Deletes all backup sets of the instance immediately when the instance is released.</p>
         * </li>
         * <li><p>1: An automatic backup is performed when the instance is released, and the backup set is retained for long-term retention (LTR).</p>
         * </li>
         * <li><p>2: An automatic backup is performed when the instance is released, and all backup sets of the cluster are retained for long-term retention (LTR).</p>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2779111.html">Long-term retention backups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder backupRetentionPolicyOnClusterDeletion(Integer backupRetentionPolicyOnClusterDeletion) {
            this.putQueryParameter("BackupRetentionPolicyOnClusterDeletion", backupRetentionPolicyOnClusterDeletion);
            this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
            return this;
        }

        /**
         * <p>The days of the week when cross-region backup is performed. Valid values:</p>
         * <ol>
         * <li>Monday: Monday.</li>
         * <li>Tuesday: Tuesday.</li>
         * <li>Wednesday: Wednesday.</li>
         * <li>Thursday: Thursday.</li>
         * <li>Friday: Friday.</li>
         * <li>Saturday: Saturday.</li>
         * <li>Sunday: Sunday.</li>
         * </ol>
         * <blockquote>
         * <p>This parameter is required for cross-region backup.</p>
         * <ul>
         * <li>If you specify multiple values, separate them with commas (,).</li>
         * <li>When the backup settings are set to standard backup, the value must be a subset of the PreferredBackupPeriod backup epoch.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday</p>
         */
        public Builder crossBackupPeriod(String crossBackupPeriod) {
            this.putQueryParameter("CrossBackupPeriod", crossBackupPeriod);
            this.crossBackupPeriod = crossBackupPeriod;
            return this;
        }

        /**
         * <p>The operation policy for cross-region backup. Valid values:</p>
         * <ul>
         * <li>update: Modifies the cross-region backup policy.</li>
         * <li>delete: Deletes the cross-region backup policy.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required for cross-region backup.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>update</p>
         */
        public Builder crossBackupType(String crossBackupType) {
            this.putQueryParameter("CrossBackupType", crossBackupType);
            this.crossBackupType = crossBackupType;
            return this;
        }

        /**
         * <p>The retention type for cross-region log backup. Valid values:</p>
         * <ul>
         * <li>delay: Retains backups for a specified period.</li>
         * <li>never: Never expires.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required for cross-region backup.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>delay</p>
         */
        public Builder crossLogRetentionType(String crossLogRetentionType) {
            this.putQueryParameter("CrossLogRetentionType", crossLogRetentionType);
            this.crossLogRetentionType = crossLogRetentionType;
            return this;
        }

        /**
         * <p>The retention period for cross-region log backup. Valid values: 3 to 1825 days. The value must be less than or equal to the value of CrossRetentionValue.</p>
         * <blockquote>
         * <p>This parameter is required for cross-region backup.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder crossLogRetentionValue(Integer crossLogRetentionValue) {
            this.putQueryParameter("CrossLogRetentionValue", crossLogRetentionValue);
            this.crossLogRetentionValue = crossLogRetentionValue;
            return this;
        }

        /**
         * <p>The retention type for cross-region backup. Valid values:</p>
         * <ul>
         * <li><p>delay: Retains backups for a specified period.</p>
         * </li>
         * <li><p>never: Never expires.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required for cross-region backup.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>delay</p>
         */
        public Builder crossRetentionType(String crossRetentionType) {
            this.putQueryParameter("CrossRetentionType", crossRetentionType);
            this.crossRetentionType = crossRetentionType;
            return this;
        }

        /**
         * <p>The retention period for cross-region backup. Valid values: 3 to 1825 days.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required for cross-region backup.</li>
         * <li>This parameter is required and must be specified when CrossRetentionType is set to delay.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder crossRetentionValue(Integer crossRetentionValue) {
            this.putQueryParameter("CrossRetentionValue", crossRetentionValue);
            this.crossRetentionValue = crossRetentionValue;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp16cb162771****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The region where backups are stored.</p>
         * <blockquote>
         * <p>This parameter is required for cross-region backup.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder destRegion(String destRegion) {
            this.putQueryParameter("DestRegion", destRegion);
            this.destRegion = destRegion;
            return this;
        }

        /**
         * <p>Specifies whether to enable log backup. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Disables log backup. This is the default value.</p>
         * </li>
         * <li><p><strong>1</strong>: Enables log backup.</p>
         * <blockquote>
         * <p>Notice: Sharded cluster instances do not support disabling log backup.</notice></p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder enableBackupLog(Long enableBackupLog) {
            this.putQueryParameter("EnableBackupLog", enableBackupLog);
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * <p>Specifies whether to enable cross-region log backup.</p>
         * <blockquote>
         * <p>This parameter is required for cross-region backup.</p>
         * <ul>
         * <li>1: Enables cross-region log backup. This value is required for sharded cluster instances. For replica set instances, this value is required if you want to support cross-region point-in-time recovery.</li>
         * <li>0: Disables cross-region log backup.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enableCrossLogBackup(Integer enableCrossLogBackup) {
            this.putQueryParameter("EnableCrossLogBackup", enableCrossLogBackup);
            this.enableCrossLogBackup = enableCrossLogBackup;
            return this;
        }

        /**
         * <p>The number of days for which high-frequency backups are retained. Before you use this parameter, make sure that the BackupInterval parameter is specified. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder highFrequencyBackupRetention(Long highFrequencyBackupRetention) {
            this.putQueryParameter("HighFrequencyBackupRetention", highFrequencyBackupRetention);
            this.highFrequencyBackupRetention = highFrequencyBackupRetention;
            return this;
        }

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li>replicate </li>
         * <li>sharding</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is required when the backup recovery type is set to rebuilding a deleted instance.</li>
         * <li>This parameter is required when the backup recovery type is set to cloning an instance from cross-region backup.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>replicate</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The number of days for which log backups are retained. Default value: 7.</p>
         * <p>Valid values: 7 to 730.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
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
         * <p>The backup cycle. Valid values:</p>
         * <ul>
         * <li><strong>Monday</strong>: Monday.</li>
         * <li><strong>Tuesday</strong>: Tuesday.</li>
         * <li><strong>Wednesday</strong>: Wednesday.</li>
         * <li><strong>Thursday</strong>: Thursday.</li>
         * <li><strong>Friday</strong>: Friday.</li>
         * <li><strong>Saturday</strong>: Saturday.</li>
         * <li><strong>Sunday</strong>: Sunday.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: To ensure data security, back up your MongoDB data at least twice a week.</notice></p>
         * </blockquote>
         * <blockquote>
         * <p>If you specify multiple values, separate them with commas (,).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Monday,Wednesday,Friday,Sunday</p>
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * <p>The time period during which backups are performed. The format is <i>HH:mm</i>Z-<i>HH:mm</i>Z (UTC).</p>
         * <blockquote>
         * <p>The time period is limited to 1 hour.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>03:00Z-04:00Z</p>
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.putQueryParameter("PreferredBackupTime", preferredBackupTime);
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * <p>Specifies whether to enable hourly sparse backup. Valid values:</p>
         * <ul>
         * <li><p>true: If the backup frequency is set to minutes, all snapshots taken within 1 hour from the current time are retained. For snapshots taken more than 1 hour but within 24 hours from the current time, only the first snapshot taken after the hour is retained.</p>
         * </li>
         * <li><p>false: All snapshots taken within the high-frequency backup retention period are retained.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder preserveOneEachHour(Boolean preserveOneEachHour) {
            this.putQueryParameter("PreserveOneEachHour", preserveOneEachHour);
            this.preserveOneEachHour = preserveOneEachHour;
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
         * <p>The snapshot backup type. Valid values:</p>
         * <ul>
         * <li><strong>Flash</strong>: Backup within seconds.</li>
         * <li><strong>Standard</strong>: Standard backup. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder snapshotBackupType(String snapshotBackupType) {
            this.putQueryParameter("SnapshotBackupType", snapshotBackupType);
            this.snapshotBackupType = snapshotBackupType;
            return this;
        }

        /**
         * <p>The region where the instance is deployed.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required to recover deleted instances.</li>
         * <li>This parameter is required for cross-region backup.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
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
