// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterDevicesResponseBody</p>
 */
public class DescribeClusterDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Devices")
    private java.util.List < Devices> devices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeClusterDevicesResponseBody(Builder builder) {
        this.devices = builder.devices;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return devices
     */
    public java.util.List < Devices> getDevices() {
        return this.devices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < Devices> devices; 
        private String requestId; 
        private Long total; 

        /**
         * Devices.
         */
        public Builder devices(java.util.List < Devices> devices) {
            this.devices = devices;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeClusterDevicesResponseBody build() {
            return new DescribeClusterDevicesResponseBody(this);
        } 

    } 

    public static class IpInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalIp")
        private String externalIp;

        @com.aliyun.core.annotation.NameInMap("ExternalPort")
        private String externalPort;

        @com.aliyun.core.annotation.NameInMap("ISP")
        private String ISP;

        @com.aliyun.core.annotation.NameInMap("InternalIp")
        private String internalIp;

        @com.aliyun.core.annotation.NameInMap("InternalPort")
        private String internalPort;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("NatType")
        private String natType;

        private IpInfos(Builder builder) {
            this.externalIp = builder.externalIp;
            this.externalPort = builder.externalPort;
            this.ISP = builder.ISP;
            this.internalIp = builder.internalIp;
            this.internalPort = builder.internalPort;
            this.ipProtocol = builder.ipProtocol;
            this.natType = builder.natType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpInfos create() {
            return builder().build();
        }

        /**
         * @return externalIp
         */
        public String getExternalIp() {
            return this.externalIp;
        }

        /**
         * @return externalPort
         */
        public String getExternalPort() {
            return this.externalPort;
        }

        /**
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return internalIp
         */
        public String getInternalIp() {
            return this.internalIp;
        }

        /**
         * @return internalPort
         */
        public String getInternalPort() {
            return this.internalPort;
        }

        /**
         * @return ipProtocol
         */
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return natType
         */
        public String getNatType() {
            return this.natType;
        }

        public static final class Builder {
            private String externalIp; 
            private String externalPort; 
            private String ISP; 
            private String internalIp; 
            private String internalPort; 
            private String ipProtocol; 
            private String natType; 

            /**
             * ExternalIp.
             */
            public Builder externalIp(String externalIp) {
                this.externalIp = externalIp;
                return this;
            }

            /**
             * ExternalPort.
             */
            public Builder externalPort(String externalPort) {
                this.externalPort = externalPort;
                return this;
            }

            /**
             * ISP.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * InternalIp.
             */
            public Builder internalIp(String internalIp) {
                this.internalIp = internalIp;
                return this;
            }

            /**
             * InternalPort.
             */
            public Builder internalPort(String internalPort) {
                this.internalPort = internalPort;
                return this;
            }

            /**
             * IpProtocol.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * NatType.
             */
            public Builder natType(String natType) {
                this.natType = natType;
                return this;
            }

            public IpInfos build() {
                return new IpInfos(this);
            } 

        } 

    }
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerPorts")
        private String containerPorts;

        @com.aliyun.core.annotation.NameInMap("ExternalIp")
        private String externalIp;

        @com.aliyun.core.annotation.NameInMap("ExternalIsp")
        private String externalIsp;

        @com.aliyun.core.annotation.NameInMap("ExternalPorts")
        private String externalPorts;

        @com.aliyun.core.annotation.NameInMap("OutgoingIp")
        private String outgoingIp;

        @com.aliyun.core.annotation.NameInMap("OutgoingIsp")
        private String outgoingIsp;

        private Network(Builder builder) {
            this.containerPorts = builder.containerPorts;
            this.externalIp = builder.externalIp;
            this.externalIsp = builder.externalIsp;
            this.externalPorts = builder.externalPorts;
            this.outgoingIp = builder.outgoingIp;
            this.outgoingIsp = builder.outgoingIsp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return containerPorts
         */
        public String getContainerPorts() {
            return this.containerPorts;
        }

        /**
         * @return externalIp
         */
        public String getExternalIp() {
            return this.externalIp;
        }

        /**
         * @return externalIsp
         */
        public String getExternalIsp() {
            return this.externalIsp;
        }

        /**
         * @return externalPorts
         */
        public String getExternalPorts() {
            return this.externalPorts;
        }

        /**
         * @return outgoingIp
         */
        public String getOutgoingIp() {
            return this.outgoingIp;
        }

        /**
         * @return outgoingIsp
         */
        public String getOutgoingIsp() {
            return this.outgoingIsp;
        }

        public static final class Builder {
            private String containerPorts; 
            private String externalIp; 
            private String externalIsp; 
            private String externalPorts; 
            private String outgoingIp; 
            private String outgoingIsp; 

            /**
             * ContainerPorts.
             */
            public Builder containerPorts(String containerPorts) {
                this.containerPorts = containerPorts;
                return this;
            }

            /**
             * ExternalIp.
             */
            public Builder externalIp(String externalIp) {
                this.externalIp = externalIp;
                return this;
            }

            /**
             * ExternalIsp.
             */
            public Builder externalIsp(String externalIsp) {
                this.externalIsp = externalIsp;
                return this;
            }

            /**
             * ExternalPorts.
             */
            public Builder externalPorts(String externalPorts) {
                this.externalPorts = externalPorts;
                return this;
            }

            /**
             * OutgoingIp.
             */
            public Builder outgoingIp(String outgoingIp) {
                this.outgoingIp = outgoingIp;
                return this;
            }

            /**
             * OutgoingIsp.
             */
            public Builder outgoingIsp(String outgoingIsp) {
                this.outgoingIsp = outgoingIsp;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    public static class PodInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Network")
        private java.util.List < Network> network;

        @com.aliyun.core.annotation.NameInMap("PodId")
        private String podId;

        @com.aliyun.core.annotation.NameInMap("PodIp")
        private String podIp;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PodInfos(Builder builder) {
            this.network = builder.network;
            this.podId = builder.podId;
            this.podIp = builder.podIp;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PodInfos create() {
            return builder().build();
        }

        /**
         * @return network
         */
        public java.util.List < Network> getNetwork() {
            return this.network;
        }

        /**
         * @return podId
         */
        public String getPodId() {
            return this.podId;
        }

        /**
         * @return podIp
         */
        public String getPodIp() {
            return this.podIp;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < Network> network; 
            private String podId; 
            private String podIp; 
            private String status; 

            /**
             * Network.
             */
            public Builder network(java.util.List < Network> network) {
                this.network = network;
                return this;
            }

            /**
             * PodId.
             */
            public Builder podId(String podId) {
                this.podId = podId;
                return this;
            }

            /**
             * PodIp.
             */
            public Builder podIp(String podIp) {
                this.podIp = podIp;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PodInfos build() {
                return new PodInfos(this);
            } 

        } 

    }
    public static class Devices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
        private Integer autoRenewPeriod;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EdgeNodeName")
        private String edgeNodeName;

        @com.aliyun.core.annotation.NameInMap("HostRom")
        private String hostRom;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("IpInfos")
        private java.util.List < IpInfos> ipInfos;

        @com.aliyun.core.annotation.NameInMap("MacAddress")
        private String macAddress;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("PlatformType")
        private String platformType;

        @com.aliyun.core.annotation.NameInMap("PodInfos")
        private java.util.List < PodInfos> podInfos;

        @com.aliyun.core.annotation.NameInMap("Server")
        private String server;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Devices(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.autoRenewPeriod = builder.autoRenewPeriod;
            this.description = builder.description;
            this.edgeNodeName = builder.edgeNodeName;
            this.hostRom = builder.hostRom;
            this.imageId = builder.imageId;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.ipInfos = builder.ipInfos;
            this.macAddress = builder.macAddress;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.platformType = builder.platformType;
            this.podInfos = builder.podInfos;
            this.server = builder.server;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Devices create() {
            return builder().build();
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return autoRenewPeriod
         */
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return edgeNodeName
         */
        public String getEdgeNodeName() {
            return this.edgeNodeName;
        }

        /**
         * @return hostRom
         */
        public String getHostRom() {
            return this.hostRom;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return ipInfos
         */
        public java.util.List < IpInfos> getIpInfos() {
            return this.ipInfos;
        }

        /**
         * @return macAddress
         */
        public String getMacAddress() {
            return this.macAddress;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return platformType
         */
        public String getPlatformType() {
            return this.platformType;
        }

        /**
         * @return podInfos
         */
        public java.util.List < PodInfos> getPodInfos() {
            return this.podInfos;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean autoRenew; 
            private Integer autoRenewPeriod; 
            private String description; 
            private String edgeNodeName; 
            private String hostRom; 
            private String imageId; 
            private String instanceChargeType; 
            private String instanceId; 
            private String instanceName; 
            private java.util.List < IpInfos> ipInfos; 
            private String macAddress; 
            private Integer period; 
            private String periodUnit; 
            private String platformType; 
            private java.util.List < PodInfos> podInfos; 
            private String server; 
            private String status; 

            /**
             * AutoRenew.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * AutoRenewPeriod.
             */
            public Builder autoRenewPeriod(Integer autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EdgeNodeName.
             */
            public Builder edgeNodeName(String edgeNodeName) {
                this.edgeNodeName = edgeNodeName;
                return this;
            }

            /**
             * HostRom.
             */
            public Builder hostRom(String hostRom) {
                this.hostRom = hostRom;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * IpInfos.
             */
            public Builder ipInfos(java.util.List < IpInfos> ipInfos) {
                this.ipInfos = ipInfos;
                return this;
            }

            /**
             * MacAddress.
             */
            public Builder macAddress(String macAddress) {
                this.macAddress = macAddress;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * PeriodUnit.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * PlatformType.
             */
            public Builder platformType(String platformType) {
                this.platformType = platformType;
                return this;
            }

            /**
             * PodInfos.
             */
            public Builder podInfos(java.util.List < PodInfos> podInfos) {
                this.podInfos = podInfos;
                return this;
            }

            /**
             * Server.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
}
