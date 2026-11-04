// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link StartBack2BackCallRequest} extends {@link RequestModel}
 *
 * <p>StartBack2BackCallRequest</p>
 */
public class StartBack2BackCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallCenterNumber")
    private String callCenterNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Callee")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    private String workflowId;

    private StartBack2BackCallRequest(Builder builder) {
        super(builder);
        this.callCenterNumber = builder.callCenterNumber;
        this.callee = builder.callee;
        this.caller = builder.caller;
        this.instanceId = builder.instanceId;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartBack2BackCallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callCenterNumber
     */
    public String getCallCenterNumber() {
        return this.callCenterNumber;
    }

    /**
     * @return callee
     */
    public String getCallee() {
        return this.callee;
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<StartBack2BackCallRequest, Builder> {
        private String callCenterNumber; 
        private String callee; 
        private String caller; 
        private String instanceId; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(StartBack2BackCallRequest request) {
            super(request);
            this.callCenterNumber = request.callCenterNumber;
            this.callee = request.callee;
            this.caller = request.caller;
            this.instanceId = request.instanceId;
            this.workflowId = request.workflowId;
        } 

        /**
         * CallCenterNumber.
         */
        public Builder callCenterNumber(String callCenterNumber) {
            this.putQueryParameter("CallCenterNumber", callCenterNumber);
            this.callCenterNumber = callCenterNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder callee(String callee) {
            this.putQueryParameter("Callee", callee);
            this.callee = callee;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * WorkflowId.
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public StartBack2BackCallRequest build() {
            return new StartBack2BackCallRequest(this);
        } 

    } 

}
