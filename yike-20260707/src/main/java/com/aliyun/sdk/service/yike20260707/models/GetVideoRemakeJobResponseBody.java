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
 * {@link GetVideoRemakeJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoRemakeJobResponseBody</p>
 */
public class GetVideoRemakeJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetVideoRemakeJobResponseBody(Builder builder) {
        this.job = builder.job;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoRemakeJobResponseBody create() {
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

        private Builder(GetVideoRemakeJobResponseBody model) {
            this.job = model.job;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The unified remake task details.</p>
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        /**
         * <p>The request tracking identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4321-ABCD-123456789012</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVideoRemakeJobResponseBody build() {
            return new GetVideoRemakeJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVideoRemakeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoRemakeJobResponseBody</p>
     */
    public static class JobResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiResult")
        private String aiResult;

        @com.aliyun.core.annotation.NameInMap("Script")
        private String script;

        private JobResult(Builder builder) {
            this.aiResult = builder.aiResult;
            this.script = builder.script;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobResult create() {
            return builder().build();
        }

        /**
         * @return aiResult
         */
        public String getAiResult() {
            return this.aiResult;
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        public static final class Builder {
            private String aiResult; 
            private String script; 

            private Builder() {
            } 

            private Builder(JobResult model) {
                this.aiResult = model.aiResult;
                this.script = model.script;
            } 

            /**
             * <p>The download URL of the JSON file for the content understanding result.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/comprehension-result.json">https://example-bucket.oss-cn-shanghai.aliyuncs.com/comprehension-result.json</a></p>
             */
            public Builder aiResult(String aiResult) {
                this.aiResult = aiResult;
                return this;
            }

            /**
             * <p>The download URL of the JSON file for the creative script. Use the file content as the Script parameter for SubmitVideoRenderJob.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/creative-script.json">https://example.com/creative-script.json</a></p>
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            public JobResult build() {
                return new JobResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoRemakeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoRemakeJobResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobResult")
        private JobResult jobResult;

        @com.aliyun.core.annotation.NameInMap("MediaIds")
        private java.util.List<String> mediaIds;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private Job(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.jobId = builder.jobId;
            this.jobResult = builder.jobResult;
            this.mediaIds = builder.mediaIds;
            this.status = builder.status;
            this.userData = builder.userData;
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
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobResult
         */
        public JobResult getJobResult() {
            return this.jobResult;
        }

        /**
         * @return mediaIds
         */
        public java.util.List<String> getMediaIds() {
            return this.mediaIds;
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
            private String errorCode; 
            private String errorMessage; 
            private String jobId; 
            private JobResult jobResult; 
            private java.util.List<String> mediaIds; 
            private String status; 
            private String userData; 

            private Builder() {
            } 

            private Builder(Job model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.jobId = model.jobId;
                this.jobResult = model.jobResult;
                this.mediaIds = model.mediaIds;
                this.status = model.status;
                this.userData = model.userData;
            } 

            /**
             * <p>The error code for the failed asynchronous task. This parameter has a value only when the task status is Failed.</p>
             * 
             * <strong>example:</strong>
             * <p>NOT_ENOUGH_ALLOCATE_CREDIT_QUOTA</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message for the failed asynchronous task. This parameter has a value only when the task status is Failed.</p>
             * 
             * <strong>example:</strong>
             * <p>lockCredit business failed: NOT_ENOUGH_ALLOCATE_CREDIT_QUOTA</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The unified remake task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0123456789abcdef0123456789abcdef</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The content understanding and script outputs returned when the status is Finished. This is not the rendered video.</p>
             */
            public Builder jobResult(JobResult jobResult) {
                this.jobResult = jobResult;
                return this;
            }

            /**
             * <p>The list of input media asset IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;1234567890abcdef1234567890abcdef&quot;]</p>
             */
            public Builder mediaIds(java.util.List<String> mediaIds) {
                this.mediaIds = mediaIds;
                return this;
            }

            /**
             * <p>The task status. Valid values: Created, Executing, Finished, and Failed. Finished indicates that content understanding and script generation are completed. If the status is Failed, check ErrorCode and ErrorMessage. If the task has been deleted, the query returns RecordNotFound.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The UserData JSON string submitted with the task, returned as is.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;NotifyAddress&quot;:&quot;<a href="https://example.com/callback%22%7D">https://example.com/callback&quot;}</a></p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
}
