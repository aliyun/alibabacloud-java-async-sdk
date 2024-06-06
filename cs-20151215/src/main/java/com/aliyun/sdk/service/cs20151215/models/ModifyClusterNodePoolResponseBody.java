// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterNodePoolResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyClusterNodePoolResponseBody</p>
 */
public class ModifyClusterNodePoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nodepool_id")
    private String nodepoolId;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("task_id")
    private String taskId;

    private ModifyClusterNodePoolResponseBody(Builder builder) {
        this.nodepoolId = builder.nodepoolId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterNodePoolResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String nodepoolId; 
        private String requestId; 
        private String taskId; 

        /**
         * The node pool ID.
         */
        public Builder nodepoolId(String nodepoolId) {
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The task ID.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public ModifyClusterNodePoolResponseBody build() {
            return new ModifyClusterNodePoolResponseBody(this);
        } 

    } 

}
