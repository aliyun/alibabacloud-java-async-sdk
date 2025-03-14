// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link CreateSavingsPlansInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateSavingsPlansInstanceRequest</p>
 */
public class CreateSavingsPlansInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveDate")
    private String effectiveDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendMap")
    private java.util.Map<String, String> extendMap;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String poolValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pricingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecType")
    private String specType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Specification")
    private String specification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.Map<String, String> getExtendMap() {
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
        private java.util.Map<String, String> extendMap; 
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
         * <p>The code of the service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>savingplan_common_public_cn</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The service duration. This parameter is used together with the PricingCycle parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder duration(String duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The time when the savings plan takes effect. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-31T00:00:00Z</p>
         */
        public Builder effectiveDate(String effectiveDate) {
            this.putQueryParameter("EffectiveDate", effectiveDate);
            this.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * <p>The extended parameters.</p>
         */
        public Builder extendMap(java.util.Map<String, String> extendMap) {
            String extendMapShrink = shrink(extendMap, "ExtendMap", "json");
            this.putQueryParameter("ExtendMap", extendMapShrink);
            this.extendMap = extendMap;
            return this;
        }

        /**
         * <p>The payment mode. Valid values:</p>
         * <ul>
         * <li>total: all upfront</li>
         * <li>half: partial upfront</li>
         * <li>zero: no upfront</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>total</p>
         */
        public Builder payMode(String payMode) {
            this.putQueryParameter("PayMode", payMode);
            this.payMode = payMode;
            return this;
        }

        /**
         * <p>The contracted amount. unit: CNY</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        public Builder poolValue(String poolValue) {
            this.putQueryParameter("PoolValue", poolValue);
            this.poolValue = poolValue;
            return this;
        }

        /**
         * <p>The unit of the subscription duration. This parameter is used together with Duration. Valid values:</p>
         * <ul>
         * <li>Year</li>
         * <li>Month</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>The ID of the region in which you create the savings plan. You must specify this parameter if the Type parameter is not set to universal.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The specification type. This parameter is used together with the Specification parameter. You must specify this parameter if the Type parameter is not set to universal. Valid values:</p>
         * <ul>
         * <li>group: specification group</li>
         * <li>family: specification family</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>family</p>
         */
        public Builder specType(String specType) {
            this.putQueryParameter("SpecType", specType);
            this.specType = specType;
            return this;
        }

        /**
         * <p>The specifications of the savings plan. This parameter is used together with the SpecType parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6</p>
         */
        public Builder specification(String specification) {
            this.putQueryParameter("Specification", specification);
            this.specification = specification;
            return this;
        }

        /**
         * <p>The type of the savings plan. Valid values:</p>
         * <ul>
         * <li>universal: general-purpose type</li>
         * <li>ecs: Elastic Compute Service (ECS) compute type</li>
         * <li>elasticy: elastic type</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>universal</p>
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
