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
         * Job.
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        /**
         * RequestId.
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
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
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
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
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
             * UserData.
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
