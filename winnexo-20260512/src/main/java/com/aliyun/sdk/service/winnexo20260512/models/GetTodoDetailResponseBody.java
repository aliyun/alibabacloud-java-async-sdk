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
 * {@link GetTodoDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetTodoDetailResponseBody</p>
 */
public class GetTodoDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("assigneeCount")
    private Long assigneeCount;

    @com.aliyun.core.annotation.NameInMap("assignees")
    private java.util.List<Assignees> assignees;

    @com.aliyun.core.annotation.NameInMap("attachmentPolicy")
    private java.util.Map<String, ?> attachmentPolicy;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("completedAt")
    private String completedAt;

    @com.aliyun.core.annotation.NameInMap("completedByUserId")
    private String completedByUserId;

    @com.aliyun.core.annotation.NameInMap("completedByUserName")
    private String completedByUserName;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("isRead")
    private Boolean isRead;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("messageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("myAssigneeStatus")
    private String myAssigneeStatus;

    @com.aliyun.core.annotation.NameInMap("myDisplayState")
    private String myDisplayState;

    @com.aliyun.core.annotation.NameInMap("myPermissions")
    private java.util.Map<String, ?> myPermissions;

    @com.aliyun.core.annotation.NameInMap("priority")
    private String priority;

    @com.aliyun.core.annotation.NameInMap("questions")
    private java.util.List<Questions> questions;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultPayload")
    private java.util.Map<String, ?> resultPayload;

    @com.aliyun.core.annotation.NameInMap("sourceContext")
    private java.util.Map<String, ?> sourceContext;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("sourceWorkflowId")
    private String sourceWorkflowId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("summary")
    private String summary;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("todoId")
    private String todoId;

    private GetTodoDetailResponseBody(Builder builder) {
        this.assigneeCount = builder.assigneeCount;
        this.assignees = builder.assignees;
        this.attachmentPolicy = builder.attachmentPolicy;
        this.code = builder.code;
        this.completedAt = builder.completedAt;
        this.completedByUserId = builder.completedByUserId;
        this.completedByUserName = builder.completedByUserName;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.isRead = builder.isRead;
        this.message = builder.message;
        this.messageId = builder.messageId;
        this.myAssigneeStatus = builder.myAssigneeStatus;
        this.myDisplayState = builder.myDisplayState;
        this.myPermissions = builder.myPermissions;
        this.priority = builder.priority;
        this.questions = builder.questions;
        this.requestId = builder.requestId;
        this.resultPayload = builder.resultPayload;
        this.sourceContext = builder.sourceContext;
        this.sourceType = builder.sourceType;
        this.sourceWorkflowId = builder.sourceWorkflowId;
        this.status = builder.status;
        this.summary = builder.summary;
        this.title = builder.title;
        this.todoId = builder.todoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTodoDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assigneeCount
     */
    public Long getAssigneeCount() {
        return this.assigneeCount;
    }

    /**
     * @return assignees
     */
    public java.util.List<Assignees> getAssignees() {
        return this.assignees;
    }

    /**
     * @return attachmentPolicy
     */
    public java.util.Map<String, ?> getAttachmentPolicy() {
        return this.attachmentPolicy;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return completedByUserName
     */
    public String getCompletedByUserName() {
        return this.completedByUserName;
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
     * @return isRead
     */
    public Boolean getIsRead() {
        return this.isRead;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return myAssigneeStatus
     */
    public String getMyAssigneeStatus() {
        return this.myAssigneeStatus;
    }

    /**
     * @return myDisplayState
     */
    public String getMyDisplayState() {
        return this.myDisplayState;
    }

    /**
     * @return myPermissions
     */
    public java.util.Map<String, ?> getMyPermissions() {
        return this.myPermissions;
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
    public java.util.List<Questions> getQuestions() {
        return this.questions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return sourceWorkflowId
     */
    public String getSourceWorkflowId() {
        return this.sourceWorkflowId;
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
        private Long assigneeCount; 
        private java.util.List<Assignees> assignees; 
        private java.util.Map<String, ?> attachmentPolicy; 
        private String code; 
        private String completedAt; 
        private String completedByUserId; 
        private String completedByUserName; 
        private String gmtCreate; 
        private String gmtModified; 
        private Boolean isRead; 
        private String message; 
        private String messageId; 
        private String myAssigneeStatus; 
        private String myDisplayState; 
        private java.util.Map<String, ?> myPermissions; 
        private String priority; 
        private java.util.List<Questions> questions; 
        private String requestId; 
        private java.util.Map<String, ?> resultPayload; 
        private java.util.Map<String, ?> sourceContext; 
        private String sourceType; 
        private String sourceWorkflowId; 
        private String status; 
        private String summary; 
        private String title; 
        private String todoId; 

        private Builder() {
        } 

        private Builder(GetTodoDetailResponseBody model) {
            this.assigneeCount = model.assigneeCount;
            this.assignees = model.assignees;
            this.attachmentPolicy = model.attachmentPolicy;
            this.code = model.code;
            this.completedAt = model.completedAt;
            this.completedByUserId = model.completedByUserId;
            this.completedByUserName = model.completedByUserName;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.isRead = model.isRead;
            this.message = model.message;
            this.messageId = model.messageId;
            this.myAssigneeStatus = model.myAssigneeStatus;
            this.myDisplayState = model.myDisplayState;
            this.myPermissions = model.myPermissions;
            this.priority = model.priority;
            this.questions = model.questions;
            this.requestId = model.requestId;
            this.resultPayload = model.resultPayload;
            this.sourceContext = model.sourceContext;
            this.sourceType = model.sourceType;
            this.sourceWorkflowId = model.sourceWorkflowId;
            this.status = model.status;
            this.summary = model.summary;
            this.title = model.title;
            this.todoId = model.todoId;
        } 

        /**
         * <p>处理人数量</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder assigneeCount(Long assigneeCount) {
            this.assigneeCount = assigneeCount;
            return this;
        }

        /**
         * <p>全部处理人</p>
         */
        public Builder assignees(java.util.List<Assignees> assignees) {
            this.assignees = assignees;
            return this;
        }

        /**
         * <p>附件策略（当前版本附件不落库）</p>
         * 
         * <strong>example:</strong>
         * <p>allowUpload=true</p>
         */
        public Builder attachmentPolicy(java.util.Map<String, ?> attachmentPolicy) {
            this.attachmentPolicy = attachmentPolicy;
            return this;
        }

        /**
         * <p>业务状态码；成功为200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>完成时间（北京时间 YYYY-MM-DD HH:mm:ss）</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12 10:00:00</p>
         */
        public Builder completedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        /**
         * <p>完成人用户ID；未完成为空</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        public Builder completedByUserId(String completedByUserId) {
            this.completedByUserId = completedByUserId;
            return this;
        }

        /**
         * <p>完成人姓名；未完成为空</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        public Builder completedByUserName(String completedByUserName) {
            this.completedByUserName = completedByUserName;
            return this;
        }

        /**
         * <p>创建时间（北京时间 YYYY-MM-DD HH:mm:ss）</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12 10:00:00</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>最后修改时间（北京时间 YYYY-MM-DD HH:mm:ss）</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12 10:00:00</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>调用者是否已读</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isRead(Boolean isRead) {
            this.isRead = isRead;
            return this;
        }

        /**
         * <p>错误描述</p>
         * 
         * <strong>example:</strong>
         * <p>请求的资源不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>发出该待办的 assistant 消息ID；无会话来源为空</p>
         * 
         * <strong>example:</strong>
         * <p>msg-1</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>调用者的处理人行状态</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        public Builder myAssigneeStatus(String myAssigneeStatus) {
            this.myAssigneeStatus = myAssigneeStatus;
            return this;
        }

        /**
         * <p>调用者的列表展示状态</p>
         * 
         * <strong>example:</strong>
         * <p>TODO</p>
         */
        public Builder myDisplayState(String myDisplayState) {
            this.myDisplayState = myDisplayState;
            return this;
        }

        /**
         * <p>调用者权限（canSubmit/canTransfer）</p>
         * 
         * <strong>example:</strong>
         * <p>APP/VIEW=true</p>
         */
        public Builder myPermissions(java.util.Map<String, ?> myPermissions) {
            this.myPermissions = myPermissions;
            return this;
        }

        /**
         * <p>优先级</p>
         * 
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        public Builder priority(String priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>问题清单（结构化投影）</p>
         */
        public Builder questions(java.util.List<Questions> questions) {
            this.questions = questions;
            return this;
        }

        /**
         * <p>请求追踪ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>作答内容（JSONB 原样；未提交为空对象缺省）</p>
         * 
         * <strong>example:</strong>
         * <p>result=同意</p>
         */
        public Builder resultPayload(java.util.Map<String, ?> resultPayload) {
            this.resultPayload = resultPayload;
            return this;
        }

        /**
         * <p>来源上下文（创建时原样透传）</p>
         * 
         * <strong>example:</strong>
         * <p>source=openapi</p>
         */
        public Builder sourceContext(java.util.Map<String, ?> sourceContext) {
            this.sourceContext = sourceContext;
            return this;
        }

        /**
         * <p>待办来源类型</p>
         * 
         * <strong>example:</strong>
         * <p>WORKFLOW</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>工作流ID（sourceType=WORKFLOW 时必有）</p>
         * 
         * <strong>example:</strong>
         * <p>wf-1</p>
         */
        public Builder sourceWorkflowId(String sourceWorkflowId) {
            this.sourceWorkflowId = sourceWorkflowId;
            return this;
        }

        /**
         * <p>待办主状态</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>待办摘要</p>
         * 
         * <strong>example:</strong>
         * <p>请审批以下事项</p>
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * <p>待办标题</p>
         * 
         * <strong>example:</strong>
         * <p>治理审批</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>待办ID</p>
         * 
         * <strong>example:</strong>
         * <p>todo_abc123</p>
         */
        public Builder todoId(String todoId) {
            this.todoId = todoId;
            return this;
        }

        public GetTodoDetailResponseBody build() {
            return new GetTodoDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTodoDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetTodoDetailResponseBody</p>
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
             * <p>处理时间（北京时间）；未处理为空</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-16T10:30:00+08:00</p>
             */
            public Builder actedAt(String actedAt) {
                this.actedAt = actedAt;
                return this;
            }

            /**
             * <p>处理人来源：ORIGINAL/TRANSFERRED</p>
             * 
             * <strong>example:</strong>
             * <p>ORIGINAL</p>
             */
            public Builder assigneeSource(String assigneeSource) {
                this.assigneeSource = assigneeSource;
                return this;
            }

            /**
             * <p>处理人用户ID</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder assigneeUserId(String assigneeUserId) {
                this.assigneeUserId = assigneeUserId;
                return this;
            }

            /**
             * <p>已读时间（北京时间）；未读为空</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-12 10:01:00</p>
             */
            public Builder readAt(String readAt) {
                this.readAt = readAt;
                return this;
            }

            /**
             * <p>处理人行状态</p>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>转出人用户ID；仅转办产生</p>
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
     * {@link GetTodoDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetTodoDetailResponseBody</p>
     */
    public static class Options extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("recommended")
        private Boolean recommended;

        private Options(Builder builder) {
            this.description = builder.description;
            this.label = builder.label;
            this.recommended = builder.recommended;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return recommended
         */
        public Boolean getRecommended() {
            return this.recommended;
        }

        public static final class Builder {
            private String description; 
            private String label; 
            private Boolean recommended; 

            private Builder() {
            } 

            private Builder(Options model) {
                this.description = model.description;
                this.label = model.label;
                this.recommended = model.recommended;
            } 

            /**
             * <p>选项补充说明</p>
             * 
             * <strong>example:</strong>
             * <p>选项补充说明</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>选项文案（引用键）</p>
             * 
             * <strong>example:</strong>
             * <p>通过</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>是否推荐</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder recommended(Boolean recommended) {
                this.recommended = recommended;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTodoDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetTodoDetailResponseBody</p>
     */
    public static class Questions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowCustom")
        private Boolean allowCustom;

        @com.aliyun.core.annotation.NameInMap("customLabel")
        private String customLabel;

        @com.aliyun.core.annotation.NameInMap("customMaxLength")
        private Long customMaxLength;

        @com.aliyun.core.annotation.NameInMap("customPlaceholder")
        private String customPlaceholder;

        @com.aliyun.core.annotation.NameInMap("maxLength")
        private Long maxLength;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("options")
        private java.util.List<Options> options;

        @com.aliyun.core.annotation.NameInMap("placeholder")
        private String placeholder;

        @com.aliyun.core.annotation.NameInMap("question")
        private String question;

        @com.aliyun.core.annotation.NameInMap("required")
        private Boolean required;

        private Questions(Builder builder) {
            this.allowCustom = builder.allowCustom;
            this.customLabel = builder.customLabel;
            this.customMaxLength = builder.customMaxLength;
            this.customPlaceholder = builder.customPlaceholder;
            this.maxLength = builder.maxLength;
            this.mode = builder.mode;
            this.options = builder.options;
            this.placeholder = builder.placeholder;
            this.question = builder.question;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Questions create() {
            return builder().build();
        }

        /**
         * @return allowCustom
         */
        public Boolean getAllowCustom() {
            return this.allowCustom;
        }

        /**
         * @return customLabel
         */
        public String getCustomLabel() {
            return this.customLabel;
        }

        /**
         * @return customMaxLength
         */
        public Long getCustomMaxLength() {
            return this.customMaxLength;
        }

        /**
         * @return customPlaceholder
         */
        public String getCustomPlaceholder() {
            return this.customPlaceholder;
        }

        /**
         * @return maxLength
         */
        public Long getMaxLength() {
            return this.maxLength;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return options
         */
        public java.util.List<Options> getOptions() {
            return this.options;
        }

        /**
         * @return placeholder
         */
        public String getPlaceholder() {
            return this.placeholder;
        }

        /**
         * @return question
         */
        public String getQuestion() {
            return this.question;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        public static final class Builder {
            private Boolean allowCustom; 
            private String customLabel; 
            private Long customMaxLength; 
            private String customPlaceholder; 
            private Long maxLength; 
            private String mode; 
            private java.util.List<Options> options; 
            private String placeholder; 
            private String question; 
            private Boolean required; 

            private Builder() {
            } 

            private Builder(Questions model) {
                this.allowCustom = model.allowCustom;
                this.customLabel = model.customLabel;
                this.customMaxLength = model.customMaxLength;
                this.customPlaceholder = model.customPlaceholder;
                this.maxLength = model.maxLength;
                this.mode = model.mode;
                this.options = model.options;
                this.placeholder = model.placeholder;
                this.question = model.question;
                this.required = model.required;
            } 

            /**
             * <p>是否允许自定义输入</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowCustom(Boolean allowCustom) {
                this.allowCustom = allowCustom;
                return this;
            }

            /**
             * <p>自定义输入项文案</p>
             * 
             * <strong>example:</strong>
             * <p>其他</p>
             */
            public Builder customLabel(String customLabel) {
                this.customLabel = customLabel;
                return this;
            }

            /**
             * <p>自定义输入长度上限</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder customMaxLength(Long customMaxLength) {
                this.customMaxLength = customMaxLength;
                return this;
            }

            /**
             * <p>自定义输入占位符</p>
             * 
             * <strong>example:</strong>
             * <p>请说明</p>
             */
            public Builder customPlaceholder(String customPlaceholder) {
                this.customPlaceholder = customPlaceholder;
                return this;
            }

            /**
             * <p>TEXT 题长度上限</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder maxLength(Long maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * <p>作答形态：SINGLE_CHOICE/MULTI_CHOICE/TEXT</p>
             * 
             * <strong>example:</strong>
             * <p>SINGLE_CHOICE</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>选项（选择类必有）</p>
             */
            public Builder options(java.util.List<Options> options) {
                this.options = options;
                return this;
            }

            /**
             * <p>TEXT 题占位符</p>
             * 
             * <strong>example:</strong>
             * <p>请输入</p>
             */
            public Builder placeholder(String placeholder) {
                this.placeholder = placeholder;
                return this;
            }

            /**
             * <p>问题正文（引用键）</p>
             * 
             * <strong>example:</strong>
             * <p>是否通过审批</p>
             */
            public Builder question(String question) {
                this.question = question;
                return this;
            }

            /**
             * <p>是否必答</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            public Questions build() {
                return new Questions(this);
            } 

        } 

    }
}
