// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link GetYikePromptExpansionVoiceFixJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetYikePromptExpansionVoiceFixJobResponseBody</p>
 */
public class GetYikePromptExpansionVoiceFixJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("JobParams")
    private String jobParams;

    @com.aliyun.core.annotation.NameInMap("JobResult")
    private java.util.List<JobResult> jobResult;

    @com.aliyun.core.annotation.NameInMap("JobStatus")
    private String jobStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private GetYikePromptExpansionVoiceFixJobResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.jobId = builder.jobId;
        this.jobParams = builder.jobParams;
        this.jobResult = builder.jobResult;
        this.jobStatus = builder.jobStatus;
        this.requestId = builder.requestId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetYikePromptExpansionVoiceFixJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return jobParams
     */
    public String getJobParams() {
        return this.jobParams;
    }

    /**
     * @return jobResult
     */
    public java.util.List<JobResult> getJobResult() {
        return this.jobResult;
    }

    /**
     * @return jobStatus
     */
    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder {
        private String errorCode; 
        private String jobId; 
        private String jobParams; 
        private java.util.List<JobResult> jobResult; 
        private String jobStatus; 
        private String requestId; 
        private String userData; 

        private Builder() {
        } 

        private Builder(GetYikePromptExpansionVoiceFixJobResponseBody model) {
            this.errorCode = model.errorCode;
            this.jobId = model.jobId;
            this.jobParams = model.jobParams;
            this.jobResult = model.jobResult;
            this.jobStatus = model.jobStatus;
            this.requestId = model.requestId;
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
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * JobParams.
         */
        public Builder jobParams(String jobParams) {
            this.jobParams = jobParams;
            return this;
        }

        /**
         * JobResult.
         */
        public Builder jobResult(java.util.List<JobResult> jobResult) {
            this.jobResult = jobResult;
            return this;
        }

        /**
         * JobStatus.
         */
        public Builder jobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * <p>RequestId</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        public GetYikePromptExpansionVoiceFixJobResponseBody build() {
            return new GetYikePromptExpansionVoiceFixJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetYikePromptExpansionVoiceFixJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikePromptExpansionVoiceFixJobResponseBody</p>
     */
    public static class JobResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutputUrl")
        private String outputUrl;

        private JobResult(Builder builder) {
            this.outputUrl = builder.outputUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobResult create() {
            return builder().build();
        }

        /**
         * @return outputUrl
         */
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public static final class Builder {
            private String outputUrl; 

            private Builder() {
            } 

            private Builder(JobResult model) {
                this.outputUrl = model.outputUrl;
            } 

            /**
             * <p>Oss Url</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test.oss-cn-shanghai.aliyuncs.com/test.mp4">https://test.oss-cn-shanghai.aliyuncs.com/test.mp4</a></p>
             */
            public Builder outputUrl(String outputUrl) {
                this.outputUrl = outputUrl;
                return this;
            }

            public JobResult build() {
                return new JobResult(this);
            } 

        } 

    }
}
