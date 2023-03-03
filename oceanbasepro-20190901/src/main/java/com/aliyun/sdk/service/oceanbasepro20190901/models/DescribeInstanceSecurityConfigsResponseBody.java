// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceSecurityConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSecurityConfigsResponseBody</p>
 */
public class DescribeInstanceSecurityConfigsResponseBody extends TeaModel {
    @NameInMap("InstanceSecurityConfigs")
    private InstanceSecurityConfigs instanceSecurityConfigs;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceSecurityConfigsResponseBody(Builder builder) {
        this.instanceSecurityConfigs = builder.instanceSecurityConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSecurityConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceSecurityConfigs
     */
    public InstanceSecurityConfigs getInstanceSecurityConfigs() {
        return this.instanceSecurityConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceSecurityConfigs instanceSecurityConfigs; 
        private String requestId; 

        /**
         * InstanceSecurityConfigs.
         */
        public Builder instanceSecurityConfigs(InstanceSecurityConfigs instanceSecurityConfigs) {
            this.instanceSecurityConfigs = instanceSecurityConfigs;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceSecurityConfigsResponseBody build() {
            return new DescribeInstanceSecurityConfigsResponseBody(this);
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
             * 检测分组
             */
            public Builder configGroup(String configGroup) {
                this.configGroup = configGroup;
                return this;
            }

            /**
             * 具体检测项名称
             */
            public Builder configName(String configName) {
                this.configName = configName;
                return this;
            }

            /**
             * 是否存在风险
             */
            public Builder risk(Boolean risk) {
                this.risk = risk;
                return this;
            }

            /**
             * 安全建议
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
    public static class InstanceSecurityConfigs extends TeaModel {
        @NameInMap("SecurityConfigs")
        private java.util.List < SecurityConfigs> securityConfigs;

        @NameInMap("TotalCheckCount")
        private Integer totalCheckCount;

        @NameInMap("TotalRiskCount")
        private Integer totalRiskCount;

        private InstanceSecurityConfigs(Builder builder) {
            this.securityConfigs = builder.securityConfigs;
            this.totalCheckCount = builder.totalCheckCount;
            this.totalRiskCount = builder.totalRiskCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSecurityConfigs create() {
            return builder().build();
        }

        /**
         * @return securityConfigs
         */
        public java.util.List < SecurityConfigs> getSecurityConfigs() {
            return this.securityConfigs;
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
            private java.util.List < SecurityConfigs> securityConfigs; 
            private Integer totalCheckCount; 
            private Integer totalRiskCount; 

            /**
             * 检测项目列表
             */
            public Builder securityConfigs(java.util.List < SecurityConfigs> securityConfigs) {
                this.securityConfigs = securityConfigs;
                return this;
            }

            /**
             * 集群安全项检测总数
             */
            public Builder totalCheckCount(Integer totalCheckCount) {
                this.totalCheckCount = totalCheckCount;
                return this;
            }

            /**
             * 集群安全项风险总数
             */
            public Builder totalRiskCount(Integer totalRiskCount) {
                this.totalRiskCount = totalRiskCount;
                return this;
            }

            public InstanceSecurityConfigs build() {
                return new InstanceSecurityConfigs(this);
            } 

        } 

    }
}
