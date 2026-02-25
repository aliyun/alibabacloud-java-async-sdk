// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyChargeTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyChargeTypeRequest</p>
 */
public class ModifyChargeTypeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillingInstanceIds")
    private String billingInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private String duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionOptionNo")
    private String promotionOptionNo;

    private ModifyChargeTypeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoRenew = builder.autoRenew;
        this.billingInstanceIds = builder.billingInstanceIds;
        this.duration = builder.duration;
        this.instanceId = builder.instanceId;
        this.pricingCycle = builder.pricingCycle;
        this.promotionOptionNo = builder.promotionOptionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyChargeTypeRequest create() {
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
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return billingInstanceIds
     */
    public String getBillingInstanceIds() {
        return this.billingInstanceIds;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return promotionOptionNo
     */
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public static final class Builder extends Request.Builder<ModifyChargeTypeRequest, Builder> {
        private String regionId; 
        private Boolean autoRenew; 
        private String billingInstanceIds; 
        private String duration; 
        private String instanceId; 
        private String pricingCycle; 
        private String promotionOptionNo; 

        private Builder() {
            super();
        } 

        private Builder(ModifyChargeTypeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoRenew = request.autoRenew;
            this.billingInstanceIds = request.billingInstanceIds;
            this.duration = request.duration;
            this.instanceId = request.instanceId;
            this.pricingCycle = request.pricingCycle;
            this.promotionOptionNo = request.promotionOptionNo;
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
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * BillingInstanceIds.
         */
        public Builder billingInstanceIds(String billingInstanceIds) {
            this.putQueryParameter("BillingInstanceIds", billingInstanceIds);
            this.billingInstanceIds = billingInstanceIds;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(String duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * PromotionOptionNo.
         */
        public Builder promotionOptionNo(String promotionOptionNo) {
            this.putQueryParameter("PromotionOptionNo", promotionOptionNo);
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }

        @Override
        public ModifyChargeTypeRequest build() {
            return new ModifyChargeTypeRequest(this);
        } 

    } 

}
