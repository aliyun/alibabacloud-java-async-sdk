// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobOutputStatisticInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobOutputStatisticInfoResponseBody</p>
 */
public class GetJobOutputStatisticInfoResponseBody extends TeaModel {
    @NameInMap("JobOutputList")
    private JobOutputList jobOutputList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private GetJobOutputStatisticInfoResponseBody(Builder builder) {
        this.jobOutputList = builder.jobOutputList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobOutputStatisticInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobOutputList
     */
    public JobOutputList getJobOutputList() {
        return this.jobOutputList;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private JobOutputList jobOutputList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * JobOutputList.
         */
        public Builder jobOutputList(JobOutputList jobOutputList) {
            this.jobOutputList = jobOutputList;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetJobOutputStatisticInfoResponseBody build() {
            return new GetJobOutputStatisticInfoResponseBody(this);
        } 

    } 

    public static class ClusterStatJobOutput extends TeaModel {
        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("BytesOutput")
        private Long bytesOutput;

        @NameInMap("FinishTime")
        private Long finishTime;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Queue")
        private String queue;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("User")
        private String user;

        private ClusterStatJobOutput(Builder builder) {
            this.applicationId = builder.applicationId;
            this.bytesOutput = builder.bytesOutput;
            this.finishTime = builder.finishTime;
            this.jobId = builder.jobId;
            this.name = builder.name;
            this.queue = builder.queue;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterStatJobOutput create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return bytesOutput
         */
        public Long getBytesOutput() {
            return this.bytesOutput;
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
            private Long bytesOutput; 
            private Long finishTime; 
            private String jobId; 
            private String name; 
            private String queue; 
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
             * BytesOutput.
             */
            public Builder bytesOutput(Long bytesOutput) {
                this.bytesOutput = bytesOutput;
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

            public ClusterStatJobOutput build() {
                return new ClusterStatJobOutput(this);
            } 

        } 

    }
    public static class JobOutputList extends TeaModel {
        @NameInMap("ClusterStatJobOutput")
        private java.util.List < ClusterStatJobOutput> clusterStatJobOutput;

        private JobOutputList(Builder builder) {
            this.clusterStatJobOutput = builder.clusterStatJobOutput;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobOutputList create() {
            return builder().build();
        }

        /**
         * @return clusterStatJobOutput
         */
        public java.util.List < ClusterStatJobOutput> getClusterStatJobOutput() {
            return this.clusterStatJobOutput;
        }

        public static final class Builder {
            private java.util.List < ClusterStatJobOutput> clusterStatJobOutput; 

            /**
             * ClusterStatJobOutput.
             */
            public Builder clusterStatJobOutput(java.util.List < ClusterStatJobOutput> clusterStatJobOutput) {
                this.clusterStatJobOutput = clusterStatJobOutput;
                return this;
            }

            public JobOutputList build() {
                return new JobOutputList(this);
            } 

        } 

    }
}
