// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ListScheduledTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListScheduledTasksResponseBody</p>
 */
public class ListScheduledTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Schedules")
    private java.util.List<Schedules> schedules;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListScheduledTasksResponseBody(Builder builder) {
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.schedules = builder.schedules;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScheduledTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schedules
     */
    public java.util.List<Schedules> getSchedules() {
        return this.schedules;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String message; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List<Schedules> schedules; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListScheduledTasksResponseBody model) {
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.schedules = model.schedules;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
         * Schedules.
         */
        public Builder schedules(java.util.List<Schedules> schedules) {
            this.schedules = schedules;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListScheduledTasksResponseBody build() {
            return new ListScheduledTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListScheduledTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduledTasksResponseBody</p>
     */
    public static class Schedules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Frequency")
        private String frequency;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Long instanceCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ScheduledId")
        private String scheduledId;

        @com.aliyun.core.annotation.NameInMap("TaskStartTime")
        private String taskStartTime;

        @com.aliyun.core.annotation.NameInMap("TimeRange")
        private String timeRange;

        private Schedules(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.frequency = builder.frequency;
            this.instanceCount = builder.instanceCount;
            this.name = builder.name;
            this.scheduledId = builder.scheduledId;
            this.taskStartTime = builder.taskStartTime;
            this.timeRange = builder.timeRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schedules create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return frequency
         */
        public String getFrequency() {
            return this.frequency;
        }

        /**
         * @return instanceCount
         */
        public Long getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scheduledId
         */
        public String getScheduledId() {
            return this.scheduledId;
        }

        /**
         * @return taskStartTime
         */
        public String getTaskStartTime() {
            return this.taskStartTime;
        }

        /**
         * @return timeRange
         */
        public String getTimeRange() {
            return this.timeRange;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String frequency; 
            private Long instanceCount; 
            private String name; 
            private String scheduledId; 
            private String taskStartTime; 
            private String timeRange; 

            private Builder() {
            } 

            private Builder(Schedules model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.frequency = model.frequency;
                this.instanceCount = model.instanceCount;
                this.name = model.name;
                this.scheduledId = model.scheduledId;
                this.taskStartTime = model.taskStartTime;
                this.timeRange = model.timeRange;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Frequency.
             */
            public Builder frequency(String frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * InstanceCount.
             */
            public Builder instanceCount(Long instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ScheduledId.
             */
            public Builder scheduledId(String scheduledId) {
                this.scheduledId = scheduledId;
                return this;
            }

            /**
             * TaskStartTime.
             */
            public Builder taskStartTime(String taskStartTime) {
                this.taskStartTime = taskStartTime;
                return this;
            }

            /**
             * TimeRange.
             */
            public Builder timeRange(String timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            public Schedules build() {
                return new Schedules(this);
            } 

        } 

    }
}
