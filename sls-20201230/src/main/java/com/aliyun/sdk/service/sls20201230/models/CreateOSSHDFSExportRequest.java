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
 * {@link CreateOSSHDFSExportRequest} extends {@link RequestModel}
 *
 * <p>CreateOSSHDFSExportRequest</p>
 */
public class CreateOSSHDFSExportRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private OSSExportConfiguration configuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CreateOSSHDFSExportRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOSSHDFSExportRequest create() {
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

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateOSSHDFSExportRequest, Builder> {
        private String project; 
        private OSSExportConfiguration configuration; 
        private String description; 
        private String displayName; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateOSSHDFSExportRequest request) {
            super(request);
            this.project = request.project;
            this.configuration = request.configuration;
            this.description = request.description;
            this.displayName = request.displayName;
            this.name = request.name;
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
         * <p>The configuration details of the job.</p>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-oss-hdfs-job</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The unique identifier of the OSS data shipping job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>job-123456789-123456</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateOSSHDFSExportRequest build() {
            return new CreateOSSHDFSExportRequest(this);
        } 

    } 

}
