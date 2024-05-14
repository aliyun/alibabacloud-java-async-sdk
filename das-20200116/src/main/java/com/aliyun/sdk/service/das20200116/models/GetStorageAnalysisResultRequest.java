// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStorageAnalysisResultRequest} extends {@link RequestModel}
 *
 * <p>GetStorageAnalysisResultRequest</p>
 */
public class GetStorageAnalysisResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private GetStorageAnalysisResultRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageAnalysisResultRequest create() {
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
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetStorageAnalysisResultRequest, Builder> {
        private String instanceId; 
        private String nodeId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetStorageAnalysisResultRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.taskId = request.taskId;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The node ID.
         * <p>
         * 
         * >  This parameter is reserved.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The task ID, which is returned after you call the CreateStorageAnalysisTask operation.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetStorageAnalysisResultRequest build() {
            return new GetStorageAnalysisResultRequest(this);
        } 

    } 

}
