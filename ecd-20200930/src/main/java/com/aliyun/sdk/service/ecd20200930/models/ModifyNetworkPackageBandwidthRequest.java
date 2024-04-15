// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNetworkPackageBandwidthRequest} extends {@link RequestModel}
 *
 * <p>ModifyNetworkPackageBandwidthRequest</p>
 */
public class ModifyNetworkPackageBandwidthRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("Bandwidth")
    @Validation(required = true, maximum = 1000, minimum = 2)
    private Integer bandwidth;

    @Query
    @NameInMap("NetworkPackageId")
    @Validation(required = true)
    private String networkPackageId;

    @Query
    @NameInMap("PromotionId")
    private String promotionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyNetworkPackageBandwidthRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.bandwidth = builder.bandwidth;
        this.networkPackageId = builder.networkPackageId;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNetworkPackageBandwidthRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return networkPackageId
     */
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyNetworkPackageBandwidthRequest, Builder> {
        private Boolean autoPay; 
        private Integer bandwidth; 
        private String networkPackageId; 
        private String promotionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNetworkPackageBandwidthRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.bandwidth = request.bandwidth;
            this.networkPackageId = request.networkPackageId;
            this.promotionId = request.promotionId;
            this.regionId = request.regionId;
        } 

        /**
         * Specifies whether to enable the automatic payment feature.
         * <p>
         * 
         * Valid values:
         * 
         * *   true (default): enables the auto-payment feature.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     Make sure that your account has sufficient balance. Otherwise, no order is generated.
         * 
         *     <!-- -->
         * 
         * *   false: disables the auto-payment feature. In this case, an order is generated but you need to make the payment manually.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     To make the payment, log on to the WUYING Workspace console, go to the Orders page, and find the order based on the order ID.
         * 
         *     <!-- -->
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The bandwidth provided by the premium bandwidth plan. Unit: Mbit/s.
         * <p>
         * 
         * *   Valid values if the premium bandwidth plan is a subscription plan: 2 to 1000.
         * *   Valid values if the premium bandwidth plan is a pay-as-you-go plan that charges by data transfer (PayByTraffic): 2 to 200.
         * *   Valid values if the premium bandwidth plan is a pay-as-you-go plan that charges by fixed bandwidth (PayByBandwidth): 2 to 1000.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The ID of the premium bandwidth plan.
         */
        public Builder networkPackageId(String networkPackageId) {
            this.putQueryParameter("NetworkPackageId", networkPackageId);
            this.networkPackageId = networkPackageId;
            return this;
        }

        /**
         * The promotion ID.
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyNetworkPackageBandwidthRequest build() {
            return new ModifyNetworkPackageBandwidthRequest(this);
        } 

    } 

}
