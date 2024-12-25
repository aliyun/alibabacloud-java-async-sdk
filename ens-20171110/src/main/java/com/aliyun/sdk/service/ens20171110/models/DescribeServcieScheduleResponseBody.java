// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
         * <p>The index number of the scheduled virtual device (pod).</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder index(Integer index) {
            this.index = index;
            return this;
        }

        /**
         * <p>The ID of the scheduled instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5myukg7hnpbto7m024002****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the scheduled instance.</p>
         * 
         * <strong>example:</strong>
         * <p>120.26.XX.XX</p>
         */
        public Builder instanceIp(String instanceIp) {
            this.instanceIp = instanceIp;
            return this;
        }

        /**
         * <p>The start port of the scheduled instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder instancePort(Integer instancePort) {
            this.instancePort = instancePort;
            return this;
        }

        /**
         * <p>The summary information about the scheduled virtual device.</p>
         */
        public Builder podAbstractInfo(PodAbstractInfo podAbstractInfo) {
            this.podAbstractInfo = podAbstractInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is repeated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder requestRepeated(Boolean requestRepeated) {
            this.requestRepeated = requestRepeated;
            return this;
        }

        /**
         * <p>The TCP port range of the scheduled instance or container. The value is in the ${from}-$-{to} format. Example: 80-88.</p>
         * 
         * <strong>example:</strong>
         * <p>80-88</p>
         */
        public Builder tcpPorts(String tcpPorts) {
            this.tcpPorts = tcpPorts;
            return this;
        }

        public DescribeServcieScheduleResponseBody build() {
            return new DescribeServcieScheduleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServcieScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServcieScheduleResponseBody</p>
     */
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
             * <p>The ID of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>container_e79_1638372147094_158091_02_000001</p>
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * <p>The name of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
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
    /**
     * 
     * {@link DescribeServcieScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServcieScheduleResponseBody</p>
     */
    public static class ContainerStatuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerStatus")
        private java.util.List<ContainerStatus> containerStatus;

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
        public java.util.List<ContainerStatus> getContainerStatus() {
            return this.containerStatus;
        }

        public static final class Builder {
            private java.util.List<ContainerStatus> containerStatus; 

            /**
             * ContainerStatus.
             */
            public Builder containerStatus(java.util.List<ContainerStatus> containerStatus) {
                this.containerStatus = containerStatus;
                return this;
            }

            public ContainerStatuses build() {
                return new ContainerStatuses(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeServcieScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServcieScheduleResponseBody</p>
     */
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
             * <p>The name of the container service.</p>
             * 
             * <strong>example:</strong>
             * <p>android</p>
             */
            public Builder containerService(Boolean containerService) {
                this.containerService = containerService;
                return this;
            }

            /**
             * <p>The information about the container.</p>
             */
            public Builder containerStatuses(ContainerStatuses containerStatuses) {
                this.containerStatuses = containerStatuses;
                return this;
            }

            /**
             * <p>The name of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>gcs-prod-websocket-eip-telecom</p>
             */
            public Builder name(Boolean name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default-aliyun</p>
             */
            public Builder namespace(Boolean namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The pod scope.</p>
             * 
             * <strong>example:</strong>
             * <p>FDN</p>
             */
            public Builder resourceScope(Boolean resourceScope) {
                this.resourceScope = resourceScope;
                return this;
            }

            /**
             * <p>The status of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
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
