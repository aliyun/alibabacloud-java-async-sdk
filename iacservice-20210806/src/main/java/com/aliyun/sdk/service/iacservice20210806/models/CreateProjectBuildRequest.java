// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link CreateProjectBuildRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectBuildRequest</p>
 */
public class CreateProjectBuildRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectBuildAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectBuildAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskIds")
    private java.util.List<String> taskIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskPolicies")
    private java.util.List<TaskPolicies> taskPolicies;

    private CreateProjectBuildRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.clientToken = builder.clientToken;
        this.groupId = builder.groupId;
        this.projectBuildAction = builder.projectBuildAction;
        this.taskIds = builder.taskIds;
        this.taskPolicies = builder.taskPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectBuildRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return projectBuildAction
     */
    public String getProjectBuildAction() {
        return this.projectBuildAction;
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    /**
     * @return taskPolicies
     */
    public java.util.List<TaskPolicies> getTaskPolicies() {
        return this.taskPolicies;
    }

    public static final class Builder extends Request.Builder<CreateProjectBuildRequest, Builder> {
        private String projectId; 
        private String clientToken; 
        private String groupId; 
        private String projectBuildAction; 
        private java.util.List<String> taskIds; 
        private java.util.List<TaskPolicies> taskPolicies; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectBuildRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.clientToken = request.clientToken;
            this.groupId = request.groupId;
            this.projectBuildAction = request.projectBuildAction;
            this.taskIds = request.taskIds;
            this.taskPolicies = request.taskPolicies;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>p-433aead7560571e66e31274ffd2</p>
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a65451293e64979ba7a4b573950217fe</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>refresh</p>
         */
        public Builder projectBuildAction(String projectBuildAction) {
            this.putBodyParameter("projectBuildAction", projectBuildAction);
            this.projectBuildAction = projectBuildAction;
            return this;
        }

        /**
         * taskIds.
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            this.putBodyParameter("taskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        /**
         * taskPolicies.
         */
        public Builder taskPolicies(java.util.List<TaskPolicies> taskPolicies) {
            this.putBodyParameter("taskPolicies", taskPolicies);
            this.taskPolicies = taskPolicies;
            return this;
        }

        @Override
        public CreateProjectBuildRequest build() {
            return new CreateProjectBuildRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateProjectBuildRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectBuildRequest</p>
     */
    public static class TaskPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("destroyAfterExecution")
        private Boolean destroyAfterExecution;

        @com.aliyun.core.annotation.NameInMap("priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        private TaskPolicies(Builder builder) {
            this.destroyAfterExecution = builder.destroyAfterExecution;
            this.priority = builder.priority;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskPolicies create() {
            return builder().build();
        }

        /**
         * @return destroyAfterExecution
         */
        public Boolean getDestroyAfterExecution() {
            return this.destroyAfterExecution;
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

        public static final class Builder {
            private Boolean destroyAfterExecution; 
            private Long priority; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(TaskPolicies model) {
                this.destroyAfterExecution = model.destroyAfterExecution;
                this.priority = model.priority;
                this.taskId = model.taskId;
            } 

            /**
             * destroyAfterExecution.
             */
            public Builder destroyAfterExecution(Boolean destroyAfterExecution) {
                this.destroyAfterExecution = destroyAfterExecution;
                return this;
            }

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

            public TaskPolicies build() {
                return new TaskPolicies(this);
            } 

        } 

    }
}
