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
 * {@link GetMediaProducingJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaProducingJobResponseBody</p>
 */
public class GetMediaProducingJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaProducingJob")
    private MediaProducingJob mediaProducingJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the online editing project.</p>
         */
        public Builder mediaProducingJob(MediaProducingJob mediaProducingJob) {
            this.mediaProducingJob = mediaProducingJob;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>83B7-7F87-4792-BFE9-63CD2137</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMediaProducingJobResponseBody build() {
            return new GetMediaProducingJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMediaProducingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaProducingJobResponseBody</p>
     */
    public static class MediaProducingJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClipsParam")
        private String clipsParam;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaURL")
        private String mediaURL;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubJobMaterials")
        private String subJobMaterials;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("Timeline")
        private String timeline;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("VodMediaId")
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
            this.progress = builder.progress;
            this.projectId = builder.projectId;
            this.status = builder.status;
            this.subJobMaterials = builder.subJobMaterials;
            this.templateId = builder.templateId;
            this.timeline = builder.timeline;
            this.userData = builder.userData;
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
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
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
         * @return subJobMaterials
         */
        public String getSubJobMaterials() {
            return this.subJobMaterials;
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
         * @return userData
         */
        public String getUserData() {
            return this.userData;
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
            private Integer progress; 
            private String projectId; 
            private String status; 
            private String subJobMaterials; 
            private String templateId; 
            private String timeline; 
            private String userData; 
            private String vodMediaId; 

            /**
             * <p>The template parameters of the media editing and production job.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;VideoArray&quot;:[&quot;<strong><strong>05512043f49f697f7425</strong></strong>&quot;,&quot;<strong><strong>05512043f49f697f7425</strong></strong>&quot;,&quot;<strong><strong>05512043f49f697f7425</strong></strong>&quot;]}</p>
             */
            public Builder clipsParam(String clipsParam) {
                this.clipsParam = clipsParam;
                return this;
            }

            /**
             * <p>The response code</p>
             * <p>Note: Pay attention to this parameter if the job failed.</p>
             * 
             * <strong>example:</strong>
             * <p>ExceededMaximumValue</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The time when the media editing and production job was complete.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-23T13:33:52Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the media editing and production job was created.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-23T13:33:40Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The duration of the output file.</p>
             * <p>Note: This parameter has a value if the job is successful and the output file is an audio or video file.</p>
             * 
             * <strong>example:</strong>
             * <p>30.500000</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The ID of the media editing and production job.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The media asset ID of the output file.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>0cc6ba49eab379332c5b</strong></strong></p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The URL of the output file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example2.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example2.mp4</a></p>
             */
            public Builder mediaURL(String mediaURL) {
                this.mediaURL = mediaURL;
                return this;
            }

            /**
             * <p>The returned message.</p>
             * <p>Note: Pay attention to this parameter if the job failed.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified &quot;Width_Height&quot; has exceeded maximum value.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The time when the media editing and production job was last modified.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-23T13:33:49Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The ID of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The state of the media editing and production job. Valid values:</p>
             * <p>Init</p>
             * <p>Queuing</p>
             * <p>Processing</p>
             * <p>Success</p>
             * <p>Failed</p>
             * 
             * <strong>example:</strong>
             * <p>Failed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The materials of the media editing and production job if the job is a subjob of a quick video production job, including the broadcast text and title.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Title&quot;: &quot;Title&quot;, &quot;SpeechText&quot;: &quot;Broadcast text of a quick video production job&quot;}</p>
             */
            public Builder subJobMaterials(String subJobMaterials) {
                this.subJobMaterials = subJobMaterials;
                return this;
            }

            /**
             * <p>The ID of the template used by the media editing and production job.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>6e76134d739cc3e85d3e</strong></strong></p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The timeline of the media editing and production job.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;}]}]}</p>
             */
            public Builder timeline(String timeline) {
                this.timeline = timeline;
                return this;
            }

            /**
             * <p>The user-defined data in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22,%22Key%22:%22Valuexxx%22%7D">http://xx.xx.xxx&quot;,&quot;Key&quot;:&quot;Valuexxx&quot;}</a></p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>The media asset ID of the output file in ApsaraVideo VOD if the output file is stored in ApsaraVideo VOD.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>332c5b0cc6ba49eab379</strong></strong></p>
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
