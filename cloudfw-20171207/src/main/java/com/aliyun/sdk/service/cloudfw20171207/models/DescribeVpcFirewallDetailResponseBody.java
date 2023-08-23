// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallDetailResponseBody</p>
 */
public class DescribeVpcFirewallDetailResponseBody extends TeaModel {
    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @NameInMap("ConnectType")
    private String connectType;

    @NameInMap("FirewallSwitchStatus")
    private String firewallSwitchStatus;

    @NameInMap("LocalVpc")
    private LocalVpc localVpc;

    @NameInMap("MemberUid")
    private String memberUid;

    @NameInMap("PeerVpc")
    private PeerVpc peerVpc;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VpcFirewallId")
    private String vpcFirewallId;

    @NameInMap("VpcFirewallName")
    private String vpcFirewallName;

    private DescribeVpcFirewallDetailResponseBody(Builder builder) {
        this.bandwidth = builder.bandwidth;
        this.connectType = builder.connectType;
        this.firewallSwitchStatus = builder.firewallSwitchStatus;
        this.localVpc = builder.localVpc;
        this.memberUid = builder.memberUid;
        this.peerVpc = builder.peerVpc;
        this.requestId = builder.requestId;
        this.vpcFirewallId = builder.vpcFirewallId;
        this.vpcFirewallName = builder.vpcFirewallName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
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
     * @return localVpc
     */
    public LocalVpc getLocalVpc() {
        return this.localVpc;
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return peerVpc
     */
    public PeerVpc getPeerVpc() {
        return this.peerVpc;
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
        private Integer bandwidth; 
        private String connectType; 
        private String firewallSwitchStatus; 
        private LocalVpc localVpc; 
        private String memberUid; 
        private PeerVpc peerVpc; 
        private String requestId; 
        private String vpcFirewallId; 
        private String vpcFirewallName; 

        /**
         * The bandwidth of the Express Connect circuit. Unit: Mbit/s.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The connection type of the VPC firewall. The value is fixed as **expressconnect**, which indicates Express Connect circuits.
         */
        public Builder connectType(String connectType) {
            this.connectType = connectType;
            return this;
        }

        /**
         * The status of the VPC firewall. Valid values:
         * <p>
         * 
         * *   **opened**: The VPC firewall is enabled.
         * *   **closed**: The VPC firewall is disabled.
         * *   **notconfigured**: The VPC firewall is not configured.
         * *   **configured**: The VPC firewall is configured.
         */
        public Builder firewallSwitchStatus(String firewallSwitchStatus) {
            this.firewallSwitchStatus = firewallSwitchStatus;
            return this;
        }

        /**
         * The details about the local VPC.
         */
        public Builder localVpc(LocalVpc localVpc) {
            this.localVpc = localVpc;
            return this;
        }

        /**
         * The UID of the member that is managed by your Alibaba Cloud account.
         */
        public Builder memberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }

        /**
         * The details about the peer VPC.
         */
        public Builder peerVpc(PeerVpc peerVpc) {
            this.peerVpc = peerVpc;
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

        public DescribeVpcFirewallDetailResponseBody build() {
            return new DescribeVpcFirewallDetailResponseBody(this);
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
             * The destination CIDR block of the local VPC.
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * The instance ID of the next hop for the local VPC.
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
             * The route entries of the local VPC.
             */
            public Builder routeEntryList(java.util.List < RouteEntryList> routeEntryList) {
                this.routeEntryList = routeEntryList;
                return this;
            }

            /**
             * The ID of the route table for the local VPC.
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
        @NameInMap("EniId")
        private String eniId;

        @NameInMap("EniPrivateIpAddress")
        private String eniPrivateIpAddress;

        @NameInMap("RegionNo")
        private String regionNo;

        @NameInMap("RouterInterfaceId")
        private String routerInterfaceId;

        @NameInMap("VpcCidrTableList")
        private java.util.List < VpcCidrTableList> vpcCidrTableList;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
        private String vpcName;

        private LocalVpc(Builder builder) {
            this.eniId = builder.eniId;
            this.eniPrivateIpAddress = builder.eniPrivateIpAddress;
            this.regionNo = builder.regionNo;
            this.routerInterfaceId = builder.routerInterfaceId;
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
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return routerInterfaceId
         */
        public String getRouterInterfaceId() {
            return this.routerInterfaceId;
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
            private String eniId; 
            private String eniPrivateIpAddress; 
            private String regionNo; 
            private String routerInterfaceId; 
            private java.util.List < VpcCidrTableList> vpcCidrTableList; 
            private String vpcId; 
            private String vpcName; 

            /**
             * The ID of the ENI for the local VPC.
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * The private IP address of the elastic network interface (ENI) for the local VPC.
             */
            public Builder eniPrivateIpAddress(String eniPrivateIpAddress) {
                this.eniPrivateIpAddress = eniPrivateIpAddress;
                return this;
            }

            /**
             * The region ID of the local VPC.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * The router interface ID of the local VPC.
             */
            public Builder routerInterfaceId(String routerInterfaceId) {
                this.routerInterfaceId = routerInterfaceId;
                return this;
            }

            /**
             * The CIDR blocks of the local VPC.
             */
            public Builder vpcCidrTableList(java.util.List < VpcCidrTableList> vpcCidrTableList) {
                this.vpcCidrTableList = vpcCidrTableList;
                return this;
            }

            /**
             * The ID of the local VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The name of the local VPC.
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
    public static class VpcCidrTableListRouteEntryList extends TeaModel {
        @NameInMap("DestinationCidr")
        private String destinationCidr;

        @NameInMap("NextHopInstanceId")
        private String nextHopInstanceId;

        private VpcCidrTableListRouteEntryList(Builder builder) {
            this.destinationCidr = builder.destinationCidr;
            this.nextHopInstanceId = builder.nextHopInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcCidrTableListRouteEntryList create() {
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
             * The destination CIDR block of the peer VPC.
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * The instance ID of the next hop for the peer VPC.
             */
            public Builder nextHopInstanceId(String nextHopInstanceId) {
                this.nextHopInstanceId = nextHopInstanceId;
                return this;
            }

            public VpcCidrTableListRouteEntryList build() {
                return new VpcCidrTableListRouteEntryList(this);
            } 

        } 

    }
    public static class PeerVpcVpcCidrTableList extends TeaModel {
        @NameInMap("RouteEntryList")
        private java.util.List < VpcCidrTableListRouteEntryList> routeEntryList;

        @NameInMap("RouteTableId")
        private String routeTableId;

        private PeerVpcVpcCidrTableList(Builder builder) {
            this.routeEntryList = builder.routeEntryList;
            this.routeTableId = builder.routeTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeerVpcVpcCidrTableList create() {
            return builder().build();
        }

        /**
         * @return routeEntryList
         */
        public java.util.List < VpcCidrTableListRouteEntryList> getRouteEntryList() {
            return this.routeEntryList;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private java.util.List < VpcCidrTableListRouteEntryList> routeEntryList; 
            private String routeTableId; 

            /**
             * The route entries of the peer VPC.
             */
            public Builder routeEntryList(java.util.List < VpcCidrTableListRouteEntryList> routeEntryList) {
                this.routeEntryList = routeEntryList;
                return this;
            }

            /**
             * The ID of the route table for the peer VPC.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            public PeerVpcVpcCidrTableList build() {
                return new PeerVpcVpcCidrTableList(this);
            } 

        } 

    }
    public static class PeerVpc extends TeaModel {
        @NameInMap("EniId")
        private String eniId;

        @NameInMap("EniPrivateIpAddress")
        private String eniPrivateIpAddress;

        @NameInMap("RegionNo")
        private String regionNo;

        @NameInMap("RouterInterfaceId")
        private String routerInterfaceId;

        @NameInMap("VpcCidrTableList")
        private java.util.List < PeerVpcVpcCidrTableList> vpcCidrTableList;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
        private String vpcName;

        private PeerVpc(Builder builder) {
            this.eniId = builder.eniId;
            this.eniPrivateIpAddress = builder.eniPrivateIpAddress;
            this.regionNo = builder.regionNo;
            this.routerInterfaceId = builder.routerInterfaceId;
            this.vpcCidrTableList = builder.vpcCidrTableList;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeerVpc create() {
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
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return routerInterfaceId
         */
        public String getRouterInterfaceId() {
            return this.routerInterfaceId;
        }

        /**
         * @return vpcCidrTableList
         */
        public java.util.List < PeerVpcVpcCidrTableList> getVpcCidrTableList() {
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
            private String eniId; 
            private String eniPrivateIpAddress; 
            private String regionNo; 
            private String routerInterfaceId; 
            private java.util.List < PeerVpcVpcCidrTableList> vpcCidrTableList; 
            private String vpcId; 
            private String vpcName; 

            /**
             * The ID of the ENI for the peer VPC.
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * The private IP address of the ENI for the peer VPC.
             */
            public Builder eniPrivateIpAddress(String eniPrivateIpAddress) {
                this.eniPrivateIpAddress = eniPrivateIpAddress;
                return this;
            }

            /**
             * The region ID of the peer VPC.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * The router interface ID of the peer VPC.
             */
            public Builder routerInterfaceId(String routerInterfaceId) {
                this.routerInterfaceId = routerInterfaceId;
                return this;
            }

            /**
             * The CIDR blocks of the peer VPC.
             */
            public Builder vpcCidrTableList(java.util.List < PeerVpcVpcCidrTableList> vpcCidrTableList) {
                this.vpcCidrTableList = vpcCidrTableList;
                return this;
            }

            /**
             * The ID of the peer VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The name of the peer VPC.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public PeerVpc build() {
                return new PeerVpc(this);
            } 

        } 

    }
}
