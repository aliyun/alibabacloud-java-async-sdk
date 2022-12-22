// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableFlowRequest} extends {@link RequestModel}
 *
 * <p>EnableFlowRequest</p>
 */
public class EnableFlowRequest extends Request {
    @Body
    @NameInMap("FlowId")
    @Validation(required = true)
    private String flowId;

    private EnableFlowRequest(Builder builder) {
        super(builder);
        this.flowId = builder.flowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableFlowRequest create() {
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

    public static final class Builder extends Request.Builder<EnableFlowRequest, Builder> {
        private String flowId; 

        private Builder() {
            super();
        } 

        private Builder(EnableFlowRequest request) {
            super(request);
            this.flowId = request.flowId;
        } 

        /**
         * The ID of the workflow that you want to enable.
         */
        public Builder flowId(String flowId) {
            this.putBodyParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        @Override
        public EnableFlowRequest build() {
            return new EnableFlowRequest(this);
        } 

    } 

}
