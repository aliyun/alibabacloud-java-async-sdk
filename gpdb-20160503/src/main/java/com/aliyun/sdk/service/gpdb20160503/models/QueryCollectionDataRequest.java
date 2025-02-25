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

    @com.aliyun.core.annotation.Query
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
        this.includeValues = builder.includeValues;
        this.metrics = builder.metrics;
        this.namespace = builder.namespace;
        this.namespacePassword = builder.namespacePassword;
        this.offset = builder.offset;
        this.orderBy = builder.orderBy;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.relationalTableFilter = builder.relationalTableFilter;
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
        private Boolean includeValues; 
        private String metrics; 
        private String namespace; 
        private String namespacePassword; 
        private Integer offset; 
        private String orderBy; 
        private Long ownerId; 
        private String regionId; 
        private RelationalTableFilter relationalTableFilter; 
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
            this.includeValues = request.includeValues;
            this.metrics = request.metrics;
            this.namespace = request.namespace;
            this.namespacePassword = request.namespacePassword;
            this.offset = request.offset;
            this.orderBy = request.orderBy;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.relationalTableFilter = request.relationalTableFilter;
            this.topK = request.topK;
            this.vector = request.vector;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>Collection name.</p>
         * <blockquote>
         * <p>You can use the <a href="https://help.aliyun.com/document_detail/2401503.html">ListCollections</a> API to view the list.</p>
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
         * <p>Content for full-text search. When this value is empty, only vector search is used; when it is not empty, both vector and full-text search are used.</p>
         * <blockquote>
         * <p>The Vector parameter cannot be empty at the same time.</p>
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
         * <p>Instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> API to view details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.</p>
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
         * <p>Filter conditions for the data to be queried, in SQL WHERE format. It is an expression that returns a boolean value (true or false). Conditions can be simple comparison operators such as equal (=), not equal (&lt;&gt; or !=), greater than (&gt;), less than (&lt;), greater than or equal to (&gt;=), less than or equal to (&lt;=), or more complex expressions combined with logical operators (AND, OR, NOT), as well as conditions using keywords like IN, BETWEEN, and LIKE.</p>
         * <blockquote>
         * <ul>
         * <li>For detailed syntax, refer to: <a href="https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/">https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/</a></li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>response &gt; 200</p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>Dual-path recall algorithm, default is empty (i.e., directly compare and sort the scores of vectors and full-text).</p>
         * <p>Available values:</p>
         * <ul>
         * <li>RRF: Reciprocal rank fusion, with a parameter k controlling the fusion effect. See HybridSearchArgs configuration for details;</li>
         * <li>Weight: Weighted sorting, using a parameter alpha to control the score ratio of vectors and full-text, then sorting. See HybridSearchArgs configuration for details;</li>
         * <li>Cascaded: Perform full-text search first, then vector search based on the full-text results;</li>
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
         * <p>The parameters of the two-way retrieval algorithm. The following parameters are supported:</p>
         * <ul>
         * <li>When HybridSearch is set to RRF, the scores are calculated by using the <code>1/(k+rank_i)</code> formula. The constant k is a positive integer that is greater than 1.</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{ 
         *    &quot;RRF&quot;: {
         *     &quot;k&quot;: 60
         *    }
         * }
         * </code></pre>
         * <ul>
         * <li>When HybridSearch is set to Weight, the scores are calculated by using the <code>alpha * vector_score + (1-alpha) * text_score</code> formula. The alpha parameter specifies the proportion of the vector search score and the full-text search score and ranges from 0 to 1. A value of 0 specifies full-text search and a value of 1 specifies vector search.</li>
         * </ul>
         * <!---->
         * 
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
         * <p>Defaults to empty, indicating the metadata fields to return. Multiple fields should be separated by commas.</p>
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
         * <p>Whether to return vector data. Value descriptions:</p>
         * <ul>
         * <li><strong>true</strong>: Return vector data.</li>
         * <li><strong>false</strong>: Do not return vector data, used for full-text search scenarios.</li>
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
         * <p>Similarity algorithm used during retrieval. Value descriptions:</p>
         * <ul>
         * <li><strong>l2</strong>: Euclidean distance.</li>
         * <li><strong>ip</strong>: Inner product (dot product) distance.</li>
         * <li><strong>cosine</strong>: Cosine similarity.</li>
         * </ul>
         * <blockquote>
         * <p>If this value is empty, the algorithm specified during index creation is used.</p>
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
         * <p>Namespace.</p>
         * <blockquote>
         * <p>You can use the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> API to view the list.</p>
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
         * <p>Password for the namespace.</p>
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
         * <p>Defaults to empty, indicating the starting point for pagination queries. Does not support hybrid search scenarios.</p>
         * <p>The value must be &gt;= 0. When this value is not empty, it will return <code>Total</code>, which indicates the total number of hits. This parameter works with <code>TopK</code>. For example, to paginate 20 and retrieve chunks with <code>chunk_id</code> from 0 to 44, you need to make three requests:</p>
         * <ul>
         * <li><code>Offset=0, TopK=20</code> returns <code>chunk_id</code> 0~19</li>
         * <li><code>Offset=20, TopK=20</code> returns <code>chunk_id</code> 20~39</li>
         * <li><code>Offset=30, TopK=20</code> returns <code>chunk_id</code> 40~44</li>
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
         * <p>Defaults to empty, indicating the field for sorting. Does not support hybrid search scenarios.</p>
         * <p>The field must belong to metadata or be a default field in the table, such as <code>id</code>. The supported formats are:</p>
         * <ul>
         * <li>A single field, e.g., <code>chunk_id</code>;</li>
         * <li>Multiple fields, separated by commas, e.g., <code>block_id, chunk_id</code>;</li>
         * <li>Supports reverse order, e.g., <code>block_id DESC, chunk_id DESC</code>;</li>
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
         * <p>Region ID where the instance is located.</p>
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
         * <p>Uses another relational table to filter vector data (similar to a Join function).</p>
         * <blockquote>
         * <p>Data from the relational table can be returned by setting the <code>IncludeMetadataFields</code> parameter. For example, <code>rds_table_name.id</code> indicates returning the <code>id</code> field from the relational table.</p>
         * </blockquote>
         */
        public Builder relationalTableFilter(RelationalTableFilter relationalTableFilter) {
            String relationalTableFilterShrink = shrink(relationalTableFilter, "RelationalTableFilter", "json");
            this.putQueryParameter("RelationalTableFilter", relationalTableFilterShrink);
            this.relationalTableFilter = relationalTableFilter;
            return this;
        }

        /**
         * <p>Set the number of top results to return.</p>
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
         * <p>Vector data, with the same dimension as specified in the <a href="https://help.aliyun.com/document_detail/2401497.html">CreateCollection</a> API.</p>
         * <blockquote>
         * <p>When the vector is empty, only full-text search results are returned.</p>
         * </blockquote>
         */
        public Builder vector(java.util.List<Double> vector) {
            String vectorShrink = shrink(vector, "Vector", "json");
            this.putQueryParameter("Vector", vectorShrink);
            this.vector = vector;
            return this;
        }

        /**
         * <p>The ID of the Workspace composed of multiple database instances. This parameter and <code>DBInstanceId</code> cannot both be empty. If both are specified, this parameter takes precedence.</p>
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

            /**
             * <p>The Metadata field of the vector collection, used to associate with the fields in the vector table.</p>
             * 
             * <strong>example:</strong>
             * <p>doc_id</p>
             */
            public Builder collectionMetadataField(String collectionMetadataField) {
                this.collectionMetadataField = collectionMetadataField;
                return this;
            }

            /**
             * <p>The filtering condition for the relational table.</p>
             * 
             * <strong>example:</strong>
             * <p>tags @&gt; ARRAY[&quot;art&quot;]</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The field in the relational table, used to associate with the Metadata field of the vector collection.</p>
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
}
