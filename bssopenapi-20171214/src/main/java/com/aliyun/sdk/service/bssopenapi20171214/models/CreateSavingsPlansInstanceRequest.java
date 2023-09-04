// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSavingsPlansInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateSavingsPlansInstanceRequest</p>
 */
public class CreateSavingsPlansInstanceRequest extends Request {
    @Query
    @NameInMap("CommodityCode")
    @Validation(required = true)
    private String commodityCode;

    @Query
    @NameInMap("Duration")
    @Validation(required = true, minLength = 1)
    private String duration;

    @Query
    @NameInMap("EffectiveDate")
    private String effectiveDate;

    @Query
    @NameInMap("ExtendMap")
    private java.util.Map < String, String > extendMap;

    @Query
    @NameInMap("PayMode")
    @Validation(required = true)
    private String payMode;

    @Query
    @NameInMap("PoolValue")
    @Validation(required = true)
    private String poolValue;

    @Query
    @NameInMap("PricingCycle")
    @Validation(required = true)
    private String pricingCycle;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("SpecType")
    private String specType;

    @Query
    @NameInMap("Specification")
    private String specification;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateSavingsPlansInstanceRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.duration = builder.duration;
        this.effectiveDate = builder.effectiveDate;
        this.extendMap = builder.extendMap;
        this.payMode = builder.payMode;
        this.poolValue = builder.poolValue;
        this.pricingCycle = builder.pricingCycle;
        this.region = builder.region;
        this.specType = builder.specType;
        this.specification = builder.specification;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSavingsPlansInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return effectiveDate
     */
    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * @return extendMap
     */
    public java.util.Map < String, String > getExtendMap() {
        return this.extendMap;
    }

    /**
     * @return payMode
     */
    public String getPayMode() {
        return this.payMode;
    }

    /**
     * @return poolValue
     */
    public String getPoolValue() {
        return this.poolValue;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return specType
     */
    public String getSpecType() {
        return this.specType;
    }

    /**
     * @return specification
     */
    public String getSpecification() {
        return this.specification;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateSavingsPlansInstanceRequest, Builder> {
        private String commodityCode; 
        private String duration; 
        private String effectiveDate; 
        private java.util.Map < String, String > extendMap; 
        private String payMode; 
        private String poolValue; 
        private String pricingCycle; 
        private String region; 
        private String specType; 
        private String specification; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateSavingsPlansInstanceRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.duration = request.duration;
            this.effectiveDate = request.effectiveDate;
            this.extendMap = request.extendMap;
            this.payMode = request.payMode;
            this.poolValue = request.poolValue;
            this.pricingCycle = request.pricingCycle;
            this.region = request.region;
            this.specType = request.specType;
            this.specification = request.specification;
            this.type = request.type;
        } 

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
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
         * EffectiveDate.
         */
        public Builder effectiveDate(String effectiveDate) {
            this.putQueryParameter("EffectiveDate", effectiveDate);
            this.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * ExtendMap.
         */
        public Builder extendMap(java.util.Map < String, String > extendMap) {
            String extendMapShrink = shrink(extendMap, "ExtendMap", "json");
            this.putQueryParameter("ExtendMap", extendMapShrink);
            this.extendMap = extendMap;
            return this;
        }

        /**
         * PayMode.
         */
        public Builder payMode(String payMode) {
            this.putQueryParameter("PayMode", payMode);
            this.payMode = payMode;
            return this;
        }

        /**
         * PoolValue.
         */
        public Builder poolValue(String poolValue) {
            this.putQueryParameter("PoolValue", poolValue);
            this.poolValue = poolValue;
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
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * SpecType.
         */
        public Builder specType(String specType) {
            this.putQueryParameter("SpecType", specType);
            this.specType = specType;
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

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateSavingsPlansInstanceRequest build() {
            return new CreateSavingsPlansInstanceRequest(this);
        } 

    } 

}
