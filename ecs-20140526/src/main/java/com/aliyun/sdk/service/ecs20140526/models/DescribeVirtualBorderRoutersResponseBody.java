// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeVirtualBorderRoutersResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.virtualBorderRouterSet = model.virtualBorderRouterSet;
        } 

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

        @com.aliyun.core.annotation.NameInMap("CircuitCode")
        private String circuitCode;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LocalGatewayIp")
        private String localGatewayIp;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PeerGatewayIp")
        private String peerGatewayIp;

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

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TerminationTime")
        private String terminationTime;

        @com.aliyun.core.annotation.NameInMap("VbrId")
        private String vbrId;

        @com.aliyun.core.annotation.NameInMap("VlanId")
        private Integer vlanId;

        @com.aliyun.core.annotation.NameInMap("VlanInterfaceId")
        private String vlanInterfaceId;

        private VirtualBorderRouterType(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.activationTime = builder.activationTime;
            this.circuitCode = builder.circuitCode;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.localGatewayIp = builder.localGatewayIp;
            this.name = builder.name;
            this.peerGatewayIp = builder.peerGatewayIp;
            this.peeringSubnetMask = builder.peeringSubnetMask;
            this.physicalConnectionBusinessStatus = builder.physicalConnectionBusinessStatus;
            this.physicalConnectionId = builder.physicalConnectionId;
            this.physicalConnectionOwnerUid = builder.physicalConnectionOwnerUid;
            this.physicalConnectionStatus = builder.physicalConnectionStatus;
            this.recoveryTime = builder.recoveryTime;
            this.routeTableId = builder.routeTableId;
            this.status = builder.status;
            this.terminationTime = builder.terminationTime;
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
         * @return circuitCode
         */
        public String getCircuitCode() {
            return this.circuitCode;
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
         * @return localGatewayIp
         */
        public String getLocalGatewayIp() {
            return this.localGatewayIp;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return peerGatewayIp
         */
        public String getPeerGatewayIp() {
            return this.peerGatewayIp;
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
            private String circuitCode; 
            private String creationTime; 
            private String description; 
            private String localGatewayIp; 
            private String name; 
            private String peerGatewayIp; 
            private String peeringSubnetMask; 
            private String physicalConnectionBusinessStatus; 
            private String physicalConnectionId; 
            private String physicalConnectionOwnerUid; 
            private String physicalConnectionStatus; 
            private String recoveryTime; 
            private String routeTableId; 
            private String status; 
            private String terminationTime; 
            private String vbrId; 
            private Integer vlanId; 
            private String vlanInterfaceId; 

            private Builder() {
            } 

            private Builder(VirtualBorderRouterType model) {
                this.accessPointId = model.accessPointId;
                this.activationTime = model.activationTime;
                this.circuitCode = model.circuitCode;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.localGatewayIp = model.localGatewayIp;
                this.name = model.name;
                this.peerGatewayIp = model.peerGatewayIp;
                this.peeringSubnetMask = model.peeringSubnetMask;
                this.physicalConnectionBusinessStatus = model.physicalConnectionBusinessStatus;
                this.physicalConnectionId = model.physicalConnectionId;
                this.physicalConnectionOwnerUid = model.physicalConnectionOwnerUid;
                this.physicalConnectionStatus = model.physicalConnectionStatus;
                this.recoveryTime = model.recoveryTime;
                this.routeTableId = model.routeTableId;
                this.status = model.status;
                this.terminationTime = model.terminationTime;
                this.vbrId = model.vbrId;
                this.vlanId = model.vlanId;
                this.vlanInterfaceId = model.vlanInterfaceId;
            } 

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
             * CircuitCode.
             */
            public Builder circuitCode(String circuitCode) {
                this.circuitCode = circuitCode;
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
             * LocalGatewayIp.
             */
            public Builder localGatewayIp(String localGatewayIp) {
                this.localGatewayIp = localGatewayIp;
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
             * PeerGatewayIp.
             */
            public Builder peerGatewayIp(String peerGatewayIp) {
                this.peerGatewayIp = peerGatewayIp;
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
    /**
     * 
     * {@link DescribeVirtualBorderRoutersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualBorderRoutersResponseBody</p>
     */
    public static class VirtualBorderRouterSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VirtualBorderRouterType")
        private java.util.List<VirtualBorderRouterType> virtualBorderRouterType;

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
        public java.util.List<VirtualBorderRouterType> getVirtualBorderRouterType() {
            return this.virtualBorderRouterType;
        }

        public static final class Builder {
            private java.util.List<VirtualBorderRouterType> virtualBorderRouterType; 

            private Builder() {
            } 

            private Builder(VirtualBorderRouterSet model) {
                this.virtualBorderRouterType = model.virtualBorderRouterType;
            } 

            /**
             * VirtualBorderRouterType.
             */
            public Builder virtualBorderRouterType(java.util.List<VirtualBorderRouterType> virtualBorderRouterType) {
                this.virtualBorderRouterType = virtualBorderRouterType;
                return this;
            }

            public VirtualBorderRouterSet build() {
                return new VirtualBorderRouterSet(this);
            } 

        } 

    }
}
