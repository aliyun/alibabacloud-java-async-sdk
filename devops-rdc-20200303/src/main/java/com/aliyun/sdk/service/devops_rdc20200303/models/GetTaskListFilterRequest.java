// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskListFilterRequest} extends {@link RequestModel}
 *
 * <p>GetTaskListFilterRequest</p>
 */
public class GetTaskListFilterRequest extends Request {
    @Body
    @NameInMap("CreatorId")
    private String creatorId;

    @Body
    @NameInMap("DueDateEnd")
    private String dueDateEnd;

    @Body
    @NameInMap("DueDateStart")
    private String dueDateStart;

    @Body
    @NameInMap("ExecutorId")
    private String executorId;

    @Body
    @NameInMap("Extra")
    private String extra;

    @Body
    @NameInMap("InvolveMembers")
    private String involveMembers;

    @Body
    @NameInMap("IsDone")
    private Boolean isDone;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("ObjectType")
    @Validation(required = true)
    private String objectType;

    @Body
    @NameInMap("Order")
    @Validation(required = true)
    private String order;

    @Body
    @NameInMap("OrderCondition")
    @Validation(required = true)
    private String orderCondition;

    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 5000, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("PageToken")
    private String pageToken;

    @Body
    @NameInMap("Priority")
    private String priority;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("ScenarioFieldConfigId")
    @Validation(required = true)
    private String scenarioFieldConfigId;

    @Body
    @NameInMap("SprintId")
    private String sprintId;

    @Body
    @NameInMap("TagId")
    private String tagId;

    @Body
    @NameInMap("TaskFlowStatusId")
    private String taskFlowStatusId;

    private GetTaskListFilterRequest(Builder builder) {
        super(builder);
        this.creatorId = builder.creatorId;
        this.dueDateEnd = builder.dueDateEnd;
        this.dueDateStart = builder.dueDateStart;
        this.executorId = builder.executorId;
        this.extra = builder.extra;
        this.involveMembers = builder.involveMembers;
        this.isDone = builder.isDone;
        this.name = builder.name;
        this.objectType = builder.objectType;
        this.order = builder.order;
        this.orderCondition = builder.orderCondition;
        this.orgId = builder.orgId;
        this.pageSize = builder.pageSize;
        this.pageToken = builder.pageToken;
        this.priority = builder.priority;
        this.projectId = builder.projectId;
        this.scenarioFieldConfigId = builder.scenarioFieldConfigId;
        this.sprintId = builder.sprintId;
        this.tagId = builder.tagId;
        this.taskFlowStatusId = builder.taskFlowStatusId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskListFilterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return dueDateEnd
     */
    public String getDueDateEnd() {
        return this.dueDateEnd;
    }

    /**
     * @return dueDateStart
     */
    public String getDueDateStart() {
        return this.dueDateStart;
    }

    /**
     * @return executorId
     */
    public String getExecutorId() {
        return this.executorId;
    }

    /**
     * @return extra
     */
    public String getExtra() {
        return this.extra;
    }

    /**
     * @return involveMembers
     */
    public String getInvolveMembers() {
        return this.involveMembers;
    }

    /**
     * @return isDone
     */
    public Boolean getIsDone() {
        return this.isDone;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderCondition
     */
    public String getOrderCondition() {
        return this.orderCondition;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageToken
     */
    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return scenarioFieldConfigId
     */
    public String getScenarioFieldConfigId() {
        return this.scenarioFieldConfigId;
    }

    /**
     * @return sprintId
     */
    public String getSprintId() {
        return this.sprintId;
    }

    /**
     * @return tagId
     */
    public String getTagId() {
        return this.tagId;
    }

    /**
     * @return taskFlowStatusId
     */
    public String getTaskFlowStatusId() {
        return this.taskFlowStatusId;
    }

    public static final class Builder extends Request.Builder<GetTaskListFilterRequest, Builder> {
        private String creatorId; 
        private String dueDateEnd; 
        private String dueDateStart; 
        private String executorId; 
        private String extra; 
        private String involveMembers; 
        private Boolean isDone; 
        private String name; 
        private String objectType; 
        private String order; 
        private String orderCondition; 
        private String orgId; 
        private Integer pageSize; 
        private String pageToken; 
        private String priority; 
        private String projectId; 
        private String scenarioFieldConfigId; 
        private String sprintId; 
        private String tagId; 
        private String taskFlowStatusId; 

        private Builder() {
            super();
        } 

        private Builder(GetTaskListFilterRequest response) {
            super(response);
            this.creatorId = response.creatorId;
            this.dueDateEnd = response.dueDateEnd;
            this.dueDateStart = response.dueDateStart;
            this.executorId = response.executorId;
            this.extra = response.extra;
            this.involveMembers = response.involveMembers;
            this.isDone = response.isDone;
            this.name = response.name;
            this.objectType = response.objectType;
            this.order = response.order;
            this.orderCondition = response.orderCondition;
            this.orgId = response.orgId;
            this.pageSize = response.pageSize;
            this.pageToken = response.pageToken;
            this.priority = response.priority;
            this.projectId = response.projectId;
            this.scenarioFieldConfigId = response.scenarioFieldConfigId;
            this.sprintId = response.sprintId;
            this.tagId = response.tagId;
            this.taskFlowStatusId = response.taskFlowStatusId;
        } 

        /**
         * CreatorId.
         */
        public Builder creatorId(String creatorId) {
            this.putBodyParameter("CreatorId", creatorId);
            this.creatorId = creatorId;
            return this;
        }

        /**
         * DueDateEnd.
         */
        public Builder dueDateEnd(String dueDateEnd) {
            this.putBodyParameter("DueDateEnd", dueDateEnd);
            this.dueDateEnd = dueDateEnd;
            return this;
        }

        /**
         * DueDateStart.
         */
        public Builder dueDateStart(String dueDateStart) {
            this.putBodyParameter("DueDateStart", dueDateStart);
            this.dueDateStart = dueDateStart;
            return this;
        }

        /**
         * ExecutorId.
         */
        public Builder executorId(String executorId) {
            this.putBodyParameter("ExecutorId", executorId);
            this.executorId = executorId;
            return this;
        }

        /**
         * Extra.
         */
        public Builder extra(String extra) {
            this.putBodyParameter("Extra", extra);
            this.extra = extra;
            return this;
        }

        /**
         * InvolveMembers.
         */
        public Builder involveMembers(String involveMembers) {
            this.putBodyParameter("InvolveMembers", involveMembers);
            this.involveMembers = involveMembers;
            return this;
        }

        /**
         * IsDone.
         */
        public Builder isDone(Boolean isDone) {
            this.putBodyParameter("IsDone", isDone);
            this.isDone = isDone;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.putBodyParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * OrderCondition.
         */
        public Builder orderCondition(String orderCondition) {
            this.putBodyParameter("OrderCondition", orderCondition);
            this.orderCondition = orderCondition;
            return this;
        }

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PageToken.
         */
        public Builder pageToken(String pageToken) {
            this.putBodyParameter("PageToken", pageToken);
            this.pageToken = pageToken;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(String priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ScenarioFieldConfigId.
         */
        public Builder scenarioFieldConfigId(String scenarioFieldConfigId) {
            this.putBodyParameter("ScenarioFieldConfigId", scenarioFieldConfigId);
            this.scenarioFieldConfigId = scenarioFieldConfigId;
            return this;
        }

        /**
         * SprintId.
         */
        public Builder sprintId(String sprintId) {
            this.putBodyParameter("SprintId", sprintId);
            this.sprintId = sprintId;
            return this;
        }

        /**
         * TagId.
         */
        public Builder tagId(String tagId) {
            this.putBodyParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        /**
         * TaskFlowStatusId.
         */
        public Builder taskFlowStatusId(String taskFlowStatusId) {
            this.putBodyParameter("TaskFlowStatusId", taskFlowStatusId);
            this.taskFlowStatusId = taskFlowStatusId;
            return this;
        }

        @Override
        public GetTaskListFilterRequest build() {
            return new GetTaskListFilterRequest(this);
        } 

    } 

}
