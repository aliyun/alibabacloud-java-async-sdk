// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferPayTypeRequest} extends {@link RequestModel}
 *
 * <p>TransferPayTypeRequest</p>
 */
public class TransferPayTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuyCount")
    private String buyCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxDu")
    private Integer maxDu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinDu")
    private Integer minDu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private TransferPayTypeRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.buyCount = builder.buyCount;
        this.chargeType = builder.chargeType;
        this.dtsJobId = builder.dtsJobId;
        this.maxDu = builder.maxDu;
        this.minDu = builder.minDu;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferPayTypeRequest create() {
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
     * @return buyCount
     */
    public String getBuyCount() {
        return this.buyCount;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return maxDu
     */
    public Integer getMaxDu() {
        return this.maxDu;
    }

    /**
     * @return minDu
     */
    public Integer getMinDu() {
        return this.minDu;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<TransferPayTypeRequest, Builder> {
        private Boolean autoPay; 
        private String buyCount; 
        private String chargeType; 
        private String dtsJobId; 
        private Integer maxDu; 
        private Integer minDu; 
        private String period; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(TransferPayTypeRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.buyCount = request.buyCount;
            this.chargeType = request.chargeType;
            this.dtsJobId = request.dtsJobId;
            this.maxDu = request.maxDu;
            this.minDu = request.minDu;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
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
         * The subscription length.
         * <p>
         * 
         * *   If the **Period** parameter is set to **Year**, the value range is **1** to **5**.
         * *   If the **Period** parameter is set to **Month**, the value range is **1** to **60**.
         * 
         * >  You must specify this parameter only if you set the **ChargeType** parameter to **PrePaid**.
         */
        public Builder buyCount(String buyCount) {
            this.putQueryParameter("BuyCount", buyCount);
            this.buyCount = buyCount;
            return this;
        }

        /**
         * The billing method that you want to use. Valid values:
         * <p>
         * 
         * *   **PrePaid**: subscription
         * *   **PostPaid**: pay-as-you-go
         * 
         * > 
         * *   The billing method of subscription instances cannot be changed to pay-as-you-go. To prevent resource waste, determine whether you need to change the billing method of your resources.
         * *   If you do not need to change the billing method, specify the current billing method.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The ID of the data synchronization or change tracking task. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * MaxDu.
         */
        public Builder maxDu(Integer maxDu) {
            this.putQueryParameter("MaxDu", maxDu);
            this.maxDu = maxDu;
            return this;
        }

        /**
         * MinDu.
         */
        public Builder minDu(Integer minDu) {
            this.putQueryParameter("MinDu", minDu);
            this.minDu = minDu;
            return this;
        }

        /**
         * The billing cycle of the subscription instance. Valid values:
         * <p>
         * 
         * *   **Year**
         * *   **Month** (default value)
         * 
         * >  You must specify this parameter only if you set the **ChargeType** parameter to **PrePaid**.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The ID of the region where the DTS instance resides. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public TransferPayTypeRequest build() {
            return new TransferPayTypeRequest(this);
        } 

    } 

}
