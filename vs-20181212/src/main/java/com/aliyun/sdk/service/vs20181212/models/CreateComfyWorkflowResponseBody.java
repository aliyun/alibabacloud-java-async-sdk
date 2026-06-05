// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link CreateComfyWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>CreateComfyWorkflowResponseBody</p>
 */
public class CreateComfyWorkflowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("MissingNodes")
    private java.util.List<String> missingNodes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    private String workflowId;

    private CreateComfyWorkflowResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.missingNodes = builder.missingNodes;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateComfyWorkflowResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return missingNodes
     */
    public java.util.List<String> getMissingNodes() {
        return this.missingNodes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder {
        private Long code; 
        private String message; 
        private java.util.List<String> missingNodes; 
        private String requestId; 
        private String status; 
        private String workflowId; 

        private Builder() {
        } 

        private Builder(CreateComfyWorkflowResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.missingNodes = model.missingNodes;
            this.requestId = model.requestId;
            this.status = model.status;
            this.workflowId = model.workflowId;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * MissingNodes.
         */
        public Builder missingNodes(java.util.List<String> missingNodes) {
            this.missingNodes = missingNodes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * WorkflowId.
         */
        public Builder workflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }

        public CreateComfyWorkflowResponseBody build() {
            return new CreateComfyWorkflowResponseBody(this);
        } 

    } 

}
