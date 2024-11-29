// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRouterInterfacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRouterInterfacesResponseBody</p>
 */
public class DescribeRouterInterfacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouterInterfaceSet")
    private RouterInterfaceSet routerInterfaceSet;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The number of entries per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
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
         * <p>C7F6FCBD-F9CC-4501-8EF3-CDC9577CAE45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the router interface.</p>
         */
        public Builder routerInterfaceSet(RouterInterfaceSet routerInterfaceSet) {
            this.routerInterfaceSet = routerInterfaceSet;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRouterInterfacesResponseBody build() {
            return new DescribeRouterInterfacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRouterInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouterInterfacesResponseBody</p>
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
             * <p>The key of the resource tag. At least one tag key must be entered, and a maximum of 20 tag keys are supported. If this value needs to be passed in, it cannot be an empty string.</p>
             * <p>A tag key can support up to 128 characters, cannot start with &quot;aliyun&quot; or &quot;acs:&quot;, and cannot contain &quot;http://&quot; or &quot;https://&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the resource tag. A maximum of 20 tag values can be entered. If this value needs to be passed in, an empty string can be entered.</p>
             * <p>A maximum of 128 characters are supported, it cannot start with &quot;aliyun&quot; or &quot;acs:&quot;, and it cannot contain &quot;http://&quot; or &quot;https://&quot;.</p>
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
     * {@link DescribeRouterInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouterInterfacesResponseBody</p>
     */
    public static class RouterInterfaceTypeTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tags")
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
    /**
     * 
     * {@link DescribeRouterInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouterInterfacesResponseBody</p>
     */
    public static class RouterInterfaceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessPointId")
        private String accessPointId;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("ConnectedTime")
        private String connectedTime;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("CrossBorder")
        private Boolean crossBorder;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("FastLinkMode")
        private Boolean fastLinkMode;

        @com.aliyun.core.annotation.NameInMap("HasReservationData")
        private String hasReservationData;

        @com.aliyun.core.annotation.NameInMap("HcRate")
        private Integer hcRate;

        @com.aliyun.core.annotation.NameInMap("HcThreshold")
        private Integer hcThreshold;

        @com.aliyun.core.annotation.NameInMap("HealthCheckSourceIp")
        private String healthCheckSourceIp;

        @com.aliyun.core.annotation.NameInMap("HealthCheckTargetIp")
        private String healthCheckTargetIp;

        @com.aliyun.core.annotation.NameInMap("Ipv6Status")
        private String ipv6Status;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OppositeAccessPointId")
        private String oppositeAccessPointId;

        @com.aliyun.core.annotation.NameInMap("OppositeBandwidth")
        private Integer oppositeBandwidth;

        @com.aliyun.core.annotation.NameInMap("OppositeInterfaceBusinessStatus")
        private String oppositeInterfaceBusinessStatus;

        @com.aliyun.core.annotation.NameInMap("OppositeInterfaceId")
        private String oppositeInterfaceId;

        @com.aliyun.core.annotation.NameInMap("OppositeInterfaceOwnerId")
        private String oppositeInterfaceOwnerId;

        @com.aliyun.core.annotation.NameInMap("OppositeInterfaceSpec")
        private String oppositeInterfaceSpec;

        @com.aliyun.core.annotation.NameInMap("OppositeInterfaceStatus")
        private String oppositeInterfaceStatus;

        @com.aliyun.core.annotation.NameInMap("OppositeRegionId")
        private String oppositeRegionId;

        @com.aliyun.core.annotation.NameInMap("OppositeRouterId")
        private String oppositeRouterId;

        @com.aliyun.core.annotation.NameInMap("OppositeRouterType")
        private String oppositeRouterType;

        @com.aliyun.core.annotation.NameInMap("OppositeVpcInstanceId")
        private String oppositeVpcInstanceId;

        @com.aliyun.core.annotation.NameInMap("ReservationActiveTime")
        private String reservationActiveTime;

        @com.aliyun.core.annotation.NameInMap("ReservationBandwidth")
        private String reservationBandwidth;

        @com.aliyun.core.annotation.NameInMap("ReservationInternetChargeType")
        private String reservationInternetChargeType;

        @com.aliyun.core.annotation.NameInMap("ReservationOrderType")
        private String reservationOrderType;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("RouterId")
        private String routerId;

        @com.aliyun.core.annotation.NameInMap("RouterInterfaceId")
        private String routerInterfaceId;

        @com.aliyun.core.annotation.NameInMap("RouterType")
        private String routerType;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private RouterInterfaceTypeTags tags;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
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
             * <p>The ID of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-cn-shanghaiSZ-****</p>
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * <p>The bandwidth of the router interface. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The service status of the router interface. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong></li>
             * <li><strong>FinancialLocked</strong></li>
             * <li><strong>SecurityLocked</strong></li>
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
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PayByTraffic</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The time when the connection was established.</p>
             * <p>The time follows the ISO8601 standard in the <code>YYYY-MM-DDThh:mmZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-08T12:20:55</p>
             */
            public Builder connectedTime(String connectedTime) {
                this.connectedTime = connectedTime;
                return this;
            }

            /**
             * <p>The time when the route table was created.</p>
             * <p>The time follows the ISO8601 standard in the <code>YYYY-MM-DDThh:mmZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-08T12:20:55</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Indicates whether the connection is a cross-border connection.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder crossBorder(Boolean crossBorder) {
                this.crossBorder = crossBorder;
                return this;
            }

            /**
             * <p>The description of the router interface.</p>
             * 
             * <strong>example:</strong>
             * <p>The description of the router interface.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The end of the time range during which data was queried.</p>
             * <p>The time follows the ISO8601 standard in the <code>YYYY-MM-DDThh:mmZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-08T12:20:55</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Indicates whether the VBR that is created in the Fast Link mode is uplinked to the router interface. The Fast Link mode helps automatically connect router interfaces that are created for the VBR and its peer VPC. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder fastLinkMode(Boolean fastLinkMode) {
                this.fastLinkMode = fastLinkMode;
                return this;
            }

            /**
             * <p>Indicates whether renewal data is included.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasReservationData(String hasReservationData) {
                this.hasReservationData = hasReservationData;
                return this;
            }

            /**
             * <p>The rate of heath checks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hcRate(Integer hcRate) {
                this.hcRate = hcRate;
                return this;
            }

            /**
             * <p>The health check threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder hcThreshold(Integer hcThreshold) {
                this.hcThreshold = hcThreshold;
                return this;
            }

            /**
             * <p>The source IP address that is used for the health check.</p>
             * 
             * <strong>example:</strong>
             * <p>116.62.XX.XX</p>
             */
            public Builder healthCheckSourceIp(String healthCheckSourceIp) {
                this.healthCheckSourceIp = healthCheckSourceIp;
                return this;
            }

            /**
             * <p>The destination IP address that is used for the health check.</p>
             * 
             * <strong>example:</strong>
             * <p>116.62.XX.XX</p>
             */
            public Builder healthCheckTargetIp(String healthCheckTargetIp) {
                this.healthCheckTargetIp = healthCheckTargetIp;
                return this;
            }

            /**
             * <p>Indicates whether protection against malicious IPv6 traffic is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * <li><strong>unsupport</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder ipv6Status(String ipv6Status) {
                this.ipv6Status = ipv6Status;
                return this;
            }

            /**
             * <p>The custom name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the peer access point.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-cn-shanghaiSZ-****</p>
             */
            public Builder oppositeAccessPointId(String oppositeAccessPointId) {
                this.oppositeAccessPointId = oppositeAccessPointId;
                return this;
            }

            /**
             * <p>The maximum bandwidth of the peer router interface. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder oppositeBandwidth(Integer oppositeBandwidth) {
                this.oppositeBandwidth = oppositeBandwidth;
                return this;
            }

            /**
             * <p>The service status of the peer router interface.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder oppositeInterfaceBusinessStatus(String oppositeInterfaceBusinessStatus) {
                this.oppositeInterfaceBusinessStatus = oppositeInterfaceBusinessStatus;
                return this;
            }

            /**
             * <p>The ID of the peer router interface.</p>
             * 
             * <strong>example:</strong>
             * <p>ri-bp1itx13bwe6f2wfh****</p>
             */
            public Builder oppositeInterfaceId(String oppositeInterfaceId) {
                this.oppositeInterfaceId = oppositeInterfaceId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the peer router interface belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>271598332402530847</p>
             */
            public Builder oppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
                this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
                return this;
            }

            /**
             * <p>The specification of the peer router interface.</p>
             * 
             * <strong>example:</strong>
             * <p>Large</p>
             */
            public Builder oppositeInterfaceSpec(String oppositeInterfaceSpec) {
                this.oppositeInterfaceSpec = oppositeInterfaceSpec;
                return this;
            }

            /**
             * <p>The status of the peer router interface.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder oppositeInterfaceStatus(String oppositeInterfaceStatus) {
                this.oppositeInterfaceStatus = oppositeInterfaceStatus;
                return this;
            }

            /**
             * <p>The region ID of the peer router interface.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder oppositeRegionId(String oppositeRegionId) {
                this.oppositeRegionId = oppositeRegionId;
                return this;
            }

            /**
             * <p>The ID of the router to which the peer router interface belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vrt-bp1d3bxtdv68tfd7g****</p>
             */
            public Builder oppositeRouterId(String oppositeRouterId) {
                this.oppositeRouterId = oppositeRouterId;
                return this;
            }

            /**
             * <p>The type of the router to which the peer router interface belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>VRouter</p>
             */
            public Builder oppositeRouterType(String oppositeRouterType) {
                this.oppositeRouterType = oppositeRouterType;
                return this;
            }

            /**
             * <p>The ID of the peer VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1qpo0kug3a20qqe****</p>
             */
            public Builder oppositeVpcInstanceId(String oppositeVpcInstanceId) {
                this.oppositeVpcInstanceId = oppositeVpcInstanceId;
                return this;
            }

            /**
             * <p>The time when the renewal takes effect.</p>
             * <p>The time follows the ISO8601 standard in the <code>YYYY-MM-DDThh:mmZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-11T16:00:00Z</p>
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * <p>The maximum bandwidth after the renewal takes effect. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder reservationBandwidth(String reservationBandwidth) {
                this.reservationBandwidth = reservationBandwidth;
                return this;
            }

            /**
             * <p>The metering method that is used after the renewal takes effect. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>PayByBandwidth</p>
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            /**
             * <p>The type of the renewal order. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>RENEWCHANGE</p>
             */
            public Builder reservationOrderType(String reservationOrderType) {
                this.reservationOrderType = reservationOrderType;
                return this;
            }

            /**
             * <p>Resource Group ID.</p>
             * <p>For more information about resource groups, please refer to <a href="https://help.aliyun.com/document_detail/94475.html">What is a Resource Group?</a></p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxazb4ph6aiy****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the router interface is the initiator or acceptor of the peering connection.</p>
             * 
             * <strong>example:</strong>
             * <p>InitiatingSide</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The ID of the router to which the route entry belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vrt-bp1d3bxtdv68tfd7g****</p>
             */
            public Builder routerId(String routerId) {
                this.routerId = routerId;
                return this;
            }

            /**
             * <p>The ID of the router interface.</p>
             * 
             * <strong>example:</strong>
             * <p>ri-2zenfgfpyu3v93koa****</p>
             */
            public Builder routerInterfaceId(String routerInterfaceId) {
                this.routerInterfaceId = routerInterfaceId;
                return this;
            }

            /**
             * <p>The type of the router to which the route table belongs. Valid values:</p>
             * <ul>
             * <li><strong>VRouter</strong></li>
             * <li><strong>VBR</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VRouter</p>
             */
            public Builder routerType(String routerType) {
                this.routerType = routerType;
                return this;
            }

            /**
             * <p>The specification of the router interface.</p>
             * 
             * <strong>example:</strong>
             * <p>Large</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The status of the router interface.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the resource.</p>
             */
            public Builder tags(RouterInterfaceTypeTags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the local virtual private cloud (VPC) in the peering connection.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze3tq4uxhysg717x****</p>
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
    /**
     * 
     * {@link DescribeRouterInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouterInterfacesResponseBody</p>
     */
    public static class RouterInterfaceSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouterInterfaceType")
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
