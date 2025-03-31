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
 * {@link CreateJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateJobResponseBody</p>
 */
public class CreateJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    private CreateJobResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tasks
     */
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String jobId; 
        private String requestId; 
        private java.util.List<Tasks> tasks; 

        private Builder() {
        } 

        private Builder(CreateJobResponseBody model) {
            this.jobId = model.jobId;
            this.requestId = model.requestId;
            this.tasks = model.tasks;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
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
         * Tasks.
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        public CreateJobResponseBody build() {
            return new CreateJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreateJobResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExecutorIds")
        private java.util.List<String> executorIds;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        private Tasks(Builder builder) {
            this.executorIds = builder.executorIds;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return executorIds
         */
        public java.util.List<String> getExecutorIds() {
            return this.executorIds;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private java.util.List<String> executorIds; 
            private String taskName; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.executorIds = model.executorIds;
                this.taskName = model.taskName;
            } 

            /**
             * ExecutorIds.
             */
            public Builder executorIds(java.util.List<String> executorIds) {
                this.executorIds = executorIds;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
