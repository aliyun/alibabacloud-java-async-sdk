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
 * {@link CloseMediaConnectFlowFailoverRequest} extends {@link RequestModel}
 *
 * <p>CloseMediaConnectFlowFailoverRequest</p>
 */
public class CloseMediaConnectFlowFailoverRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowId")
    private String flowId;

    private CloseMediaConnectFlowFailoverRequest(Builder builder) {
        super(builder);
        this.flowId = builder.flowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseMediaConnectFlowFailoverRequest create() {
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

    public static final class Builder extends Request.Builder<CloseMediaConnectFlowFailoverRequest, Builder> {
        private String flowId; 

        private Builder() {
            super();
        } 

        private Builder(CloseMediaConnectFlowFailoverRequest request) {
            super(request);
            this.flowId = request.flowId;
        } 

        /**
         * FlowId.
         */
        public Builder flowId(String flowId) {
            this.putQueryParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        @Override
        public CloseMediaConnectFlowFailoverRequest build() {
            return new CloseMediaConnectFlowFailoverRequest(this);
        } 

    } 

}
