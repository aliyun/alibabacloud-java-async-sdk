// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ModifyClusterNodePoolResponseBody model) {
            this.nodepoolId = model.nodepoolId;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The node pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>np737c3ac1ac684703b9e10673aa2c****</p>
         */
        public Builder nodepoolId(String nodepoolId) {
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>687C5BAA-D103-4993-884B-C35E4314****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>T-5fd211e924e1d00787000293</p>
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
