// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
    private java.util.Map < String, ? > detail;

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
    private java.util.List < String > path;

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
    private java.util.List < Rule> rule;

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
    public java.util.List < String > getPath() {
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
        private java.util.Map < String, ? > detail; 
        private String exclude; 
        private String include; 
        private Long keepLatestSnapshots; 
        private String options; 
        private OtsDetail otsDetail; 
        private java.util.List < String > path; 
        private String planId; 
        private String planName; 
        private String prefix; 
        private Long retention; 
        private java.util.List < Rule> rule; 
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
         * <p>The details about ECS instance backup. The value is a JSON string.</p>
         * <ul>
         * <li>snapshotGroup: specifies whether to use a snapshot-consistent group. This parameter is valid only if all disks of the ECS instance are enhanced SSDs (ESSDs).</li>
         * <li>appConsistent: specifies whether to enable application consistency. If you set this parameter to true, you must also specify the preScriptPath and postScriptPath parameters.</li>
         * <li>preScriptPath: the path to the pre-freeze scripts.</li>
         * <li>postScriptPath: the path to the post-thaw scripts.</li>
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
         * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies the paths to the files that are excluded from the backup job. The value must be 1 to 255 characters in length.</p>
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
         * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies the paths to the files that you want to back up. The value must be 1 to 255 characters in length.</p>
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
         * <p>Specifies whether to enable the feature of keeping at least one backup version. Valid values:</p>
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
         * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies whether to use Windows Volume Shadow Copy Service (VSS) to define a source path.</p>
         * <ul>
         * <li>This parameter is available only for Windows ECS instances.</li>
         * <li>If data changes occur in the backup source, the source data must be the same as the data to be backed up before you can set this parameter to <code>[&quot;UseVSS&quot;:true]</code>.</li>
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
         * <p>The source paths.</p>
         */
        public Builder path(java.util.List < String > path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The ID of the backup plan.</p>
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
         * <p>The rule of the backup plan.</p>
         */
        public Builder rule(java.util.List < Rule> rule) {
            this.putBodyParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>The backup policy. Format: <code>I|{startTime}|{interval}</code>. The system runs the first backup job at a point in time that is specified in the <code>{startTime}</code> parameter and the subsequent backup jobs at an interval that is specified in the <code>{interval}</code> parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, <code>I|1631685600|P1D</code> specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
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
         * <li><strong>ECS_FILE</strong>: Elastic Compute Service (ECS) files</li>
         * <li><strong>OSS</strong>: Object Storage Service (OSS) buckets</li>
         * <li><strong>NAS</strong>: Apsara File Storage NAS file systems</li>
         * <li><strong>OTS</strong>: Tablestore instances</li>
         * <li><strong>UDM_ECS</strong>: ECS instances</li>
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
         * <p>This parameter is required only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter specifies the throttling rules. To ensure business continuity, you can limit the bandwidth that is used for file backup during peak hours. Format: <code>{start}|{end}|{bandwidth}</code>. Separate multiple throttling rules with vertical bars (|). A specified time range cannot overlap with another time range.</p>
         * <ul>
         * <li><strong>start</strong>: the start hour</li>
         * <li><strong>end</strong>: the end hour.</li>
         * <li><strong>bandwidth</strong>: the bandwidth. Unit: KB/s.</li>
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
         * <p>Specifies whether to update the source path if the backup source is empty. Valid values:</p>
         * <ul>
         * <li>true: The system replaces the original source path with the specified source path.</li>
         * <li>false: The system does not update the original source path. The system backs up data based on the source path that you specified when you created the backup plan.</li>
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

            /**
             * <p>The backup type. Valid value: <strong>COMPLETE</strong>, which indicates full backup.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The ID of the region where the remote backup vault resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder destinationRegionId(String destinationRegionId) {
                this.destinationRegionId = destinationRegionId;
                return this;
            }

            /**
             * <p>The retention period of the backup data. Unit: days.</p>
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
             * <p>Specifies whether to enable remote replication.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder doCopy(Boolean doCopy) {
                this.doCopy = doCopy;
                return this;
            }

            /**
             * <p>The retention period of the backup data. Minimum value: 1. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>The name of the backup policy.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-test-name</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The backup policy. Format: I|{startTime}|{interval}. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, I|1631685600|P1D specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
             * <p>startTime: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds. interval: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.</p>
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
