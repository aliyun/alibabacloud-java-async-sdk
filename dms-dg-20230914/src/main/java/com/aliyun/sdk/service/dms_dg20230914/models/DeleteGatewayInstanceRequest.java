// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_dg20230914.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewayInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteGatewayInstanceRequest</p>
 */
public class DeleteGatewayInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteGatewayInstanceRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.gatewayInstanceId = builder.gatewayInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewayInstanceRequest create() {
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteGatewayInstanceRequest, Builder> {
        private String gatewayId; 
        private String gatewayInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGatewayInstanceRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.gatewayInstanceId = request.gatewayInstanceId;
            this.regionId = request.regionId;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteGatewayInstanceRequest build() {
            return new DeleteGatewayInstanceRequest(this);
        } 

    } 

}
