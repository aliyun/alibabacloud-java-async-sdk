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
 * {@link UpdateExternalAgentResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateExternalAgentResponseBody</p>
 */
public class UpdateExternalAgentResponseBody extends TeaModel {
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

    private UpdateExternalAgentResponseBody(Builder builder) {
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

    public static UpdateExternalAgentResponseBody create() {
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

        private Builder(UpdateExternalAgentResponseBody model) {
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

        public UpdateExternalAgentResponseBody build() {
            return new UpdateExternalAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateExternalAgentResponseBody</p>
     */
    public static class EffectiveResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("matrixUserId")
        private String matrixUserId;

        @com.aliyun.core.annotation.NameInMap("personalRoomId")
        private String personalRoomId;

        @com.aliyun.core.annotation.NameInMap("runtimeAcceptStatus")
        private String runtimeAcceptStatus;

        @com.aliyun.core.annotation.NameInMap("runtimeId")
        private String runtimeId;

        @com.aliyun.core.annotation.NameInMap("runtimeRequestVersion")
        private Long runtimeRequestVersion;

        @com.aliyun.core.annotation.NameInMap("workspacePrefix")
        private String workspacePrefix;

        private EffectiveResult(Builder builder) {
            this.matrixUserId = builder.matrixUserId;
            this.personalRoomId = builder.personalRoomId;
            this.runtimeAcceptStatus = builder.runtimeAcceptStatus;
            this.runtimeId = builder.runtimeId;
            this.runtimeRequestVersion = builder.runtimeRequestVersion;
            this.workspacePrefix = builder.workspacePrefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectiveResult create() {
            return builder().build();
        }

        /**
         * @return matrixUserId
         */
        public String getMatrixUserId() {
            return this.matrixUserId;
        }

        /**
         * @return personalRoomId
         */
        public String getPersonalRoomId() {
            return this.personalRoomId;
        }

        /**
         * @return runtimeAcceptStatus
         */
        public String getRuntimeAcceptStatus() {
            return this.runtimeAcceptStatus;
        }

        /**
         * @return runtimeId
         */
        public String getRuntimeId() {
            return this.runtimeId;
        }

        /**
         * @return runtimeRequestVersion
         */
        public Long getRuntimeRequestVersion() {
            return this.runtimeRequestVersion;
        }

        /**
         * @return workspacePrefix
         */
        public String getWorkspacePrefix() {
            return this.workspacePrefix;
        }

        public static final class Builder {
            private String matrixUserId; 
            private String personalRoomId; 
            private String runtimeAcceptStatus; 
            private String runtimeId; 
            private Long runtimeRequestVersion; 
            private String workspacePrefix; 

            private Builder() {
            } 

            private Builder(EffectiveResult model) {
                this.matrixUserId = model.matrixUserId;
                this.personalRoomId = model.personalRoomId;
                this.runtimeAcceptStatus = model.runtimeAcceptStatus;
                this.runtimeId = model.runtimeId;
                this.runtimeRequestVersion = model.runtimeRequestVersion;
                this.workspacePrefix = model.workspacePrefix;
            } 

            /**
             * matrixUserId.
             */
            public Builder matrixUserId(String matrixUserId) {
                this.matrixUserId = matrixUserId;
                return this;
            }

            /**
             * personalRoomId.
             */
            public Builder personalRoomId(String personalRoomId) {
                this.personalRoomId = personalRoomId;
                return this;
            }

            /**
             * runtimeAcceptStatus.
             */
            public Builder runtimeAcceptStatus(String runtimeAcceptStatus) {
                this.runtimeAcceptStatus = runtimeAcceptStatus;
                return this;
            }

            /**
             * runtimeId.
             */
            public Builder runtimeId(String runtimeId) {
                this.runtimeId = runtimeId;
                return this;
            }

            /**
             * runtimeRequestVersion.
             */
            public Builder runtimeRequestVersion(Long runtimeRequestVersion) {
                this.runtimeRequestVersion = runtimeRequestVersion;
                return this;
            }

            /**
             * workspacePrefix.
             */
            public Builder workspacePrefix(String workspacePrefix) {
                this.workspacePrefix = workspacePrefix;
                return this;
            }

            public EffectiveResult build() {
                return new EffectiveResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateExternalAgentResponseBody</p>
     */
    public static class ExternalAgentStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("heartbeatStatus")
        private String heartbeatStatus;

        @com.aliyun.core.annotation.NameInMap("lastActiveAt")
        private String lastActiveAt;

        @com.aliyun.core.annotation.NameInMap("lastHeartbeat")
        private String lastHeartbeat;

        @com.aliyun.core.annotation.NameInMap("localIP")
        private String localIP;

        @com.aliyun.core.annotation.NameInMap("runtime")
        private String runtime;

        private ExternalAgentStatus(Builder builder) {
            this.heartbeatStatus = builder.heartbeatStatus;
            this.lastActiveAt = builder.lastActiveAt;
            this.lastHeartbeat = builder.lastHeartbeat;
            this.localIP = builder.localIP;
            this.runtime = builder.runtime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalAgentStatus create() {
            return builder().build();
        }

        /**
         * @return heartbeatStatus
         */
        public String getHeartbeatStatus() {
            return this.heartbeatStatus;
        }

        /**
         * @return lastActiveAt
         */
        public String getLastActiveAt() {
            return this.lastActiveAt;
        }

        /**
         * @return lastHeartbeat
         */
        public String getLastHeartbeat() {
            return this.lastHeartbeat;
        }

        /**
         * @return localIP
         */
        public String getLocalIP() {
            return this.localIP;
        }

        /**
         * @return runtime
         */
        public String getRuntime() {
            return this.runtime;
        }

        public static final class Builder {
            private String heartbeatStatus; 
            private String lastActiveAt; 
            private String lastHeartbeat; 
            private String localIP; 
            private String runtime; 

            private Builder() {
            } 

            private Builder(ExternalAgentStatus model) {
                this.heartbeatStatus = model.heartbeatStatus;
                this.lastActiveAt = model.lastActiveAt;
                this.lastHeartbeat = model.lastHeartbeat;
                this.localIP = model.localIP;
                this.runtime = model.runtime;
            } 

            /**
             * heartbeatStatus.
             */
            public Builder heartbeatStatus(String heartbeatStatus) {
                this.heartbeatStatus = heartbeatStatus;
                return this;
            }

            /**
             * lastActiveAt.
             */
            public Builder lastActiveAt(String lastActiveAt) {
                this.lastActiveAt = lastActiveAt;
                return this;
            }

            /**
             * lastHeartbeat.
             */
            public Builder lastHeartbeat(String lastHeartbeat) {
                this.lastHeartbeat = lastHeartbeat;
                return this;
            }

            /**
             * localIP.
             */
            public Builder localIP(String localIP) {
                this.localIP = localIP;
                return this;
            }

            /**
             * runtime.
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            public ExternalAgentStatus build() {
                return new ExternalAgentStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateExternalAgentResponseBody</p>
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
     * {@link UpdateExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateExternalAgentResponseBody</p>
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
     * {@link UpdateExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateExternalAgentResponseBody</p>
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
     * {@link UpdateExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateExternalAgentResponseBody</p>
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
     * {@link UpdateExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateExternalAgentResponseBody</p>
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
     * {@link UpdateExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateExternalAgentResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("effectiveResult")
        private EffectiveResult effectiveResult;

        @com.aliyun.core.annotation.NameInMap("effectiveSpecVersion")
        private Long effectiveSpecVersion;

        @com.aliyun.core.annotation.NameInMap("externalAgentStatus")
        private ExternalAgentStatus externalAgentStatus;

        @com.aliyun.core.annotation.NameInMap("instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("latestSpecVersion")
        private Long latestSpecVersion;

        @com.aliyun.core.annotation.NameInMap("latestVersionStatus")
        private String latestVersionStatus;

        @com.aliyun.core.annotation.NameInMap("model")
        private Model model;

        @com.aliyun.core.annotation.NameInMap("modelSource")
        private String modelSource;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("runtime")
        private String runtime;

        @com.aliyun.core.annotation.NameInMap("skills")
        private java.util.List<Skills> skills;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

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
            this.effectiveResult = builder.effectiveResult;
            this.effectiveSpecVersion = builder.effectiveSpecVersion;
            this.externalAgentStatus = builder.externalAgentStatus;
            this.instruction = builder.instruction;
            this.latestSpecVersion = builder.latestSpecVersion;
            this.latestVersionStatus = builder.latestVersionStatus;
            this.model = builder.model;
            this.modelSource = builder.modelSource;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.runtime = builder.runtime;
            this.skills = builder.skills;
            this.status = builder.status;
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
         * @return effectiveResult
         */
        public EffectiveResult getEffectiveResult() {
            return this.effectiveResult;
        }

        /**
         * @return effectiveSpecVersion
         */
        public Long getEffectiveSpecVersion() {
            return this.effectiveSpecVersion;
        }

        /**
         * @return externalAgentStatus
         */
        public ExternalAgentStatus getExternalAgentStatus() {
            return this.externalAgentStatus;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return runtime
         */
        public String getRuntime() {
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
            private EffectiveResult effectiveResult; 
            private Long effectiveSpecVersion; 
            private ExternalAgentStatus externalAgentStatus; 
            private String instruction; 
            private Long latestSpecVersion; 
            private String latestVersionStatus; 
            private Model model; 
            private String modelSource; 
            private String name; 
            private String regionId; 
            private String runtime; 
            private java.util.List<Skills> skills; 
            private String status; 
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
                this.effectiveResult = model.effectiveResult;
                this.effectiveSpecVersion = model.effectiveSpecVersion;
                this.externalAgentStatus = model.externalAgentStatus;
                this.instruction = model.instruction;
                this.latestSpecVersion = model.latestSpecVersion;
                this.latestVersionStatus = model.latestVersionStatus;
                this.model = model.model;
                this.modelSource = model.modelSource;
                this.name = model.name;
                this.regionId = model.regionId;
                this.runtime = model.runtime;
                this.skills = model.skills;
                this.status = model.status;
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
             * effectiveResult.
             */
            public Builder effectiveResult(EffectiveResult effectiveResult) {
                this.effectiveResult = effectiveResult;
                return this;
            }

            /**
             * effectiveSpecVersion.
             */
            public Builder effectiveSpecVersion(Long effectiveSpecVersion) {
                this.effectiveSpecVersion = effectiveSpecVersion;
                return this;
            }

            /**
             * externalAgentStatus.
             */
            public Builder externalAgentStatus(ExternalAgentStatus externalAgentStatus) {
                this.externalAgentStatus = externalAgentStatus;
                return this;
            }

            /**
             * instruction.
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
             * modelSource.
             */
            public Builder modelSource(String modelSource) {
                this.modelSource = modelSource;
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
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * runtime.
             */
            public Builder runtime(String runtime) {
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
