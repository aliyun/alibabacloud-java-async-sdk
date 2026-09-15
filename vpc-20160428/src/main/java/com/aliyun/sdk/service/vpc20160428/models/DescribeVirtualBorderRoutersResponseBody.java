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
         * <p>The number of entries per page in a paged query. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
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

            private Builder() {
            } 

            private Builder(AssociatedCen model) {
                this.cenId = model.cenId;
                this.cenOwnerId = model.cenOwnerId;
                this.cenStatus = model.cenStatus;
            } 

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
    /**
     * 
     * {@link DescribeVirtualBorderRoutersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualBorderRoutersResponseBody</p>
     */
    public static class AssociatedCens extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedCen")
        private java.util.List<AssociatedCen> associatedCen;

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
        public java.util.List<AssociatedCen> getAssociatedCen() {
            return this.associatedCen;
        }

        public static final class Builder {
            private java.util.List<AssociatedCen> associatedCen; 

            private Builder() {
            } 

            private Builder(AssociatedCens model) {
                this.associatedCen = model.associatedCen;
            } 

            /**
             * AssociatedCen.
             */
            public Builder associatedCen(java.util.List<AssociatedCen> associatedCen) {
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

            private Builder() {
            } 

            private Builder(AssociatedPhysicalConnection model) {
                this.circuitCode = model.circuitCode;
                this.enableIpv6 = model.enableIpv6;
                this.localGatewayIp = model.localGatewayIp;
                this.localIpv6GatewayIp = model.localIpv6GatewayIp;
                this.peerGatewayIp = model.peerGatewayIp;
                this.peerIpv6GatewayIp = model.peerIpv6GatewayIp;
                this.peeringIpv6SubnetMask = model.peeringIpv6SubnetMask;
                this.peeringSubnetMask = model.peeringSubnetMask;
                this.physicalConnectionBusinessStatus = model.physicalConnectionBusinessStatus;
                this.physicalConnectionId = model.physicalConnectionId;
                this.physicalConnectionOwnerUid = model.physicalConnectionOwnerUid;
                this.physicalConnectionStatus = model.physicalConnectionStatus;
                this.status = model.status;
                this.vlanId = model.vlanId;
                this.vlanInterfaceId = model.vlanInterfaceId;
            } 

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
    /**
     * 
     * {@link DescribeVirtualBorderRoutersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualBorderRoutersResponseBody</p>
     */
    public static class AssociatedPhysicalConnections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedPhysicalConnection")
        private java.util.List<AssociatedPhysicalConnection> associatedPhysicalConnection;

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
        public java.util.List<AssociatedPhysicalConnection> getAssociatedPhysicalConnection() {
            return this.associatedPhysicalConnection;
        }

        public static final class Builder {
            private java.util.List<AssociatedPhysicalConnection> associatedPhysicalConnection; 

            private Builder() {
            } 

            private Builder(AssociatedPhysicalConnections model) {
                this.associatedPhysicalConnection = model.associatedPhysicalConnection;
            } 

            /**
             * AssociatedPhysicalConnection.
             */
            public Builder associatedPhysicalConnection(java.util.List<AssociatedPhysicalConnection> associatedPhysicalConnection) {
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
     * {@link DescribeVirtualBorderRoutersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualBorderRoutersResponseBody</p>
     */
    public static class VirtualBorderRouterTypeTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

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
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(VirtualBorderRouterTypeTags model) {
                this.tags = model.tags;
            } 

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
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

        @com.aliyun.core.annotation.NameInMap("Mtu")
        private Integer mtu;

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
            this.mtu = builder.mtu;
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
         * @return mtu
         */
        public Integer getMtu() {
            return this.mtu;
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
            private Integer mtu; 
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

            private Builder() {
            } 

            private Builder(VirtualBorderRouterType model) {
                this.accessPointId = model.accessPointId;
                this.activationTime = model.activationTime;
                this.associatedCens = model.associatedCens;
                this.associatedPhysicalConnections = model.associatedPhysicalConnections;
                this.bandwidth = model.bandwidth;
                this.circuitCode = model.circuitCode;
                this.cloudBoxInstanceId = model.cloudBoxInstanceId;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.detectMultiplier = model.detectMultiplier;
                this.eccId = model.eccId;
                this.ecrAttatchStatus = model.ecrAttatchStatus;
                this.ecrId = model.ecrId;
                this.ecrOwnerId = model.ecrOwnerId;
                this.enableIpv6 = model.enableIpv6;
                this.localGatewayIp = model.localGatewayIp;
                this.localIpv6GatewayIp = model.localIpv6GatewayIp;
                this.minRxInterval = model.minRxInterval;
                this.minTxInterval = model.minTxInterval;
                this.mtu = model.mtu;
                this.name = model.name;
                this.pConnVbrChargeType = model.pConnVbrChargeType;
                this.pConnVbrExpireTime = model.pConnVbrExpireTime;
                this.peerGatewayIp = model.peerGatewayIp;
                this.peerIpv6GatewayIp = model.peerIpv6GatewayIp;
                this.peeringIpv6SubnetMask = model.peeringIpv6SubnetMask;
                this.peeringSubnetMask = model.peeringSubnetMask;
                this.physicalConnectionBusinessStatus = model.physicalConnectionBusinessStatus;
                this.physicalConnectionId = model.physicalConnectionId;
                this.physicalConnectionOwnerUid = model.physicalConnectionOwnerUid;
                this.physicalConnectionStatus = model.physicalConnectionStatus;
                this.recoveryTime = model.recoveryTime;
                this.resourceGroupId = model.resourceGroupId;
                this.routeTableId = model.routeTableId;
                this.sitelinkEnable = model.sitelinkEnable;
                this.status = model.status;
                this.tags = model.tags;
                this.terminationTime = model.terminationTime;
                this.type = model.type;
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
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
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
             * EcrAttatchStatus.
             */
            public Builder ecrAttatchStatus(String ecrAttatchStatus) {
                this.ecrAttatchStatus = ecrAttatchStatus;
                return this;
            }

            /**
             * EcrId.
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
             * Mtu.
             */
            public Builder mtu(Integer mtu) {
                this.mtu = mtu;
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
            public Builder pConnVbrChargeType(String pConnVbrChargeType) {
                this.pConnVbrChargeType = pConnVbrChargeType;
                return this;
            }

            /**
             * PConnVbrExpireTime.
             */
            public Builder pConnVbrExpireTime(String pConnVbrExpireTime) {
                this.pConnVbrExpireTime = pConnVbrExpireTime;
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
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
             * SitelinkEnable.
             */
            public Builder sitelinkEnable(Boolean sitelinkEnable) {
                this.sitelinkEnable = sitelinkEnable;
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
            public Builder tags(VirtualBorderRouterTypeTags tags) {
                this.tags = tags;
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
