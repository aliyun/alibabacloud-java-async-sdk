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
 * {@link UpdateOSSExportRequest} extends {@link RequestModel}
 *
 * <p>UpdateOSSExportRequest</p>
 */
public class UpdateOSSExportRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ossExportName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossExportName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configuration")
    private OSSExportConfiguration configuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    private UpdateOSSExportRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.ossExportName = builder.ossExportName;
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.displayName = builder.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOSSExportRequest create() {
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
     * @return ossExportName
     */
    public String getOssExportName() {
        return this.ossExportName;
    }

    /**
     * @return configuration
     */
    public OSSExportConfiguration getConfiguration() {
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

    public static final class Builder extends Request.Builder<UpdateOSSExportRequest, Builder> {
        private String project; 
        private String ossExportName; 
        private OSSExportConfiguration configuration; 
        private String description; 
        private String displayName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOSSExportRequest request) {
            super(request);
            this.project = request.project;
            this.ossExportName = request.ossExportName;
            this.configuration = request.configuration;
            this.description = request.description;
            this.displayName = request.displayName;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The unique name of the job. Make sure that the job exists.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>job-123456789-123456</p>
         */
        public Builder ossExportName(String ossExportName) {
            this.putPathParameter("ossExportName", ossExportName);
            this.ossExportName = ossExportName;
            return this;
        }

        /**
         * <p>The configuration details of the job.</p>
         */
        public Builder configuration(OSSExportConfiguration configuration) {
            this.putBodyParameter("configuration", configuration);
            this.configuration = configuration;
            return this;
        }

        /**
         * <p>The description of the job.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The display name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-oss-job</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        @Override
        public UpdateOSSExportRequest build() {
            return new UpdateOSSExportRequest(this);
        } 

    } 

}
