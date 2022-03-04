// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterRequest</p>
 */
public class ModifyClusterRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("api_server_eip")
    private Boolean apiServerEip;

    @Body
    @NameInMap("api_server_eip_id")
    private String apiServerEipId;

    @Body
    @NameInMap("deletion_protection")
    private Boolean deletionProtection;

    @Body
    @NameInMap("instance_deletion_protection")
    private Boolean instanceDeletionProtection;

    @Body
    @NameInMap("ingress_domain_rebinding")
    private String ingressDomainRebinding;

    @Body
    @NameInMap("ingress_loadbalancer_id")
    private String ingressLoadbalancerId;

    @Body
    @NameInMap("resource_group_id")
    private String resourceGroupId;

    @Body
    @NameInMap("maintenance_window")
    private MaintenanceWindow maintenanceWindow;

    @Body
    @NameInMap("enable_rrsa")
    private Boolean enableRrsa;

    private ModifyClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.apiServerEip = builder.apiServerEip;
        this.apiServerEipId = builder.apiServerEipId;
        this.deletionProtection = builder.deletionProtection;
        this.instanceDeletionProtection = builder.instanceDeletionProtection;
        this.ingressDomainRebinding = builder.ingressDomainRebinding;
        this.ingressLoadbalancerId = builder.ingressLoadbalancerId;
        this.resourceGroupId = builder.resourceGroupId;
        this.maintenanceWindow = builder.maintenanceWindow;
        this.enableRrsa = builder.enableRrsa;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return apiServerEip
     */
    public Boolean getApiServerEip() {
        return this.apiServerEip;
    }

    /**
     * @return apiServerEipId
     */
    public String getApiServerEipId() {
        return this.apiServerEipId;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return instanceDeletionProtection
     */
    public Boolean getInstanceDeletionProtection() {
        return this.instanceDeletionProtection;
    }

    /**
     * @return ingressDomainRebinding
     */
    public String getIngressDomainRebinding() {
        return this.ingressDomainRebinding;
    }

    /**
     * @return ingressLoadbalancerId
     */
    public String getIngressLoadbalancerId() {
        return this.ingressLoadbalancerId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return maintenanceWindow
     */
    public MaintenanceWindow getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * @return enableRrsa
     */
    public Boolean getEnableRrsa() {
        return this.enableRrsa;
    }

    public static final class Builder extends Request.Builder<ModifyClusterRequest, Builder> {
        private String clusterId; 
        private Boolean apiServerEip; 
        private String apiServerEipId; 
        private Boolean deletionProtection; 
        private Boolean instanceDeletionProtection; 
        private String ingressDomainRebinding; 
        private String ingressLoadbalancerId; 
        private String resourceGroupId; 
        private MaintenanceWindow maintenanceWindow; 
        private Boolean enableRrsa; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.apiServerEip = request.apiServerEip;
            this.apiServerEipId = request.apiServerEipId;
            this.deletionProtection = request.deletionProtection;
            this.instanceDeletionProtection = request.instanceDeletionProtection;
            this.ingressDomainRebinding = request.ingressDomainRebinding;
            this.ingressLoadbalancerId = request.ingressLoadbalancerId;
            this.resourceGroupId = request.resourceGroupId;
            this.maintenanceWindow = request.maintenanceWindow;
            this.enableRrsa = request.enableRrsa;
        } 

        /**
         * The ID of the cluster.
         * <p>
         * 
         * 
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Indicates whether the cluster is associated with an EIP for internet access API Server. Valid values:
         * <p>
         * 
         * -"true": the cluster is associated with an EIP.
         * -"false": the cluster is not associated with an EIP.
         */
        public Builder apiServerEip(Boolean apiServerEip) {
            this.putBodyParameter("api_server_eip", apiServerEip);
            this.apiServerEip = apiServerEip;
            return this;
        }

        /**
         * The ID of the EIP associated with the cluster API Server. This parameter takes effect only when the value of "api_server_eip "is "true.
         */
        public Builder apiServerEipId(String apiServerEipId) {
            this.putBodyParameter("api_server_eip_id", apiServerEipId);
            this.apiServerEipId = apiServerEipId;
            return this;
        }

        /**
         * Cluster deletion protection to prevent accidental deletion of clusters through the console or API. Valid values:
         * <p>
         * 
         * -"true": if you enable cluster deletion protection, the cluster cannot be deleted through the console or API.
         * -"false": if you do not enable cluster deletion protection, you can delete the cluster through the console or API.
         * 
         * Default value: "false ".
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putBodyParameter("deletion_protection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * Instance deletion protection to prevent accidental deletion and release of nodes through the console or API. Valid values:
         * <p>
         * 
         * -"true": you cannot delete a cluster by using the console or API.
         * -"false": you can delete a cluster by using the console or API.
         * 
         * Default value: "false ".
         */
        public Builder instanceDeletionProtection(Boolean instanceDeletionProtection) {
            this.putBodyParameter("instance_deletion_protection", instanceDeletionProtection);
            this.instanceDeletionProtection = instanceDeletionProtection;
            return this;
        }

        /**
         * Re-bind the cluster test domain name. Valid values:
         * <p>
         * 
         * -"true": re-bind the cluster test domain name.
         * -"false": does not rebind the cluster test domain name.
         * 
         * Default value: "false ".
         */
        public Builder ingressDomainRebinding(String ingressDomainRebinding) {
            this.putBodyParameter("ingress_domain_rebinding", ingressDomainRebinding);
            this.ingressDomainRebinding = ingressDomainRebinding;
            return this;
        }

        /**
         * The ID of the SLB instance of the modified cluster.
         */
        public Builder ingressLoadbalancerId(String ingressLoadbalancerId) {
            this.putBodyParameter("ingress_loadbalancer_id", ingressLoadbalancerId);
            this.ingressLoadbalancerId = ingressLoadbalancerId;
            return this;
        }

        /**
         * The ID of the cluster resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resource_group_id", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Cluster maintenance window. This function only takes effect in Pro managed clusters.
         */
        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.putBodyParameter("maintenance_window", maintenanceWindow);
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * Enable or disable RRSA. Valid values:
         * <p>
         * 
         * -"true": enabled.
         * 
         * -"false": disabled.
         */
        public Builder enableRrsa(Boolean enableRrsa) {
            this.putBodyParameter("enable_rrsa", enableRrsa);
            this.enableRrsa = enableRrsa;
            return this;
        }

        @Override
        public ModifyClusterRequest build() {
            return new ModifyClusterRequest(this);
        } 

    } 

}
