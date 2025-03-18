// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeBackendInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackendInfoResponseBody</p>
 */
public class DescribeBackendInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackendInfo")
    private BackendInfo backendInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBackendInfoResponseBody(Builder builder) {
        this.backendInfo = builder.backendInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackendInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backendInfo
     */
    public BackendInfo getBackendInfo() {
        return this.backendInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BackendInfo backendInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeBackendInfoResponseBody model) {
            this.backendInfo = model.backendInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the backend service.</p>
         */
        public Builder backendInfo(BackendInfo backendInfo) {
            this.backendInfo = backendInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0AA90E87-3506-5AA6-AFFB-A4D53B4F6231</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackendInfoResponseBody build() {
            return new DescribeBackendInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackendInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackendInfoResponseBody</p>
     */
    public static class NacosConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKey")
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("Clusters")
        private String clusters;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("SecretKey")
        private String secretKey;

        @com.aliyun.core.annotation.NameInMap("ServerAddress")
        private String serverAddress;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private NacosConfig(Builder builder) {
            this.accessKey = builder.accessKey;
            this.authType = builder.authType;
            this.clusters = builder.clusters;
            this.groupName = builder.groupName;
            this.namespace = builder.namespace;
            this.password = builder.password;
            this.secretKey = builder.secretKey;
            this.serverAddress = builder.serverAddress;
            this.serviceName = builder.serviceName;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NacosConfig create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return clusters
         */
        public String getClusters() {
            return this.clusters;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return secretKey
         */
        public String getSecretKey() {
            return this.secretKey;
        }

        /**
         * @return serverAddress
         */
        public String getServerAddress() {
            return this.serverAddress;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String accessKey; 
            private String authType; 
            private String clusters; 
            private String groupName; 
            private String namespace; 
            private String password; 
            private String secretKey; 
            private String serverAddress; 
            private String serviceName; 
            private String userName; 

            private Builder() {
            } 

            private Builder(NacosConfig model) {
                this.accessKey = model.accessKey;
                this.authType = model.authType;
                this.clusters = model.clusters;
                this.groupName = model.groupName;
                this.namespace = model.namespace;
                this.password = model.password;
                this.secretKey = model.secretKey;
                this.serverAddress = model.serverAddress;
                this.serviceName = model.serviceName;
                this.userName = model.userName;
            } 

            /**
             * <p>The AccessKey of the RAM user that has the resource management permissions on Microservices Engine (MSE).</p>
             * 
             * <strong>example:</strong>
             * <p>A5FIDxxxxxx</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>The authentication method.</p>
             * 
             * <strong>example:</strong>
             * <p>PASSWORD</p>
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>The name of the cluster to which the microservice belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster1</p>
             */
            public Builder clusters(String clusters) {
                this.clusters = clusters;
                return this;
            }

            /**
             * <p>The name of the group to which the microservice that is registered with Nacos belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT_GROUP</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The ID of the namespace where the microservice that is registered with Nacos resides.</p>
             * 
             * <strong>example:</strong>
             * <p>public</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The password.</p>
             * 
             * <strong>example:</strong>
             * <p>password</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The SecretKey of the RAM user that has the resource management permissions on MSE.</p>
             * 
             * <strong>example:</strong>
             * <p>dl5loxxxxxx</p>
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * <p>The Nacos service address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://1xx.2xx.3xx.4xx:8848">http://1xx.2xx.3xx.4xx:8848</a></p>
             */
            public Builder serverAddress(String serverAddress) {
                this.serverAddress = serverAddress;
                return this;
            }

            /**
             * <p>The microservice name.</p>
             * 
             * <strong>example:</strong>
             * <p>service-provider</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>username</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public NacosConfig build() {
                return new NacosConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackendInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackendInfoResponseBody</p>
     */
    public static class ZookeeperConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectString")
        private String connectString;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        private ZookeeperConfig(Builder builder) {
            this.connectString = builder.connectString;
            this.namespace = builder.namespace;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZookeeperConfig create() {
            return builder().build();
        }

        /**
         * @return connectString
         */
        public String getConnectString() {
            return this.connectString;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String connectString; 
            private String namespace; 
            private String serviceName; 

            private Builder() {
            } 

            private Builder(ZookeeperConfig model) {
                this.connectString = model.connectString;
                this.namespace = model.namespace;
                this.serviceName = model.serviceName;
            } 

            /**
             * <p>The connection URL of the ZooKeeper server.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://192.168.1.xxx:2181">http://192.168.1.xxx:2181</a></p>
             */
            public Builder connectString(String connectString) {
                this.connectString = connectString;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>provider</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>Service name</p>
             * 
             * <strong>example:</strong>
             * <p>service</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public ZookeeperConfig build() {
                return new ZookeeperConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackendInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackendInfoResponseBody</p>
     */
    public static class DiscoveryConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NacosConfig")
        private NacosConfig nacosConfig;

        @com.aliyun.core.annotation.NameInMap("RcType")
        private String rcType;

        @com.aliyun.core.annotation.NameInMap("ZookeeperConfig")
        private ZookeeperConfig zookeeperConfig;

        private DiscoveryConfig(Builder builder) {
            this.nacosConfig = builder.nacosConfig;
            this.rcType = builder.rcType;
            this.zookeeperConfig = builder.zookeeperConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiscoveryConfig create() {
            return builder().build();
        }

        /**
         * @return nacosConfig
         */
        public NacosConfig getNacosConfig() {
            return this.nacosConfig;
        }

        /**
         * @return rcType
         */
        public String getRcType() {
            return this.rcType;
        }

        /**
         * @return zookeeperConfig
         */
        public ZookeeperConfig getZookeeperConfig() {
            return this.zookeeperConfig;
        }

        public static final class Builder {
            private NacosConfig nacosConfig; 
            private String rcType; 
            private ZookeeperConfig zookeeperConfig; 

            private Builder() {
            } 

            private Builder(DiscoveryConfig model) {
                this.nacosConfig = model.nacosConfig;
                this.rcType = model.rcType;
                this.zookeeperConfig = model.zookeeperConfig;
            } 

            /**
             * <p>The Nacos configurations.</p>
             */
            public Builder nacosConfig(NacosConfig nacosConfig) {
                this.nacosConfig = nacosConfig;
                return this;
            }

            /**
             * <p>The registry type.</p>
             * 
             * <strong>example:</strong>
             * <p>NACOS</p>
             */
            public Builder rcType(String rcType) {
                this.rcType = rcType;
                return this;
            }

            /**
             * <p>The ZooKeeper configuration.</p>
             */
            public Builder zookeeperConfig(ZookeeperConfig zookeeperConfig) {
                this.zookeeperConfig = zookeeperConfig;
                return this;
            }

            public DiscoveryConfig build() {
                return new DiscoveryConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackendInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackendInfoResponseBody</p>
     */
    public static class EdasConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EdasAppId")
        private String edasAppId;

        @com.aliyun.core.annotation.NameInMap("MicroserviceNamespace")
        private String microserviceNamespace;

        @com.aliyun.core.annotation.NameInMap("MicroserviceNamespaceId")
        private String microserviceNamespaceId;

        @com.aliyun.core.annotation.NameInMap("MicroserviceNamespaceName")
        private String microserviceNamespaceName;

        @com.aliyun.core.annotation.NameInMap("MseInstanceId")
        private String mseInstanceId;

        @com.aliyun.core.annotation.NameInMap("RegistryType")
        private String registryType;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        private EdasConfig(Builder builder) {
            this.edasAppId = builder.edasAppId;
            this.microserviceNamespace = builder.microserviceNamespace;
            this.microserviceNamespaceId = builder.microserviceNamespaceId;
            this.microserviceNamespaceName = builder.microserviceNamespaceName;
            this.mseInstanceId = builder.mseInstanceId;
            this.registryType = builder.registryType;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EdasConfig create() {
            return builder().build();
        }

        /**
         * @return edasAppId
         */
        public String getEdasAppId() {
            return this.edasAppId;
        }

        /**
         * @return microserviceNamespace
         */
        public String getMicroserviceNamespace() {
            return this.microserviceNamespace;
        }

        /**
         * @return microserviceNamespaceId
         */
        public String getMicroserviceNamespaceId() {
            return this.microserviceNamespaceId;
        }

        /**
         * @return microserviceNamespaceName
         */
        public String getMicroserviceNamespaceName() {
            return this.microserviceNamespaceName;
        }

        /**
         * @return mseInstanceId
         */
        public String getMseInstanceId() {
            return this.mseInstanceId;
        }

        /**
         * @return registryType
         */
        public String getRegistryType() {
            return this.registryType;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String edasAppId; 
            private String microserviceNamespace; 
            private String microserviceNamespaceId; 
            private String microserviceNamespaceName; 
            private String mseInstanceId; 
            private String registryType; 
            private String serviceName; 

            private Builder() {
            } 

            private Builder(EdasConfig model) {
                this.edasAppId = model.edasAppId;
                this.microserviceNamespace = model.microserviceNamespace;
                this.microserviceNamespaceId = model.microserviceNamespaceId;
                this.microserviceNamespaceName = model.microserviceNamespaceName;
                this.mseInstanceId = model.mseInstanceId;
                this.registryType = model.registryType;
                this.serviceName = model.serviceName;
            } 

            /**
             * <p>The EDAS application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6cd0c599-dxxx-496d-b3d5-6a71c657xxxxx</p>
             */
            public Builder edasAppId(String edasAppId) {
                this.edasAppId = edasAppId;
                return this;
            }

            /**
             * <p>The ID of the microservices namespace in EDAS.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou:edasNacos</p>
             */
            public Builder microserviceNamespace(String microserviceNamespace) {
                this.microserviceNamespace = microserviceNamespace;
                return this;
            }

            /**
             * <p>The ID of the microservices namespace in EDAS.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou:edasNacos</p>
             */
            public Builder microserviceNamespaceId(String microserviceNamespaceId) {
                this.microserviceNamespaceId = microserviceNamespaceId;
                return this;
            }

            /**
             * <p>The name of the microservices namespace in EDAS.</p>
             * 
             * <strong>example:</strong>
             * <p>Edas-Nacos</p>
             */
            public Builder microserviceNamespaceName(String microserviceNamespaceName) {
                this.microserviceNamespaceName = microserviceNamespaceName;
                return this;
            }

            /**
             * <p>The MSE instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-cn-jia3n1rxxxx</p>
             */
            public Builder mseInstanceId(String mseInstanceId) {
                this.mseInstanceId = mseInstanceId;
                return this;
            }

            /**
             * <p>The registration type.</p>
             * 
             * <strong>example:</strong>
             * <p>EDAS</p>
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>service</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public EdasConfig build() {
                return new EdasConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackendInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackendInfoResponseBody</p>
     */
    public static class EventBridgeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventBridgeRegionId")
        private String eventBridgeRegionId;

        @com.aliyun.core.annotation.NameInMap("EventBus")
        private String eventBus;

        @com.aliyun.core.annotation.NameInMap("EventSource")
        private String eventSource;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        private EventBridgeConfig(Builder builder) {
            this.eventBridgeRegionId = builder.eventBridgeRegionId;
            this.eventBus = builder.eventBus;
            this.eventSource = builder.eventSource;
            this.roleArn = builder.roleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventBridgeConfig create() {
            return builder().build();
        }

        /**
         * @return eventBridgeRegionId
         */
        public String getEventBridgeRegionId() {
            return this.eventBridgeRegionId;
        }

        /**
         * @return eventBus
         */
        public String getEventBus() {
            return this.eventBus;
        }

        /**
         * @return eventSource
         */
        public String getEventSource() {
            return this.eventSource;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        public static final class Builder {
            private String eventBridgeRegionId; 
            private String eventBus; 
            private String eventSource; 
            private String roleArn; 

            private Builder() {
            } 

            private Builder(EventBridgeConfig model) {
                this.eventBridgeRegionId = model.eventBridgeRegionId;
                this.eventBus = model.eventBus;
                this.eventSource = model.eventSource;
                this.roleArn = model.roleArn;
            } 

            /**
             * <p>The region ID of the event bus in EventBridge.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder eventBridgeRegionId(String eventBridgeRegionId) {
                this.eventBridgeRegionId = eventBridgeRegionId;
                return this;
            }

            /**
             * <p>The event bus.</p>
             * 
             * <strong>example:</strong>
             * <p>testBus</p>
             */
            public Builder eventBus(String eventBus) {
                this.eventBus = eventBus;
                return this;
            }

            /**
             * <p>The event source.</p>
             * 
             * <strong>example:</strong>
             * <p>dds_driver</p>
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * <p>The ARN of the RAM role to be assumed by API Gateway to access EventBridge.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1975133748561***:role/aliyunserviceroleforiotlogexport</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            public EventBridgeConfig build() {
                return new EventBridgeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackendInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackendInfoResponseBody</p>
     */
    public static class FunctionComputeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FcBaseUrl")
        private String fcBaseUrl;

        @com.aliyun.core.annotation.NameInMap("FcRegionId")
        private String fcRegionId;

        @com.aliyun.core.annotation.NameInMap("FcType")
        private String fcType;

        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("OnlyBusinessPath")
        private Boolean onlyBusinessPath;

        @com.aliyun.core.annotation.NameInMap("Qualifier")
        private String qualifier;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("TriggerName")
        private String triggerName;

        private FunctionComputeConfig(Builder builder) {
            this.fcBaseUrl = builder.fcBaseUrl;
            this.fcRegionId = builder.fcRegionId;
            this.fcType = builder.fcType;
            this.functionName = builder.functionName;
            this.onlyBusinessPath = builder.onlyBusinessPath;
            this.qualifier = builder.qualifier;
            this.roleArn = builder.roleArn;
            this.serviceName = builder.serviceName;
            this.triggerName = builder.triggerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionComputeConfig create() {
            return builder().build();
        }

        /**
         * @return fcBaseUrl
         */
        public String getFcBaseUrl() {
            return this.fcBaseUrl;
        }

        /**
         * @return fcRegionId
         */
        public String getFcRegionId() {
            return this.fcRegionId;
        }

        /**
         * @return fcType
         */
        public String getFcType() {
            return this.fcType;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return onlyBusinessPath
         */
        public Boolean getOnlyBusinessPath() {
            return this.onlyBusinessPath;
        }

        /**
         * @return qualifier
         */
        public String getQualifier() {
            return this.qualifier;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return triggerName
         */
        public String getTriggerName() {
            return this.triggerName;
        }

        public static final class Builder {
            private String fcBaseUrl; 
            private String fcRegionId; 
            private String fcType; 
            private String functionName; 
            private Boolean onlyBusinessPath; 
            private String qualifier; 
            private String roleArn; 
            private String serviceName; 
            private String triggerName; 

            private Builder() {
            } 

            private Builder(FunctionComputeConfig model) {
                this.fcBaseUrl = model.fcBaseUrl;
                this.fcRegionId = model.fcRegionId;
                this.fcType = model.fcType;
                this.functionName = model.functionName;
                this.onlyBusinessPath = model.onlyBusinessPath;
                this.qualifier = model.qualifier;
                this.roleArn = model.roleArn;
                this.serviceName = model.serviceName;
                this.triggerName = model.triggerName;
            } 

            /**
             * <p>The root path of the Function Compute service.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://t*******.ap-*****.fcapp.run/">https://t*******.ap-*****.fcapp.run/</a></p>
             */
            public Builder fcBaseUrl(String fcBaseUrl) {
                this.fcBaseUrl = fcBaseUrl;
                return this;
            }

            /**
             * <p>The region ID of the Function Compute service.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder fcRegionId(String fcRegionId) {
                this.fcRegionId = fcRegionId;
                return this;
            }

            /**
             * <p>The type of the service in Function Compute.</p>
             * 
             * <strong>example:</strong>
             * <p>HttpTrigger</p>
             */
            public Builder fcType(String fcType) {
                this.fcType = fcType;
                return this;
            }

            /**
             * <p>The function name that is defined in Function Compute.</p>
             * 
             * <strong>example:</strong>
             * <p>edge_function</p>
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * <p>Indicates whether the backend service receives only the service path.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder onlyBusinessPath(Boolean onlyBusinessPath) {
                this.onlyBusinessPath = onlyBusinessPath;
                return this;
            }

            /**
             * <p>The alias of the function.</p>
             * 
             * <strong>example:</strong>
             * <p>testQualifier</p>
             */
            public Builder qualifier(String qualifier) {
                this.qualifier = qualifier;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is assumed by API Gateway to access Function Compute.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::31985*:role/aliyunserviceroleforbastionhostpam</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>The service name that is defined in Function Compute.</p>
             * 
             * <strong>example:</strong>
             * <p>myservice</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The name of the trigger.</p>
             * <p>You can specify the TriggerName or TriggerUrl parameter. The TriggerName parameter is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder triggerName(String triggerName) {
                this.triggerName = triggerName;
                return this;
            }

            public FunctionComputeConfig build() {
                return new FunctionComputeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackendInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackendInfoResponseBody</p>
     */
    public static class MockHeaders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeaderName")
        private String headerName;

        @com.aliyun.core.annotation.NameInMap("HeaderValue")
        private String headerValue;

        private MockHeaders(Builder builder) {
            this.headerName = builder.headerName;
            this.headerValue = builder.headerValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MockHeaders create() {
            return builder().build();
        }

        /**
         * @return headerName
         */
        public String getHeaderName() {
            return this.headerName;
        }

        /**
         * @return headerValue
         */
        public String getHeaderValue() {
            return this.headerValue;
        }

        public static final class Builder {
            private String headerName; 
            private String headerValue; 

            private Builder() {
            } 

            private Builder(MockHeaders model) {
                this.headerName = model.headerName;
                this.headerValue = model.headerValue;
            } 

            /**
             * <p>The header name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * <p>The header value.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder headerValue(String headerValue) {
                this.headerValue = headerValue;
                return this;
            }

            public MockHeaders build() {
                return new MockHeaders(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackendInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackendInfoResponseBody</p>
     */
    public static class MockConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MockHeaders")
        private java.util.List<MockHeaders> mockHeaders;

        @com.aliyun.core.annotation.NameInMap("MockResult")
        private String mockResult;

        @com.aliyun.core.annotation.NameInMap("MockStatusCode")
        private String mockStatusCode;

        private MockConfig(Builder builder) {
            this.mockHeaders = builder.mockHeaders;
            this.mockResult = builder.mockResult;
            this.mockStatusCode = builder.mockStatusCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MockConfig create() {
            return builder().build();
        }

        /**
         * @return mockHeaders
         */
        public java.util.List<MockHeaders> getMockHeaders() {
            return this.mockHeaders;
        }

        /**
         * @return mockResult
         */
        public String getMockResult() {
            return this.mockResult;
        }

        /**
         * @return mockStatusCode
         */
        public String getMockStatusCode() {
            return this.mockStatusCode;
        }

        public static final class Builder {
            private java.util.List<MockHeaders> mockHeaders; 
            private String mockResult; 
            private String mockStatusCode; 

            private Builder() {
            } 

            private Builder(MockConfig model) {
                this.mockHeaders = model.mockHeaders;
                this.mockResult = model.mockResult;
                this.mockStatusCode = model.mockStatusCode;
            } 

            /**
             * <p>The header in the mocked response.</p>
             */
            public Builder mockHeaders(java.util.List<MockHeaders> mockHeaders) {
                this.mockHeaders = mockHeaders;
                return this;
            }

            /**
             * <p>The mocked response.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder mockResult(String mockResult) {
                this.mockResult = mockResult;
                return this;
            }

            /**
             * <p>The status code in the mocked response.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder mockStatusCode(String mockStatusCode) {
                this.mockStatusCode = mockStatusCode;
                return this;
            }

            public MockConfig build() {
                return new MockConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackendInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackendInfoResponseBody</p>
     */
    public static class OssConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("OssRegionId")
        private String ossRegionId;

        private OssConfig(Builder builder) {
            this.bucketName = builder.bucketName;
            this.ossRegionId = builder.ossRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssConfig create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return ossRegionId
         */
        public String getOssRegionId() {
            return this.ossRegionId;
        }

        public static final class Builder {
            private String bucketName; 
            private String ossRegionId; 

            private Builder() {
            } 

            private Builder(OssConfig model) {
                this.bucketName = model.bucketName;
                this.ossRegionId = model.ossRegionId;
            } 

            /**
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>my_bucket</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The region ID of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder ossRegionId(String ossRegionId) {
                this.ossRegionId = ossRegionId;
                return this;
            }

            public OssConfig build() {
                return new OssConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackendInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackendInfoResponseBody</p>
     */
    public static class VpcConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Long port;

        @com.aliyun.core.annotation.NameInMap("VpcAccessId")
        private String vpcAccessId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcScheme")
        private String vpcScheme;

        @com.aliyun.core.annotation.NameInMap("VpcTargetHostName")
        private String vpcTargetHostName;

        private VpcConfig(Builder builder) {
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.port = builder.port;
            this.vpcAccessId = builder.vpcAccessId;
            this.vpcId = builder.vpcId;
            this.vpcScheme = builder.vpcScheme;
            this.vpcTargetHostName = builder.vpcTargetHostName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcConfig create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return vpcAccessId
         */
        public String getVpcAccessId() {
            return this.vpcAccessId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcScheme
         */
        public String getVpcScheme() {
            return this.vpcScheme;
        }

        /**
         * @return vpcTargetHostName
         */
        public String getVpcTargetHostName() {
            return this.vpcTargetHostName;
        }

        public static final class Builder {
            private String instanceId; 
            private String name; 
            private Long port; 
            private String vpcAccessId; 
            private String vpcId; 
            private String vpcScheme; 
            private String vpcTargetHostName; 

            private Builder() {
            } 

            private Builder(VpcConfig model) {
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.port = model.port;
                this.vpcAccessId = model.vpcAccessId;
                this.vpcId = model.vpcId;
                this.vpcScheme = model.vpcScheme;
                this.vpcTargetHostName = model.vpcTargetHostName;
            } 

            /**
             * <p>The ID of the Elastic Compute Service (ECS) or Server Load Balancer (SLB) instance in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>i-uf6iaale3gfef9t9cb41</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the VPC configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>dypls-cn-beijing-slb-pre</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The port number that corresponds to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the VPC access authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>2zej3ehuzg9m77kvwnfpn</p>
             */
            public Builder vpcAccessId(String vpcAccessId) {
                this.vpcAccessId = vpcAccessId;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz9v96hqi6d14744sxqmx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>Indicates whether HTTP or HTTPS is used.</p>
             * 
             * <strong>example:</strong>
             * <p>http</p>
             */
            public Builder vpcScheme(String vpcScheme) {
                this.vpcScheme = vpcScheme;
                return this;
            }

            /**
             * <p>The host of the VPC backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>openapi.alipan.com</p>
             */
            public Builder vpcTargetHostName(String vpcTargetHostName) {
                this.vpcTargetHostName = vpcTargetHostName;
                return this;
            }

            public VpcConfig build() {
                return new VpcConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackendInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackendInfoResponseBody</p>
     */
    public static class BackendConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscoveryConfig")
        private DiscoveryConfig discoveryConfig;

        @com.aliyun.core.annotation.NameInMap("EdasConfig")
        private EdasConfig edasConfig;

        @com.aliyun.core.annotation.NameInMap("EventBridgeConfig")
        private EventBridgeConfig eventBridgeConfig;

        @com.aliyun.core.annotation.NameInMap("FunctionComputeConfig")
        private FunctionComputeConfig functionComputeConfig;

        @com.aliyun.core.annotation.NameInMap("HttpTargetHostName")
        private String httpTargetHostName;

        @com.aliyun.core.annotation.NameInMap("MockConfig")
        private MockConfig mockConfig;

        @com.aliyun.core.annotation.NameInMap("OssConfig")
        private OssConfig ossConfig;

        @com.aliyun.core.annotation.NameInMap("ServiceAddress")
        private String serviceAddress;

        @com.aliyun.core.annotation.NameInMap("ServiceTimeout")
        private Integer serviceTimeout;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VpcConfig")
        private VpcConfig vpcConfig;

        private BackendConfig(Builder builder) {
            this.discoveryConfig = builder.discoveryConfig;
            this.edasConfig = builder.edasConfig;
            this.eventBridgeConfig = builder.eventBridgeConfig;
            this.functionComputeConfig = builder.functionComputeConfig;
            this.httpTargetHostName = builder.httpTargetHostName;
            this.mockConfig = builder.mockConfig;
            this.ossConfig = builder.ossConfig;
            this.serviceAddress = builder.serviceAddress;
            this.serviceTimeout = builder.serviceTimeout;
            this.type = builder.type;
            this.vpcConfig = builder.vpcConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendConfig create() {
            return builder().build();
        }

        /**
         * @return discoveryConfig
         */
        public DiscoveryConfig getDiscoveryConfig() {
            return this.discoveryConfig;
        }

        /**
         * @return edasConfig
         */
        public EdasConfig getEdasConfig() {
            return this.edasConfig;
        }

        /**
         * @return eventBridgeConfig
         */
        public EventBridgeConfig getEventBridgeConfig() {
            return this.eventBridgeConfig;
        }

        /**
         * @return functionComputeConfig
         */
        public FunctionComputeConfig getFunctionComputeConfig() {
            return this.functionComputeConfig;
        }

        /**
         * @return httpTargetHostName
         */
        public String getHttpTargetHostName() {
            return this.httpTargetHostName;
        }

        /**
         * @return mockConfig
         */
        public MockConfig getMockConfig() {
            return this.mockConfig;
        }

        /**
         * @return ossConfig
         */
        public OssConfig getOssConfig() {
            return this.ossConfig;
        }

        /**
         * @return serviceAddress
         */
        public String getServiceAddress() {
            return this.serviceAddress;
        }

        /**
         * @return serviceTimeout
         */
        public Integer getServiceTimeout() {
            return this.serviceTimeout;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcConfig
         */
        public VpcConfig getVpcConfig() {
            return this.vpcConfig;
        }

        public static final class Builder {
            private DiscoveryConfig discoveryConfig; 
            private EdasConfig edasConfig; 
            private EventBridgeConfig eventBridgeConfig; 
            private FunctionComputeConfig functionComputeConfig; 
            private String httpTargetHostName; 
            private MockConfig mockConfig; 
            private OssConfig ossConfig; 
            private String serviceAddress; 
            private Integer serviceTimeout; 
            private String type; 
            private VpcConfig vpcConfig; 

            private Builder() {
            } 

            private Builder(BackendConfig model) {
                this.discoveryConfig = model.discoveryConfig;
                this.edasConfig = model.edasConfig;
                this.eventBridgeConfig = model.eventBridgeConfig;
                this.functionComputeConfig = model.functionComputeConfig;
                this.httpTargetHostName = model.httpTargetHostName;
                this.mockConfig = model.mockConfig;
                this.ossConfig = model.ossConfig;
                this.serviceAddress = model.serviceAddress;
                this.serviceTimeout = model.serviceTimeout;
                this.type = model.type;
                this.vpcConfig = model.vpcConfig;
            } 

            /**
             * <p>The information about the backend service when the backend service is of the Service Discovery type.</p>
             */
            public Builder discoveryConfig(DiscoveryConfig discoveryConfig) {
                this.discoveryConfig = discoveryConfig;
                return this;
            }

            /**
             * <p>The EDAS configuration.</p>
             */
            public Builder edasConfig(EdasConfig edasConfig) {
                this.edasConfig = edasConfig;
                return this;
            }

            /**
             * <p>The information about the backend service whose type is EventBridge.</p>
             */
            public Builder eventBridgeConfig(EventBridgeConfig eventBridgeConfig) {
                this.eventBridgeConfig = eventBridgeConfig;
                return this;
            }

            /**
             * <p>The information about the backend service whose type is Function Compute.</p>
             */
            public Builder functionComputeConfig(FunctionComputeConfig functionComputeConfig) {
                this.functionComputeConfig = functionComputeConfig;
                return this;
            }

            /**
             * <p>The host of the HTTP backend service.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.host.com">www.host.com</a></p>
             */
            public Builder httpTargetHostName(String httpTargetHostName) {
                this.httpTargetHostName = httpTargetHostName;
                return this;
            }

            /**
             * <p>The information about the backend service when the backend service is of the Mock type.</p>
             */
            public Builder mockConfig(MockConfig mockConfig) {
                this.mockConfig = mockConfig;
                return this;
            }

            /**
             * <p>The information about the backend service whose type is Object Storage Service (OSS).</p>
             */
            public Builder ossConfig(OssConfig ossConfig) {
                this.ossConfig = ossConfig;
                return this;
            }

            /**
             * <p>The URL of the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.1</p>
             */
            public Builder serviceAddress(String serviceAddress) {
                this.serviceAddress = serviceAddress;
                return this;
            }

            /**
             * <p>The timeout period of the backend service, in millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder serviceTimeout(Integer serviceTimeout) {
                this.serviceTimeout = serviceTimeout;
                return this;
            }

            /**
             * <p>The type of the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The information about the backend service when the backend service is of the VPC type.</p>
             */
            public Builder vpcConfig(VpcConfig vpcConfig) {
                this.vpcConfig = vpcConfig;
                return this;
            }

            public BackendConfig build() {
                return new BackendConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackendInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackendInfoResponseBody</p>
     */
    public static class BackendModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackendConfig")
        private BackendConfig backendConfig;

        @com.aliyun.core.annotation.NameInMap("BackendModelId")
        private String backendModelId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("StageModeId")
        private String stageModeId;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        private BackendModels(Builder builder) {
            this.backendConfig = builder.backendConfig;
            this.backendModelId = builder.backendModelId;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.stageModeId = builder.stageModeId;
            this.stageName = builder.stageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendModels create() {
            return builder().build();
        }

        /**
         * @return backendConfig
         */
        public BackendConfig getBackendConfig() {
            return this.backendConfig;
        }

        /**
         * @return backendModelId
         */
        public String getBackendModelId() {
            return this.backendModelId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return stageModeId
         */
        public String getStageModeId() {
            return this.stageModeId;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        public static final class Builder {
            private BackendConfig backendConfig; 
            private String backendModelId; 
            private String description; 
            private String gmtCreate; 
            private String gmtModified; 
            private String stageModeId; 
            private String stageName; 

            private Builder() {
            } 

            private Builder(BackendModels model) {
                this.backendConfig = model.backendConfig;
                this.backendModelId = model.backendModelId;
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.stageModeId = model.stageModeId;
                this.stageName = model.stageName;
            } 

            /**
             * <p>The backend service configurations.</p>
             */
            public Builder backendConfig(BackendConfig backendConfig) {
                this.backendConfig = backendConfig;
                return this;
            }

            /**
             * <p>The ID of the backend service in the environment.</p>
             * 
             * <strong>example:</strong>
             * <p>5c4995d08e8b4954b0f326e8e4f2b97d</p>
             */
            public Builder backendModelId(String backendModelId) {
                this.backendModelId = backendModelId;
                return this;
            }

            /**
             * <p>The description of the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>testDvs 1</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the backend service was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-20T03:22:03.000+0000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the backend service was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-20T03:22:03.000+0000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the environment.</p>
             * 
             * <strong>example:</strong>
             * <p>6fc978bb63574146b766863dd7bdf661</p>
             */
            public Builder stageModeId(String stageModeId) {
                this.stageModeId = stageModeId;
                return this;
            }

            /**
             * <p>The environment name.</p>
             * 
             * <strong>example:</strong>
             * <p>RELEASE</p>
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            public BackendModels build() {
                return new BackendModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackendInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackendInfoResponseBody</p>
     */
    public static class BackendInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackendId")
        private String backendId;

        @com.aliyun.core.annotation.NameInMap("BackendModels")
        private java.util.List<BackendModels> backendModels;

        @com.aliyun.core.annotation.NameInMap("BackendName")
        private String backendName;

        @com.aliyun.core.annotation.NameInMap("BackendType")
        private String backendType;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        private BackendInfo(Builder builder) {
            this.backendId = builder.backendId;
            this.backendModels = builder.backendModels;
            this.backendName = builder.backendName;
            this.backendType = builder.backendType;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.modifiedTime = builder.modifiedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendInfo create() {
            return builder().build();
        }

        /**
         * @return backendId
         */
        public String getBackendId() {
            return this.backendId;
        }

        /**
         * @return backendModels
         */
        public java.util.List<BackendModels> getBackendModels() {
            return this.backendModels;
        }

        /**
         * @return backendName
         */
        public String getBackendName() {
            return this.backendName;
        }

        /**
         * @return backendType
         */
        public String getBackendType() {
            return this.backendType;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public static final class Builder {
            private String backendId; 
            private java.util.List<BackendModels> backendModels; 
            private String backendName; 
            private String backendType; 
            private String createdTime; 
            private String description; 
            private String modifiedTime; 

            private Builder() {
            } 

            private Builder(BackendInfo model) {
                this.backendId = model.backendId;
                this.backendModels = model.backendModels;
                this.backendName = model.backendName;
                this.backendType = model.backendType;
                this.createdTime = model.createdTime;
                this.description = model.description;
                this.modifiedTime = model.modifiedTime;
            } 

            /**
             * <p>The ID of the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>6fc978bb63574146b766863dd7bdf661</p>
             */
            public Builder backendId(String backendId) {
                this.backendId = backendId;
                return this;
            }

            /**
             * <p>The configurations of the backend service in the environment.</p>
             */
            public Builder backendModels(java.util.List<BackendModels> backendModels) {
                this.backendModels = backendModels;
                return this;
            }

            /**
             * <p>The name of the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>testoss2</p>
             */
            public Builder backendName(String backendName) {
                this.backendName = backendName;
                return this;
            }

            /**
             * <p>The type of the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder backendType(String backendType) {
                this.backendType = backendType;
                return this;
            }

            /**
             * <p>The time when the backend service was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-22T11:10:46+08:00</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The description of the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the backend service was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-11T15:18:09+08:00</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            public BackendInfo build() {
                return new BackendInfo(this);
            } 

        } 

    }
}
