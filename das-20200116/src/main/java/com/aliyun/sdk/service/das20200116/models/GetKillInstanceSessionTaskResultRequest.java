// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetKillInstanceSessionTaskResultRequest} extends {@link RequestModel}
 *
 * <p>GetKillInstanceSessionTaskResultRequest</p>
 */
public class GetKillInstanceSessionTaskResultRequest extends Request {
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

    private GetKillInstanceSessionTaskResultRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKillInstanceSessionTaskResultRequest create() {
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

    public static final class Builder extends Request.Builder<GetKillInstanceSessionTaskResultRequest, Builder> {
        private String instanceId; 
        private String nodeId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetKillInstanceSessionTaskResultRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p> You must specify this parameter if your database instance is a PolarDB for MySQL cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-8vbkfj5a756um****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The task ID. You can obtain the task ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/609246.html">CreateKillInstanceSessionTask</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f77d535b45405bd462b21caa3ee8****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetKillInstanceSessionTaskResultRequest build() {
            return new GetKillInstanceSessionTaskResultRequest(this);
        } 

    } 

}
