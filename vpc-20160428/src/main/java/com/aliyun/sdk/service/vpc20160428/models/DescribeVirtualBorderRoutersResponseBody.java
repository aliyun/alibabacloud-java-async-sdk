// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVirtualBorderRoutersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVirtualBorderRoutersResponseBody</p>
 */
public class DescribeVirtualBorderRoutersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VirtualBorderRouterSet")
    private VirtualBorderRouterSet virtualBorderRouterSet;

    private DescribeVirtualBorderRoutersResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.virtualBorderRouterSet = builder.virtualBorderRouterSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVirtualBorderRoutersResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return virtualBorderRouterSet
     */
    public VirtualBorderRouterSet getVirtualBorderRouterSet() {
        return this.virtualBorderRouterSet;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private VirtualBorderRouterSet virtualBorderRouterSet; 

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: <strong>1 to 50</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The information about the VBR.</p>
         */
        public Builder virtualBorderRouterSet(VirtualBorderRouterSet virtualBorderRouterSet) {
            this.virtualBorderRouterSet = virtualBorderRouterSet;
            return this;
        }

        public DescribeVirtualBorderRoutersResponseBody build() {
            return new DescribeVirtualBorderRoutersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVirtualBorderRoutersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualBorderRoutersResponseBody</p>
     */
    public static class AssociatedCen extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CenOwnerId")
        private Long cenOwnerId;

        @com.aliyun.core.annotation.NameInMap("CenStatus")
        private String cenStatus;

        private AssociatedCen(Builder builder) {
            this.cenId = builder.cenId;
            this.cenOwnerId = builder.cenOwnerId;
            this.cenStatus = builder.cenStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedCen create() {
            return builder().build();
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return cenOwnerId
         */
        public Long getCenOwnerId() {
            return this.cenOwnerId;
        }

        /**
         * @return cenStatus
         */
        public String getCenStatus() {
            return this.cenStatus;
        }

        public static final class Builder {
            private String cenId; 
            private Long cenOwnerId; 
            private String cenStatus; 

            /**
             * <p>The CEN instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-kojok19xxx****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The ID of the account to which the CEN instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1688000000000****</p>
             */
            public Builder cenOwnerId(Long cenOwnerId) {
                this.cenOwnerId = cenOwnerId;
                return this;
            }

            /**
             * <p>The status of the CEN instance. Valid values:</p>
             * <ul>
             * <li><strong>Attached</strong></li>
             * <li><strong>Attaching</strong></li>
             * <li><strong>Detached</strong></li>
             * <li><strong>Detaching</strong></li>
             * <li>If no value is returned, the VBR is not attached to a CEN instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Attached</p>
             */
            public Builder cenStatus(String cenStatus) {
                this.cenStatus = cenStatus;
                return this;
            }

            public AssociatedCen build() {
                return new AssociatedCen(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVirtualBorderRoutersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualBorderRoutersResponseBody</p>
     */
    public static class AssociatedCens extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedCen")
        private java.util.List < AssociatedCen> associatedCen;

        private AssociatedCens(Builder builder) {
            this.associatedCen = builder.associatedCen;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedCens create() {
            return builder().build();
        }

        /**
         * @return associatedCen
         */
        public java.util.List < AssociatedCen> getAssociatedCen() {
            return this.associatedCen;
        }

        public static final class Builder {
            private java.util.List < AssociatedCen> associatedCen; 

            /**
             * AssociatedCen.
             */
            public Builder associatedCen(java.util.List < AssociatedCen> associatedCen) {
                this.associatedCen = associatedCen;
                return this;
            }

            public AssociatedCens build() {
                return new AssociatedCens(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVirtualBorderRoutersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualBorderRoutersResponseBody</p>
     */
    public static class AssociatedPhysicalConnection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CircuitCode")
        private String circuitCode;

        @com.aliyun.core.annotation.NameInMap("EnableIpv6")
        private Boolean enableIpv6;

        @com.aliyun.core.annotation.NameInMap("LocalGatewayIp")
        private String localGatewayIp;

        @com.aliyun.core.annotation.NameInMap("LocalIpv6GatewayIp")
        private String localIpv6GatewayIp;

        @com.aliyun.core.annotation.NameInMap("PeerGatewayIp")
        private String peerGatewayIp;

        @com.aliyun.core.annotation.NameInMap("PeerIpv6GatewayIp")
        private String peerIpv6GatewayIp;

        @com.aliyun.core.annotation.NameInMap("PeeringIpv6SubnetMask")
        private String peeringIpv6SubnetMask;

        @com.aliyun.core.annotation.NameInMap("PeeringSubnetMask")
        private String peeringSubnetMask;

        @com.aliyun.core.annotation.NameInMap("PhysicalConnectionBusinessStatus")
        private String physicalConnectionBusinessStatus;

        @com.aliyun.core.annotation.NameInMap("PhysicalConnectionId")
        private String physicalConnectionId;

        @com.aliyun.core.annotation.NameInMap("PhysicalConnectionOwnerUid")
        private String physicalConnectionOwnerUid;

        @com.aliyun.core.annotation.NameInMap("PhysicalConnectionStatus")
        private String physicalConnectionStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VlanId")
        private String vlanId;

        @com.aliyun.core.annotation.NameInMap("VlanInterfaceId")
        private String vlanInterfaceId;

        private AssociatedPhysicalConnection(Builder builder) {
            this.circuitCode = builder.circuitCode;
            this.enableIpv6 = builder.enableIpv6;
            this.localGatewayIp = builder.localGatewayIp;
            this.localIpv6GatewayIp = builder.localIpv6GatewayIp;
            this.peerGatewayIp = builder.peerGatewayIp;
            this.peerIpv6GatewayIp = builder.peerIpv6GatewayIp;
            this.peeringIpv6SubnetMask = builder.peeringIpv6SubnetMask;
            this.peeringSubnetMask = builder.peeringSubnetMask;
            this.physicalConnectionBusinessStatus = builder.physicalConnectionBusinessStatus;
            this.physicalConnectionId = builder.physicalConnectionId;
            this.physicalConnectionOwnerUid = builder.physicalConnectionOwnerUid;
            this.physicalConnectionStatus = builder.physicalConnectionStatus;
            this.status = builder.status;
            this.vlanId = builder.vlanId;
            this.vlanInterfaceId = builder.vlanInterfaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedPhysicalConnection create() {
            return builder().build();
        }

        /**
         * @return circuitCode
         */
        public String getCircuitCode() {
            return this.circuitCode;
        }

        /**
         * @return enableIpv6
         */
        public Boolean getEnableIpv6() {
            return this.enableIpv6;
        }

        /**
         * @return localGatewayIp
         */
        public String getLocalGatewayIp() {
            return this.localGatewayIp;
        }

        /**
         * @return localIpv6GatewayIp
         */
        public String getLocalIpv6GatewayIp() {
            return this.localIpv6GatewayIp;
        }

        /**
         * @return peerGatewayIp
         */
        public String getPeerGatewayIp() {
            return this.peerGatewayIp;
        }

        /**
         * @return peerIpv6GatewayIp
         */
        public String getPeerIpv6GatewayIp() {
            return this.peerIpv6GatewayIp;
        }

        /**
         * @return peeringIpv6SubnetMask
         */
        public String getPeeringIpv6SubnetMask() {
            return this.peeringIpv6SubnetMask;
        }

        /**
         * @return peeringSubnetMask
         */
        public String getPeeringSubnetMask() {
            return this.peeringSubnetMask;
        }

        /**
         * @return physicalConnectionBusinessStatus
         */
        public String getPhysicalConnectionBusinessStatus() {
            return this.physicalConnectionBusinessStatus;
        }

        /**
         * @return physicalConnectionId
         */
        public String getPhysicalConnectionId() {
            return this.physicalConnectionId;
        }

        /**
         * @return physicalConnectionOwnerUid
         */
        public String getPhysicalConnectionOwnerUid() {
            return this.physicalConnectionOwnerUid;
        }

        /**
         * @return physicalConnectionStatus
         */
        public String getPhysicalConnectionStatus() {
            return this.physicalConnectionStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vlanId
         */
        public String getVlanId() {
            return this.vlanId;
        }

        /**
         * @return vlanInterfaceId
         */
        public String getVlanInterfaceId() {
            return this.vlanInterfaceId;
        }

        public static final class Builder {
            private String circuitCode; 
            private Boolean enableIpv6; 
            private String localGatewayIp; 
            private String localIpv6GatewayIp; 
            private String peerGatewayIp; 
            private String peerIpv6GatewayIp; 
            private String peeringIpv6SubnetMask; 
            private String peeringSubnetMask; 
            private String physicalConnectionBusinessStatus; 
            private String physicalConnectionId; 
            private String physicalConnectionOwnerUid; 
            private String physicalConnectionStatus; 
            private String status; 
            private String vlanId; 
            private String vlanInterfaceId; 

            /**
             * <p>The circuit code of the Express Connect circuit, which is provided by the connectivity provider.</p>
             * 
             * <strong>example:</strong>
             * <p>longtel0**</p>
             */
            public Builder circuitCode(String circuitCode) {
                this.circuitCode = circuitCode;
                return this;
            }

            /**
             * <p>Indicates whether IPv6 is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableIpv6(Boolean enableIpv6) {
                this.enableIpv6 = enableIpv6;
                return this;
            }

            /**
             * <p>The IPv4 address of the VBR on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder localGatewayIp(String localGatewayIp) {
                this.localGatewayIp = localGatewayIp;
                return this;
            }

            /**
             * <p>The IPv6 address of the VBR on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>2001:XXXX:3c4d:0015:0000:0000:0000:1a2b</p>
             */
            public Builder localIpv6GatewayIp(String localIpv6GatewayIp) {
                this.localIpv6GatewayIp = localIpv6GatewayIp;
                return this;
            }

            /**
             * <p>The IPv4 address of the VBR on the user side.</p>
             * 
             * <strong>example:</strong>
             * <p>116.62.XX.XX</p>
             */
            public Builder peerGatewayIp(String peerGatewayIp) {
                this.peerGatewayIp = peerGatewayIp;
                return this;
            }

            /**
             * <p>The IPv6 address of the VBR on the user side.</p>
             * 
             * <strong>example:</strong>
             * <p>2001:XXXX:3c4d:0015:0000:0000:0000:1a2b</p>
             */
            public Builder peerIpv6GatewayIp(String peerIpv6GatewayIp) {
                this.peerIpv6GatewayIp = peerIpv6GatewayIp;
                return this;
            }

            /**
             * <p>The subnet mask for the IPv6 addresses on the user side and on the Alibaba Cloud side.</p>
             * <p>Both IPv6 addresses must belong to the same subnet.</p>
             * 
             * <strong>example:</strong>
             * <p>2408:4004:cc:400::/56</p>
             */
            public Builder peeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
                this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
                return this;
            }

            /**
             * <p>The subnet mask for the IPv4 addresses of the VBR on the user side and on the Alibaba Cloud side.</p>
             * <p>Both IPv4 addresses must belong to the same subnet.</p>
             * 
             * <strong>example:</strong>
             * <p>255.255.255.252</p>
             */
            public Builder peeringSubnetMask(String peeringSubnetMask) {
                this.peeringSubnetMask = peeringSubnetMask;
                return this;
            }

            /**
             * <p>The business status of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>Normal:</strong> The Express Connect circuit is running as normal.</li>
             * <li><strong>FinancialLocked:</strong> The Express Connect circuit is locked due to overdue payments.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder physicalConnectionBusinessStatus(String physicalConnectionBusinessStatus) {
                this.physicalConnectionBusinessStatus = physicalConnectionBusinessStatus;
                return this;
            }

            /**
             * <p>The ID of the Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-119mfjzm7****</p>
             */
            public Builder physicalConnectionId(String physicalConnectionId) {
                this.physicalConnectionId = physicalConnectionId;
                return this;
            }

            /**
             * <p>The ID of the account to which the Express Connect circuit belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678****</p>
             */
            public Builder physicalConnectionOwnerUid(String physicalConnectionOwnerUid) {
                this.physicalConnectionOwnerUid = physicalConnectionOwnerUid;
                return this;
            }

            /**
             * <p>The status of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>Initial:</strong> The application is under review.</li>
             * <li><strong>Approved</strong>: The application is approved.</li>
             * <li><strong>Allocating</strong>: The system is allocating resources.</li>
             * <li><strong>Allocated</strong>: The Express Connect circuit is under construction.</li>
             * <li><strong>Confirmed</strong>: The Express Connect circuit is to be confirmed.</li>
             * <li><strong>Enabled</strong>: The Express Connect circuit is enabled.</li>
             * <li><strong>Rejected</strong>: The application is rejected.</li>
             * <li><strong>Canceled</strong>: The application is canceled.</li>
             * <li><strong>Allocation Failed:</strong> The system failed to allocate resources.</li>
             * <li><strong>Terminated:</strong> The Express Connect circuit is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder physicalConnectionStatus(String physicalConnectionStatus) {
                this.physicalConnectionStatus = physicalConnectionStatus;
                return this;
            }

            /**
             * <p>The status of the VBR. Valid values:</p>
             * <ul>
             * <li><strong>unconfirmed</strong></li>
             * <li><strong>active:</strong></li>
             * <li><strong>terminating</strong></li>
             * <li><strong>terminated</strong></li>
             * <li><strong>recovering</strong></li>
             * <li><strong>deleting:</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The VLAN ID of the VBR.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vlanId(String vlanId) {
                this.vlanId = vlanId;
                return this;
            }

            /**
             * <p>The ID of the VBR interface, which can be used as a next hop of a VBR route.</p>
             * 
             * <strong>example:</strong>
             * <p>ri-kojok19x3j0q6k****</p>
             */
            public Builder vlanInterfaceId(String vlanInterfaceId) {
                this.vlanInterfaceId = vlanInterfaceId;
                return this;
            }

            public AssociatedPhysicalConnection build() {
                return new AssociatedPhysicalConnection(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVirtualBorderRoutersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualBorderRoutersResponseBody</p>
     */
    public static class AssociatedPhysicalConnections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedPhysicalConnection")
        private java.util.List < AssociatedPhysicalConnection> associatedPhysicalConnection;

        private AssociatedPhysicalConnections(Builder builder) {
            this.associatedPhysicalConnection = builder.associatedPhysicalConnection;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedPhysicalConnections create() {
            return builder().build();
        }

        /**
         * @return associatedPhysicalConnection
         */
        public java.util.List < AssociatedPhysicalConnection> getAssociatedPhysicalConnection() {
            return this.associatedPhysicalConnection;
        }

        public static final class Builder {
            private java.util.List < AssociatedPhysicalConnection> associatedPhysicalConnection; 

            /**
             * AssociatedPhysicalConnection.
             */
            public Builder associatedPhysicalConnection(java.util.List < AssociatedPhysicalConnection> associatedPhysicalConnection) {
                this.associatedPhysicalConnection = associatedPhysicalConnection;
                return this;
            }

            public AssociatedPhysicalConnections build() {
                return new AssociatedPhysicalConnections(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVirtualBorderRoutersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualBorderRoutersResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVirtualBorderRoutersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualBorderRoutersResponseBody</p>
     */
    public static class VirtualBorderRouterTypeTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        private VirtualBorderRouterTypeTags(Builder builder) {
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualBorderRouterTypeTags create() {
            return builder().build();
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List < Tags> tags; 

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public VirtualBorderRouterTypeTags build() {
                return new VirtualBorderRouterTypeTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVirtualBorderRoutersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualBorderRoutersResponseBody</p>
     */
    public static class VirtualBorderRouterType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessPointId")
        private String accessPointId;

        @com.aliyun.core.annotation.NameInMap("ActivationTime")
        private String activationTime;

        @com.aliyun.core.annotation.NameInMap("AssociatedCens")
        private AssociatedCens associatedCens;

        @com.aliyun.core.annotation.NameInMap("AssociatedPhysicalConnections")
        private AssociatedPhysicalConnections associatedPhysicalConnections;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("CircuitCode")
        private String circuitCode;

        @com.aliyun.core.annotation.NameInMap("CloudBoxInstanceId")
        private String cloudBoxInstanceId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DetectMultiplier")
        private Long detectMultiplier;

        @com.aliyun.core.annotation.NameInMap("EccId")
        private String eccId;

        @com.aliyun.core.annotation.NameInMap("EcrAttatchStatus")
        private String ecrAttatchStatus;

        @com.aliyun.core.annotation.NameInMap("EcrId")
        private String ecrId;

        @com.aliyun.core.annotation.NameInMap("EcrOwnerId")
        private String ecrOwnerId;

        @com.aliyun.core.annotation.NameInMap("EnableIpv6")
        private Boolean enableIpv6;

        @com.aliyun.core.annotation.NameInMap("LocalGatewayIp")
        private String localGatewayIp;

        @com.aliyun.core.annotation.NameInMap("LocalIpv6GatewayIp")
        private String localIpv6GatewayIp;

        @com.aliyun.core.annotation.NameInMap("MinRxInterval")
        private Long minRxInterval;

        @com.aliyun.core.annotation.NameInMap("MinTxInterval")
        private Long minTxInterval;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PConnVbrChargeType")
        private String pConnVbrChargeType;

        @com.aliyun.core.annotation.NameInMap("PConnVbrExpireTime")
        private String pConnVbrExpireTime;

        @com.aliyun.core.annotation.NameInMap("PeerGatewayIp")
        private String peerGatewayIp;

        @com.aliyun.core.annotation.NameInMap("PeerIpv6GatewayIp")
        private String peerIpv6GatewayIp;

        @com.aliyun.core.annotation.NameInMap("PeeringIpv6SubnetMask")
        private String peeringIpv6SubnetMask;

        @com.aliyun.core.annotation.NameInMap("PeeringSubnetMask")
        private String peeringSubnetMask;

        @com.aliyun.core.annotation.NameInMap("PhysicalConnectionBusinessStatus")
        private String physicalConnectionBusinessStatus;

        @com.aliyun.core.annotation.NameInMap("PhysicalConnectionId")
        private String physicalConnectionId;

        @com.aliyun.core.annotation.NameInMap("PhysicalConnectionOwnerUid")
        private String physicalConnectionOwnerUid;

        @com.aliyun.core.annotation.NameInMap("PhysicalConnectionStatus")
        private String physicalConnectionStatus;

        @com.aliyun.core.annotation.NameInMap("RecoveryTime")
        private String recoveryTime;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        @com.aliyun.core.annotation.NameInMap("SitelinkEnable")
        private Boolean sitelinkEnable;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private VirtualBorderRouterTypeTags tags;

        @com.aliyun.core.annotation.NameInMap("TerminationTime")
        private String terminationTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VbrId")
        private String vbrId;

        @com.aliyun.core.annotation.NameInMap("VlanId")
        private Integer vlanId;

        @com.aliyun.core.annotation.NameInMap("VlanInterfaceId")
        private String vlanInterfaceId;

        private VirtualBorderRouterType(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.activationTime = builder.activationTime;
            this.associatedCens = builder.associatedCens;
            this.associatedPhysicalConnections = builder.associatedPhysicalConnections;
            this.bandwidth = builder.bandwidth;
            this.circuitCode = builder.circuitCode;
            this.cloudBoxInstanceId = builder.cloudBoxInstanceId;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.detectMultiplier = builder.detectMultiplier;
            this.eccId = builder.eccId;
            this.ecrAttatchStatus = builder.ecrAttatchStatus;
            this.ecrId = builder.ecrId;
            this.ecrOwnerId = builder.ecrOwnerId;
            this.enableIpv6 = builder.enableIpv6;
            this.localGatewayIp = builder.localGatewayIp;
            this.localIpv6GatewayIp = builder.localIpv6GatewayIp;
            this.minRxInterval = builder.minRxInterval;
            this.minTxInterval = builder.minTxInterval;
            this.name = builder.name;
            this.pConnVbrChargeType = builder.pConnVbrChargeType;
            this.pConnVbrExpireTime = builder.pConnVbrExpireTime;
            this.peerGatewayIp = builder.peerGatewayIp;
            this.peerIpv6GatewayIp = builder.peerIpv6GatewayIp;
            this.peeringIpv6SubnetMask = builder.peeringIpv6SubnetMask;
            this.peeringSubnetMask = builder.peeringSubnetMask;
            this.physicalConnectionBusinessStatus = builder.physicalConnectionBusinessStatus;
            this.physicalConnectionId = builder.physicalConnectionId;
            this.physicalConnectionOwnerUid = builder.physicalConnectionOwnerUid;
            this.physicalConnectionStatus = builder.physicalConnectionStatus;
            this.recoveryTime = builder.recoveryTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.routeTableId = builder.routeTableId;
            this.sitelinkEnable = builder.sitelinkEnable;
            this.status = builder.status;
            this.tags = builder.tags;
            this.terminationTime = builder.terminationTime;
            this.type = builder.type;
            this.vbrId = builder.vbrId;
            this.vlanId = builder.vlanId;
            this.vlanInterfaceId = builder.vlanInterfaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualBorderRouterType create() {
            return builder().build();
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return activationTime
         */
        public String getActivationTime() {
            return this.activationTime;
        }

        /**
         * @return associatedCens
         */
        public AssociatedCens getAssociatedCens() {
            return this.associatedCens;
        }

        /**
         * @return associatedPhysicalConnections
         */
        public AssociatedPhysicalConnections getAssociatedPhysicalConnections() {
            return this.associatedPhysicalConnections;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return circuitCode
         */
        public String getCircuitCode() {
            return this.circuitCode;
        }

        /**
         * @return cloudBoxInstanceId
         */
        public String getCloudBoxInstanceId() {
            return this.cloudBoxInstanceId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return detectMultiplier
         */
        public Long getDetectMultiplier() {
            return this.detectMultiplier;
        }

        /**
         * @return eccId
         */
        public String getEccId() {
            return this.eccId;
        }

        /**
         * @return ecrAttatchStatus
         */
        public String getEcrAttatchStatus() {
            return this.ecrAttatchStatus;
        }

        /**
         * @return ecrId
         */
        public String getEcrId() {
            return this.ecrId;
        }

        /**
         * @return ecrOwnerId
         */
        public String getEcrOwnerId() {
            return this.ecrOwnerId;
        }

        /**
         * @return enableIpv6
         */
        public Boolean getEnableIpv6() {
            return this.enableIpv6;
        }

        /**
         * @return localGatewayIp
         */
        public String getLocalGatewayIp() {
            return this.localGatewayIp;
        }

        /**
         * @return localIpv6GatewayIp
         */
        public String getLocalIpv6GatewayIp() {
            return this.localIpv6GatewayIp;
        }

        /**
         * @return minRxInterval
         */
        public Long getMinRxInterval() {
            return this.minRxInterval;
        }

        /**
         * @return minTxInterval
         */
        public Long getMinTxInterval() {
            return this.minTxInterval;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pConnVbrChargeType
         */
        public String getPConnVbrChargeType() {
            return this.pConnVbrChargeType;
        }

        /**
         * @return pConnVbrExpireTime
         */
        public String getPConnVbrExpireTime() {
            return this.pConnVbrExpireTime;
        }

        /**
         * @return peerGatewayIp
         */
        public String getPeerGatewayIp() {
            return this.peerGatewayIp;
        }

        /**
         * @return peerIpv6GatewayIp
         */
        public String getPeerIpv6GatewayIp() {
            return this.peerIpv6GatewayIp;
        }

        /**
         * @return peeringIpv6SubnetMask
         */
        public String getPeeringIpv6SubnetMask() {
            return this.peeringIpv6SubnetMask;
        }

        /**
         * @return peeringSubnetMask
         */
        public String getPeeringSubnetMask() {
            return this.peeringSubnetMask;
        }

        /**
         * @return physicalConnectionBusinessStatus
         */
        public String getPhysicalConnectionBusinessStatus() {
            return this.physicalConnectionBusinessStatus;
        }

        /**
         * @return physicalConnectionId
         */
        public String getPhysicalConnectionId() {
            return this.physicalConnectionId;
        }

        /**
         * @return physicalConnectionOwnerUid
         */
        public String getPhysicalConnectionOwnerUid() {
            return this.physicalConnectionOwnerUid;
        }

        /**
         * @return physicalConnectionStatus
         */
        public String getPhysicalConnectionStatus() {
            return this.physicalConnectionStatus;
        }

        /**
         * @return recoveryTime
         */
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        /**
         * @return sitelinkEnable
         */
        public Boolean getSitelinkEnable() {
            return this.sitelinkEnable;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public VirtualBorderRouterTypeTags getTags() {
            return this.tags;
        }

        /**
         * @return terminationTime
         */
        public String getTerminationTime() {
            return this.terminationTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vbrId
         */
        public String getVbrId() {
            return this.vbrId;
        }

        /**
         * @return vlanId
         */
        public Integer getVlanId() {
            return this.vlanId;
        }

        /**
         * @return vlanInterfaceId
         */
        public String getVlanInterfaceId() {
            return this.vlanInterfaceId;
        }

        public static final class Builder {
            private String accessPointId; 
            private String activationTime; 
            private AssociatedCens associatedCens; 
            private AssociatedPhysicalConnections associatedPhysicalConnections; 
            private Integer bandwidth; 
            private String circuitCode; 
            private String cloudBoxInstanceId; 
            private String creationTime; 
            private String description; 
            private Long detectMultiplier; 
            private String eccId; 
            private String ecrAttatchStatus; 
            private String ecrId; 
            private String ecrOwnerId; 
            private Boolean enableIpv6; 
            private String localGatewayIp; 
            private String localIpv6GatewayIp; 
            private Long minRxInterval; 
            private Long minTxInterval; 
            private String name; 
            private String pConnVbrChargeType; 
            private String pConnVbrExpireTime; 
            private String peerGatewayIp; 
            private String peerIpv6GatewayIp; 
            private String peeringIpv6SubnetMask; 
            private String peeringSubnetMask; 
            private String physicalConnectionBusinessStatus; 
            private String physicalConnectionId; 
            private String physicalConnectionOwnerUid; 
            private String physicalConnectionStatus; 
            private String recoveryTime; 
            private String resourceGroupId; 
            private String routeTableId; 
            private Boolean sitelinkEnable; 
            private String status; 
            private VirtualBorderRouterTypeTags tags; 
            private String terminationTime; 
            private String type; 
            private String vbrId; 
            private Integer vlanId; 
            private String vlanInterfaceId; 

            /**
             * <p>The ID of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-cn-kojok1x****</p>
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * <p>The time when the VBR was activated for the first time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-08T12:20:55</p>
             */
            public Builder activationTime(String activationTime) {
                this.activationTime = activationTime;
                return this;
            }

            /**
             * <p>The information about the Cloud Enterprise Network (CEN) instance to which the VBR is attached.</p>
             */
            public Builder associatedCens(AssociatedCens associatedCens) {
                this.associatedCens = associatedCens;
                return this;
            }

            /**
             * <p>The information about the Express Connect circuit that is associated with the VBR.</p>
             */
            public Builder associatedPhysicalConnections(AssociatedPhysicalConnections associatedPhysicalConnections) {
                this.associatedPhysicalConnections = associatedPhysicalConnections;
                return this;
            }

            /**
             * <p>The bandwidth value of the VBR. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The circuit code of the Express Connect circuit, which is provided by the connectivity provider.</p>
             * 
             * <strong>example:</strong>
             * <p>longtel0****</p>
             */
            public Builder circuitCode(String circuitCode) {
                this.circuitCode = circuitCode;
                return this;
            }

            /**
             * <p>The ID of the cloud box.</p>
             * 
             * <strong>example:</strong>
             * <p>cb-****</p>
             */
            public Builder cloudBoxInstanceId(String cloudBoxInstanceId) {
                this.cloudBoxInstanceId = cloudBoxInstanceId;
                return this;
            }

            /**
             * <p>The time when the VBR was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-08T12:20:55</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the VBR.</p>
             * 
             * <strong>example:</strong>
             * <p>desc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The multiple of the detection time.</p>
             * <p>This value indicates the maximum number of dropped packets that is allowed by the receiver when the initiator transmits packets. This value can be used to check whether the connection works as expected.</p>
             * <p>Valid values: <strong>3 to 10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder detectMultiplier(Long detectMultiplier) {
                this.detectMultiplier = detectMultiplier;
                return this;
            }

            /**
             * <p>The ID of the Express Cloud Connect (ECC) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecc-h****</p>
             */
            public Builder eccId(String eccId) {
                this.eccId = eccId;
                return this;
            }

            /**
             * <p>The status of the ECR. Valid values:</p>
             * <ul>
             * <li><strong>Attached</strong></li>
             * <li><strong>Attaching</strong></li>
             * <li><strong>Detached</strong></li>
             * <li><strong>Detaching</strong></li>
             * <li>If no value is returned, the VBR is not attached to a CEN instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Attached</p>
             */
            public Builder ecrAttatchStatus(String ecrAttatchStatus) {
                this.ecrAttatchStatus = ecrAttatchStatus;
                return this;
            }

            /**
             * <p>The ID of the Express Connect Router (ECR).</p>
             * 
             * <strong>example:</strong>
             * <p>ecr-7vrbqv9lcgvzqbwwkm</p>
             */
            public Builder ecrId(String ecrId) {
                this.ecrId = ecrId;
                return this;
            }

            /**
             * EcrOwnerId.
             */
            public Builder ecrOwnerId(String ecrOwnerId) {
                this.ecrOwnerId = ecrOwnerId;
                return this;
            }

            /**
             * <p>Indicates whether IPv6 is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableIpv6(Boolean enableIpv6) {
                this.enableIpv6 = enableIpv6;
                return this;
            }

            /**
             * <p>The IPv4 address of the VBR on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder localGatewayIp(String localGatewayIp) {
                this.localGatewayIp = localGatewayIp;
                return this;
            }

            /**
             * <p>The IPv6 address of the VBR on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>2001:XXXX:3c4d:0015:0000:0000:0000:1a2b</p>
             */
            public Builder localIpv6GatewayIp(String localIpv6GatewayIp) {
                this.localIpv6GatewayIp = localIpv6GatewayIp;
                return this;
            }

            /**
             * <p>The time interval to receive BFD packets. Valid values: <strong>200 to 1000</strong>. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder minRxInterval(Long minRxInterval) {
                this.minRxInterval = minRxInterval;
                return this;
            }

            /**
             * <p>The time interval to send Bidirectional Forwarding Detection (BFD) packets. Valid values: <strong>200 to 1000</strong>. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder minTxInterval(Long minTxInterval) {
                this.minTxInterval = minTxInterval;
                return this;
            }

            /**
             * <p>The VBR name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The billing method of the VBR. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid:</strong> subscription. If you choose this billing method, make sure that your account supports balance payments or credit payments.</li>
             * <li><strong>PostPaid:</strong> pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder pConnVbrChargeType(String pConnVbrChargeType) {
                this.pConnVbrChargeType = pConnVbrChargeType;
                return this;
            }

            /**
             * <p>The time when the VBR expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-08T12:20:55</p>
             */
            public Builder pConnVbrExpireTime(String pConnVbrExpireTime) {
                this.pConnVbrExpireTime = pConnVbrExpireTime;
                return this;
            }

            /**
             * <p>The IPv4 address of the VBR on the user side.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder peerGatewayIp(String peerGatewayIp) {
                this.peerGatewayIp = peerGatewayIp;
                return this;
            }

            /**
             * <p>The IPv6 address of the VBR on the user side.</p>
             * 
             * <strong>example:</strong>
             * <p>2001:XXXX:3c4d:0015:0000:0000:0000:1a2b</p>
             */
            public Builder peerIpv6GatewayIp(String peerIpv6GatewayIp) {
                this.peerIpv6GatewayIp = peerIpv6GatewayIp;
                return this;
            }

            /**
             * <p>The subnet mask for the IPv6 addresses on the user side and on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>2000:1234:0:a000::/55</p>
             */
            public Builder peeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
                this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
                return this;
            }

            /**
             * <p>The subnet mask for the IPv4 addresses on the Alibaba Cloud side and on the user side.</p>
             * 
             * <strong>example:</strong>
             * <p>255.255.255.252</p>
             */
            public Builder peeringSubnetMask(String peeringSubnetMask) {
                this.peeringSubnetMask = peeringSubnetMask;
                return this;
            }

            /**
             * <p>The business status of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>Normal:</strong> The Express Connect circuit is running as normal.</li>
             * <li><strong>FinancialLocked:</strong> The Express Connect circuit is locked due to overdue payments.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder physicalConnectionBusinessStatus(String physicalConnectionBusinessStatus) {
                this.physicalConnectionBusinessStatus = physicalConnectionBusinessStatus;
                return this;
            }

            /**
             * <p>The ID of the Express Connect circuit to which the VBR belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-119mfjzm7x****</p>
             */
            public Builder physicalConnectionId(String physicalConnectionId) {
                this.physicalConnectionId = physicalConnectionId;
                return this;
            }

            /**
             * <p>The ID of the account to which the Express Connect circuit belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1688000000000****</p>
             */
            public Builder physicalConnectionOwnerUid(String physicalConnectionOwnerUid) {
                this.physicalConnectionOwnerUid = physicalConnectionOwnerUid;
                return this;
            }

            /**
             * <p>The status of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>Initial:</strong> The application is under review.</li>
             * <li><strong>Approved</strong>: The application is approved.</li>
             * <li><strong>Allocating</strong>: The system is allocating resources.</li>
             * <li><strong>Allocated</strong>: The Express Connect circuit is under construction.</li>
             * <li><strong>Confirmed</strong>: The Express Connect circuit is to be confirmed.</li>
             * <li><strong>Enabled</strong>: The Express Connect circuit is enabled.</li>
             * <li><strong>Rejected</strong>: The application is rejected.</li>
             * <li><strong>Canceled</strong>: The application is canceled.</li>
             * <li><strong>Allocation Failed:</strong> The system failed to allocate resources.</li>
             * <li><strong>Terminated:</strong> The Express Connect circuit is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder physicalConnectionStatus(String physicalConnectionStatus) {
                this.physicalConnectionStatus = physicalConnectionStatus;
                return this;
            }

            /**
             * <p>The last time when the status of the VBR changed from <strong>terminated</strong> to <strong>active</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-08T12:20:55</p>
             */
            public Builder recoveryTime(String recoveryTime) {
                this.recoveryTime = recoveryTime;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.html">Resource groups</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxazb4ph6aiy****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the route table of the VBR.</p>
             * 
             * <strong>example:</strong>
             * <p>rtb-bp1****</p>
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * <p>Indicates whether to allow service access between data centers. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> If no value is returned, service access between data centers is not allowed.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sitelinkEnable(Boolean sitelinkEnable) {
                this.sitelinkEnable = sitelinkEnable;
                return this;
            }

            /**
             * <p>The status of the VBR. Valid values:</p>
             * <ul>
             * <li><strong>unconfirmed</strong></li>
             * <li><strong>active</strong></li>
             * <li><strong>terminating</strong></li>
             * <li><strong>terminated</strong></li>
             * <li><strong>recovering</strong></li>
             * <li><strong>deleting:</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag of the resource.</p>
             */
            public Builder tags(VirtualBorderRouterTypeTags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The last time when the VBR was terminated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-08T12:20:55</p>
             */
            public Builder terminationTime(String terminationTime) {
                this.terminationTime = terminationTime;
                return this;
            }

            /**
             * <p>The VBR type.</p>
             * 
             * <strong>example:</strong>
             * <p>pconnVBR</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The VBR ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vbr-bp1jcg5cmxjbl9xgc****</p>
             */
            public Builder vbrId(String vbrId) {
                this.vbrId = vbrId;
                return this;
            }

            /**
             * <p>The VLAN ID of the VBR.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder vlanId(Integer vlanId) {
                this.vlanId = vlanId;
                return this;
            }

            /**
             * <p>The ID of the VBR interface.</p>
             * 
             * <strong>example:</strong>
             * <p>ri-2zeo3xzyf38r4xx****</p>
             */
            public Builder vlanInterfaceId(String vlanInterfaceId) {
                this.vlanInterfaceId = vlanInterfaceId;
                return this;
            }

            public VirtualBorderRouterType build() {
                return new VirtualBorderRouterType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVirtualBorderRoutersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualBorderRoutersResponseBody</p>
     */
    public static class VirtualBorderRouterSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VirtualBorderRouterType")
        private java.util.List < VirtualBorderRouterType> virtualBorderRouterType;

        private VirtualBorderRouterSet(Builder builder) {
            this.virtualBorderRouterType = builder.virtualBorderRouterType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualBorderRouterSet create() {
            return builder().build();
        }

        /**
         * @return virtualBorderRouterType
         */
        public java.util.List < VirtualBorderRouterType> getVirtualBorderRouterType() {
            return this.virtualBorderRouterType;
        }

        public static final class Builder {
            private java.util.List < VirtualBorderRouterType> virtualBorderRouterType; 

            /**
             * VirtualBorderRouterType.
             */
            public Builder virtualBorderRouterType(java.util.List < VirtualBorderRouterType> virtualBorderRouterType) {
                this.virtualBorderRouterType = virtualBorderRouterType;
                return this;
            }

            public VirtualBorderRouterSet build() {
                return new VirtualBorderRouterSet(this);
            } 

        } 

    }
}
