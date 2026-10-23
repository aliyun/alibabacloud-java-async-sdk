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
 * {@link GetTodoResponseBody} extends {@link TeaModel}
 *
 * <p>GetTodoResponseBody</p>
 */
public class GetTodoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("todo")
    private java.util.Map<String, ?> todo;

    @com.aliyun.core.annotation.NameInMap("todos")
    private java.util.List<Todos> todos;

    private GetTodoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.todo = builder.todo;
        this.todos = builder.todos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTodoResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return todo
     */
    public java.util.Map<String, ?> getTodo() {
        return this.todo;
    }

    /**
     * @return todos
     */
    public java.util.List<Todos> getTodos() {
        return this.todos;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.Map<String, ?> todo; 
        private java.util.List<Todos> todos; 

        private Builder() {
        } 

        private Builder(GetTodoResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.todo = model.todo;
            this.todos = model.todos;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The single result returned when you query by todoId. This field is empty for other query types. The field set is the same as the flattened structure of getTodoDetail.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample to-do key-value pair</p>
         */
        public Builder todo(java.util.Map<String, ?> todo) {
            this.todo = todo;
            return this;
        }

        /**
         * <p>The multiple results returned when you query by workItemId or messageId. This field is empty for todoId queries.</p>
         */
        public Builder todos(java.util.List<Todos> todos) {
            this.todos = todos;
            return this;
        }

        public GetTodoResponseBody build() {
            return new GetTodoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTodoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTodoResponseBody</p>
     */
    public static class Assignees extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actedAt")
        private String actedAt;

        @com.aliyun.core.annotation.NameInMap("assigneeSource")
        private String assigneeSource;

        @com.aliyun.core.annotation.NameInMap("assigneeUserId")
        private String assigneeUserId;

        @com.aliyun.core.annotation.NameInMap("readAt")
        private String readAt;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("transferredFromUserId")
        private String transferredFromUserId;

        private Assignees(Builder builder) {
            this.actedAt = builder.actedAt;
            this.assigneeSource = builder.assigneeSource;
            this.assigneeUserId = builder.assigneeUserId;
            this.readAt = builder.readAt;
            this.status = builder.status;
            this.transferredFromUserId = builder.transferredFromUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assignees create() {
            return builder().build();
        }

        /**
         * @return actedAt
         */
        public String getActedAt() {
            return this.actedAt;
        }

        /**
         * @return assigneeSource
         */
        public String getAssigneeSource() {
            return this.assigneeSource;
        }

        /**
         * @return assigneeUserId
         */
        public String getAssigneeUserId() {
            return this.assigneeUserId;
        }

        /**
         * @return readAt
         */
        public String getReadAt() {
            return this.readAt;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return transferredFromUserId
         */
        public String getTransferredFromUserId() {
            return this.transferredFromUserId;
        }

        public static final class Builder {
            private String actedAt; 
            private String assigneeSource; 
            private String assigneeUserId; 
            private String readAt; 
            private String status; 
            private String transferredFromUserId; 

            private Builder() {
            } 

            private Builder(Assignees model) {
                this.actedAt = model.actedAt;
                this.assigneeSource = model.assigneeSource;
                this.assigneeUserId = model.assigneeUserId;
                this.readAt = model.readAt;
                this.status = model.status;
                this.transferredFromUserId = model.transferredFromUserId;
            } 

            /**
             * <p>The processing time in UTC+8. This field is empty if the item is unprocessed.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-16T10:30:00+08:00</p>
             */
            public Builder actedAt(String actedAt) {
                this.actedAt = actedAt;
                return this;
            }

            /**
             * <p>The source of the assignee. Valid values: ORIGINAL and TRANSFERRED.</p>
             * 
             * <strong>example:</strong>
             * <p>ORIGINAL</p>
             */
            public Builder assigneeSource(String assigneeSource) {
                this.assigneeSource = assigneeSource;
                return this;
            }

            /**
             * <p>The user ID of the assignee.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder assigneeUserId(String assigneeUserId) {
                this.assigneeUserId = assigneeUserId;
                return this;
            }

            /**
             * <p>The read time in UTC+8. This field is empty if the item is unread.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-12 10:01:00</p>
             */
            public Builder readAt(String readAt) {
                this.readAt = readAt;
                return this;
            }

            /**
             * <p>The action status of the assignee.</p>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The user ID of the person who transferred the task. This field is populated only when the task is transferred.</p>
             * 
             * <strong>example:</strong>
             * <p>43</p>
             */
            public Builder transferredFromUserId(String transferredFromUserId) {
                this.transferredFromUserId = transferredFromUserId;
                return this;
            }

            public Assignees build() {
                return new Assignees(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTodoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTodoResponseBody</p>
     */
    public static class Todos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assignees")
        private java.util.List<Assignees> assignees;

        @com.aliyun.core.annotation.NameInMap("completedAt")
        private String completedAt;

        @com.aliyun.core.annotation.NameInMap("completedByUserId")
        private String completedByUserId;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("messageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("questions")
        private java.util.Map<String, ?> questions;

        @com.aliyun.core.annotation.NameInMap("resultPayload")
        private java.util.Map<String, ?> resultPayload;

        @com.aliyun.core.annotation.NameInMap("sourceContext")
        private java.util.Map<String, ?> sourceContext;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("todoId")
        private String todoId;

        private Todos(Builder builder) {
            this.assignees = builder.assignees;
            this.completedAt = builder.completedAt;
            this.completedByUserId = builder.completedByUserId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.messageId = builder.messageId;
            this.priority = builder.priority;
            this.questions = builder.questions;
            this.resultPayload = builder.resultPayload;
            this.sourceContext = builder.sourceContext;
            this.status = builder.status;
            this.summary = builder.summary;
            this.title = builder.title;
            this.todoId = builder.todoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Todos create() {
            return builder().build();
        }

        /**
         * @return assignees
         */
        public java.util.List<Assignees> getAssignees() {
            return this.assignees;
        }

        /**
         * @return completedAt
         */
        public String getCompletedAt() {
            return this.completedAt;
        }

        /**
         * @return completedByUserId
         */
        public String getCompletedByUserId() {
            return this.completedByUserId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return questions
         */
        public java.util.Map<String, ?> getQuestions() {
            return this.questions;
        }

        /**
         * @return resultPayload
         */
        public java.util.Map<String, ?> getResultPayload() {
            return this.resultPayload;
        }

        /**
         * @return sourceContext
         */
        public java.util.Map<String, ?> getSourceContext() {
            return this.sourceContext;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return todoId
         */
        public String getTodoId() {
            return this.todoId;
        }

        public static final class Builder {
            private java.util.List<Assignees> assignees; 
            private String completedAt; 
            private String completedByUserId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String messageId; 
            private String priority; 
            private java.util.Map<String, ?> questions; 
            private java.util.Map<String, ?> resultPayload; 
            private java.util.Map<String, ?> sourceContext; 
            private String status; 
            private String summary; 
            private String title; 
            private String todoId; 

            private Builder() {
            } 

            private Builder(Todos model) {
                this.assignees = model.assignees;
                this.completedAt = model.completedAt;
                this.completedByUserId = model.completedByUserId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.messageId = model.messageId;
                this.priority = model.priority;
                this.questions = model.questions;
                this.resultPayload = model.resultPayload;
                this.sourceContext = model.sourceContext;
                this.status = model.status;
                this.summary = model.summary;
                this.title = model.title;
                this.todoId = model.todoId;
            } 

            /**
             * <p>The assignees.</p>
             */
            public Builder assignees(java.util.List<Assignees> assignees) {
                this.assignees = assignees;
                return this;
            }

            /**
             * <p>The completion time in UTC+8.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-12 10:00:00</p>
             */
            public Builder completedAt(String completedAt) {
                this.completedAt = completedAt;
                return this;
            }

            /**
             * <p>The user ID of the person who completed the to-do item.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder completedByUserId(String completedByUserId) {
                this.completedByUserId = completedByUserId;
                return this;
            }

            /**
             * <p>The creation time in UTC+8.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-12 10:00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modification time in UTC+8.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-12 10:00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the assistant message. This field is empty if there is no conversation source.</p>
             * 
             * <strong>example:</strong>
             * <p>msg-1</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>MEDIUM</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The list of questions in the original JSONB format.</p>
             * 
             * <strong>example:</strong>
             * <p>q1=Sample question</p>
             */
            public Builder questions(java.util.Map<String, ?> questions) {
                this.questions = questions;
                return this;
            }

            /**
             * <p>The response content in the original JSONB format.</p>
             * 
             * <strong>example:</strong>
             * <p>result=Approved</p>
             */
            public Builder resultPayload(java.util.Map<String, ?> resultPayload) {
                this.resultPayload = resultPayload;
                return this;
            }

            /**
             * <p>The source context passed through in its original format.</p>
             * 
             * <strong>example:</strong>
             * <p>source=openapi</p>
             */
            public Builder sourceContext(java.util.Map<String, ?> sourceContext) {
                this.sourceContext = sourceContext;
                return this;
            }

            /**
             * <p>The primary status of the to-do item.</p>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The summary of the to-do item.</p>
             * 
             * <strong>example:</strong>
             * <p>To-do item summary</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The title of the to-do item.</p>
             * 
             * <strong>example:</strong>
             * <p>Governance approval</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The ID of the to-do item.</p>
             * 
             * <strong>example:</strong>
             * <p>todo_abc123</p>
             */
            public Builder todoId(String todoId) {
                this.todoId = todoId;
                return this;
            }

            public Todos build() {
                return new Todos(this);
            } 

        } 

    }
}
