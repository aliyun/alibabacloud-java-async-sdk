// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListQueueTopJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueueTopJobsResponseBody</p>
 */
public class ListQueueTopJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("queueTopJobs")
    private QueueTopJobs queueTopJobs;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListQueueTopJobsResponseBody(Builder builder) {
        this.queueTopJobs = builder.queueTopJobs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueueTopJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queueTopJobs
     */
    public QueueTopJobs getQueueTopJobs() {
        return this.queueTopJobs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private QueueTopJobs queueTopJobs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListQueueTopJobsResponseBody model) {
            this.queueTopJobs = model.queueTopJobs;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The job details.</p>
         */
        public Builder queueTopJobs(QueueTopJobs queueTopJobs) {
            this.queueTopJobs = queueTopJobs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListQueueTopJobsResponseBody build() {
            return new ListQueueTopJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQueueTopJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueueTopJobsResponseBody</p>
     */
    public static class Jobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpuCores")
        private String cpuCores;

        @com.aliyun.core.annotation.NameInMap("cu")
        private String cu;

        @com.aliyun.core.annotation.NameInMap("jobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("jobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("memoryGiB")
        private String memoryGiB;

        private Jobs(Builder builder) {
            this.cpuCores = builder.cpuCores;
            this.cu = builder.cu;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.memoryGiB = builder.memoryGiB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return cpuCores
         */
        public String getCpuCores() {
            return this.cpuCores;
        }

        /**
         * @return cu
         */
        public String getCu() {
            return this.cu;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return memoryGiB
         */
        public String getMemoryGiB() {
            return this.memoryGiB;
        }

        public static final class Builder {
            private String cpuCores; 
            private String cu; 
            private String jobId; 
            private String jobType; 
            private String memoryGiB; 

            private Builder() {
            } 

            private Builder(Jobs model) {
                this.cpuCores = model.cpuCores;
                this.cu = model.cu;
                this.jobId = model.jobId;
                this.jobType = model.jobType;
                this.memoryGiB = model.memoryGiB;
            } 

            /**
             * <p>The number of CPU cores requested by the job.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder cpuCores(String cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * <p>The number of CUs consumed by the job.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>jr-1234abcd</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The job type.</p>
             * 
             * <strong>example:</strong>
             * <p>spark-batch</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The amount of memory requested by the job.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder memoryGiB(String memoryGiB) {
                this.memoryGiB = memoryGiB;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQueueTopJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueueTopJobsResponseBody</p>
     */
    public static class QueueTopJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("jobs")
        private java.util.List<Jobs> jobs;

        @com.aliyun.core.annotation.NameInMap("maxResults")
        private String maxResults;

        @com.aliyun.core.annotation.NameInMap("queueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("totalCu")
        private String totalCu;

        @com.aliyun.core.annotation.NameInMap("totalJobCount")
        private Integer totalJobCount;

        private QueueTopJobs(Builder builder) {
            this.jobs = builder.jobs;
            this.maxResults = builder.maxResults;
            this.queueName = builder.queueName;
            this.totalCu = builder.totalCu;
            this.totalJobCount = builder.totalJobCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueTopJobs create() {
            return builder().build();
        }

        /**
         * @return jobs
         */
        public java.util.List<Jobs> getJobs() {
            return this.jobs;
        }

        /**
         * @return maxResults
         */
        public String getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return totalCu
         */
        public String getTotalCu() {
            return this.totalCu;
        }

        /**
         * @return totalJobCount
         */
        public Integer getTotalJobCount() {
            return this.totalJobCount;
        }

        public static final class Builder {
            private java.util.List<Jobs> jobs; 
            private String maxResults; 
            private String queueName; 
            private String totalCu; 
            private Integer totalJobCount; 

            private Builder() {
            } 

            private Builder(QueueTopJobs model) {
                this.jobs = model.jobs;
                this.maxResults = model.maxResults;
                this.queueName = model.queueName;
                this.totalCu = model.totalCu;
                this.totalJobCount = model.totalJobCount;
            } 

            /**
             * <p>The list of jobs.</p>
             */
            public Builder jobs(java.util.List<Jobs> jobs) {
                this.jobs = jobs;
                return this;
            }

            /**
             * <p>The maximum number of records returned in a single request.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxResults(String maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The name of the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>dev_queue</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The total number of CUs consumed by the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder totalCu(String totalCu) {
                this.totalCu = totalCu;
                return this;
            }

            /**
             * <p>The total number of jobs in the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder totalJobCount(Integer totalJobCount) {
                this.totalJobCount = totalJobCount;
                return this;
            }

            public QueueTopJobs build() {
                return new QueueTopJobs(this);
            } 

        } 

    }
}
