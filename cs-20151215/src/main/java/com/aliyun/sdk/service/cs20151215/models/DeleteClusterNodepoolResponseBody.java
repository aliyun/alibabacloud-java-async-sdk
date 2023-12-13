// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClusterNodepoolResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteClusterNodepoolResponseBody</p>
 */
public class DeleteClusterNodepoolResponseBody extends TeaModel {
    @NameInMap("request_id")
    private String requestId;

    @NameInMap("task_id")
    private String taskId;

    private DeleteClusterNodepoolResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClusterNodepoolResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * task_id.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public DeleteClusterNodepoolResponseBody build() {
            return new DeleteClusterNodepoolResponseBody(this);
        } 

    } 

}
