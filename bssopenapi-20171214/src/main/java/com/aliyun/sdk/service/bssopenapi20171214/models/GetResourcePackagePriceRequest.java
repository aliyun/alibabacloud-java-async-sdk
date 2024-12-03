// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetResourcePackagePriceRequest} extends {@link RequestModel}
 *
 * <p>GetResourcePackagePriceRequest</p>
 */
public class GetResourcePackagePriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveDate")
    private String effectiveDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String packageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Specification")
    @com.aliyun.core.annotation.Validation(required = true)
    private String specification;

    private GetResourcePackagePriceRequest(Builder builder) {
        super(builder);
        this.duration = builder.duration;
        this.effectiveDate = builder.effectiveDate;
        this.instanceId = builder.instanceId;
        this.orderType = builder.orderType;
        this.ownerId = builder.ownerId;
        this.packageType = builder.packageType;
        this.pricingCycle = builder.pricingCycle;
        this.productCode = builder.productCode;
        this.specification = builder.specification;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourcePackagePriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return effectiveDate
     */
    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return packageType
     */
    public String getPackageType() {
        return this.packageType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return specification
     */
    public String getSpecification() {
        return this.specification;
    }

    public static final class Builder extends Request.Builder<GetResourcePackagePriceRequest, Builder> {
        private Integer duration; 
        private String effectiveDate; 
        private String instanceId; 
        private String orderType; 
        private Long ownerId; 
        private String packageType; 
        private String pricingCycle; 
        private String productCode; 
        private String specification; 

        private Builder() {
            super();
        } 

        private Builder(GetResourcePackagePriceRequest request) {
            super(request);
            this.duration = request.duration;
            this.effectiveDate = request.effectiveDate;
            this.instanceId = request.instanceId;
            this.orderType = request.orderType;
            this.ownerId = request.ownerId;
            this.packageType = request.packageType;
            this.pricingCycle = request.pricingCycle;
            this.productCode = request.productCode;
            this.specification = request.specification;
        } 

        /**
         * <p>The validity period of the resource plan. The value must be the same as the duration of the resource plan specified in the specifications.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The time when the resource plan takes effect. If you do not specify this parameter, the resource plan immediately takes effect by default. 
         * When the <strong>OrderType</strong> is <strong>BUY</strong>, resource packs with the <strong>EffectiveDate longer than the current time of 6 months</strong> are not supported. 
         * If the <strong>OrderType</strong> is <strong>UPGRADE</strong>, the <strong>EffectiveDate</strong> <strong>must be less than or equal to</strong> the actual expiration time of the upgraded instance.
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-10T12:00:00Z</p>
         */
        public Builder effectiveDate(String effectiveDate) {
            this.putQueryParameter("EffectiveDate", effectiveDate);
            this.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * <p>The ID of the instance. <strong>This parameter is required when the order type is renewal or upgrade.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>OSSBAG-cn-0xl0002</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the order. Valid values:</p>
         * <ul>
         * <li>BUY: You place the order to purchase an instance.</li>
         * <li>UPGRADE: You place the order to upgrade an instance.</li>
         * <li>RENEW: You place the order to renew an instance.</li>
         * </ul>
         * <p>Default value: BUY.</p>
         * 
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
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
         * <p>The type of the resource plan. The value must be the same as the value of the <strong>ProductCode</strong> parameter that is returned when you call the <strong>DescribeResourcePackageProduct</strong> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FPT_ossbag_periodMonthlyAcc_NetworkOut_finance_common</p>
         */
        public Builder packageType(String packageType) {
            this.putQueryParameter("PackageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * <p>The unit of validity period of the resource plan. Valid values:</p>
         * <ul>
         * <li>Month</li>
         * <li>Year</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>The code of service. You can query the service code by calling the <strong>QueryProductList</strong> operation or viewing <strong>Codes of Alibaba Cloud Services</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ossbag</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The specifications of the resource plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder specification(String specification) {
            this.putQueryParameter("Specification", specification);
            this.specification = specification;
            return this;
        }

        @Override
        public GetResourcePackagePriceRequest build() {
            return new GetResourcePackagePriceRequest(this);
        } 

    } 

}
