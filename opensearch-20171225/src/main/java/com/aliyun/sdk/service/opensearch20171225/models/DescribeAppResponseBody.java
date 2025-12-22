// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link DescribeAppResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppResponseBody</p>
 */
public class DescribeAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private DescribeAppResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(DescribeAppResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>33477D76-C380-1D84-A4AD-043F52876CB1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The version information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeAppResponseBody build() {
            return new DescribeAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Cluster model) {
                this.maxQueryClauseLength = model.maxQueryClauseLength;
                this.maxTimeoutMS = model.maxTimeoutMS;
            } 

            /**
             * <p>The maximum length of the query clause.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder maxQueryClauseLength(Integer maxQueryClauseLength) {
                this.maxQueryClauseLength = maxQueryClauseLength;
                return this;
            }

            /**
             * <p>The timeout period. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>750</p>
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
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
    public static class DataSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fields")
        private java.util.List<java.util.Map<String, ?>> fields;

        @com.aliyun.core.annotation.NameInMap("keyField")
        private String keyField;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map<String, ?> parameters;

        @com.aliyun.core.annotation.NameInMap("plugins")
        private java.util.Map<String, ?> plugins;

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
        public java.util.List<java.util.Map<String, ?>> getFields() {
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
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        /**
         * @return plugins
         */
        public java.util.Map<String, ?> getPlugins() {
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
            private java.util.List<java.util.Map<String, ?>> fields; 
            private String keyField; 
            private java.util.Map<String, ?> parameters; 
            private java.util.Map<String, ?> plugins; 
            private String schemaName; 
            private String tableName; 
            private String type; 

            private Builder() {
            } 

            private Builder(DataSources model) {
                this.fields = model.fields;
                this.keyField = model.keyField;
                this.parameters = model.parameters;
                this.plugins = model.plugins;
                this.schemaName = model.schemaName;
                this.tableName = model.tableName;
                this.type = model.type;
            } 

            /**
             * <p>The information about field mappings.</p>
             */
            public Builder fields(java.util.List<java.util.Map<String, ?>> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * <p>The primary key.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder keyField(String keyField) {
                this.keyField = keyField;
                return this;
            }

            /**
             * <p>The information about the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;instanceId&quot;: &quot;rds-instance-id&quot;,
             *   &quot;dbName&quot;: &quot;my_db&quot;,
             *   &quot;dbTableName&quot;: &quot;my_table&quot;,
             *   &quot;dbUser&quot;: &quot;my&quot;,
             *   &quot;dbPassword&quot;: &quot;my_passwd&quot;,
             *   &quot;filter&quot;:&quot;&quot;,
             *   &quot;autoSync&quot;: true
             * }</p>
             */
            public Builder parameters(java.util.Map<String, ?> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The plug-ins that are used for data processing.</p>
             * <p>name:</p>
             * <ul>
             * <li>JsonKeyValueExtractor</li>
             * <li>MultiValueSpliter</li>
             * <li>KeyValueExtractor</li>
             * <li>StringCatenateExtractor</li>
             * <li>HTMLTagRemover</li>
             * </ul>
             * <p>parameters:</p>
             * <ul>
             * <li>JsonKeyValueExtractor</li>
             * <li>MultiValueSpliter</li>
             * <li>KeyValueExtractor</li>
             * <li>StringCatenateExtractor</li>
             * <li>HTMLTagRemover</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;name&quot;: &quot;JsonKeyValueExtractor&quot;,
             *   &quot;parameters&quot;: {
             *   &quot;key&quot;: &quot;my_field&quot;
             * }
             * }</p>
             */
            public Builder plugins(java.util.Map<String, ?> plugins) {
                this.plugins = plugins;
                return this;
            }

            /**
             * <p>The name of the wide table.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The name of the table in the application.</p>
             * 
             * <strong>example:</strong>
             * <p>main</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li>rds</li>
             * <li>odps</li>
             * <li>opensearch</li>
             * <li>polardb</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
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
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
    public static class Functions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("algo")
        private java.util.List<String> algo;

        @com.aliyun.core.annotation.NameInMap("qp")
        private java.util.List<String> qp;

        @com.aliyun.core.annotation.NameInMap("service")
        private java.util.List<String> service;

        private Functions(Builder builder) {
            this.algo = builder.algo;
            this.qp = builder.qp;
            this.service = builder.service;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Functions create() {
            return builder().build();
        }

        /**
         * @return algo
         */
        public java.util.List<String> getAlgo() {
            return this.algo;
        }

        /**
         * @return qp
         */
        public java.util.List<String> getQp() {
            return this.qp;
        }

        /**
         * @return service
         */
        public java.util.List<String> getService() {
            return this.service;
        }

        public static final class Builder {
            private java.util.List<String> algo; 
            private java.util.List<String> qp; 
            private java.util.List<String> service; 

            private Builder() {
            } 

            private Builder(Functions model) {
                this.algo = model.algo;
                this.qp = model.qp;
                this.service = model.service;
            } 

            /**
             * <p>The structure of the algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder algo(java.util.List<String> algo) {
                this.algo = algo;
                return this;
            }

            /**
             * <p>The information about the layout.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder qp(java.util.List<String> qp) {
                this.qp = qp;
                return this;
            }

            /**
             * <p>The description of each feature.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder service(java.util.List<String> service) {
                this.service = service;
                return this;
            }

            public Functions build() {
                return new Functions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
    public static class Domain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("functions")
        private Functions functions;

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
        public Functions getFunctions() {
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
            private Functions functions; 
            private String name; 

            private Builder() {
            } 

            private Builder(Domain model) {
                this.category = model.category;
                this.functions = model.functions;
                this.name = model.name;
            } 

            /**
             * <p>The type of the edition. Valid values: standard, advance, and enhanced. A value of standard indicates a standard edition. A value of advance indicates an advanced edition which is of an old version. New version is not supported for this edition. A value of enhanced indicates an advanced edition which is of a new version.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The search results.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder functions(Functions functions) {
                this.functions = functions;
                return this;
            }

            /**
             * <p>The name (in English).</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(FirstRanks model) {
                this.active = model.active;
                this.description = model.description;
                this.meta = model.meta;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>Indicates whether the expression is the default one.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The information about the expression. The information can be of the array or string type.</p>
             * 
             * <strong>example:</strong>
             * <p>String :&quot;random()*100+now()&quot;;
             * Array: [
             *     {
             *       &quot;attribute&quot;: &quot;static_bm25()&quot;,
             *       &quot;arg&quot;: &quot;&quot;,
             *       &quot;weight&quot;: 10
             *     }
             *   ]</p>
             */
            public Builder meta(Object meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The name of the rough sort expression.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The expression type. Valid values:</p>
             * <p>STRUCT: The content of the expression is a structure. STRING (default): custom formula.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
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
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
    public static class QueryProcessors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("indexes")
        private java.util.List<String> indexes;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("processors")
        private java.util.List<java.util.Map<String, ?>> processors;

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
        public java.util.List<String> getIndexes() {
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
        public java.util.List<java.util.Map<String, ?>> getProcessors() {
            return this.processors;
        }

        public static final class Builder {
            private Boolean active; 
            private String category; 
            private String domain; 
            private java.util.List<String> indexes; 
            private String name; 
            private java.util.List<java.util.Map<String, ?>> processors; 

            private Builder() {
            } 

            private Builder(QueryProcessors model) {
                this.active = model.active;
                this.category = model.category;
                this.domain = model.domain;
                this.indexes = model.indexes;
                this.name = model.name;
                this.processors = model.processors;
            } 

            /**
             * <p>Indicates whether the rule is the default one.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The industry category.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The industry type. Valid values:</p>
             * <ul>
             * <li>GENERAL</li>
             * <li>ECOMMERCE</li>
             * <li>IT_CONTENT</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GENERAL</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Then index range.</p>
             */
            public Builder indexes(java.util.List<String> indexes) {
                this.indexes = indexes;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The features.</p>
             */
            public Builder processors(java.util.List<java.util.Map<String, ?>> processors) {
                this.processors = processors;
                return this;
            }

            public QueryProcessors build() {
                return new QueryProcessors(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("computeResource")
        private Integer computeResource;

        @com.aliyun.core.annotation.NameInMap("docSize")
        private Integer docSize;

        @com.aliyun.core.annotation.NameInMap("qps")
        private Integer qps;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        private Quota(Builder builder) {
            this.computeResource = builder.computeResource;
            this.docSize = builder.docSize;
            this.qps = builder.qps;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return computeResource
         */
        public Integer getComputeResource() {
            return this.computeResource;
        }

        /**
         * @return docSize
         */
        public Integer getDocSize() {
            return this.docSize;
        }

        /**
         * @return qps
         */
        public Integer getQps() {
            return this.qps;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Integer computeResource; 
            private Integer docSize; 
            private Integer qps; 
            private String spec; 

            private Builder() {
            } 

            private Builder(Quota model) {
                this.computeResource = model.computeResource;
                this.docSize = model.docSize;
                this.qps = model.qps;
                this.spec = model.spec;
            } 

            /**
             * <p>The computing resources. Unit: logical computing unit (LCU).</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder computeResource(Integer computeResource) {
                this.computeResource = computeResource;
                return this;
            }

            /**
             * <p>The storage capacity. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder docSize(Integer docSize) {
                this.docSize = docSize;
                return this;
            }

            /**
             * <p>The number of search requests per second. You are charged based on the number of search requests per second in the earlier billing model.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder qps(Integer qps) {
                this.qps = qps;
                return this;
            }

            /**
             * <p>The specifications. Valid values:</p>
             * <ul>
             * <li>opensearch.share.junior: basic</li>
             * <li>opensearch.share.common: shared general-purpose</li>
             * <li>opensearch.share.compute: shared computing</li>
             * <li>opensearch.share.storage: shared storage</li>
             * <li>opensearch.private.common: exclusive general-purpose</li>
             * <li>opensearch.private.compute: exclusive computing</li>
             * <li>opensearch.private.storage: exclusive storage</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>opensearch.share.common</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(IndexSortConfig model) {
                this.direction = model.direction;
                this.field = model.field;
            } 

            /**
             * <p>The sort method. Valid values:</p>
             * <ul>
             * <li>ASC</li>
             * <li>DESC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DESC</p>
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>The sort field.</p>
             * 
             * <strong>example:</strong>
             * <p>field1</p>
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
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
    public static class Indexes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("filterFields")
        private java.util.List<String> filterFields;

        @com.aliyun.core.annotation.NameInMap("searchFields")
        private java.util.Map<String, ?> searchFields;

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
        public java.util.List<String> getFilterFields() {
            return this.filterFields;
        }

        /**
         * @return searchFields
         */
        public java.util.Map<String, ?> getSearchFields() {
            return this.searchFields;
        }

        public static final class Builder {
            private java.util.List<String> filterFields; 
            private java.util.Map<String, ?> searchFields; 

            private Builder() {
            } 

            private Builder(Indexes model) {
                this.filterFields = model.filterFields;
                this.searchFields = model.searchFields;
            } 

            /**
             * <p>The attribute fields.</p>
             */
            public Builder filterFields(java.util.List<String> filterFields) {
                this.filterFields = filterFields;
                return this;
            }

            /**
             * <p>The index fields.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;fields&quot;: [&quot;title&quot;],
             *   &quot;analyzer&quot;: &quot;chn_standard&quot;
             * }</p>
             */
            public Builder searchFields(java.util.Map<String, ?> searchFields) {
                this.searchFields = searchFields;
                return this;
            }

            public Indexes build() {
                return new Indexes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(TtlField model) {
                this.name = model.name;
                this.ttl = model.ttl;
            } 

            /**
             * <p>The document time field.</p>
             * 
             * <strong>example:</strong>
             * <p>text1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The TTL. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
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
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
    public static class Schema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("indexSortConfig")
        private java.util.List<IndexSortConfig> indexSortConfig;

        @com.aliyun.core.annotation.NameInMap("indexes")
        private Indexes indexes;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("routeField")
        private String routeField;

        @com.aliyun.core.annotation.NameInMap("routeFieldValues")
        private java.util.List<String> routeFieldValues;

        @com.aliyun.core.annotation.NameInMap("secondRouteField")
        private String secondRouteField;

        @com.aliyun.core.annotation.NameInMap("tables")
        private java.util.Map<String, ?> tables;

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
        public java.util.List<IndexSortConfig> getIndexSortConfig() {
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
        public java.util.List<String> getRouteFieldValues() {
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
        public java.util.Map<String, ?> getTables() {
            return this.tables;
        }

        /**
         * @return ttlField
         */
        public TtlField getTtlField() {
            return this.ttlField;
        }

        public static final class Builder {
            private java.util.List<IndexSortConfig> indexSortConfig; 
            private Indexes indexes; 
            private String name; 
            private String routeField; 
            private java.util.List<String> routeFieldValues; 
            private String secondRouteField; 
            private java.util.Map<String, ?> tables; 
            private TtlField ttlField; 

            private Builder() {
            } 

            private Builder(Schema model) {
                this.indexSortConfig = model.indexSortConfig;
                this.indexes = model.indexes;
                this.name = model.name;
                this.routeField = model.routeField;
                this.routeFieldValues = model.routeFieldValues;
                this.secondRouteField = model.secondRouteField;
                this.tables = model.tables;
                this.ttlField = model.ttlField;
            } 

            /**
             * <p>The sort configurations.</p>
             */
            public Builder indexSortConfig(java.util.List<IndexSortConfig> indexSortConfig) {
                this.indexSortConfig = indexSortConfig;
                return this;
            }

            /**
             * <p>The index schema.</p>
             */
            public Builder indexes(Indexes indexes) {
                this.indexes = indexes;
                return this;
            }

            /**
             * <p>The name of the wide table.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the level-1 routing field.</p>
             * 
             * <strong>example:</strong>
             * <p>field1</p>
             */
            public Builder routeField(String routeField) {
                this.routeField = routeField;
                return this;
            }

            /**
             * <p>The hot values of the level-1 routing field.</p>
             */
            public Builder routeFieldValues(java.util.List<String> routeFieldValues) {
                this.routeFieldValues = routeFieldValues;
                return this;
            }

            /**
             * <p>The name of the level-2 routing field. This parameter takes effect only when the routeFieldValues parameter is configured. By default, the wide-table primary key field is used as the level-2 routing field.</p>
             * 
             * <strong>example:</strong>
             * <p>field2</p>
             */
            public Builder secondRouteField(String secondRouteField) {
                this.secondRouteField = secondRouteField;
                return this;
            }

            /**
             * <p>The table schema.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;primaryTable&quot;: true,
             *     &quot;name&quot;: &quot;main&quot;,
             *     &quot;fields&quot;: {
             *         &quot;id&quot;: {
             *             &quot;name&quot;: &quot;id&quot;,
             *             &quot;type&quot;: &quot;LITERAL&quot;,
             *             &quot;primaryKey&quot;: true
             *         },
             *         &quot;title&quot;: {
             *             &quot;name&quot;: &quot;title&quot;,
             *             &quot;type&quot;: &quot;TEXT&quot;,
             *             &quot;primaryKey&quot;: false
             *         },
             *         &quot;buy&quot;: {
             *             &quot;name&quot;: &quot;buy&quot;,
             *             &quot;type&quot;: &quot;INT&quot;,
             *             &quot;primaryKey&quot;: false
             *         },
             *         &quot;cate_id&quot;: {
             *             &quot;name&quot;: &quot;cate_id&quot;,
             *             &quot;type&quot;: &quot;INT&quot;,
             *             &quot;primaryKey&quot;: false
             *         },
             *         &quot;cate_name&quot;: {
             *             &quot;name&quot;: &quot;cate_name&quot;,
             *             &quot;type&quot;: &quot;LITERAL&quot;,
             *             &quot;primaryKey&quot;: false
             *         }
             *     }
             * }</p>
             */
            public Builder tables(java.util.Map<String, ?> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * <p>The document clearing configurations.</p>
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
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SchemasIndexSortConfig model) {
                this.direction = model.direction;
                this.field = model.field;
            } 

            /**
             * <p>The sort method. Valid values:</p>
             * <ul>
             * <li>ASC</li>
             * <li>DESC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DESC</p>
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>The sort field.</p>
             * 
             * <strong>example:</strong>
             * <p>fIeld1</p>
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
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
    public static class SchemasIndexes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("filterFields")
        private java.util.List<String> filterFields;

        @com.aliyun.core.annotation.NameInMap("searchFields")
        private java.util.Map<String, ?> searchFields;

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
        public java.util.List<String> getFilterFields() {
            return this.filterFields;
        }

        /**
         * @return searchFields
         */
        public java.util.Map<String, ?> getSearchFields() {
            return this.searchFields;
        }

        public static final class Builder {
            private java.util.List<String> filterFields; 
            private java.util.Map<String, ?> searchFields; 

            private Builder() {
            } 

            private Builder(SchemasIndexes model) {
                this.filterFields = model.filterFields;
                this.searchFields = model.searchFields;
            } 

            /**
             * <p>The attribute fields.</p>
             */
            public Builder filterFields(java.util.List<String> filterFields) {
                this.filterFields = filterFields;
                return this;
            }

            /**
             * <p>The index fields.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;fields&quot;: [&quot;title&quot;],
             *   &quot;analyzer&quot;: &quot;chn_standard&quot;
             * }</p>
             */
            public Builder searchFields(java.util.Map<String, ?> searchFields) {
                this.searchFields = searchFields;
                return this;
            }

            public SchemasIndexes build() {
                return new SchemasIndexes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SchemasTtlField model) {
                this.name = model.name;
                this.ttl = model.ttl;
            } 

            /**
             * <p>The document time field.</p>
             * 
             * <strong>example:</strong>
             * <p>fIeld1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The TTL. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
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
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
    public static class Schemas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("indexSortConfig")
        private java.util.List<SchemasIndexSortConfig> indexSortConfig;

        @com.aliyun.core.annotation.NameInMap("indexes")
        private SchemasIndexes indexes;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("routeField")
        private String routeField;

        @com.aliyun.core.annotation.NameInMap("routeFieldValues")
        private java.util.List<String> routeFieldValues;

        @com.aliyun.core.annotation.NameInMap("secondRouteField")
        private String secondRouteField;

        @com.aliyun.core.annotation.NameInMap("tables")
        private java.util.Map<String, ?> tables;

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
        public java.util.List<SchemasIndexSortConfig> getIndexSortConfig() {
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
        public java.util.List<String> getRouteFieldValues() {
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
        public java.util.Map<String, ?> getTables() {
            return this.tables;
        }

        /**
         * @return ttlField
         */
        public SchemasTtlField getTtlField() {
            return this.ttlField;
        }

        public static final class Builder {
            private java.util.List<SchemasIndexSortConfig> indexSortConfig; 
            private SchemasIndexes indexes; 
            private String name; 
            private String routeField; 
            private java.util.List<String> routeFieldValues; 
            private String secondRouteField; 
            private java.util.Map<String, ?> tables; 
            private SchemasTtlField ttlField; 

            private Builder() {
            } 

            private Builder(Schemas model) {
                this.indexSortConfig = model.indexSortConfig;
                this.indexes = model.indexes;
                this.name = model.name;
                this.routeField = model.routeField;
                this.routeFieldValues = model.routeFieldValues;
                this.secondRouteField = model.secondRouteField;
                this.tables = model.tables;
                this.ttlField = model.ttlField;
            } 

            /**
             * <p>The sort configurations.</p>
             */
            public Builder indexSortConfig(java.util.List<SchemasIndexSortConfig> indexSortConfig) {
                this.indexSortConfig = indexSortConfig;
                return this;
            }

            /**
             * <p>The index schema.</p>
             */
            public Builder indexes(SchemasIndexes indexes) {
                this.indexes = indexes;
                return this;
            }

            /**
             * <p>The name of the wide table.</p>
             * 
             * <strong>example:</strong>
             * <p>main</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the level-1 routing field.</p>
             * 
             * <strong>example:</strong>
             * <p>field1</p>
             */
            public Builder routeField(String routeField) {
                this.routeField = routeField;
                return this;
            }

            /**
             * <p>The hot values of the level-1 routing field.</p>
             */
            public Builder routeFieldValues(java.util.List<String> routeFieldValues) {
                this.routeFieldValues = routeFieldValues;
                return this;
            }

            /**
             * <p>The name of the level-2 routing field. This parameter takes effect only when the routeFieldValues parameter is configured. By default, the wide-table primary key field is used as the level-2 routing field.</p>
             * 
             * <strong>example:</strong>
             * <p>field2</p>
             */
            public Builder secondRouteField(String secondRouteField) {
                this.secondRouteField = secondRouteField;
                return this;
            }

            /**
             * <p>The table schema.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;primaryTable&quot;: true,
             *     &quot;name&quot;: &quot;main&quot;,
             *     &quot;fields&quot;: {
             *         &quot;id&quot;: {
             *             &quot;name&quot;: &quot;id&quot;,
             *             &quot;type&quot;: &quot;LITERAL&quot;,
             *             &quot;primaryKey&quot;: true
             *         },
             *         &quot;title&quot;: {
             *             &quot;name&quot;: &quot;title&quot;,
             *             &quot;type&quot;: &quot;TEXT&quot;,
             *             &quot;primaryKey&quot;: false
             *         },
             *         &quot;buy&quot;: {
             *             &quot;name&quot;: &quot;buy&quot;,
             *             &quot;type&quot;: &quot;INT&quot;,
             *             &quot;primaryKey&quot;: false
             *         },
             *         &quot;cate_id&quot;: {
             *             &quot;name&quot;: &quot;cate_id&quot;,
             *             &quot;type&quot;: &quot;INT&quot;,
             *             &quot;primaryKey&quot;: false
             *         },
             *         &quot;cate_name&quot;: {
             *             &quot;name&quot;: &quot;cate_name&quot;,
             *             &quot;type&quot;: &quot;LITERAL&quot;,
             *             &quot;primaryKey&quot;: false
             *         }
             *     }
             * }</p>
             */
            public Builder tables(java.util.Map<String, ?> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * <p>The document clearing configurations.</p>
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
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SecondRanks model) {
                this.active = model.active;
                this.description = model.description;
                this.meta = model.meta;
                this.name = model.name;
            } 

            /**
             * <p>Indicates whether the expression is the default one.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The fine sort expression. You can define an expression that contains fields, feature functions, and mathematical functions to implement complex sort logic.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;cate_id &gt; 0 and cate_id &lt; 1000&quot;</p>
             */
            public Builder meta(Object meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The name of the fine sort expression.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
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
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Meta model) {
                this.element = model.element;
                this.ellipsis = model.ellipsis;
                this.field = model.field;
                this.len = model.len;
                this.snippet = model.snippet;
            } 

            /**
             * <p>The element that is used for highlighting.</p>
             * 
             * <strong>example:</strong>
             * <p>em</p>
             */
            public Builder element(String element) {
                this.element = element;
                return this;
            }

            /**
             * <p>The connector that is used to connect segments.</p>
             * 
             * <strong>example:</strong>
             * <p>...</p>
             */
            public Builder ellipsis(String ellipsis) {
                this.ellipsis = ellipsis;
                return this;
            }

            /**
             * <p>The field.</p>
             * 
             * <strong>example:</strong>
             * <p>field1</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The length of the segment. Valid values: 1 to 300.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder len(Integer len) {
                this.len = len;
                return this;
            }

            /**
             * <p>The number of segments. Valid values: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
    public static class Summaries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("meta")
        private java.util.List<Meta> meta;

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
        public java.util.List<Meta> getMeta() {
            return this.meta;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<Meta> meta; 
            private String name; 

            private Builder() {
            } 

            private Builder(Summaries model) {
                this.meta = model.meta;
                this.name = model.name;
            } 

            /**
             * <p>The summary configurations.</p>
             */
            public Builder meta(java.util.List<Meta> meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The group name.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
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
    /**
     * 
     * {@link DescribeAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoSwitch")
        private Boolean autoSwitch;

        @com.aliyun.core.annotation.NameInMap("cluster")
        private Cluster cluster;

        @com.aliyun.core.annotation.NameInMap("clusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("dataSources")
        private java.util.List<DataSources> dataSources;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("domain")
        private Domain domain;

        @com.aliyun.core.annotation.NameInMap("fetchFields")
        private java.util.List<String> fetchFields;

        @com.aliyun.core.annotation.NameInMap("firstRanks")
        private java.util.List<FirstRanks> firstRanks;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("interpretations")
        private java.util.Map<String, ?> interpretations;

        @com.aliyun.core.annotation.NameInMap("isCurrent")
        private Boolean isCurrent;

        @com.aliyun.core.annotation.NameInMap("progressPercent")
        private Integer progressPercent;

        @com.aliyun.core.annotation.NameInMap("prompts")
        private java.util.List<java.util.Map<String, ?>> prompts;

        @com.aliyun.core.annotation.NameInMap("queryProcessors")
        private java.util.List<QueryProcessors> queryProcessors;

        @com.aliyun.core.annotation.NameInMap("quota")
        private Quota quota;

        @com.aliyun.core.annotation.NameInMap("schema")
        private Schema schema;

        @com.aliyun.core.annotation.NameInMap("schemas")
        private java.util.List<Schemas> schemas;

        @com.aliyun.core.annotation.NameInMap("secondRanks")
        private java.util.List<SecondRanks> secondRanks;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("summaries")
        private java.util.List<Summaries> summaries;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Result(Builder builder) {
            this.autoSwitch = builder.autoSwitch;
            this.cluster = builder.cluster;
            this.clusterName = builder.clusterName;
            this.dataSources = builder.dataSources;
            this.description = builder.description;
            this.domain = builder.domain;
            this.fetchFields = builder.fetchFields;
            this.firstRanks = builder.firstRanks;
            this.id = builder.id;
            this.interpretations = builder.interpretations;
            this.isCurrent = builder.isCurrent;
            this.progressPercent = builder.progressPercent;
            this.prompts = builder.prompts;
            this.queryProcessors = builder.queryProcessors;
            this.quota = builder.quota;
            this.schema = builder.schema;
            this.schemas = builder.schemas;
            this.secondRanks = builder.secondRanks;
            this.status = builder.status;
            this.summaries = builder.summaries;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
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
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return dataSources
         */
        public java.util.List<DataSources> getDataSources() {
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
        public java.util.List<String> getFetchFields() {
            return this.fetchFields;
        }

        /**
         * @return firstRanks
         */
        public java.util.List<FirstRanks> getFirstRanks() {
            return this.firstRanks;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return interpretations
         */
        public java.util.Map<String, ?> getInterpretations() {
            return this.interpretations;
        }

        /**
         * @return isCurrent
         */
        public Boolean getIsCurrent() {
            return this.isCurrent;
        }

        /**
         * @return progressPercent
         */
        public Integer getProgressPercent() {
            return this.progressPercent;
        }

        /**
         * @return prompts
         */
        public java.util.List<java.util.Map<String, ?>> getPrompts() {
            return this.prompts;
        }

        /**
         * @return queryProcessors
         */
        public java.util.List<QueryProcessors> getQueryProcessors() {
            return this.queryProcessors;
        }

        /**
         * @return quota
         */
        public Quota getQuota() {
            return this.quota;
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
        public java.util.List<Schemas> getSchemas() {
            return this.schemas;
        }

        /**
         * @return secondRanks
         */
        public java.util.List<SecondRanks> getSecondRanks() {
            return this.secondRanks;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return summaries
         */
        public java.util.List<Summaries> getSummaries() {
            return this.summaries;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean autoSwitch; 
            private Cluster cluster; 
            private String clusterName; 
            private java.util.List<DataSources> dataSources; 
            private String description; 
            private Domain domain; 
            private java.util.List<String> fetchFields; 
            private java.util.List<FirstRanks> firstRanks; 
            private String id; 
            private java.util.Map<String, ?> interpretations; 
            private Boolean isCurrent; 
            private Integer progressPercent; 
            private java.util.List<java.util.Map<String, ?>> prompts; 
            private java.util.List<QueryProcessors> queryProcessors; 
            private Quota quota; 
            private Schema schema; 
            private java.util.List<Schemas> schemas; 
            private java.util.List<SecondRanks> secondRanks; 
            private String status; 
            private java.util.List<Summaries> summaries; 
            private String type; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.autoSwitch = model.autoSwitch;
                this.cluster = model.cluster;
                this.clusterName = model.clusterName;
                this.dataSources = model.dataSources;
                this.description = model.description;
                this.domain = model.domain;
                this.fetchFields = model.fetchFields;
                this.firstRanks = model.firstRanks;
                this.id = model.id;
                this.interpretations = model.interpretations;
                this.isCurrent = model.isCurrent;
                this.progressPercent = model.progressPercent;
                this.prompts = model.prompts;
                this.queryProcessors = model.queryProcessors;
                this.quota = model.quota;
                this.schema = model.schema;
                this.schemas = model.schemas;
                this.secondRanks = model.secondRanks;
                this.status = model.status;
                this.summaries = model.summaries;
                this.type = model.type;
            } 

            /**
             * <p>Indicates whether the version is automatically switched to an online version.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoSwitch(Boolean autoSwitch) {
                this.autoSwitch = autoSwitch;
                return this;
            }

            /**
             * <p>The capability opening configurations.</p>
             */
            public Builder cluster(Cluster cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The configurations of the data sources.</p>
             */
            public Builder dataSources(java.util.List<DataSources> dataSources) {
                this.dataSources = dataSources;
                return this;
            }

            /**
             * <p>The description of the version.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The industry type. Valid values:</p>
             * <ul>
             * <li>GENERAL</li>
             * <li>ECOMMERCE</li>
             * <li>IT_CONTENT</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GENERAL</p>
             */
            public Builder domain(Domain domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The default display fields.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder fetchFields(java.util.List<String> fetchFields) {
                this.fetchFields = fetchFields;
                return this;
            }

            /**
             * <p>The configurations of rough sort.</p>
             */
            public Builder firstRanks(java.util.List<FirstRanks> firstRanks) {
                this.firstRanks = firstRanks;
                return this;
            }

            /**
             * <p>The version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100303063</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The industry model module.</p>
             * 
             * <strong>example:</strong>
             * <p>[ { &quot;table&quot;: &quot;table1&quot;, &quot;fields&quot;: [ { &quot;name&quot;: &quot;field1&quot;, &quot;interpretation&quot;: &quot;Title&quot; }, { &quot;name&quot;: &quot;field2&quot;, &quot;interpretation&quot;: &quot;Number&quot; } ] } ]</p>
             */
            public Builder interpretations(java.util.Map<String, ?> interpretations) {
                this.interpretations = interpretations;
                return this;
            }

            /**
             * <p>Indices whether the version is an online version.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isCurrent(Boolean isCurrent) {
                this.isCurrent = isCurrent;
                return this;
            }

            /**
             * <p>The progress of data import, in percentage. For example, a value of 83 indicates 83%.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progressPercent(Integer progressPercent) {
                this.progressPercent = progressPercent;
                return this;
            }

            /**
             * <p>The prompt configurations.</p>
             */
            public Builder prompts(java.util.List<java.util.Map<String, ?>> prompts) {
                this.prompts = prompts;
                return this;
            }

            /**
             * <p>The query intent understanding configurations.</p>
             */
            public Builder queryProcessors(java.util.List<QueryProcessors> queryProcessors) {
                this.queryProcessors = queryProcessors;
                return this;
            }

            /**
             * <p>The quota information.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder quota(Quota quota) {
                this.quota = quota;
                return this;
            }

            /**
             * <p>The schema of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder schema(Schema schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>The multi-table schema.</p>
             */
            public Builder schemas(java.util.List<Schemas> schemas) {
                this.schemas = schemas;
                return this;
            }

            /**
             * <p>The configurations of fine sort.</p>
             */
            public Builder secondRanks(java.util.List<SecondRanks> secondRanks) {
                this.secondRanks = secondRanks;
                return this;
            }

            /**
             * <p>The status of the version. Valid values:</p>
             * <ul>
             * <li>ok: The version is normal.</li>
             * <li>stopped: The version is suspended.</li>
             * <li>frozen: The version is frozen.</li>
             * <li>initializing: The version is being initialized.</li>
             * <li>unavailable: The version is invalid.</li>
             * <li>data_waiting: Data is to be initialized.</li>
             * <li>data_preparing: Data is being initialized.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The summary configurations of search results.</p>
             */
            public Builder summaries(java.util.List<Summaries> summaries) {
                this.summaries = summaries;
                return this;
            }

            /**
             * <p>The edition type. Valid values:</p>
             * <ul>
             * <li>standard: a standard edition application.</li>
             * <li>advance: an advanced edition application of an old version. New versions are not supported for this edition.</li>
             * <li>enhanced: an advanced edition application of a new version.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enhanced</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
