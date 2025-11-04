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
 * {@link GetMediaConnectFlowAllOutputNameRequest} extends {@link RequestModel}
 *
 * <p>GetMediaConnectFlowAllOutputNameRequest</p>
 */
public class GetMediaConnectFlowAllOutputNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowId;

    private GetMediaConnectFlowAllOutputNameRequest(Builder builder) {
        super(builder);
        this.flowId = builder.flowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaConnectFlowAllOutputNameRequest create() {
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

    public static final class Builder extends Request.Builder<GetMediaConnectFlowAllOutputNameRequest, Builder> {
        private String flowId; 

        private Builder() {
            super();
        } 

        private Builder(GetMediaConnectFlowAllOutputNameRequest request) {
            super(request);
            this.flowId = request.flowId;
        } 

        /**
         * <p>The ID of the MediaConnect flow.</p>
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
        public GetMediaConnectFlowAllOutputNameRequest build() {
            return new GetMediaConnectFlowAllOutputNameRequest(this);
        } 

    } 

}
