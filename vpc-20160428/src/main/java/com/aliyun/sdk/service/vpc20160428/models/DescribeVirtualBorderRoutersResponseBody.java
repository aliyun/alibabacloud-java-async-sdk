// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The page number. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values: **1 to 50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The information about the VBR.
         */
        public Builder virtualBorderRouterSet(VirtualBorderRouterSet virtualBorderRouterSet) {
            this.virtualBorderRouterSet = virtualBorderRouterSet;
            return this;
        }

        public DescribeVirtualBorderRoutersResponseBody build() {
            return new DescribeVirtualBorderRoutersResponseBody(this);
        } 

    } 

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
             * The CEN instance ID.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The ID of the account to which the CEN instance belongs.
             */
            public Builder cenOwnerId(Long cenOwnerId) {
                this.cenOwnerId = cenOwnerId;
                return this;
            }

            /**
             * The status of the CEN instance. Valid values:
             * <p>
             * 
             * *   **Attached**
             * *   **Attaching**
             * *   **Detached**
             * *   **Detaching**
             * *   If no value is returned, the VBR is not attached to a CEN instance.
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
             * The circuit code of the Express Connect circuit, which is provided by the connectivity provider.
             */
            public Builder circuitCode(String circuitCode) {
                this.circuitCode = circuitCode;
                return this;
            }

            /**
             * Indicates whether IPv6 is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder enableIpv6(Boolean enableIpv6) {
                this.enableIpv6 = enableIpv6;
                return this;
            }

            /**
             * The IPv4 address of the VBR on the Alibaba Cloud side.
             */
            public Builder localGatewayIp(String localGatewayIp) {
                this.localGatewayIp = localGatewayIp;
                return this;
            }

            /**
             * The IPv6 address of the VBR on the Alibaba Cloud side.
             */
            public Builder localIpv6GatewayIp(String localIpv6GatewayIp) {
                this.localIpv6GatewayIp = localIpv6GatewayIp;
                return this;
            }

            /**
             * The IPv4 address of the VBR on the user side.
             */
            public Builder peerGatewayIp(String peerGatewayIp) {
                this.peerGatewayIp = peerGatewayIp;
                return this;
            }

            /**
             * The IPv6 address of the VBR on the user side.
             */
            public Builder peerIpv6GatewayIp(String peerIpv6GatewayIp) {
                this.peerIpv6GatewayIp = peerIpv6GatewayIp;
                return this;
            }

            /**
             * The subnet mask for the IPv6 addresses on the user side and on the Alibaba Cloud side.
             * <p>
             * 
             * Both IPv6 addresses must belong to the same subnet.
             */
            public Builder peeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
                this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
                return this;
            }

            /**
             * The subnet mask for the IPv4 addresses of the VBR on the user side and on the Alibaba Cloud side.
             * <p>
             * 
             * Both IPv4 addresses must belong to the same subnet.
             */
            public Builder peeringSubnetMask(String peeringSubnetMask) {
                this.peeringSubnetMask = peeringSubnetMask;
                return this;
            }

            /**
             * The business status of the Express Connect circuit. Valid values:
             * <p>
             * 
             * *   **Normal:** The Express Connect circuit is running as normal.
             * *   **FinancialLocked:** The Express Connect circuit is locked due to overdue payments.
             */
            public Builder physicalConnectionBusinessStatus(String physicalConnectionBusinessStatus) {
                this.physicalConnectionBusinessStatus = physicalConnectionBusinessStatus;
                return this;
            }

            /**
             * The ID of the Express Connect circuit.
             */
            public Builder physicalConnectionId(String physicalConnectionId) {
                this.physicalConnectionId = physicalConnectionId;
                return this;
            }

            /**
             * The ID of the account to which the Express Connect circuit belongs.
             */
            public Builder physicalConnectionOwnerUid(String physicalConnectionOwnerUid) {
                this.physicalConnectionOwnerUid = physicalConnectionOwnerUid;
                return this;
            }

            /**
             * The status of the Express Connect circuit. Valid values:
             * <p>
             * 
             * *   **Initial:** The application is under review.
             * *   **Approved**: The application is approved.
             * *   **Allocating**: The system is allocating resources.
             * *   **Allocated**: The Express Connect circuit is under construction.
             * *   **Confirmed**: The Express Connect circuit is to be confirmed.
             * *   **Enabled**: The Express Connect circuit is enabled.
             * *   **Rejected**: The application is rejected.
             * *   **Canceled**: The application is canceled.
             * *   **Allocation Failed:** The system failed to allocate resources.
             * *   **Terminated:** The Express Connect circuit is disabled.
             */
            public Builder physicalConnectionStatus(String physicalConnectionStatus) {
                this.physicalConnectionStatus = physicalConnectionStatus;
                return this;
            }

            /**
             * The status of the VBR. Valid values:
             * <p>
             * 
             * *   **unconfirmed**
             * *   **active:**
             * *   **terminating**
             * *   **terminated**
             * *   **recovering**
             * *   **deleting:**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The VLAN ID of the VBR.
             */
            public Builder vlanId(String vlanId) {
                this.vlanId = vlanId;
                return this;
            }

            /**
             * The ID of the VBR interface, which can be used as a next hop of a VBR route.
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
             * The tag key of the resource.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the resource.
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
             * The ID of the access point.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * The time when the VBR was activated for the first time.
             */
            public Builder activationTime(String activationTime) {
                this.activationTime = activationTime;
                return this;
            }

            /**
             * The information about the Cloud Enterprise Network (CEN) instance to which the VBR is attached.
             */
            public Builder associatedCens(AssociatedCens associatedCens) {
                this.associatedCens = associatedCens;
                return this;
            }

            /**
             * The information about the Express Connect circuit that is associated with the VBR.
             */
            public Builder associatedPhysicalConnections(AssociatedPhysicalConnections associatedPhysicalConnections) {
                this.associatedPhysicalConnections = associatedPhysicalConnections;
                return this;
            }

            /**
             * The bandwidth value of the VBR. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The circuit code of the Express Connect circuit, which is provided by the connectivity provider.
             */
            public Builder circuitCode(String circuitCode) {
                this.circuitCode = circuitCode;
                return this;
            }

            /**
             * The ID of the cloud box.
             */
            public Builder cloudBoxInstanceId(String cloudBoxInstanceId) {
                this.cloudBoxInstanceId = cloudBoxInstanceId;
                return this;
            }

            /**
             * The time when the VBR was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the VBR.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The multiple of the detection time.
             * <p>
             * 
             * This value indicates the maximum number of dropped packets that is allowed by the receiver when the initiator transmits packets. This value can be used to check whether the connection works as expected.
             * 
             * Valid values: **3 to 10**.
             */
            public Builder detectMultiplier(Long detectMultiplier) {
                this.detectMultiplier = detectMultiplier;
                return this;
            }

            /**
             * The ID of the Express Cloud Connect (ECC) instance.
             */
            public Builder eccId(String eccId) {
                this.eccId = eccId;
                return this;
            }

            /**
             * The status of the ECR. Valid values:
             * <p>
             * 
             * *   **Attached**
             * *   **Attaching**
             * *   **Detached**
             * *   **Detaching**
             * *   If no value is returned, the VBR is not attached to a CEN instance.
             */
            public Builder ecrAttatchStatus(String ecrAttatchStatus) {
                this.ecrAttatchStatus = ecrAttatchStatus;
                return this;
            }

            /**
             * The ID of the Express Connect Router (ECR).
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
             * Indicates whether IPv6 is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder enableIpv6(Boolean enableIpv6) {
                this.enableIpv6 = enableIpv6;
                return this;
            }

            /**
             * The IPv4 address of the VBR on the Alibaba Cloud side.
             */
            public Builder localGatewayIp(String localGatewayIp) {
                this.localGatewayIp = localGatewayIp;
                return this;
            }

            /**
             * The IPv6 address of the VBR on the Alibaba Cloud side.
             */
            public Builder localIpv6GatewayIp(String localIpv6GatewayIp) {
                this.localIpv6GatewayIp = localIpv6GatewayIp;
                return this;
            }

            /**
             * The time interval to receive BFD packets. Valid values: **200 to 1000**. Unit: milliseconds.
             */
            public Builder minRxInterval(Long minRxInterval) {
                this.minRxInterval = minRxInterval;
                return this;
            }

            /**
             * The time interval to send Bidirectional Forwarding Detection (BFD) packets. Valid values: **200 to 1000**. Unit: milliseconds.
             */
            public Builder minTxInterval(Long minTxInterval) {
                this.minTxInterval = minTxInterval;
                return this;
            }

            /**
             * The VBR name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The billing method of the VBR. Valid values:
             * <p>
             * 
             * *   **PrePaid:** subscription. If you choose this billing method, make sure that your account supports balance payments or credit payments.
             * *   **PostPaid:** pay-as-you-go.
             */
            public Builder pConnVbrChargeType(String pConnVbrChargeType) {
                this.pConnVbrChargeType = pConnVbrChargeType;
                return this;
            }

            /**
             * The time when the VBR expires.
             */
            public Builder pConnVbrExpireTime(String pConnVbrExpireTime) {
                this.pConnVbrExpireTime = pConnVbrExpireTime;
                return this;
            }

            /**
             * The IPv4 address of the VBR on the user side.
             */
            public Builder peerGatewayIp(String peerGatewayIp) {
                this.peerGatewayIp = peerGatewayIp;
                return this;
            }

            /**
             * The IPv6 address of the VBR on the user side.
             */
            public Builder peerIpv6GatewayIp(String peerIpv6GatewayIp) {
                this.peerIpv6GatewayIp = peerIpv6GatewayIp;
                return this;
            }

            /**
             * The subnet mask for the IPv6 addresses on the user side and on the Alibaba Cloud side.
             */
            public Builder peeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
                this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
                return this;
            }

            /**
             * The subnet mask for the IPv4 addresses on the Alibaba Cloud side and on the user side.
             */
            public Builder peeringSubnetMask(String peeringSubnetMask) {
                this.peeringSubnetMask = peeringSubnetMask;
                return this;
            }

            /**
             * The business status of the Express Connect circuit. Valid values:
             * <p>
             * 
             * *   **Normal:** The Express Connect circuit is running as normal.
             * *   **FinancialLocked:** The Express Connect circuit is locked due to overdue payments.
             */
            public Builder physicalConnectionBusinessStatus(String physicalConnectionBusinessStatus) {
                this.physicalConnectionBusinessStatus = physicalConnectionBusinessStatus;
                return this;
            }

            /**
             * The ID of the Express Connect circuit to which the VBR belongs.
             */
            public Builder physicalConnectionId(String physicalConnectionId) {
                this.physicalConnectionId = physicalConnectionId;
                return this;
            }

            /**
             * The ID of the account to which the Express Connect circuit belongs.
             */
            public Builder physicalConnectionOwnerUid(String physicalConnectionOwnerUid) {
                this.physicalConnectionOwnerUid = physicalConnectionOwnerUid;
                return this;
            }

            /**
             * The status of the Express Connect circuit. Valid values:
             * <p>
             * 
             * *   **Initial:** The application is under review.
             * *   **Approved**: The application is approved.
             * *   **Allocating**: The system is allocating resources.
             * *   **Allocated**: The Express Connect circuit is under construction.
             * *   **Confirmed**: The Express Connect circuit is to be confirmed.
             * *   **Enabled**: The Express Connect circuit is enabled.
             * *   **Rejected**: The application is rejected.
             * *   **Canceled**: The application is canceled.
             * *   **Allocation Failed:** The system failed to allocate resources.
             * *   **Terminated:** The Express Connect circuit is disabled.
             */
            public Builder physicalConnectionStatus(String physicalConnectionStatus) {
                this.physicalConnectionStatus = physicalConnectionStatus;
                return this;
            }

            /**
             * The last time when the status of the VBR changed from **terminated** to **active**.
             */
            public Builder recoveryTime(String recoveryTime) {
                this.recoveryTime = recoveryTime;
                return this;
            }

            /**
             * The resource group ID.
             * <p>
             * 
             * For more information about resource groups, see [Resource groups](~~94475~~).
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the route table of the VBR.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * Indicates whether to allow service access between data centers. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * >  If no value is returned, service access between data centers is not allowed.
             */
            public Builder sitelinkEnable(Boolean sitelinkEnable) {
                this.sitelinkEnable = sitelinkEnable;
                return this;
            }

            /**
             * The status of the VBR. Valid values:
             * <p>
             * 
             * *   **unconfirmed**
             * *   **active**
             * *   **terminating**
             * *   **terminated**
             * *   **recovering**
             * *   **deleting:**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag of the resource.
             */
            public Builder tags(VirtualBorderRouterTypeTags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The last time when the VBR was terminated.
             */
            public Builder terminationTime(String terminationTime) {
                this.terminationTime = terminationTime;
                return this;
            }

            /**
             * The VBR type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The VBR ID.
             */
            public Builder vbrId(String vbrId) {
                this.vbrId = vbrId;
                return this;
            }

            /**
             * The VLAN ID of the VBR.
             */
            public Builder vlanId(Integer vlanId) {
                this.vlanId = vlanId;
                return this;
            }

            /**
             * The ID of the VBR interface.
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
