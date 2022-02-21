// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScheduledTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScheduledTasksResponseBody</p>
 */
public class DescribeScheduledTasksResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScheduledTasks")
    private ScheduledTasks scheduledTasks;

    @NameInMap("TotalCount")
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
    public ScheduledTasks getScheduledTasks() {
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
        private ScheduledTasks scheduledTasks; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScheduledTasks.
         */
        public Builder scheduledTasks(ScheduledTasks scheduledTasks) {
            this.scheduledTasks = scheduledTasks;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScheduledTasksResponseBody build() {
            return new DescribeScheduledTasksResponseBody(this);
        } 

    } 

    public static class ScheduledTask extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DesiredCapacity")
        private Integer desiredCapacity;

        @NameInMap("LaunchExpirationTime")
        private Integer launchExpirationTime;

        @NameInMap("LaunchTime")
        private String launchTime;

        @NameInMap("MaxValue")
        private Integer maxValue;

        @NameInMap("MinValue")
        private Integer minValue;

        @NameInMap("RecurrenceEndTime")
        private String recurrenceEndTime;

        @NameInMap("RecurrenceType")
        private String recurrenceType;

        @NameInMap("RecurrenceValue")
        private String recurrenceValue;

        @NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @NameInMap("ScheduledAction")
        private String scheduledAction;

        @NameInMap("ScheduledTaskId")
        private String scheduledTaskId;

        @NameInMap("ScheduledTaskName")
        private String scheduledTaskName;

        @NameInMap("TaskEnabled")
        private Boolean taskEnabled;

        private ScheduledTask(Builder builder) {
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

        public static ScheduledTask create() {
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DesiredCapacity.
             */
            public Builder desiredCapacity(Integer desiredCapacity) {
                this.desiredCapacity = desiredCapacity;
                return this;
            }

            /**
             * LaunchExpirationTime.
             */
            public Builder launchExpirationTime(Integer launchExpirationTime) {
                this.launchExpirationTime = launchExpirationTime;
                return this;
            }

            /**
             * LaunchTime.
             */
            public Builder launchTime(String launchTime) {
                this.launchTime = launchTime;
                return this;
            }

            /**
             * MaxValue.
             */
            public Builder maxValue(Integer maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * MinValue.
             */
            public Builder minValue(Integer minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * RecurrenceEndTime.
             */
            public Builder recurrenceEndTime(String recurrenceEndTime) {
                this.recurrenceEndTime = recurrenceEndTime;
                return this;
            }

            /**
             * RecurrenceType.
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * RecurrenceValue.
             */
            public Builder recurrenceValue(String recurrenceValue) {
                this.recurrenceValue = recurrenceValue;
                return this;
            }

            /**
             * ScalingGroupId.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * ScheduledAction.
             */
            public Builder scheduledAction(String scheduledAction) {
                this.scheduledAction = scheduledAction;
                return this;
            }

            /**
             * ScheduledTaskId.
             */
            public Builder scheduledTaskId(String scheduledTaskId) {
                this.scheduledTaskId = scheduledTaskId;
                return this;
            }

            /**
             * ScheduledTaskName.
             */
            public Builder scheduledTaskName(String scheduledTaskName) {
                this.scheduledTaskName = scheduledTaskName;
                return this;
            }

            /**
             * TaskEnabled.
             */
            public Builder taskEnabled(Boolean taskEnabled) {
                this.taskEnabled = taskEnabled;
                return this;
            }

            public ScheduledTask build() {
                return new ScheduledTask(this);
            } 

        } 

    }
    public static class ScheduledTasks extends TeaModel {
        @NameInMap("ScheduledTask")
        private java.util.List < ScheduledTask> scheduledTask;

        private ScheduledTasks(Builder builder) {
            this.scheduledTask = builder.scheduledTask;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduledTasks create() {
            return builder().build();
        }

        /**
         * @return scheduledTask
         */
        public java.util.List < ScheduledTask> getScheduledTask() {
            return this.scheduledTask;
        }

        public static final class Builder {
            private java.util.List < ScheduledTask> scheduledTask; 

            /**
             * ScheduledTask.
             */
            public Builder scheduledTask(java.util.List < ScheduledTask> scheduledTask) {
                this.scheduledTask = scheduledTask;
                return this;
            }

            public ScheduledTasks build() {
                return new ScheduledTasks(this);
            } 

        } 

    }
}
