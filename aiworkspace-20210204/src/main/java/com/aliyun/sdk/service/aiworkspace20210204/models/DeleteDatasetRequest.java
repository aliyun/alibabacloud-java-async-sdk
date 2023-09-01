// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDatasetRequest} extends {@link RequestModel}
 *
 * <p>DeleteDatasetRequest</p>
 */
public class DeleteDatasetRequest extends Request {
    @Path
    @NameInMap("DatasetId")
    @Validation(required = true)
    private String datasetId;

    private DeleteDatasetRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDatasetRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDatasetRequest, Builder> {
        private String datasetId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatasetRequest request) {
            super(request);
            this.datasetId = request.datasetId;
        } 

        /**
         * DatasetId.
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        @Override
        public DeleteDatasetRequest build() {
            return new DeleteDatasetRequest(this);
        } 

    } 

}
