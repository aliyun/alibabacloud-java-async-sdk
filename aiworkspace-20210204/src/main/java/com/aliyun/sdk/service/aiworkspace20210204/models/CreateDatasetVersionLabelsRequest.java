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
 * {@link CreateDatasetVersionLabelsRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasetVersionLabelsRequest</p>
 */
public class CreateDatasetVersionLabelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("VersionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Label> labels;

    private CreateDatasetVersionLabelsRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.versionName = builder.versionName;
        this.labels = builder.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetVersionLabelsRequest create() {
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
     * @return labels
     */
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public static final class Builder extends Request.Builder<CreateDatasetVersionLabelsRequest, Builder> {
        private String datasetId; 
        private String versionName; 
        private java.util.List<Label> labels; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetVersionLabelsRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.versionName = request.versionName;
            this.labels = request.labels;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-rbvg5wzlj****9ks92</p>
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
         * <p>v1</p>
         */
        public Builder versionName(String versionName) {
            this.putPathParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        @Override
        public CreateDatasetVersionLabelsRequest build() {
            return new CreateDatasetVersionLabelsRequest(this);
        } 

    } 

}
