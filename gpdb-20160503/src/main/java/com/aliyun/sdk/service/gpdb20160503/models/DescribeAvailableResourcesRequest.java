// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableResourcesRequest</p>
 */
public class DescribeAvailableResourcesRequest extends Request {
    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private DescribeAvailableResourcesRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.region = builder.region;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableResourcesRequest create() {
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
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeAvailableResourcesRequest, Builder> {
        private String chargeType; 
        private String region; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableResourcesRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.region = request.region;
            this.zoneId = request.zoneId;
        } 

        /**
         * The billing method. Valid values:
         * <p>
         * 
         * *   **Postpaid**: pay-as-you-go.
         * *   **Prepaid**: subscription.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The region ID.
         * <p>
         * 
         * > You can call the [DescribeRegions](~~86912~~) operation to query the most recent region list.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The zone ID.
         * <p>
         * 
         * > You can call the [DescribeRegions](~~86912~~) operation to query the most recent zone list.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeAvailableResourcesRequest build() {
            return new DescribeAvailableResourcesRequest(this);
        } 

    } 

}
