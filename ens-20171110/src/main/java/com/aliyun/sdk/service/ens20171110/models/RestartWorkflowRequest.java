// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartWorkflowRequest} extends {@link RequestModel}
 *
 * <p>RestartWorkflowRequest</p>
 */
public class RestartWorkflowRequest extends Request {
    @Query
    @NameInMap("WorkflowIds")
    @Validation(required = true)
    private java.util.List < String > workflowIds;

    private RestartWorkflowRequest(Builder builder) {
        super(builder);
        this.workflowIds = builder.workflowIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartWorkflowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workflowIds
     */
    public java.util.List < String > getWorkflowIds() {
        return this.workflowIds;
    }

    public static final class Builder extends Request.Builder<RestartWorkflowRequest, Builder> {
        private java.util.List < String > workflowIds; 

        private Builder() {
            super();
        } 

        private Builder(RestartWorkflowRequest request) {
            super(request);
            this.workflowIds = request.workflowIds;
        } 

        /**
         * WorkflowIds.
         */
        public Builder workflowIds(java.util.List < String > workflowIds) {
            String workflowIdsShrink = shrink(workflowIds, "WorkflowIds", "json");
            this.putQueryParameter("WorkflowIds", workflowIdsShrink);
            this.workflowIds = workflowIds;
            return this;
        }

        @Override
        public RestartWorkflowRequest build() {
            return new RestartWorkflowRequest(this);
        } 

    } 

}
