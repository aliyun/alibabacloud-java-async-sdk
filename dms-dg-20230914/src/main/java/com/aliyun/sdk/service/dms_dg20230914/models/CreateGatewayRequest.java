// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_dg20230914.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGatewayRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayRequest</p>
 */
public class CreateGatewayRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayDesc")
    private String gatewayDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CreateGatewayRequest(Builder builder) {
        super(builder);
        this.gatewayDesc = builder.gatewayDesc;
        this.gatewayName = builder.gatewayName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayRequest create() {
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
     * @return gatewayName
     */
    public String getGatewayName() {
        return this.gatewayName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateGatewayRequest, Builder> {
        private String gatewayDesc; 
        private String gatewayName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayRequest request) {
            super(request);
            this.gatewayDesc = request.gatewayDesc;
            this.gatewayName = request.gatewayName;
            this.regionId = request.regionId;
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
         * GatewayName.
         */
        public Builder gatewayName(String gatewayName) {
            this.putBodyParameter("GatewayName", gatewayName);
            this.gatewayName = gatewayName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateGatewayRequest build() {
            return new CreateGatewayRequest(this);
        } 

    } 

}
