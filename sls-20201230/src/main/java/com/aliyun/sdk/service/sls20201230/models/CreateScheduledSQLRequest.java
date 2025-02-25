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
 * {@link CreateScheduledSQLRequest} extends {@link RequestModel}
 *
 * <p>CreateScheduledSQLRequest</p>
 */
public class CreateScheduledSQLRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private ScheduledSQLConfiguration configuration;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private Schedule schedule;

    private CreateScheduledSQLRequest(Builder builder) {
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

    public static CreateScheduledSQLRequest create() {
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
    public ScheduledSQLConfiguration getConfiguration() {
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

    public static final class Builder extends Request.Builder<CreateScheduledSQLRequest, Builder> {
        private String project; 
        private ScheduledSQLConfiguration configuration; 
        private String description; 
        private String displayName; 
        private String name; 
        private Schedule schedule; 

        private Builder() {
            super();
        } 

        private Builder(CreateScheduledSQLRequest request) {
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
         * <p>This parameter is required.</p>
         */
        public Builder configuration(ScheduledSQLConfiguration configuration) {
            this.putBodyParameter("configuration", configuration);
            this.configuration = configuration;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-scheduled-sql</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sql-123456789-123456</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder schedule(Schedule schedule) {
            this.putBodyParameter("schedule", schedule);
            this.schedule = schedule;
            return this;
        }

        @Override
        public CreateScheduledSQLRequest build() {
            return new CreateScheduledSQLRequest(this);
        } 

    } 

}
