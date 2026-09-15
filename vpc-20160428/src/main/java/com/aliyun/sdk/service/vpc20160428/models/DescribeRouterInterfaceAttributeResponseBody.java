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
 * {@link DescribeRouterInterfaceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRouterInterfaceAttributeResponseBody</p>
 */
public class DescribeRouterInterfaceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessPointId")
    private String accessPointId;

    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.NameInMap("BusinessStatus")
    private String businessStatus;

    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

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
    private String fastLinkMode;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("HasReservationData")
    private String hasReservationData;

    @com.aliyun.core.annotation.NameInMap("HcRate")
    private Integer hcRate;

    @com.aliyun.core.annotation.NameInMap("HcThreshold")
    private Integer hcThreshold;

    @com.aliyun.core.annotation.NameInMap("HealthCheckSourceIp")
    private String healthCheckSourceIp;

    @com.aliyun.core.annotation.NameInMap("HealthCheckStatus")
    private String healthCheckStatus;

    @com.aliyun.core.annotation.NameInMap("HealthCheckTargetIp")
    private String healthCheckTargetIp;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

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

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRouterInterfaceAttributeResponseBody model) {
            this.accessPointId = model.accessPointId;
            this.bandwidth = model.bandwidth;
            this.businessStatus = model.businessStatus;
            this.chargeType = model.chargeType;
            this.code = model.code;
            this.connectedTime = model.connectedTime;
            this.creationTime = model.creationTime;
            this.crossBorder = model.crossBorder;
            this.description = model.description;
            this.endTime = model.endTime;
            this.fastLinkMode = model.fastLinkMode;
            this.gmtModified = model.gmtModified;
            this.hasReservationData = model.hasReservationData;
            this.hcRate = model.hcRate;
            this.hcThreshold = model.hcThreshold;
            this.healthCheckSourceIp = model.healthCheckSourceIp;
            this.healthCheckStatus = model.healthCheckStatus;
            this.healthCheckTargetIp = model.healthCheckTargetIp;
            this.message = model.message;
            this.name = model.name;
            this.oppositeAccessPointId = model.oppositeAccessPointId;
            this.oppositeBandwidth = model.oppositeBandwidth;
            this.oppositeInterfaceBusinessStatus = model.oppositeInterfaceBusinessStatus;
            this.oppositeInterfaceId = model.oppositeInterfaceId;
            this.oppositeInterfaceOwnerId = model.oppositeInterfaceOwnerId;
            this.oppositeInterfaceSpec = model.oppositeInterfaceSpec;
            this.oppositeInterfaceStatus = model.oppositeInterfaceStatus;
            this.oppositeRegionId = model.oppositeRegionId;
            this.oppositeRouterId = model.oppositeRouterId;
            this.oppositeRouterType = model.oppositeRouterType;
            this.oppositeVpcInstanceId = model.oppositeVpcInstanceId;
            this.requestId = model.requestId;
            this.reservationActiveTime = model.reservationActiveTime;
            this.reservationBandwidth = model.reservationBandwidth;
            this.reservationInternetChargeType = model.reservationInternetChargeType;
            this.reservationOrderType = model.reservationOrderType;
            this.resourceGroupId = model.resourceGroupId;
            this.role = model.role;
            this.routerId = model.routerId;
            this.routerInterfaceId = model.routerInterfaceId;
            this.routerType = model.routerType;
            this.spec = model.spec;
            this.status = model.status;
            this.success = model.success;
            this.tags = model.tags;
            this.vpcInstanceId = model.vpcInstanceId;
        } 

        /**
         * <p>The ID of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-cn-qingdao-ls-A</p>
         */
        public Builder accessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }

        /**
         * <p>The bandwidth of the router interface. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The business status of the router interface. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: normal.</p>
         * </li>
         * <li><p><strong>FinancialLocked</strong>: locked due to overdue payment.</p>
         * </li>
         * <li><p><strong>SecurityLocked</strong>: locked due to security risk control.</p>
         * </li>
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
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>AfterPay</strong>: pay-as-you-go.</li>
         * <li><strong>PrePaid</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AfterPay</p>
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The time when the connection was established. The time is displayed in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-14T08:58:04Z</p>
         */
        public Builder connectedTime(String connectedTime) {
            this.connectedTime = connectedTime;
            return this;
        }

        /**
         * <p>The time when the router interface was created. The time is displayed in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-14T08:57:24Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>Indicates whether this is a cross-border connection. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong>: No.</p>
         * </li>
         * <li><p><strong>true</strong>: Yes.</p>
         * </li>
         * </ul>
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
         * <p>Peer interface</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The end time of the data retrieval. The time is displayed in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2999-09-08T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Indicates whether the router interface on the VBR was created in fast link mode. Fast link mode allows the router interfaces on both the VBR and VPC sides to automatically connect after creation. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong> (default): No.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only when <strong>RouterType</strong> is set to <strong>VBR</strong> and <strong>OppositeRouterType</strong> is set to <strong>VRouter</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>When <strong>FastLinkMode</strong> is set to <strong>true</strong>, <strong>Role</strong> must be set to <strong>InitiatingSide</strong>, and <strong>AccessPointId</strong>, <strong>OppositeRouterType</strong>, <strong>OpppsiteRouterId</strong>, and <strong>OppositeInterfaceOwnerId</strong> are required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder fastLinkMode(String fastLinkMode) {
            this.fastLinkMode = fastLinkMode;
            return this;
        }

        /**
         * <p>The time when the router interface was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-28T10:02:12Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>Indicates whether renewal data exists. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong>: No.</p>
         * </li>
         * <li><p><strong>true</strong>: Yes.</p>
         * </li>
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
         * <p>The health check rate. Unit: seconds. This value indicates the interval between consecutive probe packets sent during a health check.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder hcRate(Integer hcRate) {
            this.hcRate = hcRate;
            return this;
        }

        /**
         * <p>The health check threshold. This value indicates the number of probe packets sent during a health check. Unit: packets.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder hcThreshold(Integer hcThreshold) {
            this.hcThreshold = hcThreshold;
            return this;
        }

        /**
         * <p>The health check source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.XX.XX</p>
         */
        public Builder healthCheckSourceIp(String healthCheckSourceIp) {
            this.healthCheckSourceIp = healthCheckSourceIp;
            return this;
        }

        /**
         * <p>The health check status. Valid values:</p>
         * <ul>
         * <li><strong>Abnormal</strong>: abnormal.</li>
         * <li><strong>Normal</strong>: normal.</li>
         * <li><strong>NoRedundantRoute</strong>: no redundant route configured.</li>
         * <li><strong>NoHealthCheckConfig</strong>: no health check configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder healthCheckStatus(String healthCheckStatus) {
            this.healthCheckStatus = healthCheckStatus;
            return this;
        }

        /**
         * <p>The health check target IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.XX.XX</p>
         */
        public Builder healthCheckTargetIp(String healthCheckTargetIp) {
            this.healthCheckTargetIp = healthCheckTargetIp;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The name of the router interface.</p>
         * 
         * <strong>example:</strong>
         * <p>RouterInterface1</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the peer access point.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-cn-qingdao-ls-B</p>
         */
        public Builder oppositeAccessPointId(String oppositeAccessPointId) {
            this.oppositeAccessPointId = oppositeAccessPointId;
            return this;
        }

        /**
         * <p>The bandwidth of the peer router interface. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder oppositeBandwidth(Integer oppositeBandwidth) {
            this.oppositeBandwidth = oppositeBandwidth;
            return this;
        }

        /**
         * <p>The business status of the peer router interface. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: normal.</li>
         * <li><strong>FinancialLocked</strong>: locked due to overdue payment.</li>
         * <li><strong>SecurityLocked</strong>: locked due to security risk control.</li>
         * </ul>
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
         * <p>ri-bp1xkrzttximaoxbl****</p>
         */
        public Builder oppositeInterfaceId(String oppositeInterfaceId) {
            this.oppositeInterfaceId = oppositeInterfaceId;
            return this;
        }

        /**
         * <p>The ID of the account to which the peer router interface belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1321932713****</p>
         */
        public Builder oppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
            this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
            return this;
        }

        /**
         * <p>The specification of the peer router interface. Valid values:</p>
         * <ul>
         * <li><strong>Mini.2</strong>: 2 Mbps</li>
         * <li><strong>Mini.5</strong>: 5 Mbps</li>
         * <li><strong>Small.1</strong>: 10 Mbps</li>
         * <li><strong>Small.2</strong>: 20 Mbps</li>
         * <li><strong>Small.5</strong>: 50 Mbps</li>
         * <li><strong>Middle.1</strong>: 100 Mbps</li>
         * <li><strong>Middle.2</strong>: 200 Mbps</li>
         * <li><strong>Middle.5</strong>: 500 Mbps</li>
         * <li><strong>Large.1</strong>: 1000 Mbps</li>
         * <li><strong>Large.2</strong>: 2000 Mbps</li>
         * <li><strong>Large.5</strong>: 5000 Mbps</li>
         * <li><strong>Xlarge.1</strong>: 10000 Mbps</li>
         * <li><strong>Negative</strong>: no specification involved.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Negative</p>
         */
        public Builder oppositeInterfaceSpec(String oppositeInterfaceSpec) {
            this.oppositeInterfaceSpec = oppositeInterfaceSpec;
            return this;
        }

        /**
         * <p>The status of the peer router interface. Valid values:</p>
         * <ul>
         * <li><strong>Idle</strong>: not connected.</li>
         * <li><strong>AcceptingConnecting</strong>: accepting a connection.</li>
         * <li><strong>Connecting</strong>: connecting.</li>
         * <li><strong>Activating</strong>: being activated.</li>
         * <li><strong>Active</strong>: activated.</li>
         * <li><strong>Modifying</strong>: being modified.</li>
         * <li><strong>Deactivating</strong>: being frozen.</li>
         * <li><strong>Inactive</strong>: frozen.</li>
         * <li><strong>Deleting</strong>: being deleted.</li>
         * <li><strong>Deleted</strong>: deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder oppositeInterfaceStatus(String oppositeInterfaceStatus) {
            this.oppositeInterfaceStatus = oppositeInterfaceStatus;
            return this;
        }

        /**
         * <p>The region ID of the peer router interface.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder oppositeRegionId(String oppositeRegionId) {
            this.oppositeRegionId = oppositeRegionId;
            return this;
        }

        /**
         * <p>The ID of the router to which the peer router interface belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-bp11xvy6lb9photuu****</p>
         */
        public Builder oppositeRouterId(String oppositeRouterId) {
            this.oppositeRouterId = oppositeRouterId;
            return this;
        }

        /**
         * <p>The type of the router to which the peer router interface belongs. Valid values:</p>
         * <ul>
         * <li><strong>VRouter</strong>: vRouter of a VPC.</li>
         * <li><strong>VBR</strong>: Virtual Border Router.</li>
         * </ul>
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
         * <p>vpc-bp1b49rqrybk45nio****</p>
         */
        public Builder oppositeVpcInstanceId(String oppositeVpcInstanceId) {
            this.oppositeVpcInstanceId = oppositeVpcInstanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01818199-04F6-47F4-9ADF-7CC824CF57A4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The renewal active time. The time is displayed in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-11T16:00:00Z</p>
         */
        public Builder reservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }

        /**
         * <p>The renewal bandwidth. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder reservationBandwidth(String reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }

        /**
         * <p>The renewal billing type. Valid values: <strong>PayByBandwidth</strong>, which indicates pay-by-bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        public Builder reservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }

        /**
         * <p>The renewal order type. Valid values: <strong>RENEW</strong>, which indicates a renewal order.</p>
         * 
         * <strong>example:</strong>
         * <p>RENEW</p>
         */
        public Builder reservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">What is a resource group?</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The role in the peering connection.</p>
         * 
         * <strong>example:</strong>
         * <p>InitiatingSide</p>
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * <p>The ID of the router to which the router interface belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-m5ex0xf63xk8s5bob****</p>
         */
        public Builder routerId(String routerId) {
            this.routerId = routerId;
            return this;
        }

        /**
         * <p>The ID of the router interface.</p>
         * 
         * <strong>example:</strong>
         * <p>ri-m5egfc10sednwk2yt****</p>
         */
        public Builder routerInterfaceId(String routerInterfaceId) {
            this.routerInterfaceId = routerInterfaceId;
            return this;
        }

        /**
         * <p>The type of the router to which the route table belongs. Valid values:</p>
         * <ul>
         * <li><p><strong>VRouter</strong>: vRouter of a VPC.</p>
         * </li>
         * <li><p><strong>VBR</strong>: Virtual Border Router.</p>
         * </li>
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
         * <p>The specification of the router interface. Valid values:</p>
         * <ul>
         * <li><strong>Mini.2</strong>: 2 Mbps</li>
         * <li><strong>Mini.5</strong>: 5 Mbps</li>
         * <li><strong>Small.1</strong>: 10 Mbps</li>
         * <li><strong>Small.2</strong>: 20 Mbps</li>
         * <li><strong>Small.5</strong>: 50 Mbps</li>
         * <li><strong>Middle.1</strong>: 100 Mbps</li>
         * <li><strong>Middle.2</strong>: 200 Mbps</li>
         * <li><strong>Middle.5</strong>: 500 Mbps</li>
         * <li><strong>Large.1</strong>: 1000 Mbps</li>
         * <li><strong>Large.2</strong>: 2000 Mbps</li>
         * <li><strong>Large.5</strong>: 5000 Mbps</li>
         * <li><strong>Xlarge.1</strong>: 10000 Mbps</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Mini.2</p>
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        /**
         * <p>The status of the router interface. Valid values:</p>
         * <ul>
         * <li><strong>Idle</strong>: not connected.</li>
         * <li><strong>AcceptingConnecting</strong>: accepting a connection.</li>
         * <li><strong>Connecting</strong>: connecting.</li>
         * <li><strong>Activating</strong>: being activated.</li>
         * <li><strong>Active</strong>: activated.</li>
         * <li><strong>Modifying</strong>: being modified.</li>
         * <li><strong>Deactivating</strong>: being frozen.</li>
         * <li><strong>Inactive</strong>: frozen.</li>
         * <li><strong>Deleting</strong>: being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The ID of the virtual private cloud (VPC) to which the router interface belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1b49rqrybk45nio****</p>
         */
        public Builder vpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }

        public DescribeRouterInterfaceAttributeResponseBody build() {
            return new DescribeRouterInterfaceAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRouterInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouterInterfaceAttributeResponseBody</p>
     */
    public static class TagsTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(TagsTags model) {
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

            public TagsTags build() {
                return new TagsTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRouterInterfaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouterInterfaceAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<TagsTags> tags;

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
        public java.util.List<TagsTags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List<TagsTags> tags; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tags = model.tags;
            } 

            /**
             * Tags.
             */
            public Builder tags(java.util.List<TagsTags> tags) {
                this.tags = tags;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
