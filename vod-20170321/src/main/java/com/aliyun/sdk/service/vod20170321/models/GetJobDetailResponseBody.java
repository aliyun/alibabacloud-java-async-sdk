// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
         * AIJobDetail.
         */
        public Builder AIJobDetail(AIJobDetail AIJobDetail) {
            this.AIJobDetail = AIJobDetail;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SnapshotJobDetail.
         */
        public Builder snapshotJobDetail(SnapshotJobDetail snapshotJobDetail) {
            this.snapshotJobDetail = snapshotJobDetail;
            return this;
        }

        /**
         * TranscodeJobDetail.
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
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TemplateConfig.
             */
            public Builder templateConfig(String templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * Trigger.
             */
            public Builder trigger(String trigger) {
                this.trigger = trigger;
                return this;
            }

            /**
             * UserId.
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
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * NormalConfig.
             */
            public Builder normalConfig(String normalConfig) {
                this.normalConfig = normalConfig;
                return this;
            }

            /**
             * SpriteConfig.
             */
            public Builder spriteConfig(String spriteConfig) {
                this.spriteConfig = spriteConfig;
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
             * Trigger.
             */
            public Builder trigger(String trigger) {
                this.trigger = trigger;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * VideoId.
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
             * Definition.
             */
            public Builder definition(String definition) {
                this.definition = definition;
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
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * VideoId.
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
