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
 * {@link CreateDatasetFileMetasRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasetFileMetasRequest</p>
 */
public class CreateDatasetFileMetasRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetFileMetas")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DatasetFileMetaContentCreate> datasetFileMetas;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateDatasetFileMetasRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.datasetFileMetas = builder.datasetFileMetas;
        this.datasetVersion = builder.datasetVersion;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetFileMetasRequest create() {
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
    public java.util.List<DatasetFileMetaContentCreate> getDatasetFileMetas() {
        return this.datasetFileMetas;
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

    public static final class Builder extends Request.Builder<CreateDatasetFileMetasRequest, Builder> {
        private String datasetId; 
        private java.util.List<DatasetFileMetaContentCreate> datasetFileMetas; 
        private String datasetVersion; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetFileMetasRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.datasetFileMetas = request.datasetFileMetas;
            this.datasetVersion = request.datasetVersion;
            this.workspaceId = request.workspaceId;
        } 

        /**
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
         * <p>This parameter is required.</p>
         */
        public Builder datasetFileMetas(java.util.List<DatasetFileMetaContentCreate> datasetFileMetas) {
            this.putBodyParameter("DatasetFileMetas", datasetFileMetas);
            this.datasetFileMetas = datasetFileMetas;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>478**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateDatasetFileMetasRequest build() {
            return new CreateDatasetFileMetasRequest(this);
        } 

    } 

}
