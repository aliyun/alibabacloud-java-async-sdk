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
        this.role = builder.role;
        this.routerId = builder.routerId;
        this.routerInterfaceId = builder.routerInterfaceId;
        this.routerType = builder.routerType;
        this.spec = builder.spec;
        this.status = builder.status;
        this.success = builder.success;
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
        private String role; 
        private String routerId; 
        private String routerInterfaceId; 
        private String routerType; 
        private String spec; 
        private String status; 
        private Boolean success; 
        private String vpcInstanceId; 

        /**
         * AccessPointId.
         */
        public Builder accessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ConnectedTime.
         */
        public Builder connectedTime(String connectedTime) {
            this.connectedTime = connectedTime;
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
         * CrossBorder.
         */
        public Builder crossBorder(Boolean crossBorder) {
            this.crossBorder = crossBorder;
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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
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
         * HcRate.
         */
        public Builder hcRate(Integer hcRate) {
            this.hcRate = hcRate;
            return this;
        }

        /**
         * HcThreshold.
         */
        public Builder hcThreshold(Integer hcThreshold) {
            this.hcThreshold = hcThreshold;
            return this;
        }

        /**
         * HealthCheckSourceIp.
         */
        public Builder healthCheckSourceIp(String healthCheckSourceIp) {
            this.healthCheckSourceIp = healthCheckSourceIp;
            return this;
        }

        /**
         * HealthCheckStatus.
         */
        public Builder healthCheckStatus(String healthCheckStatus) {
            this.healthCheckStatus = healthCheckStatus;
            return this;
        }

        /**
         * HealthCheckTargetIp.
         */
        public Builder healthCheckTargetIp(String healthCheckTargetIp) {
            this.healthCheckTargetIp = healthCheckTargetIp;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * OppositeAccessPointId.
         */
        public Builder oppositeAccessPointId(String oppositeAccessPointId) {
            this.oppositeAccessPointId = oppositeAccessPointId;
            return this;
        }

        /**
         * OppositeBandwidth.
         */
        public Builder oppositeBandwidth(Integer oppositeBandwidth) {
            this.oppositeBandwidth = oppositeBandwidth;
            return this;
        }

        /**
         * OppositeInterfaceBusinessStatus.
         */
        public Builder oppositeInterfaceBusinessStatus(String oppositeInterfaceBusinessStatus) {
            this.oppositeInterfaceBusinessStatus = oppositeInterfaceBusinessStatus;
            return this;
        }

        /**
         * OppositeInterfaceId.
         */
        public Builder oppositeInterfaceId(String oppositeInterfaceId) {
            this.oppositeInterfaceId = oppositeInterfaceId;
            return this;
        }

        /**
         * OppositeInterfaceOwnerId.
         */
        public Builder oppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
            this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
            return this;
        }

        /**
         * OppositeInterfaceSpec.
         */
        public Builder oppositeInterfaceSpec(String oppositeInterfaceSpec) {
            this.oppositeInterfaceSpec = oppositeInterfaceSpec;
            return this;
        }

        /**
         * OppositeInterfaceStatus.
         */
        public Builder oppositeInterfaceStatus(String oppositeInterfaceStatus) {
            this.oppositeInterfaceStatus = oppositeInterfaceStatus;
            return this;
        }

        /**
         * OppositeRegionId.
         */
        public Builder oppositeRegionId(String oppositeRegionId) {
            this.oppositeRegionId = oppositeRegionId;
            return this;
        }

        /**
         * OppositeRouterId.
         */
        public Builder oppositeRouterId(String oppositeRouterId) {
            this.oppositeRouterId = oppositeRouterId;
            return this;
        }

        /**
         * OppositeRouterType.
         */
        public Builder oppositeRouterType(String oppositeRouterType) {
            this.oppositeRouterType = oppositeRouterType;
            return this;
        }

        /**
         * OppositeVpcInstanceId.
         */
        public Builder oppositeVpcInstanceId(String oppositeVpcInstanceId) {
            this.oppositeVpcInstanceId = oppositeVpcInstanceId;
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
         * ReservationActiveTime.
         */
        public Builder reservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }

        /**
         * ReservationBandwidth.
         */
        public Builder reservationBandwidth(String reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
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
         * Role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * RouterId.
         */
        public Builder routerId(String routerId) {
            this.routerId = routerId;
            return this;
        }

        /**
         * RouterInterfaceId.
         */
        public Builder routerInterfaceId(String routerInterfaceId) {
            this.routerInterfaceId = routerInterfaceId;
            return this;
        }

        /**
         * RouterType.
         */
        public Builder routerType(String routerType) {
            this.routerType = routerType;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * VpcInstanceId.
         */
        public Builder vpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }

        public DescribeRouterInterfaceAttributeResponseBody build() {
            return new DescribeRouterInterfaceAttributeResponseBody(this);
        } 

    } 

}
