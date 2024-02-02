// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnterpriseSnapshotPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnterpriseSnapshotPolicyResponseBody</p>
 */
public class DescribeEnterpriseSnapshotPolicyResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("Policies")
    private java.util.List < Policies> policies;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeEnterpriseSnapshotPolicyResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.policies = builder.policies;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnterpriseSnapshotPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < Policies> policies; 
        private String requestId; 
        private Long totalCount; 

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The returned enterprise-level snapshot policies.
         */
        public Builder policies(java.util.List < Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBody build() {
            return new DescribeEnterpriseSnapshotPolicyResponseBody(this);
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
             * The ID of the destination region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The retention period of snapshot copies in the destination region. Unit: day.
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
             * Indicates whether the cross-region replication feature is enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The destination regions that store snapshot copies.
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
             * The maximum number of snapshots that can be retained.
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * The value of the retention period of snapshots.
             */
            public Builder timeInterval(Integer timeInterval) {
                this.timeInterval = timeInterval;
                return this;
            }

            /**
             * The unit of the retention period of snapshots.
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
             * The cron expression of the enterprise-level snapshot policy.
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
             * The unit of the special retention period.
             */
            public Builder specialPeriodUnit(String specialPeriodUnit) {
                this.specialPeriodUnit = specialPeriodUnit;
                return this;
            }

            /**
             * The value of the retention period.
             */
            public Builder timeInterval(Integer timeInterval) {
                this.timeInterval = timeInterval;
                return this;
            }

            /**
             * The unit of the retention period.
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
             * Indicates whether the special retention period is enabled.
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
             * Indicates whether the instant access feature is enabled.
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
    public static class Tags extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The key of the tag of the enterprise-level snapshot policy.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of the tag of the enterprise-level snapshot policy.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Policies extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CrossRegionCopyInfo")
        private CrossRegionCopyInfo crossRegionCopyInfo;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("DiskIds")
        private java.util.List < String > diskIds;

        @NameInMap("ManagedForEcs")
        private Boolean managedForEcs;

        @NameInMap("Name")
        private String name;

        @NameInMap("PolicyId")
        private String policyId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("RetainRule")
        private RetainRule retainRule;

        @NameInMap("Schedule")
        private Schedule schedule;

        @NameInMap("SpecialRetainRules")
        private SpecialRetainRules specialRetainRules;

        @NameInMap("State")
        private String state;

        @NameInMap("StorageRule")
        private StorageRule storageRule;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("TargetCount")
        private Integer targetCount;

        @NameInMap("TargetType")
        private String targetType;

        private Policies(Builder builder) {
            this.createTime = builder.createTime;
            this.crossRegionCopyInfo = builder.crossRegionCopyInfo;
            this.desc = builder.desc;
            this.diskIds = builder.diskIds;
            this.managedForEcs = builder.managedForEcs;
            this.name = builder.name;
            this.policyId = builder.policyId;
            this.resourceGroupId = builder.resourceGroupId;
            this.retainRule = builder.retainRule;
            this.schedule = builder.schedule;
            this.specialRetainRules = builder.specialRetainRules;
            this.state = builder.state;
            this.storageRule = builder.storageRule;
            this.tags = builder.tags;
            this.targetCount = builder.targetCount;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return diskIds
         */
        public java.util.List < String > getDiskIds() {
            return this.diskIds;
        }

        /**
         * @return managedForEcs
         */
        public Boolean getManagedForEcs() {
            return this.managedForEcs;
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
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return targetCount
         */
        public Integer getTargetCount() {
            return this.targetCount;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String createTime; 
            private CrossRegionCopyInfo crossRegionCopyInfo; 
            private String desc; 
            private java.util.List < String > diskIds; 
            private Boolean managedForEcs; 
            private String name; 
            private String policyId; 
            private String resourceGroupId; 
            private RetainRule retainRule; 
            private Schedule schedule; 
            private SpecialRetainRules specialRetainRules; 
            private String state; 
            private StorageRule storageRule; 
            private java.util.List < Tags> tags; 
            private Integer targetCount; 
            private String targetType; 

            /**
             * The time when the enterprise-level snapshot policy was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The replication rule of snapshots in the enterprise-level snapshot policy.
             */
            public Builder crossRegionCopyInfo(CrossRegionCopyInfo crossRegionCopyInfo) {
                this.crossRegionCopyInfo = crossRegionCopyInfo;
                return this;
            }

            /**
             * The description of the enterprise-level snapshot policy.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * The list of disks.
             */
            public Builder diskIds(java.util.List < String > diskIds) {
                this.diskIds = diskIds;
                return this;
            }

            /**
             * Indicates whether snapshots are managed.
             */
            public Builder managedForEcs(Boolean managedForEcs) {
                this.managedForEcs = managedForEcs;
                return this;
            }

            /**
             * The name of the enterprise-level snapshot policy.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the enterprise-level snapshot policy.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * the resource group
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The retention rule of the enterprise-level snapshot policy.
             */
            public Builder retainRule(RetainRule retainRule) {
                this.retainRule = retainRule;
                return this;
            }

            /**
             * The scheduling rule of the enterprise-level snapshot policy.
             */
            public Builder schedule(Schedule schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * The special retention rules of the enterprise-level snapshot policy.
             */
            public Builder specialRetainRules(SpecialRetainRules specialRetainRules) {
                this.specialRetainRules = specialRetainRules;
                return this;
            }

            /**
             * The status of the enterprise-level snapshot policy.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The storage rule of snapshots in the enterprise-level snapshot policy.
             */
            public Builder storageRule(StorageRule storageRule) {
                this.storageRule = storageRule;
                return this;
            }

            /**
             * the pair tags
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The number of objects that are associated with the enterprise-level snapshot policy.
             */
            public Builder targetCount(Integer targetCount) {
                this.targetCount = targetCount;
                return this;
            }

            /**
             * The type of the enterprise-level snapshot policy.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
