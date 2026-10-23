// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link CreateBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupPlanRequest</p>
 */
public class CreateBackupPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupType")
    private String backupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bucket")
    private String bucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeListPath")
    private String changeListPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestDataSourceDetail")
    private java.util.Map<String, ?> destDataSourceDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestDataSourceId")
    private String destDataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestSourceType")
    private String destSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Detail")
    private java.util.Map<String, ?> detail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Disabled")
    private Boolean disabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Edition")
    private String edition;

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
    private java.util.List<String> path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanName")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
    private String planName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prefix")
    private String prefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Retention")
    private Long retention;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rule")
    private java.util.List<Rule> rule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Schedule")
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
        this.clusterId = builder.clusterId;
        this.createTime = builder.createTime;
        this.crossAccountRoleName = builder.crossAccountRoleName;
        this.crossAccountType = builder.crossAccountType;
        this.crossAccountUserId = builder.crossAccountUserId;
        this.dataSourceId = builder.dataSourceId;
        this.destDataSourceDetail = builder.destDataSourceDetail;
        this.destDataSourceId = builder.destDataSourceId;
        this.destSourceType = builder.destSourceType;
        this.detail = builder.detail;
        this.disabled = builder.disabled;
        this.edition = builder.edition;
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
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
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return destDataSourceDetail
     */
    public java.util.Map<String, ?> getDestDataSourceDetail() {
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
    public java.util.Map<String, ?> getDetail() {
        return this.detail;
    }

    /**
     * @return disabled
     */
    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * @return edition
     */
    public String getEdition() {
        return this.edition;
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
    public java.util.List<String> getPath() {
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
    public java.util.List<Rule> getRule() {
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
        private String clusterId; 
        private Long createTime; 
        private String crossAccountRoleName; 
        private String crossAccountType; 
        private Long crossAccountUserId; 
        private String dataSourceId; 
        private java.util.Map<String, ?> destDataSourceDetail; 
        private String destDataSourceId; 
        private String destSourceType; 
        private java.util.Map<String, ?> detail; 
        private Boolean disabled; 
        private String edition; 
        private String exclude; 
        private String fileSystemId; 
        private String include; 
        private String instanceId; 
        private String instanceName; 
        private Long keepLatestSnapshots; 
        private String options; 
        private OtsDetail otsDetail; 
        private java.util.List<String> path; 
        private String planName; 
        private String prefix; 
        private Long retention; 
        private java.util.List<Rule> rule; 
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
            this.clusterId = request.clusterId;
            this.createTime = request.createTime;
            this.crossAccountRoleName = request.crossAccountRoleName;
            this.crossAccountType = request.crossAccountType;
            this.crossAccountUserId = request.crossAccountUserId;
            this.dataSourceId = request.dataSourceId;
            this.destDataSourceDetail = request.destDataSourceDetail;
            this.destDataSourceId = request.destDataSourceId;
            this.destSourceType = request.destSourceType;
            this.detail = request.detail;
            this.disabled = request.disabled;
            this.edition = request.edition;
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
         * <p>The backup type. Set the value to <strong>COMPLETE</strong>, which indicates full backup.</p>
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
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>OSS</strong>. The name of the OSS bucket.</p>
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
         * <p>The configuration of the incremental file synchronization list. This parameter is required only for data synchronization.</p>
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
         * <p>The ID of the client group that executes the data synchronization plan. This parameter is required only for data synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-***************</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>NAS</strong>. The time when the file system was created. The value is a UNIX timestamp. Unit: seconds.</p>
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
         * <p>The name of the RAM role created in the source account for cross-account backup.</p>
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
         * <p>The cross-account backup type. Valid values: </p>
         * <ul>
         * <li>SELF_ACCOUNT: backup within the same account.</li>
         * <li>CROSS_ACCOUNT: cross-account backup.</li>
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
         * <p>The ID of the source account for cross-account backup.</p>
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
         * <p>The ID of the source data source. This parameter is required only for data synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-****************</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putBodyParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>The details of the destination data source. This parameter is required only for data synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;prefix\&quot;:\&quot;/\&quot;}</p>
         */
        public Builder destDataSourceDetail(java.util.Map<String, ?> destDataSourceDetail) {
            String destDataSourceDetailShrink = shrink(destDataSourceDetail, "DestDataSourceDetail", "json");
            this.putQueryParameter("DestDataSourceDetail", destDataSourceDetailShrink);
            this.destDataSourceDetail = destDataSourceDetail;
            return this;
        }

        /**
         * <p>The ID of the destination data source. This parameter is required only for data synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-*********************</p>
         */
        public Builder destDataSourceId(String destDataSourceId) {
            this.putQueryParameter("DestDataSourceId", destDataSourceId);
            this.destDataSourceId = destDataSourceId;
            return this;
        }

        /**
         * <p>The type of the destination data source. This parameter is required only for data synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder destSourceType(String destSourceType) {
            this.putQueryParameter("DestSourceType", destSourceType);
            this.destSourceType = destSourceType;
            return this;
        }

        /**
         * <p>The details of the full-copy backup. The value is a JSON string.</p>
         * <ul>
         * <li>snapshotGroup: specifies whether to use a consistent snapshot group. This parameter is valid only when all cloud disks of the instance are ESSDs.</li>
         * <li>appConsistent: specifies whether to use application consistency. This parameter must be used together with the preScriptPath and postScriptPath parameters.</li>
         * <li>preScriptPath: the path of the pre-freeze script.</li>
         * <li>postScriptPath: the path of the post-thaw script.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;EnableFsFreeze\&quot;:true,\&quot;appConsistent\&quot;:false,\&quot;postScriptPath\&quot;:\&quot;\&quot;,\&quot;preScriptPath\&quot;:\&quot;\&quot;,\&quot;snapshotGroup\&quot;:true,\&quot;timeoutInSeconds\&quot;:60}</p>
         */
        public Builder detail(java.util.Map<String, ?> detail) {
            String detailShrink = shrink(detail, "Detail", "json");
            this.putQueryParameter("Detail", detailShrink);
            this.detail = detail;
            return this;
        }

        /**
         * <p>Specifies whether the plan is disabled by default.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder disabled(Boolean disabled) {
            this.putQueryParameter("Disabled", disabled);
            this.disabled = disabled;
            return this;
        }

        /**
         * <p>The edition type. Valid values: BASIC and STANDARD. Default value: STANDARD.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        public Builder edition(String edition) {
            this.putQueryParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. The path to exclude from the backup. All files in this path are not backed up. The value can be up to 255 characters in length.</p>
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
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>NAS</strong>. The file system ID.</p>
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
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. The path to include in the backup. All files in this path are backed up. The value can be up to 255 characters in length.</p>
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
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. The ECS instance ID.</p>
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
         * <p>Specifies whether to retain at least one backup version. Valid values:</p>
         * <ul>
         * <li>0: does not retain.</li>
         * <li>1: retains.</li>
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
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. Specifies whether to use Windows Volume Shadow Copy Service (VSS) to define the source path.</p>
         * <ul>
         * <li>This feature is supported only for Windows ECS instances.</li>
         * <li>If the backup source contains data changes and you need to ensure consistency between the backup data and the source data, set this parameter to <code>[&quot;UseVSS&quot;:true]</code>.</li>
         * <li>After VSS is enabled, multiple file folders cannot be backed up simultaneously.</li>
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
         * <p>The details of the Tablestore instance.</p>
         */
        public Builder otsDetail(OtsDetail otsDetail) {
            String otsDetailShrink = shrink(otsDetail, "OtsDetail", "json");
            this.putBodyParameter("OtsDetail", otsDetailShrink);
            this.otsDetail = otsDetail;
            return this;
        }

        /**
         * <p>The source paths.</p>
         */
        public Builder path(java.util.List<String> path) {
            this.putBodyParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The name of the backup plan. The name must be 1 to 64 characters in length. The backup plan name must be unique for each data source type within a single vault.</p>
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
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>OSS</strong>. The backup prefix. If specified, only objects that match the prefix are backed up.</p>
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
         * <p>The retention period of the backup data. Minimum value: 1. Unit: days.</p>
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
         * <p>The backup plan rules.</p>
         */
        public Builder rule(java.util.List<Rule> rule) {
            this.putBodyParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>The backup policy. Format: <code>I|{startTime}|{interval}</code>. This indicates that a backup job is executed at every <code>{interval}</code> starting from <code>{startTime}</code>. Backup jobs for past time periods are not compensated. If the previous backup job is not completed, the next backup job is not triggered. Example: <code>I|1631685600|P1D</code> indicates that a backup is performed once a day starting from 2021-09-15 14:00:00.</p>
         * <ul>
         * <li><strong>startTime</strong>: the start time of the backup. The value is a UNIX timestamp. Unit: seconds.</li>
         * <li><strong>interval</strong>: the ISO 8601 time interval. Example: PT1H indicates an interval of one hour. P1D indicates an interval of one day.</li>
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
         * <li><strong>ECS_FILE</strong>: backs up ECS files.</li>
         * <li><strong>OSS</strong>: backs up Alibaba Cloud OSS.</li>
         * <li><strong>NAS</strong>: backs up Alibaba Cloud NAS.</li>
         * <li><strong>OTS</strong>: backs up Alibaba Cloud OTS.</li>
         * <li><strong>UDM_ECS</strong>: backs up an entire ECS instance.</li>
         * <li><strong>SYNC</strong>: data synchronization.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. The backup traffic control. Format: <code>{start}:{end}:{bandwidth}</code>. Separate multiple traffic control configurations with vertical bars (|). The time ranges of the configurations cannot overlap.</p>
         * <ul>
         * <li><strong>start</strong>: the start hour.</li>
         * <li><strong>end</strong>: the end hour.</li>
         * <li><strong>bandwidth</strong>: the rate limit. Unit: KB/s.</li>
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
         * <p>The region where the ECS instance for full-copy backup resides.</p>
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
         * <p>The vault ID.</p>
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

            private Builder() {
            } 

            private Builder(Rule model) {
                this.backupType = model.backupType;
                this.destinationRegionId = model.destinationRegionId;
                this.destinationRetention = model.destinationRetention;
                this.disabled = model.disabled;
                this.doCopy = model.doCopy;
                this.retention = model.retention;
                this.ruleName = model.ruleName;
                this.schedule = model.schedule;
            } 

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
             * <p>The ID of the destination region for cross-region replication.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder destinationRegionId(String destinationRegionId) {
                this.destinationRegionId = destinationRegionId;
                return this;
            }

            /**
             * <p>The retention period of the geo-redundancy backup. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder destinationRetention(Long destinationRetention) {
                this.destinationRetention = destinationRetention;
                return this;
            }

            /**
             * <p>Specifies whether the rule is disabled.</p>
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
             * <p>The retention period of the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-test-name</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The backup policy. Format: I|{startTime}|{interval}. This indicates that a backup job is executed at every {interval} starting from {startTime}. Backup jobs for past time periods are not executed. If the previous backup job is not completed, the next backup job is not triggered. Example: I|1631685600|P1D indicates that a backup is performed once a day starting from 2021-09-15 14:00:00.</p>
             * <p>startTime: the start time of the backup. The value is a UNIX timestamp. Unit: seconds.
             * interval: the ISO 8601 time interval. Example: PT1H indicates an interval of one hour. P1D indicates an interval of one day.</p>
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
