// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWorkflowActivityRequest} extends {@link RequestModel}
 *
 * <p>DescribeWorkflowActivityRequest</p>
 */
public class DescribeWorkflowActivityRequest extends Request {
    @Query
    @NameInMap("WorkFlowId")
    @Validation(required = true)
    private String workFlowId;

    private DescribeWorkflowActivityRequest(Builder builder) {
        super(builder);
        this.workFlowId = builder.workFlowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWorkflowActivityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workFlowId
     */
    public String getWorkFlowId() {
        return this.workFlowId;
    }

    public static final class Builder extends Request.Builder<DescribeWorkflowActivityRequest, Builder> {
        private String workFlowId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWorkflowActivityRequest request) {
            super(request);
            this.workFlowId = request.workFlowId;
        } 

        /**
         * WorkFlowId.
         */
        public Builder workFlowId(String workFlowId) {
            this.putQueryParameter("WorkFlowId", workFlowId);
            this.workFlowId = workFlowId;
            return this;
        }

        @Override
        public DescribeWorkflowActivityRequest build() {
            return new DescribeWorkflowActivityRequest(this);
        } 

    } 

}
