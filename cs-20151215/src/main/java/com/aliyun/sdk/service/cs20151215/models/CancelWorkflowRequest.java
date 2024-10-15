// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CancelWorkflowRequest} extends {@link RequestModel}
 *
 * <p>CancelWorkflowRequest</p>
 */
public class CancelWorkflowRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workflowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workflowName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("action")
    @com.aliyun.core.annotation.Validation(required = true)
    private String action;

    private CancelWorkflowRequest(Builder builder) {
        super(builder);
        this.workflowName = builder.workflowName;
        this.action = builder.action;
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
     * @return workflowName
     */
    public String getWorkflowName() {
        return this.workflowName;
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    public static final class Builder extends Request.Builder<CancelWorkflowRequest, Builder> {
        private String workflowName; 
        private String action; 

        private Builder() {
            super();
        } 

        private Builder(CancelWorkflowRequest request) {
            super(request);
            this.workflowName = request.workflowName;
            this.action = request.action;
        } 

        /**
         * <p>The name of the workflow that you want to cancel.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mapping-gpu-mhhgh</p>
         */
        public Builder workflowName(String workflowName) {
            this.putPathParameter("workflowName", workflowName);
            this.workflowName = workflowName;
            return this;
        }

        /**
         * <p>The operation that you want to perform. Set the value to cancel.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cancel</p>
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        @Override
        public CancelWorkflowRequest build() {
            return new CancelWorkflowRequest(this);
        } 

    } 

}
