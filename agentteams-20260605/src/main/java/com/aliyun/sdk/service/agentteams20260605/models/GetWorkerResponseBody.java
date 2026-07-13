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
 * {@link GetWorkerResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkerResponseBody</p>
 */
public class GetWorkerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetWorkerResponseBody(Builder builder) {
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

    public static GetWorkerResponseBody create() {
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

        private Builder(GetWorkerResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetWorkerResponseBody build() {
            return new GetWorkerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkerResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerResponseBody</p>
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
     * {@link GetWorkerResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerResponseBody</p>
     */
    public static class SecretStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientSecret")
        private Boolean clientSecret;

        private SecretStatus(Builder builder) {
            this.clientSecret = builder.clientSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretStatus create() {
            return builder().build();
        }

        /**
         * @return clientSecret
         */
        public Boolean getClientSecret() {
            return this.clientSecret;
        }

        public static final class Builder {
            private Boolean clientSecret; 

            private Builder() {
            } 

            private Builder(SecretStatus model) {
                this.clientSecret = model.clientSecret;
            } 

            /**
             * ClientSecret.
             */
            public Builder clientSecret(Boolean clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            public SecretStatus build() {
                return new SecretStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkerResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerResponseBody</p>
     */
    public static class Channels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("SecretStatus")
        private SecretStatus secretStatus;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Channels(Builder builder) {
            this.config = builder.config;
            this.enabled = builder.enabled;
            this.secretStatus = builder.secretStatus;
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
         * @return secretStatus
         */
        public SecretStatus getSecretStatus() {
            return this.secretStatus;
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
            private SecretStatus secretStatus; 
            private String type; 

            private Builder() {
            } 

            private Builder(Channels model) {
                this.config = model.config;
                this.enabled = model.enabled;
                this.secretStatus = model.secretStatus;
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
             * SecretStatus.
             */
            public Builder secretStatus(SecretStatus secretStatus) {
                this.secretStatus = secretStatus;
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
     * {@link GetWorkerResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerResponseBody</p>
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
     * {@link GetWorkerResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerResponseBody</p>
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
     * {@link GetWorkerResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerResponseBody</p>
     */
    public static class LimitConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LimitType")
        private String limitType;

        @com.aliyun.core.annotation.NameInMap("OverLimit")
        private Boolean overLimit;

        @com.aliyun.core.annotation.NameInMap("PeriodType")
        private String periodType;

        @com.aliyun.core.annotation.NameInMap("RuleStatus")
        private String ruleStatus;

        @com.aliyun.core.annotation.NameInMap("UsageLimit")
        private Long usageLimit;

        @com.aliyun.core.annotation.NameInMap("UsedAmount")
        private Long usedAmount;

        private LimitConfig(Builder builder) {
            this.limitType = builder.limitType;
            this.overLimit = builder.overLimit;
            this.periodType = builder.periodType;
            this.ruleStatus = builder.ruleStatus;
            this.usageLimit = builder.usageLimit;
            this.usedAmount = builder.usedAmount;
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
         * @return overLimit
         */
        public Boolean getOverLimit() {
            return this.overLimit;
        }

        /**
         * @return periodType
         */
        public String getPeriodType() {
            return this.periodType;
        }

        /**
         * @return ruleStatus
         */
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        /**
         * @return usageLimit
         */
        public Long getUsageLimit() {
            return this.usageLimit;
        }

        /**
         * @return usedAmount
         */
        public Long getUsedAmount() {
            return this.usedAmount;
        }

        public static final class Builder {
            private String limitType; 
            private Boolean overLimit; 
            private String periodType; 
            private String ruleStatus; 
            private Long usageLimit; 
            private Long usedAmount; 

            private Builder() {
            } 

            private Builder(LimitConfig model) {
                this.limitType = model.limitType;
                this.overLimit = model.overLimit;
                this.periodType = model.periodType;
                this.ruleStatus = model.ruleStatus;
                this.usageLimit = model.usageLimit;
                this.usedAmount = model.usedAmount;
            } 

            /**
             * LimitType.
             */
            public Builder limitType(String limitType) {
                this.limitType = limitType;
                return this;
            }

            /**
             * OverLimit.
             */
            public Builder overLimit(Boolean overLimit) {
                this.overLimit = overLimit;
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
             * RuleStatus.
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * UsageLimit.
             */
            public Builder usageLimit(Long usageLimit) {
                this.usageLimit = usageLimit;
                return this;
            }

            /**
             * UsedAmount.
             */
            public Builder usedAmount(Long usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            public LimitConfig build() {
                return new LimitConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkerResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerResponseBody</p>
     */
    public static class McpServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Transport")
        private String transport;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private McpServers(Builder builder) {
            this.name = builder.name;
            this.transport = builder.transport;
            this.url = builder.url;
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

        /**
         * @return transport
         */
        public String getTransport() {
            return this.transport;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String name; 
            private String transport; 
            private String url; 

            private Builder() {
            } 

            private Builder(McpServers model) {
                this.name = model.name;
                this.transport = model.transport;
                this.url = model.url;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Transport.
             */
            public Builder transport(String transport) {
                this.transport = transport;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public McpServers build() {
                return new McpServers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkerResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerResponseBody</p>
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
     * {@link GetWorkerResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerResponseBody</p>
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
     * {@link GetWorkerResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerResponseBody</p>
     */
    public static class SubagentsSkills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasSkillMd")
        private Boolean hasSkillMd;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SkillId")
        private String skillId;

        private SubagentsSkills(Builder builder) {
            this.hasSkillMd = builder.hasSkillMd;
            this.name = builder.name;
            this.skillId = builder.skillId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubagentsSkills create() {
            return builder().build();
        }

        /**
         * @return hasSkillMd
         */
        public Boolean getHasSkillMd() {
            return this.hasSkillMd;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skillId
         */
        public String getSkillId() {
            return this.skillId;
        }

        public static final class Builder {
            private Boolean hasSkillMd; 
            private String name; 
            private String skillId; 

            private Builder() {
            } 

            private Builder(SubagentsSkills model) {
                this.hasSkillMd = model.hasSkillMd;
                this.name = model.name;
                this.skillId = model.skillId;
            } 

            /**
             * HasSkillMd.
             */
            public Builder hasSkillMd(Boolean hasSkillMd) {
                this.hasSkillMd = hasSkillMd;
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
             * SkillId.
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            public SubagentsSkills build() {
                return new SubagentsSkills(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkerResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerResponseBody</p>
     */
    public static class Subagents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HasAgentsMd")
        private Boolean hasAgentsMd;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Skills")
        private java.util.List<SubagentsSkills> skills;

        @com.aliyun.core.annotation.NameInMap("SourcePath")
        private String sourcePath;

        @com.aliyun.core.annotation.NameInMap("SubagentId")
        private String subagentId;

        private Subagents(Builder builder) {
            this.description = builder.description;
            this.hasAgentsMd = builder.hasAgentsMd;
            this.name = builder.name;
            this.skills = builder.skills;
            this.sourcePath = builder.sourcePath;
            this.subagentId = builder.subagentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subagents create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hasAgentsMd
         */
        public Boolean getHasAgentsMd() {
            return this.hasAgentsMd;
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
        public java.util.List<SubagentsSkills> getSkills() {
            return this.skills;
        }

        /**
         * @return sourcePath
         */
        public String getSourcePath() {
            return this.sourcePath;
        }

        /**
         * @return subagentId
         */
        public String getSubagentId() {
            return this.subagentId;
        }

        public static final class Builder {
            private String description; 
            private Boolean hasAgentsMd; 
            private String name; 
            private java.util.List<SubagentsSkills> skills; 
            private String sourcePath; 
            private String subagentId; 

            private Builder() {
            } 

            private Builder(Subagents model) {
                this.description = model.description;
                this.hasAgentsMd = model.hasAgentsMd;
                this.name = model.name;
                this.skills = model.skills;
                this.sourcePath = model.sourcePath;
                this.subagentId = model.subagentId;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * HasAgentsMd.
             */
            public Builder hasAgentsMd(Boolean hasAgentsMd) {
                this.hasAgentsMd = hasAgentsMd;
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
             * Skills.
             */
            public Builder skills(java.util.List<SubagentsSkills> skills) {
                this.skills = skills;
                return this;
            }

            /**
             * SourcePath.
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
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
     * {@link GetWorkerResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerResponseBody</p>
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
    /**
     * 
     * {@link GetWorkerResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentType")
        private String agentType;

        @com.aliyun.core.annotation.NameInMap("Agents")
        private String agents;

        @com.aliyun.core.annotation.NameInMap("Channels")
        private java.util.List<Channels> channels;

        @com.aliyun.core.annotation.NameInMap("Credentials")
        private java.util.List<Credentials> credentials;

        @com.aliyun.core.annotation.NameInMap("DeployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("Groups")
        private java.util.List<Groups> groups;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LimitConfig")
        private LimitConfig limitConfig;

        @com.aliyun.core.annotation.NameInMap("McpServers")
        private java.util.List<McpServers> mcpServers;

        @com.aliyun.core.annotation.NameInMap("Model")
        private Model model;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Skills")
        private java.util.List<Skills> skills;

        @com.aliyun.core.annotation.NameInMap("Soul")
        private String soul;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Subagents")
        private java.util.List<Subagents> subagents;

        @com.aliyun.core.annotation.NameInMap("Template")
        private Template template;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        private String versionCode;

        private Data(Builder builder) {
            this.agentType = builder.agentType;
            this.agents = builder.agents;
            this.channels = builder.channels;
            this.credentials = builder.credentials;
            this.deployType = builder.deployType;
            this.groups = builder.groups;
            this.instanceId = builder.instanceId;
            this.limitConfig = builder.limitConfig;
            this.mcpServers = builder.mcpServers;
            this.model = builder.model;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.skills = builder.skills;
            this.soul = builder.soul;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.subagents = builder.subagents;
            this.template = builder.template;
            this.versionCode = builder.versionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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

        public static final class Builder {
            private String agentType; 
            private String agents; 
            private java.util.List<Channels> channels; 
            private java.util.List<Credentials> credentials; 
            private String deployType; 
            private java.util.List<Groups> groups; 
            private String instanceId; 
            private LimitConfig limitConfig; 
            private java.util.List<McpServers> mcpServers; 
            private Model model; 
            private String name; 
            private String regionId; 
            private java.util.List<Skills> skills; 
            private String soul; 
            private String startTime; 
            private String status; 
            private java.util.List<Subagents> subagents; 
            private Template template; 
            private String versionCode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentType = model.agentType;
                this.agents = model.agents;
                this.channels = model.channels;
                this.credentials = model.credentials;
                this.deployType = model.deployType;
                this.groups = model.groups;
                this.instanceId = model.instanceId;
                this.limitConfig = model.limitConfig;
                this.mcpServers = model.mcpServers;
                this.model = model.model;
                this.name = model.name;
                this.regionId = model.regionId;
                this.skills = model.skills;
                this.soul = model.soul;
                this.startTime = model.startTime;
                this.status = model.status;
                this.subagents = model.subagents;
                this.template = model.template;
                this.versionCode = model.versionCode;
            } 

            /**
             * AgentType.
             */
            public Builder agentType(String agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * Agents.
             */
            public Builder agents(String agents) {
                this.agents = agents;
                return this;
            }

            /**
             * Channels.
             */
            public Builder channels(java.util.List<Channels> channels) {
                this.channels = channels;
                return this;
            }

            /**
             * Credentials.
             */
            public Builder credentials(java.util.List<Credentials> credentials) {
                this.credentials = credentials;
                return this;
            }

            /**
             * DeployType.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * Groups.
             */
            public Builder groups(java.util.List<Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LimitConfig.
             */
            public Builder limitConfig(LimitConfig limitConfig) {
                this.limitConfig = limitConfig;
                return this;
            }

            /**
             * McpServers.
             */
            public Builder mcpServers(java.util.List<McpServers> mcpServers) {
                this.mcpServers = mcpServers;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * Soul.
             */
            public Builder soul(String soul) {
                this.soul = soul;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Subagents.
             */
            public Builder subagents(java.util.List<Subagents> subagents) {
                this.subagents = subagents;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(Template template) {
                this.template = template;
                return this;
            }

            /**
             * VersionCode.
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
