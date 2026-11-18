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

    @com.aliyun.core.annotation.NameInMap("WorkflowTaskDetail")
    private WorkflowTaskDetail workflowTaskDetail;

    private GetJobDetailResponseBody(Builder builder) {
        this.AIJobDetail = builder.AIJobDetail;
        this.jobType = builder.jobType;
        this.requestId = builder.requestId;
        this.snapshotJobDetail = builder.snapshotJobDetail;
        this.transcodeJobDetail = builder.transcodeJobDetail;
        this.workflowTaskDetail = builder.workflowTaskDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return workflowTaskDetail
     */
    public WorkflowTaskDetail getWorkflowTaskDetail() {
        return this.workflowTaskDetail;
    }

    public static final class Builder {
        private AIJobDetail AIJobDetail; 
        private String jobType; 
        private String requestId; 
        private SnapshotJobDetail snapshotJobDetail; 
        private TranscodeJobDetail transcodeJobDetail; 
        private WorkflowTaskDetail workflowTaskDetail; 

        private Builder() {
        } 

        private Builder(GetJobDetailResponseBody model) {
            this.AIJobDetail = model.AIJobDetail;
            this.jobType = model.jobType;
            this.requestId = model.requestId;
            this.snapshotJobDetail = model.snapshotJobDetail;
            this.transcodeJobDetail = model.transcodeJobDetail;
            this.workflowTaskDetail = model.workflowTaskDetail;
        } 

        /**
         * <p>The details of the AI task. This field has a value only when TaskType is AI.</p>
         */
        public Builder AIJobDetail(AIJobDetail AIJobDetail) {
            this.AIJobDetail = AIJobDetail;
            return this;
        }

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>transcode</p>
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6708D849-F109-1A6C-AC91-************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the snapshot task. This field has a value only when JobType is Snapshot.</p>
         */
        public Builder snapshotJobDetail(SnapshotJobDetail snapshotJobDetail) {
            this.snapshotJobDetail = snapshotJobDetail;
            return this;
        }

        /**
         * <p>The details of the transcoding task. This field has a value only when JobType is Transcode.</p>
         */
        public Builder transcodeJobDetail(TranscodeJobDetail transcodeJobDetail) {
            this.transcodeJobDetail = transcodeJobDetail;
            return this;
        }

        /**
         * <p>The details of the workflow task. This field has a value only when TaskType is Workflow.</p>
         */
        public Builder workflowTaskDetail(WorkflowTaskDetail workflowTaskDetail) {
            this.workflowTaskDetail = workflowTaskDetail;
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

            private Builder() {
            } 

            private Builder(AIJobDetail model) {
                this.completeTime = model.completeTime;
                this.createTime = model.createTime;
                this.jobId = model.jobId;
                this.jobType = model.jobType;
                this.mediaId = model.mediaId;
                this.status = model.status;
                this.templateConfig = model.templateConfig;
                this.trigger = model.trigger;
                this.userId = model.userId;
            } 

            /**
             * <p>The time when the task ended. The time is displayed in UTC in the YYYY-MM-DDTHH:MM:SSZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-14T07:39:46Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the task was created. The time is displayed in UTC in the YYYY-MM-DDTHH:MM:SSZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-14T07:39:25Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5c9dff751ba**********59d50a967f5</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The AI task type.</p>
             * 
             * <strong>example:</strong>
             * <p>AIVideoCensor</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The media asset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>30e5d7**********bd900764de7c0102</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>reserved: The task is submitted.</li>
             * <li>init: The task is started.</li>
             * <li>success: The task succeeded.</li>
             * <li>fail: The task failed.</li>
             * <li>processing: The task is being processed.</li>
             * <li>analysing: The task is being analyzed.</li>
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
             * <p>The trigger method. Valid values:</p>
             * <ul>
             * <li>Auto: Automatically triggered by a workflow.</li>
             * <li>Manual: Manually submitted.</li>
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
             * <p>The ID of the user who initiated the task.</p>
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

            private Builder() {
            } 

            private Builder(SnapshotJobDetail model) {
                this.completeTime = model.completeTime;
                this.createTime = model.createTime;
                this.jobId = model.jobId;
                this.normalConfig = model.normalConfig;
                this.spriteConfig = model.spriteConfig;
                this.status = model.status;
                this.trigger = model.trigger;
                this.userId = model.userId;
                this.videoId = model.videoId;
            } 

            /**
             * <p>The time when the task was completed. The time is displayed in UTC in the YYYY-MM-DDTHH:MM:SSZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-14T07:39:45Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the task was created. The time is displayed in UTC in the YYYY-MM-DDTHH:MM:SSZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-14T07:39:25Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>63df12s0**********4hdq249t82kr91</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The normal snapshot configuration.</p>
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
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>Processing: The task is being processed.</li>
             * <li>Fail: The task failed.</li>
             * <li>Success: The task succeeded.</li>
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
             * <p>The trigger method. Valid values:</p>
             * <ul>
             * <li>Auto: Automatically triggered by a workflow.</li>
             * <li>Manual: Manually submitted.</li>
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
             * <p>The ID of the user who initiated the task.</p>
             * 
             * <strong>example:</strong>
             * <p>139109*****84930</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The media asset ID.</p>
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

            private Builder() {
            } 

            private Builder(TranscodeJobDetail model) {
                this.completeTime = model.completeTime;
                this.createTime = model.createTime;
                this.definition = model.definition;
                this.jobId = model.jobId;
                this.status = model.status;
                this.templateId = model.templateId;
                this.userId = model.userId;
                this.videoId = model.videoId;
            } 

            /**
             * <p>The time when the task was completed. The time is displayed in UTC in the YYYY-MM-DDTHH:MM:SSZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-14T07:39:34Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the task was created. The time is displayed in UTC in the YYYY-MM-DDTHH:MM:SSZ format.</p>
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
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2dc1634e**********3f1d22d1a0174e</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>Submitted: The task is submitted.</li>
             * <li>Transcoding: The task is being transcoded.</li>
             * <li>TranscodeSuccess: Transcoding succeeded.</li>
             * <li>TranscodeFail: Transcoding failed.</li>
             * <li>TranscodeCancelled: Transcoding is canceled.</li>
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
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dbfaaec9e**********bf0b81219244c</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The ID of the user who initiated the task.</p>
             * 
             * <strong>example:</strong>
             * <p>139109*****84930</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The media asset ID.</p>
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
    /**
     * 
     * {@link GetJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobDetailResponseBody</p>
     */
    public static class Workflow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private String workflowId;

        private Workflow(Builder builder) {
            this.appId = builder.appId;
            this.createTime = builder.createTime;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.status = builder.status;
            this.type = builder.type;
            this.workflowId = builder.workflowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workflow create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return workflowId
         */
        public String getWorkflowId() {
            return this.workflowId;
        }

        public static final class Builder {
            private String appId; 
            private String createTime; 
            private String modifiedTime; 
            private String name; 
            private String status; 
            private String type; 
            private String workflowId; 

            private Builder() {
            } 

            private Builder(Workflow model) {
                this.appId = model.appId;
                this.createTime = model.createTime;
                this.modifiedTime = model.modifiedTime;
                this.name = model.name;
                this.status = model.status;
                this.type = model.type;
                this.workflowId = model.workflowId;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>app-1000000</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The time when the workflow was created. The time is displayed in UTC in the YYYY-MM-DDTHH:MM:SSZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-26T05:50:14Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the workflow was modified. The time is displayed in UTC in the YYYY-MM-DDTHH:MM:SSZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-26T07:51:55Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The workflow name.</p>
             * 
             * <strong>example:</strong>
             * <p>All_Activity_New_1_app-1000000</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The workflow status. Valid values:</p>
             * <ul>
             * <li>Active: The workflow is activated.</li>
             * <li>Inactive: The workflow is not activated.</li>
             * <li>Deleted: The workflow is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The workflow type. By default, this field is not populated.</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The workflow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vw_09d6*****b5c5b19a0c891e02</p>
             */
            public Builder workflowId(String workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            public Workflow build() {
                return new Workflow(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobDetailResponseBody</p>
     */
    public static class WorkflowTaskDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityResults")
        private String activityResults;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskInput")
        private String taskInput;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("Workflow")
        private Workflow workflow;

        private WorkflowTaskDetail(Builder builder) {
            this.activityResults = builder.activityResults;
            this.createTime = builder.createTime;
            this.finishTime = builder.finishTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskInput = builder.taskInput;
            this.userData = builder.userData;
            this.workflow = builder.workflow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowTaskDetail create() {
            return builder().build();
        }

        /**
         * @return activityResults
         */
        public String getActivityResults() {
            return this.activityResults;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskInput
         */
        public String getTaskInput() {
            return this.taskInput;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return workflow
         */
        public Workflow getWorkflow() {
            return this.workflow;
        }

        public static final class Builder {
            private String activityResults; 
            private String createTime; 
            private String finishTime; 
            private String status; 
            private String taskId; 
            private String taskInput; 
            private String userData; 
            private Workflow workflow; 

            private Builder() {
            } 

            private Builder(WorkflowTaskDetail model) {
                this.activityResults = model.activityResults;
                this.createTime = model.createTime;
                this.finishTime = model.finishTime;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskInput = model.taskInput;
                this.userData = model.userData;
                this.workflow = model.workflow;
            } 

            /**
             * <p>The processing results of each node in the workflow, in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;VodSnapshot_123\&quot;:{\&quot;ActivityId\&quot;:\&quot;VodSnapshot\&quot;,\&quot;ActivityInstanceId\&quot;:\&quot;c8cf62d53bef4e04bf703976bae6d0b9\&quot;,\&quot;EndTime\&quot;:\&quot;2025-03-27T08:15:51Z\&quot;,\&quot;Result\&quot;:\&quot;{\\\&quot;RequestId\\\&quot;:\\\&quot;8B3649AF-5A6B-1099-BEB6-164D81067398\\\&quot;,\\\&quot;EventType\\\&quot;:\\\&quot;SnapshotComplete\\\&quot;,\\\&quot;UserId\\\&quot;:1797131669910763,\\\&quot;MessageBody\\\&quot;:{\\\&quot;Status\\\&quot;:\\\&quot;success\\\&quot;,\\\&quot;VideoId\\\&quot;:\\\&quot;00f985a50ae371f0ad1c4106e0ea0102\\\&quot;,\\\&quot;EventType\\\&quot;:\\\&quot;SnapshotComplete\\\&quot;,\\\&quot;EventTime\\\&quot;:\\\&quot;2025-03-27T08:15:50Z\\\&quot;,\\\&quot;TriggerSource\\\&quot;:\\\&quot;{\\\\\\\&quot;ActivityInstanceId\\\\\\\&quot;:\\\\\\\&quot;c8cf62d53bef4e04bf703976bae6d0b9\\\\\\\&quot;,\\\\\\\&quot;BizType\\\\\\\&quot;:\\\\\\\&quot;ice-workflow\\\\\\\&quot;}\\\&quot;}}\&quot;,\&quot;StartTime\&quot;:\&quot;2025-03-27T08:15:47Z\&quot;,\&quot;Status\&quot;:\&quot;Succeed\&quot;},\&quot;Translate_zh_en\&quot;:{\&quot;ActivityId\&quot;:\&quot;VodTranslation\&quot;,\&quot;ActivityInstanceId\&quot;:\&quot;c043a872bb044763a3d293a5c2458b50\&quot;,\&quot;EndTime\&quot;:\&quot;2025-03-27T08:20:19Z\&quot;,\&quot;Result\&quot;:\&quot;{\\\&quot;Type\\\&quot;:\\\&quot;VideoTranslationAll\\\&quot;,\\\&quot;Success\\\&quot;:false}\&quot;,\&quot;StartTime\&quot;:\&quot;2025-03-27T08:15:46Z\&quot;,\&quot;Status\&quot;:\&quot;Failed\&quot;},\&quot;Act_Start\&quot;:{\&quot;ActivityId\&quot;:\&quot;start\&quot;,\&quot;ActivityInstanceId\&quot;:\&quot;8a9402f4ff064084bf496707fb2d664a\&quot;,\&quot;Result\&quot;:\&quot;{\\\&quot;Type\\\&quot;:\\\&quot;Media\\\&quot;,\\\&quot;bizType\\\&quot;:6,\\\&quot;Media\\\&quot;:\\\&quot;00f985a50ae371f0ad1c4106e0ea0102\\\&quot;,\\\&quot;Title\\\&quot;:\\\&quot;2.mp4\\\&quot;,\\\&quot;taskInput\\\&quot;:\\\&quot;{\\\\\\\&quot;Type\\\\\\\&quot;:\\\\\\\&quot;Media\\\\\\\&quot;,\\\\\\\&quot;Media\\\\\\\&quot;:\\\\\\\&quot;00f985a50ae371f0ad1c4106e0ea0102\\\\\\\&quot;}\\\&quot;,\\\&quot;userTaskInput\\\&quot;:\\\&quot;{\\\\\\\&quot;Type\\\\\\\&quot;:\\\\\\\&quot;Media\\\\\\\&quot;,\\\\\\\&quot;Media\\\\\\\&quot;:\\\\\\\&quot;00f985a50ae371f0ad1c4106e0ea0102\\\\\\\&quot;,\\\\\\\&quot;Title\\\\\\\&quot;:\\\\\\\&quot;2.mp4\\\\\\\&quot;,\\\\\\\&quot;StorageLocation\\\\\\\&quot;:\\\\\\\&quot;yiming-pre.oss-cn-shanghai.aliyuncs.com\\\\\\\&quot;}\\\&quot;,\\\&quot;StorageLocation\\\&quot;:\\\&quot;yiming-pre.oss-cn-shanghai.aliyuncs.com\\\&quot;,\\\&quot;callerUid\\\&quot;:1797131669910763,\\\&quot;CUR_NODE_NAME\\\&quot;:\\\&quot;Act_Start\\\&quot;}\&quot;,\&quot;StartTime\&quot;:\&quot;2025-03-27T08:15:45Z\&quot;,\&quot;Status\&quot;:\&quot;Succeed\&quot;},\&quot;VodDynamicImage_123\&quot;:{\&quot;ActivityId\&quot;:\&quot;VodDynamicImage\&quot;,\&quot;ActivityInstanceId\&quot;:\&quot;26e8dab82ab84110b1150f146caf633c\&quot;,\&quot;EndTime\&quot;:\&quot;2025-03-27T08:15:55Z\&quot;,\&quot;Result\&quot;:\&quot;{\\\&quot;RequestId\\\&quot;:\\\&quot;7120B5D5-430F-14AD-8922-577F072DDD64\\\&quot;,\\\&quot;EventType\\\&quot;:\\\&quot;DynamicImageComplete\\\&quot;,\\\&quot;UserId\\\&quot;:1797131669910763,\\\&quot;MessageBody\\\&quot;:{\\\&quot;Status\\\&quot;:\\\&quot;success\\\&quot;,\\\&quot;VideoId\\\&quot;:\\\&quot;00f985a50ae371f0ad1c4106e0ea0102\\\&quot;,\\\&quot;EventType\\\&quot;:\\\&quot;DynamicImageComplete\\\&quot;,\\\&quot;EventTime\\\&quot;:\\\&quot;2025-03-27T08:15:52Z\\\&quot;,\\\&quot;TriggerSource\\\&quot;:\\\&quot;{\\\\\\\&quot;ActivityInstanceId\\\\\\\&quot;:\\\\\\\&quot;26e8dab82ab84110b1150f146caf633c\\\\\\\&quot;,\\\\\\\&quot;BizType\\\\\\\&quot;:\\\\\\\&quot;ice-workflow\\\\\\\&quot;}\\\&quot;}}\&quot;,\&quot;StartTime\&quot;:\&quot;2025-03-27T08:15:47Z\&quot;,\&quot;Status\&quot;:\&quot;Succeed\&quot;}}</p>
             */
            public Builder activityResults(String activityResults) {
                this.activityResults = activityResults;
                return this;
            }

            /**
             * <p>The time when the task was created. The time is displayed in UTC in the YYYY-MM-DDTHH:MM:SSZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-27T08:15:46Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the task was completed. The time is displayed in UTC in the YYYY-MM-DDTHH:MM:SSZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-27T08:20:19Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>Init: The task is started.</li>
             * <li>Processing: The task is being processed.</li>
             * <li>Succeed: The task succeeded.</li>
             * <li>Failed: The task failed.</li>
             * <li>Canceled: The task is canceled.</li>
             * <li>Skip: The task is skipped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Succeed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>46ecc024******92c8e26237e51</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The media asset information.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;Type\&quot;:\&quot;Media\&quot;,\&quot;Media\&quot;:\&quot;00f985a50ae371f0ad1c4106e0ea0102\&quot;,\&quot;Title\&quot;:\&quot;2.mp4\&quot;,\&quot;StorageLocation\&quot;:\&quot;yiming-pre.oss-cn-shanghai.aliyuncs.com\&quot;}</p>
             */
            public Builder taskInput(String taskInput) {
                this.taskInput = taskInput;
                return this;
            }

            /**
             * <p>The custom settings. The value is a JSON string that supports settings such as message callbacks and upload acceleration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22*****%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;*****&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>The workflow details.</p>
             */
            public Builder workflow(Workflow workflow) {
                this.workflow = workflow;
                return this;
            }

            public WorkflowTaskDetail build() {
                return new WorkflowTaskDetail(this);
            } 

        } 

    }
}
