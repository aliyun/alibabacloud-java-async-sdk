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
 * {@link GetExternalAgentResponseBody} extends {@link TeaModel}
 *
 * <p>GetExternalAgentResponseBody</p>
 */
public class GetExternalAgentResponseBody extends TeaModel {
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

    private GetExternalAgentResponseBody(Builder builder) {
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

    public static GetExternalAgentResponseBody create() {
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

        private Builder(GetExternalAgentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code. The value is SUCCESS if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the external agent.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code. 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request processing result message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetExternalAgentResponseBody build() {
            return new GetExternalAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExternalAgentResponseBody</p>
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
             * <p>The type of the version selector. Valid values: LABEL (selects by tag) and VERSION (selects by specific version).</p>
             * 
             * <strong>example:</strong>
             * <p>LABEL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the selector. If the type is LABEL, the value is a tag name such as latest. If the type is VERSION, the value is a specific version number.</p>
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
     * {@link GetExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExternalAgentResponseBody</p>
     */
    public static class ConfiguredSkills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("versionSelector")
        private VersionSelector versionSelector;

        private ConfiguredSkills(Builder builder) {
            this.name = builder.name;
            this.sourceType = builder.sourceType;
            this.version = builder.version;
            this.versionSelector = builder.versionSelector;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfiguredSkills create() {
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

            private Builder(ConfiguredSkills model) {
                this.name = model.name;
                this.sourceType = model.sourceType;
                this.version = model.version;
                this.versionSelector = model.versionSelector;
            } 

            /**
             * <p>The name of the skill in the Workspace AI Registry.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>web-search</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The source type of the skill. Valid values: REFERENCE (references the AI Registry) and STATIC (statically provided with the package).</p>
             * 
             * <strong>example:</strong>
             * <p>REFERENCE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The legacy compatibility field. Use sourceType and versionSelector for new requests.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The referenced version selector. If omitted, the default value is LABEL/latest. Only LABEL/latest is supported in the current phase.</p>
             */
            public Builder versionSelector(VersionSelector versionSelector) {
                this.versionSelector = versionSelector;
                return this;
            }

            public ConfiguredSkills build() {
                return new ConfiguredSkills(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExternalAgentResponseBody</p>
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
             * <p>The heartbeat status. ONLINE indicates that the most recent heartbeat did not exceed the configured timeout threshold. STALE indicates that the heartbeat has timed out. UNKNOWN indicates that the heartbeat is missing or the format is invalid. Valid values: ONLINE (online), STALE (heartbeat expired), and UNKNOWN (unknown).</p>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder heartbeatStatus(String heartbeatStatus) {
                this.heartbeatStatus = heartbeatStatus;
                return this;
            }

            /**
             * <p>The last active time of the external agent in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder lastActiveAt(String lastActiveAt) {
                this.lastActiveAt = lastActiveAt;
                return this;
            }

            /**
             * <p>The last heartbeat time of the external agent in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder lastHeartbeat(String lastHeartbeat) {
                this.lastHeartbeat = lastHeartbeat;
                return this;
            }

            /**
             * <p>The local IP address reported by the external agent.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.42</p>
             */
            public Builder localIP(String localIP) {
                this.localIP = localIP;
                return this;
            }

            /**
             * <p>The runtime type reported by the external agent.</p>
             * 
             * <strong>example:</strong>
             * <p>qwenpaw</p>
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
     * {@link GetExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExternalAgentResponseBody</p>
     */
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("limitType")
        private String limitType;

        @com.aliyun.core.annotation.NameInMap("overLimit")
        private Boolean overLimit;

        @com.aliyun.core.annotation.NameInMap("periodType")
        private String periodType;

        @com.aliyun.core.annotation.NameInMap("ruleStatus")
        private String ruleStatus;

        @com.aliyun.core.annotation.NameInMap("usageLimit")
        private Long usageLimit;

        @com.aliyun.core.annotation.NameInMap("usedAmount")
        private Long usedAmount;

        private Quota(Builder builder) {
            this.enabled = builder.enabled;
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
            private Boolean enabled; 
            private String limitType; 
            private Boolean overLimit; 
            private String periodType; 
            private String ruleStatus; 
            private Long usageLimit; 
            private Long usedAmount; 

            private Builder() {
            } 

            private Builder(Quota model) {
                this.enabled = model.enabled;
                this.limitType = model.limitType;
                this.overLimit = model.overLimit;
                this.periodType = model.periodType;
                this.ruleStatus = model.ruleStatus;
                this.usageLimit = model.usageLimit;
                this.usedAmount = model.usedAmount;
            } 

            /**
             * <p>Specifies whether the quota is enabled. This field is not returned if no quota is configured.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The quota limit type. Only token is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>token</p>
             */
            public Builder limitType(String limitType) {
                this.limitType = limitType;
                return this;
            }

            /**
             * <p>Specifies whether the quota is exceeded in the current period. This field is read-only and returned by the backend.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder overLimit(Boolean overLimit) {
                this.overLimit = overLimit;
                return this;
            }

            /**
             * <p>The quota statistical period. Valid values: day (daily) and month (monthly).</p>
             * 
             * <strong>example:</strong>
             * <p>day</p>
             */
            public Builder periodType(String periodType) {
                this.periodType = periodType;
                return this;
            }

            /**
             * <p>The gateway quota rule status. This field is read-only and returned by the backend.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * <p>The maximum number of tokens allowed to be consumed in a single period.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000</p>
             */
            public Builder usageLimit(Long usageLimit) {
                this.usageLimit = usageLimit;
                return this;
            }

            /**
             * <p>The number of tokens consumed in the current period. This field is read-only and returned by the backend.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder usedAmount(Long usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExternalAgentResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelConnectionId")
        private String modelConnectionId;

        @com.aliyun.core.annotation.NameInMap("modelName")
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
             * 
             * <strong>example:</strong>
             * <p>mc-1</p>
             */
            public Builder modelConnectionId(String modelConnectionId) {
                this.modelConnectionId = modelConnectionId;
                return this;
            }

            /**
             * <p>The name of the upstream model.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-max</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The model token quota configuration and usage status for the current period. This field is empty if no quota is configured.</p>
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
     * {@link GetExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExternalAgentResponseBody</p>
     */
    public static class SkillsVersionSelector extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private SkillsVersionSelector(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillsVersionSelector create() {
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

            private Builder(SkillsVersionSelector model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The type of the version selector. Valid values: LABEL (selects by tag) and VERSION (selects by specific version).</p>
             * 
             * <strong>example:</strong>
             * <p>LABEL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the selector. If the type is LABEL, the value is a tag name such as latest. If the type is VERSION, the value is a specific version number.</p>
             * 
             * <strong>example:</strong>
             * <p>latest</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SkillsVersionSelector build() {
                return new SkillsVersionSelector(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExternalAgentResponseBody</p>
     */
    public static class Skills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appliedVersion")
        private String appliedVersion;

        @com.aliyun.core.annotation.NameInMap("fromTemplate")
        private Boolean fromTemplate;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("resolvedVersion")
        private String resolvedVersion;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("versionSelector")
        private SkillsVersionSelector versionSelector;

        private Skills(Builder builder) {
            this.appliedVersion = builder.appliedVersion;
            this.fromTemplate = builder.fromTemplate;
            this.name = builder.name;
            this.resolvedVersion = builder.resolvedVersion;
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
         * @return appliedVersion
         */
        public String getAppliedVersion() {
            return this.appliedVersion;
        }

        /**
         * @return fromTemplate
         */
        public Boolean getFromTemplate() {
            return this.fromTemplate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resolvedVersion
         */
        public String getResolvedVersion() {
            return this.resolvedVersion;
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
        public SkillsVersionSelector getVersionSelector() {
            return this.versionSelector;
        }

        public static final class Builder {
            private String appliedVersion; 
            private Boolean fromTemplate; 
            private String name; 
            private String resolvedVersion; 
            private String sourceType; 
            private String version; 
            private SkillsVersionSelector versionSelector; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.appliedVersion = model.appliedVersion;
                this.fromTemplate = model.fromTemplate;
                this.name = model.name;
                this.resolvedVersion = model.resolvedVersion;
                this.sourceType = model.sourceType;
                this.version = model.version;
                this.versionSelector = model.versionSelector;
            } 

            /**
             * <p>The effective version at runtime. This field is read-only.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder appliedVersion(String appliedVersion) {
                this.appliedVersion = appliedVersion;
                return this;
            }

            /**
             * <p>Specifies whether the skill is from a fixed template. This field is read-only. Template items cannot be removed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder fromTemplate(Boolean fromTemplate) {
                this.fromTemplate = fromTemplate;
                return this;
            }

            /**
             * <p>The name of the skill.</p>
             * 
             * <strong>example:</strong>
             * <p>code-analysis</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The current target version. This field is read-only.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder resolvedVersion(String resolvedVersion) {
                this.resolvedVersion = resolvedVersion;
                return this;
            }

            /**
             * <p>The source type of the skill. Valid values: REFERENCE (references the AI Registry) and STATIC (statically provided with the package).</p>
             * 
             * <strong>example:</strong>
             * <p>REFERENCE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
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

            /**
             * <p>The referenced version selector. If omitted, the default value is LABEL/latest.</p>
             */
            public Builder versionSelector(SkillsVersionSelector versionSelector) {
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
     * {@link GetExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExternalAgentResponseBody</p>
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
     * {@link GetExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExternalAgentResponseBody</p>
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
     * {@link GetExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExternalAgentResponseBody</p>
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
             * <p>The tool type. Valid values: MCP.</p>
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
     * {@link GetExternalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExternalAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("configuredSkills")
        private java.util.List<ConfiguredSkills> configuredSkills;

        @com.aliyun.core.annotation.NameInMap("createMode")
        private String createMode;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("deployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

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
            this.configuredSkills = builder.configuredSkills;
            this.createMode = builder.createMode;
            this.createdAt = builder.createdAt;
            this.deployType = builder.deployType;
            this.description = builder.description;
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
         * @return configuredSkills
         */
        public java.util.List<ConfiguredSkills> getConfiguredSkills() {
            return this.configuredSkills;
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
            private java.util.List<ConfiguredSkills> configuredSkills; 
            private String createMode; 
            private String createdAt; 
            private String deployType; 
            private String description; 
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
                this.configuredSkills = model.configuredSkills;
                this.createMode = model.createMode;
                this.createdAt = model.createdAt;
                this.deployType = model.deployType;
                this.description = model.description;
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
             * <p>The external agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-1</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>Includes only the skills added or overridden by the user, excluding inherited items from templates. The resource model reads this field to preserve update semantics. Creation and update operations still use the skills in the request.</p>
             */
            public Builder configuredSkills(java.util.List<ConfiguredSkills> configuredSkills) {
                this.configuredSkills = configuredSkills;
                return this;
            }

            /**
             * <p>The creation mode.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder createMode(String createMode) {
                this.createMode = createMode;
                return this;
            }

            /**
             * <p>The creation time in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The deployment type.</p>
             * 
             * <strong>example:</strong>
             * <p>SELF_HOSTED</p>
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * <p>The description of the external agent.</p>
             * 
             * <strong>example:</strong>
             * <p>Code review agent running in the user environment</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The running status information reported by the external agent.</p>
             */
            public Builder externalAgentStatus(ExternalAgentStatus externalAgentStatus) {
                this.externalAgentStatus = externalAgentStatus;
                return this;
            }

            /**
             * <p>The agent instruction used to guide the behavior of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>You are a code review assistant</p>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>The latest specification version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder latestSpecVersion(Long latestSpecVersion) {
                this.latestSpecVersion = latestSpecVersion;
                return this;
            }

            /**
             * <p>The processing status of the latest specification version. Valid values: pending (pending), processing (processing), waiting_retry (waiting for retry), succeeded (succeeded), failed (failed), and superseded (superseded by a new version).</p>
             * 
             * <strong>example:</strong>
             * <p>pending</p>
             */
            public Builder latestVersionStatus(String latestVersionStatus) {
                this.latestVersionStatus = latestVersionStatus;
                return this;
            }

            /**
             * <p>The model configuration. This field is available only when modelSource is set to PLATFORM.</p>
             */
            public Builder model(Model model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The source of the model configuration. PLATFORM indicates that the platform parses and delivers the model configuration. RUNTIME indicates that the external runtime manages the model itself, and the model field cannot be passed at the same time. Valid values: PLATFORM (platform model) and RUNTIME (runtime model).</p>
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
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The runtime type reported by the external agent.</p>
             * 
             * <strong>example:</strong>
             * <p>qwenpaw</p>
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
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
             * <p>The status of the external agent. Valid values: Creating (creating), Running (running), Failed (failed), Updating (updating), Deleting (deleting), and Deleted (deleted).</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
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

            /**
             * <p>The update time in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-1</p>
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
