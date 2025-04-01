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
 * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerAttributeResponseBody</p>
 */
public class DescribeLoadBalancerAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("AddressIPVersion")
    private String addressIPVersion;

    @com.aliyun.core.annotation.NameInMap("BackendServers")
    private java.util.List<BackendServers> backendServers;

    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.NameInMap("ListenerPorts")
    private java.util.List<String> listenerPorts;

    @com.aliyun.core.annotation.NameInMap("ListenerPortsAndProtocols")
    private java.util.List<ListenerPortsAndProtocols> listenerPortsAndProtocols;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerSpec")
    private String loadBalancerSpec;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerStatus")
    private String loadBalancerStatus;

    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<BackendServers> getBackendServers() {
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
    public java.util.List<String> getListenerPorts() {
        return this.listenerPorts;
    }

    /**
     * @return listenerPortsAndProtocols
     */
    public java.util.List<ListenerPortsAndProtocols> getListenerPortsAndProtocols() {
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
        private java.util.List<BackendServers> backendServers; 
        private Integer bandwidth; 
        private String createTime; 
        private String endTime; 
        private String ensRegionId; 
        private java.util.List<String> listenerPorts; 
        private java.util.List<ListenerPortsAndProtocols> listenerPortsAndProtocols; 
        private String loadBalancerId; 
        private String loadBalancerName; 
        private String loadBalancerSpec; 
        private String loadBalancerStatus; 
        private String networkId; 
        private String payType; 
        private String requestId; 
        private String vSwitchId; 

        private Builder() {
        } 

        private Builder(DescribeLoadBalancerAttributeResponseBody model) {
            this.address = model.address;
            this.addressIPVersion = model.addressIPVersion;
            this.backendServers = model.backendServers;
            this.bandwidth = model.bandwidth;
            this.createTime = model.createTime;
            this.endTime = model.endTime;
            this.ensRegionId = model.ensRegionId;
            this.listenerPorts = model.listenerPorts;
            this.listenerPortsAndProtocols = model.listenerPortsAndProtocols;
            this.loadBalancerId = model.loadBalancerId;
            this.loadBalancerName = model.loadBalancerName;
            this.loadBalancerSpec = model.loadBalancerSpec;
            this.loadBalancerStatus = model.loadBalancerStatus;
            this.networkId = model.networkId;
            this.payType = model.payType;
            this.requestId = model.requestId;
            this.vSwitchId = model.vSwitchId;
        } 

        /**
         * <p>The IP address that the Edge Load Balancer (ELB) instance uses to provide services.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168XX.XX</p>
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * <p>The IP version of the ELB instance. Valid values: ipv4 and ipv6.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }

        /**
         * <p>The list of backend servers.</p>
         */
        public Builder backendServers(java.util.List<BackendServers> backendServers) {
            this.backendServers = backendServers;
            return this;
        }

        /**
         * <p>The peak bandwidth of the ELB. The default value is -1, which indicates that the bandwidth is unlimited.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The time when the ELB instance was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-21T12:22:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The time when the ELB instance was disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-21T12:22:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the ENS node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu-telecom</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The frontend ports that are used by the ELB instance.</p>
         */
        public Builder listenerPorts(java.util.List<String> listenerPorts) {
            this.listenerPorts = listenerPorts;
            return this;
        }

        /**
         * <p>The frontend ports and protocols that are used by the ELB instance.</p>
         */
        public Builder listenerPortsAndProtocols(java.util.List<ListenerPortsAndProtocols> listenerPortsAndProtocols) {
            this.listenerPortsAndProtocols = listenerPortsAndProtocols;
            return this;
        }

        /**
         * <p>The ID of the ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5rcvo1n1t3hykfhhjwjgqp****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The name of the ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * <p>The specifications of the ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>elb.s2.medium</p>
         */
        public Builder loadBalancerSpec(String loadBalancerSpec) {
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }

        /**
         * <p>The status of the ELB instance. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong> (default): The listener for the instance can forward the received traffic based on the rule.</li>
         * <li><strong>InActive</strong>: The listener for the instance does not forward the received traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder loadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }

        /**
         * <p>The ID of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>n-5rwbi3g9zvgxcsiufwhw8****</p>
         */
        public Builder networkId(String networkId) {
            this.networkId = networkId;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription.</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go. Only this billing method is supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-5s78m2pdr9osa0j64bn78****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        public DescribeLoadBalancerAttributeResponseBody build() {
            return new DescribeLoadBalancerAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerAttributeResponseBody</p>
     */
    public static class BackendServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Weight")
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

            private Builder() {
            } 

            private Builder(BackendServers model) {
                this.ip = model.ip;
                this.port = model.port;
                this.serverId = model.serverId;
                this.type = model.type;
                this.weight = model.weight;
            } 

            /**
             * <p>The IP address of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The port that is used by the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-5vb5h5njxiuhn48a****</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The type of backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>ens</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The weight of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerAttributeResponseBody</p>
     */
    public static class ListenerPortsAndProtocols extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackendServerPort")
        private Integer backendServerPort;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ForwardPort")
        private Integer forwardPort;

        @com.aliyun.core.annotation.NameInMap("ListenerForward")
        private String listenerForward;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private Integer listenerPort;

        @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
        private String listenerProtocol;

        private ListenerPortsAndProtocols(Builder builder) {
            this.backendServerPort = builder.backendServerPort;
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
         * @return backendServerPort
         */
        public Integer getBackendServerPort() {
            return this.backendServerPort;
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
            private Integer backendServerPort; 
            private String description; 
            private Integer forwardPort; 
            private String listenerForward; 
            private Integer listenerPort; 
            private String listenerProtocol; 

            private Builder() {
            } 

            private Builder(ListenerPortsAndProtocols model) {
                this.backendServerPort = model.backendServerPort;
                this.description = model.description;
                this.forwardPort = model.forwardPort;
                this.listenerForward = model.listenerForward;
                this.listenerPort = model.listenerPort;
                this.listenerProtocol = model.listenerProtocol;
            } 

            /**
             * <p>The backend port that is used by the ELB instance. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>6000</p>
             */
            public Builder backendServerPort(Integer backendServerPort) {
                this.backendServerPort = backendServerPort;
                return this;
            }

            /**
             * <p>The description of the listener.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination listening port to which requests are forwarded.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder forwardPort(Integer forwardPort) {
                this.forwardPort = forwardPort;
                return this;
            }

            /**
             * <p>Indicates whether the listener is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder listenerForward(String listenerForward) {
                this.listenerForward = listenerForward;
                return this;
            }

            /**
             * <p>The listener port of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * <p>The listener protocol of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
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
