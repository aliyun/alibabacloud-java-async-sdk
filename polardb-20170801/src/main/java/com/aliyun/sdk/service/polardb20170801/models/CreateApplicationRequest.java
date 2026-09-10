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
    @com.aliyun.core.annotation.NameInMap("AgenticDBBranchSpec")
    private AgenticDBBranchSpec agenticDBBranchSpec;

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
    @com.aliyun.core.annotation.NameInMap("DnatEntries")
    private java.util.List<DnatEntries> dnatEntries;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnatIpAddress")
    private String dnatIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private java.util.List<Endpoints> endpoints;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeApplicationSpec")
    private KnowledgeApplicationSpec knowledgeApplicationSpec;

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
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List<Parameters> parameters;

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
    @com.aliyun.core.annotation.NameInMap("SkillTemplateId")
    private String skillTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Storages")
    private java.util.List<Storages> storages;

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
    @com.aliyun.core.annotation.NameInMap("VpcNatGatewayId")
    private String vpcNatGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateApplicationRequest(Builder builder) {
        super(builder);
        this.AIDBClusterId = builder.AIDBClusterId;
        this.agenticDBBranchSpec = builder.agenticDBBranchSpec;
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
        this.dnatEntries = builder.dnatEntries;
        this.dnatIpAddress = builder.dnatIpAddress;
        this.dryRun = builder.dryRun;
        this.endpoints = builder.endpoints;
        this.knowledgeApplicationSpec = builder.knowledgeApplicationSpec;
        this.memApplicationSpec = builder.memApplicationSpec;
        this.modelApi = builder.modelApi;
        this.modelApiKey = builder.modelApiKey;
        this.modelBaseUrl = builder.modelBaseUrl;
        this.modelFrom = builder.modelFrom;
        this.modelName = builder.modelName;
        this.parameters = builder.parameters;
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
        this.skillTemplateId = builder.skillTemplateId;
        this.storages = builder.storages;
        this.tag = builder.tag;
        this.targetVersion = builder.targetVersion;
        this.usedTime = builder.usedTime;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.vpcNatGatewayId = builder.vpcNatGatewayId;
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
     * @return agenticDBBranchSpec
     */
    public AgenticDBBranchSpec getAgenticDBBranchSpec() {
        return this.agenticDBBranchSpec;
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
     * @return dnatEntries
     */
    public java.util.List<DnatEntries> getDnatEntries() {
        return this.dnatEntries;
    }

    /**
     * @return dnatIpAddress
     */
    public String getDnatIpAddress() {
        return this.dnatIpAddress;
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
     * @return knowledgeApplicationSpec
     */
    public KnowledgeApplicationSpec getKnowledgeApplicationSpec() {
        return this.knowledgeApplicationSpec;
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
     * @return parameters
     */
    public java.util.List<Parameters> getParameters() {
        return this.parameters;
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
     * @return skillTemplateId
     */
    public String getSkillTemplateId() {
        return this.skillTemplateId;
    }

    /**
     * @return storages
     */
    public java.util.List<Storages> getStorages() {
        return this.storages;
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
     * @return vpcNatGatewayId
     */
    public String getVpcNatGatewayId() {
        return this.vpcNatGatewayId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateApplicationRequest, Builder> {
        private String AIDBClusterId; 
        private AgenticDBBranchSpec agenticDBBranchSpec; 
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
        private java.util.List<DnatEntries> dnatEntries; 
        private String dnatIpAddress; 
        private Boolean dryRun; 
        private java.util.List<Endpoints> endpoints; 
        private KnowledgeApplicationSpec knowledgeApplicationSpec; 
        private MemApplicationSpec memApplicationSpec; 
        private String modelApi; 
        private String modelApiKey; 
        private String modelBaseUrl; 
        private String modelFrom; 
        private String modelName; 
        private java.util.List<Parameters> parameters; 
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
        private String skillTemplateId; 
        private java.util.List<Storages> storages; 
        private java.util.List<Tag> tag; 
        private String targetVersion; 
        private String usedTime; 
        private String vSwitchId; 
        private String vpcId; 
        private String vpcNatGatewayId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationRequest request) {
            super(request);
            this.AIDBClusterId = request.AIDBClusterId;
            this.agenticDBBranchSpec = request.agenticDBBranchSpec;
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
            this.dnatEntries = request.dnatEntries;
            this.dnatIpAddress = request.dnatIpAddress;
            this.dryRun = request.dryRun;
            this.endpoints = request.endpoints;
            this.knowledgeApplicationSpec = request.knowledgeApplicationSpec;
            this.memApplicationSpec = request.memApplicationSpec;
            this.modelApi = request.modelApi;
            this.modelApiKey = request.modelApiKey;
            this.modelBaseUrl = request.modelBaseUrl;
            this.modelFrom = request.modelFrom;
            this.modelName = request.modelName;
            this.parameters = request.parameters;
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
            this.skillTemplateId = request.skillTemplateId;
            this.storages = request.storages;
            this.tag = request.tag;
            this.targetVersion = request.targetVersion;
            this.usedTime = request.usedTime;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.vpcNatGatewayId = request.vpcNatGatewayId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The ID of an existing model operator instance to associate. This parameter takes effect only when ApplicationType is set to polarclaw.</p>
         * 
         * <strong>example:</strong>
         * <p>pm-xxxxxx</p>
         */
        public Builder AIDBClusterId(String AIDBClusterId) {
            this.putQueryParameter("AIDBClusterId", AIDBClusterId);
            this.AIDBClusterId = AIDBClusterId;
            return this;
        }

        /**
         * <p>The AgenticDB branch specification.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;DBClusterId&quot;:&quot;pagc-2zea920mcvd5o87&quot;,&quot;TenantId&quot;:&quot;t-cfc2d7df0e59439681f0087f51&quot;,&quot;ProjectId&quot;:&quot;proj-d7849d0050664c758af795d468&quot;,&quot;BranchId&quot;:&quot;br-9054b3b7649e4c0d977bd0df37&quot;,&quot;ForkFromBranch&quot;:true,&quot;ForkFromApplicationId&quot;:&quot;pa-source&quot;}</p>
         */
        public Builder agenticDBBranchSpec(AgenticDBBranchSpec agenticDBBranchSpec) {
            String agenticDBBranchSpecShrink = shrink(agenticDBBranchSpec, "AgenticDBBranchSpec", "json");
            this.putQueryParameter("AgenticDBBranchSpec", agenticDBBranchSpecShrink);
            this.agenticDBBranchSpec = agenticDBBranchSpec;
            return this;
        }

        /**
         * <p>The application type. Valid values:</p>
         * <ul>
         * <li>supabase: Set this value to create a managed Supabase application.</li>
         * <li>raycluster: Set this value to create a managed Ray Cluster application.</li>
         * <li>polarclaw: Set this value to create a managed PolarClaw application.</li>
         * </ul>
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
         * <p>The CPU architecture. Valid values:</p>
         * <ul>
         * <li>x86</li>
         * </ul>
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
         * <p>The authentication service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>feishu</p>
         */
        public Builder authProvider(String authProvider) {
            this.putQueryParameter("AuthProvider", authProvider);
            this.authProvider = authProvider;
            return this;
        }

        /**
         * <p>The authentication provider configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder authProviderConfig(String authProviderConfig) {
            this.putQueryParameter("AuthProviderConfig", authProviderConfig);
            this.authProviderConfig = authProviderConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic creation of an elastic IP address (EIP) and attach it to the instance. This is equivalent to associate with an EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-max</p>
         */
        public Builder autoAllocatePublicEip(Boolean autoAllocatePublicEip) {
            this.putQueryParameter("AutoAllocatePublicEip", autoAllocatePublicEip);
            this.autoAllocatePublicEip = autoAllocatePublicEip;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic creation of a cold storage Polarlakebase instance. Valid values:</p>
         * <ul>
         * <li>false (default): Automatic creation is disabled.</li>
         * <li>true: Automatic creation is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoCreatePolarFs(Boolean autoCreatePolarFs) {
            this.putQueryParameter("AutoCreatePolarFs", autoCreatePolarFs);
            this.autoCreatePolarFs = autoCreatePolarFs;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>Specifies whether to automatically use coupons. Valid values:</p>
         * <ul>
         * <li>true (default): Use coupons.</li>
         * <li>false: Do not use coupons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>The list of user-defined application subcomponents.</p>
         */
        public Builder components(java.util.List<Components> components) {
            String componentsShrink = shrink(components, "Components", "json");
            this.putQueryParameter("Components", componentsShrink);
            this.components = components;
            return this;
        }

        /**
         * <p>The instance ID of the PolarDB instance on which the application depends.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>myapp</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The list of expected DNAT entries for NAT mapping. Specify this parameter together with VpcNatGatewayId. This parameter can be left empty, which indicates that no DNAT entries are created.</p>
         */
        public Builder dnatEntries(java.util.List<DnatEntries> dnatEntries) {
            String dnatEntriesShrink = shrink(dnatEntries, "DnatEntries", "json");
            this.putQueryParameter("DnatEntries", dnatEntriesShrink);
            this.dnatEntries = dnatEntries;
            return this;
        }

        /**
         * <p>The DNAT-dedicated NAT IP address that has been allocated (separate from the SNAT IP address) for NAT mapping. The IP address must belong to the specified gateway and be in an available state. The vSwitch of the gateway must belong to a primary CIDR block that is reachable from the office network. Specify this parameter together with VpcNatGatewayId. Prerequisite: An SNAT entry has been bound to the vSwitch where the application resides.</p>
         * 
         * <strong>example:</strong>
         * <p>10.64.0.10</p>
         */
        public Builder dnatIpAddress(String dnatIpAddress) {
            this.putQueryParameter("DnatIpAddress", dnatIpAddress);
            this.dnatIpAddress = dnatIpAddress;
            return this;
        }

        /**
         * <p>Default value: <code>false</code>. If you set this parameter to <code>true</code>, only parameter and resource validation is performed without actually creating the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The list of user-defined service endpoints. By default, a VPC endpoint is created.</p>
         */
        public Builder endpoints(java.util.List<Endpoints> endpoints) {
            String endpointsShrink = shrink(endpoints, "Endpoints", "json");
            this.putQueryParameter("Endpoints", endpointsShrink);
            this.endpoints = endpoints;
            return this;
        }

        /**
         * <p>Required for knowledge applications.</p>
         */
        public Builder knowledgeApplicationSpec(KnowledgeApplicationSpec knowledgeApplicationSpec) {
            String knowledgeApplicationSpecShrink = shrink(knowledgeApplicationSpec, "KnowledgeApplicationSpec", "json");
            this.putQueryParameter("KnowledgeApplicationSpec", knowledgeApplicationSpecShrink);
            this.knowledgeApplicationSpec = knowledgeApplicationSpec;
            return this;
        }

        /**
         * <p>Required for mem0 applications.</p>
         */
        public Builder memApplicationSpec(MemApplicationSpec memApplicationSpec) {
            String memApplicationSpecShrink = shrink(memApplicationSpec, "MemApplicationSpec", "json");
            this.putQueryParameter("MemApplicationSpec", memApplicationSpecShrink);
            this.memApplicationSpec = memApplicationSpec;
            return this;
        }

        /**
         * <p>The model API. This parameter takes effect only when ApplicationType is set to polarclaw.</p>
         * 
         * <strong>example:</strong>
         * <p>openai-completions</p>
         */
        public Builder modelApi(String modelApi) {
            this.putQueryParameter("ModelApi", modelApi);
            this.modelApi = modelApi;
            return this;
        }

        /**
         * <p>The model API key. This parameter takes effect only when ApplicationType is set to polarclaw.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-xxxxxx</p>
         */
        public Builder modelApiKey(String modelApiKey) {
            this.putQueryParameter("ModelApiKey", modelApiKey);
            this.modelApiKey = modelApiKey;
            return this;
        }

        /**
         * <p>The model base URL. This parameter takes effect only when ApplicationType is set to polarclaw.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
         */
        public Builder modelBaseUrl(String modelBaseUrl) {
            this.putQueryParameter("ModelBaseUrl", modelBaseUrl);
            this.modelBaseUrl = modelBaseUrl;
            return this;
        }

        /**
         * <p>The model source. Valid values:</p>
         * <ul>
         * <li>bailian: Alibaba Cloud Model Studio model.</li>
         * <li>custom: Custom model.</li>
         * <li>maas: PolarDB model operator.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        public Builder modelFrom(String modelFrom) {
            this.putQueryParameter("ModelFrom", modelFrom);
            this.modelFrom = modelFrom;
            return this;
        }

        /**
         * <p>The model name. This parameter takes effect only when ApplicationType is set to polarclaw.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-max</p>
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The list of parameters.</p>
         */
        public Builder parameters(java.util.List<Parameters> parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The billing type.</p>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The subscription type (yearly or monthly).</p>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The instance ID of the Polarlakebase cold storage or high-performance edition. Default value: empty. If specified, the corresponding storage is mounted to the application.</p>
         * <p>Currently, only the following applications support this parameter:</p>
         * <ul>
         * <li>supabase</li>
         * <li>raycluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pcs-********************</p>
         */
        public Builder polarFSInstanceId(String polarFSInstanceId) {
            this.putQueryParameter("PolarFSInstanceId", polarFSInstanceId);
            this.polarFSInstanceId = polarFSInstanceId;
            return this;
        }

        /**
         * <p>The coupon code. If you do not specify this parameter, the default coupon is used.</p>
         * 
         * <strong>example:</strong>
         * <p>727xxxxxx934</p>
         */
        public Builder promotionCode(String promotionCode) {
            this.putQueryParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * <p>The region. Default value: the region of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-********************</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-********************</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The name of the IP whitelist group. Default value: <code>default</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder securityIPArrayName(String securityIPArrayName) {
            this.putQueryParameter("SecurityIPArrayName", securityIPArrayName);
            this.securityIPArrayName = securityIPArrayName;
            return this;
        }

        /**
         * <p>The IP whitelist. If you do not specify this parameter, the default value is <code>127.0.0.1</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1,172.17.0.0/24</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * <p>The type of the IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder securityIPType(String securityIPType) {
            this.putQueryParameter("SecurityIPType", securityIPType);
            this.securityIPType = securityIPType;
            return this;
        }

        /**
         * <p>The skill template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder skillTemplateId(String skillTemplateId) {
            this.putQueryParameter("SkillTemplateId", skillTemplateId);
            this.skillTemplateId = skillTemplateId;
            return this;
        }

        /**
         * <p>The list of application storages.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;StorageType&quot;:&quot;oss&quot;,&quot;StorageInstanceId&quot;:&quot;pfs-xxxx&quot;,&quot;EndpointId&quot;:&quot;pe-xxxx&quot;}]</p>
         */
        public Builder storages(java.util.List<Storages> storages) {
            String storagesShrink = shrink(storages, "Storages", "json");
            this.putQueryParameter("Storages", storagesShrink);
            this.storages = storages;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The target version.</p>
         * 
         * <strong>example:</strong>
         * <p>latest</p>
         */
        public Builder targetVersion(String targetVersion) {
            this.putQueryParameter("TargetVersion", targetVersion);
            this.targetVersion = targetVersion;
            return this;
        }

        /**
         * <p>The subscription duration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>The vSwitch. Default value: the vSwitch in the primary zone of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-*********************</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-********************</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The VPC NAT gateway ID for NAT mapping. If specified, NAT mapping is enabled when the instance is created. The NAT gateway must be in the same VPC as the application, use the private network type (intranet), and be in an active state.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-xxx</p>
         */
        public Builder vpcNatGatewayId(String vpcNatGatewayId) {
            this.putQueryParameter("VpcNatGatewayId", vpcNatGatewayId);
            this.vpcNatGatewayId = vpcNatGatewayId;
            return this;
        }

        /**
         * <p>The zone. Default value: the primary zone of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-k</p>
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
    public static class AgenticDBBranchSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BranchId")
        private String branchId;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("ForkFromApplicationId")
        private String forkFromApplicationId;

        @com.aliyun.core.annotation.NameInMap("ForkFromBranch")
        private Boolean forkFromBranch;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private AgenticDBBranchSpec(Builder builder) {
            this.branchId = builder.branchId;
            this.DBClusterId = builder.DBClusterId;
            this.forkFromApplicationId = builder.forkFromApplicationId;
            this.forkFromBranch = builder.forkFromBranch;
            this.projectId = builder.projectId;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgenticDBBranchSpec create() {
            return builder().build();
        }

        /**
         * @return branchId
         */
        public String getBranchId() {
            return this.branchId;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return forkFromApplicationId
         */
        public String getForkFromApplicationId() {
            return this.forkFromApplicationId;
        }

        /**
         * @return forkFromBranch
         */
        public Boolean getForkFromBranch() {
            return this.forkFromBranch;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String branchId; 
            private String DBClusterId; 
            private String forkFromApplicationId; 
            private Boolean forkFromBranch; 
            private String projectId; 
            private String tenantId; 

            private Builder() {
            } 

            private Builder(AgenticDBBranchSpec model) {
                this.branchId = model.branchId;
                this.DBClusterId = model.DBClusterId;
                this.forkFromApplicationId = model.forkFromApplicationId;
                this.forkFromBranch = model.forkFromBranch;
                this.projectId = model.projectId;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>The AgenticDB branch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>br-9054b3b7649e4c0d977bd0df37</p>
             */
            public Builder branchId(String branchId) {
                this.branchId = branchId;
                return this;
            }

            /**
             * <p>The AgenticDB cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pagc-2zea920mcvd5o87</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The ID of the source application.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-source</p>
             */
            public Builder forkFromApplicationId(String forkFromApplicationId) {
                this.forkFromApplicationId = forkFromApplicationId;
                return this;
            }

            /**
             * <p>Specifies whether to create the application based on a specified AgenticDB branch.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder forkFromBranch(Boolean forkFromBranch) {
                this.forkFromBranch = forkFromBranch;
                return this;
            }

            /**
             * <p>The AgenticDB project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>proj-d7849d0050664c758af795d468</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The AgenticDB tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t-cfc2d7df0e59439681f0087f51</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public AgenticDBBranchSpec build() {
                return new AgenticDBBranchSpec(this);
            } 

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
             * <p>The specification of the application subcomponent.</p>
             * 
             * <strong>example:</strong>
             * <p>polar.app.g2.medium</p>
             */
            public Builder componentClass(String componentClass) {
                this.componentClass = componentClass;
                return this;
            }

            /**
             * <p>The maximum number of replicas for the application subcomponent with the same specification. Default value: the value of ComponentReplica.</p>
             * <ul>
             * <li>Only raycluster supports this parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder componentMaxReplica(Long componentMaxReplica) {
                this.componentMaxReplica = componentMaxReplica;
                return this;
            }

            /**
             * <p>The number of replicas for the application subcomponent. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder componentReplica(Long componentReplica) {
                this.componentReplica = componentReplica;
                return this;
            }

            /**
             * <p>The type of the application subcomponent.</p>
             * <p>For supabase, valid values:</p>
             * <ul>
             * <li>gateway</li>
             * <li>backend</li>
             * </ul>
             * <p>For raycluster, valid values:</p>
             * <ul>
             * <li>head</li>
             * <li>worker</li>
             * <li>gpuworker</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>gateway</p>
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * <p>The maximum number of replicas for component scaling.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder scaleMax(String scaleMax) {
                this.scaleMax = scaleMax;
                return this;
            }

            /**
             * <p>The minimum number of replicas for component scaling.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scaleMin(String scaleMin) {
                this.scaleMin = scaleMin;
                return this;
            }

            /**
             * <p>The list of security groups for the application subcomponent, separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>sg-********************</p>
             */
            public Builder securityGroups(String securityGroups) {
                this.securityGroups = securityGroups;
                return this;
            }

            /**
             * <p>The name of the whitelist IP address group for the application subcomponent. Default value: default.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder securityIPArrayName(String securityIPArrayName) {
                this.securityIPArrayName = securityIPArrayName;
                return this;
            }

            /**
             * <p>The whitelist IP addresses of the application subcomponent, separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * <p>The type of the whitelist IP addresses for the application subcomponent. Default value: ipv4.</p>
             * 
             * <strong>example:</strong>
             * <p>ipv4</p>
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
    public static class DnatEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FrontPort")
        private Integer frontPort;

        @com.aliyun.core.annotation.NameInMap("PortName")
        private String portName;

        private DnatEntries(Builder builder) {
            this.frontPort = builder.frontPort;
            this.portName = builder.portName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnatEntries create() {
            return builder().build();
        }

        /**
         * @return frontPort
         */
        public Integer getFrontPort() {
            return this.frontPort;
        }

        /**
         * @return portName
         */
        public String getPortName() {
            return this.portName;
        }

        public static final class Builder {
            private Integer frontPort; 
            private String portName; 

            private Builder() {
            } 

            private Builder(DnatEntries model) {
                this.frontPort = model.frontPort;
                this.portName = model.portName;
            } 

            /**
             * <p>The frontend port. This parameter is optional. If not specified, the system automatically assigns a port that does not conflict with ports already in use on the gateway. You can query the assignment result by calling the DescribeApplicationAttribute operation.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder frontPort(Integer frontPort) {
                this.frontPort = frontPort;
                return this;
            }

            /**
             * <p>The port name. Valid values: webui, hermesagent, dashboard, and ssh.</p>
             * 
             * <strong>example:</strong>
             * <p>webui</p>
             */
            public Builder portName(String portName) {
                this.portName = portName;
                return this;
            }

            public DnatEntries build() {
                return new DnatEntries(this);
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
             * <p>The description of the service endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>my_endpoint</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The type of the service endpoint. The value is fixed as Primary.</p>
             * 
             * <strong>example:</strong>
             * <p>Primary</p>
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
    public static class KnowledgeApplicationSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DashboardPassword")
        private String dashboardPassword;

        @com.aliyun.core.annotation.NameInMap("DbPassword")
        private String dbPassword;

        @com.aliyun.core.annotation.NameInMap("LlmModel")
        private String llmModel;

        private KnowledgeApplicationSpec(Builder builder) {
            this.dashboardPassword = builder.dashboardPassword;
            this.dbPassword = builder.dbPassword;
            this.llmModel = builder.llmModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeApplicationSpec create() {
            return builder().build();
        }

        /**
         * @return dashboardPassword
         */
        public String getDashboardPassword() {
            return this.dashboardPassword;
        }

        /**
         * @return dbPassword
         */
        public String getDbPassword() {
            return this.dbPassword;
        }

        /**
         * @return llmModel
         */
        public String getLlmModel() {
            return this.llmModel;
        }

        public static final class Builder {
            private String dashboardPassword; 
            private String dbPassword; 
            private String llmModel; 

            private Builder() {
            } 

            private Builder(KnowledgeApplicationSpec model) {
                this.dashboardPassword = model.dashboardPassword;
                this.dbPassword = model.dbPassword;
                this.llmModel = model.llmModel;
            } 

            /**
             * <p>The dashboard password.</p>
             */
            public Builder dashboardPassword(String dashboardPassword) {
                this.dashboardPassword = dashboardPassword;
                return this;
            }

            /**
             * <p>The password.</p>
             */
            public Builder dbPassword(String dbPassword) {
                this.dbPassword = dbPassword;
                return this;
            }

            /**
             * <p>Required for knowledge applications. The LLM model name, such as qwen3-max.</p>
             */
            public Builder llmModel(String llmModel) {
                this.llmModel = llmModel;
                return this;
            }

            public KnowledgeApplicationSpec build() {
                return new KnowledgeApplicationSpec(this);
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
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-database-name</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The password.</p>
             * 
             * <strong>example:</strong>
             * <p>test-user-password</p>
             */
            public Builder dbPassword(String dbPassword) {
                this.dbPassword = dbPassword;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>test-user</p>
             */
            public Builder dbUser(String dbUser) {
                this.dbUser = dbUser;
                return this;
            }

            /**
             * <p>Required for mem0 applications. The embedder model name, such as text-embedding-v4.</p>
             * 
             * <strong>example:</strong>
             * <p>text-embedding-v4</p>
             */
            public Builder embedderModel(String embedderModel) {
                this.embedderModel = embedderModel;
                return this;
            }

            /**
             * <p>The vector dimensions.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder embedderModelDimension(Integer embedderModelDimension) {
                this.embedderModelDimension = embedderModelDimension;
                return this;
            }

            /**
             * <p>The graph LLM model.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder graphLlmModel(String graphLlmModel) {
                this.graphLlmModel = graphLlmModel;
                return this;
            }

            /**
             * <p>Required for mem0 applications. The LLM model name, such as qwen3-max.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3-max</p>
             */
            public Builder llmModel(String llmModel) {
                this.llmModel = llmModel;
                return this;
            }

            /**
             * <p>The project name, which corresponds to the database schema that stores project data.</p>
             * 
             * <strong>example:</strong>
             * <p>test-project-name</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>Required for mem0 applications. The reranker model name, such as qwen3-rerank.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3-rerank</p>
             */
            public Builder rerankerModel(String rerankerModel) {
                this.rerankerModel = rerankerModel;
                return this;
            }

            /**
             * <p>The number of table shards.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private Parameters(Builder builder) {
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterName; 
            private String parameterValue; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.parameterName = model.parameterName;
                this.parameterValue = model.parameterValue;
            } 

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>secret.gateway.auth.token</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>TK***</p>
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateApplicationRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationRequest</p>
     */
    public static class Storages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerMountPath")
        private String containerMountPath;

        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("StorageCapacity")
        private String storageCapacity;

        @com.aliyun.core.annotation.NameInMap("StorageEndpoint")
        private String storageEndpoint;

        @com.aliyun.core.annotation.NameInMap("StorageInstanceId")
        private String storageInstanceId;

        @com.aliyun.core.annotation.NameInMap("StoragePerformanceLevel")
        private String storagePerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private Storages(Builder builder) {
            this.containerMountPath = builder.containerMountPath;
            this.endpointId = builder.endpointId;
            this.mountPath = builder.mountPath;
            this.storageCapacity = builder.storageCapacity;
            this.storageEndpoint = builder.storageEndpoint;
            this.storageInstanceId = builder.storageInstanceId;
            this.storagePerformanceLevel = builder.storagePerformanceLevel;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Storages create() {
            return builder().build();
        }

        /**
         * @return containerMountPath
         */
        public String getContainerMountPath() {
            return this.containerMountPath;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return storageCapacity
         */
        public String getStorageCapacity() {
            return this.storageCapacity;
        }

        /**
         * @return storageEndpoint
         */
        public String getStorageEndpoint() {
            return this.storageEndpoint;
        }

        /**
         * @return storageInstanceId
         */
        public String getStorageInstanceId() {
            return this.storageInstanceId;
        }

        /**
         * @return storagePerformanceLevel
         */
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String containerMountPath; 
            private String endpointId; 
            private String mountPath; 
            private String storageCapacity; 
            private String storageEndpoint; 
            private String storageInstanceId; 
            private String storagePerformanceLevel; 
            private String storageType; 

            private Builder() {
            } 

            private Builder(Storages model) {
                this.containerMountPath = model.containerMountPath;
                this.endpointId = model.endpointId;
                this.mountPath = model.mountPath;
                this.storageCapacity = model.storageCapacity;
                this.storageEndpoint = model.storageEndpoint;
                this.storageInstanceId = model.storageInstanceId;
                this.storagePerformanceLevel = model.storagePerformanceLevel;
                this.storageType = model.storageType;
            } 

            /**
             * <p>The mount path inside the container.</p>
             * 
             * <strong>example:</strong>
             * <p>/data/container</p>
             */
            public Builder containerMountPath(String containerMountPath) {
                this.containerMountPath = containerMountPath;
                return this;
            }

            /**
             * <p>The storage endpoint ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pe-xxxx</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * <p>The storage mount path.</p>
             * 
             * <strong>example:</strong>
             * <p>/data/source</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The storage capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder storageCapacity(String storageCapacity) {
                this.storageCapacity = storageCapacity;
                return this;
            }

            /**
             * <p>The storage access endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>polarfs.example.com</p>
             */
            public Builder storageEndpoint(String storageEndpoint) {
                this.storageEndpoint = storageEndpoint;
                return this;
            }

            /**
             * <p>The storage instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pfs-xxxx</p>
             */
            public Builder storageInstanceId(String storageInstanceId) {
                this.storageInstanceId = storageInstanceId;
                return this;
            }

            /**
             * <p>The storage performance level.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder storagePerformanceLevel(String storagePerformanceLevel) {
                this.storagePerformanceLevel = storagePerformanceLevel;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public Storages build() {
                return new Storages(this);
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
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
