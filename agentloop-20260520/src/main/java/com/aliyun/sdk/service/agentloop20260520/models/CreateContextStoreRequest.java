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
 * {@link CreateContextStoreRequest} extends {@link RequestModel}
 *
 * <p>CreateContextStoreRequest</p>
 */
public class CreateContextStoreRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String agentSpace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private Config config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contextStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contextType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contextType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateContextStoreRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.config = builder.config;
        this.contextStoreName = builder.contextStoreName;
        this.contextType = builder.contextType;
        this.description = builder.description;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContextStoreRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateContextStoreRequest, Builder> {
        private String agentSpace; 
        private Config config; 
        private String contextStoreName; 
        private String contextType; 
        private String description; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateContextStoreRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.config = request.config;
            this.contextStoreName = request.contextStoreName;
            this.contextType = request.contextType;
            this.description = request.description;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The AgentSpace name. The name must be 2 to 64 characters in length.</p>
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
         * <p>The context store configuration, including the datasource config and metadata field mapping.</p>
         */
        public Builder config(Config config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The context store name, which must be globally unique within the AgentSpace. The name must be 2 to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-context-store</p>
         */
        public Builder contextStoreName(String contextStoreName) {
            this.putBodyParameter("contextStoreName", contextStoreName);
            this.contextStoreName = contextStoreName;
            return this;
        }

        /**
         * <p>The context store type. Valid values: experience and memory.</p>
         * <p>This parameter is required.</p>
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
         * <p>The description of the context store, which helps users understand its purpose.</p>
         * 
         * <strong>example:</strong>
         * <p>我的上下文库</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The idempotency token, which is a unique string generated by the client to ensure the idempotence of the create operation.</p>
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
        public CreateContextStoreRequest build() {
            return new CreateContextStoreRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateContextStoreRequest</p>
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
             * droppedCandidates.
             */
            public Builder droppedCandidates(Boolean droppedCandidates) {
                this.droppedCandidates = droppedCandidates;
                return this;
            }

            /**
             * queryMode.
             */
            public Builder queryMode(String queryMode) {
                this.queryMode = queryMode;
                return this;
            }

            /**
             * retentionDays.
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
     * {@link CreateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateContextStoreRequest</p>
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
             * name.
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
     * {@link CreateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateContextStoreRequest</p>
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
             * categories.
             */
            public Builder categories(java.util.List<String> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * customInstructions.
             */
            public Builder customInstructions(String customInstructions) {
                this.customInstructions = customInstructions;
                return this;
            }

            /**
             * excludeRules.
             */
            public Builder excludeRules(java.util.List<String> excludeRules) {
                this.excludeRules = excludeRules;
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
             * preset.
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
     * {@link CreateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateContextStoreRequest</p>
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
             * requiredAnyOf.
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
     * {@link CreateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateContextStoreRequest</p>
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
             * <p>The description of the context store, which helps users understand its purpose.</p>
             * 
             * <strong>example:</strong>
             * <p>我的上下文库</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * sensitive.
             */
            public Builder sensitive(Boolean sensitive) {
                this.sensitive = sensitive;
                return this;
            }

            /**
             * sourceField.
             */
            public Builder sourceField(String sourceField) {
                this.sourceField = sourceField;
                return this;
            }

            /**
             * target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * usage.
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
     * {@link CreateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateContextStoreRequest</p>
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
             * where.
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
     * {@link CreateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateContextStoreRequest</p>
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
             * mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * startSeq.
             */
            public Builder startSeq(Long startSeq) {
                this.startSeq = startSeq;
                return this;
            }

            /**
             * version.
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
     * {@link CreateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateContextStoreRequest</p>
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
             * customFields.
             */
            public Builder customFields(java.util.List<CustomFields> customFields) {
                this.customFields = customFields;
                return this;
            }

            /**
             * datasetName.
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * filter.
             */
            public Builder filter(Filter filter) {
                this.filter = filter;
                return this;
            }

            /**
             * pollIntervalSeconds.
             */
            public Builder pollIntervalSeconds(Integer pollIntervalSeconds) {
                this.pollIntervalSeconds = pollIntervalSeconds;
                return this;
            }

            /**
             * schemaContract.
             */
            public Builder schemaContract(String schemaContract) {
                this.schemaContract = schemaContract;
                return this;
            }

            /**
             * versionPolicy.
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
     * {@link CreateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateContextStoreRequest</p>
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
             * agentNames.
             */
            public Builder agentNames(java.util.List<String> agentNames) {
                this.agentNames = agentNames;
                return this;
            }

            /**
             * excludeDegraded.
             */
            public Builder excludeDegraded(Boolean excludeDegraded) {
                this.excludeDegraded = excludeDegraded;
                return this;
            }

            /**
             * minStepCount.
             */
            public Builder minStepCount(Integer minStepCount) {
                this.minStepCount = minStepCount;
                return this;
            }

            /**
             * query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * serviceNames.
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
     * {@link CreateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateContextStoreRequest</p>
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
             * agentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * appId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * runId.
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * userId.
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
     * {@link CreateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateContextStoreRequest</p>
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
             * filter.
             */
            public Builder filter(TrajectoryFilter filter) {
                this.filter = filter;
                return this;
            }

            /**
             * logstore.
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * pollIntervalSeconds.
             */
            public Builder pollIntervalSeconds(Integer pollIntervalSeconds) {
                this.pollIntervalSeconds = pollIntervalSeconds;
                return this;
            }

            /**
             * scopeMapping.
             */
            public Builder scopeMapping(ScopeMapping scopeMapping) {
                this.scopeMapping = scopeMapping;
                return this;
            }

            /**
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
     * {@link CreateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateContextStoreRequest</p>
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

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Source(Builder builder) {
            this.agentSpace = builder.agentSpace;
            this.dataset = builder.dataset;
            this.startTime = builder.startTime;
            this.trajectory = builder.trajectory;
            this.type = builder.type;
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

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String agentSpace; 
            private Dataset dataset; 
            private String startTime; 
            private Trajectory trajectory; 
            private String type; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.agentSpace = model.agentSpace;
                this.dataset = model.dataset;
                this.startTime = model.startTime;
                this.trajectory = model.trajectory;
                this.type = model.type;
            } 

            /**
             * <p>The AgentSpace where the trace data source resides. If not specified, the AgentSpace in the current path is used by default. Cross-AgentSpace access is not supported in the current version. If specified, the value must match the AgentSpace in the path. Otherwise, a 400 parameter error is returned. This value cannot be changed after creation.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-space</p>
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
            }

            /**
             * dataset.
             */
            public Builder dataset(Dataset dataset) {
                this.dataset = dataset;
                return this;
            }

            /**
             * <p>The start time for data backfill, in ISO 8601 UTC format. If not specified, the current time is used.</p>
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
             * trajectory.
             */
            public Builder trajectory(Trajectory trajectory) {
                this.trajectory = trajectory;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateContextStoreRequest</p>
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
     * {@link CreateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateContextStoreRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("audit")
        private Audit audit;

        @com.aliyun.core.annotation.NameInMap("extractionPolicy")
        private ExtractionPolicy extractionPolicy;

        @com.aliyun.core.annotation.NameInMap("metadataField")
        private java.util.Map<String, String> metadataField;

        @com.aliyun.core.annotation.NameInMap("miningInterval")
        private String miningInterval;

        @com.aliyun.core.annotation.NameInMap("scopePolicy")
        private ScopePolicy scopePolicy;

        @com.aliyun.core.annotation.NameInMap("serviceNames")
        private java.util.List<String> serviceNames;

        @com.aliyun.core.annotation.NameInMap("source")
        private Source source;

        @com.aliyun.core.annotation.NameInMap("storagePolicy")
        private StoragePolicy storagePolicy;

        private Config(Builder builder) {
            this.audit = builder.audit;
            this.extractionPolicy = builder.extractionPolicy;
            this.metadataField = builder.metadataField;
            this.miningInterval = builder.miningInterval;
            this.scopePolicy = builder.scopePolicy;
            this.serviceNames = builder.serviceNames;
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
         * @return miningInterval
         */
        public String getMiningInterval() {
            return this.miningInterval;
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
         * @return storagePolicy
         */
        public StoragePolicy getStoragePolicy() {
            return this.storagePolicy;
        }

        public static final class Builder {
            private Audit audit; 
            private ExtractionPolicy extractionPolicy; 
            private java.util.Map<String, String> metadataField; 
            private String miningInterval; 
            private ScopePolicy scopePolicy; 
            private java.util.List<String> serviceNames; 
            private Source source; 
            private StoragePolicy storagePolicy; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.audit = model.audit;
                this.extractionPolicy = model.extractionPolicy;
                this.metadataField = model.metadataField;
                this.miningInterval = model.miningInterval;
                this.scopePolicy = model.scopePolicy;
                this.serviceNames = model.serviceNames;
                this.source = model.source;
                this.storagePolicy = model.storagePolicy;
            } 

            /**
             * audit.
             */
            public Builder audit(Audit audit) {
                this.audit = audit;
                return this;
            }

            /**
             * extractionPolicy.
             */
            public Builder extractionPolicy(ExtractionPolicy extractionPolicy) {
                this.extractionPolicy = extractionPolicy;
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
             * <p>The experience mining interval, which specifies how often experience mining is performed. Valid values: 1h, 6h, 12h, and 1d. Default value: 1d. This value cannot be changed after creation.</p>
             * 
             * <strong>example:</strong>
             * <p>1d</p>
             */
            public Builder miningInterval(String miningInterval) {
                this.miningInterval = miningInterval;
                return this;
            }

            /**
             * scopePolicy.
             */
            public Builder scopePolicy(ScopePolicy scopePolicy) {
                this.scopePolicy = scopePolicy;
                return this;
            }

            /**
             * <p>The list of service names. This parameter is required and cannot be empty. It works with source.agentSpace to locate the trace data source. The trajectory extraction service uses the AgentSpace to look up the bound CMS workspace and project/logstore, and then filters by service name. This value cannot be changed after creation. No modification entry is available in the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;order-service&quot;,&quot;payment-service&quot;]</p>
             */
            public Builder serviceNames(java.util.List<String> serviceNames) {
                this.serviceNames = serviceNames;
                return this;
            }

            /**
             * <p>The datasource config, which serves only as the root identifier for the data source. This is an optional block.</p>
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * storagePolicy.
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
