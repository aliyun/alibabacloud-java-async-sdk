// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link UpdateAnnotationDataSetRequest} extends {@link RequestModel}
 *
 * <p>UpdateAnnotationDataSetRequest</p>
 */
public class UpdateAnnotationDataSetRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("datasetId")
    private String datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
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
         * <p>The unique identifier of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>cb8cc4eb51a85e823471cdb368fae9be</p>
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("datasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The data structure of the request.</p>
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
