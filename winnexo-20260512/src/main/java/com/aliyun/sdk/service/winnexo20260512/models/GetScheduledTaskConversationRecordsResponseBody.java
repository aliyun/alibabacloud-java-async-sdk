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
 * {@link GetScheduledTaskConversationRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>GetScheduledTaskConversationRecordsResponseBody</p>
 */
public class GetScheduledTaskConversationRecordsResponseBody extends TeaModel {
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

    private GetScheduledTaskConversationRecordsResponseBody(Builder builder) {
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

    public static GetScheduledTaskConversationRecordsResponseBody create() {
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

        private Builder(GetScheduledTaskConversationRecordsResponseBody model) {
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
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether a next page exists.</p>
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
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number. Default value: 1. Minimum value: 1. Maximum value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The collaboration group ID, such as cg_101. If you specify this parameter, the data is returned by group dimension, and the caller must be a valid group member. If you do not specify this parameter, the data is returned by personal dimension, excluding group tasks.</p>
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
         * <p>The list of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * <p>The total number of Logtail pipeline configurations in the current project.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public GetScheduledTaskConversationRecordsResponseBody build() {
            return new GetScheduledTaskConversationRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScheduledTaskConversationRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduledTaskConversationRecordsResponseBody</p>
     */
    public static class Conversations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conversationId")
        private String conversationId;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("hasUnread")
        private Boolean hasUnread;

        @com.aliyun.core.annotation.NameInMap("latestExecutionId")
        private String latestExecutionId;

        @com.aliyun.core.annotation.NameInMap("latestStatus")
        private String latestStatus;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        private Conversations(Builder builder) {
            this.conversationId = builder.conversationId;
            this.displayName = builder.displayName;
            this.hasUnread = builder.hasUnread;
            this.latestExecutionId = builder.latestExecutionId;
            this.latestStatus = builder.latestStatus;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conversations create() {
            return builder().build();
        }

        /**
         * @return conversationId
         */
        public String getConversationId() {
            return this.conversationId;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return hasUnread
         */
        public Boolean getHasUnread() {
            return this.hasUnread;
        }

        /**
         * @return latestExecutionId
         */
        public String getLatestExecutionId() {
            return this.latestExecutionId;
        }

        /**
         * @return latestStatus
         */
        public String getLatestStatus() {
            return this.latestStatus;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String conversationId; 
            private String displayName; 
            private Boolean hasUnread; 
            private String latestExecutionId; 
            private String latestStatus; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Conversations model) {
                this.conversationId = model.conversationId;
                this.displayName = model.displayName;
                this.hasUnread = model.hasUnread;
                this.latestExecutionId = model.latestExecutionId;
                this.latestStatus = model.latestStatus;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The actual group topic ID, which can be associated in queryWorkItemFeed. This ID cannot be used as a Workflow workItemId.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleConversationId</p>
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * <p>The name of the schedule location.</p>
             * 
             * <strong>example:</strong>
             * <p>Daily sales weekly report</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Indicates whether unread messages exist.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasUnread(Boolean hasUnread) {
                this.hasUnread = hasUnread;
                return this;
            }

            /**
             * <p>The ID of the latest execution record.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleExecutionId</p>
             */
            public Builder latestExecutionId(String latestExecutionId) {
                this.latestExecutionId = latestExecutionId;
                return this;
            }

            /**
             * <p>The latest execution status.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder latestStatus(String latestStatus) {
                this.latestStatus = latestStatus;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-16T09:30:00+08:00</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Conversations build() {
                return new Conversations(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScheduledTaskConversationRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduledTaskConversationRecordsResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
        private String collaborationGroupId;

        @com.aliyun.core.annotation.NameInMap("conversations")
        private java.util.List<Conversations> conversations;

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

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("triggerType")
        private String triggerType;

        private Tasks(Builder builder) {
            this.collaborationGroupId = builder.collaborationGroupId;
            this.conversations = builder.conversations;
            this.cronExpression = builder.cronExpression;
            this.description = builder.description;
            this.isOpen = builder.isOpen;
            this.model = builder.model;
            this.name = builder.name;
            this.taskId = builder.taskId;
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
         * @return conversations
         */
        public java.util.List<Conversations> getConversations() {
            return this.conversations;
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
            private java.util.List<Conversations> conversations; 
            private String cronExpression; 
            private String description; 
            private Boolean isOpen; 
            private String model; 
            private String name; 
            private String taskId; 
            private String timezone; 
            private String triggerType; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.collaborationGroupId = model.collaborationGroupId;
                this.conversations = model.conversations;
                this.cronExpression = model.cronExpression;
                this.description = model.description;
                this.isOpen = model.isOpen;
                this.model = model.model;
                this.name = model.name;
                this.taskId = model.taskId;
                this.timezone = model.timezone;
                this.triggerType = model.triggerType;
            } 

            /**
             * <p>Pre-filters by a single task. If you do not specify this parameter, the execution records of all visible tasks are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleCollaborationGroupId</p>
             */
            public Builder collaborationGroupId(String collaborationGroupId) {
                this.collaborationGroupId = collaborationGroupId;
                return this;
            }

            /**
             * <p>The list of sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder conversations(java.util.List<Conversations> conversations) {
                this.conversations = conversations;
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
             * <p>The execution model tier. Valid values: flagship (Flagship), standard (Standard), and quick (Lightweight).</p>
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
             * <li>Cron: Scheduled trigger.</li>
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
