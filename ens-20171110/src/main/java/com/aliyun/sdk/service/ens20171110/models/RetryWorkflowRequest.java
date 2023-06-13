// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryWorkflowRequest} extends {@link RequestModel}
 *
 * <p>RetryWorkflowRequest</p>
 */
public class RetryWorkflowRequest extends Request {
    @Query
    @NameInMap("WorkflowIds")
    @Validation(required = true)
    private java.util.List < String > workflowIds;

    private RetryWorkflowRequest(Builder builder) {
        super(builder);
        this.workflowIds = builder.workflowIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryWorkflowRequest create() {
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

    public static final class Builder extends Request.Builder<RetryWorkflowRequest, Builder> {
        private java.util.List < String > workflowIds; 

        private Builder() {
            super();
        } 

        private Builder(RetryWorkflowRequest request) {
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
        public RetryWorkflowRequest build() {
            return new RetryWorkflowRequest(this);
        } 

    } 

}
