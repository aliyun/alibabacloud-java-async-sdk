// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>StartWorkflowResponseBody</p>
 */
public class StartWorkflowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private StartWorkflowResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartWorkflowResponseBody create() {
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
         * <p><strong><strong><strong>42-E8E1-4FBB-8E52-F4225C</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the workflow task.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>22dad741d086a50325f9</strong></strong></strong></p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public StartWorkflowResponseBody build() {
            return new StartWorkflowResponseBody(this);
        } 

    } 

}
