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
         * The page number. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: **10**. Valid values: **1** to **50**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The list of Express Connect circuits.
         */
        public Builder physicalConnectionSet(PhysicalConnectionSet physicalConnectionSet) {
            this.physicalConnectionSet = physicalConnectionSet;
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
         * The number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePhysicalConnectionsResponseBody build() {
            return new DescribePhysicalConnectionsResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The key of tag N added to the resource. You can specify at most 20 tag keys. The tag key cannot be an empty string.
             * <p>
             * 
             * It can be up to 64 characters in length and can contain digits, periods (.), underscores (\_), and hyphens (-). It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N added to the resource. You can specify at most 20 tag values. The tag value can be an empty string.
             * <p>
             * 
             * It can be up to 128 characters in length and can contain digits, periods (.), underscores (\_), and hyphens (-). It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.
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
    public static class PhysicalConnectionTypeTags extends TeaModel {
        @NameInMap("tags")
        private java.util.List < Tags> tags;

        private PhysicalConnectionTypeTags(Builder builder) {
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhysicalConnectionTypeTags create() {
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
             * tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public PhysicalConnectionTypeTags build() {
                return new PhysicalConnectionTypeTags(this);
            } 

        } 

    }
    public static class PhysicalConnectionType extends TeaModel {
        @NameInMap("AccessPointId")
        private String accessPointId;

        @NameInMap("AccessPointType")
        private String accessPointType;

        @NameInMap("AdDetailLocation")
        private String adDetailLocation;

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

        @NameInMap("QosId")
        private String qosId;

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

        @NameInMap("Tags")
        private PhysicalConnectionTypeTags tags;

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
            this.adDetailLocation = builder.adDetailLocation;
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
            this.qosId = builder.qosId;
            this.redundantPhysicalConnectionId = builder.redundantPhysicalConnectionId;
            this.reservationActiveTime = builder.reservationActiveTime;
            this.reservationInternetChargeType = builder.reservationInternetChargeType;
            this.reservationOrderType = builder.reservationOrderType;
            this.resourceGroupId = builder.resourceGroupId;
            this.spec = builder.spec;
            this.status = builder.status;
            this.tags = builder.tags;
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
         * @return adDetailLocation
         */
        public String getAdDetailLocation() {
            return this.adDetailLocation;
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
         * @return qosId
         */
        public String getQosId() {
            return this.qosId;
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
         * @return tags
         */
        public PhysicalConnectionTypeTags getTags() {
            return this.tags;
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
            private String adDetailLocation; 
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
            private String qosId; 
            private String redundantPhysicalConnectionId; 
            private String reservationActiveTime; 
            private String reservationInternetChargeType; 
            private String reservationOrderType; 
            private String resourceGroupId; 
            private String spec; 
            private String status; 
            private PhysicalConnectionTypeTags tags; 
            private String type; 
            private Integer virtualPhysicalConnectionCount; 
            private String vlanId; 
            private String vpconnStatus; 

            /**
             * The ID of the access point.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * The type of the access point.
             */
            public Builder accessPointType(String accessPointType) {
                this.accessPointType = accessPointType;
                return this;
            }

            /**
             * The information about the data center and rack.
             */
            public Builder adDetailLocation(String adDetailLocation) {
                this.adDetailLocation = adDetailLocation;
                return this;
            }

            /**
             * The location of the access point.
             */
            public Builder adLocation(String adLocation) {
                this.adLocation = adLocation;
                return this;
            }

            /**
             * The maximum bandwidth of the Express Connect circuit.
             * <p>
             * 
             * Unit: Gbit/s.
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The status of the Express Connect circuit. Valid values:
             * <p>
             * 
             * *   **Normal**
             * *   **FinancialLocked**
             * *   **SecurityLocked**
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * The billing method of the Express Connect circuit.
             * <p>
             * 
             * If **Prepaid** is returned, it indicates that the Express Connect circuit is billed on a subscription basis.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The circuit code of the Express Connect circuit. The circuit code is provided by the connectivity provider.
             */
            public Builder circuitCode(String circuitCode) {
                this.circuitCode = circuitCode;
                return this;
            }

            /**
             * The time when the Express Connect circuit was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the Express Connect circuit.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the Express Connect circuit is enabled.
             */
            public Builder enabledTime(String enabledTime) {
                this.enabledTime = enabledTime;
                return this;
            }

            /**
             * The time when the Express Connect circuit expires.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The estimated maximum bandwidth of the shared Express Connect circuit. The estimated bandwidth takes effect after you complete the payment.
             * <p>
             * 
             * **M** indicates Mbit/s and **G** indicates Gbit/s.
             */
            public Builder expectSpec(String expectSpec) {
                this.expectSpec = expectSpec;
                return this;
            }

            /**
             * Indicates whether the data about pending orders is returned. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder hasReservationData(String hasReservationData) {
                this.hasReservationData = hasReservationData;
                return this;
            }

            /**
             * The connectivity provider of the Express Connect circuit. Valid values:
             * <p>
             * 
             * *   **CT**: China Telecom.
             * *   **CU**: China Unicom.
             * *   **CM**: China Mobile.
             * *   **CO**: other connectivity providers in the Chinese mainland.
             * *   **Equinix**: Equinix.
             * *   **Other**: other connectivity providers outside the Chinese mainland.
             */
            public Builder lineOperator(String lineOperator) {
                this.lineOperator = lineOperator;
                return this;
            }

            /**
             * The status of the letter of authorization (LOA). Valid values:
             * <p>
             * 
             * *   **Applying**
             * *   **Accept**
             * *   **Available**
             * *   **Rejected**
             * *   **Completing**
             * *   **Complete**
             * *   **Deleted**
             */
            public Builder loaStatus(String loaStatus) {
                this.loaStatus = loaStatus;
                return this;
            }

            /**
             * The name of the Express Connect circuit.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The payer for the shared Express Connect circuit. Valid values:
             * <p>
             * 
             * *   **PayByPhysicalConnectionOwner**: The partner pays for the shared Express Connect circuit.
             * *   **PayByVirtualPhysicalConnectionOwner**: The tenant pays for the shared Express Connect circuit.
             */
            public Builder orderMode(String orderMode) {
                this.orderMode = orderMode;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the shared Express Connect circuit belongs.
             */
            public Builder parentPhysicalConnectionAliUid(Long parentPhysicalConnectionAliUid) {
                this.parentPhysicalConnectionAliUid = parentPhysicalConnectionAliUid;
                return this;
            }

            /**
             * The ID of the Express Connect circuit that is used to create the hosted connection.
             */
            public Builder parentPhysicalConnectionId(String parentPhysicalConnectionId) {
                this.parentPhysicalConnectionId = parentPhysicalConnectionId;
                return this;
            }

            /**
             * The geographical location of the data center.
             */
            public Builder peerLocation(String peerLocation) {
                this.peerLocation = peerLocation;
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
             * The ID of the port on the access device.
             */
            public Builder portNumber(String portNumber) {
                this.portNumber = portNumber;
                return this;
            }

            /**
             * The port type. Valid values:
             * <p>
             * 
             * *   **100Base-T**: 100 Mbit/s copper Ethernet port
             * *   **1000Base-T**: 1,000 Mbit/s copper Ethernet port
             * *   **1000Base-LX**: 1,000 Mbit/s single-mode optical port (10 km)
             * *   **10GBase-T**: 10,000 Mbit/s copper Ethernet port
             * *   **10GBase-LR**: 10,000 Mbit/s single-mode optical port (10 km)
             * *   **40GBase-LR**: 40,000 Mbit/s single-mode optical port
             * *   **100GBase-LR**: 100,000 Mbit/s single-mode optical port
             * 
             * >  To create ports of 40GBase-LR and 100GBase-LR, you must first contact your account manager.
             */
            public Builder portType(String portType) {
                this.portType = portType;
                return this;
            }

            /**
             * The type of the Express Connect circuit. Valid values:
             * <p>
             * 
             * *   **VirtualPhysicalConnection**: shared Express Connect circuit
             * *   **PhysicalConnection**: dedicated Express Connect circuit
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * QosId.
             */
            public Builder qosId(String qosId) {
                this.qosId = qosId;
                return this;
            }

            /**
             * The ID of the redundant Express Connect circuit.
             */
            public Builder redundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
                this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
                return this;
            }

            /**
             * The time when the pending order takes effect.
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * The billing method of the pending order.
             * <p>
             * 
             * If **PayByBandwidth** is returned, it indicates that the Express Connect circuit is billed on a pay-by-bandwidth basis.
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            /**
             * The type of the pending order.
             * <p>
             * 
             * If the value is set to **RENEW**, it indicates that the order is placed for service renewal.
             */
            public Builder reservationOrderType(String reservationOrderType) {
                this.reservationOrderType = reservationOrderType;
                return this;
            }

            /**
             * The ID of the resource group to which the ACL belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The specification of the Express Connect circuit.
             * <p>
             * 
             * Unit: **G** (Gbit/s).
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * The status of the Express Connect circuit. Valid values:
             * <p>
             * 
             * *   **Initial**: The application is under review.
             * *   **Approved**: The application is approved.
             * *   **Allocating**: The system is allocating resources.
             * *   **Allocated**: The Express Connect circuit is under construction.
             * *   **Confirmed**: The Express Connect circuit is pending for user confirmation.
             * *   **Enabled**: The Express Connect circuit is enabled.
             * *   **Rejected**: The application is rejected.
             * *   **Canceled**: The application is canceled.
             * *   **Allocation Failed**: The system failed to allocate resources.
             * *   **Terminating**: The Express Connect circuit is being disabled.
             * *   **Terminated**: The Express Connect circuit is disabled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag list.
             */
            public Builder tags(PhysicalConnectionTypeTags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The type of resource to which the Express Connect circuit is connected. Only **VPC** may be returned.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The number of hosted connections that are established over the Express Connect circuit.
             */
            public Builder virtualPhysicalConnectionCount(Integer virtualPhysicalConnectionCount) {
                this.virtualPhysicalConnectionCount = virtualPhysicalConnectionCount;
                return this;
            }

            /**
             * The VLAN ID of the shared Express Connect circuit.
             */
            public Builder vlanId(String vlanId) {
                this.vlanId = vlanId;
                return this;
            }

            /**
             * The status of the hosted connection. Valid values:
             * <p>
             * 
             * *   **Confirmed**
             * *   **UnConfirmed**
             * *   **Deleted**
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
