// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeComfyTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeComfyTasksRequest</p>
 */
public class DescribeComfyTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HiveId")
    private String hiveId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskState")
    private String taskState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    private String workflowId;

    private DescribeComfyTasksRequest(Builder builder) {
        super(builder);
        this.hiveId = builder.hiveId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.taskId = builder.taskId;
        this.taskState = builder.taskState;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComfyTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hiveId
     */
    public String getHiveId() {
        return this.hiveId;
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskState
     */
    public String getTaskState() {
        return this.taskState;
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<DescribeComfyTasksRequest, Builder> {
        private String hiveId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String taskId; 
        private String taskState; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeComfyTasksRequest request) {
            super(request);
            this.hiveId = request.hiveId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.taskId = request.taskId;
            this.taskState = request.taskState;
            this.workflowId = request.workflowId;
        } 

        /**
         * <p>The HiveId used as a filter condition to query tasks executed under the specified HiveId.</p>
         * 
         * <strong>example:</strong>
         * <p>hive-26cd567b35c04a0a90f0xxxxx</p>
         */
        public Builder hiveId(String hiveId) {
            this.putQueryParameter("HiveId", hiveId);
            this.hiveId = hiveId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The Comfy workflow ID used as a filter condition.</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The task status used as a filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>QUEUED</p>
         */
        public Builder taskState(String taskState) {
            this.putQueryParameter("TaskState", taskState);
            this.taskState = taskState;
            return this;
        }

        /**
         * <p>The Comfy workflow ID used as a filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>wf_adb32aed-ccdc-42ae-b4d4-a21181ac8a5f</p>
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public DescribeComfyTasksRequest build() {
            return new DescribeComfyTasksRequest(this);
        } 

    } 

}
