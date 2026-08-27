// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListGatewayLoadBalancersResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayLoadBalancersResponseBody</p>
 */
public class ListGatewayLoadBalancersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListGatewayLoadBalancersResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayLoadBalancersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGatewayLoadBalancersResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGatewayLoadBalancersResponseBody build() {
            return new ListGatewayLoadBalancersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewayLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayLoadBalancersResponseBody</p>
     */
    public static class LoadBalancerAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("eniId")
        private String eniId;

        @com.aliyun.core.annotation.NameInMap("ipv4LocalAddresses")
        private java.util.List<String> ipv4LocalAddresses;

        @com.aliyun.core.annotation.NameInMap("ipv6Address")
        private String ipv6Address;

        @com.aliyun.core.annotation.NameInMap("ipv6LocalAddresses")
        private java.util.List<String> ipv6LocalAddresses;

        @com.aliyun.core.annotation.NameInMap("privateIPv4Address")
        private String privateIPv4Address;

        @com.aliyun.core.annotation.NameInMap("privateIPv4HcStatus")
        private String privateIPv4HcStatus;

        @com.aliyun.core.annotation.NameInMap("privateIPv6HcStatus")
        private String privateIPv6HcStatus;

        @com.aliyun.core.annotation.NameInMap("publicIPv4Address")
        private String publicIPv4Address;

        private LoadBalancerAddresses(Builder builder) {
            this.allocationId = builder.allocationId;
            this.eniId = builder.eniId;
            this.ipv4LocalAddresses = builder.ipv4LocalAddresses;
            this.ipv6Address = builder.ipv6Address;
            this.ipv6LocalAddresses = builder.ipv6LocalAddresses;
            this.privateIPv4Address = builder.privateIPv4Address;
            this.privateIPv4HcStatus = builder.privateIPv4HcStatus;
            this.privateIPv6HcStatus = builder.privateIPv6HcStatus;
            this.publicIPv4Address = builder.publicIPv4Address;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerAddresses create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return eniId
         */
        public String getEniId() {
            return this.eniId;
        }

        /**
         * @return ipv4LocalAddresses
         */
        public java.util.List<String> getIpv4LocalAddresses() {
            return this.ipv4LocalAddresses;
        }

        /**
         * @return ipv6Address
         */
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        /**
         * @return ipv6LocalAddresses
         */
        public java.util.List<String> getIpv6LocalAddresses() {
            return this.ipv6LocalAddresses;
        }

        /**
         * @return privateIPv4Address
         */
        public String getPrivateIPv4Address() {
            return this.privateIPv4Address;
        }

        /**
         * @return privateIPv4HcStatus
         */
        public String getPrivateIPv4HcStatus() {
            return this.privateIPv4HcStatus;
        }

        /**
         * @return privateIPv6HcStatus
         */
        public String getPrivateIPv6HcStatus() {
            return this.privateIPv6HcStatus;
        }

        /**
         * @return publicIPv4Address
         */
        public String getPublicIPv4Address() {
            return this.publicIPv4Address;
        }

        public static final class Builder {
            private String allocationId; 
            private String eniId; 
            private java.util.List<String> ipv4LocalAddresses; 
            private String ipv6Address; 
            private java.util.List<String> ipv6LocalAddresses; 
            private String privateIPv4Address; 
            private String privateIPv4HcStatus; 
            private String privateIPv6HcStatus; 
            private String publicIPv4Address; 

            private Builder() {
            } 

            private Builder(LoadBalancerAddresses model) {
                this.allocationId = model.allocationId;
                this.eniId = model.eniId;
                this.ipv4LocalAddresses = model.ipv4LocalAddresses;
                this.ipv6Address = model.ipv6Address;
                this.ipv6LocalAddresses = model.ipv6LocalAddresses;
                this.privateIPv4Address = model.privateIPv4Address;
                this.privateIPv4HcStatus = model.privateIPv4HcStatus;
                this.privateIPv6HcStatus = model.privateIPv6HcStatus;
                this.publicIPv4Address = model.publicIPv4Address;
            } 

            /**
             * allocationId.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * eniId.
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * ipv4LocalAddresses.
             */
            public Builder ipv4LocalAddresses(java.util.List<String> ipv4LocalAddresses) {
                this.ipv4LocalAddresses = ipv4LocalAddresses;
                return this;
            }

            /**
             * ipv6Address.
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            /**
             * ipv6LocalAddresses.
             */
            public Builder ipv6LocalAddresses(java.util.List<String> ipv6LocalAddresses) {
                this.ipv6LocalAddresses = ipv6LocalAddresses;
                return this;
            }

            /**
             * privateIPv4Address.
             */
            public Builder privateIPv4Address(String privateIPv4Address) {
                this.privateIPv4Address = privateIPv4Address;
                return this;
            }

            /**
             * privateIPv4HcStatus.
             */
            public Builder privateIPv4HcStatus(String privateIPv4HcStatus) {
                this.privateIPv4HcStatus = privateIPv4HcStatus;
                return this;
            }

            /**
             * privateIPv6HcStatus.
             */
            public Builder privateIPv6HcStatus(String privateIPv6HcStatus) {
                this.privateIPv6HcStatus = privateIPv6HcStatus;
                return this;
            }

            /**
             * publicIPv4Address.
             */
            public Builder publicIPv4Address(String publicIPv4Address) {
                this.publicIPv4Address = publicIPv4Address;
                return this;
            }

            public LoadBalancerAddresses build() {
                return new LoadBalancerAddresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayLoadBalancersResponseBody</p>
     */
    public static class LoadBalancerZoneMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("loadBalancerAddresses")
        private java.util.List<LoadBalancerAddresses> loadBalancerAddresses;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("vSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private LoadBalancerZoneMappings(Builder builder) {
            this.loadBalancerAddresses = builder.loadBalancerAddresses;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerZoneMappings create() {
            return builder().build();
        }

        /**
         * @return loadBalancerAddresses
         */
        public java.util.List<LoadBalancerAddresses> getLoadBalancerAddresses() {
            return this.loadBalancerAddresses;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<LoadBalancerAddresses> loadBalancerAddresses; 
            private String status; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(LoadBalancerZoneMappings model) {
                this.loadBalancerAddresses = model.loadBalancerAddresses;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * loadBalancerAddresses.
             */
            public Builder loadBalancerAddresses(java.util.List<LoadBalancerAddresses> loadBalancerAddresses) {
                this.loadBalancerAddresses = loadBalancerAddresses;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * vSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * zoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public LoadBalancerZoneMappings build() {
                return new LoadBalancerZoneMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayLoadBalancersResponseBody</p>
     */
    public static class Ports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private Ports(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ports create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(Ports model) {
                this.port = model.port;
                this.protocol = model.protocol;
            } 

            /**
             * port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Ports build() {
                return new Ports(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayLoadBalancersResponseBody</p>
     */
    public static class Listeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private Listeners(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listeners create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(Listeners model) {
                this.port = model.port;
                this.protocol = model.protocol;
            } 

            /**
             * port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayLoadBalancersResponseBody</p>
     */
    public static class VirtualServerGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("listeners")
        private java.util.List<Listeners> listeners;

        @com.aliyun.core.annotation.NameInMap("virtualServiceGroupId")
        private String virtualServiceGroupId;

        @com.aliyun.core.annotation.NameInMap("virtualServiceGroupName")
        private String virtualServiceGroupName;

        private VirtualServerGroupList(Builder builder) {
            this.listeners = builder.listeners;
            this.virtualServiceGroupId = builder.virtualServiceGroupId;
            this.virtualServiceGroupName = builder.virtualServiceGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualServerGroupList create() {
            return builder().build();
        }

        /**
         * @return listeners
         */
        public java.util.List<Listeners> getListeners() {
            return this.listeners;
        }

        /**
         * @return virtualServiceGroupId
         */
        public String getVirtualServiceGroupId() {
            return this.virtualServiceGroupId;
        }

        /**
         * @return virtualServiceGroupName
         */
        public String getVirtualServiceGroupName() {
            return this.virtualServiceGroupName;
        }

        public static final class Builder {
            private java.util.List<Listeners> listeners; 
            private String virtualServiceGroupId; 
            private String virtualServiceGroupName; 

            private Builder() {
            } 

            private Builder(VirtualServerGroupList model) {
                this.listeners = model.listeners;
                this.virtualServiceGroupId = model.virtualServiceGroupId;
                this.virtualServiceGroupName = model.virtualServiceGroupName;
            } 

            /**
             * listeners.
             */
            public Builder listeners(java.util.List<Listeners> listeners) {
                this.listeners = listeners;
                return this;
            }

            /**
             * virtualServiceGroupId.
             */
            public Builder virtualServiceGroupId(String virtualServiceGroupId) {
                this.virtualServiceGroupId = virtualServiceGroupId;
                return this;
            }

            /**
             * virtualServiceGroupName.
             */
            public Builder virtualServiceGroupName(String virtualServiceGroupName) {
                this.virtualServiceGroupName = virtualServiceGroupName;
                return this;
            }

            public VirtualServerGroupList build() {
                return new VirtualServerGroupList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayLoadBalancersResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("defaultGatewayIngress")
        private Boolean defaultGatewayIngress;

        @com.aliyun.core.annotation.NameInMap("editEnable")
        private Boolean editEnable;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("loadBalancerAddress")
        private String loadBalancerAddress;

        @com.aliyun.core.annotation.NameInMap("loadBalancerAddressIpVersion")
        private String loadBalancerAddressIpVersion;

        @com.aliyun.core.annotation.NameInMap("loadBalancerAddressType")
        private String loadBalancerAddressType;

        @com.aliyun.core.annotation.NameInMap("loadBalancerAvailableStatus")
        private String loadBalancerAvailableStatus;

        @com.aliyun.core.annotation.NameInMap("loadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("loadBalancerMode")
        private String loadBalancerMode;

        @com.aliyun.core.annotation.NameInMap("loadBalancerName")
        private String loadBalancerName;

        @com.aliyun.core.annotation.NameInMap("loadBalancerSpec")
        private String loadBalancerSpec;

        @com.aliyun.core.annotation.NameInMap("loadBalancerStatus")
        private String loadBalancerStatus;

        @com.aliyun.core.annotation.NameInMap("loadBalancerType")
        private String loadBalancerType;

        @com.aliyun.core.annotation.NameInMap("loadBalancerZoneMappings")
        private java.util.List<LoadBalancerZoneMappings> loadBalancerZoneMappings;

        @com.aliyun.core.annotation.NameInMap("ports")
        private java.util.List<Ports> ports;

        @com.aliyun.core.annotation.NameInMap("serviceWeight")
        private Long serviceWeight;

        @com.aliyun.core.annotation.NameInMap("vServerGroupMetaInfo")
        private String vServerGroupMetaInfo;

        @com.aliyun.core.annotation.NameInMap("virtualServerGroupList")
        private java.util.List<VirtualServerGroupList> virtualServerGroupList;

        private Items(Builder builder) {
            this.defaultGatewayIngress = builder.defaultGatewayIngress;
            this.editEnable = builder.editEnable;
            this.gatewayId = builder.gatewayId;
            this.loadBalancerAddress = builder.loadBalancerAddress;
            this.loadBalancerAddressIpVersion = builder.loadBalancerAddressIpVersion;
            this.loadBalancerAddressType = builder.loadBalancerAddressType;
            this.loadBalancerAvailableStatus = builder.loadBalancerAvailableStatus;
            this.loadBalancerId = builder.loadBalancerId;
            this.loadBalancerMode = builder.loadBalancerMode;
            this.loadBalancerName = builder.loadBalancerName;
            this.loadBalancerSpec = builder.loadBalancerSpec;
            this.loadBalancerStatus = builder.loadBalancerStatus;
            this.loadBalancerType = builder.loadBalancerType;
            this.loadBalancerZoneMappings = builder.loadBalancerZoneMappings;
            this.ports = builder.ports;
            this.serviceWeight = builder.serviceWeight;
            this.vServerGroupMetaInfo = builder.vServerGroupMetaInfo;
            this.virtualServerGroupList = builder.virtualServerGroupList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return defaultGatewayIngress
         */
        public Boolean getDefaultGatewayIngress() {
            return this.defaultGatewayIngress;
        }

        /**
         * @return editEnable
         */
        public Boolean getEditEnable() {
            return this.editEnable;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return loadBalancerAddress
         */
        public String getLoadBalancerAddress() {
            return this.loadBalancerAddress;
        }

        /**
         * @return loadBalancerAddressIpVersion
         */
        public String getLoadBalancerAddressIpVersion() {
            return this.loadBalancerAddressIpVersion;
        }

        /**
         * @return loadBalancerAddressType
         */
        public String getLoadBalancerAddressType() {
            return this.loadBalancerAddressType;
        }

        /**
         * @return loadBalancerAvailableStatus
         */
        public String getLoadBalancerAvailableStatus() {
            return this.loadBalancerAvailableStatus;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return loadBalancerMode
         */
        public String getLoadBalancerMode() {
            return this.loadBalancerMode;
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
         * @return loadBalancerType
         */
        public String getLoadBalancerType() {
            return this.loadBalancerType;
        }

        /**
         * @return loadBalancerZoneMappings
         */
        public java.util.List<LoadBalancerZoneMappings> getLoadBalancerZoneMappings() {
            return this.loadBalancerZoneMappings;
        }

        /**
         * @return ports
         */
        public java.util.List<Ports> getPorts() {
            return this.ports;
        }

        /**
         * @return serviceWeight
         */
        public Long getServiceWeight() {
            return this.serviceWeight;
        }

        /**
         * @return vServerGroupMetaInfo
         */
        public String getVServerGroupMetaInfo() {
            return this.vServerGroupMetaInfo;
        }

        /**
         * @return virtualServerGroupList
         */
        public java.util.List<VirtualServerGroupList> getVirtualServerGroupList() {
            return this.virtualServerGroupList;
        }

        public static final class Builder {
            private Boolean defaultGatewayIngress; 
            private Boolean editEnable; 
            private String gatewayId; 
            private String loadBalancerAddress; 
            private String loadBalancerAddressIpVersion; 
            private String loadBalancerAddressType; 
            private String loadBalancerAvailableStatus; 
            private String loadBalancerId; 
            private String loadBalancerMode; 
            private String loadBalancerName; 
            private String loadBalancerSpec; 
            private String loadBalancerStatus; 
            private String loadBalancerType; 
            private java.util.List<LoadBalancerZoneMappings> loadBalancerZoneMappings; 
            private java.util.List<Ports> ports; 
            private Long serviceWeight; 
            private String vServerGroupMetaInfo; 
            private java.util.List<VirtualServerGroupList> virtualServerGroupList; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.defaultGatewayIngress = model.defaultGatewayIngress;
                this.editEnable = model.editEnable;
                this.gatewayId = model.gatewayId;
                this.loadBalancerAddress = model.loadBalancerAddress;
                this.loadBalancerAddressIpVersion = model.loadBalancerAddressIpVersion;
                this.loadBalancerAddressType = model.loadBalancerAddressType;
                this.loadBalancerAvailableStatus = model.loadBalancerAvailableStatus;
                this.loadBalancerId = model.loadBalancerId;
                this.loadBalancerMode = model.loadBalancerMode;
                this.loadBalancerName = model.loadBalancerName;
                this.loadBalancerSpec = model.loadBalancerSpec;
                this.loadBalancerStatus = model.loadBalancerStatus;
                this.loadBalancerType = model.loadBalancerType;
                this.loadBalancerZoneMappings = model.loadBalancerZoneMappings;
                this.ports = model.ports;
                this.serviceWeight = model.serviceWeight;
                this.vServerGroupMetaInfo = model.vServerGroupMetaInfo;
                this.virtualServerGroupList = model.virtualServerGroupList;
            } 

            /**
             * defaultGatewayIngress.
             */
            public Builder defaultGatewayIngress(Boolean defaultGatewayIngress) {
                this.defaultGatewayIngress = defaultGatewayIngress;
                return this;
            }

            /**
             * editEnable.
             */
            public Builder editEnable(Boolean editEnable) {
                this.editEnable = editEnable;
                return this;
            }

            /**
             * gatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * loadBalancerAddress.
             */
            public Builder loadBalancerAddress(String loadBalancerAddress) {
                this.loadBalancerAddress = loadBalancerAddress;
                return this;
            }

            /**
             * loadBalancerAddressIpVersion.
             */
            public Builder loadBalancerAddressIpVersion(String loadBalancerAddressIpVersion) {
                this.loadBalancerAddressIpVersion = loadBalancerAddressIpVersion;
                return this;
            }

            /**
             * loadBalancerAddressType.
             */
            public Builder loadBalancerAddressType(String loadBalancerAddressType) {
                this.loadBalancerAddressType = loadBalancerAddressType;
                return this;
            }

            /**
             * loadBalancerAvailableStatus.
             */
            public Builder loadBalancerAvailableStatus(String loadBalancerAvailableStatus) {
                this.loadBalancerAvailableStatus = loadBalancerAvailableStatus;
                return this;
            }

            /**
             * loadBalancerId.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * loadBalancerMode.
             */
            public Builder loadBalancerMode(String loadBalancerMode) {
                this.loadBalancerMode = loadBalancerMode;
                return this;
            }

            /**
             * loadBalancerName.
             */
            public Builder loadBalancerName(String loadBalancerName) {
                this.loadBalancerName = loadBalancerName;
                return this;
            }

            /**
             * loadBalancerSpec.
             */
            public Builder loadBalancerSpec(String loadBalancerSpec) {
                this.loadBalancerSpec = loadBalancerSpec;
                return this;
            }

            /**
             * loadBalancerStatus.
             */
            public Builder loadBalancerStatus(String loadBalancerStatus) {
                this.loadBalancerStatus = loadBalancerStatus;
                return this;
            }

            /**
             * loadBalancerType.
             */
            public Builder loadBalancerType(String loadBalancerType) {
                this.loadBalancerType = loadBalancerType;
                return this;
            }

            /**
             * loadBalancerZoneMappings.
             */
            public Builder loadBalancerZoneMappings(java.util.List<LoadBalancerZoneMappings> loadBalancerZoneMappings) {
                this.loadBalancerZoneMappings = loadBalancerZoneMappings;
                return this;
            }

            /**
             * ports.
             */
            public Builder ports(java.util.List<Ports> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * serviceWeight.
             */
            public Builder serviceWeight(Long serviceWeight) {
                this.serviceWeight = serviceWeight;
                return this;
            }

            /**
             * vServerGroupMetaInfo.
             */
            public Builder vServerGroupMetaInfo(String vServerGroupMetaInfo) {
                this.vServerGroupMetaInfo = vServerGroupMetaInfo;
                return this;
            }

            /**
             * virtualServerGroupList.
             */
            public Builder virtualServerGroupList(java.util.List<VirtualServerGroupList> virtualServerGroupList) {
                this.virtualServerGroupList = virtualServerGroupList;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayLoadBalancersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        private Data(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
            } 

            /**
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
