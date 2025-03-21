// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobDetailResponseBody</p>
 */
public class GetJobDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIJobDetail")
    private AIJobDetail AIJobDetail;

    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotJobDetail")
    private SnapshotJobDetail snapshotJobDetail;

    @com.aliyun.core.annotation.NameInMap("TranscodeJobDetail")
    private TranscodeJobDetail transcodeJobDetail;

    private GetJobDetailResponseBody(Builder builder) {
        this.AIJobDetail = builder.AIJobDetail;
        this.jobType = builder.jobType;
        this.requestId = builder.requestId;
        this.snapshotJobDetail = builder.snapshotJobDetail;
        this.transcodeJobDetail = builder.transcodeJobDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return AIJobDetail
     */
    public AIJobDetail getAIJobDetail() {
        return this.AIJobDetail;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotJobDetail
     */
    public SnapshotJobDetail getSnapshotJobDetail() {
        return this.snapshotJobDetail;
    }

    /**
     * @return transcodeJobDetail
     */
    public TranscodeJobDetail getTranscodeJobDetail() {
        return this.transcodeJobDetail;
    }

    public static final class Builder {
        private AIJobDetail AIJobDetail; 
        private String jobType; 
        private String requestId; 
        private SnapshotJobDetail snapshotJobDetail; 
        private TranscodeJobDetail transcodeJobDetail; 

        /**
         * <p>The details of the AI task. This parameter takes effect only when the TaskType parameter is set to AI.</p>
         */
        public Builder AIJobDetail(AIJobDetail AIJobDetail) {
            this.AIJobDetail = AIJobDetail;
            return this;
        }

        /**
         * <p>The type of the task. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>transcode</p>
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6708D849-F109-1A6C-AC91-************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the snapshot task. This parameter takes effect only when the jobType parameter is set to Snapshot.</p>
         */
        public Builder snapshotJobDetail(SnapshotJobDetail snapshotJobDetail) {
            this.snapshotJobDetail = snapshotJobDetail;
            return this;
        }

        /**
         * <p>The details of the transcoding task. This parameter takes effect only when the jobType parameter is set to Transcode.</p>
         */
        public Builder transcodeJobDetail(TranscodeJobDetail transcodeJobDetail) {
            this.transcodeJobDetail = transcodeJobDetail;
            return this;
        }

        public GetJobDetailResponseBody build() {
            return new GetJobDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobDetailResponseBody</p>
     */
    public static class AIJobDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateConfig")
        private String templateConfig;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        private String trigger;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private AIJobDetail(Builder builder) {
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.mediaId = builder.mediaId;
            this.status = builder.status;
            this.templateConfig = builder.templateConfig;
            this.trigger = builder.trigger;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIJobDetail create() {
            return builder().build();
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
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateConfig
         */
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        /**
         * @return trigger
         */
        public String getTrigger() {
            return this.trigger;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String completeTime; 
            private String createTime; 
            private String jobId; 
            private String jobType; 
            private String mediaId; 
            private String status; 
            private String templateConfig; 
            private String trigger; 
            private Long userId; 

            /**
             * <p>The end time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-14T07:39:46Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the task was created. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-14T07:39:25Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>5c9dff751ba**********59d50a967f5</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The type of the AI task.</p>
             * 
             * <strong>example:</strong>
             * <p>AIVideoCensor</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>30e5d7**********bd900764de7c0102</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li>reserved</li>
             * <li>init</li>
             * <li>success</li>
             * <li>fail</li>
             * <li>processing</li>
             * <li>analysing</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The template configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;AuditRange&quot;:[&quot;video&quot;,&quot;image-cover&quot;,&quot;text-title&quot;],&quot;AuditContent&quot;:[&quot;screen&quot;],&quot;AuditItem&quot;:[&quot;terrorism&quot;,&quot;porn&quot;],&quot;AuditAutoBlock&quot;:&quot;no&quot;}</p>
             */
            public Builder templateConfig(String templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * <p>The trigger mode. Valid values:</p>
             * <ul>
             * <li>Auto</li>
             * <li>Manual</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Auto</p>
             */
            public Builder trigger(String trigger) {
                this.trigger = trigger;
                return this;
            }

            /**
             * <p>The ID of the user who submitted the task.</p>
             * 
             * <strong>example:</strong>
             * <p>139109*****84930</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public AIJobDetail build() {
                return new AIJobDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobDetailResponseBody</p>
     */
    public static class SnapshotJobDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("NormalConfig")
        private String normalConfig;

        @com.aliyun.core.annotation.NameInMap("SpriteConfig")
        private String spriteConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        private String trigger;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("VideoId")
        private String videoId;

        private SnapshotJobDetail(Builder builder) {
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.jobId = builder.jobId;
            this.normalConfig = builder.normalConfig;
            this.spriteConfig = builder.spriteConfig;
            this.status = builder.status;
            this.trigger = builder.trigger;
            this.userId = builder.userId;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotJobDetail create() {
            return builder().build();
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
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return normalConfig
         */
        public String getNormalConfig() {
            return this.normalConfig;
        }

        /**
         * @return spriteConfig
         */
        public String getSpriteConfig() {
            return this.spriteConfig;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return trigger
         */
        public String getTrigger() {
            return this.trigger;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        public static final class Builder {
            private String completeTime; 
            private String createTime; 
            private String jobId; 
            private String normalConfig; 
            private String spriteConfig; 
            private String status; 
            private String trigger; 
            private Long userId; 
            private String videoId; 

            /**
             * <p>The time when the task was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-14T07:39:45Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the task was created. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-14T07:39:25Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>63df12s0**********4hdq249t82kr91</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>Configuration of normal snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;inl&quot;:0,&quot;num&quot;:32,&quot;tm&quot;:5,&quot;wd&quot;:&quot;352&quot;,&quot;ft&quot;:&quot;normal&quot;,&quot;hg&quot;:&quot;640&quot;}</p>
             */
            public Builder normalConfig(String normalConfig) {
                this.normalConfig = normalConfig;
                return this;
            }

            /**
             * <p>The sprite configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;pad&quot;:&quot;0&quot;,&quot;lines&quot;:&quot;10&quot;,&quot;mgin&quot;:&quot;0&quot;,&quot;cols&quot;:&quot;10&quot;,&quot;ikcp&quot;:&quot;false&quot;,&quot;hg&quot;:&quot;68&quot;}</p>
             */
            public Builder spriteConfig(String spriteConfig) {
                this.spriteConfig = spriteConfig;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li>Processing</li>
             * <li>Fail</li>
             * <li>Success</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The trigger mode. Valid values:</p>
             * <ul>
             * <li>Auto</li>
             * <li>Manual</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Auto</p>
             */
            public Builder trigger(String trigger) {
                this.trigger = trigger;
                return this;
            }

            /**
             * <p>The ID of the user who submitted the task.</p>
             * 
             * <strong>example:</strong>
             * <p>139109*****84930</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>30e5d7**********bd900764de7c0102</p>
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public SnapshotJobDetail build() {
                return new SnapshotJobDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobDetailResponseBody</p>
     */
    public static class TranscodeJobDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Definition")
        private String definition;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("VideoId")
        private String videoId;

        private TranscodeJobDetail(Builder builder) {
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.definition = builder.definition;
            this.jobId = builder.jobId;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.userId = builder.userId;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeJobDetail create() {
            return builder().build();
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
         * @return definition
         */
        public String getDefinition() {
            return this.definition;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
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
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        public static final class Builder {
            private String completeTime; 
            private String createTime; 
            private String definition; 
            private String jobId; 
            private String status; 
            private String templateId; 
            private Long userId; 
            private String videoId; 

            /**
             * <p>The time when the task was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-14T07:39:34Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the task was created. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-14T07:39:25Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The definition.</p>
             * 
             * <strong>example:</strong>
             * <p>HD</p>
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2dc1634e**********3f1d22d1a0174e</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li>Submitted</li>
             * <li>Transcoding</li>
             * <li>TranscodeSuccess</li>
             * <li>TranscodeFail</li>
             * <li>TranscodeCancelled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TranscodeSuccess</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>dbfaaec9e**********bf0b81219244c</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The ID of the user who submitted the task.</p>
             * 
             * <strong>example:</strong>
             * <p>139109*****84930</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>30e5d7**********bd900764de7c0102</p>
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public TranscodeJobDetail build() {
                return new TranscodeJobDetail(this);
            } 

        } 

    }
}
