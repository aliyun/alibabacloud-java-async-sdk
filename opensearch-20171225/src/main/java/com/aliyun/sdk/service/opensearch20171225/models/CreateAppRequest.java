// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppRequest} extends {@link RequestModel}
 *
 * <p>CreateAppRequest</p>
 */
public class CreateAppRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoSwitch")
    private Boolean autoSwitch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cluster")
    private Cluster cluster;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSources")
    private java.util.List < DataSources> dataSources;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("domain")
    private Domain domain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fetchFields")
    private java.util.List < String > fetchFields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("firstRanks")
    private java.util.List < FirstRanks> firstRanks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("networkType")
    private String networkType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("queryProcessors")
    private java.util.List < QueryProcessors> queryProcessors;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("schema")
    private Schema schema;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("schemas")
    private java.util.List < Schemas> schemas;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("secondRanks")
    private java.util.List < SecondRanks> secondRanks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("summaries")
    private java.util.List < Summaries> summaries;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private CreateAppRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.autoSwitch = builder.autoSwitch;
        this.cluster = builder.cluster;
        this.dataSources = builder.dataSources;
        this.description = builder.description;
        this.domain = builder.domain;
        this.fetchFields = builder.fetchFields;
        this.firstRanks = builder.firstRanks;
        this.networkType = builder.networkType;
        this.queryProcessors = builder.queryProcessors;
        this.schema = builder.schema;
        this.schemas = builder.schemas;
        this.secondRanks = builder.secondRanks;
        this.summaries = builder.summaries;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return autoSwitch
     */
    public Boolean getAutoSwitch() {
        return this.autoSwitch;
    }

    /**
     * @return cluster
     */
    public Cluster getCluster() {
        return this.cluster;
    }

    /**
     * @return dataSources
     */
    public java.util.List < DataSources> getDataSources() {
        return this.dataSources;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domain
     */
    public Domain getDomain() {
        return this.domain;
    }

    /**
     * @return fetchFields
     */
    public java.util.List < String > getFetchFields() {
        return this.fetchFields;
    }

    /**
     * @return firstRanks
     */
    public java.util.List < FirstRanks> getFirstRanks() {
        return this.firstRanks;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return queryProcessors
     */
    public java.util.List < QueryProcessors> getQueryProcessors() {
        return this.queryProcessors;
    }

    /**
     * @return schema
     */
    public Schema getSchema() {
        return this.schema;
    }

    /**
     * @return schemas
     */
    public java.util.List < Schemas> getSchemas() {
        return this.schemas;
    }

    /**
     * @return secondRanks
     */
    public java.util.List < SecondRanks> getSecondRanks() {
        return this.secondRanks;
    }

    /**
     * @return summaries
     */
    public java.util.List < Summaries> getSummaries() {
        return this.summaries;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateAppRequest, Builder> {
        private String appGroupIdentity; 
        private Boolean autoSwitch; 
        private Cluster cluster; 
        private java.util.List < DataSources> dataSources; 
        private String description; 
        private Domain domain; 
        private java.util.List < String > fetchFields; 
        private java.util.List < FirstRanks> firstRanks; 
        private String networkType; 
        private java.util.List < QueryProcessors> queryProcessors; 
        private Schema schema; 
        private java.util.List < Schemas> schemas; 
        private java.util.List < SecondRanks> secondRanks; 
        private java.util.List < Summaries> summaries; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.autoSwitch = request.autoSwitch;
            this.cluster = request.cluster;
            this.dataSources = request.dataSources;
            this.description = request.description;
            this.domain = request.domain;
            this.fetchFields = request.fetchFields;
            this.firstRanks = request.firstRanks;
            this.networkType = request.networkType;
            this.queryProcessors = request.queryProcessors;
            this.schema = request.schema;
            this.schemas = request.schemas;
            this.secondRanks = request.secondRanks;
            this.summaries = request.summaries;
            this.dryRun = request.dryRun;
        } 

        /**
         * The name of the application
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * autoSwitch.
         */
        public Builder autoSwitch(Boolean autoSwitch) {
            this.putBodyParameter("autoSwitch", autoSwitch);
            this.autoSwitch = autoSwitch;
            return this;
        }

        /**
         * cluster.
         */
        public Builder cluster(Cluster cluster) {
            this.putBodyParameter("cluster", cluster);
            this.cluster = cluster;
            return this;
        }

        /**
         * dataSources.
         */
        public Builder dataSources(java.util.List < DataSources> dataSources) {
            this.putBodyParameter("dataSources", dataSources);
            this.dataSources = dataSources;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * domain.
         */
        public Builder domain(Domain domain) {
            this.putBodyParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * fetchFields.
         */
        public Builder fetchFields(java.util.List < String > fetchFields) {
            this.putBodyParameter("fetchFields", fetchFields);
            this.fetchFields = fetchFields;
            return this;
        }

        /**
         * firstRanks.
         */
        public Builder firstRanks(java.util.List < FirstRanks> firstRanks) {
            this.putBodyParameter("firstRanks", firstRanks);
            this.firstRanks = firstRanks;
            return this;
        }

        /**
         * networkType.
         */
        public Builder networkType(String networkType) {
            this.putBodyParameter("networkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * queryProcessors.
         */
        public Builder queryProcessors(java.util.List < QueryProcessors> queryProcessors) {
            this.putBodyParameter("queryProcessors", queryProcessors);
            this.queryProcessors = queryProcessors;
            return this;
        }

        /**
         * schema.
         */
        public Builder schema(Schema schema) {
            this.putBodyParameter("schema", schema);
            this.schema = schema;
            return this;
        }

        /**
         * schemas.
         */
        public Builder schemas(java.util.List < Schemas> schemas) {
            this.putBodyParameter("schemas", schemas);
            this.schemas = schemas;
            return this;
        }

        /**
         * secondRanks.
         */
        public Builder secondRanks(java.util.List < SecondRanks> secondRanks) {
            this.putBodyParameter("secondRanks", secondRanks);
            this.secondRanks = secondRanks;
            return this;
        }

        /**
         * summaries.
         */
        public Builder summaries(java.util.List < Summaries> summaries) {
            this.putBodyParameter("summaries", summaries);
            this.summaries = summaries;
            return this;
        }

        /**
         * Specifies whether to perform a dry run. This parameter is only used to check whether the data source is valid. Valid values: true and false.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public CreateAppRequest build() {
            return new CreateAppRequest(this);
        } 

    } 

    public static class Cluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxQueryClauseLength")
        private Integer maxQueryClauseLength;

        @com.aliyun.core.annotation.NameInMap("maxTimeoutMS")
        private Integer maxTimeoutMS;

        private Cluster(Builder builder) {
            this.maxQueryClauseLength = builder.maxQueryClauseLength;
            this.maxTimeoutMS = builder.maxTimeoutMS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cluster create() {
            return builder().build();
        }

        /**
         * @return maxQueryClauseLength
         */
        public Integer getMaxQueryClauseLength() {
            return this.maxQueryClauseLength;
        }

        /**
         * @return maxTimeoutMS
         */
        public Integer getMaxTimeoutMS() {
            return this.maxTimeoutMS;
        }

        public static final class Builder {
            private Integer maxQueryClauseLength; 
            private Integer maxTimeoutMS; 

            /**
             * maxQueryClauseLength.
             */
            public Builder maxQueryClauseLength(Integer maxQueryClauseLength) {
                this.maxQueryClauseLength = maxQueryClauseLength;
                return this;
            }

            /**
             * maxTimeoutMS.
             */
            public Builder maxTimeoutMS(Integer maxTimeoutMS) {
                this.maxTimeoutMS = maxTimeoutMS;
                return this;
            }

            public Cluster build() {
                return new Cluster(this);
            } 

        } 

    }
    public static class DataSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fields")
        private java.util.List < java.util.Map<String, ?>> fields;

        @com.aliyun.core.annotation.NameInMap("keyField")
        private String keyField;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map < String, ? > parameters;

        @com.aliyun.core.annotation.NameInMap("plugins")
        private java.util.Map < String, ? > plugins;

        @com.aliyun.core.annotation.NameInMap("schemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("tableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private DataSources(Builder builder) {
            this.fields = builder.fields;
            this.keyField = builder.keyField;
            this.parameters = builder.parameters;
            this.plugins = builder.plugins;
            this.schemaName = builder.schemaName;
            this.tableName = builder.tableName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSources create() {
            return builder().build();
        }

        /**
         * @return fields
         */
        public java.util.List < java.util.Map<String, ?>> getFields() {
            return this.fields;
        }

        /**
         * @return keyField
         */
        public String getKeyField() {
            return this.keyField;
        }

        /**
         * @return parameters
         */
        public java.util.Map < String, ? > getParameters() {
            return this.parameters;
        }

        /**
         * @return plugins
         */
        public java.util.Map < String, ? > getPlugins() {
            return this.plugins;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < java.util.Map<String, ?>> fields; 
            private String keyField; 
            private java.util.Map < String, ? > parameters; 
            private java.util.Map < String, ? > plugins; 
            private String schemaName; 
            private String tableName; 
            private String type; 

            /**
             * fields.
             */
            public Builder fields(java.util.List < java.util.Map<String, ?>> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * keyField.
             */
            public Builder keyField(String keyField) {
                this.keyField = keyField;
                return this;
            }

            /**
             * parameters.
             */
            public Builder parameters(java.util.Map < String, ? > parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * plugins.
             */
            public Builder plugins(java.util.Map < String, ? > plugins) {
                this.plugins = plugins;
                return this;
            }

            /**
             * schemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * tableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataSources build() {
                return new DataSources(this);
            } 

        } 

    }
    public static class Domain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("functions")
        private java.util.Map < String, ? > functions;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Domain(Builder builder) {
            this.category = builder.category;
            this.functions = builder.functions;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domain create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return functions
         */
        public java.util.Map < String, ? > getFunctions() {
            return this.functions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String category; 
            private java.util.Map < String, ? > functions; 
            private String name; 

            /**
             * category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * functions.
             */
            public Builder functions(java.util.Map < String, ? > functions) {
                this.functions = functions;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Domain build() {
                return new Domain(this);
            } 

        } 

    }
    public static class FirstRanks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("meta")
        private Object meta;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private FirstRanks(Builder builder) {
            this.active = builder.active;
            this.description = builder.description;
            this.meta = builder.meta;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirstRanks create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return meta
         */
        public Object getMeta() {
            return this.meta;
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
            private Boolean active; 
            private String description; 
            private Object meta; 
            private String name; 
            private String type; 

            /**
             * active.
             */
            public Builder active(Boolean active) {
                this.active = active;
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
             * meta.
             */
            public Builder meta(Object meta) {
                this.meta = meta;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public FirstRanks build() {
                return new FirstRanks(this);
            } 

        } 

    }
    public static class QueryProcessors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("indexes")
        private java.util.List < String > indexes;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("processors")
        private java.util.List < java.util.Map<String, ?>> processors;

        private QueryProcessors(Builder builder) {
            this.active = builder.active;
            this.category = builder.category;
            this.domain = builder.domain;
            this.indexes = builder.indexes;
            this.name = builder.name;
            this.processors = builder.processors;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryProcessors create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return indexes
         */
        public java.util.List < String > getIndexes() {
            return this.indexes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return processors
         */
        public java.util.List < java.util.Map<String, ?>> getProcessors() {
            return this.processors;
        }

        public static final class Builder {
            private Boolean active; 
            private String category; 
            private String domain; 
            private java.util.List < String > indexes; 
            private String name; 
            private java.util.List < java.util.Map<String, ?>> processors; 

            /**
             * active.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * indexes.
             */
            public Builder indexes(java.util.List < String > indexes) {
                this.indexes = indexes;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * processors.
             */
            public Builder processors(java.util.List < java.util.Map<String, ?>> processors) {
                this.processors = processors;
                return this;
            }

            public QueryProcessors build() {
                return new QueryProcessors(this);
            } 

        } 

    }
    public static class IndexSortConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("field")
        private String field;

        private IndexSortConfig(Builder builder) {
            this.direction = builder.direction;
            this.field = builder.field;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexSortConfig create() {
            return builder().build();
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        public static final class Builder {
            private String direction; 
            private String field; 

            /**
             * direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            public IndexSortConfig build() {
                return new IndexSortConfig(this);
            } 

        } 

    }
    public static class Indexes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("filterFields")
        private java.util.List < String > filterFields;

        @com.aliyun.core.annotation.NameInMap("searchFields")
        private java.util.Map < String, ? > searchFields;

        private Indexes(Builder builder) {
            this.filterFields = builder.filterFields;
            this.searchFields = builder.searchFields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Indexes create() {
            return builder().build();
        }

        /**
         * @return filterFields
         */
        public java.util.List < String > getFilterFields() {
            return this.filterFields;
        }

        /**
         * @return searchFields
         */
        public java.util.Map < String, ? > getSearchFields() {
            return this.searchFields;
        }

        public static final class Builder {
            private java.util.List < String > filterFields; 
            private java.util.Map < String, ? > searchFields; 

            /**
             * filterFields.
             */
            public Builder filterFields(java.util.List < String > filterFields) {
                this.filterFields = filterFields;
                return this;
            }

            /**
             * searchFields.
             */
            public Builder searchFields(java.util.Map < String, ? > searchFields) {
                this.searchFields = searchFields;
                return this;
            }

            public Indexes build() {
                return new Indexes(this);
            } 

        } 

    }
    public static class TtlField extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ttl")
        private Long ttl;

        private TtlField(Builder builder) {
            this.name = builder.name;
            this.ttl = builder.ttl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TtlField create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ttl
         */
        public Long getTtl() {
            return this.ttl;
        }

        public static final class Builder {
            private String name; 
            private Long ttl; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ttl.
             */
            public Builder ttl(Long ttl) {
                this.ttl = ttl;
                return this;
            }

            public TtlField build() {
                return new TtlField(this);
            } 

        } 

    }
    public static class Schema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("indexSortConfig")
        private java.util.List < IndexSortConfig> indexSortConfig;

        @com.aliyun.core.annotation.NameInMap("indexes")
        private Indexes indexes;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("routeField")
        private String routeField;

        @com.aliyun.core.annotation.NameInMap("routeFieldValues")
        private java.util.List < String > routeFieldValues;

        @com.aliyun.core.annotation.NameInMap("secondRouteField")
        private String secondRouteField;

        @com.aliyun.core.annotation.NameInMap("tables")
        private java.util.Map < String, ? > tables;

        @com.aliyun.core.annotation.NameInMap("ttlField")
        private TtlField ttlField;

        private Schema(Builder builder) {
            this.indexSortConfig = builder.indexSortConfig;
            this.indexes = builder.indexes;
            this.name = builder.name;
            this.routeField = builder.routeField;
            this.routeFieldValues = builder.routeFieldValues;
            this.secondRouteField = builder.secondRouteField;
            this.tables = builder.tables;
            this.ttlField = builder.ttlField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schema create() {
            return builder().build();
        }

        /**
         * @return indexSortConfig
         */
        public java.util.List < IndexSortConfig> getIndexSortConfig() {
            return this.indexSortConfig;
        }

        /**
         * @return indexes
         */
        public Indexes getIndexes() {
            return this.indexes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return routeField
         */
        public String getRouteField() {
            return this.routeField;
        }

        /**
         * @return routeFieldValues
         */
        public java.util.List < String > getRouteFieldValues() {
            return this.routeFieldValues;
        }

        /**
         * @return secondRouteField
         */
        public String getSecondRouteField() {
            return this.secondRouteField;
        }

        /**
         * @return tables
         */
        public java.util.Map < String, ? > getTables() {
            return this.tables;
        }

        /**
         * @return ttlField
         */
        public TtlField getTtlField() {
            return this.ttlField;
        }

        public static final class Builder {
            private java.util.List < IndexSortConfig> indexSortConfig; 
            private Indexes indexes; 
            private String name; 
            private String routeField; 
            private java.util.List < String > routeFieldValues; 
            private String secondRouteField; 
            private java.util.Map < String, ? > tables; 
            private TtlField ttlField; 

            /**
             * indexSortConfig.
             */
            public Builder indexSortConfig(java.util.List < IndexSortConfig> indexSortConfig) {
                this.indexSortConfig = indexSortConfig;
                return this;
            }

            /**
             * indexes.
             */
            public Builder indexes(Indexes indexes) {
                this.indexes = indexes;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * routeField.
             */
            public Builder routeField(String routeField) {
                this.routeField = routeField;
                return this;
            }

            /**
             * routeFieldValues.
             */
            public Builder routeFieldValues(java.util.List < String > routeFieldValues) {
                this.routeFieldValues = routeFieldValues;
                return this;
            }

            /**
             * secondRouteField.
             */
            public Builder secondRouteField(String secondRouteField) {
                this.secondRouteField = secondRouteField;
                return this;
            }

            /**
             * tables.
             */
            public Builder tables(java.util.Map < String, ? > tables) {
                this.tables = tables;
                return this;
            }

            /**
             * ttlField.
             */
            public Builder ttlField(TtlField ttlField) {
                this.ttlField = ttlField;
                return this;
            }

            public Schema build() {
                return new Schema(this);
            } 

        } 

    }
    public static class SchemasIndexSortConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("field")
        private String field;

        private SchemasIndexSortConfig(Builder builder) {
            this.direction = builder.direction;
            this.field = builder.field;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemasIndexSortConfig create() {
            return builder().build();
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        public static final class Builder {
            private String direction; 
            private String field; 

            /**
             * direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            public SchemasIndexSortConfig build() {
                return new SchemasIndexSortConfig(this);
            } 

        } 

    }
    public static class SchemasIndexes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("filterFields")
        private java.util.List < String > filterFields;

        @com.aliyun.core.annotation.NameInMap("searchFields")
        private java.util.Map < String, ? > searchFields;

        private SchemasIndexes(Builder builder) {
            this.filterFields = builder.filterFields;
            this.searchFields = builder.searchFields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemasIndexes create() {
            return builder().build();
        }

        /**
         * @return filterFields
         */
        public java.util.List < String > getFilterFields() {
            return this.filterFields;
        }

        /**
         * @return searchFields
         */
        public java.util.Map < String, ? > getSearchFields() {
            return this.searchFields;
        }

        public static final class Builder {
            private java.util.List < String > filterFields; 
            private java.util.Map < String, ? > searchFields; 

            /**
             * filterFields.
             */
            public Builder filterFields(java.util.List < String > filterFields) {
                this.filterFields = filterFields;
                return this;
            }

            /**
             * searchFields.
             */
            public Builder searchFields(java.util.Map < String, ? > searchFields) {
                this.searchFields = searchFields;
                return this;
            }

            public SchemasIndexes build() {
                return new SchemasIndexes(this);
            } 

        } 

    }
    public static class SchemasTtlField extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ttl")
        private Long ttl;

        private SchemasTtlField(Builder builder) {
            this.name = builder.name;
            this.ttl = builder.ttl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemasTtlField create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ttl
         */
        public Long getTtl() {
            return this.ttl;
        }

        public static final class Builder {
            private String name; 
            private Long ttl; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ttl.
             */
            public Builder ttl(Long ttl) {
                this.ttl = ttl;
                return this;
            }

            public SchemasTtlField build() {
                return new SchemasTtlField(this);
            } 

        } 

    }
    public static class Schemas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("indexSortConfig")
        private java.util.List < SchemasIndexSortConfig> indexSortConfig;

        @com.aliyun.core.annotation.NameInMap("indexes")
        private SchemasIndexes indexes;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("routeField")
        private String routeField;

        @com.aliyun.core.annotation.NameInMap("routeFieldValues")
        private java.util.List < String > routeFieldValues;

        @com.aliyun.core.annotation.NameInMap("secondRouteField")
        private String secondRouteField;

        @com.aliyun.core.annotation.NameInMap("tables")
        private java.util.Map < String, ? > tables;

        @com.aliyun.core.annotation.NameInMap("ttlField")
        private SchemasTtlField ttlField;

        private Schemas(Builder builder) {
            this.indexSortConfig = builder.indexSortConfig;
            this.indexes = builder.indexes;
            this.name = builder.name;
            this.routeField = builder.routeField;
            this.routeFieldValues = builder.routeFieldValues;
            this.secondRouteField = builder.secondRouteField;
            this.tables = builder.tables;
            this.ttlField = builder.ttlField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schemas create() {
            return builder().build();
        }

        /**
         * @return indexSortConfig
         */
        public java.util.List < SchemasIndexSortConfig> getIndexSortConfig() {
            return this.indexSortConfig;
        }

        /**
         * @return indexes
         */
        public SchemasIndexes getIndexes() {
            return this.indexes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return routeField
         */
        public String getRouteField() {
            return this.routeField;
        }

        /**
         * @return routeFieldValues
         */
        public java.util.List < String > getRouteFieldValues() {
            return this.routeFieldValues;
        }

        /**
         * @return secondRouteField
         */
        public String getSecondRouteField() {
            return this.secondRouteField;
        }

        /**
         * @return tables
         */
        public java.util.Map < String, ? > getTables() {
            return this.tables;
        }

        /**
         * @return ttlField
         */
        public SchemasTtlField getTtlField() {
            return this.ttlField;
        }

        public static final class Builder {
            private java.util.List < SchemasIndexSortConfig> indexSortConfig; 
            private SchemasIndexes indexes; 
            private String name; 
            private String routeField; 
            private java.util.List < String > routeFieldValues; 
            private String secondRouteField; 
            private java.util.Map < String, ? > tables; 
            private SchemasTtlField ttlField; 

            /**
             * indexSortConfig.
             */
            public Builder indexSortConfig(java.util.List < SchemasIndexSortConfig> indexSortConfig) {
                this.indexSortConfig = indexSortConfig;
                return this;
            }

            /**
             * indexes.
             */
            public Builder indexes(SchemasIndexes indexes) {
                this.indexes = indexes;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * routeField.
             */
            public Builder routeField(String routeField) {
                this.routeField = routeField;
                return this;
            }

            /**
             * routeFieldValues.
             */
            public Builder routeFieldValues(java.util.List < String > routeFieldValues) {
                this.routeFieldValues = routeFieldValues;
                return this;
            }

            /**
             * secondRouteField.
             */
            public Builder secondRouteField(String secondRouteField) {
                this.secondRouteField = secondRouteField;
                return this;
            }

            /**
             * tables.
             */
            public Builder tables(java.util.Map < String, ? > tables) {
                this.tables = tables;
                return this;
            }

            /**
             * ttlField.
             */
            public Builder ttlField(SchemasTtlField ttlField) {
                this.ttlField = ttlField;
                return this;
            }

            public Schemas build() {
                return new Schemas(this);
            } 

        } 

    }
    public static class SecondRanks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("meta")
        private Object meta;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private SecondRanks(Builder builder) {
            this.active = builder.active;
            this.description = builder.description;
            this.meta = builder.meta;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecondRanks create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return meta
         */
        public Object getMeta() {
            return this.meta;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Boolean active; 
            private String description; 
            private Object meta; 
            private String name; 

            /**
             * active.
             */
            public Builder active(Boolean active) {
                this.active = active;
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
             * meta.
             */
            public Builder meta(Object meta) {
                this.meta = meta;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SecondRanks build() {
                return new SecondRanks(this);
            } 

        } 

    }
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("element")
        private String element;

        @com.aliyun.core.annotation.NameInMap("ellipsis")
        private String ellipsis;

        @com.aliyun.core.annotation.NameInMap("field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("len")
        private Integer len;

        @com.aliyun.core.annotation.NameInMap("snippet")
        private String snippet;

        private Meta(Builder builder) {
            this.element = builder.element;
            this.ellipsis = builder.ellipsis;
            this.field = builder.field;
            this.len = builder.len;
            this.snippet = builder.snippet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return element
         */
        public String getElement() {
            return this.element;
        }

        /**
         * @return ellipsis
         */
        public String getEllipsis() {
            return this.ellipsis;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return len
         */
        public Integer getLen() {
            return this.len;
        }

        /**
         * @return snippet
         */
        public String getSnippet() {
            return this.snippet;
        }

        public static final class Builder {
            private String element; 
            private String ellipsis; 
            private String field; 
            private Integer len; 
            private String snippet; 

            /**
             * element.
             */
            public Builder element(String element) {
                this.element = element;
                return this;
            }

            /**
             * ellipsis.
             */
            public Builder ellipsis(String ellipsis) {
                this.ellipsis = ellipsis;
                return this;
            }

            /**
             * field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * len.
             */
            public Builder len(Integer len) {
                this.len = len;
                return this;
            }

            /**
             * snippet.
             */
            public Builder snippet(String snippet) {
                this.snippet = snippet;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    public static class Summaries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("meta")
        private java.util.List < Meta> meta;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Summaries(Builder builder) {
            this.meta = builder.meta;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summaries create() {
            return builder().build();
        }

        /**
         * @return meta
         */
        public java.util.List < Meta> getMeta() {
            return this.meta;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < Meta> meta; 
            private String name; 

            /**
             * meta.
             */
            public Builder meta(java.util.List < Meta> meta) {
                this.meta = meta;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Summaries build() {
                return new Summaries(this);
            } 

        } 

    }
}
