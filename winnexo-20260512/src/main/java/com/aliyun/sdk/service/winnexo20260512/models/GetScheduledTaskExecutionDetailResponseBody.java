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
 * {@link GetScheduledTaskExecutionDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetScheduledTaskExecutionDetailResponseBody</p>
 */
public class GetScheduledTaskExecutionDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("completedAt")
    private String completedAt;

    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("conversationId")
    private String conversationId;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
    private java.util.List<String> digitalEmployeeName;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("executionId")
    private String executionId;

    @com.aliyun.core.annotation.NameInMap("files")
    private java.util.List<Files> files;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("messageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private Metadata metadata;

    @com.aliyun.core.annotation.NameInMap("outputContent")
    private String outputContent;

    @com.aliyun.core.annotation.NameInMap("pushResult")
    private String pushResult;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("skillCodes")
    private java.util.List<String> skillCodes;

    @com.aliyun.core.annotation.NameInMap("startedAt")
    private String startedAt;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("triggerInfo")
    private TriggerInfo triggerInfo;

    @com.aliyun.core.annotation.NameInMap("triggerType")
    private String triggerType;

    @com.aliyun.core.annotation.NameInMap("visibility")
    private String visibility;

    private GetScheduledTaskExecutionDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.completedAt = builder.completedAt;
        this.content = builder.content;
        this.conversationId = builder.conversationId;
        this.creator = builder.creator;
        this.digitalEmployeeName = builder.digitalEmployeeName;
        this.errorMessage = builder.errorMessage;
        this.executionId = builder.executionId;
        this.files = builder.files;
        this.gmtCreate = builder.gmtCreate;
        this.message = builder.message;
        this.messageId = builder.messageId;
        this.metadata = builder.metadata;
        this.outputContent = builder.outputContent;
        this.pushResult = builder.pushResult;
        this.requestId = builder.requestId;
        this.skillCodes = builder.skillCodes;
        this.startedAt = builder.startedAt;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.title = builder.title;
        this.triggerInfo = builder.triggerInfo;
        this.triggerType = builder.triggerType;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduledTaskExecutionDetailResponseBody create() {
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
     * @return completedAt
     */
    public String getCompletedAt() {
        return this.completedAt;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return digitalEmployeeName
     */
    public java.util.List<String> getDigitalEmployeeName() {
        return this.digitalEmployeeName;
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
     * @return files
     */
    public java.util.List<Files> getFiles() {
        return this.files;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
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
     * @return metadata
     */
    public Metadata getMetadata() {
        return this.metadata;
    }

    /**
     * @return outputContent
     */
    public String getOutputContent() {
        return this.outputContent;
    }

    /**
     * @return pushResult
     */
    public String getPushResult() {
        return this.pushResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skillCodes
     */
    public java.util.List<String> getSkillCodes() {
        return this.skillCodes;
    }

    /**
     * @return startedAt
     */
    public String getStartedAt() {
        return this.startedAt;
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

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return triggerInfo
     */
    public TriggerInfo getTriggerInfo() {
        return this.triggerInfo;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder {
        private String code; 
        private String completedAt; 
        private String content; 
        private String conversationId; 
        private String creator; 
        private java.util.List<String> digitalEmployeeName; 
        private String errorMessage; 
        private String executionId; 
        private java.util.List<Files> files; 
        private String gmtCreate; 
        private String message; 
        private String messageId; 
        private Metadata metadata; 
        private String outputContent; 
        private String pushResult; 
        private String requestId; 
        private java.util.List<String> skillCodes; 
        private String startedAt; 
        private String status; 
        private String taskId; 
        private String title; 
        private TriggerInfo triggerInfo; 
        private String triggerType; 
        private String visibility; 

        private Builder() {
        } 

        private Builder(GetScheduledTaskExecutionDetailResponseBody model) {
            this.code = model.code;
            this.completedAt = model.completedAt;
            this.content = model.content;
            this.conversationId = model.conversationId;
            this.creator = model.creator;
            this.digitalEmployeeName = model.digitalEmployeeName;
            this.errorMessage = model.errorMessage;
            this.executionId = model.executionId;
            this.files = model.files;
            this.gmtCreate = model.gmtCreate;
            this.message = model.message;
            this.messageId = model.messageId;
            this.metadata = model.metadata;
            this.outputContent = model.outputContent;
            this.pushResult = model.pushResult;
            this.requestId = model.requestId;
            this.skillCodes = model.skillCodes;
            this.startedAt = model.startedAt;
            this.status = model.status;
            this.taskId = model.taskId;
            this.title = model.title;
            this.triggerInfo = model.triggerInfo;
            this.triggerType = model.triggerType;
            this.visibility = model.visibility;
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
         * <p>The completion time (ISO 8601).</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder completedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        /**
         * <p>The complete execution content.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample content</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the actual session used for this task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleConversationId</p>
         */
        public Builder conversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * <p>The list of digital employee names.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;pcitc-magent&quot;]</p>
         */
        public Builder digitalEmployeeName(java.util.List<String> digitalEmployeeName) {
            this.digitalEmployeeName = digitalEmployeeName;
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
         * <p>The execution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleExecutionId</p>
         */
        public Builder executionId(String executionId) {
            this.executionId = executionId;
            return this;
        }

        /**
         * <p>The list of output files.</p>
         */
        public Builder files(java.util.List<Files> files) {
            this.files = files;
            return this;
        }

        /**
         * <p>The creation time (ISO 8601).</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the result message generated by this task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleMessageId</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The extended metadata.</p>
         */
        public Builder metadata(Metadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The structured output content.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder outputContent(String outputContent) {
            this.outputContent = outputContent;
            return this;
        }

        /**
         * <p>The push status of the execution result.</p>
         * 
         * <strong>example:</strong>
         * <p>succuss</p>
         */
        public Builder pushResult(String pushResult) {
            this.pushResult = pushResult;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of associated skill codes.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;weather&quot;]</p>
         */
        public Builder skillCodes(java.util.List<String> skillCodes) {
            this.skillCodes = skillCodes;
            return this;
        }

        /**
         * <p>The start time (ISO 8601).</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder startedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * <p>The execution status.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        public Builder status(String status) {
            this.status = status;
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
         * <p>The title of the execution result.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample title</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>The trigger information.</p>
         */
        public Builder triggerInfo(TriggerInfo triggerInfo) {
            this.triggerInfo = triggerInfo;
            return this;
        }

        /**
         * <p>The trigger type.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder triggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        /**
         * <p>The visibility scope of the execution record.</p>
         * 
         * <strong>example:</strong>
         * <p>COLLABORATIVE</p>
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        public GetScheduledTaskExecutionDetailResponseBody build() {
            return new GetScheduledTaskExecutionDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScheduledTaskExecutionDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduledTaskExecutionDetailResponseBody</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        private Files(Builder builder) {
            this.name = builder.name;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String name; 
            private String path; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.name = model.name;
                this.path = model.path;
            } 

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>SampleName.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The OSS URL of the file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oss/file.pdf">https://example.com/oss/file.pdf</a></p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScheduledTaskExecutionDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduledTaskExecutionDetailResponseBody</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("usage")
        private java.util.Map<String, ?> usage;

        private Metadata(Builder builder) {
            this.sessionId = builder.sessionId;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return usage
         */
        public java.util.Map<String, ?> getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String sessionId; 
            private java.util.Map<String, ?> usage; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.sessionId = model.sessionId;
                this.usage = model.usage;
            } 

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleSessionId</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The token usage information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;input_tokens&quot;:100,&quot;output_tokens&quot;:20,&quot;cached_tokens&quot;:10}</p>
             */
            public Builder usage(java.util.Map<String, ?> usage) {
                this.usage = usage;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScheduledTaskExecutionDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduledTaskExecutionDetailResponseBody</p>
     */
    public static class TriggerInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("triggeredBy")
        private String triggeredBy;

        private TriggerInfo(Builder builder) {
            this.triggeredBy = builder.triggeredBy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TriggerInfo create() {
            return builder().build();
        }

        /**
         * @return triggeredBy
         */
        public String getTriggeredBy() {
            return this.triggeredBy;
        }

        public static final class Builder {
            private String triggeredBy; 

            private Builder() {
            } 

            private Builder(TriggerInfo model) {
                this.triggeredBy = model.triggeredBy;
            } 

            /**
             * <p>The identifier of the user who triggered the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>user_10001</p>
             */
            public Builder triggeredBy(String triggeredBy) {
                this.triggeredBy = triggeredBy;
                return this;
            }

            public TriggerInfo build() {
                return new TriggerInfo(this);
            } 

        } 

    }
}
