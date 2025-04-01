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
 * {@link DescribeInstanceSecurityConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSecurityConfigsResponseBody</p>
 */
public class DescribeInstanceSecurityConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceSecurityConfigs")
    private InstanceSecurityConfigs instanceSecurityConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInstanceSecurityConfigsResponseBody model) {
            this.instanceSecurityConfigs = model.instanceSecurityConfigs;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The return result of the request.</p>
         */
        public Builder instanceSecurityConfigs(InstanceSecurityConfigs instanceSecurityConfigs) {
            this.instanceSecurityConfigs = instanceSecurityConfigs;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceSecurityConfigsResponseBody build() {
            return new DescribeInstanceSecurityConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceSecurityConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSecurityConfigsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SecurityConfigs model) {
                this.configDescription = model.configDescription;
                this.configGroup = model.configGroup;
                this.configName = model.configName;
                this.risk = model.risk;
                this.riskDescription = model.riskDescription;
            } 

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
             * <p>The group of the check.</p>
             * 
             * <strong>example:</strong>
             * <p>WHITELIST</p>
             */
            public Builder configGroup(String configGroup) {
                this.configGroup = configGroup;
                return this;
            }

            /**
             * <p>The name of the specific check item.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder configName(String configName) {
                this.configName = configName;
                return this;
            }

            /**
             * <p>Specifies whether a risk is detected.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder risk(Boolean risk) {
                this.risk = risk;
                return this;
            }

            /**
             * <p>Security recommendations.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
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
     * {@link DescribeInstanceSecurityConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSecurityConfigsResponseBody</p>
     */
    public static class InstanceSecurityConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private String checkId;

        @com.aliyun.core.annotation.NameInMap("CheckTime")
        private String checkTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("SecurityConfigs")
        private java.util.List<SecurityConfigs> securityConfigs;

        @com.aliyun.core.annotation.NameInMap("TotalCheckCount")
        private Integer totalCheckCount;

        @com.aliyun.core.annotation.NameInMap("TotalRiskCount")
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
        public java.util.List<SecurityConfigs> getSecurityConfigs() {
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
            private java.util.List<SecurityConfigs> securityConfigs; 
            private Integer totalCheckCount; 
            private Integer totalRiskCount; 

            private Builder() {
            } 

            private Builder(InstanceSecurityConfigs model) {
                this.checkId = model.checkId;
                this.checkTime = model.checkTime;
                this.instanceId = model.instanceId;
                this.securityConfigs = model.securityConfigs;
                this.totalCheckCount = model.totalCheckCount;
                this.totalRiskCount = model.totalRiskCount;
            } 

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
             * <p>The list of check items.</p>
             */
            public Builder securityConfigs(java.util.List<SecurityConfigs> securityConfigs) {
                this.securityConfigs = securityConfigs;
                return this;
            }

            /**
             * <p>The total number of security check items for the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder totalCheckCount(Integer totalCheckCount) {
                this.totalCheckCount = totalCheckCount;
                return this;
            }

            /**
             * <p>The total number of detected cluster security risks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
