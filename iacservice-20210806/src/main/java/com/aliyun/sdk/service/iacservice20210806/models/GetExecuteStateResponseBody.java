// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetExecuteStateResponseBody} extends {@link TeaModel}
 *
 * <p>GetExecuteStateResponseBody</p>
 */
public class GetExecuteStateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("logFile")
    private java.util.Map<String, ?> logFile;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private GetExecuteStateResponseBody(Builder builder) {
        this.errorMessage = builder.errorMessage;
        this.logFile = builder.logFile;
        this.requestId = builder.requestId;
        this.state = builder.state;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExecuteStateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return logFile
     */
    public java.util.Map<String, ?> getLogFile() {
        return this.logFile;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String errorMessage; 
        private java.util.Map<String, ?> logFile; 
        private String requestId; 
        private String state; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetExecuteStateResponseBody model) {
            this.errorMessage = model.errorMessage;
            this.logFile = model.logFile;
            this.requestId = model.requestId;
            this.state = model.state;
            this.status = model.status;
        } 

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Your account does not have enough balance to order postpaid product.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The run log.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tf-plan.run.log&quot;:&quot;xxx&quot;}</p>
         */
        public Builder logFile(java.util.Map<String, ?> logFile) {
            this.logFile = logFile;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B4672AE3-C313-5B7A-BB24-45345570D398</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state file content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;version&quot;: 4, &quot;terraform_version&quot;: &quot;1.5.7&quot;, &quot;serial&quot;: 3, &quot;lineage&quot;: &quot;cb71b0b2-1ec2-6483-d409-8cae23186ec6&quot;,  &quot;outputs&quot;: {}, &quot;resources&quot;: [], &quot;check_results&quot;: null}</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>Pending: ready to start.</li>
         * <li>PlanQueued: the plan task has been created but is waiting in the queue because no workflow is available.</li>
         * <li>ApplyQueued: the apply task has been created but is waiting in the queue because no workflow is available.</li>
         * <li>Planning: the plan phase is being executed.</li>
         * <li>Planned: the plan execution is complete.</li>
         * <li>Confirmed: the plan has been confirmed after execution.</li>
         * <li>PlannedAndFinished: the plan execution is complete and no diff was found. The job is in a terminal state.</li>
         * <li>Applying: the apply phase is being executed.</li>
         * <li>Applied: the apply execution is complete.</li>
         * <li>Discarded: the task has been discarded. This is a terminal state.</li>
         * <li>Errored: the execution encountered an error. This is a terminal state.</li>
         * <li>Canceled: the execution has been canceled. This is a terminal state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetExecuteStateResponseBody build() {
            return new GetExecuteStateResponseBody(this);
        } 

    } 

}
