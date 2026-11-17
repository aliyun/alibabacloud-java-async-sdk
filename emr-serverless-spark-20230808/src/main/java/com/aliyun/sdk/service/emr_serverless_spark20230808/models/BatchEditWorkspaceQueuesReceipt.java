// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link BatchEditWorkspaceQueuesReceipt} extends {@link TeaModel}
 *
 * <p>BatchEditWorkspaceQueuesReceipt</p>
 */
public class BatchEditWorkspaceQueuesReceipt extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("acceptedQueues")
    private java.util.List<String> acceptedQueues;

    @com.aliyun.core.annotation.NameInMap("skippedQueues")
    private java.util.List<String> skippedQueues;

    @com.aliyun.core.annotation.NameInMap("workflowInstanceId")
    private Long workflowInstanceId;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private BatchEditWorkspaceQueuesReceipt(Builder builder) {
        this.acceptedQueues = builder.acceptedQueues;
        this.skippedQueues = builder.skippedQueues;
        this.workflowInstanceId = builder.workflowInstanceId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchEditWorkspaceQueuesReceipt create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptedQueues
     */
    public java.util.List<String> getAcceptedQueues() {
        return this.acceptedQueues;
    }

    /**
     * @return skippedQueues
     */
    public java.util.List<String> getSkippedQueues() {
        return this.skippedQueues;
    }

    /**
     * @return workflowInstanceId
     */
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private java.util.List<String> acceptedQueues; 
        private java.util.List<String> skippedQueues; 
        private Long workflowInstanceId; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(BatchEditWorkspaceQueuesReceipt model) {
            this.acceptedQueues = model.acceptedQueues;
            this.skippedQueues = model.skippedQueues;
            this.workflowInstanceId = model.workflowInstanceId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The target states of these queues are progressively written during the workflow.</p>
         */
        public Builder acceptedQueues(java.util.List<String> acceptedQueues) {
            this.acceptedQueues = acceptedQueues;
            return this;
        }

        /**
         * <p>The current values are already equal to the target values, so no write operations are required.</p>
         */
        public Builder skippedQueues(java.util.List<String> skippedQueues) {
            this.skippedQueues = skippedQueues;
            return this;
        }

        /**
         * <p>A null value indicates that all queues in this request are already in the target state and no workflow is started (idempotent no-op).</p>
         * 
         * <strong>example:</strong>
         * <p>9527</p>
         */
        public Builder workflowInstanceId(Long workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-1234abcd</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public BatchEditWorkspaceQueuesReceipt build() {
            return new BatchEditWorkspaceQueuesReceipt(this);
        } 

    } 

}
