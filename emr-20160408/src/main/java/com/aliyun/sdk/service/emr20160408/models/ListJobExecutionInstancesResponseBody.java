// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobExecutionInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobExecutionInstancesResponseBody</p>
 */
public class ListJobExecutionInstancesResponseBody extends TeaModel {
    @NameInMap("JobInstances")
    private JobInstances jobInstances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListJobExecutionInstancesResponseBody(Builder builder) {
        this.jobInstances = builder.jobInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobExecutionInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobInstances
     */
    public JobInstances getJobInstances() {
        return this.jobInstances;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private JobInstances jobInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * JobInstances.
         */
        public Builder jobInstances(JobInstances jobInstances) {
            this.jobInstances = jobInstances;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListJobExecutionInstancesResponseBody build() {
            return new ListJobExecutionInstancesResponseBody(this);
        } 

    } 

    public static class JobInstance extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Id")
        private String id;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobName")
        private String jobName;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("RetryInfo")
        private String retryInfo;

        @NameInMap("RunTime")
        private Integer runTime;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        private JobInstance(Builder builder) {
            this.clusterId = builder.clusterId;
            this.id = builder.id;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.jobType = builder.jobType;
            this.retryInfo = builder.retryInfo;
            this.runTime = builder.runTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInstance create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return retryInfo
         */
        public String getRetryInfo() {
            return this.retryInfo;
        }

        /**
         * @return runTime
         */
        public Integer getRunTime() {
            return this.runTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clusterId; 
            private String id; 
            private String jobId; 
            private String jobName; 
            private String jobType; 
            private String retryInfo; 
            private Integer runTime; 
            private Long startTime; 
            private String status; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
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
             * RetryInfo.
             */
            public Builder retryInfo(String retryInfo) {
                this.retryInfo = retryInfo;
                return this;
            }

            /**
             * RunTime.
             */
            public Builder runTime(Integer runTime) {
                this.runTime = runTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public JobInstance build() {
                return new JobInstance(this);
            } 

        } 

    }
    public static class JobInstances extends TeaModel {
        @NameInMap("JobInstance")
        private java.util.List < JobInstance> jobInstance;

        private JobInstances(Builder builder) {
            this.jobInstance = builder.jobInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInstances create() {
            return builder().build();
        }

        /**
         * @return jobInstance
         */
        public java.util.List < JobInstance> getJobInstance() {
            return this.jobInstance;
        }

        public static final class Builder {
            private java.util.List < JobInstance> jobInstance; 

            /**
             * JobInstance.
             */
            public Builder jobInstance(java.util.List < JobInstance> jobInstance) {
                this.jobInstance = jobInstance;
                return this;
            }

            public JobInstances build() {
                return new JobInstances(this);
            } 

        } 

    }
}
