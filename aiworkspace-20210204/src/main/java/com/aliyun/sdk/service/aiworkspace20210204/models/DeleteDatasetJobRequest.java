// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteDatasetJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteDatasetJobRequest</p>
 */
public class DeleteDatasetJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetJobId;

    private DeleteDatasetJobRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.datasetJobId = builder.datasetJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDatasetJobRequest create() {
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
     * @return datasetJobId
     */
    public String getDatasetJobId() {
        return this.datasetJobId;
    }

    public static final class Builder extends Request.Builder<DeleteDatasetJobRequest, Builder> {
        private String datasetId; 
        private String datasetJobId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatasetJobRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.datasetJobId = request.datasetJobId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-rbvg5*****jhc9ks92</p>
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dsjob-9jx1******uj9e</p>
         */
        public Builder datasetJobId(String datasetJobId) {
            this.putPathParameter("DatasetJobId", datasetJobId);
            this.datasetJobId = datasetJobId;
            return this;
        }

        @Override
        public DeleteDatasetJobRequest build() {
            return new DeleteDatasetJobRequest(this);
        } 

    } 

}
