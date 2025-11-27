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
 * {@link DeleteJobsRequest} extends {@link RequestModel}
 *
 * <p>DeleteJobsRequest</p>
 */
public class DeleteJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutorIds")
    private java.util.List<String> executorIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobScheduler")
    private String jobScheduler;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobSpec")
    private java.util.List<JobSpec> jobSpec;

    private DeleteJobsRequest(Builder builder) {
        super(builder);
        this.executorIds = builder.executorIds;
        this.jobScheduler = builder.jobScheduler;
        this.jobSpec = builder.jobSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executorIds
     */
    public java.util.List<String> getExecutorIds() {
        return this.executorIds;
    }

    /**
     * @return jobScheduler
     */
    public String getJobScheduler() {
        return this.jobScheduler;
    }

    /**
     * @return jobSpec
     */
    public java.util.List<JobSpec> getJobSpec() {
        return this.jobSpec;
    }

    public static final class Builder extends Request.Builder<DeleteJobsRequest, Builder> {
        private java.util.List<String> executorIds; 
        private String jobScheduler; 
        private java.util.List<JobSpec> jobSpec; 

        private Builder() {
            super();
        } 

        private Builder(DeleteJobsRequest request) {
            super(request);
            this.executorIds = request.executorIds;
            this.jobScheduler = request.jobScheduler;
            this.jobSpec = request.jobSpec;
        } 

        /**
         * <p>The list of executor IDs. A maximum of 100 IDs are supported.</p>
         */
        public Builder executorIds(java.util.List<String> executorIds) {
            String executorIdsShrink = shrink(executorIds, "ExecutorIds", "json");
            this.putQueryParameter("ExecutorIds", executorIdsShrink);
            this.executorIds = executorIds;
            return this;
        }

        /**
         * <p>The type of the job scheduler.</p>
         * <ul>
         * <li>HPC</li>
         * <li>K8S</li>
         * </ul>
         * <p>Default value: HPC</p>
         * 
         * <strong>example:</strong>
         * <p>HPC</p>
         */
        public Builder jobScheduler(String jobScheduler) {
            this.putQueryParameter("JobScheduler", jobScheduler);
            this.jobScheduler = jobScheduler;
            return this;
        }

        /**
         * <p>The information about the job to be deleted.</p>
         */
        public Builder jobSpec(java.util.List<JobSpec> jobSpec) {
            String jobSpecShrink = shrink(jobSpec, "JobSpec", "json");
            this.putQueryParameter("JobSpec", jobSpecShrink);
            this.jobSpec = jobSpec;
            return this;
        }

        @Override
        public DeleteJobsRequest build() {
            return new DeleteJobsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteJobsRequest} extends {@link TeaModel}
     *
     * <p>DeleteJobsRequest</p>
     */
    public static class TaskSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArrayIndex")
        private java.util.List<Integer> arrayIndex;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        private TaskSpec(Builder builder) {
            this.arrayIndex = builder.arrayIndex;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskSpec create() {
            return builder().build();
        }

        /**
         * @return arrayIndex
         */
        public java.util.List<Integer> getArrayIndex() {
            return this.arrayIndex;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private java.util.List<Integer> arrayIndex; 
            private String taskName; 

            private Builder() {
            } 

            private Builder(TaskSpec model) {
                this.arrayIndex = model.arrayIndex;
                this.taskName = model.taskName;
            } 

            /**
             * <p>The list of array job indexes to be deleted.</p>
             */
            public Builder arrayIndex(java.util.List<Integer> arrayIndex) {
                this.arrayIndex = arrayIndex;
                return this;
            }

            /**
             * <p>The name of the task to be deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>task0</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public TaskSpec build() {
                return new TaskSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteJobsRequest} extends {@link TeaModel}
     *
     * <p>DeleteJobsRequest</p>
     */
    public static class JobSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("TaskSpec")
        private java.util.List<TaskSpec> taskSpec;

        private JobSpec(Builder builder) {
            this.jobId = builder.jobId;
            this.taskSpec = builder.taskSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobSpec create() {
            return builder().build();
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return taskSpec
         */
        public java.util.List<TaskSpec> getTaskSpec() {
            return this.taskSpec;
        }

        public static final class Builder {
            private String jobId; 
            private java.util.List<TaskSpec> taskSpec; 

            private Builder() {
            } 

            private Builder(JobSpec model) {
                this.jobId = model.jobId;
                this.taskSpec = model.taskSpec;
            } 

            /**
             * <p>The ID of the job to be deleted.<br>You can call the ListJobs operation to query job IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>job-xxxx</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The task details of the job to be deleted.</p>
             */
            public Builder taskSpec(java.util.List<TaskSpec> taskSpec) {
                this.taskSpec = taskSpec;
                return this;
            }

            public JobSpec build() {
                return new JobSpec(this);
            } 

        } 

    }
}
