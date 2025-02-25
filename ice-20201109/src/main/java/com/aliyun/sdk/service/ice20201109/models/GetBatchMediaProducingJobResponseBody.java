// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetBatchMediaProducingJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetBatchMediaProducingJobResponseBody</p>
 */
public class GetBatchMediaProducingJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EditingBatchJob")
    private EditingBatchJob editingBatchJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetBatchMediaProducingJobResponseBody(Builder builder) {
        this.editingBatchJob = builder.editingBatchJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBatchMediaProducingJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return editingBatchJob
     */
    public EditingBatchJob getEditingBatchJob() {
        return this.editingBatchJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private EditingBatchJob editingBatchJob; 
        private String requestId; 

        /**
         * <p>The information about the quick video production job.</p>
         */
        public Builder editingBatchJob(EditingBatchJob editingBatchJob) {
            this.editingBatchJob = editingBatchJob;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>36-3C1E-4417-BDB2-1E034F</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBatchMediaProducingJobResponseBody build() {
            return new GetBatchMediaProducingJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBatchMediaProducingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchMediaProducingJobResponseBody</p>
     */
    public static class SubJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaURL")
        private String mediaURL;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SubJobList(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.jobId = builder.jobId;
            this.mediaId = builder.mediaId;
            this.mediaURL = builder.mediaURL;
            this.projectId = builder.projectId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubJobList create() {
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
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaURL
         */
        public String getMediaURL() {
            return this.mediaURL;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
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
            private String jobId; 
            private String mediaId; 
            private String mediaURL; 
            private String projectId; 
            private String status; 

            /**
             * <p>The error code that is returned if the subjob failed. This parameter is not returned if the subjob is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidMaterial.NotFound</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message that is returned if the subjob failed. This parameter is not returned if the subjob is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified clips id not found:[&quot;<strong><strong>30d0b5e871eebb2ff7f6c75a</strong></strong>&quot;]</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The subjob ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>8e81933d44e3ae69e2f81485</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The ID of the output media asset.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>1470b11171ee9d19e7e6c66a</strong></strong></p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The URL of the output file.</p>
             * 
             * <strong>example:</strong>
             * <p>http:/xxx.oss-cn-shanghai.aliyuncs.com/xxx_0.mp4</p>
             */
            public Builder mediaURL(String mediaURL) {
                this.mediaURL = mediaURL;
                return this;
            }

            /**
             * <p>The ID of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>7cc47fe04eaa81bd853acb6a</strong></strong></p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The subjob state. Valid values:</p>
             * <p>Init: The subjob is initialized.</p>
             * <p>Processing: The subjob is in progress.</p>
             * <p>Success: The subjob is successful.</p>
             * <p>Failed: The subjob failed.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SubJobList build() {
                return new SubJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchMediaProducingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchMediaProducingJobResponseBody</p>
     */
    public static class EditingBatchJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EditingConfig")
        private String editingConfig;

        @com.aliyun.core.annotation.NameInMap("Extend")
        private String extend;

        @com.aliyun.core.annotation.NameInMap("InputConfig")
        private String inputConfig;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("OutputConfig")
        private String outputConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubJobList")
        private java.util.List<SubJobList> subJobList;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private EditingBatchJob(Builder builder) {
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.editingConfig = builder.editingConfig;
            this.extend = builder.extend;
            this.inputConfig = builder.inputConfig;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.modifiedTime = builder.modifiedTime;
            this.outputConfig = builder.outputConfig;
            this.status = builder.status;
            this.subJobList = builder.subJobList;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EditingBatchJob create() {
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
         * @return editingConfig
         */
        public String getEditingConfig() {
            return this.editingConfig;
        }

        /**
         * @return extend
         */
        public String getExtend() {
            return this.extend;
        }

        /**
         * @return inputConfig
         */
        public String getInputConfig() {
            return this.inputConfig;
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
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return outputConfig
         */
        public String getOutputConfig() {
            return this.outputConfig;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subJobList
         */
        public java.util.List<SubJobList> getSubJobList() {
            return this.subJobList;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String completeTime; 
            private String createTime; 
            private String editingConfig; 
            private String extend; 
            private String inputConfig; 
            private String jobId; 
            private String jobType; 
            private String modifiedTime; 
            private String outputConfig; 
            private String status; 
            private java.util.List<SubJobList> subJobList; 
            private String userData; 

            /**
             * <p>The time when the job was complete.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-13T08:57:07Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the job was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-13T08:47:07Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The editing configurations. For more information, see <a href="~~2692547#1be9bba03b7qu~~">EditingConfig</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;MediaConfig&quot;: {
             *       &quot;Volume&quot;: 0
             *   },
             *   &quot;SpeechConfig&quot;: {
             *       &quot;Volume&quot;: 1
             *   },
             *  &quot;BackgroundMusicConfig&quot;: {
             *       &quot;Volume&quot;: 0.3
             *   }
             * }</p>
             */
            public Builder editingConfig(String editingConfig) {
                this.editingConfig = editingConfig;
                return this;
            }

            /**
             * <p>The extended information. This parameter contains the following fields:</p>
             * <p>ErrorCode: the error code of the main job.</p>
             * <p>ErrorMessage: the error message of the main job.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;ErrorCode&quot;: &quot;InvalidMaterial.NotFound&quot;,
             *     &quot;ErrorMessage&quot;: &quot;The specified clips id not found:[&quot;<strong><strong>30d0b5e871eebb2ff7f6c75a</strong></strong>&quot;]&quot;
             * }</p>
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * <p>The input configurations. For more information, see <a href="~~2692547#2faed1559549n~~">InputConfig</a>.</p>
             */
            public Builder inputConfig(String inputConfig) {
                this.inputConfig = inputConfig;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>b6b2750d4308892ac3330238</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The time when the job was last modified.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-13T08:57:07Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The output configurations. For more information, see <a href="~~2692547#447b928fcbuoa~~">OutputConfig</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;MediaURL&quot;: &quot;<a href="http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_%7Bindex%7D.mp4">http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_{index}.mp4</a>&quot;,
             *   &quot;Count&quot;: 20,
             *   &quot;MaxDuration&quot;: 15,
             *   &quot;Width&quot;: 1080,
             *   &quot;Height&quot;: 1920,
             *   &quot;Video&quot;: {&quot;Crf&quot;: 27}
             * }</p>
             */
            public Builder outputConfig(String outputConfig) {
                this.outputConfig = outputConfig;
                return this;
            }

            /**
             * <p>The job state. Valid values:</p>
             * <p>Init: The job is initialized.</p>
             * <p>Processing: The job is in progress.</p>
             * <p>Finished: The job is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The quick video production subjobs.</p>
             */
            public Builder subJobList(java.util.List<SubJobList> subJobList) {
                this.subJobList = subJobList;
                return this;
            }

            /**
             * <p>The user-defined data, including the business and callback configurations. For more information, see <a href="https://help.aliyun.com/document_detail/357745.html">UserData</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a></p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public EditingBatchJob build() {
                return new EditingBatchJob(this);
            } 

        } 

    }
}
