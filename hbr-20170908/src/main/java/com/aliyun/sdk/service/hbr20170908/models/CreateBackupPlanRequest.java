// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupPlanRequest</p>
 */
public class CreateBackupPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bucket")
    private String bucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeListPath")
    private String changeListPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountType")
    private String crossAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestDataSourceDetail")
    private java.util.Map < String, ? > destDataSourceDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestDataSourceId")
    private String destDataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestSourceType")
    private String destSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Detail")
    private java.util.Map < String, ? > detail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Disabled")
    private Boolean disabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Exclude")
    private String exclude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Include")
    private String include;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeepLatestSnapshots")
    private Long keepLatestSnapshots;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OtsDetail")
    private OtsDetail otsDetail;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Path")
    private java.util.List < String > path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String planName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prefix")
    private String prefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Retention")
    private Long retention;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rule")
    private java.util.List < Rule> rule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Schedule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schedule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SpeedLimit")
    private String speedLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UdmRegionId")
    private String udmRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
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
        this.disabled = builder.disabled;
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
     * @return disabled
     */
    public Boolean getDisabled() {
        return this.disabled;
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
        private Boolean disabled; 
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
            this.disabled = request.disabled;
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
         * <p>The backup type. Valid value: <strong>COMPLETE</strong>, which indicates full backup.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        public Builder backupType(String backupType) {
            this.putQueryParameter("BackupType", backupType);
            this.backupType = backupType;
            return this;
        }

        /**
         * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>OSS</strong>. This parameter specifies the name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>hbr-backup-oss</p>
         */
        public Builder bucket(String bucket) {
            this.putQueryParameter("Bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>The configurations of the incremental file synchronization. This parameter is required for data synchronization only.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dataSourceId&quot;: &quot;ds-123456789&quot;, &quot;path&quot;: &quot;/changelist&quot;}</p>
         */
        public Builder changeListPath(String changeListPath) {
            this.putQueryParameter("ChangeListPath", changeListPath);
            this.changeListPath = changeListPath;
            return this;
        }

        /**
         * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>NAS</strong>. This parameter specifies the time to create the file system. The value must be a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1607436917</p>
         */
        public Builder createTime(Long createTime) {
            this.putQueryParameter("CreateTime", createTime);
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>BackupRole</p>
         */
        public Builder crossAccountRoleName(String crossAccountRoleName) {
            this.putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }

        /**
         * <p>Specifies whether data is backed up and restored within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
         * <ul>
         * <li>SELF_ACCOUNT: Data is backed up and restored within the same Alibaba Cloud account.</li>
         * <li>CROSS_ACCOUNT: Data is backed up and restored across Alibaba Cloud accounts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CROSS_ACCOUNT</p>
         */
        public Builder crossAccountType(String crossAccountType) {
            this.putQueryParameter("CrossAccountType", crossAccountType);
            this.crossAccountType = crossAccountType;
            return this;
        }

        /**
         * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>15897534xxxx4625</p>
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
         * <p>The details about ECS instance backup. The value is a JSON string.</p>
         * <ul>
         * <li>snapshotGroup: specifies whether to use a snapshot-consistent group. This parameter is valid only if all disks of the ECS instance are enhanced SSDs (ESSDs).</li>
         * <li>appConsistent: specifies whether to enable application consistency. If you set this parameter to true, you must also specify the preScriptPath and postScriptPath parameters.</li>
         * <li>preScriptPath: the path to the prescript file.</li>
         * <li>postScriptPath: the path to the postscript file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;EnableFsFreeze&quot;:true,&quot;appConsistent&quot;:false,&quot;postScriptPath&quot;:&quot;&quot;,&quot;preScriptPath&quot;:&quot;&quot;,&quot;snapshotGroup&quot;:true,&quot;timeoutInSeconds&quot;:60}</p>
         */
        public Builder detail(java.util.Map < String, ? > detail) {
            String detailShrink = shrink(detail, "Detail", "json");
            this.putQueryParameter("Detail", detailShrink);
            this.detail = detail;
            return this;
        }

        /**
         * Disabled.
         */
        public Builder disabled(Boolean disabled) {
            this.putQueryParameter("Disabled", disabled);
            this.disabled = disabled;
            return this;
        }

        /**
         * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies the paths to the files that are excluded from the backup job. The value can be up to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/var&quot;, &quot;/proc&quot;]</p>
         */
        public Builder exclude(String exclude) {
            this.putBodyParameter("Exclude", exclude);
            this.exclude = exclude;
            return this;
        }

        /**
         * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>NAS</strong>. This parameter specifies the ID of the NAS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>005494</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies the paths to the files that you want to back up. The value can be up to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/home/alice/<em>.pdf&quot;, &quot;/home/bob/</em>.txt&quot;]</p>
         */
        public Builder include(String include) {
            this.putBodyParameter("Include", include);
            this.include = include;
            return this;
        }

        /**
         * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies the ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-m5e*****6q</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the Tablestore instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instancename</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the &quot;Keep at least one backup version&quot; feature. Valid values:</p>
         * <ul>
         * <li>0: The feature is disabled.</li>
         * <li>1: The feature is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder keepLatestSnapshots(Long keepLatestSnapshots) {
            this.putQueryParameter("KeepLatestSnapshots", keepLatestSnapshots);
            this.keepLatestSnapshots = keepLatestSnapshots;
            return this;
        }

        /**
         * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies whether to use Windows Volume Shadow Copy Service (VSS) to define a backup path.</p>
         * <ul>
         * <li>This parameter is available only for Windows ECS instances.</li>
         * <li>If data changes occur in the backup source, the source data must be the same as the data to be backed up before the system sets this parameter to <code>[&quot;UseVSS&quot;:true]</code>.</li>
         * <li>If you use VSS, you cannot back up data from multiple directories.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;UseVSS&quot;:false}</p>
         */
        public Builder options(String options) {
            this.putBodyParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * <p>The details about the Tablestore instance.</p>
         */
        public Builder otsDetail(OtsDetail otsDetail) {
            String otsDetailShrink = shrink(otsDetail, "OtsDetail", "json");
            this.putBodyParameter("OtsDetail", otsDetailShrink);
            this.otsDetail = otsDetail;
            return this;
        }

        /**
         * <p>The backup paths.</p>
         */
        public Builder path(java.util.List < String > path) {
            this.putBodyParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The name of the backup schedule. The name must be 1 to 64 characters in length. The name of a backup schedule for each type of data source must be unique within a backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>planname</p>
         */
        public Builder planName(String planName) {
            this.putQueryParameter("PlanName", planName);
            this.planName = planName;
            return this;
        }

        /**
         * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>OSS</strong>. This parameter specifies the prefix of objects that you want to back up. After a prefix is specified, only objects whose names start with the prefix are backed up.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-prefix</p>
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("Prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * <p>The retention period of backup data. Minimum value: 1. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder retention(Long retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        /**
         * <p>The rules of the backup schedule.</p>
         */
        public Builder rule(java.util.List < Rule> rule) {
            this.putBodyParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>The backup policy. Format: <code>I|{startTime}|{interval}</code>. The system runs the first backup job at a point in time that is specified in the <code>{startTime}</code> parameter and the subsequent backup jobs at an interval that is specified in the <code>{interval}</code> parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is complete. For example, <code>I|1631685600|P1D</code> specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
         * <ul>
         * <li><strong>startTime</strong>: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds.</li>
         * <li><strong>interval</strong>: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>I|1602673264|P1D</p>
         */
        public Builder schedule(String schedule) {
            this.putQueryParameter("Schedule", schedule);
            this.schedule = schedule;
            return this;
        }

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><strong>ECS_FILE</strong>: backs up Elastic Compute Service (ECS) files.</li>
         * <li><strong>OSS</strong>: backs up Object Storage Service (OSS) buckets.</li>
         * <li><strong>NAS</strong>: backs up Apsara File Storage NAS file systems.</li>
         * <li><strong>OTS</strong>: backs up Tablestore instances.</li>
         * <li><strong>UDM_ECS</strong>: backs up ECS instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS_FILE</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies the throttling rules. Format: <code>{start}|{end}|{bandwidth}</code>. Separate multiple throttling rules with vertical bars (|). A specified time range cannot overlap with another time range.</p>
         * <ul>
         * <li><strong>start</strong>: the start hour.</li>
         * <li><strong>end</strong>: the end hour.</li>
         * <li><strong>bandwidth</strong>: the bandwidth. Unit: KB/s.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0:24:5120</p>
         */
        public Builder speedLimit(String speedLimit) {
            this.putBodyParameter("SpeedLimit", speedLimit);
            this.speedLimit = speedLimit;
            return this;
        }

        /**
         * <p>The region in which the ECS instance that you want to back up resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder udmRegionId(String udmRegionId) {
            this.putQueryParameter("UdmRegionId", udmRegionId);
            this.udmRegionId = udmRegionId;
            return this;
        }

        /**
         * <p>The ID of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>v-0006******q</p>
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

    /**
     * 
     * {@link CreateBackupPlanRequest} extends {@link TeaModel}
     *
     * <p>CreateBackupPlanRequest</p>
     */
    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("DestinationRegionId")
        private String destinationRegionId;

        @com.aliyun.core.annotation.NameInMap("DestinationRetention")
        private Long destinationRetention;

        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("DoCopy")
        private Boolean doCopy;

        @com.aliyun.core.annotation.NameInMap("Retention")
        private Long retention;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Schedule")
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
             * <p>The backup type.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The ID of the region to which data is replicated.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder destinationRegionId(String destinationRegionId) {
                this.destinationRegionId = destinationRegionId;
                return this;
            }

            /**
             * <p>The retention period of the backup data in geo-redundancy mode. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder destinationRetention(Long destinationRetention) {
                this.destinationRetention = destinationRetention;
                return this;
            }

            /**
             * <p>Specifies whether to enable the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>Specifies whether to enable cross-region replication.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder doCopy(Boolean doCopy) {
                this.doCopy = doCopy;
                return this;
            }

            /**
             * <p>The retention period of the backup data. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-test-name</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The backup policy. Format: I|{startTime}|{interval}. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is complete. For example, I|1631685600|P1D specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
             * <p>startTime: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds. interval: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.</p>
             * 
             * <strong>example:</strong>
             * <p>I|1602673264|P1D</p>
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
