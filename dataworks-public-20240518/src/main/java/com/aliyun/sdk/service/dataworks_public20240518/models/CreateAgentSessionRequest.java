// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateAgentSessionRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentSessionRequest</p>
 */
public class CreateAgentSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Jsonrpc")
    private String jsonrpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    private Params params;

    private CreateAgentSessionRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.jsonrpc = builder.jsonrpc;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return jsonrpc
     */
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    /**
     * @return params
     */
    public Params getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<CreateAgentSessionRequest, Builder> {
        private String id; 
        private String jsonrpc; 
        private Params params; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentSessionRequest request) {
            super(request);
            this.id = request.id;
            this.jsonrpc = request.jsonrpc;
            this.params = request.params;
        } 

        /**
         * <p>The ID passed by the requester. The value is returned as is.</p>
         * 
         * <strong>example:</strong>
         * <p>4758330557805415712</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The JSON-RPC version. This value is always 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        public Builder jsonrpc(String jsonrpc) {
            this.putBodyParameter("Jsonrpc", jsonrpc);
            this.jsonrpc = jsonrpc;
            return this;
        }

        /**
         * <p>The business parameters.</p>
         */
        public Builder params(Params params) {
            String paramsShrink = shrink(params, "Params", "json");
            this.putBodyParameter("Params", paramsShrink);
            this.params = params;
            return this;
        }

        @Override
        public CreateAgentSessionRequest build() {
            return new CreateAgentSessionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentSessionRequest</p>
     */
    public static class Agent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        private Agent(Builder builder) {
            this.agentName = builder.agentName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agent create() {
            return builder().build();
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        public static final class Builder {
            private String agentName; 

            private Builder() {
            } 

            private Builder(Agent model) {
                this.agentName = model.agentName;
            } 

            /**
             * <p>The name of the agent bound to the session. This parameter is required. Valid values:</p>
             * <ul>
             * <li>dataworks_data_agent: DataWorks built-in agent - Data Agent. It provides AI capabilities for the entire data development lifecycle, including data integration, development, O&amp;M, governance, and analysis.</li>
             * <li>dataworks_chatbi_agent: DataWorks built-in agent - ChatBI. Based on natural language processing and intelligent analysis technologies, it automates the entire analysis process from requirement parsing, data extraction, and automatic code generation to visual report output through conversational interaction.</li>
             * <li>dataworks_ai_assistant_agent: DataWorks built-in agent - AI Assistant. An enterprise-grade AI assistant for DataWorks built on open-source frameworks such as OpenClaw and Hermes Agent.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dataworks_data_agent</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            public Agent build() {
                return new Agent(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentSessionRequest</p>
     */
    public static class SessionTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SessionTagCode")
        private String sessionTagCode;

        private SessionTags(Builder builder) {
            this.sessionTagCode = builder.sessionTagCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionTags create() {
            return builder().build();
        }

        /**
         * @return sessionTagCode
         */
        public String getSessionTagCode() {
            return this.sessionTagCode;
        }

        public static final class Builder {
            private String sessionTagCode; 

            private Builder() {
            } 

            private Builder(SessionTags model) {
                this.sessionTagCode = model.sessionTagCode;
            } 

            /**
             * <p>The session tag. You can filter sessions based on session tags. For example, if a fixed RAM user is used to call an API operation but the calling system has its own account system, you need to filter the session list based on the account ID. In this case, you can pass the account ID of the calling system as the session tag. The value can be up to 128 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
             * 
             * <strong>example:</strong>
             * <p>chatbi</p>
             */
            public Builder sessionTagCode(String sessionTagCode) {
                this.sessionTagCode = sessionTagCode;
                return this;
            }

            public SessionTags build() {
                return new SessionTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentSessionRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SessionSource")
        private String sessionSource;

        @com.aliyun.core.annotation.NameInMap("SessionTags")
        private java.util.List<SessionTags> sessionTags;

        private Config(Builder builder) {
            this.sessionSource = builder.sessionSource;
            this.sessionTags = builder.sessionTags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return sessionSource
         */
        public String getSessionSource() {
            return this.sessionSource;
        }

        /**
         * @return sessionTags
         */
        public java.util.List<SessionTags> getSessionTags() {
            return this.sessionTags;
        }

        public static final class Builder {
            private String sessionSource; 
            private java.util.List<SessionTags> sessionTags; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.sessionSource = model.sessionSource;
                this.sessionTags = model.sessionTags;
            } 

            /**
             * <p>The session source identifier, which facilitates retrieval by source. For example, if an agent is used on both Page A and Page B, and you want to display only sessions created on Page A, you can filter sessions based on this parameter. The value can be up to 128 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
             * 
             * <strong>example:</strong>
             * <p>openapi_sdk</p>
             */
            public Builder sessionSource(String sessionSource) {
                this.sessionSource = sessionSource;
                return this;
            }

            /**
             * <p>The list of session tags. You can search and filter sessions based on session tags.</p>
             */
            public Builder sessionTags(java.util.List<SessionTags> sessionTags) {
                this.sessionTags = sessionTags;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentSessionRequest</p>
     */
    public static class InitialConfigOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExecutionLane")
        private String executionLane;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ReasoningEffort")
        private String reasoningEffort;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Skills")
        private String skills;

        private InitialConfigOptions(Builder builder) {
            this.executionLane = builder.executionLane;
            this.mode = builder.mode;
            this.model = builder.model;
            this.projectId = builder.projectId;
            this.reasoningEffort = builder.reasoningEffort;
            this.resourceGroupId = builder.resourceGroupId;
            this.skills = builder.skills;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitialConfigOptions create() {
            return builder().build();
        }

        /**
         * @return executionLane
         */
        public String getExecutionLane() {
            return this.executionLane;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return reasoningEffort
         */
        public String getReasoningEffort() {
            return this.reasoningEffort;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return skills
         */
        public String getSkills() {
            return this.skills;
        }

        public static final class Builder {
            private String executionLane; 
            private String mode; 
            private String model; 
            private String projectId; 
            private String reasoningEffort; 
            private String resourceGroupId; 
            private String skills; 

            private Builder() {
            } 

            private Builder(InitialConfigOptions model) {
                this.executionLane = model.executionLane;
                this.mode = model.mode;
                this.model = model.model;
                this.projectId = model.projectId;
                this.reasoningEffort = model.reasoningEffort;
                this.resourceGroupId = model.resourceGroupId;
                this.skills = model.skills;
            } 

            /**
             * <p>The execution mode. Valid values:</p>
             * <ul>
             * <li>chat: conversation mode only. This mode is suitable for simple scenarios such as data querying and Q&amp;A. It is fast and consumes fewer tokens, but cannot handle complex problems.</li>
             * <li>cli: sandbox mode. This mode is suitable for complex scenarios such as data analytics, data processing, and code writing. It can handle complex problems and allows the model to independently analyze and process problems. However, it is slower and consumes more tokens than conversation mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>chat，cli</p>
             */
            public Builder executionLane(String executionLane) {
                this.executionLane = executionLane;
                return this;
            }

            /**
             * <p>The authorization mode for script execution. OpenAPI currently supports only the yolo mode. Valid values:</p>
             * <ul>
             * <li>yolo: automatic authorization. No manual intervention is required, and the model can process tasks automatically.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>yolo</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The model ID. Use the full model identifier supported by the target environment. If this parameter is omitted, the default model is used. If this parameter is specified, the server verifies its availability and applies it before the session is created.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3.7-max(openai)</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The DataWorks workspace ID. This parameter is used to initialize the project context of the session. If this parameter is omitted, the session is processed without a project context. You can subsequently correct or switch the project context by using PromptAgentSession.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The reasoning effort configuration. The value must be supported by the target model. A value of none disables reasoning, and a value of default uses the default configuration of the model. If an unsupported value is specified or the configuration application has failed, the session creation is marked as failed. If this parameter is omitted, the existing reasoning effort configuration is not modified. A successful configuration updates the default value of the daemon workspace and affects not only the current request.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder reasoningEffort(String reasoningEffort) {
                this.reasoningEffort = reasoningEffort;
                return this;
            }

            /**
             * <p>The ID of the resource group used for initialization.</p>
             * 
             * <strong>example:</strong>
             * <p>Serverless_res_group_123123123_564657857</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The names of the custom skills to be loaded. Separate multiple names with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>skill-name-1,skill-name2,skill-name-3</p>
             */
            public Builder skills(String skills) {
                this.skills = skills;
                return this;
            }

            public InitialConfigOptions build() {
                return new InitialConfigOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentSessionRequest</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agent")
        private Agent agent;

        @com.aliyun.core.annotation.NameInMap("Config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("InitialConfigOptions")
        private InitialConfigOptions initialConfigOptions;

        private Meta(Builder builder) {
            this.agent = builder.agent;
            this.config = builder.config;
            this.initialConfigOptions = builder.initialConfigOptions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return agent
         */
        public Agent getAgent() {
            return this.agent;
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return initialConfigOptions
         */
        public InitialConfigOptions getInitialConfigOptions() {
            return this.initialConfigOptions;
        }

        public static final class Builder {
            private Agent agent; 
            private Config config; 
            private InitialConfigOptions initialConfigOptions; 

            private Builder() {
            } 

            private Builder(Meta model) {
                this.agent = model.agent;
                this.config = model.config;
                this.initialConfigOptions = model.initialConfigOptions;
            } 

            /**
             * <p>The agent configuration for the session. Valid values are the results returned by the ListAgents operation.</p>
             */
            public Builder agent(Agent agent) {
                this.agent = agent;
                return this;
            }

            /**
             * <p>The session parameter settings, such as filter parameter settings based on the session source and session tags.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The advanced parameter settings for the agent execution environment.</p>
             */
            public Builder initialConfigOptions(InitialConfigOptions initialConfigOptions) {
                this.initialConfigOptions = initialConfigOptions;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentSessionRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Meta")
        private Meta meta;

        private Params(Builder builder) {
            this.meta = builder.meta;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return meta
         */
        public Meta getMeta() {
            return this.meta;
        }

        public static final class Builder {
            private Meta meta; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.meta = model.meta;
            } 

            /**
             * <p>The extended metadata that carries agent binding, session source, and tags.</p>
             */
            public Builder meta(Meta meta) {
                this.meta = meta;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
}
