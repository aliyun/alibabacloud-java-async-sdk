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
 * {@link UpdateManagedAgentResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateManagedAgentResponseBody</p>
 */
public class UpdateManagedAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private UpdateManagedAgentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateManagedAgentResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UpdateManagedAgentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateManagedAgentResponseBody build() {
            return new UpdateManagedAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateManagedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateManagedAgentResponseBody</p>
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
     * {@link UpdateManagedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateManagedAgentResponseBody</p>
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
     * {@link UpdateManagedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateManagedAgentResponseBody</p>
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
     * {@link UpdateManagedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateManagedAgentResponseBody</p>
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
     * {@link UpdateManagedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateManagedAgentResponseBody</p>
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
     * {@link UpdateManagedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateManagedAgentResponseBody</p>
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
     * {@link UpdateManagedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateManagedAgentResponseBody</p>
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
     * {@link UpdateManagedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateManagedAgentResponseBody</p>
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
     * {@link UpdateManagedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateManagedAgentResponseBody</p>
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
     * {@link UpdateManagedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateManagedAgentResponseBody</p>
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
     * {@link UpdateManagedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateManagedAgentResponseBody</p>
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
     * {@link UpdateManagedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateManagedAgentResponseBody</p>
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
     * {@link UpdateManagedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateManagedAgentResponseBody</p>
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
     * {@link UpdateManagedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateManagedAgentResponseBody</p>
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
     * {@link UpdateManagedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateManagedAgentResponseBody</p>
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
     * {@link UpdateManagedAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateManagedAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("createMode")
        private String createMode;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("deployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("environment")
        private Environment environment;

        @com.aliyun.core.annotation.NameInMap("instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("latestSpecVersion")
        private Long latestSpecVersion;

        @com.aliyun.core.annotation.NameInMap("latestVersionStatus")
        private String latestVersionStatus;

        @com.aliyun.core.annotation.NameInMap("model")
        private Model model;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("network")
        private Network network;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("runtime")
        private Runtime runtime;

        @com.aliyun.core.annotation.NameInMap("skills")
        private java.util.List<Skills> skills;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subAgents")
        private java.util.List<SubAgents> subAgents;

        @com.aliyun.core.annotation.NameInMap("template")
        private Template template;

        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<Tools> tools;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.createMode = builder.createMode;
            this.createdAt = builder.createdAt;
            this.deployType = builder.deployType;
            this.description = builder.description;
            this.environment = builder.environment;
            this.instruction = builder.instruction;
            this.latestSpecVersion = builder.latestSpecVersion;
            this.latestVersionStatus = builder.latestVersionStatus;
            this.model = builder.model;
            this.name = builder.name;
            this.network = builder.network;
            this.regionId = builder.regionId;
            this.runtime = builder.runtime;
            this.skills = builder.skills;
            this.status = builder.status;
            this.subAgents = builder.subAgents;
            this.template = builder.template;
            this.tools = builder.tools;
            this.updatedAt = builder.updatedAt;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return createMode
         */
        public String getCreateMode() {
            return this.createMode;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
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
         * @return latestSpecVersion
         */
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        /**
         * @return latestVersionStatus
         */
        public String getLatestVersionStatus() {
            return this.latestVersionStatus;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
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

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String agentId; 
            private String createMode; 
            private String createdAt; 
            private String deployType; 
            private String description; 
            private Environment environment; 
            private String instruction; 
            private Long latestSpecVersion; 
            private String latestVersionStatus; 
            private Model model; 
            private String name; 
            private Network network; 
            private String regionId; 
            private Runtime runtime; 
            private java.util.List<Skills> skills; 
            private String status; 
            private java.util.List<SubAgents> subAgents; 
            private Template template; 
            private java.util.List<Tools> tools; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentId = model.agentId;
                this.createMode = model.createMode;
                this.createdAt = model.createdAt;
                this.deployType = model.deployType;
                this.description = model.description;
                this.environment = model.environment;
                this.instruction = model.instruction;
                this.latestSpecVersion = model.latestSpecVersion;
                this.latestVersionStatus = model.latestVersionStatus;
                this.model = model.model;
                this.name = model.name;
                this.network = model.network;
                this.regionId = model.regionId;
                this.runtime = model.runtime;
                this.skills = model.skills;
                this.status = model.status;
                this.subAgents = model.subAgents;
                this.template = model.template;
                this.tools = model.tools;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * agentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * createMode.
             */
            public Builder createMode(String createMode) {
                this.createMode = createMode;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * deployType.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
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
             * latestSpecVersion.
             */
            public Builder latestSpecVersion(Long latestSpecVersion) {
                this.latestSpecVersion = latestSpecVersion;
                return this;
            }

            /**
             * latestVersionStatus.
             */
            public Builder latestVersionStatus(String latestVersionStatus) {
                this.latestVersionStatus = latestVersionStatus;
                return this;
            }

            /**
             * model.
             */
            public Builder model(Model model) {
                this.model = model;
                return this;
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
             * network.
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * runtime.
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
             * status.
             */
            public Builder status(String status) {
                this.status = status;
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

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
