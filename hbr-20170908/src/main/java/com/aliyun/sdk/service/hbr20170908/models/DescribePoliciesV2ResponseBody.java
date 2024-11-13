// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePoliciesV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePoliciesV2ResponseBody</p>
 */
public class DescribePoliciesV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Policies")
    private java.util.List < Policies> policies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribePoliciesV2ResponseBody(Builder builder) {
        this.code = builder.code;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.policies = builder.policies;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePoliciesV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return policies
     */
    public java.util.List < Policies> getPolicies() {
        return this.policies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private java.util.List < Policies> policies; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The number of results for each query.</p>
         * <p>Valid values: 10 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The message that is returned. If the call is successful, &quot;successful&quot; is returned. If the call fails, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The token that is used to obtain the next page of backup policies.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The backup policies.</p>
         */
        public Builder policies(java.util.List < Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePoliciesV2ResponseBody build() {
            return new DescribePoliciesV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePoliciesV2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePoliciesV2ResponseBody</p>
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
     * {@link DescribePoliciesV2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePoliciesV2ResponseBody</p>
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
             * <li><strong>WEEKLY</strong>: weekly backups</li>
             * <li><strong>MONTHLY</strong>: monthly backups</li>
             * <li><strong>YEARLY</strong>: yearly backups</li>
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
             * <p>Indicates which backup is retained based on the special retention rule. Only the first backup can be retained.</p>
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
     * {@link DescribePoliciesV2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePoliciesV2ResponseBody</p>
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
     * {@link DescribePoliciesV2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePoliciesV2ResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchiveDays")
        private Long archiveDays;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("DataSourceFilters")
        private java.util.List < DataSourceFilters> dataSourceFilters;

        @com.aliyun.core.annotation.NameInMap("Immutable")
        private Boolean immutable;

        @com.aliyun.core.annotation.NameInMap("KeepLatestSnapshots")
        private Long keepLatestSnapshots;

        @com.aliyun.core.annotation.NameInMap("ReplicationRegionId")
        private String replicationRegionId;

        @com.aliyun.core.annotation.NameInMap("Retention")
        private Long retention;

        @com.aliyun.core.annotation.NameInMap("RetentionRules")
        private java.util.List < RetentionRules> retentionRules;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Schedule")
        private String schedule;

        @com.aliyun.core.annotation.NameInMap("TagFilters")
        private java.util.List < TagFilters> tagFilters;

        @com.aliyun.core.annotation.NameInMap("VaultId")
        private String vaultId;

        private Rules(Builder builder) {
            this.archiveDays = builder.archiveDays;
            this.backupType = builder.backupType;
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
         * @return dataSourceFilters
         */
        public java.util.List < DataSourceFilters> getDataSourceFilters() {
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
        public java.util.List < RetentionRules> getRetentionRules() {
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
            private Long archiveDays; 
            private String backupType; 
            private java.util.List < DataSourceFilters> dataSourceFilters; 
            private Boolean immutable; 
            private Long keepLatestSnapshots; 
            private String replicationRegionId; 
            private Long retention; 
            private java.util.List < RetentionRules> retentionRules; 
            private String ruleId; 
            private String ruleType; 
            private String schedule; 
            private java.util.List < TagFilters> tagFilters; 
            private String vaultId; 

            /**
             * <p>This parameter is returned only if the value of the <strong>RuleType</strong> parameter is <strong>TRANSITION</strong>. This parameter indicates the time when data is dumped from a backup vault to an archive vault. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder archiveDays(Long archiveDays) {
                this.archiveDays = archiveDays;
                return this;
            }

            /**
             * <p>This parameter is returned only if the value of the <strong>RuleType</strong> parameter is <strong>BACKUP</strong>. This parameter indicates the backup type. Valid value: <strong>COMPLETE</strong>, which indicates full backup.</p>
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
             * Immutable.
             */
            public Builder immutable(Boolean immutable) {
                this.immutable = immutable;
                return this;
            }

            /**
             * <p>Indicates whether the feature of keeping at least one backup version is enabled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The feature is disabled.</li>
             * <li><strong>1</strong>: The feature is enabled.</li>
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
             * <p>This parameter is returned only if the value of the <strong>RuleType</strong> parameter is <strong>REPLICATION</strong>. This parameter indicates the ID of the destination region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder replicationRegionId(String replicationRegionId) {
                this.replicationRegionId = replicationRegionId;
                return this;
            }

            /**
             * <p>This parameter is returned only if the value of the <strong>RuleType</strong> parameter is <strong>TRANSITION</strong> or <strong>REPLICATION</strong>.</p>
             * <ul>
             * <li>If the value of the <strong>RuleType</strong> parameter is <strong>TRANSITION</strong>, this parameter indicates the retention period of the backup data. Minimum value: 1. Unit: days.</li>
             * <li>If the value of the <strong>RuleType</strong> parameter is <strong>REPLICATION</strong>, this parameter indicates the retention period of remote backups. Minimum value: 1. Unit: days.</li>
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
             * <p>This parameter is returned only if the value of the <strong>RuleType</strong> parameter is <strong>TRANSITION</strong>. This parameter indicates the special retention rules.</p>
             */
            public Builder retentionRules(java.util.List < RetentionRules> retentionRules) {
                this.retentionRules = retentionRules;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-000************f1e</p>
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
             * <p>This parameter is returned only if the value of the <strong>RuleType</strong> parameter is <strong>BACKUP</strong>. This parameter indicates the backup schedule settings. Format: <code>I|{startTime}|{interval}</code>. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, <code>I|1631685600|P1D</code> indicates that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
             * <ul>
             * <li>startTime: the time at which the system starts to run a backup job. The time follows the UNIX time format. Unit: seconds.</li>
             * <li>interval: the interval at which the system runs a backup job. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of 1 hour. P1D indicates an interval of one day.</li>
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
             * <p>This parameter is returned only if the value of the RuleType parameter is BACKUP. The ID of the backup vault.</p>
             * 
             * <strong>example:</strong>
             * <p>v-000**************kgm</p>
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
    /**
     * 
     * {@link DescribePoliciesV2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePoliciesV2ResponseBody</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("PolicyBindingCount")
        private Long policyBindingCount;

        @com.aliyun.core.annotation.NameInMap("PolicyDescription")
        private String policyDescription;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List < Rules> rules;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        private Policies(Builder builder) {
            this.createdTime = builder.createdTime;
            this.policyBindingCount = builder.policyBindingCount;
            this.policyDescription = builder.policyDescription;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policyType = builder.policyType;
            this.rules = builder.rules;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return policyBindingCount
         */
        public Long getPolicyBindingCount() {
            return this.policyBindingCount;
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

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private Long createdTime; 
            private Long policyBindingCount; 
            private String policyDescription; 
            private String policyId; 
            private String policyName; 
            private String policyType; 
            private java.util.List < Rules> rules; 
            private Long updatedTime; 

            /**
             * <p>The time when the backup policy was created. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1650248136</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The number of data sources that are bound to the backup policy.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder policyBindingCount(Long policyBindingCount) {
                this.policyBindingCount = policyBindingCount;
                return this;
            }

            /**
             * <p>The description of the backup policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Data is backed up at 10:00:00 every day and replicated to the China (Shanghai) region for geo-redundancy.</p>
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * <p>The ID of the backup policy.</p>
             * 
             * <strong>example:</strong>
             * <p>po-000************bkz</p>
             */
            public Builder policyId(String policyId) {
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
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The policy type. Valid values:</p>
             * <ul>
             * <li><strong>STANDARD</strong>: the general backup policy. This type of policy applies to backups other than Elastic Compute Service (ECS) instance backup.</li>
             * <li><strong>UDM_ECS_ONLY</strong>: the ECS instance backup policy. This type of policy applies only to ECS instance backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STANDARD</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>The rules in the backup policy.</p>
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The time when the backup policy was updated. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1662080404</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
