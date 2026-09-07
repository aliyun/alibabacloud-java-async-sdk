// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link GetVideoTranslationJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoTranslationJobResponseBody</p>
 */
public class GetVideoTranslationJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetVideoTranslationJobResponseBody(Builder builder) {
        this.job = builder.job;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoTranslationJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return job
     */
    public Job getJob() {
        return this.job;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Job job; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetVideoTranslationJobResponseBody model) {
            this.job = model.job;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The video translation job.</p>
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        /**
         * <p>The request ID, used for Tracing Analysis and troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>req-vt-get-20260820-001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVideoTranslationJobResponseBody build() {
            return new GetVideoTranslationJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVideoTranslationJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoTranslationJobResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("EditingProjectId")
        private String editingProjectId;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Input")
        private String input;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobParameters")
        private String jobParameters;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Job(Builder builder) {
            this.duration = builder.duration;
            this.editingProjectId = builder.editingProjectId;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.input = builder.input;
            this.jobId = builder.jobId;
            this.jobParameters = builder.jobParameters;
            this.jobType = builder.jobType;
            this.output = builder.output;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Double getDuration() {
            return this.duration;
        }

        /**
         * @return editingProjectId
         */
        public String getEditingProjectId() {
            return this.editingProjectId;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return input
         */
        public String getInput() {
            return this.input;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobParameters
         */
        public String getJobParameters() {
            return this.jobParameters;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Double duration; 
            private String editingProjectId; 
            private String errorCode; 
            private String errorMessage; 
            private String input; 
            private String jobId; 
            private String jobParameters; 
            private String jobType; 
            private String output; 
            private String status; 

            private Builder() {
            } 

            private Builder(Job model) {
                this.duration = model.duration;
                this.editingProjectId = model.editingProjectId;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.input = model.input;
                this.jobId = model.jobId;
                this.jobParameters = model.jobParameters;
                this.jobType = model.jobType;
                this.output = model.output;
                this.status = model.status;
            } 

            /**
             * <p>The input video duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60.5</p>
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The editing project ID for a single-target-language job. For multi-target-language results, retrieve the ID from Output.AiResult.ResultMap.</p>
             * 
             * <strong>example:</strong>
             * <p>editing-project-001</p>
             */
            public Builder editingProjectId(String editingProjectId) {
                this.editingProjectId = editingProjectId;
                return this;
            }

            /**
             * <p>The business error code returned when the job fails. This field is typically not returned for non-failed states.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidInput</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The business error message returned when the job fails. This field is typically not returned for non-failed states.</p>
             * 
             * <strong>example:</strong>
             * <p>Input video is invalid.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The normalized input configuration JSON string saved at submission time.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;VideoMediaId&quot;:&quot;media-video-001&quot;}</p>
             */
            public Builder input(String input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The video translation job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vtj_0123456789abcdef0123456789abcdef</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The normalized job parameters JSON string, including default values supplemented by the service.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;SourceLanguage&quot;:&quot;zh&quot;,&quot;TargetLanguage&quot;:&quot;en&quot;,&quot;SubtitleFrom&quot;:&quot;default&quot;,&quot;NeedDetext&quot;:false,&quot;NeedVisualTranslate&quot;:false}</p>
             */
            public Builder jobParameters(String jobParameters) {
                this.jobParameters = jobParameters;
                return this;
            }

            /**
             * <p>The normalized job type.</p>
             * 
             * <strong>example:</strong>
             * <p>VoiceTranslate</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The job output JSON string. When the job succeeds, AiResult.ResultMap organizes the final video, subtitle, and audio outputs by target language.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;AiResult&quot;:{&quot;ResultMap&quot;:{&quot;en&quot;:{&quot;EditingProjectId&quot;:&quot;editing-project-001&quot;,&quot;MediaURL&quot;:&quot;<a href="https://example.com/video-translation/en/result.mp4%22,%22MediaId%22:%22media-output-001%22%7D%7D%7D%7D">https://example.com/video-translation/en/result.mp4&quot;,&quot;MediaId&quot;:&quot;media-output-001&quot;}}}}</a></p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The job status. Valid values: Created, Queuing, Executing, Finished, or Failed.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
}
