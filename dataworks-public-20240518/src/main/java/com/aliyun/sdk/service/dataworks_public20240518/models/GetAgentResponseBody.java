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
         * Agent.
         */
        public Builder agent(Agent agent) {
            this.agent = agent;
            return this;
        }

        /**
         * RequestId.
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
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
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
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Version.
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
             * Config.
             */
            public Builder config(java.util.Map<String, ?> config) {
                this.config = config;
                return this;
            }

            /**
             * MaxTokens.
             */
            public Builder maxTokens(Integer maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * Stream.
             */
            public Builder stream(Boolean stream) {
                this.stream = stream;
                return this;
            }

            /**
             * Temperature.
             */
            public Builder temperature(Double temperature) {
                this.temperature = temperature;
                return this;
            }

            /**
             * TopP.
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

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

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
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Version.
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
             * BuiltinName.
             */
            public Builder builtinName(String builtinName) {
                this.builtinName = builtinName;
                return this;
            }

            /**
             * Kind.
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * McpItems.
             */
            public Builder mcpItems(java.util.List<String> mcpItems) {
                this.mcpItems = mcpItems;
                return this;
            }

            /**
             * McpServerName.
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
             * ProjectIds.
             */
            public Builder projectIds(java.util.List<String> projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * UserIds.
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
        @com.aliyun.core.annotation.NameInMap("CallableAgents")
        private java.util.List<CallableAgents> callableAgents;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

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
            this.callableAgents = builder.callableAgents;
            this.creatorId = builder.creatorId;
            this.description = builder.description;
            this.displayName = builder.displayName;
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
            private java.util.List<CallableAgents> callableAgents; 
            private String creatorId; 
            private String description; 
            private String displayName; 
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
                this.callableAgents = model.callableAgents;
                this.creatorId = model.creatorId;
                this.description = model.description;
                this.displayName = model.displayName;
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
             * CallableAgents.
             */
            public Builder callableAgents(java.util.List<CallableAgents> callableAgents) {
                this.callableAgents = callableAgents;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
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
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
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
             * Metadata.
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(Model model) {
                this.model = model;
                return this;
            }

            /**
             * ModifierId.
             */
            public Builder modifierId(String modifierId) {
                this.modifierId = modifierId;
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
             * RequiredRuntime.
             */
            public Builder requiredRuntime(java.util.List<String> requiredRuntime) {
                this.requiredRuntime = requiredRuntime;
                return this;
            }

            /**
             * Skills.
             */
            public Builder skills(java.util.List<Skills> skills) {
                this.skills = skills;
                return this;
            }

            /**
             * SystemPrompt.
             */
            public Builder systemPrompt(String systemPrompt) {
                this.systemPrompt = systemPrompt;
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
             * Visibility.
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            /**
             * VisibilityScope.
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
