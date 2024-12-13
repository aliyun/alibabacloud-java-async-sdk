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
    @com.aliyun.core.annotation.NameInMap("control_plane_config")
    private ControlPlaneConfig controlPlaneConfig;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vswitch_ids")
    private java.util.List < String > vswitchIds;

    private ModifyClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.accessControlList = builder.accessControlList;
        this.apiServerCustomCertSans = builder.apiServerCustomCertSans;
        this.apiServerEip = builder.apiServerEip;
        this.apiServerEipId = builder.apiServerEipId;
        this.clusterName = builder.clusterName;
        this.controlPlaneConfig = builder.controlPlaneConfig;
        this.deletionProtection = builder.deletionProtection;
        this.enableRrsa = builder.enableRrsa;
        this.ingressDomainRebinding = builder.ingressDomainRebinding;
        this.ingressLoadbalancerId = builder.ingressLoadbalancerId;
        this.instanceDeletionProtection = builder.instanceDeletionProtection;
        this.maintenanceWindow = builder.maintenanceWindow;
        this.operationPolicy = builder.operationPolicy;
        this.resourceGroupId = builder.resourceGroupId;
        this.systemEventsLogging = builder.systemEventsLogging;
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
     * @return controlPlaneConfig
     */
    public ControlPlaneConfig getControlPlaneConfig() {
        return this.controlPlaneConfig;
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

    /**
     * @return vswitchIds
     */
    public java.util.List < String > getVswitchIds() {
        return this.vswitchIds;
    }

    public static final class Builder extends Request.Builder<ModifyClusterRequest, Builder> {
        private String clusterId; 
        private java.util.List < String > accessControlList; 
        private ApiServerCustomCertSans apiServerCustomCertSans; 
        private Boolean apiServerEip; 
        private String apiServerEipId; 
        private String clusterName; 
        private ControlPlaneConfig controlPlaneConfig; 
        private Boolean deletionProtection; 
        private Boolean enableRrsa; 
        private Boolean ingressDomainRebinding; 
        private String ingressLoadbalancerId; 
        private Boolean instanceDeletionProtection; 
        private MaintenanceWindow maintenanceWindow; 
        private OperationPolicy operationPolicy; 
        private String resourceGroupId; 
        private SystemEventsLogging systemEventsLogging; 
        private java.util.List < String > vswitchIds; 

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
            this.controlPlaneConfig = request.controlPlaneConfig;
            this.deletionProtection = request.deletionProtection;
            this.enableRrsa = request.enableRrsa;
            this.ingressDomainRebinding = request.ingressDomainRebinding;
            this.ingressLoadbalancerId = request.ingressLoadbalancerId;
            this.instanceDeletionProtection = request.instanceDeletionProtection;
            this.maintenanceWindow = request.maintenanceWindow;
            this.operationPolicy = request.operationPolicy;
            this.resourceGroupId = request.resourceGroupId;
            this.systemEventsLogging = request.systemEventsLogging;
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
         * control_plane_config.
         */
        public Builder controlPlaneConfig(ControlPlaneConfig controlPlaneConfig) {
            this.putBodyParameter("control_plane_config", controlPlaneConfig);
            this.controlPlaneConfig = controlPlaneConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable cluster deletion protection. If this option is enabled, the cluster cannot be deleted in the console or by calling API operations. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables cluster deletion protection.</li>
         * <li><code>false</code>: disables cluster deletion protection.</li>
         * </ul>
         * <p>Default value: <code>false</code></p>
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
         * <p>Default value: <code>false</code></p>
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
         * <p>Default value: <code>false</code></p>
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

        /**
         * <p>The vSwitches of the control planes. This parameter can be used to change the vSwitches of the control planes in an ACK managed cluster. Take note of the following items:</p>
         * <ul>
         * <li>This parameter overwrites the existing configuration. You must specify all vSwitches of the control planes.</li>
         * <li>The control planes restart during the update process. Exercise caution when you perform this operation.</li>
         * <li>Make sure that all security groups of the cluster, including the security groups of the control planes, all node pools, and container network, are allowed to access the CIDR blocks of the new vSwitches. This ensures that the nodes and containers can connect to the API server.</li>
         * <li>If the new vSwitches of the control planes are configured with an access control list (ACL), ensure that the ACL allows communication between the new vSwitches and the CIDR blocks of cluster nodes and container networks.</li>
         * </ul>
         */
        public Builder vswitchIds(java.util.List < String > vswitchIds) {
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
        private java.util.List < String > instanceTypes;

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
        public java.util.List < String > getInstanceTypes() {
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
            private java.util.List < String > instanceTypes; 
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

            /**
             * auto_renew.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * auto_renew_period.
             */
            public Builder autoRenewPeriod(Long autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * charge_type.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * cloud_monitor_flags.
             */
            public Builder cloudMonitorFlags(Boolean cloudMonitorFlags) {
                this.cloudMonitorFlags = cloudMonitorFlags;
                return this;
            }

            /**
             * cpu_policy.
             */
            public Builder cpuPolicy(String cpuPolicy) {
                this.cpuPolicy = cpuPolicy;
                return this;
            }

            /**
             * deploymentset_id.
             */
            public Builder deploymentsetId(String deploymentsetId) {
                this.deploymentsetId = deploymentsetId;
                return this;
            }

            /**
             * image_id.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * image_type.
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * instance_types.
             */
            public Builder instanceTypes(java.util.List < String > instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * key_pair.
             */
            public Builder keyPair(String keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * login_password.
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * node_port_range.
             */
            public Builder nodePortRange(String nodePortRange) {
                this.nodePortRange = nodePortRange;
                return this;
            }

            /**
             * period.
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * period_unit.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * runtime.
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * security_hardening_os.
             */
            public Builder securityHardeningOs(Boolean securityHardeningOs) {
                this.securityHardeningOs = securityHardeningOs;
                return this;
            }

            /**
             * size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * soc_enabled.
             */
            public Builder socEnabled(Boolean socEnabled) {
                this.socEnabled = socEnabled;
                return this;
            }

            /**
             * system_disk_bursting_enabled.
             */
            public Builder systemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
                this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
                return this;
            }

            /**
             * system_disk_category.
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * system_disk_performance_level.
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * system_disk_provisioned_iops.
             */
            public Builder systemDiskProvisionedIops(Long systemDiskProvisionedIops) {
                this.systemDiskProvisionedIops = systemDiskProvisionedIops;
                return this;
            }

            /**
             * system_disk_size.
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * system_disk_snapshot_policy_id.
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
             * <p>The automatic update frequency. For more information, see <a href="https://help.aliyun.com/document_detail/2712866.html">Update frequency</a>.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>patch: specifies the latest patch version.</li>
             * <li>stables: the second-latest minor version.</li>
             * <li>rapid: the latest minor version.</li>
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
             * <p>Specifies whether to enable automatic update.</p>
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
             * <p>The configurations of automatic update.</p>
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
