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
 * {@link UpdateOSSIngestionRequest} extends {@link RequestModel}
 *
 * <p>UpdateOSSIngestionRequest</p>
 */
public class UpdateOSSIngestionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ossIngestionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossIngestionName;

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
    @com.aliyun.core.annotation.NameInMap("schedule")
    private Schedule schedule;

    private UpdateOSSIngestionRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.ossIngestionName = builder.ossIngestionName;
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.schedule = builder.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOSSIngestionRequest create() {
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
     * @return ossIngestionName
     */
    public String getOssIngestionName() {
        return this.ossIngestionName;
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
     * @return schedule
     */
    public Schedule getSchedule() {
        return this.schedule;
    }

    public static final class Builder extends Request.Builder<UpdateOSSIngestionRequest, Builder> {
        private String project; 
        private String ossIngestionName; 
        private OSSIngestionConfiguration configuration; 
        private String description; 
        private String displayName; 
        private Schedule schedule; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOSSIngestionRequest request) {
            super(request);
            this.project = request.project;
            this.ossIngestionName = request.ossIngestionName;
            this.configuration = request.configuration;
            this.description = request.description;
            this.displayName = request.displayName;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ingest-oss-123455</p>
         */
        public Builder ossIngestionName(String ossIngestionName) {
            this.putPathParameter("ossIngestionName", ossIngestionName);
            this.ossIngestionName = ossIngestionName;
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
         * <p>The description of the OSS data import job.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The display name of the OSS data import job.</p>
         * <p>This parameter is required.</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
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
        public UpdateOSSIngestionRequest build() {
            return new UpdateOSSIngestionRequest(this);
        } 

    } 

}
