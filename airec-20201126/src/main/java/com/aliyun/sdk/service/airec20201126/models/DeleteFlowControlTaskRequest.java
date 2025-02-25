// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteFlowControlTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteFlowControlTaskRequest</p>
 */
public class DeleteFlowControlTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private DeleteFlowControlTaskRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFlowControlTaskRequest create() {
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DeleteFlowControlTaskRequest, Builder> {
        private String instanceId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFlowControlTaskRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-7e22x6f75001</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1661506482</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DeleteFlowControlTaskRequest build() {
            return new DeleteFlowControlTaskRequest(this);
        } 

    } 

}
