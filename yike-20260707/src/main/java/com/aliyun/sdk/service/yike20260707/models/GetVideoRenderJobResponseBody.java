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
 * {@link GetVideoRenderJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoRenderJobResponseBody</p>
 */
public class GetVideoRenderJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetVideoRenderJobResponseBody(Builder builder) {
        this.job = builder.job;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoRenderJobResponseBody create() {
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

        private Builder(GetVideoRenderJobResponseBody model) {
            this.job = model.job;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The video rendering and compositing task object.</p>
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVideoRenderJobResponseBody build() {
            return new GetVideoRenderJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVideoRenderJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoRenderJobResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EditingProjectId")
        private String editingProjectId;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private Job(Builder builder) {
            this.editingProjectId = builder.editingProjectId;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.jobId = builder.jobId;
            this.language = builder.language;
            this.result = builder.result;
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
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
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
            private String editingProjectId; 
            private String errorCode; 
            private String errorMessage; 
            private String jobId; 
            private String language; 
            private String result; 
            private String status; 
            private String userData; 

            private Builder() {
            } 

            private Builder(Job model) {
                this.editingProjectId = model.editingProjectId;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.jobId = model.jobId;
                this.language = model.language;
                this.result = model.result;
                this.status = model.status;
                this.userData = model.userData;
            } 

            /**
             * <p>The ID of the online editing project, which can be used for secondary editing of the produced video.</p>
             * 
             * <strong>example:</strong>
             * <p>8239345231244512***</p>
             */
            public Builder editingProjectId(String editingProjectId) {
                this.editingProjectId = editingProjectId;
                return this;
            }

            /**
             * <p>The error code. This parameter is returned when the job is in the Failed state.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message. This parameter is returned when the job is in the Failed state.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified product does not exist.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>68ca759e798b40b4903b255*******</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The voiceover language of the produced video.</p>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The download URL of the rendered and composited video.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxx.mp4">https://xxxx.mp4</a></p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The job status. Valid values:</p>
             * <ul>
             * <li>Created: The job is created.</li>
             * <li>Executing: The job is being executed.</li>
             * <li>Finished: The job is completed.</li>
             * <li>Failed: The job failed.</li>
             * <li>Deleted: The job is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Executing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The user-defined parameter, which is a JSON-formatted string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
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
