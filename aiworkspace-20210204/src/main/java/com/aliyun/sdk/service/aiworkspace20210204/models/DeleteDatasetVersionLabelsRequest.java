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
 * {@link DeleteDatasetVersionLabelsRequest} extends {@link RequestModel}
 *
 * <p>DeleteDatasetVersionLabelsRequest</p>
 */
public class DeleteDatasetVersionLabelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("VersionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keys")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keys;

    private DeleteDatasetVersionLabelsRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.versionName = builder.versionName;
        this.keys = builder.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDatasetVersionLabelsRequest create() {
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

    /**
     * @return keys
     */
    public String getKeys() {
        return this.keys;
    }

    public static final class Builder extends Request.Builder<DeleteDatasetVersionLabelsRequest, Builder> {
        private String datasetId; 
        private String versionName; 
        private String keys; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatasetVersionLabelsRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.versionName = request.versionName;
            this.keys = request.keys;
        } 

        /**
         * <p>The dataset ID. You can call <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a> to obtain the dataset ID.</p>
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
         * <p>The dataset version name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder versionName(String versionName) {
            this.putPathParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        /**
         * <p>The tag keys. Multiple tags are separated by commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key1,key2</p>
         */
        public Builder keys(String keys) {
            this.putQueryParameter("Keys", keys);
            this.keys = keys;
            return this;
        }

        @Override
        public DeleteDatasetVersionLabelsRequest build() {
            return new DeleteDatasetVersionLabelsRequest(this);
        } 

    } 

}
