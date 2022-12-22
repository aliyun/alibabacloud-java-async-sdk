// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFlowRequest} extends {@link RequestModel}
 *
 * <p>GetFlowRequest</p>
 */
public class GetFlowRequest extends Request {
    @Body
    @NameInMap("FlowId")
    @Validation(required = true)
    private String flowId;

    private GetFlowRequest(Builder builder) {
        super(builder);
        this.flowId = builder.flowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    public static final class Builder extends Request.Builder<GetFlowRequest, Builder> {
        private String flowId; 

        private Builder() {
            super();
        } 

        private Builder(GetFlowRequest request) {
            super(request);
            this.flowId = request.flowId;
        } 

        /**
         * The ID of the workflow.
         */
        public Builder flowId(String flowId) {
            this.putBodyParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        @Override
        public GetFlowRequest build() {
            return new GetFlowRequest(this);
        } 

    } 

}
