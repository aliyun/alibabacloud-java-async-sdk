// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkakopilot20260414.models;

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
 * {@link KopilotListConversationChatMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>KopilotListConversationChatMessagesResponseBody</p>
 */
public class KopilotListConversationChatMessagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private KopilotListConversationChatMessagesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KopilotListConversationChatMessagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(KopilotListConversationChatMessagesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned when the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F69385B9-2139-5A07-AE64-37C4B6ED308E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public KopilotListConversationChatMessagesResponseBody build() {
            return new KopilotListConversationChatMessagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link KopilotListConversationChatMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationChatMessagesResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Feedback")
        private String feedback;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("TurnId")
        private String turnId;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.feedback = builder.feedback;
            this.role = builder.role;
            this.turnId = builder.turnId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return feedback
         */
        public String getFeedback() {
            return this.feedback;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return turnId
         */
        public String getTurnId() {
            return this.turnId;
        }

        public static final class Builder {
            private String content; 
            private String createTime; 
            private String feedback; 
            private String role; 
            private String turnId; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.createTime = model.createTime;
                this.feedback = model.feedback;
                this.role = model.role;
                this.turnId = model.turnId;
            } 

            /**
             * <p>The actual content of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the message was created, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>17575885545677</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The user satisfaction level.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder feedback(String feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * <p>The role identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>assistant</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The primary key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2345</p>
             */
            public Builder turnId(String turnId) {
                this.turnId = turnId;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationChatMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationChatMessagesResponseBody</p>
     */
    public static class ActiveRun extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("RunId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ActiveRun(Builder builder) {
            this.finishedAt = builder.finishedAt;
            this.runId = builder.runId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActiveRun create() {
            return builder().build();
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String finishedAt; 
            private String runId; 
            private String status; 

            private Builder() {
            } 

            private Builder(ActiveRun model) {
                this.finishedAt = model.finishedAt;
                this.runId = model.runId;
                this.status = model.status;
            } 

            /**
             * <p>The time when the run ended, in UTC ISO 8601 format. This value is typically empty for queued or running tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-17T12:01:00Z</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The unique identifier of a single run.</p>
             * 
             * <strong>example:</strong>
             * <p>run_0123456789abcdef0123456789abcdef</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The status of a single run. A value of QUEUED indicates that the run is queued. A value of RUNNING indicates that the run is in progress.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ActiveRun build() {
                return new ActiveRun(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationChatMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationChatMessagesResponseBody</p>
     */
    public static class LastCompletedRun extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("RunId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private LastCompletedRun(Builder builder) {
            this.finishedAt = builder.finishedAt;
            this.runId = builder.runId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastCompletedRun create() {
            return builder().build();
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String finishedAt; 
            private String runId; 
            private String status; 

            private Builder() {
            } 

            private Builder(LastCompletedRun model) {
                this.finishedAt = model.finishedAt;
                this.runId = model.runId;
                this.status = model.status;
            } 

            /**
             * <p>The time when the run ended, in UTC ISO 8601 format. This value is empty if the run has not ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-17T12:01:00Z</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The unique identifier of a single run.</p>
             * 
             * <strong>example:</strong>
             * <p>run_0123456789abcdef0123456789abcdef</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The status of the most recent completed run. For example, SUCCEEDED indicates success and FAILED indicates failure.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCEEDED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public LastCompletedRun build() {
                return new LastCompletedRun(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationChatMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationChatMessagesResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveRun")
        private ActiveRun activeRun;

        @com.aliyun.core.annotation.NameInMap("LastCompletedRun")
        private LastCompletedRun lastCompletedRun;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NextRunAt")
        private String nextRunAt;

        @com.aliyun.core.annotation.NameInMap("ScheduleDescription")
        private String scheduleDescription;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Tasks(Builder builder) {
            this.activeRun = builder.activeRun;
            this.lastCompletedRun = builder.lastCompletedRun;
            this.name = builder.name;
            this.nextRunAt = builder.nextRunAt;
            this.scheduleDescription = builder.scheduleDescription;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return activeRun
         */
        public ActiveRun getActiveRun() {
            return this.activeRun;
        }

        /**
         * @return lastCompletedRun
         */
        public LastCompletedRun getLastCompletedRun() {
            return this.lastCompletedRun;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nextRunAt
         */
        public String getNextRunAt() {
            return this.nextRunAt;
        }

        /**
         * @return scheduleDescription
         */
        public String getScheduleDescription() {
            return this.scheduleDescription;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private ActiveRun activeRun; 
            private LastCompletedRun lastCompletedRun; 
            private String name; 
            private String nextRunAt; 
            private String scheduleDescription; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.activeRun = model.activeRun;
                this.lastCompletedRun = model.lastCompletedRun;
                this.name = model.name;
                this.nextRunAt = model.nextRunAt;
                this.scheduleDescription = model.scheduleDescription;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The run record that is currently queued or running. This value is empty if there is no active run.</p>
             */
            public Builder activeRun(ActiveRun activeRun) {
                this.activeRun = activeRun;
                return this;
            }

            /**
             * <p>The most recent completed run record, including failed runs. This value is empty if no record exists.</p>
             */
            public Builder lastCompletedRun(LastCompletedRun lastCompletedRun) {
                this.lastCompletedRun = lastCompletedRun;
                return this;
            }

            /**
             * <p>The name of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>Kafka Resource Inspection</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The next scheduled execution time, in UTC ISO 8601 format. This value is empty if no next execution is scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-17T12:15:00Z</p>
             */
            public Builder nextRunAt(String nextRunAt) {
                this.nextRunAt = nextRunAt;
                return this;
            }

            /**
             * <p>The human-readable description of the execution schedule.</p>
             * 
             * <strong>example:</strong>
             * <p>Every 900 seconds</p>
             */
            public Builder scheduleDescription(String scheduleDescription) {
                this.scheduleDescription = scheduleDescription;
                return this;
            }

            /**
             * <p>The status of the scheduled task. Valid values:</p>
             * <ul>
             * <li>DRAFT: The task is a draft.</li>
             * <li>ENABLED: The task is enabled.</li>
             * <li>PAUSED: The task is paused.</li>
             * <li>NEEDS_AUTH: The task is pending authorization.</li>
             * <li>COMPLETED: The task is completed.</li>
             * </ul>
             * <p>This status is independent of the run status.</p>
             * 
             * <strong>example:</strong>
             * <p>ENABLED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The unique identifier of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>task_0123456789abcdef0123456789abcdef</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationChatMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationChatMessagesResponseBody</p>
     */
    public static class ScheduledTaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsOf")
        private String asOf;

        @com.aliyun.core.annotation.NameInMap("EnabledCount")
        private Long enabledCount;

        @com.aliyun.core.annotation.NameInMap("HasMoreTasks")
        private Boolean hasMoreTasks;

        @com.aliyun.core.annotation.NameInMap("HasScheduledTask")
        private Boolean hasScheduledTask;

        @com.aliyun.core.annotation.NameInMap("NextTaskCursor")
        private String nextTaskCursor;

        @com.aliyun.core.annotation.NameInMap("TaskCount")
        private Long taskCount;

        @com.aliyun.core.annotation.NameInMap("Tasks")
        private java.util.List<Tasks> tasks;

        private ScheduledTaskInfo(Builder builder) {
            this.asOf = builder.asOf;
            this.enabledCount = builder.enabledCount;
            this.hasMoreTasks = builder.hasMoreTasks;
            this.hasScheduledTask = builder.hasScheduledTask;
            this.nextTaskCursor = builder.nextTaskCursor;
            this.taskCount = builder.taskCount;
            this.tasks = builder.tasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduledTaskInfo create() {
            return builder().build();
        }

        /**
         * @return asOf
         */
        public String getAsOf() {
            return this.asOf;
        }

        /**
         * @return enabledCount
         */
        public Long getEnabledCount() {
            return this.enabledCount;
        }

        /**
         * @return hasMoreTasks
         */
        public Boolean getHasMoreTasks() {
            return this.hasMoreTasks;
        }

        /**
         * @return hasScheduledTask
         */
        public Boolean getHasScheduledTask() {
            return this.hasScheduledTask;
        }

        /**
         * @return nextTaskCursor
         */
        public String getNextTaskCursor() {
            return this.nextTaskCursor;
        }

        /**
         * @return taskCount
         */
        public Long getTaskCount() {
            return this.taskCount;
        }

        /**
         * @return tasks
         */
        public java.util.List<Tasks> getTasks() {
            return this.tasks;
        }

        public static final class Builder {
            private String asOf; 
            private Long enabledCount; 
            private Boolean hasMoreTasks; 
            private Boolean hasScheduledTask; 
            private String nextTaskCursor; 
            private Long taskCount; 
            private java.util.List<Tasks> tasks; 

            private Builder() {
            } 

            private Builder(ScheduledTaskInfo model) {
                this.asOf = model.asOf;
                this.enabledCount = model.enabledCount;
                this.hasMoreTasks = model.hasMoreTasks;
                this.hasScheduledTask = model.hasScheduledTask;
                this.nextTaskCursor = model.nextTaskCursor;
                this.taskCount = model.taskCount;
                this.tasks = model.tasks;
            } 

            /**
             * <p>The time when the overview was generated, in UTC ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-17T12:00:00Z</p>
             */
            public Builder asOf(String asOf) {
                this.asOf = asOf;
                return this;
            }

            /**
             * <p>The number of associated tasks in the ENABLED state.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enabledCount(Long enabledCount) {
                this.enabledCount = enabledCount;
                return this;
            }

            /**
             * <p>Indicates whether there is a next page of associated tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasMoreTasks(Boolean hasMoreTasks) {
                this.hasMoreTasks = hasMoreTasks;
                return this;
            }

            /**
             * <p>Indicates whether the current session has associated scheduled tasks in the enabled, paused, or pending authorization state.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasScheduledTask(Boolean hasScheduledTask) {
                this.hasScheduledTask = hasScheduledTask;
                return this;
            }

            /**
             * <p>The cursor for the next page. This value is empty if there is no next page.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder nextTaskCursor(String nextTaskCursor) {
                this.nextTaskCursor = nextTaskCursor;
                return this;
            }

            /**
             * <p>The total number of associated tasks. Only tasks in the ENABLED, PAUSED, or NEEDS_AUTH state are counted.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskCount(Long taskCount) {
                this.taskCount = taskCount;
                return this;
            }

            /**
             * <p>The list of associated tasks on the current page.</p>
             */
            public Builder tasks(java.util.List<Tasks> tasks) {
                this.tasks = tasks;
                return this;
            }

            public ScheduledTaskInfo build() {
                return new ScheduledTaskInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationChatMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationChatMessagesResponseBody</p>
     */
    public static class ScheduledTaskQuota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Limit")
        private Integer limit;

        @com.aliyun.core.annotation.NameInMap("Remaining")
        private Long remaining;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private ScheduledTaskQuota(Builder builder) {
            this.limit = builder.limit;
            this.remaining = builder.remaining;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduledTaskQuota create() {
            return builder().build();
        }

        /**
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
        }

        /**
         * @return remaining
         */
        public Long getRemaining() {
            return this.remaining;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Integer limit; 
            private Long remaining; 
            private Long used; 

            private Builder() {
            } 

            private Builder(ScheduledTaskQuota model) {
                this.limit = model.limit;
                this.remaining = model.remaining;
                this.used = model.used;
            } 

            /**
             * <p>The maximum number of tasks or channels allowed, subject to the actual configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            /**
             * <p>The remaining quota, calculated as the limit minus the used quota. The minimum value is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder remaining(Long remaining) {
                this.remaining = remaining;
                return this;
            }

            /**
             * <p>The used task quota. Tasks in the DRAFT, ENABLED, PAUSED, or NEEDS_AUTH state are counted. Completed or deleted tasks do not consume the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public ScheduledTaskQuota build() {
                return new ScheduledTaskQuota(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationChatMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationChatMessagesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("Messages")
        private java.util.List<Messages> messages;

        @com.aliyun.core.annotation.NameInMap("NextBeforeTurnId")
        private Long nextBeforeTurnId;

        @com.aliyun.core.annotation.NameInMap("ScheduledTaskInfo")
        private ScheduledTaskInfo scheduledTaskInfo;

        @com.aliyun.core.annotation.NameInMap("ScheduledTaskQuota")
        private ScheduledTaskQuota scheduledTaskQuota;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("TotalTurns")
        private Long totalTurns;

        private Data(Builder builder) {
            this.hasMore = builder.hasMore;
            this.messages = builder.messages;
            this.nextBeforeTurnId = builder.nextBeforeTurnId;
            this.scheduledTaskInfo = builder.scheduledTaskInfo;
            this.scheduledTaskQuota = builder.scheduledTaskQuota;
            this.sessionId = builder.sessionId;
            this.totalTurns = builder.totalTurns;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return messages
         */
        public java.util.List<Messages> getMessages() {
            return this.messages;
        }

        /**
         * @return nextBeforeTurnId
         */
        public Long getNextBeforeTurnId() {
            return this.nextBeforeTurnId;
        }

        /**
         * @return scheduledTaskInfo
         */
        public ScheduledTaskInfo getScheduledTaskInfo() {
            return this.scheduledTaskInfo;
        }

        /**
         * @return scheduledTaskQuota
         */
        public ScheduledTaskQuota getScheduledTaskQuota() {
            return this.scheduledTaskQuota;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return totalTurns
         */
        public Long getTotalTurns() {
            return this.totalTurns;
        }

        public static final class Builder {
            private Boolean hasMore; 
            private java.util.List<Messages> messages; 
            private Long nextBeforeTurnId; 
            private ScheduledTaskInfo scheduledTaskInfo; 
            private ScheduledTaskQuota scheduledTaskQuota; 
            private String sessionId; 
            private Long totalTurns; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.hasMore = model.hasMore;
                this.messages = model.messages;
                this.nextBeforeTurnId = model.nextBeforeTurnId;
                this.scheduledTaskInfo = model.scheduledTaskInfo;
                this.scheduledTaskQuota = model.scheduledTaskQuota;
                this.sessionId = model.sessionId;
                this.totalTurns = model.totalTurns;
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
             * <p>The list of messages.</p>
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * <p>The cursor for the next page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nextBeforeTurnId(Long nextBeforeTurnId) {
                this.nextBeforeTurnId = nextBeforeTurnId;
                return this;
            }

            /**
             * <p>The details of scheduled tasks associated with the current session. Only tasks in the enabled, paused, or pending authorization state are counted.</p>
             */
            public Builder scheduledTaskInfo(ScheduledTaskInfo scheduledTaskInfo) {
                this.scheduledTaskInfo = scheduledTaskInfo;
                return this;
            }

            /**
             * <p>The scheduled task quota for the current Alibaba Cloud account in this environment, counted across regions.</p>
             */
            public Builder scheduledTaskQuota(ScheduledTaskQuota scheduledTaskQuota) {
                this.scheduledTaskQuota = scheduledTaskQuota;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>87ce9505-7dec-4fd7-bc7c-e66d949bfdc9</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The total number of turn IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalTurns(Long totalTurns) {
                this.totalTurns = totalTurns;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
