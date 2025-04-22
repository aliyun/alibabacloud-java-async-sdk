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
 * {@link GetDatasetJobRequest} extends {@link RequestModel}
 *
 * <p>GetDatasetJobRequest</p>
 */
public class GetDatasetJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetVersion")
    private String datasetVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetDatasetJobRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.datasetJobId = builder.datasetJobId;
        this.datasetVersion = builder.datasetVersion;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatasetJobRequest create() {
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

    public static final class Builder extends Request.Builder<GetDatasetJobRequest, Builder> {
        private String datasetId; 
        private String datasetJobId; 
        private String datasetVersion; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDatasetJobRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.datasetJobId = request.datasetJobId;
            this.datasetVersion = request.datasetVersion;
            this.workspaceId = request.workspaceId;
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
         * <p>The ID of the dataset job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dsjob-9jx1xxxxxxuj9e</p>
         */
        public Builder datasetJobId(String datasetJobId) {
            this.putPathParameter("DatasetJobId", datasetJobId);
            this.datasetJobId = datasetJobId;
            return this;
        }

        /**
         * <p>The dataset version name.</p>
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
         * <p>478**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetDatasetJobRequest build() {
            return new GetDatasetJobRequest(this);
        } 

    } 

}
