// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskPolicyRequest</p>
 */
public class UpdateTaskPolicyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskPolicies")
    private java.util.List < TaskPolicies> taskPolicies;

    private UpdateTaskPolicyRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.clientToken = builder.clientToken;
        this.taskPolicies = builder.taskPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return taskPolicies
     */
    public java.util.List < TaskPolicies> getTaskPolicies() {
        return this.taskPolicies;
    }

    public static final class Builder extends Request.Builder<UpdateTaskPolicyRequest, Builder> {
        private String groupId; 
        private String clientToken; 
        private java.util.List < TaskPolicies> taskPolicies; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskPolicyRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.clientToken = request.clientToken;
            this.taskPolicies = request.taskPolicies;
        } 

        /**
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.putPathParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * taskPolicies.
         */
        public Builder taskPolicies(java.util.List < TaskPolicies> taskPolicies) {
            this.putBodyParameter("taskPolicies", taskPolicies);
            this.taskPolicies = taskPolicies;
            return this;
        }

        @Override
        public UpdateTaskPolicyRequest build() {
            return new UpdateTaskPolicyRequest(this);
        } 

    } 

    public static class TaskPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private TaskPolicies(Builder builder) {
            this.priority = builder.priority;
            this.taskId = builder.taskId;
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
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String priority; 
            private String taskId; 
            private String type; 

            /**
             * priority.
             */
            public Builder priority(String priority) {
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
}
