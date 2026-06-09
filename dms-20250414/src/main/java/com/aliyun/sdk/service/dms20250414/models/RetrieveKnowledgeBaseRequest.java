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
         * Filter.
         */
        public Builder filter(String filter) {
            this.putBodyParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * HybridSearch.
         */
        public Builder hybridSearch(String hybridSearch) {
            this.putBodyParameter("HybridSearch", hybridSearch);
            this.hybridSearch = hybridSearch;
            return this;
        }

        /**
         * HybridSearchArgs.
         */
        public Builder hybridSearchArgs(String hybridSearchArgs) {
            this.putBodyParameter("HybridSearchArgs", hybridSearchArgs);
            this.hybridSearchArgs = hybridSearchArgs;
            return this;
        }

        /**
         * IncludeMetadataFields.
         */
        public Builder includeMetadataFields(String includeMetadataFields) {
            this.putBodyParameter("IncludeMetadataFields", includeMetadataFields);
            this.includeMetadataFields = includeMetadataFields;
            return this;
        }

        /**
         * IncludeVector.
         */
        public Builder includeVector(Boolean includeVector) {
            this.putBodyParameter("IncludeVector", includeVector);
            this.includeVector = includeVector;
            return this;
        }

        /**
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
         * Metrics.
         */
        public Builder metrics(String metrics) {
            this.putBodyParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putBodyParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
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
         * RecallWindow.
         */
        public Builder recallWindow(String recallWindow) {
            this.putBodyParameter("RecallWindow", recallWindow);
            this.recallWindow = recallWindow;
            return this;
        }

        /**
         * RerankFactor.
         */
        public Builder rerankFactor(Double rerankFactor) {
            this.putBodyParameter("RerankFactor", rerankFactor);
            this.rerankFactor = rerankFactor;
            return this;
        }

        /**
         * TopK.
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
