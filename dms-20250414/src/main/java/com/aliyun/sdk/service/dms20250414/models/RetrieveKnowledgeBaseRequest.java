// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link RetrieveKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>RetrieveKnowledgeBaseRequest</p>
 */
public class RetrieveKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HybridSearch")
    private String hybridSearch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HybridSearchArgs")
    private String hybridSearchArgs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncludeMetadataFields")
    private String includeMetadataFields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncludeVector")
    private Boolean includeVector;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KbUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kbUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private String metrics;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Integer offset;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecallWindow")
    private String recallWindow;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RerankFactor")
    private Double rerankFactor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopK")
    private Integer topK;

    private RetrieveKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.filter = builder.filter;
        this.hybridSearch = builder.hybridSearch;
        this.hybridSearchArgs = builder.hybridSearchArgs;
        this.includeMetadataFields = builder.includeMetadataFields;
        this.includeVector = builder.includeVector;
        this.kbUuid = builder.kbUuid;
        this.metrics = builder.metrics;
        this.offset = builder.offset;
        this.orderBy = builder.orderBy;
        this.query = builder.query;
        this.recallWindow = builder.recallWindow;
        this.rerankFactor = builder.rerankFactor;
        this.topK = builder.topK;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetrieveKnowledgeBaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
    public String getHybridSearchArgs() {
        return this.hybridSearchArgs;
    }

    /**
     * @return includeMetadataFields
     */
    public String getIncludeMetadataFields() {
        return this.includeMetadataFields;
    }

    /**
     * @return includeVector
     */
    public Boolean getIncludeVector() {
        return this.includeVector;
    }

    /**
     * @return kbUuid
     */
    public String getKbUuid() {
        return this.kbUuid;
    }

    /**
     * @return metrics
     */
    public String getMetrics() {
        return this.metrics;
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
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return recallWindow
     */
    public String getRecallWindow() {
        return this.recallWindow;
    }

    /**
     * @return rerankFactor
     */
    public Double getRerankFactor() {
        return this.rerankFactor;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    public static final class Builder extends Request.Builder<RetrieveKnowledgeBaseRequest, Builder> {
        private String regionId; 
        private String filter; 
        private String hybridSearch; 
        private String hybridSearchArgs; 
        private String includeMetadataFields; 
        private Boolean includeVector; 
        private String kbUuid; 
        private String metrics; 
        private Integer offset; 
        private String orderBy; 
        private String query; 
        private String recallWindow; 
        private Double rerankFactor; 
        private Integer topK; 

        private Builder() {
            super();
        } 

        private Builder(RetrieveKnowledgeBaseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.filter = request.filter;
            this.hybridSearch = request.hybridSearch;
            this.hybridSearchArgs = request.hybridSearchArgs;
            this.includeMetadataFields = request.includeMetadataFields;
            this.includeVector = request.includeVector;
            this.kbUuid = request.kbUuid;
            this.metrics = request.metrics;
            this.offset = request.offset;
            this.orderBy = request.orderBy;
            this.query = request.query;
            this.recallWindow = request.recallWindow;
            this.rerankFactor = request.rerankFactor;
            this.topK = request.topK;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>A filter for the data, specified as a SQL <code>WHERE</code> clause.</p>
         * 
         * <strong>example:</strong>
         * <p>title = \&quot;test\&quot; AND name like \&quot;test%\&quot;</p>
         */
        public Builder filter(String filter) {
            this.putBodyParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The hybrid search algorithm. If this parameter is not set, the system directly compares and ranks the scores from the dense vector and full-text searches.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>RRF</code>: Reciprocal Rank Fusion. This method uses a parameter <code>k</code> to control the fusion effect. For more information, see the <code>HybridSearchArgs</code> configuration.</p>
         * </li>
         * <li><p><code>Weight</code>: Weighted ranking. This method applies weights to the vector and full-text search scores before ranking. For more information, see the <code>HybridSearchArgs</code> configuration.</p>
         * </li>
         * <li><p><code>Cascaded</code>: Performs a full-text search first, followed by a vector search on the results of the full-text search.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RRF</p>
         */
        public Builder hybridSearch(String hybridSearch) {
            this.putBodyParameter("HybridSearch", hybridSearch);
            this.hybridSearch = hybridSearch;
            return this;
        }

        /**
         * <p>Parameters for the specified <code>HybridSearch</code> algorithm. Both <code>RRF</code> and <code>Weight</code> are supported. You can use the <code>HybridPathsSetting</code> object to specify the retrieval paths: dense vector (<code>dense</code>), sparse vector (<code>sparse</code>), and full-text search (<code>fulltext</code>). If this object is not provided, the default retrieval paths are <code>dense</code> and <code>fulltext</code>.</p>
         * <ul>
         * <li><code>RRF</code>: Specifies the constant <code>k</code> in the scoring formula <code>1/(k+rank_i)</code>. The value of <code>k</code> must be an integer greater than 1. The format is as follows:</li>
         * </ul>
         * <pre><code>{
         *   &quot;HybridPathsSetting&quot;: {
         *     &quot;paths&quot;: &quot;dense,fulltext&quot;
         *   },
         *   &quot;RRF&quot;: {
         *     &quot;k&quot;: 60
         *   }
         * }
         * </code></pre>
         * <ul>
         * <li><p><code>Weight</code>:</p>
         * <ul>
         * <li><p>Two-path recall (do not specify <code>HybridPathsSetting</code>; specify only <code>alpha</code>):</p>
         * <ul>
         * <li>The score is calculated using the formula: <code>alpha * dense_score + (1-alpha) * fulltext_score</code>. The <code>alpha</code> parameter balances the scores from the dense vector and full-text searches. Its value must be in the range [0, 1], where 0 relies solely on full-text search, and 1 relies solely on dense vector search.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <pre><code>{ 
         *    &quot;Weight&quot;: {
         *     &quot;alpha&quot;: 0.5
         *    }
         * }
         * </code></pre>
         * <ul>
         * <li><p>Three-path recall:</p>
         * <ul>
         * <li>The score is calculated using the formula: <code>normalized_dense * dense_score + normalized_sparse * sparse_score + normalized_fulltext * fulltext_score</code>. The <code>dense</code>, <code>sparse</code>, and <code>fulltext</code> parameters are the weights for the dense vector, sparse vector, and full-text searches, respectively. Their values must be 0 or greater. The system automatically normalizes the weights to sum to 1 (for example, <code>normalized_x = x / (dense + sparse + fulltext)</code>).</li>
         * </ul>
         * </li>
         * </ul>
         * <pre><code>{
         *   &quot;HybridPathsSetting&quot;: {
         *      &quot;paths&quot;: &quot;dense,sparse,fulltext&quot;
         *    },
         *   &quot;Weight&quot;: {
         *     &quot;dense&quot;: 0.5,
         *     &quot;sparse&quot;: 0.3,
         *     &quot;fulltext&quot;: 0.2
         *   }
         * }
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>{ \&quot;Weight\&quot;: { \&quot;alpha\&quot;: 0.5 } }</p>
         */
        public Builder hybridSearchArgs(String hybridSearchArgs) {
            this.putBodyParameter("HybridSearchArgs", hybridSearchArgs);
            this.hybridSearchArgs = hybridSearchArgs;
            return this;
        }

        /**
         * <p>The metadata fields to return, separated by commas. By default, no metadata fields are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>title,page</p>
         */
        public Builder includeMetadataFields(String includeMetadataFields) {
            this.putBodyParameter("IncludeMetadataFields", includeMetadataFields);
            this.includeMetadataFields = includeMetadataFields;
            return this;
        }

        /**
         * <p>Specifies whether to include the vector in the results. The default value is <code>false</code>.</p>
         * <blockquote>
         * <ul>
         * <li><p><strong>false</strong>: The vector is not returned.</p>
         * </li>
         * <li><p><strong>true</strong>: The vector is returned.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeVector(Boolean includeVector) {
            this.putBodyParameter("IncludeVector", includeVector);
            this.includeVector = includeVector;
            return this;
        }

        /**
         * <p>The ID of the knowledge base.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-***</p>
         */
        public Builder kbUuid(String kbUuid) {
            this.putBodyParameter("KbUuid", kbUuid);
            this.kbUuid = kbUuid;
            return this;
        }

        /**
         * <p>The distance metric for retrieval. If unspecified, this defaults to the metric configured for the knowledge base. Only set this parameter if you have specific requirements.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>l2</code>: Euclidean distance.</p>
         * </li>
         * <li><p><code>ip</code>: Inner product.</p>
         * </li>
         * <li><p><code>cosine</code>: Cosine similarity.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cosine</p>
         */
        public Builder metrics(String metrics) {
            this.putBodyParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * <p>The offset for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(Integer offset) {
            this.putBodyParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>The field to use for sorting the results. By default, this parameter is empty.</p>
         * <p>The field must be a metadata field or a default table field, such as <code>id</code>. Supported formats include:</p>
         * <p>You can specify a single field (for example, <code>chunk_id</code>), multiple comma-separated fields (for example, <code>block_id, chunk_id</code>), or fields with descending order (for example, <code>block_id DESC, chunk_id DESC</code>).</p>
         * 
         * <strong>example:</strong>
         * <p>created_at</p>
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The query text.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>What is GraphRAG?</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The recall window. If specified, this parameter expands the context of the retrieved results. The format is a two-element array <code>[A, B]</code>, where <code>-10 &lt;= A &lt;= 0</code> and <code>0 &lt;= B &lt;= 10</code>.</p>
         * <blockquote>
         * <ul>
         * <li><p>Recommended when document chunks are highly fragmented, which might cause context loss during retrieval.</p>
         * </li>
         * <li><p>Reranking occurs before windowing is applied.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[-5,5]</p>
         */
        public Builder recallWindow(String recallWindow) {
            this.putBodyParameter("RecallWindow", recallWindow);
            this.recallWindow = recallWindow;
            return this;
        }

        /**
         * <p>The factor used to rerank vector search results. The value must be in the range (1, 5].</p>
         * <blockquote>
         * <ul>
         * <li><p>Reranking may be slow if document chunks are sparse.</p>
         * </li>
         * <li><p>The number of items to rerank, calculated as <code>ceil(TopK * RerankFactor)</code>, should not exceed 50.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder rerankFactor(Double rerankFactor) {
            this.putBodyParameter("RerankFactor", rerankFactor);
            this.rerankFactor = rerankFactor;
            return this;
        }

        /**
         * <p>The number of top-ranked results to return.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder topK(Integer topK) {
            this.putBodyParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        @Override
        public RetrieveKnowledgeBaseRequest build() {
            return new RetrieveKnowledgeBaseRequest(this);
        } 

    } 

}
