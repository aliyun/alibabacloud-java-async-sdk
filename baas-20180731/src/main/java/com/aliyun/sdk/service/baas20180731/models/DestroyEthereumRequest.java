// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DestroyEthereumRequest} extends {@link RequestModel}
 *
 * <p>DestroyEthereumRequest</p>
 */
public class DestroyEthereumRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EthereumId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ethereumId;

    private DestroyEthereumRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ethereumId = builder.ethereumId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DestroyEthereumRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ethereumId
     */
    public String getEthereumId() {
        return this.ethereumId;
    }

    public static final class Builder extends Request.Builder<DestroyEthereumRequest, Builder> {
        private String regionId; 
        private String ethereumId; 

        private Builder() {
            super();
        } 

        private Builder(DestroyEthereumRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ethereumId = request.ethereumId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * EthereumId.
         */
        public Builder ethereumId(String ethereumId) {
            this.putBodyParameter("EthereumId", ethereumId);
            this.ethereumId = ethereumId;
            return this;
        }

        @Override
        public DestroyEthereumRequest build() {
            return new DestroyEthereumRequest(this);
        } 

    } 

}
