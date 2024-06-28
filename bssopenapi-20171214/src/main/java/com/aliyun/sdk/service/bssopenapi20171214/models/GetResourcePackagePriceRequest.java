// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The validity period of the resource plan. The value must be the same as the duration of the resource plan specified in the specifications.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * The time when the resource plan takes effect. If you do not specify this parameter, the resource plan immediately takes effect by default. 
         * <p>
         * When the **OrderType** is **BUY**, resource packs with the **EffectiveDate longer than the current time of 6 months** are not supported. 
         * If the **OrderType** is **UPGRADE**, the **EffectiveDate** **must be less than or equal to** the actual expiration time of the upgraded instance.
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time must be in UTC.
         */
        public Builder effectiveDate(String effectiveDate) {
            this.putQueryParameter("EffectiveDate", effectiveDate);
            this.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * The ID of the instance. **This parameter is required when the order type is renewal or upgrade.**
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The type of the order. Valid values:
         * <p>
         * 
         * *   BUY: You place the order to purchase an instance.
         * *   UPGRADE: You place the order to upgrade an instance.
         * *   RENEW: You place the order to renew an instance.
         * 
         * Default value: BUY.
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
         * The type of the resource plan. The value must be the same as the value of the **ProductCode** parameter that is returned when you call the **DescribeResourcePackageProduct** operation.
         */
        public Builder packageType(String packageType) {
            this.putQueryParameter("PackageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * The unit of validity period of the resource plan. Valid values:
         * <p>
         * 
         * *   Month
         * *   Year
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * The code of service. You can query the service code by calling the **QueryProductList** operation or viewing **Codes of Alibaba Cloud Services**.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The specifications of the resource plan.
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
