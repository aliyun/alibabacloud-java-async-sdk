// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeScalingActivitiesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingActivitiesResponseBody</p>
 */
public class DescribeScalingActivitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingActivities")
    private java.util.List < ScalingActivities> scalingActivities;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeScalingActivitiesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.scalingActivities = builder.scalingActivities;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingActivitiesResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingActivities
     */
    public java.util.List < ScalingActivities> getScalingActivities() {
        return this.scalingActivities;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < ScalingActivities> scalingActivities; 
        private Integer totalCount; 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CC107349-57B7-4405-B1BF-9BF5AF7F2A46</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the scaling activities.</p>
         */
        public Builder scalingActivities(java.util.List < ScalingActivities> scalingActivities) {
            this.scalingActivities = scalingActivities;
            return this;
        }

        /**
         * <p>The total number of scaling activities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScalingActivitiesResponseBody build() {
            return new DescribeScalingActivitiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScalingActivitiesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingActivitiesResponseBody</p>
     */
    public static class LifecycleHookContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisableLifecycleHook")
        private Boolean disableLifecycleHook;

        @com.aliyun.core.annotation.NameInMap("IgnoredLifecycleHookIds")
        private java.util.List < String > ignoredLifecycleHookIds;

        private LifecycleHookContext(Builder builder) {
            this.disableLifecycleHook = builder.disableLifecycleHook;
            this.ignoredLifecycleHookIds = builder.ignoredLifecycleHookIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecycleHookContext create() {
            return builder().build();
        }

        /**
         * @return disableLifecycleHook
         */
        public Boolean getDisableLifecycleHook() {
            return this.disableLifecycleHook;
        }

        /**
         * @return ignoredLifecycleHookIds
         */
        public java.util.List < String > getIgnoredLifecycleHookIds() {
            return this.ignoredLifecycleHookIds;
        }

        public static final class Builder {
            private Boolean disableLifecycleHook; 
            private java.util.List < String > ignoredLifecycleHookIds; 

            /**
             * <p>Indicates whether all lifecycle hooks are disabled. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disableLifecycleHook(Boolean disableLifecycleHook) {
                this.disableLifecycleHook = disableLifecycleHook;
                return this;
            }

            /**
             * <p>The IDs of the lifecycle hooks that are disabled.</p>
             */
            public Builder ignoredLifecycleHookIds(java.util.List < String > ignoredLifecycleHookIds) {
                this.ignoredLifecycleHookIds = ignoredLifecycleHookIds;
                return this;
            }

            public LifecycleHookContext build() {
                return new LifecycleHookContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingActivitiesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingActivitiesResponseBody</p>
     */
    public static class ScalingActivities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityMetadata")
        private String activityMetadata;

        @com.aliyun.core.annotation.NameInMap("AttachedCapacity")
        private String attachedCapacity;

        @com.aliyun.core.annotation.NameInMap("AutoCreatedCapacity")
        private String autoCreatedCapacity;

        @com.aliyun.core.annotation.NameInMap("Cause")
        private String cause;

        @com.aliyun.core.annotation.NameInMap("CreatedCapacity")
        private Integer createdCapacity;

        @com.aliyun.core.annotation.NameInMap("CreatedInstances")
        private java.util.List < String > createdInstances;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestroyedCapacity")
        private Integer destroyedCapacity;

        @com.aliyun.core.annotation.NameInMap("DestroyedInstances")
        private java.util.List < String > destroyedInstances;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("InstanceRefreshTaskId")
        private String instanceRefreshTaskId;

        @com.aliyun.core.annotation.NameInMap("LifecycleHookContext")
        private LifecycleHookContext lifecycleHookContext;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("ScalingActivityId")
        private String scalingActivityId;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("ScalingInstanceNumber")
        private Integer scalingInstanceNumber;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StartedCapacity")
        private Integer startedCapacity;

        @com.aliyun.core.annotation.NameInMap("StartedInstances")
        private java.util.List < String > startedInstances;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        @com.aliyun.core.annotation.NameInMap("StoppedCapacity")
        private Integer stoppedCapacity;

        @com.aliyun.core.annotation.NameInMap("StoppedInstances")
        private java.util.List < String > stoppedInstances;

        @com.aliyun.core.annotation.NameInMap("TotalCapacity")
        private String totalCapacity;

        @com.aliyun.core.annotation.NameInMap("TriggerSourceId")
        private String triggerSourceId;

        @com.aliyun.core.annotation.NameInMap("TriggerSourceType")
        private String triggerSourceType;

        private ScalingActivities(Builder builder) {
            this.activityMetadata = builder.activityMetadata;
            this.attachedCapacity = builder.attachedCapacity;
            this.autoCreatedCapacity = builder.autoCreatedCapacity;
            this.cause = builder.cause;
            this.createdCapacity = builder.createdCapacity;
            this.createdInstances = builder.createdInstances;
            this.description = builder.description;
            this.destroyedCapacity = builder.destroyedCapacity;
            this.destroyedInstances = builder.destroyedInstances;
            this.detail = builder.detail;
            this.endTime = builder.endTime;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.instanceRefreshTaskId = builder.instanceRefreshTaskId;
            this.lifecycleHookContext = builder.lifecycleHookContext;
            this.progress = builder.progress;
            this.scalingActivityId = builder.scalingActivityId;
            this.scalingGroupId = builder.scalingGroupId;
            this.scalingInstanceNumber = builder.scalingInstanceNumber;
            this.startTime = builder.startTime;
            this.startedCapacity = builder.startedCapacity;
            this.startedInstances = builder.startedInstances;
            this.statusCode = builder.statusCode;
            this.statusMessage = builder.statusMessage;
            this.stoppedCapacity = builder.stoppedCapacity;
            this.stoppedInstances = builder.stoppedInstances;
            this.totalCapacity = builder.totalCapacity;
            this.triggerSourceId = builder.triggerSourceId;
            this.triggerSourceType = builder.triggerSourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingActivities create() {
            return builder().build();
        }

        /**
         * @return activityMetadata
         */
        public String getActivityMetadata() {
            return this.activityMetadata;
        }

        /**
         * @return attachedCapacity
         */
        public String getAttachedCapacity() {
            return this.attachedCapacity;
        }

        /**
         * @return autoCreatedCapacity
         */
        public String getAutoCreatedCapacity() {
            return this.autoCreatedCapacity;
        }

        /**
         * @return cause
         */
        public String getCause() {
            return this.cause;
        }

        /**
         * @return createdCapacity
         */
        public Integer getCreatedCapacity() {
            return this.createdCapacity;
        }

        /**
         * @return createdInstances
         */
        public java.util.List < String > getCreatedInstances() {
            return this.createdInstances;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destroyedCapacity
         */
        public Integer getDestroyedCapacity() {
            return this.destroyedCapacity;
        }

        /**
         * @return destroyedInstances
         */
        public java.util.List < String > getDestroyedInstances() {
            return this.destroyedInstances;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return instanceRefreshTaskId
         */
        public String getInstanceRefreshTaskId() {
            return this.instanceRefreshTaskId;
        }

        /**
         * @return lifecycleHookContext
         */
        public LifecycleHookContext getLifecycleHookContext() {
            return this.lifecycleHookContext;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return scalingActivityId
         */
        public String getScalingActivityId() {
            return this.scalingActivityId;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        /**
         * @return scalingInstanceNumber
         */
        public Integer getScalingInstanceNumber() {
            return this.scalingInstanceNumber;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return startedCapacity
         */
        public Integer getStartedCapacity() {
            return this.startedCapacity;
        }

        /**
         * @return startedInstances
         */
        public java.util.List < String > getStartedInstances() {
            return this.startedInstances;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return statusMessage
         */
        public String getStatusMessage() {
            return this.statusMessage;
        }

        /**
         * @return stoppedCapacity
         */
        public Integer getStoppedCapacity() {
            return this.stoppedCapacity;
        }

        /**
         * @return stoppedInstances
         */
        public java.util.List < String > getStoppedInstances() {
            return this.stoppedInstances;
        }

        /**
         * @return totalCapacity
         */
        public String getTotalCapacity() {
            return this.totalCapacity;
        }

        /**
         * @return triggerSourceId
         */
        public String getTriggerSourceId() {
            return this.triggerSourceId;
        }

        /**
         * @return triggerSourceType
         */
        public String getTriggerSourceType() {
            return this.triggerSourceType;
        }

        public static final class Builder {
            private String activityMetadata; 
            private String attachedCapacity; 
            private String autoCreatedCapacity; 
            private String cause; 
            private Integer createdCapacity; 
            private java.util.List < String > createdInstances; 
            private String description; 
            private Integer destroyedCapacity; 
            private java.util.List < String > destroyedInstances; 
            private String detail; 
            private String endTime; 
            private String errorCode; 
            private String errorMessage; 
            private String instanceRefreshTaskId; 
            private LifecycleHookContext lifecycleHookContext; 
            private Integer progress; 
            private String scalingActivityId; 
            private String scalingGroupId; 
            private Integer scalingInstanceNumber; 
            private String startTime; 
            private Integer startedCapacity; 
            private java.util.List < String > startedInstances; 
            private String statusCode; 
            private String statusMessage; 
            private Integer stoppedCapacity; 
            private java.util.List < String > stoppedInstances; 
            private String totalCapacity; 
            private String triggerSourceId; 
            private String triggerSourceType; 

            /**
             * <p>The metadata of the scaling activity.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;goatscaler.io/managed&quot;:&quot;true&quot;}</p>
             */
            public Builder activityMetadata(String activityMetadata) {
                this.activityMetadata = activityMetadata;
                return this;
            }

            /**
             * <p>The total number of instances that are manually added to the scaling group after the scaling activity was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder attachedCapacity(String attachedCapacity) {
                this.attachedCapacity = attachedCapacity;
                return this;
            }

            /**
             * <p>The total number of instances that are created by Auto Scaling after the scaling activity was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder autoCreatedCapacity(String autoCreatedCapacity) {
                this.autoCreatedCapacity = autoCreatedCapacity;
                return this;
            }

            /**
             * <p>The reason why the scaling activity was triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>A user requests to execute scaling rule &quot;asr-bp12tcnol686y1ik****&quot;, changing the Total Capacity from &quot;1&quot; to &quot;2&quot;.</p>
             */
            public Builder cause(String cause) {
                this.cause = cause;
                return this;
            }

            /**
             * <p>The number of instances that are created during the scale-out event.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder createdCapacity(Integer createdCapacity) {
                this.createdCapacity = createdCapacity;
                return this;
            }

            /**
             * <p>The instances that are created during the scale-out event.</p>
             */
            public Builder createdInstances(java.util.List < String > createdInstances) {
                this.createdInstances = createdInstances;
                return this;
            }

            /**
             * <p>The description of the scaling activity.</p>
             * 
             * <strong>example:</strong>
             * <p>Add &quot;1&quot; ECS instance</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The number of instances that are released during the scale-in event.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder destroyedCapacity(Integer destroyedCapacity) {
                this.destroyedCapacity = destroyedCapacity;
                return this;
            }

            /**
             * <p>The instances that are released during the scale-in event.</p>
             */
            public Builder destroyedInstances(java.util.List < String > destroyedInstances) {
                this.destroyedInstances = destroyedInstances;
                return this;
            }

            /**
             * <p>Details of the scaling activity.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;new ECS instances &quot;i-j6c8ilerw, i-j6c8iler4mx&quot; are created.&quot;</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The time when the scaling activity was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-10T09:54Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The error code that is returned when the scaling activity failed.</p>
             * 
             * <strong>example:</strong>
             * <p>OperationDenied.NoStock</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message that is returned when the scaling activity failed.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified ECS resource is out of stock in this region. Please try again later.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * InstanceRefreshTaskId.
             */
            public Builder instanceRefreshTaskId(String instanceRefreshTaskId) {
                this.instanceRefreshTaskId = instanceRefreshTaskId;
                return this;
            }

            /**
             * <p>The context of the lifecycle hook.</p>
             */
            public Builder lifecycleHookContext(LifecycleHookContext lifecycleHookContext) {
                this.lifecycleHookContext = lifecycleHookContext;
                return this;
            }

            /**
             * <p>The execution progress of the scaling activity.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The ID of the scaling activity.</p>
             * 
             * <strong>example:</strong>
             * <p>asa-bp161xudmuxdzofe****</p>
             */
            public Builder scalingActivityId(String scalingActivityId) {
                this.scalingActivityId = scalingActivityId;
                return this;
            }

            /**
             * <p>The ID of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>asg-bp18p2yfxow2dloq****</p>
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * <p>If you query a scale-out activity, the value of this parameter indicates the number of instances that are created or the number of instances that are started from the Economical Mode during the scale-out event.</p>
             * <p>If you query a scale-in activity, the value of this parameter indicates the number of instances that are deleted or the number of instances that are stopped in the Economical Mode during the scale-in event.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scalingInstanceNumber(Integer scalingInstanceNumber) {
                this.scalingInstanceNumber = scalingInstanceNumber;
                return this;
            }

            /**
             * <p>The time when the scaling activity was started.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-10T09:54Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The number of instances that are started from the Economical Mode during the scale-out event.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder startedCapacity(Integer startedCapacity) {
                this.startedCapacity = startedCapacity;
                return this;
            }

            /**
             * <p>The instances that are started from the Economical Mode during the scale-out event.</p>
             */
            public Builder startedInstances(java.util.List < String > startedInstances) {
                this.startedInstances = startedInstances;
                return this;
            }

            /**
             * <p>The status of the scaling activity. Valid values:</p>
             * <ul>
             * <li>Successful: The scaling activity is successful.</li>
             * <li>Warning: The scaling activity is partially successful.</li>
             * <li>Failed: The scaling activity failed.</li>
             * <li>InProgress: The scaling activity is in progress.</li>
             * <li>Rejected: The request to trigger the scaling activity is rejected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Successful</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>The status message of the scaling activity.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;1&quot; ECS instances are added</p>
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * <p>The number of instances that are stopped in the Economical Mode during the scale-in event.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder stoppedCapacity(Integer stoppedCapacity) {
                this.stoppedCapacity = stoppedCapacity;
                return this;
            }

            /**
             * <p>The instances that are stopped in the Economical Mode during the scale-in event.</p>
             */
            public Builder stoppedInstances(java.util.List < String > stoppedInstances) {
                this.stoppedInstances = stoppedInstances;
                return this;
            }

            /**
             * <p>The total number of instances in the scaling group after the scaling activity was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalCapacity(String totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            /**
             * <p>The ID of the trigger source of the scaling activity.</p>
             * <ul>
             * <li>If TriggerSourceType is set to Cms, the ID of the trigger source is the ID of an event-triggered task.</li>
             * <li>If TriggerSourceType is set to Api, the ID of the trigger source is the ID of an Alibaba Cloud account or a RAM user.</li>
             * <li>If TriggerSourceType is set to Api, the ID of the trigger source is null.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2346366580*****</p>
             */
            public Builder triggerSourceId(String triggerSourceId) {
                this.triggerSourceId = triggerSourceId;
                return this;
            }

            /**
             * <p>The type of the trigger source of the scaling activity.</p>
             * <ul>
             * <li>Cms: triggered by an event-triggered task</li>
             * <li>APIs: triggered by API calling</li>
             * <li>Ess: triggered by a system task</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Api</p>
             */
            public Builder triggerSourceType(String triggerSourceType) {
                this.triggerSourceType = triggerSourceType;
                return this;
            }

            public ScalingActivities build() {
                return new ScalingActivities(this);
            } 

        } 

    }
}
