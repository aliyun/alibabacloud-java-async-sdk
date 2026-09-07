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
 * {@link GetRemakeScriptJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetRemakeScriptJobResponseBody</p>
 */
public class GetRemakeScriptJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRemakeScriptJobResponseBody(Builder builder) {
        this.job = builder.job;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRemakeScriptJobResponseBody create() {
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

        private Builder(GetRemakeScriptJobResponseBody model) {
            this.job = model.job;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The generated creative script object.</p>
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

        public GetRemakeScriptJobResponseBody build() {
            return new GetRemakeScriptJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRemakeScriptJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetRemakeScriptJobResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private Job(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.jobId = builder.jobId;
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
            private String errorCode; 
            private String errorMessage; 
            private String jobId; 
            private String result; 
            private String status; 
            private String userData; 

            private Builder() {
            } 

            private Builder(Job model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.jobId = model.jobId;
                this.result = model.result;
                this.status = model.status;
                this.userData = model.userData;
            } 

            /**
             * <p>The error code. Returned when the status is Failed.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message. Returned when the status is Failed.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified product does not exist.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>68ca759e798b40b4903b255*******</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The file URL of the script imitation result. The file content is in JSON format of the creative script.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.json">http://xxxx.json</a></p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The file status. Valid values:</p>
             * <ul>
             * <li>Created: Created.</li>
             * <li>Executing: Executing.</li>
             * <li>Finished: Finished.</li>
             * <li>Failed: Failed.</li>
             * <li>Deleted: Deleted.</li>
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
             * <p>The user-defined parameter, in JSON format string.</p>
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
