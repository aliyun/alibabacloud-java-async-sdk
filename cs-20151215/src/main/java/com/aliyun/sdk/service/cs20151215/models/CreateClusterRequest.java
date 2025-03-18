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
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("access_control_list")
    private java.util.List<String> accessControlList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("addons")
    private java.util.List<Addon> addons;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("api_audiences")
    private String apiAudiences;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("auto_renew")
    @Deprecated
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("auto_renew_period")
    @Deprecated
    private Long autoRenewPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("charge_type")
    @Deprecated
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cis_enabled")
    @Deprecated
    private Boolean cisEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cloud_monitor_flags")
    @Deprecated
    private Boolean cloudMonitorFlags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cluster_domain")
    private String clusterDomain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cluster_spec")
    private String clusterSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cluster_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("container_cidr")
    private String containerCidr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("control_plane_config")
    private ControlPlaneConfig controlPlaneConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("controlplane_log_components")
    private java.util.List<String> controlplaneLogComponents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("controlplane_log_project")
    private String controlplaneLogProject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("controlplane_log_ttl")
    private String controlplaneLogTtl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cpu_policy")
    @Deprecated
    private String cpuPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("custom_san")
    private String customSan;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deletion_protection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("disable_rollback")
    @Deprecated
    private Boolean disableRollback;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enable_rrsa")
    private Boolean enableRrsa;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("encryption_provider_key")
    private String encryptionProviderKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endpoint_public_access")
    private Boolean endpointPublicAccess;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("format_disk")
    @Deprecated
    private Boolean formatDisk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image_id")
    @Deprecated
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image_type")
    @Deprecated
    private String imageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instances")
    @Deprecated
    private java.util.List<String> instances;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ip_stack")
    private String ipStack;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("is_enterprise_security_group")
    private Boolean isEnterpriseSecurityGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keep_instance_name")
    @Deprecated
    private Boolean keepInstanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("key_pair")
    @Deprecated
    private String keyPair;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kubernetes_version")
    private String kubernetesVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("load_balancer_id")
    private String loadBalancerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("load_balancer_spec")
    @Deprecated
    private String loadBalancerSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("logging_type")
    private String loggingType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("login_password")
    @Deprecated
    private String loginPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maintenance_window")
    private MaintenanceWindow maintenanceWindow;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_auto_renew")
    @Deprecated
    private Boolean masterAutoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_auto_renew_period")
    @Deprecated
    private Long masterAutoRenewPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_count")
    @Deprecated
    private Long masterCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_instance_charge_type")
    @Deprecated
    private String masterInstanceChargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_instance_types")
    @Deprecated
    private java.util.List<String> masterInstanceTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_period")
    @Deprecated
    private Long masterPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_period_unit")
    @Deprecated
    private String masterPeriodUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_system_disk_category")
    @Deprecated
    private String masterSystemDiskCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_system_disk_performance_level")
    @Deprecated
    private String masterSystemDiskPerformanceLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_system_disk_size")
    @Deprecated
    private Long masterSystemDiskSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_system_disk_snapshot_policy_id")
    @Deprecated
    private String masterSystemDiskSnapshotPolicyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_vswitch_ids")
    @Deprecated
    private java.util.List<String> masterVswitchIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nat_gateway")
    private Boolean natGateway;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("node_cidr_mask")
    private String nodeCidrMask;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("node_name_mode")
    @Deprecated
    private String nodeNameMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("node_port_range")
    private String nodePortRange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodepools")
    private java.util.List<Nodepool> nodepools;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("num_of_nodes")
    @Deprecated
    private Long numOfNodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operation_policy")
    private OperationPolicy operationPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("os_type")
    @Deprecated
    private String osType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("period")
    @Deprecated
    private Long period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("period_unit")
    @Deprecated
    private String periodUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("platform")
    @Deprecated
    private String platform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pod_vswitch_ids")
    private java.util.List<String> podVswitchIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("profile")
    private String profile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("proxy_mode")
    private String proxyMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rds_instances")
    @Deprecated
    private java.util.List<String> rdsInstances;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("region_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resource_group_id")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("runtime")
    private Runtime runtime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("security_group_id")
    private String securityGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("security_hardening_os")
    @Deprecated
    private Boolean securityHardeningOs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("service_account_issuer")
    private String serviceAccountIssuer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("service_cidr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCidr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("service_discovery_types")
    private java.util.List<String> serviceDiscoveryTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("snat_entry")
    private Boolean snatEntry;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("soc_enabled")
    @Deprecated
    private Boolean socEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ssh_flags")
    private Boolean sshFlags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tag> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taints")
    @Deprecated
    private java.util.List<Taint> taints;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timeout_mins")
    @Deprecated
    private Long timeoutMins;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timezone")
    private String timezone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_ca")
    private String userCa;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_data")
    private String userData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vpcid")
    private String vpcid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vswitch_ids")
    private java.util.List<String> vswitchIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_auto_renew")
    @Deprecated
    private Boolean workerAutoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_auto_renew_period")
    @Deprecated
    private Long workerAutoRenewPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_data_disks")
    @Deprecated
    private java.util.List<WorkerDataDisks> workerDataDisks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_instance_charge_type")
    @Deprecated
    private String workerInstanceChargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_instance_types")
    @Deprecated
    private java.util.List<String> workerInstanceTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_period")
    @Deprecated
    private Long workerPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_period_unit")
    @Deprecated
    private String workerPeriodUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_system_disk_category")
    @Deprecated
    private String workerSystemDiskCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_system_disk_performance_level")
    @Deprecated
    private String workerSystemDiskPerformanceLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_system_disk_size")
    @Deprecated
    private Long workerSystemDiskSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_system_disk_snapshot_policy_id")
    @Deprecated
    private String workerSystemDiskSnapshotPolicyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_vswitch_ids")
    @Deprecated
    private java.util.List<String> workerVswitchIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("zone_id")
    @Deprecated
    private String zoneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("zone_ids")
    private java.util.List<String> zoneIds;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.accessControlList = builder.accessControlList;
        this.addons = builder.addons;
        this.apiAudiences = builder.apiAudiences;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.chargeType = builder.chargeType;
        this.cisEnabled = builder.cisEnabled;
        this.cloudMonitorFlags = builder.cloudMonitorFlags;
        this.clusterDomain = builder.clusterDomain;
        this.clusterSpec = builder.clusterSpec;
        this.clusterType = builder.clusterType;
        this.containerCidr = builder.containerCidr;
        this.controlPlaneConfig = builder.controlPlaneConfig;
        this.controlplaneLogComponents = builder.controlplaneLogComponents;
        this.controlplaneLogProject = builder.controlplaneLogProject;
        this.controlplaneLogTtl = builder.controlplaneLogTtl;
        this.cpuPolicy = builder.cpuPolicy;
        this.customSan = builder.customSan;
        this.deletionProtection = builder.deletionProtection;
        this.disableRollback = builder.disableRollback;
        this.enableRrsa = builder.enableRrsa;
        this.encryptionProviderKey = builder.encryptionProviderKey;
        this.endpointPublicAccess = builder.endpointPublicAccess;
        this.formatDisk = builder.formatDisk;
        this.imageId = builder.imageId;
        this.imageType = builder.imageType;
        this.instances = builder.instances;
        this.ipStack = builder.ipStack;
        this.isEnterpriseSecurityGroup = builder.isEnterpriseSecurityGroup;
        this.keepInstanceName = builder.keepInstanceName;
        this.keyPair = builder.keyPair;
        this.kubernetesVersion = builder.kubernetesVersion;
        this.loadBalancerId = builder.loadBalancerId;
        this.loadBalancerSpec = builder.loadBalancerSpec;
        this.loggingType = builder.loggingType;
        this.loginPassword = builder.loginPassword;
        this.maintenanceWindow = builder.maintenanceWindow;
        this.masterAutoRenew = builder.masterAutoRenew;
        this.masterAutoRenewPeriod = builder.masterAutoRenewPeriod;
        this.masterCount = builder.masterCount;
        this.masterInstanceChargeType = builder.masterInstanceChargeType;
        this.masterInstanceTypes = builder.masterInstanceTypes;
        this.masterPeriod = builder.masterPeriod;
        this.masterPeriodUnit = builder.masterPeriodUnit;
        this.masterSystemDiskCategory = builder.masterSystemDiskCategory;
        this.masterSystemDiskPerformanceLevel = builder.masterSystemDiskPerformanceLevel;
        this.masterSystemDiskSize = builder.masterSystemDiskSize;
        this.masterSystemDiskSnapshotPolicyId = builder.masterSystemDiskSnapshotPolicyId;
        this.masterVswitchIds = builder.masterVswitchIds;
        this.name = builder.name;
        this.natGateway = builder.natGateway;
        this.nodeCidrMask = builder.nodeCidrMask;
        this.nodeNameMode = builder.nodeNameMode;
        this.nodePortRange = builder.nodePortRange;
        this.nodepools = builder.nodepools;
        this.numOfNodes = builder.numOfNodes;
        this.operationPolicy = builder.operationPolicy;
        this.osType = builder.osType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.platform = builder.platform;
        this.podVswitchIds = builder.podVswitchIds;
        this.profile = builder.profile;
        this.proxyMode = builder.proxyMode;
        this.rdsInstances = builder.rdsInstances;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.runtime = builder.runtime;
        this.securityGroupId = builder.securityGroupId;
        this.securityHardeningOs = builder.securityHardeningOs;
        this.serviceAccountIssuer = builder.serviceAccountIssuer;
        this.serviceCidr = builder.serviceCidr;
        this.serviceDiscoveryTypes = builder.serviceDiscoveryTypes;
        this.snatEntry = builder.snatEntry;
        this.socEnabled = builder.socEnabled;
        this.sshFlags = builder.sshFlags;
        this.tags = builder.tags;
        this.taints = builder.taints;
        this.timeoutMins = builder.timeoutMins;
        this.timezone = builder.timezone;
        this.userCa = builder.userCa;
        this.userData = builder.userData;
        this.vpcid = builder.vpcid;
        this.vswitchIds = builder.vswitchIds;
        this.workerAutoRenew = builder.workerAutoRenew;
        this.workerAutoRenewPeriod = builder.workerAutoRenewPeriod;
        this.workerDataDisks = builder.workerDataDisks;
        this.workerInstanceChargeType = builder.workerInstanceChargeType;
        this.workerInstanceTypes = builder.workerInstanceTypes;
        this.workerPeriod = builder.workerPeriod;
        this.workerPeriodUnit = builder.workerPeriodUnit;
        this.workerSystemDiskCategory = builder.workerSystemDiskCategory;
        this.workerSystemDiskPerformanceLevel = builder.workerSystemDiskPerformanceLevel;
        this.workerSystemDiskSize = builder.workerSystemDiskSize;
        this.workerSystemDiskSnapshotPolicyId = builder.workerSystemDiskSnapshotPolicyId;
        this.workerVswitchIds = builder.workerVswitchIds;
        this.zoneId = builder.zoneId;
        this.zoneIds = builder.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessControlList
     */
    public java.util.List<String> getAccessControlList() {
        return this.accessControlList;
    }

    /**
     * @return addons
     */
    public java.util.List<Addon> getAddons() {
        return this.addons;
    }

    /**
     * @return apiAudiences
     */
    public String getApiAudiences() {
        return this.apiAudiences;
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
     * @return cisEnabled
     */
    public Boolean getCisEnabled() {
        return this.cisEnabled;
    }

    /**
     * @return cloudMonitorFlags
     */
    public Boolean getCloudMonitorFlags() {
        return this.cloudMonitorFlags;
    }

    /**
     * @return clusterDomain
     */
    public String getClusterDomain() {
        return this.clusterDomain;
    }

    /**
     * @return clusterSpec
     */
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return containerCidr
     */
    public String getContainerCidr() {
        return this.containerCidr;
    }

    /**
     * @return controlPlaneConfig
     */
    public ControlPlaneConfig getControlPlaneConfig() {
        return this.controlPlaneConfig;
    }

    /**
     * @return controlplaneLogComponents
     */
    public java.util.List<String> getControlplaneLogComponents() {
        return this.controlplaneLogComponents;
    }

    /**
     * @return controlplaneLogProject
     */
    public String getControlplaneLogProject() {
        return this.controlplaneLogProject;
    }

    /**
     * @return controlplaneLogTtl
     */
    public String getControlplaneLogTtl() {
        return this.controlplaneLogTtl;
    }

    /**
     * @return cpuPolicy
     */
    public String getCpuPolicy() {
        return this.cpuPolicy;
    }

    /**
     * @return customSan
     */
    public String getCustomSan() {
        return this.customSan;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return disableRollback
     */
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    /**
     * @return enableRrsa
     */
    public Boolean getEnableRrsa() {
        return this.enableRrsa;
    }

    /**
     * @return encryptionProviderKey
     */
    public String getEncryptionProviderKey() {
        return this.encryptionProviderKey;
    }

    /**
     * @return endpointPublicAccess
     */
    public Boolean getEndpointPublicAccess() {
        return this.endpointPublicAccess;
    }

    /**
     * @return formatDisk
     */
    public Boolean getFormatDisk() {
        return this.formatDisk;
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
     * @return instances
     */
    public java.util.List<String> getInstances() {
        return this.instances;
    }

    /**
     * @return ipStack
     */
    public String getIpStack() {
        return this.ipStack;
    }

    /**
     * @return isEnterpriseSecurityGroup
     */
    public Boolean getIsEnterpriseSecurityGroup() {
        return this.isEnterpriseSecurityGroup;
    }

    /**
     * @return keepInstanceName
     */
    public Boolean getKeepInstanceName() {
        return this.keepInstanceName;
    }

    /**
     * @return keyPair
     */
    public String getKeyPair() {
        return this.keyPair;
    }

    /**
     * @return kubernetesVersion
     */
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return loadBalancerSpec
     */
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

    /**
     * @return loggingType
     */
    public String getLoggingType() {
        return this.loggingType;
    }

    /**
     * @return loginPassword
     */
    public String getLoginPassword() {
        return this.loginPassword;
    }

    /**
     * @return maintenanceWindow
     */
    public MaintenanceWindow getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * @return masterAutoRenew
     */
    public Boolean getMasterAutoRenew() {
        return this.masterAutoRenew;
    }

    /**
     * @return masterAutoRenewPeriod
     */
    public Long getMasterAutoRenewPeriod() {
        return this.masterAutoRenewPeriod;
    }

    /**
     * @return masterCount
     */
    public Long getMasterCount() {
        return this.masterCount;
    }

    /**
     * @return masterInstanceChargeType
     */
    public String getMasterInstanceChargeType() {
        return this.masterInstanceChargeType;
    }

    /**
     * @return masterInstanceTypes
     */
    public java.util.List<String> getMasterInstanceTypes() {
        return this.masterInstanceTypes;
    }

    /**
     * @return masterPeriod
     */
    public Long getMasterPeriod() {
        return this.masterPeriod;
    }

    /**
     * @return masterPeriodUnit
     */
    public String getMasterPeriodUnit() {
        return this.masterPeriodUnit;
    }

    /**
     * @return masterSystemDiskCategory
     */
    public String getMasterSystemDiskCategory() {
        return this.masterSystemDiskCategory;
    }

    /**
     * @return masterSystemDiskPerformanceLevel
     */
    public String getMasterSystemDiskPerformanceLevel() {
        return this.masterSystemDiskPerformanceLevel;
    }

    /**
     * @return masterSystemDiskSize
     */
    public Long getMasterSystemDiskSize() {
        return this.masterSystemDiskSize;
    }

    /**
     * @return masterSystemDiskSnapshotPolicyId
     */
    public String getMasterSystemDiskSnapshotPolicyId() {
        return this.masterSystemDiskSnapshotPolicyId;
    }

    /**
     * @return masterVswitchIds
     */
    public java.util.List<String> getMasterVswitchIds() {
        return this.masterVswitchIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return natGateway
     */
    public Boolean getNatGateway() {
        return this.natGateway;
    }

    /**
     * @return nodeCidrMask
     */
    public String getNodeCidrMask() {
        return this.nodeCidrMask;
    }

    /**
     * @return nodeNameMode
     */
    public String getNodeNameMode() {
        return this.nodeNameMode;
    }

    /**
     * @return nodePortRange
     */
    public String getNodePortRange() {
        return this.nodePortRange;
    }

    /**
     * @return nodepools
     */
    public java.util.List<Nodepool> getNodepools() {
        return this.nodepools;
    }

    /**
     * @return numOfNodes
     */
    public Long getNumOfNodes() {
        return this.numOfNodes;
    }

    /**
     * @return operationPolicy
     */
    public OperationPolicy getOperationPolicy() {
        return this.operationPolicy;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
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
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return podVswitchIds
     */
    public java.util.List<String> getPodVswitchIds() {
        return this.podVswitchIds;
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * @return proxyMode
     */
    public String getProxyMode() {
        return this.proxyMode;
    }

    /**
     * @return rdsInstances
     */
    public java.util.List<String> getRdsInstances() {
        return this.rdsInstances;
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
     * @return runtime
     */
    public Runtime getRuntime() {
        return this.runtime;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return securityHardeningOs
     */
    public Boolean getSecurityHardeningOs() {
        return this.securityHardeningOs;
    }

    /**
     * @return serviceAccountIssuer
     */
    public String getServiceAccountIssuer() {
        return this.serviceAccountIssuer;
    }

    /**
     * @return serviceCidr
     */
    public String getServiceCidr() {
        return this.serviceCidr;
    }

    /**
     * @return serviceDiscoveryTypes
     */
    public java.util.List<String> getServiceDiscoveryTypes() {
        return this.serviceDiscoveryTypes;
    }

    /**
     * @return snatEntry
     */
    public Boolean getSnatEntry() {
        return this.snatEntry;
    }

    /**
     * @return socEnabled
     */
    public Boolean getSocEnabled() {
        return this.socEnabled;
    }

    /**
     * @return sshFlags
     */
    public Boolean getSshFlags() {
        return this.sshFlags;
    }

    /**
     * @return tags
     */
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    /**
     * @return taints
     */
    public java.util.List<Taint> getTaints() {
        return this.taints;
    }

    /**
     * @return timeoutMins
     */
    public Long getTimeoutMins() {
        return this.timeoutMins;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * @return userCa
     */
    public String getUserCa() {
        return this.userCa;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return vpcid
     */
    public String getVpcid() {
        return this.vpcid;
    }

    /**
     * @return vswitchIds
     */
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    /**
     * @return workerAutoRenew
     */
    public Boolean getWorkerAutoRenew() {
        return this.workerAutoRenew;
    }

    /**
     * @return workerAutoRenewPeriod
     */
    public Long getWorkerAutoRenewPeriod() {
        return this.workerAutoRenewPeriod;
    }

    /**
     * @return workerDataDisks
     */
    public java.util.List<WorkerDataDisks> getWorkerDataDisks() {
        return this.workerDataDisks;
    }

    /**
     * @return workerInstanceChargeType
     */
    public String getWorkerInstanceChargeType() {
        return this.workerInstanceChargeType;
    }

    /**
     * @return workerInstanceTypes
     */
    public java.util.List<String> getWorkerInstanceTypes() {
        return this.workerInstanceTypes;
    }

    /**
     * @return workerPeriod
     */
    public Long getWorkerPeriod() {
        return this.workerPeriod;
    }

    /**
     * @return workerPeriodUnit
     */
    public String getWorkerPeriodUnit() {
        return this.workerPeriodUnit;
    }

    /**
     * @return workerSystemDiskCategory
     */
    public String getWorkerSystemDiskCategory() {
        return this.workerSystemDiskCategory;
    }

    /**
     * @return workerSystemDiskPerformanceLevel
     */
    public String getWorkerSystemDiskPerformanceLevel() {
        return this.workerSystemDiskPerformanceLevel;
    }

    /**
     * @return workerSystemDiskSize
     */
    public Long getWorkerSystemDiskSize() {
        return this.workerSystemDiskSize;
    }

    /**
     * @return workerSystemDiskSnapshotPolicyId
     */
    public String getWorkerSystemDiskSnapshotPolicyId() {
        return this.workerSystemDiskSnapshotPolicyId;
    }

    /**
     * @return workerVswitchIds
     */
    public java.util.List<String> getWorkerVswitchIds() {
        return this.workerVswitchIds;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return zoneIds
     */
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private java.util.List<String> accessControlList; 
        private java.util.List<Addon> addons; 
        private String apiAudiences; 
        private Boolean autoRenew; 
        private Long autoRenewPeriod; 
        private String chargeType; 
        private Boolean cisEnabled; 
        private Boolean cloudMonitorFlags; 
        private String clusterDomain; 
        private String clusterSpec; 
        private String clusterType; 
        private String containerCidr; 
        private ControlPlaneConfig controlPlaneConfig; 
        private java.util.List<String> controlplaneLogComponents; 
        private String controlplaneLogProject; 
        private String controlplaneLogTtl; 
        private String cpuPolicy; 
        private String customSan; 
        private Boolean deletionProtection; 
        private Boolean disableRollback; 
        private Boolean enableRrsa; 
        private String encryptionProviderKey; 
        private Boolean endpointPublicAccess; 
        private Boolean formatDisk; 
        private String imageId; 
        private String imageType; 
        private java.util.List<String> instances; 
        private String ipStack; 
        private Boolean isEnterpriseSecurityGroup; 
        private Boolean keepInstanceName; 
        private String keyPair; 
        private String kubernetesVersion; 
        private String loadBalancerId; 
        private String loadBalancerSpec; 
        private String loggingType; 
        private String loginPassword; 
        private MaintenanceWindow maintenanceWindow; 
        private Boolean masterAutoRenew; 
        private Long masterAutoRenewPeriod; 
        private Long masterCount; 
        private String masterInstanceChargeType; 
        private java.util.List<String> masterInstanceTypes; 
        private Long masterPeriod; 
        private String masterPeriodUnit; 
        private String masterSystemDiskCategory; 
        private String masterSystemDiskPerformanceLevel; 
        private Long masterSystemDiskSize; 
        private String masterSystemDiskSnapshotPolicyId; 
        private java.util.List<String> masterVswitchIds; 
        private String name; 
        private Boolean natGateway; 
        private String nodeCidrMask; 
        private String nodeNameMode; 
        private String nodePortRange; 
        private java.util.List<Nodepool> nodepools; 
        private Long numOfNodes; 
        private OperationPolicy operationPolicy; 
        private String osType; 
        private Long period; 
        private String periodUnit; 
        private String platform; 
        private java.util.List<String> podVswitchIds; 
        private String profile; 
        private String proxyMode; 
        private java.util.List<String> rdsInstances; 
        private String regionId; 
        private String resourceGroupId; 
        private Runtime runtime; 
        private String securityGroupId; 
        private Boolean securityHardeningOs; 
        private String serviceAccountIssuer; 
        private String serviceCidr; 
        private java.util.List<String> serviceDiscoveryTypes; 
        private Boolean snatEntry; 
        private Boolean socEnabled; 
        private Boolean sshFlags; 
        private java.util.List<Tag> tags; 
        private java.util.List<Taint> taints; 
        private Long timeoutMins; 
        private String timezone; 
        private String userCa; 
        private String userData; 
        private String vpcid; 
        private java.util.List<String> vswitchIds; 
        private Boolean workerAutoRenew; 
        private Long workerAutoRenewPeriod; 
        private java.util.List<WorkerDataDisks> workerDataDisks; 
        private String workerInstanceChargeType; 
        private java.util.List<String> workerInstanceTypes; 
        private Long workerPeriod; 
        private String workerPeriodUnit; 
        private String workerSystemDiskCategory; 
        private String workerSystemDiskPerformanceLevel; 
        private Long workerSystemDiskSize; 
        private String workerSystemDiskSnapshotPolicyId; 
        private java.util.List<String> workerVswitchIds; 
        private String zoneId; 
        private java.util.List<String> zoneIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.accessControlList = request.accessControlList;
            this.addons = request.addons;
            this.apiAudiences = request.apiAudiences;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.chargeType = request.chargeType;
            this.cisEnabled = request.cisEnabled;
            this.cloudMonitorFlags = request.cloudMonitorFlags;
            this.clusterDomain = request.clusterDomain;
            this.clusterSpec = request.clusterSpec;
            this.clusterType = request.clusterType;
            this.containerCidr = request.containerCidr;
            this.controlPlaneConfig = request.controlPlaneConfig;
            this.controlplaneLogComponents = request.controlplaneLogComponents;
            this.controlplaneLogProject = request.controlplaneLogProject;
            this.controlplaneLogTtl = request.controlplaneLogTtl;
            this.cpuPolicy = request.cpuPolicy;
            this.customSan = request.customSan;
            this.deletionProtection = request.deletionProtection;
            this.disableRollback = request.disableRollback;
            this.enableRrsa = request.enableRrsa;
            this.encryptionProviderKey = request.encryptionProviderKey;
            this.endpointPublicAccess = request.endpointPublicAccess;
            this.formatDisk = request.formatDisk;
            this.imageId = request.imageId;
            this.imageType = request.imageType;
            this.instances = request.instances;
            this.ipStack = request.ipStack;
            this.isEnterpriseSecurityGroup = request.isEnterpriseSecurityGroup;
            this.keepInstanceName = request.keepInstanceName;
            this.keyPair = request.keyPair;
            this.kubernetesVersion = request.kubernetesVersion;
            this.loadBalancerId = request.loadBalancerId;
            this.loadBalancerSpec = request.loadBalancerSpec;
            this.loggingType = request.loggingType;
            this.loginPassword = request.loginPassword;
            this.maintenanceWindow = request.maintenanceWindow;
            this.masterAutoRenew = request.masterAutoRenew;
            this.masterAutoRenewPeriod = request.masterAutoRenewPeriod;
            this.masterCount = request.masterCount;
            this.masterInstanceChargeType = request.masterInstanceChargeType;
            this.masterInstanceTypes = request.masterInstanceTypes;
            this.masterPeriod = request.masterPeriod;
            this.masterPeriodUnit = request.masterPeriodUnit;
            this.masterSystemDiskCategory = request.masterSystemDiskCategory;
            this.masterSystemDiskPerformanceLevel = request.masterSystemDiskPerformanceLevel;
            this.masterSystemDiskSize = request.masterSystemDiskSize;
            this.masterSystemDiskSnapshotPolicyId = request.masterSystemDiskSnapshotPolicyId;
            this.masterVswitchIds = request.masterVswitchIds;
            this.name = request.name;
            this.natGateway = request.natGateway;
            this.nodeCidrMask = request.nodeCidrMask;
            this.nodeNameMode = request.nodeNameMode;
            this.nodePortRange = request.nodePortRange;
            this.nodepools = request.nodepools;
            this.numOfNodes = request.numOfNodes;
            this.operationPolicy = request.operationPolicy;
            this.osType = request.osType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.platform = request.platform;
            this.podVswitchIds = request.podVswitchIds;
            this.profile = request.profile;
            this.proxyMode = request.proxyMode;
            this.rdsInstances = request.rdsInstances;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.runtime = request.runtime;
            this.securityGroupId = request.securityGroupId;
            this.securityHardeningOs = request.securityHardeningOs;
            this.serviceAccountIssuer = request.serviceAccountIssuer;
            this.serviceCidr = request.serviceCidr;
            this.serviceDiscoveryTypes = request.serviceDiscoveryTypes;
            this.snatEntry = request.snatEntry;
            this.socEnabled = request.socEnabled;
            this.sshFlags = request.sshFlags;
            this.tags = request.tags;
            this.taints = request.taints;
            this.timeoutMins = request.timeoutMins;
            this.timezone = request.timezone;
            this.userCa = request.userCa;
            this.userData = request.userData;
            this.vpcid = request.vpcid;
            this.vswitchIds = request.vswitchIds;
            this.workerAutoRenew = request.workerAutoRenew;
            this.workerAutoRenewPeriod = request.workerAutoRenewPeriod;
            this.workerDataDisks = request.workerDataDisks;
            this.workerInstanceChargeType = request.workerInstanceChargeType;
            this.workerInstanceTypes = request.workerInstanceTypes;
            this.workerPeriod = request.workerPeriod;
            this.workerPeriodUnit = request.workerPeriodUnit;
            this.workerSystemDiskCategory = request.workerSystemDiskCategory;
            this.workerSystemDiskPerformanceLevel = request.workerSystemDiskPerformanceLevel;
            this.workerSystemDiskSize = request.workerSystemDiskSize;
            this.workerSystemDiskSnapshotPolicyId = request.workerSystemDiskSnapshotPolicyId;
            this.workerVswitchIds = request.workerVswitchIds;
            this.zoneId = request.zoneId;
            this.zoneIds = request.zoneIds;
        } 

        /**
         * <p>The network access control list (ACL) rule of the SLB instance associated with the API server if the cluster is a registered cluster.</p>
         */
        public Builder accessControlList(java.util.List<String> accessControlList) {
            this.putBodyParameter("access_control_list", accessControlList);
            this.accessControlList = accessControlList;
            return this;
        }

        /**
         * <p>The components that you want to install in the cluster. When you create a cluster, you can configure the <code>addons</code> parameter to specify the components that you want to install.</p>
         * <p><strong>Network plug-in</strong>: required. The Flannel and Terway plug-ins are supported. Select one of the plug-ins for the cluster.</p>
         * <ul>
         * <li>If you want to use the Terway component, specify the network plug-in in the [{&quot;name&quot;:&quot;flannel&quot;,&quot;config&quot;:&quot;&quot;}] format.</li>
         * <li>If you want to use the Terway component, specify the value network plug-in in the [{&quot;name&quot;: &quot;terway-eniip&quot;,&quot;Config&quot;: &quot;&quot;}] format.</li>
         * </ul>
         * <p><strong>Volume plug-in</strong>: optional. Only the <code>Container Storage Interface (CSI)</code> plug-in is supported.</p>
         * <p>Specify the <code>CSI</code> plug-in in the following format: [{&quot;name&quot;:&quot;csi-plugin&quot;,&quot;config&quot;: &quot;&quot;},{&quot;name&quot;: &quot;csi-provisioner&quot;,&quot;config&quot;: &quot;&quot;}].</p>
         * <p><strong>Simple Log Service component</strong>: optional. We recommend that you enable Simple Log Service. If Simple Log Service is disabled, you cannot use the cluster auditing feature.</p>
         * <ul>
         * <li>Specify an existing <code>Simple Log Service project</code> in the following format: [{&quot;name&quot;: &quot;logtail-ds&quot;,&quot;config&quot;: &quot;{&quot;IngressDashboardEnabled&quot;:&quot;true&quot;,&quot;sls_project_name&quot;:&quot;your_sls_project_name&quot;}&quot;}].</li>
         * <li>To create a <code>Simple Log Service project</code>, specify the component in the following format: [{&quot;name&quot;: &quot;logtail-ds&quot;,&quot;config&quot;: &quot;{&quot;IngressDashboardEnabled&quot;:&quot;true&quot;}&quot;}].</li>
         * </ul>
         * <p><strong>Ingress controller</strong>: optional. By default, the <code>nginx-ingress-controller</code> component is installed in ACK dedicated clusters.</p>
         * <ul>
         * <li>To install nginx-ingress-controller and enable Internet access, specify the Ingress controller in the following format: [{&quot;name&quot;:&quot;nginx-ingress-controller&quot;,&quot;config&quot;:&quot;{&quot;IngressSlbNetworkType&quot;:&quot;internet&quot;}&quot;}].</li>
         * <li>To disable the automatic installation of nginx-ingress-controller, specify the Ingress controller in the following format: [{&quot;name&quot;: &quot;nginx-ingress-controller&quot;,&quot;config&quot;: &quot;&quot;,&quot;disabled&quot;: true}].</li>
         * </ul>
         * <p><strong>Event center</strong>: optional. By default, the event center feature is enabled.</p>
         * <p>You can use ACK event centers to store and query events and configure alerts. You can use the Logstores that are associated with ACK event centers free of charge within 90 days. For more information, see <a href="https://help.aliyun.com/document_detail/150476.html">Create and use an event center</a>.</p>
         * <p>To enable the event center feature, specify the event center component in the following format: [{&quot;name&quot;:&quot;ack-node-problem-detector&quot;,&quot;config&quot;:&quot;{&quot;sls_project_name&quot;:&quot;your_sls_project_name&quot;}&quot;}].</p>
         */
        public Builder addons(java.util.List<Addon> addons) {
            this.putBodyParameter("addons", addons);
            this.addons = addons;
            return this;
        }

        /**
         * <p>Service accounts provide identities for pods when pods communicate with the <code>API server</code> of the cluster. The <code>api-audiences</code> parameter validates <code>tokens</code> and is used by the <code>API server</code> to check whether the <code>tokens</code> of requests are valid. Separate multiple values with commas (,).``</p>
         * <p>For more information about <code>service accounts</code>, see <a href="https://help.aliyun.com/document_detail/160384.html">Enable service account token volume projection</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>kubernetes.default.svc</p>
         */
        public Builder apiAudiences(String apiAudiences) {
            this.putBodyParameter("api_audiences", apiAudiences);
            this.apiAudiences = apiAudiences;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>]</p>
         * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when <code>charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables auto-renewal.</li>
         * <li><code>false</code>: disables auto-renewal.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * <p>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on changes to the parameter behavior of the CreateCluster operation</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("auto_renew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>]</p>
         * <p>The auto-renewal duration. This parameter takes effect only if charge_type is set to PrePaid and auto_renew is set to true. If you set <code>period_unit</code> to Month, the valid values of auto_renew_period are 1, 2, 3, 6, and 12.</p>
         * <p>Default value: 1.</p>
         * <p>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on changes to the parameter behavior of the CreateCluster operation</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoRenewPeriod(Long autoRenewPeriod) {
            this.putBodyParameter("auto_renew_period", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>]</p>
         * <p>The billing method of the CLB instance that is used by the API server. Default value: PostPaid. Valid values:</p>
         * <ul>
         * <li>PostPaid: pay-as-you-go.</li>
         * <li>PrePaid: subscription. This billing method is not supported by newly created CLB instances. Existing CLB instances are not affected.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on changes to the parameter behavior of the CreateCluster operation</a>.</p>
         * </li>
         * <li><p>Starting from December 1, 2024, newly created CLB instances no longer support the subscription billing method, and an instance fee will be charged for newly created CLB instances</p>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2839797.html">CLB billing adjustments</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("charge_type", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>[Deprecated] When you configure the control plane, use the <code>security_hardening_os</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>security_hardening_os</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder cisEnabled(Boolean cisEnabled) {
            this.putBodyParameter("cis_enabled", cisEnabled);
            this.cisEnabled = cisEnabled;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>cloud_monitor_flags</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>cms_enabled</code> parameter of the <code>kubernetes_config</code> field in the nodepool section instead.</p>
         * <p>Specifies whether to install the CloudMonitor agent. Valid values:</p>
         * <ul>
         * <li><code>true</code>: installs the CloudMonitor agent.</li>
         * <li><code>false</code>: does not install the CloudMonitor agent.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder cloudMonitorFlags(Boolean cloudMonitorFlags) {
            this.putBodyParameter("cloud_monitor_flags", cloudMonitorFlags);
            this.cloudMonitorFlags = cloudMonitorFlags;
            return this;
        }

        /**
         * <p>The domain name of the cluster.</p>
         * <p>The domain name can contain one or more parts that are separated by periods (.). Each part cannot exceed 63 characters in length, and can contain lowercase letters, digits, and hyphens (-). Each part must start and end with a lowercase letter or digit.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster.local</p>
         */
        public Builder clusterDomain(String clusterDomain) {
            this.putBodyParameter("cluster_domain", clusterDomain);
            this.clusterDomain = clusterDomain;
            return this;
        }

        /**
         * <p>If you set <code>cluster_type</code> to <code>ManagedKubernetes</code> and specify <code>profile</code>, you can further specify the edition of the cluster. Valid values:</p>
         * <ul>
         * <li><code>ack.pro.small</code>: Pro Edition.</li>
         * <li><code>ack.standard</code>: Basic Edition. If you leave the parameter empty, an ACK Basic cluster is created.</li>
         * </ul>
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
         * <ul>
         * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
         * <li><code>ManagedKubernetes</code>: ACK managed cluster. ACK managed clusters include ACK Basic clusters, ACK Pro clusters, ACK Serverless clusters (Basic Edition and Pro Edition), ACK Edge clusters (Basic Edition and Pro Edition), and ACK Lingjun clusters (Pro Edition).</li>
         * <li><code>ExternalKubernetes</code>: registered cluster.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Kubernetes</p>
         */
        public Builder clusterType(String clusterType) {
            this.putBodyParameter("cluster_type", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The pod CIDR block. You can specify 10.0.0.0/8, 172.16-31.0.0/12-16, 192.168.0.0/16, or their subnets as the pod CIDR block. The pod CIDR block cannot overlap with the CIDR block of the VPC in which the cluster is deployed and the CIDR blocks of existing clusters in the VPC. You cannot modify the pod CIDR block after you create the cluster.</p>
         * <p>For more information about how to plan the network of an ACK cluster, see <a href="https://help.aliyun.com/document_detail/86500.html">Plan the network of an ACK cluster</a>.</p>
         * <blockquote>
         * <p> This parameter is required if the cluster uses the Flannel plug-in.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.20.0.0/16</p>
         */
        public Builder containerCidr(String containerCidr) {
            this.putBodyParameter("container_cidr", containerCidr);
            this.containerCidr = containerCidr;
            return this;
        }

        /**
         * <p>The control plane configurations of an ACK dedicated cluster.</p>
         */
        public Builder controlPlaneConfig(ControlPlaneConfig controlPlaneConfig) {
            this.putBodyParameter("control_plane_config", controlPlaneConfig);
            this.controlPlaneConfig = controlPlaneConfig;
            return this;
        }

        /**
         * <p>The control plane components for which you want to enable log collection.</p>
         * <p>By default, the logs of kube-apiserver, kube-controller-manager, and kube-scheduler are collected.</p>
         */
        public Builder controlplaneLogComponents(java.util.List<String> controlplaneLogComponents) {
            this.putBodyParameter("controlplane_log_components", controlplaneLogComponents);
            this.controlplaneLogComponents = controlplaneLogComponents;
            return this;
        }

        /**
         * <p>The Simple Log Service project that is used to store the logs of control plane components. You can use an existing project or create one. If you choose to create a Simple Log Service project, the created project is named in the <code>k8s-log-{ClusterID}</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-log-xxx</p>
         */
        public Builder controlplaneLogProject(String controlplaneLogProject) {
            this.putBodyParameter("controlplane_log_project", controlplaneLogProject);
            this.controlplaneLogProject = controlplaneLogProject;
            return this;
        }

        /**
         * <p>The retention period of control plane logs in days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder controlplaneLogTtl(String controlplaneLogTtl) {
            this.putBodyParameter("controlplane_log_ttl", controlplaneLogTtl);
            this.controlplaneLogTtl = controlplaneLogTtl;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>cpu_policy</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>cpu_policy</code> parameter of the <code>kubernetes_config</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The CPU management policy of the node. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later:</p>
         * <ul>
         * <li><code>static</code>: allows pods with specific resource characteristics on the node to be granted enhanced CPU affinity and exclusivity.</li>
         * <li><code>none</code>: specifies that the default CPU affinity is used.</li>
         * </ul>
         * <p>Default value: <code>none</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder cpuPolicy(String cpuPolicy) {
            this.putBodyParameter("cpu_policy", cpuPolicy);
            this.cpuPolicy = cpuPolicy;
            return this;
        }

        /**
         * <p>The custom subject alternative names (SANs) for the API server certificate to accept requests from specified IP addresses or domain names. Separate multiple IP addresses and domain names with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cs.aliyun.com</p>
         */
        public Builder customSan(String customSan) {
            this.putBodyParameter("custom_san", customSan);
            this.customSan = customSan;
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
         * <p>[<strong>Deprecated</strong>] By default, the system does not perform a rollback when the cluster fails to be created. You must manually delete the cluster that fails to be created.</p>
         * <p>Specifies whether to perform a rollback when the cluster fails to be created. Valid values:</p>
         * <ul>
         * <li><code>true</code>: performs a rollback when the cluster fails to be created.</li>
         * <li><code>false</code>: does not perform a rollback when the cluster fails to be created.</li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder disableRollback(Boolean disableRollback) {
            this.putBodyParameter("disable_rollback", disableRollback);
            this.disableRollback = disableRollback;
            return this;
        }

        /**
         * <p>Specifies whether to enable the RAM Roles for Service Accounts (RRSA) feature.</p>
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
         * <p>The ID of the Key Management Service (KMS) key that is used to encrypt the system disk. For more information, see <a href="https://help.aliyun.com/document_detail/28935.html">What is KMS?</a></p>
         * <blockquote>
         * <p> The key can be used only in ACK Pro clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0fe64791-55eb-4fc7-84c5-c6c7cdca****</p>
         */
        public Builder encryptionProviderKey(String encryptionProviderKey) {
            this.putBodyParameter("encryption_provider_key", encryptionProviderKey);
            this.encryptionProviderKey = encryptionProviderKey;
            return this;
        }

        /**
         * <p>Specifies whether to enable Internet access for the cluster. You can use an elastic IP address (EIP) to expose the API server. This way, you can access the cluster over the Internet. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables Internet access for the cluster.</li>
         * <li><code>false</code>: disables Internet access for the cluster. If you set the value to false, the API server cannot be accessed over the Internet.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder endpointPublicAccess(Boolean endpointPublicAccess) {
            this.putBodyParameter("endpoint_public_access", endpointPublicAccess);
            this.endpointPublicAccess = endpointPublicAccess;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, you cannot add existing nodes to the cluster. If you want to add existing nodes, you must first create a node pool and then call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> operation.</p>
         * <p>Specifies whether to mount a data disk to a node that is created based on an existing ECS instance. Valid values:</p>
         * <ul>
         * <li><code>true</code>: stores the data of containers and images on a data disk. The existing data stored in the data disk is lost. Back up the existing data first.</li>
         * <li><code>false</code>: does not store the data of containers and images on a data disk.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * <p>How data disks are mounted:</p>
         * <ul>
         * <li>If an ECS instance has data disks mounted and the file system of the last data disk is not initialized, the system automatically formats the data disk to ext4. Then, the system mounts the data disk to /var/lib/docker and /var/lib/kubelet.</li>
         * <li>If no data disk is mounted to the ECS instance, the system does not purchase a new data disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder formatDisk(Boolean formatDisk) {
            this.putBodyParameter("format_disk", formatDisk);
            this.formatDisk = formatDisk;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>image_id</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>image_id</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The custom image for nodes. By default, the image provided by ACK is used. You can select a custom image to replace the default image. For more information, see <a href="https://help.aliyun.com/document_detail/146647.html">Use a custom image to create an ACK cluster</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp16z7xko3vvv8gt****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("image_id", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>image_type</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>image_type</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The type of OS distribution that you want to use. To specify the node OS, we recommend that you use this parameter. Valid values:</p>
         * <ul>
         * <li>CentOS</li>
         * <li>AliyunLinux</li>
         * <li>AliyunLinux Qboot</li>
         * <li>AliyunLinuxUEFI</li>
         * <li>AliyunLinux3</li>
         * <li>Windows</li>
         * <li>WindowsCore</li>
         * <li>AliyunLinux3Arm64</li>
         * <li>ContainerOS</li>
         * </ul>
         * <p>Default value: <code>CentOS</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux</p>
         */
        public Builder imageType(String imageType) {
            this.putBodyParameter("image_type", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, you cannot add existing nodes to the cluster. If you want to add existing nodes, you must first create a node pool and then call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> operation.</p>
         * <p>The existing ECS instances that are specified as worker nodes for the cluster.</p>
         * <blockquote>
         * <p> This parameter is required if you create worker nodes on existing ECS instances.</p>
         * </blockquote>
         */
        public Builder instances(java.util.List<String> instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * <p>The IP stack of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>Optional value: ipv4 (Single stack) or ipv6 (Dual Stack)
         * Default value: IPV4</p>
         */
        public Builder ipStack(String ipStack) {
            this.putBodyParameter("ip_stack", ipStack);
            this.ipStack = ipStack;
            return this;
        }

        /**
         * <p>Specifies whether to create an advanced security group. This parameter takes effect only if <code>security_group_id</code> is left empty.</p>
         * <blockquote>
         * <p> To use a basic security group, make sure that the sum of the number of nodes in the cluster and the number of pods that use Terway does not exceed 2,000. Therefore, we recommend that you specify an advanced security group for a cluster that uses Terway.</p>
         * </blockquote>
         * <ul>
         * <li><code>true</code>: creates an advanced security group.</li>
         * <li><code>false</code>: does not create an advanced security group.</li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isEnterpriseSecurityGroup(Boolean isEnterpriseSecurityGroup) {
            this.putBodyParameter("is_enterprise_security_group", isEnterpriseSecurityGroup);
            this.isEnterpriseSecurityGroup = isEnterpriseSecurityGroup;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, you cannot add existing nodes to the cluster. If you want to add existing nodes, you must first create a node pool and then call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> operation.</p>
         * <p>Specifies whether to retain the names of existing ECS instances that are used in the cluster. Valid values:</p>
         * <ul>
         * <li><code>true</code>: retains the names.</li>
         * <li><code>false</code>: does not retain the names. The system assigns new names.</li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder keepInstanceName(Boolean keepInstanceName) {
            this.putBodyParameter("keep_instance_name", keepInstanceName);
            this.keepInstanceName = keepInstanceName;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>key_pair</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>key_pair</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The name of the key pair. You must configure this parameter or <code>login_password</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>secrity-key</p>
         */
        public Builder keyPair(String keyPair) {
            this.putBodyParameter("key_pair", keyPair);
            this.keyPair = keyPair;
            return this;
        }

        /**
         * <p>The Kubernetes version of the cluster. The Kubernetes versions supported by ACK are the same as the Kubernetes versions supported by open source Kubernetes. We recommend that you specify the latest Kubernetes version. If you do not specify this parameter, the latest Kubernetes version is used.</p>
         * <p>You can create ACK clusters of the latest three Kubernetes versions in the ACK console. If you want to create clusters that run earlier Kubernetes versions, use the ACK API. For more information about the Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Support for Kubernetes versions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.16.9-aliyun.1</p>
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.putBodyParameter("kubernetes_version", kubernetesVersion);
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * <p>Specifies the ID of the CLB instance for accessing the API server. If this parameter is specified, the system does not automatically create a CLB instance for the API server.</p>
         * <blockquote>
         * <p> Make sure that the CLB instance does not have other dependencies, such as listeners and backend servers. You cannot specify shared-resource or Internet-facing CLB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>lb-wz9t256gqa3vbouk****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putBodyParameter("load_balancer_id", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] The pay-as-you-go billing method is used by Classic Load Balancer (CLB) instances. This parameter does not take effect.</p>
         * <p>The specification of the Server Load Balancer (SLB) instance. Valid values:</p>
         * <ul>
         * <li>slb.s1.small</li>
         * <li>slb.s2.small</li>
         * <li>slb.s2.medium</li>
         * <li>slb.s3.small</li>
         * <li>slb.s3.medium</li>
         * <li>slb.s3.large</li>
         * </ul>
         * <p>Default value: <code>slb.s2.small</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>slb.s2.small</p>
         */
        public Builder loadBalancerSpec(String loadBalancerSpec) {
            this.putBodyParameter("load_balancer_spec", loadBalancerSpec);
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }

        /**
         * <p>Enables Simple Log Service for the cluster. This parameter takes effect only for ACK Serverless clusters. Set the value to <code>SLS</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        public Builder loggingType(String loggingType) {
            this.putBodyParameter("logging_type", loggingType);
            this.loggingType = loggingType;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>login_password</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>login_password</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The password for SSH logon. You must set this parameter or <code>key_pair</code>. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello@1234</p>
         */
        public Builder loginPassword(String loginPassword) {
            this.putBodyParameter("login_password", loginPassword);
            this.loginPassword = loginPassword;
            return this;
        }

        /**
         * <p>The configurations of the cluster maintenance window.</p>
         */
        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.putBodyParameter("maintenance_window", maintenanceWindow);
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>auto-renew</code> parameter in the <code>control_plane_config</code> section instead.</p>
         * <p>Specifies whether to enable auto-renewal for master nodes. This parameter takes effect only when <code>master_instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables auto-renewal.</li>
         * <li><code>false</code>: disables auto-renewal.</li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder masterAutoRenew(Boolean masterAutoRenew) {
            this.putBodyParameter("master_auto_renew", masterAutoRenew);
            this.masterAutoRenew = masterAutoRenew;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>auto-renew_period</code> parameter in the <code>control_plane_config</code> section instead.</p>
         * <p>The auto-renewal duration. This parameter takes effect and is required only when the subscription billing method is selected for master nodes.</p>
         * <p>Valid values: 1, 2, 3, 6, and 12.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder masterAutoRenewPeriod(Long masterAutoRenewPeriod) {
            this.putBodyParameter("master_auto_renew_period", masterAutoRenewPeriod);
            this.masterAutoRenewPeriod = masterAutoRenewPeriod;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>size</code> parameter in the <code>control_plane_config</code> section instead.</p>
         * <p>The number of master nodes. Valid values: <code>3</code> and <code>5</code>.</p>
         * <p>Default value: <code>3</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder masterCount(Long masterCount) {
            this.putBodyParameter("master_count", masterCount);
            this.masterCount = masterCount;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>instance_charge_type</code> parameter in the <code>control_plane_config</code> section instead.</p>
         * <p>The billing method of master nodes. Valid values:</p>
         * <ul>
         * <li><code>PrePaid</code>: subscription.</li>
         * <li><code>PostPaid</code>: pay-as-you-go.</li>
         * </ul>
         * <p>Default value: <code>PostPaid</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder masterInstanceChargeType(String masterInstanceChargeType) {
            this.putBodyParameter("master_instance_charge_type", masterInstanceChargeType);
            this.masterInstanceChargeType = masterInstanceChargeType;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>instance_types</code> parameter in the <code>control_plane_config</code> section instead.</p>
         * <p>The instance types of master nodes. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</p>
         */
        public Builder masterInstanceTypes(java.util.List<String> masterInstanceTypes) {
            this.putBodyParameter("master_instance_types", masterInstanceTypes);
            this.masterInstanceTypes = masterInstanceTypes;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>unit</code> parameter in the <code>control_plane_config</code> section instead.</p>
         * <p>The subscription duration of master nodes. This parameter takes effect and is required only when <code>master_instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <p>Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder masterPeriod(Long masterPeriod) {
            this.putBodyParameter("master_period", masterPeriod);
            this.masterPeriod = masterPeriod;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>period_unit</code> parameter in the <code>control_plane_config</code> section instead.</p>
         * <p>The billing cycle of the master nodes in the cluster. This parameter is required if master_instance_charge_type is set to <code>PrePaid</code>.</p>
         * <p>Valid value: <code>Month</code>, which indicates that master nodes are billed only on a monthly basis.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder masterPeriodUnit(String masterPeriodUnit) {
            this.putBodyParameter("master_period_unit", masterPeriodUnit);
            this.masterPeriodUnit = masterPeriodUnit;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>system_disk_category</code> parameter in the <code>control_plane_config</code> section instead.</p>
         * <p>The system disk category of master nodes. Valid values:</p>
         * <ul>
         * <li><code>cloud_efficiency</code>: ultra disk.</li>
         * <li><code>cloud_ssd</code>: standard SSD.</li>
         * <li><code>cloud_essd</code>: Enterprise SSD (ESSD).</li>
         * </ul>
         * <p>Default value: <code>cloud_ssd</code>. The default value may vary in different zones.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        public Builder masterSystemDiskCategory(String masterSystemDiskCategory) {
            this.putBodyParameter("master_system_disk_category", masterSystemDiskCategory);
            this.masterSystemDiskCategory = masterSystemDiskCategory;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>system_disk_performance_level</code> parameter in the <code>control_plane_config</code> section instead.</p>
         * <p>The performance level (PL) of the system disk that you want to use for master nodes. This parameter takes effect only for ESSDs. For more information about the relationship between disk PLs and disk sizes, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        public Builder masterSystemDiskPerformanceLevel(String masterSystemDiskPerformanceLevel) {
            this.putBodyParameter("master_system_disk_performance_level", masterSystemDiskPerformanceLevel);
            this.masterSystemDiskPerformanceLevel = masterSystemDiskPerformanceLevel;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>system_disk_disk</code> parameter in the <code>control_plane_config</code> section instead.</p>
         * <p>The system disk size of master nodes. Valid values: 40 to 500. Unit: GiB.</p>
         * <p>Default value: <code>120</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder masterSystemDiskSize(Long masterSystemDiskSize) {
            this.putBodyParameter("master_system_disk_size", masterSystemDiskSize);
            this.masterSystemDiskSize = masterSystemDiskSize;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>system_disk_snapshot_policy_id</code> parameter in the <code>control_plane_config</code> section instead.</p>
         * <p>The ID of the automatic snapshot policy that is used by the system disk specified for master nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-2zej1nogjvovnz4z****</p>
         */
        public Builder masterSystemDiskSnapshotPolicyId(String masterSystemDiskSnapshotPolicyId) {
            this.putBodyParameter("master_system_disk_snapshot_policy_id", masterSystemDiskSnapshotPolicyId);
            this.masterSystemDiskSnapshotPolicyId = masterSystemDiskSnapshotPolicyId;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] Use the <code>vswitch_ids</code> parameter instead.</p>
         * <p>The IDs of the vSwitches that are specified for master nodes. You can specify up to three vSwitches. We recommend that you specify three vSwitches in different zones to ensure high availability.</p>
         * <p>The number of vSwitches must be the same as the value of the <code>master_count</code> parameter and also the same as the number of vSwitches specified in the <code>master_vswitch_ids</code> parameter.</p>
         */
        public Builder masterVswitchIds(java.util.List<String> masterVswitchIds) {
            this.putBodyParameter("master_vswitch_ids", masterVswitchIds);
            this.masterVswitchIds = masterVswitchIds;
            return this;
        }

        /**
         * <p>The cluster name.</p>
         * <p>The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). The name cannot start with a hyphen (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-demo</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>[Deprecated] Use the <code>snat_entry</code> parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder natGateway(Boolean natGateway) {
            this.putBodyParameter("nat_gateway", natGateway);
            this.natGateway = natGateway;
            return this;
        }

        /**
         * <p>The maximum number of IP addresses that can be assigned to each node. This number is determined by the subnet mask of the specified CIDR block. This parameter takes effect only if the cluster uses the Flannel plug-in.</p>
         * <p>Default value: <code>26</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        public Builder nodeCidrMask(String nodeCidrMask) {
            this.putBodyParameter("node_cidr_mask", nodeCidrMask);
            this.nodeCidrMask = nodeCidrMask;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>node_name_mode</code> parameter of the <code>kubernetes_config</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The custom node name.</p>
         * <p>A custom node name consists of a prefix, a node IP address, and a suffix.</p>
         * <ul>
         * <li>The prefix and suffix can contain multiple parts that are separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-), and must start and end with a lowercase letter or digit.</li>
         * <li>The IP substring length specifies the number of digits to be truncated from the end of the node IP address. The IP substring length ranges from 5 to 12.</li>
         * </ul>
         * <p>For example, if the node IP address is 192.168.0.55, the prefix is aliyun.com, the IP substring length is 5, and the suffix is test, the node name will aliyun.com00055test.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.com00055test</p>
         */
        public Builder nodeNameMode(String nodeNameMode) {
            this.putBodyParameter("node_name_mode", nodeNameMode);
            this.nodeNameMode = nodeNameMode;
            return this;
        }

        /**
         * <p>The node port range. Valid values: 30000 to 65535.</p>
         * <p>Default value: <code>30000-32767</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>30000~32767</p>
         */
        public Builder nodePortRange(String nodePortRange) {
            this.putBodyParameter("node_port_range", nodePortRange);
            this.nodePortRange = nodePortRange;
            return this;
        }

        /**
         * <p>The list of node pools.</p>
         */
        public Builder nodepools(java.util.List<Nodepool> nodepools) {
            this.putBodyParameter("nodepools", nodepools);
            this.nodepools = nodepools;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>desired_size</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The number of worker nodes. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder numOfNodes(Long numOfNodes) {
            this.putBodyParameter("num_of_nodes", numOfNodes);
            this.numOfNodes = numOfNodes;
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
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>image_type</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>image_type</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The type of OS. Valid values:</p>
         * <ul>
         * <li>Windows</li>
         * <li>Linux</li>
         * </ul>
         * <p>Default value: <code>Linux</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        public Builder osType(String osType) {
            this.putBodyParameter("os_type", osType);
            this.osType = osType;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>]</p>
         * <p>The subscription duration. This parameter takes effect and is required only when you set charge_type to PrePaid.</p>
         * <p>Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
         * <p>Default value: 1.</p>
         * <p>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on changes to the parameter behavior of the CreateCluster operation</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>FY2023</p>
         */
        public Builder period(Long period) {
            this.putBodyParameter("period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>]</p>
         * <p>The billing cycle. This parameter is required if charge_type is set to PrePaid.</p>
         * <p>Valid value: Month, which indicates that resources are billed only on a monthly basis.</p>
         * <p>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on changes to the parameter behavior of the CreateCluster operation</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("period_unit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>platform</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The OS distribution that is used. Valid values:</p>
         * <ul>
         * <li>CentOS</li>
         * <li>AliyunLinux</li>
         * <li>QbootAliyunLinux</li>
         * <li>Qboot</li>
         * <li>Windows</li>
         * <li>WindowsCore</li>
         * </ul>
         * <p>Default value: <code>CentOS</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS</p>
         */
        public Builder platform(String platform) {
            this.putBodyParameter("platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>If you select Terway as the network plug-in, you must allocate vSwitches to pods. For each vSwitch that allocates IP addresses to worker nodes, you must select a vSwitch in the same zone to allocate IP addresses to pods.</p>
         * <blockquote>
         * <p> We recommend that you select pod vSwitches whose subnet masks do not exceed 19 bits in length. The maximum subnet mask length of a pod vSwitch is 25 bits. If you select a pod vSwitch whose subnet mask exceeds 25 bits in length, the IP addresses that can be allocated to pods may be insufficient.</p>
         * </blockquote>
         */
        public Builder podVswitchIds(java.util.List<String> podVswitchIds) {
            this.putBodyParameter("pod_vswitch_ids", podVswitchIds);
            this.podVswitchIds = podVswitchIds;
            return this;
        }

        /**
         * <p>If you set <code>cluster_type</code> to <code>ManagedKubernetes</code>, an ACK managed cluster is created. In this case, you can further specify the cluster edition. Valid values:</p>
         * <ul>
         * <li><code>Default</code>: ACK managed cluster. ACK managed clusters include ACK Basic clusters and ACK Pro clusters.</li>
         * <li><code>Edge</code>: ACK Edge cluster. ACK Edge clusters include ACK Edge Basic clusters and ACK Edge Pro clusters.</li>
         * <li><code>Serverless</code>: ACK Serverless cluster. ACK Serverless clusters include ACK Serverless Basic clusters and ACK Serverless Pro clusters.</li>
         * <li><code>Lingjun</code>: ACK Lingjun Pro cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        public Builder profile(String profile) {
            this.putBodyParameter("profile", profile);
            this.profile = profile;
            return this;
        }

        /**
         * <p>The kube-proxy mode. Valid values:</p>
         * <ul>
         * <li><code>iptables</code>: a mature and stable mode that uses iptables rules to conduct service discovery and load balancing. The performance of this mode is limited by the size of the cluster. This mode is suitable for clusters that run a small number of Services.</li>
         * <li><code>ipvs</code>: a mode that provides high performance and uses IP Virtual Server (IPVS) to conduct service discovery and load balancing. This mode is suitable for clusters that run a large number of Services. We recommend that you use this mode in scenarios that require high-performance load balancing.</li>
         * </ul>
         * <p>Default value: <code>ipvs</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ipvs</p>
         */
        public Builder proxyMode(String proxyMode) {
            this.putBodyParameter("proxy_mode", proxyMode);
            this.proxyMode = proxyMode;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>rds_instances</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The ApsaraDB RDS instances. The pod CIDR block and node CIDR block are added to the whitelists of the ApsaraDB RDS instances. We recommend that you add the pod CIDR block and node CIDR block to the whitelists of the ApsaraDB RDS instances in the ApsaraDB RDS console. If the RDS instances are not in the Running state, new nodes cannot be added to the cluster.</p>
         */
        public Builder rdsInstances(java.util.List<String> rdsInstances) {
            this.putBodyParameter("rds_instances", rdsInstances);
            this.rdsInstances = rdsInstances;
            return this;
        }

        /**
         * <p>The ID of the region in which the cluster is deployed. For more information about the regions supported by ACK, see <a href="https://help.aliyun.com/document_detail/216938.html">Regions supported by ACK</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("region_id", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the cluster belongs. You can use resource groups to isolate clusters.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm3mkrure****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resource_group_id", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The container runtime. The default container runtime is Docker. containerd and Sandboxed-Container are also supported.</p>
         * <p>For more information about how to select a proper container runtime, see <a href="https://help.aliyun.com/document_detail/160313.html">Comparison among Docker, containerd, and Sandboxed-Container</a>.</p>
         */
        public Builder runtime(Runtime runtime) {
            this.putBodyParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * <p>The ID of an existing security group. You must specify this parameter or <code>is_enterprise_security_group</code>. Cluster nodes are automatically added to the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1bdue0qc1g7k****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putBodyParameter("security_group_id", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>security_hardening_os</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>security_hardening_os</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>Specifies whether to enable Alibaba Cloud Linux Security Hardening. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables Alibaba Cloud Linux Security Hardening.</li>
         * <li><code>false</code>: disables Alibaba Cloud Linux Security Hardening.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder securityHardeningOs(Boolean securityHardeningOs) {
            this.putBodyParameter("security_hardening_os", securityHardeningOs);
            this.securityHardeningOs = securityHardeningOs;
            return this;
        }

        /**
         * <p>Service accounts provide identities for pods when pods communicate with the <code>API server</code> of the cluster. <code>service-account-issuer</code> specifies the issuer of the <code>serviceaccount token</code>, which is specified by using the <code>iss</code> field in the <code>token payload</code>.</p>
         * <p>For more information about <code>ServiceAccount</code>, see <a href="https://help.aliyun.com/document_detail/160384.html">Enable service account token volume projection</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>kubernetes.default.svc</p>
         */
        public Builder serviceAccountIssuer(String serviceAccountIssuer) {
            this.putBodyParameter("service_account_issuer", serviceAccountIssuer);
            this.serviceAccountIssuer = serviceAccountIssuer;
            return this;
        }

        /**
         * <p>The Service CIDR block. Valid values: 10.0.0.0/16-24, 172.16-31.0.0/16-24, and 192.168.0.0/16-24. The Service CIDR block cannot overlap with the VPC CIDR block (10.1.0.0/21) or the CIDR blocks of existing clusters in the VPC. You cannot modify the Service CIDR block after the cluster is created.</p>
         * <p>By default, the Service CIDR block is set to 172.19.0.0/20.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172.21.0.0/20</p>
         */
        public Builder serviceCidr(String serviceCidr) {
            this.putBodyParameter("service_cidr", serviceCidr);
            this.serviceCidr = serviceCidr;
            return this;
        }

        /**
         * <p>The methods for implementing service discovery in <code>ACK Serverless</code> clusters.</p>
         * <ul>
         * <li><code>CoreDNS</code>: a standard service discovery plug-in that is provided by open source Kubernetes. To use DNS resolution, you must provision pods. By default, two elastic container instances are used. The specification of each instance is 0.25 vCores and 512 MiB of memory.</li>
         * <li><code>PrivateZone</code>: a DNS resolution service provided by Alibaba Cloud. You must activate Alibaba Cloud DNS PrivateZone before you can use it for service discovery.</li>
         * </ul>
         * <p>By default, this parameter is not specified.</p>
         */
        public Builder serviceDiscoveryTypes(java.util.List<String> serviceDiscoveryTypes) {
            this.putBodyParameter("service_discovery_types", serviceDiscoveryTypes);
            this.serviceDiscoveryTypes = serviceDiscoveryTypes;
            return this;
        }

        /**
         * <p>Specifies whether to configure SNAT rules for the VPC in which your cluster is deployed. Valid values:</p>
         * <ul>
         * <li><code>true</code>: automatically creates a NAT gateway and configures SNAT rules. Set the value to <code>true</code> if nodes and applications in the cluster need to access the Internet.</li>
         * <li><code>false</code>: does not create a NAT gateway or configure SNAT rules. In this case, nodes and applications in the cluster cannot access the Internet.</li>
         * </ul>
         * <blockquote>
         * <p> If this feature is disabled when you create the cluster, you can also manually enable this feature after you create the cluster. For more information, see <a href="https://help.aliyun.com/document_detail/178480.html">Enable an existing ACK cluster to access the Internet</a>.</p>
         * </blockquote>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder snatEntry(Boolean snatEntry) {
            this.putBodyParameter("snat_entry", snatEntry);
            this.snatEntry = snatEntry;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure the control plane, use the <code>soc_enabled</code> parameter in the <code>control_plane_config</code> section instead. When you configure a node pool, use the <code>soc_enabled</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>Specifies whether to enable Multi-Level Protection Scheme (MLPS) security hardening. For more information, see <a href="https://help.aliyun.com/document_detail/196148.html">ACK security hardening based on MLPS</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables MLPS security hardening.</li>
         * <li><code>false</code>: disables MLPS security hardening.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder socEnabled(Boolean socEnabled) {
            this.putBodyParameter("soc_enabled", socEnabled);
            this.socEnabled = socEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to enable SSH logon. If this parameter is set to true, you can log on to master nodes in an ACK dedicated cluster over the Internet. This parameter does not take effect for ACK managed clusters. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables SSH logon.</li>
         * <li><code>false</code>: disables SSH logon.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder sshFlags(Boolean sshFlags) {
            this.putBodyParameter("ssh_flags", sshFlags);
            this.sshFlags = sshFlags;
            return this;
        }

        /**
         * <p>The labels that you want to add to nodes. You must add labels based on the following rules:</p>
         * <ul>
         * <li>A label is a case-sensitive key-value pair. You can add up to 20 labels.</li>
         * <li>When you add a label, you must specify a unique key, but you can leave the value empty. A key cannot exceed 64 characters in length, and a value cannot exceed 128 characters in length. Keys and values cannot start with aliyun, acs:, https://, or http://. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</li>
         * </ul>
         */
        public Builder tags(java.util.List<Tag> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>taints</code> parameter of the <code>kubernetes_config</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The taints that you want to add to nodes. Taints can be used together with tolerations to avoid scheduling pods to specific nodes. For more information, see <a href="https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/">taint-and-toleration</a>.</p>
         */
        public Builder taints(java.util.List<Taint> taints) {
            this.putBodyParameter("taints", taints);
            this.taints = taints;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] By default, the system does not perform a rollback when the cluster fails to be created. You must manually delete the cluster that fails to be created.</p>
         * <p>Specifies the timeout period of cluster creation. Unit: minutes.</p>
         * <p>Default value: <code>60</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder timeoutMins(Long timeoutMins) {
            this.putBodyParameter("timeout_mins", timeoutMins);
            this.timeoutMins = timeoutMins;
            return this;
        }

        /**
         * <p>The time zone of the cluster.</p>
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
         * <p>The custom Certificate Authority (CA) certificate used by the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----****</p>
         */
        public Builder userCa(String userCa) {
            this.putBodyParameter("user_ca", userCa);
            this.userCa = userCa;
            return this;
        }

        /**
         * <p>The user data of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>IyEvdXNyL2Jpbi9iYXNoCmVjaG8gIkhlbGxvIEFD****</p>
         */
        public Builder userData(String userData) {
            this.putBodyParameter("user_data", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The virtual private cloud (VPC) in which you want to deploy the cluster. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zeik9h3ahvv2zz95****</p>
         */
        public Builder vpcid(String vpcid) {
            this.putBodyParameter("vpcid", vpcid);
            this.vpcid = vpcid;
            return this;
        }

        /**
         * <p>The vSwitches for nodes in the cluster. This parameter is required if you create an ACK managed cluster that does not contain nodes.</p>
         */
        public Builder vswitchIds(java.util.List<String> vswitchIds) {
            this.putBodyParameter("vswitch_ids", vswitchIds);
            this.vswitchIds = vswitchIds;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>auto_renew</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>Specifies whether to enable auto-renewal for worker nodes. This parameter takes effect and is required only when <code>worker_instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables auto-renewal.</li>
         * <li><code>false</code>: disables auto-renewal.</li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder workerAutoRenew(Boolean workerAutoRenew) {
            this.putBodyParameter("worker_auto_renew", workerAutoRenew);
            this.workerAutoRenew = workerAutoRenew;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>auto_renew_period</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The auto-renewal duration of worker nodes. This parameter takes effect and is required only if the subscription billing method is selected for worker nodes.</p>
         * <p>Valid values: 1, 2, 3, 6, and 12.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder workerAutoRenewPeriod(Long workerAutoRenewPeriod) {
            this.putBodyParameter("worker_auto_renew_period", workerAutoRenewPeriod);
            this.workerAutoRenewPeriod = workerAutoRenewPeriod;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>data_disks</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The configurations of the data disks that you want to mount to worker nodes. The configurations include the disk category and disk size.</p>
         */
        public Builder workerDataDisks(java.util.List<WorkerDataDisks> workerDataDisks) {
            this.putBodyParameter("worker_data_disks", workerDataDisks);
            this.workerDataDisks = workerDataDisks;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>instance_charge_type</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The billing method of worker nodes. Valid values:</p>
         * <ul>
         * <li><code>PrePaid</code>: subscription.</li>
         * <li><code>PostPaid</code>: pay-as-you-go.</li>
         * </ul>
         * <p>Default value: PostPaid.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder workerInstanceChargeType(String workerInstanceChargeType) {
            this.putBodyParameter("worker_instance_charge_type", workerInstanceChargeType);
            this.workerInstanceChargeType = workerInstanceChargeType;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>instance_types</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The instance configurations of worker nodes.</p>
         */
        public Builder workerInstanceTypes(java.util.List<String> workerInstanceTypes) {
            this.putBodyParameter("worker_instance_types", workerInstanceTypes);
            this.workerInstanceTypes = workerInstanceTypes;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>period</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The subscription duration of worker nodes. This parameter takes effect and is required only when <code>worker_instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <p>Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder workerPeriod(Long workerPeriod) {
            this.putBodyParameter("worker_period", workerPeriod);
            this.workerPeriod = workerPeriod;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>period_unit</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The billing cycle of worker nodes. This parameter is required if worker_instance_charge_type is set to <code>PrePaid</code>.</p>
         * <p>Valid value: <code>Month</code>, which indicates that worker nodes are billed only on a monthly basis.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder workerPeriodUnit(String workerPeriodUnit) {
            this.putBodyParameter("worker_period_unit", workerPeriodUnit);
            this.workerPeriodUnit = workerPeriodUnit;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>system_disk_category</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The system disk category of worker nodes. For more information, see <a href="https://help.aliyun.com/document_detail/63136.html">Elastic Block Storage devices</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>cloud_efficiency</code>: ultra disk.</li>
         * <li><code>cloud_ssd</code>: standard SSD.</li>
         * </ul>
         * <p>Default value: <code>cloud_ssd</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        public Builder workerSystemDiskCategory(String workerSystemDiskCategory) {
            this.putBodyParameter("worker_system_disk_category", workerSystemDiskCategory);
            this.workerSystemDiskCategory = workerSystemDiskCategory;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>system_disk_performance_level</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>If the system disk is an ESSD, you can specify the PL of the ESSD. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">Enterprise SSDs</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PL0</li>
         * <li>PL1</li>
         * <li>PL2</li>
         * <li>PL3</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        public Builder workerSystemDiskPerformanceLevel(String workerSystemDiskPerformanceLevel) {
            this.putBodyParameter("worker_system_disk_performance_level", workerSystemDiskPerformanceLevel);
            this.workerSystemDiskPerformanceLevel = workerSystemDiskPerformanceLevel;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>system_disk_size</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The system disk size of worker nodes. Unit: GiB.</p>
         * <p>Valid values: 40 to 500.</p>
         * <p>The value of this parameter must be at least 40 and greater than or equal to the image size.</p>
         * <p>Default value: <code>120</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder workerSystemDiskSize(Long workerSystemDiskSize) {
            this.putBodyParameter("worker_system_disk_size", workerSystemDiskSize);
            this.workerSystemDiskSize = workerSystemDiskSize;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>system_disk_snapshot_policy_id</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The ID of the automatic snapshot policy that is used by the system disk specified for worker nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-2zej1nogjvovnz4z****</p>
         */
        public Builder workerSystemDiskSnapshotPolicyId(String workerSystemDiskSnapshotPolicyId) {
            this.putBodyParameter("worker_system_disk_snapshot_policy_id", workerSystemDiskSnapshotPolicyId);
            this.workerSystemDiskSnapshotPolicyId = workerSystemDiskSnapshotPolicyId;
            return this;
        }

        /**
         * <p>[<strong>Deprecated</strong>] When you configure a node pool, use the <code>vswitch_ids</code> parameter of the <code>scaling_group</code> field in the <code>nodepool</code> section instead.</p>
         * <p>The vSwitches for worker nodes. Each worker node is allocated a vSwitch.</p>
         * <p><code>worker_vswitch_ids</code> is optional, but <code>vswitch_ids</code> is required if you create an ACK managed cluster that does not contain nodes.</p>
         */
        public Builder workerVswitchIds(java.util.List<String> workerVswitchIds) {
            this.putBodyParameter("worker_vswitch_ids", workerVswitchIds);
            this.workerVswitchIds = workerVswitchIds;
            return this;
        }

        /**
         * <p>[Deprecated] Use the <code>zone_ids</code> parameter instead.</p>
         * <p>The ID of the zone to which the cluster belongs. This parameter is specific to ACK Serverless clusters.</p>
         * <p>When you create an ACK managed cluster, you must set the <code>zone_id</code> parameter if <code>vpc_id</code> and <code>vswitch_ids</code> are not specified. This way, the system automatically creates a VPC in the specified zone. This parameter is invalid if you specify the <code>vpc_id</code> and <code>vswitch_ids</code> parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beiji****</p>
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("zone_id", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * <p>The IDs of the zone in which the cluster is deployed. This parameter is specific to ACK managed clusters.</p>
         * <p>When you create an ACK managed cluster, you must set the <code>zone_id</code> parameter if <code>vpc_id</code> and <code>vswitch_ids</code> are not specified. This way, the system automatically creates a VPC in the specified zone. This parameter is invalid if you specify the <code>vpc_id</code> and <code>vswitch_ids</code> parameters.</p>
         */
        public Builder zoneIds(java.util.List<String> zoneIds) {
            this.putBodyParameter("zone_ids", zoneIds);
            this.zoneIds = zoneIds;
            return this;
        }

        @Override
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
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
             * <p>Specifies whether to enable auto-renewal for the node.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * <p>The auto-renewal duration for the node.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoRenewPeriod(Long autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * <p>The billing method of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>Specifies whether to install CloudMonitor on the node.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cloudMonitorFlags(Boolean cloudMonitorFlags) {
                this.cloudMonitorFlags = cloudMonitorFlags;
                return this;
            }

            /**
             * <p>The CPU management policy of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder cpuPolicy(String cpuPolicy) {
                this.cpuPolicy = cpuPolicy;
                return this;
            }

            /**
             * <p>The ID of the deployment set.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-bp10b35imuam5amw****</p>
             */
            public Builder deploymentsetId(String deploymentsetId) {
                this.deploymentsetId = deploymentsetId;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_3_x64_20G_alibase_20240819.vhd</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The type of the OS image.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunLinux3</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * <p>The instance types of the nodes.</p>
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>The name of the key pair. You must set this parameter or login_password.</p>
             * 
             * <strong>example:</strong>
             * <p>ack</p>
             */
            public Builder keyPair(String keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * <p>The SSH logon password. The password must be 8 to 30 characters in length and contain a minimum of three of the following character types: uppercase letters, lowercase letters, digits, and special characters. You must set this parameter or key_pair.</p>
             * 
             * <strong>example:</strong>
             * <p>ack@Test</p>
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * <p>The node port range.</p>
             * 
             * <strong>example:</strong>
             * <p>30000-32767</p>
             */
            public Builder nodePortRange(String nodePortRange) {
                this.nodePortRange = nodePortRange;
                return this;
            }

            /**
             * <p>The subscription duration of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The unit of the subscription duration of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The container runtime.</p>
             * 
             * <strong>example:</strong>
             * <p>containerd</p>
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>Specifies whether to enable Alibaba Cloud Linux Security Hardening.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder securityHardeningOs(Boolean securityHardeningOs) {
                this.securityHardeningOs = securityHardeningOs;
                return this;
            }

            /**
             * <p>The number of control plane nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>Specifies whether to enable MLPS security hardening.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder socEnabled(Boolean socEnabled) {
                this.socEnabled = socEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to enable the burst feature for the system disk.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder systemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
                this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
                return this;
            }

            /**
             * <p>The system disk category for the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The PL of the system disk that you want to use for the node. This parameter takes effect only for ESSDs.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * <p>The preset read/write IOPS of the system disk.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder systemDiskProvisionedIops(Long systemDiskProvisionedIops) {
                this.systemDiskProvisionedIops = systemDiskProvisionedIops;
                return this;
            }

            /**
             * <p>The system disk size of the node. The value must be at least 40 GB.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The automatic snapshot policy of the node.</p>
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
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
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
             * <p>The automatic update frequency. Valid values:</p>
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
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
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
             * <p>The configurations of auto cluster upgrade.</p>
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
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class WorkerDataDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        @com.aliyun.core.annotation.Validation(required = true)
        private String category;

        @com.aliyun.core.annotation.NameInMap("encrypted")
        private String encrypted;

        @com.aliyun.core.annotation.NameInMap("performance_level")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("size")
        @com.aliyun.core.annotation.Validation(required = true)
        private String size;

        private WorkerDataDisks(Builder builder) {
            this.category = builder.category;
            this.encrypted = builder.encrypted;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkerDataDisks create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return encrypted
         */
        public String getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private String encrypted; 
            private String performanceLevel; 
            private String size; 

            private Builder() {
            } 

            private Builder(WorkerDataDisks model) {
                this.category = model.category;
                this.encrypted = model.encrypted;
                this.performanceLevel = model.performanceLevel;
                this.size = model.size;
            } 

            /**
             * <p>The data disk category.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt the data disk. Valid values:</p>
             * <ul>
             * <li><code>true</code>: encrypts the data disk.</li>
             * <li><code>false</code>: does not encrypt the data disk.</li>
             * </ul>
             * <p>Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The PL of the data disk. This parameter takes effect only for ESSDs. You can specify a higher PL if you increase the size of a data disk. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">Enterprise SSDs</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The data disk size. Valid values: 40 to 32767. Unit: GiB.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            public WorkerDataDisks build() {
                return new WorkerDataDisks(this);
            } 

        } 

    }
}
