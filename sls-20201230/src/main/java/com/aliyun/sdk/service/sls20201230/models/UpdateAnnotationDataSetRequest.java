// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateAnnotationDataSetRequest} extends {@link RequestModel}
 *
 * <p>UpdateAnnotationDataSetRequest</p>
 */
public class UpdateAnnotationDataSetRequest extends Request {
    @Path
    @NameInMap("datasetId")
    private String datasetId;

    @Body
    @NameInMap("body")
    private MLDataSetParam body;

    private UpdateAnnotationDataSetRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAnnotationDataSetRequest create() {
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

    /**
     * @return body
     */
    public MLDataSetParam getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateAnnotationDataSetRequest, Builder> {
        private String datasetId; 
        private MLDataSetParam body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAnnotationDataSetRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.body = request.body;
        } 

        /**
         * datasetId.
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("datasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(MLDataSetParam body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateAnnotationDataSetRequest build() {
            return new UpdateAnnotationDataSetRequest(this);
        } 

    } 

}
