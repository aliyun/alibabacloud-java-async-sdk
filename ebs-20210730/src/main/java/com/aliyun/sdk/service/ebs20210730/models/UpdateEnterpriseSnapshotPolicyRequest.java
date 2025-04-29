// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link UpdateEnterpriseSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnterpriseSnapshotPolicyRequest</p>
 */
public class UpdateEnterpriseSnapshotPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossRegionCopyInfo")
    private CrossRegionCopyInfo crossRegionCopyInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Desc")
    private String desc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetainRule")
    private RetainRule retainRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Schedule")
    private Schedule schedule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecialRetainRules")
    private SpecialRetainRules specialRetainRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageRule")
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Snapshot replication destination information.</p>
         */
        public Builder crossRegionCopyInfo(CrossRegionCopyInfo crossRegionCopyInfo) {
            String crossRegionCopyInfoShrink = shrink(crossRegionCopyInfo, "CrossRegionCopyInfo", "json");
            this.putQueryParameter("CrossRegionCopyInfo", crossRegionCopyInfoShrink);
            this.crossRegionCopyInfo = crossRegionCopyInfo;
            return this;
        }

        /**
         * <p>The description of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The id of the policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esp-xxx</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The region ID . You can call the <a href="https://help.aliyun.com/document_detail/354276.html">DescribeRegions</a> operation to query the most recent list of regions in which snapshot policy is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Snapshot retention rule.</p>
         */
        public Builder retainRule(RetainRule retainRule) {
            String retainRuleShrink = shrink(retainRule, "RetainRule", "json");
            this.putQueryParameter("RetainRule", retainRuleShrink);
            this.retainRule = retainRule;
            return this;
        }

        /**
         * <p>The rule for scheduling.</p>
         */
        public Builder schedule(Schedule schedule) {
            String scheduleShrink = shrink(schedule, "Schedule", "json");
            this.putQueryParameter("Schedule", scheduleShrink);
            this.schedule = schedule;
            return this;
        }

        /**
         * <p>The special snapshot retention rules.</p>
         */
        public Builder specialRetainRules(SpecialRetainRules specialRetainRules) {
            String specialRetainRulesShrink = shrink(specialRetainRules, "SpecialRetainRules", "json");
            this.putQueryParameter("SpecialRetainRules", specialRetainRulesShrink);
            this.specialRetainRules = specialRetainRules;
            return this;
        }

        /**
         * <p>The status of the policy. Valid values:</p>
         * <ul>
         * <li><strong>ENABLED</strong>: Enable snapshot policy execution.</li>
         * <li><strong>DISABLED</strong>: Disable snapshot policy execution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * <p>Advanced snapshot features.</p>
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

    /**
     * 
     * {@link UpdateEnterpriseSnapshotPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateEnterpriseSnapshotPolicyRequest</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RetainDays")
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

            private Builder() {
            } 

            private Builder(Regions model) {
                this.regionId = model.regionId;
                this.retainDays = model.retainDays;
            } 

            /**
             * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/354276.html">DescribeRegions</a> operation to query the most recent list of regions in which async replication is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Number of days to retain the destination snapshot. The range of values is greater than 1.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
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
    /**
     * 
     * {@link UpdateEnterpriseSnapshotPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateEnterpriseSnapshotPolicyRequest</p>
     */
    public static class CrossRegionCopyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Regions")
        private java.util.List<Regions> regions;

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
        public java.util.List<Regions> getRegions() {
            return this.regions;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.List<Regions> regions; 

            private Builder() {
            } 

            private Builder(CrossRegionCopyInfo model) {
                this.enabled = model.enabled;
                this.regions = model.regions;
            } 

            /**
             * <p>Whether cross-region replication is enabled. The range of values:</p>
             * <ul>
             * <li><p>true</p>
             * </li>
             * <li><p>false</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>Destination region information.</p>
             */
            public Builder regions(java.util.List<Regions> regions) {
                this.regions = regions;
                return this;
            }

            public CrossRegionCopyInfo build() {
                return new CrossRegionCopyInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateEnterpriseSnapshotPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateEnterpriseSnapshotPolicyRequest</p>
     */
    public static class RetainRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("TimeInterval")
        private Integer timeInterval;

        @com.aliyun.core.annotation.NameInMap("TimeUnit")
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

            private Builder() {
            } 

            private Builder(RetainRule model) {
                this.number = model.number;
                this.timeInterval = model.timeInterval;
                this.timeUnit = model.timeUnit;
            } 

            /**
             * <p>Maximum number of retained snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * <p>The time interval , valid value greater than 1.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder timeInterval(Integer timeInterval) {
                this.timeInterval = timeInterval;
                return this;
            }

            /**
             * <p>The unit of time, valid values:</p>
             * <ul>
             * <li>DAYS</li>
             * <li>WEEKS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DAYS</p>
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
    /**
     * 
     * {@link UpdateEnterpriseSnapshotPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateEnterpriseSnapshotPolicyRequest</p>
     */
    public static class Schedule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CronExpression")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(Schedule model) {
                this.cronExpression = model.cronExpression;
            } 

            /**
             * <p>The time when the policy will to be scheduled. Valid values: Set the parameter in a cron expression.</p>
             * <p>For example, you can use <code>0 0 4 1/1 * ?</code> to specify 04:00:00 (UTC+8) on the first day of each month.</p>
             * <p>This parameter is required.</p>
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
    /**
     * 
     * {@link UpdateEnterpriseSnapshotPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateEnterpriseSnapshotPolicyRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpecialPeriodUnit")
        private String specialPeriodUnit;

        @com.aliyun.core.annotation.NameInMap("TimeInterval")
        private Integer timeInterval;

        @com.aliyun.core.annotation.NameInMap("TimeUnit")
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

            private Builder() {
            } 

            private Builder(Rules model) {
                this.specialPeriodUnit = model.specialPeriodUnit;
                this.timeInterval = model.timeInterval;
                this.timeUnit = model.timeUnit;
            } 

            /**
             * <p>The periodic unit for specially retained snapshots. If configured to WEEKS, it provides special retention for the first snapshot of each week. The retention period is determined by TimeUnit and TimeInterval. The range of values are:</p>
             * <ul>
             * <li>WEEKS</li>
             * <li>MONTHS</li>
             * <li>YEARS&quot;</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WEEKS</p>
             */
            public Builder specialPeriodUnit(String specialPeriodUnit) {
                this.specialPeriodUnit = specialPeriodUnit;
                return this;
            }

            /**
             * <p>Retention Time Value. The range of values is greater than 1.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder timeInterval(Integer timeInterval) {
                this.timeInterval = timeInterval;
                return this;
            }

            /**
             * <p>Retention time unit for special snapshots. The range of values:</p>
             * <ul>
             * <li><p>DAYS</p>
             * </li>
             * <li><p>WEEKS</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WEEKS</p>
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
    /**
     * 
     * {@link UpdateEnterpriseSnapshotPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateEnterpriseSnapshotPolicyRequest</p>
     */
    public static class SpecialRetainRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

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
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.List<Rules> rules; 

            private Builder() {
            } 

            private Builder(SpecialRetainRules model) {
                this.enabled = model.enabled;
                this.rules = model.rules;
            } 

            /**
             * <p>Indicates whether the special retention is enabled.</p>
             * <ul>
             * <li>true: enable</li>
             * <li>false: disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The special retention rules.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            public SpecialRetainRules build() {
                return new SpecialRetainRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateEnterpriseSnapshotPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateEnterpriseSnapshotPolicyRequest</p>
     */
    public static class StorageRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableImmediateAccess")
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

            private Builder() {
            } 

            private Builder(StorageRule model) {
                this.enableImmediateAccess = model.enableImmediateAccess;
            } 

            /**
             * <p>Whether to enable the rapid availability of snapshots. The range of values:</p>
             * <ul>
             * <li><p>true</p>
             * </li>
             * <li><p>false</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
