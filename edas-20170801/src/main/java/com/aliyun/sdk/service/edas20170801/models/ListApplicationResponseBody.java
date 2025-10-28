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
 * {@link ListApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationResponseBody</p>
 */
public class ListApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationList")
    private ApplicationList applicationList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListApplicationResponseBody model) {
            this.applicationList = model.applicationList;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about applications.</p>
         */
        public Builder applicationList(ApplicationList applicationList) {
            this.applicationList = applicationList;
            return this;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5d6fa0bc-cc3**********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListApplicationResponseBody build() {
            return new ListApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationResponseBody</p>
     */
    public static class Application extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("ApplicationType")
        private String applicationType;

        @com.aliyun.core.annotation.NameInMap("BuildPackageId")
        private Long buildPackageId;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private Integer clusterType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("ExtSlbIp")
        private String extSlbIp;

        @com.aliyun.core.annotation.NameInMap("ExtSlbListenerPort")
        private Integer extSlbListenerPort;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private Integer instances;

        @com.aliyun.core.annotation.NameInMap("K8sNamespace")
        private String k8sNamespace;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RunningInstanceCount")
        private Integer runningInstanceCount;

        @com.aliyun.core.annotation.NameInMap("SlbIp")
        private String slbIp;

        @com.aliyun.core.annotation.NameInMap("SlbListenerPort")
        private Integer slbListenerPort;

        @com.aliyun.core.annotation.NameInMap("SlbPort")
        private Integer slbPort;

        @com.aliyun.core.annotation.NameInMap("State")
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

            private Builder() {
            } 

            private Builder(Application model) {
                this.appId = model.appId;
                this.applicationType = model.applicationType;
                this.buildPackageId = model.buildPackageId;
                this.clusterId = model.clusterId;
                this.clusterType = model.clusterType;
                this.createTime = model.createTime;
                this.extSlbIp = model.extSlbIp;
                this.extSlbListenerPort = model.extSlbListenerPort;
                this.instances = model.instances;
                this.k8sNamespace = model.k8sNamespace;
                this.name = model.name;
                this.namespaceId = model.namespaceId;
                this.port = model.port;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.runningInstanceCount = model.runningInstanceCount;
                this.slbIp = model.slbIp;
                this.slbListenerPort = model.slbListenerPort;
                this.slbPort = model.slbPort;
                this.state = model.state;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>00ee517d-dd7d-4d4e-<strong><strong>-</strong></strong>********</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The deployment type of the application. Valid values:</p>
             * <ul>
             * <li>War: The application is deployed by using a WAR package.</li>
             * <li>FatJar: The application is deployed by using a JAR package.</li>
             * <li>Image: The application is deployed by using an image.</li>
             * <li>If this parameter is empty, the application is not deployed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FatJar</p>
             */
            public Builder applicationType(String applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * <p>The build package number of Enterprise Distributed Application Service (EDAS) Container.</p>
             * 
             * <strong>example:</strong>
             * <p>58</p>
             */
            public Builder buildPackageId(Long buildPackageId) {
                this.buildPackageId = buildPackageId;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c37aec2a-bcca-4ec1-<strong><strong>-</strong></strong>********</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The type of the cluster in which the application is deployed. Valid values:</p>
             * <ul>
             * <li><strong>2</strong>: Elastic Compute Service (ECS) cluster</li>
             * <li><strong>3</strong>: self-managed Kubernetes cluster in EDAS</li>
             * <li><strong>5</strong>: Container Service for Kubernetes (ACK) cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder clusterType(Integer clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The time when the application was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1664208000000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The IP address of the Internet-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>100.100.70.***</p>
             */
            public Builder extSlbIp(String extSlbIp) {
                this.extSlbIp = extSlbIp;
                return this;
            }

            /**
             * <p>The listener port of the Internet-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder extSlbListenerPort(Integer extSlbListenerPort) {
                this.extSlbListenerPort = extSlbListenerPort;
                return this;
            }

            /**
             * <p>The number of application instances.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder instances(Integer instances) {
                this.instances = instances;
                return this;
            }

            /**
             * <p>The namespace of the Kubernetes cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder k8sNamespace(String k8sNamespace) {
                this.k8sNamespace = k8sNamespace;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>doc-test-consumer</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the microservices namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou:test</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The service port of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The region ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing:docTes</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek24j4s4b*****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The number of running application instances.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder runningInstanceCount(Integer runningInstanceCount) {
                this.runningInstanceCount = runningInstanceCount;
                return this;
            }

            /**
             * <p>The IP address of the internal-facing Server Load Balancer (SLB) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.***</p>
             */
            public Builder slbIp(String slbIp) {
                this.slbIp = slbIp;
                return this;
            }

            /**
             * <p>The listener port of the internal-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>8088</p>
             */
            public Builder slbListenerPort(Integer slbListenerPort) {
                this.slbListenerPort = slbListenerPort;
                return this;
            }

            /**
             * <p>The port of the internal-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder slbPort(Integer slbPort) {
                this.slbPort = slbPort;
                return this;
            }

            /**
             * <p>The state of the application. Valid values:</p>
             * <ul>
             * <li>RUNNING: The application is running.</li>
             * <li>STOPPED: The application is stopped.</li>
             * <li>DEPLOYING: The application is being deployed.</li>
             * <li>DELETING: The application is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
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
    /**
     * 
     * {@link ListApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationResponseBody</p>
     */
    public static class ApplicationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Application")
        private java.util.List<Application> application;

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
        public java.util.List<Application> getApplication() {
            return this.application;
        }

        public static final class Builder {
            private java.util.List<Application> application; 

            private Builder() {
            } 

            private Builder(ApplicationList model) {
                this.application = model.application;
            } 

            /**
             * Application.
             */
            public Builder application(java.util.List<Application> application) {
                this.application = application;
                return this;
            }

            public ApplicationList build() {
                return new ApplicationList(this);
            } 

        } 

    }
}
