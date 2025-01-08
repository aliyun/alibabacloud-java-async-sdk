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
 * {@link CreateOSSIngestionRequest} extends {@link RequestModel}
 *
 * <p>CreateOSSIngestionRequest</p>
 */
public class CreateOSSIngestionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private OSSIngestionConfiguration configuration;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("schedule")
    private Schedule schedule;

    private CreateOSSIngestionRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.name = builder.name;
        this.schedule = builder.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOSSIngestionRequest create() {
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
    public OSSIngestionConfiguration getConfiguration() {
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

    /**
     * @return schedule
     */
    public Schedule getSchedule() {
        return this.schedule;
    }

    public static final class Builder extends Request.Builder<CreateOSSIngestionRequest, Builder> {
        private String project; 
        private OSSIngestionConfiguration configuration; 
        private String description; 
        private String displayName; 
        private String name; 
        private Schedule schedule; 

        private Builder() {
            super();
        } 

        private Builder(CreateOSSIngestionRequest request) {
            super(request);
            this.project = request.project;
            this.configuration = request.configuration;
            this.description = request.description;
            this.displayName = request.displayName;
            this.name = request.name;
            this.schedule = request.schedule;
        } 

        /**
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
         * <p>The configurations of the OSS data import job.</p>
         * <p>This parameter is required.</p>
         */
        public Builder configuration(OSSIngestionConfiguration configuration) {
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
         * <p>The display name.</p>
         * <p>This parameter is required.</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The name of the OSS data import job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ingest-oss-123456</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The scheduling type. By default, you do not need to specify this parameter. If you want to import data at regular intervals, such as importing data every Monday at 08: 00., you can specify a cron expression.</p>
         */
        public Builder schedule(Schedule schedule) {
            this.putBodyParameter("schedule", schedule);
            this.schedule = schedule;
            return this;
        }

        @Override
        public CreateOSSIngestionRequest build() {
            return new CreateOSSIngestionRequest(this);
        } 

    } 

}
