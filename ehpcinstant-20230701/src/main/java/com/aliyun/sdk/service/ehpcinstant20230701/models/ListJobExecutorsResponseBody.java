// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobExecutorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobExecutorsResponseBody</p>
 */
public class ListJobExecutorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExecutorStatus")
    private ExecutorStatus executorStatus;

    @com.aliyun.core.annotation.NameInMap("Executors")
    private java.util.List < Executors> executors;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListJobExecutorsResponseBody(Builder builder) {
        this.executorStatus = builder.executorStatus;
        this.executors = builder.executors;
        this.jobId = builder.jobId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.taskName = builder.taskName;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobExecutorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return executorStatus
     */
    public ExecutorStatus getExecutorStatus() {
        return this.executorStatus;
    }

    /**
     * @return executors
     */
    public java.util.List < Executors> getExecutors() {
        return this.executors;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private ExecutorStatus executorStatus; 
        private java.util.List < Executors> executors; 
        private String jobId; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String taskName; 
        private String totalCount; 

        /**
         * ExecutorStatus.
         */
        public Builder executorStatus(ExecutorStatus executorStatus) {
            this.executorStatus = executorStatus;
            return this;
        }

        /**
         * Executors.
         */
        public Builder executors(java.util.List < Executors> executors) {
            this.executors = executors;
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
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
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
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListJobExecutorsResponseBody build() {
            return new ListJobExecutorsResponseBody(this);
        } 

    } 

    public static class ExecutorStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Integer deleted;

        @com.aliyun.core.annotation.NameInMap("Exception")
        private Integer exception;

        @com.aliyun.core.annotation.NameInMap("Failed")
        private Integer failed;

        @com.aliyun.core.annotation.NameInMap("Initing")
        private Integer initing;

        @com.aliyun.core.annotation.NameInMap("Pending")
        private Integer pending;

        @com.aliyun.core.annotation.NameInMap("Running")
        private Integer running;

        @com.aliyun.core.annotation.NameInMap("Succeeded")
        private Integer succeeded;

        private ExecutorStatus(Builder builder) {
            this.deleted = builder.deleted;
            this.exception = builder.exception;
            this.failed = builder.failed;
            this.initing = builder.initing;
            this.pending = builder.pending;
            this.running = builder.running;
            this.succeeded = builder.succeeded;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutorStatus create() {
            return builder().build();
        }

        /**
         * @return deleted
         */
        public Integer getDeleted() {
            return this.deleted;
        }

        /**
         * @return exception
         */
        public Integer getException() {
            return this.exception;
        }

        /**
         * @return failed
         */
        public Integer getFailed() {
            return this.failed;
        }

        /**
         * @return initing
         */
        public Integer getIniting() {
            return this.initing;
        }

        /**
         * @return pending
         */
        public Integer getPending() {
            return this.pending;
        }

        /**
         * @return running
         */
        public Integer getRunning() {
            return this.running;
        }

        /**
         * @return succeeded
         */
        public Integer getSucceeded() {
            return this.succeeded;
        }

        public static final class Builder {
            private Integer deleted; 
            private Integer exception; 
            private Integer failed; 
            private Integer initing; 
            private Integer pending; 
            private Integer running; 
            private Integer succeeded; 

            /**
             * Deleted.
             */
            public Builder deleted(Integer deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * Exception.
             */
            public Builder exception(Integer exception) {
                this.exception = exception;
                return this;
            }

            /**
             * Failed.
             */
            public Builder failed(Integer failed) {
                this.failed = failed;
                return this;
            }

            /**
             * Initing.
             */
            public Builder initing(Integer initing) {
                this.initing = initing;
                return this;
            }

            /**
             * Pending.
             */
            public Builder pending(Integer pending) {
                this.pending = pending;
                return this;
            }

            /**
             * Running.
             */
            public Builder running(Integer running) {
                this.running = running;
                return this;
            }

            /**
             * Succeeded.
             */
            public Builder succeeded(Integer succeeded) {
                this.succeeded = succeeded;
                return this;
            }

            public ExecutorStatus build() {
                return new ExecutorStatus(this);
            } 

        } 

    }
    public static class Executors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArrayIndex")
        private Integer arrayIndex;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExecutorId")
        private String executorId;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private java.util.List < String > hostName;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private java.util.List < String > ipAddress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
        private String statusReason;

        private Executors(Builder builder) {
            this.arrayIndex = builder.arrayIndex;
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.executorId = builder.executorId;
            this.hostName = builder.hostName;
            this.ipAddress = builder.ipAddress;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Executors create() {
            return builder().build();
        }

        /**
         * @return arrayIndex
         */
        public Integer getArrayIndex() {
            return this.arrayIndex;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return executorId
         */
        public String getExecutorId() {
            return this.executorId;
        }

        /**
         * @return hostName
         */
        public java.util.List < String > getHostName() {
            return this.hostName;
        }

        /**
         * @return ipAddress
         */
        public java.util.List < String > getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        public static final class Builder {
            private Integer arrayIndex; 
            private String createTime; 
            private String endTime; 
            private String executorId; 
            private java.util.List < String > hostName; 
            private java.util.List < String > ipAddress; 
            private String status; 
            private String statusReason; 

            /**
             * ArrayIndex.
             */
            public Builder arrayIndex(Integer arrayIndex) {
                this.arrayIndex = arrayIndex;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExecutorId.
             */
            public Builder executorId(String executorId) {
                this.executorId = executorId;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(java.util.List < String > hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * IpAddress.
             */
            public Builder ipAddress(java.util.List < String > ipAddress) {
                this.ipAddress = ipAddress;
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
             * StatusReason.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            public Executors build() {
                return new Executors(this);
            } 

        } 

    }
}
