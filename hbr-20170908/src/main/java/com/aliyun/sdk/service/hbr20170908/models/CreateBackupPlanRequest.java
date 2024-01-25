// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupPlanRequest</p>
 */
public class CreateBackupPlanRequest extends Request {
    @Query
    @NameInMap("BackupType")
    @Validation(required = true)
    private String backupType;

    @Query
    @NameInMap("Bucket")
    private String bucket;

    @Query
    @NameInMap("ChangeListPath")
    private String changeListPath;

    @Query
    @NameInMap("CreateTime")
    private Long createTime;

    @Query
    @NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @Query
    @NameInMap("CrossAccountType")
    private String crossAccountType;

    @Query
    @NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    @Query
    @NameInMap("DestDataSourceDetail")
    private java.util.Map < String, ? > destDataSourceDetail;

    @Query
    @NameInMap("DestDataSourceId")
    private String destDataSourceId;

    @Query
    @NameInMap("DestSourceType")
    private String destSourceType;

    @Query
    @NameInMap("Detail")
    private java.util.Map < String, ? > detail;

    @Body
    @NameInMap("Exclude")
    private String exclude;

    @Query
    @NameInMap("FileSystemId")
    private String fileSystemId;

    @Body
    @NameInMap("Include")
    private String include;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("KeepLatestSnapshots")
    private Long keepLatestSnapshots;

    @Body
    @NameInMap("Options")
    private String options;

    @Body
    @NameInMap("OtsDetail")
    private OtsDetail otsDetail;

    @Body
    @NameInMap("Path")
    private java.util.List < String > path;

    @Query
    @NameInMap("PlanName")
    @Validation(required = true, maxLength = 64, minLength = 1)
    private String planName;

    @Query
    @NameInMap("Prefix")
    private String prefix;

    @Query
    @NameInMap("Retention")
    private Long retention;

    @Body
    @NameInMap("Rule")
    private java.util.List < Rule> rule;

    @Query
    @NameInMap("Schedule")
    @Validation(required = true)
    private String schedule;

    @Query
    @NameInMap("SourceType")
    @Validation(required = true)
    private String sourceType;

    @Body
    @NameInMap("SpeedLimit")
    private String speedLimit;

    @Query
    @NameInMap("UdmRegionId")
    private String udmRegionId;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    private CreateBackupPlanRequest(Builder builder) {
        super(builder);
        this.backupType = builder.backupType;
        this.bucket = builder.bucket;
        this.changeListPath = builder.changeListPath;
        this.createTime = builder.createTime;
        this.crossAccountRoleName = builder.crossAccountRoleName;
        this.crossAccountType = builder.crossAccountType;
        this.crossAccountUserId = builder.crossAccountUserId;
        this.destDataSourceDetail = builder.destDataSourceDetail;
        this.destDataSourceId = builder.destDataSourceId;
        this.destSourceType = builder.destSourceType;
        this.detail = builder.detail;
        this.exclude = builder.exclude;
        this.fileSystemId = builder.fileSystemId;
        this.include = builder.include;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.keepLatestSnapshots = builder.keepLatestSnapshots;
        this.options = builder.options;
        this.otsDetail = builder.otsDetail;
        this.path = builder.path;
        this.planName = builder.planName;
        this.prefix = builder.prefix;
        this.retention = builder.retention;
        this.rule = builder.rule;
        this.schedule = builder.schedule;
        this.sourceType = builder.sourceType;
        this.speedLimit = builder.speedLimit;
        this.udmRegionId = builder.udmRegionId;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupType
     */
    public String getBackupType() {
        return this.backupType;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return changeListPath
     */
    public String getChangeListPath() {
        return this.changeListPath;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return crossAccountRoleName
     */
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    /**
     * @return crossAccountType
     */
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    /**
     * @return crossAccountUserId
     */
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    /**
     * @return destDataSourceDetail
     */
    public java.util.Map < String, ? > getDestDataSourceDetail() {
        return this.destDataSourceDetail;
    }

    /**
     * @return destDataSourceId
     */
    public String getDestDataSourceId() {
        return this.destDataSourceId;
    }

    /**
     * @return destSourceType
     */
    public String getDestSourceType() {
        return this.destSourceType;
    }

    /**
     * @return detail
     */
    public java.util.Map < String, ? > getDetail() {
        return this.detail;
    }

    /**
     * @return exclude
     */
    public String getExclude() {
        return this.exclude;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return include
     */
    public String getInclude() {
        return this.include;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return keepLatestSnapshots
     */
    public Long getKeepLatestSnapshots() {
        return this.keepLatestSnapshots;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return otsDetail
     */
    public OtsDetail getOtsDetail() {
        return this.otsDetail;
    }

    /**
     * @return path
     */
    public java.util.List < String > getPath() {
        return this.path;
    }

    /**
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return retention
     */
    public Long getRetention() {
        return this.retention;
    }

    /**
     * @return rule
     */
    public java.util.List < Rule> getRule() {
        return this.rule;
    }

    /**
     * @return schedule
     */
    public String getSchedule() {
        return this.schedule;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return speedLimit
     */
    public String getSpeedLimit() {
        return this.speedLimit;
    }

    /**
     * @return udmRegionId
     */
    public String getUdmRegionId() {
        return this.udmRegionId;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<CreateBackupPlanRequest, Builder> {
        private String backupType; 
        private String bucket; 
        private String changeListPath; 
        private Long createTime; 
        private String crossAccountRoleName; 
        private String crossAccountType; 
        private Long crossAccountUserId; 
        private java.util.Map < String, ? > destDataSourceDetail; 
        private String destDataSourceId; 
        private String destSourceType; 
        private java.util.Map < String, ? > detail; 
        private String exclude; 
        private String fileSystemId; 
        private String include; 
        private String instanceId; 
        private String instanceName; 
        private Long keepLatestSnapshots; 
        private String options; 
        private OtsDetail otsDetail; 
        private java.util.List < String > path; 
        private String planName; 
        private String prefix; 
        private Long retention; 
        private java.util.List < Rule> rule; 
        private String schedule; 
        private String sourceType; 
        private String speedLimit; 
        private String udmRegionId; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackupPlanRequest request) {
            super(request);
            this.backupType = request.backupType;
            this.bucket = request.bucket;
            this.changeListPath = request.changeListPath;
            this.createTime = request.createTime;
            this.crossAccountRoleName = request.crossAccountRoleName;
            this.crossAccountType = request.crossAccountType;
            this.crossAccountUserId = request.crossAccountUserId;
            this.destDataSourceDetail = request.destDataSourceDetail;
            this.destDataSourceId = request.destDataSourceId;
            this.destSourceType = request.destSourceType;
            this.detail = request.detail;
            this.exclude = request.exclude;
            this.fileSystemId = request.fileSystemId;
            this.include = request.include;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.keepLatestSnapshots = request.keepLatestSnapshots;
            this.options = request.options;
            this.otsDetail = request.otsDetail;
            this.path = request.path;
            this.planName = request.planName;
            this.prefix = request.prefix;
            this.retention = request.retention;
            this.rule = request.rule;
            this.schedule = request.schedule;
            this.sourceType = request.sourceType;
            this.speedLimit = request.speedLimit;
            this.udmRegionId = request.udmRegionId;
            this.vaultId = request.vaultId;
        } 

        /**
         * The backup type. Valid value: **COMPLETE**, which indicates full backup.
         */
        public Builder backupType(String backupType) {
            this.putQueryParameter("BackupType", backupType);
            this.backupType = backupType;
            return this;
        }

        /**
         * This parameter is required only if the **SourceType** parameter is set to **OSS**. This parameter specifies the name of the OSS bucket.
         */
        public Builder bucket(String bucket) {
            this.putQueryParameter("Bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * The configurations of the incremental file synchronization. This parameter is required for data synchronization only.
         */
        public Builder changeListPath(String changeListPath) {
            this.putQueryParameter("ChangeListPath", changeListPath);
            this.changeListPath = changeListPath;
            return this;
        }

        /**
         * This parameter is required only if the **SourceType** parameter is set to **NAS**. This parameter specifies the time to create the file system. The value must be a UNIX timestamp. Unit: seconds.
         */
        public Builder createTime(Long createTime) {
            this.putQueryParameter("CreateTime", createTime);
            this.createTime = createTime;
            return this;
        }

        /**
         * The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.
         */
        public Builder crossAccountRoleName(String crossAccountRoleName) {
            this.putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }

        /**
         * Specifies whether data is backed up and restored within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:
         * <p>
         * 
         * *   SELF_ACCOUNT: Data is backed up and restored within the same Alibaba Cloud account.
         * *   CROSS_ACCOUNT: Data is backed up and restored across Alibaba Cloud accounts.
         */
        public Builder crossAccountType(String crossAccountType) {
            this.putQueryParameter("CrossAccountType", crossAccountType);
            this.crossAccountType = crossAccountType;
            return this;
        }

        /**
         * The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.
         */
        public Builder crossAccountUserId(Long crossAccountUserId) {
            this.putQueryParameter("CrossAccountUserId", crossAccountUserId);
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }

        /**
         * DestDataSourceDetail.
         */
        public Builder destDataSourceDetail(java.util.Map < String, ? > destDataSourceDetail) {
            String destDataSourceDetailShrink = shrink(destDataSourceDetail, "DestDataSourceDetail", "json");
            this.putQueryParameter("DestDataSourceDetail", destDataSourceDetailShrink);
            this.destDataSourceDetail = destDataSourceDetail;
            return this;
        }

        /**
         * DestDataSourceId.
         */
        public Builder destDataSourceId(String destDataSourceId) {
            this.putQueryParameter("DestDataSourceId", destDataSourceId);
            this.destDataSourceId = destDataSourceId;
            return this;
        }

        /**
         * DestSourceType.
         */
        public Builder destSourceType(String destSourceType) {
            this.putQueryParameter("DestSourceType", destSourceType);
            this.destSourceType = destSourceType;
            return this;
        }

        /**
         * The details about ECS instance backup. The value is a JSON string.
         * <p>
         * 
         * *   snapshotGroup: specifies whether to use a snapshot-consistent group. This parameter is valid only if all disks of the ECS instance are enhanced SSDs (ESSDs).
         * *   appConsistent: specifies whether to enable application consistency. If you set this parameter to true, you must also specify the preScriptPath and postScriptPath parameters.
         * *   preScriptPath: the path to the prescript file.
         * *   postScriptPath: the path to the postscript file.
         */
        public Builder detail(java.util.Map < String, ? > detail) {
            String detailShrink = shrink(detail, "Detail", "json");
            this.putQueryParameter("Detail", detailShrink);
            this.detail = detail;
            return this;
        }

        /**
         * This parameter is required only if the **SourceType** parameter is set to **ECS_FILE**. This parameter specifies the paths to the files that are excluded from the backup job. The value can be up to 255 characters in length.
         */
        public Builder exclude(String exclude) {
            this.putBodyParameter("Exclude", exclude);
            this.exclude = exclude;
            return this;
        }

        /**
         * This parameter is required only if the **SourceType** parameter is set to **NAS**. This parameter specifies the ID of the NAS file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * This parameter is required only if the **SourceType** parameter is set to **ECS_FILE**. This parameter specifies the paths to the files that you want to back up. The value can be up to 255 characters in length.
         */
        public Builder include(String include) {
            this.putBodyParameter("Include", include);
            this.include = include;
            return this;
        }

        /**
         * This parameter is required only if the **SourceType** parameter is set to **ECS_FILE**. This parameter specifies the ID of the ECS instance.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the Tablestore instance.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Specifies whether to enable the "Keep at least one backup version" feature. Valid values:
         * <p>
         * 
         * *   0: The feature is disabled.
         * *   1: The feature is enabled.
         */
        public Builder keepLatestSnapshots(Long keepLatestSnapshots) {
            this.putQueryParameter("KeepLatestSnapshots", keepLatestSnapshots);
            this.keepLatestSnapshots = keepLatestSnapshots;
            return this;
        }

        /**
         * This parameter is required only if the **SourceType** parameter is set to **ECS_FILE**. This parameter specifies whether to use Windows Volume Shadow Copy Service (VSS) to define a backup path.
         * <p>
         * 
         * *   This parameter is available only for Windows ECS instances.
         * *   If data changes occur in the backup source, the source data must be the same as the data to be backed up before the system sets this parameter to `["UseVSS":true]`.
         * *   If you use VSS, you cannot back up data from multiple directories.
         */
        public Builder options(String options) {
            this.putBodyParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * The details about the Tablestore instance.
         */
        public Builder otsDetail(OtsDetail otsDetail) {
            String otsDetailShrink = shrink(otsDetail, "OtsDetail", "json");
            this.putBodyParameter("OtsDetail", otsDetailShrink);
            this.otsDetail = otsDetail;
            return this;
        }

        /**
         * The backup paths.
         */
        public Builder path(java.util.List < String > path) {
            this.putBodyParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * The name of the backup schedule. The name must be 1 to 64 characters in length. The name of a backup schedule for each type of data source must be unique within a backup vault.
         */
        public Builder planName(String planName) {
            this.putQueryParameter("PlanName", planName);
            this.planName = planName;
            return this;
        }

        /**
         * This parameter is required only if the **SourceType** parameter is set to **OSS**. This parameter specifies the prefix of objects that you want to back up. After a prefix is specified, only objects whose names start with the prefix are backed up.
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("Prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * The retention period of backup data. Minimum value: 1. Unit: days.
         */
        public Builder retention(Long retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        /**
         * The rules of the backup schedule.
         */
        public Builder rule(java.util.List < Rule> rule) {
            this.putBodyParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * The backup policy. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the `{startTime}` parameter and the subsequent backup jobs at an interval that is specified in the `{interval}` parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is complete. For example, `I|1631685600|P1D` specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.
         * <p>
         * 
         * *   **startTime**: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds.
         * *   **interval**: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.
         */
        public Builder schedule(String schedule) {
            this.putQueryParameter("Schedule", schedule);
            this.schedule = schedule;
            return this;
        }

        /**
         * The type of the data source. Valid values:
         * <p>
         * 
         * *   **ECS_FILE**: backs up Elastic Compute Service (ECS) files.
         * *   **OSS**: backs up Object Storage Service (OSS) buckets.
         * *   **NAS**: backs up Apsara File Storage NAS file systems.
         * *   **OTS**: backs up Tablestore instances.
         * *   **UDM_ECS**: backs up ECS instances.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * This parameter is required only if the **SourceType** parameter is set to **ECS_FILE**. This parameter specifies the throttling rules. Format: `{start}|{end}|{bandwidth}`. Separate multiple throttling rules with vertical bars (|). A specified time range cannot overlap with another time range.
         * <p>
         * 
         * *   **start**: the start hour.
         * *   **end**: the end hour.
         * *   **bandwidth**: the bandwidth. Unit: KB/s.
         */
        public Builder speedLimit(String speedLimit) {
            this.putBodyParameter("SpeedLimit", speedLimit);
            this.speedLimit = speedLimit;
            return this;
        }

        /**
         * The region in which the ECS instance that you want to back up resides.
         */
        public Builder udmRegionId(String udmRegionId) {
            this.putQueryParameter("UdmRegionId", udmRegionId);
            this.udmRegionId = udmRegionId;
            return this;
        }

        /**
         * The ID of the backup vault.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public CreateBackupPlanRequest build() {
            return new CreateBackupPlanRequest(this);
        } 

    } 

    public static class Rule extends TeaModel {
        @NameInMap("BackupType")
        private String backupType;

        @NameInMap("DestinationRegionId")
        private String destinationRegionId;

        @NameInMap("DestinationRetention")
        private Long destinationRetention;

        @NameInMap("Disabled")
        private Boolean disabled;

        @NameInMap("DoCopy")
        private Boolean doCopy;

        @NameInMap("Retention")
        private Long retention;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Schedule")
        private String schedule;

        private Rule(Builder builder) {
            this.backupType = builder.backupType;
            this.destinationRegionId = builder.destinationRegionId;
            this.destinationRetention = builder.destinationRetention;
            this.disabled = builder.disabled;
            this.doCopy = builder.doCopy;
            this.retention = builder.retention;
            this.ruleName = builder.ruleName;
            this.schedule = builder.schedule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
            return builder().build();
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return destinationRegionId
         */
        public String getDestinationRegionId() {
            return this.destinationRegionId;
        }

        /**
         * @return destinationRetention
         */
        public Long getDestinationRetention() {
            return this.destinationRetention;
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return doCopy
         */
        public Boolean getDoCopy() {
            return this.doCopy;
        }

        /**
         * @return retention
         */
        public Long getRetention() {
            return this.retention;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return schedule
         */
        public String getSchedule() {
            return this.schedule;
        }

        public static final class Builder {
            private String backupType; 
            private String destinationRegionId; 
            private Long destinationRetention; 
            private Boolean disabled; 
            private Boolean doCopy; 
            private Long retention; 
            private String ruleName; 
            private String schedule; 

            /**
             * The backup type.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * The ID of the region to which data is replicated.
             */
            public Builder destinationRegionId(String destinationRegionId) {
                this.destinationRegionId = destinationRegionId;
                return this;
            }

            /**
             * The retention period of the backup data in geo-redundancy mode. Unit: days.
             */
            public Builder destinationRetention(Long destinationRetention) {
                this.destinationRetention = destinationRetention;
                return this;
            }

            /**
             * Specifies whether to enable the rule.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * Specifies whether to enable cross-region replication.
             */
            public Builder doCopy(Boolean doCopy) {
                this.doCopy = doCopy;
                return this;
            }

            /**
             * The retention period of the backup data. Unit: days.
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The backup policy. Format: I|{startTime}|{interval}. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is complete. For example, I|1631685600|P1D specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.
             * <p>
             * 
             * startTime: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds. interval: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
}
