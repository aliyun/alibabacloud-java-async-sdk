// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link GetYikeProjectExportJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetYikeProjectExportJobResponseBody</p>
 */
public class GetYikeProjectExportJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProjectExportJob")
    private ProjectExportJob projectExportJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetYikeProjectExportJobResponseBody(Builder builder) {
        this.projectExportJob = builder.projectExportJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetYikeProjectExportJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetYikeProjectExportJobResponseBody model) {
            this.projectExportJob = model.projectExportJob;
            this.requestId = model.requestId;
        } 

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

        public GetYikeProjectExportJobResponseBody build() {
            return new GetYikeProjectExportJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetYikeProjectExportJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikeProjectExportJobResponseBody</p>
     */
    public static class SrtList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SrtUrl")
        private String srtUrl;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private SrtList(Builder builder) {
            this.srtUrl = builder.srtUrl;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SrtList create() {
            return builder().build();
        }

        /**
         * @return srtUrl
         */
        public String getSrtUrl() {
            return this.srtUrl;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String srtUrl; 
            private String tag; 

            private Builder() {
            } 

            private Builder(SrtList model) {
                this.srtUrl = model.srtUrl;
                this.tag = model.tag;
            } 

            /**
             * SrtUrl.
             */
            public Builder srtUrl(String srtUrl) {
                this.srtUrl = srtUrl;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public SrtList build() {
                return new SrtList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetYikeProjectExportJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikeProjectExportJobResponseBody</p>
     */
    public static class ExportResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioUrl")
        private String audioUrl;

        @com.aliyun.core.annotation.NameInMap("ProjectUrl")
        private String projectUrl;

        @com.aliyun.core.annotation.NameInMap("SrtList")
        private java.util.List<SrtList> srtList;

        @com.aliyun.core.annotation.NameInMap("Timeline")
        private String timeline;

        private ExportResult(Builder builder) {
            this.audioUrl = builder.audioUrl;
            this.projectUrl = builder.projectUrl;
            this.srtList = builder.srtList;
            this.timeline = builder.timeline;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExportResult create() {
            return builder().build();
        }

        /**
         * @return audioUrl
         */
        public String getAudioUrl() {
            return this.audioUrl;
        }

        /**
         * @return projectUrl
         */
        public String getProjectUrl() {
            return this.projectUrl;
        }

        /**
         * @return srtList
         */
        public java.util.List<SrtList> getSrtList() {
            return this.srtList;
        }

        /**
         * @return timeline
         */
        public String getTimeline() {
            return this.timeline;
        }

        public static final class Builder {
            private String audioUrl; 
            private String projectUrl; 
            private java.util.List<SrtList> srtList; 
            private String timeline; 

            private Builder() {
            } 

            private Builder(ExportResult model) {
                this.audioUrl = model.audioUrl;
                this.projectUrl = model.projectUrl;
                this.srtList = model.srtList;
                this.timeline = model.timeline;
            } 

            /**
             * AudioUrl.
             */
            public Builder audioUrl(String audioUrl) {
                this.audioUrl = audioUrl;
                return this;
            }

            /**
             * ProjectUrl.
             */
            public Builder projectUrl(String projectUrl) {
                this.projectUrl = projectUrl;
                return this;
            }

            /**
             * SrtList.
             */
            public Builder srtList(java.util.List<SrtList> srtList) {
                this.srtList = srtList;
                return this;
            }

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
     * {@link GetYikeProjectExportJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikeProjectExportJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ProjectExportJob model) {
                this.code = model.code;
                this.exportResult = model.exportResult;
                this.exportType = model.exportType;
                this.jobId = model.jobId;
                this.message = model.message;
                this.projectId = model.projectId;
                this.status = model.status;
                this.userData = model.userData;
            } 

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
