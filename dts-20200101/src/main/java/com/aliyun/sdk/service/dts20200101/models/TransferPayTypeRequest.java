// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
    @com.aliyun.core.annotation.NameInMap("InstanceClass")
    private String instanceClass;

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
        this.instanceClass = builder.instanceClass;
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
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
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
        private String instanceClass; 
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
            this.instanceClass = request.instanceClass;
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
         * <p>The subscription duration of the instance.</p>
         * <ul>
         * <li>If Period is set to <strong>Year</strong>, valid values are <strong>1</strong> to <strong>5</strong>.</li>
         * <li>If Period is set to <strong>Month</strong>, valid values are <strong>1</strong> to <strong>60</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid and required only when ChargeType is set to <strong>Prepaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder buyCount(String buyCount) {
            this.putQueryParameter("BuyCount", buyCount);
            this.buyCount = buyCount;
            return this;
        }

        /**
         * <p>The billing method after conversion. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription.</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go.
         * &lt;props=&quot;china&quot;&gt;</li>
         * <li><strong>sync_serverless</strong>: pay-as-you-go Serverless..</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The ID of the data synchronization or change tracking task. You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to query the task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>o4nh3g7jg56****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * InstanceClass.
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * <p>The maximum number of DUs for the Serverless instance. Valid values: 2, 4, 8, and 16.
         * &lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This feature is currently not supported. Do not specify this parameter.
         * &lt;props=&quot;china&quot;&gt;
         * This parameter is valid and required only when ChargeType is set to <strong>sync_serverless</strong>..</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder maxDu(Integer maxDu) {
            this.putQueryParameter("MaxDu", maxDu);
            this.maxDu = maxDu;
            return this;
        }

        /**
         * <p>The minimum number of DTS Units (DUs) for the Serverless instance. Valid values: 1, 2, 4, 8, and 16.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This feature is currently not supported. Do not specify this parameter.
         * &lt;props=&quot;china&quot;&gt;
         * This parameter is valid and required only when ChargeType is set to <strong>sync_serverless</strong>..</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minDu(Integer minDu) {
            this.putQueryParameter("MinDu", minDu);
            this.minDu = minDu;
            return this;
        }

        /**
         * <p>The billing method of the subscription instance. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong>: annual subscription.</li>
         * <li><strong>Month</strong>: monthly subscription.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid and required only when ChargeType is set to <strong>PrePaid</strong> (subscription).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The region ID of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
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
