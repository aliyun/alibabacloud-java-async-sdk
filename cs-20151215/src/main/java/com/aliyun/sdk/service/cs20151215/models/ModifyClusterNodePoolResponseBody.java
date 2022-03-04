// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterNodePoolResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyClusterNodePoolResponseBody</p>
 */
public class ModifyClusterNodePoolResponseBody extends TeaModel {
    @NameInMap("task_id")
    private String taskId;

    @NameInMap("nodepool_id")
    private String nodepoolId;

    private ModifyClusterNodePoolResponseBody(Builder builder) {
        this.taskId = builder.taskId;
        this.nodepoolId = builder.nodepoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterNodePoolResponseBody create() {
        return builder().build();
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    public static final class Builder {
        private String taskId; 
        private String nodepoolId; 

        /**
         * The ID of the task.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * The ID of the node pool.
         */
        public Builder nodepoolId(String nodepoolId) {
            this.nodepoolId = nodepoolId;
            return this;
        }

        public ModifyClusterNodePoolResponseBody build() {
            return new ModifyClusterNodePoolResponseBody(this);
        } 

    } 

}
