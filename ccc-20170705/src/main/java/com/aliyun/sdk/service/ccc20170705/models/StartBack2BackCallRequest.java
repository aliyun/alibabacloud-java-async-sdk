// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartBack2BackCallRequest} extends {@link RequestModel}
 *
 * <p>StartBack2BackCallRequest</p>
 */
public class StartBack2BackCallRequest extends Request {
    @Query
    @NameInMap("CallCenterNumber")
    private String callCenterNumber;

    @Query
    @NameInMap("Callee")
    @Validation(required = true)
    private String callee;

    @Query
    @NameInMap("Caller")
    @Validation(required = true)
    private String caller;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("WorkflowId")
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

        private Builder(StartBack2BackCallRequest response) {
            super(response);
            this.callCenterNumber = response.callCenterNumber;
            this.callee = response.callee;
            this.caller = response.caller;
            this.instanceId = response.instanceId;
            this.workflowId = response.workflowId;
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
         * Callee.
         */
        public Builder callee(String callee) {
            this.putQueryParameter("Callee", callee);
            this.callee = callee;
            return this;
        }

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * InstanceId.
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
