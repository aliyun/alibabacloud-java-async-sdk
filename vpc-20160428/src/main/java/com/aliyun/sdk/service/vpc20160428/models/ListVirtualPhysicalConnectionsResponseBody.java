// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVirtualPhysicalConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirtualPhysicalConnectionsResponseBody</p>
 */
public class ListVirtualPhysicalConnectionsResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VirtualPhysicalConnections")
    private java.util.List < VirtualPhysicalConnections> virtualPhysicalConnections;

    private ListVirtualPhysicalConnectionsResponseBody(Builder builder) {
        this.count = builder.count;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.virtualPhysicalConnections = builder.virtualPhysicalConnections;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirtualPhysicalConnectionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return virtualPhysicalConnections
     */
    public java.util.List < VirtualPhysicalConnections> getVirtualPhysicalConnections() {
        return this.virtualPhysicalConnections;
    }

    public static final class Builder {
        private Integer count; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < VirtualPhysicalConnections> virtualPhysicalConnections; 

        /**
         * The number of entries returned in this query.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If the value of **NextToken** is not returned, it indicates that no next query is to be sent.
         * *   If **NextToken** was returned in the previous query, specify the value to obtain the next set of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The list of hosted connections returned.
         */
        public Builder virtualPhysicalConnections(java.util.List < VirtualPhysicalConnections> virtualPhysicalConnections) {
            this.virtualPhysicalConnections = virtualPhysicalConnections;
            return this;
        }

        public ListVirtualPhysicalConnectionsResponseBody build() {
            return new ListVirtualPhysicalConnectionsResponseBody(this);
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
             * The key of tag N that is added to the resource. You can specify at most 20 tag keys. The tag key cannot be an empty string.
             * <p>
             * 
             * It can be up to 64 characters in length and can contain digits, periods (.), underscores (\_), and hyphens (-). It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N that is added to the resource. You can specify at most 20 tag values. The tag value can be an empty string.
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
    public static class VirtualPhysicalConnections extends TeaModel {
        @NameInMap("AccessPointId")
        private String accessPointId;

        @NameInMap("AdLocation")
        private String adLocation;

        @NameInMap("AliUid")
        private String aliUid;

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

        @NameInMap("LineOperator")
        private String lineOperator;

        @NameInMap("LoaStatus")
        private String loaStatus;

        @NameInMap("Name")
        private String name;

        @NameInMap("OrderMode")
        private String orderMode;

        @NameInMap("ParentPhysicalConnectionAliUid")
        private String parentPhysicalConnectionAliUid;

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

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("Type")
        private String type;

        @NameInMap("VirtualPhysicalConnectionStatus")
        private String virtualPhysicalConnectionStatus;

        @NameInMap("VlanId")
        private String vlanId;

        private VirtualPhysicalConnections(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.adLocation = builder.adLocation;
            this.aliUid = builder.aliUid;
            this.bandwidth = builder.bandwidth;
            this.businessStatus = builder.businessStatus;
            this.chargeType = builder.chargeType;
            this.circuitCode = builder.circuitCode;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.enabledTime = builder.enabledTime;
            this.endTime = builder.endTime;
            this.expectSpec = builder.expectSpec;
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
            this.resourceGroupId = builder.resourceGroupId;
            this.spec = builder.spec;
            this.status = builder.status;
            this.tags = builder.tags;
            this.type = builder.type;
            this.virtualPhysicalConnectionStatus = builder.virtualPhysicalConnectionStatus;
            this.vlanId = builder.vlanId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualPhysicalConnections create() {
            return builder().build();
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return adLocation
         */
        public String getAdLocation() {
            return this.adLocation;
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
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
        public String getParentPhysicalConnectionAliUid() {
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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return virtualPhysicalConnectionStatus
         */
        public String getVirtualPhysicalConnectionStatus() {
            return this.virtualPhysicalConnectionStatus;
        }

        /**
         * @return vlanId
         */
        public String getVlanId() {
            return this.vlanId;
        }

        public static final class Builder {
            private String accessPointId; 
            private String adLocation; 
            private String aliUid; 
            private Long bandwidth; 
            private String businessStatus; 
            private String chargeType; 
            private String circuitCode; 
            private String creationTime; 
            private String description; 
            private String enabledTime; 
            private String endTime; 
            private String expectSpec; 
            private String lineOperator; 
            private String loaStatus; 
            private String name; 
            private String orderMode; 
            private String parentPhysicalConnectionAliUid; 
            private String parentPhysicalConnectionId; 
            private String peerLocation; 
            private String physicalConnectionId; 
            private String portNumber; 
            private String portType; 
            private String productType; 
            private String redundantPhysicalConnectionId; 
            private String resourceGroupId; 
            private String spec; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String type; 
            private String virtualPhysicalConnectionStatus; 
            private String vlanId; 

            /**
             * The ID of the access point that is associated with the Express Connect circuit.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * The geographical location of the access device.
             */
            public Builder adLocation(String adLocation) {
                this.adLocation = adLocation;
                return this;
            }

            /**
             * The Alibaba Cloud account ID of the hosted connection owner.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The bandwidth of the Express Connect circuit. Unit: Mbit/s.
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
             * The expiration date of the hosted connection.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
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
             * *   **PayByPhysicalConnectionOwner**: the owner of the shared Express Connect circuit
             * *   **PayByVirtualPhysicalConnectionOwner**: the owner of the hosted connection
             */
            public Builder orderMode(String orderMode) {
                this.orderMode = orderMode;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the Express Connect circuit belongs.
             */
            public Builder parentPhysicalConnectionAliUid(String parentPhysicalConnectionAliUid) {
                this.parentPhysicalConnectionAliUid = parentPhysicalConnectionAliUid;
                return this;
            }

            /**
             * The ID of the Express Connect circuit.
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
             * The ID of the hosted connection.
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
             * The ID of the redundant Express Connect circuit.
             */
            public Builder redundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
                this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
                return this;
            }

            /**
             * The ID of the resource group to which the hosted connection belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The bandwidth value of the hosted connection.
             * <p>
             * 
             * **M** indicates Mbit/s and **G** indicates Gbit/s.
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
             * *   **Terminated**: The Express Connect circuit is disabled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag list.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The type of Express Connect circuit. Default value: **VPC**.
             */
            public Builder type(String type) {
                this.type = type;
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
            public Builder virtualPhysicalConnectionStatus(String virtualPhysicalConnectionStatus) {
                this.virtualPhysicalConnectionStatus = virtualPhysicalConnectionStatus;
                return this;
            }

            /**
             * The VLAN ID of the hosted connection.
             */
            public Builder vlanId(String vlanId) {
                this.vlanId = vlanId;
                return this;
            }

            public VirtualPhysicalConnections build() {
                return new VirtualPhysicalConnections(this);
            } 

        } 

    }
}
