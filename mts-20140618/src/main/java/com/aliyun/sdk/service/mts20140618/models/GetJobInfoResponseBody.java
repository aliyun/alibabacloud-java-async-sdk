// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobInfoResponseBody</p>
 */
public class GetJobInfoResponseBody extends TeaModel {
    @NameInMap("MtsTransferJob")
    private MtsTransferJob mtsTransferJob;

    @NameInMap("RequestId")
    private String requestId;

    private GetJobInfoResponseBody(Builder builder) {
        this.mtsTransferJob = builder.mtsTransferJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return mtsTransferJob
     */
    public MtsTransferJob getMtsTransferJob() {
        return this.mtsTransferJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MtsTransferJob mtsTransferJob; 
        private String requestId; 

        /**
         * MtsTransferJob.
         */
        public Builder mtsTransferJob(MtsTransferJob mtsTransferJob) {
            this.mtsTransferJob = mtsTransferJob;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJobInfoResponseBody build() {
            return new GetJobInfoResponseBody(this);
        } 

    } 

    public static class MtsTransferJob extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Extend")
        private String extend;

        @NameInMap("FinishedTime")
        private String finishedTime;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("RequestJson")
        private String requestJson;

        @NameInMap("State")
        private String state;

        @NameInMap("UserData")
        private String userData;

        private MtsTransferJob(Builder builder) {
            this.createTime = builder.createTime;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.extend = builder.extend;
            this.finishedTime = builder.finishedTime;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.modifiedTime = builder.modifiedTime;
            this.requestJson = builder.requestJson;
            this.state = builder.state;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MtsTransferJob create() {
            return builder().build();
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
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return extend
         */
        public String getExtend() {
            return this.extend;
        }

        /**
         * @return finishedTime
         */
        public String getFinishedTime() {
            return this.finishedTime;
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
         * @return requestJson
         */
        public String getRequestJson() {
            return this.requestJson;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
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
            private String errorMessage; 
            private String extend; 
            private String finishedTime; 
            private String jobId; 
            private String jobType; 
            private String modifiedTime; 
            private String requestJson; 
            private String state; 
            private String userData; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
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
             * Extend.
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * FinishedTime.
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
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
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * RequestJson.
             */
            public Builder requestJson(String requestJson) {
                this.requestJson = requestJson;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public MtsTransferJob build() {
                return new MtsTransferJob(this);
            } 

        } 

    }
}
