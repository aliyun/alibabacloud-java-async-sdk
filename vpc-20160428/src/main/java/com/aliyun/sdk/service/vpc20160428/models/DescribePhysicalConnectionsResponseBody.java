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

        private Builder() {
        } 

        private Builder(DescribePhysicalConnectionsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.physicalConnectionSet = model.physicalConnectionSet;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the list. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. Default value: <strong>10</strong>. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The total number of entries returned.</p>
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
    public static class MacsecKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cak")
        private String cak;

        @com.aliyun.core.annotation.NameInMap("CipherSuite")
        private String cipherSuite;

        @com.aliyun.core.annotation.NameInMap("Ckn")
        private String ckn;

        @com.aliyun.core.annotation.NameInMap("StartOn")
        private String startOn;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private MacsecKey(Builder builder) {
            this.cak = builder.cak;
            this.cipherSuite = builder.cipherSuite;
            this.ckn = builder.ckn;
            this.startOn = builder.startOn;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MacsecKey create() {
            return builder().build();
        }

        /**
         * @return cak
         */
        public String getCak() {
            return this.cak;
        }

        /**
         * @return cipherSuite
         */
        public String getCipherSuite() {
            return this.cipherSuite;
        }

        /**
         * @return ckn
         */
        public String getCkn() {
            return this.ckn;
        }

        /**
         * @return startOn
         */
        public String getStartOn() {
            return this.startOn;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String cak; 
            private String cipherSuite; 
            private String ckn; 
            private String startOn; 
            private String status; 

            private Builder() {
            } 

            private Builder(MacsecKey model) {
                this.cak = model.cak;
                this.cipherSuite = model.cipherSuite;
                this.ckn = model.ckn;
                this.startOn = model.startOn;
                this.status = model.status;
            } 

            /**
             * Cak.
             */
            public Builder cak(String cak) {
                this.cak = cak;
                return this;
            }

            /**
             * CipherSuite.
             */
            public Builder cipherSuite(String cipherSuite) {
                this.cipherSuite = cipherSuite;
                return this;
            }

            /**
             * Ckn.
             */
            public Builder ckn(String ckn) {
                this.ckn = ckn;
                return this;
            }

            /**
             * StartOn.
             */
            public Builder startOn(String startOn) {
                this.startOn = startOn;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public MacsecKey build() {
                return new MacsecKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePhysicalConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePhysicalConnectionsResponseBody</p>
     */
    public static class MacsecKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MacsecKey")
        private java.util.List<MacsecKey> macsecKey;

        private MacsecKeys(Builder builder) {
            this.macsecKey = builder.macsecKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MacsecKeys create() {
            return builder().build();
        }

        /**
         * @return macsecKey
         */
        public java.util.List<MacsecKey> getMacsecKey() {
            return this.macsecKey;
        }

        public static final class Builder {
            private java.util.List<MacsecKey> macsecKey; 

            private Builder() {
            } 

            private Builder(MacsecKeys model) {
                this.macsecKey = model.macsecKey;
            } 

            /**
             * MacsecKey.
             */
            public Builder macsecKey(java.util.List<MacsecKey> macsecKey) {
                this.macsecKey = macsecKey;
                return this;
            }

            public MacsecKeys build() {
                return new MacsecKeys(this);
            } 

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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
        private java.util.List<Tags> tags;

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
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(PhysicalConnectionTypeTags model) {
                this.tags = model.tags;
            } 

            /**
             * tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
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

        @com.aliyun.core.annotation.NameInMap("DeviceFeaturesSelected")
        private String deviceFeaturesSelected;

        @com.aliyun.core.annotation.NameInMap("DownDelayTime")
        private Integer downDelayTime;

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

        @com.aliyun.core.annotation.NameInMap("MacsecKeys")
        private MacsecKeys macsecKeys;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OpticalModuleModel")
        private String opticalModuleModel;

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
            this.deviceFeaturesSelected = builder.deviceFeaturesSelected;
            this.downDelayTime = builder.downDelayTime;
            this.enabledTime = builder.enabledTime;
            this.endTime = builder.endTime;
            this.expectSpec = builder.expectSpec;
            this.hasReservationData = builder.hasReservationData;
            this.lineOperator = builder.lineOperator;
            this.loaStatus = builder.loaStatus;
            this.macsecKeys = builder.macsecKeys;
            this.name = builder.name;
            this.opticalModuleModel = builder.opticalModuleModel;
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
         * @return deviceFeaturesSelected
         */
        public String getDeviceFeaturesSelected() {
            return this.deviceFeaturesSelected;
        }

        /**
         * @return downDelayTime
         */
        public Integer getDownDelayTime() {
            return this.downDelayTime;
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
         * @return macsecKeys
         */
        public MacsecKeys getMacsecKeys() {
            return this.macsecKeys;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return opticalModuleModel
         */
        public String getOpticalModuleModel() {
            return this.opticalModuleModel;
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
            private String deviceFeaturesSelected; 
            private Integer downDelayTime; 
            private String enabledTime; 
            private String endTime; 
            private String expectSpec; 
            private String hasReservationData; 
            private String lineOperator; 
            private String loaStatus; 
            private MacsecKeys macsecKeys; 
            private String name; 
            private String opticalModuleModel; 
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

            private Builder() {
            } 

            private Builder(PhysicalConnectionType model) {
                this.accessPointId = model.accessPointId;
                this.accessPointType = model.accessPointType;
                this.adDetailLocation = model.adDetailLocation;
                this.adLocation = model.adLocation;
                this.bandwidth = model.bandwidth;
                this.businessStatus = model.businessStatus;
                this.chargeType = model.chargeType;
                this.circuitCode = model.circuitCode;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.deviceFeaturesSelected = model.deviceFeaturesSelected;
                this.downDelayTime = model.downDelayTime;
                this.enabledTime = model.enabledTime;
                this.endTime = model.endTime;
                this.expectSpec = model.expectSpec;
                this.hasReservationData = model.hasReservationData;
                this.lineOperator = model.lineOperator;
                this.loaStatus = model.loaStatus;
                this.macsecKeys = model.macsecKeys;
                this.name = model.name;
                this.opticalModuleModel = model.opticalModuleModel;
                this.orderMode = model.orderMode;
                this.parentPhysicalConnectionAliUid = model.parentPhysicalConnectionAliUid;
                this.parentPhysicalConnectionId = model.parentPhysicalConnectionId;
                this.peerLocation = model.peerLocation;
                this.physicalConnectionId = model.physicalConnectionId;
                this.portNumber = model.portNumber;
                this.portType = model.portType;
                this.productType = model.productType;
                this.qosId = model.qosId;
                this.redundantPhysicalConnectionId = model.redundantPhysicalConnectionId;
                this.reservationActiveTime = model.reservationActiveTime;
                this.reservationInternetChargeType = model.reservationInternetChargeType;
                this.reservationOrderType = model.reservationOrderType;
                this.resourceGroupId = model.resourceGroupId;
                this.spec = model.spec;
                this.status = model.status;
                this.tags = model.tags;
                this.type = model.type;
                this.virtualPhysicalConnectionCount = model.virtualPhysicalConnectionCount;
                this.vlanId = model.vlanId;
                this.vpconnStatus = model.vpconnStatus;
            } 

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
             * AdDetailLocation.
             */
            public Builder adDetailLocation(String adDetailLocation) {
                this.adDetailLocation = adDetailLocation;
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
             * DeviceFeaturesSelected.
             */
            public Builder deviceFeaturesSelected(String deviceFeaturesSelected) {
                this.deviceFeaturesSelected = deviceFeaturesSelected;
                return this;
            }

            /**
             * DownDelayTime.
             */
            public Builder downDelayTime(Integer downDelayTime) {
                this.downDelayTime = downDelayTime;
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
             * MacsecKeys.
             */
            public Builder macsecKeys(MacsecKeys macsecKeys) {
                this.macsecKeys = macsecKeys;
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
             * OpticalModuleModel.
             */
            public Builder opticalModuleModel(String opticalModuleModel) {
                this.opticalModuleModel = opticalModuleModel;
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
             * QosId.
             */
            public Builder qosId(String qosId) {
                this.qosId = qosId;
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
             * Tags.
             */
            public Builder tags(PhysicalConnectionTypeTags tags) {
                this.tags = tags;
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
    /**
     * 
     * {@link DescribePhysicalConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePhysicalConnectionsResponseBody</p>
     */
    public static class PhysicalConnectionSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PhysicalConnectionType")
        private java.util.List<PhysicalConnectionType> physicalConnectionType;

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
        public java.util.List<PhysicalConnectionType> getPhysicalConnectionType() {
            return this.physicalConnectionType;
        }

        public static final class Builder {
            private java.util.List<PhysicalConnectionType> physicalConnectionType; 

            private Builder() {
            } 

            private Builder(PhysicalConnectionSet model) {
                this.physicalConnectionType = model.physicalConnectionType;
            } 

            /**
             * PhysicalConnectionType.
             */
            public Builder physicalConnectionType(java.util.List<PhysicalConnectionType> physicalConnectionType) {
                this.physicalConnectionType = physicalConnectionType;
                return this;
            }

            public PhysicalConnectionSet build() {
                return new PhysicalConnectionSet(this);
            } 

        } 

    }
}
