// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteStorageGatewayRequest} extends {@link RequestModel}
 *
 * <p>DeleteStorageGatewayRequest</p>
 */
public class DeleteStorageGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    private DeleteStorageGatewayRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteStorageGatewayRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteStorageGatewayRequest, Builder> {
        private String gatewayId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteStorageGatewayRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
        } 

        /**
         * <p>The ID of the gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sgw-****</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        @Override
        public DeleteStorageGatewayRequest build() {
            return new DeleteStorageGatewayRequest(this);
        } 

    } 

}
