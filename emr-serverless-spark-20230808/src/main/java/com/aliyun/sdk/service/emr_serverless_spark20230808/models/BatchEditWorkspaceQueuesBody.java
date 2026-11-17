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
 * {@link BatchEditWorkspaceQueuesBody} extends {@link TeaModel}
 *
 * <p>BatchEditWorkspaceQueuesBody</p>
 */
public class BatchEditWorkspaceQueuesBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("queues")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<BatchEditQueueSpec> queues;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private BatchEditWorkspaceQueuesBody(Builder builder) {
        this.queues = builder.queues;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchEditWorkspaceQueuesBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queues
     */
    public java.util.List<BatchEditQueueSpec> getQueues() {
        return this.queues;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private java.util.List<BatchEditQueueSpec> queues; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(BatchEditWorkspaceQueuesBody model) {
            this.queues = model.queues;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The list of queues to update. Each entry independently specifies the absolute target state of a queue. Queue names must be unique within the same request.</p>
         * <p>This parameter is required.</p>
         */
        public Builder queues(java.util.List<BatchEditQueueSpec> queues) {
            this.queues = queues;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>w-1234abcd</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public BatchEditWorkspaceQueuesBody build() {
            return new BatchEditWorkspaceQueuesBody(this);
        } 

    } 

}
