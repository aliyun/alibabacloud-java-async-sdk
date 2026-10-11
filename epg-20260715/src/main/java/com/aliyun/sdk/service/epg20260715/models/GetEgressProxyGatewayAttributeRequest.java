// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link GetEgressProxyGatewayAttributeRequest} extends {@link RequestModel}
 *
 * <p>GetEgressProxyGatewayAttributeRequest</p>
 */
public class GetEgressProxyGatewayAttributeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyGatewayId;

    private GetEgressProxyGatewayAttributeRequest(Builder builder) {
        super(builder);
        this.egressProxyGatewayId = builder.egressProxyGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEgressProxyGatewayAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return egressProxyGatewayId
     */
    public String getEgressProxyGatewayId() {
        return this.egressProxyGatewayId;
    }

    public static final class Builder extends Request.Builder<GetEgressProxyGatewayAttributeRequest, Builder> {
        private String egressProxyGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(GetEgressProxyGatewayAttributeRequest request) {
            super(request);
            this.egressProxyGatewayId = request.egressProxyGatewayId;
        } 

        /**
         * <p>The ID of the egress proxy gateway instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-gw80bb6a94f835db****</p>
         */
        public Builder egressProxyGatewayId(String egressProxyGatewayId) {
            this.putBodyParameter("EgressProxyGatewayId", egressProxyGatewayId);
            this.egressProxyGatewayId = egressProxyGatewayId;
            return this;
        }

        @Override
        public GetEgressProxyGatewayAttributeRequest build() {
            return new GetEgressProxyGatewayAttributeRequest(this);
        } 

    } 

}
