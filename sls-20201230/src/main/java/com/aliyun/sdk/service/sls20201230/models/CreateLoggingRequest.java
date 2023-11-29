// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link CreateLoggingRequest} extends {@link RequestModel}
 *
 * <p>CreateLoggingRequest</p>
 */
public class CreateLoggingRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Body
    @NameInMap("loggingDetails")
    @Validation(required = true)
    private java.util.List < LoggingDetails> loggingDetails;

    @Body
    @NameInMap("loggingProject")
    @Validation(required = true)
    private String loggingProject;

    private CreateLoggingRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.loggingDetails = builder.loggingDetails;
        this.loggingProject = builder.loggingProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoggingRequest create() {
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
     * @return loggingDetails
     */
    public java.util.List < LoggingDetails> getLoggingDetails() {
        return this.loggingDetails;
    }

    /**
     * @return loggingProject
     */
    public String getLoggingProject() {
        return this.loggingProject;
    }

    public static final class Builder extends Request.Builder<CreateLoggingRequest, Builder> {
        private String project; 
        private java.util.List < LoggingDetails> loggingDetails; 
        private String loggingProject; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoggingRequest request) {
            super(request);
            this.project = request.project;
            this.loggingDetails = request.loggingDetails;
            this.loggingProject = request.loggingProject;
        } 

        /**
         * The name of the project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * The configurations of service logs.
         */
        public Builder loggingDetails(java.util.List < LoggingDetails> loggingDetails) {
            this.putBodyParameter("loggingDetails", loggingDetails);
            this.loggingDetails = loggingDetails;
            return this;
        }

        /**
         * The name of the project to which service logs are stored.
         */
        public Builder loggingProject(String loggingProject) {
            this.putBodyParameter("loggingProject", loggingProject);
            this.loggingProject = loggingProject;
            return this;
        }

        @Override
        public CreateLoggingRequest build() {
            return new CreateLoggingRequest(this);
        } 

    } 

    public static class LoggingDetails extends TeaModel {
        @NameInMap("logstore")
        @Validation(required = true)
        private String logstore;

        @NameInMap("type")
        @Validation(required = true)
        private String type;

        private LoggingDetails(Builder builder) {
            this.logstore = builder.logstore;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoggingDetails create() {
            return builder().build();
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String logstore; 
            private String type; 

            /**
             * The name of the Logstore to which service logs of the type are stored.
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * The type of service logs. Valid values:
             * <p>
             * 
             * *   consumergroup_log: the consumption delay logs of consumer groups.
             * *   logtail_alarm: the alert logs of Logtail.
             * *   operation_log: the operation logs.
             * *   logtail_profile: the collection logs of Logtail.
             * *   metering: the metering logs.
             * *   logtail_status: the status logs of Logtail.
             * *   scheduledsqlalert: the run logs of Scheduled SQL jobs.
             * *   etl_alert: the run logs of data transformation jobs.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public LoggingDetails build() {
                return new LoggingDetails(this);
            } 

        } 

    }
}
