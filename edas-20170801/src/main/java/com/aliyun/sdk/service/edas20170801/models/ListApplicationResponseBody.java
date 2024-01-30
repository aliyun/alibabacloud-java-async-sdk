// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationResponseBody</p>
 */
public class ListApplicationResponseBody extends TeaModel {
    @NameInMap("ApplicationList")
    private ApplicationList applicationList;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListApplicationResponseBody(Builder builder) {
        this.applicationList = builder.applicationList;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicationList
     */
    public ApplicationList getApplicationList() {
        return this.applicationList;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
        private ApplicationList applicationList; 
        private Integer code; 
        private String message; 
        private String requestId; 

        /**
         * The information about applications.
         */
        public Builder applicationList(ApplicationList applicationList) {
            this.applicationList = applicationList;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListApplicationResponseBody build() {
            return new ListApplicationResponseBody(this);
        } 

    } 

    public static class Application extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("ApplicationType")
        private String applicationType;

        @NameInMap("BuildPackageId")
        private Long buildPackageId;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterType")
        private Integer clusterType;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("ExtSlbIp")
        private String extSlbIp;

        @NameInMap("ExtSlbListenerPort")
        private Integer extSlbListenerPort;

        @NameInMap("Instances")
        private Integer instances;

        @NameInMap("K8sNamespace")
        private String k8sNamespace;

        @NameInMap("Name")
        private String name;

        @NameInMap("NamespaceId")
        private String namespaceId;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("RunningInstanceCount")
        private Integer runningInstanceCount;

        @NameInMap("SlbIp")
        private String slbIp;

        @NameInMap("SlbListenerPort")
        private Integer slbListenerPort;

        @NameInMap("SlbPort")
        private Integer slbPort;

        @NameInMap("State")
        private String state;

        private Application(Builder builder) {
            this.appId = builder.appId;
            this.applicationType = builder.applicationType;
            this.buildPackageId = builder.buildPackageId;
            this.clusterId = builder.clusterId;
            this.clusterType = builder.clusterType;
            this.createTime = builder.createTime;
            this.extSlbIp = builder.extSlbIp;
            this.extSlbListenerPort = builder.extSlbListenerPort;
            this.instances = builder.instances;
            this.k8sNamespace = builder.k8sNamespace;
            this.name = builder.name;
            this.namespaceId = builder.namespaceId;
            this.port = builder.port;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.runningInstanceCount = builder.runningInstanceCount;
            this.slbIp = builder.slbIp;
            this.slbListenerPort = builder.slbListenerPort;
            this.slbPort = builder.slbPort;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return applicationType
         */
        public String getApplicationType() {
            return this.applicationType;
        }

        /**
         * @return buildPackageId
         */
        public Long getBuildPackageId() {
            return this.buildPackageId;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterType
         */
        public Integer getClusterType() {
            return this.clusterType;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return extSlbIp
         */
        public String getExtSlbIp() {
            return this.extSlbIp;
        }

        /**
         * @return extSlbListenerPort
         */
        public Integer getExtSlbListenerPort() {
            return this.extSlbListenerPort;
        }

        /**
         * @return instances
         */
        public Integer getInstances() {
            return this.instances;
        }

        /**
         * @return k8sNamespace
         */
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return runningInstanceCount
         */
        public Integer getRunningInstanceCount() {
            return this.runningInstanceCount;
        }

        /**
         * @return slbIp
         */
        public String getSlbIp() {
            return this.slbIp;
        }

        /**
         * @return slbListenerPort
         */
        public Integer getSlbListenerPort() {
            return this.slbListenerPort;
        }

        /**
         * @return slbPort
         */
        public Integer getSlbPort() {
            return this.slbPort;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String appId; 
            private String applicationType; 
            private Long buildPackageId; 
            private String clusterId; 
            private Integer clusterType; 
            private Long createTime; 
            private String extSlbIp; 
            private Integer extSlbListenerPort; 
            private Integer instances; 
            private String k8sNamespace; 
            private String name; 
            private String namespaceId; 
            private Integer port; 
            private String regionId; 
            private String resourceGroupId; 
            private Integer runningInstanceCount; 
            private String slbIp; 
            private Integer slbListenerPort; 
            private Integer slbPort; 
            private String state; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The deployment type of the application. Valid values:
             * <p>
             * 
             * *   War: The application is deployed by using a WAR package.
             * *   FatJar: The application is deployed by using a JAR package.
             * *   Image: The application is deployed by using an image.
             * *   If this parameter is empty, the application is not deployed.
             */
            public Builder applicationType(String applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * The build package number of Enterprise Distributed Application Service (EDAS) Container.
             */
            public Builder buildPackageId(Long buildPackageId) {
                this.buildPackageId = buildPackageId;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The type of the cluster in which the application is deployed. Valid values:
             * <p>
             * 
             * *   **2**: Elastic Compute Service (ECS) cluster
             * *   **3**: self-managed Kubernetes cluster in EDAS
             * *   **5**: Container Service for Kubernetes (ACK) cluster
             */
            public Builder clusterType(Integer clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The time when the application was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The IP address of the Internet-facing SLB instance.
             */
            public Builder extSlbIp(String extSlbIp) {
                this.extSlbIp = extSlbIp;
                return this;
            }

            /**
             * The listener port of the Internet-facing SLB instance.
             */
            public Builder extSlbListenerPort(Integer extSlbListenerPort) {
                this.extSlbListenerPort = extSlbListenerPort;
                return this;
            }

            /**
             * The number of application instances.
             */
            public Builder instances(Integer instances) {
                this.instances = instances;
                return this;
            }

            /**
             * The namespace of the Kubernetes cluster.
             */
            public Builder k8sNamespace(String k8sNamespace) {
                this.k8sNamespace = k8sNamespace;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the microservices namespace.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * The service port of the application.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The region ID of the application.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The number of running application instances.
             */
            public Builder runningInstanceCount(Integer runningInstanceCount) {
                this.runningInstanceCount = runningInstanceCount;
                return this;
            }

            /**
             * The IP address of the internal-facing Server Load Balancer (SLB) instance.
             */
            public Builder slbIp(String slbIp) {
                this.slbIp = slbIp;
                return this;
            }

            /**
             * The listener port of the internal-facing SLB instance.
             */
            public Builder slbListenerPort(Integer slbListenerPort) {
                this.slbListenerPort = slbListenerPort;
                return this;
            }

            /**
             * The port of the internal-facing SLB instance.
             */
            public Builder slbPort(Integer slbPort) {
                this.slbPort = slbPort;
                return this;
            }

            /**
             * The state of the application. Valid values:
             * <p>
             * 
             * *   RUNNING: The application is running.
             * *   STOPPED: The application is stopped.
             * *   DEPLOYING: The application is being deployed.
             * *   DELETING: The application is being deleted.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
    public static class ApplicationList extends TeaModel {
        @NameInMap("Application")
        private java.util.List < Application> application;

        private ApplicationList(Builder builder) {
            this.application = builder.application;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationList create() {
            return builder().build();
        }

        /**
         * @return application
         */
        public java.util.List < Application> getApplication() {
            return this.application;
        }

        public static final class Builder {
            private java.util.List < Application> application; 

            /**
             * Application.
             */
            public Builder application(java.util.List < Application> application) {
                this.application = application;
                return this;
            }

            public ApplicationList build() {
                return new ApplicationList(this);
            } 

        } 

    }
}
