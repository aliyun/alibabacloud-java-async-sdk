// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ResetAndroidInstancesInGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ResetAndroidInstancesInGroupResponseBody</p>
 */
public class ResetAndroidInstancesInGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private Tasks tasks;

    private ResetAndroidInstancesInGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAndroidInstancesInGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Tasks getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String requestId; 
        private Tasks tasks; 

        private Builder() {
        } 

        private Builder(ResetAndroidInstancesInGroupResponseBody model) {
            this.requestId = model.requestId;
            this.tasks = model.tasks;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>69BCBBE4-FCF2-59B8-AD9D-531EB422****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tasks.
         */
        public Builder tasks(Tasks tasks) {
            this.tasks = tasks;
            return this;
        }

        public ResetAndroidInstancesInGroupResponseBody build() {
            return new ResetAndroidInstancesInGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ResetAndroidInstancesInGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ResetAndroidInstancesInGroupResponseBody</p>
     */
    public static class ChildTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private ChildTasks(Builder builder) {
            this.instanceId = builder.instanceId;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChildTasks create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String instanceId; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(ChildTasks model) {
                this.instanceId = model.instanceId;
                this.taskId = model.taskId;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public ChildTasks build() {
                return new ChildTasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ResetAndroidInstancesInGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ResetAndroidInstancesInGroupResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChildTasks")
        private java.util.List<ChildTasks> childTasks;

        @com.aliyun.core.annotation.NameInMap("ParentTaskId")
        private String parentTaskId;

        private Tasks(Builder builder) {
            this.childTasks = builder.childTasks;
            this.parentTaskId = builder.parentTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return childTasks
         */
        public java.util.List<ChildTasks> getChildTasks() {
            return this.childTasks;
        }

        /**
         * @return parentTaskId
         */
        public String getParentTaskId() {
            return this.parentTaskId;
        }

        public static final class Builder {
            private java.util.List<ChildTasks> childTasks; 
            private String parentTaskId; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.childTasks = model.childTasks;
                this.parentTaskId = model.parentTaskId;
            } 

            /**
             * ChildTasks.
             */
            public Builder childTasks(java.util.List<ChildTasks> childTasks) {
                this.childTasks = childTasks;
                return this;
            }

            /**
             * ParentTaskId.
             */
            public Builder parentTaskId(String parentTaskId) {
                this.parentTaskId = parentTaskId;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
