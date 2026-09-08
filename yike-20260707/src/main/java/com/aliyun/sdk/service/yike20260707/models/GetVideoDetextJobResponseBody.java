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
 * {@link GetVideoDetextJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoDetextJobResponseBody</p>
 */
public class GetVideoDetextJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetVideoDetextJobResponseBody(Builder builder) {
        this.job = builder.job;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoDetextJobResponseBody create() {
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

        private Builder(GetVideoDetextJobResponseBody model) {
            this.job = model.job;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The video text erasure task.</p>
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        /**
         * <p>The request ID, which is used for Tracing Analysis and troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>req-detext-get-20260820-001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVideoDetextJobResponseBody build() {
            return new GetVideoDetextJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVideoDetextJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoDetextJobResponseBody</p>
     */
    public static class Job extends TeaModel {
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
             * <p>The business error code returned when the task fails. This field is typically not returned for non-failure states.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidInput</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The business error message returned when the task fails. This field is typically not returned for non-failure states.</p>
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
             * <p>{&quot;VideoUrl&quot;:&quot;<a href="https://example.com/input.mp4%22%7D">https://example.com/input.mp4&quot;}</a></p>
             */
            public Builder input(String input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The video text erasure task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vdt_0123456789abcdef0123456789abcdef</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The normalized text erasure parameter JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;EraseAllText&quot;:false,&quot;TextTargets&quot;:[{&quot;Box&quot;:[0.1,0.8,0.8,0.15],&quot;TimeRanges&quot;:[[0,30]]}]}</p>
             */
            public Builder jobParameters(String jobParameters) {
                this.jobParameters = jobParameters;
                return this;
            }

            /**
             * <p>The task type. The value is fixed to VIDEO_DETEXT.</p>
             * 
             * <strong>example:</strong>
             * <p>VIDEO_DETEXT</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The task result JSON string. When Status is Finished, deserialize this field and read AiResult.DetextVideoURL to obtain the URL of the video after text erasure. The video URL is not guaranteed to be included when the task has not completed successfully. If Output.OssUri is specified at submission time, the result is stored in the specified OSS location. Otherwise, a signed URL is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;AiResult&quot;:{&quot;DetextVideoURL&quot;:&quot;<a href="https://example.com/detext/detext.mp4%22%7D%7D">https://example.com/detext/detext.mp4&quot;}}</a></p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The task status. Valid values: Created, Queuing, Executing, Finished, and Failed.</p>
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
