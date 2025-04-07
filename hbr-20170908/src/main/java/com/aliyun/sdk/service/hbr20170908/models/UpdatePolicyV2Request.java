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
 * {@link UpdatePolicyV2Request} extends {@link RequestModel}
 *
 * <p>UpdatePolicyV2Request</p>
 */
public class UpdatePolicyV2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyDescription")
    private String policyDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    private UpdatePolicyV2Request(Builder builder) {
        super(builder);
        this.policyDescription = builder.policyDescription;
        this.policyId = builder.policyId;
        this.policyName = builder.policyName;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePolicyV2Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyDescription
     */
    public String getPolicyDescription() {
        return this.policyDescription;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<UpdatePolicyV2Request, Builder> {
        private String policyDescription; 
        private String policyId; 
        private String policyName; 
        private java.util.List<Rules> rules; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePolicyV2Request request) {
            super(request);
            this.policyDescription = request.policyDescription;
            this.policyId = request.policyId;
            this.policyName = request.policyName;
            this.rules = request.rules;
        } 

        /**
         * <p>The description of the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Data is backed up at 10:00:00 every day and replicated to the China (Shanghai) region for geo-redundancy.</p>
         */
        public Builder policyDescription(String policyDescription) {
            this.putBodyParameter("PolicyDescription", policyDescription);
            this.policyDescription = policyDescription;
            return this;
        }

        /**
         * <p>The ID of the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>po-000************viy</p>
         */
        public Builder policyId(String policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The name of the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily Local Backup + Remote Backup</p>
         */
        public Builder policyName(String policyName) {
            this.putBodyParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>The rules in the backup policy.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putBodyParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        @Override
        public UpdatePolicyV2Request build() {
            return new UpdatePolicyV2Request(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePolicyV2Request} extends {@link TeaModel}
     *
     * <p>UpdatePolicyV2Request</p>
     */
    public static class DataSourceFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceIds")
        private java.util.List<String> dataSourceIds;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        private DataSourceFilters(Builder builder) {
            this.dataSourceIds = builder.dataSourceIds;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceFilters create() {
            return builder().build();
        }

        /**
         * @return dataSourceIds
         */
        public java.util.List<String> getDataSourceIds() {
            return this.dataSourceIds;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private java.util.List<String> dataSourceIds; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(DataSourceFilters model) {
                this.dataSourceIds = model.dataSourceIds;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>This parameter is deprecated.</p>
             */
            public Builder dataSourceIds(java.util.List<String> dataSourceIds) {
                this.dataSourceIds = dataSourceIds;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li><strong>UDM_ECS</strong>: Elastic Compute Service (ECS) instance This type of data source is supported only if the <strong>RuleType</strong> parameter is set to <strong>UDM_ECS_ONLY</strong>.</li>
             * <li><strong>OSS</strong>: Object Storage Service (OSS) bucket This type of data source is supported only if the <strong>RuleType</strong> parameter is set to <strong>STANDARD</strong>.</li>
             * <li><strong>NAS</strong>: File Storage NAS (NAS) file system This type of data source is supported only if the <strong>RuleType</strong> parameter is set to <strong>STANDARD</strong>.</li>
             * <li><strong>ECS_FILE</strong>: ECS file This type of data source is supported only if the <strong>RuleType</strong> parameter is set to <strong>STANDARD</strong>.</li>
             * <li><strong>OTS</strong>: Tablestore instance This type of data source is supported only if the <strong>RuleType</strong> parameter is set to <strong>STANDARD</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UDM_ECS</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public DataSourceFilters build() {
                return new DataSourceFilters(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdatePolicyV2Request} extends {@link TeaModel}
     *
     * <p>UpdatePolicyV2Request</p>
     */
    public static class RetentionRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvancedRetentionType")
        private String advancedRetentionType;

        @com.aliyun.core.annotation.NameInMap("Retention")
        private Long retention;

        @com.aliyun.core.annotation.NameInMap("WhichSnapshot")
        private Long whichSnapshot;

        private RetentionRules(Builder builder) {
            this.advancedRetentionType = builder.advancedRetentionType;
            this.retention = builder.retention;
            this.whichSnapshot = builder.whichSnapshot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetentionRules create() {
            return builder().build();
        }

        /**
         * @return advancedRetentionType
         */
        public String getAdvancedRetentionType() {
            return this.advancedRetentionType;
        }

        /**
         * @return retention
         */
        public Long getRetention() {
            return this.retention;
        }

        /**
         * @return whichSnapshot
         */
        public Long getWhichSnapshot() {
            return this.whichSnapshot;
        }

        public static final class Builder {
            private String advancedRetentionType; 
            private Long retention; 
            private Long whichSnapshot; 

            private Builder() {
            } 

            private Builder(RetentionRules model) {
                this.advancedRetentionType = model.advancedRetentionType;
                this.retention = model.retention;
                this.whichSnapshot = model.whichSnapshot;
            } 

            /**
             * <p>The type of the special retention rule. Valid values:</p>
             * <ul>
             * <li><strong>WEEKLY</strong>: retains weekly backups</li>
             * <li><strong>MONTHLY</strong>: retains monthly backups</li>
             * <li><strong>YEARLY</strong>: retains yearly backups</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>YEARLY</p>
             */
            public Builder advancedRetentionType(String advancedRetentionType) {
                this.advancedRetentionType = advancedRetentionType;
                return this;
            }

            /**
             * <p>The special retention period of backups. Minimum value: 1. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>365</p>
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>Specifies which backup is retained based on the special retention rule. Only the first backup can be retained.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder whichSnapshot(Long whichSnapshot) {
                this.whichSnapshot = whichSnapshot;
                return this;
            }

            public RetentionRules build() {
                return new RetentionRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdatePolicyV2Request} extends {@link TeaModel}
     *
     * <p>UpdatePolicyV2Request</p>
     */
    public static class TagFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagFilters(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagFilters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private String value; 

            private Builder() {
            } 

            private Builder(TagFilters model) {
                this.key = model.key;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag-based matching rule. Valid values:</p>
             * <ul>
             * <li><strong>EQUAL</strong>: Both the tag key and tag value are matched.</li>
             * <li><strong>NOT</strong>: The tag key is matched and the tag value is not matched.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EQUAL</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The tag value. If you leave this parameter empty, the value is any value.</p>
             * 
             * <strong>example:</strong>
             * <p>prod</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagFilters build() {
                return new TagFilters(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdatePolicyV2Request} extends {@link TeaModel}
     *
     * <p>UpdatePolicyV2Request</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchiveDays")
        private Long archiveDays;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("ColdArchiveDays")
        private Long coldArchiveDays;

        @com.aliyun.core.annotation.NameInMap("DataSourceFilters")
        private java.util.List<DataSourceFilters> dataSourceFilters;

        @com.aliyun.core.annotation.NameInMap("Immutable")
        private Boolean immutable;

        @com.aliyun.core.annotation.NameInMap("KeepLatestSnapshots")
        private Long keepLatestSnapshots;

        @com.aliyun.core.annotation.NameInMap("ReplicationRegionId")
        private String replicationRegionId;

        @com.aliyun.core.annotation.NameInMap("Retention")
        private Long retention;

        @com.aliyun.core.annotation.NameInMap("RetentionRules")
        private java.util.List<RetentionRules> retentionRules;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Schedule")
        private String schedule;

        @com.aliyun.core.annotation.NameInMap("TagFilters")
        private java.util.List<TagFilters> tagFilters;

        @com.aliyun.core.annotation.NameInMap("VaultId")
        private String vaultId;

        private Rules(Builder builder) {
            this.archiveDays = builder.archiveDays;
            this.backupType = builder.backupType;
            this.coldArchiveDays = builder.coldArchiveDays;
            this.dataSourceFilters = builder.dataSourceFilters;
            this.immutable = builder.immutable;
            this.keepLatestSnapshots = builder.keepLatestSnapshots;
            this.replicationRegionId = builder.replicationRegionId;
            this.retention = builder.retention;
            this.retentionRules = builder.retentionRules;
            this.ruleId = builder.ruleId;
            this.ruleType = builder.ruleType;
            this.schedule = builder.schedule;
            this.tagFilters = builder.tagFilters;
            this.vaultId = builder.vaultId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return archiveDays
         */
        public Long getArchiveDays() {
            return this.archiveDays;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return coldArchiveDays
         */
        public Long getColdArchiveDays() {
            return this.coldArchiveDays;
        }

        /**
         * @return dataSourceFilters
         */
        public java.util.List<DataSourceFilters> getDataSourceFilters() {
            return this.dataSourceFilters;
        }

        /**
         * @return immutable
         */
        public Boolean getImmutable() {
            return this.immutable;
        }

        /**
         * @return keepLatestSnapshots
         */
        public Long getKeepLatestSnapshots() {
            return this.keepLatestSnapshots;
        }

        /**
         * @return replicationRegionId
         */
        public String getReplicationRegionId() {
            return this.replicationRegionId;
        }

        /**
         * @return retention
         */
        public Long getRetention() {
            return this.retention;
        }

        /**
         * @return retentionRules
         */
        public java.util.List<RetentionRules> getRetentionRules() {
            return this.retentionRules;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return schedule
         */
        public String getSchedule() {
            return this.schedule;
        }

        /**
         * @return tagFilters
         */
        public java.util.List<TagFilters> getTagFilters() {
            return this.tagFilters;
        }

        /**
         * @return vaultId
         */
        public String getVaultId() {
            return this.vaultId;
        }

        public static final class Builder {
            private Long archiveDays; 
            private String backupType; 
            private Long coldArchiveDays; 
            private java.util.List<DataSourceFilters> dataSourceFilters; 
            private Boolean immutable; 
            private Long keepLatestSnapshots; 
            private String replicationRegionId; 
            private Long retention; 
            private java.util.List<RetentionRules> retentionRules; 
            private String ruleId; 
            private String ruleType; 
            private String schedule; 
            private java.util.List<TagFilters> tagFilters; 
            private String vaultId; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.archiveDays = model.archiveDays;
                this.backupType = model.backupType;
                this.coldArchiveDays = model.coldArchiveDays;
                this.dataSourceFilters = model.dataSourceFilters;
                this.immutable = model.immutable;
                this.keepLatestSnapshots = model.keepLatestSnapshots;
                this.replicationRegionId = model.replicationRegionId;
                this.retention = model.retention;
                this.retentionRules = model.retentionRules;
                this.ruleId = model.ruleId;
                this.ruleType = model.ruleType;
                this.schedule = model.schedule;
                this.tagFilters = model.tagFilters;
                this.vaultId = model.vaultId;
            } 

            /**
             * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>TRANSITION</strong>. This parameter specifies the time when data is dumped from a backup vault to an archive vault. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder archiveDays(Long archiveDays) {
                this.archiveDays = archiveDays;
                return this;
            }

            /**
             * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>BACKUP</strong>. This parameter specifies the backup type. Valid value: <strong>COMPLETE</strong>, which indicates full backup.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>TRANSITION</strong>. This parameter specifies the time when data is dumped from a backup vault to a cold archive vault. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>365</p>
             */
            public Builder coldArchiveDays(Long coldArchiveDays) {
                this.coldArchiveDays = coldArchiveDays;
                return this;
            }

            /**
             * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>TAG</strong>. This parameter specifies the data source filter rule.</p>
             */
            public Builder dataSourceFilters(java.util.List<DataSourceFilters> dataSourceFilters) {
                this.dataSourceFilters = dataSourceFilters;
                return this;
            }

            /**
             * <p>This parameter is required only if the <strong>PolicyType</strong> parameter is set to <strong>UDM_ECS_ONLY</strong>. This parameter specifies whether to enable the immutable backup feature.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder immutable(Boolean immutable) {
                this.immutable = immutable;
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
                this.keepLatestSnapshots = keepLatestSnapshots;
                return this;
            }

            /**
             * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>REPLICATION</strong>. This parameter specifies the ID of the destination region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder replicationRegionId(String replicationRegionId) {
                this.replicationRegionId = replicationRegionId;
                return this;
            }

            /**
             * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>TRANSITION</strong> or <strong>REPLICATION</strong>.</p>
             * <ul>
             * <li>If the <strong>RuleType</strong> parameter is set to <strong>TRANSITION</strong>, this parameter specifies the retention period of the backup data. Minimum value: 1. Unit: days.</li>
             * <li>If the <strong>RuleType</strong> parameter is set to <strong>REPLICATION</strong>, this parameter specifies the retention period of remote backups. Minimum value: 1. Unit: days.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>TRANSITION</strong>. This parameter specifies the special retention rules.</p>
             */
            public Builder retentionRules(java.util.List<RetentionRules> retentionRules) {
                this.retentionRules = retentionRules;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-000************rof</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The type of the rule. Each backup policy must have at least one rule of the <strong>BACKUP</strong> type and only one rule of the <strong>TRANSITION</strong> type. Valid values:</p>
             * <ul>
             * <li><strong>BACKUP</strong>: backup rule</li>
             * <li><strong>TRANSITION</strong>: lifecycle rule</li>
             * <li><strong>REPLICATION</strong>: replication rule</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BACKUP</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>BACKUP</strong>. This parameter specifies the backup schedule settings. Formats:</p>
             * <ul>
             * <li><p><code>I|{startTime}|{interval}</code>: The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. For example, <code>I|1631685600|P1D</code> indicates that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
             * <ul>
             * <li>startTime: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds.</li>
             * <li>interval: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, <code>PT1H</code> specifies an interval of 1 hour. <code>P1D</code> specifies an interval of one day.</li>
             * </ul>
             * </li>
             * <li><p><code>C|{startTime}|{crontab}</code>: The system runs backup jobs at a point in time that is specified in the {startTime} parameter based on the {crontab} expression. For example, C|1631685600|0 0 2 ?* 3,5,7 indicates that the system runs backup jobs at 02:00:00 every Tuesday, Thursday, and Saturday from14:00:00 on September 15, 2021.``</p>
             * <ul>
             * <li>startTime: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds.</li>
             * <li>crontab: the crontab expression. For example, 0 0 2 ?* 3,5,7 indicates 02:00:00 every Tuesday, Thursday, and Saturday.``</li>
             * </ul>
             * </li>
             * </ul>
             * <p>The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>I|1648647166|P1D</p>
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>TAG</strong>. This parameter specifies the resource tag filter rule.</p>
             */
            public Builder tagFilters(java.util.List<TagFilters> tagFilters) {
                this.tagFilters = tagFilters;
                return this;
            }

            /**
             * <p>This parameter is required only if the RuleType parameter is set to BACKUP. The ID of the backup vault.</p>
             * 
             * <strong>example:</strong>
             * <p>v-0001************aseg</p>
             */
            public Builder vaultId(String vaultId) {
                this.vaultId = vaultId;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
