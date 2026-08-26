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
 * {@link CreateManagedAgentRequest} extends {@link RequestModel}
 *
 * <p>CreateManagedAgentRequest</p>
 */
public class CreateManagedAgentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateManagedAgentRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateManagedAgentRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateManagedAgentRequest create() {
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
    public CreateManagedAgentRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateManagedAgentRequest, Builder> {
        private String workspaceId; 
        private CreateManagedAgentRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateManagedAgentRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
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
         * body.
         */
        public Builder body(CreateManagedAgentRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateManagedAgentRequest build() {
            return new CreateManagedAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class CredentialReferences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("credentialId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cred-1</p>
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
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private Variables(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Variables model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>API_KEY</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-xxxx</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class Environment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("credentialReferences")
        private java.util.List<CredentialReferences> credentialReferences;

        @com.aliyun.core.annotation.NameInMap("variables")
        private java.util.List<Variables> variables;

        private Environment(Builder builder) {
            this.credentialReferences = builder.credentialReferences;
            this.variables = builder.variables;
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

        /**
         * @return variables
         */
        public java.util.List<Variables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private java.util.List<CredentialReferences> credentialReferences; 
            private java.util.List<Variables> variables; 

            private Builder() {
            } 

            private Builder(Environment model) {
                this.credentialReferences = model.credentialReferences;
                this.variables = model.variables;
            } 

            /**
             * credentialReferences.
             */
            public Builder credentialReferences(java.util.List<CredentialReferences> credentialReferences) {
                this.credentialReferences = credentialReferences;
                return this;
            }

            /**
             * variables.
             */
            public Builder variables(java.util.List<Variables> variables) {
                this.variables = variables;
                return this;
            }

            public Environment build() {
                return new Environment(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
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
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class AccessInternet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean enabled;

        private AccessInternet(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessInternet create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(AccessInternet model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public AccessInternet build() {
                return new AccessInternet(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class AccessVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean enabled;

        private AccessVpc(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessVpc create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(AccessVpc model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public AccessVpc build() {
                return new AccessVpc(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessInternet")
        private AccessInternet accessInternet;

        @com.aliyun.core.annotation.NameInMap("accessVpc")
        private AccessVpc accessVpc;

        private Network(Builder builder) {
            this.accessInternet = builder.accessInternet;
            this.accessVpc = builder.accessVpc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return accessInternet
         */
        public AccessInternet getAccessInternet() {
            return this.accessInternet;
        }

        /**
         * @return accessVpc
         */
        public AccessVpc getAccessVpc() {
            return this.accessVpc;
        }

        public static final class Builder {
            private AccessInternet accessInternet; 
            private AccessVpc accessVpc; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.accessInternet = model.accessInternet;
                this.accessVpc = model.accessVpc;
            } 

            /**
             * accessInternet.
             */
            public Builder accessInternet(AccessInternet accessInternet) {
                this.accessInternet = accessInternet;
                return this;
            }

            /**
             * accessVpc.
             */
            public Builder accessVpc(AccessVpc accessVpc) {
                this.accessVpc = accessVpc;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class Compute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("computeClass")
        @com.aliyun.core.annotation.Validation(required = true)
        private String computeClass;

        private Compute(Builder builder) {
            this.computeClass = builder.computeClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Compute create() {
            return builder().build();
        }

        /**
         * @return computeClass
         */
        public String getComputeClass() {
            return this.computeClass;
        }

        public static final class Builder {
            private String computeClass; 

            private Builder() {
            } 

            private Builder(Compute model) {
                this.computeClass = model.computeClass;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>STANDARD</p>
             */
            public Builder computeClass(String computeClass) {
                this.computeClass = computeClass;
                return this;
            }

            public Compute build() {
                return new Compute(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class SessionPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("headerName")
        private String headerName;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private SessionPolicy(Builder builder) {
            this.headerName = builder.headerName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionPolicy create() {
            return builder().build();
        }

        /**
         * @return headerName
         */
        public String getHeaderName() {
            return this.headerName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String headerName; 
            private String type; 

            private Builder() {
            } 

            private Builder(SessionPolicy model) {
                this.headerName = model.headerName;
                this.type = model.type;
            } 

            /**
             * headerName.
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DISABLED</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SessionPolicy build() {
                return new SessionPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class Runtime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("compute")
        @com.aliyun.core.annotation.Validation(required = true)
        private Compute compute;

        @com.aliyun.core.annotation.NameInMap("sessionPolicy")
        @com.aliyun.core.annotation.Validation(required = true)
        private SessionPolicy sessionPolicy;

        private Runtime(Builder builder) {
            this.compute = builder.compute;
            this.sessionPolicy = builder.sessionPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Runtime create() {
            return builder().build();
        }

        /**
         * @return compute
         */
        public Compute getCompute() {
            return this.compute;
        }

        /**
         * @return sessionPolicy
         */
        public SessionPolicy getSessionPolicy() {
            return this.sessionPolicy;
        }

        public static final class Builder {
            private Compute compute; 
            private SessionPolicy sessionPolicy; 

            private Builder() {
            } 

            private Builder(Runtime model) {
                this.compute = model.compute;
                this.sessionPolicy = model.sessionPolicy;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder compute(Compute compute) {
                this.compute = compute;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder sessionPolicy(SessionPolicy sessionPolicy) {
                this.sessionPolicy = sessionPolicy;
                return this;
            }

            public Runtime build() {
                return new Runtime(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
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
             * version.
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
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class SubAgents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instruction")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private SubAgents(Builder builder) {
            this.instruction = builder.instruction;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubAgents create() {
            return builder().build();
        }

        /**
         * @return instruction
         */
        public String getInstruction() {
            return this.instruction;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String instruction; 
            private String name; 

            private Builder() {
            } 

            private Builder(SubAgents model) {
                this.instruction = model.instruction;
                this.name = model.name;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>reviewer-agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SubAgents build() {
                return new SubAgents(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
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
             * version.
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
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
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
             * aiRegistry.
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
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
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
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class CreateManagedAgentRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("environment")
        private Environment environment;

        @com.aliyun.core.annotation.NameInMap("instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("model")
        @com.aliyun.core.annotation.Validation(required = true)
        private Model model;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("network")
        private Network network;

        @com.aliyun.core.annotation.NameInMap("runtime")
        @com.aliyun.core.annotation.Validation(required = true)
        private Runtime runtime;

        @com.aliyun.core.annotation.NameInMap("skills")
        private java.util.List<Skills> skills;

        @com.aliyun.core.annotation.NameInMap("subAgents")
        private java.util.List<SubAgents> subAgents;

        @com.aliyun.core.annotation.NameInMap("template")
        private Template template;

        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<Tools> tools;

        private CreateManagedAgentRequestBody(Builder builder) {
            this.description = builder.description;
            this.environment = builder.environment;
            this.instruction = builder.instruction;
            this.model = builder.model;
            this.name = builder.name;
            this.network = builder.network;
            this.runtime = builder.runtime;
            this.skills = builder.skills;
            this.subAgents = builder.subAgents;
            this.template = builder.template;
            this.tools = builder.tools;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateManagedAgentRequestBody create() {
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
        }

        /**
         * @return runtime
         */
        public Runtime getRuntime() {
            return this.runtime;
        }

        /**
         * @return skills
         */
        public java.util.List<Skills> getSkills() {
            return this.skills;
        }

        /**
         * @return subAgents
         */
        public java.util.List<SubAgents> getSubAgents() {
            return this.subAgents;
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
            private String name; 
            private Network network; 
            private Runtime runtime; 
            private java.util.List<Skills> skills; 
            private java.util.List<SubAgents> subAgents; 
            private Template template; 
            private java.util.List<Tools> tools; 

            private Builder() {
            } 

            private Builder(CreateManagedAgentRequestBody model) {
                this.description = model.description;
                this.environment = model.environment;
                this.instruction = model.instruction;
                this.model = model.model;
                this.name = model.name;
                this.network = model.network;
                this.runtime = model.runtime;
                this.skills = model.skills;
                this.subAgents = model.subAgents;
                this.template = model.template;
                this.tools = model.tools;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * environment.
             */
            public Builder environment(Environment environment) {
                this.environment = environment;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder model(Model model) {
                this.model = model;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * network.
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder runtime(Runtime runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * skills.
             */
            public Builder skills(java.util.List<Skills> skills) {
                this.skills = skills;
                return this;
            }

            /**
             * subAgents.
             */
            public Builder subAgents(java.util.List<SubAgents> subAgents) {
                this.subAgents = subAgents;
                return this;
            }

            /**
             * template.
             */
            public Builder template(Template template) {
                this.template = template;
                return this;
            }

            /**
             * tools.
             */
            public Builder tools(java.util.List<Tools> tools) {
                this.tools = tools;
                return this;
            }

            public CreateManagedAgentRequestBody build() {
                return new CreateManagedAgentRequestBody(this);
            } 

        } 

    }
}
