// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOnlineDDLProgressResponseBody} extends {@link TeaModel}
 *
 * <p>GetOnlineDDLProgressResponseBody</p>
 */
public class GetOnlineDDLProgressResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("OnlineDDLTaskDetail")
    private OnlineDDLTaskDetail onlineDDLTaskDetail;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetOnlineDDLProgressResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.onlineDDLTaskDetail = builder.onlineDDLTaskDetail;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOnlineDDLProgressResponseBody create() {
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
     * @return onlineDDLTaskDetail
     */
    public OnlineDDLTaskDetail getOnlineDDLTaskDetail() {
        return this.onlineDDLTaskDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private OnlineDDLTaskDetail onlineDDLTaskDetail; 
        private String requestId; 
        private Boolean success; 

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
         * OnlineDDLTaskDetail.
         */
        public Builder onlineDDLTaskDetail(OnlineDDLTaskDetail onlineDDLTaskDetail) {
            this.onlineDDLTaskDetail = onlineDDLTaskDetail;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOnlineDDLProgressResponseBody build() {
            return new GetOnlineDDLProgressResponseBody(this);
        } 

    } 

    public static class OnlineDDLTaskDetail extends TeaModel {
        @NameInMap("CleanStrategy")
        private String cleanStrategy;

        @NameInMap("CopyChunkMode")
        private String copyChunkMode;

        @NameInMap("CopyChunkSize")
        private Long copyChunkSize;

        @NameInMap("CopyCount")
        private Long copyCount;

        @NameInMap("CopyTotal")
        private Long copyTotal;

        @NameInMap("CutoverFailRetryTimes")
        private Long cutoverFailRetryTimes;

        @NameInMap("CutoverLockTimeSeconds")
        private Long cutoverLockTimeSeconds;

        @NameInMap("CutoverWindowEndTime")
        private String cutoverWindowEndTime;

        @NameInMap("CutoverWindowStartTime")
        private String cutoverWindowStartTime;

        @NameInMap("DelaySeconds")
        private Long delaySeconds;

        @NameInMap("JobStatus")
        private String jobStatus;

        @NameInMap("ProgressRatio")
        private String progressRatio;

        @NameInMap("StatusDesc")
        private String statusDesc;

        private OnlineDDLTaskDetail(Builder builder) {
            this.cleanStrategy = builder.cleanStrategy;
            this.copyChunkMode = builder.copyChunkMode;
            this.copyChunkSize = builder.copyChunkSize;
            this.copyCount = builder.copyCount;
            this.copyTotal = builder.copyTotal;
            this.cutoverFailRetryTimes = builder.cutoverFailRetryTimes;
            this.cutoverLockTimeSeconds = builder.cutoverLockTimeSeconds;
            this.cutoverWindowEndTime = builder.cutoverWindowEndTime;
            this.cutoverWindowStartTime = builder.cutoverWindowStartTime;
            this.delaySeconds = builder.delaySeconds;
            this.jobStatus = builder.jobStatus;
            this.progressRatio = builder.progressRatio;
            this.statusDesc = builder.statusDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnlineDDLTaskDetail create() {
            return builder().build();
        }

        /**
         * @return cleanStrategy
         */
        public String getCleanStrategy() {
            return this.cleanStrategy;
        }

        /**
         * @return copyChunkMode
         */
        public String getCopyChunkMode() {
            return this.copyChunkMode;
        }

        /**
         * @return copyChunkSize
         */
        public Long getCopyChunkSize() {
            return this.copyChunkSize;
        }

        /**
         * @return copyCount
         */
        public Long getCopyCount() {
            return this.copyCount;
        }

        /**
         * @return copyTotal
         */
        public Long getCopyTotal() {
            return this.copyTotal;
        }

        /**
         * @return cutoverFailRetryTimes
         */
        public Long getCutoverFailRetryTimes() {
            return this.cutoverFailRetryTimes;
        }

        /**
         * @return cutoverLockTimeSeconds
         */
        public Long getCutoverLockTimeSeconds() {
            return this.cutoverLockTimeSeconds;
        }

        /**
         * @return cutoverWindowEndTime
         */
        public String getCutoverWindowEndTime() {
            return this.cutoverWindowEndTime;
        }

        /**
         * @return cutoverWindowStartTime
         */
        public String getCutoverWindowStartTime() {
            return this.cutoverWindowStartTime;
        }

        /**
         * @return delaySeconds
         */
        public Long getDelaySeconds() {
            return this.delaySeconds;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return progressRatio
         */
        public String getProgressRatio() {
            return this.progressRatio;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public static final class Builder {
            private String cleanStrategy; 
            private String copyChunkMode; 
            private Long copyChunkSize; 
            private Long copyCount; 
            private Long copyTotal; 
            private Long cutoverFailRetryTimes; 
            private Long cutoverLockTimeSeconds; 
            private String cutoverWindowEndTime; 
            private String cutoverWindowStartTime; 
            private Long delaySeconds; 
            private String jobStatus; 
            private String progressRatio; 
            private String statusDesc; 

            /**
             * CleanStrategy.
             */
            public Builder cleanStrategy(String cleanStrategy) {
                this.cleanStrategy = cleanStrategy;
                return this;
            }

            /**
             * CopyChunkMode.
             */
            public Builder copyChunkMode(String copyChunkMode) {
                this.copyChunkMode = copyChunkMode;
                return this;
            }

            /**
             * CopyChunkSize.
             */
            public Builder copyChunkSize(Long copyChunkSize) {
                this.copyChunkSize = copyChunkSize;
                return this;
            }

            /**
             * CopyCount.
             */
            public Builder copyCount(Long copyCount) {
                this.copyCount = copyCount;
                return this;
            }

            /**
             * CopyTotal.
             */
            public Builder copyTotal(Long copyTotal) {
                this.copyTotal = copyTotal;
                return this;
            }

            /**
             * CutoverFailRetryTimes.
             */
            public Builder cutoverFailRetryTimes(Long cutoverFailRetryTimes) {
                this.cutoverFailRetryTimes = cutoverFailRetryTimes;
                return this;
            }

            /**
             * CutoverLockTimeSeconds.
             */
            public Builder cutoverLockTimeSeconds(Long cutoverLockTimeSeconds) {
                this.cutoverLockTimeSeconds = cutoverLockTimeSeconds;
                return this;
            }

            /**
             * CutoverWindowEndTime.
             */
            public Builder cutoverWindowEndTime(String cutoverWindowEndTime) {
                this.cutoverWindowEndTime = cutoverWindowEndTime;
                return this;
            }

            /**
             * CutoverWindowStartTime.
             */
            public Builder cutoverWindowStartTime(String cutoverWindowStartTime) {
                this.cutoverWindowStartTime = cutoverWindowStartTime;
                return this;
            }

            /**
             * DelaySeconds.
             */
            public Builder delaySeconds(Long delaySeconds) {
                this.delaySeconds = delaySeconds;
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
             * ProgressRatio.
             */
            public Builder progressRatio(String progressRatio) {
                this.progressRatio = progressRatio;
                return this;
            }

            /**
             * StatusDesc.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            public OnlineDDLTaskDetail build() {
                return new OnlineDDLTaskDetail(this);
            } 

        } 

    }
}
