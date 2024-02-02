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
         * The return result of the request.
         */
        public Builder instanceSecurityConfigs(InstanceSecurityConfigs instanceSecurityConfigs) {
            this.instanceSecurityConfigs = instanceSecurityConfigs;
            return this;
        }

        /**
         * The ID of the request.
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
             * The name of the check item.
             */
            public Builder configDescription(String configDescription) {
                this.configDescription = configDescription;
                return this;
            }

            /**
             * The group of the check.
             */
            public Builder configGroup(String configGroup) {
                this.configGroup = configGroup;
                return this;
            }

            /**
             * The name of the specific check item.
             */
            public Builder configName(String configName) {
                this.configName = configName;
                return this;
            }

            /**
             * Specifies whether a risk is detected.
             */
            public Builder risk(Boolean risk) {
                this.risk = risk;
                return this;
            }

            /**
             * Security recommendations.
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
        @NameInMap("CheckId")
        private String checkId;

        @NameInMap("CheckTime")
        private String checkTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("SecurityConfigs")
        private java.util.List < SecurityConfigs> securityConfigs;

        @NameInMap("TotalCheckCount")
        private Integer totalCheckCount;

        @NameInMap("TotalRiskCount")
        private Integer totalRiskCount;

        private InstanceSecurityConfigs(Builder builder) {
            this.checkId = builder.checkId;
            this.checkTime = builder.checkTime;
            this.instanceId = builder.instanceId;
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
            private String checkId; 
            private String checkTime; 
            private String instanceId; 
            private java.util.List < SecurityConfigs> securityConfigs; 
            private Integer totalCheckCount; 
            private Integer totalRiskCount; 

            /**
             * The unique identifier of the check.
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * The time when the check was performed.
             */
            public Builder checkTime(String checkTime) {
                this.checkTime = checkTime;
                return this;
            }

            /**
             * The ID of the OceanBase cluster.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The list of check items.
             */
            public Builder securityConfigs(java.util.List < SecurityConfigs> securityConfigs) {
                this.securityConfigs = securityConfigs;
                return this;
            }

            /**
             * The total number of security check items for the cluster.
             */
            public Builder totalCheckCount(Integer totalCheckCount) {
                this.totalCheckCount = totalCheckCount;
                return this;
            }

            /**
             * The total number of detected cluster security risks.
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
