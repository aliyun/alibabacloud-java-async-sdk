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
 * {@link UpdateLoggingRequest} extends {@link RequestModel}
 *
 * <p>UpdateLoggingRequest</p>
 */
public class UpdateLoggingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("loggingDetails")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<LoggingDetails> loggingDetails;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("loggingProject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loggingProject;

    private UpdateLoggingRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.loggingDetails = builder.loggingDetails;
        this.loggingProject = builder.loggingProject;
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
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return loggingDetails
     */
    public java.util.List<LoggingDetails> getLoggingDetails() {
        return this.loggingDetails;
    }

    /**
     * @return loggingProject
     */
    public String getLoggingProject() {
        return this.loggingProject;
    }

    public static final class Builder extends Request.Builder<UpdateLoggingRequest, Builder> {
        private String project; 
        private java.util.List<LoggingDetails> loggingDetails; 
        private String loggingProject; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLoggingRequest request) {
            super(request);
            this.project = request.project;
            this.loggingDetails = request.loggingDetails;
            this.loggingProject = request.loggingProject;
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
         * <p>The configurations of service logs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder loggingDetails(java.util.List<LoggingDetails> loggingDetails) {
            this.putBodyParameter("loggingDetails", loggingDetails);
            this.loggingDetails = loggingDetails;
            return this;
        }

        /**
         * <p>The name of the project to which you want to save service logs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-project</p>
         */
        public Builder loggingProject(String loggingProject) {
            this.putBodyParameter("loggingProject", loggingProject);
            this.loggingProject = loggingProject;
            return this;
        }

        @Override
        public UpdateLoggingRequest build() {
            return new UpdateLoggingRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLoggingRequest} extends {@link TeaModel}
     *
     * <p>UpdateLoggingRequest</p>
     */
    public static class LoggingDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("logstore")
        @com.aliyun.core.annotation.Validation(required = true)
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The name of the Logstore to which you want to save service logs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my-logstore</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The type of service logs. Valid values:</p>
             * <ul>
             * <li>consumergroup_log: the consumption delay logs of consumer groups.</li>
             * <li>logtail_alarm: the alert logs of Logtail.</li>
             * <li>operation_log: the operation logs.</li>
             * <li>logtail_profile: the collection logs of Logtail.</li>
             * <li>metering: the metering logs.</li>
             * <li>logtail_status: the status logs of Logtail.</li>
             * <li>scheduledsqlalert: the operational logs of Scheduled SQL jobs.</li>
             * <li>etl_alert: the operational logs of data transformation jobs.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>consumergroup_log</p>
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
