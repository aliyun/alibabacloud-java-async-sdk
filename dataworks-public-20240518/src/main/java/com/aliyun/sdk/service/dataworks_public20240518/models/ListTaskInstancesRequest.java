// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListTaskInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListTaskInstancesRequest</p>
 */
public class ListTaskInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizdate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long bizdate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ids")
    private java.util.List<Long> ids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    private String projectEnv;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeResource")
    private String runtimeResource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    private java.util.List<Long> taskIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TriggerRecurrence")
    private String triggerRecurrence;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TriggerType")
    private String triggerType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    private Long workflowId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkflowInstanceId")
    private Long workflowInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkflowInstanceType")
    private String workflowInstanceType;

    private ListTaskInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizdate = builder.bizdate;
        this.id = builder.id;
        this.ids = builder.ids;
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectEnv = builder.projectEnv;
        this.projectId = builder.projectId;
        this.runtimeResource = builder.runtimeResource;
        this.sortBy = builder.sortBy;
        this.taskId = builder.taskId;
        this.taskIds = builder.taskIds;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
        this.triggerRecurrence = builder.triggerRecurrence;
        this.triggerType = builder.triggerType;
        this.workflowId = builder.workflowId;
        this.workflowInstanceId = builder.workflowInstanceId;
        this.workflowInstanceType = builder.workflowInstanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizdate
     */
    public Long getBizdate() {
        return this.bizdate;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return ids
     */
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return runtimeResource
     */
    public String getRuntimeResource() {
        return this.runtimeResource;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskIds
     */
    public java.util.List<Long> getTaskIds() {
        return this.taskIds;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return triggerRecurrence
     */
    public String getTriggerRecurrence() {
        return this.triggerRecurrence;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * @return workflowId
     */
    public Long getWorkflowId() {
        return this.workflowId;
    }

    /**
     * @return workflowInstanceId
     */
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    /**
     * @return workflowInstanceType
     */
    public String getWorkflowInstanceType() {
        return this.workflowInstanceType;
    }

    public static final class Builder extends Request.Builder<ListTaskInstancesRequest, Builder> {
        private String regionId; 
        private Long bizdate; 
        private Long id; 
        private java.util.List<Long> ids; 
        private String owner; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectEnv; 
        private Long projectId; 
        private String runtimeResource; 
        private String sortBy; 
        private Long taskId; 
        private java.util.List<Long> taskIds; 
        private String taskName; 
        private String taskType; 
        private String triggerRecurrence; 
        private String triggerType; 
        private Long workflowId; 
        private Long workflowInstanceId; 
        private String workflowInstanceType; 

        private Builder() {
            super();
        } 

        private Builder(ListTaskInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizdate = request.bizdate;
            this.id = request.id;
            this.ids = request.ids;
            this.owner = request.owner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectEnv = request.projectEnv;
            this.projectId = request.projectId;
            this.runtimeResource = request.runtimeResource;
            this.sortBy = request.sortBy;
            this.taskId = request.taskId;
            this.taskIds = request.taskIds;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
            this.triggerRecurrence = request.triggerRecurrence;
            this.triggerType = request.triggerType;
            this.workflowId = request.workflowId;
            this.workflowInstanceId = request.workflowInstanceId;
            this.workflowInstanceType = request.workflowInstanceType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The data timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        public Builder bizdate(Long bizdate) {
            this.putBodyParameter("Bizdate", bizdate);
            this.bizdate = bizdate;
            return this;
        }

        /**
         * <p>The ID of the instance. The instance may be rerun. If the instance is rerun and you configure this parameter, the system returns the historical information of the instance, including the rerun information. You can use the RunNumber parameter to distinguish each entry in the historical information.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The IDs of the instances. You can query multiple instances at a time by instance ID.</p>
         */
        public Builder ids(java.util.List<Long> ids) {
            String idsShrink = shrink(ids, "Ids", "json");
            this.putBodyParameter("Ids", idsShrink);
            this.ids = ids;
            return this;
        }

        /**
         * <p>The account ID of the task owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The environment of the workspace. Valid values:</p>
         * <ul>
         * <li>Prod: production environment</li>
         * <li>Dev: development environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The information about the resource group. Set this parameter to the identifier of a resource group for scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
         */
        public Builder runtimeResource(String runtimeResource) {
            this.putBodyParameter("RuntimeResource", runtimeResource);
            this.runtimeResource = runtimeResource;
            return this;
        }

        /**
         * <p>The field used for sorting. Fields such as TriggerTime and StartedTime are supported. The value of this parameter is in the Sort field + Sort by (Desc/Asc) format. By default, results are sorted in ascending order. Valid values:</p>
         * <ul>
         * <li><p><code>TriggerTime (Desc/Asc)</code></p>
         * </li>
         * <li><p><code>StartedTime (Desc/Asc)</code></p>
         * </li>
         * <li><p><code>FinishedTime (Desc/Asc)</code></p>
         * </li>
         * <li><p><code>CreateTime (Desc/Asc)</code></p>
         * </li>
         * <li><p><code>Id (Desc/Asc)</code></p>
         * <p>Default value: <code>Id Desc</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Id Desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putBodyParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The ID of the task for which the instance is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The IDs of the tasks. You can query multiple instances at a time by task ID.</p>
         */
        public Builder taskIds(java.util.List<Long> taskIds) {
            String taskIdsShrink = shrink(taskIds, "TaskIds", "json");
            this.putBodyParameter("TaskIds", taskIdsShrink);
            this.taskIds = taskIds;
            return this;
        }

        /**
         * <p>The name of the task. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL node</p>
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The type of the task for which the instance is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        public Builder taskType(String taskType) {
            this.putBodyParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The running mode of the instance after it is triggered. This parameter takes effect only if the TriggerType parameter is set to Scheduler. Valid values:</p>
         * <ul>
         * <li>Pause</li>
         * <li>Skip</li>
         * <li>Normal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder triggerRecurrence(String triggerRecurrence) {
            this.putBodyParameter("TriggerRecurrence", triggerRecurrence);
            this.triggerRecurrence = triggerRecurrence;
            return this;
        }

        /**
         * <p>The trigger type.</p>
         * <ul>
         * <li>Scheduler: scheduling cycle-based trigger</li>
         * <li>Manual: manual trigger</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder triggerType(String triggerType) {
            this.putBodyParameter("TriggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        /**
         * <p>The ID of the workflow to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder workflowId(Long workflowId) {
            this.putBodyParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        /**
         * <p>The workflow instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder workflowInstanceId(Long workflowInstanceId) {
            this.putBodyParameter("WorkflowInstanceId", workflowInstanceId);
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }

        /**
         * <p>The type of the workflow instance. Valid values:</p>
         * <ul>
         * <li>SmokeTest</li>
         * <li>Manual</li>
         * <li>SupplementData</li>
         * <li>ManualWorkflow</li>
         * <li>Normal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder workflowInstanceType(String workflowInstanceType) {
            this.putBodyParameter("WorkflowInstanceType", workflowInstanceType);
            this.workflowInstanceType = workflowInstanceType;
            return this;
        }

        @Override
        public ListTaskInstancesRequest build() {
            return new ListTaskInstancesRequest(this);
        } 

    } 

}
