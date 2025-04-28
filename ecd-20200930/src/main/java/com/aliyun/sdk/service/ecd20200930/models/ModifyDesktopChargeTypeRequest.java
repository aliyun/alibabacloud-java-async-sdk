// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ModifyDesktopChargeTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopChargeTypeRequest</p>
 */
public class ModifyDesktopChargeTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResellerOwnerUid")
    private Long resellerOwnerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseDuration")
    private Integer useDuration;

    private ModifyDesktopChargeTypeRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.chargeType = builder.chargeType;
        this.desktopId = builder.desktopId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
        this.resellerOwnerUid = builder.resellerOwnerUid;
        this.useDuration = builder.useDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopChargeTypeRequest create() {
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
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return desktopId
     */
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
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

    /**
     * @return resellerOwnerUid
     */
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    /**
     * @return useDuration
     */
    public Integer getUseDuration() {
        return this.useDuration;
    }

    public static final class Builder extends Request.Builder<ModifyDesktopChargeTypeRequest, Builder> {
        private Boolean autoPay; 
        private String chargeType; 
        private java.util.List<String> desktopId; 
        private Integer period; 
        private String periodUnit; 
        private String promotionId; 
        private String regionId; 
        private Long resellerOwnerUid; 
        private Integer useDuration; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopChargeTypeRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.chargeType = request.chargeType;
            this.desktopId = request.desktopId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.promotionId = request.promotionId;
            this.regionId = request.regionId;
            this.resellerOwnerUid = request.resellerOwnerUid;
            this.useDuration = request.useDuration;
        } 

        /**
         * <p>Specifies whether to enable automatic payment if you specify subscription as the new billing method for the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The new billing method that you want to apply.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>PostPaid: changes the billing method from subscription to pay-as-you-go.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>PrePaid: changes the billing method from pay-as-you-go to subscription.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The IDs of the cloud computers. You can specify 1 to 20 IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-gx2x1dhsmucyy****</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The subscription duration of the cloud computers if you set the ChargeType parameter to PrePaid. The unit is specified by the <code>PeriodUnit</code> parameter. This parameter is valid only when the <code>ChargeType</code> parameter is set to <code>PrePaid</code>. In this case, you must specify this parameter.</p>
         * <ul>
         * <li>If the <code>PeriodUnit</code> parameter is set to <code>Week</code>, set the Period parameter to 1.</li>
         * <li>If the <code>PeriodUnit</code> parameter is set to <code>Month</code>, the valid values of the Period parameter are 1, 2, 3, and 6.</li>
         * <li>If the <code>PeriodUnit</code> parameter is set to <code>Year</code>, the valid values of the Period parameter are 1, 2, 3, 4, and 5.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription duration if you specify subscription as the new billing method for the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The ID of the promotional activity.</p>
         * 
         * <strong>example:</strong>
         * <p>500038360030606</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResellerOwnerUid.
         */
        public Builder resellerOwnerUid(Long resellerOwnerUid) {
            this.putQueryParameter("ResellerOwnerUid", resellerOwnerUid);
            this.resellerOwnerUid = resellerOwnerUid;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>internal only</p>
         */
        public Builder useDuration(Integer useDuration) {
            this.putQueryParameter("UseDuration", useDuration);
            this.useDuration = useDuration;
            return this;
        }

        @Override
        public ModifyDesktopChargeTypeRequest build() {
            return new ModifyDesktopChargeTypeRequest(this);
        } 

    } 

}
