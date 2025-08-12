// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DeleteHybridMonitorTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteHybridMonitorTaskRequest</p>
 */
public class DeleteHybridMonitorTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUserId")
    private String targetUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
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
         * <p>The name of the namespace.</p>
         * <p>The name can contain uppercase letters, lowercase letters, digits, and hyphens (-).</p>
         * <blockquote>
         * <p>This parameter is required only if you call this operation to delete metric import tasks for Alibaba Cloud services. In this case, the <code>TaskType</code> parameter is set to <code>aliyun_fc</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The ID of the member account.</p>
         * <blockquote>
         * <p>This parameter is required only if you use a management account to call this operation to query metric import tasks that belong to a member in a resource directory. In this case, the <code>TaskType</code> parameter is set to <code>aliyun_fc</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        public Builder targetUserId(String targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        /**
         * <p>The ID of the metric import task.</p>
         * <p>For information about how to obtain the ID of a metric import task, see <a href="https://help.aliyun.com/document_detail/428624.html">DescribeHybridMonitorTaskList</a>.</p>
         * <blockquote>
         * <p>This parameter is required only if you call this operation to delete metrics for the logs that are imported from Log Service. In this case, the <code>TaskType</code> parameter is set to <code>aliyun_sls</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>36****</p>
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
