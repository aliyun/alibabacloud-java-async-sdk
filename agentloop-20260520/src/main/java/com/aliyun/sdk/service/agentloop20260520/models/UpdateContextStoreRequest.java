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
 * {@link UpdateContextStoreRequest} extends {@link RequestModel}
 *
 * <p>UpdateContextStoreRequest</p>
 */
public class UpdateContextStoreRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String contextStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("changeNote")
    private String changeNote;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private Config config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contextType")
    private String contextType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateContextStoreRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.contextStoreName = builder.contextStoreName;
        this.changeNote = builder.changeNote;
        this.config = builder.config;
        this.contextType = builder.contextType;
        this.description = builder.description;
        this.status = builder.status;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContextStoreRequest create() {
        return builder().build();
    }

@Override
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
     * @return contextStoreName
     */
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    /**
     * @return changeNote
     */
    public String getChangeNote() {
        return this.changeNote;
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return contextType
     */
    public String getContextType() {
        return this.contextType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateContextStoreRequest, Builder> {
        private String agentSpace; 
        private String contextStoreName; 
        private String changeNote; 
        private Config config; 
        private String contextType; 
        private String description; 
        private String status; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateContextStoreRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.contextStoreName = request.contextStoreName;
            this.changeNote = request.changeNote;
            this.config = request.config;
            this.contextType = request.contextType;
            this.description = request.description;
            this.status = request.status;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The name of the AgentSpace, which must be 2 to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The name of the context store to be updated, which must be 2 to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-context-store</p>
         */
        public Builder contextStoreName(String contextStoreName) {
            this.putPathParameter("contextStoreName", contextStoreName);
            this.contextStoreName = contextStoreName;
            return this;
        }

        /**
         * <p>The description of the policy change. A new policy version is created when policy fields in the configuration are modified.</p>
         * 
         * <strong>example:</strong>
         * <p>Relax similarity threshold</p>
         */
        public Builder changeNote(String changeNote) {
            this.putBodyParameter("changeNote", changeNote);
            this.changeNote = changeNote;
            return this;
        }

        /**
         * <p>The context library configuration. If provided, it fully overwrites the existing configuration. If omitted, the original configuration is retained.</p>
         */
        public Builder config(Config config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The context library type. This field is typically immutable after creation and is provided only for exception correction.</p>
         * 
         * <strong>example:</strong>
         * <p>experience</p>
         */
        public Builder contextType(String contextType) {
            this.putBodyParameter("contextType", contextType);
            this.contextType = contextType;
            return this;
        }

        /**
         * <p>The description of the context library, which helps business users understand its purpose.</p>
         * 
         * <strong>example:</strong>
         * <p>My context library</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The running status. For the memory type, valid values are Active (running) and Paused (data source consumption and extraction paused). For the experience type, it indicates the mining status of the experience library. The specific valid values and combination constraints are defined by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The idempotency token. It is a unique string generated by the client to ensure the idempotence of the update operation.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateContextStoreRequest build() {
            return new UpdateContextStoreRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>UpdateContextStoreRequest</p>
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
     * {@link UpdateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>UpdateContextStoreRequest</p>
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
             * <p>The name of the extraction model. Currently, only qwen3.8-flash is supported, which uses internal platform credentials.</p>
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
     * {@link UpdateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>UpdateContextStoreRequest</p>
     */
    public static class ExtractionPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("categories")
        private java.util.List<String> categories;

        @com.aliyun.core.annotation.NameInMap("customInstructions")
        private String customInstructions;

        @com.aliyun.core.annotation.NameInMap("excludeRules")
        private java.util.List<String> excludeRules;

        @com.aliyun.core.annotation.NameInMap("model")
        private Model model;

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
        public Model getModel() {
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
            private Model model; 
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
             * <p>The custom extraction instructions. This parameter is required when preset is set to custom. Length: 1 to 8000 characters.</p>
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
            public Builder model(Model model) {
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
     * {@link UpdateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>UpdateContextStoreRequest</p>
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
             * <p>The list of scope fields where at least one must be non-empty. Valid element values: userId, agentId, appId, and runId.</p>
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
     * {@link UpdateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>UpdateContextStoreRequest</p>
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
             * <p>The description of the field. This parameter is required when usage is set to extraction-input.</p>
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
             * <p>The target write path, such as metadata.customerTier.</p>
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
     * {@link UpdateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>UpdateContextStoreRequest</p>
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
             * <p>The subset of the Pipeline where clause, which is pushed down to SQL.</p>
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
     * {@link UpdateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>UpdateContextStoreRequest</p>
     */
    public static class Dataset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("customFields")
        private java.util.List<CustomFields> customFields;

        @com.aliyun.core.annotation.NameInMap("filter")
        private Filter filter;

        @com.aliyun.core.annotation.NameInMap("pollIntervalSeconds")
        private Integer pollIntervalSeconds;

        private Dataset(Builder builder) {
            this.customFields = builder.customFields;
            this.filter = builder.filter;
            this.pollIntervalSeconds = builder.pollIntervalSeconds;
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

        public static final class Builder {
            private java.util.List<CustomFields> customFields; 
            private Filter filter; 
            private Integer pollIntervalSeconds; 

            private Builder() {
            } 

            private Builder(Dataset model) {
                this.customFields = model.customFields;
                this.filter = model.filter;
                this.pollIntervalSeconds = model.pollIntervalSeconds;
            } 

            /**
             * <p>The list of custom field declarations. If provided, it fully overwrites the existing declarations.</p>
             */
            public Builder customFields(java.util.List<CustomFields> customFields) {
                this.customFields = customFields;
                return this;
            }

            /**
             * <p>The row filter conditions.</p>
             */
            public Builder filter(Filter filter) {
                this.filter = filter;
                return this;
            }

            /**
             * <p>The polling interval in seconds. Valid values: 60 to 3600.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder pollIntervalSeconds(Integer pollIntervalSeconds) {
                this.pollIntervalSeconds = pollIntervalSeconds;
                return this;
            }

            public Dataset build() {
                return new Dataset(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>UpdateContextStoreRequest</p>
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
             * <p>The list of agent names. An explicitly empty list returns a 400 error.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;sales-copilot&quot;]</p>
             */
            public Builder agentNames(java.util.List<String> agentNames) {
                this.agentNames = agentNames;
                return this;
            }

            /**
             * <p>Specifies whether to exclude degraded trajectories. Default value: false (degraded trajectories are included).</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder excludeDegraded(Boolean excludeDegraded) {
                this.excludeDegraded = excludeDegraded;
                return this;
            }

            /**
             * <p>The minimum number of steps, which must be greater than or equal to 0.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder minStepCount(Integer minStepCount) {
                this.minStepCount = minStepCount;
                return this;
            }

            /**
             * <p>The native SLS query statement. This statement is combined with the preceding conditions by using the AND operator.</p>
             * 
             * <strong>example:</strong>
             * <p>tool_names:&quot;search_order&quot;</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * <p>The list of service names. A single trailing asterisk (*) is supported. Specifying an explicitly empty list returns a 400 error.</p>
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
     * {@link UpdateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>UpdateContextStoreRequest</p>
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
             * <p>The JSONPath expression for the agentId field. Default value: $.agent_name.</p>
             * 
             * <strong>example:</strong>
             * <p>$.agent_name</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The JSONPath expression for the appId field. Default value: $.service_names[0].</p>
             * 
             * <strong>example:</strong>
             * <p>$.service_names[0]</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The JSONPath expression for the runId field. Default value: $.trajectory_id.</p>
             * 
             * <strong>example:</strong>
             * <p>$.trajectory_id</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The JSONPath expression for the userId field. By default, this field is not mapped.</p>
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
     * {@link UpdateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>UpdateContextStoreRequest</p>
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

        private Trajectory(Builder builder) {
            this.filter = builder.filter;
            this.logstore = builder.logstore;
            this.pollIntervalSeconds = builder.pollIntervalSeconds;
            this.scopeMapping = builder.scopeMapping;
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

        public static final class Builder {
            private TrajectoryFilter filter; 
            private String logstore; 
            private Integer pollIntervalSeconds; 
            private ScopeMapping scopeMapping; 

            private Builder() {
            } 

            private Builder(Trajectory model) {
                this.filter = model.filter;
                this.logstore = model.logstore;
                this.pollIntervalSeconds = model.pollIntervalSeconds;
                this.scopeMapping = model.scopeMapping;
            } 

            /**
             * <p>The trajectory filter conditions. Conditions are combined with AND, while items within a list are combined with OR.</p>
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
             * <p>The polling interval in seconds. Valid values: 60 to 3600.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder pollIntervalSeconds(Integer pollIntervalSeconds) {
                this.pollIntervalSeconds = pollIntervalSeconds;
                return this;
            }

            /**
             * <p>The scope field mapping. The value must be a JSONPath expression. Only the $.a.b and $.a[0] formats are supported.</p>
             */
            public Builder scopeMapping(ScopeMapping scopeMapping) {
                this.scopeMapping = scopeMapping;
                return this;
            }

            public Trajectory build() {
                return new Trajectory(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>UpdateContextStoreRequest</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpace")
        private String agentSpace;

        @com.aliyun.core.annotation.NameInMap("dataset")
        private Dataset dataset;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("trajectory")
        private Trajectory trajectory;

        private Source(Builder builder) {
            this.agentSpace = builder.agentSpace;
            this.dataset = builder.dataset;
            this.startTime = builder.startTime;
            this.trajectory = builder.trajectory;
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
         * @return dataset
         */
        public Dataset getDataset() {
            return this.dataset;
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

        public static final class Builder {
            private String agentSpace; 
            private Dataset dataset; 
            private String startTime; 
            private Trajectory trajectory; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.agentSpace = model.agentSpace;
                this.dataset = model.dataset;
                this.startTime = model.startTime;
                this.trajectory = model.trajectory;
            } 

            /**
             * <p>The AgentSpace where the trace data source is located. Cross-AgentSpace is not supported in the current phase. If provided, it must be equal to the path AgentSpace. Otherwise, a 400 parameter error is returned. The AgentSpace cannot be changed after creation.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-space</p>
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
            }

            /**
             * <p>The updatable items for the Dataset data source. The datasetName cannot be changed after creation.</p>
             */
            public Builder dataset(Dataset dataset) {
                this.dataset = dataset;
                return this;
            }

            /**
             * <p>The start time for data backfill, in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The updatable items for the trajectory data source. The source.type cannot be changed after creation.</p>
             */
            public Builder trajectory(Trajectory trajectory) {
                this.trajectory = trajectory;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>UpdateContextStoreRequest</p>
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
             * <p>The allowed storage actions. By default, all actions are allowed: ADD, UPDATE, MERGE, and DELETE.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;ADD&quot;,&quot;UPDATE&quot;,&quot;MERGE&quot;,&quot;DELETE&quot;]</p>
             */
            public Builder allowedActions(java.util.List<String> allowedActions) {
                this.allowedActions = allowedActions;
                return this;
            }

            /**
             * <p>Specifies whether to deduplicate events in event mode. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dedupe(Boolean dedupe) {
                this.dedupe = dedupe;
                return this;
            }

            /**
             * <p>Specifies whether to enable human edit protection. Default value: true. When this feature is enabled, automatic extraction does not overwrite manually modified memories.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder humanEditProtection(Boolean humanEditProtection) {
                this.humanEditProtection = humanEditProtection;
                return this;
            }

            /**
             * <p>The merge key for upsert operations. Valid values: factKey, semantic, and both. Default value: semantic.</p>
             * 
             * <strong>example:</strong>
             * <p>semantic</p>
             */
            public Builder mergeKey(String mergeKey) {
                this.mergeKey = mergeKey;
                return this;
            }

            /**
             * <p>The storage mode. Valid values: event (append events) and upsert (merge and update). Default value: upsert.</p>
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
             * <p>The number of days before the memory expires. A value of 0 indicates that the memory never expires.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link UpdateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>UpdateContextStoreRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("audit")
        private Audit audit;

        @com.aliyun.core.annotation.NameInMap("extractionPolicy")
        private ExtractionPolicy extractionPolicy;

        @com.aliyun.core.annotation.NameInMap("metadataField")
        private java.util.Map<String, String> metadataField;

        @com.aliyun.core.annotation.NameInMap("scopePolicy")
        private ScopePolicy scopePolicy;

        @com.aliyun.core.annotation.NameInMap("source")
        private Source source;

        @com.aliyun.core.annotation.NameInMap("storagePolicy")
        private StoragePolicy storagePolicy;

        private Config(Builder builder) {
            this.audit = builder.audit;
            this.extractionPolicy = builder.extractionPolicy;
            this.metadataField = builder.metadataField;
            this.scopePolicy = builder.scopePolicy;
            this.source = builder.source;
            this.storagePolicy = builder.storagePolicy;
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
         * @return extractionPolicy
         */
        public ExtractionPolicy getExtractionPolicy() {
            return this.extractionPolicy;
        }

        /**
         * @return metadataField
         */
        public java.util.Map<String, String> getMetadataField() {
            return this.metadataField;
        }

        /**
         * @return scopePolicy
         */
        public ScopePolicy getScopePolicy() {
            return this.scopePolicy;
        }

        /**
         * @return source
         */
        public Source getSource() {
            return this.source;
        }

        /**
         * @return storagePolicy
         */
        public StoragePolicy getStoragePolicy() {
            return this.storagePolicy;
        }

        public static final class Builder {
            private Audit audit; 
            private ExtractionPolicy extractionPolicy; 
            private java.util.Map<String, String> metadataField; 
            private ScopePolicy scopePolicy; 
            private Source source; 
            private StoragePolicy storagePolicy; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.audit = model.audit;
                this.extractionPolicy = model.extractionPolicy;
                this.metadataField = model.metadataField;
                this.scopePolicy = model.scopePolicy;
                this.source = model.source;
                this.storagePolicy = model.storagePolicy;
            } 

            /**
             * <p>The audit configuration.</p>
             */
            public Builder audit(Audit audit) {
                this.audit = audit;
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
             * <p>The metadata field mapping. The key is the business field, and the value is the storage field.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;userId&quot;:&quot;user_id&quot;,&quot;sessionId&quot;:&quot;session_id&quot;}</p>
             */
            public Builder metadataField(java.util.Map<String, String> metadataField) {
                this.metadataField = metadataField;
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
             * <p>The datasource config, which serves only as the root identity for the data source.</p>
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The storage policy for the memory type.</p>
             */
            public Builder storagePolicy(StoragePolicy storagePolicy) {
                this.storagePolicy = storagePolicy;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
