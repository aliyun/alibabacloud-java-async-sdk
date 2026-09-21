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
 * {@link UpdateCloudPhoneNodeSystemImageResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCloudPhoneNodeSystemImageResponseBody</p>
 */
public class UpdateCloudPhoneNodeSystemImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private Tasks tasks;

    private UpdateCloudPhoneNodeSystemImageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudPhoneNodeSystemImageResponseBody create() {
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return tasks
     */
    public Tasks getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String requestId; 
        private String taskId; 
        private Tasks tasks; 

        private Builder() {
        } 

        private Builder(UpdateCloudPhoneNodeSystemImageResponseBody model) {
            this.requestId = model.requestId;
            this.taskId = model.taskId;
            this.tasks = model.tasks;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-ehs0yoedj0xe9****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The task information.</p>
         */
        public Builder tasks(Tasks tasks) {
            this.tasks = tasks;
            return this;
        }

        public UpdateCloudPhoneNodeSystemImageResponseBody build() {
            return new UpdateCloudPhoneNodeSystemImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCloudPhoneNodeSystemImageResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateCloudPhoneNodeSystemImageResponseBody</p>
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
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cpn-xxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The child task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t-xxxx</p>
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
     * {@link UpdateCloudPhoneNodeSystemImageResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateCloudPhoneNodeSystemImageResponseBody</p>
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
             * <p>The child tasks.</p>
             */
            public Builder childTasks(java.util.List<ChildTasks> childTasks) {
                this.childTasks = childTasks;
                return this;
            }

            /**
             * <p>The parent task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t-xxxx</p>
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
