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
    @com.aliyun.core.annotation.NameInMap("AIDBClusterId")
    private String AIDBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Architecture")
    @com.aliyun.core.annotation.Validation(required = true)
    private String architecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthProvider")
    private String authProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthProviderConfig")
    private String authProviderConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoAllocatePublicEip")
    private Boolean autoAllocatePublicEip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoCreatePolarFs")
    private Boolean autoCreatePolarFs;

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
    @com.aliyun.core.annotation.NameInMap("MemApplicationSpec")
    private MemApplicationSpec memApplicationSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelApi")
    private String modelApi;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelApiKey")
    private String modelApiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelBaseUrl")
    private String modelBaseUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelFrom")
    private String modelFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

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
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPArrayName")
    private String securityIPArrayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    private String securityIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPType")
    private String securityIPType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetVersion")
    private String targetVersion;

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
        this.AIDBClusterId = builder.AIDBClusterId;
        this.applicationType = builder.applicationType;
        this.architecture = builder.architecture;
        this.authProvider = builder.authProvider;
        this.authProviderConfig = builder.authProviderConfig;
        this.autoAllocatePublicEip = builder.autoAllocatePublicEip;
        this.autoCreatePolarFs = builder.autoCreatePolarFs;
        this.autoRenew = builder.autoRenew;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.components = builder.components;
        this.DBClusterId = builder.DBClusterId;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.endpoints = builder.endpoints;
        this.memApplicationSpec = builder.memApplicationSpec;
        this.modelApi = builder.modelApi;
        this.modelApiKey = builder.modelApiKey;
        this.modelBaseUrl = builder.modelBaseUrl;
        this.modelFrom = builder.modelFrom;
        this.modelName = builder.modelName;
        this.payType = builder.payType;
        this.period = builder.period;
        this.polarFSInstanceId = builder.polarFSInstanceId;
        this.promotionCode = builder.promotionCode;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupId = builder.securityGroupId;
        this.securityIPArrayName = builder.securityIPArrayName;
        this.securityIPList = builder.securityIPList;
        this.securityIPType = builder.securityIPType;
        this.tag = builder.tag;
        this.targetVersion = builder.targetVersion;
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
     * @return AIDBClusterId
     */
    public String getAIDBClusterId() {
        return this.AIDBClusterId;
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
     * @return authProvider
     */
    public String getAuthProvider() {
        return this.authProvider;
    }

    /**
     * @return authProviderConfig
     */
    public String getAuthProviderConfig() {
        return this.authProviderConfig;
    }

    /**
     * @return autoAllocatePublicEip
     */
    public Boolean getAutoAllocatePublicEip() {
        return this.autoAllocatePublicEip;
    }

    /**
     * @return autoCreatePolarFs
     */
    public Boolean getAutoCreatePolarFs() {
        return this.autoCreatePolarFs;
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
     * @return memApplicationSpec
     */
    public MemApplicationSpec getMemApplicationSpec() {
        return this.memApplicationSpec;
    }

    /**
     * @return modelApi
     */
    public String getModelApi() {
        return this.modelApi;
    }

    /**
     * @return modelApiKey
     */
    public String getModelApiKey() {
        return this.modelApiKey;
    }

    /**
     * @return modelBaseUrl
     */
    public String getModelBaseUrl() {
        return this.modelBaseUrl;
    }

    /**
     * @return modelFrom
     */
    public String getModelFrom() {
        return this.modelFrom;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
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
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
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

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return targetVersion
     */
    public String getTargetVersion() {
        return this.targetVersion;
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
        private String AIDBClusterId; 
        private String applicationType; 
        private String architecture; 
        private String authProvider; 
        private String authProviderConfig; 
        private Boolean autoAllocatePublicEip; 
        private Boolean autoCreatePolarFs; 
        private Boolean autoRenew; 
        private Boolean autoUseCoupon; 
        private java.util.List<Components> components; 
        private String DBClusterId; 
        private String description; 
        private Boolean dryRun; 
        private java.util.List<Endpoints> endpoints; 
        private MemApplicationSpec memApplicationSpec; 
        private String modelApi; 
        private String modelApiKey; 
        private String modelBaseUrl; 
        private String modelFrom; 
        private String modelName; 
        private String payType; 
        private String period; 
        private String polarFSInstanceId; 
        private String promotionCode; 
        private String regionId; 
        private String resourceGroupId; 
        private String securityGroupId; 
        private String securityIPArrayName; 
        private String securityIPList; 
        private String securityIPType; 
        private java.util.List<Tag> tag; 
        private String targetVersion; 
        private String usedTime; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationRequest request) {
            super(request);
            this.AIDBClusterId = request.AIDBClusterId;
            this.applicationType = request.applicationType;
            this.architecture = request.architecture;
            this.authProvider = request.authProvider;
            this.authProviderConfig = request.authProviderConfig;
            this.autoAllocatePublicEip = request.autoAllocatePublicEip;
            this.autoCreatePolarFs = request.autoCreatePolarFs;
            this.autoRenew = request.autoRenew;
            this.autoUseCoupon = request.autoUseCoupon;
            this.components = request.components;
            this.DBClusterId = request.DBClusterId;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.endpoints = request.endpoints;
            this.memApplicationSpec = request.memApplicationSpec;
            this.modelApi = request.modelApi;
            this.modelApiKey = request.modelApiKey;
            this.modelBaseUrl = request.modelBaseUrl;
            this.modelFrom = request.modelFrom;
            this.modelName = request.modelName;
            this.payType = request.payType;
            this.period = request.period;
            this.polarFSInstanceId = request.polarFSInstanceId;
            this.promotionCode = request.promotionCode;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.securityGroupId = request.securityGroupId;
            this.securityIPArrayName = request.securityIPArrayName;
            this.securityIPList = request.securityIPList;
            this.securityIPType = request.securityIPType;
            this.tag = request.tag;
            this.targetVersion = request.targetVersion;
            this.usedTime = request.usedTime;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * AIDBClusterId.
         */
        public Builder AIDBClusterId(String AIDBClusterId) {
            this.putQueryParameter("AIDBClusterId", AIDBClusterId);
            this.AIDBClusterId = AIDBClusterId;
            return this;
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
         * AuthProvider.
         */
        public Builder authProvider(String authProvider) {
            this.putQueryParameter("AuthProvider", authProvider);
            this.authProvider = authProvider;
            return this;
        }

        /**
         * AuthProviderConfig.
         */
        public Builder authProviderConfig(String authProviderConfig) {
            this.putQueryParameter("AuthProviderConfig", authProviderConfig);
            this.authProviderConfig = authProviderConfig;
            return this;
        }

        /**
         * AutoAllocatePublicEip.
         */
        public Builder autoAllocatePublicEip(Boolean autoAllocatePublicEip) {
            this.putQueryParameter("AutoAllocatePublicEip", autoAllocatePublicEip);
            this.autoAllocatePublicEip = autoAllocatePublicEip;
            return this;
        }

        /**
         * AutoCreatePolarFs.
         */
        public Builder autoCreatePolarFs(Boolean autoCreatePolarFs) {
            this.putQueryParameter("AutoCreatePolarFs", autoCreatePolarFs);
            this.autoCreatePolarFs = autoCreatePolarFs;
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
         * MemApplicationSpec.
         */
        public Builder memApplicationSpec(MemApplicationSpec memApplicationSpec) {
            String memApplicationSpecShrink = shrink(memApplicationSpec, "MemApplicationSpec", "json");
            this.putQueryParameter("MemApplicationSpec", memApplicationSpecShrink);
            this.memApplicationSpec = memApplicationSpec;
            return this;
        }

        /**
         * ModelApi.
         */
        public Builder modelApi(String modelApi) {
            this.putQueryParameter("ModelApi", modelApi);
            this.modelApi = modelApi;
            return this;
        }

        /**
         * ModelApiKey.
         */
        public Builder modelApiKey(String modelApiKey) {
            this.putQueryParameter("ModelApiKey", modelApiKey);
            this.modelApiKey = modelApiKey;
            return this;
        }

        /**
         * ModelBaseUrl.
         */
        public Builder modelBaseUrl(String modelBaseUrl) {
            this.putQueryParameter("ModelBaseUrl", modelBaseUrl);
            this.modelBaseUrl = modelBaseUrl;
            return this;
        }

        /**
         * ModelFrom.
         */
        public Builder modelFrom(String modelFrom) {
            this.putQueryParameter("ModelFrom", modelFrom);
            this.modelFrom = modelFrom;
            return this;
        }

        /**
         * ModelName.
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
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
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * SecurityIPArrayName.
         */
        public Builder securityIPArrayName(String securityIPArrayName) {
            this.putQueryParameter("SecurityIPArrayName", securityIPArrayName);
            this.securityIPArrayName = securityIPArrayName;
            return this;
        }

        /**
         * SecurityIPList.
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * SecurityIPType.
         */
        public Builder securityIPType(String securityIPType) {
            this.putQueryParameter("SecurityIPType", securityIPType);
            this.securityIPType = securityIPType;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TargetVersion.
         */
        public Builder targetVersion(String targetVersion) {
            this.putQueryParameter("TargetVersion", targetVersion);
            this.targetVersion = targetVersion;
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
    /**
     * 
     * {@link CreateApplicationRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationRequest</p>
     */
    public static class MemApplicationSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DbPassword")
        private String dbPassword;

        @com.aliyun.core.annotation.NameInMap("DbUser")
        private String dbUser;

        @com.aliyun.core.annotation.NameInMap("EmbedderModel")
        private String embedderModel;

        @com.aliyun.core.annotation.NameInMap("EmbedderModelDimension")
        private Integer embedderModelDimension;

        @com.aliyun.core.annotation.NameInMap("GraphLlmModel")
        private String graphLlmModel;

        @com.aliyun.core.annotation.NameInMap("LlmModel")
        private String llmModel;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("RerankerModel")
        private String rerankerModel;

        @com.aliyun.core.annotation.NameInMap("Shard")
        private Integer shard;

        private MemApplicationSpec(Builder builder) {
            this.dbName = builder.dbName;
            this.dbPassword = builder.dbPassword;
            this.dbUser = builder.dbUser;
            this.embedderModel = builder.embedderModel;
            this.embedderModelDimension = builder.embedderModelDimension;
            this.graphLlmModel = builder.graphLlmModel;
            this.llmModel = builder.llmModel;
            this.projectName = builder.projectName;
            this.rerankerModel = builder.rerankerModel;
            this.shard = builder.shard;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemApplicationSpec create() {
            return builder().build();
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return dbPassword
         */
        public String getDbPassword() {
            return this.dbPassword;
        }

        /**
         * @return dbUser
         */
        public String getDbUser() {
            return this.dbUser;
        }

        /**
         * @return embedderModel
         */
        public String getEmbedderModel() {
            return this.embedderModel;
        }

        /**
         * @return embedderModelDimension
         */
        public Integer getEmbedderModelDimension() {
            return this.embedderModelDimension;
        }

        /**
         * @return graphLlmModel
         */
        public String getGraphLlmModel() {
            return this.graphLlmModel;
        }

        /**
         * @return llmModel
         */
        public String getLlmModel() {
            return this.llmModel;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return rerankerModel
         */
        public String getRerankerModel() {
            return this.rerankerModel;
        }

        /**
         * @return shard
         */
        public Integer getShard() {
            return this.shard;
        }

        public static final class Builder {
            private String dbName; 
            private String dbPassword; 
            private String dbUser; 
            private String embedderModel; 
            private Integer embedderModelDimension; 
            private String graphLlmModel; 
            private String llmModel; 
            private String projectName; 
            private String rerankerModel; 
            private Integer shard; 

            private Builder() {
            } 

            private Builder(MemApplicationSpec model) {
                this.dbName = model.dbName;
                this.dbPassword = model.dbPassword;
                this.dbUser = model.dbUser;
                this.embedderModel = model.embedderModel;
                this.embedderModelDimension = model.embedderModelDimension;
                this.graphLlmModel = model.graphLlmModel;
                this.llmModel = model.llmModel;
                this.projectName = model.projectName;
                this.rerankerModel = model.rerankerModel;
                this.shard = model.shard;
            } 

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * DbPassword.
             */
            public Builder dbPassword(String dbPassword) {
                this.dbPassword = dbPassword;
                return this;
            }

            /**
             * DbUser.
             */
            public Builder dbUser(String dbUser) {
                this.dbUser = dbUser;
                return this;
            }

            /**
             * EmbedderModel.
             */
            public Builder embedderModel(String embedderModel) {
                this.embedderModel = embedderModel;
                return this;
            }

            /**
             * EmbedderModelDimension.
             */
            public Builder embedderModelDimension(Integer embedderModelDimension) {
                this.embedderModelDimension = embedderModelDimension;
                return this;
            }

            /**
             * GraphLlmModel.
             */
            public Builder graphLlmModel(String graphLlmModel) {
                this.graphLlmModel = graphLlmModel;
                return this;
            }

            /**
             * LlmModel.
             */
            public Builder llmModel(String llmModel) {
                this.llmModel = llmModel;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * RerankerModel.
             */
            public Builder rerankerModel(String rerankerModel) {
                this.rerankerModel = rerankerModel;
                return this;
            }

            /**
             * Shard.
             */
            public Builder shard(Integer shard) {
                this.shard = shard;
                return this;
            }

            public MemApplicationSpec build() {
                return new MemApplicationSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateApplicationRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder(Tag model) {
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

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
