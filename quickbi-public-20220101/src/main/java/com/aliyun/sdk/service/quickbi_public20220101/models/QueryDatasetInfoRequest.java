// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDatasetInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryDatasetInfoRequest</p>
 */
public class QueryDatasetInfoRequest extends Request {
    @Query
    @NameInMap("DatasetId")
    @Validation(required = true)
    private String datasetId;

    private QueryDatasetInfoRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDatasetInfoRequest create() {
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

    public static final class Builder extends Request.Builder<QueryDatasetInfoRequest, Builder> {
        private String datasetId; 

        private Builder() {
            super();
        } 

        private Builder(QueryDatasetInfoRequest request) {
            super(request);
            this.datasetId = request.datasetId;
        } 

        /**
         * DatasetId.
         */
        public Builder datasetId(String datasetId) {
            this.putQueryParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        @Override
        public QueryDatasetInfoRequest build() {
            return new QueryDatasetInfoRequest(this);
        } 

    } 

}
