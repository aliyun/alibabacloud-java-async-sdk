// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
    private java.util.List < String > resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    private java.util.List < String > taskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStatuses")
    private java.util.List < String > taskStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskTypes")
    private java.util.List < String > taskTypes;

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
    public java.util.List < String > getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return taskIds
     */
    public java.util.List < String > getTaskIds() {
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
    public java.util.List < String > getTaskStatuses() {
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
    public java.util.List < String > getTaskTypes() {
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
        private java.util.List < String > resourceIds; 
        private java.util.List < String > taskIds; 
        private String taskStatus; 
        private java.util.List < String > taskStatuses; 
        private String taskType; 
        private java.util.List < String > taskTypes; 

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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * InvokeId.
         */
        public Builder invokeId(String invokeId) {
            this.putQueryParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(Integer level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Param.
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * ParentTaskId.
         */
        public Builder parentTaskId(String parentTaskId) {
            this.putQueryParameter("ParentTaskId", parentTaskId);
            this.parentTaskId = parentTaskId;
            return this;
        }

        /**
         * ResourceIds.
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * TaskIds.
         */
        public Builder taskIds(java.util.List < String > taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.putQueryParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * TaskStatuses.
         */
        public Builder taskStatuses(java.util.List < String > taskStatuses) {
            this.putQueryParameter("TaskStatuses", taskStatuses);
            this.taskStatuses = taskStatuses;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * TaskTypes.
         */
        public Builder taskTypes(java.util.List < String > taskTypes) {
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
