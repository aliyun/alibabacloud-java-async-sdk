// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @Body
    @NameInMap("access_control_list")
    private java.util.List < String > accessControlList;

    @Body
    @NameInMap("addons")
    private java.util.List < Addon > addons;

    @Body
    @NameInMap("api_audiences")
    private String apiAudiences;

    @Body
    @NameInMap("charge_type")
    private String chargeType;

    @Body
    @NameInMap("cis_enabled")
    @Deprecated
    private Boolean cisEnabled;

    @Body
    @NameInMap("cloud_monitor_flags")
    private Boolean cloudMonitorFlags;

    @Body
    @NameInMap("cluster_domain")
    private String clusterDomain;

    @Body
    @NameInMap("cluster_spec")
    private String clusterSpec;

    @Body
    @NameInMap("cluster_type")
    @Validation(required = true)
    private String clusterType;

    @Body
    @NameInMap("container_cidr")
    private String containerCidr;

    @Body
    @NameInMap("controlplane_log_components")
    private java.util.List < String > controlplaneLogComponents;

    @Body
    @NameInMap("controlplane_log_project")
    private String controlplaneLogProject;

    @Body
    @NameInMap("controlplane_log_ttl")
    private String controlplaneLogTtl;

    @Body
    @NameInMap("cpu_policy")
    private String cpuPolicy;

    @Body
    @NameInMap("custom_san")
    private String customSan;

    @Body
    @NameInMap("deletion_protection")
    private Boolean deletionProtection;

    @Body
    @NameInMap("disable_rollback")
    @Deprecated
    private Boolean disableRollback;

    @Body
    @NameInMap("enable_rrsa")
    private Boolean enableRrsa;

    @Body
    @NameInMap("encryption_provider_key")
    private String encryptionProviderKey;

    @Body
    @NameInMap("endpoint_public_access")
    private Boolean endpointPublicAccess;

    @Body
    @NameInMap("format_disk")
    private Boolean formatDisk;

    @Body
    @NameInMap("image_id")
    private String imageId;

    @Body
    @NameInMap("image_type")
    private String imageType;

    @Body
    @NameInMap("instances")
    private java.util.List < String > instances;

    @Body
    @NameInMap("ip_stack")
    private String ipStack;

    @Body
    @NameInMap("is_enterprise_security_group")
    private Boolean isEnterpriseSecurityGroup;

    @Body
    @NameInMap("keep_instance_name")
    private Boolean keepInstanceName;

    @Body
    @NameInMap("key_pair")
    private String keyPair;

    @Body
    @NameInMap("kubernetes_version")
    private String kubernetesVersion;

    @Body
    @NameInMap("load_balancer_spec")
    private String loadBalancerSpec;

    @Body
    @NameInMap("logging_type")
    private String loggingType;

    @Body
    @NameInMap("login_password")
    private String loginPassword;

    @Body
    @NameInMap("master_auto_renew")
    private Boolean masterAutoRenew;

    @Body
    @NameInMap("master_auto_renew_period")
    private Long masterAutoRenewPeriod;

    @Body
    @NameInMap("master_count")
    private Long masterCount;

    @Body
    @NameInMap("master_instance_charge_type")
    private String masterInstanceChargeType;

    @Body
    @NameInMap("master_instance_types")
    private java.util.List < String > masterInstanceTypes;

    @Body
    @NameInMap("master_period")
    private Long masterPeriod;

    @Body
    @NameInMap("master_period_unit")
    private String masterPeriodUnit;

    @Body
    @NameInMap("master_system_disk_category")
    private String masterSystemDiskCategory;

    @Body
    @NameInMap("master_system_disk_performance_level")
    private String masterSystemDiskPerformanceLevel;

    @Body
    @NameInMap("master_system_disk_size")
    private Long masterSystemDiskSize;

    @Body
    @NameInMap("master_system_disk_snapshot_policy_id")
    private String masterSystemDiskSnapshotPolicyId;

    @Body
    @NameInMap("master_vswitch_ids")
    private java.util.List < String > masterVswitchIds;

    @Body
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("nat_gateway")
    private Boolean natGateway;

    @Body
    @NameInMap("node_cidr_mask")
    private String nodeCidrMask;

    @Body
    @NameInMap("node_name_mode")
    private String nodeNameMode;

    @Body
    @NameInMap("node_port_range")
    private String nodePortRange;

    @Body
    @NameInMap("nodepools")
    private java.util.List < Nodepool > nodepools;

    @Body
    @NameInMap("num_of_nodes")
    @Deprecated
    private Long numOfNodes;

    @Body
    @NameInMap("os_type")
    private String osType;

    @Body
    @NameInMap("period")
    private Long period;

    @Body
    @NameInMap("period_unit")
    private String periodUnit;

    @Body
    @NameInMap("platform")
    private String platform;

    @Body
    @NameInMap("pod_vswitch_ids")
    private java.util.List < String > podVswitchIds;

    @Body
    @NameInMap("profile")
    private String profile;

    @Body
    @NameInMap("proxy_mode")
    private String proxyMode;

    @Body
    @NameInMap("rds_instances")
    private java.util.List < String > rdsInstances;

    @Body
    @NameInMap("region_id")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("resource_group_id")
    private String resourceGroupId;

    @Body
    @NameInMap("runtime")
    private Runtime runtime;

    @Body
    @NameInMap("security_group_id")
    private String securityGroupId;

    @Body
    @NameInMap("security_hardening_os")
    private Boolean securityHardeningOs;

    @Body
    @NameInMap("service_account_issuer")
    private String serviceAccountIssuer;

    @Body
    @NameInMap("service_cidr")
    @Validation(required = true)
    private String serviceCidr;

    @Body
    @NameInMap("service_discovery_types")
    private java.util.List < String > serviceDiscoveryTypes;

    @Body
    @NameInMap("snat_entry")
    private Boolean snatEntry;

    @Body
    @NameInMap("soc_enabled")
    private Boolean socEnabled;

    @Body
    @NameInMap("ssh_flags")
    private Boolean sshFlags;

    @Body
    @NameInMap("tags")
    private java.util.List < Tag > tags;

    @Body
    @NameInMap("taints")
    private java.util.List < Taint > taints;

    @Body
    @NameInMap("timeout_mins")
    private Long timeoutMins;

    @Body
    @NameInMap("timezone")
    private String timezone;

    @Body
    @NameInMap("user_ca")
    private String userCa;

    @Body
    @NameInMap("user_data")
    private String userData;

    @Body
    @NameInMap("vpcid")
    @Validation(required = true)
    private String vpcid;

    @Body
    @NameInMap("vswitch_ids")
    @Validation(required = true)
    private java.util.List < String > vswitchIds;

    @Body
    @NameInMap("worker_auto_renew")
    @Deprecated
    private Boolean workerAutoRenew;

    @Body
    @NameInMap("worker_auto_renew_period")
    @Deprecated
    private Long workerAutoRenewPeriod;

    @Body
    @NameInMap("worker_data_disks")
    @Deprecated
    private java.util.List < WorkerDataDisks> workerDataDisks;

    @Body
    @NameInMap("worker_instance_charge_type")
    @Deprecated
    private String workerInstanceChargeType;

    @Body
    @NameInMap("worker_instance_types")
    @Deprecated
    private java.util.List < String > workerInstanceTypes;

    @Body
    @NameInMap("worker_period")
    @Deprecated
    private Long workerPeriod;

    @Body
    @NameInMap("worker_period_unit")
    @Deprecated
    private String workerPeriodUnit;

    @Body
    @NameInMap("worker_system_disk_category")
    @Deprecated
    private String workerSystemDiskCategory;

    @Body
    @NameInMap("worker_system_disk_performance_level")
    @Deprecated
    private String workerSystemDiskPerformanceLevel;

    @Body
    @NameInMap("worker_system_disk_size")
    @Deprecated
    private Long workerSystemDiskSize;

    @Body
    @NameInMap("worker_system_disk_snapshot_policy_id")
    @Deprecated
    private String workerSystemDiskSnapshotPolicyId;

    @Body
    @NameInMap("worker_vswitch_ids")
    @Deprecated
    private java.util.List < String > workerVswitchIds;

    @Body
    @NameInMap("zone_id")
    private String zoneId;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.accessControlList = builder.accessControlList;
        this.addons = builder.addons;
        this.apiAudiences = builder.apiAudiences;
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

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private java.util.List < String > accessControlList; 
        private java.util.List < Addon > addons; 
        private String apiAudiences; 
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

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.accessControlList = request.accessControlList;
            this.addons = request.addons;
            this.apiAudiences = request.apiAudiences;
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
         * The components that you want to install in the cluster. When you create a cluster, you can set the `addons` parameter to install specific components.
         * <p>
         * 
         * **Network plug-in**: required. The Flannel and Terway plug-ins are supported. Select one of the plug-ins for the cluster.
         * 
         * *   Specify the Flannel plug-in in the following format: \[{"name":"flannel","config":""}].
         * *   If you want to use the Terway component, specify the value in the \[{"Name": "terway-eniip","Config": ""}] format.
         * 
         * **Volume plug-in**: required. The `CSI` and `FlexVolume` volume plug-ins are supported.
         * 
         * *   Specify the `CSI` plug-in in the following format: \[{"name":"csi-plugin","config": ""},{"name": "csi-provisioner","config": ""}].
         * *   Specify the `FlexVolume` plug-in in the following format: \[{"name": "flexvolume","config": ""}].
         * 
         * **Simple Log Service component**: optional. We recommend that you enable Simple Log Service. If Simple Log Service is disabled, you cannot use the cluster auditing feature.
         * 
         * *   Use an existing `Simple Log Service project`: \[{"name": "logtail-ds","config": "{"IngressDashboardEnabled":"true","sls_project_name":"your_sls_project_name"}"}].
         * *   To create a `Simple Log Service project`, specify the component in the following format: \[{"name": "logtail-ds","config": "{"IngressDashboardEnabled":"true"}"}].
         * 
         * **Ingress controller**`: optional. By default, the nginx-ingress-controller component is installed in ACK dedicated clusters.`
         * 
         * *   To install nginx-ingress-controller and enable Internet access, specify the Ingress controller in the following format: \[{"name":"nginx-ingress-controller","config":"{"IngressSlbNetworkType":"internet"}"}].
         * *   To disable the system to automatically install nginx-ingress-controller, specify the component in the following format: \[{"name": "nginx-ingress-controller","config": "","disabled": true}].
         * 
         * **Event center**: optional. By default, the event center feature is enabled.
         * 
         * You can use Kubernetes event centers to store and query events and configure alerts. You can use the Logstores that are associated with Kubernetes event centers free of charge within 90 days. For more information, see [Create and use a Kubernetes event center](~~150476~~).
         * 
         * Enable the ack-node-problem-detector component in the following format: \[{"name":"ack-node-problem-detector","config":"{"sls_project_name":"your_sls_project_name"}"}].
         */
        public Builder addons(java.util.List < Addon > addons) {
            this.putBodyParameter("addons", addons);
            this.addons = addons;
            return this;
        }

        /**
         * Service accounts provide identities for pods when pods communicate with the `API server` of the cluster. `api-audiences` are used by the `API server` to check whether the `tokens` of requests are legitimate.`` Separate multiple `audiences` with commas (,).
         * <p>
         * 
         * For more information about `ServiceAccount`, see [Enable service account token volume projection](~~160384~~).
         */
        public Builder apiAudiences(String apiAudiences) {
            this.putBodyParameter("api_audiences", apiAudiences);
            this.apiAudiences = apiAudiences;
            return this;
        }

        /**
         * The billing method of the cluster. The following resources are billed on a subscription basis:
         * <p>
         * 
         * Elastic Compute Service (ECS) instances in node pools.
         * 
         * The internal-facing SLB instance used by the API server.
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
         * Specifies whether to enable Center for Internet Security (CIS) reinforcement. For more information, see [CIS reinforcement](~~223744~~).
         * <p>
         * 
         * Valid values:
         * 
         * *   `true`: enables CIS reinforcement.
         * *   `false`: disables CIS reinforcement.
         * 
         * Default value: `false`.
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
         * After you set `cluster_type` to `ManagedKubernetes` and configure the `profile` parameter, you can further specify the edition of the cluster. Valid values:
         * <p>
         * 
         * *   `ack.pro.small`: Pro.
         * *   `ack.standard`: Basic. If you leave the parameter empty, the Basic edition is selected.
         */
        public Builder clusterSpec(String clusterSpec) {
            this.putBodyParameter("cluster_spec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * *   `Kubernetes`: ACK dedicated cluster.
         * <p>
         * *   `ManagedKubernetes`: ACK managed cluster. ACK managed clusters include ACK Basic clusters, ACK Pro clusters, ACK Serverless clusters (Basic and Pro), ACK Edge clusters (Basic and Pro), and ACK Lingjun clusters (Pro).
         * *   `ExternalKubernetes`: registered cluster.
         */
        public Builder clusterType(String clusterType) {
            this.putBodyParameter("cluster_type", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The CIDR block of pods. You can specify 10.0.0.0/8, 172.16-31.0.0/12-16, 192.168.0.0/16, or their subnets as the CIDR block of pods. The pod CIDR block cannot overlap with the CIDR block of the VPC in which the cluster is deployed and the CIDR blocks of existing clusters in the VPC. You cannot modify the pod CIDR block after you create the cluster.
         * <p>
         * 
         * For more information about subnetting for ACK clusters, see [Plan CIDR blocks for an ACK cluster that is deployed in a VPC](~~86500~~).
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
         * By default, the log of kube-apiserver, kube-controller-manager, and kube-scheduler is collected.
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
         * The CPU management policy of the nodes in the node pool. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later:
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
         * Specifies custom subject alternative names (SANs) for the API server certificate to accept requests from specified IP addresses or domain names. Multiple IP addresses and domain names are separated by commas (,).
         */
        public Builder customSan(String customSan) {
            this.putBodyParameter("custom_san", customSan);
            this.customSan = customSan;
            return this;
        }

        /**
         * Specifies whether to enable cluster deletion protection. If this option is enabled, the cluster cannot be deleted in the console or by calling API operations. Valid values:
         * <p>
         * 
         * *   `true`: enables deletion protection for the cluster. This way, the cluster cannot be deleted in the Container Service console or by calling API operations.
         * *   `false`: disables deletion protection for the cluster. This way, the cluster can be deleted in the Container Service console or by calling API operations.
         * 
         * Default value: `false`.
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putBodyParameter("deletion_protection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * Specifies whether to perform a rollback if the cluster fails to be created. Valid values:
         * <p>
         * 
         * *   `true`: performs a rollback if the system fails to create the cluster.
         * *   `false`: does not perform a rollback if the system fails to create the cluster.
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
         * The ID of a key that is managed by Key Management Service (KMS). The key is used to encrypt data disks. For more information, see [KMS](~~28935~~).
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
         * *   `true`: enables Internet access.
         * *   `false`: disables Internet access. If you set this parameter to false, the API server cannot be accessed over the Internet.
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
         * *   `true`: stores the data of containers and images on a data disk. Back up the existing data on the data disk first.
         * *   `false`: does not store the data of containers and images on a data disk.
         * 
         * Default value: `false`.
         * 
         * How to mount a data disk:
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
         * Specifies a custom image for nodes. By default, the image provided by ACK is used. You can select a custom image to replace the default image. For more information, see [Custom images](~~146647~~).
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
         * The list of existing ECS instances that are specified as worker nodes for the cluster.
         * <p>
         * 
         * >  This parameter is required when you create worker nodes on existing ECS instances.
         */
        public Builder instances(java.util.List < String > instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * The cluster ip_stack.
         */
        public Builder ipStack(String ipStack) {
            this.putBodyParameter("ip_stack", ipStack);
            this.ipStack = ipStack;
            return this;
        }

        /**
         * Specifies whether to create an advanced security group. This parameter takes effect only if `security_group_id` is left empty.
         * <p>
         * 
         * >  To use a basic security group, make sure that the sum of the number of nodes in the cluster and the number of pods that use Terway does not exceed 2,000. Therefore, we recommend that you specify an advanced security group for a cluster that has Terway installed.
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
         * *   `false`: does not retain the names. The new names are assigned by the system.
         * 
         * Default value: `true`.
         */
        public Builder keepInstanceName(Boolean keepInstanceName) {
            this.putBodyParameter("keep_instance_name", keepInstanceName);
            this.keepInstanceName = keepInstanceName;
            return this;
        }

        /**
         * The name of the key pair. You must set this parameter or the `login_password` parameter.
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
         * You can create clusters of the latest two Kubernetes versions in the ACK console. If you want to create clusters that run earlier Kubernetes versions, use the API. For more information about the Kubernetes versions supported by ACK, see [Release notes on Kubernetes versions](~~185269~~).
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.putBodyParameter("kubernetes_version", kubernetesVersion);
            this.kubernetesVersion = kubernetesVersion;
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
         * Enables Simple Log Service for the cluster. This parameter takes effect only on ACK Serverless clusters. Set the value to `SLS`.
         */
        public Builder loggingType(String loggingType) {
            this.putBodyParameter("logging_type", loggingType);
            this.loggingType = loggingType;
            return this;
        }

        /**
         * The password for SSH logon. You must set this parameter or `key_pair`. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.
         */
        public Builder loginPassword(String loginPassword) {
            this.putBodyParameter("login_password", loginPassword);
            this.loginPassword = loginPassword;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for master nodes. This parameter takes effect only if `master_instance_charge_type` is set to `PrePaid`. Valid values:
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
         * The cycle of auto-renewal. This parameter takes effect and is required only if the subscription billing method is selected for master nodes.
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
         * *   `PostPaid`: pay-as-you-go.
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
         * The subscription duration of master nodes. This parameter takes effect and is required only if `master_instance_charge_type` is set to `PrePaid`.
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
         * The billing cycle of master nodes. This parameter is required if master_instance_charge_type is set to `PrePaid`.
         * <p>
         * 
         * Set the value to `Month`. Master nodes are billed only on a monthly basis.
         */
        public Builder masterPeriodUnit(String masterPeriodUnit) {
            this.putBodyParameter("master_period_unit", masterPeriodUnit);
            this.masterPeriodUnit = masterPeriodUnit;
            return this;
        }

        /**
         * The type of system disk that you want to use for the master nodes. Valid values:
         * <p>
         * 
         * *   `cloud_efficiency`: ultra disk.
         * *   `cloud_ssd`: standard SSD.
         * *   `cloud_essd`: enhanced SSD (ESSD).
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
         * The size of the system disk that is specified for master nodes. Valid values: 40 to 500. Unit: GiB.
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
         * The number of vSwitches must be the same as that specified in `master_count` and the same as those specified in `master_vswitch_ids`.
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
         * The cluster name must be 1 to 63 characters in length, and can contain digits, letters, and underscores (\_). The cluster name must not start with a hyphen (-).
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * Specifies whether to create a NAT gateway and configure SNAT rules when the system creates the ACK Serverless cluster. Valid values:
         * <p>
         * 
         * *   `true`: automatically creates a NAT gateway and configures SNAT rules. This enables Internet access for the VPC in which the cluster is deployed.
         * *   `false`: does not create a NAT gateway or configure SNAT rules. In this case, the cluster in the VPC cannot access the Internet.
         * 
         * Default value: `false`.
         */
        public Builder natGateway(Boolean natGateway) {
            this.putBodyParameter("nat_gateway", natGateway);
            this.natGateway = natGateway;
            return this;
        }

        /**
         * The maximum number of IP addresses that can be assigned to nodes. This number is determined by the node CIDR block. This parameter takes effect only if the cluster uses Flannel as the network plug-in.
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
         * The name of the custom node.
         * <p>
         * 
         * A node name consists of a prefix, an IP substring, and a suffix.
         * 
         * *   The prefix and suffix can contain multiple parts that are separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-), and must start and end with a lowercase letter or digit.
         * *   The IP substring length specifies the number of digits to be truncated from the end of the node IP address. The IP substring length ranges from 5 to 12.
         * 
         * For example, if the node IP address is 192.168.0.55, the prefix is aliyun.com, the IP substring length is 5, and the suffix is test, the node name will be aliyun.com00055test.
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
         * The subscription duration. This parameter takes effect and is required only when you set charge_type to PrePaid.
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
         * Set the value to Month. Master nodes are billed only on a monthly basis.
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
         * The list of pod vSwitches. You need to specify at least one pod vSwitch for each node vSwitch and the pod vSwitches must not be the same as the node vSwitches (`vswitch`). We recommend that you specify pod vSwitches whose mask lengths are no longer than 19.
         * <p>
         * 
         * >  The `pod_vswitch_ids` parameter is required if the cluster uses Terway as the network plug-in.
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
         * *   `Default`. ACK managed cluster. ACK managed clusters include ACK Basic clusters and ACK Pro clusters.
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
         * *   `iptables`: iptables is a kube-proxy mode. It uses iptables rules to conduct Service discovery and load balancing. The performance of this mode is limited by the size of the cluster. This mode is suitable for clusters that run a small number of Services.
         * *   `ipvs`: provides high performance and uses IP Virtual Server (IPVS). This allows you to configure service discovery and load balancing. This mode is suitable for clusters that are required to run a large number of services. We recommend that you use this mode in scenarios when high load balancing performance is required.
         * 
         * Default value: `ipvs`.
         */
        public Builder proxyMode(String proxyMode) {
            this.putBodyParameter("proxy_mode", proxyMode);
            this.proxyMode = proxyMode;
            return this;
        }

        /**
         * The list of ApsaraDB RDS instances. Select the ApsaraDB RDS instances that you want to add to the whitelist. We recommend that you add the CIDR block of pods and CIDR block of nodes to the ApsaraDB RDS instances in the ApsaraDB RDS console. When you set the ApsaraDB RDS instances, you cannot scale out the number of nodes because the instances are not in the Running state.
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
         * For more information about how to select a proper container runtime, see [How to select between Docker and Sandboxed-Container](~~160313~~).
         */
        public Builder runtime(Runtime runtime) {
            this.putBodyParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * The ID of an existing security group. You need to choose between this parameter and the `is_enterprise_security_group` parameter. Cluster nodes are automatically added to the security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putBodyParameter("security_group_id", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * security_hardening_os.
         */
        public Builder securityHardeningOs(Boolean securityHardeningOs) {
            this.putBodyParameter("security_hardening_os", securityHardeningOs);
            this.securityHardeningOs = securityHardeningOs;
            return this;
        }

        /**
         * Service accounts provide identities for pods when pods communicate with the `API server` of the cluster. `service-account-issuer` is the issuer of the `serviceaccount token`, which corresponds to the `iss` field in the `token payload`.
         * <p>
         * 
         * For more information about `ServiceAccount`, see [Enable service account token volume projection](~~160384~~).
         */
        public Builder serviceAccountIssuer(String serviceAccountIssuer) {
            this.putBodyParameter("service_account_issuer", serviceAccountIssuer);
            this.serviceAccountIssuer = serviceAccountIssuer;
            return this;
        }

        /**
         * The CIDR block of Services. Valid values: 10.0.0.0/16-24, 172.16-31.0.0/16-24, and 192.168.0.0/16-24. The CIDR block of Services cannot overlap with the CIDR block of the VPC (10.1.0.0/21) or the CIDR blocks of existing clusters in the VPC. You cannot modify the CIDR block of Services after the cluster is created.
         * <p>
         * 
         * By default, the CIDR block of Services is set to 172.19.0.0/20.
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
         * *   `CoreDNS`: CoreDNS is a standard service discovery plug-in that is provided by open source Kubernetes. To use DNS resolution, you must provision pods. By default, two elastic container instances are used. The specification of each instance is 0.25 vCores and 512 MiB of memory.
         * *   `PrivateZone`: a DNS resolution service provided by Alibaba Cloud. You must activate Alibaba Cloud DNS PrivateZone before you can use it for service discovery.
         * 
         * By default, this parameter is not specified.
         */
        public Builder serviceDiscoveryTypes(java.util.List < String > serviceDiscoveryTypes) {
            this.putBodyParameter("service_discovery_types", serviceDiscoveryTypes);
            this.serviceDiscoveryTypes = serviceDiscoveryTypes;
            return this;
        }

        /**
         * Specifies whether to configure Source Network Address Translation (SNAT) rules for the VPC where your cluster is deployed. Valid values:
         * <p>
         * 
         * *   `true`: automatically creates a NAT gateway and configures SNAT rules. Set this parameter to `true` if nodes and applications in the cluster need to access the Internet.
         * *   `false`: does not create a NAT gateway or configure SNAT rules. In this case, nodes and applications in the cluster cannot access the Internet.
         * 
         * >  If this feature is disabled when you create the cluster, you can also manually enable this feature after you create the cluster. For more information, see [Manually create a NAT gateway and configure SNAT rules](~~178480~~).
         * 
         * Default value: `true`.
         */
        public Builder snatEntry(Boolean snatEntry) {
            this.putBodyParameter("snat_entry", snatEntry);
            this.snatEntry = snatEntry;
            return this;
        }

        /**
         * Specifies whether to enable reinforcement based on Multi-Level Protection Scheme (MLPS). For more information, see [ACK reinforcement based on classified protection](~~196148~~).
         * <p>
         * 
         * Valid values:
         * 
         * *   `true`: enables reinforcement based on MLPS.
         * *   `false`: disables reinforcement based on MLPS.
         * 
         * Default value: `false`.
         */
        public Builder socEnabled(Boolean socEnabled) {
            this.putBodyParameter("soc_enabled", socEnabled);
            this.socEnabled = socEnabled;
            return this;
        }

        /**
         * Specifies whether to enable SSH logon. If this parameter is set to true, you can log on to master nodes in an ACK dedicated cluster over the Internet. This parameter does not take effect in ACK managed clusters. Valid values:
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
         * The tags to be added to nodes. You must add tags based on the following rules:
         * <p>
         * 
         * *   A tag is a case-sensitive key-value pair. You can add up to 20 tags.
         * *   When you add a tag, you must specify a unique key but you can leave the value empty. A key cannot exceed 64 characters in length and a value cannot exceed 128 characters in length. Keys and values cannot start with aliyun, acs:, https://, or http://. For more information, see [Labels and Selectors](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set).
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The taints of the nodes in the node pool. Taints can be used together with tolerations to avoid scheduling pods to specified nodes. For more information, see [taint-and-toleration](https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/).
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
         * The vSwitches that are specified for nodes in the cluster. This parameter is required when you create an ACK managed cluster that does not contain nodes.
         */
        public Builder vswitchIds(java.util.List < String > vswitchIds) {
            this.putBodyParameter("vswitch_ids", vswitchIds);
            this.vswitchIds = vswitchIds;
            return this;
        }

        /**
         * Specifies whether to enable auto renewal for worker nodes. This parameter takes effect and is required only if `worker_instance_charge_type` is set to `PrePaid`. Valid values:
         * <p>
         * 
         * *   `true`: enables auto-renewal.
         * *   `false`: disables auto-renewal.
         * 
         * Default value: `true`.
         */
        public Builder workerAutoRenew(Boolean workerAutoRenew) {
            this.putBodyParameter("worker_auto_renew", workerAutoRenew);
            this.workerAutoRenew = workerAutoRenew;
            return this;
        }

        /**
         * The cycle of auto-renewal. This parameter takes effect and is required only if the subscription billing method is selected for worker nodes.
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
         * The subscription duration of worker nodes. This parameter takes effect and is required only if `worker_instance_charge_type` is set to `PrePaid`.
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
         * Set the value to `Month`. Worker nodes are billed only on a monthly basis.
         */
        public Builder workerPeriodUnit(String workerPeriodUnit) {
            this.putBodyParameter("worker_period_unit", workerPeriodUnit);
            this.workerPeriodUnit = workerPeriodUnit;
            return this;
        }

        /**
         * The category of the system disks for worker nodes. For more information, see [Elastic Block Storage devices](~~63136~~).
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
         * If the system disk is an ESSD, you can set the PL of the ESSD. For more information, see [Enhanced SSDs](~~122389~~).
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
         * The value of this parameter must be at least 40 and no less than the image size.
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
         * The list of vSwitches that are specified for nodes. Each node is allocated a vSwitch.
         * <p>
         * 
         * The `worker_vswitch_ids` parameter is optional but the `vswitch_ids` parameter is required when you create an ACK managed cluster that does not contain nodes.
         */
        public Builder workerVswitchIds(java.util.List < String > workerVswitchIds) {
            this.putBodyParameter("worker_vswitch_ids", workerVswitchIds);
            this.workerVswitchIds = workerVswitchIds;
            return this;
        }

        /**
         * The ID of the zone to which the cluster belongs. This parameter takes effect in only ACK Serverless clusters.
         * <p>
         * 
         * When you create an ACK Serverless cluster, you must configure `zone_id` if `vpc_id` and `vswitch_ids` are not configured. This way, the system automatically creates a VPC in the specified zone.
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("zone_id", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

    public static class WorkerDataDisks extends TeaModel {
        @NameInMap("category")
        @Validation(required = true)
        private String category;

        @NameInMap("encrypted")
        private String encrypted;

        @NameInMap("performance_level")
        private String performanceLevel;

        @NameInMap("size")
        @Validation(required = true)
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
             * Specifies whether to encrypt a data disk. Valid values:
             * <p>
             * 
             * *   `true`: encrypts a data disk.
             * *   `false`: does not encrypt a data disk.
             * 
             * Default value: `false`.
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * The PL of a data disk. This parameter takes effect only for ESSDs. You can specify a higher PL if you increase the size of the system disk. For more information, see [Enhanced SSDs](~~122389~~).
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The size of the data disk. Valid values: 40 to 32767.
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
