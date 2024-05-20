// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWorkflowRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkflowRequest</p>
 */
public class CreateWorkflowRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alertGroupId")
    private String alertGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alertStrategy")
    private String alertStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cronExpr")
    private String cronExpr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("executionType")
    private String executionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("failureStrategy")
    private String failureStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("parentDirectoryId")
    private String parentDirectoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scheduleEndTime")
    private String scheduleEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scheduleStartTime")
    private String scheduleStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scheduleState")
    private String scheduleState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskDefinitionJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskDefinitionJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskRelationJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskRelationJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timeZone")
    private String timeZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workflowInstancePriority")
    private String workflowInstancePriority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workflowParams")
    private String workflowParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateWorkflowRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.alertGroupId = builder.alertGroupId;
        this.alertStrategy = builder.alertStrategy;
        this.cronExpr = builder.cronExpr;
        this.description = builder.description;
        this.executionType = builder.executionType;
        this.failureStrategy = builder.failureStrategy;
        this.name = builder.name;
        this.parentDirectoryId = builder.parentDirectoryId;
        this.resourceGroupId = builder.resourceGroupId;
        this.scheduleEndTime = builder.scheduleEndTime;
        this.scheduleStartTime = builder.scheduleStartTime;
        this.scheduleState = builder.scheduleState;
        this.taskDefinitionJson = builder.taskDefinitionJson;
        this.taskRelationJson = builder.taskRelationJson;
        this.timeZone = builder.timeZone;
        this.timeout = builder.timeout;
        this.workflowInstancePriority = builder.workflowInstancePriority;
        this.workflowParams = builder.workflowParams;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkflowRequest create() {
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
     * @return alertGroupId
     */
    public String getAlertGroupId() {
        return this.alertGroupId;
    }

    /**
     * @return alertStrategy
     */
    public String getAlertStrategy() {
        return this.alertStrategy;
    }

    /**
     * @return cronExpr
     */
    public String getCronExpr() {
        return this.cronExpr;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return executionType
     */
    public String getExecutionType() {
        return this.executionType;
    }

    /**
     * @return failureStrategy
     */
    public String getFailureStrategy() {
        return this.failureStrategy;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentDirectoryId
     */
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return scheduleEndTime
     */
    public String getScheduleEndTime() {
        return this.scheduleEndTime;
    }

    /**
     * @return scheduleStartTime
     */
    public String getScheduleStartTime() {
        return this.scheduleStartTime;
    }

    /**
     * @return scheduleState
     */
    public String getScheduleState() {
        return this.scheduleState;
    }

    /**
     * @return taskDefinitionJson
     */
    public String getTaskDefinitionJson() {
        return this.taskDefinitionJson;
    }

    /**
     * @return taskRelationJson
     */
    public String getTaskRelationJson() {
        return this.taskRelationJson;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return workflowInstancePriority
     */
    public String getWorkflowInstancePriority() {
        return this.workflowInstancePriority;
    }

    /**
     * @return workflowParams
     */
    public String getWorkflowParams() {
        return this.workflowParams;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateWorkflowRequest, Builder> {
        private String projectId; 
        private String alertGroupId; 
        private String alertStrategy; 
        private String cronExpr; 
        private String description; 
        private String executionType; 
        private String failureStrategy; 
        private String name; 
        private String parentDirectoryId; 
        private String resourceGroupId; 
        private String scheduleEndTime; 
        private String scheduleStartTime; 
        private String scheduleState; 
        private String taskDefinitionJson; 
        private String taskRelationJson; 
        private String timeZone; 
        private Integer timeout; 
        private String workflowInstancePriority; 
        private String workflowParams; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkflowRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.alertGroupId = request.alertGroupId;
            this.alertStrategy = request.alertStrategy;
            this.cronExpr = request.cronExpr;
            this.description = request.description;
            this.executionType = request.executionType;
            this.failureStrategy = request.failureStrategy;
            this.name = request.name;
            this.parentDirectoryId = request.parentDirectoryId;
            this.resourceGroupId = request.resourceGroupId;
            this.scheduleEndTime = request.scheduleEndTime;
            this.scheduleStartTime = request.scheduleStartTime;
            this.scheduleState = request.scheduleState;
            this.taskDefinitionJson = request.taskDefinitionJson;
            this.taskRelationJson = request.taskRelationJson;
            this.timeZone = request.timeZone;
            this.timeout = request.timeout;
            this.workflowInstancePriority = request.workflowInstancePriority;
            this.workflowParams = request.workflowParams;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * alertGroupId.
         */
        public Builder alertGroupId(String alertGroupId) {
            this.putQueryParameter("alertGroupId", alertGroupId);
            this.alertGroupId = alertGroupId;
            return this;
        }

        /**
         * alertStrategy.
         */
        public Builder alertStrategy(String alertStrategy) {
            this.putQueryParameter("alertStrategy", alertStrategy);
            this.alertStrategy = alertStrategy;
            return this;
        }

        /**
         * cronExpr.
         */
        public Builder cronExpr(String cronExpr) {
            this.putQueryParameter("cronExpr", cronExpr);
            this.cronExpr = cronExpr;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * executionType.
         */
        public Builder executionType(String executionType) {
            this.putQueryParameter("executionType", executionType);
            this.executionType = executionType;
            return this;
        }

        /**
         * failureStrategy.
         */
        public Builder failureStrategy(String failureStrategy) {
            this.putQueryParameter("failureStrategy", failureStrategy);
            this.failureStrategy = failureStrategy;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * parentDirectoryId.
         */
        public Builder parentDirectoryId(String parentDirectoryId) {
            this.putQueryParameter("parentDirectoryId", parentDirectoryId);
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * scheduleEndTime.
         */
        public Builder scheduleEndTime(String scheduleEndTime) {
            this.putQueryParameter("scheduleEndTime", scheduleEndTime);
            this.scheduleEndTime = scheduleEndTime;
            return this;
        }

        /**
         * scheduleStartTime.
         */
        public Builder scheduleStartTime(String scheduleStartTime) {
            this.putQueryParameter("scheduleStartTime", scheduleStartTime);
            this.scheduleStartTime = scheduleStartTime;
            return this;
        }

        /**
         * scheduleState.
         */
        public Builder scheduleState(String scheduleState) {
            this.putQueryParameter("scheduleState", scheduleState);
            this.scheduleState = scheduleState;
            return this;
        }

        /**
         * taskDefinitionJson.
         */
        public Builder taskDefinitionJson(String taskDefinitionJson) {
            this.putQueryParameter("taskDefinitionJson", taskDefinitionJson);
            this.taskDefinitionJson = taskDefinitionJson;
            return this;
        }

        /**
         * taskRelationJson.
         */
        public Builder taskRelationJson(String taskRelationJson) {
            this.putQueryParameter("taskRelationJson", taskRelationJson);
            this.taskRelationJson = taskRelationJson;
            return this;
        }

        /**
         * timeZone.
         */
        public Builder timeZone(String timeZone) {
            this.putQueryParameter("timeZone", timeZone);
            this.timeZone = timeZone;
            return this;
        }

        /**
         * timeout.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * workflowInstancePriority.
         */
        public Builder workflowInstancePriority(String workflowInstancePriority) {
            this.putQueryParameter("workflowInstancePriority", workflowInstancePriority);
            this.workflowInstancePriority = workflowInstancePriority;
            return this;
        }

        /**
         * workflowParams.
         */
        public Builder workflowParams(String workflowParams) {
            this.putQueryParameter("workflowParams", workflowParams);
            this.workflowParams = workflowParams;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateWorkflowRequest build() {
            return new CreateWorkflowRequest(this);
        } 

    } 

}
