// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobRunningTimeStatisticInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobRunningTimeStatisticInfoResponseBody</p>
 */
public class GetJobRunningTimeStatisticInfoResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RunningTimeList")
    private RunningTimeList runningTimeList;

    @NameInMap("Total")
    private Integer total;

    private GetJobRunningTimeStatisticInfoResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.runningTimeList = builder.runningTimeList;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobRunningTimeStatisticInfoResponseBody create() {
        return builder().build();
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
     * @return runningTimeList
     */
    public RunningTimeList getRunningTimeList() {
        return this.runningTimeList;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private RunningTimeList runningTimeList; 
        private Integer total; 

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
         * RunningTimeList.
         */
        public Builder runningTimeList(RunningTimeList runningTimeList) {
            this.runningTimeList = runningTimeList;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetJobRunningTimeStatisticInfoResponseBody build() {
            return new GetJobRunningTimeStatisticInfoResponseBody(this);
        } 

    } 

    public static class ClusterStatJobRunningTime extends TeaModel {
        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("FinishTime")
        private Long finishTime;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Queue")
        private String queue;

        @NameInMap("RunningTime")
        private Long runningTime;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("User")
        private String user;

        private ClusterStatJobRunningTime(Builder builder) {
            this.applicationId = builder.applicationId;
            this.finishTime = builder.finishTime;
            this.jobId = builder.jobId;
            this.name = builder.name;
            this.queue = builder.queue;
            this.runningTime = builder.runningTime;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterStatJobRunningTime create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return runningTime
         */
        public Long getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String applicationId; 
            private Long finishTime; 
            private String jobId; 
            private String name; 
            private String queue; 
            private Long runningTime; 
            private Long startTime; 
            private String state; 
            private String user; 

            /**
             * ApplicationId.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * RunningTime.
             */
            public Builder runningTime(Long runningTime) {
                this.runningTime = runningTime;
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
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * User.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public ClusterStatJobRunningTime build() {
                return new ClusterStatJobRunningTime(this);
            } 

        } 

    }
    public static class RunningTimeList extends TeaModel {
        @NameInMap("ClusterStatJobRunningTime")
        private java.util.List < ClusterStatJobRunningTime> clusterStatJobRunningTime;

        private RunningTimeList(Builder builder) {
            this.clusterStatJobRunningTime = builder.clusterStatJobRunningTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunningTimeList create() {
            return builder().build();
        }

        /**
         * @return clusterStatJobRunningTime
         */
        public java.util.List < ClusterStatJobRunningTime> getClusterStatJobRunningTime() {
            return this.clusterStatJobRunningTime;
        }

        public static final class Builder {
            private java.util.List < ClusterStatJobRunningTime> clusterStatJobRunningTime; 

            /**
             * ClusterStatJobRunningTime.
             */
            public Builder clusterStatJobRunningTime(java.util.List < ClusterStatJobRunningTime> clusterStatJobRunningTime) {
                this.clusterStatJobRunningTime = clusterStatJobRunningTime;
                return this;
            }

            public RunningTimeList build() {
                return new RunningTimeList(this);
            } 

        } 

    }
}
