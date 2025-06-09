// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link UpdateMaxComputeExportRequest} extends {@link RequestModel}
 *
 * <p>UpdateMaxComputeExportRequest</p>
 */
public class UpdateMaxComputeExportRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("mcExportName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mcExportName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private MaxComputeExportConfiguration configuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    private UpdateMaxComputeExportRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.mcExportName = builder.mcExportName;
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.displayName = builder.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMaxComputeExportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return mcExportName
     */
    public String getMcExportName() {
        return this.mcExportName;
    }

    /**
     * @return configuration
     */
    public MaxComputeExportConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    public static final class Builder extends Request.Builder<UpdateMaxComputeExportRequest, Builder> {
        private String project; 
        private String mcExportName; 
        private MaxComputeExportConfiguration configuration; 
        private String description; 
        private String displayName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMaxComputeExportRequest request) {
            super(request);
            this.project = request.project;
            this.mcExportName = request.mcExportName;
            this.configuration = request.configuration;
            this.description = request.description;
            this.displayName = request.displayName;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The unique name of the MaxCompute data shipping job. Make sure that the job exists.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>export-mc-1234567890-123456</p>
         */
        public Builder mcExportName(String mcExportName) {
            this.putPathParameter("mcExportName", mcExportName);
            this.mcExportName = mcExportName;
            return this;
        }

        /**
         * <p>The setting of the MaxCompute data shipping job.</p>
         * <p>This parameter is required.</p>
         */
        public Builder configuration(MaxComputeExportConfiguration configuration) {
            this.putBodyParameter("configuration", configuration);
            this.configuration = configuration;
            return this;
        }

        /**
         * <p>The description of the MaxCompute data shipping job.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The display name of the MaxCompute data shipping job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-mc-job</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        @Override
        public UpdateMaxComputeExportRequest build() {
            return new UpdateMaxComputeExportRequest(this);
        } 

    } 

}
