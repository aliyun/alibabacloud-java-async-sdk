// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationRequest</p>
 */
public class CreateApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Architecture")
    @com.aliyun.core.annotation.Validation(required = true)
    private String architecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Components")
    private java.util.List<Components> components;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private java.util.List<Endpoints> endpoints;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFSInstanceId")
    private String polarFSInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionCode")
    private String promotionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private String usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateApplicationRequest(Builder builder) {
        super(builder);
        this.applicationType = builder.applicationType;
        this.architecture = builder.architecture;
        this.autoRenew = builder.autoRenew;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.components = builder.components;
        this.DBClusterId = builder.DBClusterId;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.endpoints = builder.endpoints;
        this.payType = builder.payType;
        this.period = builder.period;
        this.polarFSInstanceId = builder.polarFSInstanceId;
        this.promotionCode = builder.promotionCode;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.usedTime = builder.usedTime;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationType
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return components
     */
    public java.util.List<Components> getComponents() {
        return this.components;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return endpoints
     */
    public java.util.List<Endpoints> getEndpoints() {
        return this.endpoints;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return polarFSInstanceId
     */
    public String getPolarFSInstanceId() {
        return this.polarFSInstanceId;
    }

    /**
     * @return promotionCode
     */
    public String getPromotionCode() {
        return this.promotionCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return usedTime
     */
    public String getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateApplicationRequest, Builder> {
        private String applicationType; 
        private String architecture; 
        private Boolean autoRenew; 
        private Boolean autoUseCoupon; 
        private java.util.List<Components> components; 
        private String DBClusterId; 
        private String description; 
        private Boolean dryRun; 
        private java.util.List<Endpoints> endpoints; 
        private String payType; 
        private String period; 
        private String polarFSInstanceId; 
        private String promotionCode; 
        private String regionId; 
        private String resourceGroupId; 
        private String usedTime; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationRequest request) {
            super(request);
            this.applicationType = request.applicationType;
            this.architecture = request.architecture;
            this.autoRenew = request.autoRenew;
            this.autoUseCoupon = request.autoUseCoupon;
            this.components = request.components;
            this.DBClusterId = request.DBClusterId;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.endpoints = request.endpoints;
            this.payType = request.payType;
            this.period = request.period;
            this.polarFSInstanceId = request.polarFSInstanceId;
            this.promotionCode = request.promotionCode;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.usedTime = request.usedTime;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>supabase</p>
         */
        public Builder applicationType(String applicationType) {
            this.putQueryParameter("ApplicationType", applicationType);
            this.applicationType = applicationType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>x86</p>
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * AutoUseCoupon.
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * Components.
         */
        public Builder components(java.util.List<Components> components) {
            String componentsShrink = shrink(components, "Components", "json");
            this.putQueryParameter("Components", componentsShrink);
            this.components = components;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Endpoints.
         */
        public Builder endpoints(java.util.List<Endpoints> endpoints) {
            String endpointsShrink = shrink(endpoints, "Endpoints", "json");
            this.putQueryParameter("Endpoints", endpointsShrink);
            this.endpoints = endpoints;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PolarFSInstanceId.
         */
        public Builder polarFSInstanceId(String polarFSInstanceId) {
            this.putQueryParameter("PolarFSInstanceId", polarFSInstanceId);
            this.polarFSInstanceId = polarFSInstanceId;
            return this;
        }

        /**
         * PromotionCode.
         */
        public Builder promotionCode(String promotionCode) {
            this.putQueryParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * UsedTime.
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateApplicationRequest build() {
            return new CreateApplicationRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateApplicationRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationRequest</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentClass")
        private String componentClass;

        @com.aliyun.core.annotation.NameInMap("ComponentMaxReplica")
        private Long componentMaxReplica;

        @com.aliyun.core.annotation.NameInMap("ComponentReplica")
        private Long componentReplica;

        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("ScaleMax")
        private String scaleMax;

        @com.aliyun.core.annotation.NameInMap("ScaleMin")
        private String scaleMin;

        @com.aliyun.core.annotation.NameInMap("SecurityGroups")
        private String securityGroups;

        @com.aliyun.core.annotation.NameInMap("SecurityIPArrayName")
        private String securityIPArrayName;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        @com.aliyun.core.annotation.NameInMap("SecurityIPType")
        private String securityIPType;

        private Components(Builder builder) {
            this.componentClass = builder.componentClass;
            this.componentMaxReplica = builder.componentMaxReplica;
            this.componentReplica = builder.componentReplica;
            this.componentType = builder.componentType;
            this.scaleMax = builder.scaleMax;
            this.scaleMin = builder.scaleMin;
            this.securityGroups = builder.securityGroups;
            this.securityIPArrayName = builder.securityIPArrayName;
            this.securityIPList = builder.securityIPList;
            this.securityIPType = builder.securityIPType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return componentClass
         */
        public String getComponentClass() {
            return this.componentClass;
        }

        /**
         * @return componentMaxReplica
         */
        public Long getComponentMaxReplica() {
            return this.componentMaxReplica;
        }

        /**
         * @return componentReplica
         */
        public Long getComponentReplica() {
            return this.componentReplica;
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return scaleMax
         */
        public String getScaleMax() {
            return this.scaleMax;
        }

        /**
         * @return scaleMin
         */
        public String getScaleMin() {
            return this.scaleMin;
        }

        /**
         * @return securityGroups
         */
        public String getSecurityGroups() {
            return this.securityGroups;
        }

        /**
         * @return securityIPArrayName
         */
        public String getSecurityIPArrayName() {
            return this.securityIPArrayName;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        /**
         * @return securityIPType
         */
        public String getSecurityIPType() {
            return this.securityIPType;
        }

        public static final class Builder {
            private String componentClass; 
            private Long componentMaxReplica; 
            private Long componentReplica; 
            private String componentType; 
            private String scaleMax; 
            private String scaleMin; 
            private String securityGroups; 
            private String securityIPArrayName; 
            private String securityIPList; 
            private String securityIPType; 

            private Builder() {
            } 

            private Builder(Components model) {
                this.componentClass = model.componentClass;
                this.componentMaxReplica = model.componentMaxReplica;
                this.componentReplica = model.componentReplica;
                this.componentType = model.componentType;
                this.scaleMax = model.scaleMax;
                this.scaleMin = model.scaleMin;
                this.securityGroups = model.securityGroups;
                this.securityIPArrayName = model.securityIPArrayName;
                this.securityIPList = model.securityIPList;
                this.securityIPType = model.securityIPType;
            } 

            /**
             * ComponentClass.
             */
            public Builder componentClass(String componentClass) {
                this.componentClass = componentClass;
                return this;
            }

            /**
             * ComponentMaxReplica.
             */
            public Builder componentMaxReplica(Long componentMaxReplica) {
                this.componentMaxReplica = componentMaxReplica;
                return this;
            }

            /**
             * ComponentReplica.
             */
            public Builder componentReplica(Long componentReplica) {
                this.componentReplica = componentReplica;
                return this;
            }

            /**
             * ComponentType.
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * ScaleMax.
             */
            public Builder scaleMax(String scaleMax) {
                this.scaleMax = scaleMax;
                return this;
            }

            /**
             * ScaleMin.
             */
            public Builder scaleMin(String scaleMin) {
                this.scaleMin = scaleMin;
                return this;
            }

            /**
             * SecurityGroups.
             */
            public Builder securityGroups(String securityGroups) {
                this.securityGroups = securityGroups;
                return this;
            }

            /**
             * SecurityIPArrayName.
             */
            public Builder securityIPArrayName(String securityIPArrayName) {
                this.securityIPArrayName = securityIPArrayName;
                return this;
            }

            /**
             * SecurityIPList.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * SecurityIPType.
             */
            public Builder securityIPType(String securityIPType) {
                this.securityIPType = securityIPType;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateApplicationRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationRequest</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndpointType")
        private String endpointType;

        private Endpoints(Builder builder) {
            this.description = builder.description;
            this.endpointType = builder.endpointType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        public static final class Builder {
            private String description; 
            private String endpointType; 

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.description = model.description;
                this.endpointType = model.endpointType;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EndpointType.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
}
