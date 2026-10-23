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
         * <p>The policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>Back up once every day at 10:00 AM, with cross-region backup to Shanghai.</p>
         */
        public Builder policyDescription(String policyDescription) {
            this.putBodyParameter("PolicyDescription", policyDescription);
            this.policyDescription = policyDescription;
            return this;
        }

        /**
         * <p>The policy ID.</p>
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
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily backup + geo-redundancy</p>
         */
        public Builder policyName(String policyName) {
            this.putBodyParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>The list of policy rules.</p>
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
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
        private String crossAccountRoleName;

        @com.aliyun.core.annotation.NameInMap("CrossAccountType")
        private String crossAccountType;

        @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
        private Long crossAccountUserId;

        private Accounts(Builder builder) {
            this.crossAccountRoleName = builder.crossAccountRoleName;
            this.crossAccountType = builder.crossAccountType;
            this.crossAccountUserId = builder.crossAccountUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
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

        public static final class Builder {
            private String crossAccountRoleName; 
            private String crossAccountType; 
            private Long crossAccountUserId; 

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.crossAccountRoleName = model.crossAccountRoleName;
                this.crossAccountType = model.crossAccountType;
                this.crossAccountUserId = model.crossAccountUserId;
            } 

            /**
             * CrossAccountRoleName.
             */
            public Builder crossAccountRoleName(String crossAccountRoleName) {
                this.crossAccountRoleName = crossAccountRoleName;
                return this;
            }

            /**
             * CrossAccountType.
             */
            public Builder crossAccountType(String crossAccountType) {
                this.crossAccountType = crossAccountType;
                return this;
            }

            /**
             * CrossAccountUserId.
             */
            public Builder crossAccountUserId(Long crossAccountUserId) {
                this.crossAccountUserId = crossAccountUserId;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdatePolicyV2Request} extends {@link TeaModel}
     *
     * <p>UpdatePolicyV2Request</p>
     */
    public static class DataSourceFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountScope")
        private String accountScope;

        @com.aliyun.core.annotation.NameInMap("Accounts")
        private java.util.List<Accounts> accounts;

        @com.aliyun.core.annotation.NameInMap("DataSourceIds")
        @Deprecated
        private java.util.List<String> dataSourceIds;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        private DataSourceFilters(Builder builder) {
            this.accountScope = builder.accountScope;
            this.accounts = builder.accounts;
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
         * @return accountScope
         */
        public String getAccountScope() {
            return this.accountScope;
        }

        /**
         * @return accounts
         */
        public java.util.List<Accounts> getAccounts() {
            return this.accounts;
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
            private String accountScope; 
            private java.util.List<Accounts> accounts; 
            private java.util.List<String> dataSourceIds; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(DataSourceFilters model) {
                this.accountScope = model.accountScope;
                this.accounts = model.accounts;
                this.dataSourceIds = model.dataSourceIds;
                this.sourceType = model.sourceType;
            } 

            /**
             * AccountScope.
             */
            public Builder accountScope(String accountScope) {
                this.accountScope = accountScope;
                return this;
            }

            /**
             * Accounts.
             */
            public Builder accounts(java.util.List<Accounts> accounts) {
                this.accounts = accounts;
                return this;
            }

            /**
             * <p>Deprecated.</p>
             */
            public Builder dataSourceIds(java.util.List<String> dataSourceIds) {
                this.dataSourceIds = dataSourceIds;
                return this;
            }

            /**
             * <p>The data source type. Valid values:</p>
             * <ul>
             * <li><strong>UDM_ECS</strong>: ECS instance backup. This data source type is supported only when <strong>RuleType</strong> is set to <strong>UDM_ECS_ONLY</strong>.</li>
             * <li><strong>OSS</strong>: OSS backup. This data source type is supported only when <strong>RuleType</strong> is set to <strong>STANDARD</strong>.</li>
             * <li><strong>NAS</strong>: Alibaba Cloud NAS backup. This data source type is supported only when <strong>RuleType</strong> is set to <strong>STANDARD</strong>.</li>
             * <li><strong>ECS_FILE</strong>: ECS File Backup Essential Edition. This data source type is supported only when <strong>RuleType</strong> is set to <strong>STANDARD</strong>.</li>
             * <li><strong>OTS</strong>: Tablestore backup. This data source type is supported only when <strong>RuleType</strong> is set to <strong>STANDARD</strong>.</li>
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
             * <li><strong>WEEKLY</strong>: weekly backup.</li>
             * <li><strong>MONTHLY</strong>: monthly backup.</li>
             * <li><strong>YEARLY</strong>: yearly backup.</li>
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
             * <p>The special retention period of the backup. Minimum value: 1. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>365</p>
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>The backup to which the rule applies. Currently, only the first backup is supported. Set the value to 1.</p>
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
             * <p>The tag matching rule. Valid values:</p>
             * <ul>
             * <li><strong>EQUAL</strong>: matches both the tag key and tag value.</li>
             * <li><strong>NOT</strong>: matches the tag key but not the tag value.</li>
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
             * <p>The tag value. An empty value indicates any value.</p>
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
             * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>TRANSITION</strong>. The number of days after which the backup is converted to archive storage. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder archiveDays(Long archiveDays) {
                this.archiveDays = archiveDays;
                return this;
            }

            /**
             * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>BACKUP</strong>. The backup type. Set the value to <strong>COMPLETE</strong>, which indicates full backup.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>TRANSITION</strong>. The number of days after which the backup is converted to cold archive storage. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>365</p>
             */
            public Builder coldArchiveDays(Long coldArchiveDays) {
                this.coldArchiveDays = coldArchiveDays;
                return this;
            }

            /**
             * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>TAG</strong>. The data source filter rules.</p>
             */
            public Builder dataSourceFilters(java.util.List<DataSourceFilters> dataSourceFilters) {
                this.dataSourceFilters = dataSourceFilters;
                return this;
            }

            /**
             * <p>This parameter is required only when <strong>PolicyType</strong> is set to <strong>UDM_ECS_ONLY</strong> and <strong>RuleType</strong> is set to <strong>SECURITY</strong>. Specifies whether to enable backup locking.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder immutable(Boolean immutable) {
                this.immutable = immutable;
                return this;
            }

            /**
             * <p>Specifies whether to retain at least one backup version. Valid values:</p>
             * <ul>
             * <li>0: do not retain.</li>
             * <li>1: retain.</li>
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
             * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>REPLICATION</strong>. The ID of the destination region for replication.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder replicationRegionId(String replicationRegionId) {
                this.replicationRegionId = replicationRegionId;
                return this;
            }

            /**
             * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>TRANSITION</strong> or <strong>REPLICATION</strong>.</p>
             * <ul>
             * <li>If <strong>RuleType</strong> is set to <strong>TRANSITION</strong>: the retention period of the backup. Minimum value: 1. Unit: days.</li>
             * <li>If <strong>RuleType</strong> is set to <strong>REPLICATION</strong>: the retention period of the cross-region backup. Minimum value: 1. Unit: days.</li>
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
             * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>TRANSITION</strong>. The special retention rules.</p>
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
             * <p>The rule type. Each policy must have at least one <strong>BACKUP</strong> rule and exactly one <strong>TRANSITION</strong> rule. Valid values:</p>
             * <ul>
             * <li><strong>BACKUP</strong>: backup rule.</li>
             * <li><strong>TRANSITION</strong>: lifecycle rule.</li>
             * <li><strong>REPLICATION</strong>: replication rule.</li>
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
             * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>BACKUP</strong>. The backup schedule settings. Supported formats:</p>
             * <ul>
             * <li><p><code>I|{startTime}|{interval}</code>: specifies that a backup job is run at the {interval} from the {startTime}. Example: <code>I|1631685600|P1D</code> specifies that a backup job is run once a day starting from 2021-09-15 14:00:00.</p>
             * <ul>
             * <li>startTime: the start time of the backup. This value is a UNIX timestamp. Unit: seconds.</li>
             * <li>interval: the ISO 8601 time interval. Example: <code>PT1H</code> specifies an interval of one hour. <code>P1D</code> specifies an interval of one day.</li>
             * </ul>
             * </li>
             * <li><p><code>C|{startTime}|{crontab}</code>: specifies that a backup job is run based on the {crontab} expression from the {startTime}. Example: <code>C|1631685600|0 0 2 ? * 3,5,7</code> specifies that a backup job is run at 02:00:00 every Tuesday, Thursday, and Saturday starting from 2021-09-15 14:00:00.</p>
             * <ul>
             * <li>startTime: the start time of the backup. This value is a UNIX timestamp. Unit: seconds.</li>
             * <li>crontab: the crontab expression. Example: <code>0 0 2 ? * 3,5,7</code> specifies every Tuesday, Thursday, and Saturday at 02:00:00.</li>
             * </ul>
             * </li>
             * </ul>
             * <p>Backup jobs for elapsed time periods are not compensated. If the previous backup job is not completed, the next backup job is not triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>I|1648647166|P1D</p>
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>TAG</strong>. The resource tag filter rules.</p>
             */
            public Builder tagFilters(java.util.List<TagFilters> tagFilters) {
                this.tagFilters = tagFilters;
                return this;
            }

            /**
             * <p>This parameter is required only when RuleType is set to BACKUP. The backup vault ID.</p>
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
