// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateEnterpriseSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateEnterpriseSnapshotPolicyRequest</p>
 */
public class CreateEnterpriseSnapshotPolicyRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetainRule")
    @com.aliyun.core.annotation.Validation(required = true)
    private RetainRule retainRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Schedule")
    @com.aliyun.core.annotation.Validation(required = true)
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    private CreateEnterpriseSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.crossRegionCopyInfo = builder.crossRegionCopyInfo;
        this.desc = builder.desc;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.retainRule = builder.retainRule;
        this.schedule = builder.schedule;
        this.specialRetainRules = builder.specialRetainRules;
        this.state = builder.state;
        this.storageRule = builder.storageRule;
        this.tag = builder.tag;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnterpriseSnapshotPolicyRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<CreateEnterpriseSnapshotPolicyRequest, Builder> {
        private String clientToken; 
        private CrossRegionCopyInfo crossRegionCopyInfo; 
        private String desc; 
        private String name; 
        private String regionId; 
        private String resourceGroupId; 
        private RetainRule retainRule; 
        private Schedule schedule; 
        private SpecialRetainRules specialRetainRules; 
        private String state; 
        private StorageRule storageRule; 
        private java.util.List < Tag> tag; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(CreateEnterpriseSnapshotPolicyRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.crossRegionCopyInfo = request.crossRegionCopyInfo;
            this.desc = request.desc;
            this.name = request.name;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.retainRule = request.retainRule;
            this.schedule = request.schedule;
            this.specialRetainRules = request.specialRetainRules;
            this.state = request.state;
            this.storageRule = request.storageRule;
            this.tag = request.tag;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>The ID of the resource group to which to assign the snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The snapshot retention rule.</p>
         * <p>This parameter is required.</p>
         */
        public Builder retainRule(RetainRule retainRule) {
            String retainRuleShrink = shrink(retainRule, "RetainRule", "json");
            this.putQueryParameter("RetainRule", retainRuleShrink);
            this.retainRule = retainRule;
            return this;
        }

        /**
         * <p>The rule for scheduling.</p>
         * <p>This parameter is required.</p>
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
         * <li><p>ENABLED: Enable snapshot policy execution.</p>
         * </li>
         * <li><p>DISABLED: Disable snapshot policy execution.</p>
         * </li>
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

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Binding target type, valid value:</p>
         * <ul>
         * <li>DISK</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DISK</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public CreateEnterpriseSnapshotPolicyRequest build() {
            return new CreateEnterpriseSnapshotPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEnterpriseSnapshotPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateEnterpriseSnapshotPolicyRequest</p>
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

            /**
             * <p>The region ID of the destination. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * {@link CreateEnterpriseSnapshotPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateEnterpriseSnapshotPolicyRequest</p>
     */
    public static class CrossRegionCopyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Regions")
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
             * <p>The list of destination regions.</p>
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
    /**
     * 
     * {@link CreateEnterpriseSnapshotPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateEnterpriseSnapshotPolicyRequest</p>
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
             * <li><p>DAYS</p>
             * </li>
             * <li><p>WEEKS</p>
             * </li>
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
     * {@link CreateEnterpriseSnapshotPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateEnterpriseSnapshotPolicyRequest</p>
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

            /**
             * <p>The time when the policy will to be scheduled. Valid values: Set the parameter in a cron expression.</p>
             * <p>For example, you can use 0 0 4 1/1 * ? to specify 04:00:00 (UTC+8) on the first day of each month.</p>
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
     * {@link CreateEnterpriseSnapshotPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateEnterpriseSnapshotPolicyRequest</p>
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

            /**
             * <p>The periodic unit for specially retained snapshots. If configured to WEEKS, it provides special retention for the first snapshot of each week. The retention period is determined by TimeUnit and TimeInterval. The range of values are:</p>
             * <ul>
             * <li>WEEKS</li>
             * <li>MONTHS</li>
             * <li>YEARS</li>
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
             * <p>14</p>
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
     * {@link CreateEnterpriseSnapshotPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateEnterpriseSnapshotPolicyRequest</p>
     */
    public static class SpecialRetainRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Rules")
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
             * <p>Indicates whether the special retention is enabled.</p>
             * <ul>
             * <li>true: enable</li>
             * <li>false: disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The special retention rules.</p>
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
    /**
     * 
     * {@link CreateEnterpriseSnapshotPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateEnterpriseSnapshotPolicyRequest</p>
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
    /**
     * 
     * {@link CreateEnterpriseSnapshotPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateEnterpriseSnapshotPolicyRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of the tag.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * <p>The tag value can be 0 to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>Each tag key must have a unique tag value. You can specify at most 20 tag values in each call.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
