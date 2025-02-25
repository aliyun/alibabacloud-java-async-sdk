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
 * {@link UpdateAlertRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertRequest</p>
 */
public class UpdateAlertRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("alertName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private AlertConfiguration configuration;

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

    private UpdateAlertRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.alertName = builder.alertName;
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.schedule = builder.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlertRequest create() {
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
     * @return alertName
     */
    public String getAlertName() {
        return this.alertName;
    }

    /**
     * @return configuration
     */
    public AlertConfiguration getConfiguration() {
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

    public static final class Builder extends Request.Builder<UpdateAlertRequest, Builder> {
        private String project; 
        private String alertName; 
        private AlertConfiguration configuration; 
        private String description; 
        private String displayName; 
        private Schedule schedule; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlertRequest request) {
            super(request);
            this.project = request.project;
            this.alertName = request.alertName;
            this.configuration = request.configuration;
            this.description = request.description;
            this.displayName = request.displayName;
            this.schedule = request.schedule;
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
         * <p>The ID of the alert rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alert-0123456789-123456</p>
         */
        public Builder alertName(String alertName) {
            this.putPathParameter("alertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * <p>The detailed configurations of the alert rule.</p>
         * <p>This parameter is required.</p>
         */
        public Builder configuration(AlertConfiguration configuration) {
            this.putBodyParameter("configuration", configuration);
            this.configuration = configuration;
            return this;
        }

        /**
         * <p>The description of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>this is description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The display name of the alert rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>this is alert</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The scheduling settings of the alert rule.</p>
         * <p>This parameter is required.</p>
         */
        public Builder schedule(Schedule schedule) {
            this.putBodyParameter("schedule", schedule);
            this.schedule = schedule;
            return this;
        }

        @Override
        public UpdateAlertRequest build() {
            return new UpdateAlertRequest(this);
        } 

    } 

}
