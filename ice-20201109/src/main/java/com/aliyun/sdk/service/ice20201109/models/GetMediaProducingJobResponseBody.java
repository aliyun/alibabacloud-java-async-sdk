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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetMediaProducingJobResponseBody model) {
            this.mediaProducingJob = model.mediaProducingJob;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The cloud editing project information.</p>
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

            private Builder() {
            } 

            private Builder(MediaProducingJob model) {
                this.clipsParam = model.clipsParam;
                this.code = model.code;
                this.completeTime = model.completeTime;
                this.createTime = model.createTime;
                this.duration = model.duration;
                this.jobId = model.jobId;
                this.mediaId = model.mediaId;
                this.mediaURL = model.mediaURL;
                this.message = model.message;
                this.modifiedTime = model.modifiedTime;
                this.progress = model.progress;
                this.projectId = model.projectId;
                this.status = model.status;
                this.subJobMaterials = model.subJobMaterials;
                this.templateId = model.templateId;
                this.timeline = model.timeline;
                this.userData = model.userData;
                this.vodMediaId = model.vodMediaId;
            } 

            /**
             * <p>The template parameters corresponding to the video editing and producing job.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;VideoArray&quot;:[&quot;<strong><strong>05512043f49f697f7425</strong></strong>&quot;,&quot;<strong><strong>05512043f49f697f7425</strong></strong>&quot;,&quot;<strong><strong>05512043f49f697f7425</strong></strong>&quot;]}</p>
             */
            public Builder clipsParam(String clipsParam) {
                this.clipsParam = clipsParam;
                return this;
            }

            /**
             * <p>The error code of the video editing and producing job.</p>
             * <blockquote>
             * <p>Notice: Pay attention to this field when the job fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ExceededMaximumValue</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The time when the video editing and producing job was completed. The time is displayed in UTC.</p>
             * <p>Format: &quot;YYYY-MM-DD\&quot;T\&quot;hh:mm:ss\&quot;Z\&quot;&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-23T13:33:52Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the video editing and producing job was created. The time is displayed in UTC.</p>
             * <p>Format: &quot;YYYY-MM-DD\&quot;T\&quot;hh:mm:ss\&quot;Z\&quot;&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-23T13:33:40Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The duration of the produced media.</p>
             * <blockquote>
             * <p>Notice: This field has a value only when the producing task is successful and the output type is audio or video.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>30.500000</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The ID of the video editing and producing job.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The resource ID of the produced media.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>0cc6ba49eab379332c5b</strong></strong></p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The URL of the resource file for the produced media.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example2.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example2.mp4</a></p>
             */
            public Builder mediaURL(String mediaURL) {
                this.mediaURL = mediaURL;
                return this;
            }

            /**
             * <p>The error message of the video editing and producing job.</p>
             * <blockquote>
             * <p>Notice: Pay attention to this field when the job fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>The specified &quot;Width_Height&quot; has exceeded maximum value.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The time when the video editing and producing job was modified. The time is displayed in UTC.</p>
             * <p>Format: &quot;YYYY-MM-DD\&quot;T\&quot;hh:mm:ss\&quot;Z\&quot;&quot;.</p>
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
             * <p>The ID of the cloud editing project.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The status of the video editing and producing job. Valid values:</p>
             * <ul>
             * <li>Init: initial state</li>
             * <li>Queuing: queuing</li>
             * <li>Processing: processing</li>
             * <li>Success: successful</li>
             * <li>Failed: failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Failed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The material information used by the subtask, such as the voiceover script and title. This field is returned when the editing task is a subtask of a batch intelligent one-click video producing task.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Title&quot;: &quot;title&quot;, &quot;SpeechText&quot;: &quot;Batch intelligent one-click into a piece of oral copy&quot;}</p>
             */
            public Builder subJobMaterials(String subJobMaterials) {
                this.subJobMaterials = subJobMaterials;
                return this;
            }

            /**
             * <p>The ID of the template corresponding to the video editing and producing job.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>6e76134d739cc3e85d3e</strong></strong></p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The timeline corresponding to the video editing and producing job.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;}]}]}</p>
             */
            public Builder timeline(String timeline) {
                this.timeline = timeline;
                return this;
            }

            /**
             * <p>The custom user settings in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22,%22Key%22:%22Valuexxx%22%7D">http://xx.xx.xxx&quot;,&quot;Key&quot;:&quot;Valuexxx&quot;}</a></p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>The ID of the media asset in ApsaraVideo VOD. If the produced media of the editing task is output to ApsaraVideo VOD, the produced media is registered as a media asset in ApsaraVideo VOD, and this field indicates the ID of the media asset.</p>
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
