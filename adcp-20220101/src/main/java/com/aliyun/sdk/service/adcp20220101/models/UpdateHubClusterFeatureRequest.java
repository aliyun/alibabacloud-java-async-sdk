// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHubClusterFeatureRequest} extends {@link RequestModel}
 *
 * <p>UpdateHubClusterFeatureRequest</p>
 */
public class UpdateHubClusterFeatureRequest extends Request {
    @Query
    @NameInMap("ApiServerEipId")
    private String apiServerEipId;

    @Query
    @NameInMap("ArgoCDEnabled")
    private Boolean argoCDEnabled;

    @Query
    @NameInMap("ArgoServerEnabled")
    private Boolean argoServerEnabled;

    @Query
    @NameInMap("ArmsEnabled")
    private Boolean armsEnabled;

    @Query
    @NameInMap("AuditLogEnabled")
    private Boolean auditLogEnabled;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @Query
    @NameInMap("EnableMesh")
    private Boolean enableMesh;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PriceLimit")
    private String priceLimit;

    @Query
    @NameInMap("PublicApiServerEnabled")
    private Boolean publicApiServerEnabled;

    @Query
    @NameInMap("VSwitches")
    private java.util.List < String > vSwitches;

    @Query
    @NameInMap("WorkflowScheduleMode")
    private String workflowScheduleMode;

    private UpdateHubClusterFeatureRequest(Builder builder) {
        super(builder);
        this.apiServerEipId = builder.apiServerEipId;
        this.argoCDEnabled = builder.argoCDEnabled;
        this.argoServerEnabled = builder.argoServerEnabled;
        this.armsEnabled = builder.armsEnabled;
        this.auditLogEnabled = builder.auditLogEnabled;
        this.clusterId = builder.clusterId;
        this.deletionProtection = builder.deletionProtection;
        this.enableMesh = builder.enableMesh;
        this.name = builder.name;
        this.priceLimit = builder.priceLimit;
        this.publicApiServerEnabled = builder.publicApiServerEnabled;
        this.vSwitches = builder.vSwitches;
        this.workflowScheduleMode = builder.workflowScheduleMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHubClusterFeatureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiServerEipId
     */
    public String getApiServerEipId() {
        return this.apiServerEipId;
    }

    /**
     * @return argoCDEnabled
     */
    public Boolean getArgoCDEnabled() {
        return this.argoCDEnabled;
    }

    /**
     * @return argoServerEnabled
     */
    public Boolean getArgoServerEnabled() {
        return this.argoServerEnabled;
    }

    /**
     * @return armsEnabled
     */
    public Boolean getArmsEnabled() {
        return this.armsEnabled;
    }

    /**
     * @return auditLogEnabled
     */
    public Boolean getAuditLogEnabled() {
        return this.auditLogEnabled;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return enableMesh
     */
    public Boolean getEnableMesh() {
        return this.enableMesh;
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
     * @return publicApiServerEnabled
     */
    public Boolean getPublicApiServerEnabled() {
        return this.publicApiServerEnabled;
    }

    /**
     * @return vSwitches
     */
    public java.util.List < String > getVSwitches() {
        return this.vSwitches;
    }

    /**
     * @return workflowScheduleMode
     */
    public String getWorkflowScheduleMode() {
        return this.workflowScheduleMode;
    }

    public static final class Builder extends Request.Builder<UpdateHubClusterFeatureRequest, Builder> {
        private String apiServerEipId; 
        private Boolean argoCDEnabled; 
        private Boolean argoServerEnabled; 
        private Boolean armsEnabled; 
        private Boolean auditLogEnabled; 
        private String clusterId; 
        private Boolean deletionProtection; 
        private Boolean enableMesh; 
        private String name; 
        private String priceLimit; 
        private Boolean publicApiServerEnabled; 
        private java.util.List < String > vSwitches; 
        private String workflowScheduleMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHubClusterFeatureRequest request) {
            super(request);
            this.apiServerEipId = request.apiServerEipId;
            this.argoCDEnabled = request.argoCDEnabled;
            this.argoServerEnabled = request.argoServerEnabled;
            this.armsEnabled = request.armsEnabled;
            this.auditLogEnabled = request.auditLogEnabled;
            this.clusterId = request.clusterId;
            this.deletionProtection = request.deletionProtection;
            this.enableMesh = request.enableMesh;
            this.name = request.name;
            this.priceLimit = request.priceLimit;
            this.publicApiServerEnabled = request.publicApiServerEnabled;
            this.vSwitches = request.vSwitches;
            this.workflowScheduleMode = request.workflowScheduleMode;
        } 

        /**
         * The ID of the EIP.
         */
        public Builder apiServerEipId(String apiServerEipId) {
            this.putQueryParameter("ApiServerEipId", apiServerEipId);
            this.apiServerEipId = apiServerEipId;
            return this;
        }

        /**
         * ArgoCDEnabled.
         */
        public Builder argoCDEnabled(Boolean argoCDEnabled) {
            this.putQueryParameter("ArgoCDEnabled", argoCDEnabled);
            this.argoCDEnabled = argoCDEnabled;
            return this;
        }

        /**
         * ArgoServerEnabled.
         */
        public Builder argoServerEnabled(Boolean argoServerEnabled) {
            this.putQueryParameter("ArgoServerEnabled", argoServerEnabled);
            this.argoServerEnabled = argoServerEnabled;
            return this;
        }

        /**
         * ArmsEnabled.
         */
        public Builder armsEnabled(Boolean armsEnabled) {
            this.putQueryParameter("ArmsEnabled", armsEnabled);
            this.armsEnabled = armsEnabled;
            return this;
        }

        /**
         * Specifies whether to enable the audit logging feature. Valid values:
         * <p>
         * 
         * *   true: enables the audit logging feature.
         * *   false: disables the audit logging feature.
         */
        public Builder auditLogEnabled(Boolean auditLogEnabled) {
            this.putQueryParameter("AuditLogEnabled", auditLogEnabled);
            this.auditLogEnabled = auditLogEnabled;
            return this;
        }

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Specifies whether to enable deletion protection for the cluster. After you enable deletion protection, you cannot delete the master instance in the console or by calling the DeleteHubCluster operation. Valid values:
         * <p>
         * 
         * *   true: enables deletion protection for the cluster.
         * *   false: disables deletion protection for the cluster. This is the default value.
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * Specifies whether to enable Alibaba Cloud Service Mesh (ASM). Valid values:
         * <p>
         * 
         * true: enables ASM. false: disables ASM.
         */
        public Builder enableMesh(Boolean enableMesh) {
            this.putQueryParameter("EnableMesh", enableMesh);
            this.enableMesh = enableMesh;
            return this;
        }

        /**
         * The name of the cluster. The name must be 1 to 63 characters in length. It must start with a letter, and can contain letters, digits, underscores (\_), and hyphens (-).
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The limit on the prices of containers in the workflow. This parameter takes effect only if the WorkflowScheduleMode parameter is set to cost-optimized.
         */
        public Builder priceLimit(String priceLimit) {
            this.putQueryParameter("PriceLimit", priceLimit);
            this.priceLimit = priceLimit;
            return this;
        }

        /**
         * Specifies whether to associate an elastic IP address (EIP) with the API server. Valid values:
         * <p>
         * 
         * *   true: associates an EIP with the API server. You can specify the ApiServerEipId parameter. If you do not specify the ApiServerEipId parameter, the system automatically creates an EIP.
         * *   false: disassociates an EIP from the API server.
         */
        public Builder publicApiServerEnabled(Boolean publicApiServerEnabled) {
            this.putQueryParameter("PublicApiServerEnabled", publicApiServerEnabled);
            this.publicApiServerEnabled = publicApiServerEnabled;
            return this;
        }

        /**
         * VSwitches.
         */
        public Builder vSwitches(java.util.List < String > vSwitches) {
            String vSwitchesShrink = shrink(vSwitches, "VSwitches", "json");
            this.putQueryParameter("VSwitches", vSwitchesShrink);
            this.vSwitches = vSwitches;
            return this;
        }

        /**
         * WorkflowScheduleMode.
         */
        public Builder workflowScheduleMode(String workflowScheduleMode) {
            this.putQueryParameter("WorkflowScheduleMode", workflowScheduleMode);
            this.workflowScheduleMode = workflowScheduleMode;
            return this;
        }

        @Override
        public UpdateHubClusterFeatureRequest build() {
            return new UpdateHubClusterFeatureRequest(this);
        } 

    } 

}
