// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEthereumDeletableRequest} extends {@link RequestModel}
 *
 * <p>DescribeEthereumDeletableRequest</p>
 */
public class DescribeEthereumDeletableRequest extends Request {
    @Body
    @NameInMap("EthereumId")
    @Validation(required = true)
    private String ethereumId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeEthereumDeletableRequest(Builder builder) {
        super(builder);
        this.ethereumId = builder.ethereumId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEthereumDeletableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ethereumId
     */
    public String getEthereumId() {
        return this.ethereumId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeEthereumDeletableRequest, Builder> {
        private String ethereumId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEthereumDeletableRequest response) {
            super(response);
            this.ethereumId = response.ethereumId;
            this.regionId = response.regionId;
        } 

        /**
         * EthereumId.
         */
        public Builder ethereumId(String ethereumId) {
            this.putBodyParameter("EthereumId", ethereumId);
            this.ethereumId = ethereumId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeEthereumDeletableRequest build() {
            return new DescribeEthereumDeletableRequest(this);
        } 

    } 

}
