// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantSecurityConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantSecurityConfigsResponseBody</p>
 */
public class DescribeTenantSecurityConfigsResponseBody extends TeaModel {
    @NameInMap("Configs")
    private Configs configs;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeTenantSecurityConfigsResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTenantSecurityConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return configs
     */
    public Configs getConfigs() {
        return this.configs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Configs configs; 
        private String requestId; 

        /**
         * Configs.
         */
        public Builder configs(Configs configs) {
            this.configs = configs;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTenantSecurityConfigsResponseBody build() {
            return new DescribeTenantSecurityConfigsResponseBody(this);
        } 

    } 

    public static class SecurityConfigs extends TeaModel {
        @NameInMap("ConfigDescription")
        private String configDescription;

        @NameInMap("ConfigGroup")
        private String configGroup;

        @NameInMap("ConfigName")
        private String configName;

        @NameInMap("Risk")
        private Boolean risk;

        @NameInMap("RiskDescription")
        private String riskDescription;

        private SecurityConfigs(Builder builder) {
            this.configDescription = builder.configDescription;
            this.configGroup = builder.configGroup;
            this.configName = builder.configName;
            this.risk = builder.risk;
            this.riskDescription = builder.riskDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityConfigs create() {
            return builder().build();
        }

        /**
         * @return configDescription
         */
        public String getConfigDescription() {
            return this.configDescription;
        }

        /**
         * @return configGroup
         */
        public String getConfigGroup() {
            return this.configGroup;
        }

        /**
         * @return configName
         */
        public String getConfigName() {
            return this.configName;
        }

        /**
         * @return risk
         */
        public Boolean getRisk() {
            return this.risk;
        }

        /**
         * @return riskDescription
         */
        public String getRiskDescription() {
            return this.riskDescription;
        }

        public static final class Builder {
            private String configDescription; 
            private String configGroup; 
            private String configName; 
            private Boolean risk; 
            private String riskDescription; 

            /**
             * 检测项名称
             */
            public Builder configDescription(String configDescription) {
                this.configDescription = configDescription;
                return this;
            }

            /**
             * 风险分组
             */
            public Builder configGroup(String configGroup) {
                this.configGroup = configGroup;
                return this;
            }

            /**
             * 风险项目名称
             */
            public Builder configName(String configName) {
                this.configName = configName;
                return this;
            }

            /**
             * 是否有风险
             */
            public Builder risk(Boolean risk) {
                this.risk = risk;
                return this;
            }

            /**
             * 风险描述
             */
            public Builder riskDescription(String riskDescription) {
                this.riskDescription = riskDescription;
                return this;
            }

            public SecurityConfigs build() {
                return new SecurityConfigs(this);
            } 

        } 

    }
    public static class TenantSecurityConfigs extends TeaModel {
        @NameInMap("RiskCount")
        private Integer riskCount;

        @NameInMap("SecurityConfigs")
        private java.util.List < SecurityConfigs> securityConfigs;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("TenantName")
        private String tenantName;

        private TenantSecurityConfigs(Builder builder) {
            this.riskCount = builder.riskCount;
            this.securityConfigs = builder.securityConfigs;
            this.tenantId = builder.tenantId;
            this.tenantName = builder.tenantName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantSecurityConfigs create() {
            return builder().build();
        }

        /**
         * @return riskCount
         */
        public Integer getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return securityConfigs
         */
        public java.util.List < SecurityConfigs> getSecurityConfigs() {
            return this.securityConfigs;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        public static final class Builder {
            private Integer riskCount; 
            private java.util.List < SecurityConfigs> securityConfigs; 
            private String tenantId; 
            private String tenantName; 

            /**
             * 租户的风险条目
             */
            public Builder riskCount(Integer riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * 风险列表
             */
            public Builder securityConfigs(java.util.List < SecurityConfigs> securityConfigs) {
                this.securityConfigs = securityConfigs;
                return this;
            }

            /**
             * 租户Id
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * 租户名称
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            public TenantSecurityConfigs build() {
                return new TenantSecurityConfigs(this);
            } 

        } 

    }
    public static class Configs extends TeaModel {
        @NameInMap("TenantSecurityConfigs")
        private java.util.List < TenantSecurityConfigs> tenantSecurityConfigs;

        @NameInMap("TotalCheckCount")
        private Integer totalCheckCount;

        @NameInMap("TotalRiskCount")
        private Integer totalRiskCount;

        private Configs(Builder builder) {
            this.tenantSecurityConfigs = builder.tenantSecurityConfigs;
            this.totalCheckCount = builder.totalCheckCount;
            this.totalRiskCount = builder.totalRiskCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return tenantSecurityConfigs
         */
        public java.util.List < TenantSecurityConfigs> getTenantSecurityConfigs() {
            return this.tenantSecurityConfigs;
        }

        /**
         * @return totalCheckCount
         */
        public Integer getTotalCheckCount() {
            return this.totalCheckCount;
        }

        /**
         * @return totalRiskCount
         */
        public Integer getTotalRiskCount() {
            return this.totalRiskCount;
        }

        public static final class Builder {
            private java.util.List < TenantSecurityConfigs> tenantSecurityConfigs; 
            private Integer totalCheckCount; 
            private Integer totalRiskCount; 

            /**
             * 检测结果
             */
            public Builder tenantSecurityConfigs(java.util.List < TenantSecurityConfigs> tenantSecurityConfigs) {
                this.tenantSecurityConfigs = tenantSecurityConfigs;
                return this;
            }

            /**
             * 安全配置总体检测项目
             */
            public Builder totalCheckCount(Integer totalCheckCount) {
                this.totalCheckCount = totalCheckCount;
                return this;
            }

            /**
             * 检测出来的总体风险项目
             */
            public Builder totalRiskCount(Integer totalRiskCount) {
                this.totalRiskCount = totalRiskCount;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
