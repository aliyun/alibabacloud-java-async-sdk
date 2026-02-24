// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20251013.models;

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
 * {@link CreateMultimodalSearchTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateMultimodalSearchTaskRequest</p>
 */
public class CreateMultimodalSearchTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetIds")
    private java.util.List<String> datasetIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmbeddingModel")
    private String embeddingModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelMode")
    private String modelMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchModel")
    private String searchModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopK")
    private Integer topK;

    private CreateMultimodalSearchTaskRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.datasetIds = builder.datasetIds;
        this.embeddingModel = builder.embeddingModel;
        this.modelMode = builder.modelMode;
        this.query = builder.query;
        this.searchModel = builder.searchModel;
        this.sourceRegionId = builder.sourceRegionId;
        this.topK = builder.topK;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMultimodalSearchTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return datasetIds
     */
    public java.util.List<String> getDatasetIds() {
        return this.datasetIds;
    }

    /**
     * @return embeddingModel
     */
    public String getEmbeddingModel() {
        return this.embeddingModel;
    }

    /**
     * @return modelMode
     */
    public String getModelMode() {
        return this.modelMode;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return searchModel
     */
    public String getSearchModel() {
        return this.searchModel;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    public static final class Builder extends Request.Builder<CreateMultimodalSearchTaskRequest, Builder> {
        private String DBClusterId; 
        private java.util.List<String> datasetIds; 
        private String embeddingModel; 
        private String modelMode; 
        private String query; 
        private String searchModel; 
        private String sourceRegionId; 
        private Integer topK; 

        private Builder() {
            super();
        } 

        private Builder(CreateMultimodalSearchTaskRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.datasetIds = request.datasetIds;
            this.embeddingModel = request.embeddingModel;
            this.modelMode = request.modelMode;
            this.query = request.query;
            this.searchModel = request.searchModel;
            this.sourceRegionId = request.sourceRegionId;
            this.topK = request.topK;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze454l20me07****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DatasetIds.
         */
        public Builder datasetIds(java.util.List<String> datasetIds) {
            String datasetIdsShrink = shrink(datasetIds, "DatasetIds", "json");
            this.putQueryParameter("DatasetIds", datasetIdsShrink);
            this.datasetIds = datasetIds;
            return this;
        }

        /**
         * EmbeddingModel.
         */
        public Builder embeddingModel(String embeddingModel) {
            this.putQueryParameter("EmbeddingModel", embeddingModel);
            this.embeddingModel = embeddingModel;
            return this;
        }

        /**
         * ModelMode.
         */
        public Builder modelMode(String modelMode) {
            this.putQueryParameter("ModelMode", modelMode);
            this.modelMode = modelMode;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * SearchModel.
         */
        public Builder searchModel(String searchModel) {
            this.putQueryParameter("SearchModel", searchModel);
            this.searchModel = searchModel;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putQueryParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * TopK.
         */
        public Builder topK(Integer topK) {
            this.putQueryParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        @Override
        public CreateMultimodalSearchTaskRequest build() {
            return new CreateMultimodalSearchTaskRequest(this);
        } 

    } 

}
