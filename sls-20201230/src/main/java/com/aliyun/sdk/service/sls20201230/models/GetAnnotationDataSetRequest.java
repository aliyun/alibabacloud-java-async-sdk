// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetAnnotationDataSetRequest} extends {@link RequestModel}
 *
 * <p>GetAnnotationDataSetRequest</p>
 */
public class GetAnnotationDataSetRequest extends Request {
    @Path
    @NameInMap("datasetId")
    private String datasetId;

    private GetAnnotationDataSetRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAnnotationDataSetRequest create() {
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

    public static final class Builder extends Request.Builder<GetAnnotationDataSetRequest, Builder> {
        private String datasetId; 

        private Builder() {
            super();
        } 

        private Builder(GetAnnotationDataSetRequest request) {
            super(request);
            this.datasetId = request.datasetId;
        } 

        /**
         * datasetId.
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("datasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        @Override
        public GetAnnotationDataSetRequest build() {
            return new GetAnnotationDataSetRequest(this);
        } 

    } 

}
