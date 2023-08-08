// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachInstancesToNodePoolResponseBody} extends {@link TeaModel}
 *
 * <p>AttachInstancesToNodePoolResponseBody</p>
 */
public class AttachInstancesToNodePoolResponseBody extends TeaModel {
    @NameInMap("request_id")
    private String requestId;

    @NameInMap("task_id")
    private String taskId;

    private AttachInstancesToNodePoolResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachInstancesToNodePoolResponseBody create() {
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
         * request_id.
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

        public AttachInstancesToNodePoolResponseBody build() {
            return new AttachInstancesToNodePoolResponseBody(this);
        } 

    } 

}
