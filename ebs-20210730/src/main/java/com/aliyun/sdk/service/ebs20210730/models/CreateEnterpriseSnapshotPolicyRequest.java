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
    private java.util.List<Tag> tag;

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
    public java.util.List<Tag> getTag() {
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
        private java.util.List<Tag> tag; 
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
         * <p>Ensures the idempotence of the request. Generate a parameter value from your client that is unique across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
         * <p>The snapshot replication information.</p>
         */
        public Builder crossRegionCopyInfo(CrossRegionCopyInfo crossRegionCopyInfo) {
            String crossRegionCopyInfoShrink = shrink(crossRegionCopyInfo, "CrossRegionCopyInfo", "json");
            this.putQueryParameter("CrossRegionCopyInfo", crossRegionCopyInfoShrink);
            this.crossRegionCopyInfo = crossRegionCopyInfo;
            return this;
        }

        /**
         * <p>The description.</p>
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
         * <p>The Policy Name.</p>
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
         * <p>The region ID. You can call DescribeRegions to query the regions that support asynchronous replication.</p>
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
         * <p>The resource group ID.</p>
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
         * <p>The retention rule.</p>
         * <p>This parameter is required.</p>
         */
        public Builder retainRule(RetainRule retainRule) {
            String retainRuleShrink = shrink(retainRule, "RetainRule", "json");
            this.putQueryParameter("RetainRule", retainRuleShrink);
            this.retainRule = retainRule;
            return this;
        }

        /**
         * <p>The schedule rule.</p>
         * <p>This parameter is required.</p>
         */
        public Builder schedule(Schedule schedule) {
            String scheduleShrink = shrink(schedule, "Schedule", "json");
            this.putQueryParameter("Schedule", scheduleShrink);
            this.schedule = schedule;
            return this;
        }

        /**
         * <p>The special retention rules.</p>
         */
        public Builder specialRetainRules(SpecialRetainRules specialRetainRules) {
            String specialRetainRulesShrink = shrink(specialRetainRules, "SpecialRetainRules", "json");
            this.putQueryParameter("SpecialRetainRules", specialRetainRulesShrink);
            this.specialRetainRules = specialRetainRules;
            return this;
        }

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>DISABLED</li>
         * <li>ENABLED</li>
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
         * <p>The advanced snapshot feature.</p>
         */
        public Builder storageRule(StorageRule storageRule) {
            String storageRuleShrink = shrink(storageRule, "StorageRule", "json");
            this.putQueryParameter("StorageRule", storageRuleShrink);
            this.storageRule = storageRule;
            return this;
        }

        /**
         * <p>The tag key-value pairs. Valid values of n: 1 to 20.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The type. Valid values:</p>
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

            private Builder() {
            } 

            private Builder(Regions model) {
                this.regionId = model.regionId;
                this.retainDays = model.retainDays;
            } 

            /**
             * <p>The ID of the destination region for snapshot replication. You can invoke <a href="https://help.aliyun.com/document_detail/354206.html">DescribeDiskReplicaPairs</a> to query the region information of existing asynchronous replication relationships.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of days to retain snapshots in the destination region. The value must be greater than 1.</p>
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
             * <p>Specifies whether to enable cross-region replication. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
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
             * <p>The destination region information.</p>
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

            private Builder() {
            } 

            private Builder(RetainRule model) {
                this.number = model.number;
                this.timeInterval = model.timeInterval;
                this.timeUnit = model.timeUnit;
            } 

            /**
             * <p>The number of snapshots to retain. Valid values: 1 to 256.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * <p>The time interval of the retention rule. The unit is specified by the TimeUnit parameter. The value must be greater than 1.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder timeInterval(Integer timeInterval) {
                this.timeInterval = timeInterval;
                return this;
            }

            /**
             * <p>The unit of the retention time. Valid values:</p>
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

            private Builder() {
            } 

            private Builder(Schedule model) {
                this.cronExpression = model.cronExpression;
            } 

            /**
             * <p>The cycle and time at which the policy is executed. Specify the value in a cron expression.</p>
             * <p>For example, <code>0 0 4 1/1 * ?</code> specifies that the snapshot operation is performed at 4:00 AM every day, starting from the first day of each month.</p>
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

            private Builder() {
            } 

            private Builder(Rules model) {
                this.specialPeriodUnit = model.specialPeriodUnit;
                this.timeInterval = model.timeInterval;
                this.timeUnit = model.timeUnit;
            } 

            /**
             * <p>The period unit for specially retained snapshots. For example, if this parameter is set to WEEKS, the first snapshot of each week is specially retained. The retention duration is determined by TimeUnit and TimeInterval. Valid values:</p>
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
             * <p>The time interval of the retention rule. The unit is specified by the TimeUnit parameter. The value must be greater than 1.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder timeInterval(Integer timeInterval) {
                this.timeInterval = timeInterval;
                return this;
            }

            /**
             * <p>The unit of the retention time for special snapshots. Valid values:</p>
             * <ul>
             * <li>DAYS</li>
             * <li>WEEKS</li>
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
             * <p>Specifies whether to enable special retention. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
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
             * <p>The list of special retention rules.</p>
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

            private Builder() {
            } 

            private Builder(StorageRule model) {
                this.enableImmediateAccess = model.enableImmediateAccess;
            } 

            /**
             * <p>Specifies whether to enable instant access for snapshots. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the resource.</p>
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
             * <p>The tag value of the resource.</p>
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
