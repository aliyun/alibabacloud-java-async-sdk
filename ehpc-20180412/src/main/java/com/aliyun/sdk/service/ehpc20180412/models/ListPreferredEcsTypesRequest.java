// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPreferredEcsTypesRequest} extends {@link RequestModel}
 *
 * <p>ListPreferredEcsTypesRequest</p>
 */
public class ListPreferredEcsTypesRequest extends Request {
    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private ListPreferredEcsTypesRequest(Builder builder) {
        super(builder);
        this.instanceChargeType = builder.instanceChargeType;
        this.spotStrategy = builder.spotStrategy;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPreferredEcsTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ListPreferredEcsTypesRequest, Builder> {
        private String instanceChargeType; 
        private String spotStrategy; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ListPreferredEcsTypesRequest request) {
            super(request);
            this.instanceChargeType = request.instanceChargeType;
            this.spotStrategy = request.spotStrategy;
            this.zoneId = request.zoneId;
        } 

        /**
         * The billing method of the ECS instance. Valid values:
         * <p>
         * 
         * *   PostPaid: pay-as-you-go
         * *   PrePaid: subscription
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The bidding policy of the ECS instance. Valid values:
         * <p>
         * 
         * *   NoSpot: The instance is created as a regular pay-as-you-go instance.
         * *   SpotWithPriceLimit: The instance to be created is a preemptible instance with a user-defined maximum hourly price.
         * *   SpotAsPriceGo: The instance is a preemptible instance whose price is based on the current market price.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * The ID of the zone.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ListPreferredEcsTypesRequest build() {
            return new ListPreferredEcsTypesRequest(this);
        } 

    } 

}
