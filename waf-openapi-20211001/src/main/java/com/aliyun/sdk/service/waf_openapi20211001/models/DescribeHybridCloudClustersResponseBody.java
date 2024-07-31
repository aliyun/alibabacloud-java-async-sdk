// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridCloudClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudClustersResponseBody</p>
 */
public class DescribeHybridCloudClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterInfos")
    private java.util.List < ClusterInfos> clusterInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHybridCloudClustersResponseBody(Builder builder) {
        this.clusterInfos = builder.clusterInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterInfos
     */
    public java.util.List < ClusterInfos> getClusterInfos() {
        return this.clusterInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ClusterInfos> clusterInfos; 
        private String requestId; 

        /**
         * ClusterInfos.
         */
        public Builder clusterInfos(java.util.List < ClusterInfos> clusterInfos) {
            this.clusterInfos = clusterInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHybridCloudClustersResponseBody build() {
            return new DescribeHybridCloudClustersResponseBody(this);
        } 

    } 

    public static class ClusterInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessMode")
        private String accessMode;

        @com.aliyun.core.annotation.NameInMap("AccessRegion")
        private String accessRegion;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterResourceId")
        private String clusterResourceId;

        @com.aliyun.core.annotation.NameInMap("HttpPorts")
        private String httpPorts;

        @com.aliyun.core.annotation.NameInMap("HttpsPorts")
        private String httpsPorts;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ProtectionServerCount")
        private Integer protectionServerCount;

        @com.aliyun.core.annotation.NameInMap("ProxyStatus")
        private String proxyStatus;

        @com.aliyun.core.annotation.NameInMap("ProxyType")
        private String proxyType;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RuleConfig")
        private String ruleConfig;

        @com.aliyun.core.annotation.NameInMap("RuleStatus")
        private String ruleStatus;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        private ClusterInfos(Builder builder) {
            this.accessMode = builder.accessMode;
            this.accessRegion = builder.accessRegion;
            this.clusterName = builder.clusterName;
            this.clusterResourceId = builder.clusterResourceId;
            this.httpPorts = builder.httpPorts;
            this.httpsPorts = builder.httpsPorts;
            this.id = builder.id;
            this.protectionServerCount = builder.protectionServerCount;
            this.proxyStatus = builder.proxyStatus;
            this.proxyType = builder.proxyType;
            this.remark = builder.remark;
            this.ruleConfig = builder.ruleConfig;
            this.ruleStatus = builder.ruleStatus;
            this.ruleType = builder.ruleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInfos create() {
            return builder().build();
        }

        /**
         * @return accessMode
         */
        public String getAccessMode() {
            return this.accessMode;
        }

        /**
         * @return accessRegion
         */
        public String getAccessRegion() {
            return this.accessRegion;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterResourceId
         */
        public String getClusterResourceId() {
            return this.clusterResourceId;
        }

        /**
         * @return httpPorts
         */
        public String getHttpPorts() {
            return this.httpPorts;
        }

        /**
         * @return httpsPorts
         */
        public String getHttpsPorts() {
            return this.httpsPorts;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return protectionServerCount
         */
        public Integer getProtectionServerCount() {
            return this.protectionServerCount;
        }

        /**
         * @return proxyStatus
         */
        public String getProxyStatus() {
            return this.proxyStatus;
        }

        /**
         * @return proxyType
         */
        public String getProxyType() {
            return this.proxyType;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return ruleConfig
         */
        public String getRuleConfig() {
            return this.ruleConfig;
        }

        /**
         * @return ruleStatus
         */
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        public static final class Builder {
            private String accessMode; 
            private String accessRegion; 
            private String clusterName; 
            private String clusterResourceId; 
            private String httpPorts; 
            private String httpsPorts; 
            private Long id; 
            private Integer protectionServerCount; 
            private String proxyStatus; 
            private String proxyType; 
            private String remark; 
            private String ruleConfig; 
            private String ruleStatus; 
            private String ruleType; 

            /**
             * AccessMode.
             */
            public Builder accessMode(String accessMode) {
                this.accessMode = accessMode;
                return this;
            }

            /**
             * AccessRegion.
             */
            public Builder accessRegion(String accessRegion) {
                this.accessRegion = accessRegion;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * ClusterResourceId.
             */
            public Builder clusterResourceId(String clusterResourceId) {
                this.clusterResourceId = clusterResourceId;
                return this;
            }

            /**
             * HttpPorts.
             */
            public Builder httpPorts(String httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * HttpsPorts.
             */
            public Builder httpsPorts(String httpsPorts) {
                this.httpsPorts = httpsPorts;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ProtectionServerCount.
             */
            public Builder protectionServerCount(Integer protectionServerCount) {
                this.protectionServerCount = protectionServerCount;
                return this;
            }

            /**
             * ProxyStatus.
             */
            public Builder proxyStatus(String proxyStatus) {
                this.proxyStatus = proxyStatus;
                return this;
            }

            /**
             * ProxyType.
             */
            public Builder proxyType(String proxyType) {
                this.proxyType = proxyType;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * RuleConfig.
             */
            public Builder ruleConfig(String ruleConfig) {
                this.ruleConfig = ruleConfig;
                return this;
            }

            /**
             * RuleStatus.
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            public ClusterInfos build() {
                return new ClusterInfos(this);
            } 

        } 

    }
}
