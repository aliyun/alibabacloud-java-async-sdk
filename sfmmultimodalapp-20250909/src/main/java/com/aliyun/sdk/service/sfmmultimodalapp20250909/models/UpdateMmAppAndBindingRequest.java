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
 * {@link UpdateMmAppAndBindingRequest} extends {@link RequestModel}
 *
 * <p>UpdateMmAppAndBindingRequest</p>
 */
public class UpdateMmAppAndBindingRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("MemoryConfig")
    private MemoryConfig memoryConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelConfig")
    private ModelConfig modelConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateMmAppAndBindingRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.bindingConfig = builder.bindingConfig;
        this.conversationConfig = builder.conversationConfig;
        this.memoryConfig = builder.memoryConfig;
        this.modelConfig = builder.modelConfig;
        this.prompt = builder.prompt;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMmAppAndBindingRequest create() {
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
     * @return memoryConfig
     */
    public MemoryConfig getMemoryConfig() {
        return this.memoryConfig;
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

    public static final class Builder extends Request.Builder<UpdateMmAppAndBindingRequest, Builder> {
        private String appId; 
        private String appName; 
        private BindingConfig bindingConfig; 
        private ConversationConfig conversationConfig; 
        private MemoryConfig memoryConfig; 
        private ModelConfig modelConfig; 
        private String prompt; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMmAppAndBindingRequest request) {
            super(request);
            this.appId = request.appId;
            this.appName = request.appName;
            this.bindingConfig = request.bindingConfig;
            this.conversationConfig = request.conversationConfig;
            this.memoryConfig = request.memoryConfig;
            this.modelConfig = request.modelConfig;
            this.prompt = request.prompt;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mm_xxxx</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * MemoryConfig.
         */
        public Builder memoryConfig(MemoryConfig memoryConfig) {
            String memoryConfigShrink = shrink(memoryConfig, "MemoryConfig", "json");
            this.putQueryParameter("MemoryConfig", memoryConfigShrink);
            this.memoryConfig = memoryConfig;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-6uhm7nfev4k8pwcz</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateMmAppAndBindingRequest build() {
            return new UpdateMmAppAndBindingRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMmAppAndBindingRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppAndBindingRequest</p>
     */
    public static class Agents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentCode")
        private String agentCode;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("AgentType")
        private String agentType;

        @com.aliyun.core.annotation.NameInMap("CentralConfig")
        private java.util.Map<String, ?> centralConfig;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IntentFewShotConfig")
        private java.util.Map<String, java.util.List<BindingConfigAgentsIntentFewShotConfigValue>> intentFewShotConfig;

        @com.aliyun.core.annotation.NameInMap("OwnConfig")
        private java.util.Map<String, ?> ownConfig;

        private Agents(Builder builder) {
            this.agentCode = builder.agentCode;
            this.agentName = builder.agentName;
            this.agentType = builder.agentType;
            this.centralConfig = builder.centralConfig;
            this.description = builder.description;
            this.intentFewShotConfig = builder.intentFewShotConfig;
            this.ownConfig = builder.ownConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agents create() {
            return builder().build();
        }

        /**
         * @return agentCode
         */
        public String getAgentCode() {
            return this.agentCode;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return agentType
         */
        public String getAgentType() {
            return this.agentType;
        }

        /**
         * @return centralConfig
         */
        public java.util.Map<String, ?> getCentralConfig() {
            return this.centralConfig;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return intentFewShotConfig
         */
        public java.util.Map<String, java.util.List<BindingConfigAgentsIntentFewShotConfigValue>> getIntentFewShotConfig() {
            return this.intentFewShotConfig;
        }

        /**
         * @return ownConfig
         */
        public java.util.Map<String, ?> getOwnConfig() {
            return this.ownConfig;
        }

        public static final class Builder {
            private String agentCode; 
            private String agentName; 
            private String agentType; 
            private java.util.Map<String, ?> centralConfig; 
            private String description; 
            private java.util.Map<String, java.util.List<BindingConfigAgentsIntentFewShotConfigValue>> intentFewShotConfig; 
            private java.util.Map<String, ?> ownConfig; 

            private Builder() {
            } 

            private Builder(Agents model) {
                this.agentCode = model.agentCode;
                this.agentName = model.agentName;
                this.agentType = model.agentType;
                this.centralConfig = model.centralConfig;
                this.description = model.description;
                this.intentFewShotConfig = model.intentFewShotConfig;
                this.ownConfig = model.ownConfig;
            } 

            /**
             * AgentCode.
             */
            public Builder agentCode(String agentCode) {
                this.agentCode = agentCode;
                return this;
            }

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * AgentType.
             */
            public Builder agentType(String agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * CentralConfig.
             */
            public Builder centralConfig(java.util.Map<String, ?> centralConfig) {
                this.centralConfig = centralConfig;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IntentFewShotConfig.
             */
            public Builder intentFewShotConfig(java.util.Map<String, java.util.List<BindingConfigAgentsIntentFewShotConfigValue>> intentFewShotConfig) {
                this.intentFewShotConfig = intentFewShotConfig;
                return this;
            }

            /**
             * OwnConfig.
             */
            public Builder ownConfig(java.util.Map<String, ?> ownConfig) {
                this.ownConfig = ownConfig;
                return this;
            }

            public Agents build() {
                return new Agents(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMmAppAndBindingRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppAndBindingRequest</p>
     */
    public static class ToolExamples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.Map<String, ?> parameters;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        private ToolExamples(Builder builder) {
            this.parameters = builder.parameters;
            this.query = builder.query;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolExamples create() {
            return builder().build();
        }

        /**
         * @return parameters
         */
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        public static final class Builder {
            private java.util.Map<String, ?> parameters; 
            private String query; 

            private Builder() {
            } 

            private Builder(ToolExamples model) {
                this.parameters = model.parameters;
                this.query = model.query;
            } 

            /**
             * Parameters.
             */
            public Builder parameters(java.util.Map<String, ?> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * Query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            public ToolExamples build() {
                return new ToolExamples(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMmAppAndBindingRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppAndBindingRequest</p>
     */
    public static class ToolParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParamDesc")
        private String paramDesc;

        @com.aliyun.core.annotation.NameInMap("ParamExample")
        private String paramExample;

        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        @com.aliyun.core.annotation.NameInMap("ParamType")
        private String paramType;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        private ToolParams(Builder builder) {
            this.paramDesc = builder.paramDesc;
            this.paramExample = builder.paramExample;
            this.paramName = builder.paramName;
            this.paramType = builder.paramType;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolParams create() {
            return builder().build();
        }

        /**
         * @return paramDesc
         */
        public String getParamDesc() {
            return this.paramDesc;
        }

        /**
         * @return paramExample
         */
        public String getParamExample() {
            return this.paramExample;
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        /**
         * @return paramType
         */
        public String getParamType() {
            return this.paramType;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        public static final class Builder {
            private String paramDesc; 
            private String paramExample; 
            private String paramName; 
            private String paramType; 
            private Boolean required; 

            private Builder() {
            } 

            private Builder(ToolParams model) {
                this.paramDesc = model.paramDesc;
                this.paramExample = model.paramExample;
                this.paramName = model.paramName;
                this.paramType = model.paramType;
                this.required = model.required;
            } 

            /**
             * ParamDesc.
             */
            public Builder paramDesc(String paramDesc) {
                this.paramDesc = paramDesc;
                return this;
            }

            /**
             * ParamExample.
             */
            public Builder paramExample(String paramExample) {
                this.paramExample = paramExample;
                return this;
            }

            /**
             * ParamName.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * ParamType.
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * Required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            public ToolParams build() {
                return new ToolParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMmAppAndBindingRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppAndBindingRequest</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReplyMode")
        private String replyMode;

        @com.aliyun.core.annotation.NameInMap("ToolDescription")
        private String toolDescription;

        @com.aliyun.core.annotation.NameInMap("ToolExamples")
        private java.util.List<ToolExamples> toolExamples;

        @com.aliyun.core.annotation.NameInMap("ToolId")
        private String toolId;

        @com.aliyun.core.annotation.NameInMap("ToolName")
        private String toolName;

        @com.aliyun.core.annotation.NameInMap("ToolParams")
        private java.util.List<ToolParams> toolParams;

        private Tools(Builder builder) {
            this.replyMode = builder.replyMode;
            this.toolDescription = builder.toolDescription;
            this.toolExamples = builder.toolExamples;
            this.toolId = builder.toolId;
            this.toolName = builder.toolName;
            this.toolParams = builder.toolParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return replyMode
         */
        public String getReplyMode() {
            return this.replyMode;
        }

        /**
         * @return toolDescription
         */
        public String getToolDescription() {
            return this.toolDescription;
        }

        /**
         * @return toolExamples
         */
        public java.util.List<ToolExamples> getToolExamples() {
            return this.toolExamples;
        }

        /**
         * @return toolId
         */
        public String getToolId() {
            return this.toolId;
        }

        /**
         * @return toolName
         */
        public String getToolName() {
            return this.toolName;
        }

        /**
         * @return toolParams
         */
        public java.util.List<ToolParams> getToolParams() {
            return this.toolParams;
        }

        public static final class Builder {
            private String replyMode; 
            private String toolDescription; 
            private java.util.List<ToolExamples> toolExamples; 
            private String toolId; 
            private String toolName; 
            private java.util.List<ToolParams> toolParams; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.replyMode = model.replyMode;
                this.toolDescription = model.toolDescription;
                this.toolExamples = model.toolExamples;
                this.toolId = model.toolId;
                this.toolName = model.toolName;
                this.toolParams = model.toolParams;
            } 

            /**
             * ReplyMode.
             */
            public Builder replyMode(String replyMode) {
                this.replyMode = replyMode;
                return this;
            }

            /**
             * ToolDescription.
             */
            public Builder toolDescription(String toolDescription) {
                this.toolDescription = toolDescription;
                return this;
            }

            /**
             * ToolExamples.
             */
            public Builder toolExamples(java.util.List<ToolExamples> toolExamples) {
                this.toolExamples = toolExamples;
                return this;
            }

            /**
             * ToolId.
             */
            public Builder toolId(String toolId) {
                this.toolId = toolId;
                return this;
            }

            /**
             * ToolName.
             */
            public Builder toolName(String toolName) {
                this.toolName = toolName;
                return this;
            }

            /**
             * ToolParams.
             */
            public Builder toolParams(java.util.List<ToolParams> toolParams) {
                this.toolParams = toolParams;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMmAppAndBindingRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppAndBindingRequest</p>
     */
    public static class Commands extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainCode")
        private String domainCode;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Tools")
        private java.util.List<Tools> tools;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Commands(Builder builder) {
            this.domainCode = builder.domainCode;
            this.domainName = builder.domainName;
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
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
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
            private String domainName; 
            private java.util.List<Tools> tools; 
            private String type; 

            private Builder() {
            } 

            private Builder(Commands model) {
                this.domainCode = model.domainCode;
                this.domainName = model.domainName;
                this.tools = model.tools;
                this.type = model.type;
            } 

            /**
             * DomainCode.
             */
            public Builder domainCode(String domainCode) {
                this.domainCode = domainCode;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
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
             * Type.
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
     * {@link UpdateMmAppAndBindingRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppAndBindingRequest</p>
     */
    public static class Mcps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ToolList")
        private java.util.List<String> toolList;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Mcps(Builder builder) {
            this.code = builder.code;
            this.toolList = builder.toolList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mcps create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return toolList
         */
        public java.util.List<String> getToolList() {
            return this.toolList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private java.util.List<String> toolList; 
            private String type; 

            private Builder() {
            } 

            private Builder(Mcps model) {
                this.code = model.code;
                this.toolList = model.toolList;
                this.type = model.type;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ToolList.
             */
            public Builder toolList(java.util.List<String> toolList) {
                this.toolList = toolList;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Mcps build() {
                return new Mcps(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMmAppAndBindingRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppAndBindingRequest</p>
     */
    public static class Plugins extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PluginCode")
        private String pluginCode;

        @com.aliyun.core.annotation.NameInMap("PluginName")
        private String pluginName;

        @com.aliyun.core.annotation.NameInMap("PluginType")
        private String pluginType;

        private Plugins(Builder builder) {
            this.pluginCode = builder.pluginCode;
            this.pluginName = builder.pluginName;
            this.pluginType = builder.pluginType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Plugins create() {
            return builder().build();
        }

        /**
         * @return pluginCode
         */
        public String getPluginCode() {
            return this.pluginCode;
        }

        /**
         * @return pluginName
         */
        public String getPluginName() {
            return this.pluginName;
        }

        /**
         * @return pluginType
         */
        public String getPluginType() {
            return this.pluginType;
        }

        public static final class Builder {
            private String pluginCode; 
            private String pluginName; 
            private String pluginType; 

            private Builder() {
            } 

            private Builder(Plugins model) {
                this.pluginCode = model.pluginCode;
                this.pluginName = model.pluginName;
                this.pluginType = model.pluginType;
            } 

            /**
             * PluginCode.
             */
            public Builder pluginCode(String pluginCode) {
                this.pluginCode = pluginCode;
                return this;
            }

            /**
             * PluginName.
             */
            public Builder pluginName(String pluginName) {
                this.pluginName = pluginName;
                return this;
            }

            /**
             * PluginType.
             */
            public Builder pluginType(String pluginType) {
                this.pluginType = pluginType;
                return this;
            }

            public Plugins build() {
                return new Plugins(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMmAppAndBindingRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppAndBindingRequest</p>
     */
    public static class RagConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableSearch")
        private Boolean enableSearch;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseCodeList")
        private java.util.List<String> knowledgeBaseCodeList;

        @com.aliyun.core.annotation.NameInMap("PromptStrategy")
        private String promptStrategy;

        @com.aliyun.core.annotation.NameInMap("RankWeights")
        private java.util.Map<String, Double> rankWeights;

        @com.aliyun.core.annotation.NameInMap("RetrieveMaxLength")
        private Integer retrieveMaxLength;

        @com.aliyun.core.annotation.NameInMap("TopK")
        private Integer topK;

        private RagConfig(Builder builder) {
            this.enableSearch = builder.enableSearch;
            this.knowledgeBaseCodeList = builder.knowledgeBaseCodeList;
            this.promptStrategy = builder.promptStrategy;
            this.rankWeights = builder.rankWeights;
            this.retrieveMaxLength = builder.retrieveMaxLength;
            this.topK = builder.topK;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RagConfig create() {
            return builder().build();
        }

        /**
         * @return enableSearch
         */
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        /**
         * @return knowledgeBaseCodeList
         */
        public java.util.List<String> getKnowledgeBaseCodeList() {
            return this.knowledgeBaseCodeList;
        }

        /**
         * @return promptStrategy
         */
        public String getPromptStrategy() {
            return this.promptStrategy;
        }

        /**
         * @return rankWeights
         */
        public java.util.Map<String, Double> getRankWeights() {
            return this.rankWeights;
        }

        /**
         * @return retrieveMaxLength
         */
        public Integer getRetrieveMaxLength() {
            return this.retrieveMaxLength;
        }

        /**
         * @return topK
         */
        public Integer getTopK() {
            return this.topK;
        }

        public static final class Builder {
            private Boolean enableSearch; 
            private java.util.List<String> knowledgeBaseCodeList; 
            private String promptStrategy; 
            private java.util.Map<String, Double> rankWeights; 
            private Integer retrieveMaxLength; 
            private Integer topK; 

            private Builder() {
            } 

            private Builder(RagConfig model) {
                this.enableSearch = model.enableSearch;
                this.knowledgeBaseCodeList = model.knowledgeBaseCodeList;
                this.promptStrategy = model.promptStrategy;
                this.rankWeights = model.rankWeights;
                this.retrieveMaxLength = model.retrieveMaxLength;
                this.topK = model.topK;
            } 

            /**
             * EnableSearch.
             */
            public Builder enableSearch(Boolean enableSearch) {
                this.enableSearch = enableSearch;
                return this;
            }

            /**
             * KnowledgeBaseCodeList.
             */
            public Builder knowledgeBaseCodeList(java.util.List<String> knowledgeBaseCodeList) {
                this.knowledgeBaseCodeList = knowledgeBaseCodeList;
                return this;
            }

            /**
             * PromptStrategy.
             */
            public Builder promptStrategy(String promptStrategy) {
                this.promptStrategy = promptStrategy;
                return this;
            }

            /**
             * RankWeights.
             */
            public Builder rankWeights(java.util.Map<String, Double> rankWeights) {
                this.rankWeights = rankWeights;
                return this;
            }

            /**
             * RetrieveMaxLength.
             */
            public Builder retrieveMaxLength(Integer retrieveMaxLength) {
                this.retrieveMaxLength = retrieveMaxLength;
                return this;
            }

            /**
             * TopK.
             */
            public Builder topK(Integer topK) {
                this.topK = topK;
                return this;
            }

            public RagConfig build() {
                return new RagConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMmAppAndBindingRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppAndBindingRequest</p>
     */
    public static class BindingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agents")
        private java.util.List<Agents> agents;

        @com.aliyun.core.annotation.NameInMap("Commands")
        private java.util.List<Commands> commands;

        @com.aliyun.core.annotation.NameInMap("Mcps")
        private java.util.List<Mcps> mcps;

        @com.aliyun.core.annotation.NameInMap("Plugins")
        private java.util.List<Plugins> plugins;

        @com.aliyun.core.annotation.NameInMap("RagConfig")
        private RagConfig ragConfig;

        private BindingConfig(Builder builder) {
            this.agents = builder.agents;
            this.commands = builder.commands;
            this.mcps = builder.mcps;
            this.plugins = builder.plugins;
            this.ragConfig = builder.ragConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindingConfig create() {
            return builder().build();
        }

        /**
         * @return agents
         */
        public java.util.List<Agents> getAgents() {
            return this.agents;
        }

        /**
         * @return commands
         */
        public java.util.List<Commands> getCommands() {
            return this.commands;
        }

        /**
         * @return mcps
         */
        public java.util.List<Mcps> getMcps() {
            return this.mcps;
        }

        /**
         * @return plugins
         */
        public java.util.List<Plugins> getPlugins() {
            return this.plugins;
        }

        /**
         * @return ragConfig
         */
        public RagConfig getRagConfig() {
            return this.ragConfig;
        }

        public static final class Builder {
            private java.util.List<Agents> agents; 
            private java.util.List<Commands> commands; 
            private java.util.List<Mcps> mcps; 
            private java.util.List<Plugins> plugins; 
            private RagConfig ragConfig; 

            private Builder() {
            } 

            private Builder(BindingConfig model) {
                this.agents = model.agents;
                this.commands = model.commands;
                this.mcps = model.mcps;
                this.plugins = model.plugins;
                this.ragConfig = model.ragConfig;
            } 

            /**
             * Agents.
             */
            public Builder agents(java.util.List<Agents> agents) {
                this.agents = agents;
                return this;
            }

            /**
             * Commands.
             */
            public Builder commands(java.util.List<Commands> commands) {
                this.commands = commands;
                return this;
            }

            /**
             * Mcps.
             */
            public Builder mcps(java.util.List<Mcps> mcps) {
                this.mcps = mcps;
                return this;
            }

            /**
             * Plugins.
             */
            public Builder plugins(java.util.List<Plugins> plugins) {
                this.plugins = plugins;
                return this;
            }

            /**
             * RagConfig.
             */
            public Builder ragConfig(RagConfig ragConfig) {
                this.ragConfig = ragConfig;
                return this;
            }

            public BindingConfig build() {
                return new BindingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMmAppAndBindingRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppAndBindingRequest</p>
     */
    public static class ConversationConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrModel")
        private String asrModel;

        @com.aliyun.core.annotation.NameInMap("OpenAsr")
        private Boolean openAsr;

        @com.aliyun.core.annotation.NameInMap("OpenTts")
        private Boolean openTts;

        @com.aliyun.core.annotation.NameInMap("StopOrRejectFlag")
        private Boolean stopOrRejectFlag;

        @com.aliyun.core.annotation.NameInMap("TtsModel")
        private String ttsModel;

        private ConversationConfig(Builder builder) {
            this.asrModel = builder.asrModel;
            this.openAsr = builder.openAsr;
            this.openTts = builder.openTts;
            this.stopOrRejectFlag = builder.stopOrRejectFlag;
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
         * @return stopOrRejectFlag
         */
        public Boolean getStopOrRejectFlag() {
            return this.stopOrRejectFlag;
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
            private Boolean stopOrRejectFlag; 
            private String ttsModel; 

            private Builder() {
            } 

            private Builder(ConversationConfig model) {
                this.asrModel = model.asrModel;
                this.openAsr = model.openAsr;
                this.openTts = model.openTts;
                this.stopOrRejectFlag = model.stopOrRejectFlag;
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
             * StopOrRejectFlag.
             */
            public Builder stopOrRejectFlag(Boolean stopOrRejectFlag) {
                this.stopOrRejectFlag = stopOrRejectFlag;
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
     * {@link UpdateMmAppAndBindingRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppAndBindingRequest</p>
     */
    public static class Attributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Attributes(Builder builder) {
            this.desc = builder.desc;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attributes create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String desc; 
            private String name; 

            private Builder() {
            } 

            private Builder(Attributes model) {
                this.desc = model.desc;
                this.name = model.name;
            } 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Attributes build() {
                return new Attributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMmAppAndBindingRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppAndBindingRequest</p>
     */
    public static class MemoryConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.List<Attributes> attributes;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private MemoryConfig(Builder builder) {
            this.attributes = builder.attributes;
            this.desc = builder.desc;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemoryConfig create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.List<Attributes> getAttributes() {
            return this.attributes;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<Attributes> attributes; 
            private String desc; 
            private String name; 

            private Builder() {
            } 

            private Builder(MemoryConfig model) {
                this.attributes = model.attributes;
                this.desc = model.desc;
                this.name = model.name;
            } 

            /**
             * Attributes.
             */
            public Builder attributes(java.util.List<Attributes> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public MemoryConfig build() {
                return new MemoryConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMmAppAndBindingRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppAndBindingRequest</p>
     */
    public static class UserPromptParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private UserPromptParams(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserPromptParams create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String defaultValue; 
            private String description; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(UserPromptParams model) {
                this.defaultValue = model.defaultValue;
                this.description = model.description;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UserPromptParams build() {
                return new UserPromptParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMmAppAndBindingRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppAndBindingRequest</p>
     */
    public static class UserQueryParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private UserQueryParams(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserQueryParams create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String defaultValue; 
            private String description; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(UserQueryParams model) {
                this.defaultValue = model.defaultValue;
                this.description = model.description;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UserQueryParams build() {
                return new UserQueryParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMmAppAndBindingRequest} extends {@link TeaModel}
     *
     * <p>UpdateMmAppAndBindingRequest</p>
     */
    public static class ModelConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableIntentRecognize")
        private Boolean enableIntentRecognize;

        @com.aliyun.core.annotation.NameInMap("EnableTransition")
        private Boolean enableTransition;

        @com.aliyun.core.annotation.NameInMap("HistoryLimit")
        private Integer historyLimit;

        @com.aliyun.core.annotation.NameInMap("IntentOnlySwitch")
        private Boolean intentOnlySwitch;

        @com.aliyun.core.annotation.NameInMap("ModelType")
        private String modelType;

        @com.aliyun.core.annotation.NameInMap("OpenMemory")
        private Boolean openMemory;

        @com.aliyun.core.annotation.NameInMap("OpenWebSearch")
        private Boolean openWebSearch;

        @com.aliyun.core.annotation.NameInMap("SearchModel")
        private String searchModel;

        @com.aliyun.core.annotation.NameInMap("SearchStrategy")
        private String searchStrategy;

        @com.aliyun.core.annotation.NameInMap("TextModal")
        private String textModal;

        @com.aliyun.core.annotation.NameInMap("UserPromptParams")
        private java.util.List<UserPromptParams> userPromptParams;

        @com.aliyun.core.annotation.NameInMap("userQueryParams")
        private java.util.List<UserQueryParams> userQueryParams;

        private ModelConfig(Builder builder) {
            this.enableIntentRecognize = builder.enableIntentRecognize;
            this.enableTransition = builder.enableTransition;
            this.historyLimit = builder.historyLimit;
            this.intentOnlySwitch = builder.intentOnlySwitch;
            this.modelType = builder.modelType;
            this.openMemory = builder.openMemory;
            this.openWebSearch = builder.openWebSearch;
            this.searchModel = builder.searchModel;
            this.searchStrategy = builder.searchStrategy;
            this.textModal = builder.textModal;
            this.userPromptParams = builder.userPromptParams;
            this.userQueryParams = builder.userQueryParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelConfig create() {
            return builder().build();
        }

        /**
         * @return enableIntentRecognize
         */
        public Boolean getEnableIntentRecognize() {
            return this.enableIntentRecognize;
        }

        /**
         * @return enableTransition
         */
        public Boolean getEnableTransition() {
            return this.enableTransition;
        }

        /**
         * @return historyLimit
         */
        public Integer getHistoryLimit() {
            return this.historyLimit;
        }

        /**
         * @return intentOnlySwitch
         */
        public Boolean getIntentOnlySwitch() {
            return this.intentOnlySwitch;
        }

        /**
         * @return modelType
         */
        public String getModelType() {
            return this.modelType;
        }

        /**
         * @return openMemory
         */
        public Boolean getOpenMemory() {
            return this.openMemory;
        }

        /**
         * @return openWebSearch
         */
        public Boolean getOpenWebSearch() {
            return this.openWebSearch;
        }

        /**
         * @return searchModel
         */
        public String getSearchModel() {
            return this.searchModel;
        }

        /**
         * @return searchStrategy
         */
        public String getSearchStrategy() {
            return this.searchStrategy;
        }

        /**
         * @return textModal
         */
        public String getTextModal() {
            return this.textModal;
        }

        /**
         * @return userPromptParams
         */
        public java.util.List<UserPromptParams> getUserPromptParams() {
            return this.userPromptParams;
        }

        /**
         * @return userQueryParams
         */
        public java.util.List<UserQueryParams> getUserQueryParams() {
            return this.userQueryParams;
        }

        public static final class Builder {
            private Boolean enableIntentRecognize; 
            private Boolean enableTransition; 
            private Integer historyLimit; 
            private Boolean intentOnlySwitch; 
            private String modelType; 
            private Boolean openMemory; 
            private Boolean openWebSearch; 
            private String searchModel; 
            private String searchStrategy; 
            private String textModal; 
            private java.util.List<UserPromptParams> userPromptParams; 
            private java.util.List<UserQueryParams> userQueryParams; 

            private Builder() {
            } 

            private Builder(ModelConfig model) {
                this.enableIntentRecognize = model.enableIntentRecognize;
                this.enableTransition = model.enableTransition;
                this.historyLimit = model.historyLimit;
                this.intentOnlySwitch = model.intentOnlySwitch;
                this.modelType = model.modelType;
                this.openMemory = model.openMemory;
                this.openWebSearch = model.openWebSearch;
                this.searchModel = model.searchModel;
                this.searchStrategy = model.searchStrategy;
                this.textModal = model.textModal;
                this.userPromptParams = model.userPromptParams;
                this.userQueryParams = model.userQueryParams;
            } 

            /**
             * EnableIntentRecognize.
             */
            public Builder enableIntentRecognize(Boolean enableIntentRecognize) {
                this.enableIntentRecognize = enableIntentRecognize;
                return this;
            }

            /**
             * EnableTransition.
             */
            public Builder enableTransition(Boolean enableTransition) {
                this.enableTransition = enableTransition;
                return this;
            }

            /**
             * HistoryLimit.
             */
            public Builder historyLimit(Integer historyLimit) {
                this.historyLimit = historyLimit;
                return this;
            }

            /**
             * IntentOnlySwitch.
             */
            public Builder intentOnlySwitch(Boolean intentOnlySwitch) {
                this.intentOnlySwitch = intentOnlySwitch;
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
             * OpenMemory.
             */
            public Builder openMemory(Boolean openMemory) {
                this.openMemory = openMemory;
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
             * SearchModel.
             */
            public Builder searchModel(String searchModel) {
                this.searchModel = searchModel;
                return this;
            }

            /**
             * SearchStrategy.
             */
            public Builder searchStrategy(String searchStrategy) {
                this.searchStrategy = searchStrategy;
                return this;
            }

            /**
             * TextModal.
             */
            public Builder textModal(String textModal) {
                this.textModal = textModal;
                return this;
            }

            /**
             * UserPromptParams.
             */
            public Builder userPromptParams(java.util.List<UserPromptParams> userPromptParams) {
                this.userPromptParams = userPromptParams;
                return this;
            }

            /**
             * userQueryParams.
             */
            public Builder userQueryParams(java.util.List<UserQueryParams> userQueryParams) {
                this.userQueryParams = userQueryParams;
                return this;
            }

            public ModelConfig build() {
                return new ModelConfig(this);
            } 

        } 

    }
}
