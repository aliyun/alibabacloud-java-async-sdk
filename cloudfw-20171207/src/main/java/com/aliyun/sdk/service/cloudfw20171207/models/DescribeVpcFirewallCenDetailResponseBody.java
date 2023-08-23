// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallCenDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallCenDetailResponseBody</p>
 */
public class DescribeVpcFirewallCenDetailResponseBody extends TeaModel {
    @NameInMap("ConnectType")
    private String connectType;

    @NameInMap("FirewallSwitchStatus")
    private String firewallSwitchStatus;

    @NameInMap("FirewallVpc")
    private FirewallVpc firewallVpc;

    @NameInMap("LocalVpc")
    private LocalVpc localVpc;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VpcFirewallId")
    private String vpcFirewallId;

    @NameInMap("VpcFirewallName")
    private String vpcFirewallName;

    private DescribeVpcFirewallCenDetailResponseBody(Builder builder) {
        this.connectType = builder.connectType;
        this.firewallSwitchStatus = builder.firewallSwitchStatus;
        this.firewallVpc = builder.firewallVpc;
        this.localVpc = builder.localVpc;
        this.requestId = builder.requestId;
        this.vpcFirewallId = builder.vpcFirewallId;
        this.vpcFirewallName = builder.vpcFirewallName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallCenDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return connectType
     */
    public String getConnectType() {
        return this.connectType;
    }

    /**
     * @return firewallSwitchStatus
     */
    public String getFirewallSwitchStatus() {
        return this.firewallSwitchStatus;
    }

    /**
     * @return firewallVpc
     */
    public FirewallVpc getFirewallVpc() {
        return this.firewallVpc;
    }

    /**
     * @return localVpc
     */
    public LocalVpc getLocalVpc() {
        return this.localVpc;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    /**
     * @return vpcFirewallName
     */
    public String getVpcFirewallName() {
        return this.vpcFirewallName;
    }

    public static final class Builder {
        private String connectType; 
        private String firewallSwitchStatus; 
        private FirewallVpc firewallVpc; 
        private LocalVpc localVpc; 
        private String requestId; 
        private String vpcFirewallId; 
        private String vpcFirewallName; 

        /**
         * The connection type of the VPC firewall. The value is fixed as **cen**, which indicates CEN instances.
         */
        public Builder connectType(String connectType) {
            this.connectType = connectType;
            return this;
        }

        /**
         * The status of the VPC firewall. Valid values:
         * <p>
         * 
         * *   **opened**: enabled
         * *   **closed**: disabled
         * *   **notconfigured**: not configured
         */
        public Builder firewallSwitchStatus(String firewallSwitchStatus) {
            this.firewallSwitchStatus = firewallSwitchStatus;
            return this;
        }

        /**
         * FirewallVpc.
         */
        public Builder firewallVpc(FirewallVpc firewallVpc) {
            this.firewallVpc = firewallVpc;
            return this;
        }

        /**
         * The details about the VPC.
         */
        public Builder localVpc(LocalVpc localVpc) {
            this.localVpc = localVpc;
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
         * The instance ID of the VPC firewall.
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        /**
         * The instance name of the VPC firewall.
         */
        public Builder vpcFirewallName(String vpcFirewallName) {
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }

        public DescribeVpcFirewallCenDetailResponseBody build() {
            return new DescribeVpcFirewallCenDetailResponseBody(this);
        } 

    } 

    public static class FirewallVpc extends TeaModel {
        @NameInMap("AllowConfiguration")
        private Integer allowConfiguration;

        @NameInMap("VpcCidr")
        private String vpcCidr;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchCidr")
        private String vswitchCidr;

        @NameInMap("VswitchId")
        private String vswitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        private FirewallVpc(Builder builder) {
            this.allowConfiguration = builder.allowConfiguration;
            this.vpcCidr = builder.vpcCidr;
            this.vpcId = builder.vpcId;
            this.vswitchCidr = builder.vswitchCidr;
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirewallVpc create() {
            return builder().build();
        }

        /**
         * @return allowConfiguration
         */
        public Integer getAllowConfiguration() {
            return this.allowConfiguration;
        }

        /**
         * @return vpcCidr
         */
        public String getVpcCidr() {
            return this.vpcCidr;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchCidr
         */
        public String getVswitchCidr() {
            return this.vswitchCidr;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer allowConfiguration; 
            private String vpcCidr; 
            private String vpcId; 
            private String vswitchCidr; 
            private String vswitchId; 
            private String zoneId; 

            /**
             * AllowConfiguration.
             */
            public Builder allowConfiguration(Integer allowConfiguration) {
                this.allowConfiguration = allowConfiguration;
                return this;
            }

            /**
             * VpcCidr.
             */
            public Builder vpcCidr(String vpcCidr) {
                this.vpcCidr = vpcCidr;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswitchCidr.
             */
            public Builder vswitchCidr(String vswitchCidr) {
                this.vswitchCidr = vswitchCidr;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public FirewallVpc build() {
                return new FirewallVpc(this);
            } 

        } 

    }
    public static class EniList extends TeaModel {
        @NameInMap("EniId")
        private String eniId;

        @NameInMap("EniPrivateIpAddress")
        private String eniPrivateIpAddress;

        @NameInMap("EniVSwitchId")
        private String eniVSwitchId;

        private EniList(Builder builder) {
            this.eniId = builder.eniId;
            this.eniPrivateIpAddress = builder.eniPrivateIpAddress;
            this.eniVSwitchId = builder.eniVSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EniList create() {
            return builder().build();
        }

        /**
         * @return eniId
         */
        public String getEniId() {
            return this.eniId;
        }

        /**
         * @return eniPrivateIpAddress
         */
        public String getEniPrivateIpAddress() {
            return this.eniPrivateIpAddress;
        }

        /**
         * @return eniVSwitchId
         */
        public String getEniVSwitchId() {
            return this.eniVSwitchId;
        }

        public static final class Builder {
            private String eniId; 
            private String eniPrivateIpAddress; 
            private String eniVSwitchId; 

            /**
             * The ID of the ENI that belongs to the VPC.
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * The private IP address of the ENI that belongs to the VPC.
             */
            public Builder eniPrivateIpAddress(String eniPrivateIpAddress) {
                this.eniPrivateIpAddress = eniPrivateIpAddress;
                return this;
            }

            /**
             * EniVSwitchId.
             */
            public Builder eniVSwitchId(String eniVSwitchId) {
                this.eniVSwitchId = eniVSwitchId;
                return this;
            }

            public EniList build() {
                return new EniList(this);
            } 

        } 

    }
    public static class RouteEntryList extends TeaModel {
        @NameInMap("DestinationCidr")
        private String destinationCidr;

        @NameInMap("NextHopInstanceId")
        private String nextHopInstanceId;

        private RouteEntryList(Builder builder) {
            this.destinationCidr = builder.destinationCidr;
            this.nextHopInstanceId = builder.nextHopInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteEntryList create() {
            return builder().build();
        }

        /**
         * @return destinationCidr
         */
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        /**
         * @return nextHopInstanceId
         */
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

        public static final class Builder {
            private String destinationCidr; 
            private String nextHopInstanceId; 

            /**
             * The destination CIDR block of the VPC.
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * The instance ID of the next hop for the VPC.
             */
            public Builder nextHopInstanceId(String nextHopInstanceId) {
                this.nextHopInstanceId = nextHopInstanceId;
                return this;
            }

            public RouteEntryList build() {
                return new RouteEntryList(this);
            } 

        } 

    }
    public static class VpcCidrTableList extends TeaModel {
        @NameInMap("RouteEntryList")
        private java.util.List < RouteEntryList> routeEntryList;

        @NameInMap("RouteTableId")
        private String routeTableId;

        private VpcCidrTableList(Builder builder) {
            this.routeEntryList = builder.routeEntryList;
            this.routeTableId = builder.routeTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcCidrTableList create() {
            return builder().build();
        }

        /**
         * @return routeEntryList
         */
        public java.util.List < RouteEntryList> getRouteEntryList() {
            return this.routeEntryList;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private java.util.List < RouteEntryList> routeEntryList; 
            private String routeTableId; 

            /**
             * An array that consists of the route entries for the VPC.
             */
            public Builder routeEntryList(java.util.List < RouteEntryList> routeEntryList) {
                this.routeEntryList = routeEntryList;
                return this;
            }

            /**
             * The route table ID of the VPC.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            public VpcCidrTableList build() {
                return new VpcCidrTableList(this);
            } 

        } 

    }
    public static class LocalVpc extends TeaModel {
        @NameInMap("AttachmentId")
        private String attachmentId;

        @NameInMap("AttachmentName")
        private String attachmentName;

        @NameInMap("DefendCidrList")
        private java.util.List < String > defendCidrList;

        @NameInMap("EniList")
        private java.util.List < EniList> eniList;

        @NameInMap("ManualVSwitchId")
        private String manualVSwitchId;

        @NameInMap("NetworkInstanceId")
        private String networkInstanceId;

        @NameInMap("NetworkInstanceName")
        private String networkInstanceName;

        @NameInMap("NetworkInstanceType")
        private String networkInstanceType;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("RegionNo")
        private String regionNo;

        @NameInMap("RouteMode")
        private String routeMode;

        @NameInMap("SupportManualMode")
        private String supportManualMode;

        @NameInMap("TransitRouterId")
        private String transitRouterId;

        @NameInMap("TransitRouterType")
        private String transitRouterType;

        @NameInMap("VpcCidrTableList")
        private java.util.List < VpcCidrTableList> vpcCidrTableList;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
        private String vpcName;

        private LocalVpc(Builder builder) {
            this.attachmentId = builder.attachmentId;
            this.attachmentName = builder.attachmentName;
            this.defendCidrList = builder.defendCidrList;
            this.eniList = builder.eniList;
            this.manualVSwitchId = builder.manualVSwitchId;
            this.networkInstanceId = builder.networkInstanceId;
            this.networkInstanceName = builder.networkInstanceName;
            this.networkInstanceType = builder.networkInstanceType;
            this.ownerId = builder.ownerId;
            this.regionNo = builder.regionNo;
            this.routeMode = builder.routeMode;
            this.supportManualMode = builder.supportManualMode;
            this.transitRouterId = builder.transitRouterId;
            this.transitRouterType = builder.transitRouterType;
            this.vpcCidrTableList = builder.vpcCidrTableList;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocalVpc create() {
            return builder().build();
        }

        /**
         * @return attachmentId
         */
        public String getAttachmentId() {
            return this.attachmentId;
        }

        /**
         * @return attachmentName
         */
        public String getAttachmentName() {
            return this.attachmentName;
        }

        /**
         * @return defendCidrList
         */
        public java.util.List < String > getDefendCidrList() {
            return this.defendCidrList;
        }

        /**
         * @return eniList
         */
        public java.util.List < EniList> getEniList() {
            return this.eniList;
        }

        /**
         * @return manualVSwitchId
         */
        public String getManualVSwitchId() {
            return this.manualVSwitchId;
        }

        /**
         * @return networkInstanceId
         */
        public String getNetworkInstanceId() {
            return this.networkInstanceId;
        }

        /**
         * @return networkInstanceName
         */
        public String getNetworkInstanceName() {
            return this.networkInstanceName;
        }

        /**
         * @return networkInstanceType
         */
        public String getNetworkInstanceType() {
            return this.networkInstanceType;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return routeMode
         */
        public String getRouteMode() {
            return this.routeMode;
        }

        /**
         * @return supportManualMode
         */
        public String getSupportManualMode() {
            return this.supportManualMode;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        /**
         * @return transitRouterType
         */
        public String getTransitRouterType() {
            return this.transitRouterType;
        }

        /**
         * @return vpcCidrTableList
         */
        public java.util.List < VpcCidrTableList> getVpcCidrTableList() {
            return this.vpcCidrTableList;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        public static final class Builder {
            private String attachmentId; 
            private String attachmentName; 
            private java.util.List < String > defendCidrList; 
            private java.util.List < EniList> eniList; 
            private String manualVSwitchId; 
            private String networkInstanceId; 
            private String networkInstanceName; 
            private String networkInstanceType; 
            private String ownerId; 
            private String regionNo; 
            private String routeMode; 
            private String supportManualMode; 
            private String transitRouterId; 
            private String transitRouterType; 
            private java.util.List < VpcCidrTableList> vpcCidrTableList; 
            private String vpcId; 
            private String vpcName; 

            /**
             * The ID of the connection between two network instances.
             */
            public Builder attachmentId(String attachmentId) {
                this.attachmentId = attachmentId;
                return this;
            }

            /**
             * The name of the connection between two network instances.
             */
            public Builder attachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
                return this;
            }

            /**
             * An array consisting of the CIDR blocks that are protected by the VPC firewall.
             */
            public Builder defendCidrList(java.util.List < String > defendCidrList) {
                this.defendCidrList = defendCidrList;
                return this;
            }

            /**
             * An array that consists of the elastic network interfaces (ENIs).
             */
            public Builder eniList(java.util.List < EniList> eniList) {
                this.eniList = eniList;
                return this;
            }

            /**
             * The ID of the specified vSwitch when the routing mode is manual.
             */
            public Builder manualVSwitchId(String manualVSwitchId) {
                this.manualVSwitchId = manualVSwitchId;
                return this;
            }

            /**
             * The ID of the VPC for which the VPC firewall is created.
             */
            public Builder networkInstanceId(String networkInstanceId) {
                this.networkInstanceId = networkInstanceId;
                return this;
            }

            /**
             * The name of the network instance.
             */
            public Builder networkInstanceName(String networkInstanceName) {
                this.networkInstanceName = networkInstanceName;
                return this;
            }

            /**
             * The type of the network instance. The value is fixed as **VPC**.
             */
            public Builder networkInstanceType(String networkInstanceType) {
                this.networkInstanceType = networkInstanceType;
                return this;
            }

            /**
             * The UID of the Alibaba Cloud account to which the VPC belongs.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The ID of the region in which the VPC resides.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * The routing mode. Valid values:
             * <p>
             * 
             * *   auto: automatic mode
             * *   manual: manual mode
             */
            public Builder routeMode(String routeMode) {
                this.routeMode = routeMode;
                return this;
            }

            /**
             * Indicates whether the manual routing mode is supported. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder supportManualMode(String supportManualMode) {
                this.supportManualMode = supportManualMode;
                return this;
            }

            /**
             * The instance ID of the CEN transit router.
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * The edition of the CEN transit router. Valid values:
             * <p>
             * 
             * *   **Basic**: Basic Edition
             * *   **Enterprise**: Enterprise Edition
             */
            public Builder transitRouterType(String transitRouterType) {
                this.transitRouterType = transitRouterType;
                return this;
            }

            /**
             * An array that consists of the CIDR blocks of the VPC.
             */
            public Builder vpcCidrTableList(java.util.List < VpcCidrTableList> vpcCidrTableList) {
                this.vpcCidrTableList = vpcCidrTableList;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The name of the VPC.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public LocalVpc build() {
                return new LocalVpc(this);
            } 

        } 

    }
}
