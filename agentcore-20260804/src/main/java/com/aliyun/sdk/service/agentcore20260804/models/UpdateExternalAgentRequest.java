// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link UpdateExternalAgentRequest} extends {@link RequestModel}
 *
 * <p>UpdateExternalAgentRequest</p>
 */
public class UpdateExternalAgentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateExternalAgentRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateExternalAgentRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentId = builder.agentId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExternalAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return body
     */
    public UpdateExternalAgentRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateExternalAgentRequest, Builder> {
        private String workspaceId; 
        private String agentId; 
        private UpdateExternalAgentRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExternalAgentRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentId = request.agentId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The external agent ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1</p>
         */
        public Builder agentId(String agentId) {
            this.putPathParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The request body.</p>
         */
        public Builder body(UpdateExternalAgentRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>A reserved idempotency token. The backend does not guarantee idempotency in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>client-token-1</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateExternalAgentRequest build() {
            return new UpdateExternalAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateExternalAgentRequest} extends {@link TeaModel}
     *
     * <p>UpdateExternalAgentRequest</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelConnectionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String modelConnectionId;

        @com.aliyun.core.annotation.NameInMap("modelName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String modelName;

        private Model(Builder builder) {
            this.modelConnectionId = builder.modelConnectionId;
            this.modelName = builder.modelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return modelConnectionId
         */
        public String getModelConnectionId() {
            return this.modelConnectionId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        public static final class Builder {
            private String modelConnectionId; 
            private String modelName; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.modelConnectionId = model.modelConnectionId;
                this.modelName = model.modelName;
            } 

            /**
             * <p>The model connection ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mc-1</p>
             */
            public Builder modelConnectionId(String modelConnectionId) {
                this.modelConnectionId = modelConnectionId;
                return this;
            }

            /**
             * <p>The upstream model name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-max</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateExternalAgentRequest} extends {@link TeaModel}
     *
     * <p>UpdateExternalAgentRequest</p>
     */
    public static class Skills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Skills(Builder builder) {
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skills create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * <p>The skill name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>code-analysis</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The skill version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Skills build() {
                return new Skills(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateExternalAgentRequest} extends {@link TeaModel}
     *
     * <p>UpdateExternalAgentRequest</p>
     */
    public static class AiRegistry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private AiRegistry(Builder builder) {
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiRegistry create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(AiRegistry model) {
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * <p>The name of the template in AI Registry.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>code-review-template</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version of the template in AI Registry.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public AiRegistry build() {
                return new AiRegistry(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateExternalAgentRequest} extends {@link TeaModel}
     *
     * <p>UpdateExternalAgentRequest</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aiRegistry")
        private AiRegistry aiRegistry;

        private Template(Builder builder) {
            this.aiRegistry = builder.aiRegistry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return aiRegistry
         */
        public AiRegistry getAiRegistry() {
            return this.aiRegistry;
        }

        public static final class Builder {
            private AiRegistry aiRegistry; 

            private Builder() {
            } 

            private Builder(Template model) {
                this.aiRegistry = model.aiRegistry;
            } 

            /**
             * <p>The AI Registry template configuration.</p>
             */
            public Builder aiRegistry(AiRegistry aiRegistry) {
                this.aiRegistry = aiRegistry;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateExternalAgentRequest} extends {@link TeaModel}
     *
     * <p>UpdateExternalAgentRequest</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Tools(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
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
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The tool name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>code-reviewer</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The tool type. Valid values:</p>
             * <ul>
             * <li>MCP: MCP tool.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MCP</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateExternalAgentRequest} extends {@link TeaModel}
     *
     * <p>UpdateExternalAgentRequest</p>
     */
    public static class UpdateExternalAgentRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("model")
        private Model model;

        @com.aliyun.core.annotation.NameInMap("modelSource")
        private String modelSource;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("skills")
        private java.util.List<Skills> skills;

        @com.aliyun.core.annotation.NameInMap("template")
        private Template template;

        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<Tools> tools;

        private UpdateExternalAgentRequestBody(Builder builder) {
            this.description = builder.description;
            this.instruction = builder.instruction;
            this.model = builder.model;
            this.modelSource = builder.modelSource;
            this.name = builder.name;
            this.skills = builder.skills;
            this.template = builder.template;
            this.tools = builder.tools;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateExternalAgentRequestBody create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instruction
         */
        public String getInstruction() {
            return this.instruction;
        }

        /**
         * @return model
         */
        public Model getModel() {
            return this.model;
        }

        /**
         * @return modelSource
         */
        public String getModelSource() {
            return this.modelSource;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skills
         */
        public java.util.List<Skills> getSkills() {
            return this.skills;
        }

        /**
         * @return template
         */
        public Template getTemplate() {
            return this.template;
        }

        /**
         * @return tools
         */
        public java.util.List<Tools> getTools() {
            return this.tools;
        }

        public static final class Builder {
            private String description; 
            private String instruction; 
            private Model model; 
            private String modelSource; 
            private String name; 
            private java.util.List<Skills> skills; 
            private Template template; 
            private java.util.List<Tools> tools; 

            private Builder() {
            } 

            private Builder(UpdateExternalAgentRequestBody model) {
                this.description = model.description;
                this.instruction = model.instruction;
                this.model = model.model;
                this.modelSource = model.modelSource;
                this.name = model.name;
                this.skills = model.skills;
                this.template = model.template;
                this.tools = model.tools;
            } 

            /**
             * <p>The description of the external agent.</p>
             * 
             * <strong>example:</strong>
             * <p>A code review agent running in the user environment</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The agent instruction that guides the behavior of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>You are a code review assistant</p>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>The model configuration. This parameter is available only when modelSource is set to PLATFORM.</p>
             */
            public Builder model(Model model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The source of the model configuration. Valid values:</p>
             * <ul>
             * <li>PLATFORM: The model configuration is parsed and distributed by the platform. You can specify the model parameter.</li>
             * <li>RUNTIME: The model is managed by the external runtime. You cannot specify the model parameter at the same time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PLATFORM</p>
             */
            public Builder modelSource(String modelSource) {
                this.modelSource = modelSource;
                return this;
            }

            /**
             * <p>The name of the external agent.</p>
             * 
             * <strong>example:</strong>
             * <p>my-external-agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of skill configurations.</p>
             */
            public Builder skills(java.util.List<Skills> skills) {
                this.skills = skills;
                return this;
            }

            /**
             * <p>The agent template configuration.</p>
             */
            public Builder template(Template template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The list of tool configurations.</p>
             */
            public Builder tools(java.util.List<Tools> tools) {
                this.tools = tools;
                return this;
            }

            public UpdateExternalAgentRequestBody build() {
                return new UpdateExternalAgentRequestBody(this);
            } 

        } 

    }
}
