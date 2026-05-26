// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link GetGatewayPolicyConfigRequest} extends {@link RequestModel}
 *
 * <p>GetGatewayPolicyConfigRequest</p>
 */
public class GetGatewayPolicyConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayArn")
    private String gatewayArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayType")
    private String gatewayType;

    private GetGatewayPolicyConfigRequest(Builder builder) {
        super(builder);
        this.gatewayArn = builder.gatewayArn;
        this.gatewayType = builder.gatewayType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayPolicyConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayArn
     */
    public String getGatewayArn() {
        return this.gatewayArn;
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    public static final class Builder extends Request.Builder<GetGatewayPolicyConfigRequest, Builder> {
        private String gatewayArn; 
        private String gatewayType; 

        private Builder() {
            super();
        } 

        private Builder(GetGatewayPolicyConfigRequest request) {
            super(request);
            this.gatewayArn = request.gatewayArn;
            this.gatewayType = request.gatewayType;
        } 

        /**
         * GatewayArn.
         */
        public Builder gatewayArn(String gatewayArn) {
            this.putBodyParameter("GatewayArn", gatewayArn);
            this.gatewayArn = gatewayArn;
            return this;
        }

        /**
         * GatewayType.
         */
        public Builder gatewayType(String gatewayType) {
            this.putBodyParameter("GatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        @Override
        public GetGatewayPolicyConfigRequest build() {
            return new GetGatewayPolicyConfigRequest(this);
        } 

    } 

}
