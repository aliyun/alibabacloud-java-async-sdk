// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListK8sIngressRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListK8sIngressRulesResponseBody</p>
 */
public class ListK8sIngressRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListK8sIngressRulesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5C1C9DE7-88FF-4B56-A47B-3DBBCEB******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListK8sIngressRulesResponseBody build() {
            return new ListK8sIngressRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListK8sIngressRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListK8sIngressRulesResponseBody</p>
     */
    public static class Backend extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
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

            private Builder() {
            } 

            private Builder(Backend model) {
                this.serviceName = model.serviceName;
                this.servicePort = model.servicePort;
            } 

            /**
             * <p>The name of the backend Service.</p>
             * 
             * <strong>example:</strong>
             * <p>http-service</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The port of the backend Service.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
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
    /**
     * 
     * {@link ListK8sIngressRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListK8sIngressRulesResponseBody</p>
     */
    public static class Paths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Backend")
        private Backend backend;

        @com.aliyun.core.annotation.NameInMap("CollectRate")
        private Integer collectRate;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("PathType")
        private String pathType;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(Paths model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.backend = model.backend;
                this.collectRate = model.collectRate;
                this.path = model.path;
                this.pathType = model.pathType;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the EDAS application.</p>
             * 
             * <strong>example:</strong>
             * <p>43d30ba5-c568-460c-8080-d447ed1a****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the EDAS application.</p>
             * 
             * <strong>example:</strong>
             * <p>my-app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The configurations of the backend Service.</p>
             */
            public Builder backend(Backend backend) {
                this.backend = backend;
                return this;
            }

            /**
             * <p>The collection rate that is set based on the trace query feature. You can add a trace ID to a gateway to use the trace query feature of EDAS.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder collectRate(Integer collectRate) {
                this.collectRate = collectRate;
                return this;
            }

            /**
             * <p>The path to be accessed.</p>
             * 
             * <strong>example:</strong>
             * <p>/foo/bar</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The path type that determines how a path is matched.</p>
             * <ul>
             * <li>ImplementationSpecific (default)</li>
             * <li>Exact</li>
             * <li>Prefix</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ImplementationSpecific</p>
             */
            public Builder pathType(String pathType) {
                this.pathType = pathType;
                return this;
            }

            /**
             * <p>The state of the Ingress. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The Ingress works as expected.</li>
             * <li><strong>ServiceNotFound</strong>: The backend Service does not exist.</li>
             * <li><strong>InvalidServicePort</strong>: The Service port is invalid.</li>
             * <li><strong>NotManagedService</strong>: The Service is not managed by EDAS.</li>
             * <li><strong>Unknown</strong>: An unknown error occurred.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
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
    /**
     * 
     * {@link ListK8sIngressRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListK8sIngressRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableTls")
        private Boolean enableTls;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private java.util.List<Paths> paths;

        @com.aliyun.core.annotation.NameInMap("SecretName")
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
        public java.util.List<Paths> getPaths() {
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
            private java.util.List<Paths> paths; 
            private String secretName; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.enableTls = model.enableTls;
                this.host = model.host;
                this.paths = model.paths;
                this.secretName = model.secretName;
            } 

            /**
             * <p>Indicates whether TLS is enabled. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableTls(Boolean enableTls) {
                this.enableTls = enableTls;
                return this;
            }

            /**
             * <p>The domain name to be accessed.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The paths to be accessed.</p>
             */
            public Builder paths(java.util.List<Paths> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>The name of the Secret that stores the Transport Layer Security (TLS) certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>my-secret</p>
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
    /**
     * 
     * {@link ListK8sIngressRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListK8sIngressRulesResponseBody</p>
     */
    public static class IngressConfs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlbId")
        private String albId;

        @com.aliyun.core.annotation.NameInMap("Annotations")
        private String annotations;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DashboardUrl")
        private String dashboardUrl;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("IngressType")
        private String ingressType;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("MseGatewayId")
        private String mseGatewayId;

        @com.aliyun.core.annotation.NameInMap("MseGatewayName")
        private String mseGatewayName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("OfficalBasicUrl")
        private String officalBasicUrl;

        @com.aliyun.core.annotation.NameInMap("OfficalRequestUrl")
        private String officalRequestUrl;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("SslRedirect")
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
        public java.util.List<Rules> getRules() {
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
            private java.util.List<Rules> rules; 
            private Boolean sslRedirect; 

            private Builder() {
            } 

            private Builder(IngressConfs model) {
                this.albId = model.albId;
                this.annotations = model.annotations;
                this.creationTime = model.creationTime;
                this.dashboardUrl = model.dashboardUrl;
                this.endpoint = model.endpoint;
                this.ingressType = model.ingressType;
                this.labels = model.labels;
                this.mseGatewayId = model.mseGatewayId;
                this.mseGatewayName = model.mseGatewayName;
                this.name = model.name;
                this.namespace = model.namespace;
                this.officalBasicUrl = model.officalBasicUrl;
                this.officalRequestUrl = model.officalRequestUrl;
                this.rules = model.rules;
                this.sslRedirect = model.sslRedirect;
            } 

            /**
             * <p>The ID of the ALB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>alb-5sde0tq62r********</p>
             */
            public Builder albId(String albId) {
                this.albId = albId;
                return this;
            }

            /**
             * <p>The annotations.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;test-annotation&quot;:&quot;test-annotation-value&quot;}</p>
             */
            public Builder annotations(String annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * <p>The time when the Ingress was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-27 20:16:52</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The monitoring URL of the Ingress.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://grafana.console.aliyun.com/d/10xxxx/ingress">http://grafana.console.aliyun.com/d/10xxxx/ingress</a></p>
             */
            public Builder dashboardUrl(String dashboardUrl) {
                this.dashboardUrl = dashboardUrl;
                return this;
            }

            /**
             * <p>The IP address of the Ingress.</p>
             * 
             * <strong>example:</strong>
             * <p>47.11x.xx.xx</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The Ingress type. Valid values:</p>
             * <ul>
             * <li><strong>NginxIngress</strong>: NGINX Ingress controller</li>
             * <li><strong>AlbIngress</strong>: ALB Ingress controller</li>
             * </ul>
             * <p>Default value: NginxIngress.</p>
             * 
             * <strong>example:</strong>
             * <p>NginxIngress</p>
             */
            public Builder ingressType(String ingressType) {
                this.ingressType = ingressType;
                return this;
            }

            /**
             * <p>The tags.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;test-label&quot;: &quot;test-labels&quot;}</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The ID of the MSE gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-xxxxxxxx</p>
             */
            public Builder mseGatewayId(String mseGatewayId) {
                this.mseGatewayId = mseGatewayId;
                return this;
            }

            /**
             * <p>The name of the MSE gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-test-name</p>
             */
            public Builder mseGatewayName(String mseGatewayName) {
                this.mseGatewayName = mseGatewayName;
                return this;
            }

            /**
             * <p>The Ingress name.</p>
             * 
             * <strong>example:</strong>
             * <p>my-ingress</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Kubernetes namespace to which the Ingress belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The URL used for basic monitoring of the open source version.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://g.console.aliyun.com/d/xxxxxx/nginx-ingress-dashboard-official">https://g.console.aliyun.com/d/xxxxxx/nginx-ingress-dashboard-official</a></p>
             */
            public Builder officalBasicUrl(String officalBasicUrl) {
                this.officalBasicUrl = officalBasicUrl;
                return this;
            }

            /**
             * <p>The URL used for request performance monitoring of the open source version.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://g.console.aliyun.com/d/xxxxxx/request-handling-performance-official">https://g.console.aliyun.com/d/xxxxxx/request-handling-performance-official</a></p>
             */
            public Builder officalRequestUrl(String officalRequestUrl) {
                this.officalRequestUrl = officalRequestUrl;
                return this;
            }

            /**
             * <p>The routing rules.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>Indicates whether SSL redirection is enabled. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link ListK8sIngressRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListK8sIngressRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("IngressConfs")
        private java.util.List<IngressConfs> ingressConfs;

        @com.aliyun.core.annotation.NameInMap("RegionId")
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
        public java.util.List<IngressConfs> getIngressConfs() {
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
            private java.util.List<IngressConfs> ingressConfs; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.ingressConfs = model.ingressConfs;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5b2b4ab4-efbc-4a81-9c45-a5942881****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>my-dev-cluster</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The Ingresses.</p>
             */
            public Builder ingressConfs(java.util.List<IngressConfs> ingressConfs) {
                this.ingressConfs = ingressConfs;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
