// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaProducingJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaProducingJobResponseBody</p>
 */
public class GetMediaProducingJobResponseBody extends TeaModel {
    @NameInMap("MediaProducingJob")
    private MediaProducingJob mediaProducingJob;

    @NameInMap("RequestId")
    private String requestId;

    private GetMediaProducingJobResponseBody(Builder builder) {
        this.mediaProducingJob = builder.mediaProducingJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaProducingJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaProducingJob
     */
    public MediaProducingJob getMediaProducingJob() {
        return this.mediaProducingJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaProducingJob mediaProducingJob; 
        private String requestId; 

        /**
         * MediaProducingJob.
         */
        public Builder mediaProducingJob(MediaProducingJob mediaProducingJob) {
            this.mediaProducingJob = mediaProducingJob;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMediaProducingJobResponseBody build() {
            return new GetMediaProducingJobResponseBody(this);
        } 

    } 

    public static class MediaProducingJob extends TeaModel {
        @NameInMap("ClipsParam")
        private String clipsParam;

        @NameInMap("Code")
        private String code;

        @NameInMap("CompleteTime")
        private String completeTime;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Duration")
        private Float duration;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("MediaURL")
        private String mediaURL;

        @NameInMap("Message")
        private String message;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("Timeline")
        private String timeline;

        @NameInMap("VodMediaId")
        private String vodMediaId;

        private MediaProducingJob(Builder builder) {
            this.clipsParam = builder.clipsParam;
            this.code = builder.code;
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.duration = builder.duration;
            this.jobId = builder.jobId;
            this.mediaId = builder.mediaId;
            this.mediaURL = builder.mediaURL;
            this.message = builder.message;
            this.modifiedTime = builder.modifiedTime;
            this.projectId = builder.projectId;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.timeline = builder.timeline;
            this.vodMediaId = builder.vodMediaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaProducingJob create() {
            return builder().build();
        }

        /**
         * @return clipsParam
         */
        public String getClipsParam() {
            return this.clipsParam;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaURL
         */
        public String getMediaURL() {
            return this.mediaURL;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
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
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return timeline
         */
        public String getTimeline() {
            return this.timeline;
        }

        /**
         * @return vodMediaId
         */
        public String getVodMediaId() {
            return this.vodMediaId;
        }

        public static final class Builder {
            private String clipsParam; 
            private String code; 
            private String completeTime; 
            private String createTime; 
            private Float duration; 
            private String jobId; 
            private String mediaId; 
            private String mediaURL; 
            private String message; 
            private String modifiedTime; 
            private String projectId; 
            private String status; 
            private String templateId; 
            private String timeline; 
            private String vodMediaId; 

            /**
             * ClipsParam.
             */
            public Builder clipsParam(String clipsParam) {
                this.clipsParam = clipsParam;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CompleteTime.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
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
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * MediaURL.
             */
            public Builder mediaURL(String mediaURL) {
                this.mediaURL = mediaURL;
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
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
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
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * Timeline.
             */
            public Builder timeline(String timeline) {
                this.timeline = timeline;
                return this;
            }

            /**
             * VodMediaId.
             */
            public Builder vodMediaId(String vodMediaId) {
                this.vodMediaId = vodMediaId;
                return this;
            }

            public MediaProducingJob build() {
                return new MediaProducingJob(this);
            } 

        } 

    }
}
