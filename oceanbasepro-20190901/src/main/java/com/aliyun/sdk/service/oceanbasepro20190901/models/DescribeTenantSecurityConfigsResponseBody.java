// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeTenantSecurityConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantSecurityConfigsResponseBody</p>
 */
public class DescribeTenantSecurityConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configs")
    private Configs configs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The list of parameters.</p>
         */
        public Builder configs(Configs configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>523E7183-<strong><strong>-590D-</strong></strong>-12DFD316614B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTenantSecurityConfigsResponseBody build() {
            return new DescribeTenantSecurityConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTenantSecurityConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTenantSecurityConfigsResponseBody</p>
     */
    public static class SecurityConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigDescription")
        private String configDescription;

        @com.aliyun.core.annotation.NameInMap("ConfigGroup")
        private String configGroup;

        @com.aliyun.core.annotation.NameInMap("ConfigName")
        private String configName;

        @com.aliyun.core.annotation.NameInMap("Risk")
        private Boolean risk;

        @com.aliyun.core.annotation.NameInMap("RiskDescription")
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
             * <p>The name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Check whether the scope of the cluster allowlist is too big</p>
             */
            public Builder configDescription(String configDescription) {
                this.configDescription = configDescription;
                return this;
            }

            /**
             * <p>The group of the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>WHITELIST</p>
             */
            public Builder configGroup(String configGroup) {
                this.configGroup = configGroup;
                return this;
            }

            /**
             * <p>The name of the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>WHITELIST_RANGE_LARGE</p>
             */
            public Builder configName(String configName) {
                this.configName = configName;
                return this;
            }

            /**
             * <p>Indicates whether the risk causes security issues.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder risk(Boolean risk) {
                this.risk = risk;
                return this;
            }

            /**
             * <p>The description of the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>The scope of the allowlist is too big.</p>
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
    /**
     * 
     * {@link DescribeTenantSecurityConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTenantSecurityConfigsResponseBody</p>
     */
    public static class TenantSecurityConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Integer riskCount;

        @com.aliyun.core.annotation.NameInMap("SecurityConfigs")
        private java.util.List<SecurityConfigs> securityConfigs;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TenantName")
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
        public java.util.List<SecurityConfigs> getSecurityConfigs() {
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
            private java.util.List<SecurityConfigs> securityConfigs; 
            private String tenantId; 
            private String tenantName; 

            /**
             * <p>The number of detected tenant security risks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskCount(Integer riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>The list of risks.</p>
             */
            public Builder securityConfigs(java.util.List<SecurityConfigs> securityConfigs) {
                this.securityConfigs = securityConfigs;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The name of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
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
    /**
     * 
     * {@link DescribeTenantSecurityConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTenantSecurityConfigsResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private String checkId;

        @com.aliyun.core.annotation.NameInMap("CheckTime")
        private String checkTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TenantSecurityConfigs")
        private java.util.List<TenantSecurityConfigs> tenantSecurityConfigs;

        @com.aliyun.core.annotation.NameInMap("TotalCheckCount")
        private Integer totalCheckCount;

        @com.aliyun.core.annotation.NameInMap("TotalRiskCount")
        private Integer totalRiskCount;

        private Configs(Builder builder) {
            this.checkId = builder.checkId;
            this.checkTime = builder.checkTime;
            this.instanceId = builder.instanceId;
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
         * @return checkId
         */
        public String getCheckId() {
            return this.checkId;
        }

        /**
         * @return checkTime
         */
        public String getCheckTime() {
            return this.checkTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return tenantSecurityConfigs
         */
        public java.util.List<TenantSecurityConfigs> getTenantSecurityConfigs() {
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
            private String checkId; 
            private String checkTime; 
            private String instanceId; 
            private java.util.List<TenantSecurityConfigs> tenantSecurityConfigs; 
            private Integer totalCheckCount; 
            private Integer totalRiskCount; 

            /**
             * <p>The unique identifier of the check.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The time when the check was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-07 15:30:00</p>
             */
            public Builder checkTime(String checkTime) {
                this.checkTime = checkTime;
                return this;
            }

            /**
             * <p>The ID of the OceanBase cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ob317v4uif****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The check result.</p>
             */
            public Builder tenantSecurityConfigs(java.util.List<TenantSecurityConfigs> tenantSecurityConfigs) {
                this.tenantSecurityConfigs = tenantSecurityConfigs;
                return this;
            }

            /**
             * <p>The total number of security check items.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder totalCheckCount(Integer totalCheckCount) {
                this.totalCheckCount = totalCheckCount;
                return this;
            }

            /**
             * <p>The total number of detected security risks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
