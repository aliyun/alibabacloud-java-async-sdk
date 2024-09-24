// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("access_control_list")
    private java.util.List < String > accessControlList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("addons")
    private java.util.List < Addon > addons;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("api_audiences")
    private String apiAudiences;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("auto_renew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("auto_renew_period")
    private Long autoRenewPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("charge_type")
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cis_enabled")
    @Deprecated
    private Boolean cisEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cloud_monitor_flags")
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
    @com.aliyun.core.annotation.NameInMap("controlplane_log_components")
    private java.util.List < String > controlplaneLogComponents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("controlplane_log_project")
    private String controlplaneLogProject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("controlplane_log_ttl")
    private String controlplaneLogTtl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cpu_policy")
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
    private Boolean formatDisk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image_id")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image_type")
    private String imageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instances")
    private java.util.List < String > instances;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ip_stack")
    private String ipStack;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("is_enterprise_security_group")
    private Boolean isEnterpriseSecurityGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keep_instance_name")
    private Boolean keepInstanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("key_pair")
    private String keyPair;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kubernetes_version")
    private String kubernetesVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("load_balancer_id")
    private String loadBalancerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("load_balancer_spec")
    private String loadBalancerSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("logging_type")
    private String loggingType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("login_password")
    private String loginPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_auto_renew")
    private Boolean masterAutoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_auto_renew_period")
    private Long masterAutoRenewPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_count")
    private Long masterCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_instance_charge_type")
    private String masterInstanceChargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_instance_types")
    private java.util.List < String > masterInstanceTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_period")
    private Long masterPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_period_unit")
    private String masterPeriodUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_system_disk_category")
    private String masterSystemDiskCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_system_disk_performance_level")
    private String masterSystemDiskPerformanceLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_system_disk_size")
    private Long masterSystemDiskSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_system_disk_snapshot_policy_id")
    private String masterSystemDiskSnapshotPolicyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_vswitch_ids")
    private java.util.List < String > masterVswitchIds;

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
    private String nodeNameMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("node_port_range")
    private String nodePortRange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodepools")
    private java.util.List < Nodepool > nodepools;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("num_of_nodes")
    @Deprecated
    private Long numOfNodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("os_type")
    private String osType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("period")
    private Long period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("period_unit")
    private String periodUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("platform")
    private String platform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pod_vswitch_ids")
    private java.util.List < String > podVswitchIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("profile")
    private String profile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("proxy_mode")
    private String proxyMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rds_instances")
    private java.util.List < String > rdsInstances;

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
    private java.util.List < String > serviceDiscoveryTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("snat_entry")
    private Boolean snatEntry;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("soc_enabled")
    private Boolean socEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ssh_flags")
    private Boolean sshFlags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List < Tag > tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taints")
    private java.util.List < Taint > taints;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timeout_mins")
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
    private java.util.List < String > vswitchIds;

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
    private java.util.List < WorkerDataDisks> workerDataDisks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_instance_charge_type")
    @Deprecated
    private String workerInstanceChargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_instance_types")
    @Deprecated
    private java.util.List < String > workerInstanceTypes;

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
    private java.util.List < String > workerVswitchIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("zone_id")
    @Deprecated
    private String zoneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("zone_ids")
    private java.util.List < String > zoneIds;

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
    public java.util.List < String > getAccessControlList() {
        return this.accessControlList;
    }

    /**
     * @return addons
     */
    public java.util.List < Addon > getAddons() {
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
     * @return controlplaneLogComponents
     */
    public java.util.List < String > getControlplaneLogComponents() {
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
    public java.util.List < String > getInstances() {
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
    public java.util.List < String > getMasterInstanceTypes() {
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
    public java.util.List < String > getMasterVswitchIds() {
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
    public java.util.List < Nodepool > getNodepools() {
        return this.nodepools;
    }

    /**
     * @return numOfNodes
     */
    public Long getNumOfNodes() {
        return this.numOfNodes;
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
    public java.util.List < String > getPodVswitchIds() {
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
    public java.util.List < String > getRdsInstances() {
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
    public java.util.List < String > getServiceDiscoveryTypes() {
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
    public java.util.List < Tag > getTags() {
        return this.tags;
    }

    /**
     * @return taints
     */
    public java.util.List < Taint > getTaints() {
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
    public java.util.List < String > getVswitchIds() {
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
    public java.util.List < WorkerDataDisks> getWorkerDataDisks() {
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
    public java.util.List < String > getWorkerInstanceTypes() {
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
    public java.util.List < String > getWorkerVswitchIds() {
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
    public java.util.List < String > getZoneIds() {
        return this.zoneIds;
    }

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private java.util.List < String > accessControlList; 
        private java.util.List < Addon > addons; 
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
        private java.util.List < String > controlplaneLogComponents; 
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
        private java.util.List < String > instances; 
        private String ipStack; 
        private Boolean isEnterpriseSecurityGroup; 
        private Boolean keepInstanceName; 
        private String keyPair; 
        private String kubernetesVersion; 
        private String loadBalancerId; 
        private String loadBalancerSpec; 
        private String loggingType; 
        private String loginPassword; 
        private Boolean masterAutoRenew; 
        private Long masterAutoRenewPeriod; 
        private Long masterCount; 
        private String masterInstanceChargeType; 
        private java.util.List < String > masterInstanceTypes; 
        private Long masterPeriod; 
        private String masterPeriodUnit; 
        private String masterSystemDiskCategory; 
        private String masterSystemDiskPerformanceLevel; 
        private Long masterSystemDiskSize; 
        private String masterSystemDiskSnapshotPolicyId; 
        private java.util.List < String > masterVswitchIds; 
        private String name; 
        private Boolean natGateway; 
        private String nodeCidrMask; 
        private String nodeNameMode; 
        private String nodePortRange; 
        private java.util.List < Nodepool > nodepools; 
        private Long numOfNodes; 
        private String osType; 
        private Long period; 
        private String periodUnit; 
        private String platform; 
        private java.util.List < String > podVswitchIds; 
        private String profile; 
        private String proxyMode; 
        private java.util.List < String > rdsInstances; 
        private String regionId; 
        private String resourceGroupId; 
        private Runtime runtime; 
        private String securityGroupId; 
        private Boolean securityHardeningOs; 
        private String serviceAccountIssuer; 
        private String serviceCidr; 
        private java.util.List < String > serviceDiscoveryTypes; 
        private Boolean snatEntry; 
        private Boolean socEnabled; 
        private Boolean sshFlags; 
        private java.util.List < Tag > tags; 
        private java.util.List < Taint > taints; 
        private Long timeoutMins; 
        private String timezone; 
        private String userCa; 
        private String userData; 
        private String vpcid; 
        private java.util.List < String > vswitchIds; 
        private Boolean workerAutoRenew; 
        private Long workerAutoRenewPeriod; 
        private java.util.List < WorkerDataDisks> workerDataDisks; 
        private String workerInstanceChargeType; 
        private java.util.List < String > workerInstanceTypes; 
        private Long workerPeriod; 
        private String workerPeriodUnit; 
        private String workerSystemDiskCategory; 
        private String workerSystemDiskPerformanceLevel; 
        private Long workerSystemDiskSize; 
        private String workerSystemDiskSnapshotPolicyId; 
        private java.util.List < String > workerVswitchIds; 
        private String zoneId; 
        private java.util.List < String > zoneIds; 

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
         * The network access control list (ACL) of the SLB instance associated with the API server if the cluster is a registered cluster.
         */
        public Builder accessControlList(java.util.List < String > accessControlList) {
            this.putBodyParameter("access_control_list", accessControlList);
            this.accessControlList = accessControlList;
            return this;
        }

        /**
         * The components that you want to install in the cluster. When you create a cluster, you can configure the `addons` parameter to specify the components that you want to install.
         * <p>
         * 
         * **Network plug-in**: required. The Flannel and Terway plug-ins are supported. Select one of the plug-ins for the cluster.
         * 
         * *   If you want to use the Terway component, specify the network plug-in in the \[{"name":"flannel","config":""}] format.
         * *   If you want to use the Terway component, specify the value network plug-in in the \[{"Name": "terway-eniip","Config": ""}] format.
         * 
         * **Volume plug-in**: optional. Only the `Container Storage Interface (CSI)` plug-in is supported.
         * 
         * Specify the `CSI` plug-in in the following format: \[{"name":"csi-plugin","config": ""},{"name": "csi-provisioner","config": ""}].
         * 
         * **Simple Log Service component**: optional. We recommend that you enable Simple Log Service. If Simple Log Service is disabled, you cannot use the cluster auditing feature.
         * 
         * *   Specify an existing `Simple Log Service project` in the following format: \[{"name": "logtail-ds","config": "{"IngressDashboardEnabled":"true","sls_project_name":"your_sls_project_name"}"}].
         * *   To create a `Simple Log Service project`, specify the component in the following format: \[{"name": "logtail-ds","config": "{"IngressDashboardEnabled":"true"}"}].
         * 
         * **Ingress controller**: optional. By default, the `nginx-ingress-controller` component is installed in ACK dedicated clusters.
         * 
         * *   To install nginx-ingress-controller and enable Internet access, specify the Ingress controller in the following format: \[{"name":"nginx-ingress-controller","config":"{"IngressSlbNetworkType":"internet"}"}].
         * *   To disable the automatic installation of nginx-ingress-controller, specify the Ingress controller in the following format: \[{"name": "nginx-ingress-controller","config": "","disabled": true}].
         * 
         * **Event center**: optional. By default, the event center feature is enabled.
         * 
         * You can use ACK event centers to store and query events and configure alerts. You can use the Logstores that are associated with ACK event centers free of charge within 90 days. For more information, see [Create and use an event center](~~150476~~).
         * 
         * To enable the event center feature, specify the event center component in the following format: \[{"name":"ack-node-problem-detector","config":"{"sls_project_name":"your_sls_project_name"}"}].
         */
        public Builder addons(java.util.List < Addon > addons) {
            this.putBodyParameter("addons", addons);
            this.addons = addons;
            return this;
        }

        /**
         * Service accounts provide identities for pods when pods communicate with the `API server` of the cluster. The `api-audiences` parameter validates `tokens` and is used by the `API server` to check whether the `tokens` of requests are valid. Separate multiple values with commas (,).``
         * <p>
         * 
         * For more information about `service accounts`, see [Enable service account token volume projection](~~160384~~).
         */
        public Builder apiAudiences(String apiAudiences) {
            this.putBodyParameter("api_audiences", apiAudiences);
            this.apiAudiences = apiAudiences;
            return this;
        }

        /**
         * auto_renew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("auto_renew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * auto_renew_period.
         */
        public Builder autoRenewPeriod(Long autoRenewPeriod) {
            this.putBodyParameter("auto_renew_period", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * The billing method of the cluster. The following resources are billed on a subscription basis:
         * <p>
         * 
         * ECS instances in node pools.
         * 
         * The internal-facing SLB instance associated with the API server.
         * 
         * Valid values:
         * 
         * PrePaid: subscription.
         * 
         * PostPaid: pay-as-you-go.
         * 
         * Default value: PostPaid.
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("charge_type", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * This parameter is deprecated. Use security_hardening_os instead.
         */
        public Builder cisEnabled(Boolean cisEnabled) {
            this.putBodyParameter("cis_enabled", cisEnabled);
            this.cisEnabled = cisEnabled;
            return this;
        }

        /**
         * Specifies whether to install the CloudMonitor agent. Valid values:
         * <p>
         * 
         * *   `true`: installs the CloudMonitor agent.
         * *   `false`: does not install the CloudMonitor agent.
         * 
         * Default value: `false`.
         */
        public Builder cloudMonitorFlags(Boolean cloudMonitorFlags) {
            this.putBodyParameter("cloud_monitor_flags", cloudMonitorFlags);
            this.cloudMonitorFlags = cloudMonitorFlags;
            return this;
        }

        /**
         * The domain name of the cluster.
         * <p>
         * 
         * The domain name can contain one or more parts that are separated by periods (.). Each part cannot exceed 63 characters in length, and can contain lowercase letters, digits, and hyphens (-). Each part must start and end with a lowercase letter or digit.
         */
        public Builder clusterDomain(String clusterDomain) {
            this.putBodyParameter("cluster_domain", clusterDomain);
            this.clusterDomain = clusterDomain;
            return this;
        }

        /**
         * After you set `cluster_type` to `ManagedKubernetes` and configure the `profile` parameter, you can further specify the cluster edition. Valid values:
         * <p>
         * 
         * *   `ack.pro.small`: Pro Edition.
         * *   `ack.standard`: Basic Edition. If you leave the parameter empty, an ACK Basic cluster is created.
         */
        public Builder clusterSpec(String clusterSpec) {
            this.putBodyParameter("cluster_spec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * *   `Kubernetes`: ACK dedicated cluster.
         * <p>
         * *   `ManagedKubernetes`: ACK managed cluster. ACK managed clusters include ACK Basic clusters, ACK Pro clusters, ACK Serverless clusters (Basic Edition and Pro Edition), ACK Edge clusters (Basic Edition and Pro Edition), and ACK Lingjun clusters (Pro Edition).
         * *   `ExternalKubernetes`: registered cluster.
         */
        public Builder clusterType(String clusterType) {
            this.putBodyParameter("cluster_type", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The pod CIDR block. You can specify 10.0.0.0/8, 172.16-31.0.0/12-16, 192.168.0.0/16, or their subnets as the pod CIDR block. The pod CIDR block cannot overlap with the CIDR block of the VPC in which the cluster is deployed and the CIDR blocks of existing clusters in the VPC. You cannot modify the pod CIDR block after you create the cluster.
         * <p>
         * 
         * For more information about how to plan the network of an ACK cluster, see [Plan the network of an ACK cluster](~~86500~~).
         * 
         * >  This parameter is required if the cluster uses the Flannel plug-in.
         */
        public Builder containerCidr(String containerCidr) {
            this.putBodyParameter("container_cidr", containerCidr);
            this.containerCidr = containerCidr;
            return this;
        }

        /**
         * The list of control plane components for which you want to enable log collection.
         * <p>
         * 
         * By default, the logs of kube-apiserver, kube-controller-manager, and kube-scheduler are collected.
         */
        public Builder controlplaneLogComponents(java.util.List < String > controlplaneLogComponents) {
            this.putBodyParameter("controlplane_log_components", controlplaneLogComponents);
            this.controlplaneLogComponents = controlplaneLogComponents;
            return this;
        }

        /**
         * The Simple Log Service project that is used to store the logs of control plane components. You can use an existing project or create one. If you choose to create a Simple Log Service project, the created project is named in the `k8s-log-{ClusterID}` format.
         */
        public Builder controlplaneLogProject(String controlplaneLogProject) {
            this.putBodyParameter("controlplane_log_project", controlplaneLogProject);
            this.controlplaneLogProject = controlplaneLogProject;
            return this;
        }

        /**
         * The retention period of control plane logs in days.
         */
        public Builder controlplaneLogTtl(String controlplaneLogTtl) {
            this.putBodyParameter("controlplane_log_ttl", controlplaneLogTtl);
            this.controlplaneLogTtl = controlplaneLogTtl;
            return this;
        }

        /**
         * The CPU management policy of nodes in the node pool. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later:
         * <p>
         * 
         * *   `static`: allows pods with specific resource characteristics on the node to be granted with enhanced CPU affinity and exclusivity.
         * *   `none`: specifies that the default CPU affinity is used.
         * 
         * Default value: `none`.
         */
        public Builder cpuPolicy(String cpuPolicy) {
            this.putBodyParameter("cpu_policy", cpuPolicy);
            this.cpuPolicy = cpuPolicy;
            return this;
        }

        /**
         * The custom subject alternative names (SANs) for the API server certificate to accept requests from specified IP addresses or domain names. Separate multiple IP addresses and domain names with commas (,).
         */
        public Builder customSan(String customSan) {
            this.putBodyParameter("custom_san", customSan);
            this.customSan = customSan;
            return this;
        }

        /**
         * Specifies whether to enable cluster deletion protection. If this option is enabled, the cluster cannot be deleted in the ACK console or by calling API operations. Valid values:
         * <p>
         * 
         * *   `true`: enables deletion protection for the cluster. This way, the cluster cannot be deleted in the ACK console or by calling API operations.
         * *   `false`: disables deletion protection for the cluster. This way, the cluster can be deleted in the ACK console or by calling API operations.
         * 
         * Default value: `false`.
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putBodyParameter("deletion_protection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * Specifies whether to perform a rollback when the cluster fails to be created. Valid values:
         * <p>
         * 
         * *   `true`: performs a rollback when the cluster fails to be created.
         * *   `false`: does not perform a rollback when the cluster fails to be created.
         * 
         * Default value: `true`.
         */
        public Builder disableRollback(Boolean disableRollback) {
            this.putBodyParameter("disable_rollback", disableRollback);
            this.disableRollback = disableRollback;
            return this;
        }

        /**
         * Specifies whether to enable the RAM Roles for Service Accounts (RRSA) feature.
         */
        public Builder enableRrsa(Boolean enableRrsa) {
            this.putBodyParameter("enable_rrsa", enableRrsa);
            this.enableRrsa = enableRrsa;
            return this;
        }

        /**
         * The ID of the Key Management Service (KMS) key that is used to encrypt the system disk. For more information, see [What is KMS?](~~28935~~)
         * <p>
         * 
         * >  The key can be used only in ACK Pro clusters.
         */
        public Builder encryptionProviderKey(String encryptionProviderKey) {
            this.putBodyParameter("encryption_provider_key", encryptionProviderKey);
            this.encryptionProviderKey = encryptionProviderKey;
            return this;
        }

        /**
         * Specifies whether to enable Internet access for the cluster. You can use an elastic IP address (EIP) to expose the API server. This way, you can access the cluster over the Internet. Valid values:
         * <p>
         * 
         * *   `true`: enables Internet access for the cluster.
         * *   `false`: disables Internet access for the cluster. If you set the value to false, the API server cannot be accessed over the Internet.
         * 
         * Default value: `false`.
         */
        public Builder endpointPublicAccess(Boolean endpointPublicAccess) {
            this.putBodyParameter("endpoint_public_access", endpointPublicAccess);
            this.endpointPublicAccess = endpointPublicAccess;
            return this;
        }

        /**
         * Specifies whether to mount a data disk to a node that is created based on an existing ECS instance. Valid values:
         * <p>
         * 
         * *   `true`: stores the data of containers and images on a data disk. The existing data stored on the data disk is lost. Back up the existing data first.
         * *   `false`: does not store the data of containers and images on a data disk.
         * 
         * Default value: `false`.
         * 
         * How data disks are mounted:
         * 
         * *   If an ECS instance has data disks mounted and the file system of the last data disk is not initialized, the system automatically formats the data disk to ext4. Then, the system mounts the data disk to /var/lib/docker and /var/lib/kubelet.
         * *   If no data disk is mounted to the ECS instance, the system does not purchase a new data disk.
         */
        public Builder formatDisk(Boolean formatDisk) {
            this.putBodyParameter("format_disk", formatDisk);
            this.formatDisk = formatDisk;
            return this;
        }

        /**
         * The custom image. By default, the image provided by ACK is used. You can select a custom image to replace the default image. For more information, see [Use a custom image to create an ACK cluster](~~146647~~).
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("image_id", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The type of OS distribution that you want to use. To specify the node OS, we recommend that you use this parameter. Valid values:
         * <p>
         * 
         * *   CentOS
         * *   AliyunLinux
         * *   AliyunLinux Qboot
         * *   AliyunLinuxUEFI
         * *   AliyunLinux3
         * *   Windows
         * *   WindowsCore
         * *   AliyunLinux3Arm64
         * *   ContainerOS
         * 
         * Default value: `CentOS`.
         */
        public Builder imageType(String imageType) {
            this.putBodyParameter("image_type", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * The existing ECS instances that are specified as worker nodes for the cluster.
         * <p>
         * 
         * >  This parameter is required if you create worker nodes on existing ECS instances.
         */
        public Builder instances(java.util.List < String > instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * The IP stack of the cluster.
         */
        public Builder ipStack(String ipStack) {
            this.putBodyParameter("ip_stack", ipStack);
            this.ipStack = ipStack;
            return this;
        }

        /**
         * Specifies whether to create an advanced security group. This parameter takes effect only if `security_group_id` is not specified.
         * <p>
         * 
         * >  To use a basic security group, make sure that the sum of the number of nodes in the cluster and the number of pods that use Terway does not exceed 2,000. Therefore, we recommend that you specify an advanced security group for a cluster that uses Terway.
         * 
         * *   `true`: creates an advanced security group.
         * *   `false`: does not create an advanced security group.
         * 
         * Default value: `true`.
         */
        public Builder isEnterpriseSecurityGroup(Boolean isEnterpriseSecurityGroup) {
            this.putBodyParameter("is_enterprise_security_group", isEnterpriseSecurityGroup);
            this.isEnterpriseSecurityGroup = isEnterpriseSecurityGroup;
            return this;
        }

        /**
         * Specifies whether to retain the names of existing ECS instances that are used in the cluster. Valid values:
         * <p>
         * 
         * *   `true`: retains the names.
         * *   `false`: does not retain the names. The system assigns new names.
         * 
         * Default value: `true`.
         */
        public Builder keepInstanceName(Boolean keepInstanceName) {
            this.putBodyParameter("keep_instance_name", keepInstanceName);
            this.keepInstanceName = keepInstanceName;
            return this;
        }

        /**
         * The name of the key pair. You must specify this parameter or the `login_password` parameter.
         */
        public Builder keyPair(String keyPair) {
            this.putBodyParameter("key_pair", keyPair);
            this.keyPair = keyPair;
            return this;
        }

        /**
         * The Kubernetes version of the cluster. The Kubernetes versions supported by ACK are the same as the Kubernetes versions supported by open source Kubernetes. We recommend that you specify the latest Kubernetes version. If you do not specify this parameter, the latest Kubernetes version is used.
         * <p>
         * 
         * You can create clusters of the latest two Kubernetes versions in the ACK console. If you want to create clusters that run earlier Kubernetes versions, use the ACK API. For more information about the Kubernetes versions supported by ACK, see [Support for Kubernetes versions](~~185269~~).
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.putBodyParameter("kubernetes_version", kubernetesVersion);
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * load_balancer_id.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putBodyParameter("load_balancer_id", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * The specification of the Server Load Balancer (SLB) instance. Valid values:
         * <p>
         * 
         * *   slb.s1.small
         * *   slb.s2.small
         * *   slb.s2.medium
         * *   slb.s3.small
         * *   slb.s3.medium
         * *   slb.s3.large
         * 
         * Default value: `slb.s2.small`.
         */
        public Builder loadBalancerSpec(String loadBalancerSpec) {
            this.putBodyParameter("load_balancer_spec", loadBalancerSpec);
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }

        /**
         * Enables Simple Log Service for the cluster. This parameter takes effect only for ACK Serverless clusters. Valid value: `SLS`.
         */
        public Builder loggingType(String loggingType) {
            this.putBodyParameter("logging_type", loggingType);
            this.loggingType = loggingType;
            return this;
        }

        /**
         * The password for SSH logon. You must specify this parameter or `key_pair`. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.
         */
        public Builder loginPassword(String loginPassword) {
            this.putBodyParameter("login_password", loginPassword);
            this.loginPassword = loginPassword;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for master nodes. This parameter takes effect only when `master_instance_charge_type` is set to `PrePaid`. Valid values:
         * <p>
         * 
         * *   `true`: enables auto-renewal.
         * *   `false`: disables auto-renewal.
         * 
         * Default value: `true`.
         */
        public Builder masterAutoRenew(Boolean masterAutoRenew) {
            this.putBodyParameter("master_auto_renew", masterAutoRenew);
            this.masterAutoRenew = masterAutoRenew;
            return this;
        }

        /**
         * The auto-renewal duration. This parameter takes effect and is required only when the subscription billing method is selected for master nodes.
         * <p>
         * 
         * Valid values: 1, 2, 3, 6, and 12.
         * 
         * Default value: 1.
         */
        public Builder masterAutoRenewPeriod(Long masterAutoRenewPeriod) {
            this.putBodyParameter("master_auto_renew_period", masterAutoRenewPeriod);
            this.masterAutoRenewPeriod = masterAutoRenewPeriod;
            return this;
        }

        /**
         * The number of master nodes. Valid values: `3` and `5`.
         * <p>
         * 
         * Default value: `3`.
         */
        public Builder masterCount(Long masterCount) {
            this.putBodyParameter("master_count", masterCount);
            this.masterCount = masterCount;
            return this;
        }

        /**
         * The billing method of master nodes. Valid values:
         * <p>
         * 
         * *   `PrePaid`: subscription.
         * *   `PostPaid`: the pay-as-you-go.
         * 
         * Default value: `PostPaid`.
         */
        public Builder masterInstanceChargeType(String masterInstanceChargeType) {
            this.putBodyParameter("master_instance_charge_type", masterInstanceChargeType);
            this.masterInstanceChargeType = masterInstanceChargeType;
            return this;
        }

        /**
         * The instance types of master nodes. For more information, see [Overview of instance families](~~25378~~).
         */
        public Builder masterInstanceTypes(java.util.List < String > masterInstanceTypes) {
            this.putBodyParameter("master_instance_types", masterInstanceTypes);
            this.masterInstanceTypes = masterInstanceTypes;
            return this;
        }

        /**
         * The subscription duration of master nodes. This parameter takes effect and is required only when `master_instance_charge_type` is set to `PrePaid`.
         * <p>
         * 
         * Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60.
         * 
         * Default value: 1.
         */
        public Builder masterPeriod(Long masterPeriod) {
            this.putBodyParameter("master_period", masterPeriod);
            this.masterPeriod = masterPeriod;
            return this;
        }

        /**
         * The billing cycle of the master nodes in the cluster. This parameter is required if master_instance_charge_type is set to `PrePaid`.
         * <p>
         * 
         * Valid value: `Month`, which indicates that master nodes are billed only on a monthly basis.
         */
        public Builder masterPeriodUnit(String masterPeriodUnit) {
            this.putBodyParameter("master_period_unit", masterPeriodUnit);
            this.masterPeriodUnit = masterPeriodUnit;
            return this;
        }

        /**
         * The system disk type of master nodes. Valid values:
         * <p>
         * 
         * *   `cloud_efficiency`: ultra disk.
         * *   `cloud_ssd`: standard SSD.
         * *   `cloud_essd`: Enterprise SSD (ESSD).
         * 
         * Default value: `cloud_ssd`. The default value may vary in different zones.
         */
        public Builder masterSystemDiskCategory(String masterSystemDiskCategory) {
            this.putBodyParameter("master_system_disk_category", masterSystemDiskCategory);
            this.masterSystemDiskCategory = masterSystemDiskCategory;
            return this;
        }

        /**
         * The performance level (PL) of the system disk that you want to use for master nodes. This parameter takes effect only for ESSDs. For more information about the relationship between disk PLs and disk sizes, see [ESSDs](~~122389~~).
         */
        public Builder masterSystemDiskPerformanceLevel(String masterSystemDiskPerformanceLevel) {
            this.putBodyParameter("master_system_disk_performance_level", masterSystemDiskPerformanceLevel);
            this.masterSystemDiskPerformanceLevel = masterSystemDiskPerformanceLevel;
            return this;
        }

        /**
         * The system disk size of master nodes. Valid values: 40 to 500. Unit: GiB.
         * <p>
         * 
         * Default value: `120`.
         */
        public Builder masterSystemDiskSize(Long masterSystemDiskSize) {
            this.putBodyParameter("master_system_disk_size", masterSystemDiskSize);
            this.masterSystemDiskSize = masterSystemDiskSize;
            return this;
        }

        /**
         * The ID of the automatic snapshot policy that is used by the system disk specified for master nodes.
         */
        public Builder masterSystemDiskSnapshotPolicyId(String masterSystemDiskSnapshotPolicyId) {
            this.putBodyParameter("master_system_disk_snapshot_policy_id", masterSystemDiskSnapshotPolicyId);
            this.masterSystemDiskSnapshotPolicyId = masterSystemDiskSnapshotPolicyId;
            return this;
        }

        /**
         * The IDs of the vSwitches that are specified for master nodes. You can specify up to three vSwitches. We recommend that you specify three vSwitches in different zones to ensure high availability.
         * <p>
         * 
         * The number of vSwitches must be the same as the value of the `master_count` parameter and also the same as the number of vSwitches specified in the `master_vswitch_ids` parameter.
         */
        public Builder masterVswitchIds(java.util.List < String > masterVswitchIds) {
            this.putBodyParameter("master_vswitch_ids", masterVswitchIds);
            this.masterVswitchIds = masterVswitchIds;
            return this;
        }

        /**
         * The cluster name.
         * <p>
         * 
         * The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). The name cannot start with a hyphen (-).
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * Specifies whether to create a NAT gateway and configure SNAT rules if you create an ACK Serverless cluster. Valid values:
         * <p>
         * 
         * *   `true`: automatically creates a NAT gateway and configures SNAT rules. This enables Internet access for the VPC in which the cluster is deployed.
         * *   `false`: does not create a NAT gateway or configure SNAT rules. If you specify this value, the cluster in the VPC cannot access the Internet.
         * 
         * Default value: `false`.
         */
        public Builder natGateway(Boolean natGateway) {
            this.putBodyParameter("nat_gateway", natGateway);
            this.natGateway = natGateway;
            return this;
        }

        /**
         * The maximum number of IP addresses that can be assigned to each node. This number is determined by the subnet mask of the specified CIDR block. This parameter takes effect only if the cluster uses the Flannel plug-in.
         * <p>
         * 
         * Default value: `26`.
         */
        public Builder nodeCidrMask(String nodeCidrMask) {
            this.putBodyParameter("node_cidr_mask", nodeCidrMask);
            this.nodeCidrMask = nodeCidrMask;
            return this;
        }

        /**
         * The custom node name.
         * <p>
         * 
         * A custom node name consists of a prefix, a node IP address, and a suffix.
         * 
         * *   The prefix and suffix can contain multiple parts that are separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-), and must start and end with a lowercase letter or digit.
         * *   The IP substring length specifies the number of digits to be truncated from the end of the node IP address. The IP substring length ranges from 5 to 12.
         * 
         * For example, if the node IP address is 192.168.0.55, the prefix is aliyun.com, the IP substring length is 5, and the suffix is test, the node name will aliyun.com00055test.
         */
        public Builder nodeNameMode(String nodeNameMode) {
            this.putBodyParameter("node_name_mode", nodeNameMode);
            this.nodeNameMode = nodeNameMode;
            return this;
        }

        /**
         * The node port range. Valid values: 30000 to 65535.
         * <p>
         * 
         * Default value: `30000-32767`.
         */
        public Builder nodePortRange(String nodePortRange) {
            this.putBodyParameter("node_port_range", nodePortRange);
            this.nodePortRange = nodePortRange;
            return this;
        }

        /**
         * The list of node pools.
         */
        public Builder nodepools(java.util.List < Nodepool > nodepools) {
            this.putBodyParameter("nodepools", nodepools);
            this.nodepools = nodepools;
            return this;
        }

        /**
         * The number of worker nodes. Valid values: 0 to 100.
         */
        public Builder numOfNodes(Long numOfNodes) {
            this.putBodyParameter("num_of_nodes", numOfNodes);
            this.numOfNodes = numOfNodes;
            return this;
        }

        /**
         * The type of OS. Valid values:
         * <p>
         * 
         * *   Windows
         * *   Linux
         * 
         * Default value: `Linux`.
         */
        public Builder osType(String osType) {
            this.putBodyParameter("os_type", osType);
            this.osType = osType;
            return this;
        }

        /**
         * The subscription duration of the instance. This parameter takes effect and is required only when you set charge_type to PrePaid.
         * <p>
         * 
         * Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60.
         * 
         * Default value: 1.
         */
        public Builder period(Long period) {
            this.putBodyParameter("period", period);
            this.period = period;
            return this;
        }

        /**
         * The billing cycle. This parameter is required if charge_type is set to PrePaid.
         * <p>
         * 
         * Set the value to Month. Subscription clusters are billed only on a monthly basis.
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("period_unit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The OS distribution that is used. Valid values:
         * <p>
         * 
         * *   CentOS
         * *   AliyunLinux
         * *   QbootAliyunLinux
         * *   Qboot
         * *   Windows
         * *   WindowsCore
         * 
         * Default value: `CentOS`.
         */
        public Builder platform(String platform) {
            this.putBodyParameter("platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * If you select Terway as the network plug-in, you must allocate vSwitches to pods. For each vSwitch that allocates IP addresses to worker nodes, you must select a vSwitch in the same zone to allocate IP addresses to pods.
         * <p>
         * 
         * >  We recommend that you select pod vSwitches whose subnet masks that do not exceed 19 bits in length. The maximum subnet mask length of a pod vSwitch is 25 bits. If you select a pod vSwitch whose subnet mask exceeds 25 bits in length, the IP addresses that can be allocated to pods may be insufficient.
         */
        public Builder podVswitchIds(java.util.List < String > podVswitchIds) {
            this.putBodyParameter("pod_vswitch_ids", podVswitchIds);
            this.podVswitchIds = podVswitchIds;
            return this;
        }

        /**
         * If you set `cluster_type` to `ManagedKubernetes`, an ACK managed cluster is created. In this case, you can further specify the cluster edition. Valid values:
         * <p>
         * 
         * *   `Default`: ACK managed cluster. ACK managed clusters include ACK Basic clusters and ACK Pro clusters.
         * *   `Edge`: ACK Edge cluster. ACK Edge clusters include ACK Edge Basic clusters and ACK Edge Pro clusters.
         * *   `Serverless`: ACK Serverless cluster. ACK Serverless clusters include ACK Serverless Basic clusters and ACK Serverless Pro clusters.
         * *   `Lingjun`: ACK Lingjun Pro cluster.
         */
        public Builder profile(String profile) {
            this.putBodyParameter("profile", profile);
            this.profile = profile;
            return this;
        }

        /**
         * The kube-proxy mode. Valid values:
         * <p>
         * 
         * *   `iptables`: a mature and stable mode that uses iptables rules to conduct service discovery and load balancing. The performance of this mode is limited by the size of the cluster. This mode is suitable for clusters that run a small number of Services.
         * *   `ipvs`: a mode that provides high performance and uses IP Virtual Server (IPVS) to conduct service discovery and load balancing. This mode is suitable for clusters that run a large number of Services. We recommend that you use this mode in scenarios that require high-performance load balancing.
         * 
         * Default value: `ipvs`.
         */
        public Builder proxyMode(String proxyMode) {
            this.putBodyParameter("proxy_mode", proxyMode);
            this.proxyMode = proxyMode;
            return this;
        }

        /**
         * The ApsaraDB RDS instances. The pod CIDR block and node CIDR block are added to the whitelists of the ApsaraDB RDS instances. We recommend that you add the pod CIDR block and node CIDR block to the whitelists of the ApsaraDB RDS instances in the ApsaraDB RDS console. If the RDS instances are not in the Running state, new nodes cannot be added to the cluster.
         */
        public Builder rdsInstances(java.util.List < String > rdsInstances) {
            this.putBodyParameter("rds_instances", rdsInstances);
            this.rdsInstances = rdsInstances;
            return this;
        }

        /**
         * The ID of the region in which the cluster is deployed.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("region_id", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the cluster belongs. You can use resource groups to isolate clusters.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resource_group_id", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The container runtime. The default container runtime is Docker. containerd and Sandboxed-Container are also supported.
         * <p>
         * 
         * For more information about how to select a proper container runtime, see [Comparison among Docker, containerd, and Sandboxed-Container](~~160313~~).
         */
        public Builder runtime(Runtime runtime) {
            this.putBodyParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * The ID of an existing security group. You must specify this parameter or the `is_enterprise_security_group` parameter. Cluster nodes are automatically added to the security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putBodyParameter("security_group_id", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * Specifies whether to enable Alibaba Cloud Linux Security Hardening. Valid values:
         * <p>
         * 
         * *   `true`: enables Alibaba Cloud Linux Security Hardening.
         * *   `false`: disables Alibaba Cloud Linux Security Hardening.
         * 
         * Default value: `false`.
         */
        public Builder securityHardeningOs(Boolean securityHardeningOs) {
            this.putBodyParameter("security_hardening_os", securityHardeningOs);
            this.securityHardeningOs = securityHardeningOs;
            return this;
        }

        /**
         * Service accounts provide identities for pods when pods communicate with the `API server` of the cluster. The `service-account-issuer` parameter specifies the issuer of the `service account token`, which is specified by using the `iss` field in the `token payload`.
         * <p>
         * 
         * For more information about `service accounts`, see [Enable service account token volume projection](~~160384~~).
         */
        public Builder serviceAccountIssuer(String serviceAccountIssuer) {
            this.putBodyParameter("service_account_issuer", serviceAccountIssuer);
            this.serviceAccountIssuer = serviceAccountIssuer;
            return this;
        }

        /**
         * The Service CIDR block. Valid values: 10.0.0.0/16-24, 172.16-31.0.0/16-24, and 192.168.0.0/16-24. The Service CIDR block cannot overlap with the VPC CIDR block (10.1.0.0/21) or the CIDR blocks of existing clusters in the VPC. You cannot modify the Service CIDR block after the cluster is created.
         * <p>
         * 
         * By default, the Service CIDR block is set to 172.19.0.0/20.
         */
        public Builder serviceCidr(String serviceCidr) {
            this.putBodyParameter("service_cidr", serviceCidr);
            this.serviceCidr = serviceCidr;
            return this;
        }

        /**
         * The type of service discovery that is implemented in the `ACK Serverless` cluster.
         * <p>
         * 
         * *   `CoreDNS`: a standard service discovery plug-in provided by open source Kubernetes. To use DNS resolution, you must provision pods. By default, two elastic container instances are used. The specification of each instance is 0.25 vCPUs and 512 MiB of memory.
         * *   `PrivateZone`: a DNS resolution service provided by Alibaba Cloud. You must activate Alibaba Cloud DNS PrivateZone before you can use it to implement service discovery.
         * 
         * By default, this parameter is not specified.
         */
        public Builder serviceDiscoveryTypes(java.util.List < String > serviceDiscoveryTypes) {
            this.putBodyParameter("service_discovery_types", serviceDiscoveryTypes);
            this.serviceDiscoveryTypes = serviceDiscoveryTypes;
            return this;
        }

        /**
         * Specifies whether to configure SNAT rules for the VPC in which your cluster is deployed. Valid values:
         * <p>
         * 
         * *   `true`: automatically creates a NAT gateway and configures SNAT rules. Set the value to `true` if nodes and applications in the cluster need to access the Internet.
         * *   `false`: does not create a NAT gateway or configure SNAT rules. In this case, nodes and applications in the cluster cannot access the Internet.
         * 
         * >  If this feature is disabled when you create the cluster, you can also manually enable this feature after you create the cluster. For more information, see [Enable an existing ACK cluster to access the Internet](~~178480~~).
         * 
         * Default value: `true`.
         */
        public Builder snatEntry(Boolean snatEntry) {
            this.putBodyParameter("snat_entry", snatEntry);
            this.snatEntry = snatEntry;
            return this;
        }

        /**
         * Specifies whether to enable security hardening based on Multi-Level Protection Scheme (MLPS). For more information, see [ACK security hardening based on MLPS](~~196148~~).
         * <p>
         * 
         * Valid values:
         * 
         * *   `true`: enables security hardening based on MLPS.
         * *   `false`: disables security hardening based on MLPS.
         * 
         * Default value: `false`.
         */
        public Builder socEnabled(Boolean socEnabled) {
            this.putBodyParameter("soc_enabled", socEnabled);
            this.socEnabled = socEnabled;
            return this;
        }

        /**
         * Specifies whether to enable SSH logon. If this parameter is set to true, you can log on to master nodes in an ACK dedicated cluster over the Internet. This parameter does not take effect for ACK managed clusters. Valid values:
         * <p>
         * 
         * *   `true`: enables SSH logon.
         * *   `false`: disables SSH logon.
         * 
         * Default value: `false`.
         */
        public Builder sshFlags(Boolean sshFlags) {
            this.putBodyParameter("ssh_flags", sshFlags);
            this.sshFlags = sshFlags;
            return this;
        }

        /**
         * The labels that you want to add to nodes. You must add labels based on the following rules:
         * <p>
         * 
         * *   A label is a case-sensitive key-value pair. You can add up to 20 labels.
         * *   When you add a label, you must specify a unique key but you can leave the value empty. A key cannot exceed 64 characters in length and a value cannot exceed 128 characters in length. Keys and values cannot start with aliyun, acs:, https://, or http://. For more information, see [Labels and Selectors](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set).
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The taints that you want to add to nodes. Taints can be used together with tolerations to avoid scheduling pods to specific nodes. For more information, see [taint-and-toleration](https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/).
         */
        public Builder taints(java.util.List < Taint > taints) {
            this.putBodyParameter("taints", taints);
            this.taints = taints;
            return this;
        }

        /**
         * Specifies the timeout period of cluster creation. Unit: minutes.
         * <p>
         * 
         * Default value: `60`.
         */
        public Builder timeoutMins(Long timeoutMins) {
            this.putBodyParameter("timeout_mins", timeoutMins);
            this.timeoutMins = timeoutMins;
            return this;
        }

        /**
         * The time zone of the cluster.
         */
        public Builder timezone(String timezone) {
            this.putBodyParameter("timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        /**
         * The custom Certificate Authority (CA) certificate used by the cluster.
         */
        public Builder userCa(String userCa) {
            this.putBodyParameter("user_ca", userCa);
            this.userCa = userCa;
            return this;
        }

        /**
         * The user data of nodes.
         */
        public Builder userData(String userData) {
            this.putBodyParameter("user_data", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The virtual private cloud (VPC) in which you want to deploy the cluster. This parameter is required.
         */
        public Builder vpcid(String vpcid) {
            this.putBodyParameter("vpcid", vpcid);
            this.vpcid = vpcid;
            return this;
        }

        /**
         * The vSwitches for nodes in the cluster. This parameter is required if you create an ACK managed cluster that does not contain nodes.
         */
        public Builder vswitchIds(java.util.List < String > vswitchIds) {
            this.putBodyParameter("vswitch_ids", vswitchIds);
            this.vswitchIds = vswitchIds;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for worker nodes. This parameter takes effect and is required only when `worker_instance_charge_type` is set to `PrePaid`. Valid values:
         * <p>
         * 
         * *   `true`: enables auto-renewal.
         * *   `false`: disables auto-renewal.
         * 
         * Default value: `true`
         */
        public Builder workerAutoRenew(Boolean workerAutoRenew) {
            this.putBodyParameter("worker_auto_renew", workerAutoRenew);
            this.workerAutoRenew = workerAutoRenew;
            return this;
        }

        /**
         * The auto-renewal duration. This parameter takes effect and is required only when the subscription billing method is selected for worker nodes.
         * <p>
         * 
         * Valid values: 1, 2, 3, 6, and 12.
         */
        public Builder workerAutoRenewPeriod(Long workerAutoRenewPeriod) {
            this.putBodyParameter("worker_auto_renew_period", workerAutoRenewPeriod);
            this.workerAutoRenewPeriod = workerAutoRenewPeriod;
            return this;
        }

        /**
         * The configurations of the data disks that you want to mount to worker nodes. The configurations include the disk type and disk size.
         */
        public Builder workerDataDisks(java.util.List < WorkerDataDisks> workerDataDisks) {
            this.putBodyParameter("worker_data_disks", workerDataDisks);
            this.workerDataDisks = workerDataDisks;
            return this;
        }

        /**
         * The billing method of worker nodes. Valid values:
         * <p>
         * 
         * *   `PrePaid`: subscription.
         * *   `PostPaid`: pay-as-you-go.
         * 
         * Default value: PostPaid.
         */
        public Builder workerInstanceChargeType(String workerInstanceChargeType) {
            this.putBodyParameter("worker_instance_charge_type", workerInstanceChargeType);
            this.workerInstanceChargeType = workerInstanceChargeType;
            return this;
        }

        /**
         * The instance configurations of worker nodes.
         */
        public Builder workerInstanceTypes(java.util.List < String > workerInstanceTypes) {
            this.putBodyParameter("worker_instance_types", workerInstanceTypes);
            this.workerInstanceTypes = workerInstanceTypes;
            return this;
        }

        /**
         * The subscription duration of worker nodes. This parameter takes effect and is required only when `worker_instance_charge_type` is set to `PrePaid`.
         * <p>
         * 
         * Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60.
         * 
         * Default value: 1.
         */
        public Builder workerPeriod(Long workerPeriod) {
            this.putBodyParameter("worker_period", workerPeriod);
            this.workerPeriod = workerPeriod;
            return this;
        }

        /**
         * The billing cycle of worker nodes. This parameter is required if worker_instance_charge_type is set to `PrePaid`.
         * <p>
         * 
         * Set the value to `Month`. Subscription worker nodes are billed only on a monthly basis.
         */
        public Builder workerPeriodUnit(String workerPeriodUnit) {
            this.putBodyParameter("worker_period_unit", workerPeriodUnit);
            this.workerPeriodUnit = workerPeriodUnit;
            return this;
        }

        /**
         * The system disk type of worker nodes. For more information, see [Overview of Block Storage](~~63136~~).
         * <p>
         * 
         * Valid values:
         * 
         * *   `cloud_efficiency`: ultra disk.
         * *   `cloud_ssd`: standard SSD.
         * 
         * Default value: `cloud_ssd`.
         */
        public Builder workerSystemDiskCategory(String workerSystemDiskCategory) {
            this.putBodyParameter("worker_system_disk_category", workerSystemDiskCategory);
            this.workerSystemDiskCategory = workerSystemDiskCategory;
            return this;
        }

        /**
         * If the system disk is an ESSD, you can specify the PL of the ESSD. For more information, see [Enterprise SSDs](~~122389~~).
         * <p>
         * 
         * Valid values:
         * 
         * *   PL0
         * *   PL1
         * *   PL2
         * *   PL3
         */
        public Builder workerSystemDiskPerformanceLevel(String workerSystemDiskPerformanceLevel) {
            this.putBodyParameter("worker_system_disk_performance_level", workerSystemDiskPerformanceLevel);
            this.workerSystemDiskPerformanceLevel = workerSystemDiskPerformanceLevel;
            return this;
        }

        /**
         * The system disk size of worker nodes. Unit: GiB.
         * <p>
         * 
         * Valid values: 40 to 500.
         * 
         * The value of this parameter must be at least 40 and greater than or equal to the image size.
         * 
         * Default value: `120`.
         */
        public Builder workerSystemDiskSize(Long workerSystemDiskSize) {
            this.putBodyParameter("worker_system_disk_size", workerSystemDiskSize);
            this.workerSystemDiskSize = workerSystemDiskSize;
            return this;
        }

        /**
         * The ID of the automatic snapshot policy that is used by the system disk specified for worker nodes.
         */
        public Builder workerSystemDiskSnapshotPolicyId(String workerSystemDiskSnapshotPolicyId) {
            this.putBodyParameter("worker_system_disk_snapshot_policy_id", workerSystemDiskSnapshotPolicyId);
            this.workerSystemDiskSnapshotPolicyId = workerSystemDiskSnapshotPolicyId;
            return this;
        }

        /**
         * The vSwitches for worker nodes. Each worker node is allocated a vSwitch.
         * <p>
         * 
         * `worker_vswitch_ids` is optional but `vswitch_ids` is required if you create an ACK managed cluster that does not contain nodes.
         */
        public Builder workerVswitchIds(java.util.List < String > workerVswitchIds) {
            this.putBodyParameter("worker_vswitch_ids", workerVswitchIds);
            this.workerVswitchIds = workerVswitchIds;
            return this;
        }

        /**
         * The ID of the zone to which the cluster belongs. This parameter takes effect only for ACK Serverless clusters.
         * <p>
         * 
         * If you create an ACK Serverless cluster, you must specify `zone_id` if `vpc_id` and `vswitch_ids` are not specified. This way, the system automatically creates a VPC in the specified zone.
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("zone_id", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * zone_ids.
         */
        public Builder zoneIds(java.util.List < String > zoneIds) {
            this.putBodyParameter("zone_ids", zoneIds);
            this.zoneIds = zoneIds;
            return this;
        }

        @Override
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

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

            /**
             * The data disk type.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Specifies whether to encrypt the data disk. Valid values:
             * <p>
             * 
             * *   `true`: encrypts the data disk.
             * *   `false`: does not encrypt the data disk.
             * 
             * Default value: `false`.
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * The PL of the data disk. This parameter takes effect only for ESSDs. You can specify a higher PL if you increase the size of a data disk. For more information, see [Enterprise SSDs](~~122389~~).
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The data disk size. Valid values: 40 to 32767. Unit: GiB.
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
