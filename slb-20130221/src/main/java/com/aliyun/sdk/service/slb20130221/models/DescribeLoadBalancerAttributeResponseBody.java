// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20130221.models;

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

    @com.aliyun.core.annotation.NameInMap("AddressType")
    private String addressType;

    @com.aliyun.core.annotation.NameInMap("AutoReleaseTime")
    private Long autoReleaseTime;

    @com.aliyun.core.annotation.NameInMap("BackendServers")
    private BackendServers backendServers;

    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateTimeStamp")
    private Long createTimeStamp;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("EndTimeStamp")
    private Long endTimeStamp;

    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.NameInMap("IsPublicAddress")
    private String isPublicAddress;

    @com.aliyun.core.annotation.NameInMap("ListenerPorts")
    private ListenerPorts listenerPorts;

    @com.aliyun.core.annotation.NameInMap("ListenerPortsAndProtocal")
    private ListenerPortsAndProtocal listenerPortsAndProtocal;

    @com.aliyun.core.annotation.NameInMap("ListenerPortsAndProtocol")
    private ListenerPortsAndProtocol listenerPortsAndProtocol;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerSpec")
    private String loadBalancerSpec;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerStatus")
    private String loadBalancerStatus;

    @com.aliyun.core.annotation.NameInMap("MasterZoneId")
    private String masterZoneId;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RegionIdAlias")
    private String regionIdAlias;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlaveZoneId")
    private String slaveZoneId;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribeLoadBalancerAttributeResponseBody(Builder builder) {
        this.address = builder.address;
        this.addressType = builder.addressType;
        this.autoReleaseTime = builder.autoReleaseTime;
        this.backendServers = builder.backendServers;
        this.bandwidth = builder.bandwidth;
        this.createTime = builder.createTime;
        this.createTimeStamp = builder.createTimeStamp;
        this.endTime = builder.endTime;
        this.endTimeStamp = builder.endTimeStamp;
        this.internetChargeType = builder.internetChargeType;
        this.isPublicAddress = builder.isPublicAddress;
        this.listenerPorts = builder.listenerPorts;
        this.listenerPortsAndProtocal = builder.listenerPortsAndProtocal;
        this.listenerPortsAndProtocol = builder.listenerPortsAndProtocol;
        this.loadBalancerId = builder.loadBalancerId;
        this.loadBalancerName = builder.loadBalancerName;
        this.loadBalancerSpec = builder.loadBalancerSpec;
        this.loadBalancerStatus = builder.loadBalancerStatus;
        this.masterZoneId = builder.masterZoneId;
        this.networkType = builder.networkType;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.regionIdAlias = builder.regionIdAlias;
        this.requestId = builder.requestId;
        this.slaveZoneId = builder.slaveZoneId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
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
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
    }

    /**
     * @return autoReleaseTime
     */
    public Long getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    /**
     * @return backendServers
     */
    public BackendServers getBackendServers() {
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
     * @return createTimeStamp
     */
    public Long getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return endTimeStamp
     */
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return isPublicAddress
     */
    public String getIsPublicAddress() {
        return this.isPublicAddress;
    }

    /**
     * @return listenerPorts
     */
    public ListenerPorts getListenerPorts() {
        return this.listenerPorts;
    }

    /**
     * @return listenerPortsAndProtocal
     */
    public ListenerPortsAndProtocal getListenerPortsAndProtocal() {
        return this.listenerPortsAndProtocal;
    }

    /**
     * @return listenerPortsAndProtocol
     */
    public ListenerPortsAndProtocol getListenerPortsAndProtocol() {
        return this.listenerPortsAndProtocol;
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
     * @return masterZoneId
     */
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return regionIdAlias
     */
    public String getRegionIdAlias() {
        return this.regionIdAlias;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slaveZoneId
     */
    public String getSlaveZoneId() {
        return this.slaveZoneId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String address; 
        private String addressType; 
        private Long autoReleaseTime; 
        private BackendServers backendServers; 
        private Integer bandwidth; 
        private String createTime; 
        private Long createTimeStamp; 
        private String endTime; 
        private Long endTimeStamp; 
        private String internetChargeType; 
        private String isPublicAddress; 
        private ListenerPorts listenerPorts; 
        private ListenerPortsAndProtocal listenerPortsAndProtocal; 
        private ListenerPortsAndProtocol listenerPortsAndProtocol; 
        private String loadBalancerId; 
        private String loadBalancerName; 
        private String loadBalancerSpec; 
        private String loadBalancerStatus; 
        private String masterZoneId; 
        private String networkType; 
        private String payType; 
        private String regionId; 
        private String regionIdAlias; 
        private String requestId; 
        private String slaveZoneId; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(DescribeLoadBalancerAttributeResponseBody model) {
            this.address = model.address;
            this.addressType = model.addressType;
            this.autoReleaseTime = model.autoReleaseTime;
            this.backendServers = model.backendServers;
            this.bandwidth = model.bandwidth;
            this.createTime = model.createTime;
            this.createTimeStamp = model.createTimeStamp;
            this.endTime = model.endTime;
            this.endTimeStamp = model.endTimeStamp;
            this.internetChargeType = model.internetChargeType;
            this.isPublicAddress = model.isPublicAddress;
            this.listenerPorts = model.listenerPorts;
            this.listenerPortsAndProtocal = model.listenerPortsAndProtocal;
            this.listenerPortsAndProtocol = model.listenerPortsAndProtocol;
            this.loadBalancerId = model.loadBalancerId;
            this.loadBalancerName = model.loadBalancerName;
            this.loadBalancerSpec = model.loadBalancerSpec;
            this.loadBalancerStatus = model.loadBalancerStatus;
            this.masterZoneId = model.masterZoneId;
            this.networkType = model.networkType;
            this.payType = model.payType;
            this.regionId = model.regionId;
            this.regionIdAlias = model.regionIdAlias;
            this.requestId = model.requestId;
            this.slaveZoneId = model.slaveZoneId;
            this.vSwitchId = model.vSwitchId;
            this.vpcId = model.vpcId;
        } 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * AddressType.
         */
        public Builder addressType(String addressType) {
            this.addressType = addressType;
            return this;
        }

        /**
         * AutoReleaseTime.
         */
        public Builder autoReleaseTime(Long autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }

        /**
         * BackendServers.
         */
        public Builder backendServers(BackendServers backendServers) {
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
         * CreateTimeStamp.
         */
        public Builder createTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
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
         * EndTimeStamp.
         */
        public Builder endTimeStamp(Long endTimeStamp) {
            this.endTimeStamp = endTimeStamp;
            return this;
        }

        /**
         * InternetChargeType.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * IsPublicAddress.
         */
        public Builder isPublicAddress(String isPublicAddress) {
            this.isPublicAddress = isPublicAddress;
            return this;
        }

        /**
         * ListenerPorts.
         */
        public Builder listenerPorts(ListenerPorts listenerPorts) {
            this.listenerPorts = listenerPorts;
            return this;
        }

        /**
         * ListenerPortsAndProtocal.
         */
        public Builder listenerPortsAndProtocal(ListenerPortsAndProtocal listenerPortsAndProtocal) {
            this.listenerPortsAndProtocal = listenerPortsAndProtocal;
            return this;
        }

        /**
         * ListenerPortsAndProtocol.
         */
        public Builder listenerPortsAndProtocol(ListenerPortsAndProtocol listenerPortsAndProtocol) {
            this.listenerPortsAndProtocol = listenerPortsAndProtocol;
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
         * MasterZoneId.
         */
        public Builder masterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RegionIdAlias.
         */
        public Builder regionIdAlias(String regionIdAlias) {
            this.regionIdAlias = regionIdAlias;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlaveZoneId.
         */
        public Builder slaveZoneId(String slaveZoneId) {
            this.slaveZoneId = slaveZoneId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
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
    public static class BackendServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerId")
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private BackendServer(Builder builder) {
            this.serverId = builder.serverId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendServer create() {
            return builder().build();
        }

        /**
         * @return serverId
         */
        public String getServerId() {
            return this.serverId;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String serverId; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(BackendServer model) {
                this.serverId = model.serverId;
                this.weight = model.weight;
            } 

            /**
             * ServerId.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public BackendServer build() {
                return new BackendServer(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerAttributeResponseBody</p>
     */
    public static class BackendServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackendServer")
        private java.util.List<BackendServer> backendServer;

        private BackendServers(Builder builder) {
            this.backendServer = builder.backendServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendServers create() {
            return builder().build();
        }

        /**
         * @return backendServer
         */
        public java.util.List<BackendServer> getBackendServer() {
            return this.backendServer;
        }

        public static final class Builder {
            private java.util.List<BackendServer> backendServer; 

            private Builder() {
            } 

            private Builder(BackendServers model) {
                this.backendServer = model.backendServer;
            } 

            /**
             * BackendServer.
             */
            public Builder backendServer(java.util.List<BackendServer> backendServer) {
                this.backendServer = backendServer;
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
    public static class ListenerPorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private java.util.List<String> listenerPort;

        private ListenerPorts(Builder builder) {
            this.listenerPort = builder.listenerPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerPorts create() {
            return builder().build();
        }

        /**
         * @return listenerPort
         */
        public java.util.List<String> getListenerPort() {
            return this.listenerPort;
        }

        public static final class Builder {
            private java.util.List<String> listenerPort; 

            private Builder() {
            } 

            private Builder(ListenerPorts model) {
                this.listenerPort = model.listenerPort;
            } 

            /**
             * ListenerPort.
             */
            public Builder listenerPort(java.util.List<String> listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            public ListenerPorts build() {
                return new ListenerPorts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerAttributeResponseBody</p>
     */
    public static class ListenerPortAndProtocal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private Integer listenerPort;

        @com.aliyun.core.annotation.NameInMap("ListenerProtocal")
        private String listenerProtocal;

        private ListenerPortAndProtocal(Builder builder) {
            this.listenerPort = builder.listenerPort;
            this.listenerProtocal = builder.listenerProtocal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerPortAndProtocal create() {
            return builder().build();
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return listenerProtocal
         */
        public String getListenerProtocal() {
            return this.listenerProtocal;
        }

        public static final class Builder {
            private Integer listenerPort; 
            private String listenerProtocal; 

            private Builder() {
            } 

            private Builder(ListenerPortAndProtocal model) {
                this.listenerPort = model.listenerPort;
                this.listenerProtocal = model.listenerProtocal;
            } 

            /**
             * ListenerPort.
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * ListenerProtocal.
             */
            public Builder listenerProtocal(String listenerProtocal) {
                this.listenerProtocal = listenerProtocal;
                return this;
            }

            public ListenerPortAndProtocal build() {
                return new ListenerPortAndProtocal(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerAttributeResponseBody</p>
     */
    public static class ListenerPortsAndProtocal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListenerPortAndProtocal")
        private java.util.List<ListenerPortAndProtocal> listenerPortAndProtocal;

        private ListenerPortsAndProtocal(Builder builder) {
            this.listenerPortAndProtocal = builder.listenerPortAndProtocal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerPortsAndProtocal create() {
            return builder().build();
        }

        /**
         * @return listenerPortAndProtocal
         */
        public java.util.List<ListenerPortAndProtocal> getListenerPortAndProtocal() {
            return this.listenerPortAndProtocal;
        }

        public static final class Builder {
            private java.util.List<ListenerPortAndProtocal> listenerPortAndProtocal; 

            private Builder() {
            } 

            private Builder(ListenerPortsAndProtocal model) {
                this.listenerPortAndProtocal = model.listenerPortAndProtocal;
            } 

            /**
             * ListenerPortAndProtocal.
             */
            public Builder listenerPortAndProtocal(java.util.List<ListenerPortAndProtocal> listenerPortAndProtocal) {
                this.listenerPortAndProtocal = listenerPortAndProtocal;
                return this;
            }

            public ListenerPortsAndProtocal build() {
                return new ListenerPortsAndProtocal(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerAttributeResponseBody</p>
     */
    public static class ListenerPortAndProtocol extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private Integer listenerPort;

        @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
        private String listenerProtocol;

        private ListenerPortAndProtocol(Builder builder) {
            this.listenerPort = builder.listenerPort;
            this.listenerProtocol = builder.listenerProtocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerPortAndProtocol create() {
            return builder().build();
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
            private Integer listenerPort; 
            private String listenerProtocol; 

            private Builder() {
            } 

            private Builder(ListenerPortAndProtocol model) {
                this.listenerPort = model.listenerPort;
                this.listenerProtocol = model.listenerProtocol;
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

            public ListenerPortAndProtocol build() {
                return new ListenerPortAndProtocol(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerAttributeResponseBody</p>
     */
    public static class ListenerPortsAndProtocol extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListenerPortAndProtocol")
        private java.util.List<ListenerPortAndProtocol> listenerPortAndProtocol;

        private ListenerPortsAndProtocol(Builder builder) {
            this.listenerPortAndProtocol = builder.listenerPortAndProtocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerPortsAndProtocol create() {
            return builder().build();
        }

        /**
         * @return listenerPortAndProtocol
         */
        public java.util.List<ListenerPortAndProtocol> getListenerPortAndProtocol() {
            return this.listenerPortAndProtocol;
        }

        public static final class Builder {
            private java.util.List<ListenerPortAndProtocol> listenerPortAndProtocol; 

            private Builder() {
            } 

            private Builder(ListenerPortsAndProtocol model) {
                this.listenerPortAndProtocol = model.listenerPortAndProtocol;
            } 

            /**
             * ListenerPortAndProtocol.
             */
            public Builder listenerPortAndProtocol(java.util.List<ListenerPortAndProtocol> listenerPortAndProtocol) {
                this.listenerPortAndProtocol = listenerPortAndProtocol;
                return this;
            }

            public ListenerPortsAndProtocol build() {
                return new ListenerPortsAndProtocol(this);
            } 

        } 

    }
}
