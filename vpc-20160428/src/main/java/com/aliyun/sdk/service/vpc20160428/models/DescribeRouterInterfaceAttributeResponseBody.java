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
         * <p>The bandwidth of the router interface. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The status of the router interface. Valid values:</p>
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
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>AfterPay</strong>: pay-as-you-go</li>
         * <li><strong>PrePaid</strong>: subscription</li>
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
         * <p>The time when the connection was established.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-14T08:58:04Z</p>
         */
        public Builder connectedTime(String connectedTime) {
            this.connectedTime = connectedTime;
            return this;
        }

        /**
         * <p>The time when the router interface was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-14T08:57:24Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>Indicates whether the connection is a cross-border connection. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
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
         * <p>Peer interface.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The end of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2999-09-08T16:00:00Z</p>
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
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter takes effect only when <strong>RouterType</strong> is set to <strong>VBR</strong> and <strong>OppositeRouterType</strong> is set to <strong>VRouter</strong>.</p>
         * </li>
         * <li><p>When <strong>FastLinkMode</strong> is set to <strong>true</strong>, <strong>Role</strong> must be set to <strong>InitiatingSide</strong>. <strong>AccessPointId</strong>, <strong>OppositeRouterType</strong>, <strong>OpppsiteRouterId</strong>, and <strong>OppositeInterfaceOwnerId</strong> are required.</p>
         * </li>
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
         * <p>The time when the router interface was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-28T10:02:12Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>Indicates whether renewal data is included. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
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
         * <p>The rate of health checks. Unit: seconds. The value indicates the interval at which probe packets are sent during a health check.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder hcRate(Integer hcRate) {
            this.hcRate = hcRate;
            return this;
        }

        /**
         * <p>The healthy threshold. This value indicates the number of probe packets that are sent during a health check. Unit: packets.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder hcThreshold(Integer hcThreshold) {
            this.hcThreshold = hcThreshold;
            return this;
        }

        /**
         * <p>The source IP address that is used for the health check.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.XX.XX</p>
         */
        public Builder healthCheckSourceIp(String healthCheckSourceIp) {
            this.healthCheckSourceIp = healthCheckSourceIp;
            return this;
        }

        /**
         * <p>The status of the health check. Valid values:</p>
         * <ul>
         * <li><strong>Abnormal</strong></li>
         * <li><strong>Normal</strong></li>
         * <li><strong>NoRedundantRoute</strong></li>
         * <li><strong>NoHealthCheckConfig</strong></li>
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
         * <p>The destination IP address that is used for the health check.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.XX.XX</p>
         */
        public Builder healthCheckTargetIp(String healthCheckTargetIp) {
            this.healthCheckTargetIp = healthCheckTargetIp;
            return this;
        }

        /**
         * <p>The response parameters.</p>
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
         * <p>The maximum bandwidth of the peer router interface. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder oppositeBandwidth(Integer oppositeBandwidth) {
            this.oppositeBandwidth = oppositeBandwidth;
            return this;
        }

        /**
         * <p>The service status of the peer router interface. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>FinancialLocked</strong></li>
         * <li><strong>SecurityLocked</strong></li>
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
         * <p>The ID of the Alibaba Cloud account to which the peer router interface belongs.</p>
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
         * <li><strong>Mini.2</strong>: 2 Mbit/s</li>
         * <li><strong>Mini.5</strong>: 5 Mbit/s</li>
         * <li><strong>Small.1</strong>: 10 Mbit/s</li>
         * <li><strong>Small.2</strong>: 20 Mbit/s</li>
         * <li><strong>Small.5</strong>: 50 Mbit/s</li>
         * <li><strong>Middle.1</strong>: 100 Mbit/s</li>
         * <li><strong>Middle.2</strong>: 200 Mbit/s</li>
         * <li><strong>Middle.5</strong>: 500 Mbit/s</li>
         * <li><strong>Large.1</strong>: 1,000 Mbit/s</li>
         * <li><strong>Large.2</strong>: 2,000 Mbit/s</li>
         * <li><strong>Large.5</strong>: 5,000 Mbit/s</li>
         * <li><strong>Xlarge.1</strong>: 10,000 Mbit/s</li>
         * <li><strong>Negative</strong>: not applicable</li>
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
         * <li><strong>Idle</strong></li>
         * <li><strong>AcceptingConnecting</strong></li>
         * <li><strong>Connecting</strong></li>
         * <li><strong>Activating</strong></li>
         * <li><strong>Active</strong></li>
         * <li><strong>Modifying</strong></li>
         * <li><strong>Deactivating</strong></li>
         * <li><strong>Inactive</strong></li>
         * <li><strong>Deleting</strong></li>
         * <li><strong>Deleted</strong></li>
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
         * <li><strong>VRouter</strong></li>
         * <li><strong>VBR</strong></li>
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
         * <p>The time when the renewal takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-11T16:00:00Z</p>
         */
        public Builder reservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }

        /**
         * <p>The maximum bandwidth after the renewal takes effect. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder reservationBandwidth(String reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }

        /**
         * <p>The metering method that is used after the renewal takes effect. Valid values: If <strong>PayByBandwidth</strong> is returned, it indicates that the Express Connect circuit is billed on a pay-by-bandwidth basis.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        public Builder reservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }

        /**
         * <p>The type of the renewal order. Only <strong>RENEW</strong> may be returned, which indicates that the order is placed for service renewal.</p>
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
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.html">What is a resource group?</a></p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The role of the router interface in the peering connection.</p>
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
         * <p>The specification of the router interface. Valid values:</p>
         * <ul>
         * <li><strong>Mini.2</strong>: 2 Mbit/s</li>
         * <li><strong>Mini.5</strong>: 5 Mbit/s</li>
         * <li><strong>Small.1</strong>: 10 Mbit/s</li>
         * <li><strong>Small.2</strong>: 20 Mbit/s</li>
         * <li><strong>Small.5</strong>: 50 Mbit/s</li>
         * <li><strong>Middle.1</strong>: 100 Mbit/s</li>
         * <li><strong>Middle.2</strong>: 200 Mbit/s</li>
         * <li><strong>Middle.5</strong>: 500 Mbit/s</li>
         * <li><strong>Large.1</strong>: 1,000 Mbit/s</li>
         * <li><strong>Large.2</strong>: 2,000 Mbit/s</li>
         * <li><strong>Large.5</strong>: 5,000 Mbit/s</li>
         * <li><strong>Xlarge.1</strong>: 10,000 Mbit/s</li>
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
         * <li><strong>Idle</strong></li>
         * <li><strong>AcceptingConnecting</strong></li>
         * <li><strong>Connecting</strong></li>
         * <li><strong>Activating</strong></li>
         * <li><strong>Active</strong></li>
         * <li><strong>Modifying</strong></li>
         * <li><strong>Deactivating</strong></li>
         * <li><strong>Inactive</strong></li>
         * <li><strong>Deleting</strong></li>
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
         * <p>Indicates whether the request is successful. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The tag of the resource.</p>
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
             * <p>The key of tag N added to the resource. You must enter at least one tag key and at most 20 tag keys. The tag key cannot be an empty string.</p>
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
             * <p>The value of tag N added to the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
             * <p>It can be up to 128 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
             * <p>The tag of the resource.</p>
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
