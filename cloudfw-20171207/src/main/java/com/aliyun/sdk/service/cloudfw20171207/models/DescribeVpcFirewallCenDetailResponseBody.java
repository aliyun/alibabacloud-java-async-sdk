// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeVpcFirewallCenDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallCenDetailResponseBody</p>
 */
public class DescribeVpcFirewallCenDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnectType")
    private String connectType;

    @com.aliyun.core.annotation.NameInMap("FirewallSwitchStatus")
    private String firewallSwitchStatus;

    @com.aliyun.core.annotation.NameInMap("FirewallVpc")
    private FirewallVpc firewallVpc;

    @com.aliyun.core.annotation.NameInMap("LocalVpc")
    private LocalVpc localVpc;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
    private String vpcFirewallId;

    @com.aliyun.core.annotation.NameInMap("VpcFirewallName")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeVpcFirewallCenDetailResponseBody model) {
            this.connectType = model.connectType;
            this.firewallSwitchStatus = model.firewallSwitchStatus;
            this.firewallVpc = model.firewallVpc;
            this.localVpc = model.localVpc;
            this.requestId = model.requestId;
            this.vpcFirewallId = model.vpcFirewallId;
            this.vpcFirewallName = model.vpcFirewallName;
        } 

        /**
         * <p>The connection type of the VPC firewall. The value is fixed as <strong>cen</strong>, which indicates CEN instances.</p>
         * 
         * <strong>example:</strong>
         * <p>cen</p>
         */
        public Builder connectType(String connectType) {
            this.connectType = connectType;
            return this;
        }

        /**
         * <p>The status of the VPC firewall. Valid values:</p>
         * <ul>
         * <li><strong>opened</strong>: enabled</li>
         * <li><strong>closed</strong>: disabled</li>
         * <li><strong>notconfigured</strong>: not configured</li>
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
         * <p>The firewall VPC.</p>
         */
        public Builder firewallVpc(FirewallVpc firewallVpc) {
            this.firewallVpc = firewallVpc;
            return this;
        }

        /**
         * <p>The details about the VPC.</p>
         */
        public Builder localVpc(LocalVpc localVpc) {
            this.localVpc = localVpc;
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
         * <p>Test firewall</p>
         */
        public Builder vpcFirewallName(String vpcFirewallName) {
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }

        public DescribeVpcFirewallCenDetailResponseBody build() {
            return new DescribeVpcFirewallCenDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcFirewallCenDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallCenDetailResponseBody</p>
     */
    public static class FirewallVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowConfiguration")
        private Integer allowConfiguration;

        @com.aliyun.core.annotation.NameInMap("StandbyZoneId")
        private String standbyZoneId;

        @com.aliyun.core.annotation.NameInMap("VpcCidr")
        private String vpcCidr;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchCidr")
        private String vswitchCidr;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("VswitchZoneId")
        private String vswitchZoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private FirewallVpc(Builder builder) {
            this.allowConfiguration = builder.allowConfiguration;
            this.standbyZoneId = builder.standbyZoneId;
            this.vpcCidr = builder.vpcCidr;
            this.vpcId = builder.vpcId;
            this.vswitchCidr = builder.vswitchCidr;
            this.vswitchId = builder.vswitchId;
            this.vswitchZoneId = builder.vswitchZoneId;
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
         * @return standbyZoneId
         */
        public String getStandbyZoneId() {
            return this.standbyZoneId;
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
         * @return vswitchZoneId
         */
        public String getVswitchZoneId() {
            return this.vswitchZoneId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer allowConfiguration; 
            private String standbyZoneId; 
            private String vpcCidr; 
            private String vpcId; 
            private String vswitchCidr; 
            private String vswitchId; 
            private String vswitchZoneId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(FirewallVpc model) {
                this.allowConfiguration = model.allowConfiguration;
                this.standbyZoneId = model.standbyZoneId;
                this.vpcCidr = model.vpcCidr;
                this.vpcId = model.vpcId;
                this.vswitchCidr = model.vswitchCidr;
                this.vswitchId = model.vswitchId;
                this.vswitchZoneId = model.vswitchZoneId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>Indicates whether you can specify a CIDR block when you create a VPC firewall for a Basic Edition transit router of a CEN instance. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder allowConfiguration(Integer allowConfiguration) {
                this.allowConfiguration = allowConfiguration;
                return this;
            }

            /**
             * <p>Firewall backup availability zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-k</p>
             */
            public Builder standbyZoneId(String standbyZoneId) {
                this.standbyZoneId = standbyZoneId;
                return this;
            }

            /**
             * <p>The CIDR block of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/8</p>
             */
            public Builder vpcCidr(String vpcCidr) {
                this.vpcCidr = vpcCidr;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1245k5oagy2bp74****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The CIDR block of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.1/24</p>
             */
            public Builder vswitchCidr(String vswitchCidr) {
                this.vswitchCidr = vswitchCidr;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1sqg9wms9wxcs1****</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * <p>The availability zone ID of the virtual switch.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder vswitchZoneId(String vswitchZoneId) {
                this.vswitchZoneId = vswitchZoneId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
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
    /**
     * 
     * {@link DescribeVpcFirewallCenDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallCenDetailResponseBody</p>
     */
    public static class EniList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EniId")
        private String eniId;

        @com.aliyun.core.annotation.NameInMap("EniPrivateIpAddress")
        private String eniPrivateIpAddress;

        @com.aliyun.core.annotation.NameInMap("EniVSwitchId")
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

            private Builder() {
            } 

            private Builder(EniList model) {
                this.eniId = model.eniId;
                this.eniPrivateIpAddress = model.eniPrivateIpAddress;
                this.eniVSwitchId = model.eniVSwitchId;
            } 

            /**
             * <p>The ID of the ENI that belongs to the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-8vbhfosfqv2rff42****</p>
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * <p>The private IP address of the ENI that belongs to the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder eniPrivateIpAddress(String eniPrivateIpAddress) {
                this.eniPrivateIpAddress = eniPrivateIpAddress;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the ENI is connected.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-wz9viido7j436b0n1****</p>
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
    /**
     * 
     * {@link DescribeVpcFirewallCenDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallCenDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(RouteEntryList model) {
                this.destinationCidr = model.destinationCidr;
                this.nextHopInstanceId = model.nextHopInstanceId;
            } 

            /**
             * <p>The destination CIDR block of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX/24</p>
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * <p>The instance ID of the next hop for the VPC.</p>
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
     * {@link DescribeVpcFirewallCenDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallCenDetailResponseBody</p>
     */
    public static class VpcCidrTableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteEntryList")
        private java.util.List<RouteEntryList> routeEntryList;

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
        public java.util.List<RouteEntryList> getRouteEntryList() {
            return this.routeEntryList;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private java.util.List<RouteEntryList> routeEntryList; 
            private String routeTableId; 

            private Builder() {
            } 

            private Builder(VpcCidrTableList model) {
                this.routeEntryList = model.routeEntryList;
                this.routeTableId = model.routeTableId;
            } 

            /**
             * <p>The route entries for the VPC.</p>
             */
            public Builder routeEntryList(java.util.List<RouteEntryList> routeEntryList) {
                this.routeEntryList = routeEntryList;
                return this;
            }

            /**
             * <p>The route table ID of the VPC.</p>
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
     * {@link DescribeVpcFirewallCenDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallCenDetailResponseBody</p>
     */
    public static class LocalVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachmentId")
        private String attachmentId;

        @com.aliyun.core.annotation.NameInMap("AttachmentName")
        private String attachmentName;

        @com.aliyun.core.annotation.NameInMap("DefendCidrList")
        private java.util.List<String> defendCidrList;

        @com.aliyun.core.annotation.NameInMap("EniList")
        private java.util.List<EniList> eniList;

        @com.aliyun.core.annotation.NameInMap("ManualVSwitchId")
        private String manualVSwitchId;

        @com.aliyun.core.annotation.NameInMap("NetworkInstanceId")
        private String networkInstanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkInstanceName")
        private String networkInstanceName;

        @com.aliyun.core.annotation.NameInMap("NetworkInstanceType")
        private String networkInstanceType;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("RouteMode")
        private String routeMode;

        @com.aliyun.core.annotation.NameInMap("SupportManualMode")
        private String supportManualMode;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterType")
        private String transitRouterType;

        @com.aliyun.core.annotation.NameInMap("VpcCidrTableList")
        private java.util.List<VpcCidrTableList> vpcCidrTableList;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
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
        public java.util.List<String> getDefendCidrList() {
            return this.defendCidrList;
        }

        /**
         * @return eniList
         */
        public java.util.List<EniList> getEniList() {
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
        public java.util.List<VpcCidrTableList> getVpcCidrTableList() {
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
            private java.util.List<String> defendCidrList; 
            private java.util.List<EniList> eniList; 
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
            private java.util.List<VpcCidrTableList> vpcCidrTableList; 
            private String vpcId; 
            private String vpcName; 

            private Builder() {
            } 

            private Builder(LocalVpc model) {
                this.attachmentId = model.attachmentId;
                this.attachmentName = model.attachmentName;
                this.defendCidrList = model.defendCidrList;
                this.eniList = model.eniList;
                this.manualVSwitchId = model.manualVSwitchId;
                this.networkInstanceId = model.networkInstanceId;
                this.networkInstanceName = model.networkInstanceName;
                this.networkInstanceType = model.networkInstanceType;
                this.ownerId = model.ownerId;
                this.regionNo = model.regionNo;
                this.routeMode = model.routeMode;
                this.supportManualMode = model.supportManualMode;
                this.transitRouterId = model.transitRouterId;
                this.transitRouterType = model.transitRouterType;
                this.vpcCidrTableList = model.vpcCidrTableList;
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
            } 

            /**
             * <p>The ID of the connection between two network instances.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-attach-sxig7bye51fid5****</p>
             */
            public Builder attachmentId(String attachmentId) {
                this.attachmentId = attachmentId;
                return this;
            }

            /**
             * <p>The name of the connection between two network instances.</p>
             * 
             * <strong>example:</strong>
             * <p>Local test</p>
             */
            public Builder attachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
                return this;
            }

            /**
             * <p>An array consisting of the CIDR blocks that are protected by the VPC firewall.</p>
             */
            public Builder defendCidrList(java.util.List<String> defendCidrList) {
                this.defendCidrList = defendCidrList;
                return this;
            }

            /**
             * <p>The Elastic Network Interfaces (ENIs).</p>
             */
            public Builder eniList(java.util.List<EniList> eniList) {
                this.eniList = eniList;
                return this;
            }

            /**
             * <p>The ID of the specified vSwitch when the routing mode is manual.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-zeq4o875u****</p>
             */
            public Builder manualVSwitchId(String manualVSwitchId) {
                this.manualVSwitchId = manualVSwitchId;
                return this;
            }

            /**
             * <p>The ID of the VPC for which the VPC firewall is created.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zefk9fbn8j7v585g****</p>
             */
            public Builder networkInstanceId(String networkInstanceId) {
                this.networkInstanceId = networkInstanceId;
                return this;
            }

            /**
             * <p>The name of the network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Test VPC</p>
             */
            public Builder networkInstanceName(String networkInstanceName) {
                this.networkInstanceName = networkInstanceName;
                return this;
            }

            /**
             * <p>The type of the network instance. The value is fixed as <strong>VPC</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkInstanceType(String networkInstanceType) {
                this.networkInstanceType = networkInstanceType;
                return this;
            }

            /**
             * <p>The UID of the Alibaba Cloud account to which the VPC belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>158039427902****</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The ID of the region in which the VPC resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The routing mode. Valid values:</p>
             * <ul>
             * <li>auto: automatic mode</li>
             * <li>manual: manual mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder routeMode(String routeMode) {
                this.routeMode = routeMode;
                return this;
            }

            /**
             * <p>Indicates whether the manual routing mode is supported. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder supportManualMode(String supportManualMode) {
                this.supportManualMode = supportManualMode;
                return this;
            }

            /**
             * <p>The instance ID of the CEN transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-2zetwxskej633l3u1****</p>
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * <p>The edition of the CEN transit router. Valid values:</p>
             * <ul>
             * <li><strong>Basic</strong>: Basic Edition</li>
             * <li><strong>Enterprise</strong>: Enterprise Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Basic</p>
             */
            public Builder transitRouterType(String transitRouterType) {
                this.transitRouterType = transitRouterType;
                return this;
            }

            /**
             * <p>An array that consists of the CIDR blocks of the VPC.</p>
             */
            public Builder vpcCidrTableList(java.util.List<VpcCidrTableList> vpcCidrTableList) {
                this.vpcCidrTableList = vpcCidrTableList;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vbwbo90rq0anm6t****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The name of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>Test instance</p>
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
