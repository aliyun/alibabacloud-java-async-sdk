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
 * {@link UpdateScheduledSQLRequest} extends {@link RequestModel}
 *
 * <p>UpdateScheduledSQLRequest</p>
 */
public class UpdateScheduledSQLRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("scheduledSQLName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduledSQLName;

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
    @com.aliyun.core.annotation.NameInMap("schedule")
    @com.aliyun.core.annotation.Validation(required = true)
    private Schedule schedule;

    private UpdateScheduledSQLRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.scheduledSQLName = builder.scheduledSQLName;
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.schedule = builder.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateScheduledSQLRequest create() {
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
     * @return scheduledSQLName
     */
    public String getScheduledSQLName() {
        return this.scheduledSQLName;
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
     * @return schedule
     */
    public Schedule getSchedule() {
        return this.schedule;
    }

    public static final class Builder extends Request.Builder<UpdateScheduledSQLRequest, Builder> {
        private String project; 
        private String scheduledSQLName; 
        private ScheduledSQLConfiguration configuration; 
        private String description; 
        private String displayName; 
        private Schedule schedule; 

        private Builder() {
            super();
        } 

        private Builder(UpdateScheduledSQLRequest request) {
            super(request);
            this.project = request.project;
            this.scheduledSQLName = request.scheduledSQLName;
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
         * <p>sql-123456789-123456</p>
         */
        public Builder scheduledSQLName(String scheduledSQLName) {
            this.putPathParameter("scheduledSQLName", scheduledSQLName);
            this.scheduledSQLName = scheduledSQLName;
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
         */
        public Builder schedule(Schedule schedule) {
            this.putBodyParameter("schedule", schedule);
            this.schedule = schedule;
            return this;
        }

        @Override
        public UpdateScheduledSQLRequest build() {
            return new UpdateScheduledSQLRequest(this);
        } 

    } 

}
