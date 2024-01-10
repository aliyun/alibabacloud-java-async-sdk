// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dg20190327.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGatewayRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayRequest</p>
 */
public class CreateGatewayRequest extends Request {
    @Body
    @NameInMap("GatewayDesc")
    private String gatewayDesc;

    @Body
    @NameInMap("GatewayName")
    @Validation(required = true)
    private String gatewayName;

    @Body
    @NameInMap("RegionId")
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
