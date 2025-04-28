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
 * {@link UpdateDatasetFileMetasRequest} extends {@link RequestModel}
 *
 * <p>UpdateDatasetFileMetasRequest</p>
 */
public class UpdateDatasetFileMetasRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetFileMetas")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DatasetFileMetaConentUpdate> datasetFileMetas;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetVersion")
    private String datasetVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagJobId")
    private String tagJobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private UpdateDatasetFileMetasRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.datasetFileMetas = builder.datasetFileMetas;
        this.datasetVersion = builder.datasetVersion;
        this.tagJobId = builder.tagJobId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDatasetFileMetasRequest create() {
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
     * @return datasetFileMetas
     */
    public java.util.List<DatasetFileMetaConentUpdate> getDatasetFileMetas() {
        return this.datasetFileMetas;
    }

    /**
     * @return datasetVersion
     */
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    /**
     * @return tagJobId
     */
    public String getTagJobId() {
        return this.tagJobId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateDatasetFileMetasRequest, Builder> {
        private String datasetId; 
        private java.util.List<DatasetFileMetaConentUpdate> datasetFileMetas; 
        private String datasetVersion; 
        private String tagJobId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDatasetFileMetasRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.datasetFileMetas = request.datasetFileMetas;
            this.datasetVersion = request.datasetVersion;
            this.tagJobId = request.tagJobId;
            this.workspaceId = request.workspaceId;
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
         * <p>The metadata records to be updated for the dataset files.</p>
         * <p>This parameter is required.</p>
         */
        public Builder datasetFileMetas(java.util.List<DatasetFileMetaConentUpdate> datasetFileMetas) {
            this.putBodyParameter("DatasetFileMetas", datasetFileMetas);
            this.datasetFileMetas = datasetFileMetas;
            return this;
        }

        /**
         * <p>The dataset version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder datasetVersion(String datasetVersion) {
            this.putBodyParameter("DatasetVersion", datasetVersion);
            this.datasetVersion = datasetVersion;
            return this;
        }

        /**
         * <p>The ID of the tagging job that is associated with the metadata tag of the dataset file.</p>
         * 
         * <strong>example:</strong>
         * <p>dsjob-hv0b1****u8taig3y</p>
         */
        public Builder tagJobId(String tagJobId) {
            this.putBodyParameter("TagJobId", tagJobId);
            this.tagJobId = tagJobId;
            return this;
        }

        /**
         * <p>The ID of the workspace to which the dataset belongs. To obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>796**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateDatasetFileMetasRequest build() {
            return new UpdateDatasetFileMetasRequest(this);
        } 

    } 

}
