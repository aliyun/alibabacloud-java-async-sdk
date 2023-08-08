// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRouterInterfacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRouterInterfacesResponseBody</p>
 */
public class DescribeRouterInterfacesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouterInterfaceSet")
    private RouterInterfaceSet routerInterfaceSet;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRouterInterfacesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.routerInterfaceSet = builder.routerInterfaceSet;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRouterInterfacesResponseBody create() {
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
     * @return routerInterfaceSet
     */
    public RouterInterfaceSet getRouterInterfaceSet() {
        return this.routerInterfaceSet;
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
        private String requestId; 
        private RouterInterfaceSet routerInterfaceSet; 
        private Integer totalCount; 

        /**
         * The number of the returned page. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page. Maximum value: **50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the router interface.
         */
        public Builder routerInterfaceSet(RouterInterfaceSet routerInterfaceSet) {
            this.routerInterfaceSet = routerInterfaceSet;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRouterInterfacesResponseBody build() {
            return new DescribeRouterInterfacesResponseBody(this);
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
    public static class RouterInterfaceTypeTags extends TeaModel {
        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        private RouterInterfaceTypeTags(Builder builder) {
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouterInterfaceTypeTags create() {
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

            public RouterInterfaceTypeTags build() {
                return new RouterInterfaceTypeTags(this);
            } 

        } 

    }
    public static class RouterInterfaceType extends TeaModel {
        @NameInMap("AccessPointId")
        private String accessPointId;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("ConnectedTime")
        private String connectedTime;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("CrossBorder")
        private Boolean crossBorder;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("FastLinkMode")
        private Boolean fastLinkMode;

        @NameInMap("HasReservationData")
        private String hasReservationData;

        @NameInMap("HcRate")
        private Integer hcRate;

        @NameInMap("HcThreshold")
        private Integer hcThreshold;

        @NameInMap("HealthCheckSourceIp")
        private String healthCheckSourceIp;

        @NameInMap("HealthCheckTargetIp")
        private String healthCheckTargetIp;

        @NameInMap("Ipv6Status")
        private String ipv6Status;

        @NameInMap("Name")
        private String name;

        @NameInMap("OppositeAccessPointId")
        private String oppositeAccessPointId;

        @NameInMap("OppositeBandwidth")
        private Integer oppositeBandwidth;

        @NameInMap("OppositeInterfaceBusinessStatus")
        private String oppositeInterfaceBusinessStatus;

        @NameInMap("OppositeInterfaceId")
        private String oppositeInterfaceId;

        @NameInMap("OppositeInterfaceOwnerId")
        private String oppositeInterfaceOwnerId;

        @NameInMap("OppositeInterfaceSpec")
        private String oppositeInterfaceSpec;

        @NameInMap("OppositeInterfaceStatus")
        private String oppositeInterfaceStatus;

        @NameInMap("OppositeRegionId")
        private String oppositeRegionId;

        @NameInMap("OppositeRouterId")
        private String oppositeRouterId;

        @NameInMap("OppositeRouterType")
        private String oppositeRouterType;

        @NameInMap("OppositeVpcInstanceId")
        private String oppositeVpcInstanceId;

        @NameInMap("ReservationActiveTime")
        private String reservationActiveTime;

        @NameInMap("ReservationBandwidth")
        private String reservationBandwidth;

        @NameInMap("ReservationInternetChargeType")
        private String reservationInternetChargeType;

        @NameInMap("ReservationOrderType")
        private String reservationOrderType;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Role")
        private String role;

        @NameInMap("RouterId")
        private String routerId;

        @NameInMap("RouterInterfaceId")
        private String routerInterfaceId;

        @NameInMap("RouterType")
        private String routerType;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private RouterInterfaceTypeTags tags;

        @NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        private RouterInterfaceType(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.bandwidth = builder.bandwidth;
            this.businessStatus = builder.businessStatus;
            this.chargeType = builder.chargeType;
            this.connectedTime = builder.connectedTime;
            this.creationTime = builder.creationTime;
            this.crossBorder = builder.crossBorder;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.fastLinkMode = builder.fastLinkMode;
            this.hasReservationData = builder.hasReservationData;
            this.hcRate = builder.hcRate;
            this.hcThreshold = builder.hcThreshold;
            this.healthCheckSourceIp = builder.healthCheckSourceIp;
            this.healthCheckTargetIp = builder.healthCheckTargetIp;
            this.ipv6Status = builder.ipv6Status;
            this.name = builder.name;
            this.oppositeAccessPointId = builder.oppositeAccessPointId;
            this.oppositeBandwidth = builder.oppositeBandwidth;
            this.oppositeInterfaceBusinessStatus = builder.oppositeInterfaceBusinessStatus;
            this.oppositeInterfaceId = builder.oppositeInterfaceId;
            this.oppositeInterfaceOwnerId = builder.oppositeInterfaceOwnerId;
            this.oppositeInterfaceSpec = builder.oppositeInterfaceSpec;
            this.oppositeInterfaceStatus = builder.oppositeInterfaceStatus;
            this.oppositeRegionId = builder.oppositeRegionId;
            this.oppositeRouterId = builder.oppositeRouterId;
            this.oppositeRouterType = builder.oppositeRouterType;
            this.oppositeVpcInstanceId = builder.oppositeVpcInstanceId;
            this.reservationActiveTime = builder.reservationActiveTime;
            this.reservationBandwidth = builder.reservationBandwidth;
            this.reservationInternetChargeType = builder.reservationInternetChargeType;
            this.reservationOrderType = builder.reservationOrderType;
            this.resourceGroupId = builder.resourceGroupId;
            this.role = builder.role;
            this.routerId = builder.routerId;
            this.routerInterfaceId = builder.routerInterfaceId;
            this.routerType = builder.routerType;
            this.spec = builder.spec;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vpcInstanceId = builder.vpcInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouterInterfaceType create() {
            return builder().build();
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
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
         * @return connectedTime
         */
        public String getConnectedTime() {
            return this.connectedTime;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return crossBorder
         */
        public Boolean getCrossBorder() {
            return this.crossBorder;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return fastLinkMode
         */
        public Boolean getFastLinkMode() {
            return this.fastLinkMode;
        }

        /**
         * @return hasReservationData
         */
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        /**
         * @return hcRate
         */
        public Integer getHcRate() {
            return this.hcRate;
        }

        /**
         * @return hcThreshold
         */
        public Integer getHcThreshold() {
            return this.hcThreshold;
        }

        /**
         * @return healthCheckSourceIp
         */
        public String getHealthCheckSourceIp() {
            return this.healthCheckSourceIp;
        }

        /**
         * @return healthCheckTargetIp
         */
        public String getHealthCheckTargetIp() {
            return this.healthCheckTargetIp;
        }

        /**
         * @return ipv6Status
         */
        public String getIpv6Status() {
            return this.ipv6Status;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return oppositeAccessPointId
         */
        public String getOppositeAccessPointId() {
            return this.oppositeAccessPointId;
        }

        /**
         * @return oppositeBandwidth
         */
        public Integer getOppositeBandwidth() {
            return this.oppositeBandwidth;
        }

        /**
         * @return oppositeInterfaceBusinessStatus
         */
        public String getOppositeInterfaceBusinessStatus() {
            return this.oppositeInterfaceBusinessStatus;
        }

        /**
         * @return oppositeInterfaceId
         */
        public String getOppositeInterfaceId() {
            return this.oppositeInterfaceId;
        }

        /**
         * @return oppositeInterfaceOwnerId
         */
        public String getOppositeInterfaceOwnerId() {
            return this.oppositeInterfaceOwnerId;
        }

        /**
         * @return oppositeInterfaceSpec
         */
        public String getOppositeInterfaceSpec() {
            return this.oppositeInterfaceSpec;
        }

        /**
         * @return oppositeInterfaceStatus
         */
        public String getOppositeInterfaceStatus() {
            return this.oppositeInterfaceStatus;
        }

        /**
         * @return oppositeRegionId
         */
        public String getOppositeRegionId() {
            return this.oppositeRegionId;
        }

        /**
         * @return oppositeRouterId
         */
        public String getOppositeRouterId() {
            return this.oppositeRouterId;
        }

        /**
         * @return oppositeRouterType
         */
        public String getOppositeRouterType() {
            return this.oppositeRouterType;
        }

        /**
         * @return oppositeVpcInstanceId
         */
        public String getOppositeVpcInstanceId() {
            return this.oppositeVpcInstanceId;
        }

        /**
         * @return reservationActiveTime
         */
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        /**
         * @return reservationBandwidth
         */
        public String getReservationBandwidth() {
            return this.reservationBandwidth;
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
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return routerId
         */
        public String getRouterId() {
            return this.routerId;
        }

        /**
         * @return routerInterfaceId
         */
        public String getRouterInterfaceId() {
            return this.routerInterfaceId;
        }

        /**
         * @return routerType
         */
        public String getRouterType() {
            return this.routerType;
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
        public RouterInterfaceTypeTags getTags() {
            return this.tags;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public static final class Builder {
            private String accessPointId; 
            private Integer bandwidth; 
            private String businessStatus; 
            private String chargeType; 
            private String connectedTime; 
            private String creationTime; 
            private Boolean crossBorder; 
            private String description; 
            private String endTime; 
            private Boolean fastLinkMode; 
            private String hasReservationData; 
            private Integer hcRate; 
            private Integer hcThreshold; 
            private String healthCheckSourceIp; 
            private String healthCheckTargetIp; 
            private String ipv6Status; 
            private String name; 
            private String oppositeAccessPointId; 
            private Integer oppositeBandwidth; 
            private String oppositeInterfaceBusinessStatus; 
            private String oppositeInterfaceId; 
            private String oppositeInterfaceOwnerId; 
            private String oppositeInterfaceSpec; 
            private String oppositeInterfaceStatus; 
            private String oppositeRegionId; 
            private String oppositeRouterId; 
            private String oppositeRouterType; 
            private String oppositeVpcInstanceId; 
            private String reservationActiveTime; 
            private String reservationBandwidth; 
            private String reservationInternetChargeType; 
            private String reservationOrderType; 
            private String resourceGroupId; 
            private String role; 
            private String routerId; 
            private String routerInterfaceId; 
            private String routerType; 
            private String spec; 
            private String status; 
            private RouterInterfaceTypeTags tags; 
            private String vpcInstanceId; 

            /**
             * The ID of the access point.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * The bandwidth of the router interface. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The service status of the router interface. Valid values:
             * <p>
             * 
             * *   **Normal**: normal
             * *   **FinancialLocked**: locked due to overdue payments
             * *   **SecurityLocked**: locked due to security reasons
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * The metering method.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The time when the connection was established.
             * <p>
             * 
             * The time follows the ISO8601 standard in the `YYYY-MM-DDThh:mmZ` format. The time is displayed in UTC.
             */
            public Builder connectedTime(String connectedTime) {
                this.connectedTime = connectedTime;
                return this;
            }

            /**
             * The time when the route table was created.
             * <p>
             * 
             * The time follows the ISO8601 standard in the `YYYY-MM-DDThh:mmZ` format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Indicates whether the connection is a cross-border connection.
             */
            public Builder crossBorder(Boolean crossBorder) {
                this.crossBorder = crossBorder;
                return this;
            }

            /**
             * The description of the router interface.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The end of the time range queried.
             * <p>
             * 
             * The time follows the ISO8601 standard in the `YYYY-MM-DDThh:mmZ` format. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Indicates whether the VBR that is created in the Fast Link mode is uplinked to the router interface. The Fast Link mode helps automatically connect router interfaces that are created for the VBR and its peer VPC. Default value: false. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder fastLinkMode(Boolean fastLinkMode) {
                this.fastLinkMode = fastLinkMode;
                return this;
            }

            /**
             * Indicates whether renewal data is included.
             */
            public Builder hasReservationData(String hasReservationData) {
                this.hasReservationData = hasReservationData;
                return this;
            }

            /**
             * The rate of the heath check.
             */
            public Builder hcRate(Integer hcRate) {
                this.hcRate = hcRate;
                return this;
            }

            /**
             * The health check threshold.
             */
            public Builder hcThreshold(Integer hcThreshold) {
                this.hcThreshold = hcThreshold;
                return this;
            }

            /**
             * The source IP address that is used for the health check.
             */
            public Builder healthCheckSourceIp(String healthCheckSourceIp) {
                this.healthCheckSourceIp = healthCheckSourceIp;
                return this;
            }

            /**
             * The destination IP address that is used for the health check.
             */
            public Builder healthCheckTargetIp(String healthCheckTargetIp) {
                this.healthCheckTargetIp = healthCheckTargetIp;
                return this;
            }

            /**
             * Indicates whether protection against malicious IPv6 traffic is enabled. Valid values:
             * <p>
             * 
             * *   **on**
             * *   **off**
             * *   **unsupport**
             */
            public Builder ipv6Status(String ipv6Status) {
                this.ipv6Status = ipv6Status;
                return this;
            }

            /**
             * The custom name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the peer access point.
             */
            public Builder oppositeAccessPointId(String oppositeAccessPointId) {
                this.oppositeAccessPointId = oppositeAccessPointId;
                return this;
            }

            /**
             * The maximum bandwidth of the peer router interface. Unit: Mbit/s.
             */
            public Builder oppositeBandwidth(Integer oppositeBandwidth) {
                this.oppositeBandwidth = oppositeBandwidth;
                return this;
            }

            /**
             * The service status of the peer router interface.
             */
            public Builder oppositeInterfaceBusinessStatus(String oppositeInterfaceBusinessStatus) {
                this.oppositeInterfaceBusinessStatus = oppositeInterfaceBusinessStatus;
                return this;
            }

            /**
             * The ID of the peer router interface.
             */
            public Builder oppositeInterfaceId(String oppositeInterfaceId) {
                this.oppositeInterfaceId = oppositeInterfaceId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the peer router interface belongs.
             */
            public Builder oppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
                this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
                return this;
            }

            /**
             * The specification of the peer router interface.
             */
            public Builder oppositeInterfaceSpec(String oppositeInterfaceSpec) {
                this.oppositeInterfaceSpec = oppositeInterfaceSpec;
                return this;
            }

            /**
             * The status of the peer router interface.
             */
            public Builder oppositeInterfaceStatus(String oppositeInterfaceStatus) {
                this.oppositeInterfaceStatus = oppositeInterfaceStatus;
                return this;
            }

            /**
             * The region ID of the peer router interface.
             */
            public Builder oppositeRegionId(String oppositeRegionId) {
                this.oppositeRegionId = oppositeRegionId;
                return this;
            }

            /**
             * The ID of the router to which the peer router interface belongs.
             */
            public Builder oppositeRouterId(String oppositeRouterId) {
                this.oppositeRouterId = oppositeRouterId;
                return this;
            }

            /**
             * The type of the router to which the peer router interface belongs.
             */
            public Builder oppositeRouterType(String oppositeRouterType) {
                this.oppositeRouterType = oppositeRouterType;
                return this;
            }

            /**
             * The ID of the peer VPC.
             */
            public Builder oppositeVpcInstanceId(String oppositeVpcInstanceId) {
                this.oppositeVpcInstanceId = oppositeVpcInstanceId;
                return this;
            }

            /**
             * The time when the renewal takes effect.
             * <p>
             * 
             * The time follows the ISO8601 standard in the `YYYY-MM-DDThh:mmZ` format. The time is displayed in UTC.
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * The bandwidth after the renewal takes effect. Unit: Mbit/s.
             */
            public Builder reservationBandwidth(String reservationBandwidth) {
                this.reservationBandwidth = reservationBandwidth;
                return this;
            }

            /**
             * The metering method that is used after the renewal takes effect.
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            /**
             * The type of the renewal order.
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
             * Indicates whether the router interface is the initiator or acceptor of the peering connection.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The ID of the router to which the route entry belongs.
             */
            public Builder routerId(String routerId) {
                this.routerId = routerId;
                return this;
            }

            /**
             * The ID of the router interface.
             */
            public Builder routerInterfaceId(String routerInterfaceId) {
                this.routerInterfaceId = routerInterfaceId;
                return this;
            }

            /**
             * The type of the router to which the route table belongs. Valid values:
             * <p>
             * 
             * *   **VRouter**
             * *   **VBR**
             */
            public Builder routerType(String routerType) {
                this.routerType = routerType;
                return this;
            }

            /**
             * The specification of the router interface.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * The status of the router interface.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(RouterInterfaceTypeTags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the local virtual private cloud (VPC) in the peering connection.
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            public RouterInterfaceType build() {
                return new RouterInterfaceType(this);
            } 

        } 

    }
    public static class RouterInterfaceSet extends TeaModel {
        @NameInMap("RouterInterfaceType")
        private java.util.List < RouterInterfaceType> routerInterfaceType;

        private RouterInterfaceSet(Builder builder) {
            this.routerInterfaceType = builder.routerInterfaceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouterInterfaceSet create() {
            return builder().build();
        }

        /**
         * @return routerInterfaceType
         */
        public java.util.List < RouterInterfaceType> getRouterInterfaceType() {
            return this.routerInterfaceType;
        }

        public static final class Builder {
            private java.util.List < RouterInterfaceType> routerInterfaceType; 

            /**
             * RouterInterfaceType.
             */
            public Builder routerInterfaceType(java.util.List < RouterInterfaceType> routerInterfaceType) {
                this.routerInterfaceType = routerInterfaceType;
                return this;
            }

            public RouterInterfaceSet build() {
                return new RouterInterfaceSet(this);
            } 

        } 

    }
}
