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
 * {@link GetYikeVoiceNarratorJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetYikeVoiceNarratorJobResponseBody</p>
 */
public class GetYikeVoiceNarratorJobResponseBody extends TeaModel {
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

    private GetYikeVoiceNarratorJobResponseBody(Builder builder) {
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

    public static GetYikeVoiceNarratorJobResponseBody create() {
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

        private Builder(GetYikeVoiceNarratorJobResponseBody model) {
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
         * RequestId.
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

        public GetYikeVoiceNarratorJobResponseBody build() {
            return new GetYikeVoiceNarratorJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetYikeVoiceNarratorJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetYikeVoiceNarratorJobResponseBody</p>
     */
    public static class JobResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EditingProjectId")
        private String editingProjectId;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("OutputLanguage")
        private String outputLanguage;

        @com.aliyun.core.annotation.NameInMap("OutputUrl")
        private String outputUrl;

        private JobResult(Builder builder) {
            this.editingProjectId = builder.editingProjectId;
            this.mediaId = builder.mediaId;
            this.outputLanguage = builder.outputLanguage;
            this.outputUrl = builder.outputUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobResult create() {
            return builder().build();
        }

        /**
         * @return editingProjectId
         */
        public String getEditingProjectId() {
            return this.editingProjectId;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return outputLanguage
         */
        public String getOutputLanguage() {
            return this.outputLanguage;
        }

        /**
         * @return outputUrl
         */
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public static final class Builder {
            private String editingProjectId; 
            private String mediaId; 
            private String outputLanguage; 
            private String outputUrl; 

            private Builder() {
            } 

            private Builder(JobResult model) {
                this.editingProjectId = model.editingProjectId;
                this.mediaId = model.mediaId;
                this.outputLanguage = model.outputLanguage;
                this.outputUrl = model.outputUrl;
            } 

            /**
             * EditingProjectId.
             */
            public Builder editingProjectId(String editingProjectId) {
                this.editingProjectId = editingProjectId;
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
             * OutputLanguage.
             */
            public Builder outputLanguage(String outputLanguage) {
                this.outputLanguage = outputLanguage;
                return this;
            }

            /**
             * OutputUrl.
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
