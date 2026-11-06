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
 * {@link GetAgentResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentResponseBody</p>
 */
public class GetAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Agent")
    private Agent agent;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAgentResponseBody(Builder builder) {
        this.agent = builder.agent;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agent
     */
    public Agent getAgent() {
        return this.agent;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Agent agent; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAgentResponseBody model) {
            this.agent = model.agent;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the created agent.</p>
         */
        public Builder agent(Agent agent) {
            this.agent = agent;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAgentResponseBody build() {
            return new GetAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentResponseBody</p>
     */
    public static class CallableAgents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private CallableAgents(Builder builder) {
            this.displayName = builder.displayName;
            this.name = builder.name;
            this.source = builder.source;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallableAgents create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String displayName; 
            private String name; 
            private String source; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(CallableAgents model) {
                this.displayName = model.displayName;
                this.name = model.name;
                this.source = model.source;
                this.version = model.version;
            } 

            /**
             * <p>The display name of the sub-agent.</p>
             * 
             * <strong>example:</strong>
             * <p>Sub-assistant</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The name of the sub-agent.</p>
             * 
             * <strong>example:</strong>
             * <p>sub-agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The source of the sub-agent.</p>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The version number of the sub-agent.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public CallableAgents build() {
                return new CallableAgents(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentResponseBody</p>
     */
    public static class ExpertSuites extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PackageVersion")
        private String packageVersion;

        @com.aliyun.core.annotation.NameInMap("SemanticVersion")
        private String semanticVersion;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SuiteId")
        private String suiteId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        @com.aliyun.core.annotation.NameInMap("VersionSelector")
        private String versionSelector;

        private ExpertSuites(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.name = builder.name;
            this.packageVersion = builder.packageVersion;
            this.semanticVersion = builder.semanticVersion;
            this.source = builder.source;
            this.suiteId = builder.suiteId;
            this.version = builder.version;
            this.versionSelector = builder.versionSelector;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpertSuites create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return packageVersion
         */
        public String getPackageVersion() {
            return this.packageVersion;
        }

        /**
         * @return semanticVersion
         */
        public String getSemanticVersion() {
            return this.semanticVersion;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return suiteId
         */
        public String getSuiteId() {
            return this.suiteId;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        /**
         * @return versionSelector
         */
        public String getVersionSelector() {
            return this.versionSelector;
        }

        public static final class Builder {
            private String description; 
            private String displayName; 
            private String name; 
            private String packageVersion; 
            private String semanticVersion; 
            private String source; 
            private String suiteId; 
            private Integer version; 
            private String versionSelector; 

            private Builder() {
            } 

            private Builder(ExpertSuites model) {
                this.description = model.description;
                this.displayName = model.displayName;
                this.name = model.name;
                this.packageVersion = model.packageVersion;
                this.semanticVersion = model.semanticVersion;
                this.source = model.source;
                this.suiteId = model.suiteId;
                this.version = model.version;
                this.versionSelector = model.versionSelector;
            } 

            /**
             * <p>If the suite is deleted, the published snapshot is missing, or the caller does not have permission to view it, the suite summary is not returned, and only the ID and version number are retained.</p>
             * 
             * <strong>example:</strong>
             * <p>Data analytics expert capability set</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the bound version.</p>
             * 
             * <strong>example:</strong>
             * <p>Data analytics expert suite</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The suite name of the bound version.</p>
             * 
             * <strong>example:</strong>
             * <p>analysis-suite</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Returns the fixed official artifact version when explicitly querying a published version of the agent. Not returned when querying a draft or a custom suite.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1.0.202610211408</p>
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * <p>An optional suite summary field that is not returned by current new DataAgent applications. A missing value does not indicate version 0. This field cannot be used as the Version for UpdateAgent and must be omitted when writing back references. For the fixed version of official artifacts, read PackageVersion.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.0</p>
             */
            public Builder semanticVersion(String semanticVersion) {
                this.semanticVersion = semanticVersion;
                return this;
            }

            /**
             * <p>OFFICIAL indicates an official catalog resource. Omitted or DB indicates a personal or enterprise resource.</p>
             * 
             * <strong>example:</strong>
             * <p>OFFICIAL</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The ID of the expert suite.</p>
             * 
             * <strong>example:</strong>
             * <p>suite_example</p>
             */
            public Builder suiteId(String suiteId) {
                this.suiteId = suiteId;
                return this;
            }

            /**
             * <p>Returned only when a personal or enterprise suite explicitly specifies a fixed integer version in the reference. Not returned for official suites. A missing value is not 0. If the SDK initializes a missing integer to 0, it must be omitted when writing back. For official items, only Source and SuiteId are written back, and Version, VersionSelector, SemanticVersion, or PackageVersion are not passed.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * <p>Returned only for personal or enterprise resources to indicate the saved version selection policy, which is mutually exclusive with the fixed integer Version. It does not represent the specific revision actually loaded in the session. Not returned for official resources.</p>
             * 
             * <strong>example:</strong>
             * <p>^1.2.3</p>
             */
            public Builder versionSelector(String versionSelector) {
                this.versionSelector = versionSelector;
                return this;
            }

            public ExpertSuites build() {
                return new ExpertSuites(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private java.util.Map<String, ?> config;

        @com.aliyun.core.annotation.NameInMap("MaxTokens")
        private Integer maxTokens;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("Stream")
        private Boolean stream;

        @com.aliyun.core.annotation.NameInMap("Temperature")
        private Double temperature;

        @com.aliyun.core.annotation.NameInMap("TopP")
        private Double topP;

        private Model(Builder builder) {
            this.config = builder.config;
            this.maxTokens = builder.maxTokens;
            this.modelName = builder.modelName;
            this.stream = builder.stream;
            this.temperature = builder.temperature;
            this.topP = builder.topP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        /**
         * @return maxTokens
         */
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return stream
         */
        public Boolean getStream() {
            return this.stream;
        }

        /**
         * @return temperature
         */
        public Double getTemperature() {
            return this.temperature;
        }

        /**
         * @return topP
         */
        public Double getTopP() {
            return this.topP;
        }

        public static final class Builder {
            private java.util.Map<String, ?> config; 
            private Integer maxTokens; 
            private String modelName; 
            private Boolean stream; 
            private Double temperature; 
            private Double topP; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.config = model.config;
                this.maxTokens = model.maxTokens;
                this.modelName = model.modelName;
                this.stream = model.stream;
                this.temperature = model.temperature;
                this.topP = model.topP;
            } 

            /**
             * <p>The additional configuration of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder config(java.util.Map<String, ?> config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The maximum number of output tokens per request.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder maxTokens(Integer maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * <p>The name of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3-max</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>Specifies whether to use streaming output.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder stream(Boolean stream) {
                this.stream = stream;
                return this;
            }

            /**
             * <p>The sampling temperature.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder temperature(Double temperature) {
                this.temperature = temperature;
                return this;
            }

            /**
             * <p>The top-P value for nucleus sampling.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder topP(Double topP) {
                this.topP = topP;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentResponseBody</p>
     */
    public static class Skills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PackageVersion")
        private String packageVersion;

        @com.aliyun.core.annotation.NameInMap("SkillId")
        private String skillId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        @com.aliyun.core.annotation.NameInMap("VersionSelector")
        private String versionSelector;

        private Skills(Builder builder) {
            this.name = builder.name;
            this.packageVersion = builder.packageVersion;
            this.skillId = builder.skillId;
            this.source = builder.source;
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
         * @return packageVersion
         */
        public String getPackageVersion() {
            return this.packageVersion;
        }

        /**
         * @return skillId
         */
        public String getSkillId() {
            return this.skillId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        /**
         * @return versionSelector
         */
        public String getVersionSelector() {
            return this.versionSelector;
        }

        public static final class Builder {
            private String name; 
            private String packageVersion; 
            private String skillId; 
            private String source; 
            private Integer version; 
            private String versionSelector; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.name = model.name;
                this.packageVersion = model.packageVersion;
                this.skillId = model.skillId;
                this.source = model.source;
                this.version = model.version;
                this.versionSelector = model.versionSelector;
            } 

            /**
             * <p>The name of the skill.</p>
             * 
             * <strong>example:</strong>
             * <p>my-skill</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Returns the fixed official artifact version when querying a published snapshot with a specified AgentVersion. Not returned when querying a draft or a custom skill.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6.0.202608201110</p>
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * <p>The ID of the official skill.</p>
             * 
             * <strong>example:</strong>
             * <p>dataworks-semantic</p>
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * <p>OFFICIAL indicates an official catalog resource. Omitted or DB indicates an original personal or enterprise resource.</p>
             * 
             * <strong>example:</strong>
             * <p>OFFICIAL</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The version number of the skill.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * <p>Returned only for personal or enterprise resources to indicate the saved version selection policy, which is mutually exclusive with the fixed integer Version. It does not represent the specific revision actually loaded in the session. Not returned for official resources.</p>
             * 
             * <strong>example:</strong>
             * <p>^1.2.3</p>
             */
            public Builder versionSelector(String versionSelector) {
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
     * {@link GetAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentResponseBody</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuiltinName")
        private String builtinName;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("McpItems")
        private java.util.List<String> mcpItems;

        @com.aliyun.core.annotation.NameInMap("McpServerName")
        private String mcpServerName;

        private Tools(Builder builder) {
            this.builtinName = builder.builtinName;
            this.kind = builder.kind;
            this.mcpItems = builder.mcpItems;
            this.mcpServerName = builder.mcpServerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return builtinName
         */
        public String getBuiltinName() {
            return this.builtinName;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return mcpItems
         */
        public java.util.List<String> getMcpItems() {
            return this.mcpItems;
        }

        /**
         * @return mcpServerName
         */
        public String getMcpServerName() {
            return this.mcpServerName;
        }

        public static final class Builder {
            private String builtinName; 
            private String kind; 
            private java.util.List<String> mcpItems; 
            private String mcpServerName; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.builtinName = model.builtinName;
                this.kind = model.kind;
                this.mcpItems = model.mcpItems;
                this.mcpServerName = model.mcpServerName;
            } 

            /**
             * <p><strong>The name of the built-in tool. Valid when Kind is builtin.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>builtin_sql</p>
             */
            public Builder builtinName(String builtinName) {
                this.builtinName = builtinName;
                return this;
            }

            /**
             * <p><strong>The tool type.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>builtin</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p><strong>The selected MCP tool items. Valid when Kind is mcp.</strong></p>
             */
            public Builder mcpItems(java.util.List<String> mcpItems) {
                this.mcpItems = mcpItems;
                return this;
            }

            /**
             * <p><strong>The name of the associated MCP server. Valid when Kind is mcp.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>server-name</p>
             */
            public Builder mcpServerName(String mcpServerName) {
                this.mcpServerName = mcpServerName;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentResponseBody</p>
     */
    public static class VisibilityScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProjectIds")
        private java.util.List<String> projectIds;

        @com.aliyun.core.annotation.NameInMap("UserIds")
        private java.util.List<String> userIds;

        private VisibilityScope(Builder builder) {
            this.projectIds = builder.projectIds;
            this.userIds = builder.userIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisibilityScope create() {
            return builder().build();
        }

        /**
         * @return projectIds
         */
        public java.util.List<String> getProjectIds() {
            return this.projectIds;
        }

        /**
         * @return userIds
         */
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

        public static final class Builder {
            private java.util.List<String> projectIds; 
            private java.util.List<String> userIds; 

            private Builder() {
            } 

            private Builder(VisibilityScope model) {
                this.projectIds = model.projectIds;
                this.userIds = model.userIds;
            } 

            /**
             * <p>The list of visible project IDs.</p>
             */
            public Builder projectIds(java.util.List<String> projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * <p>The list of visible user IDs.</p>
             */
            public Builder userIds(java.util.List<String> userIds) {
                this.userIds = userIds;
                return this;
            }

            public VisibilityScope build() {
                return new VisibilityScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentResponseBody</p>
     */
    public static class Agent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentVersion")
        private Integer agentVersion;

        @com.aliyun.core.annotation.NameInMap("CallableAgents")
        private java.util.List<CallableAgents> callableAgents;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("ExpertSuites")
        private java.util.List<ExpertSuites> expertSuites;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private Long gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private Long gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("Model")
        private Model model;

        @com.aliyun.core.annotation.NameInMap("ModifierId")
        private String modifierId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RequiredRuntime")
        private java.util.List<String> requiredRuntime;

        @com.aliyun.core.annotation.NameInMap("Skills")
        private java.util.List<Skills> skills;

        @com.aliyun.core.annotation.NameInMap("SystemPrompt")
        private String systemPrompt;

        @com.aliyun.core.annotation.NameInMap("Tools")
        private java.util.List<Tools> tools;

        @com.aliyun.core.annotation.NameInMap("Visibility")
        private String visibility;

        @com.aliyun.core.annotation.NameInMap("VisibilityScope")
        private VisibilityScope visibilityScope;

        private Agent(Builder builder) {
            this.agentVersion = builder.agentVersion;
            this.callableAgents = builder.callableAgents;
            this.creatorId = builder.creatorId;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.expertSuites = builder.expertSuites;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.metadata = builder.metadata;
            this.model = builder.model;
            this.modifierId = builder.modifierId;
            this.name = builder.name;
            this.requiredRuntime = builder.requiredRuntime;
            this.skills = builder.skills;
            this.systemPrompt = builder.systemPrompt;
            this.tools = builder.tools;
            this.visibility = builder.visibility;
            this.visibilityScope = builder.visibilityScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agent create() {
            return builder().build();
        }

        /**
         * @return agentVersion
         */
        public Integer getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return callableAgents
         */
        public java.util.List<CallableAgents> getCallableAgents() {
            return this.callableAgents;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return expertSuites
         */
        public java.util.List<ExpertSuites> getExpertSuites() {
            return this.expertSuites;
        }

        /**
         * @return gmtCreateTime
         */
        public Long getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public Long getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return model
         */
        public Model getModel() {
            return this.model;
        }

        /**
         * @return modifierId
         */
        public String getModifierId() {
            return this.modifierId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return requiredRuntime
         */
        public java.util.List<String> getRequiredRuntime() {
            return this.requiredRuntime;
        }

        /**
         * @return skills
         */
        public java.util.List<Skills> getSkills() {
            return this.skills;
        }

        /**
         * @return systemPrompt
         */
        public String getSystemPrompt() {
            return this.systemPrompt;
        }

        /**
         * @return tools
         */
        public java.util.List<Tools> getTools() {
            return this.tools;
        }

        /**
         * @return visibility
         */
        public String getVisibility() {
            return this.visibility;
        }

        /**
         * @return visibilityScope
         */
        public VisibilityScope getVisibilityScope() {
            return this.visibilityScope;
        }

        public static final class Builder {
            private Integer agentVersion; 
            private java.util.List<CallableAgents> callableAgents; 
            private String creatorId; 
            private String description; 
            private String displayName; 
            private java.util.List<ExpertSuites> expertSuites; 
            private Long gmtCreateTime; 
            private Long gmtModifiedTime; 
            private java.util.Map<String, ?> metadata; 
            private Model model; 
            private String modifierId; 
            private String name; 
            private java.util.List<String> requiredRuntime; 
            private java.util.List<Skills> skills; 
            private String systemPrompt; 
            private java.util.List<Tools> tools; 
            private String visibility; 
            private VisibilityScope visibilityScope; 

            private Builder() {
            } 

            private Builder(Agent model) {
                this.agentVersion = model.agentVersion;
                this.callableAgents = model.callableAgents;
                this.creatorId = model.creatorId;
                this.description = model.description;
                this.displayName = model.displayName;
                this.expertSuites = model.expertSuites;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.metadata = model.metadata;
                this.model = model.model;
                this.modifierId = model.modifierId;
                this.name = model.name;
                this.requiredRuntime = model.requiredRuntime;
                this.skills = model.skills;
                this.systemPrompt = model.systemPrompt;
                this.tools = model.tools;
                this.visibility = model.visibility;
                this.visibilityScope = model.visibilityScope;
            } 

            /**
             * <p>The definition version read in this request. When updating the current definition, use this value as the ExpectedVersion for UpdateAgent to prevent overwriting new versions submitted by other callers. The version read from a historical snapshot does not represent the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder agentVersion(Integer agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * <p>The list of callable sub-agents.</p>
             */
            public Builder callableAgents(java.util.List<CallableAgents> callableAgents) {
                this.callableAgents = callableAgents;
                return this;
            }

            /**
             * <p>The ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p><strong>The description.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>Data analytics assistant</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p><strong>The display name.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>My assistant</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The expert suites bound to the agent definition, including a fixed integer revision number or a version selection policy. Official resources continue to use PackageVersion to indicate the artifact version.</p>
             */
            public Builder expertSuites(java.util.List<ExpertSuites> expertSuites) {
                this.expertSuites = expertSuites;
                return this;
            }

            /**
             * <p>The creation time, expressed as a timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1780555634000</p>
             */
            public Builder gmtCreateTime(Long gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The last modified time, expressed as a timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1780555634000</p>
             */
            public Builder gmtModifiedTime(Long gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p><strong>The extended metadata.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p><strong>The model configuration.</strong></p>
             */
            public Builder model(Model model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The ID of the last modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder modifierId(String modifierId) {
                this.modifierId = modifierId;
                return this;
            }

            /**
             * <p><strong>The agent name.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>my-agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The environment dependencies required for runtime.</p>
             */
            public Builder requiredRuntime(java.util.List<String> requiredRuntime) {
                this.requiredRuntime = requiredRuntime;
                return this;
            }

            /**
             * <p>The list of skills.</p>
             */
            public Builder skills(java.util.List<Skills> skills) {
                this.skills = skills;
                return this;
            }

            /**
             * <p><strong>The system prompt.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>You are a data analytics assistant.</p>
             */
            public Builder systemPrompt(String systemPrompt) {
                this.systemPrompt = systemPrompt;
                return this;
            }

            /**
             * <p><strong>The list of tools.</strong></p>
             */
            public Builder tools(java.util.List<Tools> tools) {
                this.tools = tools;
                return this;
            }

            /**
             * <p><strong>The visibility level.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>TENANT</p>
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            /**
             * <p>The visibility scope.</p>
             */
            public Builder visibilityScope(VisibilityScope visibilityScope) {
                this.visibilityScope = visibilityScope;
                return this;
            }

            public Agent build() {
                return new Agent(this);
            } 

        } 

    }
}
