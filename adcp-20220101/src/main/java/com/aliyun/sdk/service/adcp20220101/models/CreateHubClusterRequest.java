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
    @NameInMap("IsEnterpriseSecurityGroup")
    private Boolean isEnterpriseSecurityGroup;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Profile")
    private String profile;

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
        this.isEnterpriseSecurityGroup = builder.isEnterpriseSecurityGroup;
        this.name = builder.name;
        this.profile = builder.profile;
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
        private Boolean isEnterpriseSecurityGroup; 
        private String name; 
        private String profile; 
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
            this.isEnterpriseSecurityGroup = request.isEnterpriseSecurityGroup;
            this.name = request.name;
            this.profile = request.profile;
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
         * 集群配置
         */
        public Builder profile(String profile) {
            this.putBodyParameter("Profile", profile);
            this.profile = profile;
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
