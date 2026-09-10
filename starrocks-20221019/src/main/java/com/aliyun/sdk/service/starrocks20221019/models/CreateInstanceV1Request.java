// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link CreateInstanceV1Request} extends {@link RequestModel}
 *
 * <p>CreateInstanceV1Request</p>
 */
public class CreateInstanceV1Request extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdminPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String adminPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentNodeGroup")
    private AgentNodeGroup agentNodeGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BackendNodeGroups")
    private java.util.List<BackendNodeGroups> backendNodeGroups;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DlfCatalogName")
    private String dlfCatalogName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DlfCatalogType")
    private String dlfCatalogType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableAiFunction")
    private Boolean enableAiFunction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableMultiAz")
    private Boolean enableMultiAz;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Encrypted")
    private Boolean encrypted;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FrontendNodeGroups")
    private java.util.List<FrontendNodeGroups> frontendNodeGroups;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KmsKeyId")
    private String kmsKeyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LinkedRamUserName")
    private String linkedRamUserName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObserverNodeGroups")
    private java.util.List<ObserverNodeGroups> observerNodeGroups;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssAccessingRoleName")
    private String ossAccessingRoleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PackageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String packageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrincipalType")
    private String principalType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PromotionOptionNo")
    private String promotionOptionNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RamUserId")
    private String ramUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RunMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VSwitches")
    private java.util.List<VSwitches> vSwitches;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateInstanceV1Request(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.adminPassword = builder.adminPassword;
        this.agentNodeGroup = builder.agentNodeGroup;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.backendNodeGroups = builder.backendNodeGroups;
        this.clientToken = builder.clientToken;
        this.dlfCatalogName = builder.dlfCatalogName;
        this.dlfCatalogType = builder.dlfCatalogType;
        this.duration = builder.duration;
        this.enableAiFunction = builder.enableAiFunction;
        this.enableMultiAz = builder.enableMultiAz;
        this.encrypted = builder.encrypted;
        this.frontendNodeGroups = builder.frontendNodeGroups;
        this.gatewayType = builder.gatewayType;
        this.instanceName = builder.instanceName;
        this.kmsKeyId = builder.kmsKeyId;
        this.linkedRamUserName = builder.linkedRamUserName;
        this.observerNodeGroups = builder.observerNodeGroups;
        this.ossAccessingRoleName = builder.ossAccessingRoleName;
        this.packageType = builder.packageType;
        this.payType = builder.payType;
        this.pricingCycle = builder.pricingCycle;
        this.principalType = builder.principalType;
        this.promotionOptionNo = builder.promotionOptionNo;
        this.ramUserId = builder.ramUserId;
        this.resourceGroupId = builder.resourceGroupId;
        this.runMode = builder.runMode;
        this.tags = builder.tags;
        this.vSwitches = builder.vSwitches;
        this.version = builder.version;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceV1Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return adminPassword
     */
    public String getAdminPassword() {
        return this.adminPassword;
    }

    /**
     * @return agentNodeGroup
     */
    public AgentNodeGroup getAgentNodeGroup() {
        return this.agentNodeGroup;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return backendNodeGroups
     */
    public java.util.List<BackendNodeGroups> getBackendNodeGroups() {
        return this.backendNodeGroups;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dlfCatalogName
     */
    public String getDlfCatalogName() {
        return this.dlfCatalogName;
    }

    /**
     * @return dlfCatalogType
     */
    public String getDlfCatalogType() {
        return this.dlfCatalogType;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return enableAiFunction
     */
    public Boolean getEnableAiFunction() {
        return this.enableAiFunction;
    }

    /**
     * @return enableMultiAz
     */
    public Boolean getEnableMultiAz() {
        return this.enableMultiAz;
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return frontendNodeGroups
     */
    public java.util.List<FrontendNodeGroups> getFrontendNodeGroups() {
        return this.frontendNodeGroups;
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * @return linkedRamUserName
     */
    public String getLinkedRamUserName() {
        return this.linkedRamUserName;
    }

    /**
     * @return observerNodeGroups
     */
    public java.util.List<ObserverNodeGroups> getObserverNodeGroups() {
        return this.observerNodeGroups;
    }

    /**
     * @return ossAccessingRoleName
     */
    public String getOssAccessingRoleName() {
        return this.ossAccessingRoleName;
    }

    /**
     * @return packageType
     */
    public String getPackageType() {
        return this.packageType;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return principalType
     */
    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * @return promotionOptionNo
     */
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    /**
     * @return ramUserId
     */
    public String getRamUserId() {
        return this.ramUserId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return runMode
     */
    public String getRunMode() {
        return this.runMode;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return vSwitches
     */
    public java.util.List<VSwitches> getVSwitches() {
        return this.vSwitches;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
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

    public static final class Builder extends Request.Builder<CreateInstanceV1Request, Builder> {
        private String regionId; 
        private String adminPassword; 
        private AgentNodeGroup agentNodeGroup; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private java.util.List<BackendNodeGroups> backendNodeGroups; 
        private String clientToken; 
        private String dlfCatalogName; 
        private String dlfCatalogType; 
        private Integer duration; 
        private Boolean enableAiFunction; 
        private Boolean enableMultiAz; 
        private Boolean encrypted; 
        private java.util.List<FrontendNodeGroups> frontendNodeGroups; 
        private String gatewayType; 
        private String instanceName; 
        private String kmsKeyId; 
        private String linkedRamUserName; 
        private java.util.List<ObserverNodeGroups> observerNodeGroups; 
        private String ossAccessingRoleName; 
        private String packageType; 
        private String payType; 
        private String pricingCycle; 
        private String principalType; 
        private String promotionOptionNo; 
        private String ramUserId; 
        private String resourceGroupId; 
        private String runMode; 
        private java.util.List<Tags> tags; 
        private java.util.List<VSwitches> vSwitches; 
        private String version; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceV1Request request) {
            super(request);
            this.regionId = request.regionId;
            this.adminPassword = request.adminPassword;
            this.agentNodeGroup = request.agentNodeGroup;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.backendNodeGroups = request.backendNodeGroups;
            this.clientToken = request.clientToken;
            this.dlfCatalogName = request.dlfCatalogName;
            this.dlfCatalogType = request.dlfCatalogType;
            this.duration = request.duration;
            this.enableAiFunction = request.enableAiFunction;
            this.enableMultiAz = request.enableMultiAz;
            this.encrypted = request.encrypted;
            this.frontendNodeGroups = request.frontendNodeGroups;
            this.gatewayType = request.gatewayType;
            this.instanceName = request.instanceName;
            this.kmsKeyId = request.kmsKeyId;
            this.linkedRamUserName = request.linkedRamUserName;
            this.observerNodeGroups = request.observerNodeGroups;
            this.ossAccessingRoleName = request.ossAccessingRoleName;
            this.packageType = request.packageType;
            this.payType = request.payType;
            this.pricingCycle = request.pricingCycle;
            this.principalType = request.principalType;
            this.promotionOptionNo = request.promotionOptionNo;
            this.ramUserId = request.ramUserId;
            this.resourceGroupId = request.resourceGroupId;
            this.runMode = request.runMode;
            this.tags = request.tags;
            this.vSwitches = request.vSwitches;
            this.version = request.version;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The administrator password of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>password_example</p>
         */
        public Builder adminPassword(String adminPassword) {
            this.putBodyParameter("AdminPassword", adminPassword);
            this.adminPassword = adminPassword;
            return this;
        }

        /**
         * <p>The agent compute group.</p>
         */
        public Builder agentNodeGroup(AgentNodeGroup agentNodeGroup) {
            this.putBodyParameter("AgentNodeGroup", agentNodeGroup);
            this.agentNodeGroup = agentNodeGroup;
            return this;
        }

        /**
         * <p>Specifies whether to automatically purchase (pay for) all products specified in the Products parameter.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Automatic payment.</li>
         * <li>false: No automatic payment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putBodyParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when payType is set to PrePaid. Auto-renewal is disabled by default.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The BE or CN node group information.</p>
         */
        public Builder backendNodeGroups(java.util.List<BackendNodeGroups> backendNodeGroups) {
            this.putBodyParameter("BackendNodeGroups", backendNodeGroups);
            this.backendNodeGroups = backendNodeGroups;
            return this;
        }

        /**
         * <p>Ensures the idempotence of the request. Generate a unique parameter value from your client. The ClientToken value supports only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The name of the DLF Catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>paimon_test</p>
         */
        public Builder dlfCatalogName(String dlfCatalogName) {
            this.putBodyParameter("DlfCatalogName", dlfCatalogName);
            this.dlfCatalogName = dlfCatalogName;
            return this;
        }

        /**
         * <p>The type of the DLF Catalog. Valid values: paimon and iceberg.</p>
         * 
         * <strong>example:</strong>
         * <p>paimon</p>
         */
        public Builder dlfCatalogType(String dlfCatalogType) {
            this.putBodyParameter("DlfCatalogType", dlfCatalogType);
            this.dlfCatalogType = dlfCatalogType;
            return this;
        }

        /**
         * <p>The subscription duration. This parameter takes effect only when payType is set to PrePaid.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder duration(Integer duration) {
            this.putBodyParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>Specifies whether to enable the AI Center. Default value: false.</p>
         */
        public Builder enableAiFunction(Boolean enableAiFunction) {
            this.putBodyParameter("EnableAiFunction", enableAiFunction);
            this.enableAiFunction = enableAiFunction;
            return this;
        }

        /**
         * <p>Specifies whether to enable disaster recovery.</p>
         */
        public Builder enableMultiAz(Boolean enableMultiAz) {
            this.putBodyParameter("EnableMultiAz", enableMultiAz);
            this.enableMultiAz = enableMultiAz;
            return this;
        }

        /**
         * <p>Specifies whether to enable encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder encrypted(Boolean encrypted) {
            this.putBodyParameter("Encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * <p>The FE node group information.</p>
         */
        public Builder frontendNodeGroups(java.util.List<FrontendNodeGroups> frontendNodeGroups) {
            this.putBodyParameter("FrontendNodeGroups", frontendNodeGroups);
            this.frontendNodeGroups = frontendNodeGroups;
            return this;
        }

        /**
         * <p>The gateway type. Valid values: Slb and Privatezone.</p>
         * 
         * <strong>example:</strong>
         * <p>Traditional\&quot;\&quot;</p>
         */
        public Builder gatewayType(String gatewayType) {
            this.putBodyParameter("GatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c1</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The KMS key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fdsdf****</p>
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.putBodyParameter("KmsKeyId", kmsKeyId);
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * <p>The username of the associated Resource Access Management (RAM) user or the name of the associated RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.test1</p>
         */
        public Builder linkedRamUserName(String linkedRamUserName) {
            this.putBodyParameter("LinkedRamUserName", linkedRamUserName);
            this.linkedRamUserName = linkedRamUserName;
            return this;
        }

        /**
         * <p>The Observer node group information. Specify this parameter only when you need to enable multi-zone disaster recovery. The Observer node group specifications must be the same as those of the FE node group.</p>
         */
        public Builder observerNodeGroups(java.util.List<ObserverNodeGroups> observerNodeGroups) {
            this.putBodyParameter("ObserverNodeGroups", observerNodeGroups);
            this.observerNodeGroups = observerNodeGroups;
            return this;
        }

        /**
         * <p>The name of the role used for password-free access to OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunEMRStarRocksAccessingOSSRole</p>
         */
        public Builder ossAccessingRoleName(String ossAccessingRoleName) {
            this.putBodyParameter("OssAccessingRoleName", ossAccessingRoleName);
            this.ossAccessingRoleName = ossAccessingRoleName;
            return this;
        }

        /**
         * <p>The instance edition:</p>
         * <ul>
         * <li>  Entry edition (trial).</li>
         * <li> Standard edition (official).</li>
         * </ul>
         * 
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>official</p>
         */
        public Builder packageType(String packageType) {
            this.putBodyParameter("PackageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ol>
         * <li>prePaid: subscription.</li>
         * <li>postPaid: pay-as-you-go.</li>
         * </ol>
         * 
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prePaid</p>
         */
        public Builder payType(String payType) {
            this.putBodyParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The unit of the subscription duration. Valid values:</p>
         * <ul>
         * <li>Month</li>
         * <li>Year</li>
         * </ul>
         * This parameter takes effect only when payType is set to PrePaid.
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putBodyParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>The RAM authentication type. Valid values:</p>
         * <ul>
         * <li>RS: Resource Access Management (RAM) user.</li>
         * <li>RR: RAM role.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RR</p>
         */
        public Builder principalType(String principalType) {
            this.putBodyParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        /**
         * <p>The coupon ID.</p>
         * 
         * <strong>example:</strong>
         * <p>165445235634</p>
         */
        public Builder promotionOptionNo(String promotionOptionNo) {
            this.putBodyParameter("PromotionOptionNo", promotionOptionNo);
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }

        /**
         * <p>The ID of the Resource Access Management (RAM) user or RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder ramUserId(String ramUserId) {
            this.putBodyParameter("RamUserId", ramUserId);
            this.ramUserId = ramUserId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzllkih7jqxxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The running mode of the cluster. Valid values:</p>
         * <ul>
         * <li>shared_nothing: compute-storage coupled.</li>
         * <li>shared_data: compute-storage decoupled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>shared_data</p>
         */
        public Builder runMode(String runMode) {
            this.putBodyParameter("RunMode", runMode);
            this.runMode = runMode;
            return this;
        }

        /**
         * <p>The instance tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The vSwitch and zone information.</p>
         */
        public Builder vSwitches(java.util.List<VSwitches> vSwitches) {
            this.putBodyParameter("VSwitches", vSwitches);
            this.vSwitches = vSwitches;
            return this;
        }

        /**
         * <p>The major version of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("Version", version);
            this.version = version;
            return this;
        }

        /**
         * <p>VPC ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1fll2mci6d7pw8m****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The primary zone ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateInstanceV1Request build() {
            return new CreateInstanceV1Request(this);
        } 

    } 

    /**
     * 
     * {@link CreateInstanceV1Request} extends {@link TeaModel}
     *
     * <p>CreateInstanceV1Request</p>
     */
    public static class AgentNodeGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cu")
        private Integer cu;

        private AgentNodeGroup(Builder builder) {
            this.cu = builder.cu;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentNodeGroup create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public Integer getCu() {
            return this.cu;
        }

        public static final class Builder {
            private Integer cu; 

            private Builder() {
            } 

            private Builder(AgentNodeGroup model) {
                this.cu = model.cu;
            } 

            /**
             * <p>The number of CUs. A CU (Compute Unit) is the basic metering unit of the service. 1 CU = 1 CPU core + 4 GiB memory.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            public AgentNodeGroup build() {
                return new AgentNodeGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceV1Request} extends {@link TeaModel}
     *
     * <p>CreateInstanceV1Request</p>
     */
    public static class BackendNodeGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cu")
        private Integer cu;

        @com.aliyun.core.annotation.NameInMap("diskNumber")
        private Integer diskNumber;

        @com.aliyun.core.annotation.NameInMap("localStorageInstanceType")
        private String localStorageInstanceType;

        @com.aliyun.core.annotation.NameInMap("residentNodeNumber")
        private Integer residentNodeNumber;

        @com.aliyun.core.annotation.NameInMap("specType")
        private String specType;

        @com.aliyun.core.annotation.NameInMap("storagePerformanceLevel")
        private String storagePerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("storageSize")
        private Integer storageSize;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private BackendNodeGroups(Builder builder) {
            this.cu = builder.cu;
            this.diskNumber = builder.diskNumber;
            this.localStorageInstanceType = builder.localStorageInstanceType;
            this.residentNodeNumber = builder.residentNodeNumber;
            this.specType = builder.specType;
            this.storagePerformanceLevel = builder.storagePerformanceLevel;
            this.storageSize = builder.storageSize;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendNodeGroups create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public Integer getCu() {
            return this.cu;
        }

        /**
         * @return diskNumber
         */
        public Integer getDiskNumber() {
            return this.diskNumber;
        }

        /**
         * @return localStorageInstanceType
         */
        public String getLocalStorageInstanceType() {
            return this.localStorageInstanceType;
        }

        /**
         * @return residentNodeNumber
         */
        public Integer getResidentNodeNumber() {
            return this.residentNodeNumber;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return storagePerformanceLevel
         */
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        /**
         * @return storageSize
         */
        public Integer getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer cu; 
            private Integer diskNumber; 
            private String localStorageInstanceType; 
            private Integer residentNodeNumber; 
            private String specType; 
            private String storagePerformanceLevel; 
            private Integer storageSize; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(BackendNodeGroups model) {
                this.cu = model.cu;
                this.diskNumber = model.diskNumber;
                this.localStorageInstanceType = model.localStorageInstanceType;
                this.residentNodeNumber = model.residentNodeNumber;
                this.specType = model.specType;
                this.storagePerformanceLevel = model.storagePerformanceLevel;
                this.storageSize = model.storageSize;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The number of CUs. A CU (Compute Unit) is the basic metering unit of the service. 1 CU = 1 CPU core + 4 GiB memory. When SpecType is set to memory-enhanced instance family, 1 CU = 1 CPU core + 8 GiB memory.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The number of disks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder diskNumber(Integer diskNumber) {
                this.diskNumber = diskNumber;
                return this;
            }

            /**
             * <p>The local SSD instance type of the node group. This parameter takes effect only when the instance is ECS-based and SpecType is set to local SSD or large-scale storage.</p>
             * 
             * <strong>example:</strong>
             * <p>local_ssd_4_4xlarge</p>
             */
            public Builder localStorageInstanceType(String localStorageInstanceType) {
                this.localStorageInstanceType = localStorageInstanceType;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder residentNodeNumber(Integer residentNodeNumber) {
                this.residentNodeNumber = residentNodeNumber;
                return this;
            }

            /**
             * <p>The specification type of the node group. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * <p>The performance level (PL) of the cloud disk. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>pl1</p>
             */
            public Builder storagePerformanceLevel(String storagePerformanceLevel) {
                this.storagePerformanceLevel = storagePerformanceLevel;
                return this;
            }

            /**
             * <p>The storage size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public BackendNodeGroups build() {
                return new BackendNodeGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceV1Request} extends {@link TeaModel}
     *
     * <p>CreateInstanceV1Request</p>
     */
    public static class FrontendNodeGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cu")
        private Integer cu;

        @com.aliyun.core.annotation.NameInMap("diskNumber")
        private Integer diskNumber;

        @com.aliyun.core.annotation.NameInMap("localStorageInstanceType")
        private String localStorageInstanceType;

        @com.aliyun.core.annotation.NameInMap("residentNodeNumber")
        private Integer residentNodeNumber;

        @com.aliyun.core.annotation.NameInMap("specType")
        private String specType;

        @com.aliyun.core.annotation.NameInMap("storagePerformanceLevel")
        private String storagePerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("storageSize")
        private Integer storageSize;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private FrontendNodeGroups(Builder builder) {
            this.cu = builder.cu;
            this.diskNumber = builder.diskNumber;
            this.localStorageInstanceType = builder.localStorageInstanceType;
            this.residentNodeNumber = builder.residentNodeNumber;
            this.specType = builder.specType;
            this.storagePerformanceLevel = builder.storagePerformanceLevel;
            this.storageSize = builder.storageSize;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FrontendNodeGroups create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public Integer getCu() {
            return this.cu;
        }

        /**
         * @return diskNumber
         */
        public Integer getDiskNumber() {
            return this.diskNumber;
        }

        /**
         * @return localStorageInstanceType
         */
        public String getLocalStorageInstanceType() {
            return this.localStorageInstanceType;
        }

        /**
         * @return residentNodeNumber
         */
        public Integer getResidentNodeNumber() {
            return this.residentNodeNumber;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return storagePerformanceLevel
         */
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        /**
         * @return storageSize
         */
        public Integer getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer cu; 
            private Integer diskNumber; 
            private String localStorageInstanceType; 
            private Integer residentNodeNumber; 
            private String specType; 
            private String storagePerformanceLevel; 
            private Integer storageSize; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(FrontendNodeGroups model) {
                this.cu = model.cu;
                this.diskNumber = model.diskNumber;
                this.localStorageInstanceType = model.localStorageInstanceType;
                this.residentNodeNumber = model.residentNodeNumber;
                this.specType = model.specType;
                this.storagePerformanceLevel = model.storagePerformanceLevel;
                this.storageSize = model.storageSize;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The number of CUs. A CU (Compute Unit) is the basic metering unit of the service. 1 CU = 1 CPU core + 4 GiB memory.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The number of disks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder diskNumber(Integer diskNumber) {
                this.diskNumber = diskNumber;
                return this;
            }

            /**
             * <p>The local SSD instance type. This parameter does not need to be set for the FE node group.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder localStorageInstanceType(String localStorageInstanceType) {
                this.localStorageInstanceType = localStorageInstanceType;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder residentNodeNumber(Integer residentNodeNumber) {
                this.residentNodeNumber = residentNodeNumber;
                return this;
            }

            /**
             * <p>The specification type of the node group. Only standard is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * <p>The performance level (PL) of the cloud disk. Only pl1 is supported, which provides up to 50,000 random read/write IOPS per disk.</p>
             * 
             * <strong>example:</strong>
             * <p>pl1</p>
             */
            public Builder storagePerformanceLevel(String storagePerformanceLevel) {
                this.storagePerformanceLevel = storagePerformanceLevel;
                return this;
            }

            /**
             * <p>The storage size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public FrontendNodeGroups build() {
                return new FrontendNodeGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceV1Request} extends {@link TeaModel}
     *
     * <p>CreateInstanceV1Request</p>
     */
    public static class ObserverNodeGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cu")
        private Integer cu;

        @com.aliyun.core.annotation.NameInMap("diskNumber")
        private Integer diskNumber;

        @com.aliyun.core.annotation.NameInMap("localStorageInstanceType")
        private String localStorageInstanceType;

        @com.aliyun.core.annotation.NameInMap("residentNodeNumber")
        private Integer residentNodeNumber;

        @com.aliyun.core.annotation.NameInMap("specType")
        private String specType;

        @com.aliyun.core.annotation.NameInMap("storagePerformanceLevel")
        private String storagePerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("storageSize")
        private Integer storageSize;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private ObserverNodeGroups(Builder builder) {
            this.cu = builder.cu;
            this.diskNumber = builder.diskNumber;
            this.localStorageInstanceType = builder.localStorageInstanceType;
            this.residentNodeNumber = builder.residentNodeNumber;
            this.specType = builder.specType;
            this.storagePerformanceLevel = builder.storagePerformanceLevel;
            this.storageSize = builder.storageSize;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObserverNodeGroups create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public Integer getCu() {
            return this.cu;
        }

        /**
         * @return diskNumber
         */
        public Integer getDiskNumber() {
            return this.diskNumber;
        }

        /**
         * @return localStorageInstanceType
         */
        public String getLocalStorageInstanceType() {
            return this.localStorageInstanceType;
        }

        /**
         * @return residentNodeNumber
         */
        public Integer getResidentNodeNumber() {
            return this.residentNodeNumber;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return storagePerformanceLevel
         */
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        /**
         * @return storageSize
         */
        public Integer getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer cu; 
            private Integer diskNumber; 
            private String localStorageInstanceType; 
            private Integer residentNodeNumber; 
            private String specType; 
            private String storagePerformanceLevel; 
            private Integer storageSize; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ObserverNodeGroups model) {
                this.cu = model.cu;
                this.diskNumber = model.diskNumber;
                this.localStorageInstanceType = model.localStorageInstanceType;
                this.residentNodeNumber = model.residentNodeNumber;
                this.specType = model.specType;
                this.storagePerformanceLevel = model.storagePerformanceLevel;
                this.storageSize = model.storageSize;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The number of CUs. A CU (Compute Unit) is the basic metering unit of the service. 1 CU = 1 CPU core + 4 GiB memory.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The number of disks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder diskNumber(Integer diskNumber) {
                this.diskNumber = diskNumber;
                return this;
            }

            /**
             * <p>The local SSD instance type. This parameter does not need to be set for the Observer node group.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder localStorageInstanceType(String localStorageInstanceType) {
                this.localStorageInstanceType = localStorageInstanceType;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder residentNodeNumber(Integer residentNodeNumber) {
                this.residentNodeNumber = residentNodeNumber;
                return this;
            }

            /**
             * <p>The specification type of the node group. Only standard is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * <p>The performance level (PL) of the cloud disk. Only pl1 is supported, which provides up to 50,000 random read/write IOPS per disk.</p>
             * 
             * <strong>example:</strong>
             * <p>pl1</p>
             */
            public Builder storagePerformanceLevel(String storagePerformanceLevel) {
                this.storagePerformanceLevel = storagePerformanceLevel;
                return this;
            }

            /**
             * <p>The storage size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ObserverNodeGroups build() {
                return new ObserverNodeGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceV1Request} extends {@link TeaModel}
     *
     * <p>CreateInstanceV1Request</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
     * {@link CreateInstanceV1Request} extends {@link TeaModel}
     *
     * <p>CreateInstanceV1Request</p>
     */
    public static class VSwitches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VswId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vswId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private VSwitches(Builder builder) {
            this.vswId = builder.vswId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitches create() {
            return builder().build();
        }

        /**
         * @return vswId
         */
        public String getVswId() {
            return this.vswId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String vswId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(VSwitches model) {
                this.vswId = model.vswId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The vSwitch ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp19mlh98tm9teyyd****</p>
             */
            public Builder vswId(String vswId) {
                this.vswId = vswId;
                return this;
            }

            /**
             * <p>The zone ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VSwitches build() {
                return new VSwitches(this);
            } 

        } 

    }
}
