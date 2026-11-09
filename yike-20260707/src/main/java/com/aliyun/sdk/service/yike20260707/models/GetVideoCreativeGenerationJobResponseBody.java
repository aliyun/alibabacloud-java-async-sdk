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
 * {@link GetVideoCreativeGenerationJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoCreativeGenerationJobResponseBody</p>
 */
public class GetVideoCreativeGenerationJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("FinishTime")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("JobResult")
    private java.util.List<JobResult> jobResult;

    @com.aliyun.core.annotation.NameInMap("JobStatus")
    private String jobStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private GetVideoCreativeGenerationJobResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.errorCode = builder.errorCode;
        this.finishTime = builder.finishTime;
        this.jobId = builder.jobId;
        this.jobResult = builder.jobResult;
        this.jobStatus = builder.jobStatus;
        this.requestId = builder.requestId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoCreativeGenerationJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
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
        private String createTime; 
        private String errorCode; 
        private String finishTime; 
        private String jobId; 
        private java.util.List<JobResult> jobResult; 
        private String jobStatus; 
        private String requestId; 
        private String userData; 

        private Builder() {
        } 

        private Builder(GetVideoCreativeGenerationJobResponseBody model) {
            this.createTime = model.createTime;
            this.errorCode = model.errorCode;
            this.finishTime = model.finishTime;
            this.jobId = model.jobId;
            this.jobResult = model.jobResult;
            this.jobStatus = model.jobStatus;
            this.requestId = model.requestId;
            this.userData = model.userData;
        } 

        /**
         * <p>The job creation time in UTC format (yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot;).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-06T18:53:34.001+08:00</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The error code. This parameter is returned only when the job status is Failed.</p>
         * 
         * <strong>example:</strong>
         * <p>WorkflowTaskFailed</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The job completion time in UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-06T18:53:34.001+08:00</p>
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>3e761e9d11edba640c42a1b7</strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The task results of the node. This parameter is valid only when the job status is Succeeded. Each element represents the output for a single language.</p>
         */
        public Builder jobResult(java.util.List<JobResult> jobResult) {
            this.jobResult = jobResult;
            return this;
        }

        /**
         * <p>The job status. Valid values: Running, Succeeded, and Failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder jobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The custom user data, which is returned as-is.</p>
         * 
         * <strong>example:</strong>
         * <p>12374214127312673137132</p>
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        public GetVideoCreativeGenerationJobResponseBody build() {
            return new GetVideoCreativeGenerationJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVideoCreativeGenerationJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoCreativeGenerationJobResponseBody</p>
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
             * <p>The online editing project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>01a6adbbd181437eb5030d3d93e0182d</p>
             */
            public Builder editingProjectId(String editingProjectId) {
                this.editingProjectId = editingProjectId;
                return this;
            }

            /**
             * <p>The media asset ID of the output video.</p>
             * 
             * <strong>example:</strong>
             * <p>9d7e982012c671f1b803e7f6d75a6302</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The output language. Valid values: CN, EN, and YUE.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder outputLanguage(String outputLanguage) {
                this.outputLanguage = outputLanguage;
                return this;
            }

            /**
             * <p>The signed download URL of the output video. The URL is time-limited.</p>
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
