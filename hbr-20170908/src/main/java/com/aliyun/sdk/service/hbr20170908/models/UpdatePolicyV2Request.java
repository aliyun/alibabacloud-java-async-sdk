// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePolicyV2Request} extends {@link RequestModel}
 *
 * <p>UpdatePolicyV2Request</p>
 */
public class UpdatePolicyV2Request extends Request {
    @Body
    @NameInMap("PolicyDescription")
    private String policyDescription;

    @Body
    @NameInMap("PolicyId")
    private String policyId;

    @Body
    @NameInMap("PolicyName")
    private String policyName;

    @Body
    @NameInMap("Rules")
    private java.util.List < Rules> rules;

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
    public java.util.List < Rules> getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<UpdatePolicyV2Request, Builder> {
        private String policyDescription; 
        private String policyId; 
        private String policyName; 
        private java.util.List < Rules> rules; 

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
         * The description of the backup policy.
         */
        public Builder policyDescription(String policyDescription) {
            this.putBodyParameter("PolicyDescription", policyDescription);
            this.policyDescription = policyDescription;
            return this;
        }

        /**
         * The ID of the backup policy.
         */
        public Builder policyId(String policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * The name of the backup policy.
         */
        public Builder policyName(String policyName) {
            this.putBodyParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * The rules in the backup policy.
         */
        public Builder rules(java.util.List < Rules> rules) {
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
             * *   **WEEKLY**: weekly backups
             * *   **MONTHLY**: monthly backups
             * *   **YEARLY**: yearly backups
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
             * Specifies which backup is retained based on the special retention rule. Only the first backup can be retained.
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

        @NameInMap("ColdArchiveDays")
        private Long coldArchiveDays;

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

        private Rules(Builder builder) {
            this.archiveDays = builder.archiveDays;
            this.backupType = builder.backupType;
            this.coldArchiveDays = builder.coldArchiveDays;
            this.keepLatestSnapshots = builder.keepLatestSnapshots;
            this.replicationRegionId = builder.replicationRegionId;
            this.retention = builder.retention;
            this.retentionRules = builder.retentionRules;
            this.ruleId = builder.ruleId;
            this.ruleType = builder.ruleType;
            this.schedule = builder.schedule;
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

        public static final class Builder {
            private Long archiveDays; 
            private String backupType; 
            private Long coldArchiveDays; 
            private Long keepLatestSnapshots; 
            private String replicationRegionId; 
            private Long retention; 
            private java.util.List < RetentionRules> retentionRules; 
            private String ruleId; 
            private String ruleType; 
            private String schedule; 

            /**
             * This parameter is required only if the **RuleType** parameter is set to **TRANSITION**. This parameter specifies the time when data is dumped from a backup vault to an archive vault. Unit: days.
             */
            public Builder archiveDays(Long archiveDays) {
                this.archiveDays = archiveDays;
                return this;
            }

            /**
             * This parameter is required only if the **RuleType** parameter is set to **BACKUP**. This parameter specifies the backup type. Valid value: **COMPLETE**, which indicates full backup.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * This parameter is required only if the **RuleType** parameter is set to **TRANSITION**. This parameter specifies the time when data is dumped from a backup vault to a cold archive vault. Unit: days.
             */
            public Builder coldArchiveDays(Long coldArchiveDays) {
                this.coldArchiveDays = coldArchiveDays;
                return this;
            }

            /**
             * Specifies whether to enable the feature of keeping at least one backup version. Valid values:
             * <p>
             * 
             * *   0: The feature is disabled.
             * *   1: The feature is enabled.
             */
            public Builder keepLatestSnapshots(Long keepLatestSnapshots) {
                this.keepLatestSnapshots = keepLatestSnapshots;
                return this;
            }

            /**
             * This parameter is required only if the **RuleType** parameter is set to **REPLICATION**. This parameter specifies the ID of the destination region.
             */
            public Builder replicationRegionId(String replicationRegionId) {
                this.replicationRegionId = replicationRegionId;
                return this;
            }

            /**
             * This parameter is required only if the **RuleType** parameter is set to **TRANSITION** or **REPLICATION**.
             * <p>
             * 
             * *   If the **RuleType** parameter is set to **TRANSITION**, this parameter specifies the retention period of the backup data. Minimum value: 1. Unit: days.
             * *   If the **RuleType** parameter is set to **REPLICATION**, this parameter specifies the retention period of remote backups. Minimum value: 1. Unit: days.
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * This parameter is required only if the **RuleType** parameter is set to **TRANSITION**. This parameter specifies the special retention rules.
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
             * *   **BACKUP**: backup rule
             * *   **TRANSITION**: lifecycle rule
             * *   **REPLICATION**: replication rule
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * This parameter is required only if the **RuleType** parameter is set to **BACKUP**. This parameter specifies the backup schedule settings. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is complete. For example, `I|1631685600|P1D` specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.
             * <p>
             * 
             * *   startTime: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds.
             * *   interval: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
