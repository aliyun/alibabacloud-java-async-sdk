// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
    @Deprecated
    private java.util.List<String> accessControlList;

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
    @com.aliyun.core.annotation.NameInMap("client_token")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cluster_name")
    private String clusterName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cluster_spec")
    private String clusterSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("control_plane_config")
    private ControlPlaneConfig controlPlaneConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("control_plane_endpoints_config")
    private ControlPlaneEndpointsConfig controlPlaneEndpointsConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deletion_protection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enable_rrsa")
    private Boolean enableRrsa;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ingress_domain_rebinding")
    @Deprecated
    private Boolean ingressDomainRebinding;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ingress_loadbalancer_id")
    @Deprecated
    private String ingressLoadbalancerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instance_deletion_protection")
    @Deprecated
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
    @com.aliyun.core.annotation.NameInMap("security_group_id")
    private String securityGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("system_events_logging")
    private SystemEventsLogging systemEventsLogging;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timezone")
    private String timezone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vswitch_ids")
    private java.util.List<String> vswitchIds;

    private ModifyClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.accessControlList = builder.accessControlList;
        this.apiServerCustomCertSans = builder.apiServerCustomCertSans;
        this.apiServerEip = builder.apiServerEip;
        this.apiServerEipId = builder.apiServerEipId;
        this.clientToken = builder.clientToken;
        this.clusterName = builder.clusterName;
        this.clusterSpec = builder.clusterSpec;
        this.controlPlaneConfig = builder.controlPlaneConfig;
        this.controlPlaneEndpointsConfig = builder.controlPlaneEndpointsConfig;
        this.deletionProtection = builder.deletionProtection;
        this.enableRrsa = builder.enableRrsa;
        this.ingressDomainRebinding = builder.ingressDomainRebinding;
        this.ingressLoadbalancerId = builder.ingressLoadbalancerId;
        this.instanceDeletionProtection = builder.instanceDeletionProtection;
        this.maintenanceWindow = builder.maintenanceWindow;
        this.operationPolicy = builder.operationPolicy;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupId = builder.securityGroupId;
        this.systemEventsLogging = builder.systemEventsLogging;
        this.timezone = builder.timezone;
        this.vswitchIds = builder.vswitchIds;
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
    public java.util.List<String> getAccessControlList() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return clusterSpec
     */
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    /**
     * @return controlPlaneConfig
     */
    public ControlPlaneConfig getControlPlaneConfig() {
        return this.controlPlaneConfig;
    }

    /**
     * @return controlPlaneEndpointsConfig
     */
    public ControlPlaneEndpointsConfig getControlPlaneEndpointsConfig() {
        return this.controlPlaneEndpointsConfig;
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
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return systemEventsLogging
     */
    public SystemEventsLogging getSystemEventsLogging() {
        return this.systemEventsLogging;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * @return vswitchIds
     */
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    public static final class Builder extends Request.Builder<ModifyClusterRequest, Builder> {
        private String clusterId; 
        private java.util.List<String> accessControlList; 
        private ApiServerCustomCertSans apiServerCustomCertSans; 
        private Boolean apiServerEip; 
        private String apiServerEipId; 
        private String clientToken; 
        private String clusterName; 
        private String clusterSpec; 
        private ControlPlaneConfig controlPlaneConfig; 
        private ControlPlaneEndpointsConfig controlPlaneEndpointsConfig; 
        private Boolean deletionProtection; 
        private Boolean enableRrsa; 
        private Boolean ingressDomainRebinding; 
        private String ingressLoadbalancerId; 
        private Boolean instanceDeletionProtection; 
        private MaintenanceWindow maintenanceWindow; 
        private OperationPolicy operationPolicy; 
        private String resourceGroupId; 
        private String securityGroupId; 
        private SystemEventsLogging systemEventsLogging; 
        private String timezone; 
        private java.util.List<String> vswitchIds; 

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
            this.clientToken = request.clientToken;
            this.clusterName = request.clusterName;
            this.clusterSpec = request.clusterSpec;
            this.controlPlaneConfig = request.controlPlaneConfig;
            this.controlPlaneEndpointsConfig = request.controlPlaneEndpointsConfig;
            this.deletionProtection = request.deletionProtection;
            this.enableRrsa = request.enableRrsa;
            this.ingressDomainRebinding = request.ingressDomainRebinding;
            this.ingressLoadbalancerId = request.ingressLoadbalancerId;
            this.instanceDeletionProtection = request.instanceDeletionProtection;
            this.maintenanceWindow = request.maintenanceWindow;
            this.operationPolicy = request.operationPolicy;
            this.resourceGroupId = request.resourceGroupId;
            this.securityGroupId = request.securityGroupId;
            this.systemEventsLogging = request.systemEventsLogging;
            this.timezone = request.timezone;
            this.vswitchIds = request.vswitchIds;
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
         * <p>The access control list (ACL) for the API server SLB of a registered cluster.</p>
         */
        public Builder accessControlList(java.util.List<String> accessControlList) {
            this.putBodyParameter("access_control_list", accessControlList);
            this.accessControlList = accessControlList;
            return this;
        }

        /**
         * <p>The custom API server certificate Subject Alternative Names (SANs). This parameter adds custom IP addresses or domain names to the SAN field of the cluster API server certificate for client access control.</p>
         * <p>Only managed clusters support this parameter.</p>
         */
        public Builder apiServerCustomCertSans(ApiServerCustomCertSans apiServerCustomCertSans) {
            this.putBodyParameter("api_server_custom_cert_sans", apiServerCustomCertSans);
            this.apiServerCustomCertSans = apiServerCustomCertSans;
            return this;
        }

        /**
         * <p>Specifies whether the cluster is attached with an EIP for public network access to the API server. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The cluster is attached with an EIP.</li>
         * <li><code>false</code>: The cluster is not attached with an EIP.</li>
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
         * <p>The instance ID of the EIP attached to the cluster API server. This parameter takes effect only when <code>api_server_eip</code> is set to <code>true</code>.</p>
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
         * <p>The client token.</p>
         * 
         * <strong>example:</strong>
         * <p>af31042c-6355-495b-b6e3-exxb9669</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("client_token", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The custom cluster name. The name must be 1 to 63 characters in length and can contain digits, Chinese characters, letters, and hyphens (-). It cannot start with a hyphen (-).</p>
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
         * <p>The cluster specification when <code>cluster_type</code> is set to <code>ManagedKubernetes</code> and <code>profile</code> is configured. Valid values:</p>
         * <ul>
         * <li><code>ack.pro.small</code>: Pro</li>
         * <li><code>ack.pro.xlarge</code>: Pro XL</li>
         * <li><code>ack.pro.2xlarge</code>: Pro 2XL</li>
         * <li><code>ack.pro.4xlarge</code>: Pro 4XL (contact customer service to be added to the whitelist)</li>
         * </ul>
         * <p>Pro XL, Pro 2XL, and Pro 4XL are three tiers provided by &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro Provisioned Control Plane</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro Provisioned Control Plane</a>. By pre-allocating and dedicating control plane resources, these tiers ensure that API concurrency and pod scheduling capabilities remain at a consistently high level. They are suitable for AI training and inference, ultra-large-scale clusters, and mission-critical workloads.</p>
         * <p>For information about the cluster management fees for Pro and Provisioned Control Plane editions, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ack.pro.small</p>
         */
        public Builder clusterSpec(String clusterSpec) {
            this.putBodyParameter("cluster_spec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * <p>The control plane configuration for dedicated clusters.</p>
         */
        public Builder controlPlaneConfig(ControlPlaneConfig controlPlaneConfig) {
            this.putBodyParameter("control_plane_config", controlPlaneConfig);
            this.controlPlaneConfig = controlPlaneConfig;
            return this;
        }

        /**
         * <p>The cluster connection configuration.</p>
         */
        public Builder controlPlaneEndpointsConfig(ControlPlaneEndpointsConfig controlPlaneEndpointsConfig) {
            this.putBodyParameter("control_plane_endpoints_config", controlPlaneEndpointsConfig);
            this.controlPlaneEndpointsConfig = controlPlaneEndpointsConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable deletion protection for the cluster. This prevents accidental deletion of the cluster through the console or API. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables cluster deletion protection. The cluster cannot be deleted through the console or API.</li>
         * <li><code>false</code>: Disables cluster deletion protection. The cluster can be deleted through the console or API.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putBodyParameter("deletion_protection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>Specifies whether to enable or disable the RRSA feature. Only managed clusters support this parameter. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enable.</li>
         * <li><code>false</code>: Disable.</li>
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
         * <p>Specifies whether to rebind the test domain name of the cluster. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Rebinds the test domain name of the cluster.</li>
         * <li><code>false</code>: Does not rebind the test domain name of the cluster.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder ingressDomainRebinding(Boolean ingressDomainRebinding) {
            this.putBodyParameter("ingress_domain_rebinding", ingressDomainRebinding);
            this.ingressDomainRebinding = ingressDomainRebinding;
            return this;
        }

        /**
         * <p>The instance ID of the SLB for the cluster to be modified.</p>
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
         * <p>Specifies whether to enable instance deletion protection. This prevents accidental deletion of nodes through the console or API. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Nodes cannot be accidentally deleted through the console or API.</li>
         * <li><code>false</code>: Nodes can be deleted through the console or API.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder instanceDeletionProtection(Boolean instanceDeletionProtection) {
            this.putBodyParameter("instance_deletion_protection", instanceDeletionProtection);
            this.instanceDeletionProtection = instanceDeletionProtection;
            return this;
        }

        /**
         * <p>The O&amp;M window configuration for the cluster. This feature takes effect only in ACK Pro managed clusters.</p>
         */
        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.putBodyParameter("maintenance_window", maintenanceWindow);
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * <p>The automatic O&amp;M policy for the cluster.</p>
         */
        public Builder operationPolicy(OperationPolicy operationPolicy) {
            this.putBodyParameter("operation_policy", operationPolicy);
            this.operationPolicy = operationPolicy;
            return this;
        }

        /**
         * <p>The resource group ID of the cluster.</p>
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
         * <p>The control plane security group ID.</p>
         * <ul>
         * <li>If you have configured blocking rules in the security group, make sure the security group rules allow the protocols and ports that the cluster depends on. For the recommended security group rule scope, see <a href="https://help.aliyun.com/document_detail/353191.html">Configure and manage cluster security groups</a>.</li>
         * <li>For non-ACK dedicated clusters, the cluster control plane and installed managed components (such as terway-controlplane) will briefly restart during the cluster management procedure. Perform this operation during off-peak hours. After the control plane security group is changed, the elastic network interfaces (ENIs) used by the cluster control plane and installed managed components are automatically added to the new security group.</li>
         * <li>For ACK dedicated clusters, after the control plane security group is changed, newly scaled-out master nodes automatically apply the new control plane security group. Existing control plane nodes are not affected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1h6rk3pgct2a08***</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putBodyParameter("security_group_id", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The system event storage configuration.</p>
         */
        public Builder systemEventsLogging(SystemEventsLogging systemEventsLogging) {
            this.putBodyParameter("system_events_logging", systemEventsLogging);
            this.systemEventsLogging = systemEventsLogging;
            return this;
        }

        /**
         * <p>The cluster time zone. See <a href="https://help.aliyun.com/document_detail/354879.html">Supported time zones</a>.</p>
         * <ul>
         * <li><p>After the time zone is changed, the cluster inspection configuration uses the new time zone settings.</p>
         * </li>
         * <li><p>For managed clusters, the cluster control plane and installed managed components (such as terway-controlplane) will briefly restart during the change. Perform this operation during off-peak hours. After the time zone is changed, newly scaled-out nodes automatically apply the new time zone settings. Existing nodes are not affected. You can use the node pool node reset feature to apply the new settings to existing nodes.</p>
         * </li>
         * <li><p>For dedicated clusters, after the time zone is changed, newly scaled-out nodes (including control plane nodes) automatically apply the new time zone settings. Existing nodes (including control plane nodes) are not affected. You can use the node pool node reset feature to apply the new settings to existing nodes. For control plane nodes, you need to scale out and then scale in to apply the settings to all control plane nodes.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        public Builder timezone(String timezone) {
            this.putBodyParameter("timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        /**
         * <p>The control plane vSwitches of the cluster. For dedicated clusters, the change applies to newly scaled-out control plane nodes. For managed clusters, note the following when changing control plane vSwitches:</p>
         * <ul>
         * <li>This parameter performs an overwrite update. You must specify the complete target vSwitch list.</li>
         * <li>Control plane components will briefly restart during the change. Proceed with caution.</li>
         * <li>Make sure all security groups of the cluster (including the control plane security group, security groups of all node pools, and security groups used by the container network) allow inbound and outbound traffic for the IP CIDR blocks of the new vSwitches. This prevents nodes and containers from being unable to connect to the API server.</li>
         * <li>If the new control plane vSwitches have ACL rules configured, make sure the ACL rules allow communication with the IP CIDR blocks of cluster nodes and the container network.</li>
         * </ul>
         */
        public Builder vswitchIds(java.util.List<String> vswitchIds) {
            this.putBodyParameter("vswitch_ids", vswitchIds);
            this.vswitchIds = vswitchIds;
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
        private java.util.List<String> subjectAlternativeNames;

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
        public java.util.List<String> getSubjectAlternativeNames() {
            return this.subjectAlternativeNames;
        }

        public static final class Builder {
            private String action; 
            private java.util.List<String> subjectAlternativeNames; 

            private Builder() {
            } 

            private Builder(ApiServerCustomCertSans model) {
                this.action = model.action;
                this.subjectAlternativeNames = model.subjectAlternativeNames;
            } 

            /**
             * <p>Specifies whether to overwrite or append the SAN configuration. Valid values:</p>
             * <ul>
             * <li>overwrite: overwrites the existing SAN configuration.</li>
             * <li>append: appends to the existing SAN configuration.</li>
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
             * <p>The SAN list.</p>
             */
            public Builder subjectAlternativeNames(java.util.List<String> subjectAlternativeNames) {
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
    public static class ControlPlaneConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auto_renew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("auto_renew_period")
        private Long autoRenewPeriod;

        @com.aliyun.core.annotation.NameInMap("charge_type")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("cloud_monitor_flags")
        private Boolean cloudMonitorFlags;

        @com.aliyun.core.annotation.NameInMap("cpu_policy")
        private String cpuPolicy;

        @com.aliyun.core.annotation.NameInMap("deploymentset_id")
        private String deploymentsetId;

        @com.aliyun.core.annotation.NameInMap("image_id")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("image_type")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("instance_types")
        private java.util.List<String> instanceTypes;

        @com.aliyun.core.annotation.NameInMap("key_pair")
        private String keyPair;

        @com.aliyun.core.annotation.NameInMap("login_password")
        private String loginPassword;

        @com.aliyun.core.annotation.NameInMap("node_port_range")
        private String nodePortRange;

        @com.aliyun.core.annotation.NameInMap("period")
        private Long period;

        @com.aliyun.core.annotation.NameInMap("period_unit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("runtime")
        private String runtime;

        @com.aliyun.core.annotation.NameInMap("security_hardening_os")
        private Boolean securityHardeningOs;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("soc_enabled")
        private Boolean socEnabled;

        @com.aliyun.core.annotation.NameInMap("system_disk_bursting_enabled")
        private Boolean systemDiskBurstingEnabled;

        @com.aliyun.core.annotation.NameInMap("system_disk_category")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("system_disk_performance_level")
        private String systemDiskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("system_disk_provisioned_iops")
        private Long systemDiskProvisionedIops;

        @com.aliyun.core.annotation.NameInMap("system_disk_size")
        private Long systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("system_disk_snapshot_policy_id")
        private String systemDiskSnapshotPolicyId;

        private ControlPlaneConfig(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.autoRenewPeriod = builder.autoRenewPeriod;
            this.chargeType = builder.chargeType;
            this.cloudMonitorFlags = builder.cloudMonitorFlags;
            this.cpuPolicy = builder.cpuPolicy;
            this.deploymentsetId = builder.deploymentsetId;
            this.imageId = builder.imageId;
            this.imageType = builder.imageType;
            this.instanceTypes = builder.instanceTypes;
            this.keyPair = builder.keyPair;
            this.loginPassword = builder.loginPassword;
            this.nodePortRange = builder.nodePortRange;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.runtime = builder.runtime;
            this.securityHardeningOs = builder.securityHardeningOs;
            this.size = builder.size;
            this.socEnabled = builder.socEnabled;
            this.systemDiskBurstingEnabled = builder.systemDiskBurstingEnabled;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
            this.systemDiskProvisionedIops = builder.systemDiskProvisionedIops;
            this.systemDiskSize = builder.systemDiskSize;
            this.systemDiskSnapshotPolicyId = builder.systemDiskSnapshotPolicyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlPlaneConfig create() {
            return builder().build();
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return autoRenewPeriod
         */
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return cloudMonitorFlags
         */
        public Boolean getCloudMonitorFlags() {
            return this.cloudMonitorFlags;
        }

        /**
         * @return cpuPolicy
         */
        public String getCpuPolicy() {
            return this.cpuPolicy;
        }

        /**
         * @return deploymentsetId
         */
        public String getDeploymentsetId() {
            return this.deploymentsetId;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return instanceTypes
         */
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        /**
         * @return keyPair
         */
        public String getKeyPair() {
            return this.keyPair;
        }

        /**
         * @return loginPassword
         */
        public String getLoginPassword() {
            return this.loginPassword;
        }

        /**
         * @return nodePortRange
         */
        public String getNodePortRange() {
            return this.nodePortRange;
        }

        /**
         * @return period
         */
        public Long getPeriod() {
            return this.period;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return runtime
         */
        public String getRuntime() {
            return this.runtime;
        }

        /**
         * @return securityHardeningOs
         */
        public Boolean getSecurityHardeningOs() {
            return this.securityHardeningOs;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return socEnabled
         */
        public Boolean getSocEnabled() {
            return this.socEnabled;
        }

        /**
         * @return systemDiskBurstingEnabled
         */
        public Boolean getSystemDiskBurstingEnabled() {
            return this.systemDiskBurstingEnabled;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskPerformanceLevel
         */
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        /**
         * @return systemDiskProvisionedIops
         */
        public Long getSystemDiskProvisionedIops() {
            return this.systemDiskProvisionedIops;
        }

        /**
         * @return systemDiskSize
         */
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return systemDiskSnapshotPolicyId
         */
        public String getSystemDiskSnapshotPolicyId() {
            return this.systemDiskSnapshotPolicyId;
        }

        public static final class Builder {
            private Boolean autoRenew; 
            private Long autoRenewPeriod; 
            private String chargeType; 
            private Boolean cloudMonitorFlags; 
            private String cpuPolicy; 
            private String deploymentsetId; 
            private String imageId; 
            private String imageType; 
            private java.util.List<String> instanceTypes; 
            private String keyPair; 
            private String loginPassword; 
            private String nodePortRange; 
            private Long period; 
            private String periodUnit; 
            private String runtime; 
            private Boolean securityHardeningOs; 
            private Long size; 
            private Boolean socEnabled; 
            private Boolean systemDiskBurstingEnabled; 
            private String systemDiskCategory; 
            private String systemDiskPerformanceLevel; 
            private Long systemDiskProvisionedIops; 
            private Long systemDiskSize; 
            private String systemDiskSnapshotPolicyId; 

            private Builder() {
            } 

            private Builder(ControlPlaneConfig model) {
                this.autoRenew = model.autoRenew;
                this.autoRenewPeriod = model.autoRenewPeriod;
                this.chargeType = model.chargeType;
                this.cloudMonitorFlags = model.cloudMonitorFlags;
                this.cpuPolicy = model.cpuPolicy;
                this.deploymentsetId = model.deploymentsetId;
                this.imageId = model.imageId;
                this.imageType = model.imageType;
                this.instanceTypes = model.instanceTypes;
                this.keyPair = model.keyPair;
                this.loginPassword = model.loginPassword;
                this.nodePortRange = model.nodePortRange;
                this.period = model.period;
                this.periodUnit = model.periodUnit;
                this.runtime = model.runtime;
                this.securityHardeningOs = model.securityHardeningOs;
                this.size = model.size;
                this.socEnabled = model.socEnabled;
                this.systemDiskBurstingEnabled = model.systemDiskBurstingEnabled;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskPerformanceLevel = model.systemDiskPerformanceLevel;
                this.systemDiskProvisionedIops = model.systemDiskProvisionedIops;
                this.systemDiskSize = model.systemDiskSize;
                this.systemDiskSnapshotPolicyId = model.systemDiskSnapshotPolicyId;
            } 

            /**
             * <p>Specifies whether to enable auto-renewal for control plane node instances. This parameter takes effect only when <code>charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Enables auto-renewal.</li>
             * <li><code>false</code>: Disables auto-renewal.</li>
             * </ul>
             * <p>Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * <p>The auto-renewal period for each renewal of control plane node instances.</p>
             * <p>Valid values: {1, 2, 3, 6, 12}. Unit: months.</p>
             * <p>Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoRenewPeriod(Long autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * <p>The billing method for control plane node instances. Valid values:</p>
             * <ul>
             * <li><code>PrePaid</code>: subscription.</li>
             * <li><code>PostPaid</code>: pay-as-you-go.</li>
             * </ul>
             * <p>Default value: <code>PostPaid</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>Specifies whether to install the CloudMonitor agent on control plane nodes. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Installs the CloudMonitor agent.</li>
             * <li><code>false</code>: Does not install the CloudMonitor agent.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cloudMonitorFlags(Boolean cloudMonitorFlags) {
                this.cloudMonitorFlags = cloudMonitorFlags;
                return this;
            }

            /**
             * <p>The CPU management policy for nodes. The following policies are supported for clusters running version 1.12.6 or later:</p>
             * <ul>
             * <li><code>static</code>: Allows pods with certain resource characteristics on the node to be granted enhanced CPU affinity and exclusivity.</li>
             * <li><code>none</code>: Uses the existing default CPU affinity scheme.</li>
             * </ul>
             * <p>Default value: <code>none</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder cpuPolicy(String cpuPolicy) {
                this.cpuPolicy = cpuPolicy;
                return this;
            }

            /**
             * <p>The deployment set ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-bp10b35imuam5amw****</p>
             */
            public Builder deploymentsetId(String deploymentsetId) {
                this.deploymentsetId = deploymentsetId;
                return this;
            }

            /**
             * <p>The custom image ID. Specify this parameter when using a custom image.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_3_x64_20G_alibase_20240819.vhd</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The operating system image type. Valid values:</p>
             * <ul>
             * <li><code>AliyunLinux3</code>: Alinux3 image.</li>
             * <li><code>Custom</code>: custom image.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AliyunLinux3</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * <p>The instance types. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>The key pair name. Specify either this parameter or <code>login_password</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>ack</p>
             */
            public Builder keyPair(String keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * <p>The SSH logon password. Specify either this parameter or <code>key_pair</code>. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. To use password-based logon, specify this parameter during scale-out.</p>
             * 
             * <strong>example:</strong>
             * <p>Ack@2000.</p>
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * <p>The node service port range. Valid port range: [30000, 65535].</p>
             * <p>Default value: 30000-32767.</p>
             * 
             * <strong>example:</strong>
             * <p>30000-32767</p>
             */
            public Builder nodePortRange(String nodePortRange) {
                this.nodePortRange = nodePortRange;
                return this;
            }

            /**
             * <p>The subscription duration for control plane node instances. This parameter takes effect and is required only when <code>charge_type</code> is set to <code>PrePaid</code>.</p>
             * <p>When <code>period_unit=Month</code>, valid values: {1, 2, 3, 6, 12, 24, 36, 48, 60}.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The billing period unit for control plane node instances. This parameter takes effect only when <code>charge_type</code> is set to <code>PrePaid</code>.</p>
             * <p><code>Month</code>: The billing period is measured in months. Currently, only months are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The container runtime name. Valid values:</p>
             * <ul>
             * <li><code>containerd</code>: Recommended. Supported by all cluster versions.</li>
             * </ul>
             * <p>Default value: containerd.</p>
             * 
             * <strong>example:</strong>
             * <p>containerd</p>
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>Specifies whether to enable Alibaba Cloud OS security hardening. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Enables Alibaba Cloud OS security hardening.</li>
             * <li><code>false</code>: Disables Alibaba Cloud OS security hardening.</li>
             * </ul>
             * <p>Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder securityHardeningOs(Boolean securityHardeningOs) {
                this.securityHardeningOs = securityHardeningOs;
                return this;
            }

            /**
             * <p>The number of control plane nodes. To scale out the control plane of a dedicated cluster, set this parameter to the target number of control plane nodes, which must be greater than the current number.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>Specifies whether to enable MLPS 2.0 security hardening. For more information, see <a href="https://help.aliyun.com/document_detail/196148.html">China Chinese ACK MLPS 2.0 security hardening</a>.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><code>true</code>: Enables MLPS 2.0 security hardening.</li>
             * <li><code>false</code>: Disables MLPS 2.0 security hardening.</li>
             * </ul>
             * <p>Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder socEnabled(Boolean socEnabled) {
                this.socEnabled = socEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to enable burst mode for the node system cloud disk. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Enabled.</li>
             * <li><code>false</code>: Disabled.</li>
             * </ul>
             * <p>This parameter is supported only when <code>system_disk_category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder systemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
                this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
                return this;
            }

            /**
             * <p>The type of the node system cloud disk. Valid values:</p>
             * <ul>
             * <li><code>cloud_efficiency</code>: ultra cloud disk.</li>
             * <li><code>cloud_ssd</code>: standard SSD.</li>
             * <li><code>cloud_essd</code>: ESSD.</li>
             * <li><code>cloud_auto</code>: ESSD AutoPL cloud disk.</li>
             * <li><code>cloud_essd_entry</code>: ESSD Entry cloud disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The performance level of the node system cloud disk. This parameter takes effect only for ESSD cloud disks. The performance level varies based on the cloud disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * <p>The provisioned read/write IOPS for the node system cloud disk. Valid values: 0 to min{50,000, 1000 × capacity - baseline performance}. Baseline performance = min{1,800 + 50 × capacity, 50,000}.</p>
             * <p>This parameter is supported only when <code>system_disk_category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder systemDiskProvisionedIops(Long systemDiskProvisionedIops) {
                this.systemDiskProvisionedIops = systemDiskProvisionedIops;
                return this;
            }

            /**
             * <p>The size of the node system cloud disk. Valid values: 40 to 500. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The ID of the automatic snapshot policy used by the node system cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-2zej1nogjvovnz4z****</p>
             */
            public Builder systemDiskSnapshotPolicyId(String systemDiskSnapshotPolicyId) {
                this.systemDiskSnapshotPolicyId = systemDiskSnapshotPolicyId;
                return this;
            }

            public ControlPlaneConfig build() {
                return new ControlPlaneConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyClusterRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterRequest</p>
     */
    public static class InternalDnsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bind_vpcs")
        private java.util.List<String> bindVpcs;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        private InternalDnsConfig(Builder builder) {
            this.bindVpcs = builder.bindVpcs;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InternalDnsConfig create() {
            return builder().build();
        }

        /**
         * @return bindVpcs
         */
        public java.util.List<String> getBindVpcs() {
            return this.bindVpcs;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private java.util.List<String> bindVpcs; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(InternalDnsConfig model) {
                this.bindVpcs = model.bindVpcs;
                this.enabled = model.enabled;
            } 

            /**
             * <p>The VPCs in which the internal domain name DNS records take effect.</p>
             */
            public Builder bindVpcs(java.util.List<String> bindVpcs) {
                this.bindVpcs = bindVpcs;
                return this;
            }

            /**
             * <p>Specifies whether to enable internal domain name access for the cluster. Valid values:</p>
             * <ul>
             * <li>true: Enables internal domain name access. Node-side components (kubelet, kube-proxy) access the API server through the internal domain name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public InternalDnsConfig build() {
                return new InternalDnsConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyClusterRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterRequest</p>
     */
    public static class LoadBalancersConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endpoint_type")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("load_balancer_id")
        private String loadBalancerId;

        private LoadBalancersConfig(Builder builder) {
            this.endpointType = builder.endpointType;
            this.loadBalancerId = builder.loadBalancerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancersConfig create() {
            return builder().build();
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public static final class Builder {
            private String endpointType; 
            private String loadBalancerId; 

            private Builder() {
            } 

            private Builder(LoadBalancersConfig model) {
                this.endpointType = model.endpointType;
                this.loadBalancerId = model.loadBalancerId;
            } 

            /**
             * <p>The endpoint type.</p>
             * 
             * <strong>example:</strong>
             * <p>public</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The SLB instance associated with the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>nlb-xxxx</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            public LoadBalancersConfig build() {
                return new LoadBalancersConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyClusterRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterRequest</p>
     */
    public static class ControlPlaneEndpointsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("internal_dns_config")
        private InternalDnsConfig internalDnsConfig;

        @com.aliyun.core.annotation.NameInMap("load_balancers_config")
        private java.util.List<LoadBalancersConfig> loadBalancersConfig;

        private ControlPlaneEndpointsConfig(Builder builder) {
            this.internalDnsConfig = builder.internalDnsConfig;
            this.loadBalancersConfig = builder.loadBalancersConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlPlaneEndpointsConfig create() {
            return builder().build();
        }

        /**
         * @return internalDnsConfig
         */
        public InternalDnsConfig getInternalDnsConfig() {
            return this.internalDnsConfig;
        }

        /**
         * @return loadBalancersConfig
         */
        public java.util.List<LoadBalancersConfig> getLoadBalancersConfig() {
            return this.loadBalancersConfig;
        }

        public static final class Builder {
            private InternalDnsConfig internalDnsConfig; 
            private java.util.List<LoadBalancersConfig> loadBalancersConfig; 

            private Builder() {
            } 

            private Builder(ControlPlaneEndpointsConfig model) {
                this.internalDnsConfig = model.internalDnsConfig;
                this.loadBalancersConfig = model.loadBalancersConfig;
            } 

            /**
             * <p>The internal domain name configuration for the cluster. This applies to ACK managed clusters. The internal domain name is used by node-side system components such as kubelet and kube-proxy to access the API server. If the internal domain name access is not enabled, node-side system components access the API server through the CLB IP address.</p>
             */
            public Builder internalDnsConfig(InternalDnsConfig internalDnsConfig) {
                this.internalDnsConfig = internalDnsConfig;
                return this;
            }

            /**
             * <p>The load balancing configuration for cluster access.</p>
             */
            public Builder loadBalancersConfig(java.util.List<LoadBalancersConfig> loadBalancersConfig) {
                this.loadBalancersConfig = loadBalancersConfig;
                return this;
            }

            public ControlPlaneEndpointsConfig build() {
                return new ControlPlaneEndpointsConfig(this);
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

            private Builder() {
            } 

            private Builder(ClusterAutoUpgrade model) {
                this.channel = model.channel;
                this.enabled = model.enabled;
            } 

            /**
             * <p>The automatic cluster upgrade frequency. For more information, see <a href="https://help.aliyun.com/document_detail/2712866.html">Upgrade frequency</a>.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>patch: The latest patch version.</li>
             * <li>stable: The second latest minor version.</li>
             * <li>rapid: The latest minor version.</li>
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
             * <p>Specifies whether to enable automatic cluster upgrade.</p>
             * <ul>
             * <li><p>true: Enables automatic upgrade.</p>
             * </li>
             * <li><p>false: Disables automatic upgrade.</p>
             * </li>
             * </ul>
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

            private Builder() {
            } 

            private Builder(OperationPolicy model) {
                this.clusterAutoUpgrade = model.clusterAutoUpgrade;
            } 

            /**
             * <p>The automatic cluster upgrade configuration.</p>
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

            private Builder() {
            } 

            private Builder(SystemEventsLogging model) {
                this.enabled = model.enabled;
                this.loggingProject = model.loggingProject;
            } 

            /**
             * <p>Specifies whether to enable system event storage.</p>
             * <ul>
             * <li><p>true: Enables system event storage.</p>
             * </li>
             * <li><p>false: Disables system event storage.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The name of the LogProject for system event storage.</p>
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
