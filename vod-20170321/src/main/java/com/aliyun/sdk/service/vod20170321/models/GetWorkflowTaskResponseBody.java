// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetWorkflowTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkflowTaskResponseBody</p>
 */
public class GetWorkflowTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("FinishTimeUtc")
    private String finishTimeUtc;

    @com.aliyun.core.annotation.NameInMap("GmtCreateUtc")
    private String gmtCreateUtc;

    @com.aliyun.core.annotation.NameInMap("NodeResults")
    private String nodeResults;

    @com.aliyun.core.annotation.NameInMap("Outputs")
    private String outputs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    private String workflowId;

    private GetWorkflowTaskResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.finishTimeUtc = builder.finishTimeUtc;
        this.gmtCreateUtc = builder.gmtCreateUtc;
        this.nodeResults = builder.nodeResults;
        this.outputs = builder.outputs;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.userData = builder.userData;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkflowTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return finishTimeUtc
     */
    public String getFinishTimeUtc() {
        return this.finishTimeUtc;
    }

    /**
     * @return gmtCreateUtc
     */
    public String getGmtCreateUtc() {
        return this.gmtCreateUtc;
    }

    /**
     * @return nodeResults
     */
    public String getNodeResults() {
        return this.nodeResults;
    }

    /**
     * @return outputs
     */
    public String getOutputs() {
        return this.outputs;
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String finishTimeUtc; 
        private String gmtCreateUtc; 
        private String nodeResults; 
        private String outputs; 
        private String requestId; 
        private String status; 
        private String taskId; 
        private String userData; 
        private String workflowId; 

        private Builder() {
        } 

        private Builder(GetWorkflowTaskResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.finishTimeUtc = model.finishTimeUtc;
            this.gmtCreateUtc = model.gmtCreateUtc;
            this.nodeResults = model.nodeResults;
            this.outputs = model.outputs;
            this.requestId = model.requestId;
            this.status = model.status;
            this.taskId = model.taskId;
            this.userData = model.userData;
            this.workflowId = model.workflowId;
        } 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * FinishTimeUtc.
         */
        public Builder finishTimeUtc(String finishTimeUtc) {
            this.finishTimeUtc = finishTimeUtc;
            return this;
        }

        /**
         * GmtCreateUtc.
         */
        public Builder gmtCreateUtc(String gmtCreateUtc) {
            this.gmtCreateUtc = gmtCreateUtc;
            return this;
        }

        /**
         * NodeResults.
         */
        public Builder nodeResults(String nodeResults) {
            this.nodeResults = nodeResults;
            return this;
        }

        /**
         * Outputs.
         */
        public Builder outputs(String outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>63E8B7C7-4812-46*****AD-0FA56029AC86</p>
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        /**
         * WorkflowId.
         */
        public Builder workflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }

        public GetWorkflowTaskResponseBody build() {
            return new GetWorkflowTaskResponseBody(this);
        } 

    } 

}
