// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRouterInterfaceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRouterInterfaceAttributeResponseBody</p>
 */
public class DescribeRouterInterfaceAttributeResponseBody extends TeaModel {
    @NameInMap("AccessPointId")
    private String accessPointId;

    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @NameInMap("BusinessStatus")
    private String businessStatus;

    @NameInMap("ChargeType")
    private String chargeType;

    @NameInMap("Code")
    private String code;

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
    private String fastLinkMode;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("HasReservationData")
    private String hasReservationData;

    @NameInMap("HcRate")
    private Integer hcRate;

    @NameInMap("HcThreshold")
    private Integer hcThreshold;

    @NameInMap("HealthCheckSourceIp")
    private String healthCheckSourceIp;

    @NameInMap("HealthCheckStatus")
    private String healthCheckStatus;

    @NameInMap("HealthCheckTargetIp")
    private String healthCheckTargetIp;

    @NameInMap("Message")
    private String message;

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

    @NameInMap("RequestId")
    private String requestId;

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

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Tags")
    private Tags tags;

    @NameInMap("VpcInstanceId")
    private String vpcInstanceId;

    private DescribeRouterInterfaceAttributeResponseBody(Builder builder) {
        this.accessPointId = builder.accessPointId;
        this.bandwidth = builder.bandwidth;
        this.businessStatus = builder.businessStatus;
        this.chargeType = builder.chargeType;
        this.code = builder.code;
        this.connectedTime = builder.connectedTime;
        this.creationTime = builder.creationTime;
        this.crossBorder = builder.crossBorder;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.fastLinkMode = builder.fastLinkMode;
        this.gmtModified = builder.gmtModified;
        this.hasReservationData = builder.hasReservationData;
        this.hcRate = builder.hcRate;
        this.hcThreshold = builder.hcThreshold;
        this.healthCheckSourceIp = builder.healthCheckSourceIp;
        this.healthCheckStatus = builder.healthCheckStatus;
        this.healthCheckTargetIp = builder.healthCheckTargetIp;
        this.message = builder.message;
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
        this.requestId = builder.requestId;
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
        this.success = builder.success;
        this.tags = builder.tags;
        this.vpcInstanceId = builder.vpcInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRouterInterfaceAttributeResponseBody create() {
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
     * @return code
     */
    public String getCode() {
        return this.code;
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
    public String getFastLinkMode() {
        return this.fastLinkMode;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
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
     * @return healthCheckStatus
     */
    public String getHealthCheckStatus() {
        return this.healthCheckStatus;
    }

    /**
     * @return healthCheckTargetIp
     */
    public String getHealthCheckTargetIp() {
        return this.healthCheckTargetIp;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tags
     */
    public Tags getTags() {
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
        private String code; 
        private String connectedTime; 
        private String creationTime; 
        private Boolean crossBorder; 
        private String description; 
        private String endTime; 
        private String fastLinkMode; 
        private String gmtModified; 
        private String hasReservationData; 
        private Integer hcRate; 
        private Integer hcThreshold; 
        private String healthCheckSourceIp; 
        private String healthCheckStatus; 
        private String healthCheckTargetIp; 
        private String message; 
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
        private String requestId; 
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
        private Boolean success; 
        private Tags tags; 
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
         * The status of the router interface. Valid values:
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
         * The billing method. Valid values:
         * <p>
         * 
         * *   **AfterPay**: pay-as-you-go
         * *   **PrePaid**: subscription
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The time when the connection is established.
         */
        public Builder connectedTime(String connectedTime) {
            this.connectedTime = connectedTime;
            return this;
        }

        /**
         * The time when the router interface was created.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * Indicates whether the connection is a cross-border connection. Valid values:
         * <p>
         * 
         * *   **false**: no
         * *   **true**: yes
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
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * FastLinkMode.
         */
        public Builder fastLinkMode(String fastLinkMode) {
            this.fastLinkMode = fastLinkMode;
            return this;
        }

        /**
         * The time when the router interface was modified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Indicates whether renewal data is included. Valid values:
         * <p>
         * 
         * *   **false**: no
         * *   **true**: yes
         */
        public Builder hasReservationData(String hasReservationData) {
            this.hasReservationData = hasReservationData;
            return this;
        }

        /**
         * The rate of health checks. Unit: seconds. The value indicates the interval at which probe packets are sent during a health check.
         */
        public Builder hcRate(Integer hcRate) {
            this.hcRate = hcRate;
            return this;
        }

        /**
         * The health check threshold, which is the number of probe packets that are sent during a health check. Unit: packets.
         */
        public Builder hcThreshold(Integer hcThreshold) {
            this.hcThreshold = hcThreshold;
            return this;
        }

        /**
         * The source IP address that is used for health checks.
         */
        public Builder healthCheckSourceIp(String healthCheckSourceIp) {
            this.healthCheckSourceIp = healthCheckSourceIp;
            return this;
        }

        /**
         * The health check status. Valid values:
         * <p>
         * 
         * *   **Abnormal**: abnormal.
         * *   **Normal**: normal.
         * *   **NoRedundantRoute**: No redundant route is configured.
         * *   **NoHealthCheckConfig**: No health check is configured.
         */
        public Builder healthCheckStatus(String healthCheckStatus) {
            this.healthCheckStatus = healthCheckStatus;
            return this;
        }

        /**
         * The destination IP address that is used for health checks.
         */
        public Builder healthCheckTargetIp(String healthCheckTargetIp) {
            this.healthCheckTargetIp = healthCheckTargetIp;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The name of the router interface.
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
         * The bandwidth of the peer router interface. Unit: Mbit/s.
         */
        public Builder oppositeBandwidth(Integer oppositeBandwidth) {
            this.oppositeBandwidth = oppositeBandwidth;
            return this;
        }

        /**
         * The service status of the peer router interface. Valid values:
         * <p>
         * 
         * *   **Normal**: normal
         * *   **FinancialLocked**: locked due to overdue payments
         * *   **SecurityLocked**: locked due to security reasons
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
         * The specification of the peer router interface. Valid values:
         * <p>
         * 
         * *   **Mini.2**: 2 Mbit/s
         * *   **Mini.5**: 5 Mbit/s
         * *   **Small.1**: 10 Mbit/s
         * *   **Small.2**: 20 Mbit/s
         * *   **Small.5**: 50 Mbit/s
         * *   **Middle.1**: 100 Mbit/s
         * *   **Middle.2**: 200 Mbit/s
         * *   **Middle.5**: 500 Mbit/s
         * *   **Large.1**: 1,000 Mbit/s
         * *   **Large.2**: 2,000 Mbit/s
         * *   **Large.5**: 5,000 Mbit/s
         * *   **Xlarge.1**: 10,000 Mbit/s
         * *   **Negative**: not applicable
         */
        public Builder oppositeInterfaceSpec(String oppositeInterfaceSpec) {
            this.oppositeInterfaceSpec = oppositeInterfaceSpec;
            return this;
        }

        /**
         * The status of the peer router interface. Valid values:
         * <p>
         * 
         * *   **Idle**: not connected
         * *   **AcceptingConnecting**: accepting a connection
         * *   **Connecting**: connecting
         * *   **Activating**: being activated
         * *   **Active**: activated
         * *   **Modifying**: being modified
         * *   **Deactivating**: being disabled
         * *   **Inactive**: disabled
         * *   **Deleting**: being deleted
         * *   **Deleted**: deleted
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
         * The type of the router to which the peer router interface belongs. Valid values:
         * <p>
         * 
         * *   **VRouter**: a vRouter
         * *   **VBR**: a virtual border router (VBR)
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The time when the renewal takes effect.
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
         * The metering method that is used after the renewal takes effect. The value is set to **PayByBandwidth**, which indicates the pay-by-bandwidth metering method.
         */
        public Builder reservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }

        /**
         * The type of the renewal order. The value is set to **RENEW**, which indicates that the order is placed for service renewal.
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
         * Indicates whether the router interface is the requester or the acceptor of the peering connection.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * The ID of the router to which the router interface belongs.
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
         * *   **VRouter**: a vRouter
         * *   **VBR**: a VBR
         */
        public Builder routerType(String routerType) {
            this.routerType = routerType;
            return this;
        }

        /**
         * The specification of the router interface. Valid values:
         * <p>
         * 
         * *   **Mini.2**: 2 Mbit/s
         * *   **Mini.5**: 5 Mbit/s
         * *   **Small.1**: 10 Mbit/s
         * *   **Small.2**: 20 Mbit/s
         * *   **Small.5**: 50 Mbit/s
         * *   **Middle.1**: 100 Mbit/s
         * *   **Middle.2**: 200 Mbit/s
         * *   **Middle.5**: 500 Mbit/s
         * *   **Large.1**: 1,000 Mbit/s
         * *   **Large.2**: 2,000 Mbit/s
         * *   **Large.5**: 5,000 Mbit/s
         * *   **Xlarge.1**: 10,000 Mbit/s
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        /**
         * The status of the router interface. Valid values:
         * <p>
         * 
         * *   **Idle**: not connected
         * *   **AcceptingConnecting**: accepting a connection
         * *   **Connecting**: connecting
         * *   **Activating**: being activated
         * *   **Active**: activated
         * *   **Modifying**: being modified
         * *   **Deactivating**: being disabled
         * *   **Inactive**: disabled
         * *   **Deleting**: being deleted
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Indicates whether the operation is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) to which the router interface belongs.
         */
        public Builder vpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }

        public DescribeRouterInterfaceAttributeResponseBody build() {
            return new DescribeRouterInterfaceAttributeResponseBody(this);
        } 

    } 

    public static class TagsTags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private TagsTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagsTags create() {
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

            public TagsTags build() {
                return new TagsTags(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tags")
        private java.util.List < TagsTags> tags;

        private Tags(Builder builder) {
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tags
         */
        public java.util.List < TagsTags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List < TagsTags> tags; 

            /**
             * Tags.
             */
            public Builder tags(java.util.List < TagsTags> tags) {
                this.tags = tags;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
