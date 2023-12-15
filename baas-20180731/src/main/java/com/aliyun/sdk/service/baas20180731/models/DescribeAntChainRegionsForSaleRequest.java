// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainRegionsForSaleRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainRegionsForSaleRequest</p>
 */
public class DescribeAntChainRegionsForSaleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeAntChainRegionsForSaleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainRegionsForSaleRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAntChainRegionsForSaleRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainRegionsForSaleRequest request) {
            super(request);
            this.regionId = request.regionId;
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
        public DescribeAntChainRegionsForSaleRequest build() {
            return new DescribeAntChainRegionsForSaleRequest(this);
        } 

    } 

}
