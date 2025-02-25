// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEthereumDeletableRequest} extends {@link RequestModel}
 *
 * <p>DescribeEthereumDeletableRequest</p>
 */
public class DescribeEthereumDeletableRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EthereumId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ethereumId;

    private DescribeEthereumDeletableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ethereumId = builder.ethereumId;
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

    public static final class Builder extends Request.Builder<DescribeEthereumDeletableRequest, Builder> {
        private String regionId; 
        private String ethereumId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEthereumDeletableRequest request) {
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
        public DescribeEthereumDeletableRequest build() {
            return new DescribeEthereumDeletableRequest(this);
        } 

    } 

}
