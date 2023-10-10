// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterNodePoolResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClusterNodePoolResponseBody</p>
 */
public class CreateClusterNodePoolResponseBody extends TeaModel {
    @NameInMap("nodepool_id")
    private String nodepoolId;

    @NameInMap("task_id")
    private String taskId;

    private CreateClusterNodePoolResponseBody(Builder builder) {
        this.nodepoolId = builder.nodepoolId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterNodePoolResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String nodepoolId; 
        private String taskId; 

        /**
         * The node pool ID.
         */
        public Builder nodepoolId(String nodepoolId) {
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * 任务ID
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateClusterNodePoolResponseBody build() {
            return new CreateClusterNodePoolResponseBody(this);
        } 

    } 

}
