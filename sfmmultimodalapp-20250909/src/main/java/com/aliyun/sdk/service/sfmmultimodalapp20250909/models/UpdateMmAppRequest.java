// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link UpdateMmAppRequest} extends {@link RequestModel}
 *
 * <p>UpdateMmAppRequest</p>
 */
public class UpdateMmAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindingConfig")
    private BindingConfig bindingConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversationConfig")
    private ConversationConfig conversationConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelConfig")
    private ModelConfig modelConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private UpdateMmAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.bindingConfig = builder.bindingConfig;
        this.conversationConfig = builder.conversationConfig;
        this.modelConfig = builder.modelConfig;
        this.prompt = builder.prompt;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMmAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return bindingConfig
     */
    public BindingConfig getBindingConfig() {
        return this.bindingConfig;
    }

    /**
     * @return conversationConfig
     */
    public ConversationConfig getConversationConfig() {
        return this.conversationConfig;
    }

    /**
     * @return modelConfig
     */
    public ModelConfig getModelConfig() {
        return this.modelConfig;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateMmAppRequest, Builder> {
        private String appId; 
        private String appName; 
        private BindingConfig bindingConfig; 
        private ConversationConfig conversationConfig; 
        private ModelConfig modelConfig; 
        private String prompt; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMmAppRequest request) {
            super(request);
            this.appId = request.appId;
            this.appName = request.appName;
            this.bindingConfig = request.bindingConfig;
            this.conversationConfig = request.conversationConfig;
            this.modelConfig = request.modelConfig;
            this.prompt = request.prompt;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mm_xxx</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>多模态应用xxxxx</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * BindingConfig.
         */
        public Builder bindingConfig(BindingConfig bindingConfig) {
            String bindingConfigShrink = shrink(bindingConfig, "BindingConfig", "json");
            this.putQueryParameter("BindingConfig", bindingConfigShrink);
            this.bindingConfig = bindingConfig;
            return this;
        }

        /**
         * ConversationConfig.
         */
        public Builder conversationConfig(ConversationConfig conversationConfig) {
            String conversationConfigShrink = shrink(conversationConfig, "ConversationConfig", "json");
            this.putQueryParameter("ConversationConfig", conversationConfigShrink);
            this.conversationConfig = conversationConfig;
            return this;
        }

        /**
         * ModelConfig.
         */
        public Builder modelConfig(ModelConfig modelConfig) {
            String modelConfigShrink = shrink(modelConfig, "ModelConfig", "json");
            this.putQueryParameter("ModelConfig", modelConfigShrink);
            this.modelConfig = modelConfig;
            return this;
        }

        /**
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateMmAppRequest build() {
            return new UpdateMmAppRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMmAppRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppRequest</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ToolId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String toolId;

        private Tools(Builder builder) {
            this.toolId = builder.toolId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return toolId
         */
        public String getToolId() {
            return this.toolId;
        }

        public static final class Builder {
            private String toolId; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.toolId = model.toolId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>7293782043943</p>
             */
            public Builder toolId(String toolId) {
                this.toolId = toolId;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMmAppRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppRequest</p>
     */
    public static class Commands extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String domainCode;

        @com.aliyun.core.annotation.NameInMap("Tools")
        private java.util.List<Tools> tools;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Commands(Builder builder) {
            this.domainCode = builder.domainCode;
            this.tools = builder.tools;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commands create() {
            return builder().build();
        }

        /**
         * @return domainCode
         */
        public String getDomainCode() {
            return this.domainCode;
        }

        /**
         * @return tools
         */
        public java.util.List<Tools> getTools() {
            return this.tools;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String domainCode; 
            private java.util.List<Tools> tools; 
            private String type; 

            private Builder() {
            } 

            private Builder(Commands model) {
                this.domainCode = model.domainCode;
                this.tools = model.tools;
                this.type = model.type;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>724366858658</p>
             */
            public Builder domainCode(String domainCode) {
                this.domainCode = domainCode;
                return this;
            }

            /**
             * Tools.
             */
            public Builder tools(java.util.List<Tools> tools) {
                this.tools = tools;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Commands build() {
                return new Commands(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMmAppRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppRequest</p>
     */
    public static class BindingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Commands")
        private java.util.List<Commands> commands;

        private BindingConfig(Builder builder) {
            this.commands = builder.commands;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindingConfig create() {
            return builder().build();
        }

        /**
         * @return commands
         */
        public java.util.List<Commands> getCommands() {
            return this.commands;
        }

        public static final class Builder {
            private java.util.List<Commands> commands; 

            private Builder() {
            } 

            private Builder(BindingConfig model) {
                this.commands = model.commands;
            } 

            /**
             * Commands.
             */
            public Builder commands(java.util.List<Commands> commands) {
                this.commands = commands;
                return this;
            }

            public BindingConfig build() {
                return new BindingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMmAppRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppRequest</p>
     */
    public static class ConversationConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrModel")
        private String asrModel;

        @com.aliyun.core.annotation.NameInMap("OpenAsr")
        private Boolean openAsr;

        @com.aliyun.core.annotation.NameInMap("OpenTts")
        private Boolean openTts;

        @com.aliyun.core.annotation.NameInMap("TtsModel")
        private String ttsModel;

        private ConversationConfig(Builder builder) {
            this.asrModel = builder.asrModel;
            this.openAsr = builder.openAsr;
            this.openTts = builder.openTts;
            this.ttsModel = builder.ttsModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConversationConfig create() {
            return builder().build();
        }

        /**
         * @return asrModel
         */
        public String getAsrModel() {
            return this.asrModel;
        }

        /**
         * @return openAsr
         */
        public Boolean getOpenAsr() {
            return this.openAsr;
        }

        /**
         * @return openTts
         */
        public Boolean getOpenTts() {
            return this.openTts;
        }

        /**
         * @return ttsModel
         */
        public String getTtsModel() {
            return this.ttsModel;
        }

        public static final class Builder {
            private String asrModel; 
            private Boolean openAsr; 
            private Boolean openTts; 
            private String ttsModel; 

            private Builder() {
            } 

            private Builder(ConversationConfig model) {
                this.asrModel = model.asrModel;
                this.openAsr = model.openAsr;
                this.openTts = model.openTts;
                this.ttsModel = model.ttsModel;
            } 

            /**
             * AsrModel.
             */
            public Builder asrModel(String asrModel) {
                this.asrModel = asrModel;
                return this;
            }

            /**
             * OpenAsr.
             */
            public Builder openAsr(Boolean openAsr) {
                this.openAsr = openAsr;
                return this;
            }

            /**
             * OpenTts.
             */
            public Builder openTts(Boolean openTts) {
                this.openTts = openTts;
                return this;
            }

            /**
             * TtsModel.
             */
            public Builder ttsModel(String ttsModel) {
                this.ttsModel = ttsModel;
                return this;
            }

            public ConversationConfig build() {
                return new ConversationConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMmAppRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppRequest</p>
     */
    public static class ModelConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HistoryLimit")
        private Integer historyLimit;

        @com.aliyun.core.annotation.NameInMap("ModelType")
        private String modelType;

        @com.aliyun.core.annotation.NameInMap("OpenWebSearch")
        private Boolean openWebSearch;

        @com.aliyun.core.annotation.NameInMap("TextModal")
        private String textModal;

        private ModelConfig(Builder builder) {
            this.historyLimit = builder.historyLimit;
            this.modelType = builder.modelType;
            this.openWebSearch = builder.openWebSearch;
            this.textModal = builder.textModal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelConfig create() {
            return builder().build();
        }

        /**
         * @return historyLimit
         */
        public Integer getHistoryLimit() {
            return this.historyLimit;
        }

        /**
         * @return modelType
         */
        public String getModelType() {
            return this.modelType;
        }

        /**
         * @return openWebSearch
         */
        public Boolean getOpenWebSearch() {
            return this.openWebSearch;
        }

        /**
         * @return textModal
         */
        public String getTextModal() {
            return this.textModal;
        }

        public static final class Builder {
            private Integer historyLimit; 
            private String modelType; 
            private Boolean openWebSearch; 
            private String textModal; 

            private Builder() {
            } 

            private Builder(ModelConfig model) {
                this.historyLimit = model.historyLimit;
                this.modelType = model.modelType;
                this.openWebSearch = model.openWebSearch;
                this.textModal = model.textModal;
            } 

            /**
             * HistoryLimit.
             */
            public Builder historyLimit(Integer historyLimit) {
                this.historyLimit = historyLimit;
                return this;
            }

            /**
             * ModelType.
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * OpenWebSearch.
             */
            public Builder openWebSearch(Boolean openWebSearch) {
                this.openWebSearch = openWebSearch;
                return this;
            }

            /**
             * TextModal.
             */
            public Builder textModal(String textModal) {
                this.textModal = textModal;
                return this;
            }

            public ModelConfig build() {
                return new ModelConfig(this);
            } 

        } 

    }
}
