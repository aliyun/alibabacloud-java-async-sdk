// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RepairClusterNodePoolResponseBody} extends {@link TeaModel}
 *
 * <p>RepairClusterNodePoolResponseBody</p>
 */
public class RepairClusterNodePoolResponseBody extends TeaModel {
    @NameInMap("request_id")
    private String requestId;

    @NameInMap("task_id")
    private String taskId;

    private RepairClusterNodePoolResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RepairClusterNodePoolResponseBody create() {
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
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 任务ID
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public RepairClusterNodePoolResponseBody build() {
            return new RepairClusterNodePoolResponseBody(this);
        } 

    } 

}
