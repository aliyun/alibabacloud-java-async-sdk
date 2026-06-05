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
 * {@link DeleteComfyWorkflowRequest} extends {@link RequestModel}
 *
 * <p>DeleteComfyWorkflowRequest</p>
 */
public class DeleteComfyWorkflowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workflowId;

    private DeleteComfyWorkflowRequest(Builder builder) {
        super(builder);
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteComfyWorkflowRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<DeleteComfyWorkflowRequest, Builder> {
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteComfyWorkflowRequest request) {
            super(request);
            this.workflowId = request.workflowId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wf_adb32aed-ccdc-42ae-b4d4-a21181ac8a5f</p>
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public DeleteComfyWorkflowRequest build() {
            return new DeleteComfyWorkflowRequest(this);
        } 

    } 

}
