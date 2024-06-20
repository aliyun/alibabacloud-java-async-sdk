// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatasetLabelsRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasetLabelsRequest</p>
 */
public class CreateDatasetLabelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List < Label > labels;

    private CreateDatasetLabelsRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.labels = builder.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetLabelsRequest create() {
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
     * @return labels
     */
    public java.util.List < Label > getLabels() {
        return this.labels;
    }

    public static final class Builder extends Request.Builder<CreateDatasetLabelsRequest, Builder> {
        private String datasetId; 
        private java.util.List < Label > labels; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetLabelsRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.labels = request.labels;
        } 

        /**
         * DatasetId.
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List < Label > labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        @Override
        public CreateDatasetLabelsRequest build() {
            return new CreateDatasetLabelsRequest(this);
        } 

    } 

}
