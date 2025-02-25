// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ExecuteAdhocWorkflowInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteAdhocWorkflowInstanceResponseBody</p>
 */
public class ExecuteAdhocWorkflowInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkflowInstanceId")
    private Long workflowInstanceId;

    private ExecuteAdhocWorkflowInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.workflowInstanceId = builder.workflowInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteAdhocWorkflowInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workflowInstanceId
     */
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    public static final class Builder {
        private String requestId; 
        private Long workflowInstanceId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The workflow instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder workflowInstanceId(Long workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }

        public ExecuteAdhocWorkflowInstanceResponseBody build() {
            return new ExecuteAdhocWorkflowInstanceResponseBody(this);
        } 

    } 

}
