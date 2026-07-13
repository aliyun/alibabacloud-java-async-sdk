// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link CreateWorkerRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkerRequest</p>
 */
public class CreateWorkerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentType")
    private String agentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Agents")
    private String agents;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channels")
    private java.util.List<Channels> channels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Credentials")
    private java.util.List<Credentials> credentials;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployType")
    private String deployType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Groups")
    private java.util.List<Groups> groups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitConfig")
    private LimitConfig limitConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("McpServers")
    private java.util.List<McpServers> mcpServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Skills")
    private java.util.List<Skills> skills;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Soul")
    private String soul;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Subagents")
    private java.util.List<Subagents> subagents;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Template")
    private Template template;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionCode")
    private String versionCode;

    private CreateWorkerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentType = builder.agentType;
        this.agents = builder.agents;
        this.channels = builder.channels;
        this.clientToken = builder.clientToken;
        this.credentials = builder.credentials;
        this.deployType = builder.deployType;
        this.groups = builder.groups;
        this.instanceId = builder.instanceId;
        this.limitConfig = builder.limitConfig;
        this.mcpServers = builder.mcpServers;
        this.model = builder.model;
        this.name = builder.name;
        this.skills = builder.skills;
        this.soul = builder.soul;
        this.subagents = builder.subagents;
        this.template = builder.template;
        this.versionCode = builder.versionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return agentType
     */
    public String getAgentType() {
        return this.agentType;
    }

    /**
     * @return agents
     */
    public String getAgents() {
        return this.agents;
    }

    /**
     * @return channels
     */
    public java.util.List<Channels> getChannels() {
        return this.channels;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return credentials
     */
    public java.util.List<Credentials> getCredentials() {
        return this.credentials;
    }

    /**
     * @return deployType
     */
    public String getDeployType() {
        return this.deployType;
    }

    /**
     * @return groups
     */
    public java.util.List<Groups> getGroups() {
        return this.groups;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return limitConfig
     */
    public LimitConfig getLimitConfig() {
        return this.limitConfig;
    }

    /**
     * @return mcpServers
     */
    public java.util.List<McpServers> getMcpServers() {
        return this.mcpServers;
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
     * @return skills
     */
    public java.util.List<Skills> getSkills() {
        return this.skills;
    }

    /**
     * @return soul
     */
    public String getSoul() {
        return this.soul;
    }

    /**
     * @return subagents
     */
    public java.util.List<Subagents> getSubagents() {
        return this.subagents;
    }

    /**
     * @return template
     */
    public Template getTemplate() {
        return this.template;
    }

    /**
     * @return versionCode
     */
    public String getVersionCode() {
        return this.versionCode;
    }

    public static final class Builder extends Request.Builder<CreateWorkerRequest, Builder> {
        private String regionId; 
        private String agentType; 
        private String agents; 
        private java.util.List<Channels> channels; 
        private String clientToken; 
        private java.util.List<Credentials> credentials; 
        private String deployType; 
        private java.util.List<Groups> groups; 
        private String instanceId; 
        private LimitConfig limitConfig; 
        private java.util.List<McpServers> mcpServers; 
        private Model model; 
        private String name; 
        private java.util.List<Skills> skills; 
        private String soul; 
        private java.util.List<Subagents> subagents; 
        private Template template; 
        private String versionCode; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentType = request.agentType;
            this.agents = request.agents;
            this.channels = request.channels;
            this.clientToken = request.clientToken;
            this.credentials = request.credentials;
            this.deployType = request.deployType;
            this.groups = request.groups;
            this.instanceId = request.instanceId;
            this.limitConfig = request.limitConfig;
            this.mcpServers = request.mcpServers;
            this.model = request.model;
            this.name = request.name;
            this.skills = request.skills;
            this.soul = request.soul;
            this.subagents = request.subagents;
            this.template = request.template;
            this.versionCode = request.versionCode;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AgentType.
         */
        public Builder agentType(String agentType) {
            this.putQueryParameter("AgentType", agentType);
            this.agentType = agentType;
            return this;
        }

        /**
         * Agents.
         */
        public Builder agents(String agents) {
            this.putQueryParameter("Agents", agents);
            this.agents = agents;
            return this;
        }

        /**
         * Channels.
         */
        public Builder channels(java.util.List<Channels> channels) {
            String channelsShrink = shrink(channels, "Channels", "json");
            this.putQueryParameter("Channels", channelsShrink);
            this.channels = channels;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Credentials.
         */
        public Builder credentials(java.util.List<Credentials> credentials) {
            String credentialsShrink = shrink(credentials, "Credentials", "json");
            this.putBodyParameter("Credentials", credentialsShrink);
            this.credentials = credentials;
            return this;
        }

        /**
         * DeployType.
         */
        public Builder deployType(String deployType) {
            this.putQueryParameter("DeployType", deployType);
            this.deployType = deployType;
            return this;
        }

        /**
         * Groups.
         */
        public Builder groups(java.util.List<Groups> groups) {
            String groupsShrink = shrink(groups, "Groups", "json");
            this.putQueryParameter("Groups", groupsShrink);
            this.groups = groups;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LimitConfig.
         */
        public Builder limitConfig(LimitConfig limitConfig) {
            String limitConfigShrink = shrink(limitConfig, "LimitConfig", "json");
            this.putQueryParameter("LimitConfig", limitConfigShrink);
            this.limitConfig = limitConfig;
            return this;
        }

        /**
         * McpServers.
         */
        public Builder mcpServers(java.util.List<McpServers> mcpServers) {
            String mcpServersShrink = shrink(mcpServers, "McpServers", "json");
            this.putQueryParameter("McpServers", mcpServersShrink);
            this.mcpServers = mcpServers;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(Model model) {
            String modelShrink = shrink(model, "Model", "json");
            this.putQueryParameter("Model", modelShrink);
            this.model = model;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Skills.
         */
        public Builder skills(java.util.List<Skills> skills) {
            String skillsShrink = shrink(skills, "Skills", "json");
            this.putQueryParameter("Skills", skillsShrink);
            this.skills = skills;
            return this;
        }

        /**
         * Soul.
         */
        public Builder soul(String soul) {
            this.putQueryParameter("Soul", soul);
            this.soul = soul;
            return this;
        }

        /**
         * Subagents.
         */
        public Builder subagents(java.util.List<Subagents> subagents) {
            String subagentsShrink = shrink(subagents, "Subagents", "json");
            this.putQueryParameter("Subagents", subagentsShrink);
            this.subagents = subagents;
            return this;
        }

        /**
         * Template.
         */
        public Builder template(Template template) {
            String templateShrink = shrink(template, "Template", "json");
            this.putQueryParameter("Template", templateShrink);
            this.template = template;
            return this;
        }

        /**
         * VersionCode.
         */
        public Builder versionCode(String versionCode) {
            this.putQueryParameter("VersionCode", versionCode);
            this.versionCode = versionCode;
            return this;
        }

        @Override
        public CreateWorkerRequest build() {
            return new CreateWorkerRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateWorkerRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkerRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CardTemplateId")
        private String cardTemplateId;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("MessageType")
        private String messageType;

        @com.aliyun.core.annotation.NameInMap("RobotCode")
        private String robotCode;

        @com.aliyun.core.annotation.NameInMap("ShowThinking")
        private Boolean showThinking;

        @com.aliyun.core.annotation.NameInMap("ShowToolCalls")
        private Boolean showToolCalls;

        @com.aliyun.core.annotation.NameInMap("StreamingEnabled")
        private Boolean streamingEnabled;

        private Config(Builder builder) {
            this.cardTemplateId = builder.cardTemplateId;
            this.clientId = builder.clientId;
            this.extension = builder.extension;
            this.messageType = builder.messageType;
            this.robotCode = builder.robotCode;
            this.showThinking = builder.showThinking;
            this.showToolCalls = builder.showToolCalls;
            this.streamingEnabled = builder.streamingEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return cardTemplateId
         */
        public String getCardTemplateId() {
            return this.cardTemplateId;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return messageType
         */
        public String getMessageType() {
            return this.messageType;
        }

        /**
         * @return robotCode
         */
        public String getRobotCode() {
            return this.robotCode;
        }

        /**
         * @return showThinking
         */
        public Boolean getShowThinking() {
            return this.showThinking;
        }

        /**
         * @return showToolCalls
         */
        public Boolean getShowToolCalls() {
            return this.showToolCalls;
        }

        /**
         * @return streamingEnabled
         */
        public Boolean getStreamingEnabled() {
            return this.streamingEnabled;
        }

        public static final class Builder {
            private String cardTemplateId; 
            private String clientId; 
            private String extension; 
            private String messageType; 
            private String robotCode; 
            private Boolean showThinking; 
            private Boolean showToolCalls; 
            private Boolean streamingEnabled; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.cardTemplateId = model.cardTemplateId;
                this.clientId = model.clientId;
                this.extension = model.extension;
                this.messageType = model.messageType;
                this.robotCode = model.robotCode;
                this.showThinking = model.showThinking;
                this.showToolCalls = model.showToolCalls;
                this.streamingEnabled = model.streamingEnabled;
            } 

            /**
             * CardTemplateId.
             */
            public Builder cardTemplateId(String cardTemplateId) {
                this.cardTemplateId = cardTemplateId;
                return this;
            }

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * MessageType.
             */
            public Builder messageType(String messageType) {
                this.messageType = messageType;
                return this;
            }

            /**
             * RobotCode.
             */
            public Builder robotCode(String robotCode) {
                this.robotCode = robotCode;
                return this;
            }

            /**
             * ShowThinking.
             */
            public Builder showThinking(Boolean showThinking) {
                this.showThinking = showThinking;
                return this;
            }

            /**
             * ShowToolCalls.
             */
            public Builder showToolCalls(Boolean showToolCalls) {
                this.showToolCalls = showToolCalls;
                return this;
            }

            /**
             * StreamingEnabled.
             */
            public Builder streamingEnabled(Boolean streamingEnabled) {
                this.streamingEnabled = streamingEnabled;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkerRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkerRequest</p>
     */
    public static class Secrets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientSecret")
        private String clientSecret;

        private Secrets(Builder builder) {
            this.clientSecret = builder.clientSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Secrets create() {
            return builder().build();
        }

        /**
         * @return clientSecret
         */
        public String getClientSecret() {
            return this.clientSecret;
        }

        public static final class Builder {
            private String clientSecret; 

            private Builder() {
            } 

            private Builder(Secrets model) {
                this.clientSecret = model.clientSecret;
            } 

            /**
             * ClientSecret.
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            public Secrets build() {
                return new Secrets(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkerRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkerRequest</p>
     */
    public static class Channels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Secrets")
        private Secrets secrets;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Channels(Builder builder) {
            this.config = builder.config;
            this.enabled = builder.enabled;
            this.secrets = builder.secrets;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channels create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return secrets
         */
        public Secrets getSecrets() {
            return this.secrets;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Config config; 
            private Boolean enabled; 
            private Secrets secrets; 
            private String type; 

            private Builder() {
            } 

            private Builder(Channels model) {
                this.config = model.config;
                this.enabled = model.enabled;
                this.secrets = model.secrets;
                this.type = model.type;
            } 

            /**
             * Config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Secrets.
             */
            public Builder secrets(Secrets secrets) {
                this.secrets = secrets;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Channels build() {
                return new Channels(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkerRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkerRequest</p>
     */
    public static class Credentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Credentials(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credentials create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(Credentials model) {
                this.name = model.name;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Credentials build() {
                return new Credentials(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkerRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkerRequest</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Groups(Builder builder) {
            this.name = builder.name;
            this.role = builder.role;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String role; 
            private String type; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.name = model.name;
                this.role = model.role;
                this.type = model.type;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkerRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkerRequest</p>
     */
    public static class LimitConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LimitType")
        private String limitType;

        @com.aliyun.core.annotation.NameInMap("PeriodType")
        private String periodType;

        @com.aliyun.core.annotation.NameInMap("UsageLimit")
        private Long usageLimit;

        private LimitConfig(Builder builder) {
            this.limitType = builder.limitType;
            this.periodType = builder.periodType;
            this.usageLimit = builder.usageLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LimitConfig create() {
            return builder().build();
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
            private String limitType; 
            private String periodType; 
            private Long usageLimit; 

            private Builder() {
            } 

            private Builder(LimitConfig model) {
                this.limitType = model.limitType;
                this.periodType = model.periodType;
                this.usageLimit = model.usageLimit;
            } 

            /**
             * LimitType.
             */
            public Builder limitType(String limitType) {
                this.limitType = limitType;
                return this;
            }

            /**
             * PeriodType.
             */
            public Builder periodType(String periodType) {
                this.periodType = periodType;
                return this;
            }

            /**
             * UsageLimit.
             */
            public Builder usageLimit(Long usageLimit) {
                this.usageLimit = usageLimit;
                return this;
            }

            public LimitConfig build() {
                return new LimitConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkerRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkerRequest</p>
     */
    public static class McpServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private McpServers(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpServers create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(McpServers model) {
                this.name = model.name;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public McpServers build() {
                return new McpServers(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkerRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkerRequest</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("ModelProvider")
        private String modelProvider;

        private Model(Builder builder) {
            this.modelName = builder.modelName;
            this.modelProvider = builder.modelProvider;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return modelProvider
         */
        public String getModelProvider() {
            return this.modelProvider;
        }

        public static final class Builder {
            private String modelName; 
            private String modelProvider; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.modelName = model.modelName;
                this.modelProvider = model.modelProvider;
            } 

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * ModelProvider.
             */
            public Builder modelProvider(String modelProvider) {
                this.modelProvider = modelProvider;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkerRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkerRequest</p>
     */
    public static class Skills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Skills(Builder builder) {
            this.label = builder.label;
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
         * @return label
         */
        public String getLabel() {
            return this.label;
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
            private String label; 
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.label = model.label;
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
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
             * Version.
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
     * {@link CreateWorkerRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkerRequest</p>
     */
    public static class SubagentsSkills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private SubagentsSkills(Builder builder) {
            this.label = builder.label;
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubagentsSkills create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
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
            private String label; 
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(SubagentsSkills model) {
                this.label = model.label;
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
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
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public SubagentsSkills build() {
                return new SubagentsSkills(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkerRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkerRequest</p>
     */
    public static class Subagents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agents")
        private String agents;

        @com.aliyun.core.annotation.NameInMap("Skills")
        private java.util.List<SubagentsSkills> skills;

        @com.aliyun.core.annotation.NameInMap("SubagentId")
        private String subagentId;

        private Subagents(Builder builder) {
            this.agents = builder.agents;
            this.skills = builder.skills;
            this.subagentId = builder.subagentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subagents create() {
            return builder().build();
        }

        /**
         * @return agents
         */
        public String getAgents() {
            return this.agents;
        }

        /**
         * @return skills
         */
        public java.util.List<SubagentsSkills> getSkills() {
            return this.skills;
        }

        /**
         * @return subagentId
         */
        public String getSubagentId() {
            return this.subagentId;
        }

        public static final class Builder {
            private String agents; 
            private java.util.List<SubagentsSkills> skills; 
            private String subagentId; 

            private Builder() {
            } 

            private Builder(Subagents model) {
                this.agents = model.agents;
                this.skills = model.skills;
                this.subagentId = model.subagentId;
            } 

            /**
             * Agents.
             */
            public Builder agents(String agents) {
                this.agents = agents;
                return this;
            }

            /**
             * Skills.
             */
            public Builder skills(java.util.List<SubagentsSkills> skills) {
                this.skills = skills;
                return this;
            }

            /**
             * SubagentId.
             */
            public Builder subagentId(String subagentId) {
                this.subagentId = subagentId;
                return this;
            }

            public Subagents build() {
                return new Subagents(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkerRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkerRequest</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Template(Builder builder) {
            this.label = builder.label;
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
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
            private String label; 
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(Template model) {
                this.label = model.label;
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
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
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
}
