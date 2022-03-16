// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMultiZoneAvailableResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeMultiZoneAvailableResourceRequest</p>
 */
public class DescribeMultiZoneAvailableResourceRequest extends Request {
    @Query
    @NameInMap("ChargeType")
    @Validation(required = true)
    private String chargeType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ZoneCombination")
    private String zoneCombination;

    private DescribeMultiZoneAvailableResourceRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.regionId = builder.regionId;
        this.zoneCombination = builder.zoneCombination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMultiZoneAvailableResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return zoneCombination
     */
    public String getZoneCombination() {
        return this.zoneCombination;
    }

    public static final class Builder extends Request.Builder<DescribeMultiZoneAvailableResourceRequest, Builder> {
        private String chargeType; 
        private String regionId; 
        private String zoneCombination; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMultiZoneAvailableResourceRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.regionId = request.regionId;
            this.zoneCombination = request.zoneCombination;
        } 

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ZoneCombination.
         */
        public Builder zoneCombination(String zoneCombination) {
            this.putQueryParameter("ZoneCombination", zoneCombination);
            this.zoneCombination = zoneCombination;
            return this;
        }

        @Override
        public DescribeMultiZoneAvailableResourceRequest build() {
            return new DescribeMultiZoneAvailableResourceRequest(this);
        } 

    } 

}
