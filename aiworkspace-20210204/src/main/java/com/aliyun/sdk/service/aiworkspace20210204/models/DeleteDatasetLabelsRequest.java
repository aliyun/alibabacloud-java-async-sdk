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
 * {@link DeleteDatasetLabelsRequest} extends {@link RequestModel}
 *
 * <p>DeleteDatasetLabelsRequest</p>
 */
public class DeleteDatasetLabelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelKeys")
    private String labelKeys;

    private DeleteDatasetLabelsRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.labelKeys = builder.labelKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDatasetLabelsRequest create() {
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
     * @return labelKeys
     */
    public String getLabelKeys() {
        return this.labelKeys;
    }

    public static final class Builder extends Request.Builder<DeleteDatasetLabelsRequest, Builder> {
        private String datasetId; 
        private String labelKeys; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatasetLabelsRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.labelKeys = request.labelKeys;
        } 

        /**
         * <p>The dataset ID. You can call <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a> to obtain the dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-rbvg5****jhc9ks92</p>
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The tag key. You can call <a href="https://help.aliyun.com/document_detail/457218.html">GetDataset</a> to obtain the tag key. Multiple tag keys are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>key1,key2</p>
         */
        public Builder labelKeys(String labelKeys) {
            this.putQueryParameter("LabelKeys", labelKeys);
            this.labelKeys = labelKeys;
            return this;
        }

        @Override
        public DeleteDatasetLabelsRequest build() {
            return new DeleteDatasetLabelsRequest(this);
        } 

    } 

}
