// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScheduledTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScheduledTasksResponseBody</p>
 */
public class DescribeScheduledTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScheduledTasks")
    private java.util.List < ScheduledTasks> scheduledTasks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeScheduledTasksResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.scheduledTasks = builder.scheduledTasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScheduledTasksResponseBody create() {
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
     * @return scheduledTasks
     */
    public java.util.List < ScheduledTasks> getScheduledTasks() {
        return this.scheduledTasks;
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
        private java.util.List < ScheduledTasks> scheduledTasks; 
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information collection of the scheduled tasks.
         */
        public Builder scheduledTasks(java.util.List < ScheduledTasks> scheduledTasks) {
            this.scheduledTasks = scheduledTasks;
            return this;
        }

        /**
         * The total number of scheduled tasks.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScheduledTasksResponseBody build() {
            return new DescribeScheduledTasksResponseBody(this);
        } 

    } 

    public static class ScheduledTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DesiredCapacity")
        private Integer desiredCapacity;

        @com.aliyun.core.annotation.NameInMap("LaunchExpirationTime")
        private Integer launchExpirationTime;

        @com.aliyun.core.annotation.NameInMap("LaunchTime")
        private String launchTime;

        @com.aliyun.core.annotation.NameInMap("MaxValue")
        private Integer maxValue;

        @com.aliyun.core.annotation.NameInMap("MinValue")
        private Integer minValue;

        @com.aliyun.core.annotation.NameInMap("RecurrenceEndTime")
        private String recurrenceEndTime;

        @com.aliyun.core.annotation.NameInMap("RecurrenceType")
        private String recurrenceType;

        @com.aliyun.core.annotation.NameInMap("RecurrenceValue")
        private String recurrenceValue;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("ScheduledAction")
        private String scheduledAction;

        @com.aliyun.core.annotation.NameInMap("ScheduledTaskId")
        private String scheduledTaskId;

        @com.aliyun.core.annotation.NameInMap("ScheduledTaskName")
        private String scheduledTaskName;

        @com.aliyun.core.annotation.NameInMap("TaskEnabled")
        private Boolean taskEnabled;

        private ScheduledTasks(Builder builder) {
            this.description = builder.description;
            this.desiredCapacity = builder.desiredCapacity;
            this.launchExpirationTime = builder.launchExpirationTime;
            this.launchTime = builder.launchTime;
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
            this.recurrenceEndTime = builder.recurrenceEndTime;
            this.recurrenceType = builder.recurrenceType;
            this.recurrenceValue = builder.recurrenceValue;
            this.scalingGroupId = builder.scalingGroupId;
            this.scheduledAction = builder.scheduledAction;
            this.scheduledTaskId = builder.scheduledTaskId;
            this.scheduledTaskName = builder.scheduledTaskName;
            this.taskEnabled = builder.taskEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduledTasks create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return desiredCapacity
         */
        public Integer getDesiredCapacity() {
            return this.desiredCapacity;
        }

        /**
         * @return launchExpirationTime
         */
        public Integer getLaunchExpirationTime() {
            return this.launchExpirationTime;
        }

        /**
         * @return launchTime
         */
        public String getLaunchTime() {
            return this.launchTime;
        }

        /**
         * @return maxValue
         */
        public Integer getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Integer getMinValue() {
            return this.minValue;
        }

        /**
         * @return recurrenceEndTime
         */
        public String getRecurrenceEndTime() {
            return this.recurrenceEndTime;
        }

        /**
         * @return recurrenceType
         */
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        /**
         * @return recurrenceValue
         */
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        /**
         * @return scheduledAction
         */
        public String getScheduledAction() {
            return this.scheduledAction;
        }

        /**
         * @return scheduledTaskId
         */
        public String getScheduledTaskId() {
            return this.scheduledTaskId;
        }

        /**
         * @return scheduledTaskName
         */
        public String getScheduledTaskName() {
            return this.scheduledTaskName;
        }

        /**
         * @return taskEnabled
         */
        public Boolean getTaskEnabled() {
            return this.taskEnabled;
        }

        public static final class Builder {
            private String description; 
            private Integer desiredCapacity; 
            private Integer launchExpirationTime; 
            private String launchTime; 
            private Integer maxValue; 
            private Integer minValue; 
            private String recurrenceEndTime; 
            private String recurrenceType; 
            private String recurrenceValue; 
            private String scalingGroupId; 
            private String scheduledAction; 
            private String scheduledTaskId; 
            private String scheduledTaskName; 
            private Boolean taskEnabled; 

            /**
             * The description of the scheduled task.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The expected number of instances in the scaling group. If you set `Scaling Method` to `Configure Number of Instances in Scaling Group`, you can specify this parameter.
             */
            public Builder desiredCapacity(Integer desiredCapacity) {
                this.desiredCapacity = desiredCapacity;
                return this;
            }

            /**
             * The time window during which the scheduled task can be retried. Unit: seconds. Valid values: 0 to 21600.
             */
            public Builder launchExpirationTime(Integer launchExpirationTime) {
                this.launchExpirationTime = launchExpirationTime;
                return this;
            }

            /**
             * The point in time at which the scheduled task is triggered.
             */
            public Builder launchTime(String launchTime) {
                this.launchTime = launchTime;
                return this;
            }

            /**
             * The maximum number of instances that must be contained in the scaling group. If you set `Scaling Method` to `Configure Number of Instances in Scaling Group`, you can specify this parameter.
             */
            public Builder maxValue(Integer maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * The minimum number of instances that must be contained in the scaling group. If you set `Scaling Method` to `Configure Number of Instances in Scaling Group`, you can specify this parameter.
             */
            public Builder minValue(Integer minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * The end time of the recurrence of the scheduled task.
             */
            public Builder recurrenceEndTime(String recurrenceEndTime) {
                this.recurrenceEndTime = recurrenceEndTime;
                return this;
            }

            /**
             * The recurring interval of the scheduled task.
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * The frequency of recurrence of the scheduled task.
             */
            public Builder recurrenceValue(String recurrenceValue) {
                this.recurrenceValue = recurrenceValue;
                return this;
            }

            /**
             * The ID of the scaling group to which the scheduled task belongs.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * The scaling rule of the scheduled task. A value is returned for this parameter only after you specify ScheduledActions.
             */
            public Builder scheduledAction(String scheduledAction) {
                this.scheduledAction = scheduledAction;
                return this;
            }

            /**
             * The ID of the scheduled task.
             */
            public Builder scheduledTaskId(String scheduledTaskId) {
                this.scheduledTaskId = scheduledTaskId;
                return this;
            }

            /**
             * The name of the scheduled task.
             */
            public Builder scheduledTaskName(String scheduledTaskName) {
                this.scheduledTaskName = scheduledTaskName;
                return this;
            }

            /**
             * Indicates whether the scheduled task is enabled.
             * <p>
             * 
             * *   true
             * *   false
             * 
             * Default value: true.
             */
            public Builder taskEnabled(Boolean taskEnabled) {
                this.taskEnabled = taskEnabled;
                return this;
            }

            public ScheduledTasks build() {
                return new ScheduledTasks(this);
            } 

        } 

    }
}
