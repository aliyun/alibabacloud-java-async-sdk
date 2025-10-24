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
            this.payType = request.payType;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
        } 

        /**
         * ChargeCycle.
         */
        public Builder chargeCycle(String chargeCycle) {
            this.putQueryParameter("ChargeCycle", chargeCycle);
            this.chargeCycle = chargeCycle;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder chargeModules(java.util.List<ChargeModules> chargeModules) {
            this.putQueryParameter("ChargeModules", chargeModules);
            this.chargeModules = chargeModules;
            return this;
        }

        /**
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceManagerResourceGroupId.
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
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * Usage.
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
