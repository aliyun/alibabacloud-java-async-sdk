// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServcieScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServcieScheduleResponseBody</p>
 */
public class DescribeServcieScheduleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Index")
    private Integer index;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceIp")
    private String instanceIp;

    @com.aliyun.core.annotation.NameInMap("InstancePort")
    private Integer instancePort;

    @com.aliyun.core.annotation.NameInMap("PodAbstractInfo")
    private PodAbstractInfo podAbstractInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequestRepeated")
    private Boolean requestRepeated;

    @com.aliyun.core.annotation.NameInMap("TcpPorts")
    private String tcpPorts;

    private DescribeServcieScheduleResponseBody(Builder builder) {
        this.index = builder.index;
        this.instanceId = builder.instanceId;
        this.instanceIp = builder.instanceIp;
        this.instancePort = builder.instancePort;
        this.podAbstractInfo = builder.podAbstractInfo;
        this.requestId = builder.requestId;
        this.requestRepeated = builder.requestRepeated;
        this.tcpPorts = builder.tcpPorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServcieScheduleResponseBody create() {
        return builder().build();
    }

    /**
     * @return index
     */
    public Integer getIndex() {
        return this.index;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceIp
     */
    public String getInstanceIp() {
        return this.instanceIp;
    }

    /**
     * @return instancePort
     */
    public Integer getInstancePort() {
        return this.instancePort;
    }

    /**
     * @return podAbstractInfo
     */
    public PodAbstractInfo getPodAbstractInfo() {
        return this.podAbstractInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requestRepeated
     */
    public Boolean getRequestRepeated() {
        return this.requestRepeated;
    }

    /**
     * @return tcpPorts
     */
    public String getTcpPorts() {
        return this.tcpPorts;
    }

    public static final class Builder {
        private Integer index; 
        private String instanceId; 
        private String instanceIp; 
        private Integer instancePort; 
        private PodAbstractInfo podAbstractInfo; 
        private String requestId; 
        private Boolean requestRepeated; 
        private String tcpPorts; 

        /**
         * The index number of the scheduled virtual device (pod).
         */
        public Builder index(Integer index) {
            this.index = index;
            return this;
        }

        /**
         * The ID of the scheduled instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The IP address of the scheduled instance.
         */
        public Builder instanceIp(String instanceIp) {
            this.instanceIp = instanceIp;
            return this;
        }

        /**
         * The start port of the scheduled instance.
         */
        public Builder instancePort(Integer instancePort) {
            this.instancePort = instancePort;
            return this;
        }

        /**
         * The summary information about the scheduled virtual device.
         */
        public Builder podAbstractInfo(PodAbstractInfo podAbstractInfo) {
            this.podAbstractInfo = podAbstractInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is repeated.
         */
        public Builder requestRepeated(Boolean requestRepeated) {
            this.requestRepeated = requestRepeated;
            return this;
        }

        /**
         * The TCP port range of the scheduled instance or container. The value is in the ${from}-$-{to} format. Example: 80-88.
         */
        public Builder tcpPorts(String tcpPorts) {
            this.tcpPorts = tcpPorts;
            return this;
        }

        public DescribeServcieScheduleResponseBody build() {
            return new DescribeServcieScheduleResponseBody(this);
        } 

    } 

    public static class ContainerStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerId")
        private String containerId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ContainerStatus(Builder builder) {
            this.containerId = builder.containerId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerStatus create() {
            return builder().build();
        }

        /**
         * @return containerId
         */
        public String getContainerId() {
            return this.containerId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String containerId; 
            private String name; 

            /**
             * The ID of the container.
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * The name of the container.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ContainerStatus build() {
                return new ContainerStatus(this);
            } 

        } 

    }
    public static class ContainerStatuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerStatus")
        private java.util.List < ContainerStatus> containerStatus;

        private ContainerStatuses(Builder builder) {
            this.containerStatus = builder.containerStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerStatuses create() {
            return builder().build();
        }

        /**
         * @return containerStatus
         */
        public java.util.List < ContainerStatus> getContainerStatus() {
            return this.containerStatus;
        }

        public static final class Builder {
            private java.util.List < ContainerStatus> containerStatus; 

            /**
             * ContainerStatus.
             */
            public Builder containerStatus(java.util.List < ContainerStatus> containerStatus) {
                this.containerStatus = containerStatus;
                return this;
            }

            public ContainerStatuses build() {
                return new ContainerStatuses(this);
            } 

        } 

    }
    public static class PodAbstractInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerService")
        private Boolean containerService;

        @com.aliyun.core.annotation.NameInMap("ContainerStatuses")
        private ContainerStatuses containerStatuses;

        @com.aliyun.core.annotation.NameInMap("Name")
        private Boolean name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private Boolean namespace;

        @com.aliyun.core.annotation.NameInMap("ResourceScope")
        private Boolean resourceScope;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        private PodAbstractInfo(Builder builder) {
            this.containerService = builder.containerService;
            this.containerStatuses = builder.containerStatuses;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.resourceScope = builder.resourceScope;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PodAbstractInfo create() {
            return builder().build();
        }

        /**
         * @return containerService
         */
        public Boolean getContainerService() {
            return this.containerService;
        }

        /**
         * @return containerStatuses
         */
        public ContainerStatuses getContainerStatuses() {
            return this.containerStatuses;
        }

        /**
         * @return name
         */
        public Boolean getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public Boolean getNamespace() {
            return this.namespace;
        }

        /**
         * @return resourceScope
         */
        public Boolean getResourceScope() {
            return this.resourceScope;
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean containerService; 
            private ContainerStatuses containerStatuses; 
            private Boolean name; 
            private Boolean namespace; 
            private Boolean resourceScope; 
            private Boolean status; 

            /**
             * The name of the container service.
             */
            public Builder containerService(Boolean containerService) {
                this.containerService = containerService;
                return this;
            }

            /**
             * The information about the container.
             */
            public Builder containerStatuses(ContainerStatuses containerStatuses) {
                this.containerStatuses = containerStatuses;
                return this;
            }

            /**
             * The name of the pod.
             */
            public Builder name(Boolean name) {
                this.name = name;
                return this;
            }

            /**
             * The name of the namespace.
             */
            public Builder namespace(Boolean namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The pod scope.
             */
            public Builder resourceScope(Boolean resourceScope) {
                this.resourceScope = resourceScope;
                return this;
            }

            /**
             * The status of the pod.
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            public PodAbstractInfo build() {
                return new PodAbstractInfo(this);
            } 

        } 

    }
}
