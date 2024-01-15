// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link CreateAnnotationDataSetRequest} extends {@link RequestModel}
 *
 * <p>CreateAnnotationDataSetRequest</p>
 */
public class CreateAnnotationDataSetRequest extends Request {
    @Body
    @NameInMap("body")
    private MLDataSetParam body;

    @Query
    @NameInMap("datasetId")
    private String datasetId;

    private CreateAnnotationDataSetRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.datasetId = builder.datasetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAnnotationDataSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public MLDataSetParam getBody() {
        return this.body;
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    public static final class Builder extends Request.Builder<CreateAnnotationDataSetRequest, Builder> {
        private MLDataSetParam body; 
        private String datasetId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAnnotationDataSetRequest request) {
            super(request);
            this.body = request.body;
            this.datasetId = request.datasetId;
        } 

        /**
         * The data structure of the request.
         */
        public Builder body(MLDataSetParam body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * The unique identifier of the dataset.
         */
        public Builder datasetId(String datasetId) {
            this.putQueryParameter("datasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        @Override
        public CreateAnnotationDataSetRequest build() {
            return new CreateAnnotationDataSetRequest(this);
        } 

    } 

}
