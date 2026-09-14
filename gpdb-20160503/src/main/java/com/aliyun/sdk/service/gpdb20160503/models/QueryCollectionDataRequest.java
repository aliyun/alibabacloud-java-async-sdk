// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link QueryCollectionDataRequest} extends {@link RequestModel}
 *
 * <p>QueryCollectionDataRequest</p>
 */
public class QueryCollectionDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Collection")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HybridSearch")
    private String hybridSearch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HybridSearchArgs")
    private java.util.Map<String, java.util.Map<String, ?>> hybridSearchArgs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeMetadataFields")
    private String includeMetadataFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeSparseValues")
    private Boolean includeSparseValues;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeValues")
    private Boolean includeValues;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private String metrics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespacePassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespacePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Integer offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelationalTableFilter")
    private RelationalTableFilter relationalTableFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SparseVector")
    private SparseVector sparseVector;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopK")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long topK;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vector")
    private java.util.List<Double> vector;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private QueryCollectionDataRequest(Builder builder) {
        super(builder);
        this.collection = builder.collection;
        this.content = builder.content;
        this.DBInstanceId = builder.DBInstanceId;
        this.filter = builder.filter;
        this.hybridSearch = builder.hybridSearch;
        this.hybridSearchArgs = builder.hybridSearchArgs;
        this.includeMetadataFields = builder.includeMetadataFields;
        this.includeSparseValues = builder.includeSparseValues;
        this.includeValues = builder.includeValues;
        this.metrics = builder.metrics;
        this.namespace = builder.namespace;
        this.namespacePassword = builder.namespacePassword;
        this.offset = builder.offset;
        this.orderBy = builder.orderBy;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.relationalTableFilter = builder.relationalTableFilter;
        this.sparseVector = builder.sparseVector;
        this.topK = builder.topK;
        this.vector = builder.vector;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCollectionDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collection
     */
    public String getCollection() {
        return this.collection;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return hybridSearch
     */
    public String getHybridSearch() {
        return this.hybridSearch;
    }

    /**
     * @return hybridSearchArgs
     */
    public java.util.Map<String, java.util.Map<String, ?>> getHybridSearchArgs() {
        return this.hybridSearchArgs;
    }

    /**
     * @return includeMetadataFields
     */
    public String getIncludeMetadataFields() {
        return this.includeMetadataFields;
    }

    /**
     * @return includeSparseValues
     */
    public Boolean getIncludeSparseValues() {
        return this.includeSparseValues;
    }

    /**
     * @return includeValues
     */
    public Boolean getIncludeValues() {
        return this.includeValues;
    }

    /**
     * @return metrics
     */
    public String getMetrics() {
        return this.metrics;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespacePassword
     */
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return relationalTableFilter
     */
    public RelationalTableFilter getRelationalTableFilter() {
        return this.relationalTableFilter;
    }

    /**
     * @return sparseVector
     */
    public SparseVector getSparseVector() {
        return this.sparseVector;
    }

    /**
     * @return topK
     */
    public Long getTopK() {
        return this.topK;
    }

    /**
     * @return vector
     */
    public java.util.List<Double> getVector() {
        return this.vector;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<QueryCollectionDataRequest, Builder> {
        private String collection; 
        private String content; 
        private String DBInstanceId; 
        private String filter; 
        private String hybridSearch; 
        private java.util.Map<String, java.util.Map<String, ?>> hybridSearchArgs; 
        private String includeMetadataFields; 
        private Boolean includeSparseValues; 
        private Boolean includeValues; 
        private String metrics; 
        private String namespace; 
        private String namespacePassword; 
        private Integer offset; 
        private String orderBy; 
        private Long ownerId; 
        private String regionId; 
        private RelationalTableFilter relationalTableFilter; 
        private SparseVector sparseVector; 
        private Long topK; 
        private java.util.List<Double> vector; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCollectionDataRequest request) {
            super(request);
            this.collection = request.collection;
            this.content = request.content;
            this.DBInstanceId = request.DBInstanceId;
            this.filter = request.filter;
            this.hybridSearch = request.hybridSearch;
            this.hybridSearchArgs = request.hybridSearchArgs;
            this.includeMetadataFields = request.includeMetadataFields;
            this.includeSparseValues = request.includeSparseValues;
            this.includeValues = request.includeValues;
            this.metrics = request.metrics;
            this.namespace = request.namespace;
            this.namespacePassword = request.namespacePassword;
            this.offset = request.offset;
            this.orderBy = request.orderBy;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.relationalTableFilter = request.relationalTableFilter;
            this.sparseVector = request.sparseVector;
            this.topK = request.topK;
            this.vector = request.vector;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The name of the collection.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401503.html">ListCollections</a> operation to list available collections.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>document</p>
         */
        public Builder collection(String collection) {
            this.putQueryParameter("Collection", collection);
            this.collection = collection;
            return this;
        }

        /**
         * <p>The content for full-text search. If this parameter is omitted, only vector search is performed. If this parameter is specified, the system performs a hybrid search of vector search and full-text search.</p>
         * <blockquote>
         * <p>You must specify one of the Content and Vector parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hello_world</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query details for all AnalyticDB for PostgreSQL instances in a region, including their instance IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The filter conditions for data retrieval. It is in the format of a WHERE clause in SQL. This expression returns a boolean value, which can be a simple comparison operator, such as <code>=</code>, <code>&lt;&gt;</code>, <code>!=</code>, <code>&gt;</code>, <code>&lt;</code>, <code>&gt;=</code>, and <code>&lt;=</code>, or a more complex expression combined with logical operators, such as <code>AND</code>, <code>OR</code>, and <code>NOT</code>, and keywords such as <code>IN</code>, <code>BETWEEN</code>, and <code>LIKE</code>.</p>
         * <blockquote>
         * <ul>
         * <li>For more information about the syntax, see <a href="https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/">PostgreSQL WHERE</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pipeline_id=\&quot;1yhpmo0rbn\&quot; AND (spu=\&quot;10025667796135\&quot; AND dept_id=\&quot;226\&quot;)</p>
         */
        public Builder filter(String filter) {
            this.putBodyParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The hybrid search algorithm. If this parameter is empty, the system ranks results by directly comparing the scores from the vector search and the full-text search.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>RRF</code>: Reciprocal Rank Fusion. This algorithm has a parameter k to control the fusion effect. For more information, see the description of the <code>HybridSearchArgs</code> parameter.</p>
         * </li>
         * <li><p><code>Weight</code>: weighted sort. This algorithm uses a parameter alpha to control the score ratio of vector search and full-text search, and then sorts the results. For more information about the parameter, see the <code>HybridSearchArgs</code> parameter.</p>
         * </li>
         * <li><p><code>Cascaded</code>: performs a full-text search, and then performs a vector search on the search results.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RRF</p>
         */
        public Builder hybridSearch(String hybridSearch) {
            this.putQueryParameter("HybridSearch", hybridSearch);
            this.hybridSearch = hybridSearch;
            return this;
        }

        /**
         * <p>The parameters for the hybrid search algorithm. The following algorithms are supported: RRF and Weight.</p>
         * <ul>
         * <li>For RRF, specify the constant k in the scoring algorithm <code>1/(k+rank_i)</code>. The value must be a positive integer greater than 1. The format is as follows:</li>
         * </ul>
         * <pre><code>{ 
         *    &quot;RRF&quot;: {
         *     &quot;k&quot;: 60
         *    }
         * }
         * </code></pre>
         * <ul>
         * <li>For Weight, in the formula <code>alpha * vector_score + (1-alpha) * text_score</code>, the alpha parameter indicates the score ratio of the vector search to the full-text search. The value ranges from 0 to 1. 0 indicates that only the full-text search is used, and 1 indicates that only the vector search is used.</li>
         * </ul>
         * <pre><code>{ 
         *    &quot;Weight&quot;: {
         *     &quot;alpha&quot;: 0.5
         *    }
         * }
         * </code></pre>
         */
        public Builder hybridSearchArgs(java.util.Map<String, java.util.Map<String, ?>> hybridSearchArgs) {
            String hybridSearchArgsShrink = shrink(hybridSearchArgs, "HybridSearchArgs", "json");
            this.putQueryParameter("HybridSearchArgs", hybridSearchArgsShrink);
            this.hybridSearchArgs = hybridSearchArgs;
            return this;
        }

        /**
         * <p>This parameter is left empty by default. It specifies the metadata fields to be returned. You can specify multiple fields and separate them with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>title,content</p>
         */
        public Builder includeMetadataFields(String includeMetadataFields) {
            this.putQueryParameter("IncludeMetadataFields", includeMetadataFields);
            this.includeMetadataFields = includeMetadataFields;
            return this;
        }

        /**
         * <p>Specifies whether to return sparse vector data. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: returns sparse vector data.</p>
         * </li>
         * <li><p><strong>false</strong>: does not return sparse vector data.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeSparseValues(Boolean includeSparseValues) {
            this.putQueryParameter("IncludeSparseValues", includeSparseValues);
            this.includeSparseValues = includeSparseValues;
            return this;
        }

        /**
         * <p>Specifies whether to return dense vector data. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: returns dense vector data.</p>
         * </li>
         * <li><p><strong>false</strong>: does not return dense vector data.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeValues(Boolean includeValues) {
            this.putQueryParameter("IncludeValues", includeValues);
            this.includeValues = includeValues;
            return this;
        }

        /**
         * <p>The similarity algorithm for search. Valid values:</p>
         * <ul>
         * <li><p><strong>l2</strong>: the Euclidean distance.</p>
         * </li>
         * <li><p><strong>ip</strong>: the dot product distance.</p>
         * </li>
         * <li><p><strong>cosine</strong>: the cosine similarity.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is not specified, the algorithm specified when the index is created is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cosine</p>
         */
        public Builder metrics(String metrics) {
            this.putQueryParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to list available namespaces.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mynamespace</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The password for the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testpassword</p>
         */
        public Builder namespacePassword(String namespacePassword) {
            this.putQueryParameter("NamespacePassword", namespacePassword);
            this.namespacePassword = namespacePassword;
            return this;
        }

        /**
         * <p>This parameter is left empty by default. It specifies the start position of a paged query. This parameter is not supported in hybrid search.</p>
         * <p>The value must be greater than or equal to 0. When this parameter is not empty, Total in the response indicates the total number of hits. This parameter is used with TopK. For example, if you want to retrieve chunks 0 to 44 with a page size of 20, you must send three requests:</p>
         * <ul>
         * <li><p><code>Offset=0, TopK=20</code> returns chunks 0 to 19.</p>
         * </li>
         * <li><p><code>Offset=20, TopK=20</code> returns chunks 20 to 39.</p>
         * </li>
         * <li><p><code>Offset=40, TopK=20</code> returns chunks 40 to 44.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>This parameter is left empty by default. It specifies the field based on which to sort the results. This parameter is not supported in hybrid search.</p>
         * <p>The field must be a metadata field or a default field in the table, such as <code>id</code>. The following formats are supported:</p>
         * <ul>
         * <li><p>A single field, such as <code>chunk_id</code>.</p>
         * </li>
         * <li><p>Multiple fields separated by commas (,), such as <code>block_id, chunk_id</code>.</p>
         * </li>
         * <li><p>Descending order, such as <code>block_id DESC, chunk_id DESC</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>chunk_id</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Uses another relational table to filter vector data, which is similar to the JOIN operation.</p>
         * <blockquote>
         * <p>The data of the relational table can be returned by setting the IncludeMetadataFields parameter. For example, <code>rds_table_name.id</code> indicates that the id field of the relational table is returned.</p>
         * </blockquote>
         */
        public Builder relationalTableFilter(RelationalTableFilter relationalTableFilter) {
            String relationalTableFilterShrink = shrink(relationalTableFilter, "RelationalTableFilter", "json");
            this.putQueryParameter("RelationalTableFilter", relationalTableFilterShrink);
            this.relationalTableFilter = relationalTableFilter;
            return this;
        }

        /**
         * <p>The sparse vector data.</p>
         */
        public Builder sparseVector(SparseVector sparseVector) {
            String sparseVectorShrink = shrink(sparseVector, "SparseVector", "json");
            this.putQueryParameter("SparseVector", sparseVectorShrink);
            this.sparseVector = sparseVector;
            return this;
        }

        /**
         * <p>Specifies the number of top results to return.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder topK(Long topK) {
            this.putQueryParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * <p>The vector data. The length of the vector data must be the same as that specified in the <a href="https://help.aliyun.com/document_detail/2401497.html">CreateCollection</a> operation.</p>
         * <blockquote>
         * <ul>
         * <li><p>If <code>SparseVector</code> is empty, only the dense vector search results are returned.</p>
         * </li>
         * <li><p>If both <code>Vector</code> and <code>SparseVector</code> are empty, only the full-text search results are returned.</p>
         * </li>
         * </ul>
         * </blockquote>
         */
        public Builder vector(java.util.List<Double> vector) {
            String vectorShrink = shrink(vector, "Vector", "json");
            this.putQueryParameter("Vector", vectorShrink);
            this.vector = vector;
            return this;
        }

        /**
         * <p>The ID of the workspace that consists of multiple database instances. You must specify this parameter or the DBInstanceId parameter. If both this parameter and DBInstanceId are specified, this parameter is used.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-ws-*****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public QueryCollectionDataRequest build() {
            return new QueryCollectionDataRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryCollectionDataRequest} extends {@link TeaModel}
     *
     * <p>QueryCollectionDataRequest</p>
     */
    public static class RelationalTableFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CollectionMetadataField")
        private String collectionMetadataField;

        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("TableField")
        private String tableField;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private RelationalTableFilter(Builder builder) {
            this.collectionMetadataField = builder.collectionMetadataField;
            this.condition = builder.condition;
            this.tableField = builder.tableField;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationalTableFilter create() {
            return builder().build();
        }

        /**
         * @return collectionMetadataField
         */
        public String getCollectionMetadataField() {
            return this.collectionMetadataField;
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return tableField
         */
        public String getTableField() {
            return this.tableField;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String collectionMetadataField; 
            private String condition; 
            private String tableField; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(RelationalTableFilter model) {
                this.collectionMetadataField = model.collectionMetadataField;
                this.condition = model.condition;
                this.tableField = model.tableField;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The metadata field of the vector collection, which is used to associate with the fields of the vector table.</p>
             * 
             * <strong>example:</strong>
             * <p>doc_id</p>
             */
            public Builder collectionMetadataField(String collectionMetadataField) {
                this.collectionMetadataField = collectionMetadataField;
                return this;
            }

            /**
             * <p>The filter conditions for the relational table.</p>
             * 
             * <strong>example:</strong>
             * <p>tags @&gt; ARRAY[\&quot;art\&quot;]</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The field of the relational table, which is used to associate with the metadata field of the vector collection.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder tableField(String tableField) {
                this.tableField = tableField;
                return this;
            }

            /**
             * <p>The name of the relational table.</p>
             * 
             * <strong>example:</strong>
             * <p>my_rds_table</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public RelationalTableFilter build() {
                return new RelationalTableFilter(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCollectionDataRequest} extends {@link TeaModel}
     *
     * <p>QueryCollectionDataRequest</p>
     */
    public static class SparseVector extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Indices")
        private java.util.List<Long> indices;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<Double> values;

        private SparseVector(Builder builder) {
            this.indices = builder.indices;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SparseVector create() {
            return builder().build();
        }

        /**
         * @return indices
         */
        public java.util.List<Long> getIndices() {
            return this.indices;
        }

        /**
         * @return values
         */
        public java.util.List<Double> getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List<Long> indices; 
            private java.util.List<Double> values; 

            private Builder() {
            } 

            private Builder(SparseVector model) {
                this.indices = model.indices;
                this.values = model.values;
            } 

            /**
             * <p>The array of indexes.</p>
             * <blockquote>
             * <p>The number of elements in the array cannot exceed 4,000.</p>
             * </blockquote>
             */
            public Builder indices(java.util.List<Long> indices) {
                this.indices = indices;
                return this;
            }

            /**
             * <p>The array of sparse vectors.</p>
             */
            public Builder values(java.util.List<Double> values) {
                this.values = values;
                return this;
            }

            public SparseVector build() {
                return new SparseVector(this);
            } 

        } 

    }
}
