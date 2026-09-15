// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ListVirtualPhysicalConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirtualPhysicalConnectionsResponseBody</p>
 */
public class ListVirtualPhysicalConnectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VirtualPhysicalConnections")
    private java.util.List<VirtualPhysicalConnections> virtualPhysicalConnections;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<VirtualPhysicalConnections> getVirtualPhysicalConnections() {
        return this.virtualPhysicalConnections;
    }

    public static final class Builder {
        private Integer count; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<VirtualPhysicalConnections> virtualPhysicalConnections; 

        private Builder() {
        } 

        private Builder(ListVirtualPhysicalConnectionsResponseBody model) {
            this.count = model.count;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.virtualPhysicalConnections = model.virtualPhysicalConnections;
        } 

        /**
         * <p>The number of entries returned in the current query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>Indicates whether a next query token exists. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
         * <li>If <strong>NextToken</strong> has a return value, the value is the token for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dd20****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2A55F69E-EE3D-5CBE-8805-734F7D5B46B9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of shared Express Connect circuits.</p>
         */
        public Builder virtualPhysicalConnections(java.util.List<VirtualPhysicalConnections> virtualPhysicalConnections) {
            this.virtualPhysicalConnections = virtualPhysicalConnections;
            return this;
        }

        public ListVirtualPhysicalConnectionsResponseBody build() {
            return new ListVirtualPhysicalConnectionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVirtualPhysicalConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirtualPhysicalConnectionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 64 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
     * {@link ListVirtualPhysicalConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirtualPhysicalConnectionsResponseBody</p>
     */
    public static class VirtualPhysicalConnections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessPointId")
        private String accessPointId;

        @com.aliyun.core.annotation.NameInMap("AdLocation")
        private String adLocation;

        @com.aliyun.core.annotation.NameInMap("AliUid")
        private String aliUid;

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

        @com.aliyun.core.annotation.NameInMap("LineOperator")
        private String lineOperator;

        @com.aliyun.core.annotation.NameInMap("LoaStatus")
        private String loaStatus;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OrderMode")
        private String orderMode;

        @com.aliyun.core.annotation.NameInMap("ParentPhysicalConnectionAliUid")
        private String parentPhysicalConnectionAliUid;

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

        @com.aliyun.core.annotation.NameInMap("RedundantPhysicalConnectionId")
        private String redundantPhysicalConnectionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VirtualPhysicalConnectionStatus")
        private String virtualPhysicalConnectionStatus;

        @com.aliyun.core.annotation.NameInMap("VlanId")
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
        public java.util.List<Tags> getTags() {
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
            private java.util.List<Tags> tags; 
            private String type; 
            private String virtualPhysicalConnectionStatus; 
            private String vlanId; 

            private Builder() {
            } 

            private Builder(VirtualPhysicalConnections model) {
                this.accessPointId = model.accessPointId;
                this.adLocation = model.adLocation;
                this.aliUid = model.aliUid;
                this.bandwidth = model.bandwidth;
                this.businessStatus = model.businessStatus;
                this.chargeType = model.chargeType;
                this.circuitCode = model.circuitCode;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.enabledTime = model.enabledTime;
                this.endTime = model.endTime;
                this.expectSpec = model.expectSpec;
                this.lineOperator = model.lineOperator;
                this.loaStatus = model.loaStatus;
                this.name = model.name;
                this.orderMode = model.orderMode;
                this.parentPhysicalConnectionAliUid = model.parentPhysicalConnectionAliUid;
                this.parentPhysicalConnectionId = model.parentPhysicalConnectionId;
                this.peerLocation = model.peerLocation;
                this.physicalConnectionId = model.physicalConnectionId;
                this.portNumber = model.portNumber;
                this.portType = model.portType;
                this.productType = model.productType;
                this.redundantPhysicalConnectionId = model.redundantPhysicalConnectionId;
                this.resourceGroupId = model.resourceGroupId;
                this.spec = model.spec;
                this.status = model.status;
                this.tags = model.tags;
                this.type = model.type;
                this.virtualPhysicalConnectionStatus = model.virtualPhysicalConnectionStatus;
                this.vlanId = model.vlanId;
            } 

            /**
             * <p>The access point ID of the Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-cn-hangzhou-finance-yh-E</p>
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * <p>The physical location of the access device for the Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>Yuhang Economic Development Zone, XX Intersection, Yuhang XX Data Center, Room E***</p>
             */
            public Builder adLocation(String adLocation) {
                this.adLocation = adLocation;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the shared Express Connect circuits owner.</p>
             * 
             * <strong>example:</strong>
             * <p>15346073170691****</p>
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The bandwidth of the Express Connect circuit. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The business status of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: Enabled.</li>
             * <li><strong>FinancialLocked</strong>: Locked due to overdue payment.</li>
             * <li><strong>SecurityLocked</strong>: Locked for security reasons.</li>
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
             * <p>Valid values: <strong>Prepaid</strong>, which indicates subscription.</p>
             * 
             * <strong>example:</strong>
             * <p>Prepaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The circuit code provided by the carrier for the Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>longtel001</p>
             */
            public Builder circuitCode(String circuitCode) {
                this.circuitCode = circuitCode;
                return this;
            }

            /**
             * <p>The time when the Express Connect circuit was created. The time is displayed in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-08T12:20:55Z</p>
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
             * <p>The time when the Express Connect circuit was enabled. The time is displayed in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-08T10:44:00Z</p>
             */
            public Builder enabledTime(String enabledTime) {
                this.enabledTime = enabledTime;
                return this;
            }

            /**
             * <p>The expiration time of the shared Express Connect circuits.</p>
             * <p>The time is displayed in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-08T16:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The expected bandwidth value of the shared Express Connect circuits. The expected bandwidth value takes effect only after payment is completed.</p>
             * <p>Unit: <strong>M</strong> indicates Mbit/s, and <strong>G</strong> indicates Gbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>50M</p>
             */
            public Builder expectSpec(String expectSpec) {
                this.expectSpec = expectSpec;
                return this;
            }

            /**
             * <p>The carrier that provides the physical line for access. Valid values:</p>
             * <ul>
             * <li><strong>CT</strong>: China Telecom.</li>
             * <li><strong>CU</strong>: China Unicom.</li>
             * <li><strong>CM</strong>: China Mobile.</li>
             * <li><strong>CO</strong>: Other carriers in the Chinese mainland.</li>
             * <li><strong>Equinix</strong>: Equinix.</li>
             * <li><strong>Other</strong>: Other carriers outside the Chinese mainland.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CU</p>
             */
            public Builder lineOperator(String lineOperator) {
                this.lineOperator = lineOperator;
                return this;
            }

            /**
             * <p>The status of the Letter of Authorization (LOA). Valid values:</p>
             * <ul>
             * <li><strong>Applying</strong>: The LOA application is being processed.</li>
             * <li><strong>Accept</strong>: The LOA application is approved.</li>
             * <li><strong>Available</strong>: The LOA is available.</li>
             * <li><strong>Rejected</strong>: The LOA application is rejected.</li>
             * <li><strong>Completing</strong>: The Express Connect circuit is under construction.</li>
             * <li><strong>Complete</strong>: The Express Connect circuit construction is complete.</li>
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
             * <p>The payer of the shared Express Connect circuits. Valid values:</p>
             * <ul>
             * <li><strong>PayByPhysicalConnectionOwner</strong>: The owner of the Express Connect circuit associated with the shared Express Connect circuits is the payer.</li>
             * <li><strong>PayByVirtualPhysicalConnectionOwner</strong>: The owner of the shared Express Connect circuits is the payer.</li>
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
             * <p>The Alibaba Cloud account ID that owns the Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>18311773240248****</p>
             */
            public Builder parentPhysicalConnectionAliUid(String parentPhysicalConnectionAliUid) {
                this.parentPhysicalConnectionAliUid = parentPhysicalConnectionAliUid;
                return this;
            }

            /**
             * <p>The instance ID of the Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-bp1ciz7ekd2grn1as****</p>
             */
            public Builder parentPhysicalConnectionId(String parentPhysicalConnectionId) {
                this.parentPhysicalConnectionId = parentPhysicalConnectionId;
                return this;
            }

            /**
             * <p>The geographic location of the on-premises data center.</p>
             * 
             * <strong>example:</strong>
             * <p>No. XX, XX Street, XX District, Hangzhou, Zhejiang Province</p>
             */
            public Builder peerLocation(String peerLocation) {
                this.peerLocation = peerLocation;
                return this;
            }

            /**
             * <p>The instance ID of the shared Express Connect circuits.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-bp1mrgfbtmc9brre7****</p>
             */
            public Builder physicalConnectionId(String physicalConnectionId) {
                this.physicalConnectionId = physicalConnectionId;
                return this;
            }

            /**
             * <p>The port number of the access device for the Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder portNumber(String portNumber) {
                this.portNumber = portNumber;
                return this;
            }

            /**
             * <p>The port type of the access device for the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>100Base-T</strong>: 100M Ethernet port.</li>
             * <li><strong>1000Base-T</strong>: GE electrical port.</li>
             * <li><strong>1000Base-LX</strong>: GE single-mode optical port (10 km).</li>
             * <li><strong>10GBase-T</strong>: 10 GE electrical port.</li>
             * <li><strong>10GBase-LR</strong>: 10 GE single-mode optical port (10 km).</li>
             * <li><strong>40GBase-LR</strong>: 40 GE single-mode optical port.</li>
             * <li><strong>100GBase-LR</strong>: 100 GE single-mode optical port.</li>
             * </ul>
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
             * <li><strong>VirtualPhysicalConnection</strong>: Shared Express Connect circuits.</li>
             * <li><strong>PhysicalConnection</strong>: Dedicated Express Connect circuit.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VirtualPhysicalConnection</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The ID of the redundant Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-119mfjzm****</p>
             */
            public Builder redundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
                this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the shared Express Connect circuits belong.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm3wmsyui****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The bandwidth value of the shared Express Connect circuits.</p>
             * <p>Unit: <strong>M</strong> indicates Mbit/s, and <strong>G</strong> indicates Gbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>50M</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The status of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>Initial</strong>: The application is under review.</li>
             * <li><strong>Approved</strong>: The application is approved.</li>
             * <li><strong>Allocating</strong>: Resources are being allocated.</li>
             * <li><strong>Allocated</strong>: Under construction.</li>
             * <li><strong>Confirmed</strong>: Waiting for user confirmation.</li>
             * <li><strong>Enabled</strong>: Enabled.</li>
             * <li><strong>Rejected</strong>: The application is rejected.</li>
             * <li><strong>Canceled</strong>: Canceled.</li>
             * <li><strong>Allocation Failed</strong>: Resource allocation failed.</li>
             * <li><strong>Terminated</strong>: Terminated.</li>
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
             * <p>The tag list.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The type of the Express Connect circuit. Default value: <strong>VPC</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The business status of the shared Express Connect circuits. Valid values:</p>
             * <ul>
             * <li><strong>Confirmed</strong>: The shared Express Connect circuits have been accepted.</li>
             * <li><strong>UnConfirmed</strong>: The shared Express Connect circuits have not been accepted.</li>
             * <li><strong>Deleted</strong>: The shared Express Connect circuits have been deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Confirmed</p>
             */
            public Builder virtualPhysicalConnectionStatus(String virtualPhysicalConnectionStatus) {
                this.virtualPhysicalConnectionStatus = virtualPhysicalConnectionStatus;
                return this;
            }

            /**
             * <p>The VLAN ID of the shared Express Connect circuits.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
