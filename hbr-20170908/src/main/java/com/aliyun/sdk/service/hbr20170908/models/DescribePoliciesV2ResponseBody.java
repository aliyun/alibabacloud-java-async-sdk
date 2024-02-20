// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePoliciesV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePoliciesV2ResponseBody</p>
 */
public class DescribePoliciesV2ResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("Message")
    private String message;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("Policies")
    private java.util.List < Policies> policies;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
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
         * The HTTP status code. The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The number of results for each query.
         * <p>
         * 
         * Valid values: 10 to 100. Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The token that is used to obtain the next page of backup policies.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The backup policies.
         */
        public Builder policies(java.util.List < Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePoliciesV2ResponseBody build() {
            return new DescribePoliciesV2ResponseBody(this);
        } 

    } 

    public static class RetentionRules extends TeaModel {
        @NameInMap("AdvancedRetentionType")
        private String advancedRetentionType;

        @NameInMap("Retention")
        private Long retention;

        @NameInMap("WhichSnapshot")
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
             * The type of the special retention rule. Valid values:
             * <p>
             * 
             * *   **WEEKLY**: weekly backups.
             * *   **MONTHLY**: monthly backups.
             * *   **YEARLY**: yearly backups.
             */
            public Builder advancedRetentionType(String advancedRetentionType) {
                this.advancedRetentionType = advancedRetentionType;
                return this;
            }

            /**
             * The retention period of the backup data. Minimum value: 1. Unit: days.
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * Indicates which backup is retained based on the special retention rule. Only the first backup can be retained.
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
    public static class Rules extends TeaModel {
        @NameInMap("ArchiveDays")
        private Long archiveDays;

        @NameInMap("BackupType")
        private String backupType;

        @NameInMap("KeepLatestSnapshots")
        private Long keepLatestSnapshots;

        @NameInMap("ReplicationRegionId")
        private String replicationRegionId;

        @NameInMap("Retention")
        private Long retention;

        @NameInMap("RetentionRules")
        private java.util.List < RetentionRules> retentionRules;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleType")
        private String ruleType;

        @NameInMap("Schedule")
        private String schedule;

        @NameInMap("VaultId")
        private String vaultId;

        private Rules(Builder builder) {
            this.archiveDays = builder.archiveDays;
            this.backupType = builder.backupType;
            this.keepLatestSnapshots = builder.keepLatestSnapshots;
            this.replicationRegionId = builder.replicationRegionId;
            this.retention = builder.retention;
            this.retentionRules = builder.retentionRules;
            this.ruleId = builder.ruleId;
            this.ruleType = builder.ruleType;
            this.schedule = builder.schedule;
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
         * @return vaultId
         */
        public String getVaultId() {
            return this.vaultId;
        }

        public static final class Builder {
            private Long archiveDays; 
            private String backupType; 
            private Long keepLatestSnapshots; 
            private String replicationRegionId; 
            private Long retention; 
            private java.util.List < RetentionRules> retentionRules; 
            private String ruleId; 
            private String ruleType; 
            private String schedule; 
            private String vaultId; 

            /**
             * ArchiveDays.
             */
            public Builder archiveDays(Long archiveDays) {
                this.archiveDays = archiveDays;
                return this;
            }

            /**
             * This parameter is returned only if the value of the **RuleType** parameter is **BACKUP**. This parameter indicates the backup type. Only **COMPLETE** may be returned, which indicates full backup.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * Indicates whether the feature of keeping at least one backup version is enabled. Valid values:
             * <p>
             * 
             * *   **0**: This feature is disabled.
             * *   **1**: This feature is enabled.
             */
            public Builder keepLatestSnapshots(Long keepLatestSnapshots) {
                this.keepLatestSnapshots = keepLatestSnapshots;
                return this;
            }

            /**
             * This parameter is returned only if the value of the **RuleType** parameter is **REPLICATION**. This parameter indicates the ID of the destination region.
             */
            public Builder replicationRegionId(String replicationRegionId) {
                this.replicationRegionId = replicationRegionId;
                return this;
            }

            /**
             * This parameter is returned only if the value of the **RuleType** parameter is **TRANSITION** or **REPLICATION**.
             * <p>
             * 
             * *   If the value of the **RuleType** parameter is **TRANSITION**, this parameter indicates the retention period of the backup data. Minimum value: 1. Unit: days.
             * *   If the value of the **RuleType** parameter is **REPLICATION**, this parameter indicates the retention period of remote backups. Minimum value: 1. Unit: days.
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * This parameter is returned only if the value of the **RuleType** parameter is **TRANSITION**. This parameter indicates the special retention rules.
             */
            public Builder retentionRules(java.util.List < RetentionRules> retentionRules) {
                this.retentionRules = retentionRules;
                return this;
            }

            /**
             * The rule ID.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The type of the rule. Each backup policy must have at least one rule of the **BACKUP** type and only one rule of the **TRANSITION** type.
             * <p>
             * 
             * *   **BACKUP**: the backup rule.
             * *   **TRANSITION**: the lifecycle rule.
             * *   **REPLICATION**: the replication rule.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * This parameter is returned only if the value of the **RuleType** parameter is **BACKUP**. This parameter indicates the scheduling settings for the backups. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is complete. For example, `I|1631685600|P1D` indicates that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.
             * <p>
             * 
             * *   startTime: the time when the system starts to run a backup job. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             * *   interval: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H indicates an interval of one hour. P1D indicates an interval of one day.
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
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
    public static class Policies extends TeaModel {
        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("PolicyBindingCount")
        private Long policyBindingCount;

        @NameInMap("PolicyDescription")
        private String policyDescription;

        @NameInMap("PolicyId")
        private String policyId;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("Rules")
        private java.util.List < Rules> rules;

        @NameInMap("UpdatedTime")
        private Long updatedTime;

        private Policies(Builder builder) {
            this.createdTime = builder.createdTime;
            this.policyBindingCount = builder.policyBindingCount;
            this.policyDescription = builder.policyDescription;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
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
            private java.util.List < Rules> rules; 
            private Long updatedTime; 

            /**
             * The time when the backup policy was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The number of data sources that are bound to the backup policy.
             */
            public Builder policyBindingCount(Long policyBindingCount) {
                this.policyBindingCount = policyBindingCount;
                return this;
            }

            /**
             * The description of the backup policy.
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * The ID of the backup policy.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * The name of the backup policy.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * The rules in the backup policy.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * The time when the backup policy was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
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
