// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the scaling activities.
         */
        public Builder scalingActivities(java.util.List < ScalingActivities> scalingActivities) {
            this.scalingActivities = scalingActivities;
            return this;
        }

        /**
         * The total number of scaling activities.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScalingActivitiesResponseBody build() {
            return new DescribeScalingActivitiesResponseBody(this);
        } 

    } 

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
             * DisableLifecycleHook.
             */
            public Builder disableLifecycleHook(Boolean disableLifecycleHook) {
                this.disableLifecycleHook = disableLifecycleHook;
                return this;
            }

            /**
             * IgnoredLifecycleHookIds.
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
             * ActivityMetadata.
             */
            public Builder activityMetadata(String activityMetadata) {
                this.activityMetadata = activityMetadata;
                return this;
            }

            /**
             * The total number of instances that are manually added to the scaling group after the scaling activity is complete.
             */
            public Builder attachedCapacity(String attachedCapacity) {
                this.attachedCapacity = attachedCapacity;
                return this;
            }

            /**
             * The total number of instances that are created by Auto Scaling after the scaling activity is complete.
             */
            public Builder autoCreatedCapacity(String autoCreatedCapacity) {
                this.autoCreatedCapacity = autoCreatedCapacity;
                return this;
            }

            /**
             * The reason why the scaling activity is triggered.
             */
            public Builder cause(String cause) {
                this.cause = cause;
                return this;
            }

            /**
             * The number of instances that are created during the scale-out.
             */
            public Builder createdCapacity(Integer createdCapacity) {
                this.createdCapacity = createdCapacity;
                return this;
            }

            /**
             * The instances that are created during the scale-out.
             */
            public Builder createdInstances(java.util.List < String > createdInstances) {
                this.createdInstances = createdInstances;
                return this;
            }

            /**
             * The description of the scaling activity.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The number of instances that are released during the scale-in.
             */
            public Builder destroyedCapacity(Integer destroyedCapacity) {
                this.destroyedCapacity = destroyedCapacity;
                return this;
            }

            /**
             * The instances that are released during the scale-in.
             */
            public Builder destroyedInstances(java.util.List < String > destroyedInstances) {
                this.destroyedInstances = destroyedInstances;
                return this;
            }

            /**
             * Details of the scaling activity.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The time when the scaling activity is complete.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The error code that is returned when the scaling activity failed.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message that is returned when the scaling activity failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * LifecycleHookContext.
             */
            public Builder lifecycleHookContext(LifecycleHookContext lifecycleHookContext) {
                this.lifecycleHookContext = lifecycleHookContext;
                return this;
            }

            /**
             * The execution progress of the scaling activity.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the scaling activity.
             */
            public Builder scalingActivityId(String scalingActivityId) {
                this.scalingActivityId = scalingActivityId;
                return this;
            }

            /**
             * The ID of the scaling group.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * If you query a scale-out, the value of this parameter indicates the number of instances that are created or the number of instances that are started from the Economical Mode during the scale-out.
             * <p>
             * 
             * If you query a scale-in, the value of this parameter indicates the number of instances that are deleted or the number of instances that are stopped in the Economical Mode during the scale-in.
             */
            public Builder scalingInstanceNumber(Integer scalingInstanceNumber) {
                this.scalingInstanceNumber = scalingInstanceNumber;
                return this;
            }

            /**
             * The time when the scaling activity is started.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The number of instances that are started from the Economical Mode during the scale-out.
             */
            public Builder startedCapacity(Integer startedCapacity) {
                this.startedCapacity = startedCapacity;
                return this;
            }

            /**
             * The instances that are started from the Economical Mode during the scale-out.
             */
            public Builder startedInstances(java.util.List < String > startedInstances) {
                this.startedInstances = startedInstances;
                return this;
            }

            /**
             * The status of the scaling activity. Valid values:
             * <p>
             * 
             * *   Successful: The scaling activity is successful.
             * *   Warning: The scaling activity is partially successful.
             * *   Failed: The scaling activity failed.
             * *   InProgress: The scaling activity is in progress.
             * *   Rejected: The request to trigger the scaling activity is rejected.
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * The status message of the scaling activity.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * The number of instances that are stopped in the Economical Mode during the scale-in.
             */
            public Builder stoppedCapacity(Integer stoppedCapacity) {
                this.stoppedCapacity = stoppedCapacity;
                return this;
            }

            /**
             * The instances that are stopped in the Economical Mode during the scale-in.
             */
            public Builder stoppedInstances(java.util.List < String > stoppedInstances) {
                this.stoppedInstances = stoppedInstances;
                return this;
            }

            /**
             * The total number of instances in the scaling group after the scaling activity is complete.
             */
            public Builder totalCapacity(String totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            /**
             * TriggerSourceId.
             */
            public Builder triggerSourceId(String triggerSourceId) {
                this.triggerSourceId = triggerSourceId;
                return this;
            }

            /**
             * TriggerSourceType.
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
