// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GatewayServiceSource} extends {@link TeaModel}
 *
 * <p>GatewayServiceSource</p>
 */
public class GatewayServiceSource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bound")
    private Boolean bound;

    @com.aliyun.core.annotation.NameInMap("createTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("k8sServiceSourceInfo")
    private K8sServiceSourceInfo k8sServiceSourceInfo;

    @com.aliyun.core.annotation.NameInMap("nacosServiceSourceInfo")
    private NacosServiceSourceInfo nacosServiceSourceInfo;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("serviceSourceId")
    private String serviceSourceId;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("updateTimestamp")
    private Long updateTimestamp;

    private GatewayServiceSource(Builder builder) {
        this.bound = builder.bound;
        this.createTimestamp = builder.createTimestamp;
        this.k8sServiceSourceInfo = builder.k8sServiceSourceInfo;
        this.nacosServiceSourceInfo = builder.nacosServiceSourceInfo;
        this.name = builder.name;
        this.serviceSourceId = builder.serviceSourceId;
        this.type = builder.type;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GatewayServiceSource create() {
        return builder().build();
    }

    /**
     * @return bound
     */
    public Boolean getBound() {
        return this.bound;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return k8sServiceSourceInfo
     */
    public K8sServiceSourceInfo getK8sServiceSourceInfo() {
        return this.k8sServiceSourceInfo;
    }

    /**
     * @return nacosServiceSourceInfo
     */
    public NacosServiceSourceInfo getNacosServiceSourceInfo() {
        return this.nacosServiceSourceInfo;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return serviceSourceId
     */
    public String getServiceSourceId() {
        return this.serviceSourceId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private Boolean bound; 
        private Long createTimestamp; 
        private K8sServiceSourceInfo k8sServiceSourceInfo; 
        private NacosServiceSourceInfo nacosServiceSourceInfo; 
        private String name; 
        private String serviceSourceId; 
        private String type; 
        private Long updateTimestamp; 

        /**
         * bound.
         */
        public Builder bound(Boolean bound) {
            this.bound = bound;
            return this;
        }

        /**
         * createTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * k8sServiceSourceInfo.
         */
        public Builder k8sServiceSourceInfo(K8sServiceSourceInfo k8sServiceSourceInfo) {
            this.k8sServiceSourceInfo = k8sServiceSourceInfo;
            return this;
        }

        /**
         * nacosServiceSourceInfo.
         */
        public Builder nacosServiceSourceInfo(NacosServiceSourceInfo nacosServiceSourceInfo) {
            this.nacosServiceSourceInfo = nacosServiceSourceInfo;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * serviceSourceId.
         */
        public Builder serviceSourceId(String serviceSourceId) {
            this.serviceSourceId = serviceSourceId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * updateTimestamp.
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public GatewayServiceSource build() {
            return new GatewayServiceSource(this);
        } 

    } 

    public static class IngressConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("ingressClass")
        private String ingressClass;

        @com.aliyun.core.annotation.NameInMap("overrideIngressIp")
        private Boolean overrideIngressIp;

        @com.aliyun.core.annotation.NameInMap("watchNamespace")
        private String watchNamespace;

        private IngressConfig(Builder builder) {
            this.enable = builder.enable;
            this.ingressClass = builder.ingressClass;
            this.overrideIngressIp = builder.overrideIngressIp;
            this.watchNamespace = builder.watchNamespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressConfig create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return ingressClass
         */
        public String getIngressClass() {
            return this.ingressClass;
        }

        /**
         * @return overrideIngressIp
         */
        public Boolean getOverrideIngressIp() {
            return this.overrideIngressIp;
        }

        /**
         * @return watchNamespace
         */
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

        public static final class Builder {
            private Boolean enable; 
            private String ingressClass; 
            private Boolean overrideIngressIp; 
            private String watchNamespace; 

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * ingressClass.
             */
            public Builder ingressClass(String ingressClass) {
                this.ingressClass = ingressClass;
                return this;
            }

            /**
             * overrideIngressIp.
             */
            public Builder overrideIngressIp(Boolean overrideIngressIp) {
                this.overrideIngressIp = overrideIngressIp;
                return this;
            }

            /**
             * watchNamespace.
             */
            public Builder watchNamespace(String watchNamespace) {
                this.watchNamespace = watchNamespace;
                return this;
            }

            public IngressConfig build() {
                return new IngressConfig(this);
            } 

        } 

    }
    public static class K8sServiceSourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ingressConfig")
        private IngressConfig ingressConfig;

        private K8sServiceSourceInfo(Builder builder) {
            this.clusterId = builder.clusterId;
            this.ingressConfig = builder.ingressConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static K8sServiceSourceInfo create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return ingressConfig
         */
        public IngressConfig getIngressConfig() {
            return this.ingressConfig;
        }

        public static final class Builder {
            private String clusterId; 
            private IngressConfig ingressConfig; 

            /**
             * clusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ingressConfig.
             */
            public Builder ingressConfig(IngressConfig ingressConfig) {
                this.ingressConfig = ingressConfig;
                return this;
            }

            public K8sServiceSourceInfo build() {
                return new K8sServiceSourceInfo(this);
            } 

        } 

    }
    public static class NacosServiceSourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        private NacosServiceSourceInfo(Builder builder) {
            this.address = builder.address;
            this.clusterId = builder.clusterId;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NacosServiceSourceInfo create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String address; 
            private String clusterId; 
            private String instanceId; 

            /**
             * address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * clusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public NacosServiceSourceInfo build() {
                return new NacosServiceSourceInfo(this);
            } 

        } 

    }
}
