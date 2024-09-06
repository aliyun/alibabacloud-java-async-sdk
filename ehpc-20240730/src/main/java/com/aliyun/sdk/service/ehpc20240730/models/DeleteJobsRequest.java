// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteJobsRequest} extends {@link RequestModel}
 *
 * <p>DeleteJobsRequest</p>
 */
public class DeleteJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobSpec")
    private java.util.List < JobSpec> jobSpec;

    private DeleteJobsRequest(Builder builder) {
        super(builder);
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
     * @return jobSpec
     */
    public java.util.List < JobSpec> getJobSpec() {
        return this.jobSpec;
    }

    public static final class Builder extends Request.Builder<DeleteJobsRequest, Builder> {
        private java.util.List < JobSpec> jobSpec; 

        private Builder() {
            super();
        } 

        private Builder(DeleteJobsRequest request) {
            super(request);
            this.jobSpec = request.jobSpec;
        } 

        /**
         * JobSpec.
         */
        public Builder jobSpec(java.util.List < JobSpec> jobSpec) {
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

    public static class TaskSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArrayIndex")
        private java.util.List < Integer > arrayIndex;

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
        public java.util.List < Integer > getArrayIndex() {
            return this.arrayIndex;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private java.util.List < Integer > arrayIndex; 
            private String taskName; 

            /**
             * ArrayIndex.
             */
            public Builder arrayIndex(java.util.List < Integer > arrayIndex) {
                this.arrayIndex = arrayIndex;
                return this;
            }

            /**
             * TaskName.
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
    public static class JobSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("TaskSpec")
        private java.util.List < TaskSpec> taskSpec;

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
        public java.util.List < TaskSpec> getTaskSpec() {
            return this.taskSpec;
        }

        public static final class Builder {
            private String jobId; 
            private java.util.List < TaskSpec> taskSpec; 

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * TaskSpec.
             */
            public Builder taskSpec(java.util.List < TaskSpec> taskSpec) {
                this.taskSpec = taskSpec;
                return this;
            }

            public JobSpec build() {
                return new JobSpec(this);
            } 

        } 

    }
}
