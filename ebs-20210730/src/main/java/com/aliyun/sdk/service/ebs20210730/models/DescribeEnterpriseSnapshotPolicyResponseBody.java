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
 * {@link DescribeEnterpriseSnapshotPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnterpriseSnapshotPolicyResponseBody</p>
 */
public class DescribeEnterpriseSnapshotPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Policies")
    private java.util.List<Policies> policies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<Policies> policies; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The returned snapshot policies.</p>
         */
        public Builder policies(java.util.List<Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5CA35A83-8D8A-5B67-BAA0-2E124F194DA4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEnterpriseSnapshotPolicyResponseBody build() {
            return new DescribeEnterpriseSnapshotPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEnterpriseSnapshotPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnterpriseSnapshotPolicyResponseBody</p>
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
             * <p>The ID of the destination region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The retention period of snapshot copies in the destination region. Unit: day.</p>
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
     * {@link DescribeEnterpriseSnapshotPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnterpriseSnapshotPolicyResponseBody</p>
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

            /**
             * <p>Indicates whether the cross-region replication feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The destination regions that store snapshot copies.</p>
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
     * {@link DescribeEnterpriseSnapshotPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnterpriseSnapshotPolicyResponseBody</p>
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
             * <p>The maximum number of snapshots that can be retained.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * <p>The value of the retention period of snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder timeInterval(Integer timeInterval) {
                this.timeInterval = timeInterval;
                return this;
            }

            /**
             * <p>The unit of the retention period of snapshots.</p>
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
     * {@link DescribeEnterpriseSnapshotPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnterpriseSnapshotPolicyResponseBody</p>
     */
    public static class Schedule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CronExpression")
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
             * <p>The cron expression of the enterprise-level snapshot policy.</p>
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
     * {@link DescribeEnterpriseSnapshotPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnterpriseSnapshotPolicyResponseBody</p>
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
             * <p>The unit of the special retention period.</p>
             * 
             * <strong>example:</strong>
             * <p>WEEKS</p>
             */
            public Builder specialPeriodUnit(String specialPeriodUnit) {
                this.specialPeriodUnit = specialPeriodUnit;
                return this;
            }

            /**
             * <p>The value of the retention period.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder timeInterval(Integer timeInterval) {
                this.timeInterval = timeInterval;
                return this;
            }

            /**
             * <p>The unit of the retention period.</p>
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
     * {@link DescribeEnterpriseSnapshotPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnterpriseSnapshotPolicyResponseBody</p>
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

            /**
             * <p>Indicates whether the special retention period is enabled.</p>
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
     * {@link DescribeEnterpriseSnapshotPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnterpriseSnapshotPolicyResponseBody</p>
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
             * <p>Indicates whether the instant access feature is enabled.</p>
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
     * {@link DescribeEnterpriseSnapshotPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnterpriseSnapshotPolicyResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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
             * <p>The key of the tag of the enterprise-level snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag of the enterprise-level snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
    /**
     * 
     * {@link DescribeEnterpriseSnapshotPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnterpriseSnapshotPolicyResponseBody</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CrossRegionCopyInfo")
        private CrossRegionCopyInfo crossRegionCopyInfo;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("DiskIds")
        private java.util.List<String> diskIds;

        @com.aliyun.core.annotation.NameInMap("ManagedForEcs")
        private Boolean managedForEcs;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RetainRule")
        private RetainRule retainRule;

        @com.aliyun.core.annotation.NameInMap("Schedule")
        private Schedule schedule;

        @com.aliyun.core.annotation.NameInMap("SpecialRetainRules")
        private SpecialRetainRules specialRetainRules;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("StorageRule")
        private StorageRule storageRule;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TargetCount")
        private Integer targetCount;

        @com.aliyun.core.annotation.NameInMap("TargetType")
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
        public java.util.List<String> getDiskIds() {
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
        public java.util.List<Tags> getTags() {
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
            private java.util.List<String> diskIds; 
            private Boolean managedForEcs; 
            private String name; 
            private String policyId; 
            private String resourceGroupId; 
            private RetainRule retainRule; 
            private Schedule schedule; 
            private SpecialRetainRules specialRetainRules; 
            private String state; 
            private StorageRule storageRule; 
            private java.util.List<Tags> tags; 
            private Integer targetCount; 
            private String targetType; 

            /**
             * <p>The time when the enterprise-level snapshot policy was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-24T06:03:35Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The replication rule of snapshots in the enterprise-level snapshot policy.</p>
             */
            public Builder crossRegionCopyInfo(CrossRegionCopyInfo crossRegionCopyInfo) {
                this.crossRegionCopyInfo = crossRegionCopyInfo;
                return this;
            }

            /**
             * <p>The description of the enterprise-level snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The disks that are associated with the snapshot policy.</p>
             */
            public Builder diskIds(java.util.List<String> diskIds) {
                this.diskIds = diskIds;
                return this;
            }

            /**
             * <p>Indicates whether snapshots are managed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder managedForEcs(Boolean managedForEcs) {
                this.managedForEcs = managedForEcs;
                return this;
            }

            /**
             * <p>The name of the enterprise-level snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the enterprise-level snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>esp-xxx</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>the resource group</p>
             * 
             * <strong>example:</strong>
             * <p>rg-xxx</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The retention rule of the enterprise-level snapshot policy.</p>
             */
            public Builder retainRule(RetainRule retainRule) {
                this.retainRule = retainRule;
                return this;
            }

            /**
             * <p>The scheduling rule of the enterprise-level snapshot policy.</p>
             */
            public Builder schedule(Schedule schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * <p>The special retention rules of the enterprise-level snapshot policy.</p>
             */
            public Builder specialRetainRules(SpecialRetainRules specialRetainRules) {
                this.specialRetainRules = specialRetainRules;
                return this;
            }

            /**
             * <p>The status of the enterprise-level snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>DISABLED</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The storage rule of snapshots in the enterprise-level snapshot policy.</p>
             */
            public Builder storageRule(StorageRule storageRule) {
                this.storageRule = storageRule;
                return this;
            }

            /**
             * <p>the pair tags</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The number of objects that are associated with the enterprise-level snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder targetCount(Integer targetCount) {
                this.targetCount = targetCount;
                return this;
            }

            /**
             * <p>The type of the enterprise-level snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>DISK</p>
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
