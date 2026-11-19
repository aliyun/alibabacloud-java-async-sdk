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
 * {@link CreateExternalAgentRequest} extends {@link RequestModel}
 *
 * <p>CreateExternalAgentRequest</p>
 */
public class CreateExternalAgentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateExternalAgentRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateExternalAgentRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExternalAgentRequest create() {
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
     * @return body
     */
    public CreateExternalAgentRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateExternalAgentRequest, Builder> {
        private String workspaceId; 
        private CreateExternalAgentRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateExternalAgentRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
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
         * <p>The request body.</p>
         */
        public Builder body(CreateExternalAgentRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>The reserved query parameter. The backend does not provide idempotency guarantees for deduplication or restoring the original acceptance result based on this identifier at this time.</p>
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
        public CreateExternalAgentRequest build() {
            return new CreateExternalAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateExternalAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateExternalAgentRequest</p>
     */
    public static class CredentialReferences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("credentialId")
        private String credentialId;

        private CredentialReferences(Builder builder) {
            this.credentialId = builder.credentialId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CredentialReferences create() {
            return builder().build();
        }

        /**
         * @return credentialId
         */
        public String getCredentialId() {
            return this.credentialId;
        }

        public static final class Builder {
            private String credentialId; 

            private Builder() {
            } 

            private Builder(CredentialReferences model) {
                this.credentialId = model.credentialId;
            } 

            /**
             * <p>Required when a credential reference item is passed. Validated by the backend.</p>
             * 
             * <strong>example:</strong>
             * <p>cred-example</p>
             */
            public Builder credentialId(String credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            public CredentialReferences build() {
                return new CredentialReferences(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateExternalAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateExternalAgentRequest</p>
     */
    public static class Environment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("credentialReferences")
        private java.util.List<CredentialReferences> credentialReferences;

        private Environment(Builder builder) {
            this.credentialReferences = builder.credentialReferences;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Environment create() {
            return builder().build();
        }

        /**
         * @return credentialReferences
         */
        public java.util.List<CredentialReferences> getCredentialReferences() {
            return this.credentialReferences;
        }

        public static final class Builder {
            private java.util.List<CredentialReferences> credentialReferences; 

            private Builder() {
            } 

            private Builder(Environment model) {
                this.credentialReferences = model.credentialReferences;
            } 

            /**
             * <p>This list must be explicitly provided and cannot be null when the environment object is passed. The list is replaced as a whole. If environment is not passed during an update, the original binding is retained. If an empty list is passed or environment is null, the binding is cleared. Only the credential ID is passed, not the actual secret key.</p>
             */
            public Builder credentialReferences(java.util.List<CredentialReferences> credentialReferences) {
                this.credentialReferences = credentialReferences;
                return this;
            }

            public Environment build() {
                return new Environment(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateExternalAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateExternalAgentRequest</p>
     */
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("limitType")
        private String limitType;

        @com.aliyun.core.annotation.NameInMap("periodType")
        private String periodType;

        @com.aliyun.core.annotation.NameInMap("usageLimit")
        private Long usageLimit;

        private Quota(Builder builder) {
            this.enabled = builder.enabled;
            this.limitType = builder.limitType;
            this.periodType = builder.periodType;
            this.usageLimit = builder.usageLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return limitType
         */
        public String getLimitType() {
            return this.limitType;
        }

        /**
         * @return periodType
         */
        public String getPeriodType() {
            return this.periodType;
        }

        /**
         * @return usageLimit
         */
        public Long getUsageLimit() {
            return this.usageLimit;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String limitType; 
            private String periodType; 
            private Long usageLimit; 

            private Builder() {
            } 

            private Builder(Quota model) {
                this.enabled = model.enabled;
                this.limitType = model.limitType;
                this.periodType = model.periodType;
                this.usageLimit = model.usageLimit;
            } 

            /**
             * <p>Specifies whether to enable the token quota. Defaults to true if not specified. Passing false disables and deletes existing quota rules.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The quota limit type. Required and validated by the backend when the quota is enabled. Fixed value: token.</p>
             * 
             * <strong>example:</strong>
             * <p>token</p>
             */
            public Builder limitType(String limitType) {
                this.limitType = limitType;
                return this;
            }

            /**
             * <p>The quota statistical period. Required and validated by the backend when the quota is enabled. Valid values: day (daily) and month (monthly).</p>
             * 
             * <strong>example:</strong>
             * <p>day</p>
             */
            public Builder periodType(String periodType) {
                this.periodType = periodType;
                return this;
            }

            /**
             * <p>The maximum number of tokens allowed to be consumed in a single period. Required and validated by the backend when the quota is enabled, and must be greater than 0.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000</p>
             */
            public Builder usageLimit(Long usageLimit) {
                this.usageLimit = usageLimit;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateExternalAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateExternalAgentRequest</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelConnectionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String modelConnectionId;

        @com.aliyun.core.annotation.NameInMap("modelName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("quota")
        private Quota quota;

        private Model(Builder builder) {
            this.modelConnectionId = builder.modelConnectionId;
            this.modelName = builder.modelName;
            this.quota = builder.quota;
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

        /**
         * @return quota
         */
        public Quota getQuota() {
            return this.quota;
        }

        public static final class Builder {
            private String modelConnectionId; 
            private String modelName; 
            private Quota quota; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.modelConnectionId = model.modelConnectionId;
                this.modelName = model.modelName;
                this.quota = model.quota;
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

            /**
             * <p>The model token quota configuration. If not passed, no quota is configured.</p>
             */
            public Builder quota(Quota quota) {
                this.quota = quota;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateExternalAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateExternalAgentRequest</p>
     */
    public static class VersionSelector extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private VersionSelector(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionSelector create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(VersionSelector model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The version selector type. LABEL selects by tag. VERSION selects by specific version.</p>
             * 
             * <strong>example:</strong>
             * <p>LABEL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The selector value. For LABEL, it is the tag name (such as latest). For VERSION, it is the specific version number.</p>
             * 
             * <strong>example:</strong>
             * <p>latest</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public VersionSelector build() {
                return new VersionSelector(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateExternalAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateExternalAgentRequest</p>
     */
    public static class Skills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("versionSelector")
        private VersionSelector versionSelector;

        private Skills(Builder builder) {
            this.name = builder.name;
            this.sourceType = builder.sourceType;
            this.version = builder.version;
            this.versionSelector = builder.versionSelector;
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
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionSelector
         */
        public VersionSelector getVersionSelector() {
            return this.versionSelector;
        }

        public static final class Builder {
            private String name; 
            private String sourceType; 
            private String version; 
            private VersionSelector versionSelector; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.name = model.name;
                this.sourceType = model.sourceType;
                this.version = model.version;
                this.versionSelector = model.versionSelector;
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
             * <p>The skill source type. REFERENCE references the AI Registry. STATIC is statically provided with the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>REFERENCE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The skill version field for compatibility with legacy requests. Use sourceType and versionSelector for new requests. Do not submit it in combination with sourceType.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The skill reference version selector. Supports LABEL tags and VERSION specific versions. Defaults to LABEL/latest if omitted. Selectors are not provided for STATIC sources.</p>
             */
            public Builder versionSelector(VersionSelector versionSelector) {
                this.versionSelector = versionSelector;
                return this;
            }

            public Skills build() {
                return new Skills(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateExternalAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateExternalAgentRequest</p>
     */
    public static class AiRegistry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("version")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The name of the template in the AI Registry.</p>
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
             * <p>The version of the template in the AI Registry.</p>
             * <p>This parameter is required.</p>
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
     * {@link CreateExternalAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateExternalAgentRequest</p>
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
     * {@link CreateExternalAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateExternalAgentRequest</p>
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
             * <p>The tool type. Valid values: MCP (MCP tool).</p>
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
     * {@link CreateExternalAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateExternalAgentRequest</p>
     */
    public static class CreateExternalAgentRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("environment")
        private Environment environment;

        @com.aliyun.core.annotation.NameInMap("instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("model")
        private Model model;

        @com.aliyun.core.annotation.NameInMap("modelSource")
        private String modelSource;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("skills")
        private java.util.List<Skills> skills;

        @com.aliyun.core.annotation.NameInMap("template")
        private Template template;

        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<Tools> tools;

        private CreateExternalAgentRequestBody(Builder builder) {
            this.description = builder.description;
            this.environment = builder.environment;
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

        public static CreateExternalAgentRequestBody create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return environment
         */
        public Environment getEnvironment() {
            return this.environment;
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
            private Environment environment; 
            private String instruction; 
            private Model model; 
            private String modelSource; 
            private String name; 
            private java.util.List<Skills> skills; 
            private Template template; 
            private java.util.List<Tools> tools; 

            private Builder() {
            } 

            private Builder(CreateExternalAgentRequestBody model) {
                this.description = model.description;
                this.environment = model.environment;
                this.instruction = model.instruction;
                this.model = model.model;
                this.modelSource = model.modelSource;
                this.name = model.name;
                this.skills = model.skills;
                this.template = model.template;
                this.tools = model.tools;
            } 

            /**
             * <p>The description of the managed agent.</p>
             * 
             * <strong>example:</strong>
             * <p>Code review agent running in the user environment</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Optional. Credentials can be bound to both PLATFORM and RUNTIME model sources. When passing the object, you must explicitly provide a non-null credentialReferences list. Common environment variables are not supported.</p>
             */
            public Builder environment(Environment environment) {
                this.environment = environment;
                return this;
            }

            /**
             * <p>The agent instruction, used to guide the behavior of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>You are a code review assistant</p>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>The model configuration. Available only when modelSource is PLATFORM.</p>
             */
            public Builder model(Model model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The source of the model configuration. PLATFORM indicates that the platform parses and delivers the model configuration. RUNTIME indicates that the external runtime manages the model itself, and the model parameter cannot be passed at the same time. Valid values: PLATFORM (platform model) and RUNTIME (runtime model).</p>
             * 
             * <strong>example:</strong>
             * <p>PLATFORM</p>
             */
            public Builder modelSource(String modelSource) {
                this.modelSource = modelSource;
                return this;
            }

            /**
             * <p>The name of the managed agent.</p>
             * <p>This parameter is required.</p>
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

            public CreateExternalAgentRequestBody build() {
                return new CreateExternalAgentRequestBody(this);
            } 

        } 

    }
}
