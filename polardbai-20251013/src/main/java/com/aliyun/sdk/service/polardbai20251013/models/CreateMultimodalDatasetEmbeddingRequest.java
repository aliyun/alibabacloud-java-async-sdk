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
 * {@link CreateMultimodalDatasetEmbeddingRequest} extends {@link RequestModel}
 *
 * <p>CreateMultimodalDatasetEmbeddingRequest</p>
 */
public class CreateMultimodalDatasetEmbeddingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelMode")
    private String modelMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    private CreateMultimodalDatasetEmbeddingRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.datasetId = builder.datasetId;
        this.model = builder.model;
        this.modelMode = builder.modelMode;
        this.sourceRegionId = builder.sourceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMultimodalDatasetEmbeddingRequest create() {
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
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return modelMode
     */
    public String getModelMode() {
        return this.modelMode;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public static final class Builder extends Request.Builder<CreateMultimodalDatasetEmbeddingRequest, Builder> {
        private String DBClusterId; 
        private String datasetId; 
        private String model; 
        private String modelMode; 
        private String sourceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMultimodalDatasetEmbeddingRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.datasetId = request.datasetId;
            this.model = request.model;
            this.modelMode = request.modelMode;
            this.sourceRegionId = request.sourceRegionId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-3h6bm*****af60</p>
         */
        public Builder datasetId(String datasetId) {
            this.putQueryParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
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
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putQueryParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        @Override
        public CreateMultimodalDatasetEmbeddingRequest build() {
            return new CreateMultimodalDatasetEmbeddingRequest(this);
        } 

    } 

}
