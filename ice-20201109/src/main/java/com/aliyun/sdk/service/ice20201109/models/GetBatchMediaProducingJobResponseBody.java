// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBatchMediaProducingJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetBatchMediaProducingJobResponseBody</p>
 */
public class GetBatchMediaProducingJobResponseBody extends TeaModel {
    @NameInMap("EditingBatchJob")
    private EditingBatchJob editingBatchJob;

    @NameInMap("RequestId")
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
         * EditingBatchJob.
         */
        public Builder editingBatchJob(EditingBatchJob editingBatchJob) {
            this.editingBatchJob = editingBatchJob;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBatchMediaProducingJobResponseBody build() {
            return new GetBatchMediaProducingJobResponseBody(this);
        } 

    } 

    public static class SubJobList extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("MediaURL")
        private String mediaURL;

        @NameInMap("Status")
        private String status;

        private SubJobList(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.jobId = builder.jobId;
            this.mediaId = builder.mediaId;
            this.mediaURL = builder.mediaURL;
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
            private String status; 

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
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * MediaURL.
             */
            public Builder mediaURL(String mediaURL) {
                this.mediaURL = mediaURL;
                return this;
            }

            /**
             * Status.
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
    public static class EditingBatchJob extends TeaModel {
        @NameInMap("EditingConfig")
        private String editingConfig;

        @NameInMap("Extend")
        private String extend;

        @NameInMap("InputConfig")
        private String inputConfig;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("OutputConfig")
        private String outputConfig;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubJobList")
        private java.util.List < SubJobList> subJobList;

        @NameInMap("UserData")
        private String userData;

        private EditingBatchJob(Builder builder) {
            this.editingConfig = builder.editingConfig;
            this.extend = builder.extend;
            this.inputConfig = builder.inputConfig;
            this.jobId = builder.jobId;
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
        public java.util.List < SubJobList> getSubJobList() {
            return this.subJobList;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String editingConfig; 
            private String extend; 
            private String inputConfig; 
            private String jobId; 
            private String outputConfig; 
            private String status; 
            private java.util.List < SubJobList> subJobList; 
            private String userData; 

            /**
             * EditingConfig.
             */
            public Builder editingConfig(String editingConfig) {
                this.editingConfig = editingConfig;
                return this;
            }

            /**
             * Extend.
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * InputConfig.
             */
            public Builder inputConfig(String inputConfig) {
                this.inputConfig = inputConfig;
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
             * OutputConfig.
             */
            public Builder outputConfig(String outputConfig) {
                this.outputConfig = outputConfig;
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
             * SubJobList.
             */
            public Builder subJobList(java.util.List < SubJobList> subJobList) {
                this.subJobList = subJobList;
                return this;
            }

            /**
             * UserData.
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
