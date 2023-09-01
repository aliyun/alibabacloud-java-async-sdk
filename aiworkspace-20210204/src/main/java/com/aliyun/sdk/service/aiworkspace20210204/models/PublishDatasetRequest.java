// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishDatasetRequest} extends {@link RequestModel}
 *
 * <p>PublishDatasetRequest</p>
 */
public class PublishDatasetRequest extends Request {
    @Path
    @NameInMap("DatasetId")
    @Validation(required = true)
    private String datasetId;

    private PublishDatasetRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishDatasetRequest create() {
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

    public static final class Builder extends Request.Builder<PublishDatasetRequest, Builder> {
        private String datasetId; 

        private Builder() {
            super();
        } 

        private Builder(PublishDatasetRequest request) {
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
        public PublishDatasetRequest build() {
            return new PublishDatasetRequest(this);
        } 

    } 

}
