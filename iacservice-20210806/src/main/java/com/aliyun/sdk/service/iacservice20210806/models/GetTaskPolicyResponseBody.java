// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskPolicyResponseBody</p>
 */
public class GetTaskPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("taskPolicy")
    private TaskPolicy taskPolicy;

    private GetTaskPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskPolicy = builder.taskPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskPolicy
     */
    public TaskPolicy getTaskPolicy() {
        return this.taskPolicy;
    }

    public static final class Builder {
        private String requestId; 
        private TaskPolicy taskPolicy; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * taskPolicy.
         */
        public Builder taskPolicy(TaskPolicy taskPolicy) {
            this.taskPolicy = taskPolicy;
            return this;
        }

        public GetTaskPolicyResponseBody build() {
            return new GetTaskPolicyResponseBody(this);
        } 

    } 

    public static class TaskPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private TaskPolicies(Builder builder) {
            this.priority = builder.priority;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskPolicies create() {
            return builder().build();
        }

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long priority; 
            private String taskId; 
            private String taskName; 
            private String type; 

            /**
             * priority.
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * taskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TaskPolicies build() {
                return new TaskPolicies(this);
            } 

        } 

    }
    public static class TaskPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("taskPolicies")
        private java.util.List < TaskPolicies> taskPolicies;

        private TaskPolicy(Builder builder) {
            this.groupId = builder.groupId;
            this.taskPolicies = builder.taskPolicies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskPolicy create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return taskPolicies
         */
        public java.util.List < TaskPolicies> getTaskPolicies() {
            return this.taskPolicies;
        }

        public static final class Builder {
            private String groupId; 
            private java.util.List < TaskPolicies> taskPolicies; 

            /**
             * groupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * taskPolicies.
             */
            public Builder taskPolicies(java.util.List < TaskPolicies> taskPolicies) {
                this.taskPolicies = taskPolicies;
                return this;
            }

            public TaskPolicy build() {
                return new TaskPolicy(this);
            } 

        } 

    }
}
