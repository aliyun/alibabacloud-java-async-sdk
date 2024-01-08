// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnterpriseSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnterpriseSnapshotPolicyRequest</p>
 */
public class UpdateEnterpriseSnapshotPolicyRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CrossRegionCopyInfo")
    private CrossRegionCopyInfo crossRegionCopyInfo;

    @Query
    @NameInMap("Desc")
    private String desc;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RetainRule")
    private RetainRule retainRule;

    @Query
    @NameInMap("Schedule")
    private Schedule schedule;

    @Query
    @NameInMap("SpecialRetainRules")
    private SpecialRetainRules specialRetainRules;

    @Query
    @NameInMap("State")
    private String state;

    @Query
    @NameInMap("StorageRule")
    private StorageRule storageRule;

    private UpdateEnterpriseSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.crossRegionCopyInfo = builder.crossRegionCopyInfo;
        this.desc = builder.desc;
        this.name = builder.name;
        this.policyId = builder.policyId;
        this.regionId = builder.regionId;
        this.retainRule = builder.retainRule;
        this.schedule = builder.schedule;
        this.specialRetainRules = builder.specialRetainRules;
        this.state = builder.state;
        this.storageRule = builder.storageRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnterpriseSnapshotPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return crossRegionCopyInfo
     */
    public CrossRegionCopyInfo getCrossRegionCopyInfo() {
        return this.crossRegionCopyInfo;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return retainRule
     */
    public RetainRule getRetainRule() {
        return this.retainRule;
    }

    /**
     * @return schedule
     */
    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * @return specialRetainRules
     */
    public SpecialRetainRules getSpecialRetainRules() {
        return this.specialRetainRules;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return storageRule
     */
    public StorageRule getStorageRule() {
        return this.storageRule;
    }

    public static final class Builder extends Request.Builder<UpdateEnterpriseSnapshotPolicyRequest, Builder> {
        private String clientToken; 
        private CrossRegionCopyInfo crossRegionCopyInfo; 
        private String desc; 
        private String name; 
        private String policyId; 
        private String regionId; 
        private RetainRule retainRule; 
        private Schedule schedule; 
        private SpecialRetainRules specialRetainRules; 
        private String state; 
        private StorageRule storageRule; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnterpriseSnapshotPolicyRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.crossRegionCopyInfo = request.crossRegionCopyInfo;
            this.desc = request.desc;
            this.name = request.name;
            this.policyId = request.policyId;
            this.regionId = request.regionId;
            this.retainRule = request.retainRule;
            this.schedule = request.schedule;
            this.specialRetainRules = request.specialRetainRules;
            this.state = request.state;
            this.storageRule = request.storageRule;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Snapshot replication destination information.
         */
        public Builder crossRegionCopyInfo(CrossRegionCopyInfo crossRegionCopyInfo) {
            String crossRegionCopyInfoShrink = shrink(crossRegionCopyInfo, "CrossRegionCopyInfo", "json");
            this.putQueryParameter("CrossRegionCopyInfo", crossRegionCopyInfoShrink);
            this.crossRegionCopyInfo = crossRegionCopyInfo;
            return this;
        }

        /**
         * The description of the policy.
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * The name of the policy.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The id of the policy.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * The region ID . You can call the [DescribeRegions](~~354276~~) operation to query the most recent list of regions in which snapshot policy is supported.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Snapshot retention rule.
         */
        public Builder retainRule(RetainRule retainRule) {
            String retainRuleShrink = shrink(retainRule, "RetainRule", "json");
            this.putQueryParameter("RetainRule", retainRuleShrink);
            this.retainRule = retainRule;
            return this;
        }

        /**
         * The rule for scheduling.
         */
        public Builder schedule(Schedule schedule) {
            String scheduleShrink = shrink(schedule, "Schedule", "json");
            this.putQueryParameter("Schedule", scheduleShrink);
            this.schedule = schedule;
            return this;
        }

        /**
         * The special snapshot retention rules.
         */
        public Builder specialRetainRules(SpecialRetainRules specialRetainRules) {
            String specialRetainRulesShrink = shrink(specialRetainRules, "SpecialRetainRules", "json");
            this.putQueryParameter("SpecialRetainRules", specialRetainRulesShrink);
            this.specialRetainRules = specialRetainRules;
            return this;
        }

        /**
         * The status of the policy. Valid values:
         * <p>
         * 
         * *   **ENABLED**: Enable snapshot policy execution.
         * *   **DISABLED**: Disable snapshot policy execution.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * Advanced snapshot features.
         */
        public Builder storageRule(StorageRule storageRule) {
            String storageRuleShrink = shrink(storageRule, "StorageRule", "json");
            this.putQueryParameter("StorageRule", storageRuleShrink);
            this.storageRule = storageRule;
            return this;
        }

        @Override
        public UpdateEnterpriseSnapshotPolicyRequest build() {
            return new UpdateEnterpriseSnapshotPolicyRequest(this);
        } 

    } 

    public static class Regions extends TeaModel {
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RetainDays")
        private Integer retainDays;

        private Regions(Builder builder) {
            this.regionId = builder.regionId;
            this.retainDays = builder.retainDays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return retainDays
         */
        public Integer getRetainDays() {
            return this.retainDays;
        }

        public static final class Builder {
            private String regionId; 
            private Integer retainDays; 

            /**
             * The region ID. You can call the [DescribeRegions](~~354276~~) operation to query the most recent list of regions in which async replication is supported.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Number of days to retain the destination snapshot. The range of values is greater than 1.
             */
            public Builder retainDays(Integer retainDays) {
                this.retainDays = retainDays;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
    public static class CrossRegionCopyInfo extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("Regions")
        private java.util.List < Regions> regions;

        private CrossRegionCopyInfo(Builder builder) {
            this.enabled = builder.enabled;
            this.regions = builder.regions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrossRegionCopyInfo create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return regions
         */
        public java.util.List < Regions> getRegions() {
            return this.regions;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.List < Regions> regions; 

            /**
             * Whether cross-region replication is enabled. The range of values:
             * <p>
             * 
             * - true
             * 
             * - false
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Destination region information.
             */
            public Builder regions(java.util.List < Regions> regions) {
                this.regions = regions;
                return this;
            }

            public CrossRegionCopyInfo build() {
                return new CrossRegionCopyInfo(this);
            } 

        } 

    }
    public static class RetainRule extends TeaModel {
        @NameInMap("Number")
        private Integer number;

        @NameInMap("TimeInterval")
        private Integer timeInterval;

        @NameInMap("TimeUnit")
        private String timeUnit;

        private RetainRule(Builder builder) {
            this.number = builder.number;
            this.timeInterval = builder.timeInterval;
            this.timeUnit = builder.timeUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetainRule create() {
            return builder().build();
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return timeInterval
         */
        public Integer getTimeInterval() {
            return this.timeInterval;
        }

        /**
         * @return timeUnit
         */
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public static final class Builder {
            private Integer number; 
            private Integer timeInterval; 
            private String timeUnit; 

            /**
             * Maximum number of retained snapshots.
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * The time interval , valid value greater than 1.
             */
            public Builder timeInterval(Integer timeInterval) {
                this.timeInterval = timeInterval;
                return this;
            }

            /**
             * The unit of time, valid values:
             * <p>
             * 
             * - DAYS
             * - WEEKS
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            public RetainRule build() {
                return new RetainRule(this);
            } 

        } 

    }
    public static class Schedule extends TeaModel {
        @NameInMap("CronExpression")
        @Validation(required = true)
        private String cronExpression;

        private Schedule(Builder builder) {
            this.cronExpression = builder.cronExpression;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schedule create() {
            return builder().build();
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        public static final class Builder {
            private String cronExpression; 

            /**
             * The time when the policy will to be scheduled. Valid values: Set the parameter in a cron expression.
             * <p>
             * 
             * For example, you can use `0 0 4 1/1 * ?` to specify 04:00:00 (UTC+8) on the first day of each month.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            public Schedule build() {
                return new Schedule(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @NameInMap("SpecialPeriodUnit")
        private String specialPeriodUnit;

        @NameInMap("TimeInterval")
        private Integer timeInterval;

        @NameInMap("TimeUnit")
        private String timeUnit;

        private Rules(Builder builder) {
            this.specialPeriodUnit = builder.specialPeriodUnit;
            this.timeInterval = builder.timeInterval;
            this.timeUnit = builder.timeUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return specialPeriodUnit
         */
        public String getSpecialPeriodUnit() {
            return this.specialPeriodUnit;
        }

        /**
         * @return timeInterval
         */
        public Integer getTimeInterval() {
            return this.timeInterval;
        }

        /**
         * @return timeUnit
         */
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public static final class Builder {
            private String specialPeriodUnit; 
            private Integer timeInterval; 
            private String timeUnit; 

            /**
             * The periodic unit for specially retained snapshots. If configured to WEEKS, it provides special retention for the first snapshot of each week. The retention period is determined by TimeUnit and TimeInterval. The range of values are:
             * <p>
             * - WEEKS
             * - MONTHS
             * - YEARS"
             */
            public Builder specialPeriodUnit(String specialPeriodUnit) {
                this.specialPeriodUnit = specialPeriodUnit;
                return this;
            }

            /**
             * Retention Time Value. The range of values is greater than 1.
             */
            public Builder timeInterval(Integer timeInterval) {
                this.timeInterval = timeInterval;
                return this;
            }

            /**
             * Retention time unit for special snapshots. The range of values:
             * <p>
             * 
             * - DAYS
             * 
             * - WEEKS
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class SpecialRetainRules extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("Rules")
        private java.util.List < Rules> rules;

        private SpecialRetainRules(Builder builder) {
            this.enabled = builder.enabled;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecialRetainRules create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.List < Rules> rules; 

            /**
             * Indicates whether the special retention is enabled.
             * <p>
             * 
             * *   true: enable
             * *   false: disable
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The special retention rules.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            public SpecialRetainRules build() {
                return new SpecialRetainRules(this);
            } 

        } 

    }
    public static class StorageRule extends TeaModel {
        @NameInMap("EnableImmediateAccess")
        private Boolean enableImmediateAccess;

        private StorageRule(Builder builder) {
            this.enableImmediateAccess = builder.enableImmediateAccess;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageRule create() {
            return builder().build();
        }

        /**
         * @return enableImmediateAccess
         */
        public Boolean getEnableImmediateAccess() {
            return this.enableImmediateAccess;
        }

        public static final class Builder {
            private Boolean enableImmediateAccess; 

            /**
             * Whether to enable the rapid availability of snapshots. The range of values:
             * <p>
             * 
             * - true
             * 
             * - false
             */
            public Builder enableImmediateAccess(Boolean enableImmediateAccess) {
                this.enableImmediateAccess = enableImmediateAccess;
                return this;
            }

            public StorageRule build() {
                return new StorageRule(this);
            } 

        } 

    }
}
