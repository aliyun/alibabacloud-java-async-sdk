// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link DescribeGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupsResponseBody</p>
 */
public class DescribeGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Groups")
    private java.util.List<Groups> groups;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGroupsResponseBody(Builder builder) {
        this.groups = builder.groups;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groups
     */
    public java.util.List<Groups> getGroups() {
        return this.groups;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Groups> groups; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeGroupsResponseBody model) {
            this.groups = model.groups;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of groups.</p>
         */
        public Builder groups(java.util.List<Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * <p>The pagination token. Leave this parameter empty for the first request. For subsequent requests, use the <code>nextToken</code> value returned in the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>68BD3312-53D8-123E-BB32-1A9F25E07A03</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGroupsResponseBody build() {
            return new DescribeGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupsResponseBody</p>
     */
    public static class UsageAlertRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroupNames")
        private java.util.List<String> contactGroupNames;

        @com.aliyun.core.annotation.NameInMap("LastTriggeredAt")
        private String lastTriggeredAt;

        @com.aliyun.core.annotation.NameInMap("ThresholdPercent")
        private Integer thresholdPercent;

        private UsageAlertRule(Builder builder) {
            this.contactGroupNames = builder.contactGroupNames;
            this.lastTriggeredAt = builder.lastTriggeredAt;
            this.thresholdPercent = builder.thresholdPercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageAlertRule create() {
            return builder().build();
        }

        /**
         * @return contactGroupNames
         */
        public java.util.List<String> getContactGroupNames() {
            return this.contactGroupNames;
        }

        /**
         * @return lastTriggeredAt
         */
        public String getLastTriggeredAt() {
            return this.lastTriggeredAt;
        }

        /**
         * @return thresholdPercent
         */
        public Integer getThresholdPercent() {
            return this.thresholdPercent;
        }

        public static final class Builder {
            private java.util.List<String> contactGroupNames; 
            private String lastTriggeredAt; 
            private Integer thresholdPercent; 

            private Builder() {
            } 

            private Builder(UsageAlertRule model) {
                this.contactGroupNames = model.contactGroupNames;
                this.lastTriggeredAt = model.lastTriggeredAt;
                this.thresholdPercent = model.thresholdPercent;
            } 

            /**
             * <p>The list of contact group names.</p>
             */
            public Builder contactGroupNames(java.util.List<String> contactGroupNames) {
                this.contactGroupNames = contactGroupNames;
                return this;
            }

            /**
             * <p>The last trigger time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-23 10:20:30</p>
             */
            public Builder lastTriggeredAt(String lastTriggeredAt) {
                this.lastTriggeredAt = lastTriggeredAt;
                return this;
            }

            /**
             * <p>The percentage of the quota alert threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder thresholdPercent(Integer thresholdPercent) {
                this.thresholdPercent = thresholdPercent;
                return this;
            }

            public UsageAlertRule build() {
                return new UsageAlertRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupsResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("FreeTrial")
        private Boolean freeTrial;

        @com.aliyun.core.annotation.NameInMap("GroupResourceType")
        private String groupResourceType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("PeriodEndTime")
        private String periodEndTime;

        @com.aliyun.core.annotation.NameInMap("PeriodStartTime")
        private String periodStartTime;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("PriorityDeduction")
        private Boolean priorityDeduction;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TotalTime")
        private Long totalTime;

        @com.aliyun.core.annotation.NameInMap("TotalTimeDecimal")
        private String totalTimeDecimal;

        @com.aliyun.core.annotation.NameInMap("UsageAlertRule")
        private UsageAlertRule usageAlertRule;

        @com.aliyun.core.annotation.NameInMap("UsedTime")
        private Long usedTime;

        @com.aliyun.core.annotation.NameInMap("UsedTimeDecimal")
        private String usedTimeDecimal;

        private Instances(Builder builder) {
            this.aliUid = builder.aliUid;
            this.expiredTime = builder.expiredTime;
            this.freeTrial = builder.freeTrial;
            this.groupResourceType = builder.groupResourceType;
            this.instanceId = builder.instanceId;
            this.period = builder.period;
            this.periodEndTime = builder.periodEndTime;
            this.periodStartTime = builder.periodStartTime;
            this.periodUnit = builder.periodUnit;
            this.priorityDeduction = builder.priorityDeduction;
            this.resourceType = builder.resourceType;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.totalTime = builder.totalTime;
            this.totalTimeDecimal = builder.totalTimeDecimal;
            this.usageAlertRule = builder.usageAlertRule;
            this.usedTime = builder.usedTime;
            this.usedTimeDecimal = builder.usedTimeDecimal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return freeTrial
         */
        public Boolean getFreeTrial() {
            return this.freeTrial;
        }

        /**
         * @return groupResourceType
         */
        public String getGroupResourceType() {
            return this.groupResourceType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return periodEndTime
         */
        public String getPeriodEndTime() {
            return this.periodEndTime;
        }

        /**
         * @return periodStartTime
         */
        public String getPeriodStartTime() {
            return this.periodStartTime;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return priorityDeduction
         */
        public Boolean getPriorityDeduction() {
            return this.priorityDeduction;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return totalTime
         */
        public Long getTotalTime() {
            return this.totalTime;
        }

        /**
         * @return totalTimeDecimal
         */
        public String getTotalTimeDecimal() {
            return this.totalTimeDecimal;
        }

        /**
         * @return usageAlertRule
         */
        public UsageAlertRule getUsageAlertRule() {
            return this.usageAlertRule;
        }

        /**
         * @return usedTime
         */
        public Long getUsedTime() {
            return this.usedTime;
        }

        /**
         * @return usedTimeDecimal
         */
        public String getUsedTimeDecimal() {
            return this.usedTimeDecimal;
        }

        public static final class Builder {
            private Long aliUid; 
            private String expiredTime; 
            private Boolean freeTrial; 
            private String groupResourceType; 
            private String instanceId; 
            private Integer period; 
            private String periodEndTime; 
            private String periodStartTime; 
            private String periodUnit; 
            private Boolean priorityDeduction; 
            private String resourceType; 
            private String startTime; 
            private String state; 
            private Long totalTime; 
            private String totalTimeDecimal; 
            private UsageAlertRule usageAlertRule; 
            private Long usedTime; 
            private String usedTimeDecimal; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.aliUid = model.aliUid;
                this.expiredTime = model.expiredTime;
                this.freeTrial = model.freeTrial;
                this.groupResourceType = model.groupResourceType;
                this.instanceId = model.instanceId;
                this.period = model.period;
                this.periodEndTime = model.periodEndTime;
                this.periodStartTime = model.periodStartTime;
                this.periodUnit = model.periodUnit;
                this.priorityDeduction = model.priorityDeduction;
                this.resourceType = model.resourceType;
                this.startTime = model.startTime;
                this.state = model.state;
                this.totalTime = model.totalTime;
                this.totalTimeDecimal = model.totalTimeDecimal;
                this.usageAlertRule = model.usageAlertRule;
                this.usedTime = model.usedTime;
                this.usedTimeDecimal = model.usedTimeDecimal;
            } 

            /**
             * <p>The Alibaba Cloud user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1712418364463000</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The expiration time. The time is in ISO 8601 format and the UTC time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-05T15:59Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>Specifies whether the instance is on a free trial.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder freeTrial(Boolean freeTrial) {
                this.freeTrial = freeTrial;
                return this;
            }

            /**
             * <p>The group resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>GROUP_CORE_PACKAGE</p>
             */
            public Builder groupResourceType(String groupResourceType) {
                this.groupResourceType = groupResourceType;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>chp-0c1g77wmw50b6cXXX</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The purchase period.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The end time of the current period. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-01 00:00:00</p>
             */
            public Builder periodEndTime(String periodEndTime) {
                this.periodEndTime = periodEndTime;
                return this;
            }

            /**
             * <p>The start time of the current period. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-01 00:00:00</p>
             */
            public Builder periodStartTime(String periodStartTime) {
                this.periodStartTime = periodStartTime;
                return this;
            }

            /**
             * <p>The period unit.</p>
             * 
             * <strong>example:</strong>
             * <p>Year</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>Specifies whether priority deduction is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder priorityDeduction(Boolean priorityDeduction) {
                this.priorityDeduction = priorityDeduction;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>GROUP_CORE_PACKAGE</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The start time. The time is in ISO 8601 format and the UTC time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-05T02:31Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The state.</p>
             * 
             * <strong>example:</strong>
             * <p>DEDUCTING</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The total duration.</p>
             * 
             * <strong>example:</strong>
             * <p>180000000</p>
             */
            public Builder totalTime(Long totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            /**
             * <p>The total duration with a precision factor.</p>
             * 
             * <strong>example:</strong>
             * <p>2000.0000</p>
             */
            public Builder totalTimeDecimal(String totalTimeDecimal) {
                this.totalTimeDecimal = totalTimeDecimal;
                return this;
            }

            /**
             * <p>The usage Threshold Alerting rule.</p>
             */
            public Builder usageAlertRule(UsageAlertRule usageAlertRule) {
                this.usageAlertRule = usageAlertRule;
                return this;
            }

            /**
             * <p>The usage duration.</p>
             * 
             * <strong>example:</strong>
             * <p>26959861</p>
             */
            public Builder usedTime(Long usedTime) {
                this.usedTime = usedTime;
                return this;
            }

            /**
             * <p>The usage duration with a precision factor.</p>
             * 
             * <strong>example:</strong>
             * <p>11.0000</p>
             */
            public Builder usedTimeDecimal(String usedTimeDecimal) {
                this.usedTimeDecimal = usedTimeDecimal;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupsResponseBody</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private java.util.List<Instances> instances;

        @com.aliyun.core.annotation.NameInMap("LastWeekUsedCoreTime")
        private Float lastWeekUsedCoreTime;

        @com.aliyun.core.annotation.NameInMap("LeftCoreTime")
        private Float leftCoreTime;

        @com.aliyun.core.annotation.NameInMap("ResourceIds")
        private java.util.List<String> resourceIds;

        @com.aliyun.core.annotation.NameInMap("TotalTimeDecimal")
        private String totalTimeDecimal;

        @com.aliyun.core.annotation.NameInMap("UsedCoreTime")
        private Float usedCoreTime;

        @com.aliyun.core.annotation.NameInMap("UsedTimeDecimal")
        private String usedTimeDecimal;

        private Groups(Builder builder) {
            this.groupId = builder.groupId;
            this.instanceCount = builder.instanceCount;
            this.instances = builder.instances;
            this.lastWeekUsedCoreTime = builder.lastWeekUsedCoreTime;
            this.leftCoreTime = builder.leftCoreTime;
            this.resourceIds = builder.resourceIds;
            this.totalTimeDecimal = builder.totalTimeDecimal;
            this.usedCoreTime = builder.usedCoreTime;
            this.usedTimeDecimal = builder.usedTimeDecimal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return instances
         */
        public java.util.List<Instances> getInstances() {
            return this.instances;
        }

        /**
         * @return lastWeekUsedCoreTime
         */
        public Float getLastWeekUsedCoreTime() {
            return this.lastWeekUsedCoreTime;
        }

        /**
         * @return leftCoreTime
         */
        public Float getLeftCoreTime() {
            return this.leftCoreTime;
        }

        /**
         * @return resourceIds
         */
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        /**
         * @return totalTimeDecimal
         */
        public String getTotalTimeDecimal() {
            return this.totalTimeDecimal;
        }

        /**
         * @return usedCoreTime
         */
        public Float getUsedCoreTime() {
            return this.usedCoreTime;
        }

        /**
         * @return usedTimeDecimal
         */
        public String getUsedTimeDecimal() {
            return this.usedTimeDecimal;
        }

        public static final class Builder {
            private String groupId; 
            private Integer instanceCount; 
            private java.util.List<Instances> instances; 
            private Float lastWeekUsedCoreTime; 
            private Float leftCoreTime; 
            private java.util.List<String> resourceIds; 
            private String totalTimeDecimal; 
            private Float usedCoreTime; 
            private String usedTimeDecimal; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.groupId = model.groupId;
                this.instanceCount = model.instanceCount;
                this.instances = model.instances;
                this.lastWeekUsedCoreTime = model.lastWeekUsedCoreTime;
                this.leftCoreTime = model.leftCoreTime;
                this.resourceIds = model.resourceIds;
                this.totalTimeDecimal = model.totalTimeDecimal;
                this.usedCoreTime = model.usedCoreTime;
                this.usedTimeDecimal = model.usedTimeDecimal;
            } 

            /**
             * <p>The group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>group-0c5ambj9yaeqjpXXX</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The list of instance information.</p>
             */
            public Builder instances(java.util.List<Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * <p>The core-hour usage in the last week.</p>
             * 
             * <strong>example:</strong>
             * <p>85949.99</p>
             */
            public Builder lastWeekUsedCoreTime(Float lastWeekUsedCoreTime) {
                this.lastWeekUsedCoreTime = lastWeekUsedCoreTime;
                return this;
            }

            /**
             * <p>The remaining core-hours.</p>
             * 
             * <strong>example:</strong>
             * <p>92511.15</p>
             */
            public Builder leftCoreTime(Float leftCoreTime) {
                this.leftCoreTime = leftCoreTime;
                return this;
            }

            /**
             * <p>The list of resource IDs.</p>
             */
            public Builder resourceIds(java.util.List<String> resourceIds) {
                this.resourceIds = resourceIds;
                return this;
            }

            /**
             * <p>The total duration with a precision factor.</p>
             * 
             * <strong>example:</strong>
             * <p>2000.0000</p>
             */
            public Builder totalTimeDecimal(String totalTimeDecimal) {
                this.totalTimeDecimal = totalTimeDecimal;
                return this;
            }

            /**
             * <p>The used core-hours.</p>
             * 
             * <strong>example:</strong>
             * <p>7488.85</p>
             */
            public Builder usedCoreTime(Float usedCoreTime) {
                this.usedCoreTime = usedCoreTime;
                return this;
            }

            /**
             * <p>The usage duration with a precision factor.</p>
             * 
             * <strong>example:</strong>
             * <p>11.0000</p>
             */
            public Builder usedTimeDecimal(String usedTimeDecimal) {
                this.usedTimeDecimal = usedTimeDecimal;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
