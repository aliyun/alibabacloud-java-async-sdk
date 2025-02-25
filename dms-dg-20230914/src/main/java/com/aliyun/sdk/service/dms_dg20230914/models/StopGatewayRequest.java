// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_dg20230914.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopGatewayRequest} extends {@link RequestModel}
 *
 * <p>StopGatewayRequest</p>
 */
public class StopGatewayRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayInstanceId")
    private String gatewayInstanceId;

    private StopGatewayRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.gatewayInstanceId = builder.gatewayInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopGatewayRequest create() {
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

    /**
     * @return gatewayInstanceId
     */
    public String getGatewayInstanceId() {
        return this.gatewayInstanceId;
    }

    public static final class Builder extends Request.Builder<StopGatewayRequest, Builder> {
        private String gatewayId; 
        private String gatewayInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(StopGatewayRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.gatewayInstanceId = request.gatewayInstanceId;
        } 

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * GatewayInstanceId.
         */
        public Builder gatewayInstanceId(String gatewayInstanceId) {
            this.putBodyParameter("GatewayInstanceId", gatewayInstanceId);
            this.gatewayInstanceId = gatewayInstanceId;
            return this;
        }

        @Override
        public StopGatewayRequest build() {
            return new StopGatewayRequest(this);
        } 

    } 

}
