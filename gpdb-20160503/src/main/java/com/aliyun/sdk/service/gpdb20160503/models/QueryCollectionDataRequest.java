// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.Map < String, java.util.Map<String, ?>> hybridSearchArgs;

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
    @com.aliyun.core.annotation.NameInMap("TopK")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long topK;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vector")
    private java.util.List < Double > vector;

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
    public java.util.Map < String, java.util.Map<String, ?>> getHybridSearchArgs() {
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
     * @return topK
     */
    public Long getTopK() {
        return this.topK;
    }

    /**
     * @return vector
     */
    public java.util.List < Double > getVector() {
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
        private java.util.Map < String, java.util.Map<String, ?>> hybridSearchArgs; 
        private String includeMetadataFields; 
        private Boolean includeValues; 
        private String metrics; 
        private String namespace; 
        private String namespacePassword; 
        private Integer offset; 
        private String orderBy; 
        private Long ownerId; 
        private String regionId; 
        private Long topK; 
        private java.util.List < Double > vector; 
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
            this.topK = request.topK;
            this.vector = request.vector;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * The name of the collection.
         * <p>
         * 
         * >  You can call the [ListCollections](~~2401503~~) operation to query a list of collections.
         */
        public Builder collection(String collection) {
            this.putQueryParameter("Collection", collection);
            this.collection = collection;
            return this;
        }

        /**
         * The content that is used for full-text search. If you leave this parameter empty, only vector search is used. If you do not leave this parameter empty, two-way retrieval based on vector search and full-text search is used.
         * <p>
         * 
         * >  You must specify at least one of the Content and Vector parameters.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * The two-way retrieval algorithm. This parameter is empty by default, which specifies that scores of vector search and full-text search are directly compared and sorted without additional weighting or adjustments.
         * <p>
         * 
         * Valid values:
         * 
         * *   RRF: The reciprocal rank fusion (RRF) algorithm uses a constant k to control the fusion effect. For more information, see the description of the HybridSearchArgs parameter.
         * *   Weight: This algorithm uses the alpha parameter to specify the proportion of the vector search score and the full-text search score and then sorts by weight. For more information, see the description of the HybridSearchArgs parameter.
         * *   Cascaded: This algorithm performs first full-text search and then vector search.
         */
        public Builder hybridSearch(String hybridSearch) {
            this.putQueryParameter("HybridSearch", hybridSearch);
            this.hybridSearch = hybridSearch;
            return this;
        }

        /**
         * The parameters of the two-way retrieval algorithm. The following parameters are supported:
         * <p>
         * 
         * *   When HybridSearch is set to RRF, the scores are calculated by using the `1/(k+rank_i)` formula. The constant k is a positive integer that is greater than 1.
         * 
         * <!---->
         * 
         *     { 
         *        "RRF": {
         *         "k": 60
         *        }
         *     }
         * 
         * *   When HybridSearch is set to Weight, the scores are calculated by using the `alpha * vector_score + (1-alpha) * text_score` formula. The alpha parameter specifies the proportion of the vector search score and the full-text search score and ranges from 0 to 1. A value of 0 specifies full-text search and a value of 1 specifies vector search.
         * 
         * <!---->
         * 
         *     { 
         *        "Weight": {
         *         "alpha": 0.5
         *        }
         *     }
         */
        public Builder hybridSearchArgs(java.util.Map < String, java.util.Map<String, ?>> hybridSearchArgs) {
            String hybridSearchArgsShrink = shrink(hybridSearchArgs, "HybridSearchArgs", "json");
            this.putQueryParameter("HybridSearchArgs", hybridSearchArgsShrink);
            this.hybridSearchArgs = hybridSearchArgs;
            return this;
        }

        /**
         * The metadata fields to be returned. Separate multiple fields with commas (,). This parameter is empty by default.
         */
        public Builder includeMetadataFields(String includeMetadataFields) {
            this.putQueryParameter("IncludeMetadataFields", includeMetadataFields);
            this.includeMetadataFields = includeMetadataFields;
            return this;
        }

        /**
         * Specifies whether to return vector data. Valid values:
         * <p>
         * 
         * *   **true**: returns vector data.
         * *   **false**: does not return vector data. In full-text search scenarios, set this parameter to false.
         */
        public Builder includeValues(Boolean includeValues) {
            this.putQueryParameter("IncludeValues", includeValues);
            this.includeValues = includeValues;
            return this;
        }

        /**
         * The similarity algorithm for search. Valid values:
         * <p>
         * 
         * *   **l2**: Euclidean distance.
         * *   **ip**: inner product distance.
         * *   **cosine**: cosine similarity.
         * 
         * >  If you leave this parameter empty, the l2, ip, or cosine algorithm that is specified when you create an index is used.
         */
        public Builder metrics(String metrics) {
            this.putQueryParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * The name of the namespace.
         * <p>
         * 
         * >  You can call the [ListNamespaces](~~2401502~~) operation to query a list of namespaces.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * NamespacePassword.
         */
        public Builder namespacePassword(String namespacePassword) {
            this.putQueryParameter("NamespacePassword", namespacePassword);
            this.namespacePassword = namespacePassword;
            return this;
        }

        /**
         * The starting point for paginated queries. This parameter is empty by default. This parameter does not support two-way retrieval scenarios.
         * <p>
         * 
         * The value must be greater than or equal to 0. If you do not leave this parameter empty, the Total parameter is returned to indicate the total number of matched entries. You must specify this parameter and the TopK parameter in pairs. For example, to paginate 20 chunks at a time for a total of 45 chunks whose chunk_id values are 0 to 44, three requests are involved:
         * 
         * *   First request: Set the Offset value to 0 and the TopK value to 20. The chunks whose chunk_id values are 0 to 19 are returned.
         * *   Second request: Set the Offset value to 20 and the TopK value to 20. The chunks whose chunk_id values are 20 to 39 are returned.
         * *   Third request: Set the Offset value to 30 and the TopK value to 20. The chunks whose chunk_id values are 40 to 44 are returned.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * The fields by which to sort the results. This parameter is empty by default. This parameter does not support two-way retrieval scenarios.
         * <p>
         * 
         * You must specify the default fields in the metadata or the table, such as id. You can specify the following number of fields:
         * 
         * *   One field, such as chunk_id.
         * *   Multiple fields that are sorted in ascending order and separated by commas (,), such as block_id and chunk_id.
         * *   Multiple fields that are sorted in descending order and separated by commas (,), such as block_id DESC, chunk_id DESC.
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
         * The region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TopK.
         */
        public Builder topK(Long topK) {
            this.putQueryParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * The vector data. The length of the value must be the same as that of the Dimension parameter in the [CreateCollection](~~2401497~~) operation.
         * <p>
         * 
         * >  If you leave this parameter empty, only full-text search results are returned.
         */
        public Builder vector(java.util.List < Double > vector) {
            String vectorShrink = shrink(vector, "Vector", "json");
            this.putQueryParameter("Vector", vectorShrink);
            this.vector = vector;
            return this;
        }

        /**
         * WorkspaceId.
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

}
