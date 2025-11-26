// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListIntegrationPolicyServiceMonitorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIntegrationPolicyServiceMonitorsResponseBody</p>
 */
public class ListIntegrationPolicyServiceMonitorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("clusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("policyId")
    private String policyId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("serviceMonitors")
    private java.util.List<ServiceMonitors> serviceMonitors;

    private ListIntegrationPolicyServiceMonitorsResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.policyId = builder.policyId;
        this.requestId = builder.requestId;
        this.serviceMonitors = builder.serviceMonitors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationPolicyServiceMonitorsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceMonitors
     */
    public java.util.List<ServiceMonitors> getServiceMonitors() {
        return this.serviceMonitors;
    }

    public static final class Builder {
        private String clusterId; 
        private String policyId; 
        private String requestId; 
        private java.util.List<ServiceMonitors> serviceMonitors; 

        private Builder() {
        } 

        private Builder(ListIntegrationPolicyServiceMonitorsResponseBody model) {
            this.clusterId = model.clusterId;
            this.policyId = model.policyId;
            this.requestId = model.requestId;
            this.serviceMonitors = model.serviceMonitors;
        } 

        /**
         * clusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * policyId.
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * serviceMonitors.
         */
        public Builder serviceMonitors(java.util.List<ServiceMonitors> serviceMonitors) {
            this.serviceMonitors = serviceMonitors;
            return this;
        }

        public ListIntegrationPolicyServiceMonitorsResponseBody build() {
            return new ListIntegrationPolicyServiceMonitorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIntegrationPolicyServiceMonitorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPolicyServiceMonitorsResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("interval")
        private String interval;

        @com.aliyun.core.annotation.NameInMap("matchedTargetCount")
        private Long matchedTargetCount;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("targetPort")
        private String targetPort;

        private Endpoints(Builder builder) {
            this.interval = builder.interval;
            this.matchedTargetCount = builder.matchedTargetCount;
            this.path = builder.path;
            this.port = builder.port;
            this.targetPort = builder.targetPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return interval
         */
        public String getInterval() {
            return this.interval;
        }

        /**
         * @return matchedTargetCount
         */
        public Long getMatchedTargetCount() {
            return this.matchedTargetCount;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return targetPort
         */
        public String getTargetPort() {
            return this.targetPort;
        }

        public static final class Builder {
            private String interval; 
            private Long matchedTargetCount; 
            private String path; 
            private String port; 
            private String targetPort; 

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.interval = model.interval;
                this.matchedTargetCount = model.matchedTargetCount;
                this.path = model.path;
                this.port = model.port;
                this.targetPort = model.targetPort;
            } 

            /**
             * interval.
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * matchedTargetCount.
             */
            public Builder matchedTargetCount(Long matchedTargetCount) {
                this.matchedTargetCount = matchedTargetCount;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * targetPort.
             */
            public Builder targetPort(String targetPort) {
                this.targetPort = targetPort;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntegrationPolicyServiceMonitorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPolicyServiceMonitorsResponseBody</p>
     */
    public static class ServiceMonitors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("addonName")
        private String addonName;

        @com.aliyun.core.annotation.NameInMap("addonReleaseName")
        private String addonReleaseName;

        @com.aliyun.core.annotation.NameInMap("addonVersion")
        private String addonVersion;

        @com.aliyun.core.annotation.NameInMap("configYaml")
        private String configYaml;

        @com.aliyun.core.annotation.NameInMap("enableStatus")
        private String enableStatus;

        @com.aliyun.core.annotation.NameInMap("encryptYaml")
        private Boolean encryptYaml;

        @com.aliyun.core.annotation.NameInMap("endpoints")
        private java.util.List<Endpoints> endpoints;

        @com.aliyun.core.annotation.NameInMap("matchedServiceCount")
        private Long matchedServiceCount;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        private ServiceMonitors(Builder builder) {
            this.addonName = builder.addonName;
            this.addonReleaseName = builder.addonReleaseName;
            this.addonVersion = builder.addonVersion;
            this.configYaml = builder.configYaml;
            this.enableStatus = builder.enableStatus;
            this.encryptYaml = builder.encryptYaml;
            this.endpoints = builder.endpoints;
            this.matchedServiceCount = builder.matchedServiceCount;
            this.name = builder.name;
            this.namespace = builder.namespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceMonitors create() {
            return builder().build();
        }

        /**
         * @return addonName
         */
        public String getAddonName() {
            return this.addonName;
        }

        /**
         * @return addonReleaseName
         */
        public String getAddonReleaseName() {
            return this.addonReleaseName;
        }

        /**
         * @return addonVersion
         */
        public String getAddonVersion() {
            return this.addonVersion;
        }

        /**
         * @return configYaml
         */
        public String getConfigYaml() {
            return this.configYaml;
        }

        /**
         * @return enableStatus
         */
        public String getEnableStatus() {
            return this.enableStatus;
        }

        /**
         * @return encryptYaml
         */
        public Boolean getEncryptYaml() {
            return this.encryptYaml;
        }

        /**
         * @return endpoints
         */
        public java.util.List<Endpoints> getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return matchedServiceCount
         */
        public Long getMatchedServiceCount() {
            return this.matchedServiceCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        public static final class Builder {
            private String addonName; 
            private String addonReleaseName; 
            private String addonVersion; 
            private String configYaml; 
            private String enableStatus; 
            private Boolean encryptYaml; 
            private java.util.List<Endpoints> endpoints; 
            private Long matchedServiceCount; 
            private String name; 
            private String namespace; 

            private Builder() {
            } 

            private Builder(ServiceMonitors model) {
                this.addonName = model.addonName;
                this.addonReleaseName = model.addonReleaseName;
                this.addonVersion = model.addonVersion;
                this.configYaml = model.configYaml;
                this.enableStatus = model.enableStatus;
                this.encryptYaml = model.encryptYaml;
                this.endpoints = model.endpoints;
                this.matchedServiceCount = model.matchedServiceCount;
                this.name = model.name;
                this.namespace = model.namespace;
            } 

            /**
             * addonName.
             */
            public Builder addonName(String addonName) {
                this.addonName = addonName;
                return this;
            }

            /**
             * addonReleaseName.
             */
            public Builder addonReleaseName(String addonReleaseName) {
                this.addonReleaseName = addonReleaseName;
                return this;
            }

            /**
             * addonVersion.
             */
            public Builder addonVersion(String addonVersion) {
                this.addonVersion = addonVersion;
                return this;
            }

            /**
             * configYaml.
             */
            public Builder configYaml(String configYaml) {
                this.configYaml = configYaml;
                return this;
            }

            /**
             * enableStatus.
             */
            public Builder enableStatus(String enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * encryptYaml.
             */
            public Builder encryptYaml(Boolean encryptYaml) {
                this.encryptYaml = encryptYaml;
                return this;
            }

            /**
             * endpoints.
             */
            public Builder endpoints(java.util.List<Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * matchedServiceCount.
             */
            public Builder matchedServiceCount(Long matchedServiceCount) {
                this.matchedServiceCount = matchedServiceCount;
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
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            public ServiceMonitors build() {
                return new ServiceMonitors(this);
            } 

        } 

    }
}
