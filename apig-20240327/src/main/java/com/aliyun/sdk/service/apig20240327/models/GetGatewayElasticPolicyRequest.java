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
 * {@link GetGatewayElasticPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetGatewayElasticPolicyRequest</p>
 */
public class GetGatewayElasticPolicyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    private GetGatewayElasticPolicyRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayElasticPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<GetGatewayElasticPolicyRequest, Builder> {
        private String gatewayId; 

        private Builder() {
            super();
        } 

        private Builder(GetGatewayElasticPolicyRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
        } 

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        @Override
        public GetGatewayElasticPolicyRequest build() {
            return new GetGatewayElasticPolicyRequest(this);
        } 

    } 

}
