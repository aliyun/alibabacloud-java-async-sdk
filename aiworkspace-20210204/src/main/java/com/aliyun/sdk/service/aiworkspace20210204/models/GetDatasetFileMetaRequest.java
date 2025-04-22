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
 * {@link GetDatasetFileMetaRequest} extends {@link RequestModel}
 *
 * <p>GetDatasetFileMetaRequest</p>
 */
public class GetDatasetFileMetaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetFileMetaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetFileMetaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetVersion")
    private String datasetVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetDatasetFileMetaRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.datasetFileMetaId = builder.datasetFileMetaId;
        this.datasetVersion = builder.datasetVersion;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatasetFileMetaRequest create() {
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
     * @return datasetFileMetaId
     */
    public String getDatasetFileMetaId() {
        return this.datasetFileMetaId;
    }

    /**
     * @return datasetVersion
     */
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetDatasetFileMetaRequest, Builder> {
        private String datasetId; 
        private String datasetFileMetaId; 
        private String datasetVersion; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDatasetFileMetaRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.datasetFileMetaId = request.datasetFileMetaId;
            this.datasetVersion = request.datasetVersion;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The dataset ID. You can call <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a> to obtain the dataset ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-rbvg5wz****c9ks92</p>
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The metadata ID of the dataset file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>07914c9534586e4e7aa6e9dbca5009082df******fd8a0d857b33296c59bf6</p>
         */
        public Builder datasetFileMetaId(String datasetFileMetaId) {
            this.putPathParameter("DatasetFileMetaId", datasetFileMetaId);
            this.datasetFileMetaId = datasetFileMetaId;
            return this;
        }

        /**
         * <p>The dataset version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder datasetVersion(String datasetVersion) {
            this.putQueryParameter("DatasetVersion", datasetVersion);
            this.datasetVersion = datasetVersion;
            return this;
        }

        /**
         * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetDatasetFileMetaRequest build() {
            return new GetDatasetFileMetaRequest(this);
        } 

    } 

}
