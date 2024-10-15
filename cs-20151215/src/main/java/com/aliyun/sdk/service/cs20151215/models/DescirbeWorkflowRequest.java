// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescirbeWorkflowRequest} extends {@link RequestModel}
 *
 * <p>DescirbeWorkflowRequest</p>
 */
public class DescirbeWorkflowRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workflowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workflowName;

    private DescirbeWorkflowRequest(Builder builder) {
        super(builder);
        this.workflowName = builder.workflowName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescirbeWorkflowRequest create() {
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

    public static final class Builder extends Request.Builder<DescirbeWorkflowRequest, Builder> {
        private String workflowName; 

        private Builder() {
            super();
        } 

        private Builder(DescirbeWorkflowRequest request) {
            super(request);
            this.workflowName = request.workflowName;
        } 

        /**
         * <p>The name of the workflow.</p>
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

        @Override
        public DescirbeWorkflowRequest build() {
            return new DescirbeWorkflowRequest(this);
        } 

    } 

}
