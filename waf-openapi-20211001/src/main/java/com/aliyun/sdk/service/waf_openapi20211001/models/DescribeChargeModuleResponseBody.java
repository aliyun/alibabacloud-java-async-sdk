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
 * {@link DescribeChargeModuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChargeModuleResponseBody</p>
 */
public class DescribeChargeModuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChargeModules")
    private java.util.List<ChargeModules> chargeModules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeChargeModuleResponseBody(Builder builder) {
        this.chargeModules = builder.chargeModules;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChargeModuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeModules
     */
    public java.util.List<ChargeModules> getChargeModules() {
        return this.chargeModules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ChargeModules> chargeModules; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeChargeModuleResponseBody model) {
            this.chargeModules = model.chargeModules;
            this.requestId = model.requestId;
        } 

        /**
         * ChargeModules.
         */
        public Builder chargeModules(java.util.List<ChargeModules> chargeModules) {
            this.chargeModules = chargeModules;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeChargeModuleResponseBody build() {
            return new DescribeChargeModuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeChargeModuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChargeModuleResponseBody</p>
     */
    public static class ChargeModules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeMode")
        private String chargeMode;

        @com.aliyun.core.annotation.NameInMap("ChargeModeDetails")
        private java.util.List<String> chargeModeDetails;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("PeriodType")
        private String periodType;

        @com.aliyun.core.annotation.NameInMap("UsageType")
        private String usageType;

        @com.aliyun.core.annotation.NameInMap("UsageUnitFactor")
        private Integer usageUnitFactor;

        private ChargeModules(Builder builder) {
            this.chargeMode = builder.chargeMode;
            this.chargeModeDetails = builder.chargeModeDetails;
            this.moduleCode = builder.moduleCode;
            this.periodType = builder.periodType;
            this.usageType = builder.usageType;
            this.usageUnitFactor = builder.usageUnitFactor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChargeModules create() {
            return builder().build();
        }

        /**
         * @return chargeMode
         */
        public String getChargeMode() {
            return this.chargeMode;
        }

        /**
         * @return chargeModeDetails
         */
        public java.util.List<String> getChargeModeDetails() {
            return this.chargeModeDetails;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return periodType
         */
        public String getPeriodType() {
            return this.periodType;
        }

        /**
         * @return usageType
         */
        public String getUsageType() {
            return this.usageType;
        }

        /**
         * @return usageUnitFactor
         */
        public Integer getUsageUnitFactor() {
            return this.usageUnitFactor;
        }

        public static final class Builder {
            private String chargeMode; 
            private java.util.List<String> chargeModeDetails; 
            private String moduleCode; 
            private String periodType; 
            private String usageType; 
            private Integer usageUnitFactor; 

            private Builder() {
            } 

            private Builder(ChargeModules model) {
                this.chargeMode = model.chargeMode;
                this.chargeModeDetails = model.chargeModeDetails;
                this.moduleCode = model.moduleCode;
                this.periodType = model.periodType;
                this.usageType = model.usageType;
                this.usageUnitFactor = model.usageUnitFactor;
            } 

            /**
             * ChargeMode.
             */
            public Builder chargeMode(String chargeMode) {
                this.chargeMode = chargeMode;
                return this;
            }

            /**
             * ChargeModeDetails.
             */
            public Builder chargeModeDetails(java.util.List<String> chargeModeDetails) {
                this.chargeModeDetails = chargeModeDetails;
                return this;
            }

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * PeriodType.
             */
            public Builder periodType(String periodType) {
                this.periodType = periodType;
                return this;
            }

            /**
             * UsageType.
             */
            public Builder usageType(String usageType) {
                this.usageType = usageType;
                return this;
            }

            /**
             * UsageUnitFactor.
             */
            public Builder usageUnitFactor(Integer usageUnitFactor) {
                this.usageUnitFactor = usageUnitFactor;
                return this;
            }

            public ChargeModules build() {
                return new ChargeModules(this);
            } 

        } 

    }
}
