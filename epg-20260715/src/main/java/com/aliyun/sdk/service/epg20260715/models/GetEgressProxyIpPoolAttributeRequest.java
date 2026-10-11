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
 * {@link GetEgressProxyIpPoolAttributeRequest} extends {@link RequestModel}
 *
 * <p>GetEgressProxyIpPoolAttributeRequest</p>
 */
public class GetEgressProxyIpPoolAttributeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyIpPoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyIpPoolId;

    private GetEgressProxyIpPoolAttributeRequest(Builder builder) {
        super(builder);
        this.egressProxyIpPoolId = builder.egressProxyIpPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEgressProxyIpPoolAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return egressProxyIpPoolId
     */
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

    public static final class Builder extends Request.Builder<GetEgressProxyIpPoolAttributeRequest, Builder> {
        private String egressProxyIpPoolId; 

        private Builder() {
            super();
        } 

        private Builder(GetEgressProxyIpPoolAttributeRequest request) {
            super(request);
            this.egressProxyIpPoolId = request.egressProxyIpPoolId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eppool-gw80d96a96ca0b00****</p>
         */
        public Builder egressProxyIpPoolId(String egressProxyIpPoolId) {
            this.putBodyParameter("EgressProxyIpPoolId", egressProxyIpPoolId);
            this.egressProxyIpPoolId = egressProxyIpPoolId;
            return this;
        }

        @Override
        public GetEgressProxyIpPoolAttributeRequest build() {
            return new GetEgressProxyIpPoolAttributeRequest(this);
        } 

    } 

}
