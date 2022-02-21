// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobsResponseBody</p>
 */
public class ListJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    private Jobs jobs;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListJobsResponseBody(Builder builder) {
        this.jobs = builder.jobs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobs
     */
    public Jobs getJobs() {
        return this.jobs;
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
        private Jobs jobs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Jobs.
         */
        public Builder jobs(Jobs jobs) {
            this.jobs = jobs;
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

        public ListJobsResponseBody build() {
            return new ListJobsResponseBody(this);
        } 

    } 

    public static class JobInfo extends TeaModel {
        @NameInMap("FailAct")
        private String failAct;

        @NameInMap("Id")
        private String id;

        @NameInMap("MaxRetry")
        private Integer maxRetry;

        @NameInMap("Name")
        private String name;

        @NameInMap("RetryInterval")
        private Integer retryInterval;

        @NameInMap("RunParameter")
        private String runParameter;

        @NameInMap("Type")
        private String type;

        private JobInfo(Builder builder) {
            this.failAct = builder.failAct;
            this.id = builder.id;
            this.maxRetry = builder.maxRetry;
            this.name = builder.name;
            this.retryInterval = builder.retryInterval;
            this.runParameter = builder.runParameter;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInfo create() {
            return builder().build();
        }

        /**
         * @return failAct
         */
        public String getFailAct() {
            return this.failAct;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return maxRetry
         */
        public Integer getMaxRetry() {
            return this.maxRetry;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return retryInterval
         */
        public Integer getRetryInterval() {
            return this.retryInterval;
        }

        /**
         * @return runParameter
         */
        public String getRunParameter() {
            return this.runParameter;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String failAct; 
            private String id; 
            private Integer maxRetry; 
            private String name; 
            private Integer retryInterval; 
            private String runParameter; 
            private String type; 

            /**
             * FailAct.
             */
            public Builder failAct(String failAct) {
                this.failAct = failAct;
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
             * MaxRetry.
             */
            public Builder maxRetry(Integer maxRetry) {
                this.maxRetry = maxRetry;
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
             * RetryInterval.
             */
            public Builder retryInterval(Integer retryInterval) {
                this.retryInterval = retryInterval;
                return this;
            }

            /**
             * RunParameter.
             */
            public Builder runParameter(String runParameter) {
                this.runParameter = runParameter;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public JobInfo build() {
                return new JobInfo(this);
            } 

        } 

    }
    public static class Jobs extends TeaModel {
        @NameInMap("JobInfo")
        private java.util.List < JobInfo> jobInfo;

        private Jobs(Builder builder) {
            this.jobInfo = builder.jobInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return jobInfo
         */
        public java.util.List < JobInfo> getJobInfo() {
            return this.jobInfo;
        }

        public static final class Builder {
            private java.util.List < JobInfo> jobInfo; 

            /**
             * JobInfo.
             */
            public Builder jobInfo(java.util.List < JobInfo> jobInfo) {
                this.jobInfo = jobInfo;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
