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
 * {@link UpdateBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateBackupPlanRequest</p>
 */
public class UpdateBackupPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeListPath")
    private String changeListPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Detail")
    private java.util.Map<String, ?> detail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Edition")
    private String edition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Exclude")
    private String exclude;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Include")
    private String include;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeepLatestSnapshots")
    private Long keepLatestSnapshots;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OtsDetail")
    private OtsDetail otsDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private java.util.List<String> path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planId;

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
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpeedLimit")
    private String speedLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdatePaths")
    private Boolean updatePaths;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
    private String vaultId;

    private UpdateBackupPlanRequest(Builder builder) {
        super(builder);
        this.changeListPath = builder.changeListPath;
        this.detail = builder.detail;
        this.edition = builder.edition;
        this.exclude = builder.exclude;
        this.include = builder.include;
        this.keepLatestSnapshots = builder.keepLatestSnapshots;
        this.options = builder.options;
        this.otsDetail = builder.otsDetail;
        this.path = builder.path;
        this.planId = builder.planId;
        this.planName = builder.planName;
        this.prefix = builder.prefix;
        this.retention = builder.retention;
        this.rule = builder.rule;
        this.schedule = builder.schedule;
        this.sourceType = builder.sourceType;
        this.speedLimit = builder.speedLimit;
        this.updatePaths = builder.updatePaths;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBackupPlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeListPath
     */
    public String getChangeListPath() {
        return this.changeListPath;
    }

    /**
     * @return detail
     */
    public java.util.Map<String, ?> getDetail() {
        return this.detail;
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
     * @return include
     */
    public String getInclude() {
        return this.include;
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
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
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
     * @return updatePaths
     */
    public Boolean getUpdatePaths() {
        return this.updatePaths;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<UpdateBackupPlanRequest, Builder> {
        private String changeListPath; 
        private java.util.Map<String, ?> detail; 
        private String edition; 
        private String exclude; 
        private String include; 
        private Long keepLatestSnapshots; 
        private String options; 
        private OtsDetail otsDetail; 
        private java.util.List<String> path; 
        private String planId; 
        private String planName; 
        private String prefix; 
        private Long retention; 
        private java.util.List<Rule> rule; 
        private String schedule; 
        private String sourceType; 
        private String speedLimit; 
        private Boolean updatePaths; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBackupPlanRequest request) {
            super(request);
            this.changeListPath = request.changeListPath;
            this.detail = request.detail;
            this.edition = request.edition;
            this.exclude = request.exclude;
            this.include = request.include;
            this.keepLatestSnapshots = request.keepLatestSnapshots;
            this.options = request.options;
            this.otsDetail = request.otsDetail;
            this.path = request.path;
            this.planId = request.planId;
            this.planName = request.planName;
            this.prefix = request.prefix;
            this.retention = request.retention;
            this.rule = request.rule;
            this.schedule = request.schedule;
            this.sourceType = request.sourceType;
            this.speedLimit = request.speedLimit;
            this.updatePaths = request.updatePaths;
            this.vaultId = request.vaultId;
        } 

        /**
         * <p>The configuration for the incremental file synchronization list. (This parameter is required only for file synchronization.)</p>
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
         * <p>The details of the ECS instance backup. This is a JSON string.</p>
         * <ul>
         * <li><p>snapshotGroup: Specifies whether to use a snapshot-consistent group. This feature is available only when all disks of the instance are Enhanced Solid-State Drives (ESSDs).</p>
         * </li>
         * <li><p>appConsistent: Specifies whether to enable application consistency. You must also configure the preScriptPath and postScriptPath parameters.</p>
         * </li>
         * <li><p>preScriptPath: The path to the pre-freeze script.</p>
         * </li>
         * <li><p>postScriptPath: The path to the post-thaw script.</p>
         * </li>
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
         * <p>The edition. Valid values are BASIC and STANDARD. The default value is STANDARD.</p>
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
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. This parameter specifies the paths to the files to exclude from the backup. All files in the specified paths are not backed up. The value can be up to 255 characters in length.</p>
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
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. This parameter specifies the paths to the files to back up. All files in the specified paths are backed up. The value can be up to 255 characters in length.</p>
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
         * <p>Specifies whether to permanently retain the latest backup version.</p>
         * <ul>
         * <li><p>0: No</p>
         * </li>
         * <li><p>1: Yes</p>
         * </li>
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
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. This parameter specifies whether to use Volume Shadow Copy Service (VSS) to define the backup path.</p>
         * <ul>
         * <li><p>This feature is available only for Windows ECS instances.</p>
         * </li>
         * <li><p>If data changes occur in the backup source, set this parameter to <code>[&quot;UseVSS&quot;:true]</code> to ensure data consistency.</p>
         * </li>
         * <li><p>If you enable VSS, you cannot back up multiple file directories at the same time.</p>
         * </li>
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
         * <p>The backup paths.</p>
         */
        public Builder path(java.util.List<String> path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The ID of the backup plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>plan-20211***735</p>
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * <p>The name of the backup plan.</p>
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
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>OSS</strong>. This parameter specifies the prefix of objects to back up. After you specify a prefix, only objects that match the prefix are backed up.</p>
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
         * <p>The number of days to retain backups. The minimum value is 1.</p>
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
         * <p>The rules of the backup plan.</p>
         */
        public Builder rule(java.util.List<Rule> rule) {
            this.putBodyParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>The backup policy. Use the <code>I|{startTime}|{interval}</code> format. This specifies that a backup job runs at a recurring interval. The <code>{startTime}</code> is when the backup starts. The <code>{interval}</code> is the time between jobs. HBR does not run overdue backup jobs. If the previous backup job is not finished, the next one does not start. For example, <code>I|1631685600|P1D</code> means the backup runs once a day, starting at 14:00:00 on September 15, 2021.</p>
         * <ul>
         * <li><p><strong>startTime</strong>: The start time of the backup. This is a UNIX timestamp in seconds.</p>
         * </li>
         * <li><p><strong>interval</strong>: The time interval. Use the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.</p>
         * </li>
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
         * <li><p><strong>ECS_FILE</strong>: Backs up ECS files.</p>
         * </li>
         * <li><p><strong>OSS</strong>: Backs up Alibaba Cloud OSS.</p>
         * </li>
         * <li><p><strong>NAS</strong>: Backs up Alibaba Cloud NAS.</p>
         * </li>
         * <li><p><strong>OTS</strong>: Backs up Alibaba Cloud Tablestore.</p>
         * </li>
         * <li><p><strong>UDM_ECS</strong>: Backs up an entire ECS instance.</p>
         * </li>
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
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. This parameter specifies traffic shaping for backups. Traffic shaping helps you control backup traffic during peak business hours to avoid affecting your services. The format is <code>{start}|{end}|{bandwidth}</code>. You can specify multiple traffic shaping rules. Separate them with vertical bars (|). The time ranges of the rules cannot overlap.</p>
         * <ul>
         * <li><p><strong>start</strong>: The start hour.</p>
         * </li>
         * <li><p><strong>end</strong>: The end hour.</p>
         * </li>
         * <li><p><strong>bandwidth</strong>: The maximum speed. Unit: KB/s.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0:24:5120</p>
         */
        public Builder speedLimit(String speedLimit) {
            this.putQueryParameter("SpeedLimit", speedLimit);
            this.speedLimit = speedLimit;
            return this;
        }

        /**
         * <p>Specifies whether to update the backup paths if the Path parameter is empty.</p>
         * <ul>
         * <li><p>true: Updates the backup paths based on the paths specified in this call.</p>
         * </li>
         * <li><p>false: Does not update the backup paths. The backup paths that were configured when the backup plan was created are used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder updatePaths(Boolean updatePaths) {
            this.putQueryParameter("UpdatePaths", updatePaths);
            this.updatePaths = updatePaths;
            return this;
        }

        /**
         * <p>The ID of the backup repository.</p>
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
        public UpdateBackupPlanRequest build() {
            return new UpdateBackupPlanRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateBackupPlanRequest} extends {@link TeaModel}
     *
     * <p>UpdateBackupPlanRequest</p>
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
             * <p>The backup type. Set the value to <strong>COMPLETE</strong>. This indicates a full backup.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The ID of the destination region for the geo-redundant backup.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder destinationRegionId(String destinationRegionId) {
                this.destinationRegionId = destinationRegionId;
                return this;
            }

            /**
             * <p>The number of days to retain the geo-redundant backup.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder destinationRetention(Long destinationRetention) {
                this.destinationRetention = destinationRetention;
                return this;
            }

            /**
             * <p>Specifies whether to disable the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>Specifies whether to enable geo-redundant replication.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder doCopy(Boolean doCopy) {
                this.doCopy = doCopy;
                return this;
            }

            /**
             * <p>The number of days to retain backups. The minimum value is 1.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>The name of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-test-name</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The backup policy. Use the I|{startTime}|{interval} format. This specifies that a backup job runs at a recurring interval. The {startTime} is when the backup starts. The {interval} is the time between jobs. HBR does not run overdue backup jobs. If the previous backup job is not finished, the next one does not start. For example, I|1631685600|P1D means the backup runs once a day, starting at 14:00:00 on September 15, 2021.</p>
             * <p>startTime: The start time of the backup. This is a UNIX timestamp in seconds. interval: The time interval. Use the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.</p>
             * 
             * <strong>example:</strong>
             * <p>I|1631685600|P1D</p>
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
