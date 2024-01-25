// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackendInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackendInfoResponseBody</p>
 */
public class DescribeBackendInfoResponseBody extends TeaModel {
    @NameInMap("BackendInfo")
    private BackendInfo backendInfo;

    @NameInMap("RequestId")
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

        /**
         * The information about the backend service.
         */
        public Builder backendInfo(BackendInfo backendInfo) {
            this.backendInfo = backendInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackendInfoResponseBody build() {
            return new DescribeBackendInfoResponseBody(this);
        } 

    } 

    public static class NacosConfig extends TeaModel {
        @NameInMap("AccessKey")
        private String accessKey;

        @NameInMap("AuthType")
        private String authType;

        @NameInMap("Clusters")
        private String clusters;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Password")
        private String password;

        @NameInMap("SecretKey")
        private String secretKey;

        @NameInMap("ServerAddress")
        private String serverAddress;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("UserName")
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

            /**
             * The AccessKey of the RAM user that has the resource management permissions on Microservices Engine (MSE).
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * The authentication method.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * The name of the cluster to which the microservice belongs.
             */
            public Builder clusters(String clusters) {
                this.clusters = clusters;
                return this;
            }

            /**
             * The name of the group to which the microservice that is registered with Nacos belongs.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The ID of the namespace where the microservice that is registered with Nacos resides.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * The SecretKey of the RAM user that has the resource management permissions on MSE.
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * The Nacos service address.
             */
            public Builder serverAddress(String serverAddress) {
                this.serverAddress = serverAddress;
                return this;
            }

            /**
             * The microservice name.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The username.
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
    public static class ZookeeperConfig extends TeaModel {
        @NameInMap("ConnectString")
        private String connectString;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("ServiceName")
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

            /**
             * ConnectString.
             */
            public Builder connectString(String connectString) {
                this.connectString = connectString;
                return this;
            }

            /**
             * The ID of the namespace where the microservice that is registered with Nacos resides.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The microservice name.
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
    public static class DiscoveryConfig extends TeaModel {
        @NameInMap("NacosConfig")
        private NacosConfig nacosConfig;

        @NameInMap("RcType")
        private String rcType;

        @NameInMap("ZookeeperConfig")
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

            /**
             * The Nacos configurations.
             */
            public Builder nacosConfig(NacosConfig nacosConfig) {
                this.nacosConfig = nacosConfig;
                return this;
            }

            /**
             * The registry type.
             */
            public Builder rcType(String rcType) {
                this.rcType = rcType;
                return this;
            }

            /**
             * ZookeeperConfig.
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
    public static class EdasConfig extends TeaModel {
        @NameInMap("EdasAppId")
        private String edasAppId;

        @NameInMap("MicroserviceNamespace")
        private String microserviceNamespace;

        @NameInMap("MicroserviceNamespaceId")
        private String microserviceNamespaceId;

        @NameInMap("MicroserviceNamespaceName")
        private String microserviceNamespaceName;

        @NameInMap("MseInstanceId")
        private String mseInstanceId;

        @NameInMap("RegistryType")
        private String registryType;

        @NameInMap("ServiceName")
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

            /**
             * EdasAppId.
             */
            public Builder edasAppId(String edasAppId) {
                this.edasAppId = edasAppId;
                return this;
            }

            /**
             * MicroserviceNamespace.
             */
            public Builder microserviceNamespace(String microserviceNamespace) {
                this.microserviceNamespace = microserviceNamespace;
                return this;
            }

            /**
             * MicroserviceNamespaceId.
             */
            public Builder microserviceNamespaceId(String microserviceNamespaceId) {
                this.microserviceNamespaceId = microserviceNamespaceId;
                return this;
            }

            /**
             * MicroserviceNamespaceName.
             */
            public Builder microserviceNamespaceName(String microserviceNamespaceName) {
                this.microserviceNamespaceName = microserviceNamespaceName;
                return this;
            }

            /**
             * MseInstanceId.
             */
            public Builder mseInstanceId(String mseInstanceId) {
                this.mseInstanceId = mseInstanceId;
                return this;
            }

            /**
             * RegistryType.
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * The microservice name.
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
    public static class EventBridgeConfig extends TeaModel {
        @NameInMap("EventBridgeRegionId")
        private String eventBridgeRegionId;

        @NameInMap("EventBus")
        private String eventBus;

        @NameInMap("EventSource")
        private String eventSource;

        @NameInMap("RoleArn")
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

            /**
             * The region ID of the event bus in EventBridge.
             */
            public Builder eventBridgeRegionId(String eventBridgeRegionId) {
                this.eventBridgeRegionId = eventBridgeRegionId;
                return this;
            }

            /**
             * The event bus.
             */
            public Builder eventBus(String eventBus) {
                this.eventBus = eventBus;
                return this;
            }

            /**
             * The event source.
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * The ARN of the RAM role to be assumed by API Gateway to access EventBridge.
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
    public static class FunctionComputeConfig extends TeaModel {
        @NameInMap("FcBaseUrl")
        private String fcBaseUrl;

        @NameInMap("FcRegionId")
        private String fcRegionId;

        @NameInMap("FcType")
        private String fcType;

        @NameInMap("FunctionName")
        private String functionName;

        @NameInMap("OnlyBusinessPath")
        private Boolean onlyBusinessPath;

        @NameInMap("Qualifier")
        private String qualifier;

        @NameInMap("RoleArn")
        private String roleArn;

        @NameInMap("ServiceName")
        private String serviceName;

        private FunctionComputeConfig(Builder builder) {
            this.fcBaseUrl = builder.fcBaseUrl;
            this.fcRegionId = builder.fcRegionId;
            this.fcType = builder.fcType;
            this.functionName = builder.functionName;
            this.onlyBusinessPath = builder.onlyBusinessPath;
            this.qualifier = builder.qualifier;
            this.roleArn = builder.roleArn;
            this.serviceName = builder.serviceName;
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

        public static final class Builder {
            private String fcBaseUrl; 
            private String fcRegionId; 
            private String fcType; 
            private String functionName; 
            private Boolean onlyBusinessPath; 
            private String qualifier; 
            private String roleArn; 
            private String serviceName; 

            /**
             * The root path of the Function Compute service.
             */
            public Builder fcBaseUrl(String fcBaseUrl) {
                this.fcBaseUrl = fcBaseUrl;
                return this;
            }

            /**
             * The region ID of the Function Compute service.
             */
            public Builder fcRegionId(String fcRegionId) {
                this.fcRegionId = fcRegionId;
                return this;
            }

            /**
             * The type of the service in Function Compute.
             */
            public Builder fcType(String fcType) {
                this.fcType = fcType;
                return this;
            }

            /**
             * The function name that is defined in Function Compute.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * Indicates whether the backend service receives only the service path.
             */
            public Builder onlyBusinessPath(Boolean onlyBusinessPath) {
                this.onlyBusinessPath = onlyBusinessPath;
                return this;
            }

            /**
             * The alias of the function.
             */
            public Builder qualifier(String qualifier) {
                this.qualifier = qualifier;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the RAM role that is assumed by API Gateway to access Function Compute.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * The service name that is defined in Function Compute.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public FunctionComputeConfig build() {
                return new FunctionComputeConfig(this);
            } 

        } 

    }
    public static class MockHeaders extends TeaModel {
        @NameInMap("HeaderName")
        private String headerName;

        @NameInMap("HeaderValue")
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

            /**
             * The name of the header parameter.
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * The value of the header parameter.
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
    public static class MockConfig extends TeaModel {
        @NameInMap("MockHeaders")
        private java.util.List < MockHeaders> mockHeaders;

        @NameInMap("MockResult")
        private String mockResult;

        @NameInMap("MockStatusCode")
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
        public java.util.List < MockHeaders> getMockHeaders() {
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
            private java.util.List < MockHeaders> mockHeaders; 
            private String mockResult; 
            private String mockStatusCode; 

            /**
             * The header returned for service mocking.
             */
            public Builder mockHeaders(java.util.List < MockHeaders> mockHeaders) {
                this.mockHeaders = mockHeaders;
                return this;
            }

            /**
             * The result returned for service mocking.
             */
            public Builder mockResult(String mockResult) {
                this.mockResult = mockResult;
                return this;
            }

            /**
             * The status code that is returned for service mocking.
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
    public static class OssConfig extends TeaModel {
        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("OssRegionId")
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

            /**
             * The name of the OSS bucket.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * The region ID of the OSS bucket.
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
    public static class VpcConfig extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Port")
        private Long port;

        @NameInMap("VpcAccessId")
        private String vpcAccessId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcScheme")
        private String vpcScheme;

        @NameInMap("VpcTargetHostName")
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

            /**
             * The ID of the Elastic Compute Service (ECS) or Server Load Balancer (SLB) instance in the VPC.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the VPC configuration.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The port number that corresponds to the instance.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the VPC access authorization.
             */
            public Builder vpcAccessId(String vpcAccessId) {
                this.vpcAccessId = vpcAccessId;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * Indicates whether HTTP or HTTPS is used.
             */
            public Builder vpcScheme(String vpcScheme) {
                this.vpcScheme = vpcScheme;
                return this;
            }

            /**
             * The host of the backend service.
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
    public static class BackendConfig extends TeaModel {
        @NameInMap("DiscoveryConfig")
        private DiscoveryConfig discoveryConfig;

        @NameInMap("EdasConfig")
        private EdasConfig edasConfig;

        @NameInMap("EventBridgeConfig")
        private EventBridgeConfig eventBridgeConfig;

        @NameInMap("FunctionComputeConfig")
        private FunctionComputeConfig functionComputeConfig;

        @NameInMap("HttpTargetHostName")
        private String httpTargetHostName;

        @NameInMap("MockConfig")
        private MockConfig mockConfig;

        @NameInMap("OssConfig")
        private OssConfig ossConfig;

        @NameInMap("ServiceAddress")
        private String serviceAddress;

        @NameInMap("ServiceTimeout")
        private Integer serviceTimeout;

        @NameInMap("Type")
        private String type;

        @NameInMap("VpcConfig")
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

            /**
             * The information about the backend service whose type is Service Discovery.
             */
            public Builder discoveryConfig(DiscoveryConfig discoveryConfig) {
                this.discoveryConfig = discoveryConfig;
                return this;
            }

            /**
             * EdasConfig.
             */
            public Builder edasConfig(EdasConfig edasConfig) {
                this.edasConfig = edasConfig;
                return this;
            }

            /**
             * The information about the backend service whose type is EventBridge.
             */
            public Builder eventBridgeConfig(EventBridgeConfig eventBridgeConfig) {
                this.eventBridgeConfig = eventBridgeConfig;
                return this;
            }

            /**
             * The information about the backend service whose type is Function Compute.
             */
            public Builder functionComputeConfig(FunctionComputeConfig functionComputeConfig) {
                this.functionComputeConfig = functionComputeConfig;
                return this;
            }

            /**
             * The host of the backend service.
             */
            public Builder httpTargetHostName(String httpTargetHostName) {
                this.httpTargetHostName = httpTargetHostName;
                return this;
            }

            /**
             * The information about the backend service whose type is Mock.
             */
            public Builder mockConfig(MockConfig mockConfig) {
                this.mockConfig = mockConfig;
                return this;
            }

            /**
             * The information about the backend service whose type is Object Storage Service (OSS).
             */
            public Builder ossConfig(OssConfig ossConfig) {
                this.ossConfig = ossConfig;
                return this;
            }

            /**
             * The URL of the backend service.
             */
            public Builder serviceAddress(String serviceAddress) {
                this.serviceAddress = serviceAddress;
                return this;
            }

            /**
             * ServiceTimeout.
             */
            public Builder serviceTimeout(Integer serviceTimeout) {
                this.serviceTimeout = serviceTimeout;
                return this;
            }

            /**
             * The type of the backend service.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The information about the virtual private cloud (VPC). This parameter is available only for backend services whose type is VPC.
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
    public static class BackendModels extends TeaModel {
        @NameInMap("BackendConfig")
        private BackendConfig backendConfig;

        @NameInMap("BackendModelId")
        private String backendModelId;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("StageModeId")
        private String stageModeId;

        @NameInMap("StageName")
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

            /**
             * The backend service configurations.
             */
            public Builder backendConfig(BackendConfig backendConfig) {
                this.backendConfig = backendConfig;
                return this;
            }

            /**
             * The ID of the backend service in the environment.
             */
            public Builder backendModelId(String backendModelId) {
                this.backendModelId = backendModelId;
                return this;
            }

            /**
             * The description of the backend service.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the backend service was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the backend service was modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the environment.
             */
            public Builder stageModeId(String stageModeId) {
                this.stageModeId = stageModeId;
                return this;
            }

            /**
             * The environment name.
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
    public static class BackendInfo extends TeaModel {
        @NameInMap("BackendId")
        private String backendId;

        @NameInMap("BackendModels")
        private java.util.List < BackendModels> backendModels;

        @NameInMap("BackendName")
        private String backendName;

        @NameInMap("BackendType")
        private String backendType;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ModifiedTime")
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
        public java.util.List < BackendModels> getBackendModels() {
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
            private java.util.List < BackendModels> backendModels; 
            private String backendName; 
            private String backendType; 
            private String createdTime; 
            private String description; 
            private String modifiedTime; 

            /**
             * The ID of the backend service.
             */
            public Builder backendId(String backendId) {
                this.backendId = backendId;
                return this;
            }

            /**
             * The configurations of the backend service in the environment.
             */
            public Builder backendModels(java.util.List < BackendModels> backendModels) {
                this.backendModels = backendModels;
                return this;
            }

            /**
             * The name of the backend service.
             */
            public Builder backendName(String backendName) {
                this.backendName = backendName;
                return this;
            }

            /**
             * The type of the backend service.
             */
            public Builder backendType(String backendType) {
                this.backendType = backendType;
                return this;
            }

            /**
             * The time when the backend service was created.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The description of the backend service.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the backend service was modified.
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
