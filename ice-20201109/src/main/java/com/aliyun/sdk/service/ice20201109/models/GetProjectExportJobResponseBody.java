// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetProjectExportJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectExportJobResponseBody</p>
 */
public class GetProjectExportJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProjectExportJob")
    private ProjectExportJob projectExportJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProjectExportJobResponseBody(Builder builder) {
        this.projectExportJob = builder.projectExportJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectExportJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return projectExportJob
     */
    public ProjectExportJob getProjectExportJob() {
        return this.projectExportJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ProjectExportJob projectExportJob; 
        private String requestId; 

        /**
         * ProjectExportJob.
         */
        public Builder projectExportJob(ProjectExportJob projectExportJob) {
            this.projectExportJob = projectExportJob;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProjectExportJobResponseBody build() {
            return new GetProjectExportJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProjectExportJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectExportJobResponseBody</p>
     */
    public static class ExportResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Timeline")
        private String timeline;

        private ExportResult(Builder builder) {
            this.timeline = builder.timeline;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExportResult create() {
            return builder().build();
        }

        /**
         * @return timeline
         */
        public String getTimeline() {
            return this.timeline;
        }

        public static final class Builder {
            private String timeline; 

            /**
             * Timeline.
             */
            public Builder timeline(String timeline) {
                this.timeline = timeline;
                return this;
            }

            public ExportResult build() {
                return new ExportResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectExportJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectExportJobResponseBody</p>
     */
    public static class ProjectExportJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ExportResult")
        private ExportResult exportResult;

        @com.aliyun.core.annotation.NameInMap("ExportType")
        private String exportType;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private ProjectExportJob(Builder builder) {
            this.code = builder.code;
            this.exportResult = builder.exportResult;
            this.exportType = builder.exportType;
            this.jobId = builder.jobId;
            this.message = builder.message;
            this.projectId = builder.projectId;
            this.status = builder.status;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectExportJob create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return exportResult
         */
        public ExportResult getExportResult() {
            return this.exportResult;
        }

        /**
         * @return exportType
         */
        public String getExportType() {
            return this.exportType;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String code; 
            private ExportResult exportResult; 
            private String exportType; 
            private String jobId; 
            private String message; 
            private String projectId; 
            private String status; 
            private String userData; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ExportResult.
             */
            public Builder exportResult(ExportResult exportResult) {
                this.exportResult = exportResult;
                return this;
            }

            /**
             * ExportType.
             */
            public Builder exportType(String exportType) {
                this.exportType = exportType;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public ProjectExportJob build() {
                return new ProjectExportJob(this);
            } 

        } 

    }
}
