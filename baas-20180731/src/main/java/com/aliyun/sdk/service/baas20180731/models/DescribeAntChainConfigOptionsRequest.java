// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainConfigOptionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainConfigOptionsRequest</p>
 */
public class DescribeAntChainConfigOptionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Purpose")
    private String purpose;

    private DescribeAntChainConfigOptionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.purpose = builder.purpose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainConfigOptionsRequest create() {
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
     * @return purpose
     */
    public String getPurpose() {
        return this.purpose;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainConfigOptionsRequest, Builder> {
        private String regionId; 
        private String purpose; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainConfigOptionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.purpose = request.purpose;
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
         * Purpose.
         */
        public Builder purpose(String purpose) {
            this.putQueryParameter("Purpose", purpose);
            this.purpose = purpose;
            return this;
        }

        @Override
        public DescribeAntChainConfigOptionsRequest build() {
            return new DescribeAntChainConfigOptionsRequest(this);
        } 

    } 

}
