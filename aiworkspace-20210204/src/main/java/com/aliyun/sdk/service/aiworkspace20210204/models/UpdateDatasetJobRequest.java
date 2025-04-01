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
 * {@link UpdateDatasetJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateDatasetJobRequest</p>
 */
public class UpdateDatasetJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetJobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetVersion")
    private String datasetVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private UpdateDatasetJobRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.datasetJobId = builder.datasetJobId;
        this.datasetVersion = builder.datasetVersion;
        this.description = builder.description;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDatasetJobRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateDatasetJobRequest, Builder> {
        private String datasetId; 
        private String datasetJobId; 
        private String datasetVersion; 
        private String description; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDatasetJobRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.datasetJobId = request.datasetJobId;
            this.datasetVersion = request.datasetVersion;
            this.description = request.description;
            this.workspaceId = request.workspaceId;
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
         * <p>dsjob-9jx1*****uj9e</p>
         */
        public Builder datasetJobId(String datasetJobId) {
            this.putPathParameter("DatasetJobId", datasetJobId);
            this.datasetJobId = datasetJobId;
            return this;
        }

        /**
         * DatasetVersion.
         */
        public Builder datasetVersion(String datasetVersion) {
            this.putBodyParameter("DatasetVersion", datasetVersion);
            this.datasetVersion = datasetVersion;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateDatasetJobRequest build() {
            return new UpdateDatasetJobRequest(this);
        } 

    } 

}
