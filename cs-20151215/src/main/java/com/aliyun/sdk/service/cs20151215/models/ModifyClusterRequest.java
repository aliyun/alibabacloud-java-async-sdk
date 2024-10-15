// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterRequest</p>
 */
public class ModifyClusterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("access_control_list")
    private java.util.List < String > accessControlList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("api_server_custom_cert_sans")
    private ApiServerCustomCertSans apiServerCustomCertSans;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("api_server_eip")
    private Boolean apiServerEip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("api_server_eip_id")
    private String apiServerEipId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cluster_name")
    private String clusterName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deletion_protection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enable_rrsa")
    private Boolean enableRrsa;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ingress_domain_rebinding")
    private Boolean ingressDomainRebinding;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ingress_loadbalancer_id")
    private String ingressLoadbalancerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instance_deletion_protection")
    private Boolean instanceDeletionProtection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maintenance_window")
    private MaintenanceWindow maintenanceWindow;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operation_policy")
    private OperationPolicy operationPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resource_group_id")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("system_events_logging")
    private SystemEventsLogging systemEventsLogging;

    private ModifyClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.accessControlList = builder.accessControlList;
        this.apiServerCustomCertSans = builder.apiServerCustomCertSans;
        this.apiServerEip = builder.apiServerEip;
        this.apiServerEipId = builder.apiServerEipId;
        this.clusterName = builder.clusterName;
        this.deletionProtection = builder.deletionProtection;
        this.enableRrsa = builder.enableRrsa;
        this.ingressDomainRebinding = builder.ingressDomainRebinding;
        this.ingressLoadbalancerId = builder.ingressLoadbalancerId;
        this.instanceDeletionProtection = builder.instanceDeletionProtection;
        this.maintenanceWindow = builder.maintenanceWindow;
        this.operationPolicy = builder.operationPolicy;
        this.resourceGroupId = builder.resourceGroupId;
        this.systemEventsLogging = builder.systemEventsLogging;
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
     * @return accessControlList
     */
    public java.util.List < String > getAccessControlList() {
        return this.accessControlList;
    }

    /**
     * @return apiServerCustomCertSans
     */
    public ApiServerCustomCertSans getApiServerCustomCertSans() {
        return this.apiServerCustomCertSans;
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
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return enableRrsa
     */
    public Boolean getEnableRrsa() {
        return this.enableRrsa;
    }

    /**
     * @return ingressDomainRebinding
     */
    public Boolean getIngressDomainRebinding() {
        return this.ingressDomainRebinding;
    }

    /**
     * @return ingressLoadbalancerId
     */
    public String getIngressLoadbalancerId() {
        return this.ingressLoadbalancerId;
    }

    /**
     * @return instanceDeletionProtection
     */
    public Boolean getInstanceDeletionProtection() {
        return this.instanceDeletionProtection;
    }

    /**
     * @return maintenanceWindow
     */
    public MaintenanceWindow getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * @return operationPolicy
     */
    public OperationPolicy getOperationPolicy() {
        return this.operationPolicy;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return systemEventsLogging
     */
    public SystemEventsLogging getSystemEventsLogging() {
        return this.systemEventsLogging;
    }

    public static final class Builder extends Request.Builder<ModifyClusterRequest, Builder> {
        private String clusterId; 
        private java.util.List < String > accessControlList; 
        private ApiServerCustomCertSans apiServerCustomCertSans; 
        private Boolean apiServerEip; 
        private String apiServerEipId; 
        private String clusterName; 
        private Boolean deletionProtection; 
        private Boolean enableRrsa; 
        private Boolean ingressDomainRebinding; 
        private String ingressLoadbalancerId; 
        private Boolean instanceDeletionProtection; 
        private MaintenanceWindow maintenanceWindow; 
        private OperationPolicy operationPolicy; 
        private String resourceGroupId; 
        private SystemEventsLogging systemEventsLogging; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.accessControlList = request.accessControlList;
            this.apiServerCustomCertSans = request.apiServerCustomCertSans;
            this.apiServerEip = request.apiServerEip;
            this.apiServerEipId = request.apiServerEipId;
            this.clusterName = request.clusterName;
            this.deletionProtection = request.deletionProtection;
            this.enableRrsa = request.enableRrsa;
            this.ingressDomainRebinding = request.ingressDomainRebinding;
            this.ingressLoadbalancerId = request.ingressLoadbalancerId;
            this.instanceDeletionProtection = request.instanceDeletionProtection;
            this.maintenanceWindow = request.maintenanceWindow;
            this.operationPolicy = request.operationPolicy;
            this.resourceGroupId = request.resourceGroupId;
            this.systemEventsLogging = request.systemEventsLogging;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cb95aa626a47740afbf6aa099b65****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The network access control lists (ACLs) of the SLB instance associated with the API server if the cluster is a registered cluster.</p>
         */
        public Builder accessControlList(java.util.List < String > accessControlList) {
            this.putBodyParameter("access_control_list", accessControlList);
            this.accessControlList = accessControlList;
            return this;
        }

        /**
         * <p>The custom subject alternative names (SANs) for the API server certificate to accept requests from specified IP addresses or domain names. This parameter is available only for ACK managed clusters.</p>
         */
        public Builder apiServerCustomCertSans(ApiServerCustomCertSans apiServerCustomCertSans) {
            this.putBodyParameter("api_server_custom_cert_sans", apiServerCustomCertSans);
            this.apiServerCustomCertSans = apiServerCustomCertSans;
            return this;
        }

        /**
         * <p>Specifies whether to associate an elastic IP address (EIP) with the cluster. This EIP is used to enable access to the API server over the Internet. Valid values:</p>
         * <ul>
         * <li><code>true</code>: associates an EIP with the cluster.</li>
         * <li><code>false</code>: does not associate an EIP with the cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder apiServerEip(Boolean apiServerEip) {
            this.putBodyParameter("api_server_eip", apiServerEip);
            this.apiServerEip = apiServerEip;
            return this;
        }

        /**
         * <p>The ID of the EIP that you want to associate with the API server of the cluster. This parameter takes effect when <code>api_server_eip</code> is set to <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-wz9fnasl6dsfhmvci****</p>
         */
        public Builder apiServerEipId(String apiServerEipId) {
            this.putBodyParameter("api_server_eip_id", apiServerEipId);
            this.apiServerEipId = apiServerEipId;
            return this;
        }

        /**
         * <p>The name of the cluster.</p>
         * <p>The cluster name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). The cluster name cannot start with a hyphen (-).</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-new-name</p>
         */
        public Builder clusterName(String clusterName) {
            this.putBodyParameter("cluster_name", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>Specifies whether to enable cluster deletion protection. If you enable this option, the cluster cannot be deleted in the console or by calling API operations. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables cluster deletion protection.</li>
         * <li><code>false</code>: disables cluster deletion protection.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putBodyParameter("deletion_protection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>Specifies whether to enable the RAM Roles for Service Accounts (RRSA) feature. This parameter is available only for ACK managed clusters. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables the RRSA feature.</li>
         * <li><code>false</code>: disables the RRSA feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableRrsa(Boolean enableRrsa) {
            this.putBodyParameter("enable_rrsa", enableRrsa);
            this.enableRrsa = enableRrsa;
            return this;
        }

        /**
         * <p>Specifies whether to remap the test domain name of the cluster. Valid values:</p>
         * <ul>
         * <li><code>true</code>: remaps the test domain name of the cluster.</li>
         * <li><code>false</code>: does not remap the test domain name of the cluster.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ingressDomainRebinding(Boolean ingressDomainRebinding) {
            this.putBodyParameter("ingress_domain_rebinding", ingressDomainRebinding);
            this.ingressDomainRebinding = ingressDomainRebinding;
            return this;
        }

        /**
         * <p>The ID of the Server Load Balancer (SLB) instance of the cluster to be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-wz97kes8tnndkpodw****</p>
         */
        public Builder ingressLoadbalancerId(String ingressLoadbalancerId) {
            this.putBodyParameter("ingress_loadbalancer_id", ingressLoadbalancerId);
            this.ingressLoadbalancerId = ingressLoadbalancerId;
            return this;
        }

        /**
         * <p>Specifies whether to enable instance deletion protection. If you enable this option, the instance cannot be deleted in the console or by calling API operations. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables instance deletion protection.</li>
         * <li><code>false</code>: disables instance deletion protection.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder instanceDeletionProtection(Boolean instanceDeletionProtection) {
            this.putBodyParameter("instance_deletion_protection", instanceDeletionProtection);
            this.instanceDeletionProtection = instanceDeletionProtection;
            return this;
        }

        /**
         * <p>The cluster maintenance window. This feature takes effect only for ACK Pro clusters.</p>
         */
        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.putBodyParameter("maintenance_window", maintenanceWindow);
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * <p>The automatic O&amp;M policy of the cluster.</p>
         */
        public Builder operationPolicy(OperationPolicy operationPolicy) {
            this.putBodyParameter("operation_policy", operationPolicy);
            this.operationPolicy = operationPolicy;
            return this;
        }

        /**
         * <p>The cluster resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyvw3wjm****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resource_group_id", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The storage configurations of system events.</p>
         */
        public Builder systemEventsLogging(SystemEventsLogging systemEventsLogging) {
            this.putBodyParameter("system_events_logging", systemEventsLogging);
            this.systemEventsLogging = systemEventsLogging;
            return this;
        }

        @Override
        public ModifyClusterRequest build() {
            return new ModifyClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyClusterRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterRequest</p>
     */
    public static class ApiServerCustomCertSans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("subject_alternative_names")
        private java.util.List < String > subjectAlternativeNames;

        private ApiServerCustomCertSans(Builder builder) {
            this.action = builder.action;
            this.subjectAlternativeNames = builder.subjectAlternativeNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiServerCustomCertSans create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return subjectAlternativeNames
         */
        public java.util.List < String > getSubjectAlternativeNames() {
            return this.subjectAlternativeNames;
        }

        public static final class Builder {
            private String action; 
            private java.util.List < String > subjectAlternativeNames; 

            /**
             * <p>Specifies whether to overwrite or add SANs. Valid values:</p>
             * <ul>
             * <li>overwrite: overwrites SANs.</li>
             * <li>append: adds SANs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>append</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The SANs.</p>
             */
            public Builder subjectAlternativeNames(java.util.List < String > subjectAlternativeNames) {
                this.subjectAlternativeNames = subjectAlternativeNames;
                return this;
            }

            public ApiServerCustomCertSans build() {
                return new ApiServerCustomCertSans(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyClusterRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterRequest</p>
     */
    public static class ClusterAutoUpgrade extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        private ClusterAutoUpgrade(Builder builder) {
            this.channel = builder.channel;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterAutoUpgrade create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private String channel; 
            private Boolean enabled; 

            /**
             * <p>The frequency of auto cluster updates. Valid values:</p>
             * <ul>
             * <li>patch</li>
             * <li>stable</li>
             * <li>rapid</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>patch</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>Specifies whether to enable auto cluster update.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public ClusterAutoUpgrade build() {
                return new ClusterAutoUpgrade(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyClusterRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterRequest</p>
     */
    public static class OperationPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster_auto_upgrade")
        private ClusterAutoUpgrade clusterAutoUpgrade;

        private OperationPolicy(Builder builder) {
            this.clusterAutoUpgrade = builder.clusterAutoUpgrade;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationPolicy create() {
            return builder().build();
        }

        /**
         * @return clusterAutoUpgrade
         */
        public ClusterAutoUpgrade getClusterAutoUpgrade() {
            return this.clusterAutoUpgrade;
        }

        public static final class Builder {
            private ClusterAutoUpgrade clusterAutoUpgrade; 

            /**
             * <p>The configurations of auto cluster update.</p>
             */
            public Builder clusterAutoUpgrade(ClusterAutoUpgrade clusterAutoUpgrade) {
                this.clusterAutoUpgrade = clusterAutoUpgrade;
                return this;
            }

            public OperationPolicy build() {
                return new OperationPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyClusterRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterRequest</p>
     */
    public static class SystemEventsLogging extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("logging_project")
        private String loggingProject;

        private SystemEventsLogging(Builder builder) {
            this.enabled = builder.enabled;
            this.loggingProject = builder.loggingProject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemEventsLogging create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return loggingProject
         */
        public String getLoggingProject() {
            return this.loggingProject;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String loggingProject; 

            /**
             * <p>Specifies whether to enable system event storage.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service project that stores system events.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s-log-cb95aa626a47740afbf6aa099b65****</p>
             */
            public Builder loggingProject(String loggingProject) {
                this.loggingProject = loggingProject;
                return this;
            }

            public SystemEventsLogging build() {
                return new SystemEventsLogging(this);
            } 

        } 

    }
}
