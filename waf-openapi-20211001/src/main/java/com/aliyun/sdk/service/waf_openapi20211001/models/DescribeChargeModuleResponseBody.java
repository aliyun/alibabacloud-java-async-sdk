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
         * <p>The list of WAF pricing module information.</p>
         */
        public Builder chargeModules(java.util.List<ChargeModules> chargeModules) {
            this.chargeModules = chargeModules;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
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

        @com.aliyun.core.annotation.NameInMap("ChargeUnit")
        private String chargeUnit;

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
            this.chargeUnit = builder.chargeUnit;
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
         * @return chargeUnit
         */
        public String getChargeUnit() {
            return this.chargeUnit;
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
            private String chargeUnit; 
            private String moduleCode; 
            private String periodType; 
            private String usageType; 
            private Integer usageUnitFactor; 

            private Builder() {
            } 

            private Builder(ChargeModules model) {
                this.chargeMode = model.chargeMode;
                this.chargeModeDetails = model.chargeModeDetails;
                this.chargeUnit = model.chargeUnit;
                this.moduleCode = model.moduleCode;
                this.periodType = model.periodType;
                this.usageType = model.usageType;
                this.usageUnitFactor = model.usageUnitFactor;
            } 

            /**
             * <p>The pricing mode of the pricing module. Valid values:</p>
             * <ul>
             * <li><strong>NORMAL_PRICE</strong>: standard pricing.</li>
             * <li><strong>STEP_ACCUMULATION</strong>: tiered pricing.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL_PRICE</p>
             */
            public Builder chargeMode(String chargeMode) {
                this.chargeMode = chargeMode;
                return this;
            }

            /**
             * <p>The pricing details of the pricing module.</p>
             */
            public Builder chargeModeDetails(java.util.List<String> chargeModeDetails) {
                this.chargeModeDetails = chargeModeDetails;
                return this;
            }

            /**
             * <p>The pricing unit.</p>
             * 
             * <strong>example:</strong>
             * <p>SeCU</p>
             */
            public Builder chargeUnit(String chargeUnit) {
                this.chargeUnit = chargeUnit;
                return this;
            }

            /**
             * <p>The pricing module identity. Valid values:</p>
             * <ul>
             * <li><strong>domainCount</strong>: the number of CNAME-connected domain names.</li>
             * <li><strong>qps</strong>: the peak QPS.</li>
             * <li><strong>request</strong>: the basic traffic fee.</li>
             * <li><strong>ipBlacklistRuleCount</strong>: the number of IP blacklist rules.</li>
             * <li><strong>customAclBaseRuleCount</strong>: the number of Basic Policies in custom rules.</li>
             * <li><strong>customAclAdvanceRuleCount</strong>: the number of advanced rules in custom rules.</li>
             * <li><strong>antiScanRuleCount</strong>: the number of scan protection rules.</li>
             * <li><strong>customResponseRuleCount</strong>: the number of custom response rules.</li>
             * <li><strong>ipv6</strong>: IPv6.</li>
             * <li><strong>gslb</strong>: intelligent load balancing.</li>
             * <li><strong>exclusiveIpCount</strong>: the number of exclusive IP addresses.</li>
             * <li><strong>ccRuleCount</strong>: the number of HTTP flood mitigation rules.</li>
             * <li><strong>regionBlockRuleCount</strong>: the number of Location Blacklist rules.</li>
             * <li><strong>tamperproofRuleCount</strong>: the number of web tamper proofing rules.</li>
             * <li><strong>dlpRuleCount</strong>: the number of information leak prevention rules.</li>
             * <li><strong>botTraffic</strong>: the Bot management traffic fee.</li>
             * <li><strong>aiWhiteListTemplateCount</strong>: the number of intelligent whitelist templates.</li>
             * <li><strong>apisecResourceCount</strong>: the number of protected objects with API security enabled.</li>
             * <li><strong>apisecTraffic</strong>: the API security traffic fee.</li>
             * <li><strong>compliance</strong>: the number of protocol compliance templates.</li>
             * <li><strong>riskTraffic</strong>: the number of risk identification hits in Bot management.</li>
             * <li><strong>assetStatus</strong>: the asset center.</li>
             * <li><strong>nonPort</strong>: non-standard ports.</li>
             * <li><strong>customAclCaptcha</strong>: the number of custom rule slider verification attempts.</li>
             * <li><strong>wafBaseTemplateCount</strong>: the number of web core protection rules.</li>
             * <li><strong>instanceFee</strong>: the WAF instance fee.</li>
             * <li><strong>spikeThrottleRuleCount</strong>: the number of peak traffic throttling rules.</li>
             * <li><strong>botWebTemplateCount</strong>: the number of web protection templates in Bot management.</li>
             * <li><strong>botAppTemplateCount</strong>: the number of app protection templates in Bot management.</li>
             * <li><strong>customAclBotRuleCount</strong>: the number of advanced custom rules in Bot management.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>domainCount</p>
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * <p>The billing period type of the pricing module. Valid values:</p>
             * <ul>
             * <li><strong>Hour</strong>: hourly billing.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Hour</p>
             */
            public Builder periodType(String periodType) {
                this.periodType = periodType;
                return this;
            }

            /**
             * <p>The usage type of the pricing module. Valid values:</p>
             * <ul>
             * <li><strong>template</strong>: template.</li>
             * <li><strong>qps</strong>: QPS.</li>
             * <li><strong>domain</strong>: domain name.</li>
             * <li><strong>rule</strong>: rule.</li>
             * <li><strong>ip</strong>: IP address.</li>
             * <li><strong>resource</strong>: protected object.</li>
             * <li><strong>reqest</strong>: request.</li>
             * <li><strong>function</strong>: feature enablement.</li>
             * <li><strong>time</strong>: number of times.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>domain</p>
             */
            public Builder usageType(String usageType) {
                this.usageType = usageType;
                return this;
            }

            /**
             * <p>The billing unit factor of the pricing module.</p>
             * <blockquote>
             * <p>The billing unit factor <strong>UsageUnitFactor</strong> multiplied by the usage type <strong>UsageType</strong> forms the billing unit of the module.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
