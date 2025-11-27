// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link ListJobExecutorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobExecutorsResponseBody</p>
 */
public class ListJobExecutorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExecutorStatus")
    private ExecutorStatus executorStatus;

    @com.aliyun.core.annotation.NameInMap("Executors")
    private java.util.List<Executors> executors;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Executors> getExecutors() {
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
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
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
        private java.util.List<Executors> executors; 
        private String jobId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String taskName; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListJobExecutorsResponseBody model) {
            this.executorStatus = model.executorStatus;
            this.executors = model.executors;
            this.jobId = model.jobId;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.taskName = model.taskName;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Executor status statistics.</p>
         */
        public Builder executorStatus(ExecutorStatus executorStatus) {
            this.executorStatus = executorStatus;
            return this;
        }

        /**
         * <p>The executor list.</p>
         */
        public Builder executors(java.util.List<Executors> executors) {
            this.executors = executors;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-xxxx</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The job name.</p>
         * 
         * <strong>example:</strong>
         * <p>task0</p>
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The total number of list entries.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListJobExecutorsResponseBody build() {
            return new ListJobExecutorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobExecutorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobExecutorsResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("Restarting")
        private Integer restarting;

        @com.aliyun.core.annotation.NameInMap("Running")
        private Integer running;

        @com.aliyun.core.annotation.NameInMap("Succeeded")
        private Integer succeeded;

        @com.aliyun.core.annotation.NameInMap("Suspended")
        private Integer suspended;

        private ExecutorStatus(Builder builder) {
            this.deleted = builder.deleted;
            this.exception = builder.exception;
            this.failed = builder.failed;
            this.initing = builder.initing;
            this.pending = builder.pending;
            this.restarting = builder.restarting;
            this.running = builder.running;
            this.succeeded = builder.succeeded;
            this.suspended = builder.suspended;
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
         * @return restarting
         */
        public Integer getRestarting() {
            return this.restarting;
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

        /**
         * @return suspended
         */
        public Integer getSuspended() {
            return this.suspended;
        }

        public static final class Builder {
            private Integer deleted; 
            private Integer exception; 
            private Integer failed; 
            private Integer initing; 
            private Integer pending; 
            private Integer restarting; 
            private Integer running; 
            private Integer succeeded; 
            private Integer suspended; 

            private Builder() {
            } 

            private Builder(ExecutorStatus model) {
                this.deleted = model.deleted;
                this.exception = model.exception;
                this.failed = model.failed;
                this.initing = model.initing;
                this.pending = model.pending;
                this.restarting = model.restarting;
                this.running = model.running;
                this.succeeded = model.succeeded;
                this.suspended = model.suspended;
            } 

            /**
             * <p>The number of executers in the Deleted state.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder deleted(Integer deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * <p>The number of executers in the abnormal state.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder exception(Integer exception) {
                this.exception = exception;
                return this;
            }

            /**
             * <p>The number of executers in the Failed state.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Integer failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The number of executers in the initialized state.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder initing(Integer initing) {
                this.initing = initing;
                return this;
            }

            /**
             * <p>The number of executers in the queued state.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pending(Integer pending) {
                this.pending = pending;
                return this;
            }

            /**
             * Restarting.
             */
            public Builder restarting(Integer restarting) {
                this.restarting = restarting;
                return this;
            }

            /**
             * <p>The number of executers in the running state.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder running(Integer running) {
                this.running = running;
                return this;
            }

            /**
             * <p>The number of executoresin the Successful state.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder succeeded(Integer succeeded) {
                this.succeeded = succeeded;
                return this;
            }

            /**
             * Suspended.
             */
            public Builder suspended(Integer suspended) {
                this.suspended = suspended;
                return this;
            }

            public ExecutorStatus build() {
                return new ExecutorStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobExecutorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobExecutorsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The key of the executor tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the executor tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobExecutorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobExecutorsResponseBody</p>
     */
    public static class Executors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationSpec")
        private String allocationSpec;

        @com.aliyun.core.annotation.NameInMap("ArrayIndex")
        private Integer arrayIndex;

        @com.aliyun.core.annotation.NameInMap("BlockDuration")
        private Integer blockDuration;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExecutorId")
        private String executorId;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private String expirationTime;

        @com.aliyun.core.annotation.NameInMap("ExternalIpAddress")
        private java.util.List<String> externalIpAddress;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private java.util.List<String> hostName;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private java.util.List<String> ipAddress;

        @com.aliyun.core.annotation.NameInMap("Preemptible")
        private Boolean preemptible;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private Executors(Builder builder) {
            this.allocationSpec = builder.allocationSpec;
            this.arrayIndex = builder.arrayIndex;
            this.blockDuration = builder.blockDuration;
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.executorId = builder.executorId;
            this.expirationTime = builder.expirationTime;
            this.externalIpAddress = builder.externalIpAddress;
            this.hostName = builder.hostName;
            this.ipAddress = builder.ipAddress;
            this.preemptible = builder.preemptible;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Executors create() {
            return builder().build();
        }

        /**
         * @return allocationSpec
         */
        public String getAllocationSpec() {
            return this.allocationSpec;
        }

        /**
         * @return arrayIndex
         */
        public Integer getArrayIndex() {
            return this.arrayIndex;
        }

        /**
         * @return blockDuration
         */
        public Integer getBlockDuration() {
            return this.blockDuration;
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
         * @return expirationTime
         */
        public String getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return externalIpAddress
         */
        public java.util.List<String> getExternalIpAddress() {
            return this.externalIpAddress;
        }

        /**
         * @return hostName
         */
        public java.util.List<String> getHostName() {
            return this.hostName;
        }

        /**
         * @return ipAddress
         */
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return preemptible
         */
        public Boolean getPreemptible() {
            return this.preemptible;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
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

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String allocationSpec; 
            private Integer arrayIndex; 
            private Integer blockDuration; 
            private String createTime; 
            private String endTime; 
            private String executorId; 
            private String expirationTime; 
            private java.util.List<String> externalIpAddress; 
            private java.util.List<String> hostName; 
            private java.util.List<String> ipAddress; 
            private Boolean preemptible; 
            private String startTime; 
            private String status; 
            private String statusReason; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(Executors model) {
                this.allocationSpec = model.allocationSpec;
                this.arrayIndex = model.arrayIndex;
                this.blockDuration = model.blockDuration;
                this.createTime = model.createTime;
                this.endTime = model.endTime;
                this.executorId = model.executorId;
                this.expirationTime = model.expirationTime;
                this.externalIpAddress = model.externalIpAddress;
                this.hostName = model.hostName;
                this.ipAddress = model.ipAddress;
                this.preemptible = model.preemptible;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusReason = model.statusReason;
                this.tags = model.tags;
            } 

            /**
             * AllocationSpec.
             */
            public Builder allocationSpec(String allocationSpec) {
                this.allocationSpec = allocationSpec;
                return this;
            }

            /**
             * <p>The executor index number.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder arrayIndex(Integer arrayIndex) {
                this.arrayIndex = arrayIndex;
                return this;
            }

            /**
             * BlockDuration.
             */
            public Builder blockDuration(Integer blockDuration) {
                this.blockDuration = blockDuration;
                return this;
            }

            /**
             * <p>The time when the storage resource was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-20 10:04:10</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-20 10:04:18</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The executor ID. The format is JobId-TaskName-ArrayIndex.</p>
             * 
             * <strong>example:</strong>
             * <p>job-xxxx-Task0-1</p>
             */
            public Builder executorId(String executorId) {
                this.executorId = executorId;
                return this;
            }

            /**
             * ExpirationTime.
             */
            public Builder expirationTime(String expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * <p>The list of public IP addresses of the nodes.</p>
             */
            public Builder externalIpAddress(java.util.List<String> externalIpAddress) {
                this.externalIpAddress = externalIpAddress;
                return this;
            }

            /**
             * <p>An array of node hostnames.</p>
             */
            public Builder hostName(java.util.List<String> hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The list of node IP addresses.</p>
             */
            public Builder ipAddress(java.util.List<String> ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * Preemptible.
             */
            public Builder preemptible(Boolean preemptible) {
                this.preemptible = preemptible;
                return this;
            }

            /**
             * <p>The create time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-20 10:04:13</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the executor. Valid values:</p>
             * <ul>
             * <li>Pending</li>
             * <li>Initing</li>
             * <li>Succeed</li>
             * <li>Failed</li>
             * <li>Running</li>
             * <li>Unknown</li>
             * <li>Exception</li>
             * <li>Retrying</li>
             * <li>Expired</li>
             * <li>Deleted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The description of the status reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Creating executor</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * <p>The list of executor tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Executors build() {
                return new Executors(this);
            } 

        } 

    }
}
