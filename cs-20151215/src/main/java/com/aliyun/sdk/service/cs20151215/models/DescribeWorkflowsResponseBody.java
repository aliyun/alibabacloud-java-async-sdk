// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWorkflowsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWorkflowsResponseBody</p>
 */
public class DescribeWorkflowsResponseBody extends TeaModel {
    @NameInMap("jobs")
    private java.util.List < Jobs> jobs;

    private DescribeWorkflowsResponseBody(Builder builder) {
        this.jobs = builder.jobs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWorkflowsResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobs
     */
    public java.util.List < Jobs> getJobs() {
        return this.jobs;
    }

    public static final class Builder {
        private java.util.List < Jobs> jobs; 

        /**
         * The list of the jobs.
         */
        public Builder jobs(java.util.List < Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        public DescribeWorkflowsResponseBody build() {
            return new DescribeWorkflowsResponseBody(this);
        } 

    } 

    public static class Jobs extends TeaModel {
        @NameInMap("cluster_id")
        private String clusterId;

        @NameInMap("create_time")
        private String createTime;

        @NameInMap("job_name")
        private String jobName;

        private Jobs(Builder builder) {
            this.clusterId = builder.clusterId;
            this.createTime = builder.createTime;
            this.jobName = builder.jobName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        public static final class Builder {
            private String clusterId; 
            private String createTime; 
            private String jobName; 

            /**
             * The ID of the ACK cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The time when the workflow was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The name of the workflow.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
