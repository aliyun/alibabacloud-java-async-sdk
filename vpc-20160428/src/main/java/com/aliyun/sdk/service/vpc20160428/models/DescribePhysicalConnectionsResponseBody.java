// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePhysicalConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePhysicalConnectionsResponseBody</p>
 */
public class DescribePhysicalConnectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PhysicalConnectionSet")
    private PhysicalConnectionSet physicalConnectionSet;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The number of entries per page. Default value: <strong>10</strong>. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of Express Connect circuits.</p>
         */
        public Builder physicalConnectionSet(PhysicalConnectionSet physicalConnectionSet) {
            this.physicalConnectionSet = physicalConnectionSet;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0E6D0EC4-7C91-53E2-9F65-64BF713114B0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePhysicalConnectionsResponseBody build() {
            return new DescribePhysicalConnectionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePhysicalConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePhysicalConnectionsResponseBody</p>
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
             * <p>The key of tag N added to the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N added to the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
     * {@link DescribePhysicalConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePhysicalConnectionsResponseBody</p>
     */
    public static class PhysicalConnectionTypeTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tags")
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
    /**
     * 
     * {@link DescribePhysicalConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePhysicalConnectionsResponseBody</p>
     */
    public static class PhysicalConnectionType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessPointId")
        private String accessPointId;

        @com.aliyun.core.annotation.NameInMap("AccessPointType")
        private String accessPointType;

        @com.aliyun.core.annotation.NameInMap("AdDetailLocation")
        private String adDetailLocation;

        @com.aliyun.core.annotation.NameInMap("AdLocation")
        private String adLocation;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Long bandwidth;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CircuitCode")
        private String circuitCode;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnabledTime")
        private String enabledTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExpectSpec")
        private String expectSpec;

        @com.aliyun.core.annotation.NameInMap("HasReservationData")
        private String hasReservationData;

        @com.aliyun.core.annotation.NameInMap("LineOperator")
        private String lineOperator;

        @com.aliyun.core.annotation.NameInMap("LoaStatus")
        private String loaStatus;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OrderMode")
        private String orderMode;

        @com.aliyun.core.annotation.NameInMap("ParentPhysicalConnectionAliUid")
        private Long parentPhysicalConnectionAliUid;

        @com.aliyun.core.annotation.NameInMap("ParentPhysicalConnectionId")
        private String parentPhysicalConnectionId;

        @com.aliyun.core.annotation.NameInMap("PeerLocation")
        private String peerLocation;

        @com.aliyun.core.annotation.NameInMap("PhysicalConnectionId")
        private String physicalConnectionId;

        @com.aliyun.core.annotation.NameInMap("PortNumber")
        private String portNumber;

        @com.aliyun.core.annotation.NameInMap("PortType")
        private String portType;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("QosId")
        private String qosId;

        @com.aliyun.core.annotation.NameInMap("RedundantPhysicalConnectionId")
        private String redundantPhysicalConnectionId;

        @com.aliyun.core.annotation.NameInMap("ReservationActiveTime")
        private String reservationActiveTime;

        @com.aliyun.core.annotation.NameInMap("ReservationInternetChargeType")
        private String reservationInternetChargeType;

        @com.aliyun.core.annotation.NameInMap("ReservationOrderType")
        private String reservationOrderType;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private PhysicalConnectionTypeTags tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VirtualPhysicalConnectionCount")
        private Integer virtualPhysicalConnectionCount;

        @com.aliyun.core.annotation.NameInMap("VlanId")
        private String vlanId;

        @com.aliyun.core.annotation.NameInMap("VpconnStatus")
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
             * <p>The ID of the Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-cn-hangzhou-finance-yh-E</p>
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * <p>The type of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder accessPointType(String accessPointType) {
                this.accessPointType = accessPointType;
                return this;
            }

            /**
             * <p>The information about the data center and rack.</p>
             * 
             * <strong>example:</strong>
             * <p>Position 30, Server Rack JXX, Booth ET135ET135-XX-2, Room XX, Building 10, XX Road, XX Town, XX District, Hangzhou, Zhejiang Province</p>
             */
            public Builder adDetailLocation(String adDetailLocation) {
                this.adDetailLocation = adDetailLocation;
                return this;
            }

            /**
             * <p>The location of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>Number 10, XX Road, XX Town, XX District, Hangzhou City, Zhejiang Province.</p>
             */
            public Builder adLocation(String adLocation) {
                this.adLocation = adLocation;
                return this;
            }

            /**
             * <p>The maximum bandwidth of the Express Connect circuit.</p>
             * <p>Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The status of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: enabled</li>
             * <li><strong>FinancialLocked</strong>: locked due to overdue payments</li>
             * <li><strong>SecurityLocked</strong>: locked for security reasons</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>The billing method of the Express Connect circuit.</p>
             * <p>If <strong>Prepaid</strong> is returned, it indicates that the Express Connect circuit is billed on a subscription basis.</p>
             * 
             * <strong>example:</strong>
             * <p>Prepaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The circuit code of the Express Connect circuit. The circuit code is provided by the connectivity provider.</p>
             * 
             * <strong>example:</strong>
             * <p>longtel001</p>
             */
            public Builder circuitCode(String circuitCode) {
                this.circuitCode = circuitCode;
                return this;
            }

            /**
             * <p>The time when the Express Connect circuit was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-24T07:30:58Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>desctest</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the Express Connect circuit was enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-24T07:33:18Z</p>
             */
            public Builder enabledTime(String enabledTime) {
                this.enabledTime = enabledTime;
                return this;
            }

            /**
             * <p>The time when the Express Connect circuit expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-24T16:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The estimated maximum bandwidth of the shared Express Connect circuit. The estimated bandwidth takes effect after you complete the payment.</p>
             * <p>Unit: <strong>M</strong> (Mbit/s) and <strong>G</strong> (Gbit/s).</p>
             * 
             * <strong>example:</strong>
             * <p>50M</p>
             */
            public Builder expectSpec(String expectSpec) {
                this.expectSpec = expectSpec;
                return this;
            }

            /**
             * <p>Indicates whether the data about pending orders is returned. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasReservationData(String hasReservationData) {
                this.hasReservationData = hasReservationData;
                return this;
            }

            /**
             * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>CT</strong>: China Telecom.</li>
             * <li><strong>CU</strong>: China Unicom.</li>
             * <li><strong>CM</strong>: China Mobile.</li>
             * <li><strong>CO</strong>: other connectivity providers in the Chinese mainland.</li>
             * <li><strong>Equinix</strong>: Equinix.</li>
             * <li><strong>Other</strong>: other connectivity providers outside the Chinese mainland.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CT</p>
             */
            public Builder lineOperator(String lineOperator) {
                this.lineOperator = lineOperator;
                return this;
            }

            /**
             * <p>The status of the letter of authorization (LOA). Valid values:</p>
             * <ul>
             * <li><strong>Applying</strong>: The LOA is pending for approval.</li>
             * <li><strong>Accept</strong>: The LOA is approved.</li>
             * <li><strong>Available</strong>: The LOA is available.</li>
             * <li><strong>Rejected</strong>: The LOA is rejected.</li>
             * <li><strong>Completing</strong>: The Express Connect circuit is under construction.</li>
             * <li><strong>Complete</strong>: The Express Connect circuit is installed.</li>
             * <li><strong>Deleted</strong>: The LOA is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder loaStatus(String loaStatus) {
                this.loaStatus = loaStatus;
                return this;
            }

            /**
             * <p>The name of the Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>nametest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The payer for the hosted connection. Valid values:</p>
             * <ul>
             * <li><strong>PayByPhysicalConnectionOwner</strong>: The partner pays for the shared Express Connect circuit.</li>
             * <li><strong>PayByVirtualPhysicalConnectionOwner</strong>: The tenant pays for the shared Express Connect circuit.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByPhysicalConnectionOwner</p>
             */
            public Builder orderMode(String orderMode) {
                this.orderMode = orderMode;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the parent Express Connect circuit belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>283117732402483989</p>
             */
            public Builder parentPhysicalConnectionAliUid(Long parentPhysicalConnectionAliUid) {
                this.parentPhysicalConnectionAliUid = parentPhysicalConnectionAliUid;
                return this;
            }

            /**
             * <p>The ID of the parent Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-bp1ciz7ekd2grn1as****</p>
             */
            public Builder parentPhysicalConnectionId(String parentPhysicalConnectionId) {
                this.parentPhysicalConnectionId = parentPhysicalConnectionId;
                return this;
            }

            /**
             * <p>The geographical location of the data center.</p>
             * 
             * <strong>example:</strong>
             * <p>XX Number, XX Road, XX Town, XX District, Hangzhou City, Zhejiang Province.</p>
             */
            public Builder peerLocation(String peerLocation) {
                this.peerLocation = peerLocation;
                return this;
            }

            /**
             * <p>The ID of the Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-bp1ciz7ekd2grn1as****</p>
             */
            public Builder physicalConnectionId(String physicalConnectionId) {
                this.physicalConnectionId = physicalConnectionId;
                return this;
            }

            /**
             * <p>The ID of the port on the access device.</p>
             * 
             * <strong>example:</strong>
             * <p>1/1/1</p>
             */
            public Builder portNumber(String portNumber) {
                this.portNumber = portNumber;
                return this;
            }

            /**
             * <p>The port type of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>100Base-T</strong>: 100 Mbit/s copper Ethernet port</li>
             * <li><strong>1000Base-T</strong>: 1,000 Mbit/s copper Ethernet port</li>
             * <li><strong>1000Base-LX</strong>: 1,000 Mbit/s single-mode optical port (10 km)</li>
             * <li><strong>10GBase-T</strong>: 10,000 Mbit/s copper Ethernet port</li>
             * <li><strong>10GBase-LR</strong>: 10,000 Mbit/s single-mode optical port (10 km)</li>
             * <li><strong>40GBase-LR</strong>: 40,000 Mbit/s single-mode optical port</li>
             * <li><strong>100GBase-LR</strong>: 100,000 Mbit/s single-mode optical port</li>
             * </ul>
             * <blockquote>
             * <p>Whether 40GBase-LR and 100GBase-LR ports can be created depends on resource supplies. For more information, contact your account manager.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10GBase-LR</p>
             */
            public Builder portType(String portType) {
                this.portType = portType;
                return this;
            }

            /**
             * <p>The type of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>VirtualPhysicalConnection</strong>: shared Express Connect circuit</li>
             * <li><strong>PhysicalConnection</strong>: dedicated Express Connect circuit</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PhysicalConnection</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The ID of the QoS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-bp10s3szn8rgnxuw7****</p>
             */
            public Builder qosId(String qosId) {
                this.qosId = qosId;
                return this;
            }

            /**
             * <p>The ID of the standby Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-119mfjzm****</p>
             */
            public Builder redundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
                this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
                return this;
            }

            /**
             * <p>The time when the pending order takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-25T11:01:04Z</p>
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * <p>The billing method of the pending order.</p>
             * <p>If <strong>PayByBandwidth</strong> is returned, it indicates that the Express Connect circuit is billed on a pay-by-bandwidth basis.</p>
             * 
             * <strong>example:</strong>
             * <p>PayByBandwidth</p>
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            /**
             * <p>The type of the pending order.</p>
             * <p>If the value is <strong>RENEW</strong>, it indicates that the order is placed for service renewal.</p>
             * 
             * <strong>example:</strong>
             * <p>RENEW</p>
             */
            public Builder reservationOrderType(String reservationOrderType) {
                this.reservationOrderType = reservationOrderType;
                return this;
            }

            /**
             * <p>The resource group ID to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmwu3k52prgdi</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The specification of the Express Connect circuit.</p>
             * <p>Unit: <strong>G</strong> (Gbit/s).</p>
             * 
             * <strong>example:</strong>
             * <p>10G</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The status of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>Initial</strong></li>
             * <li><strong>Approved</strong></li>
             * <li><strong>Allocating</strong></li>
             * <li><strong>Allocated</strong></li>
             * <li><strong>Confirmed</strong></li>
             * <li><strong>Enabled</strong></li>
             * <li><strong>Rejected</strong></li>
             * <li><strong>Canceled</strong></li>
             * <li><strong>Allocation Failed</strong></li>
             * <li><strong>Terminating</strong></li>
             * <li><strong>Terminated</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags that are added to the cluster.</p>
             */
            public Builder tags(PhysicalConnectionTypeTags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The type of resource to which the Express Connect circuit is connected. Only <strong>VPC</strong> may be returned.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The number of Express Connect circuits that are established.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder virtualPhysicalConnectionCount(Integer virtualPhysicalConnectionCount) {
                this.virtualPhysicalConnectionCount = virtualPhysicalConnectionCount;
                return this;
            }

            /**
             * <p>The VLAN ID of the shared Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder vlanId(String vlanId) {
                this.vlanId = vlanId;
                return this;
            }

            /**
             * <p>The status of the shared Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>Confirmed</strong></li>
             * <li><strong>UnConfirmed</strong></li>
             * <li><strong>Deleted</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Confirmed</p>
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
    /**
     * 
     * {@link DescribePhysicalConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePhysicalConnectionsResponseBody</p>
     */
    public static class PhysicalConnectionSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PhysicalConnectionType")
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
