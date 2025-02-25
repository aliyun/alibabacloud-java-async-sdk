// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBasicAccelerateIpRequest} extends {@link RequestModel}
 *
 * <p>DeleteBasicAccelerateIpRequest</p>
 */
public class DeleteBasicAccelerateIpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccelerateIpId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accelerateIpId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteBasicAccelerateIpRequest(Builder builder) {
        super(builder);
        this.accelerateIpId = builder.accelerateIpId;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBasicAccelerateIpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerateIpId
     */
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteBasicAccelerateIpRequest, Builder> {
        private String accelerateIpId; 
        private String clientToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBasicAccelerateIpRequest request) {
            super(request);
            this.accelerateIpId = request.accelerateIpId;
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the accelerated IP address that you want to delete.
         * <p>
         * 
         * You can call the [ListBasicAccelerateIps](~~2253393~~) operation to query the ID of the accelerated IP address.
         */
        public Builder accelerateIpId(String accelerateIpId) {
            this.putQueryParameter("AccelerateIpId", accelerateIpId);
            this.accelerateIpId = accelerateIpId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteBasicAccelerateIpRequest build() {
            return new DeleteBasicAccelerateIpRequest(this);
        } 

    } 

}
