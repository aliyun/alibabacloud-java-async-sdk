// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListK8sIngressRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListK8sIngressRulesResponseBody</p>
 */
public class ListK8sIngressRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListK8sIngressRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListK8sIngressRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data that is returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListK8sIngressRulesResponseBody build() {
            return new ListK8sIngressRulesResponseBody(this);
        } 

    } 

    public static class Backend extends TeaModel {
        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("ServicePort")
        private String servicePort;

        private Backend(Builder builder) {
            this.serviceName = builder.serviceName;
            this.servicePort = builder.servicePort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backend create() {
            return builder().build();
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return servicePort
         */
        public String getServicePort() {
            return this.servicePort;
        }

        public static final class Builder {
            private String serviceName; 
            private String servicePort; 

            /**
             * The name of the backend service.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The port of the backend service.
             */
            public Builder servicePort(String servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            public Backend build() {
                return new Backend(this);
            } 

        } 

    }
    public static class Paths extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("Backend")
        private Backend backend;

        @NameInMap("CollectRate")
        private Integer collectRate;

        @NameInMap("Path")
        private String path;

        @NameInMap("PathType")
        private String pathType;

        @NameInMap("Status")
        private String status;

        private Paths(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.backend = builder.backend;
            this.collectRate = builder.collectRate;
            this.path = builder.path;
            this.pathType = builder.pathType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Paths create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return backend
         */
        public Backend getBackend() {
            return this.backend;
        }

        /**
         * @return collectRate
         */
        public Integer getCollectRate() {
            return this.collectRate;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return pathType
         */
        public String getPathType() {
            return this.pathType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private Backend backend; 
            private Integer collectRate; 
            private String path; 
            private String pathType; 
            private String status; 

            /**
             * The ID of the EDAS application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the EDAS application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The configuration of the backend service.
             */
            public Builder backend(Backend backend) {
                this.backend = backend;
                return this;
            }

            /**
             * The collection rate that is set based on the trace query feature. You can add a TraceID to a gateway to use the trace query feature of EDAS.
             */
            public Builder collectRate(Integer collectRate) {
                this.collectRate = collectRate;
                return this;
            }

            /**
             * The path to be accessed.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * PathType.
             */
            public Builder pathType(String pathType) {
                this.pathType = pathType;
                return this;
            }

            /**
             * The status of the Ingress. Valid values:
             * <p>
             * 
             * *   **Normal**: The Ingress works properly.
             * *   **ServiceNotFound**: The backend service does not exist.
             * *   **InvalidServicePort**: The service port is invalid.
             * *   **NotManagedService**: The service is not managed by EDAS.
             * *   **Unknown**: An unknown error occurred.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Paths build() {
                return new Paths(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @NameInMap("EnableTls")
        private Boolean enableTls;

        @NameInMap("Host")
        private String host;

        @NameInMap("Paths")
        private java.util.List < Paths> paths;

        @NameInMap("SecretName")
        private String secretName;

        private Rules(Builder builder) {
            this.enableTls = builder.enableTls;
            this.host = builder.host;
            this.paths = builder.paths;
            this.secretName = builder.secretName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return enableTls
         */
        public Boolean getEnableTls() {
            return this.enableTls;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return paths
         */
        public java.util.List < Paths> getPaths() {
            return this.paths;
        }

        /**
         * @return secretName
         */
        public String getSecretName() {
            return this.secretName;
        }

        public static final class Builder {
            private Boolean enableTls; 
            private String host; 
            private java.util.List < Paths> paths; 
            private String secretName; 

            /**
             * Indicates whether TLS is enabled. Valid values:
             * <p>
             * 
             * *   true: TLS is enabled.
             * *   false: TLS is disabled.
             */
            public Builder enableTls(Boolean enableTls) {
                this.enableTls = enableTls;
                return this;
            }

            /**
             * The domain name to be accessed.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The list of paths to be accessed.
             */
            public Builder paths(java.util.List < Paths> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * The name of the Secret that stores the information about the Transport Layer Security (TLS) certificate.
             */
            public Builder secretName(String secretName) {
                this.secretName = secretName;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class IngressConfs extends TeaModel {
        @NameInMap("AlbId")
        private String albId;

        @NameInMap("Annotations")
        private String annotations;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DashboardUrl")
        private String dashboardUrl;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("IngressType")
        private String ingressType;

        @NameInMap("Labels")
        private String labels;

        @NameInMap("MseGatewayId")
        private String mseGatewayId;

        @NameInMap("MseGatewayName")
        private String mseGatewayName;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("OfficalBasicUrl")
        private String officalBasicUrl;

        @NameInMap("OfficalRequestUrl")
        private String officalRequestUrl;

        @NameInMap("Rules")
        private java.util.List < Rules> rules;

        @NameInMap("SslRedirect")
        private Boolean sslRedirect;

        private IngressConfs(Builder builder) {
            this.albId = builder.albId;
            this.annotations = builder.annotations;
            this.creationTime = builder.creationTime;
            this.dashboardUrl = builder.dashboardUrl;
            this.endpoint = builder.endpoint;
            this.ingressType = builder.ingressType;
            this.labels = builder.labels;
            this.mseGatewayId = builder.mseGatewayId;
            this.mseGatewayName = builder.mseGatewayName;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.officalBasicUrl = builder.officalBasicUrl;
            this.officalRequestUrl = builder.officalRequestUrl;
            this.rules = builder.rules;
            this.sslRedirect = builder.sslRedirect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressConfs create() {
            return builder().build();
        }

        /**
         * @return albId
         */
        public String getAlbId() {
            return this.albId;
        }

        /**
         * @return annotations
         */
        public String getAnnotations() {
            return this.annotations;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return dashboardUrl
         */
        public String getDashboardUrl() {
            return this.dashboardUrl;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return ingressType
         */
        public String getIngressType() {
            return this.ingressType;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return mseGatewayId
         */
        public String getMseGatewayId() {
            return this.mseGatewayId;
        }

        /**
         * @return mseGatewayName
         */
        public String getMseGatewayName() {
            return this.mseGatewayName;
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

        /**
         * @return officalBasicUrl
         */
        public String getOfficalBasicUrl() {
            return this.officalBasicUrl;
        }

        /**
         * @return officalRequestUrl
         */
        public String getOfficalRequestUrl() {
            return this.officalRequestUrl;
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        /**
         * @return sslRedirect
         */
        public Boolean getSslRedirect() {
            return this.sslRedirect;
        }

        public static final class Builder {
            private String albId; 
            private String annotations; 
            private String creationTime; 
            private String dashboardUrl; 
            private String endpoint; 
            private String ingressType; 
            private String labels; 
            private String mseGatewayId; 
            private String mseGatewayName; 
            private String name; 
            private String namespace; 
            private String officalBasicUrl; 
            private String officalRequestUrl; 
            private java.util.List < Rules> rules; 
            private Boolean sslRedirect; 

            /**
             * The ID of the Application Load Balancer (ALB) instance.
             */
            public Builder albId(String albId) {
                this.albId = albId;
                return this;
            }

            /**
             * The annotations.
             */
            public Builder annotations(String annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * The time when the Ingress was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The monitoring URL of the Ingress.
             */
            public Builder dashboardUrl(String dashboardUrl) {
                this.dashboardUrl = dashboardUrl;
                return this;
            }

            /**
             * The IP address of the Ingress.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The type of the Ingress. Valid values:
             * <p>
             * 
             * *   **NginxIngress**: NGINX Ingress controller
             * *   **AlbIngress**: ALB Ingress controller
             * 
             * Default value: NginxIngress.
             */
            public Builder ingressType(String ingressType) {
                this.ingressType = ingressType;
                return this;
            }

            /**
             * The labels.
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * The ID of the Microservices Engine (MSE) gateway.
             */
            public Builder mseGatewayId(String mseGatewayId) {
                this.mseGatewayId = mseGatewayId;
                return this;
            }

            /**
             * The name of the MSE gateway.
             */
            public Builder mseGatewayName(String mseGatewayName) {
                this.mseGatewayName = mseGatewayName;
                return this;
            }

            /**
             * The name of the Ingress.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The Kubernetes namespace to which the Ingress belongs.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The URL used for basic monitoring of the open source version.
             */
            public Builder officalBasicUrl(String officalBasicUrl) {
                this.officalBasicUrl = officalBasicUrl;
                return this;
            }

            /**
             * The URL used for request performance monitoring of the open source version.
             */
            public Builder officalRequestUrl(String officalRequestUrl) {
                this.officalRequestUrl = officalRequestUrl;
                return this;
            }

            /**
             * The list of routing rules.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * Indicates whether SSL redirect is enabled. Valid values:
             * <p>
             * 
             * *   true: SSL redirect is enabled.
             * *   false: SSL redirect is disabled.
             */
            public Builder sslRedirect(Boolean sslRedirect) {
                this.sslRedirect = sslRedirect;
                return this;
            }

            public IngressConfs build() {
                return new IngressConfs(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("IngressConfs")
        private java.util.List < IngressConfs> ingressConfs;

        @NameInMap("RegionId")
        private String regionId;

        private Data(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.ingressConfs = builder.ingressConfs;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return ingressConfs
         */
        public java.util.List < IngressConfs> getIngressConfs() {
            return this.ingressConfs;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private java.util.List < IngressConfs> ingressConfs; 
            private String regionId; 

            /**
             * The ID of the Kubernetes cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the Kubernetes cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The Ingresses.
             */
            public Builder ingressConfs(java.util.List < IngressConfs> ingressConfs) {
                this.ingressConfs = ingressConfs;
                return this;
            }

            /**
             * The ID of the region where the cluster resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
