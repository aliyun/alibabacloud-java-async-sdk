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
 * {@link ModifyRouterInterfaceAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyRouterInterfaceAttributeRequest</p>
 */
public class ModifyRouterInterfaceAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteHealthCheckIp")
    private Boolean deleteHealthCheckIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HcRate")
    private Integer hcRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HcThreshold")
    private Integer hcThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckSourceIp")
    private String healthCheckSourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckTargetIp")
    private String healthCheckTargetIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OppositeInterfaceId")
    private String oppositeInterfaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OppositeInterfaceOwnerId")
    private Long oppositeInterfaceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OppositeRouterId")
    private String oppositeRouterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OppositeRouterType")
    private String oppositeRouterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouterInterfaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routerInterfaceId;

    private ModifyRouterInterfaceAttributeRequest(Builder builder) {
        super(builder);
        this.deleteHealthCheckIp = builder.deleteHealthCheckIp;
        this.description = builder.description;
        this.hcRate = builder.hcRate;
        this.hcThreshold = builder.hcThreshold;
        this.healthCheckSourceIp = builder.healthCheckSourceIp;
        this.healthCheckTargetIp = builder.healthCheckTargetIp;
        this.name = builder.name;
        this.oppositeInterfaceId = builder.oppositeInterfaceId;
        this.oppositeInterfaceOwnerId = builder.oppositeInterfaceOwnerId;
        this.oppositeRouterId = builder.oppositeRouterId;
        this.oppositeRouterType = builder.oppositeRouterType;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routerInterfaceId = builder.routerInterfaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRouterInterfaceAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteHealthCheckIp
     */
    public Boolean getDeleteHealthCheckIp() {
        return this.deleteHealthCheckIp;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return name
     */
    public String getName() {
        return this.name;
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
    public Long getOppositeInterfaceOwnerId() {
        return this.oppositeInterfaceOwnerId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return routerInterfaceId
     */
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

    public static final class Builder extends Request.Builder<ModifyRouterInterfaceAttributeRequest, Builder> {
        private Boolean deleteHealthCheckIp; 
        private String description; 
        private Integer hcRate; 
        private Integer hcThreshold; 
        private String healthCheckSourceIp; 
        private String healthCheckTargetIp; 
        private String name; 
        private String oppositeInterfaceId; 
        private Long oppositeInterfaceOwnerId; 
        private String oppositeRouterId; 
        private String oppositeRouterType; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routerInterfaceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRouterInterfaceAttributeRequest request) {
            super(request);
            this.deleteHealthCheckIp = request.deleteHealthCheckIp;
            this.description = request.description;
            this.hcRate = request.hcRate;
            this.hcThreshold = request.hcThreshold;
            this.healthCheckSourceIp = request.healthCheckSourceIp;
            this.healthCheckTargetIp = request.healthCheckTargetIp;
            this.name = request.name;
            this.oppositeInterfaceId = request.oppositeInterfaceId;
            this.oppositeInterfaceOwnerId = request.oppositeInterfaceOwnerId;
            this.oppositeRouterId = request.oppositeRouterId;
            this.oppositeRouterType = request.oppositeRouterType;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routerInterfaceId = request.routerInterfaceId;
        } 

        /**
         * <p>Specifies whether to delete the health check IP addresses configured on the router interface. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Deletes the health check IP addresses.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Does not delete the health check IP addresses.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deleteHealthCheckIp(Boolean deleteHealthCheckIp) {
            this.putQueryParameter("DeleteHealthCheckIp", deleteHealthCheckIp);
            this.deleteHealthCheckIp = deleteHealthCheckIp;
            return this;
        }

        /**
         * <p>The description of the router interface. </p>
         * <p>The description must be 2 to 256 characters in length and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>路由器接口</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The health check rate. Unit: milliseconds. Recommended value: <strong>2000</strong>. This parameter specifies the interval between consecutive probe packets sent during a health check.</p>
         * <p>In this example, <strong>HcThreshold</strong> is set to <strong>8</strong> and <strong>HcRate</strong> is set to <strong>2000</strong>. This means that during a health check, a probe packet is sent from <strong>HealthCheckSourceIp</strong> (the source IP address for health checks) to <strong>HealthCheckTargetIp</strong> (the destination IP address for health checks) every 2000 milliseconds. If 8 consecutive probe packets receive no response, the health check fails.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder hcRate(Integer hcRate) {
            this.putQueryParameter("HcRate", hcRate);
            this.hcRate = hcRate;
            return this;
        }

        /**
         * <p>The health check threshold. Unit: packets. Recommended value: <strong>8</strong>. This parameter specifies the number of probe packets sent during a health check.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder hcThreshold(Integer hcThreshold) {
            this.putQueryParameter("HcThreshold", hcThreshold);
            this.hcThreshold = hcThreshold;
            return this;
        }

        /**
         * <p>The source IP address for health checks. The IP address must be an unused IP address in the local VPC.</p>
         * <blockquote>
         * <p>You can specify this parameter in Express Connect circuit scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>116.62.XX.XX</p>
         */
        public Builder healthCheckSourceIp(String healthCheckSourceIp) {
            this.putQueryParameter("HealthCheckSourceIp", healthCheckSourceIp);
            this.healthCheckSourceIp = healthCheckSourceIp;
            return this;
        }

        /**
         * <p>The destination IP address for health checks. </p>
         * <blockquote>
         * <p>This parameter is required if <strong>HealthCheckSourceIp</strong> is specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>116.62.XX.XX</p>
         */
        public Builder healthCheckTargetIp(String healthCheckTargetIp) {
            this.putQueryParameter("HealthCheckTargetIp", healthCheckTargetIp);
            this.healthCheckTargetIp = healthCheckTargetIp;
            return this;
        }

        /**
         * <p>The name of the router interface.</p>
         * <p>The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>TEST</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the peer router interface.</p>
         * 
         * <strong>example:</strong>
         * <p>ri-2zeo3xzyf38r4urz****</p>
         */
        public Builder oppositeInterfaceId(String oppositeInterfaceId) {
            this.putQueryParameter("OppositeInterfaceId", oppositeInterfaceId);
            this.oppositeInterfaceId = oppositeInterfaceId;
            return this;
        }

        /**
         * <p>The ID of the account to which the peer router interface belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>28768383240243****</p>
         */
        public Builder oppositeInterfaceOwnerId(Long oppositeInterfaceOwnerId) {
            this.putQueryParameter("OppositeInterfaceOwnerId", oppositeInterfaceOwnerId);
            this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
            return this;
        }

        /**
         * <p>The ID of the peer router.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-bp1jcg5cmxjbl9xgc****</p>
         */
        public Builder oppositeRouterId(String oppositeRouterId) {
            this.putQueryParameter("OppositeRouterId", oppositeRouterId);
            this.oppositeRouterId = oppositeRouterId;
            return this;
        }

        /**
         * <p>The type of the router to which the peer router interface belongs. Valid values:</p>
         * <ul>
         * <li><p><strong>VRouter</strong>: vRouter.</p>
         * </li>
         * <li><p><strong>VBR</strong> (default): Virtual Border Router.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VBR</p>
         */
        public Builder oppositeRouterType(String oppositeRouterType) {
            this.putQueryParameter("OppositeRouterType", oppositeRouterType);
            this.oppositeRouterType = oppositeRouterType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID of the router interface.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The ID of the router interface.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ri-2zeo3xzyf38r4urz****</p>
         */
        public Builder routerInterfaceId(String routerInterfaceId) {
            this.putQueryParameter("RouterInterfaceId", routerInterfaceId);
            this.routerInterfaceId = routerInterfaceId;
            return this;
        }

        @Override
        public ModifyRouterInterfaceAttributeRequest build() {
            return new ModifyRouterInterfaceAttributeRequest(this);
        } 

    } 

}
