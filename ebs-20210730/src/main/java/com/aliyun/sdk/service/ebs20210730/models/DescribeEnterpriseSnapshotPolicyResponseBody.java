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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeEnterpriseSnapshotPolicyResponseBody model) {
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.policies = model.policies;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The pagination token (Token) returned for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number for paged queries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page for paged queries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * <p>549BB71F-6778-53CE-AA73-E94ACE802AB4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
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

            private Builder() {
            } 

            private Builder(Regions model) {
                this.regionId = model.regionId;
                this.retainDays = model.retainDays;
            } 

            /**
             * <p>The snapshot copy destination region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of days to retain snapshots at the destination region.</p>
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

            private Builder() {
            } 

            private Builder(CrossRegionCopyInfo model) {
                this.enabled = model.enabled;
                this.regions = model.regions;
            } 

            /**
             * <p>Indicates whether cross-region copy is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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

            private Builder() {
            } 

            private Builder(RetainRule model) {
                this.number = model.number;
                this.timeInterval = model.timeInterval;
                this.timeUnit = model.timeUnit;
            } 

            /**
             * <p>The retention count.</p>
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
             * <p>The retention time unit.</p>
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

            private Builder() {
            } 

            private Builder(Schedule model) {
                this.cronExpression = model.cronExpression;
            } 

            /**
             * <p>The cron expression.</p>
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

            private Builder() {
            } 

            private Builder(Rules model) {
                this.specialPeriodUnit = model.specialPeriodUnit;
                this.timeInterval = model.timeInterval;
                this.timeUnit = model.timeUnit;
            } 

            /**
             * <p>The special period unit.</p>
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
             * <p>1</p>
             */
            public Builder timeInterval(Integer timeInterval) {
                this.timeInterval = timeInterval;
                return this;
            }

            /**
             * <p>The retention time unit.</p>
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

            private Builder() {
            } 

            private Builder(SpecialRetainRules model) {
                this.enabled = model.enabled;
                this.rules = model.rules;
            } 

            /**
             * <p>Indicates whether special retention is enabled.</p>
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

            private Builder() {
            } 

            private Builder(StorageRule model) {
                this.enableImmediateAccess = model.enableImmediateAccess;
            } 

            /**
             * <p>Indicates whether instant access is enabled for snapshots.</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the resource.</p>
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

            private Builder() {
            } 

            private Builder(Policies model) {
                this.createTime = model.createTime;
                this.crossRegionCopyInfo = model.crossRegionCopyInfo;
                this.desc = model.desc;
                this.diskIds = model.diskIds;
                this.managedForEcs = model.managedForEcs;
                this.name = model.name;
                this.policyId = model.policyId;
                this.resourceGroupId = model.resourceGroupId;
                this.retainRule = model.retainRule;
                this.schedule = model.schedule;
                this.specialRetainRules = model.specialRetainRules;
                this.state = model.state;
                this.storageRule = model.storageRule;
                this.tags = model.tags;
                this.targetCount = model.targetCount;
                this.targetType = model.targetType;
            } 

            /**
             * <p>The creation time in UTC ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-24T06:03:35Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The snapshot cross-region copy information.</p>
             */
            public Builder crossRegionCopyInfo(CrossRegionCopyInfo crossRegionCopyInfo) {
                this.crossRegionCopyInfo = crossRegionCopyInfo;
                return this;
            }

            /**
             * <p>The snapshot policy description.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The list of bound cloud disk IDs.</p>
             */
            public Builder diskIds(java.util.List<String> diskIds) {
                this.diskIds = diskIds;
                return this;
            }

            /**
             * <p>The snapshot managed status.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder managedForEcs(Boolean managedForEcs) {
                this.managedForEcs = managedForEcs;
                return this;
            }

            /**
             * <p>The snapshot policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The snapshot policy ID.</p>
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
             * <p>The snapshot policy retention rule.</p>
             */
            public Builder retainRule(RetainRule retainRule) {
                this.retainRule = retainRule;
                return this;
            }

            /**
             * <p>The snapshot policy schedule rule.</p>
             */
            public Builder schedule(Schedule schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * <p>The special retention rules for the snapshot policy.</p>
             */
            public Builder specialRetainRules(SpecialRetainRules specialRetainRules) {
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
             * <p>DISABLED</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The snapshot policy storage rule.</p>
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
             * <p>The number of bound targets.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder targetCount(Integer targetCount) {
                this.targetCount = targetCount;
                return this;
            }

            /**
             * <p>The type. Valid values:</p>
             * <ul>
             * <li>DISK</li>
             * </ul>
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
