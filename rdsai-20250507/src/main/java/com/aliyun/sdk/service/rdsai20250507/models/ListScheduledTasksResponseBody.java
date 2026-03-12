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
         * <p>The response message.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of scheduled inspection tasks.</p>
         */
        public Builder schedules(java.util.List<Schedules> schedules) {
            this.schedules = schedules;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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

        @com.aliyun.core.annotation.NameInMap("ReportLanguage")
        private String reportLanguage;

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
            this.reportLanguage = builder.reportLanguage;
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
         * @return reportLanguage
         */
        public String getReportLanguage() {
            return this.reportLanguage;
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
            private String reportLanguage; 
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
                this.reportLanguage = model.reportLanguage;
                this.scheduledId = model.scheduledId;
                this.taskStartTime = model.taskStartTime;
                this.timeRange = model.timeRange;
            } 

            /**
             * <p>The creation time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-04T06:51:24Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the inspection task.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The new inspection frequency. Separate multiple values with commas (,). Default value: DAILY. Valid values:</p>
             * <ul>
             * <li>DAILY</li>
             * <li>Monday</li>
             * <li>Tuesday</li>
             * <li>Wednesday</li>
             * <li>Thursday</li>
             * <li>Friday</li>
             * <li>Saturday</li>
             * <li>Sunday</li>
             * </ul>
             * <h3><a href="#daily--dailymonday--daily-"></a>Note: DAILY takes precedence over other values. For example, if you set this parameter to DAILY,Monday, the backend will use DAILY as the inspection frequency.</h3>
             * 
             * <strong>example:</strong>
             * <p>Monday</p>
             */
            public Builder frequency(String frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * <p>The number of instances covered by the task.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceCount(Long instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ReportLanguage.
             */
            public Builder reportLanguage(String reportLanguage) {
                this.reportLanguage = reportLanguage;
                return this;
            }

            /**
             * <p>The ID of the scheduled inspection configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>9d246af2-a0cd-4f69-857d-3785048f****</p>
             */
            public Builder scheduledId(String scheduledId) {
                this.scheduledId = scheduledId;
                return this;
            }

            /**
             * <p>The actual start time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>18:00:00Z</p>
             */
            public Builder taskStartTime(String taskStartTime) {
                this.taskStartTime = taskStartTime;
                return this;
            }

            /**
             * <p>The inspection time range. The default value is the latest 24 hours. Valid values: 1 to 168. The maximum value is 7 days.</p>
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
