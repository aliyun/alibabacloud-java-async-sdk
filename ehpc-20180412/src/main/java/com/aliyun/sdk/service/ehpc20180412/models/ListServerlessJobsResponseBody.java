// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServerlessJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServerlessJobsResponseBody</p>
 */
public class ListServerlessJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    private java.util.List < Jobs> jobs;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListServerlessJobsResponseBody(Builder builder) {
        this.jobs = builder.jobs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServerlessJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobs
     */
    public java.util.List < Jobs> getJobs() {
        return this.jobs;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
        private java.util.List < Jobs> jobs; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The list of serverless jobs.
         */
        public Builder jobs(java.util.List < Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * The page number returned.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServerlessJobsResponseBody build() {
            return new ListServerlessJobsResponseBody(this);
        } 

    } 

    public static class Jobs extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("IsArrayJob")
        private Boolean isArrayJob;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobName")
        private String jobName;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("Queue")
        private String queue;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("SubmitTime")
        private String submitTime;

        @NameInMap("User")
        private String user;

        private Jobs(Builder builder) {
            this.endTime = builder.endTime;
            this.isArrayJob = builder.isArrayJob;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.priority = builder.priority;
            this.queue = builder.queue;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.submitTime = builder.submitTime;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return isArrayJob
         */
        public Boolean getIsArrayJob() {
            return this.isArrayJob;
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
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String endTime; 
            private Boolean isArrayJob; 
            private String jobId; 
            private String jobName; 
            private String priority; 
            private String queue; 
            private String startTime; 
            private String state; 
            private String submitTime; 
            private String user; 

            /**
             * The time at which the serverless job ended.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Indicates whether the job is an array job. Valid values:
             * <p>
             * 
             * *   True: yes
             * *   False: no
             */
            public Builder isArrayJob(Boolean isArrayJob) {
                this.isArrayJob = isArrayJob;
                return this;
            }

            /**
             * The ID of the serverless job or subtask (array job).
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The name of the serverless job.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * The scheduling priority of the serverless job. Valid values are 0 to 999. A greater value indicates a higher priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The name of the queue in which the serverless job is run.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * The time at which the serverless job started.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the serverless job. Valid values:
             * <p>
             * 
             * *   Pending
             * *   Initing
             * *   Running
             * *   Succeeded
             * *   Canceled
             * *   Failed
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The time at which the serverless job is submitted.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * The username that is used to run the serverless job.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
