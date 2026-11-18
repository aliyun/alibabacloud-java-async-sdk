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
         * <p>The error code returned when transcoding fails.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned when transcoding fails.</p>
         * 
         * <strong>example:</strong>
         * <p>ErrorMessage</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The time when the task was completed. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-19T02:28:22Z</p>
         */
        public Builder finishTimeUtc(String finishTimeUtc) {
            this.finishTimeUtc = finishTimeUtc;
            return this;
        }

        /**
         * <p>The time when the task was created. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-28T02:17:26Z</p>
         */
        public Builder gmtCreateUtc(String gmtCreateUtc) {
            this.gmtCreateUtc = gmtCreateUtc;
            return this;
        }

        /**
         * <p>The node results of the workflow task. The value is in JSON format and varies based on the workflow configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder nodeResults(String nodeResults) {
            this.nodeResults = nodeResults;
            return this;
        }

        /**
         * <p>The output information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
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
         * <p>The review result. Indicates the current manual review result. Valid values:</p>
         * <ul>
         * <li><strong>running</strong>: Running.</li>
         * <li><strong>stopped</strong>: Stopped.</li>
         * <li><strong>failed</strong>: Failed.</li>
         * <li><strong>partial-succeeded</strong>: Partially succeeded.</li>
         * <li><strong>succeeded</strong>: Succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>succeeded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The task ID used to query the refresh status.</p>
         * 
         * <strong>example:</strong>
         * <p>70422****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The custom information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        /**
         * <p>The workflow ID. You can log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration management</strong> &gt; <strong>Media processing configuration</strong> &gt; <strong>Workflow management</strong> to view the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>613efff3887ec34af685714cc461****</p>
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
