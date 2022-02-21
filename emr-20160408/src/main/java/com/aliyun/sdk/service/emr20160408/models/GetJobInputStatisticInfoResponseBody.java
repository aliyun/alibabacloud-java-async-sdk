// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobInputStatisticInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobInputStatisticInfoResponseBody</p>
 */
public class GetJobInputStatisticInfoResponseBody extends TeaModel {
    @NameInMap("JobInputList")
    private JobInputList jobInputList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private GetJobInputStatisticInfoResponseBody(Builder builder) {
        this.jobInputList = builder.jobInputList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobInputStatisticInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobInputList
     */
    public JobInputList getJobInputList() {
        return this.jobInputList;
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
        private JobInputList jobInputList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * JobInputList.
         */
        public Builder jobInputList(JobInputList jobInputList) {
            this.jobInputList = jobInputList;
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

        public GetJobInputStatisticInfoResponseBody build() {
            return new GetJobInputStatisticInfoResponseBody(this);
        } 

    } 

    public static class ClusterStatJobInput extends TeaModel {
        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("BytesInput")
        private Long bytesInput;

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

        private ClusterStatJobInput(Builder builder) {
            this.applicationId = builder.applicationId;
            this.bytesInput = builder.bytesInput;
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

        public static ClusterStatJobInput create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return bytesInput
         */
        public Long getBytesInput() {
            return this.bytesInput;
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
            private Long bytesInput; 
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
             * BytesInput.
             */
            public Builder bytesInput(Long bytesInput) {
                this.bytesInput = bytesInput;
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

            public ClusterStatJobInput build() {
                return new ClusterStatJobInput(this);
            } 

        } 

    }
    public static class JobInputList extends TeaModel {
        @NameInMap("ClusterStatJobInput")
        private java.util.List < ClusterStatJobInput> clusterStatJobInput;

        private JobInputList(Builder builder) {
            this.clusterStatJobInput = builder.clusterStatJobInput;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInputList create() {
            return builder().build();
        }

        /**
         * @return clusterStatJobInput
         */
        public java.util.List < ClusterStatJobInput> getClusterStatJobInput() {
            return this.clusterStatJobInput;
        }

        public static final class Builder {
            private java.util.List < ClusterStatJobInput> clusterStatJobInput; 

            /**
             * ClusterStatJobInput.
             */
            public Builder clusterStatJobInput(java.util.List < ClusterStatJobInput> clusterStatJobInput) {
                this.clusterStatJobInput = clusterStatJobInput;
                return this;
            }

            public JobInputList build() {
                return new JobInputList(this);
            } 

        } 

    }
}
