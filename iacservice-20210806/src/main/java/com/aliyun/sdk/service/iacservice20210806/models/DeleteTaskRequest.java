// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link DeleteTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteTaskRequest</p>
 */
public class DeleteTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceRetentionPolicy")
    private String resourceRetentionPolicy;

    private DeleteTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.resourceRetentionPolicy = builder.resourceRetentionPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return resourceRetentionPolicy
     */
    public String getResourceRetentionPolicy() {
        return this.resourceRetentionPolicy;
    }

    public static final class Builder extends Request.Builder<DeleteTaskRequest, Builder> {
        private String taskId; 
        private String resourceRetentionPolicy; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.resourceRetentionPolicy = request.resourceRetentionPolicy;
        } 

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-123456</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The data retention policy. If this parameter is not specified, the policy is unconfirmed. If the node has resources or the resource status is unknown, the operation returns a confirmation fault. Set this parameter to RETAIN to delete only the node management record and retain the cloud resources.</p>
         */
        public Builder resourceRetentionPolicy(String resourceRetentionPolicy) {
            this.putQueryParameter("resourceRetentionPolicy", resourceRetentionPolicy);
            this.resourceRetentionPolicy = resourceRetentionPolicy;
            return this;
        }

        @Override
        public DeleteTaskRequest build() {
            return new DeleteTaskRequest(this);
        } 

    } 

}
