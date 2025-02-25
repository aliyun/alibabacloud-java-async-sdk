// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_dg20230914.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGatewayRequest} extends {@link RequestModel}
 *
 * <p>ModifyGatewayRequest</p>
 */
public class ModifyGatewayRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayDesc")
    private String gatewayDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayName;

    private ModifyGatewayRequest(Builder builder) {
        super(builder);
        this.gatewayDesc = builder.gatewayDesc;
        this.gatewayId = builder.gatewayId;
        this.gatewayName = builder.gatewayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGatewayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayDesc
     */
    public String getGatewayDesc() {
        return this.gatewayDesc;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayName
     */
    public String getGatewayName() {
        return this.gatewayName;
    }

    public static final class Builder extends Request.Builder<ModifyGatewayRequest, Builder> {
        private String gatewayDesc; 
        private String gatewayId; 
        private String gatewayName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyGatewayRequest request) {
            super(request);
            this.gatewayDesc = request.gatewayDesc;
            this.gatewayId = request.gatewayId;
            this.gatewayName = request.gatewayName;
        } 

        /**
         * GatewayDesc.
         */
        public Builder gatewayDesc(String gatewayDesc) {
            this.putBodyParameter("GatewayDesc", gatewayDesc);
            this.gatewayDesc = gatewayDesc;
            return this;
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
         * GatewayName.
         */
        public Builder gatewayName(String gatewayName) {
            this.putBodyParameter("GatewayName", gatewayName);
            this.gatewayName = gatewayName;
            return this;
        }

        @Override
        public ModifyGatewayRequest build() {
            return new ModifyGatewayRequest(this);
        } 

    } 

}
