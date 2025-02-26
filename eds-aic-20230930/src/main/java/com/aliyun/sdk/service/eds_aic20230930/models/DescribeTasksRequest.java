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
 * {@link DescribeTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeTasksRequest</p>
 */
public class DescribeTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvokeId")
    private String invokeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private Integer level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    private String param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentTaskId")
    private String parentTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List<String> resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    private java.util.List<String> taskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStatuses")
    private java.util.List<String> taskStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskTypes")
    private java.util.List<String> taskTypes;

    private DescribeTasksRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.invokeId = builder.invokeId;
        this.level = builder.level;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.param = builder.param;
        this.parentTaskId = builder.parentTaskId;
        this.resourceIds = builder.resourceIds;
        this.taskIds = builder.taskIds;
        this.taskStatus = builder.taskStatus;
        this.taskStatuses = builder.taskStatuses;
        this.taskType = builder.taskType;
        this.taskTypes = builder.taskTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return invokeId
     */
    public String getInvokeId() {
        return this.invokeId;
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return this.level;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    /**
     * @return parentTaskId
     */
    public String getParentTaskId() {
        return this.parentTaskId;
    }

    /**
     * @return resourceIds
     */
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return taskStatuses
     */
    public java.util.List<String> getTaskStatuses() {
        return this.taskStatuses;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return taskTypes
     */
    public java.util.List<String> getTaskTypes() {
        return this.taskTypes;
    }

    public static final class Builder extends Request.Builder<DescribeTasksRequest, Builder> {
        private String instanceId; 
        private String instanceName; 
        private String invokeId; 
        private Integer level; 
        private Integer maxResults; 
        private String nextToken; 
        private String param; 
        private String parentTaskId; 
        private java.util.List<String> resourceIds; 
        private java.util.List<String> taskIds; 
        private String taskStatus; 
        private java.util.List<String> taskStatuses; 
        private String taskType; 
        private java.util.List<String> taskTypes; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTasksRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.invokeId = request.invokeId;
            this.level = request.level;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.param = request.param;
            this.parentTaskId = request.parentTaskId;
            this.resourceIds = request.resourceIds;
            this.taskIds = request.taskIds;
            this.taskStatus = request.taskStatus;
            this.taskStatuses = request.taskStatuses;
            this.taskType = request.taskType;
            this.taskTypes = request.taskTypes;
        } 

        /**
         * <p>The ID of the cloud phone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-2zecay9ponatdc4m****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the cloud phone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>defaultInstanceName</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The ID of the command execution. You can set the value to the last returned request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B8ED2BA9-0C6A-5643-818F-B5D60A64****</p>
         */
        public Builder invokeId(String invokeId) {
            this.putQueryParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
            return this;
        }

        /**
         * <p>The level of the task. A value of 1 specifies a batch task. A value of 2 specifies an instance-level task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder level(Integer level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. If the parameter is left empty, the data is queried from the first entry.</p>
         * 
         * <strong>example:</strong>
         * <p>FFbc8N4E1iOlcSxC+8boa0HHH2LKWbggYUinyrZWvtS1oTrMYCg1HuMLGuftj0****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The extension field.</p>
         * 
         * <strong>example:</strong>
         * <p>param</p>
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * <p>The ID of the parent task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-iaej5dkbnmivx****</p>
         */
        public Builder parentTaskId(String parentTaskId) {
            this.putQueryParameter("ParentTaskId", parentTaskId);
            this.parentTaskId = parentTaskId;
            return this;
        }

        /**
         * <p>The IDs of the resources.</p>
         */
        public Builder resourceIds(java.util.List<String> resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The IDs of the tasks.</p>
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        /**
         * <p>The state of the task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PartFinished: The task is partially successful.</li>
         * <li>Finished: The task is completed.</li>
         * <li>Failed: The task failed.</li>
         * <li>Skipped: The task is skipped.</li>
         * <li>Processing: The task is running.</li>
         * <li>Waiting: The task is in queue.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Processing</p>
         */
        public Builder taskStatus(String taskStatus) {
            this.putQueryParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * <p>The status of the tasks.</p>
         */
        public Builder taskStatuses(java.util.List<String> taskStatuses) {
            this.putQueryParameter("TaskStatuses", taskStatuses);
            this.taskStatuses = taskStatuses;
            return this;
        }

        /**
         * <p>The type of the task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>BackupFile: backs up files.</li>
         * <li>StopInstance: stops cloud phone instances.</li>
         * <li>RebootInstance: restarts cloud phone instances.</li>
         * <li>StartApp: starts apps.</li>
         * <li>SendFile: uploads files.</li>
         * <li>RunCommand: sends remote command.</li>
         * <li>RestartApp: restarts apps.</li>
         * <li>ResetInstance: resets cloud phone instances.</li>
         * <li>RecoverFile: recovers files.</li>
         * <li>UninstallApp: uninstalls apps.</li>
         * <li>StopApp: stops apps.</li>
         * <li>Screenshot: takes screenshots.</li>
         * <li>InstallApp: installs apps.</li>
         * <li>FetchFile: downloads files.</li>
         * <li>UpdateGroupImage: replaces images.</li>
         * <li>StartInstance: starts instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>StartInstance</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The types of the tasks.</p>
         */
        public Builder taskTypes(java.util.List<String> taskTypes) {
            this.putQueryParameter("TaskTypes", taskTypes);
            this.taskTypes = taskTypes;
            return this;
        }

        @Override
        public DescribeTasksRequest build() {
            return new DescribeTasksRequest(this);
        } 

    } 

}
