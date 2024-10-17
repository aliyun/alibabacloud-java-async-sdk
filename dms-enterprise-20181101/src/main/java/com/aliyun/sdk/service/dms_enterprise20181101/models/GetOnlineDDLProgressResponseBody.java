// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetOnlineDDLProgressResponseBody} extends {@link TeaModel}
 *
 * <p>GetOnlineDDLProgressResponseBody</p>
 */
public class GetOnlineDDLProgressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("OnlineDDLTaskDetail")
    private OnlineDDLTaskDetail onlineDDLTaskDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The details of the task.</p>
         */
        public Builder onlineDDLTaskDetail(OnlineDDLTaskDetail onlineDDLTaskDetail) {
            this.onlineDDLTaskDetail = onlineDDLTaskDetail;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>34E01EDD-6A16-4CF0-9541-C644D1BE01AA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOnlineDDLProgressResponseBody build() {
            return new GetOnlineDDLProgressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOnlineDDLProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetOnlineDDLProgressResponseBody</p>
     */
    public static class OnlineDDLTaskDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CleanStrategy")
        private String cleanStrategy;

        @com.aliyun.core.annotation.NameInMap("CopyChunkMode")
        private String copyChunkMode;

        @com.aliyun.core.annotation.NameInMap("CopyChunkSize")
        private Long copyChunkSize;

        @com.aliyun.core.annotation.NameInMap("CopyCount")
        private Long copyCount;

        @com.aliyun.core.annotation.NameInMap("CopyTotal")
        private Long copyTotal;

        @com.aliyun.core.annotation.NameInMap("CutoverFailRetryTimes")
        private Long cutoverFailRetryTimes;

        @com.aliyun.core.annotation.NameInMap("CutoverLockTimeSeconds")
        private Long cutoverLockTimeSeconds;

        @com.aliyun.core.annotation.NameInMap("CutoverWindowEndTime")
        private String cutoverWindowEndTime;

        @com.aliyun.core.annotation.NameInMap("CutoverWindowStartTime")
        private String cutoverWindowStartTime;

        @com.aliyun.core.annotation.NameInMap("DelaySeconds")
        private Long delaySeconds;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("ProgressRatio")
        private String progressRatio;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
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
             * <p>The cleanup policy of the original table after the cut-over. Valid values:</p>
             * <ul>
             * <li><strong>DROP</strong>: Invalid original tables are deleted.</li>
             * <li><strong>MOVE</strong>: Invalid original tables are moved to the test database. You can delete the tables manually.</li>
             * <li><strong>NOTHING</strong>: Invalid original tables are retained in the original database. You can delete the tables manually.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DROP</p>
             */
            public Builder cleanStrategy(String cleanStrategy) {
                this.cleanStrategy = cleanStrategy;
                return this;
            }

            /**
             * <p>The policy of full replication. Valid values:</p>
             * <ul>
             * <li><strong>AUTO</strong>: DMS dynamically adjusts the chunk size based on the performance of the database. Tables are locked for less than 1.5 seconds during a single replication operation.</li>
             * <li><strong>RUNNING</strong>: DMS uses the specified value of the CopyChunkSize parameter. The valid value of the CopyChunkSize parameter ranges from 1 to 60000. If you set this parameter to RUNNING, you must specify the CopyChunkSize parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AUTO</p>
             */
            public Builder copyChunkMode(String copyChunkMode) {
                this.copyChunkMode = copyChunkMode;
                return this;
            }

            /**
             * <p>The size of each chunk that is used to replicate data. This parameter is used to specify the size of each chunk. A larger chunk size increases the replication efficiency and decreases the business performance.</p>
             * <blockquote>
             * <p>During full replication, the original table is divided into N small chunks and each chunk is replicated to the temporary table one by one. By default, DMS dynamically adjusts the size of each chunk.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder copyChunkSize(Long copyChunkSize) {
                this.copyChunkSize = copyChunkSize;
                return this;
            }

            /**
             * <p>The actual amount of data replicated from the original table in the lock-free change operation.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder copyCount(Long copyCount) {
                this.copyCount = copyCount;
                return this;
            }

            /**
             * <p>The estimated total number of rows of the data. The value is obtained from the statistical data in the information_schema database. In most cases, the estimated total number of rows is smaller than the actual number of rows in a table.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder copyTotal(Long copyTotal) {
                this.copyTotal = copyTotal;
                return this;
            }

            /**
             * <p>The number of retries when the cut-over fails.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder cutoverFailRetryTimes(Long cutoverFailRetryTimes) {
                this.cutoverFailRetryTimes = cutoverFailRetryTimes;
                return this;
            }

            /**
             * <p>The maximum period of time that a table can be locked during cut-over. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cutoverLockTimeSeconds(Long cutoverLockTimeSeconds) {
                this.cutoverLockTimeSeconds = cutoverLockTimeSeconds;
                return this;
            }

            /**
             * <p>The end of the time window of the cut-over operation. This value is at least 30 minutes later than the CutoverWindowStartTime parameter. Default value: 23:59:59</p>
             * 
             * <strong>example:</strong>
             * <p>13:00:00</p>
             */
            public Builder cutoverWindowEndTime(String cutoverWindowEndTime) {
                this.cutoverWindowEndTime = cutoverWindowEndTime;
                return this;
            }

            /**
             * <p>The beginning of the time window of the cut-over operation. Default value: 00:00:00. This parameter controls the time window of the cut-over. Cut-over can be performed only when the cut-over conditions are met and the time is within the specified time window. If the time is not within the time window, the cut-over operation is not performed until the time reaches the beginning of the time window.</p>
             * 
             * <strong>example:</strong>
             * <p>12:00:00</p>
             */
            public Builder cutoverWindowStartTime(String cutoverWindowStartTime) {
                this.cutoverWindowStartTime = cutoverWindowStartTime;
                return this;
            }

            /**
             * <p>The replay latency of DMS. Unit: seconds. The replay latency is the period of time that is taken to replay the binary logs of the table to the temporary table. The latency does not indicate the data migration latency between a primary database and a secondary database.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delaySeconds(Long delaySeconds) {
                this.delaySeconds = delaySeconds;
                return this;
            }

            /**
             * <p>The state of the task. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The task is being initialized.</li>
             * <li><strong>SUCCESS</strong>: The task is complete.</li>
             * <li><strong>RUNNING</strong>: The task is being executed.</li>
             * <li><strong>WAITING_CUTOVER</strong>: The task is waiting for cut-over.</li>
             * <li><strong>RESTARTING</strong>: The task is restarting.</li>
             * <li><strong>PAUSE</strong>: The task is suspended.</li>
             * <li><strong>UNSUPPORTED</strong>: The task is not supported.</li>
             * <li><strong>CANCELED</strong>: The task is canceled.</li>
             * <li><strong>FAIL</strong>: The task failed.</li>
             * <li><strong>INTERRUPT</strong>: The task is interrupted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>The estimated execution progress. The actual progress is subject to the task status.</p>
             * 
             * <strong>example:</strong>
             * <p>90%</p>
             */
            public Builder progressRatio(String progressRatio) {
                this.progressRatio = progressRatio;
                return this;
            }

            /**
             * <p>The description of the task status.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
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
