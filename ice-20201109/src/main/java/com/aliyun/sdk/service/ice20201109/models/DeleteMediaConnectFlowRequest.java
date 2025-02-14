// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link DeleteMediaConnectFlowRequest} extends {@link RequestModel}
 *
 * <p>DeleteMediaConnectFlowRequest</p>
 */
public class DeleteMediaConnectFlowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowId;

    private DeleteMediaConnectFlowRequest(Builder builder) {
        super(builder);
        this.flowId = builder.flowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMediaConnectFlowRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteMediaConnectFlowRequest, Builder> {
        private String flowId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMediaConnectFlowRequest request) {
            super(request);
            this.flowId = request.flowId;
        } 

        /**
         * <p>Flow instance ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0381f478-7d53-4076-9d5f-27680a6f73e7</p>
         */
        public Builder flowId(String flowId) {
            this.putQueryParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        @Override
        public DeleteMediaConnectFlowRequest build() {
            return new DeleteMediaConnectFlowRequest(this);
        } 

    } 

}
