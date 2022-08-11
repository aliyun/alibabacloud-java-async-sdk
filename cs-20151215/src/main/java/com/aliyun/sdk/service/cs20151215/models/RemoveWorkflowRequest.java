// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveWorkflowRequest} extends {@link RequestModel}
 *
 * <p>RemoveWorkflowRequest</p>
 */
public class RemoveWorkflowRequest extends Request {
    @Path
    @NameInMap("workflowName")
    @Validation(required = true)
    private String workflowName;

    private RemoveWorkflowRequest(Builder builder) {
        super(builder);
        this.workflowName = builder.workflowName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveWorkflowRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveWorkflowRequest, Builder> {
        private String workflowName; 

        private Builder() {
            super();
        } 

        private Builder(RemoveWorkflowRequest request) {
            super(request);
            this.workflowName = request.workflowName;
        } 

        /**
         * 工作流名称。
         */
        public Builder workflowName(String workflowName) {
            this.putPathParameter("workflowName", workflowName);
            this.workflowName = workflowName;
            return this;
        }

        @Override
        public RemoveWorkflowRequest build() {
            return new RemoveWorkflowRequest(this);
        } 

    } 

}
