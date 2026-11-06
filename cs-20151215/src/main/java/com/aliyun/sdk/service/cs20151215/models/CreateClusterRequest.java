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
    @Deprecated
    private java.util.List<String> accessControlList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("addons")
    private java.util.List<Addon> addons;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("api_audiences")
    private String apiAudiences;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("audit_log_config")
    private AuditLogConfig auditLogConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("auto_mode")
    private AutoMode autoMode;

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
    @com.aliyun.core.annotation.NameInMap("client_token")
    private String clientToken;

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
    private String clusterType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("container_cidr")
    private String containerCidr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("control_plane_config")
    private ControlPlaneConfig controlPlaneConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("control_plane_endpoints_config")
    private ControlPlaneEndpointsConfig controlPlaneEndpointsConfig;

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
    @Deprecated
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
    @Deprecated
    private Boolean enableRrsa;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("encryption_provider_key")
    private String encryptionProviderKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endpoint_public_access")
    private Boolean endpointPublicAccess;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extra_sans")
    private java.util.List<String> extraSans;

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
    @Deprecated
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
    @Deprecated
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
    @Deprecated
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
    @Deprecated
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
    @com.aliyun.core.annotation.NameInMap("rrsa_config")
    private RrsaConfig rrsaConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("runtime")
    @Deprecated
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
    private String serviceCidr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("service_discovery_types")
    @Deprecated
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
    @com.aliyun.core.annotation.NameInMap("support_policy")
    private String supportPolicy;

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
    @Deprecated
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
        this.auditLogConfig = builder.auditLogConfig;
        this.autoMode = builder.autoMode;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.chargeType = builder.chargeType;
        this.cisEnabled = builder.cisEnabled;
        this.clientToken = builder.clientToken;
        this.cloudMonitorFlags = builder.cloudMonitorFlags;
        this.clusterDomain = builder.clusterDomain;
        this.clusterSpec = builder.clusterSpec;
        this.clusterType = builder.clusterType;
        this.containerCidr = builder.containerCidr;
        this.controlPlaneConfig = builder.controlPlaneConfig;
        this.controlPlaneEndpointsConfig = builder.controlPlaneEndpointsConfig;
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
        this.extraSans = builder.extraSans;
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
        this.rrsaConfig = builder.rrsaConfig;
        this.runtime = builder.runtime;
        this.securityGroupId = builder.securityGroupId;
        this.securityHardeningOs = builder.securityHardeningOs;
        this.serviceAccountIssuer = builder.serviceAccountIssuer;
        this.serviceCidr = builder.serviceCidr;
        this.serviceDiscoveryTypes = builder.serviceDiscoveryTypes;
        this.snatEntry = builder.snatEntry;
        this.socEnabled = builder.socEnabled;
        this.sshFlags = builder.sshFlags;
        this.supportPolicy = builder.supportPolicy;
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
     * @return auditLogConfig
     */
    public AuditLogConfig getAuditLogConfig() {
        return this.auditLogConfig;
    }

    /**
     * @return autoMode
     */
    public AutoMode getAutoMode() {
        return this.autoMode;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return controlPlaneEndpointsConfig
     */
    public ControlPlaneEndpointsConfig getControlPlaneEndpointsConfig() {
        return this.controlPlaneEndpointsConfig;
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
     * @return extraSans
     */
    public java.util.List<String> getExtraSans() {
        return this.extraSans;
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
     * @return rrsaConfig
     */
    public RrsaConfig getRrsaConfig() {
        return this.rrsaConfig;
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
     * @return supportPolicy
     */
    public String getSupportPolicy() {
        return this.supportPolicy;
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
        private AuditLogConfig auditLogConfig; 
        private AutoMode autoMode; 
        private Boolean autoRenew; 
        private Long autoRenewPeriod; 
        private String chargeType; 
        private Boolean cisEnabled; 
        private String clientToken; 
        private Boolean cloudMonitorFlags; 
        private String clusterDomain; 
        private String clusterSpec; 
        private String clusterType; 
        private String containerCidr; 
        private ControlPlaneConfig controlPlaneConfig; 
        private ControlPlaneEndpointsConfig controlPlaneEndpointsConfig; 
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
        private java.util.List<String> extraSans; 
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
        private RrsaConfig rrsaConfig; 
        private Runtime runtime; 
        private String securityGroupId; 
        private Boolean securityHardeningOs; 
        private String serviceAccountIssuer; 
        private String serviceCidr; 
        private java.util.List<String> serviceDiscoveryTypes; 
        private Boolean snatEntry; 
        private Boolean socEnabled; 
        private Boolean sshFlags; 
        private String supportPolicy; 
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
            this.auditLogConfig = request.auditLogConfig;
            this.autoMode = request.autoMode;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.chargeType = request.chargeType;
            this.cisEnabled = request.cisEnabled;
            this.clientToken = request.clientToken;
            this.cloudMonitorFlags = request.cloudMonitorFlags;
            this.clusterDomain = request.clusterDomain;
            this.clusterSpec = request.clusterSpec;
            this.clusterType = request.clusterType;
            this.containerCidr = request.containerCidr;
            this.controlPlaneConfig = request.controlPlaneConfig;
            this.controlPlaneEndpointsConfig = request.controlPlaneEndpointsConfig;
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
            this.extraSans = request.extraSans;
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
            this.rrsaConfig = request.rrsaConfig;
            this.runtime = request.runtime;
            this.securityGroupId = request.securityGroupId;
            this.securityHardeningOs = request.securityHardeningOs;
            this.serviceAccountIssuer = request.serviceAccountIssuer;
            this.serviceCidr = request.serviceCidr;
            this.serviceDiscoveryTypes = request.serviceDiscoveryTypes;
            this.snatEntry = request.snatEntry;
            this.socEnabled = request.socEnabled;
            this.sshFlags = request.sshFlags;
            this.supportPolicy = request.supportPolicy;
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
         * <p><strong>[Deprecated]</strong> The access control list (ACL) for the Server Load Balancer (SLB) instance of the API server in a registered cluster.</p>
         */
        public Builder accessControlList(java.util.List<String> accessControlList) {
            this.putBodyParameter("access_control_list", accessControlList);
            this.accessControlList = accessControlList;
            return this;
        }

        /**
         * <p>The list of cluster components. You can use <code>addons</code> to specify the cluster components that you want to install when you create a cluster.</p>
         * <p><strong>Network components</strong>: Required. Includes two options for the network type: Flannel and Terway. You must select one of them when you create a cluster:</p>
         * <ul>
         * <li>Flannel: [{&quot;name&quot;:&quot;flannel&quot;,&quot;config&quot;:&quot;&quot;}\].</li>
         * <li>Terway: [{&quot;name&quot;: &quot;terway-eniip&quot;,&quot;config&quot;: &quot;&quot;}\].</li>
         * </ul>
         * <p><strong>Storage components</strong>: Optional. Only <code>csi</code> is supported:</p>
         * <p><code>csi</code>: [{&quot;name&quot;:&quot;csi-plugin&quot;,&quot;config&quot;: &quot;&quot;},{&quot;name&quot;: &quot;csi-provisioner&quot;,&quot;config&quot;: &quot;&quot;}\].</p>
         * <p><strong>Log components</strong>: Optional. We recommend that you enable this component. If you do not enable Log Service, you cannot use the cluster audit feature.</p>
         * <ul>
         * <li>Use an existing <code>SLS Project</code>: [{&quot;name&quot;: &quot;loongcollector&quot;,&quot;config&quot;: &quot;{\&quot;IngressDashboardEnabled\&quot;:\&quot;true\&quot;,\&quot;sls_project_name\&quot;:\&quot;your_sls_project_name\&quot;}&quot;}\].</li>
         * <li>Create a new <code>SLS Project</code>: [{&quot;name&quot;: &quot;loongcollector&quot;,&quot;config&quot;: &quot;{\&quot;IngressDashboardEnabled\&quot;:\&quot;true\&quot;}&quot;}\].</li>
         * </ul>
         * <p><strong>Ingress components</strong>: Optional. By default, the <code>nginx-ingress-controller</code> Ingress component is installed in ACK dedicated clusters.</p>
         * <ul>
         * <li>Install the Ingress component and enable Internet access: [{&quot;name&quot;:&quot;nginx-ingress-controller&quot;,&quot;config&quot;:&quot;{\&quot;IngressSlbNetworkType\&quot;:\&quot;internet\&quot;}&quot;}\].</li>
         * <li>Disable the default installation of the Ingress component: [{&quot;name&quot;: &quot;nginx-ingress-controller&quot;,&quot;config&quot;: &quot;&quot;,&quot;disabled&quot;: true}\].</li>
         * </ul>
         * <p><strong>Event center</strong>: Optional. Enabled by default.</p>
         * <p>The event center provides capabilities such as storage, query, and alerting for Kubernetes events. The Logstore associated with the Kubernetes event center is free of charge for 90 days. For more information about the free quota policy, see <a href="https://help.aliyun.com/document_detail/150476.html">Create and use a Kubernetes event center</a>.</p>
         * <p>Example of enabling the event center: [{&quot;name&quot;:&quot;ack-node-problem-detector&quot;,&quot;config&quot;:&quot;{\&quot;sls_project_name\&quot;:\&quot;your_sls_project_name\&quot;}&quot;}\].</p>
         */
        public Builder addons(java.util.List<Addon> addons) {
            this.putBodyParameter("addons", addons);
            this.addons = addons;
            return this;
        }

        /**
         * <p>A ServiceAccount is the access credential for communication between pods and the cluster API server. <code>api-audiences</code> specifies the valid identities for request <code>tokens</code> and is used by the <code>apiserver</code> to authenticate whether a request <code>token</code> is valid. You can configure multiple <code>audiences</code> and separate them with commas (,).</p>
         * <p>For more information about <code>ServiceAccount</code>, see <a href="https://help.aliyun.com/document_detail/160384.html">Deploy service account token volume projection</a>.</p>
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
         * <p>The cluster audit log configurations.</p>
         */
        public Builder auditLogConfig(AuditLogConfig auditLogConfig) {
            this.putBodyParameter("audit_log_config", auditLogConfig);
            this.auditLogConfig = auditLogConfig;
            return this;
        }

        /**
         * <p>The <a href="https://help.aliyun.com/document_detail/2938898.html">intelligent managed mode</a> configurations.</p>
         */
        public Builder autoMode(AutoMode autoMode) {
            this.putBodyParameter("auto_mode", autoMode);
            this.autoMode = autoMode;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Specifies whether to enable auto-renewal. This parameter takes effect only when <code>charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables auto-renewal.</li>
         * <li><code>false</code>: Disables auto-renewal.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * <p>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on parameter behavior changes of the CreateCluster operation for cluster creation</a>.</p>
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
         * <p><strong>[Deprecated]</strong> The auto-renewal cycle. This parameter takes effect only when you select subscription and auto-renewal. When <code>PeriodUnit</code> is set to <code>Month</code>, valid values are 1, 2, 3, 6, and 12.</p>
         * <p>Default value: 1.</p>
         * <p>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on parameter behavior changes of the CreateCluster operation for cluster creation</a>.</p>
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
         * <p><strong>[Deprecated]</strong> The billing method of the Classic Load Balancer (CLB) instance used by the API server. Default value: PostPaid. Valid values:</p>
         * <ul>
         * <li>PostPaid: Pay-as-you-go.</li>
         * <li>PrePaid: Subscription. This billing method is no longer supported for new CLB instances, but existing instances are not affected.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li>This parameter was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on parameter behavior changes of the CreateCluster operation for cluster creation</a>.</li>
         * <li>Starting December 1, 2024, newly created CLB instances no longer support the subscription billing method, and an instance fee is charged.</notice>
         * <props="china">For more information, see [Service notices: Deprecation of the subscription billing method for the CLB instance of the API server in newly created clusters](https://help.aliyun.com/document_detail/2851191.html) and [Announcement on billing item adjustments for Classic Load Balancer (CLB)](https://help.aliyun.com/document_detail/2839797.html).
         * <props="intl">For more information, see [Announcement on billing item adjustments for Classic Load Balancer (CLB)](https://help.aliyun.com/document_detail/2839797.html).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("charge_type", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> To configure the cluster control plane, use the <code>security_hardening_os</code> parameter under <code>control_plane_config</code> instead. To configure node pools, use the <code>security_hardening_os</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
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
         * <p>The client token.</p>
         * 
         * <strong>example:</strong>
         * <p>0a287651-1277-4c0d-80d2-623a4*****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("client_token", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> To configure control plane nodes of a cluster, use the <code>cloud_monitor_flags</code> parameter under <code>control_plane_config</code> instead. To configure node pools, use the <code>cms_enabled</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code> instead.</p>
         * <p>Specifies whether to install the CloudMonitor agent on the cluster. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Installs the CloudMonitor agent.</li>
         * <li><code>false</code>: Does not install the CloudMonitor agent.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder cloudMonitorFlags(Boolean cloudMonitorFlags) {
            this.putBodyParameter("cloud_monitor_flags", cloudMonitorFlags);
            this.cloudMonitorFlags = cloudMonitorFlags;
            return this;
        }

        /**
         * <p>The local domain name of the cluster.</p>
         * <p>Naming rules: The domain name consists of one or more parts separated by periods (.). Each part can be up to 63 characters in length and can contain lowercase letters, digits, and hyphens (-). It must start and end with a lowercase letter or a digit.</p>
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
         * <p>After you set <code>cluster_type</code> to <code>ManagedKubernetes</code> and configure <code>profile</code>, you can further specify the cluster edition. Valid values:</p>
         * <ul>
         * <li><code>ack.standard</code>: Basic Edition. This is the default value if this parameter is left empty.</li>
         * <li><code>ack.pro.small</code>: Pro Edition.</li>
         * <li><code>ack.pro.xlarge</code>: Pro XL.</li>
         * <li><code>ack.pro.2xlarge</code>: Pro 2XL.</li>
         * <li><code>ack.pro.4xlarge</code>: Pro 4XL. You must contact customer service to apply for whitelist access.</li>
         * </ul>
         * <p>Pro XL, Pro 2XL, and Pro 4XL are three tiers provided by &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro Provisioned Control Plane</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro Provisioned Control Plane</a>. By pre-allocating and reserving control plane resources, these editions ensure that API concurrency and pod scheduling capabilities are always maintained at a consistently high level. They are suitable for AI training and inference, ultra-large-scale clusters, and mission-critical workloads.</p>
         * <p>For more information about the cluster management fees for Pro Edition and provisioned control plane editions, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>.</p>
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
         * <p>Valid values:</p>
         * <ul>
         * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
         * <li><code>ManagedKubernetes</code>: ACK managed cluster, including ACK managed clusters (Pro Edition and Basic Edition), ACK Serverless clusters (Pro Edition and Basic Edition), ACK Edge clusters (Pro Edition and Basic Edition), and ACK Lingjun clusters (Pro Edition).</li>
         * <li><code>ExternalKubernetes</code>: Registered cluster.</li>
         * </ul>
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
         * <p>The CIDR block for pods. It must be a valid private CIDR block, specifically one of the following CIDR blocks or their subnets: 10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16. It cannot overlap with the CIDR block of the VPC or the CIDR blocks used by existing Kubernetes clusters in the VPC. It cannot be modified after the cluster is created.</p>
         * <p>For more information about cluster network planning, see <a href="https://help.aliyun.com/document_detail/86500.html">Network planning for ACK managed clusters</a>.</p>
         * <blockquote>
         * <p>This parameter is required for Flannel clusters.</p>
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
         * <p>The control plane configuration for an ACK dedicated cluster.</p>
         */
        public Builder controlPlaneConfig(ControlPlaneConfig controlPlaneConfig) {
            this.putBodyParameter("control_plane_config", controlPlaneConfig);
            this.controlPlaneConfig = controlPlaneConfig;
            return this;
        }

        /**
         * <p>The connection configuration of the cluster. If you specify this parameter, the endpoint_public_access and load_balancer_id parameters do not take effect. To specify a CLB or NLB instance, use load_balancers_config to specify the corresponding instance ID.</p>
         */
        public Builder controlPlaneEndpointsConfig(ControlPlaneEndpointsConfig controlPlaneEndpointsConfig) {
            this.putBodyParameter("control_plane_endpoints_config", controlPlaneEndpointsConfig);
            this.controlPlaneEndpointsConfig = controlPlaneEndpointsConfig;
            return this;
        }

        /**
         * <p>The list of component names. This parameter specifies the control plane components whose logs are collected. By default, logs of kube-apiserver, kube-controller-manager, kube-scheduler, and cloud-controller-manager are collected.</p>
         */
        public Builder controlplaneLogComponents(java.util.List<String> controlplaneLogComponents) {
            this.putBodyParameter("controlplane_log_components", controlplaneLogComponents);
            this.controlplaneLogComponents = controlplaneLogComponents;
            return this;
        }

        /**
         * <p>The Log Service project for control plane component logs. You can use an existing project for log storage, or use the automatic creation feature to create a project. If you choose automatic creation, a Log Service project named k8s-log-{ClusterID} is created.</p>
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
         * <p>The log retention period for control plane components. Unit: days.</p>
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
         * <p><strong>[Deprecated]</strong> Use the cpu_policy parameter under control_plane_config for cluster control plane configuration, and use the cpu_policy parameter under kubernetes_config in nodepool for node pool configuration.</p>
         * <p>The CPU management policy for nodes. This parameter supports the following policies when the cluster version is 1.12.6 or later:</p>
         * <ul>
         * <li>static: allows you to enhance CPU affinity and exclusivity for pods with specific resource characteristics on the node.</li>
         * <li>none: uses the default CPU affinity policy.</li>
         * </ul>
         * <p>Default value: none.</p>
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
         * <p><strong>[Deprecated]</strong> Use the extra_sans parameter instead.</p>
         * <p>The SANs of the custom certificate. Separate multiple IP addresses or domain names with commas (,).</p>
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
         * <p>Specifies whether to enable deletion protection for the cluster to prevent accidental deletion through the console or API calls. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables cluster deletion protection. The cluster cannot be deleted through the console or API.</li>
         * <li><code>false</code>: Disables cluster deletion protection. The cluster can be deleted through the console or API.</li>
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
         * <p><strong>[Deprecated]</strong> By default, no rollback is performed when cluster creation fails. You must manually clean up the failed cluster.</p>
         * <p>Specifies whether to perform a rollback when cluster creation fails. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Performs a rollback when cluster creation fails.</li>
         * <li><code>false</code>: Does not perform a rollback when cluster creation fails.</li>
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
         * <p><strong>[Deprecated]</strong> Use the <code>rrsa_config</code> parameter instead.</p>
         * <p>Specifies whether to enable RRSA. Valid values:</p>
         * <ul>
         * <li>true: Enables RRSA.</li>
         * <li>false: Disables RRSA.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableRrsa(Boolean enableRrsa) {
            this.putBodyParameter("enable_rrsa", enableRrsa);
            this.enableRrsa = enableRrsa;
            return this;
        }

        /**
         * <p>The ID of the KMS key used to encrypt data cloud disks. For more information, see <a href="https://help.aliyun.com/document_detail/28935.html">Key Management Service</a>.</p>
         * <blockquote>
         * <p>This feature takes effect only in ACK Pro clusters.</p>
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
         * <p>Specifies whether to enable public network access. An elastic IP address (EIP) is used to expose the API Server for public network access to the cluster. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables public network access.</li>
         * <li><code>false</code>: Disables public network access. If you select this value, the cluster API Server cannot be accessed over the Internet.</li>
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
         * <p>The custom Subject Alternative Name (SAN) of the API Server certificate.</p>
         */
        public Builder extraSans(java.util.List<String> extraSans) {
            this.putBodyParameter("extra_sans", extraSans);
            this.extraSans = extraSans;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> You cannot select existing nodes when creating a cluster. To add existing nodes to a cluster, create a node pool first and call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> operation.</p>
         * <p>Specifies whether to mount data cloud disks to existing instances when creating a cluster. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Stores containers and images on data cloud disks. Existing data on the data cloud disks will be lost. Back up your data first.</li>
         * <li><code>false</code>: Does not store containers and images on data cloud disks.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * <p>Data cloud disk mounting rules:</p>
         * <ul>
         * <li>If the ECS instance has data cloud disks attached and the file system of the last data cloud disk is not initialized, the system automatically formats the data cloud disk to ext4 to store /var/lib/docker and /var/lib/kubelet.</li>
         * <li>If the ECS instance does not have data cloud disks attached, no new data cloud disk will be attached.</li>
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
         * <p><strong>[Deprecated]</strong> For cluster control plane configurations, use the <code>image_id</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>image_id</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
         * <p>The custom image for nodes. By default, the system image is used. If you select a custom image, it replaces the default system image. For more information, see <a href="https://help.aliyun.com/document_detail/146647.html">Custom images</a>.</p>
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
         * <p><strong>[Deprecated]</strong> For cluster control plane configurations, use the <code>image_type</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>image_type</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
         * <p>The operating system distribution type. We recommend that you use this field to specify the node operating system. Valid values:</p>
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
         * <p><strong>[Deprecated]</strong> You cannot select existing nodes when creating a cluster. To add existing nodes to a cluster, create a node pool first and call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> operation.</p>
         * <p>The list of existing ECS instances to be added as worker nodes when creating a cluster with existing nodes.</p>
         * <blockquote>
         * <p>This field is required when you create a cluster with existing instances.</p>
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
         * <p>Valid values:
         * ipv4 (single-stack)
         * dual (dual-stack). Default value: ipv4</p>
         */
        public Builder ipStack(String ipStack) {
            this.putBodyParameter("ip_stack", ipStack);
            this.ipStack = ipStack;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic creation of an advanced security group. This parameter takes effect when <code>security_group_id</code> is empty.</p>
         * <blockquote>
         * <p>If you use a basic security group, the total number of nodes and Terway pods in the cluster cannot exceed 2,000. Therefore, we recommend that you use an advanced security group when creating a cluster of the Terway network type.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>true</code>: Creates and uses an advanced security group.</li>
         * <li><code>false</code>: Uses a basic security group.</li>
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
         * <p><strong>[Deprecated]</strong> You cannot select existing nodes when creating a cluster. To add existing nodes to a cluster, create a node pool first and call the <a href="https://help.aliyun.com/document_detail/2667920.html">AttachInstancesToNodePool</a> operation.</p>
         * <p>Specifies whether to retain the instance names when creating a cluster with existing instances. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Retains the instance names.</li>
         * <li><code>false</code>: Does not retain the instance names. The names are replaced based on system rules.</li>
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
         * <p><strong>[Deprecated]</strong> For cluster control plane configurations, use the <code>key_pair</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>key_pair</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
         * <p>The name of the key pair. You must specify either this parameter or <code>login_password</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>security-key</p>
         */
        public Builder keyPair(String keyPair) {
            this.putBodyParameter("key_pair", keyPair);
            this.keyPair = keyPair;
            return this;
        }

        /**
         * <p>The cluster version, which is consistent with the Kubernetes community baseline version. We recommend that you select the latest version. If you do not specify this parameter, the latest version is used by default.</p>
         * <p>You can create clusters of the latest three versions. You can call the <a href="https://help.aliyun.com/document_detail/2667899.html">DescribeKubernetesVersionMetadata</a> operation to query the supported cluster versions.</p>
         * <p>For more information about the Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Kubernetes version release overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.32.1-aliyun.1</p>
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.putBodyParameter("kubernetes_version", kubernetesVersion);
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * <p>The instance ID of the Classic Load Balancer (CLB) used for API server access. If you specify this parameter, automatic creation of a CLB instance for the API server is disabled.</p>
         * <blockquote>
         * <p>Make sure that the CLB instance has no other dependencies, such as listeners or backend servers. Shared-resource and Internet-facing CLB instances are not supported.</p>
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
         * <p><strong>[Deprecated]</strong> For CLB instances, billing is based on usage. This parameter does not take effect.</p>
         * <p>The load balancing specification. Valid values:</p>
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
         * <p><strong>[Deprecated]</strong> This parameter enables Simple Log Service for the cluster. It takes effect only for ACK Serverless clusters and must be set to <code>SLS</code>.</p>
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
         * <p><strong>[Deprecated]</strong> For cluster control plane configurations, use the <code>login_password</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>login_password</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
         * <p>The SSH logon password. You must specify either this parameter or <code>key_pair</code>. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder loginPassword(String loginPassword) {
            this.putBodyParameter("login_password", loginPassword);
            this.loginPassword = loginPassword;
            return this;
        }

        /**
         * <p>The maintenance window of the cluster.</p>
         */
        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.putBodyParameter("maintenance_window", maintenanceWindow);
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> For cluster control plane configurations, use the <code>auto_renew</code> parameter under <code>control_plane_config</code> instead.</p>
         * <p>Specifies whether to enable auto-renewal for master nodes. This parameter takes effect only when <code>master_instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables auto-renewal.</li>
         * <li><code>false</code>: Disables auto-renewal.</li>
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
         * <p><strong>[Deprecated]</strong> For cluster control plane configurations, use the <code>auto_renew_period</code> parameter under <code>control_plane_config</code> instead.</p>
         * <p>The auto-renewal epoch for master nodes. This parameter takes effect and is required only when the subscription billing method is selected.</p>
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
         * <p><strong>[Deprecated]</strong> For cluster control plane configurations, use the <code>size</code> parameter under <code>control_plane_config</code> instead.</p>
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
         * <p><strong>[Deprecated]</strong> For cluster control plane configurations, use the <code>instance_charge_type</code> parameter under <code>control_plane_config</code> instead.</p>
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
         * <p><strong>[Deprecated]</strong> For cluster control plane configurations, use the <code>instance_types</code> parameter under <code>control_plane_config</code> instead.</p>
         * <p>The instance types of master nodes. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         */
        public Builder masterInstanceTypes(java.util.List<String> masterInstanceTypes) {
            this.putBodyParameter("master_instance_types", masterInstanceTypes);
            this.masterInstanceTypes = masterInstanceTypes;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> For cluster control plane configurations, use the <code>unit</code> parameter under <code>control_plane_config</code> instead.</p>
         * <p>The subscription period of master nodes. This parameter takes effect and is required only when <code>master_instance_charge_type</code> is set to <code>PrePaid</code>.</p>
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
         * <p><strong>[Deprecated]</strong> For cluster control plane configurations, use the <code>period_unit</code> parameter under <code>control_plane_config</code> instead.</p>
         * <p>The subscription period unit of master nodes. This parameter is required when the billing method is <code>PrePaid</code>.</p>
         * <p>Valid value: <code>Month</code>. Currently, only month is supported.</p>
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
         * <p><strong>[Deprecated]</strong> For cluster control plane configurations, use the <code>system_disk_category</code> parameter under <code>control_plane_config</code> instead.</p>
         * <p>The system cloud disk category of master nodes. Valid values:</p>
         * <ul>
         * <li><code>cloud_efficiency</code>: ultra disk.</li>
         * <li><code>cloud_ssd</code>: standard SSD.</li>
         * <li><code>cloud_essd</code>: ESSD.</li>
         * </ul>
         * <p>Default value: <code>cloud_ssd</code>. The default value may vary by zone.</p>
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
         * <p><strong>[Deprecated]</strong> For cluster control plane configurations, use the <code>system_disk_performance_level</code> parameter under <code>control_plane_config</code> instead.</p>
         * <p>The performance level of the system cloud disk for master nodes. This parameter takes effect only for ESSDs. The performance level is related to the disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD standard SSD</a>.</p>
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
         * <p><strong>[Deprecated]</strong> For cluster control plane configurations, use the <code>system_disk_size</code> parameter under <code>control_plane_config</code> instead.</p>
         * <p>The system cloud disk size of master nodes. Valid values: 40 to 500. Unit: GiB.</p>
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
         * <p><strong>[Deprecated]</strong> For cluster control plane configurations, use the <code>system_disk_snapshot_policy_id</code> parameter under <code>control_plane_config</code> instead.</p>
         * <p>The ID of the automatic snapshot policy applied to the system cloud disk of master nodes.</p>
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
         * <p><strong>[Deprecated]</strong> Use the <code>vswitch_ids</code> parameter instead.</p>
         * <p>The list of vSwitch IDs for master nodes. You can specify 1 to 3 vSwitches. To ensure high availability of the cluster, we recommend that you select three vSwitches in different zones.</p>
         * <p>The number of specified vSwitches must be consistent with the value of <code>master_count</code> and correspond to the elements in <code>master_vswitch_ids</code> one by one.</p>
         */
        public Builder masterVswitchIds(java.util.List<String> masterVswitchIds) {
            this.putBodyParameter("master_vswitch_ids", masterVswitchIds);
            this.masterVswitchIds = masterVswitchIds;
            return this;
        }

        /**
         * <p>The custom name of the cluster. The name must be 1 to 63 characters in length and can contain digits, Chinese characters, English letters, and hyphens (-). It cannot start with a hyphen (-).</p>
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
         * <p><strong>[Deprecated]</strong> Use the <code>snat_entry</code> parameter instead.</p>
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
         * <p>The maximum number of IP addresses that can be assigned to nodes. This parameter determines the number of IP addresses by specifying the CIDR block of the network. It takes effect only for clusters of the Flannel network type.</p>
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
         * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>node_name_mode</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code> instead.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder nodeNameMode(String nodeNameMode) {
            this.putBodyParameter("node_name_mode", nodeNameMode);
            this.nodeNameMode = nodeNameMode;
            return this;
        }

        /**
         * <p>The node service port. Valid port range: 30000 to 65535.</p>
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
         * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>desired_size</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead. The number of worker nodes. Valid values: 0 to 100.</p>
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
         * <p>The automatic O&amp;M policy for the cluster.</p>
         */
        public Builder operationPolicy(OperationPolicy operationPolicy) {
            this.putBodyParameter("operation_policy", operationPolicy);
            this.operationPolicy = operationPolicy;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> For control plane node configurations, use the <code>image_type</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>image_type</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead. The operating system platform type. Valid values:</p>
         * <ul>
         * <li>Windows</li>
         * <li>Linux
         * Default value: <code>Linux</code>.</li>
         * </ul>
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
         * <p><strong>[Deprecated]</strong> The subscription duration. This parameter takes effect and is required only when <code>charge_type</code> is set to <code>PrePaid</code>. Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60. Default value: 1. This field was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on parameter behavior changes of the CreateCluster API operation</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Long period) {
            this.putBodyParameter("period", period);
            this.period = period;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The billing cycle. This parameter is required when the billing method is <code>PrePaid</code>. Valid value: <code>Month</code>. Currently, only monthly billing is supported. This field was changed on October 15, 2024. For more information, see <a href="https://help.aliyun.com/document_detail/2849194.html">Announcement on parameter behavior changes of the CreateCluster API operation</a>.</p>
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
         * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>platform</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead. The operating system distribution. Valid values:</p>
         * <ul>
         * <li>CentOS</li>
         * <li>AliyunLinux</li>
         * <li>QbootAliyunLinux</li>
         * <li>Qboot</li>
         * <li>Windows</li>
         * <li>WindowsCore
         * Default value: <code>CentOS</code>.</li>
         * </ul>
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
         * <p><strong>[Deprecated]</strong> When the Terway network plug-in is selected, you must specify the vSwitches used to assign IP addresses to pods. Each pod vSwitch corresponds to a worker node vSwitch, and they must be in the same zone.</p>
         * <blockquote>
         * <p>We recommend that the subnet mask length of the pod vSwitch does not exceed 19, and the maximum subnet mask length does not exceed 25. Otherwise, the number of pod IP addresses that can be allocated in the cluster network is very limited, which affects the normal use of the cluster.</p>
         * </blockquote>
         */
        public Builder podVswitchIds(java.util.List<String> podVswitchIds) {
            this.putBodyParameter("pod_vswitch_ids", podVswitchIds);
            this.podVswitchIds = podVswitchIds;
            return this;
        }

        /**
         * <p>The cluster subtype when <code>cluster_type</code> is set to <code>ManagedKubernetes</code>, which indicates an ACK managed cluster. Valid values:</p>
         * <ul>
         * <li><code>Default</code>: ACK managed clusters, including ACK Pro and ACK ACK clusters.</li>
         * <li><code>Edge</code>: ACK Edge clusters, including ACK Edge Pro and ACK Edge ACK clusters.</li>
         * <li><code>Serverless</code>: ACK Serverless clusters, including ACK Serverless Pro and ACK Serverless ACK clusters.</li>
         * <li><code>Lingjun</code>: ACK Lingjun clusters, which provide the Pro edition.</li>
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
         * <li><code>iptables</code>: A mature and stable kube-proxy mode. Service discovery and load balancing for Kubernetes Services are configured by using iptables rules. However, the performance is average and greatly affected by the scale. This mode is suitable for clusters with a small number of Services.</li>
         * <li><code>ipvs</code>: A high-performance kube-proxy mode. Service discovery and load balancing for Kubernetes Services are configured by using the Linux IPVS module. This mode is suitable for clusters with a large number of Services and scenarios that require high-performance load balancing.</li>
         * <li><code>nftables</code>: A next-generation kube-proxy mode. Service discovery and load balancing are implemented based on Linux nftables, which is a modern alternative to iptables. Compared with iptables, nftables provides better network performance, rule update efficiency, and performance in large-scale Service scenarios.
         * This mode is supported only in clusters of Kubernetes 1.35 and later. The Kubernetes community deprecated IPVS in version 1.35. We recommend that you use nftables for new clusters to obtain long-term community support.
         * Default value: <code>ipvs</code>.</li>
         * </ul>
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
         * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>rds_instances</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead. The list of ApsaraDB RDS instances to which you want to add the cluster to the whitelist. We recommend that you add the pod CIDR block and node CIDR block to the RDS whitelist. If you specify RDS instances here, nodes may fail to be created because the instances are not in the running state.</p>
         */
        public Builder rdsInstances(java.util.List<String> rdsInstances) {
            this.putBodyParameter("rds_instances", rdsInstances);
            this.rdsInstances = rdsInstances;
            return this;
        }

        /**
         * <p>The ID of the region where the cluster is deployed. For details, see <a href="https://help.aliyun.com/document_detail/216938.html">Regions supported by container service</a>.</p>
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
         * <p>The ID of the resource group to which the cluster belongs. This parameter is used to isolate different resources.</p>
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
         * <p>The configuration of the RAM Roles for Service Accounts (RRSA) feature.</p>
         */
        public Builder rrsaConfig(RrsaConfig rrsaConfig) {
            this.putBodyParameter("rrsa_config", rrsaConfig);
            this.rrsaConfig = rrsaConfig;
            return this;
        }

        /**
         * <p>The container runtime used in the cluster. Valid values: containerd, sandboxed container, and Docker.</p>
         * <blockquote>
         * <p>Kubernetes 1.24 and later no longer support Docker as a built-in container runtime.
         * For more information, see <a href="https://help.aliyun.com/document_detail/160313.html">Comparison among Docker, containerd, and sandboxed container runtimes</a>.</p>
         * </blockquote>
         */
        public Builder runtime(Runtime runtime) {
            this.putBodyParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * <p>The ID of the security group. Required when you create a cluster by using an existing security group. This parameter and is_enterprise_security_group are mutually exclusive. Cluster nodes are automatically added to this security group.</p>
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
         * <p><strong>[Deprecated]</strong> For control plane configurations, use the <code>security_hardening_os</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>security_hardening_os</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead. Specifies whether to enable Alibaba Cloud OS security hardening. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enabled.</li>
         * <li><code>false</code>: Disabled.
         * Default value: <code>false</code>.</li>
         * </ul>
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
         * <p>A ServiceAccount is an access credential for communication between pods and the cluster API server. The <code>service-account-issuer</code> is the issuer identity in the <code>serviceaccount token</code>, which is the <code>iss</code> field in the <code>token payload</code>. For more information about <code>ServiceAccount</code>, see <a href="https://help.aliyun.com/document_detail/160384.html">Deploy service account token volume projection</a>.</p>
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
         * <p>The CIDR block of the Service network. Valid values: 10.0.0.0/16 to 10.0.0.0/24, 172.16.0.0/16 to 172.31.0.0/24, and 192.168.0.0/16 to 192.168.0.0/24. The CIDR block cannot overlap with the VPC CIDR block 10.1.0.0/21 or the CIDR blocks used by existing Kubernetes clusters in the VPC. The CIDR block cannot be modified after the cluster is created. Default value: 172.19.0.0/20.</p>
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
         * <p><strong>[Deprecated]</strong> The service discovery type used in the cluster. This parameter is used to specify the service discovery method in an <code>ACK Serverless</code> cluster. Valid values:</p>
         * <ul>
         * <li><code>CoreDNS</code>: Uses the standard Kubernetes service discovery component CoreDNS. You must deploy a group of containers in the cluster for DNS resolution. By default, two ECI instances with 0.25 vCPUs and 512 MiB of memory are used.</li>
         * <li><code>PrivateZone</code>: Uses Alibaba Cloud PrivateZone to provide service discovery capabilities. You must activate the PrivateZone service.
         * Default value: None (disabled).</li>
         * </ul>
         */
        public Builder serviceDiscoveryTypes(java.util.List<String> serviceDiscoveryTypes) {
            this.putBodyParameter("service_discovery_types", serviceDiscoveryTypes);
            this.serviceDiscoveryTypes = serviceDiscoveryTypes;
            return this;
        }

        /**
         * <p>Specifies whether to configure SNAT for the VPC. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables automatic creation of a NAT gateway and configures SNAT rules. Settings: <code>true</code> is required if nodes and applications in the cluster need to access the Internet.</li>
         * <li><code>false</code>: Does not create a NAT gateway or configure SNAT rules. Nodes and applications in the cluster cannot access the Internet.<blockquote>
         * <p>If you do not enable this feature when you create the cluster, you can <a href="https://help.aliyun.com/document_detail/178480.html">manually enable it</a> later if your business needs to access the Internet.
         * Default value: <code>false</code>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder snatEntry(Boolean snatEntry) {
            this.putBodyParameter("snat_entry", snatEntry);
            this.snatEntry = snatEntry;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> For control plane node configurations, use the <code>soc_enabled</code> parameter under <code>control_plane_config</code> instead. For node pool configurations, use the <code>soc_enabled</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead. Specifies whether to enable mlps 2.0 security hardening. For more information, see <a href="https://help.aliyun.com/document_detail/196148.html">ACK mlps 2.0 security hardening instructions</a>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enabled.</li>
         * <li><code>false</code>: Disabled.
         * Default value: <code>false</code>.</li>
         * </ul>
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
         * <p>Specifies whether to enable public SSH access. This parameter is used to log on to the master nodes of an ACK dedicated cluster. This parameter does not take effect in managed clusters. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enabled.</li>
         * <li><code>false</code>: Disabled.
         * Default value: <code>false</code>.</li>
         * </ul>
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
         * <p>The support policy for the cluster version. The value is case-sensitive. Valid values:</p>
         * <ul>
         * <li>Standard: Standard support.</li>
         * <li>Extended: Extended support. After the standard support period ends, the cluster enters the extended support period and continues to receive CVE patch versions.
         * Only ACK Pro managed clusters (where <code>cluster_spec</code> is set to <code>ack.pro.*</code> and <code>profile</code> is set to <code>Default</code>) support the <code>Extended</code> value. Specifying <code>Extended</code> for ACK Basic, ACS, ACK Edge managed, and ACK dedicated clusters will be rejected. Patch versions in the extended support period are also applicable only to ACK Pro managed clusters. Specifying such versions for other cluster types will be rejected. If this parameter is not specified, the default value is determined by the server configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Extended</p>
         */
        public Builder supportPolicy(String supportPolicy) {
            this.putBodyParameter("support_policy", supportPolicy);
            this.supportPolicy = supportPolicy;
            return this;
        }

        /**
         * <p>The node tags. Tag definition rules:</p>
         * <ul>
         * <li>A tag is a case-sensitive key-value pair. You can configure up to 20 tags.</li>
         * <li>Tag keys must be unique and can be up to 64 characters in length. Tag values can be empty and can be up to 128 characters in length. Tag keys and values cannot start with &quot;aliyun&quot;, &quot;acs:&quot;, &quot;https://&quot;, or &quot;http://&quot;. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</li>
         * </ul>
         */
        public Builder tags(java.util.List<Tag> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>taints</code> parameter under <code>kubernetes_config</code> in <code>nodepool</code> instead. The taints of the nodes. Taints and tolerations work together to prevent pods from being scheduled to inappropriate nodes. For more information, see <a href="https://kubernetes.io/docs/concepts/scheduling-eviction/taint-and-toleration/">Taints and Tolerations</a>.
         * <a href="https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/">taint-and-toleration</a></p>
         */
        public Builder taints(java.util.List<Taint> taints) {
            this.putBodyParameter("taints", taints);
            this.taints = taints;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> By default, no rollback is performed when cluster creation fails. You must manually clean up the failed cluster. The timeout period for cluster creation, in minutes. Default value: <code>60</code>.</p>
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
         * <p>The time zone used by the cluster. For more information, see <a href="https://help.aliyun.com/document_detail/354879.html">Supported time zones</a>.</p>
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
         * <p>The custom cluster CA certificate.</p>
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
         * <p><strong>[Deprecated]</strong> The custom node data.</p>
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
         * <p>The ID of the VPC used by the cluster. This parameter is required when you create the cluster.</p>
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
         * <p>The vSwitches where the cluster nodes are deployed. This parameter is required when you create a managed cluster with zero nodes.</p>
         */
        public Builder vswitchIds(java.util.List<String> vswitchIds) {
            this.putBodyParameter("vswitch_ids", vswitchIds);
            this.vswitchIds = vswitchIds;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>auto_renew</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead. Specifies whether to enable auto-renewal for worker nodes. This parameter takes effect only when <code>worker_instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enabled.</li>
         * <li><code>false</code>: Disabled.
         * Default value: <code>true</code>.</li>
         * </ul>
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
         * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>auto_renew_period</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
         * <p>The auto-renewal epoch for worker nodes. This parameter takes effect and is required only when the subscription billing method is selected.</p>
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
         * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>data_disks</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
         * <p>The combination of configurations such as the type and size of the data cloud disks for worker nodes.</p>
         */
        public Builder workerDataDisks(java.util.List<WorkerDataDisks> workerDataDisks) {
            this.putBodyParameter("worker_data_disks", workerDataDisks);
            this.workerDataDisks = workerDataDisks;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>instance_charge_type</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
         * <p>The billing method for worker nodes. Valid values:</p>
         * <ul>
         * <li><code>PrePaid</code>: Subscription.</li>
         * <li><code>PostPaid</code>: Pay-as-you-go.</li>
         * </ul>
         * <p>Default value: <code>PostPaid</code>.</p>
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
         * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>instance_types</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
         * <p>The instance configurations for worker nodes.</p>
         */
        public Builder workerInstanceTypes(java.util.List<String> workerInstanceTypes) {
            this.putBodyParameter("worker_instance_types", workerInstanceTypes);
            this.workerInstanceTypes = workerInstanceTypes;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>period</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
         * <p>The subscription duration for worker nodes. This parameter takes effect and is required only when <code>worker_instance_charge_type</code> is set to <code>PrePaid</code>.</p>
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
         * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>period_unit</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
         * <p>The subscription period unit for worker nodes. This parameter is required when the billing method is set to <code>PrePaid</code>.</p>
         * <p>Valid value: <code>Month</code>. Currently, only month is supported.</p>
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
         * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>system_disk_category</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
         * <p>The type of the system cloud disk for worker nodes. For more information, see <a href="https://help.aliyun.com/document_detail/63136.html">Block Storage overview</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>cloud_efficiency</code>: Ultra cloud disk.</li>
         * <li><code>cloud_ssd</code>: Standard SSD.</li>
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
         * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>system_disk_performance_level</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
         * <p>When the system cloud disk is an ESSD, you can configure the performance level (PL). For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</p>
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
         * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>system_disk_size</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
         * <p>The size of the system cloud disk for worker nodes. Unit: GiB.</p>
         * <p>Valid values: 40 to 500.</p>
         * <p>The value of this parameter must be greater than or equal to the maximum of 40 and the image size.</p>
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
         * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>system_disk_snapshot_policy_id</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
         * <p>The ID of the automatic snapshot policy applied to the system cloud disk of worker nodes.</p>
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
         * <p><strong>[Deprecated]</strong> For node pool configurations, use the <code>vswitch_ids</code> parameter under <code>scaling_group</code> in <code>nodepool</code> instead.</p>
         * <p>The list of vSwitches used by cluster nodes. Each node corresponds to one vSwitch.</p>
         * <p>When you create a managed cluster with zero nodes, the <code>worker_vswitch_ids</code> parameter is not required, but you must specify <code>vswitch_ids</code>.</p>
         */
        public Builder workerVswitchIds(java.util.List<String> workerVswitchIds) {
            this.putBodyParameter("worker_vswitch_ids", workerVswitchIds);
            this.workerVswitchIds = workerVswitchIds;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Use the <code>zone_ids</code> parameter instead.</p>
         * <p>The zone ID of the region where the cluster resides. This parameter is specific to managed ACK clusters.</p>
         * <p>When you create a managed ACK cluster, if <code>vpc_id</code> and <code>vswitch_ids</code> are not specified, you must specify <code>zone_id</code> for the cluster to automatically create a VPC and network resources in this zone. If <code>vpc_id</code> and <code>vswitch_ids</code> are specified, this parameter does not take effect.</p>
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
         * <p>The zone IDs of the region where the cluster resides. This parameter is specific to managed ACK clusters.</p>
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
    public static class AuditLogConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("sls_project_name")
        private String slsProjectName;

        private AuditLogConfig(Builder builder) {
            this.enabled = builder.enabled;
            this.slsProjectName = builder.slsProjectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuditLogConfig create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return slsProjectName
         */
        public String getSlsProjectName() {
            return this.slsProjectName;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String slsProjectName; 

            private Builder() {
            } 

            private Builder(AuditLogConfig model) {
                this.enabled = model.enabled;
                this.slsProjectName = model.slsProjectName;
            } 

            /**
             * <p>Specifies whether to enable the cluster audit log feature. Valid values:</p>
             * <ul>
             * <li><p>true: Enabled.</p>
             * </li>
             * <li><p>false: Disabled.</p>
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
             * <p>The <a href="https://help.aliyun.com/document_detail/48873.html">SLS Project</a> where the <a href="https://help.aliyun.com/document_detail/48873.html">Logstore</a> for cluster audit logs is located.</p>
             * <ul>
             * <li><p>Default value: <code>k8s-log-{clusterid}</code>.</p>
             * </li>
             * <li><p>After you enable the cluster audit log feature, a Logstore for cluster audit logs is created in the specified SLS Project.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>k8s-log-c2345xxxxxxxxxxxx</p>
             */
            public Builder slsProjectName(String slsProjectName) {
                this.slsProjectName = slsProjectName;
                return this;
            }

            public AuditLogConfig build() {
                return new AuditLogConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class AutoMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        private AutoMode(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoMode create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private Boolean enable; 

            private Builder() {
            } 

            private Builder(AutoMode model) {
                this.enable = model.enable;
            } 

            /**
             * <p>Specifies whether to enable the intelligent managed mode. Valid values:</p>
             * <ul>
             * <li><p>true: Enabled.</p>
             * </li>
             * <li><p>false: Disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public AutoMode build() {
                return new AutoMode(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("instance_metadata_options")
        private InstanceMetadataOptions instanceMetadataOptions;

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
            this.instanceMetadataOptions = builder.instanceMetadataOptions;
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
         * @return instanceMetadataOptions
         */
        public InstanceMetadataOptions getInstanceMetadataOptions() {
            return this.instanceMetadataOptions;
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
            private InstanceMetadataOptions instanceMetadataOptions; 
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
                this.instanceMetadataOptions = model.instanceMetadataOptions;
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
             * <p>Specifies whether to enable auto-renewal for control plane nodes. This parameter takes effect only when the billing method is set to PrePaid. Valid values:</p>
             * <ul>
             * <li>true: enables auto-renewal.</li>
             * <li>false: disables auto-renewal.</li>
             * </ul>
             * <p>Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * <p>The auto-renewal period for control plane nodes. Valid values: 1, 2, 3, 6, and 12. Unit: months.</p>
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
             * <p>The billing method for control plane nodes. Valid values:</p>
             * <ul>
             * <li>PrePaid: subscription.</li>
             * <li>PostPaid: pay-as-you-go.</li>
             * </ul>
             * <p>Default value: PostPaid.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>Specifies whether to install the CloudMonitor agent on the nodes. Valid values:</p>
             * <ul>
             * <li>true: installs the CloudMonitor agent.</li>
             * <li>false: does not install the CloudMonitor agent.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder cloudMonitorFlags(Boolean cloudMonitorFlags) {
                this.cloudMonitorFlags = cloudMonitorFlags;
                return this;
            }

            /**
             * <p>The CPU management policy for nodes. Valid values:</p>
             * <ul>
             * <li>static: allows you to enhance CPU affinity and exclusivity for pods with specific resource characteristics on the node.</li>
             * <li>none: uses the default CPU affinity policy.</li>
             * </ul>
             * <p>Default value: none.</p>
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
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_3_x64_20G_alibase_20240819.vhd</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The type of the operating system image.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunLinux3</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * <p>The instance metadata access configuration for ECS instances. This parameter is available only to users in the whitelist. To use this parameter, submit a ticket.</p>
             */
            public Builder instanceMetadataOptions(InstanceMetadataOptions instanceMetadataOptions) {
                this.instanceMetadataOptions = instanceMetadataOptions;
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
             * <p>The name of the key pair. You must specify this parameter or the login_password parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ack</p>
             */
            public Builder keyPair(String keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * <p>The SSH logon password. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. You must specify this parameter or the key_pair parameter.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The service port range of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>30000-32767</p>
             */
            public Builder nodePortRange(String nodePortRange) {
                this.nodePortRange = nodePortRange;
                return this;
            }

            /**
             * <p>The subscription period for control plane nodes. This parameter is required and takes effect only when the billing method is set to PrePaid. Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60. Unit: months.</p>
             * <p>Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The unit of the subscription period for control plane nodes. This parameter is required and takes effect only when the billing method is set to PrePaid. Valid value: Month. Currently, only months are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The name of the runtime for control plane nodes. Valid value:</p>
             * <p>containerd: the containerd runtime, which supports all cluster versions.</p>
             * 
             * <strong>example:</strong>
             * <p>containerd</p>
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>Specifies whether to enable security hardening for Alibaba Cloud OS. Valid values:</p>
             * <ul>
             * <li>true: enables security hardening for Alibaba Cloud OS.</li>
             * <li>false: disables security hardening for Alibaba Cloud OS.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder securityHardeningOs(Boolean securityHardeningOs) {
                this.securityHardeningOs = securityHardeningOs;
                return this;
            }

            /**
             * <p>The number of control plane nodes. Valid values: 3 and 5.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>Specifies whether to enable MLPS 2.0 security hardening. Valid values:</p>
             * <ul>
             * <li>true: enables MLPS 2.0 security hardening.</li>
             * <li>false: disables MLPS 2.0 security hardening.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder socEnabled(Boolean socEnabled) {
                this.socEnabled = socEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to enable the performance burst feature for the system cloud disk of the node. Valid values:</p>
             * <ul>
             * <li>true: enables the feature.</li>
             * <li>false: disables the feature.</li>
             * </ul>
             * <p>This parameter is supported only when system_disk_category is set to cloud_auto.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder systemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
                this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
                return this;
            }

            /**
             * <p>The type of the system cloud disk for the node. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>cloud_essd: ESSD.</li>
             * <li>cloud_auto: ESSD AutoPL cloud disk.</li>
             * <li>cloud_essd_entry: ESSD Entry cloud disk.</li>
             * </ul>
             * <p>Default value: cloud_ssd. The default value may vary by zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The performance level of the system cloud disk for the node. This parameter takes effect only for ESSDs. The performance level varies based on the disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD (standard SSD)</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * <p>The provisioned read and write IOPS for the system cloud disk of the node. Valid values: 0 to min{50,000, 1000 × capacity - baseline performance}. Baseline performance = min{1,800 + 50 × capacity, 50,000}. </p>
             * <p>This parameter is supported only when system_disk_category is set to cloud_auto.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder systemDiskProvisionedIops(Long systemDiskProvisionedIops) {
                this.systemDiskProvisionedIops = systemDiskProvisionedIops;
                return this;
            }

            /**
             * <p>The size of the system cloud disk for the node. Valid values: 40 to 500. Unit: GiB.</p>
             * <p>Default value: 120.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The ID of the automatic snapshot policy for the node.</p>
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
    public static class InternalDnsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bind_vpcs")
        private java.util.List<String> bindVpcs;

        private InternalDnsConfig(Builder builder) {
            this.bindVpcs = builder.bindVpcs;
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

        public static final class Builder {
            private java.util.List<String> bindVpcs; 

            private Builder() {
            } 

            private Builder(InternalDnsConfig model) {
                this.bindVpcs = model.bindVpcs;
            } 

            /**
             * <p>The VPCs where the internal DNS records of the cluster take effect.</p>
             */
            public Builder bindVpcs(java.util.List<String> bindVpcs) {
                this.bindVpcs = bindVpcs;
                return this;
            }

            public InternalDnsConfig build() {
                return new InternalDnsConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
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
             * <p>The type of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The ID of the NLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>nlb-0ogk9aaxxxxxxx</p>
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
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
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
             * <p>The internal DNS configuration of the cluster, which applies to ACK managed clusters. The internal domain name is used by node-side system components such as kubelet and kube-proxy to access the API server. If internal domain name access is not enabled, node-side system components access the API server by using the IP address of the CLB instance.</p>
             */
            public Builder internalDnsConfig(InternalDnsConfig internalDnsConfig) {
                this.internalDnsConfig = internalDnsConfig;
                return this;
            }

            /**
             * <p>The connection configuration of the cluster. If you specify this parameter, the endpoint_public_access and load_balancer_id parameters do not take effect. ACK supports only automatic creation of NLB instances. To specify a CLB or NLB instance, use load_balancers_config to specify the corresponding instance ID.</p>
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
             * <p>The automatic cluster upgrade channel. Valid values:</p>
             * <ul>
             * <li>patch: Automatically upgrades to the patch version when a patch version is available for the current minor version. The new Kubernetes version does not include breaking changes.</li>
             * <li>stable: Automatically upgrades to the latest patch version of the second most recent minor version. The new Kubernetes version may include API and feature changes, but its stability has been widely verified.</li>
             * <li>rapid: Automatically upgrades to the latest patch version of the latest minor version to obtain new features from the Kubernetes community faster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>stable</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>Specifies whether to enable automatic cluster upgrade. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.</li>
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
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class RrsaConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        private RrsaConfig(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RrsaConfig create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(RrsaConfig model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>Specifies whether to enable the RRSA feature. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public RrsaConfig build() {
                return new RrsaConfig(this);
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
             * <p>The type of the data cloud disk.</p>
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
             * <p>Specifies whether to encrypt the data cloud disk. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Encrypts the data cloud disk.</li>
             * <li><code>false</code>: Does not encrypt the data cloud disk.</li>
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
             * <p>The performance level of the data cloud disk. This parameter takes effect only for <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The size of the data cloud disk. Valid values: 40 to 32767. Unit: GiB.</p>
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
