// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeChargeResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeChargeResultRequest</p>
 */
public class DescribeChargeResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeCycle")
    private String chargeCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeModules")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ChargeModules> chargeModules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeUnit")
    private String chargeUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    private DescribeChargeResultRequest(Builder builder) {
        super(builder);
        this.chargeCycle = builder.chargeCycle;
        this.chargeModules = builder.chargeModules;
        this.chargeUnit = builder.chargeUnit;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChargeResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeCycle
     */
    public String getChargeCycle() {
        return this.chargeCycle;
    }

    /**
     * @return chargeModules
     */
    public java.util.List<ChargeModules> getChargeModules() {
        return this.chargeModules;
    }

    /**
     * @return chargeUnit
     */
    public String getChargeUnit() {
        return this.chargeUnit;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeChargeResultRequest, Builder> {
        private String chargeCycle; 
        private java.util.List<ChargeModules> chargeModules; 
        private String chargeUnit; 
        private String payType; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeChargeResultRequest request) {
            super(request);
            this.chargeCycle = request.chargeCycle;
            this.chargeModules = request.chargeModules;
            this.chargeUnit = request.chargeUnit;
            this.payType = request.payType;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
        } 

        /**
         * <p>The billing cycle for the calculation. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong>: Calculates the billing result for one year.</li>
         * <li><strong>Month</strong>: Calculates the billing result for one month.</li>
         * <li><strong>Day</strong>: Calculates the billing result for one day.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Day</p>
         */
        public Builder chargeCycle(String chargeCycle) {
            this.putQueryParameter("ChargeCycle", chargeCycle);
            this.chargeCycle = chargeCycle;
            return this;
        }

        /**
         * <p>The list of billing modules to calculate.</p>
         * <p>This parameter is required.</p>
         */
        public Builder chargeModules(java.util.List<ChargeModules> chargeModules) {
            this.putQueryParameter("ChargeModules", chargeModules);
            this.chargeModules = chargeModules;
            return this;
        }

        /**
         * <p>The metering unit.</p>
         * 
         * <strong>example:</strong>
         * <p>SeCU</p>
         */
        public Builder chargeUnit(String chargeUnit) {
            this.putQueryParameter("ChargeUnit", chargeUnit);
            this.chargeUnit = chargeUnit;
            return this;
        }

        /**
         * <p>The billing type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>POSTPAY</strong>: pay-as-you-go WAF instance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The region where the WAF instance resides. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
         * </ul>
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
         * <p>The Alibaba Cloud resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        @Override
        public DescribeChargeResultRequest build() {
            return new DescribeChargeResultRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeChargeResultRequest} extends {@link TeaModel}
     *
     * <p>DescribeChargeResultRequest</p>
     */
    public static class ChargeModules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Long usage;

        private ChargeModules(Builder builder) {
            this.moduleCode = builder.moduleCode;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChargeModules create() {
            return builder().build();
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return usage
         */
        public Long getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String moduleCode; 
            private Long usage; 

            private Builder() {
            } 

            private Builder(ChargeModules model) {
                this.moduleCode = model.moduleCode;
                this.usage = model.usage;
            } 

            /**
             * <p>The pricing module identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>domainCount</p>
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * <p>The usage of the pricing module.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder usage(Long usage) {
                this.usage = usage;
                return this;
            }

            public ChargeModules build() {
                return new ChargeModules(this);
            } 

        } 

    }
}
