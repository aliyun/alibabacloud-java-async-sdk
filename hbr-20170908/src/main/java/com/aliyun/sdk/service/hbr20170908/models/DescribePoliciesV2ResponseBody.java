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
    private java.util.List<Policies> policies;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Policies> getPolicies() {
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
        private java.util.List<Policies> policies; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribePoliciesV2ResponseBody model) {
            this.code = model.code;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.policies = model.policies;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The response code. 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The number of results per query.</p>
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
         * <p>The returned message. The value &quot;successful&quot; is returned for a successful request. An error message is returned for a failed request.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The token required to retrieve the next page of policies.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of policies.</p>
         */
        public Builder policies(java.util.List<Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed.</li>
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
         * <p>The total number of records.</p>
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
     * {@link DescribePoliciesV2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePoliciesV2ResponseBody</p>
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
             * <li><strong>UDM_ECS</strong>: ECS instance backup.</li>
             * <li><strong>OSS</strong>: OSS backup.</li>
             * <li><strong>NAS</strong>: Alibaba Cloud NAS backup.</li>
             * <li><strong>ECS_FILE</strong>: ECS File Backup Essential Edition.</li>
             * <li><strong>OTS</strong>: Tablestore backup.</li>
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
             * <p>730</p>
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>The backup to which the rule applies. Currently, only the first backup is supported. The value is 1.</p>
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
             * <li><strong>EQUAL</strong>: matches both the tag key and the tag value.</li>
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
             * <p>30</p>
             */
            public Builder archiveDays(Long archiveDays) {
                this.archiveDays = archiveDays;
                return this;
            }

            /**
             * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>BACKUP</strong>. The backup type. The value is <strong>COMPLETE</strong>, which indicates a full backup.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
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
             * <p>This parameter is valid only when <strong>PolicyType</strong> is set to <strong>UDM_ECS_ONLY</strong>. Specifies whether to enable backup locking.</p>
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
             * <li><strong>0</strong>: Do not retain.</li>
             * <li><strong>1</strong>: Retain.</li>
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
             * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>REPLICATION</strong>. The destination region ID for replication.</p>
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
             * <li><strong>RuleType</strong> is set to <strong>TRANSITION</strong>: the retention period of the backup. Minimum value: 1. Unit: days.</li>
             * <li><strong>RuleType</strong> is set to <strong>REPLICATION</strong>: the retention period of the geo-redundancy backup. Minimum value: 1. Unit: days.</li>
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
             * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>TRANSITION</strong>. The list of special retention rules.</p>
             */
            public Builder retentionRules(java.util.List<RetentionRules> retentionRules) {
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
             * <p>This parameter is required only when <strong>RuleType</strong> is set to <strong>BACKUP</strong>. The backup schedule. Optional format: <code>I|{startTime}|{interval}</code>. This indicates that a backup job is executed at every {interval} starting from {startTime}. Backup jobs for past time periods are not compensated. If the previous backup job is not completed, the next backup job is not triggered. For example, <code>I|1631685600|P1D</code> indicates that a backup is performed once a day starting from 2021-09-15 14:00:00.</p>
             * <ul>
             * <li>startTime: the start time of the backup. UNIX timestamp, in seconds.</li>
             * <li>interval: the ISO 8601 time interval. For example, PT1H indicates an interval of one hour. P1D indicates an interval of one day.</li>
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
        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

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
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        private Policies(Builder builder) {
            this.businessStatus = builder.businessStatus;
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
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
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
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String businessStatus; 
            private Long createdTime; 
            private Long policyBindingCount; 
            private String policyDescription; 
            private String policyId; 
            private String policyName; 
            private String policyType; 
            private java.util.List<Rules> rules; 
            private Long updatedTime; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.businessStatus = model.businessStatus;
                this.createdTime = model.createdTime;
                this.policyBindingCount = model.policyBindingCount;
                this.policyDescription = model.policyDescription;
                this.policyId = model.policyId;
                this.policyName = model.policyName;
                this.policyType = model.policyType;
                this.rules = model.rules;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * <p>The user business status.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>The creation time. UNIX timestamp, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1650248136</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The number of data sources bound to the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder policyBindingCount(Long policyBindingCount) {
                this.policyBindingCount = policyBindingCount;
                return this;
            }

            /**
             * <p>The policy description.</p>
             * 
             * <strong>example:</strong>
             * <p>Back up every day at 10:00 AM and replicate to Shanghai</p>
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>po-000************bkz</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>Daily backup + geo-redundancy backup</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The policy type. Valid values:</p>
             * <ul>
             * <li><strong>STANDARD</strong>: general backup policy. Supports backing up data sources other than ECS instance backup.</li>
             * <li><strong>UDM_ECS_ONLY</strong>: ECS instance backup policy. Supports backing up only ECS instances.</li>
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
             * <p>The list of policy rules.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The update time. UNIX timestamp, in seconds.</p>
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
