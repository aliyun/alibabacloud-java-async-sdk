// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVersionManagementResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVersionManagementResponseBody</p>
 */
public class DescribeVersionManagementResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VersionDetails")
    private java.util.List < VersionDetails> versionDetails;

    private DescribeVersionManagementResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.versionDetails = builder.versionDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVersionManagementResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return versionDetails
     */
    public java.util.List < VersionDetails> getVersionDetails() {
        return this.versionDetails;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < VersionDetails> versionDetails; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VersionDetails.
         */
        public Builder versionDetails(java.util.List < VersionDetails> versionDetails) {
            this.versionDetails = versionDetails;
            return this;
        }

        public DescribeVersionManagementResponseBody build() {
            return new DescribeVersionManagementResponseBody(this);
        } 

    } 

    public static class PodInstances extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("NodeIp")
        private String nodeIp;

        @NameInMap("PodIP")
        private String podIP;

        @NameInMap("PodName")
        private String podName;

        @NameInMap("RestartTime")
        private Integer restartTime;

        @NameInMap("Status")
        private String status;

        private PodInstances(Builder builder) {
            this.createTime = builder.createTime;
            this.namespace = builder.namespace;
            this.nodeIp = builder.nodeIp;
            this.podIP = builder.podIP;
            this.podName = builder.podName;
            this.restartTime = builder.restartTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PodInstances create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return nodeIp
         */
        public String getNodeIp() {
            return this.nodeIp;
        }

        /**
         * @return podIP
         */
        public String getPodIP() {
            return this.podIP;
        }

        /**
         * @return podName
         */
        public String getPodName() {
            return this.podName;
        }

        /**
         * @return restartTime
         */
        public Integer getRestartTime() {
            return this.restartTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String namespace; 
            private String nodeIp; 
            private String podIP; 
            private String podName; 
            private Integer restartTime; 
            private String status; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * NodeIp.
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * PodIP.
             */
            public Builder podIP(String podIP) {
                this.podIP = podIP;
                return this;
            }

            /**
             * PodName.
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * RestartTime.
             */
            public Builder restartTime(Integer restartTime) {
                this.restartTime = restartTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PodInstances build() {
                return new PodInstances(this);
            } 

        } 

    }
    public static class Resource extends TeaModel {
        @NameInMap("CPULimit")
        private String CPULimit;

        @NameInMap("CPURequest")
        private String CPURequest;

        @NameInMap("MemoryLimit")
        private String memoryLimit;

        @NameInMap("MemoryRequest")
        private String memoryRequest;

        private Resource(Builder builder) {
            this.CPULimit = builder.CPULimit;
            this.CPURequest = builder.CPURequest;
            this.memoryLimit = builder.memoryLimit;
            this.memoryRequest = builder.memoryRequest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return CPULimit
         */
        public String getCPULimit() {
            return this.CPULimit;
        }

        /**
         * @return CPURequest
         */
        public String getCPURequest() {
            return this.CPURequest;
        }

        /**
         * @return memoryLimit
         */
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        /**
         * @return memoryRequest
         */
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        public static final class Builder {
            private String CPULimit; 
            private String CPURequest; 
            private String memoryLimit; 
            private String memoryRequest; 

            /**
             * CPULimit.
             */
            public Builder CPULimit(String CPULimit) {
                this.CPULimit = CPULimit;
                return this;
            }

            /**
             * CPURequest.
             */
            public Builder CPURequest(String CPURequest) {
                this.CPURequest = CPURequest;
                return this;
            }

            /**
             * MemoryLimit.
             */
            public Builder memoryLimit(String memoryLimit) {
                this.memoryLimit = memoryLimit;
                return this;
            }

            /**
             * MemoryRequest.
             */
            public Builder memoryRequest(String memoryRequest) {
                this.memoryRequest = memoryRequest;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    public static class VersionDetails extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeploymentName")
        private String deploymentName;

        @NameInMap("Images")
        private java.util.List < String > images;

        @NameInMap("Inject")
        private Boolean inject;

        @NameInMap("PodInstances")
        private java.util.List < PodInstances> podInstances;

        @NameInMap("ReadyReplicas")
        private Integer readyReplicas;

        @NameInMap("Replicas")
        private Integer replicas;

        @NameInMap("Resource")
        private Resource resource;

        @NameInMap("Version")
        private String version;

        private VersionDetails(Builder builder) {
            this.createTime = builder.createTime;
            this.deploymentName = builder.deploymentName;
            this.images = builder.images;
            this.inject = builder.inject;
            this.podInstances = builder.podInstances;
            this.readyReplicas = builder.readyReplicas;
            this.replicas = builder.replicas;
            this.resource = builder.resource;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionDetails create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deploymentName
         */
        public String getDeploymentName() {
            return this.deploymentName;
        }

        /**
         * @return images
         */
        public java.util.List < String > getImages() {
            return this.images;
        }

        /**
         * @return inject
         */
        public Boolean getInject() {
            return this.inject;
        }

        /**
         * @return podInstances
         */
        public java.util.List < PodInstances> getPodInstances() {
            return this.podInstances;
        }

        /**
         * @return readyReplicas
         */
        public Integer getReadyReplicas() {
            return this.readyReplicas;
        }

        /**
         * @return replicas
         */
        public Integer getReplicas() {
            return this.replicas;
        }

        /**
         * @return resource
         */
        public Resource getResource() {
            return this.resource;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String createTime; 
            private String deploymentName; 
            private java.util.List < String > images; 
            private Boolean inject; 
            private java.util.List < PodInstances> podInstances; 
            private Integer readyReplicas; 
            private Integer replicas; 
            private Resource resource; 
            private String version; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeploymentName.
             */
            public Builder deploymentName(String deploymentName) {
                this.deploymentName = deploymentName;
                return this;
            }

            /**
             * Images.
             */
            public Builder images(java.util.List < String > images) {
                this.images = images;
                return this;
            }

            /**
             * Inject.
             */
            public Builder inject(Boolean inject) {
                this.inject = inject;
                return this;
            }

            /**
             * PodInstances.
             */
            public Builder podInstances(java.util.List < PodInstances> podInstances) {
                this.podInstances = podInstances;
                return this;
            }

            /**
             * ReadyReplicas.
             */
            public Builder readyReplicas(Integer readyReplicas) {
                this.readyReplicas = readyReplicas;
                return this;
            }

            /**
             * Replicas.
             */
            public Builder replicas(Integer replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * Resource.
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public VersionDetails build() {
                return new VersionDetails(this);
            } 

        } 

    }
}
