// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableEcsTypesRequest} extends {@link RequestModel}
 *
 * <p>ListAvailableEcsTypesRequest</p>
 */
public class ListAvailableEcsTypesRequest extends Request {
    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("ShowSoldOut")
    private Boolean showSoldOut;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private ListAvailableEcsTypesRequest(Builder builder) {
        super(builder);
        this.instanceChargeType = builder.instanceChargeType;
        this.showSoldOut = builder.showSoldOut;
        this.spotStrategy = builder.spotStrategy;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableEcsTypesRequest create() {
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
     * @return showSoldOut
     */
    public Boolean getShowSoldOut() {
        return this.showSoldOut;
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

    public static final class Builder extends Request.Builder<ListAvailableEcsTypesRequest, Builder> {
        private String instanceChargeType; 
        private Boolean showSoldOut; 
        private String spotStrategy; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ListAvailableEcsTypesRequest request) {
            super(request);
            this.instanceChargeType = request.instanceChargeType;
            this.showSoldOut = request.showSoldOut;
            this.spotStrategy = request.spotStrategy;
            this.zoneId = request.zoneId;
        } 

        /**
         * The billing method of the ECS instances. Valid values:
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
         * Specifies whether the ECS instances are sold out. Valid values:
         * <p>
         * 
         * *   false: available
         * *   true: sold out
         * 
         * Default value: false.
         */
        public Builder showSoldOut(Boolean showSoldOut) {
            this.putQueryParameter("ShowSoldOut", showSoldOut);
            this.showSoldOut = showSoldOut;
            return this;
        }

        /**
         * The preemption policy of the ECS instances. Valid values:
         * <p>
         * 
         * *   NoSpot: The ECS instances are pay-as-you-go instances.
         * *   SpotWithPriceLimit: The ECS instances are preemptible instances that have a user-defined maximum hourly price.
         * *   SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * The zone ID.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ListAvailableEcsTypesRequest build() {
            return new ListAvailableEcsTypesRequest(this);
        } 

    } 

}
