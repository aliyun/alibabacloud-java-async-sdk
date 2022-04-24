// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourcePackagePriceRequest} extends {@link RequestModel}
 *
 * <p>GetResourcePackagePriceRequest</p>
 */
public class GetResourcePackagePriceRequest extends Request {
    @Query
    @NameInMap("Duration")
    private Integer duration;

    @Query
    @NameInMap("EffectiveDate")
    private String effectiveDate;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PackageType")
    private String packageType;

    @Query
    @NameInMap("PricingCycle")
    private String pricingCycle;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("Specification")
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
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * EffectiveDate.
         */
        public Builder effectiveDate(String effectiveDate) {
            this.putQueryParameter("EffectiveDate", effectiveDate);
            this.effectiveDate = effectiveDate;
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
         * OrderType.
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
         * PackageType.
         */
        public Builder packageType(String packageType) {
            this.putQueryParameter("PackageType", packageType);
            this.packageType = packageType;
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
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * Specification.
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
