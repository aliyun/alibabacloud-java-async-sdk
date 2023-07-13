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
         * Jobs.
         */
        public Builder jobs(java.util.List < Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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

        public ListServerlessJobsResponseBody build() {
            return new ListServerlessJobsResponseBody(this);
        } 

    } 

    public static class Jobs extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("IsArrayJob")
        private Boolean isArrayJob;

        @NameInMap("Name")
        private String name;

        @NameInMap("Owner")
        private String owner;

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

        private Jobs(Builder builder) {
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.isArrayJob = builder.isArrayJob;
            this.name = builder.name;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.queue = builder.queue;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.submitTime = builder.submitTime;
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isArrayJob
         */
        public Boolean getIsArrayJob() {
            return this.isArrayJob;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
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

        public static final class Builder {
            private String endTime; 
            private String id; 
            private Boolean isArrayJob; 
            private String name; 
            private String owner; 
            private String priority; 
            private String queue; 
            private String startTime; 
            private String state; 
            private String submitTime; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
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
             * IsArrayJob.
             */
            public Builder isArrayJob(Boolean isArrayJob) {
                this.isArrayJob = isArrayJob;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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
             * SubmitTime.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
