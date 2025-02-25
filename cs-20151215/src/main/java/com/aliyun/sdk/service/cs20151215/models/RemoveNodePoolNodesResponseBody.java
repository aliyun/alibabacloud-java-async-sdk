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
 * {@link RemoveNodePoolNodesResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveNodePoolNodesResponseBody</p>
 */
public class RemoveNodePoolNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("task_id")
    private String taskId;

    private RemoveNodePoolNodesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveNodePoolNodesResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private String taskId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A9891419-D125-4D89-AFCA-68846675E2F7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>T-62a944794ee141074400****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public RemoveNodePoolNodesResponseBody build() {
            return new RemoveNodePoolNodesResponseBody(this);
        } 

    } 

}
