// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetScheduledTaskExecutionRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>GetScheduledTaskExecutionRecordsResponseBody</p>
 */
public class GetScheduledTaskExecutionRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("tasks")
    private java.util.List<Tasks> tasks;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private GetScheduledTaskExecutionRecordsResponseBody(Builder builder) {
        this.code = builder.code;
        this.hasMore = builder.hasMore;
        this.message = builder.message;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduledTaskExecutionRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
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
     * @return tasks
     */
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Boolean hasMore; 
        private String message; 
        private Integer page; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<Tasks> tasks; 
        private Long total; 

        private Builder() {
        } 

        private Builder(GetScheduledTaskExecutionRecordsResponseBody model) {
            this.code = model.code;
            this.hasMore = model.hasMore;
            this.message = model.message;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.tasks = model.tasks;
            this.total = model.total;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>The current zone list is illegal.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The number of tasks per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task list.</p>
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public GetScheduledTaskExecutionRecordsResponseBody build() {
            return new GetScheduledTaskExecutionRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScheduledTaskExecutionRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduledTaskExecutionRecordsResponseBody</p>
     */
    public static class Timeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actualTime")
        private String actualTime;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("executionId")
        private String executionId;

        @com.aliyun.core.annotation.NameInMap("isExpired")
        private Boolean isExpired;

        @com.aliyun.core.annotation.NameInMap("outputContent")
        private String outputContent;

        @com.aliyun.core.annotation.NameInMap("scheduledTime")
        private String scheduledTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Timeline(Builder builder) {
            this.actualTime = builder.actualTime;
            this.displayName = builder.displayName;
            this.errorMessage = builder.errorMessage;
            this.executionId = builder.executionId;
            this.isExpired = builder.isExpired;
            this.outputContent = builder.outputContent;
            this.scheduledTime = builder.scheduledTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Timeline create() {
            return builder().build();
        }

        /**
         * @return actualTime
         */
        public String getActualTime() {
            return this.actualTime;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return executionId
         */
        public String getExecutionId() {
            return this.executionId;
        }

        /**
         * @return isExpired
         */
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        /**
         * @return outputContent
         */
        public String getOutputContent() {
            return this.outputContent;
        }

        /**
         * @return scheduledTime
         */
        public String getScheduledTime() {
            return this.scheduledTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String actualTime; 
            private String displayName; 
            private String errorMessage; 
            private String executionId; 
            private Boolean isExpired; 
            private String outputContent; 
            private String scheduledTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(Timeline model) {
                this.actualTime = model.actualTime;
                this.displayName = model.displayName;
                this.errorMessage = model.errorMessage;
                this.executionId = model.executionId;
                this.isExpired = model.isExpired;
                this.outputContent = model.outputContent;
                this.scheduledTime = model.scheduledTime;
                this.status = model.status;
            } 

            /**
             * <p>The actual hours spent, in hours.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-01T12:00:00Z</p>
             */
            public Builder actualTime(String actualTime) {
                this.actualTime = actualTime;
                return this;
            }

            /**
             * <p>The name of the schedule location.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The execution record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleExecutionId</p>
             */
            public Builder executionId(String executionId) {
                this.executionId = executionId;
                return this;
            }

            /**
             * <p>Indicates whether the execution record has been archived due to expiration.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isExpired(Boolean isExpired) {
                this.isExpired = isExpired;
                return this;
            }

            /**
             * <p>The execution output content (historical records only).</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder outputContent(String outputContent) {
                this.outputContent = outputContent;
                return this;
            }

            /**
             * <p>The timed scheduling time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-01T12:00:00Z</p>
             */
            public Builder scheduledTime(String scheduledTime) {
                this.scheduledTime = scheduledTime;
                return this;
            }

            /**
             * <p>The final status of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Timeline build() {
                return new Timeline(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScheduledTaskExecutionRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduledTaskExecutionRecordsResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
        private String collaborationGroupId;

        @com.aliyun.core.annotation.NameInMap("cronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("isOpen")
        private Boolean isOpen;

        @com.aliyun.core.annotation.NameInMap("model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("timeline")
        private java.util.List<Timeline> timeline;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("triggerType")
        private String triggerType;

        private Tasks(Builder builder) {
            this.collaborationGroupId = builder.collaborationGroupId;
            this.cronExpression = builder.cronExpression;
            this.description = builder.description;
            this.isOpen = builder.isOpen;
            this.model = builder.model;
            this.name = builder.name;
            this.taskId = builder.taskId;
            this.timeline = builder.timeline;
            this.timezone = builder.timezone;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return collaborationGroupId
         */
        public String getCollaborationGroupId() {
            return this.collaborationGroupId;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return isOpen
         */
        public Boolean getIsOpen() {
            return this.isOpen;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return timeline
         */
        public java.util.List<Timeline> getTimeline() {
            return this.timeline;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private String collaborationGroupId; 
            private String cronExpression; 
            private String description; 
            private Boolean isOpen; 
            private String model; 
            private String name; 
            private String taskId; 
            private java.util.List<Timeline> timeline; 
            private String timezone; 
            private String triggerType; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.collaborationGroupId = model.collaborationGroupId;
                this.cronExpression = model.cronExpression;
                this.description = model.description;
                this.isOpen = model.isOpen;
                this.model = model.model;
                this.name = model.name;
                this.taskId = model.taskId;
                this.timeline = model.timeline;
                this.timezone = model.timezone;
                this.triggerType = model.triggerType;
            } 

            /**
             * <p>The ID of the collaboration group to which the task belongs. An empty value indicates a personal task.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleCollaborationGroupId</p>
             */
            public Builder collaborationGroupId(String collaborationGroupId) {
                this.collaborationGroupId = collaborationGroupId;
                return this;
            }

            /**
             * <p>The cron expression.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>The description of the to-do card type.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether public access is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isOpen(Boolean isOpen) {
                this.isOpen = isOpen;
                return this;
            }

            /**
             * <p>The execution model tier. Valid values:</p>
             * <ul>
             * <li>flagship: Flagship.</li>
             * <li>standard: Standard.</li>
             * <li>quick: Lightweight.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>SampleName.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleTaskId</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The timeline.</p>
             */
            public Builder timeline(java.util.List<Timeline> timeline) {
                this.timeline = timeline;
                return this;
            }

            /**
             * <p>The time zone.</p>
             * <blockquote>
             * <p>Default value: UTC+8.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The trigger type. Valid values:</p>
             * <ul>
             * <li>Manual: Manual execution.</li>
             * <li>Cron: Timed scheduling.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
