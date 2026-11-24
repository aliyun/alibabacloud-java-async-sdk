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
 * {@link ChatMessagesRequest} extends {@link RequestModel}
 *
 * <p>ChatMessagesRequest</p>
 */
public class ChatMessagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventMode")
    private String eventMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List<Files> files;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Inputs")
    private Inputs inputs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentMessageId")
    private String parentMessageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(maxLength = 65536)
    private String query;

    private ChatMessagesRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
        this.eventMode = builder.eventMode;
        this.files = builder.files;
        this.inputs = builder.inputs;
        this.parentMessageId = builder.parentMessageId;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatMessagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return eventMode
     */
    public String getEventMode() {
        return this.eventMode;
    }

    /**
     * @return files
     */
    public java.util.List<Files> getFiles() {
        return this.files;
    }

    /**
     * @return inputs
     */
    public Inputs getInputs() {
        return this.inputs;
    }

    /**
     * @return parentMessageId
     */
    public String getParentMessageId() {
        return this.parentMessageId;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<ChatMessagesRequest, Builder> {
        private String conversationId; 
        private String eventMode; 
        private java.util.List<Files> files; 
        private Inputs inputs; 
        private String parentMessageId; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(ChatMessagesRequest request) {
            super(request);
            this.conversationId = request.conversationId;
            this.eventMode = request.eventMode;
            this.files = request.files;
            this.inputs = request.inputs;
            this.parentMessageId = request.parentMessageId;
            this.query = request.query;
        } 

        /**
         * <p>The conversation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fea7bdca-e848-44dd-b1ae-852472b8****</p>
         */
        public Builder conversationId(String conversationId) {
            this.putQueryParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>The event output mode. Valid values: inline and separate. Default value: inline. When set to inline, tool invoke events, child node events, and document events are unified into the answer field of the event where event = message. When set to separate, tool invoke events, child node events, and document events have their own respective events.</p>
         * 
         * <strong>example:</strong>
         * <p>inline</p>
         */
        public Builder eventMode(String eventMode) {
            this.putQueryParameter("EventMode", eventMode);
            this.eventMode = eventMode;
            return this;
        }

        /**
         * <p>The list of attachments included in the current conversation round. References uploaded files by using UploadFileId.</p>
         */
        public Builder files(java.util.List<Files> files) {
            String filesShrink = shrink(files, "Files", "json");
            this.putQueryParameter("Files", filesShrink);
            this.files = files;
            return this;
        }

        /**
         * <p>The task input.</p>
         */
        public Builder inputs(Inputs inputs) {
            String inputsShrink = shrink(inputs, "Inputs", "json");
            this.putQueryParameter("Inputs", inputsShrink);
            this.inputs = inputs;
            return this;
        }

        /**
         * <p>The parent message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>84dc9f9b-424a-404d-9c36-35e9d000****</p>
         */
        public Builder parentMessageId(String parentMessageId) {
            this.putQueryParameter("ParentMessageId", parentMessageId);
            this.parentMessageId = parentMessageId;
            return this;
        }

        /**
         * <p>The query content.</p>
         * 
         * <strong>example:</strong>
         * <p>Disk usage of instance rm-bp14as9914vd3****, and whether it needs to be scaled up</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        @Override
        public ChatMessagesRequest build() {
            return new ChatMessagesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ChatMessagesRequest} extends {@link TeaModel}
     *
     * <p>ChatMessagesRequest</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TransferMethod")
        private String transferMethod;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UploadFileId")
        private String uploadFileId;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Files(Builder builder) {
            this.transferMethod = builder.transferMethod;
            this.type = builder.type;
            this.uploadFileId = builder.uploadFileId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return transferMethod
         */
        public String getTransferMethod() {
            return this.transferMethod;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uploadFileId
         */
        public String getUploadFileId() {
            return this.uploadFileId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String transferMethod; 
            private String type; 
            private String uploadFileId; 
            private String url; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.transferMethod = model.transferMethod;
                this.type = model.type;
                this.uploadFileId = model.uploadFileId;
                this.url = model.url;
            } 

            /**
             * <p>The file transfer method. Set this parameter to local_file and provide the UploadFileId when referencing an uploaded file.</p>
             * 
             * <strong>example:</strong>
             * <p>local_file</p>
             */
            public Builder transferMethod(String transferMethod) {
                this.transferMethod = transferMethod;
                return this;
            }

            /**
             * <p>The attachment type. A value of image indicates an image. The actual supported types are determined by the file upload configuration of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>image</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The identifier of the uploaded file. The ContextDB management agent can use the UploadFileId returned by the knowledge base of the current workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>00000000-0000-4000-8000-000000000001</p>
             */
            public Builder uploadFileId(String uploadFileId) {
                this.uploadFileId = uploadFileId;
                return this;
            }

            /**
             * <p>The image URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://other-general-huadong1.oss-cn-hangzhou.aliyuncs.com/uploadWidget/BirthCertification_0.jpeg">https://other-general-huadong1.oss-cn-hangzhou.aliyuncs.com/uploadWidget/BirthCertification_0.jpeg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatMessagesRequest} extends {@link TeaModel}
     *
     * <p>ChatMessagesRequest</p>
     */
    public static class Inputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomAgentId")
        private String customAgentId;

        @com.aliyun.core.annotation.NameInMap("EnableThinking")
        private String enableThinking;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("ModelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResumeCallId")
        private String resumeCallId;

        @com.aliyun.core.annotation.NameInMap("ThinkEffort")
        private String thinkEffort;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("ToolApprovalMode")
        private String toolApprovalMode;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Inputs(Builder builder) {
            this.customAgentId = builder.customAgentId;
            this.enableThinking = builder.enableThinking;
            this.flowId = builder.flowId;
            this.language = builder.language;
            this.modelId = builder.modelId;
            this.regionId = builder.regionId;
            this.resumeCallId = builder.resumeCallId;
            this.thinkEffort = builder.thinkEffort;
            this.timezone = builder.timezone;
            this.toolApprovalMode = builder.toolApprovalMode;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Inputs create() {
            return builder().build();
        }

        /**
         * @return customAgentId
         */
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        /**
         * @return enableThinking
         */
        public String getEnableThinking() {
            return this.enableThinking;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resumeCallId
         */
        public String getResumeCallId() {
            return this.resumeCallId;
        }

        /**
         * @return thinkEffort
         */
        public String getThinkEffort() {
            return this.thinkEffort;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return toolApprovalMode
         */
        public String getToolApprovalMode() {
            return this.toolApprovalMode;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String customAgentId; 
            private String enableThinking; 
            private String flowId; 
            private String language; 
            private String modelId; 
            private String regionId; 
            private String resumeCallId; 
            private String thinkEffort; 
            private String timezone; 
            private String toolApprovalMode; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Inputs model) {
                this.customAgentId = model.customAgentId;
                this.enableThinking = model.enableThinking;
                this.flowId = model.flowId;
                this.language = model.language;
                this.modelId = model.modelId;
                this.regionId = model.regionId;
                this.resumeCallId = model.resumeCallId;
                this.thinkEffort = model.thinkEffort;
                this.timezone = model.timezone;
                this.toolApprovalMode = model.toolApprovalMode;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The custom agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d1b7d639-f34e-44c7-8231-987da14d****</p>
             */
            public Builder customAgentId(String customAgentId) {
                this.customAgentId = customAgentId;
                return this;
            }

            /**
             * <p>Specifies whether to enable the deep thinking mode.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableThinking(String enableThinking) {
                this.enableThinking = enableThinking;
                return this;
            }

            /**
             * <p>The IM flow ID. Used to bind messages to a registered IM channel when a conversation is initiated through an IM channel.</p>
             * 
             * <strong>example:</strong>
             * <p>flow-xxxxxxxxxx</p>
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * <p>The conversation language.</p>
             * 
             * <strong>example:</strong>
             * <p>zh-cn</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The model ID.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3.7-max</p>
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The tool approval call ID for resuming execution. Pass this parameter after the console completes all decisions for the current approval round to continue the interrupted ChatMessage loop. Do not pass this parameter for normal conversations.</p>
             * 
             * <strong>example:</strong>
             * <p>call-example</p>
             */
            public Builder resumeCallId(String resumeCallId) {
                this.resumeCallId = resumeCallId;
                return this;
            }

            /**
             * <p>The thinking depth.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder thinkEffort(String thinkEffort) {
                this.thinkEffort = thinkEffort;
                return this;
            }

            /**
             * <p>The time zone. Default value: <strong>Asia/Shanghai</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>UTC</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>Specifies the tool approval mode for the current conversation. Valid values: read_only (read-only, rejects write tools), manual (write tools require manual approval), and auto (automatically determined by the approval sub-agent; escalated to manual approval when needs_human is returned). If specified, updates the approval mode of the current conversation.</p>
             * 
             * <strong>example:</strong>
             * <p>manual</p>
             */
            public Builder toolApprovalMode(String toolApprovalMode) {
                this.toolApprovalMode = toolApprovalMode;
                return this;
            }

            /**
             * <p>The ContextDB workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>00000000-0000-4000-8000-000000000001</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Inputs build() {
                return new Inputs(this);
            } 

        } 

    }
}
