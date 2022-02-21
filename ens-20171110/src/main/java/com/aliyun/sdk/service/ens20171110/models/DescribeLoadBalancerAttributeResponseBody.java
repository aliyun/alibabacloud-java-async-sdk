// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerAttributeResponseBody</p>
 */
public class DescribeLoadBalancerAttributeResponseBody extends TeaModel {
    @NameInMap("Address")
    private String address;

    @NameInMap("AddressIPVersion")
    private String addressIPVersion;

    @NameInMap("BackendServers")
    private java.util.List < BackendServers> backendServers;

    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("EnsRegionId")
    private String ensRegionId;

    @NameInMap("ListenerPorts")
    private java.util.List < String > listenerPorts;

    @NameInMap("ListenerPortsAndProtocols")
    private java.util.List < ListenerPortsAndProtocols> listenerPortsAndProtocols;

    @NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @NameInMap("LoadBalancerSpec")
    private String loadBalancerSpec;

    @NameInMap("LoadBalancerStatus")
    private String loadBalancerStatus;

    @NameInMap("NetworkId")
    private String networkId;

    @NameInMap("PayType")
    private String payType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VSwitchId")
    private String vSwitchId;

    private DescribeLoadBalancerAttributeResponseBody(Builder builder) {
        this.address = builder.address;
        this.addressIPVersion = builder.addressIPVersion;
        this.backendServers = builder.backendServers;
        this.bandwidth = builder.bandwidth;
        this.createTime = builder.createTime;
        this.endTime = builder.endTime;
        this.ensRegionId = builder.ensRegionId;
        this.listenerPorts = builder.listenerPorts;
        this.listenerPortsAndProtocols = builder.listenerPortsAndProtocols;
        this.loadBalancerId = builder.loadBalancerId;
        this.loadBalancerName = builder.loadBalancerName;
        this.loadBalancerSpec = builder.loadBalancerSpec;
        this.loadBalancerStatus = builder.loadBalancerStatus;
        this.networkId = builder.networkId;
        this.payType = builder.payType;
        this.requestId = builder.requestId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return addressIPVersion
     */
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    /**
     * @return backendServers
     */
    public java.util.List < BackendServers> getBackendServers() {
        return this.backendServers;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return listenerPorts
     */
    public java.util.List < String > getListenerPorts() {
        return this.listenerPorts;
    }

    /**
     * @return listenerPortsAndProtocols
     */
    public java.util.List < ListenerPortsAndProtocols> getListenerPortsAndProtocols() {
        return this.listenerPortsAndProtocols;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return loadBalancerName
     */
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * @return loadBalancerSpec
     */
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

    /**
     * @return loadBalancerStatus
     */
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder {
        private String address; 
        private String addressIPVersion; 
        private java.util.List < BackendServers> backendServers; 
        private Integer bandwidth; 
        private String createTime; 
        private String endTime; 
        private String ensRegionId; 
        private java.util.List < String > listenerPorts; 
        private java.util.List < ListenerPortsAndProtocols> listenerPortsAndProtocols; 
        private String loadBalancerId; 
        private String loadBalancerName; 
        private String loadBalancerSpec; 
        private String loadBalancerStatus; 
        private String networkId; 
        private String payType; 
        private String requestId; 
        private String vSwitchId; 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * AddressIPVersion.
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }

        /**
         * BackendServers.
         */
        public Builder backendServers(java.util.List < BackendServers> backendServers) {
            this.backendServers = backendServers;
            return this;
        }

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * EnsRegionId.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * ListenerPorts.
         */
        public Builder listenerPorts(java.util.List < String > listenerPorts) {
            this.listenerPorts = listenerPorts;
            return this;
        }

        /**
         * ListenerPortsAndProtocols.
         */
        public Builder listenerPortsAndProtocols(java.util.List < ListenerPortsAndProtocols> listenerPortsAndProtocols) {
            this.listenerPortsAndProtocols = listenerPortsAndProtocols;
            return this;
        }

        /**
         * LoadBalancerId.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * LoadBalancerName.
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * LoadBalancerSpec.
         */
        public Builder loadBalancerSpec(String loadBalancerSpec) {
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }

        /**
         * LoadBalancerStatus.
         */
        public Builder loadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }

        /**
         * NetworkId.
         */
        public Builder networkId(String networkId) {
            this.networkId = networkId;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        public DescribeLoadBalancerAttributeResponseBody build() {
            return new DescribeLoadBalancerAttributeResponseBody(this);
        } 

    } 

    public static class BackendServers extends TeaModel {
        @NameInMap("Ip")
        private String ip;

        @NameInMap("Port")
        private String port;

        @NameInMap("ServerId")
        private String serverId;

        @NameInMap("Type")
        private String type;

        @NameInMap("Weight")
        private Integer weight;

        private BackendServers(Builder builder) {
            this.ip = builder.ip;
            this.port = builder.port;
            this.serverId = builder.serverId;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendServers create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return serverId
         */
        public String getServerId() {
            return this.serverId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String ip; 
            private String port; 
            private String serverId; 
            private String type; 
            private Integer weight; 

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * ServerId.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public BackendServers build() {
                return new BackendServers(this);
            } 

        } 

    }
    public static class ListenerPortsAndProtocols extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("ForwardPort")
        private Integer forwardPort;

        @NameInMap("ListenerForward")
        private String listenerForward;

        @NameInMap("ListenerPort")
        private Integer listenerPort;

        @NameInMap("ListenerProtocol")
        private String listenerProtocol;

        private ListenerPortsAndProtocols(Builder builder) {
            this.description = builder.description;
            this.forwardPort = builder.forwardPort;
            this.listenerForward = builder.listenerForward;
            this.listenerPort = builder.listenerPort;
            this.listenerProtocol = builder.listenerProtocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerPortsAndProtocols create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return forwardPort
         */
        public Integer getForwardPort() {
            return this.forwardPort;
        }

        /**
         * @return listenerForward
         */
        public String getListenerForward() {
            return this.listenerForward;
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return listenerProtocol
         */
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public static final class Builder {
            private String description; 
            private Integer forwardPort; 
            private String listenerForward; 
            private Integer listenerPort; 
            private String listenerProtocol; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ForwardPort.
             */
            public Builder forwardPort(Integer forwardPort) {
                this.forwardPort = forwardPort;
                return this;
            }

            /**
             * ListenerForward.
             */
            public Builder listenerForward(String listenerForward) {
                this.listenerForward = listenerForward;
                return this;
            }

            /**
             * ListenerPort.
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * ListenerProtocol.
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            public ListenerPortsAndProtocols build() {
                return new ListenerPortsAndProtocols(this);
            } 

        } 

    }
}
