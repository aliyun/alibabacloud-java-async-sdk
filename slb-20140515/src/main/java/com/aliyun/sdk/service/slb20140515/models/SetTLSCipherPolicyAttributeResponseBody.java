// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetTLSCipherPolicyAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>SetTLSCipherPolicyAttributeResponseBody</p>
 */
public class SetTLSCipherPolicyAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private SetTLSCipherPolicyAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetTLSCipherPolicyAttributeResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the asynchronous task.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public SetTLSCipherPolicyAttributeResponseBody build() {
            return new SetTLSCipherPolicyAttributeResponseBody(this);
        } 

    } 

}
