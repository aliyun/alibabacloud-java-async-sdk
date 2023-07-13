// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHybridMonitorTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteHybridMonitorTaskRequest</p>
 */
public class DeleteHybridMonitorTaskRequest extends Request {
    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("TargetUserId")
    private String targetUserId;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    private DeleteHybridMonitorTaskRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.targetUserId = builder.targetUserId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHybridMonitorTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return targetUserId
     */
    public String getTargetUserId() {
        return this.targetUserId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DeleteHybridMonitorTaskRequest, Builder> {
        private String namespace; 
        private String targetUserId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHybridMonitorTaskRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.targetUserId = request.targetUserId;
            this.taskId = request.taskId;
        } 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder targetUserId(String targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        /**
         * The ID of the member account.
         * <p>
         * 
         * >  This parameter is required only if you call this operation to delete metric import tasks that belong to a member in a resource directory. In this case, the `TaskType` parameter is set to `aliyun_fc`.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DeleteHybridMonitorTaskRequest build() {
            return new DeleteHybridMonitorTaskRequest(this);
        } 

    } 

}
