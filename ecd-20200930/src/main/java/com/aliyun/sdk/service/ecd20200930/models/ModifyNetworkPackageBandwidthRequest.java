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
 * {@link ModifyNetworkPackageBandwidthRequest} extends {@link RequestModel}
 *
 * <p>ModifyNetworkPackageBandwidthRequest</p>
 */
public class ModifyNetworkPackageBandwidthRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000, minimum = 2)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkPackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether to enable the automatic payment feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true (default): enables the auto-payment feature.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <p>Make sure that your account has sufficient balance. Otherwise, no order is generated.</p>
         * <!-- -->
         * </li>
         * <li><p>false: disables the auto-payment feature. In this case, an order is generated but you need to make the payment manually.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <p>To make the payment, log on to the Elastic Desktop Service console, go to the Orders page, and find the order based on the order ID.</p>
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The bandwidth provided by the premium bandwidth plan. Unit: Mbit/s.</p>
         * <ul>
         * <li>Valid values if the premium bandwidth plan is a subscription plan: 2 to 1000.</li>
         * <li>Valid values if the premium bandwidth plan is a pay-as-you-go plan that charges by data transfer (PayByTraffic): 2 to 200.</li>
         * <li>Valid values if the premium bandwidth plan is a pay-as-you-go plan that charges by fixed bandwidth (PayByBandwidth): 2 to 1000.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The ID of the premium bandwidth plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np-cxj99qb8d34vo****</p>
         */
        public Builder networkPackageId(String networkPackageId) {
            this.putQueryParameter("NetworkPackageId", networkPackageId);
            this.networkPackageId = networkPackageId;
            return this;
        }

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>500033080110596</p>
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

        @Override
        public ModifyNetworkPackageBandwidthRequest build() {
            return new ModifyNetworkPackageBandwidthRequest(this);
        } 

    } 

}
