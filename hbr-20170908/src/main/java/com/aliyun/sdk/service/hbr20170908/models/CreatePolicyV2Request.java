// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePolicyV2Request} extends {@link RequestModel}
 *
 * <p>CreatePolicyV2Request</p>
 */
public class CreatePolicyV2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyDescription")
    private String policyDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    private String policyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List < Rules> rules;

    private CreatePolicyV2Request(Builder builder) {
        super(builder);
        this.policyDescription = builder.policyDescription;
        this.policyName = builder.policyName;
        this.policyType = builder.policyType;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyV2Request create() {
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
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return rules
     */
    public java.util.List < Rules> getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<CreatePolicyV2Request, Builder> {
        private String policyDescription; 
        private String policyName; 
        private String policyType; 
        private java.util.List < Rules> rules; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolicyV2Request request) {
            super(request);
            this.policyDescription = request.policyDescription;
            this.policyName = request.policyName;
            this.policyType = request.policyType;
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
         * PolicyType.
         */
        public Builder policyType(String policyType) {
            this.putBodyParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * <p>The rules in the backup policy.</p>
         */
        public Builder rules(java.util.List < Rules> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putBodyParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        @Override
        public CreatePolicyV2Request build() {
            return new CreatePolicyV2Request(this);
        } 

    } 

    /**
     * 
     * {@link CreatePolicyV2Request} extends {@link TeaModel}
     *
     * <p>CreatePolicyV2Request</p>
     */
    public static class DataSourceFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceIds")
        private java.util.List < String > dataSourceIds;

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
        public java.util.List < String > getDataSourceIds() {
            return this.dataSourceIds;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private java.util.List < String > dataSourceIds; 
            private String sourceType; 

            /**
             * DataSourceIds.
             */
            public Builder dataSourceIds(java.util.List < String > dataSourceIds) {
                this.dataSourceIds = dataSourceIds;
                return this;
            }

            /**
             * SourceType.
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
     * {@link CreatePolicyV2Request} extends {@link TeaModel}
     *
     * <p>CreatePolicyV2Request</p>
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
             * <p>730</p>
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
     * {@link CreatePolicyV2Request} extends {@link TeaModel}
     *
     * <p>CreatePolicyV2Request</p>
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Value.
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
     * {@link CreatePolicyV2Request} extends {@link TeaModel}
     *
     * <p>CreatePolicyV2Request</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("DataSourceFilters")
        private java.util.List < DataSourceFilters> dataSourceFilters;

        @com.aliyun.core.annotation.NameInMap("KeepLatestSnapshots")
        private Long keepLatestSnapshots;

        @com.aliyun.core.annotation.NameInMap("ReplicationRegionId")
        private String replicationRegionId;

        @com.aliyun.core.annotation.NameInMap("Retention")
        private Long retention;

        @com.aliyun.core.annotation.NameInMap("RetentionRules")
        private java.util.List < RetentionRules> retentionRules;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Schedule")
        private String schedule;

        @com.aliyun.core.annotation.NameInMap("TagFilters")
        private java.util.List < TagFilters> tagFilters;

        @com.aliyun.core.annotation.NameInMap("VaultId")
        private String vaultId;

        private Rules(Builder builder) {
            this.backupType = builder.backupType;
            this.dataSourceFilters = builder.dataSourceFilters;
            this.keepLatestSnapshots = builder.keepLatestSnapshots;
            this.replicationRegionId = builder.replicationRegionId;
            this.retention = builder.retention;
            this.retentionRules = builder.retentionRules;
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
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return dataSourceFilters
         */
        public java.util.List < DataSourceFilters> getDataSourceFilters() {
            return this.dataSourceFilters;
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
        public java.util.List < RetentionRules> getRetentionRules() {
            return this.retentionRules;
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
        public java.util.List < TagFilters> getTagFilters() {
            return this.tagFilters;
        }

        /**
         * @return vaultId
         */
        public String getVaultId() {
            return this.vaultId;
        }

        public static final class Builder {
            private String backupType; 
            private java.util.List < DataSourceFilters> dataSourceFilters; 
            private Long keepLatestSnapshots; 
            private String replicationRegionId; 
            private Long retention; 
            private java.util.List < RetentionRules> retentionRules; 
            private String ruleType; 
            private String schedule; 
            private java.util.List < TagFilters> tagFilters; 
            private String vaultId; 

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
             * DataSourceFilters.
             */
            public Builder dataSourceFilters(java.util.List < DataSourceFilters> dataSourceFilters) {
                this.dataSourceFilters = dataSourceFilters;
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
             * <li>If the <strong>RuleType</strong> parameter is set to <strong>TRANSITION</strong>, this parameter specifies the retention period of the backup data. Minimum value: 1. Maximum value: 364635. Unit: days.</li>
             * <li>If the <strong>RuleType</strong> parameter is set to <strong>REPLICATION</strong>, this parameter specifies the retention period of remote backups. Minimum value: 1. Maximum value: 364635. Unit: days.</li>
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
            public Builder retentionRules(java.util.List < RetentionRules> retentionRules) {
                this.retentionRules = retentionRules;
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
             * <p>This parameter is required only if the <strong>RuleType</strong> parameter is set to <strong>BACKUP</strong>. This parameter specifies the backup schedule settings. Format: <code>I|{startTime}|{interval}</code>. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, <code>I|1631685600|P1D</code> specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
             * <ul>
             * <li>startTime: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds.</li>
             * <li>interval: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of 1 hour. P1D specifies an interval of one day.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>I|1648647166|P1D</p>
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * TagFilters.
             */
            public Builder tagFilters(java.util.List < TagFilters> tagFilters) {
                this.tagFilters = tagFilters;
                return this;
            }

            /**
             * VaultId.
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
