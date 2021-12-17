// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateCenBandwidthPackageRequest} extends {@link RequestModel}
 *
 * <p>CreateCenBandwidthPackageRequest</p>
 */
public class CreateCenBandwidthPackageRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("AutoRenewDuration")
    private Integer autoRenewDuration;

    @Query
    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @Query
    @NameInMap("BandwidthPackageChargeType")
    private String bandwidthPackageChargeType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("GeographicRegionAId")
    private String geographicRegionAId;

    @Query
    @NameInMap("GeographicRegionBId")
    private String geographicRegionBId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PricingCycle")
    private String pricingCycle;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;


    private CreateCenBandwidthPackageRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.bandwidth = builder.bandwidth;
        this.bandwidthPackageChargeType = builder.bandwidthPackageChargeType;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.geographicRegionAId = builder.geographicRegionAId;
        this.geographicRegionBId = builder.geographicRegionBId;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.pricingCycle = builder.pricingCycle;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCenBandwidthPackageRequest create() {
        return builder().build();
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewDuration
     */
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return bandwidthPackageChargeType
     */
    public String getBandwidthPackageChargeType() {
        return this.bandwidthPackageChargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return geographicRegionAId
     */
    public String getGeographicRegionAId() {
        return this.geographicRegionAId;
    }

    /**
     * @return geographicRegionBId
     */
    public String getGeographicRegionBId() {
        return this.geographicRegionBId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private Integer autoRenewDuration; 
        private Integer bandwidth; 
        private String bandwidthPackageChargeType; 
        private String clientToken; 
        private String description; 
        private String geographicRegionAId; 
        private String geographicRegionBId; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String pricingCycle; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        /**
         * <p>AutoPay.</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>AutoRenew.</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>AutoRenewDuration.</p>
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.putQueryParameter("AutoRenewDuration", autoRenewDuration);
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * <p>Bandwidth.</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>BandwidthPackageChargeType.</p>
         */
        public Builder bandwidthPackageChargeType(String bandwidthPackageChargeType) {
            this.putQueryParameter("BandwidthPackageChargeType", bandwidthPackageChargeType);
            this.bandwidthPackageChargeType = bandwidthPackageChargeType;
            return this;
        }

        /**
         * <p>ClientToken.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Description.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>GeographicRegionAId.</p>
         */
        public Builder geographicRegionAId(String geographicRegionAId) {
            this.putQueryParameter("GeographicRegionAId", geographicRegionAId);
            this.geographicRegionAId = geographicRegionAId;
            return this;
        }

        /**
         * <p>GeographicRegionBId.</p>
         */
        public Builder geographicRegionBId(String geographicRegionBId) {
            this.putQueryParameter("GeographicRegionBId", geographicRegionBId);
            this.geographicRegionBId = geographicRegionBId;
            return this;
        }

        /**
         * <p>Name.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>OwnerAccount.</p>
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * <p>OwnerId.</p>
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Period.</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>PricingCycle.</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>ResourceOwnerAccount.</p>
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>ResourceOwnerId.</p>
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        public CreateCenBandwidthPackageRequest build() {
            return new CreateCenBandwidthPackageRequest(this);
        } 

    } 

}
