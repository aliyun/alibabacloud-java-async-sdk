// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
    private java.util.List<ScheduledTasks> scheduledTasks;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ScheduledTasks> getScheduledTasks() {
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
        private java.util.List<ScheduledTasks> scheduledTasks; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeScheduledTasksResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.scheduledTasks = model.scheduledTasks;
            this.totalCount = model.totalCount;
        } 

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
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information collection of the scheduled tasks.</p>
         */
        public Builder scheduledTasks(java.util.List<ScheduledTasks> scheduledTasks) {
            this.scheduledTasks = scheduledTasks;
            return this;
        }

        /**
         * <p>The total number of scheduled tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScheduledTasksResponseBody build() {
            return new DescribeScheduledTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScheduledTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScheduledTasksResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ScheduledTasks model) {
                this.description = model.description;
                this.desiredCapacity = model.desiredCapacity;
                this.launchExpirationTime = model.launchExpirationTime;
                this.launchTime = model.launchTime;
                this.maxValue = model.maxValue;
                this.minValue = model.minValue;
                this.recurrenceEndTime = model.recurrenceEndTime;
                this.recurrenceType = model.recurrenceType;
                this.recurrenceValue = model.recurrenceValue;
                this.scalingGroupId = model.scalingGroupId;
                this.scheduledAction = model.scheduledAction;
                this.scheduledTaskId = model.scheduledTaskId;
                this.scheduledTaskName = model.scheduledTaskName;
                this.taskEnabled = model.taskEnabled;
            } 

            /**
             * <p>The description of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>Test scheduled task.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The expected number of instances in the scaling group. If you set <code>Scaling Method</code> to <code>Configure Number of Instances in Scaling Group</code>, you can specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder desiredCapacity(Integer desiredCapacity) {
                this.desiredCapacity = desiredCapacity;
                return this;
            }

            /**
             * <p>The time window during which the scheduled task can be retried. Unit: seconds. Valid values: 0 to 21600.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder launchExpirationTime(Integer launchExpirationTime) {
                this.launchExpirationTime = launchExpirationTime;
                return this;
            }

            /**
             * <p>The point in time at which the scheduled task is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>2014-08-18T10:52Z</p>
             */
            public Builder launchTime(String launchTime) {
                this.launchTime = launchTime;
                return this;
            }

            /**
             * <p>The maximum number of instances that must be contained in the scaling group. If you set <code>Scaling Method</code> to <code>Configure Number of Instances in Scaling Group</code>, you can specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxValue(Integer maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * <p>The minimum number of instances that must be contained in the scaling group. If you set <code>Scaling Method</code> to <code>Configure Number of Instances in Scaling Group</code>, you can specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minValue(Integer minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * <p>The end time of the recurrence of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>2014-08-20T16:55Z</p>
             */
            public Builder recurrenceEndTime(String recurrenceEndTime) {
                this.recurrenceEndTime = recurrenceEndTime;
                return this;
            }

            /**
             * <p>The recurring interval of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>Daily</p>
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * <p>The frequency of recurrence of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recurrenceValue(String recurrenceValue) {
                this.recurrenceValue = recurrenceValue;
                return this;
            }

            /**
             * <p>The ID of the scaling group to which the scheduled task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>asg-bp1bo5tca4m56nap****</p>
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * <p>The scaling rule of the scheduled task. A value is returned for this parameter only after you specify ScheduledActions.</p>
             * 
             * <strong>example:</strong>
             * <p>ari:acs:ess:cn-hangzhou:1406926474****:scalingrule/asr-bp1id5rhu8edp7kd****</p>
             */
            public Builder scheduledAction(String scheduledAction) {
                this.scheduledAction = scheduledAction;
                return this;
            }

            /**
             * <p>The ID of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>edRtShc57WGXdt8TlPbr****</p>
             */
            public Builder scheduledTaskId(String scheduledTaskId) {
                this.scheduledTaskId = scheduledTaskId;
                return this;
            }

            /**
             * <p>The name of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>scheduled****</p>
             */
            public Builder scheduledTaskName(String scheduledTaskName) {
                this.scheduledTaskName = scheduledTaskName;
                return this;
            }

            /**
             * <p>Indicates whether the scheduled task is enabled.</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
