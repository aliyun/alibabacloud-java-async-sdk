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
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The details of the task.
         */
        public Builder onlineDDLTaskDetail(OnlineDDLTaskDetail onlineDDLTaskDetail) {
            this.onlineDDLTaskDetail = onlineDDLTaskDetail;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
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
             * The cleanup policy of the original table after the cut-over. Valid values:
             * <p>
             * 
             * *   **DROP**: Invalid original tables are deleted.
             * *   **MOVE**: Invalid original tables are moved to the test database. You can delete the tables manually.
             * *   **NOTHING**: Invalid original tables are retained in the original database. You can delete the tables manually.
             */
            public Builder cleanStrategy(String cleanStrategy) {
                this.cleanStrategy = cleanStrategy;
                return this;
            }

            /**
             * The policy of full replication. Valid values:
             * <p>
             * 
             * *   **AUTO**: DMS dynamically adjusts the chunk size based on the performance of the database. Tables are locked for less than 1.5 seconds during a single replication operation.
             * *   **RUNNING**: DMS uses the specified value of the CopyChunkSize parameter. The valid value of the CopyChunkSize parameter ranges from 1 to 60000. If you set this parameter to RUNNING, you must specify the CopyChunkSize parameter.
             */
            public Builder copyChunkMode(String copyChunkMode) {
                this.copyChunkMode = copyChunkMode;
                return this;
            }

            /**
             * The size of each chunk that is used to replicate data. This parameter is used to specify the size of each chunk. A larger chunk size increases the replication efficiency and decreases the business performance.
             * <p>
             * 
             * > During full replication, the original table is divided into N small chunks and each chunk is replicated to the temporary table one by one. By default, DMS dynamically adjusts the size of each chunk.
             */
            public Builder copyChunkSize(Long copyChunkSize) {
                this.copyChunkSize = copyChunkSize;
                return this;
            }

            /**
             * The actual amount of data replicated from the original table in the lock-free change operation.
             */
            public Builder copyCount(Long copyCount) {
                this.copyCount = copyCount;
                return this;
            }

            /**
             * The estimated total number of rows of the data. The value is obtained from the statistical data in the information_schema database. In most cases, the estimated total number of rows is smaller than the actual number of rows in a table.
             */
            public Builder copyTotal(Long copyTotal) {
                this.copyTotal = copyTotal;
                return this;
            }

            /**
             * The number of retries when the cut-over fails.
             */
            public Builder cutoverFailRetryTimes(Long cutoverFailRetryTimes) {
                this.cutoverFailRetryTimes = cutoverFailRetryTimes;
                return this;
            }

            /**
             * The maximum period of time that a table can be locked during cut-over. Unit: seconds.
             */
            public Builder cutoverLockTimeSeconds(Long cutoverLockTimeSeconds) {
                this.cutoverLockTimeSeconds = cutoverLockTimeSeconds;
                return this;
            }

            /**
             * The end of the time window of the cut-over operation. This value is at least 30 minutes later than the CutoverWindowStartTime parameter. Default value: 23:59:59
             */
            public Builder cutoverWindowEndTime(String cutoverWindowEndTime) {
                this.cutoverWindowEndTime = cutoverWindowEndTime;
                return this;
            }

            /**
             * The beginning of the time window of the cut-over operation. Default value: 00:00:00. This parameter controls the time window of the cut-over. Cut-over can be performed only when the cut-over conditions are met and the time is within the specified time window. If the time is not within the time window, the cut-over operation is not performed until the time reaches the beginning of the time window.
             */
            public Builder cutoverWindowStartTime(String cutoverWindowStartTime) {
                this.cutoverWindowStartTime = cutoverWindowStartTime;
                return this;
            }

            /**
             * The replay latency of DMS. Unit: seconds. The replay latency is the period of time that is taken to replay the binary logs of the table to the temporary table. The latency does not indicate the data migration latency between a primary database and a secondary database.
             */
            public Builder delaySeconds(Long delaySeconds) {
                this.delaySeconds = delaySeconds;
                return this;
            }

            /**
             * The state of the task. Valid values:
             * <p>
             * 
             * *   **INIT**: The task is being initialized.
             * *   **SUCCESS**: The task is complete.
             * *   **RUNNING**: The task is being executed.
             * *   **WAITING_CUTOVER**: The task is waiting for cut-over.
             * *   **RESTARTING**: The task is restarting.
             * *   **PAUSE**: The task is suspended.
             * *   **UNSUPPORTED**: The task is not supported.
             * *   **CANCELED**: The task is canceled.
             * *   **FAIL**: The task failed.
             * *   **INTERRUPT**: The task is interrupted.
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * The estimated execution progress. The actual progress is subject to the task status.
             */
            public Builder progressRatio(String progressRatio) {
                this.progressRatio = progressRatio;
                return this;
            }

            /**
             * The description of the task status.
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
