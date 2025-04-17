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
 * {@link DeleteDatasetVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteDatasetVersionRequest</p>
 */
public class DeleteDatasetVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("VersionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionName;

    private DeleteDatasetVersionRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDatasetVersionRequest create() {
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
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder extends Request.Builder<DeleteDatasetVersionRequest, Builder> {
        private String datasetId; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatasetVersionRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.versionName = request.versionName;
        } 

        /**
         * <p>The dataset ID. You can call <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a> to obtain the dataset ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-lfd60v0p****ujtsdx</p>
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The dataset version name. The version number must be later than v1. Version v1 can only be deleted when the dataset is deleted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder versionName(String versionName) {
            this.putPathParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public DeleteDatasetVersionRequest build() {
            return new DeleteDatasetVersionRequest(this);
        } 

    } 

}
