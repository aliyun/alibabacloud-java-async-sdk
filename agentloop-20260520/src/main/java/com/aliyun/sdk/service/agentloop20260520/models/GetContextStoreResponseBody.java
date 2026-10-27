// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link GetContextStoreResponseBody} extends {@link TeaModel}
 *
 * <p>GetContextStoreResponseBody</p>
 */
public class GetContextStoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.NameInMap("config")
    private Config config;

    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    private String contextStoreName;

    @com.aliyun.core.annotation.NameInMap("contextType")
    private String contextType;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    private GetContextStoreResponseBody(Builder builder) {
        this.agentSpace = builder.agentSpace;
        this.config = builder.config;
        this.contextStoreName = builder.contextStoreName;
        this.contextType = builder.contextType;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContextStoreResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return contextStoreName
     */
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    /**
     * @return contextType
     */
    public String getContextType() {
        return this.contextType;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String agentSpace; 
        private Config config; 
        private String contextStoreName; 
        private String contextType; 
        private String createTime; 
        private String description; 
        private String regionId; 
        private String requestId; 
        private String status; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetContextStoreResponseBody model) {
            this.agentSpace = model.agentSpace;
            this.config = model.config;
            this.contextStoreName = model.contextStoreName;
            this.contextType = model.contextType;
            this.createTime = model.createTime;
            this.description = model.description;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.status = model.status;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The name of the associated AgentSpace.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The context library configuration.</p>
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The name of the context store.</p>
         * 
         * <strong>example:</strong>
         * <p>my-context-store</p>
         */
        public Builder contextStoreName(String contextStoreName) {
            this.contextStoreName = contextStoreName;
            return this;
        }

        /**
         * <p>The type of the context store, such as experience or memory.</p>
         * 
         * <strong>example:</strong>
         * <p>experience</p>
         */
        public Builder contextType(String contextType) {
            this.contextType = contextType;
            return this;
        }

        /**
         * <p>The time when the context store was created, in ISO 8601 UTC format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the context store.</p>
         * 
         * <strong>example:</strong>
         * <p>My context store</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the region where the context store is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID used to locate the request during troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the context store, such as ACTIVE, INITIALIZING, or FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The time when the context store was last updated, in ISO 8601 UTC format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-02T00:00:00Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetContextStoreResponseBody build() {
            return new GetContextStoreResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class Audit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("droppedCandidates")
        private Boolean droppedCandidates;

        @com.aliyun.core.annotation.NameInMap("queryMode")
        private String queryMode;

        @com.aliyun.core.annotation.NameInMap("retentionDays")
        private Integer retentionDays;

        private Audit(Builder builder) {
            this.droppedCandidates = builder.droppedCandidates;
            this.queryMode = builder.queryMode;
            this.retentionDays = builder.retentionDays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Audit create() {
            return builder().build();
        }

        /**
         * @return droppedCandidates
         */
        public Boolean getDroppedCandidates() {
            return this.droppedCandidates;
        }

        /**
         * @return queryMode
         */
        public String getQueryMode() {
            return this.queryMode;
        }

        /**
         * @return retentionDays
         */
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

        public static final class Builder {
            private Boolean droppedCandidates; 
            private String queryMode; 
            private Integer retentionDays; 

            private Builder() {
            } 

            private Builder(Audit model) {
                this.droppedCandidates = model.droppedCandidates;
                this.queryMode = model.queryMode;
                this.retentionDays = model.retentionDays;
            } 

            /**
             * <p>Specifies whether to write item events for dropped recall candidates. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder droppedCandidates(Boolean droppedCandidates) {
                this.droppedCandidates = droppedCandidates;
                return this;
            }

            /**
             * <p>The recording mode for recall queries. Valid values: raw (plaintext) and hash (HMAC only). Default value: raw.</p>
             * 
             * <strong>example:</strong>
             * <p>raw</p>
             */
            public Builder queryMode(String queryMode) {
                this.queryMode = queryMode;
                return this;
            }

            /**
             * <p>The number of days to retain audit logs. Valid values: 1 to 180. Default value: 30.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder retentionDays(Integer retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            public Audit build() {
                return new Audit(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Model(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
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

            private Builder(Model model) {
                this.name = model.name;
            } 

            /**
             * <p>The name of the extraction model. Currently, only qwen3.8-flash is supported. Internal platform credentials are used.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3.8-flash</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class StoragePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowedActions")
        private java.util.List<String> allowedActions;

        @com.aliyun.core.annotation.NameInMap("dedupe")
        private Boolean dedupe;

        @com.aliyun.core.annotation.NameInMap("humanEditProtection")
        private Boolean humanEditProtection;

        @com.aliyun.core.annotation.NameInMap("mergeKey")
        private String mergeKey;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("similarityThreshold")
        private Double similarityThreshold;

        @com.aliyun.core.annotation.NameInMap("ttlDays")
        private Integer ttlDays;

        private StoragePolicy(Builder builder) {
            this.allowedActions = builder.allowedActions;
            this.dedupe = builder.dedupe;
            this.humanEditProtection = builder.humanEditProtection;
            this.mergeKey = builder.mergeKey;
            this.mode = builder.mode;
            this.similarityThreshold = builder.similarityThreshold;
            this.ttlDays = builder.ttlDays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StoragePolicy create() {
            return builder().build();
        }

        /**
         * @return allowedActions
         */
        public java.util.List<String> getAllowedActions() {
            return this.allowedActions;
        }

        /**
         * @return dedupe
         */
        public Boolean getDedupe() {
            return this.dedupe;
        }

        /**
         * @return humanEditProtection
         */
        public Boolean getHumanEditProtection() {
            return this.humanEditProtection;
        }

        /**
         * @return mergeKey
         */
        public String getMergeKey() {
            return this.mergeKey;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return similarityThreshold
         */
        public Double getSimilarityThreshold() {
            return this.similarityThreshold;
        }

        /**
         * @return ttlDays
         */
        public Integer getTtlDays() {
            return this.ttlDays;
        }

        public static final class Builder {
            private java.util.List<String> allowedActions; 
            private Boolean dedupe; 
            private Boolean humanEditProtection; 
            private String mergeKey; 
            private String mode; 
            private Double similarityThreshold; 
            private Integer ttlDays; 

            private Builder() {
            } 

            private Builder(StoragePolicy model) {
                this.allowedActions = model.allowedActions;
                this.dedupe = model.dedupe;
                this.humanEditProtection = model.humanEditProtection;
                this.mergeKey = model.mergeKey;
                this.mode = model.mode;
                this.similarityThreshold = model.similarityThreshold;
                this.ttlDays = model.ttlDays;
            } 

            /**
             * allowedActions.
             */
            public Builder allowedActions(java.util.List<String> allowedActions) {
                this.allowedActions = allowedActions;
                return this;
            }

            /**
             * dedupe.
             */
            public Builder dedupe(Boolean dedupe) {
                this.dedupe = dedupe;
                return this;
            }

            /**
             * humanEditProtection.
             */
            public Builder humanEditProtection(Boolean humanEditProtection) {
                this.humanEditProtection = humanEditProtection;
                return this;
            }

            /**
             * mergeKey.
             */
            public Builder mergeKey(String mergeKey) {
                this.mergeKey = mergeKey;
                return this;
            }

            /**
             * mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * similarityThreshold.
             */
            public Builder similarityThreshold(Double similarityThreshold) {
                this.similarityThreshold = similarityThreshold;
                return this;
            }

            /**
             * ttlDays.
             */
            public Builder ttlDays(Integer ttlDays) {
                this.ttlDays = ttlDays;
                return this;
            }

            public StoragePolicy build() {
                return new StoragePolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class ExtractionPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("categories")
        private java.util.List<String> categories;

        @com.aliyun.core.annotation.NameInMap("customInstructions")
        private String customInstructions;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("excludeRules")
        private java.util.List<String> excludeRules;

        @com.aliyun.core.annotation.NameInMap("model")
        private Model model;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("preset")
        private String preset;

        @com.aliyun.core.annotation.NameInMap("storagePolicy")
        private StoragePolicy storagePolicy;

        @com.aliyun.core.annotation.NameInMap("strategyId")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
        private String strategyId;

        private ExtractionPolicies(Builder builder) {
            this.categories = builder.categories;
            this.customInstructions = builder.customInstructions;
            this.enabled = builder.enabled;
            this.excludeRules = builder.excludeRules;
            this.model = builder.model;
            this.name = builder.name;
            this.preset = builder.preset;
            this.storagePolicy = builder.storagePolicy;
            this.strategyId = builder.strategyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtractionPolicies create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        /**
         * @return customInstructions
         */
        public String getCustomInstructions() {
            return this.customInstructions;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return excludeRules
         */
        public java.util.List<String> getExcludeRules() {
            return this.excludeRules;
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
         * @return preset
         */
        public String getPreset() {
            return this.preset;
        }

        /**
         * @return storagePolicy
         */
        public StoragePolicy getStoragePolicy() {
            return this.storagePolicy;
        }

        /**
         * @return strategyId
         */
        public String getStrategyId() {
            return this.strategyId;
        }

        public static final class Builder {
            private java.util.List<String> categories; 
            private String customInstructions; 
            private Boolean enabled; 
            private java.util.List<String> excludeRules; 
            private Model model; 
            private String name; 
            private String preset; 
            private StoragePolicy storagePolicy; 
            private String strategyId; 

            private Builder() {
            } 

            private Builder(ExtractionPolicies model) {
                this.categories = model.categories;
                this.customInstructions = model.customInstructions;
                this.enabled = model.enabled;
                this.excludeRules = model.excludeRules;
                this.model = model.model;
                this.name = model.name;
                this.preset = model.preset;
                this.storagePolicy = model.storagePolicy;
                this.strategyId = model.strategyId;
            } 

            /**
             * <p>The list of memory categories.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;preference&quot;,&quot;profile&quot;]</p>
             */
            public Builder categories(java.util.List<String> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * <p>The custom extraction instructions. This parameter is required when preset is set to custom. The length must be 1 to 8,000 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>Extract only user product preferences</p>
             */
            public Builder customInstructions(String customInstructions) {
                this.customInstructions = customInstructions;
                return this;
            }

            /**
             * <p>Specifies whether to apply this policy to new inputs. Default value: true. Disabling the policy does not delete historical memories.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The list of exclusion rules. Content that matches these rules is not extracted.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;Password&quot;,&quot;ID number&quot;]</p>
             */
            public Builder excludeRules(java.util.List<String> excludeRules) {
                this.excludeRules = excludeRules;
                return this;
            }

            /**
             * <p>The extraction model configuration.</p>
             */
            public Builder model(Model model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The display name of the extraction policy.</p>
             * 
             * <strong>example:</strong>
             * <p>User preferences</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The preset policy. Valid values: fact, toc-profile, tob-digital-twin, and custom. Default value: fact.</p>
             * 
             * <strong>example:</strong>
             * <p>fact</p>
             */
            public Builder preset(String preset) {
                this.preset = preset;
                return this;
            }

            /**
             * storagePolicy.
             */
            public Builder storagePolicy(StoragePolicy storagePolicy) {
                this.storagePolicy = storagePolicy;
                return this;
            }

            /**
             * <p>The stable ID of the extraction policy. The ID must start with a letter and can contain only letters, digits, underscores, and hyphens. It can be up to 64 characters in length. The ID must be unique within the same context library. Modifying the name or instructions does not change this ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>preferences</p>
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            public ExtractionPolicies build() {
                return new ExtractionPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class ExtractionPolicyModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private ExtractionPolicyModel(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtractionPolicyModel create() {
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

            private Builder(ExtractionPolicyModel model) {
                this.name = model.name;
            } 

            /**
             * <p>The name of the extraction model. Currently, only qwen3.8-flash is supported. Internal platform credentials are used.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3.8-flash</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ExtractionPolicyModel build() {
                return new ExtractionPolicyModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class ExtractionPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("categories")
        private java.util.List<String> categories;

        @com.aliyun.core.annotation.NameInMap("customInstructions")
        private String customInstructions;

        @com.aliyun.core.annotation.NameInMap("excludeRules")
        private java.util.List<String> excludeRules;

        @com.aliyun.core.annotation.NameInMap("model")
        private ExtractionPolicyModel model;

        @com.aliyun.core.annotation.NameInMap("preset")
        private String preset;

        private ExtractionPolicy(Builder builder) {
            this.categories = builder.categories;
            this.customInstructions = builder.customInstructions;
            this.excludeRules = builder.excludeRules;
            this.model = builder.model;
            this.preset = builder.preset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtractionPolicy create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        /**
         * @return customInstructions
         */
        public String getCustomInstructions() {
            return this.customInstructions;
        }

        /**
         * @return excludeRules
         */
        public java.util.List<String> getExcludeRules() {
            return this.excludeRules;
        }

        /**
         * @return model
         */
        public ExtractionPolicyModel getModel() {
            return this.model;
        }

        /**
         * @return preset
         */
        public String getPreset() {
            return this.preset;
        }

        public static final class Builder {
            private java.util.List<String> categories; 
            private String customInstructions; 
            private java.util.List<String> excludeRules; 
            private ExtractionPolicyModel model; 
            private String preset; 

            private Builder() {
            } 

            private Builder(ExtractionPolicy model) {
                this.categories = model.categories;
                this.customInstructions = model.customInstructions;
                this.excludeRules = model.excludeRules;
                this.model = model.model;
                this.preset = model.preset;
            } 

            /**
             * <p>The list of memory categories.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;preference&quot;,&quot;profile&quot;]</p>
             */
            public Builder categories(java.util.List<String> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * <p>The custom extraction instructions. This parameter is required when preset is set to custom. The length must be 1 to 8,000 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>Extract only user product preferences</p>
             */
            public Builder customInstructions(String customInstructions) {
                this.customInstructions = customInstructions;
                return this;
            }

            /**
             * <p>The list of exclusion rules. Content that matches these rules is not extracted.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;Password&quot;,&quot;ID number&quot;]</p>
             */
            public Builder excludeRules(java.util.List<String> excludeRules) {
                this.excludeRules = excludeRules;
                return this;
            }

            /**
             * <p>The extraction model configuration.</p>
             */
            public Builder model(ExtractionPolicyModel model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The preset policy. Valid values: fact, toc-profile, tob-digital-twin, and custom. Default value: fact.</p>
             * 
             * <strong>example:</strong>
             * <p>fact</p>
             */
            public Builder preset(String preset) {
                this.preset = preset;
                return this;
            }

            public ExtractionPolicy build() {
                return new ExtractionPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class InnerSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        private InnerSource(Builder builder) {
            this.logstore = builder.logstore;
            this.project = builder.project;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InnerSource create() {
            return builder().build();
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        public static final class Builder {
            private String logstore; 
            private String project; 

            private Builder() {
            } 

            private Builder(InnerSource model) {
                this.logstore = model.logstore;
                this.project = model.project;
            } 

            /**
             * <p>The name of the event Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>memory_events_0a1b2c3d</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The name of the SLS project.</p>
             * 
             * <strong>example:</strong>
             * <p>agentloop-xxx</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            public InnerSource build() {
                return new InnerSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class Observability extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auditLogstore")
        private String auditLogstore;

        @com.aliyun.core.annotation.NameInMap("eventsLogstore")
        private String eventsLogstore;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        private Observability(Builder builder) {
            this.auditLogstore = builder.auditLogstore;
            this.eventsLogstore = builder.eventsLogstore;
            this.project = builder.project;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Observability create() {
            return builder().build();
        }

        /**
         * @return auditLogstore
         */
        public String getAuditLogstore() {
            return this.auditLogstore;
        }

        /**
         * @return eventsLogstore
         */
        public String getEventsLogstore() {
            return this.eventsLogstore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        public static final class Builder {
            private String auditLogstore; 
            private String eventsLogstore; 
            private String project; 

            private Builder() {
            } 

            private Builder(Observability model) {
                this.auditLogstore = model.auditLogstore;
                this.eventsLogstore = model.eventsLogstore;
                this.project = model.project;
            } 

            /**
             * <p>The name of the audit Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>memory-audit</p>
             */
            public Builder auditLogstore(String auditLogstore) {
                this.auditLogstore = auditLogstore;
                return this;
            }

            /**
             * <p>The name of the event Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>memory_events_0a1b2c3d</p>
             */
            public Builder eventsLogstore(String eventsLogstore) {
                this.eventsLogstore = eventsLogstore;
                return this;
            }

            /**
             * <p>The Simple Log Service (SLS) project to which both belong, which is bound to the AgentSpace.</p>
             * 
             * <strong>example:</strong>
             * <p>agentloop-xxx</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            public Observability build() {
                return new Observability(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class OutputDataset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpace")
        private String agentSpace;

        @com.aliyun.core.annotation.NameInMap("datasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("schemaContract")
        private String schemaContract;

        @com.aliyun.core.annotation.NameInMap("schemaVersion")
        private Integer schemaVersion;

        private OutputDataset(Builder builder) {
            this.agentSpace = builder.agentSpace;
            this.datasetName = builder.datasetName;
            this.schemaContract = builder.schemaContract;
            this.schemaVersion = builder.schemaVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputDataset create() {
            return builder().build();
        }

        /**
         * @return agentSpace
         */
        public String getAgentSpace() {
            return this.agentSpace;
        }

        /**
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        /**
         * @return schemaContract
         */
        public String getSchemaContract() {
            return this.schemaContract;
        }

        /**
         * @return schemaVersion
         */
        public Integer getSchemaVersion() {
            return this.schemaVersion;
        }

        public static final class Builder {
            private String agentSpace; 
            private String datasetName; 
            private String schemaContract; 
            private Integer schemaVersion; 

            private Builder() {
            } 

            private Builder(OutputDataset model) {
                this.agentSpace = model.agentSpace;
                this.datasetName = model.datasetName;
                this.schemaContract = model.schemaContract;
                this.schemaVersion = model.schemaVersion;
            } 

            /**
             * <p>The AgentSpace to which the dataset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-space</p>
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
            }

            /**
             * <p>The name of the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>memory-my-context-store</p>
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * <p>The row schema contract of the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>MemoryRecordV1</p>
             */
            public Builder schemaContract(String schemaContract) {
                this.schemaContract = schemaContract;
                return this;
            }

            /**
             * <p>The schema version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder schemaVersion(Integer schemaVersion) {
                this.schemaVersion = schemaVersion;
                return this;
            }

            public OutputDataset build() {
                return new OutputDataset(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class ScopePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("requiredAnyOf")
        private java.util.List<String> requiredAnyOf;

        private ScopePolicy(Builder builder) {
            this.requiredAnyOf = builder.requiredAnyOf;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScopePolicy create() {
            return builder().build();
        }

        /**
         * @return requiredAnyOf
         */
        public java.util.List<String> getRequiredAnyOf() {
            return this.requiredAnyOf;
        }

        public static final class Builder {
            private java.util.List<String> requiredAnyOf; 

            private Builder() {
            } 

            private Builder(ScopePolicy model) {
                this.requiredAnyOf = model.requiredAnyOf;
            } 

            /**
             * <p>Specifies that at least one of the scope fields must be non-empty. Valid values: userId, agentId, appId, and runId.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;userId&quot;]</p>
             */
            public Builder requiredAnyOf(java.util.List<String> requiredAnyOf) {
                this.requiredAnyOf = requiredAnyOf;
                return this;
            }

            public ScopePolicy build() {
                return new ScopePolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class CustomFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("sensitive")
        private Boolean sensitive;

        @com.aliyun.core.annotation.NameInMap("sourceField")
        private String sourceField;

        @com.aliyun.core.annotation.NameInMap("target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("usage")
        private String usage;

        private CustomFields(Builder builder) {
            this.description = builder.description;
            this.sensitive = builder.sensitive;
            this.sourceField = builder.sourceField;
            this.target = builder.target;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomFields create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return sensitive
         */
        public Boolean getSensitive() {
            return this.sensitive;
        }

        /**
         * @return sourceField
         */
        public String getSourceField() {
            return this.sourceField;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String description; 
            private Boolean sensitive; 
            private String sourceField; 
            private String target; 
            private String usage; 

            private Builder() {
            } 

            private Builder(CustomFields model) {
                this.description = model.description;
                this.sensitive = model.sensitive;
                this.sourceField = model.sourceField;
                this.target = model.target;
                this.usage = model.usage;
            } 

            /**
             * <p>The description of the field. This parameter is required when usage is extraction-input and is appended to the extraction prompt.</p>
             * 
             * <strong>example:</strong>
             * <p>Customer tier</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Specifies whether the field is a sensitive field.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sensitive(Boolean sensitive) {
                this.sensitive = sensitive;
                return this;
            }

            /**
             * <p>The name of the source field.</p>
             * 
             * <strong>example:</strong>
             * <p>customerTier</p>
             */
            public Builder sourceField(String sourceField) {
                this.sourceField = sourceField;
                return this;
            }

            /**
             * <p>The target path for writing, such as metadata.customerTier.</p>
             * 
             * <strong>example:</strong>
             * <p>metadata.customerTier</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The usage of the field. Valid values: extraction-input (participates in extraction) and ignore (ignored).</p>
             * 
             * <strong>example:</strong>
             * <p>extraction-input</p>
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            public CustomFields build() {
                return new CustomFields(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("where")
        private String where;

        private Filter(Builder builder) {
            this.where = builder.where;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return where
         */
        public String getWhere() {
            return this.where;
        }

        public static final class Builder {
            private String where; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.where = model.where;
            } 

            /**
             * <p>The subset of the pipeline where clause, which is pushed down to SQL.</p>
             * 
             * <strong>example:</strong>
             * <p>appId = \&quot;crm-service\&quot;</p>
             */
            public Builder where(String where) {
                this.where = where;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class VersionPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("startSeq")
        private Long startSeq;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private VersionPolicy(Builder builder) {
            this.mode = builder.mode;
            this.startSeq = builder.startSeq;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionPolicy create() {
            return builder().build();
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return startSeq
         */
        public Long getStartSeq() {
            return this.startSeq;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String mode; 
            private Long startSeq; 
            private String version; 

            private Builder() {
            } 

            private Builder(VersionPolicy model) {
                this.mode = model.mode;
                this.startSeq = model.startSeq;
                this.version = model.version;
            } 

            /**
             * <p>The consumption mode. Valid values: follow (incremental consumption based on __dataset_seq) and fixed (full consumption of the specified ACTIVE version at once).</p>
             * 
             * <strong>example:</strong>
             * <p>follow</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The starting __dataset_seq for the follow mode.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder startSeq(Long startSeq) {
                this.startSeq = startSeq;
                return this;
            }

            /**
             * <p>The dataset version specified for the fixed mode.</p>
             * 
             * <strong>example:</strong>
             * <p>v3</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public VersionPolicy build() {
                return new VersionPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class Dataset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("customFields")
        private java.util.List<CustomFields> customFields;

        @com.aliyun.core.annotation.NameInMap("datasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("filter")
        private Filter filter;

        @com.aliyun.core.annotation.NameInMap("pollIntervalSeconds")
        private Integer pollIntervalSeconds;

        @com.aliyun.core.annotation.NameInMap("schemaContract")
        private String schemaContract;

        @com.aliyun.core.annotation.NameInMap("versionPolicy")
        private VersionPolicy versionPolicy;

        private Dataset(Builder builder) {
            this.customFields = builder.customFields;
            this.datasetName = builder.datasetName;
            this.filter = builder.filter;
            this.pollIntervalSeconds = builder.pollIntervalSeconds;
            this.schemaContract = builder.schemaContract;
            this.versionPolicy = builder.versionPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dataset create() {
            return builder().build();
        }

        /**
         * @return customFields
         */
        public java.util.List<CustomFields> getCustomFields() {
            return this.customFields;
        }

        /**
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        /**
         * @return filter
         */
        public Filter getFilter() {
            return this.filter;
        }

        /**
         * @return pollIntervalSeconds
         */
        public Integer getPollIntervalSeconds() {
            return this.pollIntervalSeconds;
        }

        /**
         * @return schemaContract
         */
        public String getSchemaContract() {
            return this.schemaContract;
        }

        /**
         * @return versionPolicy
         */
        public VersionPolicy getVersionPolicy() {
            return this.versionPolicy;
        }

        public static final class Builder {
            private java.util.List<CustomFields> customFields; 
            private String datasetName; 
            private Filter filter; 
            private Integer pollIntervalSeconds; 
            private String schemaContract; 
            private VersionPolicy versionPolicy; 

            private Builder() {
            } 

            private Builder(Dataset model) {
                this.customFields = model.customFields;
                this.datasetName = model.datasetName;
                this.filter = model.filter;
                this.pollIntervalSeconds = model.pollIntervalSeconds;
                this.schemaContract = model.schemaContract;
                this.versionPolicy = model.versionPolicy;
            } 

            /**
             * <p>The list of custom field declarations.</p>
             */
            public Builder customFields(java.util.List<CustomFields> customFields) {
                this.customFields = customFields;
                return this;
            }

            /**
             * <p>The name of the dataset in the same AgentSpace. This parameter cannot be modified after creation.</p>
             * 
             * <strong>example:</strong>
             * <p>trajectory-with-crm-profile</p>
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * <p>The row filter condition.</p>
             */
            public Builder filter(Filter filter) {
                this.filter = filter;
                return this;
            }

            /**
             * <p>The polling interval in seconds. Valid values: 60 to 3600. Default value: 300.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder pollIntervalSeconds(Integer pollIntervalSeconds) {
                this.pollIntervalSeconds = pollIntervalSeconds;
                return this;
            }

            /**
             * <p>The row schema contract of the dataset. In the current phase, this parameter is fixed to MemorySourceV1.</p>
             * 
             * <strong>example:</strong>
             * <p>MemorySourceV1</p>
             */
            public Builder schemaContract(String schemaContract) {
                this.schemaContract = schemaContract;
                return this;
            }

            /**
             * <p>The version consumption policy of the dataset.</p>
             */
            public Builder versionPolicy(VersionPolicy versionPolicy) {
                this.versionPolicy = versionPolicy;
                return this;
            }

            public Dataset build() {
                return new Dataset(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class TrajectoryFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentNames")
        private java.util.List<String> agentNames;

        @com.aliyun.core.annotation.NameInMap("excludeDegraded")
        private Boolean excludeDegraded;

        @com.aliyun.core.annotation.NameInMap("minStepCount")
        private Integer minStepCount;

        @com.aliyun.core.annotation.NameInMap("query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("serviceNames")
        private java.util.List<String> serviceNames;

        private TrajectoryFilter(Builder builder) {
            this.agentNames = builder.agentNames;
            this.excludeDegraded = builder.excludeDegraded;
            this.minStepCount = builder.minStepCount;
            this.query = builder.query;
            this.serviceNames = builder.serviceNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrajectoryFilter create() {
            return builder().build();
        }

        /**
         * @return agentNames
         */
        public java.util.List<String> getAgentNames() {
            return this.agentNames;
        }

        /**
         * @return excludeDegraded
         */
        public Boolean getExcludeDegraded() {
            return this.excludeDegraded;
        }

        /**
         * @return minStepCount
         */
        public Integer getMinStepCount() {
            return this.minStepCount;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return serviceNames
         */
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

        public static final class Builder {
            private java.util.List<String> agentNames; 
            private Boolean excludeDegraded; 
            private Integer minStepCount; 
            private String query; 
            private java.util.List<String> serviceNames; 

            private Builder() {
            } 

            private Builder(TrajectoryFilter model) {
                this.agentNames = model.agentNames;
                this.excludeDegraded = model.excludeDegraded;
                this.minStepCount = model.minStepCount;
                this.query = model.query;
                this.serviceNames = model.serviceNames;
            } 

            /**
             * <p>The list of agent names. An explicit empty list returns a 400 error.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;sales-copilot&quot;]</p>
             */
            public Builder agentNames(java.util.List<String> agentNames) {
                this.agentNames = agentNames;
                return this;
            }

            /**
             * <p>Specifies whether to exclude degraded trajectories. Default value: false (includes degraded trajectories).</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder excludeDegraded(Boolean excludeDegraded) {
                this.excludeDegraded = excludeDegraded;
                return this;
            }

            /**
             * <p>The minimum step count, which must be greater than or equal to 0.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder minStepCount(Integer minStepCount) {
                this.minStepCount = minStepCount;
                return this;
            }

            /**
             * <p>The native Simple Log Service (SLS) query statement. This statement is combined with the preceding conditions using the AND operator.</p>
             * 
             * <strong>example:</strong>
             * <p>tool_names:&quot;search_order&quot;</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * <p>The list of service names. A single trailing asterisk (*) is supported. An explicit empty list returns a 400 error.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;crm-service&quot;,&quot;app-*&quot;]</p>
             */
            public Builder serviceNames(java.util.List<String> serviceNames) {
                this.serviceNames = serviceNames;
                return this;
            }

            public TrajectoryFilter build() {
                return new TrajectoryFilter(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class ScopeMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("runId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private ScopeMapping(Builder builder) {
            this.agentId = builder.agentId;
            this.appId = builder.appId;
            this.runId = builder.runId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScopeMapping create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String agentId; 
            private String appId; 
            private String runId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(ScopeMapping model) {
                this.agentId = model.agentId;
                this.appId = model.appId;
                this.runId = model.runId;
                this.userId = model.userId;
            } 

            /**
             * <p>The JSONPath expression for agentId. Default value: $.agent_name.</p>
             * 
             * <strong>example:</strong>
             * <p>$.agent_name</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The JSONPath expression for appId. Default value: $.service_names[0].</p>
             * 
             * <strong>example:</strong>
             * <p>$.service_names[0]</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The JSONPath expression for runId. Default value: $.trajectory_id.</p>
             * 
             * <strong>example:</strong>
             * <p>$.trajectory_id</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The JSONPath expression for userId. By default, this field is not mapped.</p>
             * 
             * <strong>example:</strong>
             * <p>$.trajectory_extensions.user_id</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ScopeMapping build() {
                return new ScopeMapping(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class Trajectory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("filter")
        private TrajectoryFilter filter;

        @com.aliyun.core.annotation.NameInMap("logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("pollIntervalSeconds")
        private Integer pollIntervalSeconds;

        @com.aliyun.core.annotation.NameInMap("scopeMapping")
        private ScopeMapping scopeMapping;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private Trajectory(Builder builder) {
            this.filter = builder.filter;
            this.logstore = builder.logstore;
            this.pollIntervalSeconds = builder.pollIntervalSeconds;
            this.scopeMapping = builder.scopeMapping;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trajectory create() {
            return builder().build();
        }

        /**
         * @return filter
         */
        public TrajectoryFilter getFilter() {
            return this.filter;
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return pollIntervalSeconds
         */
        public Integer getPollIntervalSeconds() {
            return this.pollIntervalSeconds;
        }

        /**
         * @return scopeMapping
         */
        public ScopeMapping getScopeMapping() {
            return this.scopeMapping;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private TrajectoryFilter filter; 
            private String logstore; 
            private Integer pollIntervalSeconds; 
            private ScopeMapping scopeMapping; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Trajectory model) {
                this.filter = model.filter;
                this.logstore = model.logstore;
                this.pollIntervalSeconds = model.pollIntervalSeconds;
                this.scopeMapping = model.scopeMapping;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The trajectory filter condition. Multiple conditions are combined with AND, and conditions within a list are combined with OR.</p>
             */
            public Builder filter(TrajectoryFilter filter) {
                this.filter = filter;
                return this;
            }

            /**
             * <p>The name of the trajectory Logstore. Default value: agent-trajectory. This parameter cannot be modified after creation.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-trajectory</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The polling interval in seconds. Valid values: 60 to 3600. Default value: 300.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder pollIntervalSeconds(Integer pollIntervalSeconds) {
                this.pollIntervalSeconds = pollIntervalSeconds;
                return this;
            }

            /**
             * <p>The scope field mapping. The value is a JSONPath expression. Only the $.a.b and $.a[0] formats are supported.</p>
             */
            public Builder scopeMapping(ScopeMapping scopeMapping) {
                this.scopeMapping = scopeMapping;
                return this;
            }

            /**
             * <p>The start time for trajectory consumption in ISO 8601 UTC format. If not specified, the default value is the creation time.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-01T00:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Trajectory build() {
                return new Trajectory(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class SourceVersionPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("startSeq")
        private String startSeq;

        private SourceVersionPolicy(Builder builder) {
            this.mode = builder.mode;
            this.startSeq = builder.startSeq;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceVersionPolicy create() {
            return builder().build();
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return startSeq
         */
        public String getStartSeq() {
            return this.startSeq;
        }

        public static final class Builder {
            private String mode; 
            private String startSeq; 

            private Builder() {
            } 

            private Builder(SourceVersionPolicy model) {
                this.mode = model.mode;
                this.startSeq = model.startSeq;
            } 

            /**
             * <p>The continuous consumption mode. The value is fixed to follow.</p>
             * 
             * <strong>example:</strong>
             * <p>follow</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The initial consumed append sequence number. The value is a decimal string of a non-negative int64 integer. Default value: 0. The __dataset_seq field is used, and the business timestamp is not used as the consumption checkpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder startSeq(String startSeq) {
                this.startSeq = startSeq;
                return this;
            }

            public SourceVersionPolicy build() {
                return new SourceVersionPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpace")
        private String agentSpace;

        @com.aliyun.core.annotation.NameInMap("binding")
        private java.util.Map<String, ?> binding;

        @com.aliyun.core.annotation.NameInMap("dataset")
        private Dataset dataset;

        @com.aliyun.core.annotation.NameInMap("datasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("maxRecords")
        private Integer maxRecords;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("trajectory")
        private Trajectory trajectory;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("versionPolicy")
        private SourceVersionPolicy versionPolicy;

        private Source(Builder builder) {
            this.agentSpace = builder.agentSpace;
            this.binding = builder.binding;
            this.dataset = builder.dataset;
            this.datasetName = builder.datasetName;
            this.format = builder.format;
            this.maxRecords = builder.maxRecords;
            this.startTime = builder.startTime;
            this.trajectory = builder.trajectory;
            this.type = builder.type;
            this.versionPolicy = builder.versionPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return agentSpace
         */
        public String getAgentSpace() {
            return this.agentSpace;
        }

        /**
         * @return binding
         */
        public java.util.Map<String, ?> getBinding() {
            return this.binding;
        }

        /**
         * @return dataset
         */
        public Dataset getDataset() {
            return this.dataset;
        }

        /**
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return maxRecords
         */
        public Integer getMaxRecords() {
            return this.maxRecords;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return trajectory
         */
        public Trajectory getTrajectory() {
            return this.trajectory;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return versionPolicy
         */
        public SourceVersionPolicy getVersionPolicy() {
            return this.versionPolicy;
        }

        public static final class Builder {
            private String agentSpace; 
            private java.util.Map<String, ?> binding; 
            private Dataset dataset; 
            private String datasetName; 
            private String format; 
            private Integer maxRecords; 
            private String startTime; 
            private Trajectory trajectory; 
            private String type; 
            private SourceVersionPolicy versionPolicy; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.agentSpace = model.agentSpace;
                this.binding = model.binding;
                this.dataset = model.dataset;
                this.datasetName = model.datasetName;
                this.format = model.format;
                this.maxRecords = model.maxRecords;
                this.startTime = model.startTime;
                this.trajectory = model.trajectory;
                this.type = model.type;
                this.versionPolicy = model.versionPolicy;
            } 

            /**
             * <p>The AgentSpace to which the trace data source belongs, which is the same as the AgentSpace to which it belonged when it was created.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-space</p>
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
            }

            /**
             * <p>The DatasetBinding v1 shared with optimization tasks, which retains fixed column validation, supplementary column usage, and all/window selection.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;version&quot;:1,&quot;selection&quot;:{&quot;mode&quot;:&quot;all&quot;}}</p>
             */
            public Builder binding(java.util.Map<String, ?> binding) {
                this.binding = binding;
                return this;
            }

            /**
             * <p>The data source configuration for the memory type dataset. This parameter is required when the type is memory and source.type is dataset.</p>
             */
            public Builder dataset(Dataset dataset) {
                this.dataset = dataset;
                return this;
            }

            /**
             * <p>The name of the source dataset for the experience type in the current AgentSpace.</p>
             * 
             * <strong>example:</strong>
             * <p>reviewed_trajectories</p>
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * <p>The input format of the dataset. For the experience base dataset, the source is atif.</p>
             * 
             * <strong>example:</strong>
             * <p>atif</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The maximum number of records to read from the dataset at a time. Valid values: 1 to 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxRecords(Integer maxRecords) {
                this.maxRecords = maxRecords;
                return this;
            }

            /**
             * <p>The start time for data backfill in ISO 8601 UTC format.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The data source configuration for the memory type trajectory. This parameter is required when the type is memory and source.type is trajectory.</p>
             */
            public Builder trajectory(Trajectory trajectory) {
                this.trajectory = trajectory;
                return this;
            }

            /**
             * <p>The source type, which can be trajectory or dataset. For experience, if not specified, the trajectory configuration is used. For Dataset, the datasetName, format, and binding at the current level are used. The default mode is manual. If versionPolicy.mode is set to follow, continuous processing is performed and automatically applied to the experience library. For memory, if not specified, the mode is manual (only written by AddContexts). Otherwise, the trajectory or dataset sub-configuration with the same name is used. This parameter cannot be modified after creation.</p>
             * 
             * <strong>example:</strong>
             * <p>dataset</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The continuous consumption configuration for the native experience library Dataset. The default mode is manual. The follow mode only allows binding.selection.mode to be set to all, and consumes data by append sequence number. This parameter cannot be modified after creation.</p>
             */
            public Builder versionPolicy(SourceVersionPolicy versionPolicy) {
                this.versionPolicy = versionPolicy;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class SourceStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkpoint")
        private java.util.Map<String, ?> checkpoint;

        @com.aliyun.core.annotation.NameInMap("currentWindow")
        private java.util.Map<String, String> currentWindow;

        @com.aliyun.core.annotation.NameInMap("lastError")
        private String lastError;

        @com.aliyun.core.annotation.NameInMap("lastRunId")
        private String lastRunId;

        @com.aliyun.core.annotation.NameInMap("lastWindowAt")
        private String lastWindowAt;

        @com.aliyun.core.annotation.NameInMap("retryCount")
        private Integer retryCount;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        private SourceStatus(Builder builder) {
            this.checkpoint = builder.checkpoint;
            this.currentWindow = builder.currentWindow;
            this.lastError = builder.lastError;
            this.lastRunId = builder.lastRunId;
            this.lastWindowAt = builder.lastWindowAt;
            this.retryCount = builder.retryCount;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceStatus create() {
            return builder().build();
        }

        /**
         * @return checkpoint
         */
        public java.util.Map<String, ?> getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return currentWindow
         */
        public java.util.Map<String, String> getCurrentWindow() {
            return this.currentWindow;
        }

        /**
         * @return lastError
         */
        public String getLastError() {
            return this.lastError;
        }

        /**
         * @return lastRunId
         */
        public String getLastRunId() {
            return this.lastRunId;
        }

        /**
         * @return lastWindowAt
         */
        public String getLastWindowAt() {
            return this.lastWindowAt;
        }

        /**
         * @return retryCount
         */
        public Integer getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private java.util.Map<String, ?> checkpoint; 
            private java.util.Map<String, String> currentWindow; 
            private String lastError; 
            private String lastRunId; 
            private String lastWindowAt; 
            private Integer retryCount; 
            private String state; 

            private Builder() {
            } 

            private Builder(SourceStatus model) {
                this.checkpoint = model.checkpoint;
                this.currentWindow = model.currentWindow;
                this.lastError = model.lastError;
                this.lastRunId = model.lastRunId;
                this.lastWindowAt = model.lastWindowAt;
                this.retryCount = model.retryCount;
                this.state = model.state;
            } 

            /**
             * <p>The processing progress. For memory trajectory, the format is {processTimeNs, watermarkMs}. For dataset, the format is {seq}. For manual, the format is {}. For experience Dataset follow, the seq field uses an exact int64 decimal string.</p>
             */
            public Builder checkpoint(java.util.Map<String, ?> checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The current reserved sequence window for experience Dataset follow, in the format of {after, until, runId}. All sequence numbers are decimal strings. If a failure occurs, the submitted checkpoint is not advanced.</p>
             */
            public Builder currentWindow(java.util.Map<String, String> currentWindow) {
                this.currentWindow = currentWindow;
                return this;
            }

            /**
             * <p>The last desensitized error message. This field is empty when the status is normal.</p>
             * 
             * <strong>example:</strong>
             * <p>Data source read timeout</p>
             */
            public Builder lastError(String lastError) {
                this.lastError = lastError;
                return this;
            }

            /**
             * <p>The run ID of the last successful automatic application to the native experience library. This field is for audit purposes only.</p>
             * 
             * <strong>example:</strong>
             * <p>opr-example</p>
             */
            public Builder lastRunId(String lastRunId) {
                this.lastRunId = lastRunId;
                return this;
            }

            /**
             * <p>The last window processing time in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-01T08:00:00Z</p>
             */
            public Builder lastWindowAt(String lastWindowAt) {
                this.lastWindowAt = lastWindowAt;
                return this;
            }

            /**
             * <p>The number of consecutive retries.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * <p>The state of the data source. Valid values: Validating, Ready, Running, Retrying, Paused, SourceSchemaChanged, and Failed.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public SourceStatus build() {
                return new SourceStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class ConfigStoragePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowedActions")
        private java.util.List<String> allowedActions;

        @com.aliyun.core.annotation.NameInMap("dedupe")
        private Boolean dedupe;

        @com.aliyun.core.annotation.NameInMap("humanEditProtection")
        private Boolean humanEditProtection;

        @com.aliyun.core.annotation.NameInMap("mergeKey")
        private String mergeKey;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("similarityThreshold")
        private Double similarityThreshold;

        @com.aliyun.core.annotation.NameInMap("ttlDays")
        private Integer ttlDays;

        private ConfigStoragePolicy(Builder builder) {
            this.allowedActions = builder.allowedActions;
            this.dedupe = builder.dedupe;
            this.humanEditProtection = builder.humanEditProtection;
            this.mergeKey = builder.mergeKey;
            this.mode = builder.mode;
            this.similarityThreshold = builder.similarityThreshold;
            this.ttlDays = builder.ttlDays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigStoragePolicy create() {
            return builder().build();
        }

        /**
         * @return allowedActions
         */
        public java.util.List<String> getAllowedActions() {
            return this.allowedActions;
        }

        /**
         * @return dedupe
         */
        public Boolean getDedupe() {
            return this.dedupe;
        }

        /**
         * @return humanEditProtection
         */
        public Boolean getHumanEditProtection() {
            return this.humanEditProtection;
        }

        /**
         * @return mergeKey
         */
        public String getMergeKey() {
            return this.mergeKey;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return similarityThreshold
         */
        public Double getSimilarityThreshold() {
            return this.similarityThreshold;
        }

        /**
         * @return ttlDays
         */
        public Integer getTtlDays() {
            return this.ttlDays;
        }

        public static final class Builder {
            private java.util.List<String> allowedActions; 
            private Boolean dedupe; 
            private Boolean humanEditProtection; 
            private String mergeKey; 
            private String mode; 
            private Double similarityThreshold; 
            private Integer ttlDays; 

            private Builder() {
            } 

            private Builder(ConfigStoragePolicy model) {
                this.allowedActions = model.allowedActions;
                this.dedupe = model.dedupe;
                this.humanEditProtection = model.humanEditProtection;
                this.mergeKey = model.mergeKey;
                this.mode = model.mode;
                this.similarityThreshold = model.similarityThreshold;
                this.ttlDays = model.ttlDays;
            } 

            /**
             * <p>The allowed storage actions. Default value: all actions. Valid values: ADD, UPDATE, MERGE, and DELETE.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;ADD&quot;,&quot;UPDATE&quot;,&quot;MERGE&quot;,&quot;DELETE&quot;]</p>
             */
            public Builder allowedActions(java.util.List<String> allowedActions) {
                this.allowedActions = allowedActions;
                return this;
            }

            /**
             * <p>Specifies whether to enable deduplication in event mode. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dedupe(Boolean dedupe) {
                this.dedupe = dedupe;
                return this;
            }

            /**
             * <p>Specifies whether to enable human edit protection. Default value: true. When enabled, automatic extraction does not overwrite manually modified memories.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder humanEditProtection(Boolean humanEditProtection) {
                this.humanEditProtection = humanEditProtection;
                return this;
            }

            /**
             * <p>The merge key for upsert operations. Default value: semantic. Valid values: factKey, semantic, and both.</p>
             * 
             * <strong>example:</strong>
             * <p>semantic</p>
             */
            public Builder mergeKey(String mergeKey) {
                this.mergeKey = mergeKey;
                return this;
            }

            /**
             * <p>The storage mode. Default value: upsert. Valid values: event (event append) and upsert (merge update).</p>
             * 
             * <strong>example:</strong>
             * <p>upsert</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The similarity threshold for semantic merging. Valid values: 0 to 1. Default value: 0.4.</p>
             * 
             * <strong>example:</strong>
             * <p>0.4</p>
             */
            public Builder similarityThreshold(Double similarityThreshold) {
                this.similarityThreshold = similarityThreshold;
                return this;
            }

            /**
             * <p>The number of days before memories expire. A value of 0 indicates that memories do not expire.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ttlDays(Integer ttlDays) {
                this.ttlDays = ttlDays;
                return this;
            }

            public ConfigStoragePolicy build() {
                return new ConfigStoragePolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("audit")
        private Audit audit;

        @com.aliyun.core.annotation.NameInMap("extractionPolicies")
        private java.util.List<ExtractionPolicies> extractionPolicies;

        @com.aliyun.core.annotation.NameInMap("extractionPolicy")
        private ExtractionPolicy extractionPolicy;

        @com.aliyun.core.annotation.NameInMap("innerSource")
        private InnerSource innerSource;

        @com.aliyun.core.annotation.NameInMap("metadataField")
        private java.util.Map<String, String> metadataField;

        @com.aliyun.core.annotation.NameInMap("miningInterval")
        private String miningInterval;

        @com.aliyun.core.annotation.NameInMap("miningTaskName")
        private String miningTaskName;

        @com.aliyun.core.annotation.NameInMap("observability")
        private Observability observability;

        @com.aliyun.core.annotation.NameInMap("outputDataset")
        private OutputDataset outputDataset;

        @com.aliyun.core.annotation.NameInMap("scopePolicy")
        private ScopePolicy scopePolicy;

        @com.aliyun.core.annotation.NameInMap("serviceNames")
        private java.util.List<String> serviceNames;

        @com.aliyun.core.annotation.NameInMap("source")
        private Source source;

        @com.aliyun.core.annotation.NameInMap("sourceStatus")
        private SourceStatus sourceStatus;

        @com.aliyun.core.annotation.NameInMap("storageModes")
        private java.util.List<String> storageModes;

        @com.aliyun.core.annotation.NameInMap("storagePolicy")
        private ConfigStoragePolicy storagePolicy;

        @com.aliyun.core.annotation.NameInMap("strategyVersion")
        private Integer strategyVersion;

        private Config(Builder builder) {
            this.audit = builder.audit;
            this.extractionPolicies = builder.extractionPolicies;
            this.extractionPolicy = builder.extractionPolicy;
            this.innerSource = builder.innerSource;
            this.metadataField = builder.metadataField;
            this.miningInterval = builder.miningInterval;
            this.miningTaskName = builder.miningTaskName;
            this.observability = builder.observability;
            this.outputDataset = builder.outputDataset;
            this.scopePolicy = builder.scopePolicy;
            this.serviceNames = builder.serviceNames;
            this.source = builder.source;
            this.sourceStatus = builder.sourceStatus;
            this.storageModes = builder.storageModes;
            this.storagePolicy = builder.storagePolicy;
            this.strategyVersion = builder.strategyVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return audit
         */
        public Audit getAudit() {
            return this.audit;
        }

        /**
         * @return extractionPolicies
         */
        public java.util.List<ExtractionPolicies> getExtractionPolicies() {
            return this.extractionPolicies;
        }

        /**
         * @return extractionPolicy
         */
        public ExtractionPolicy getExtractionPolicy() {
            return this.extractionPolicy;
        }

        /**
         * @return innerSource
         */
        public InnerSource getInnerSource() {
            return this.innerSource;
        }

        /**
         * @return metadataField
         */
        public java.util.Map<String, String> getMetadataField() {
            return this.metadataField;
        }

        /**
         * @return miningInterval
         */
        public String getMiningInterval() {
            return this.miningInterval;
        }

        /**
         * @return miningTaskName
         */
        public String getMiningTaskName() {
            return this.miningTaskName;
        }

        /**
         * @return observability
         */
        public Observability getObservability() {
            return this.observability;
        }

        /**
         * @return outputDataset
         */
        public OutputDataset getOutputDataset() {
            return this.outputDataset;
        }

        /**
         * @return scopePolicy
         */
        public ScopePolicy getScopePolicy() {
            return this.scopePolicy;
        }

        /**
         * @return serviceNames
         */
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

        /**
         * @return source
         */
        public Source getSource() {
            return this.source;
        }

        /**
         * @return sourceStatus
         */
        public SourceStatus getSourceStatus() {
            return this.sourceStatus;
        }

        /**
         * @return storageModes
         */
        public java.util.List<String> getStorageModes() {
            return this.storageModes;
        }

        /**
         * @return storagePolicy
         */
        public ConfigStoragePolicy getStoragePolicy() {
            return this.storagePolicy;
        }

        /**
         * @return strategyVersion
         */
        public Integer getStrategyVersion() {
            return this.strategyVersion;
        }

        public static final class Builder {
            private Audit audit; 
            private java.util.List<ExtractionPolicies> extractionPolicies; 
            private ExtractionPolicy extractionPolicy; 
            private InnerSource innerSource; 
            private java.util.Map<String, String> metadataField; 
            private String miningInterval; 
            private String miningTaskName; 
            private Observability observability; 
            private OutputDataset outputDataset; 
            private ScopePolicy scopePolicy; 
            private java.util.List<String> serviceNames; 
            private Source source; 
            private SourceStatus sourceStatus; 
            private java.util.List<String> storageModes; 
            private ConfigStoragePolicy storagePolicy; 
            private Integer strategyVersion; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.audit = model.audit;
                this.extractionPolicies = model.extractionPolicies;
                this.extractionPolicy = model.extractionPolicy;
                this.innerSource = model.innerSource;
                this.metadataField = model.metadataField;
                this.miningInterval = model.miningInterval;
                this.miningTaskName = model.miningTaskName;
                this.observability = model.observability;
                this.outputDataset = model.outputDataset;
                this.scopePolicy = model.scopePolicy;
                this.serviceNames = model.serviceNames;
                this.source = model.source;
                this.sourceStatus = model.sourceStatus;
                this.storageModes = model.storageModes;
                this.storagePolicy = model.storagePolicy;
                this.strategyVersion = model.strategyVersion;
            } 

            /**
             * <p>The audit configuration.</p>
             */
            public Builder audit(Audit audit) {
                this.audit = audit;
                return this;
            }

            /**
             * <p>The extraction policies. You can configure 1 to 10 policies. The strategyVersion parameter indicates the snapshot version of the entire library configuration.</p>
             */
            public Builder extractionPolicies(java.util.List<ExtractionPolicies> extractionPolicies) {
                this.extractionPolicies = extractionPolicies;
                return this;
            }

            /**
             * <p>The extraction policy for the memory type.</p>
             */
            public Builder extractionPolicy(ExtractionPolicy extractionPolicy) {
                this.extractionPolicy = extractionPolicy;
                return this;
            }

            /**
             * <p>The system-assigned coordinates of the event Logstore for the memory type. The Logstore is located in the Simple Log Service (SLS) project bound to the AgentSpace.</p>
             */
            public Builder innerSource(InnerSource innerSource) {
                this.innerSource = innerSource;
                return this;
            }

            /**
             * <p>The metadata field mapping. The key is the business field and the value is the storage field.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;userId&quot;:&quot;user_id&quot;,&quot;sessionId&quot;:&quot;session_id&quot;}</p>
             */
            public Builder metadataField(java.util.Map<String, String> metadataField) {
                this.metadataField = metadataField;
                return this;
            }

            /**
             * <p>The interval for experience mining. Valid values: 1h, 6h, 12h, and 1d. Default value: 1d.</p>
             * 
             * <strong>example:</strong>
             * <p>1d</p>
             */
            public Builder miningInterval(String miningInterval) {
                this.miningInterval = miningInterval;
                return this;
            }

            /**
             * <p>The name of the internal running task associated with the server. For continuous libraries, it is used to view consumption records in read-only mode. For manual libraries, it can run limited mining. It is not inferred by the client and cannot replace the ingestion and recall criteria of the native experience library.</p>
             * 
             * <strong>example:</strong>
             * <p>experience-review-library</p>
             */
            public Builder miningTaskName(String miningTaskName) {
                this.miningTaskName = miningTaskName;
                return this;
            }

            /**
             * <p>The observability resource coordinates (memory type).</p>
             */
            public Builder observability(Observability observability) {
                this.observability = observability;
                return this;
            }

            /**
             * <p>The location of the memory output dataset (memory type).</p>
             */
            public Builder outputDataset(OutputDataset outputDataset) {
                this.outputDataset = outputDataset;
                return this;
            }

            /**
             * <p>The scope constraint policy.</p>
             */
            public Builder scopePolicy(ScopePolicy scopePolicy) {
                this.scopePolicy = scopePolicy;
                return this;
            }

            /**
             * <p>The list of service names used to locate the trace data source together with source.agentSpace. This parameter cannot be modified in the current phase.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;order-service&quot;,&quot;payment-service&quot;]</p>
             */
            public Builder serviceNames(java.util.List<String> serviceNames) {
                this.serviceNames = serviceNames;
                return this;
            }

            /**
             * <p>The data source configuration provided by the user, which serves only as the root identifier of the data source.</p>
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The running status of the data source, applicable to the memory type and experience Dataset follow mode. The experience library submits a checkpoint only after it is published and automatically applied successfully. Pausing and restarting retain the checkpoint.</p>
             */
            public Builder sourceStatus(SourceStatus sourceStatus) {
                this.sourceStatus = sourceStatus;
                return this;
            }

            /**
             * storageModes.
             */
            public Builder storageModes(java.util.List<String> storageModes) {
                this.storageModes = storageModes;
                return this;
            }

            /**
             * <p>The storage policy for the memory type.</p>
             */
            public Builder storagePolicy(ConfigStoragePolicy storagePolicy) {
                this.storagePolicy = storagePolicy;
                return this;
            }

            /**
             * <p>The currently effective strategy version number for the memory type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder strategyVersion(Integer strategyVersion) {
                this.strategyVersion = strategyVersion;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
