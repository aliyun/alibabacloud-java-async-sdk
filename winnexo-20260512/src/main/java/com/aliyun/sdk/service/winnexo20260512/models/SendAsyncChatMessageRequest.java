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
 * {@link SendAsyncChatMessageRequest} extends {@link RequestModel}
 *
 * <p>SendAsyncChatMessageRequest</p>
 */
public class SendAsyncChatMessageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contentType")
    private String contentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
    private java.util.List<String> digitalEmployeeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directChat")
    private Boolean directChat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("files")
    private java.util.List<Files> files;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reuseLastSession")
    private Boolean reuseLastSession;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskExecution")
    private TaskExecution taskExecution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private SendAsyncChatMessageRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.contentType = builder.contentType;
        this.digitalEmployeeName = builder.digitalEmployeeName;
        this.directChat = builder.directChat;
        this.files = builder.files;
        this.model = builder.model;
        this.reuseLastSession = builder.reuseLastSession;
        this.sessionId = builder.sessionId;
        this.stream = builder.stream;
        this.taskExecution = builder.taskExecution;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendAsyncChatMessageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return digitalEmployeeName
     */
    public java.util.List<String> getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    /**
     * @return directChat
     */
    public Boolean getDirectChat() {
        return this.directChat;
    }

    /**
     * @return files
     */
    public java.util.List<Files> getFiles() {
        return this.files;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return reuseLastSession
     */
    public Boolean getReuseLastSession() {
        return this.reuseLastSession;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return taskExecution
     */
    public TaskExecution getTaskExecution() {
        return this.taskExecution;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<SendAsyncChatMessageRequest, Builder> {
        private String content; 
        private String contentType; 
        private java.util.List<String> digitalEmployeeName; 
        private Boolean directChat; 
        private java.util.List<Files> files; 
        private String model; 
        private Boolean reuseLastSession; 
        private String sessionId; 
        private Boolean stream; 
        private TaskExecution taskExecution; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(SendAsyncChatMessageRequest request) {
            super(request);
            this.content = request.content;
            this.contentType = request.contentType;
            this.digitalEmployeeName = request.digitalEmployeeName;
            this.directChat = request.directChat;
            this.files = request.files;
            this.model = request.model;
            this.reuseLastSession = request.reuseLastSession;
            this.sessionId = request.sessionId;
            this.stream = request.stream;
            this.taskExecution = request.taskExecution;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>用户消息正文</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例内容</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>消息类型：Text / Markdown</p>
         * 
         * <strong>example:</strong>
         * <p>Text</p>
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("contentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>数字员工名称列表（兼容旧格式可传单个字符串）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder digitalEmployeeName(java.util.List<String> digitalEmployeeName) {
            String digitalEmployeeNameShrink = shrink(digitalEmployeeName, "digitalEmployeeName", "json");
            this.putBodyParameter("digitalEmployeeName", digitalEmployeeNameShrink);
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }

        /**
         * <p>是否启用直连模式；true 时跳过常规场景路由，直接进入直连对话场景</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder directChat(Boolean directChat) {
            this.putBodyParameter("directChat", directChat);
            this.directChat = directChat;
            return this;
        }

        /**
         * <p>文件引用列表；每项为对象，fileId 必传（由 uploadChatFile 返回）</p>
         */
        public Builder files(java.util.List<Files> files) {
            String filesShrink = shrink(files, "files", "json");
            this.putBodyParameter("files", filesShrink);
            this.files = files;
            return this;
        }

        /**
         * <p>抽象模型档位（quick / standard / flagship）；缺省时新会话用 standard，已有会话沿用会话当前档位</p>
         * 
         * <strong>example:</strong>
         * <p>quick</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>不传 sessionId 时是否复用该数字员工下最近一个会话（CLI 场景），缺省 false 即新建会话</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder reuseLastSession(Boolean reuseLastSession) {
            this.putBodyParameter("reuseLastSession", reuseLastSession);
            this.reuseLastSession = reuseLastSession;
            return this;
        }

        /**
         * <p>会话ID，不传则新建会话</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSessionId</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>是否流式生成；本接口固定按流式生成后台内容并写入消息流，取值不改变返回结构</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * <p>executeScheduledTask 返回的任务执行元数据；传入后按任务执行链路处理</p>
         */
        public Builder taskExecution(TaskExecution taskExecution) {
            String taskExecutionShrink = shrink(taskExecution, "taskExecution", "json");
            this.putBodyParameter("taskExecution", taskExecutionShrink);
            this.taskExecution = taskExecution;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public SendAsyncChatMessageRequest build() {
            return new SendAsyncChatMessageRequest(this);
        } 

    } 

    /**
     * 
     * {@link SendAsyncChatMessageRequest} extends {@link TeaModel}
     *
     * <p>SendAsyncChatMessageRequest</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Files(Builder builder) {
            this.fileId = builder.fileId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String fileId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.fileId = model.fileId;
                this.type = model.type;
            } 

            /**
             * <p>文件 ID，由 uploadChatFile 返回</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleFileId</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>文件类型</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendAsyncChatMessageRequest} extends {@link TeaModel}
     *
     * <p>SendAsyncChatMessageRequest</p>
     */
    public static class TaskExecution extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingId")
        private String billingId;

        @com.aliyun.core.annotation.NameInMap("enableWebSearch")
        private Boolean enableWebSearch;

        @com.aliyun.core.annotation.NameInMap("executionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String executionId;

        @com.aliyun.core.annotation.NameInMap("operatingObjectName")
        private String operatingObjectName;

        @com.aliyun.core.annotation.NameInMap("skillCodes")
        private java.util.List<String> skillCodes;

        @com.aliyun.core.annotation.NameInMap("taskId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("taskUnderstand")
        private String taskUnderstand;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private TaskExecution(Builder builder) {
            this.billingId = builder.billingId;
            this.enableWebSearch = builder.enableWebSearch;
            this.executionId = builder.executionId;
            this.operatingObjectName = builder.operatingObjectName;
            this.skillCodes = builder.skillCodes;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskUnderstand = builder.taskUnderstand;
            this.tenantId = builder.tenantId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskExecution create() {
            return builder().build();
        }

        /**
         * @return billingId
         */
        public String getBillingId() {
            return this.billingId;
        }

        /**
         * @return enableWebSearch
         */
        public Boolean getEnableWebSearch() {
            return this.enableWebSearch;
        }

        /**
         * @return executionId
         */
        public String getExecutionId() {
            return this.executionId;
        }

        /**
         * @return operatingObjectName
         */
        public String getOperatingObjectName() {
            return this.operatingObjectName;
        }

        /**
         * @return skillCodes
         */
        public java.util.List<String> getSkillCodes() {
            return this.skillCodes;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskUnderstand
         */
        public String getTaskUnderstand() {
            return this.taskUnderstand;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String billingId; 
            private Boolean enableWebSearch; 
            private String executionId; 
            private String operatingObjectName; 
            private java.util.List<String> skillCodes; 
            private String taskId; 
            private String taskName; 
            private String taskUnderstand; 
            private String tenantId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(TaskExecution model) {
                this.billingId = model.billingId;
                this.enableWebSearch = model.enableWebSearch;
                this.executionId = model.executionId;
                this.operatingObjectName = model.operatingObjectName;
                this.skillCodes = model.skillCodes;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.taskUnderstand = model.taskUnderstand;
                this.tenantId = model.tenantId;
                this.userId = model.userId;
            } 

            /**
             * <p>计费 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleBillingId</p>
             */
            public Builder billingId(String billingId) {
                this.billingId = billingId;
                return this;
            }

            /**
             * <p>是否启用联网搜索</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableWebSearch(Boolean enableWebSearch) {
                this.enableWebSearch = enableWebSearch;
                return this;
            }

            /**
             * <p>执行记录 ID</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleExecutionId</p>
             */
            public Builder executionId(String executionId) {
                this.executionId = executionId;
                return this;
            }

            /**
             * <p>数字员工名称</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder operatingObjectName(String operatingObjectName) {
                this.operatingObjectName = operatingObjectName;
                return this;
            }

            /**
             * <p>关联技能编码列表</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder skillCodes(java.util.List<String> skillCodes) {
                this.skillCodes = skillCodes;
                return this;
            }

            /**
             * <p>任务 ID</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleTaskId</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>任务名称</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>任务理解内容</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder taskUnderstand(String taskUnderstand) {
                this.taskUnderstand = taskUnderstand;
                return this;
            }

            /**
             * <p>任务所属租户 ID</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>任务所属用户 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleUserId</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TaskExecution build() {
                return new TaskExecution(this);
            } 

        } 

    }
}
