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
 * {@link CreateDatasetJobRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasetJobRequest</p>
 */
public class CreateDatasetJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetVersion")
    private String datasetVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobMode")
    private String jobMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateDatasetJobRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.datasetVersion = builder.datasetVersion;
        this.description = builder.description;
        this.jobAction = builder.jobAction;
        this.jobMode = builder.jobMode;
        this.jobSpec = builder.jobSpec;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetJobRequest create() {
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
     * @return jobAction
     */
    public String getJobAction() {
        return this.jobAction;
    }

    /**
     * @return jobMode
     */
    public String getJobMode() {
        return this.jobMode;
    }

    /**
     * @return jobSpec
     */
    public String getJobSpec() {
        return this.jobSpec;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateDatasetJobRequest, Builder> {
        private String datasetId; 
        private String datasetVersion; 
        private String description; 
        private String jobAction; 
        private String jobMode; 
        private String jobSpec; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetJobRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.datasetVersion = request.datasetVersion;
            this.description = request.description;
            this.jobAction = request.jobAction;
            this.jobMode = request.jobMode;
            this.jobSpec = request.jobSpec;
            this.workspaceId = request.workspaceId;
        } 

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SemanticIndex</p>
         */
        public Builder jobAction(String jobAction) {
            this.putBodyParameter("JobAction", jobAction);
            this.jobAction = jobAction;
            return this;
        }

        /**
         * JobMode.
         */
        public Builder jobMode(String jobMode) {
            this.putBodyParameter("JobMode", jobMode);
            this.jobMode = jobMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;modelId&quot;:&quot;xxx&quot;}</p>
         */
        public Builder jobSpec(String jobSpec) {
            this.putBodyParameter("JobSpec", jobSpec);
            this.jobSpec = jobSpec;
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
        public CreateDatasetJobRequest build() {
            return new CreateDatasetJobRequest(this);
        } 

    } 

}
