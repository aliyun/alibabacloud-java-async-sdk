// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20160722.models;

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
    private ScheduledTasks scheduledTasks;

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
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LaunchExpirationTime")
        private Integer launchExpirationTime;

        @com.aliyun.core.annotation.NameInMap("LaunchTime")
        private String launchTime;

        @com.aliyun.core.annotation.NameInMap("RecurrenceEndTime")
        private String recurrenceEndTime;

        @com.aliyun.core.annotation.NameInMap("RecurrenceType")
        private String recurrenceType;

        @com.aliyun.core.annotation.NameInMap("RecurrenceValue")
        private String recurrenceValue;

        @com.aliyun.core.annotation.NameInMap("ScheduledAction")
        private String scheduledAction;

        @com.aliyun.core.annotation.NameInMap("ScheduledTaskId")
        private String scheduledTaskId;

        @com.aliyun.core.annotation.NameInMap("ScheduledTaskName")
        private String scheduledTaskName;

        @com.aliyun.core.annotation.NameInMap("TaskEnabled")
        private Boolean taskEnabled;

        private ScheduledTask(Builder builder) {
            this.description = builder.description;
            this.launchExpirationTime = builder.launchExpirationTime;
            this.launchTime = builder.launchTime;
            this.recurrenceEndTime = builder.recurrenceEndTime;
            this.recurrenceType = builder.recurrenceType;
            this.recurrenceValue = builder.recurrenceValue;
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
            private Integer launchExpirationTime; 
            private String launchTime; 
            private String recurrenceEndTime; 
            private String recurrenceType; 
            private String recurrenceValue; 
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
        @com.aliyun.core.annotation.NameInMap("ScheduledTask")
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
