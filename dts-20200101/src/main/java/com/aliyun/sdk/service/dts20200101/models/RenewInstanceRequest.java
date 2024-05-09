// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewInstanceRequest} extends {@link RequestModel}
 *
 * <p>RenewInstanceRequest</p>
 */
public class RenewInstanceRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private RenewInstanceRequest(Builder builder) {
        super(builder);
        this.buyCount = builder.buyCount;
        this.chargeType = builder.chargeType;
        this.dtsJobId = builder.dtsJobId;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<RenewInstanceRequest, Builder> {
        private String buyCount; 
        private String chargeType; 
        private String dtsJobId; 
        private String period; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(RenewInstanceRequest request) {
            super(request);
            this.buyCount = request.buyCount;
            this.chargeType = request.chargeType;
            this.dtsJobId = request.dtsJobId;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The subscription duration of the DTS instance after renewal. Default value: 1.
         * <p>
         * 
         * *   If the **Period** parameter is set to **Year**, the valid values are **1 to 5**.
         * *   If the **Period** parameter is set to **Month**, the valid values are **1 to 60**.
         */
        public Builder buyCount(String buyCount) {
            this.putQueryParameter("BuyCount", buyCount);
            this.buyCount = buyCount;
            return this;
        }

        /**
         * The billing method of the DTS instance. Set the value to **PREPAY**, which indicates the subscription billing method.
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
         * The billing cycle of the DTS instance after renewal. Valid values:
         * <p>
         * 
         * *   **Year**: annual subscription.
         * *   **Month**: monthly subscription. This is the default value.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The region ID of the DTS instance. For more information, see [List of supported regions](~~141033~~).
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
        public RenewInstanceRequest build() {
            return new RenewInstanceRequest(this);
        } 

    } 

}
