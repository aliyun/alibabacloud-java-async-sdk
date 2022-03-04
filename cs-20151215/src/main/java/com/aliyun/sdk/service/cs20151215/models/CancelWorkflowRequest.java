// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelWorkflowRequest} extends {@link RequestModel}
 *
 * <p>CancelWorkflowRequest</p>
 */
public class CancelWorkflowRequest extends Request {
    @Body
    @NameInMap("action")
    @Validation(required = true)
    private String action;

    @Path
    @NameInMap("workflowName")
    @Validation(required = true)
    private String workflowName;

    private CancelWorkflowRequest(Builder builder) {
        super(builder);
        this.action = builder.action;
        this.workflowName = builder.workflowName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelWorkflowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return workflowName
     */
    public String getWorkflowName() {
        return this.workflowName;
    }

    public static final class Builder extends Request.Builder<CancelWorkflowRequest, Builder> {
        private String action; 
        private String workflowName; 

        private Builder() {
            super();
        } 

        private Builder(CancelWorkflowRequest request) {
            super(request);
            this.action = request.action;
            this.workflowName = request.workflowName;
        } 

        /**
         * The operation that you want to perform. Currently, only cancel is supported.
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * The name of the workflow.
         */
        public Builder workflowName(String workflowName) {
            this.putPathParameter("workflowName", workflowName);
            this.workflowName = workflowName;
            return this;
        }

        @Override
        public CancelWorkflowRequest build() {
            return new CancelWorkflowRequest(this);
        } 

    } 

}
