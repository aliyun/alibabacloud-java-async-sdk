// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dg20190327.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindUserGatewayByIdRequest} extends {@link RequestModel}
 *
 * <p>FindUserGatewayByIdRequest</p>
 */
public class FindUserGatewayByIdRequest extends Request {
    @Body
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    private FindUserGatewayByIdRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindUserGatewayByIdRequest create() {
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

    public static final class Builder extends Request.Builder<FindUserGatewayByIdRequest, Builder> {
        private String gatewayId; 

        private Builder() {
            super();
        } 

        private Builder(FindUserGatewayByIdRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
        } 

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        @Override
        public FindUserGatewayByIdRequest build() {
            return new FindUserGatewayByIdRequest(this);
        } 

    } 

}
