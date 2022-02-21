// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVirtualBorderRoutersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVirtualBorderRoutersResponseBody</p>
 */
public class DescribeVirtualBorderRoutersResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VirtualBorderRouterSet")
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * VirtualBorderRouterSet.
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
        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CenOwnerId")
        private Long cenOwnerId;

        @NameInMap("CenStatus")
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
             * CenId.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * CenOwnerId.
             */
            public Builder cenOwnerId(Long cenOwnerId) {
                this.cenOwnerId = cenOwnerId;
                return this;
            }

            /**
             * CenStatus.
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
        @NameInMap("AssociatedCen")
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
        @NameInMap("CircuitCode")
        private String circuitCode;

        @NameInMap("EnableIpv6")
        private Boolean enableIpv6;

        @NameInMap("LocalGatewayIp")
        private String localGatewayIp;

        @NameInMap("LocalIpv6GatewayIp")
        private String localIpv6GatewayIp;

        @NameInMap("PeerGatewayIp")
        private String peerGatewayIp;

        @NameInMap("PeerIpv6GatewayIp")
        private String peerIpv6GatewayIp;

        @NameInMap("PeeringIpv6SubnetMask")
        private String peeringIpv6SubnetMask;

        @NameInMap("PeeringSubnetMask")
        private String peeringSubnetMask;

        @NameInMap("PhysicalConnectionBusinessStatus")
        private String physicalConnectionBusinessStatus;

        @NameInMap("PhysicalConnectionId")
        private String physicalConnectionId;

        @NameInMap("PhysicalConnectionOwnerUid")
        private String physicalConnectionOwnerUid;

        @NameInMap("PhysicalConnectionStatus")
        private String physicalConnectionStatus;

        @NameInMap("Status")
        private String status;

        @NameInMap("VlanId")
        private String vlanId;

        @NameInMap("VlanInterfaceId")
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
             * CircuitCode.
             */
            public Builder circuitCode(String circuitCode) {
                this.circuitCode = circuitCode;
                return this;
            }

            /**
             * EnableIpv6.
             */
            public Builder enableIpv6(Boolean enableIpv6) {
                this.enableIpv6 = enableIpv6;
                return this;
            }

            /**
             * LocalGatewayIp.
             */
            public Builder localGatewayIp(String localGatewayIp) {
                this.localGatewayIp = localGatewayIp;
                return this;
            }

            /**
             * LocalIpv6GatewayIp.
             */
            public Builder localIpv6GatewayIp(String localIpv6GatewayIp) {
                this.localIpv6GatewayIp = localIpv6GatewayIp;
                return this;
            }

            /**
             * PeerGatewayIp.
             */
            public Builder peerGatewayIp(String peerGatewayIp) {
                this.peerGatewayIp = peerGatewayIp;
                return this;
            }

            /**
             * PeerIpv6GatewayIp.
             */
            public Builder peerIpv6GatewayIp(String peerIpv6GatewayIp) {
                this.peerIpv6GatewayIp = peerIpv6GatewayIp;
                return this;
            }

            /**
             * PeeringIpv6SubnetMask.
             */
            public Builder peeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
                this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
                return this;
            }

            /**
             * PeeringSubnetMask.
             */
            public Builder peeringSubnetMask(String peeringSubnetMask) {
                this.peeringSubnetMask = peeringSubnetMask;
                return this;
            }

            /**
             * PhysicalConnectionBusinessStatus.
             */
            public Builder physicalConnectionBusinessStatus(String physicalConnectionBusinessStatus) {
                this.physicalConnectionBusinessStatus = physicalConnectionBusinessStatus;
                return this;
            }

            /**
             * PhysicalConnectionId.
             */
            public Builder physicalConnectionId(String physicalConnectionId) {
                this.physicalConnectionId = physicalConnectionId;
                return this;
            }

            /**
             * PhysicalConnectionOwnerUid.
             */
            public Builder physicalConnectionOwnerUid(String physicalConnectionOwnerUid) {
                this.physicalConnectionOwnerUid = physicalConnectionOwnerUid;
                return this;
            }

            /**
             * PhysicalConnectionStatus.
             */
            public Builder physicalConnectionStatus(String physicalConnectionStatus) {
                this.physicalConnectionStatus = physicalConnectionStatus;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VlanId.
             */
            public Builder vlanId(String vlanId) {
                this.vlanId = vlanId;
                return this;
            }

            /**
             * VlanInterfaceId.
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
        @NameInMap("AssociatedPhysicalConnection")
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
    public static class VirtualBorderRouterType extends TeaModel {
        @NameInMap("AccessPointId")
        private String accessPointId;

        @NameInMap("ActivationTime")
        private String activationTime;

        @NameInMap("AssociatedCens")
        private AssociatedCens associatedCens;

        @NameInMap("AssociatedPhysicalConnections")
        private AssociatedPhysicalConnections associatedPhysicalConnections;

        @NameInMap("CircuitCode")
        private String circuitCode;

        @NameInMap("CloudBoxInstanceId")
        private String cloudBoxInstanceId;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DetectMultiplier")
        private Long detectMultiplier;

        @NameInMap("EccId")
        private String eccId;

        @NameInMap("EnableIpv6")
        private Boolean enableIpv6;

        @NameInMap("LocalGatewayIp")
        private String localGatewayIp;

        @NameInMap("LocalIpv6GatewayIp")
        private String localIpv6GatewayIp;

        @NameInMap("MinRxInterval")
        private Long minRxInterval;

        @NameInMap("MinTxInterval")
        private Long minTxInterval;

        @NameInMap("Name")
        private String name;

        @NameInMap("PConnVbrChargeType")
        private String PConnVbrChargeType;

        @NameInMap("PConnVbrExpireTime")
        private String PConnVbrExpireTime;

        @NameInMap("PeerGatewayIp")
        private String peerGatewayIp;

        @NameInMap("PeerIpv6GatewayIp")
        private String peerIpv6GatewayIp;

        @NameInMap("PeeringIpv6SubnetMask")
        private String peeringIpv6SubnetMask;

        @NameInMap("PeeringSubnetMask")
        private String peeringSubnetMask;

        @NameInMap("PhysicalConnectionBusinessStatus")
        private String physicalConnectionBusinessStatus;

        @NameInMap("PhysicalConnectionId")
        private String physicalConnectionId;

        @NameInMap("PhysicalConnectionOwnerUid")
        private String physicalConnectionOwnerUid;

        @NameInMap("PhysicalConnectionStatus")
        private String physicalConnectionStatus;

        @NameInMap("RecoveryTime")
        private String recoveryTime;

        @NameInMap("RouteTableId")
        private String routeTableId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TerminationTime")
        private String terminationTime;

        @NameInMap("Type")
        private String type;

        @NameInMap("VbrId")
        private String vbrId;

        @NameInMap("VlanId")
        private Integer vlanId;

        @NameInMap("VlanInterfaceId")
        private String vlanInterfaceId;

        private VirtualBorderRouterType(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.activationTime = builder.activationTime;
            this.associatedCens = builder.associatedCens;
            this.associatedPhysicalConnections = builder.associatedPhysicalConnections;
            this.circuitCode = builder.circuitCode;
            this.cloudBoxInstanceId = builder.cloudBoxInstanceId;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.detectMultiplier = builder.detectMultiplier;
            this.eccId = builder.eccId;
            this.enableIpv6 = builder.enableIpv6;
            this.localGatewayIp = builder.localGatewayIp;
            this.localIpv6GatewayIp = builder.localIpv6GatewayIp;
            this.minRxInterval = builder.minRxInterval;
            this.minTxInterval = builder.minTxInterval;
            this.name = builder.name;
            this.PConnVbrChargeType = builder.PConnVbrChargeType;
            this.PConnVbrExpireTime = builder.PConnVbrExpireTime;
            this.peerGatewayIp = builder.peerGatewayIp;
            this.peerIpv6GatewayIp = builder.peerIpv6GatewayIp;
            this.peeringIpv6SubnetMask = builder.peeringIpv6SubnetMask;
            this.peeringSubnetMask = builder.peeringSubnetMask;
            this.physicalConnectionBusinessStatus = builder.physicalConnectionBusinessStatus;
            this.physicalConnectionId = builder.physicalConnectionId;
            this.physicalConnectionOwnerUid = builder.physicalConnectionOwnerUid;
            this.physicalConnectionStatus = builder.physicalConnectionStatus;
            this.recoveryTime = builder.recoveryTime;
            this.routeTableId = builder.routeTableId;
            this.status = builder.status;
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
         * @return PConnVbrChargeType
         */
        public String getPConnVbrChargeType() {
            return this.PConnVbrChargeType;
        }

        /**
         * @return PConnVbrExpireTime
         */
        public String getPConnVbrExpireTime() {
            return this.PConnVbrExpireTime;
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
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private String circuitCode; 
            private String cloudBoxInstanceId; 
            private String creationTime; 
            private String description; 
            private Long detectMultiplier; 
            private String eccId; 
            private Boolean enableIpv6; 
            private String localGatewayIp; 
            private String localIpv6GatewayIp; 
            private Long minRxInterval; 
            private Long minTxInterval; 
            private String name; 
            private String PConnVbrChargeType; 
            private String PConnVbrExpireTime; 
            private String peerGatewayIp; 
            private String peerIpv6GatewayIp; 
            private String peeringIpv6SubnetMask; 
            private String peeringSubnetMask; 
            private String physicalConnectionBusinessStatus; 
            private String physicalConnectionId; 
            private String physicalConnectionOwnerUid; 
            private String physicalConnectionStatus; 
            private String recoveryTime; 
            private String routeTableId; 
            private String status; 
            private String terminationTime; 
            private String type; 
            private String vbrId; 
            private Integer vlanId; 
            private String vlanInterfaceId; 

            /**
             * AccessPointId.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * ActivationTime.
             */
            public Builder activationTime(String activationTime) {
                this.activationTime = activationTime;
                return this;
            }

            /**
             * AssociatedCens.
             */
            public Builder associatedCens(AssociatedCens associatedCens) {
                this.associatedCens = associatedCens;
                return this;
            }

            /**
             * AssociatedPhysicalConnections.
             */
            public Builder associatedPhysicalConnections(AssociatedPhysicalConnections associatedPhysicalConnections) {
                this.associatedPhysicalConnections = associatedPhysicalConnections;
                return this;
            }

            /**
             * CircuitCode.
             */
            public Builder circuitCode(String circuitCode) {
                this.circuitCode = circuitCode;
                return this;
            }

            /**
             * CloudBoxInstanceId.
             */
            public Builder cloudBoxInstanceId(String cloudBoxInstanceId) {
                this.cloudBoxInstanceId = cloudBoxInstanceId;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * DetectMultiplier.
             */
            public Builder detectMultiplier(Long detectMultiplier) {
                this.detectMultiplier = detectMultiplier;
                return this;
            }

            /**
             * EccId.
             */
            public Builder eccId(String eccId) {
                this.eccId = eccId;
                return this;
            }

            /**
             * EnableIpv6.
             */
            public Builder enableIpv6(Boolean enableIpv6) {
                this.enableIpv6 = enableIpv6;
                return this;
            }

            /**
             * LocalGatewayIp.
             */
            public Builder localGatewayIp(String localGatewayIp) {
                this.localGatewayIp = localGatewayIp;
                return this;
            }

            /**
             * LocalIpv6GatewayIp.
             */
            public Builder localIpv6GatewayIp(String localIpv6GatewayIp) {
                this.localIpv6GatewayIp = localIpv6GatewayIp;
                return this;
            }

            /**
             * MinRxInterval.
             */
            public Builder minRxInterval(Long minRxInterval) {
                this.minRxInterval = minRxInterval;
                return this;
            }

            /**
             * MinTxInterval.
             */
            public Builder minTxInterval(Long minTxInterval) {
                this.minTxInterval = minTxInterval;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PConnVbrChargeType.
             */
            public Builder PConnVbrChargeType(String PConnVbrChargeType) {
                this.PConnVbrChargeType = PConnVbrChargeType;
                return this;
            }

            /**
             * PConnVbrExpireTime.
             */
            public Builder PConnVbrExpireTime(String PConnVbrExpireTime) {
                this.PConnVbrExpireTime = PConnVbrExpireTime;
                return this;
            }

            /**
             * PeerGatewayIp.
             */
            public Builder peerGatewayIp(String peerGatewayIp) {
                this.peerGatewayIp = peerGatewayIp;
                return this;
            }

            /**
             * PeerIpv6GatewayIp.
             */
            public Builder peerIpv6GatewayIp(String peerIpv6GatewayIp) {
                this.peerIpv6GatewayIp = peerIpv6GatewayIp;
                return this;
            }

            /**
             * PeeringIpv6SubnetMask.
             */
            public Builder peeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
                this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
                return this;
            }

            /**
             * PeeringSubnetMask.
             */
            public Builder peeringSubnetMask(String peeringSubnetMask) {
                this.peeringSubnetMask = peeringSubnetMask;
                return this;
            }

            /**
             * PhysicalConnectionBusinessStatus.
             */
            public Builder physicalConnectionBusinessStatus(String physicalConnectionBusinessStatus) {
                this.physicalConnectionBusinessStatus = physicalConnectionBusinessStatus;
                return this;
            }

            /**
             * PhysicalConnectionId.
             */
            public Builder physicalConnectionId(String physicalConnectionId) {
                this.physicalConnectionId = physicalConnectionId;
                return this;
            }

            /**
             * PhysicalConnectionOwnerUid.
             */
            public Builder physicalConnectionOwnerUid(String physicalConnectionOwnerUid) {
                this.physicalConnectionOwnerUid = physicalConnectionOwnerUid;
                return this;
            }

            /**
             * PhysicalConnectionStatus.
             */
            public Builder physicalConnectionStatus(String physicalConnectionStatus) {
                this.physicalConnectionStatus = physicalConnectionStatus;
                return this;
            }

            /**
             * RecoveryTime.
             */
            public Builder recoveryTime(String recoveryTime) {
                this.recoveryTime = recoveryTime;
                return this;
            }

            /**
             * RouteTableId.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TerminationTime.
             */
            public Builder terminationTime(String terminationTime) {
                this.terminationTime = terminationTime;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * VbrId.
             */
            public Builder vbrId(String vbrId) {
                this.vbrId = vbrId;
                return this;
            }

            /**
             * VlanId.
             */
            public Builder vlanId(Integer vlanId) {
                this.vlanId = vlanId;
                return this;
            }

            /**
             * VlanInterfaceId.
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
        @NameInMap("VirtualBorderRouterType")
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
