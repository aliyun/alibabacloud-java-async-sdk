// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVpcFirewallDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallDetailResponseBody</p>
 */
public class DescribeVpcFirewallDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.NameInMap("ConnectType")
    private String connectType;

    @com.aliyun.core.annotation.NameInMap("FirewallSwitchStatus")
    private String firewallSwitchStatus;

    @com.aliyun.core.annotation.NameInMap("LocalVpc")
    private LocalVpc localVpc;

    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.NameInMap("PeerVpc")
    private PeerVpc peerVpc;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
    private String vpcFirewallId;

    @com.aliyun.core.annotation.NameInMap("VpcFirewallName")
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
         * <p>The bandwidth of the Express Connect circuit. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The connection type of the VPC firewall. The value is fixed as <strong>expressconnect</strong>, which indicates Express Connect circuits.</p>
         * 
         * <strong>example:</strong>
         * <p>expressconnect</p>
         */
        public Builder connectType(String connectType) {
            this.connectType = connectType;
            return this;
        }

        /**
         * <p>The status of the VPC firewall. Valid values:</p>
         * <ul>
         * <li><strong>opened</strong>: The VPC firewall is enabled.</li>
         * <li><strong>closed</strong>: The VPC firewall is disabled.</li>
         * <li><strong>notconfigured</strong>: The VPC firewall is not configured.</li>
         * <li><strong>configured</strong>: The VPC firewall is configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>opened</p>
         */
        public Builder firewallSwitchStatus(String firewallSwitchStatus) {
            this.firewallSwitchStatus = firewallSwitchStatus;
            return this;
        }

        /**
         * <p>The details about the local VPC.</p>
         */
        public Builder localVpc(LocalVpc localVpc) {
            this.localVpc = localVpc;
            return this;
        }

        /**
         * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
        public Builder memberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }

        /**
         * <p>The details about the peer VPC.</p>
         */
        public Builder peerVpc(PeerVpc peerVpc) {
            this.peerVpc = peerVpc;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>850A84D6-0DE4-4797-A1E8-00090125g4d2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The instance ID of the VPC firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-m5e7dbc4y****</p>
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        /**
         * <p>The instance name of the VPC firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>tf-test</p>
         */
        public Builder vpcFirewallName(String vpcFirewallName) {
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }

        public DescribeVpcFirewallDetailResponseBody build() {
            return new DescribeVpcFirewallDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcFirewallDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallDetailResponseBody</p>
     */
    public static class RouteEntryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidr")
        private String destinationCidr;

        @com.aliyun.core.annotation.NameInMap("NextHopInstanceId")
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
             * <p>The destination CIDR block of the local VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX/24</p>
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * <p>The instance ID of the next hop for the local VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vrt-m5eb5me6c3l5sezae****</p>
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
    /**
     * 
     * {@link DescribeVpcFirewallDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallDetailResponseBody</p>
     */
    public static class VpcCidrTableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteEntryList")
        private java.util.List < RouteEntryList> routeEntryList;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
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
             * <p>The route entries of the local VPC.</p>
             */
            public Builder routeEntryList(java.util.List < RouteEntryList> routeEntryList) {
                this.routeEntryList = routeEntryList;
                return this;
            }

            /**
             * <p>The ID of the route table for the local VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-1234</p>
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
    /**
     * 
     * {@link DescribeVpcFirewallDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallDetailResponseBody</p>
     */
    public static class LocalVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EniId")
        private String eniId;

        @com.aliyun.core.annotation.NameInMap("EniPrivateIpAddress")
        private String eniPrivateIpAddress;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("RouterInterfaceId")
        private String routerInterfaceId;

        @com.aliyun.core.annotation.NameInMap("VpcCidrTableList")
        private java.util.List < VpcCidrTableList> vpcCidrTableList;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
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
             * <p>The ID of the ENI for the local VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-8vbhfosfqv2rff42****</p>
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * <p>The private IP address of the elastic network interface (ENI) for the local VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder eniPrivateIpAddress(String eniPrivateIpAddress) {
                this.eniPrivateIpAddress = eniPrivateIpAddress;
                return this;
            }

            /**
             * <p>The region ID of the local VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The router interface ID of the local VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vrt-m5eb5me6c3l5sezae****</p>
             */
            public Builder routerInterfaceId(String routerInterfaceId) {
                this.routerInterfaceId = routerInterfaceId;
                return this;
            }

            /**
             * <p>The CIDR blocks of the local VPC.</p>
             */
            public Builder vpcCidrTableList(java.util.List < VpcCidrTableList> vpcCidrTableList) {
                this.vpcCidrTableList = vpcCidrTableList;
                return this;
            }

            /**
             * <p>The ID of the local VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vbwbo90rq0anm6t****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The name of the local VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>Vitasoy</p>
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
    /**
     * 
     * {@link DescribeVpcFirewallDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallDetailResponseBody</p>
     */
    public static class VpcCidrTableListRouteEntryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidr")
        private String destinationCidr;

        @com.aliyun.core.annotation.NameInMap("NextHopInstanceId")
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
             * <p>The destination CIDR block of the peer VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX/24</p>
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * <p>The instance ID of the next hop for the peer VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vrt-m5eb5me6c3l5sezae****</p>
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
    /**
     * 
     * {@link DescribeVpcFirewallDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallDetailResponseBody</p>
     */
    public static class PeerVpcVpcCidrTableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteEntryList")
        private java.util.List < VpcCidrTableListRouteEntryList> routeEntryList;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
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
             * <p>The route entries of the peer VPC.</p>
             */
            public Builder routeEntryList(java.util.List < VpcCidrTableListRouteEntryList> routeEntryList) {
                this.routeEntryList = routeEntryList;
                return this;
            }

            /**
             * <p>The ID of the route table for the peer VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-1256</p>
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
    /**
     * 
     * {@link DescribeVpcFirewallDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallDetailResponseBody</p>
     */
    public static class PeerVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EniId")
        private String eniId;

        @com.aliyun.core.annotation.NameInMap("EniPrivateIpAddress")
        private String eniPrivateIpAddress;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("RouterInterfaceId")
        private String routerInterfaceId;

        @com.aliyun.core.annotation.NameInMap("VpcCidrTableList")
        private java.util.List < PeerVpcVpcCidrTableList> vpcCidrTableList;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
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
             * <p>The ID of the ENI for the peer VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-8vbhfosfqv2rff42****</p>
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * <p>The private IP address of the ENI for the peer VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder eniPrivateIpAddress(String eniPrivateIpAddress) {
                this.eniPrivateIpAddress = eniPrivateIpAddress;
                return this;
            }

            /**
             * <p>The region ID of the peer VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The router interface ID of the peer VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vrt-m5eb5me6c3l5sezae****</p>
             */
            public Builder routerInterfaceId(String routerInterfaceId) {
                this.routerInterfaceId = routerInterfaceId;
                return this;
            }

            /**
             * <p>The CIDR blocks of the peer VPC.</p>
             */
            public Builder vpcCidrTableList(java.util.List < PeerVpcVpcCidrTableList> vpcCidrTableList) {
                this.vpcCidrTableList = vpcCidrTableList;
                return this;
            }

            /**
             * <p>The ID of the peer VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-90rq0anm6t8vbwbo****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The name of the peer VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>zcy_prod</p>
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
