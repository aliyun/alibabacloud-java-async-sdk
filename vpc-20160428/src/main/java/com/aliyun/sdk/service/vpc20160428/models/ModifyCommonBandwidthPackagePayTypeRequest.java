// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCommonBandwidthPackagePayTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyCommonBandwidthPackagePayTypeRequest</p>
 */
public class ModifyCommonBandwidthPackagePayTypeRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("Bandwidth")
    private String bandwidth;

    @Query
    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    private String bandwidthPackageId;

    @Query
    @NameInMap("Duration")
    @Validation(maximum = 36, minimum = 1)
    private Integer duration;

    @Query
    @NameInMap("KbpsBandwidth")
    private String kbpsBandwidth;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PayType")
    private String payType;

    @Query
    @NameInMap("PricingCycle")
    private String pricingCycle;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceBid")
    private String resourceBid;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ResourceUid")
    private Long resourceUid;

    private ModifyCommonBandwidthPackagePayTypeRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.bandwidth = builder.bandwidth;
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.duration = builder.duration;
        this.kbpsBandwidth = builder.kbpsBandwidth;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.pricingCycle = builder.pricingCycle;
        this.regionId = builder.regionId;
        this.resourceBid = builder.resourceBid;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceUid = builder.resourceUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCommonBandwidthPackagePayTypeRequest create() {
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
    public String getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return kbpsBandwidth
     */
    public String getKbpsBandwidth() {
        return this.kbpsBandwidth;
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceBid
     */
    public String getResourceBid() {
        return this.resourceBid;
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

    /**
     * @return resourceUid
     */
    public Long getResourceUid() {
        return this.resourceUid;
    }

    public static final class Builder extends Request.Builder<ModifyCommonBandwidthPackagePayTypeRequest, Builder> {
        private Boolean autoPay; 
        private String bandwidth; 
        private String bandwidthPackageId; 
        private Integer duration; 
        private String kbpsBandwidth; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payType; 
        private String pricingCycle; 
        private String regionId; 
        private String resourceBid; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long resourceUid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCommonBandwidthPackagePayTypeRequest response) {
            super(response);
            this.autoPay = response.autoPay;
            this.bandwidth = response.bandwidth;
            this.bandwidthPackageId = response.bandwidthPackageId;
            this.duration = response.duration;
            this.kbpsBandwidth = response.kbpsBandwidth;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.payType = response.payType;
            this.pricingCycle = response.pricingCycle;
            this.regionId = response.regionId;
            this.resourceBid = response.resourceBid;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.resourceUid = response.resourceUid;
        } 

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Bandwidth.
         */
        public Builder bandwidth(String bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * BandwidthPackageId.
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.putQueryParameter("BandwidthPackageId", bandwidthPackageId);
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * KbpsBandwidth.
         */
        public Builder kbpsBandwidth(String kbpsBandwidth) {
            this.putQueryParameter("KbpsBandwidth", kbpsBandwidth);
            this.kbpsBandwidth = kbpsBandwidth;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
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
         * ResourceBid.
         */
        public Builder resourceBid(String resourceBid) {
            this.putQueryParameter("ResourceBid", resourceBid);
            this.resourceBid = resourceBid;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ResourceUid.
         */
        public Builder resourceUid(Long resourceUid) {
            this.putQueryParameter("ResourceUid", resourceUid);
            this.resourceUid = resourceUid;
            return this;
        }

        @Override
        public ModifyCommonBandwidthPackagePayTypeRequest build() {
            return new ModifyCommonBandwidthPackagePayTypeRequest(this);
        } 

    } 

}
