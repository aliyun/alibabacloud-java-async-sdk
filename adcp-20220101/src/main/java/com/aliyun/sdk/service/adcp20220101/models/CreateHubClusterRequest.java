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
    @NameInMap("AuditLogEnabled")
    private Boolean auditLogEnabled;

    @Body
    @NameInMap("AuditLogProject")
    private String auditLogProject;

    @Body
    @NameInMap("AuditLogStoreTTL")
    private String auditLogStoreTTL;

    @Body
    @NameInMap("ControlPlaneLogEnabled")
    private Boolean controlPlaneLogEnabled;

    @Body
    @NameInMap("ControlPlaneLogProject")
    private String controlPlaneLogProject;

    @Body
    @NameInMap("ControlPlaneLogTTL")
    private String controlPlaneLogTTL;

    @Body
    @NameInMap("IsEnterpriseSecurityGroup")
    private Boolean isEnterpriseSecurityGroup;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("VSwitches")
    @Validation(required = true)
    private String vSwitches;

    @Body
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    private CreateHubClusterRequest(Builder builder) {
        super(builder);
        this.apiServerPublicEip = builder.apiServerPublicEip;
        this.auditLogEnabled = builder.auditLogEnabled;
        this.auditLogProject = builder.auditLogProject;
        this.auditLogStoreTTL = builder.auditLogStoreTTL;
        this.controlPlaneLogEnabled = builder.controlPlaneLogEnabled;
        this.controlPlaneLogProject = builder.controlPlaneLogProject;
        this.controlPlaneLogTTL = builder.controlPlaneLogTTL;
        this.isEnterpriseSecurityGroup = builder.isEnterpriseSecurityGroup;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.vSwitches = builder.vSwitches;
        this.vpcId = builder.vpcId;
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
     * @return auditLogEnabled
     */
    public Boolean getAuditLogEnabled() {
        return this.auditLogEnabled;
    }

    /**
     * @return auditLogProject
     */
    public String getAuditLogProject() {
        return this.auditLogProject;
    }

    /**
     * @return auditLogStoreTTL
     */
    public String getAuditLogStoreTTL() {
        return this.auditLogStoreTTL;
    }

    /**
     * @return controlPlaneLogEnabled
     */
    public Boolean getControlPlaneLogEnabled() {
        return this.controlPlaneLogEnabled;
    }

    /**
     * @return controlPlaneLogProject
     */
    public String getControlPlaneLogProject() {
        return this.controlPlaneLogProject;
    }

    /**
     * @return controlPlaneLogTTL
     */
    public String getControlPlaneLogTTL() {
        return this.controlPlaneLogTTL;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreateHubClusterRequest, Builder> {
        private Boolean apiServerPublicEip; 
        private Boolean auditLogEnabled; 
        private String auditLogProject; 
        private String auditLogStoreTTL; 
        private Boolean controlPlaneLogEnabled; 
        private String controlPlaneLogProject; 
        private String controlPlaneLogTTL; 
        private Boolean isEnterpriseSecurityGroup; 
        private String name; 
        private String regionId; 
        private String vSwitches; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateHubClusterRequest request) {
            super(request);
            this.apiServerPublicEip = request.apiServerPublicEip;
            this.auditLogEnabled = request.auditLogEnabled;
            this.auditLogProject = request.auditLogProject;
            this.auditLogStoreTTL = request.auditLogStoreTTL;
            this.controlPlaneLogEnabled = request.controlPlaneLogEnabled;
            this.controlPlaneLogProject = request.controlPlaneLogProject;
            this.controlPlaneLogTTL = request.controlPlaneLogTTL;
            this.isEnterpriseSecurityGroup = request.isEnterpriseSecurityGroup;
            this.name = request.name;
            this.regionId = request.regionId;
            this.vSwitches = request.vSwitches;
            this.vpcId = request.vpcId;
        } 

        /**
         * ApiServerPublicEip.
         */
        public Builder apiServerPublicEip(Boolean apiServerPublicEip) {
            this.putBodyParameter("ApiServerPublicEip", apiServerPublicEip);
            this.apiServerPublicEip = apiServerPublicEip;
            return this;
        }

        /**
         * AuditLogEnabled.
         */
        public Builder auditLogEnabled(Boolean auditLogEnabled) {
            this.putBodyParameter("AuditLogEnabled", auditLogEnabled);
            this.auditLogEnabled = auditLogEnabled;
            return this;
        }

        /**
         * AuditLogProject.
         */
        public Builder auditLogProject(String auditLogProject) {
            this.putBodyParameter("AuditLogProject", auditLogProject);
            this.auditLogProject = auditLogProject;
            return this;
        }

        /**
         * AuditLogStoreTTL.
         */
        public Builder auditLogStoreTTL(String auditLogStoreTTL) {
            this.putBodyParameter("AuditLogStoreTTL", auditLogStoreTTL);
            this.auditLogStoreTTL = auditLogStoreTTL;
            return this;
        }

        /**
         * ControlPlaneLogEnabled.
         */
        public Builder controlPlaneLogEnabled(Boolean controlPlaneLogEnabled) {
            this.putBodyParameter("ControlPlaneLogEnabled", controlPlaneLogEnabled);
            this.controlPlaneLogEnabled = controlPlaneLogEnabled;
            return this;
        }

        /**
         * ControlPlaneLogProject.
         */
        public Builder controlPlaneLogProject(String controlPlaneLogProject) {
            this.putBodyParameter("ControlPlaneLogProject", controlPlaneLogProject);
            this.controlPlaneLogProject = controlPlaneLogProject;
            return this;
        }

        /**
         * ControlPlaneLogTTL.
         */
        public Builder controlPlaneLogTTL(String controlPlaneLogTTL) {
            this.putBodyParameter("ControlPlaneLogTTL", controlPlaneLogTTL);
            this.controlPlaneLogTTL = controlPlaneLogTTL;
            return this;
        }

        /**
         * 是否企业安全组
         */
        public Builder isEnterpriseSecurityGroup(Boolean isEnterpriseSecurityGroup) {
            this.putBodyParameter("IsEnterpriseSecurityGroup", isEnterpriseSecurityGroup);
            this.isEnterpriseSecurityGroup = isEnterpriseSecurityGroup;
            return this;
        }

        /**
         * 集群名称
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * VSwitches.
         */
        public Builder vSwitches(String vSwitches) {
            this.putBodyParameter("VSwitches", vSwitches);
            this.vSwitches = vSwitches;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateHubClusterRequest build() {
            return new CreateHubClusterRequest(this);
        } 

    } 

}
