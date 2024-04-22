// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHubClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateHubClusterRequest</p>
 */
public class CreateHubClusterRequest extends Request {
    @Body
    @NameInMap("ApiServerPublicEip")
    private Boolean apiServerPublicEip;

    @Body
    @NameInMap("ArgoServerEnabled")
    private Boolean argoServerEnabled;

    @Body
    @NameInMap("AuditLogEnabled")
    private Boolean auditLogEnabled;

    @Body
    @NameInMap("IsEnterpriseSecurityGroup")
    private Boolean isEnterpriseSecurityGroup;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("PriceLimit")
    private String priceLimit;

    @Body
    @NameInMap("Profile")
    private String profile;

    @Body
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("ResourceGroupID")
    private String resourceGroupID;

    @Body
    @NameInMap("VSwitches")
    @Validation(required = true)
    private String vSwitches;

    @Body
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    @Body
    @NameInMap("WorkflowScheduleMode")
    private String workflowScheduleMode;

    private CreateHubClusterRequest(Builder builder) {
        super(builder);
        this.apiServerPublicEip = builder.apiServerPublicEip;
        this.argoServerEnabled = builder.argoServerEnabled;
        this.auditLogEnabled = builder.auditLogEnabled;
        this.isEnterpriseSecurityGroup = builder.isEnterpriseSecurityGroup;
        this.name = builder.name;
        this.priceLimit = builder.priceLimit;
        this.profile = builder.profile;
        this.regionId = builder.regionId;
        this.resourceGroupID = builder.resourceGroupID;
        this.vSwitches = builder.vSwitches;
        this.vpcId = builder.vpcId;
        this.workflowScheduleMode = builder.workflowScheduleMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHubClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiServerPublicEip
     */
    public Boolean getApiServerPublicEip() {
        return this.apiServerPublicEip;
    }

    /**
     * @return argoServerEnabled
     */
    public Boolean getArgoServerEnabled() {
        return this.argoServerEnabled;
    }

    /**
     * @return auditLogEnabled
     */
    public Boolean getAuditLogEnabled() {
        return this.auditLogEnabled;
    }

    /**
     * @return isEnterpriseSecurityGroup
     */
    public Boolean getIsEnterpriseSecurityGroup() {
        return this.isEnterpriseSecurityGroup;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return priceLimit
     */
    public String getPriceLimit() {
        return this.priceLimit;
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return vSwitches
     */
    public String getVSwitches() {
        return this.vSwitches;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return workflowScheduleMode
     */
    public String getWorkflowScheduleMode() {
        return this.workflowScheduleMode;
    }

    public static final class Builder extends Request.Builder<CreateHubClusterRequest, Builder> {
        private Boolean apiServerPublicEip; 
        private Boolean argoServerEnabled; 
        private Boolean auditLogEnabled; 
        private Boolean isEnterpriseSecurityGroup; 
        private String name; 
        private String priceLimit; 
        private String profile; 
        private String regionId; 
        private String resourceGroupID; 
        private String vSwitches; 
        private String vpcId; 
        private String workflowScheduleMode; 

        private Builder() {
            super();
        } 

        private Builder(CreateHubClusterRequest request) {
            super(request);
            this.apiServerPublicEip = request.apiServerPublicEip;
            this.argoServerEnabled = request.argoServerEnabled;
            this.auditLogEnabled = request.auditLogEnabled;
            this.isEnterpriseSecurityGroup = request.isEnterpriseSecurityGroup;
            this.name = request.name;
            this.priceLimit = request.priceLimit;
            this.profile = request.profile;
            this.regionId = request.regionId;
            this.resourceGroupID = request.resourceGroupID;
            this.vSwitches = request.vSwitches;
            this.vpcId = request.vpcId;
            this.workflowScheduleMode = request.workflowScheduleMode;
        } 

        /**
         * Specifies whether to expose the API server to the Internet. Valid values:
         * <p>
         * 
         * *   true: exposes the API server to the Internet.
         * *   false: exposes the API server to the internal network.
         */
        public Builder apiServerPublicEip(Boolean apiServerPublicEip) {
            this.putBodyParameter("ApiServerPublicEip", apiServerPublicEip);
            this.apiServerPublicEip = apiServerPublicEip;
            return this;
        }

        /**
         * Specifies whether to enable the workflow instance UI. This parameter takes effect only if Profile is set to XFlow. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder argoServerEnabled(Boolean argoServerEnabled) {
            this.putBodyParameter("ArgoServerEnabled", argoServerEnabled);
            this.argoServerEnabled = argoServerEnabled;
            return this;
        }

        /**
         * Specifies whether to enable the audit log feature. Valid values:
         * <p>
         * 
         * *   true: enables the audit log feature.
         * *   false: disables the audit log feature.
         */
        public Builder auditLogEnabled(Boolean auditLogEnabled) {
            this.putBodyParameter("AuditLogEnabled", auditLogEnabled);
            this.auditLogEnabled = auditLogEnabled;
            return this;
        }

        /**
         * Specifies whether to use an advanced security group.
         */
        public Builder isEnterpriseSecurityGroup(Boolean isEnterpriseSecurityGroup) {
            this.putBodyParameter("IsEnterpriseSecurityGroup", isEnterpriseSecurityGroup);
            this.isEnterpriseSecurityGroup = isEnterpriseSecurityGroup;
            return this;
        }

        /**
         * The name of the master instance.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The limit on the prices of containers in the workflow. This parameter takes effect only if the WorkflowScheduleMode parameter is set to cost-optimized.
         */
        public Builder priceLimit(String priceLimit) {
            this.putBodyParameter("PriceLimit", priceLimit);
            this.priceLimit = priceLimit;
            return this;
        }

        /**
         * The type of scenario for which the master instance is suitable. Valid values:
         * <p>
         * 
         * *   `Default`: The master instance is suitable for standard scenarios.
         * *   `XFlow`: The master instance is suitable for workflow scenarios.
         * 
         * Default value: `Default`.
         */
        public Builder profile(String profile) {
            this.putBodyParameter("Profile", profile);
            this.profile = profile;
            return this;
        }

        /**
         * The ID of the region. You can call the DescribeRegions operation to query available regions.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The Resource Group ID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.putBodyParameter("ResourceGroupID", resourceGroupID);
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * The ID of the vSwitch.
         */
        public Builder vSwitches(String vSwitches) {
            this.putBodyParameter("VSwitches", vSwitches);
            this.vSwitches = vSwitches;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) to which the master instance belongs. You can call the DescribeVpcs operation to query available VPCs.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The scheduling mode of the workflow. This parameter takes effect only if Profile is set to XFlow. Valid values:
         * <p>
         * 
         * *   cost-optimized: cost-prioritized scheduling mode.
         * *   stock-optimized: inventory-prioritized scheduling mode.
         */
        public Builder workflowScheduleMode(String workflowScheduleMode) {
            this.putBodyParameter("WorkflowScheduleMode", workflowScheduleMode);
            this.workflowScheduleMode = workflowScheduleMode;
            return this;
        }

        @Override
        public CreateHubClusterRequest build() {
            return new CreateHubClusterRequest(this);
        } 

    } 

}
