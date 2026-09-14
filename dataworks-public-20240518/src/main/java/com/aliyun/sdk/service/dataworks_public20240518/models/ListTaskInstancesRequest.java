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
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

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
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

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
    @com.aliyun.core.annotation.NameInMap("UnifiedWorkflowInstanceId")
    private Long unifiedWorkflowInstanceId;

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
        this.filter = builder.filter;
        this.id = builder.id;
        this.ids = builder.ids;
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectEnv = builder.projectEnv;
        this.projectId = builder.projectId;
        this.runtimeResource = builder.runtimeResource;
        this.sortBy = builder.sortBy;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.taskIds = builder.taskIds;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
        this.triggerRecurrence = builder.triggerRecurrence;
        this.triggerType = builder.triggerType;
        this.unifiedWorkflowInstanceId = builder.unifiedWorkflowInstanceId;
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
     * @return filter
     */
    public String getFilter() {
        return this.filter;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
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
     * @return unifiedWorkflowInstanceId
     */
    public Long getUnifiedWorkflowInstanceId() {
        return this.unifiedWorkflowInstanceId;
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
        private String filter; 
        private Long id; 
        private java.util.List<Long> ids; 
        private String owner; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectEnv; 
        private Long projectId; 
        private String runtimeResource; 
        private String sortBy; 
        private String status; 
        private Long taskId; 
        private java.util.List<Long> taskIds; 
        private String taskName; 
        private String taskType; 
        private String triggerRecurrence; 
        private String triggerType; 
        private Long unifiedWorkflowInstanceId; 
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
            this.filter = request.filter;
            this.id = request.id;
            this.ids = request.ids;
            this.owner = request.owner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectEnv = request.projectEnv;
            this.projectId = request.projectId;
            this.runtimeResource = request.runtimeResource;
            this.sortBy = request.sortBy;
            this.status = request.status;
            this.taskId = request.taskId;
            this.taskIds = request.taskIds;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
            this.triggerRecurrence = request.triggerRecurrence;
            this.triggerType = request.triggerType;
            this.unifiedWorkflowInstanceId = request.unifiedWorkflowInstanceId;
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
         * <p>The business date. This is typically 00:00:00 of the day before the scheduled time of the periodic instance. The value is a millisecond-level timestamp, such as 1743350400000.</p>
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
         * <p>The filter. The value is in JSON format. Multiple filter conditions are combined with AND logic. Currently supported fields: <code>startedTimeStart, startedTimeEnd, finishedTimeStart, finishedTimeEnd, createTimeStart, createTimeEnd</code></p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;startedTimeStart&quot;: &quot;1763481600000&quot;,
         *     &quot;startedTimeEnd&quot;: &quot;1763481600000&quot;,
         *     &quot;finishedTimeStart&quot;: &quot;1763481600000&quot;,
         *     &quot;finishedTimeEnd&quot;: &quot;1763481600000&quot;,
         *     &quot;createTimeStart&quot;: &quot;1763481600000&quot;,
         *     &quot;createTimeEnd&quot;: &quot;1763481600000&quot;
         * }</p>
         */
        public Builder filter(String filter) {
            this.putBodyParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The instance ID. If an instance has been rerun, specifying this parameter returns the historical information including reruns. You can use RunNumber to distinguish each historical record.</p>
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
         * <p>The list of instance IDs. You can use this parameter to query multiple instances in a batch.</p>
         */
        public Builder ids(java.util.List<Long> ids) {
            String idsShrink = shrink(ids, "Ids", "json");
            this.putBodyParameter("Ids", idsShrink);
            this.ids = ids;
            return this;
        }

        /**
         * <p>The account ID of the node owner.</p>
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
         * <p>The page number. Pages start from 1. Default value: 1.</p>
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
         * <p>The number of entries per page. Default value: 10. Maximum value: 500.</p>
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
         * <p>The project environment. Valid values:</p>
         * <ul>
         * <li>Prod: production.</li>
         * <li>Dev: development.</li>
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
         * <p>The project ID.</p>
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
         * <p>The schedule resource information. Specify the identifier of the schedule resource group.</p>
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
         * <p>The sort field. Supports fields such as scheduled time and start time. The format is &quot;sort field + sort order (Desc/Asc)&quot;. Asc can be omitted. Valid values:</p>
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
         * <p>Default value: <code>Id Desc</code></p>
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
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li><code>NotRun</code>: not run.</li>
         * <li><code>Running</code>: running.</li>
         * <li><code>Failure</code>: failed.</li>
         * <li><code>Success</code>: succeeded.</li>
         * <li><code>WaitTime</code>: waiting for the scheduled time.</li>
         * <li><code>WaitResource</code>: waiting for resources.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the corresponding node.</p>
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
         * <p>The list of node IDs. You can use this parameter to query instances of multiple nodes in a batch.</p>
         */
        public Builder taskIds(java.util.List<Long> taskIds) {
            String taskIdsShrink = shrink(taskIds, "TaskIds", "json");
            this.putBodyParameter("TaskIds", taskIdsShrink);
            this.taskIds = taskIds;
            return this;
        }

        /**
         * <p>The name of the corresponding node. Fuzzy match is supported.</p>
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
         * <p>The node type. For the TaskType values of each node, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks nodes</a>.</p>
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
         * <p>The run mode at the time of triggering. This parameter takes effect only when TriggerType is set to Scheduler. Valid values:</p>
         * <ul>
         * <li>Pause: paused.</li>
         * <li>Skip: dry run.</li>
         * <li>Normal: normal run.</li>
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
         * <p>The trigger type. Valid values:</p>
         * <ul>
         * <li>Scheduler: triggered by periodic scheduling.</li>
         * <li>Manual: manually triggered.</li>
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
         * <p>The unified workflow instance ID. All instances within the same business date under a single trigger share the same value for this field.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder unifiedWorkflowInstanceId(Long unifiedWorkflowInstanceId) {
            this.putBodyParameter("UnifiedWorkflowInstanceId", unifiedWorkflowInstanceId);
            this.unifiedWorkflowInstanceId = unifiedWorkflowInstanceId;
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
         * <p>The ID of the workflow instance to which the instance belongs.</p>
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
         * <p>The type of the workflow instance to which the instance belongs. Valid values:</p>
         * <ul>
         * <li>SmokeTest: test.</li>
         * <li>Manual: manual node.</li>
         * <li>SupplementData: data backfill.</li>
         * <li>ManualWorkflow: manual workflow.</li>
         * <li>Normal: periodic scheduling.</li>
         * <li>TriggerWorkflow: trigger-based workflow.</li>
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
