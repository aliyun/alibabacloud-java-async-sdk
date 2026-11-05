// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetGatewayDfpExtProcServiceRequest} extends {@link RequestModel}
 *
 * <p>GetGatewayDfpExtProcServiceRequest</p>
 */
public class GetGatewayDfpExtProcServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    private GetGatewayDfpExtProcServiceRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayDfpExtProcServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    public static final class Builder extends Request.Builder<GetGatewayDfpExtProcServiceRequest, Builder> {
        private String gatewayId; 

        private Builder() {
            super();
        } 

        private Builder(GetGatewayDfpExtProcServiceRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
        } 

        /**
         * <p>The ID of the gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-d5be0s9q5z6f1234567g</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        @Override
        public GetGatewayDfpExtProcServiceRequest build() {
            return new GetGatewayDfpExtProcServiceRequest(this);
        } 

    } 

}
