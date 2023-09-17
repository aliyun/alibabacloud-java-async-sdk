// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetAnnotationDataRequest} extends {@link RequestModel}
 *
 * <p>GetAnnotationDataRequest</p>
 */
public class GetAnnotationDataRequest extends Request {
    @Path
    @NameInMap("datasetId")
    private String datasetId;

    @Path
    @NameInMap("annotationdataId")
    private String annotationdataId;

    private GetAnnotationDataRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.annotationdataId = builder.annotationdataId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAnnotationDataRequest create() {
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
     * @return annotationdataId
     */
    public String getAnnotationdataId() {
        return this.annotationdataId;
    }

    public static final class Builder extends Request.Builder<GetAnnotationDataRequest, Builder> {
        private String datasetId; 
        private String annotationdataId; 

        private Builder() {
            super();
        } 

        private Builder(GetAnnotationDataRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.annotationdataId = request.annotationdataId;
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
         * annotationdataId.
         */
        public Builder annotationdataId(String annotationdataId) {
            this.putPathParameter("annotationdataId", annotationdataId);
            this.annotationdataId = annotationdataId;
            return this;
        }

        @Override
        public GetAnnotationDataRequest build() {
            return new GetAnnotationDataRequest(this);
        } 

    } 

}
