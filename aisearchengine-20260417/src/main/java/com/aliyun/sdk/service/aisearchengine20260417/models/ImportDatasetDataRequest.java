// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisearchengine20260417.models;

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
 * {@link ImportDatasetDataRequest} extends {@link RequestModel}
 *
 * <p>ImportDatasetDataRequest</p>
 */
public class ImportDatasetDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("datasetId")
    private String datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("records")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<java.util.Map<String, ?>> records;

    private ImportDatasetDataRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.records = builder.records;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportDatasetDataRequest create() {
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
     * @return records
     */
    public java.util.List<java.util.Map<String, ?>> getRecords() {
        return this.records;
    }

    public static final class Builder extends Request.Builder<ImportDatasetDataRequest, Builder> {
        private String datasetId; 
        private java.util.List<java.util.Map<String, ?>> records; 

        private Builder() {
            super();
        } 

        private Builder(ImportDatasetDataRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.records = request.records;
        } 

        /**
         * datasetId.
         */
        public Builder datasetId(String datasetId) {
            this.putBodyParameter("datasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder records(java.util.List<java.util.Map<String, ?>> records) {
            this.putBodyParameter("records", records);
            this.records = records;
            return this;
        }

        @Override
        public ImportDatasetDataRequest build() {
            return new ImportDatasetDataRequest(this);
        } 

    } 

}
