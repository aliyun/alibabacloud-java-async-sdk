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
         * <p>The agent details.</p>
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
             * <p>The sub-agent display name.</p>
             * 
             * <strong>example:</strong>
             * <p>Sub-assistant</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The sub-agent name.</p>
             * 
             * <strong>example:</strong>
             * <p>sub-agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The sub-agent source.</p>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The sub-agent version.</p>
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

        private ExpertSuites(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.name = builder.name;
            this.packageVersion = builder.packageVersion;
            this.semanticVersion = builder.semanticVersion;
            this.source = builder.source;
            this.suiteId = builder.suiteId;
            this.version = builder.version;
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

        public static final class Builder {
            private String description; 
            private String displayName; 
            private String name; 
            private String packageVersion; 
            private String semanticVersion; 
            private String source; 
            private String suiteId; 
            private Integer version; 

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
            } 

            /**
             * <p>套件已删除、发布快照缺失或调用者无权查看时，不返回套件摘要，仅保留 ID 和版本号。</p>
             * 
             * <strong>example:</strong>
             * <p>数据分析专家能力集合</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The sub-agent display name.</p>
             * 
             * <strong>example:</strong>
             * <p>Sub-assistant</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The sub-agent name.</p>
             * 
             * <strong>example:</strong>
             * <p>sub-agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>显式查询 Agent 已发布版本时返回固定的官方制品版本；查询草稿或自定义套件时不返回。</p>
             * 
             * <strong>example:</strong>
             * <p>0.1.0.202610211408</p>
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * <p>可选套件摘要字段，当前新 DataAgent 应用不返回；缺省不表示版本 0。不可作为 UpdateAgent 的 Version，回写引用时必须省略。官方制品的固定版本请读取 PackageVersion。</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.0</p>
             */
            public Builder semanticVersion(String semanticVersion) {
                this.semanticVersion = semanticVersion;
                return this;
            }

            /**
             * <p>OFFICIAL 表示官方目录资源；省略或 DB 表示个人或企业资源。</p>
             * 
             * <strong>example:</strong>
             * <p>OFFICIAL</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SuiteId.
             */
            public Builder suiteId(String suiteId) {
                this.suiteId = suiteId;
                return this;
            }

            /**
             * <p>仅个人或企业套件在引用明确指定版本或读取发布快照时返回；官方套件不返回。未返回不是 0；SDK 若将缺省整数初始化为 0，回写时必须省略。官方项只回写 Source 和 SuiteId，不传 Version、SemanticVersion 或 PackageVersion。</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder version(Integer version) {
                this.version = version;
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
             * <p>Additional configuration for the model.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder config(java.util.Map<String, ?> config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The maximum number of tokens to generate in one response.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder maxTokens(Integer maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3-max</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>Indicates whether streaming output is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder stream(Boolean stream) {
                this.stream = stream;
                return this;
            }

            /**
             * <p>The temperature.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder temperature(Double temperature) {
                this.temperature = temperature;
                return this;
            }

            /**
             * <p>The top-p.</p>
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

        private Skills(Builder builder) {
            this.name = builder.name;
            this.packageVersion = builder.packageVersion;
            this.skillId = builder.skillId;
            this.source = builder.source;
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

        public static final class Builder {
            private String name; 
            private String packageVersion; 
            private String skillId; 
            private String source; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.name = model.name;
                this.packageVersion = model.packageVersion;
                this.skillId = model.skillId;
                this.source = model.source;
                this.version = model.version;
            } 

            /**
             * <p>The skill name.</p>
             * 
             * <strong>example:</strong>
             * <p>my-skill</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>指定 AgentVersion 查询已发布快照时返回固定的官方制品版本；查询草稿或自定义 Skill 时不返回。</p>
             * 
             * <strong>example:</strong>
             * <p>0.6.0.202608201110</p>
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * SkillId.
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * <p>OFFICIAL 表示官方目录资源；省略或 DB 表示原有个人或企业资源。</p>
             * 
             * <strong>example:</strong>
             * <p>OFFICIAL</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The skill version.</p>
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
             * <p><strong>The name of the built-in tool. This parameter applies only when <code>Kind</code> is set to <code>builtin</code>.</strong></p>
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
             * <p><strong>The selected MCP tool items. This parameter applies only when <code>Kind</code> is set to <code>mcp</code>.</strong></p>
             */
            public Builder mcpItems(java.util.List<String> mcpItems) {
                this.mcpItems = mcpItems;
                return this;
            }

            /**
             * <p><strong>The name of the associated MCP server. This parameter applies only when <code>Kind</code> is set to <code>mcp</code>.</strong></p>
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
             * <p>A list of project IDs that can view the agent.</p>
             */
            public Builder projectIds(java.util.List<String> projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * <p>A list of user IDs that can view the agent.</p>
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
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

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
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
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
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
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
             * <p>本次读取的定义版本。更新当前定义时，将该值作为 UpdateAgent 的 ExpectedVersion，可拒绝覆盖其他调用者已提交的新版本。读取历史快照的版本不代表当前版本。</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder agentVersion(Integer agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * <p>A list of callable sub-agents.</p>
             */
            public Builder callableAgents(java.util.List<CallableAgents> callableAgents) {
                this.callableAgents = callableAgents;
                return this;
            }

            /**
             * <p>The creator ID.</p>
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
             * <p>Data analysis assistant</p>
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
             * <p>Agent 定义绑定的专家套件及固定发布版本。</p>
             */
            public Builder expertSuites(java.util.List<ExpertSuites> expertSuites) {
                this.expertSuites = expertSuites;
                return this;
            }

            /**
             * <p>The creation time, as a Unix timestamp in milliseconds.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>1780555634000</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The last modification time, as a Unix timestamp in milliseconds.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>1780555634000</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p><strong>Additional metadata.</strong></p>
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
             * <p>The runtime dependencies.</p>
             */
            public Builder requiredRuntime(java.util.List<String> requiredRuntime) {
                this.requiredRuntime = requiredRuntime;
                return this;
            }

            /**
             * <p>A list of skills.</p>
             */
            public Builder skills(java.util.List<Skills> skills) {
                this.skills = skills;
                return this;
            }

            /**
             * <p><strong>The system prompt.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>You are a data analysis assistant.</p>
             */
            public Builder systemPrompt(String systemPrompt) {
                this.systemPrompt = systemPrompt;
                return this;
            }

            /**
             * <p><strong>A list of tools.</strong></p>
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
