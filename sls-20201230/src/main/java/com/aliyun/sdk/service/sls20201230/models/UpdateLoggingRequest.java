// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateLoggingRequest} extends {@link RequestModel}
 *
 * <p>UpdateLoggingRequest</p>
 */
public class UpdateLoggingRequest extends Request {
    @Body
    @NameInMap("loggingDetails")
    @Validation(required = true)
    private java.util.List < LoggingDetails> loggingDetails;

    @Body
    @NameInMap("loggingProject")
    @Validation(required = true)
    private String loggingProject;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private UpdateLoggingRequest(Builder builder) {
        super(builder);
        this.loggingDetails = builder.loggingDetails;
        this.loggingProject = builder.loggingProject;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLoggingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<UpdateLoggingRequest, Builder> {
        private java.util.List < LoggingDetails> loggingDetails; 
        private String loggingProject; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLoggingRequest request) {
            super(request);
            this.loggingDetails = request.loggingDetails;
            this.loggingProject = request.loggingProject;
            this.project = request.project;
        } 

        /**
         * ???????????????????????????
         */
        public Builder loggingDetails(java.util.List < LoggingDetails> loggingDetails) {
            this.putBodyParameter("loggingDetails", loggingDetails);
            this.loggingDetails = loggingDetails;
            return this;
        }

        /**
         * ??????????????????????????? project ?????????
         */
        public Builder loggingProject(String loggingProject) {
            this.putBodyParameter("loggingProject", loggingProject);
            this.loggingProject = loggingProject;
            return this;
        }

        /**
         * Project ?????????
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public UpdateLoggingRequest build() {
            return new UpdateLoggingRequest(this);
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
             * ???????????????????????????????????? logstore ?????????
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * ?????????????????????????????? "consumergroup_log"??? "logtail_alarm"???"operation_log"???"logtail_profile"???"metering"???"logtail_status"???"scheduled_sql_alert"??? "etl_alert" ??????
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
