// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePhysicalConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePhysicalConnectionsResponseBody</p>
 */
public class DescribePhysicalConnectionsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PhysicalConnectionSet")
    private PhysicalConnectionSet physicalConnectionSet;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribePhysicalConnectionsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.physicalConnectionSet = builder.physicalConnectionSet;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhysicalConnectionsResponseBody create() {
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
     * @return physicalConnectionSet
     */
    public PhysicalConnectionSet getPhysicalConnectionSet() {
        return this.physicalConnectionSet;
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

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private PhysicalConnectionSet physicalConnectionSet; 
        private String requestId; 
        private Integer totalCount; 

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
         * PhysicalConnectionSet.
         */
        public Builder physicalConnectionSet(PhysicalConnectionSet physicalConnectionSet) {
            this.physicalConnectionSet = physicalConnectionSet;
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

        public DescribePhysicalConnectionsResponseBody build() {
            return new DescribePhysicalConnectionsResponseBody(this);
        } 

    } 

    public static class PhysicalConnectionType extends TeaModel {
        @NameInMap("AccessPointId")
        private String accessPointId;

        @NameInMap("AccessPointType")
        private String accessPointType;

        @NameInMap("AdLocation")
        private String adLocation;

        @NameInMap("Bandwidth")
        private Long bandwidth;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CircuitCode")
        private String circuitCode;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("EnabledTime")
        private String enabledTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ExpectSpec")
        private String expectSpec;

        @NameInMap("HasReservationData")
        private String hasReservationData;

        @NameInMap("LineOperator")
        private String lineOperator;

        @NameInMap("LoaStatus")
        private String loaStatus;

        @NameInMap("Name")
        private String name;

        @NameInMap("OrderMode")
        private String orderMode;

        @NameInMap("ParentPhysicalConnectionAliUid")
        private Long parentPhysicalConnectionAliUid;

        @NameInMap("ParentPhysicalConnectionId")
        private String parentPhysicalConnectionId;

        @NameInMap("PeerLocation")
        private String peerLocation;

        @NameInMap("PhysicalConnectionId")
        private String physicalConnectionId;

        @NameInMap("PortNumber")
        private String portNumber;

        @NameInMap("PortType")
        private String portType;

        @NameInMap("ProductType")
        private String productType;

        @NameInMap("RedundantPhysicalConnectionId")
        private String redundantPhysicalConnectionId;

        @NameInMap("ReservationActiveTime")
        private String reservationActiveTime;

        @NameInMap("ReservationInternetChargeType")
        private String reservationInternetChargeType;

        @NameInMap("ReservationOrderType")
        private String reservationOrderType;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("VirtualPhysicalConnectionCount")
        private Integer virtualPhysicalConnectionCount;

        @NameInMap("VlanId")
        private String vlanId;

        @NameInMap("VpconnStatus")
        private String vpconnStatus;

        private PhysicalConnectionType(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.accessPointType = builder.accessPointType;
            this.adLocation = builder.adLocation;
            this.bandwidth = builder.bandwidth;
            this.businessStatus = builder.businessStatus;
            this.chargeType = builder.chargeType;
            this.circuitCode = builder.circuitCode;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.enabledTime = builder.enabledTime;
            this.endTime = builder.endTime;
            this.expectSpec = builder.expectSpec;
            this.hasReservationData = builder.hasReservationData;
            this.lineOperator = builder.lineOperator;
            this.loaStatus = builder.loaStatus;
            this.name = builder.name;
            this.orderMode = builder.orderMode;
            this.parentPhysicalConnectionAliUid = builder.parentPhysicalConnectionAliUid;
            this.parentPhysicalConnectionId = builder.parentPhysicalConnectionId;
            this.peerLocation = builder.peerLocation;
            this.physicalConnectionId = builder.physicalConnectionId;
            this.portNumber = builder.portNumber;
            this.portType = builder.portType;
            this.productType = builder.productType;
            this.redundantPhysicalConnectionId = builder.redundantPhysicalConnectionId;
            this.reservationActiveTime = builder.reservationActiveTime;
            this.reservationInternetChargeType = builder.reservationInternetChargeType;
            this.reservationOrderType = builder.reservationOrderType;
            this.resourceGroupId = builder.resourceGroupId;
            this.spec = builder.spec;
            this.status = builder.status;
            this.type = builder.type;
            this.virtualPhysicalConnectionCount = builder.virtualPhysicalConnectionCount;
            this.vlanId = builder.vlanId;
            this.vpconnStatus = builder.vpconnStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhysicalConnectionType create() {
            return builder().build();
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return accessPointType
         */
        public String getAccessPointType() {
            return this.accessPointType;
        }

        /**
         * @return adLocation
         */
        public String getAdLocation() {
            return this.adLocation;
        }

        /**
         * @return bandwidth
         */
        public Long getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
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
         * @return enabledTime
         */
        public String getEnabledTime() {
            return this.enabledTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return expectSpec
         */
        public String getExpectSpec() {
            return this.expectSpec;
        }

        /**
         * @return hasReservationData
         */
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        /**
         * @return lineOperator
         */
        public String getLineOperator() {
            return this.lineOperator;
        }

        /**
         * @return loaStatus
         */
        public String getLoaStatus() {
            return this.loaStatus;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return orderMode
         */
        public String getOrderMode() {
            return this.orderMode;
        }

        /**
         * @return parentPhysicalConnectionAliUid
         */
        public Long getParentPhysicalConnectionAliUid() {
            return this.parentPhysicalConnectionAliUid;
        }

        /**
         * @return parentPhysicalConnectionId
         */
        public String getParentPhysicalConnectionId() {
            return this.parentPhysicalConnectionId;
        }

        /**
         * @return peerLocation
         */
        public String getPeerLocation() {
            return this.peerLocation;
        }

        /**
         * @return physicalConnectionId
         */
        public String getPhysicalConnectionId() {
            return this.physicalConnectionId;
        }

        /**
         * @return portNumber
         */
        public String getPortNumber() {
            return this.portNumber;
        }

        /**
         * @return portType
         */
        public String getPortType() {
            return this.portType;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return redundantPhysicalConnectionId
         */
        public String getRedundantPhysicalConnectionId() {
            return this.redundantPhysicalConnectionId;
        }

        /**
         * @return reservationActiveTime
         */
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        /**
         * @return reservationInternetChargeType
         */
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        /**
         * @return reservationOrderType
         */
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return virtualPhysicalConnectionCount
         */
        public Integer getVirtualPhysicalConnectionCount() {
            return this.virtualPhysicalConnectionCount;
        }

        /**
         * @return vlanId
         */
        public String getVlanId() {
            return this.vlanId;
        }

        /**
         * @return vpconnStatus
         */
        public String getVpconnStatus() {
            return this.vpconnStatus;
        }

        public static final class Builder {
            private String accessPointId; 
            private String accessPointType; 
            private String adLocation; 
            private Long bandwidth; 
            private String businessStatus; 
            private String chargeType; 
            private String circuitCode; 
            private String creationTime; 
            private String description; 
            private String enabledTime; 
            private String endTime; 
            private String expectSpec; 
            private String hasReservationData; 
            private String lineOperator; 
            private String loaStatus; 
            private String name; 
            private String orderMode; 
            private Long parentPhysicalConnectionAliUid; 
            private String parentPhysicalConnectionId; 
            private String peerLocation; 
            private String physicalConnectionId; 
            private String portNumber; 
            private String portType; 
            private String productType; 
            private String redundantPhysicalConnectionId; 
            private String reservationActiveTime; 
            private String reservationInternetChargeType; 
            private String reservationOrderType; 
            private String resourceGroupId; 
            private String spec; 
            private String status; 
            private String type; 
            private Integer virtualPhysicalConnectionCount; 
            private String vlanId; 
            private String vpconnStatus; 

            /**
             * AccessPointId.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * AccessPointType.
             */
            public Builder accessPointType(String accessPointType) {
                this.accessPointType = accessPointType;
                return this;
            }

            /**
             * AdLocation.
             */
            public Builder adLocation(String adLocation) {
                this.adLocation = adLocation;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * BusinessStatus.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
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
             * EnabledTime.
             */
            public Builder enabledTime(String enabledTime) {
                this.enabledTime = enabledTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExpectSpec.
             */
            public Builder expectSpec(String expectSpec) {
                this.expectSpec = expectSpec;
                return this;
            }

            /**
             * HasReservationData.
             */
            public Builder hasReservationData(String hasReservationData) {
                this.hasReservationData = hasReservationData;
                return this;
            }

            /**
             * LineOperator.
             */
            public Builder lineOperator(String lineOperator) {
                this.lineOperator = lineOperator;
                return this;
            }

            /**
             * LoaStatus.
             */
            public Builder loaStatus(String loaStatus) {
                this.loaStatus = loaStatus;
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
             * OrderMode.
             */
            public Builder orderMode(String orderMode) {
                this.orderMode = orderMode;
                return this;
            }

            /**
             * ParentPhysicalConnectionAliUid.
             */
            public Builder parentPhysicalConnectionAliUid(Long parentPhysicalConnectionAliUid) {
                this.parentPhysicalConnectionAliUid = parentPhysicalConnectionAliUid;
                return this;
            }

            /**
             * ParentPhysicalConnectionId.
             */
            public Builder parentPhysicalConnectionId(String parentPhysicalConnectionId) {
                this.parentPhysicalConnectionId = parentPhysicalConnectionId;
                return this;
            }

            /**
             * PeerLocation.
             */
            public Builder peerLocation(String peerLocation) {
                this.peerLocation = peerLocation;
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
             * PortNumber.
             */
            public Builder portNumber(String portNumber) {
                this.portNumber = portNumber;
                return this;
            }

            /**
             * PortType.
             */
            public Builder portType(String portType) {
                this.portType = portType;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * RedundantPhysicalConnectionId.
             */
            public Builder redundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
                this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
                return this;
            }

            /**
             * ReservationActiveTime.
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * ReservationInternetChargeType.
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            /**
             * ReservationOrderType.
             */
            public Builder reservationOrderType(String reservationOrderType) {
                this.reservationOrderType = reservationOrderType;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * VirtualPhysicalConnectionCount.
             */
            public Builder virtualPhysicalConnectionCount(Integer virtualPhysicalConnectionCount) {
                this.virtualPhysicalConnectionCount = virtualPhysicalConnectionCount;
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
             * VpconnStatus.
             */
            public Builder vpconnStatus(String vpconnStatus) {
                this.vpconnStatus = vpconnStatus;
                return this;
            }

            public PhysicalConnectionType build() {
                return new PhysicalConnectionType(this);
            } 

        } 

    }
    public static class PhysicalConnectionSet extends TeaModel {
        @NameInMap("PhysicalConnectionType")
        private java.util.List < PhysicalConnectionType> physicalConnectionType;

        private PhysicalConnectionSet(Builder builder) {
            this.physicalConnectionType = builder.physicalConnectionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhysicalConnectionSet create() {
            return builder().build();
        }

        /**
         * @return physicalConnectionType
         */
        public java.util.List < PhysicalConnectionType> getPhysicalConnectionType() {
            return this.physicalConnectionType;
        }

        public static final class Builder {
            private java.util.List < PhysicalConnectionType> physicalConnectionType; 

            /**
             * PhysicalConnectionType.
             */
            public Builder physicalConnectionType(java.util.List < PhysicalConnectionType> physicalConnectionType) {
                this.physicalConnectionType = physicalConnectionType;
                return this;
            }

            public PhysicalConnectionSet build() {
                return new PhysicalConnectionSet(this);
            } 

        } 

    }
}
