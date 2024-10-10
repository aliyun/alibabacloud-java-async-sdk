// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryDatasetDetailInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryDatasetDetailInfoRequest</p>
 */
public class QueryDatasetDetailInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    private QueryDatasetDetailInfoRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDatasetDetailInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    public static final class Builder extends Request.Builder<QueryDatasetDetailInfoRequest, Builder> {
        private String datasetId; 

        private Builder() {
            super();
        } 

        private Builder(QueryDatasetDetailInfoRequest request) {
            super(request);
            this.datasetId = request.datasetId;
        } 

        /**
         * <p>The ID of the training dataset that you want to remove from the specified custom linguistic model.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5820f58c-c734-4d8a-baf1-7979af4f****</p>
         */
        public Builder datasetId(String datasetId) {
            this.putQueryParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        @Override
        public QueryDatasetDetailInfoRequest build() {
            return new QueryDatasetDetailInfoRequest(this);
        } 

    } 

}
