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
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("region_id")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("cluster_type")
    @Validation(required = true)
    private String clusterType;

    @Body
    @NameInMap("cluster_spec")
    private String clusterSpec;

    @Body
    @NameInMap("kubernetes_version")
    private String kubernetesVersion;

    @Body
    @NameInMap("runtime")
    private Runtime runtime;

    @Body
    @NameInMap("vpcid")
    @Validation(required = true)
    private String vpcid;

    @Body
    @NameInMap("pod_vswitch_ids")
    private java.util.List < String > podVswitchIds;

    @Body
    @NameInMap("container_cidr")
    @Validation(required = true)
    private String containerCidr;

    @Body
    @NameInMap("service_cidr")
    @Validation(required = true)
    private String serviceCidr;

    @Body
    @NameInMap("security_group_id")
    private String securityGroupId;

    @Body
    @NameInMap("is_enterprise_security_group")
    private Boolean isEnterpriseSecurityGroup;

    @Body
    @NameInMap("snat_entry")
    private Boolean snatEntry;

    @Body
    @NameInMap("endpoint_public_access")
    private Boolean endpointPublicAccess;

    @Body
    @NameInMap("ssh_flags")
    private Boolean sshFlags;

    @Body
    @NameInMap("timezone")
    private String timezone;

    @Body
    @NameInMap("node_cidr_mask")
    private String nodeCidrMask;

    @Body
    @NameInMap("user_ca")
    private String userCa;

    @Body
    @NameInMap("user_data")
    private String userData;

    @Body
    @NameInMap("cluster_domain")
    private String clusterDomain;

    @Body
    @NameInMap("node_name_mode")
    private String nodeNameMode;

    @Body
    @NameInMap("custom_san")
    private String customSan;

    @Body
    @NameInMap("encryption_provider_key")
    private String encryptionProviderKey;

    @Body
    @NameInMap("service_account_issuer")
    private String serviceAccountIssuer;

    @Body
    @NameInMap("api_audiences")
    private String apiAudiences;

    @Body
    @NameInMap("image_id")
    private String imageId;

    @Body
    @NameInMap("rds_instances")
    private java.util.List < String > rdsInstances;

    @Body
    @NameInMap("tags")
    private java.util.List < Tag > tags;

    @Body
    @NameInMap("addons")
    private java.util.List < Addon > addons;

    @Body
    @NameInMap("taints")
    private java.util.List < Taint > taints;

    @Body
    @NameInMap("cloud_monitor_flags")
    private Boolean cloudMonitorFlags;

    @Body
    @NameInMap("platform")
    private String platform;

    @Body
    @NameInMap("os_type")
    private String osType;

    @Body
    @NameInMap("soc_enabled")
    private Boolean socEnabled;

    @Body
    @NameInMap("cis_enabled")
    private Boolean cisEnabled;

    @Body
    @NameInMap("cpu_policy")
    private String cpuPolicy;

    @Body
    @NameInMap("proxy_mode")
    private String proxyMode;

    @Body
    @NameInMap("node_port_range")
    private String nodePortRange;

    @Body
    @NameInMap("key_pair")
    @Validation(required = true)
    private String keyPair;

    @Body
    @NameInMap("login_password")
    @Validation(required = true)
    private String loginPassword;

    @Body
    @NameInMap("master_count")
    private Long masterCount;

    @Body
    @NameInMap("master_vswitch_ids")
    @Validation(required = true)
    private java.util.List < String > masterVswitchIds;

    @Body
    @NameInMap("master_instance_types")
    @Validation(required = true)
    private java.util.List < String > masterInstanceTypes;

    @Body
    @NameInMap("master_system_disk_category")
    @Validation(required = true)
    private String masterSystemDiskCategory;

    @Body
    @NameInMap("master_system_disk_size")
    @Validation(required = true)
    private Long masterSystemDiskSize;

    @Body
    @NameInMap("master_system_disk_performance_level")
    private String masterSystemDiskPerformanceLevel;

    @Body
    @NameInMap("master_system_disk_snapshot_policy_id")
    private String masterSystemDiskSnapshotPolicyId;

    @Body
    @NameInMap("master_instance_charge_type")
    private String masterInstanceChargeType;

    @Body
    @NameInMap("master_period_unit")
    private String masterPeriodUnit;

    @Body
    @NameInMap("master_period")
    private Long masterPeriod;

    @Body
    @NameInMap("master_auto_renew")
    private Boolean masterAutoRenew;

    @Body
    @NameInMap("master_auto_renew_period")
    private Long masterAutoRenewPeriod;

    @Body
    @NameInMap("num_of_nodes")
    @Validation(required = true)
    private Long numOfNodes;

    @Body
    @NameInMap("vswitch_ids")
    @Validation(required = true)
    private java.util.List < String > vswitchIds;

    @Body
    @NameInMap("worker_vswitch_ids")
    @Validation(required = true)
    private java.util.List < String > workerVswitchIds;

    @Body
    @NameInMap("worker_instance_types")
    @Validation(required = true)
    private java.util.List < String > workerInstanceTypes;

    @Body
    @NameInMap("worker_system_disk_category")
    @Validation(required = true)
    private String workerSystemDiskCategory;

    @Body
    @NameInMap("worker_system_disk_size")
    @Validation(required = true)
    private Long workerSystemDiskSize;

    @Body
    @NameInMap("worker_system_disk_snapshot_policy_id")
    private String workerSystemDiskSnapshotPolicyId;

    @Body
    @NameInMap("worker_system_disk_performance_level")
    private String workerSystemDiskPerformanceLevel;

    @Body
    @NameInMap("worker_data_disks")
    private java.util.List < WorkerDataDisks> workerDataDisks;

    @Body
    @NameInMap("worker_instance_charge_type")
    private String workerInstanceChargeType;

    @Body
    @NameInMap("worker_period_unit")
    private String workerPeriodUnit;

    @Body
    @NameInMap("worker_period")
    private Long workerPeriod;

    @Body
    @NameInMap("worker_auto_renew")
    private Boolean workerAutoRenew;

    @Body
    @NameInMap("worker_auto_renew_period")
    private Long workerAutoRenewPeriod;

    @Body
    @NameInMap("instances")
    private java.util.List < String > instances;

    @Body
    @NameInMap("format_disk")
    private Boolean formatDisk;

    @Body
    @NameInMap("keep_instance_name")
    private Boolean keepInstanceName;

    @Body
    @NameInMap("service_discovery_types")
    private java.util.List < String > serviceDiscoveryTypes;

    @Body
    @NameInMap("nat_gateway")
    private Boolean natGateway;

    @Body
    @NameInMap("zone_id")
    private String zoneId;

    @Body
    @NameInMap("profile")
    private String profile;

    @Body
    @NameInMap("logging_type")
    private String loggingType;

    @Body
    @NameInMap("controlplane_log_ttl")
    private String controlplaneLogTtl;

    @Body
    @NameInMap("controlplane_log_project")
    private String controlplaneLogProject;

    @Body
    @NameInMap("controlplane_log_components")
    private java.util.List < String > controlplaneLogComponents;

    @Body
    @NameInMap("deletion_protection")
    private Boolean deletionProtection;

    @Body
    @NameInMap("disable_rollback")
    private Boolean disableRollback;

    @Body
    @NameInMap("timeout_mins")
    private Long timeoutMins;

    @Body
    @NameInMap("image_type")
    private String imageType;

    @Body
    @NameInMap("load_balancer_spec")
    private String loadBalancerSpec;

    @Body
    @NameInMap("enable_rrsa")
    private Boolean enableRrsa;

    @Body
    @NameInMap("resource_group_id")
    private String resourceGroupId;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.clusterType = builder.clusterType;
        this.clusterSpec = builder.clusterSpec;
        this.kubernetesVersion = builder.kubernetesVersion;
        this.runtime = builder.runtime;
        this.vpcid = builder.vpcid;
        this.podVswitchIds = builder.podVswitchIds;
        this.containerCidr = builder.containerCidr;
        this.serviceCidr = builder.serviceCidr;
        this.securityGroupId = builder.securityGroupId;
        this.isEnterpriseSecurityGroup = builder.isEnterpriseSecurityGroup;
        this.snatEntry = builder.snatEntry;
        this.endpointPublicAccess = builder.endpointPublicAccess;
        this.sshFlags = builder.sshFlags;
        this.timezone = builder.timezone;
        this.nodeCidrMask = builder.nodeCidrMask;
        this.userCa = builder.userCa;
        this.userData = builder.userData;
        this.clusterDomain = builder.clusterDomain;
        this.nodeNameMode = builder.nodeNameMode;
        this.customSan = builder.customSan;
        this.encryptionProviderKey = builder.encryptionProviderKey;
        this.serviceAccountIssuer = builder.serviceAccountIssuer;
        this.apiAudiences = builder.apiAudiences;
        this.imageId = builder.imageId;
        this.rdsInstances = builder.rdsInstances;
        this.tags = builder.tags;
        this.addons = builder.addons;
        this.taints = builder.taints;
        this.cloudMonitorFlags = builder.cloudMonitorFlags;
        this.platform = builder.platform;
        this.osType = builder.osType;
        this.socEnabled = builder.socEnabled;
        this.cisEnabled = builder.cisEnabled;
        this.cpuPolicy = builder.cpuPolicy;
        this.proxyMode = builder.proxyMode;
        this.nodePortRange = builder.nodePortRange;
        this.keyPair = builder.keyPair;
        this.loginPassword = builder.loginPassword;
        this.masterCount = builder.masterCount;
        this.masterVswitchIds = builder.masterVswitchIds;
        this.masterInstanceTypes = builder.masterInstanceTypes;
        this.masterSystemDiskCategory = builder.masterSystemDiskCategory;
        this.masterSystemDiskSize = builder.masterSystemDiskSize;
        this.masterSystemDiskPerformanceLevel = builder.masterSystemDiskPerformanceLevel;
        this.masterSystemDiskSnapshotPolicyId = builder.masterSystemDiskSnapshotPolicyId;
        this.masterInstanceChargeType = builder.masterInstanceChargeType;
        this.masterPeriodUnit = builder.masterPeriodUnit;
        this.masterPeriod = builder.masterPeriod;
        this.masterAutoRenew = builder.masterAutoRenew;
        this.masterAutoRenewPeriod = builder.masterAutoRenewPeriod;
        this.numOfNodes = builder.numOfNodes;
        this.vswitchIds = builder.vswitchIds;
        this.workerVswitchIds = builder.workerVswitchIds;
        this.workerInstanceTypes = builder.workerInstanceTypes;
        this.workerSystemDiskCategory = builder.workerSystemDiskCategory;
        this.workerSystemDiskSize = builder.workerSystemDiskSize;
        this.workerSystemDiskSnapshotPolicyId = builder.workerSystemDiskSnapshotPolicyId;
        this.workerSystemDiskPerformanceLevel = builder.workerSystemDiskPerformanceLevel;
        this.workerDataDisks = builder.workerDataDisks;
        this.workerInstanceChargeType = builder.workerInstanceChargeType;
        this.workerPeriodUnit = builder.workerPeriodUnit;
        this.workerPeriod = builder.workerPeriod;
        this.workerAutoRenew = builder.workerAutoRenew;
        this.workerAutoRenewPeriod = builder.workerAutoRenewPeriod;
        this.instances = builder.instances;
        this.formatDisk = builder.formatDisk;
        this.keepInstanceName = builder.keepInstanceName;
        this.serviceDiscoveryTypes = builder.serviceDiscoveryTypes;
        this.natGateway = builder.natGateway;
        this.zoneId = builder.zoneId;
        this.profile = builder.profile;
        this.loggingType = builder.loggingType;
        this.controlplaneLogTtl = builder.controlplaneLogTtl;
        this.controlplaneLogProject = builder.controlplaneLogProject;
        this.controlplaneLogComponents = builder.controlplaneLogComponents;
        this.deletionProtection = builder.deletionProtection;
        this.disableRollback = builder.disableRollback;
        this.timeoutMins = builder.timeoutMins;
        this.imageType = builder.imageType;
        this.loadBalancerSpec = builder.loadBalancerSpec;
        this.enableRrsa = builder.enableRrsa;
        this.resourceGroupId = builder.resourceGroupId;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return clusterSpec
     */
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    /**
     * @return kubernetesVersion
     */
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * @return runtime
     */
    public Runtime getRuntime() {
        return this.runtime;
    }

    /**
     * @return vpcid
     */
    public String getVpcid() {
        return this.vpcid;
    }

    /**
     * @return podVswitchIds
     */
    public java.util.List < String > getPodVswitchIds() {
        return this.podVswitchIds;
    }

    /**
     * @return containerCidr
     */
    public String getContainerCidr() {
        return this.containerCidr;
    }

    /**
     * @return serviceCidr
     */
    public String getServiceCidr() {
        return this.serviceCidr;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return isEnterpriseSecurityGroup
     */
    public Boolean getIsEnterpriseSecurityGroup() {
        return this.isEnterpriseSecurityGroup;
    }

    /**
     * @return snatEntry
     */
    public Boolean getSnatEntry() {
        return this.snatEntry;
    }

    /**
     * @return endpointPublicAccess
     */
    public Boolean getEndpointPublicAccess() {
        return this.endpointPublicAccess;
    }

    /**
     * @return sshFlags
     */
    public Boolean getSshFlags() {
        return this.sshFlags;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * @return nodeCidrMask
     */
    public String getNodeCidrMask() {
        return this.nodeCidrMask;
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
     * @return clusterDomain
     */
    public String getClusterDomain() {
        return this.clusterDomain;
    }

    /**
     * @return nodeNameMode
     */
    public String getNodeNameMode() {
        return this.nodeNameMode;
    }

    /**
     * @return customSan
     */
    public String getCustomSan() {
        return this.customSan;
    }

    /**
     * @return encryptionProviderKey
     */
    public String getEncryptionProviderKey() {
        return this.encryptionProviderKey;
    }

    /**
     * @return serviceAccountIssuer
     */
    public String getServiceAccountIssuer() {
        return this.serviceAccountIssuer;
    }

    /**
     * @return apiAudiences
     */
    public String getApiAudiences() {
        return this.apiAudiences;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return rdsInstances
     */
    public java.util.List < String > getRdsInstances() {
        return this.rdsInstances;
    }

    /**
     * @return tags
     */
    public java.util.List < Tag > getTags() {
        return this.tags;
    }

    /**
     * @return addons
     */
    public java.util.List < Addon > getAddons() {
        return this.addons;
    }

    /**
     * @return taints
     */
    public java.util.List < Taint > getTaints() {
        return this.taints;
    }

    /**
     * @return cloudMonitorFlags
     */
    public Boolean getCloudMonitorFlags() {
        return this.cloudMonitorFlags;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return socEnabled
     */
    public Boolean getSocEnabled() {
        return this.socEnabled;
    }

    /**
     * @return cisEnabled
     */
    public Boolean getCisEnabled() {
        return this.cisEnabled;
    }

    /**
     * @return cpuPolicy
     */
    public String getCpuPolicy() {
        return this.cpuPolicy;
    }

    /**
     * @return proxyMode
     */
    public String getProxyMode() {
        return this.proxyMode;
    }

    /**
     * @return nodePortRange
     */
    public String getNodePortRange() {
        return this.nodePortRange;
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
     * @return masterCount
     */
    public Long getMasterCount() {
        return this.masterCount;
    }

    /**
     * @return masterVswitchIds
     */
    public java.util.List < String > getMasterVswitchIds() {
        return this.masterVswitchIds;
    }

    /**
     * @return masterInstanceTypes
     */
    public java.util.List < String > getMasterInstanceTypes() {
        return this.masterInstanceTypes;
    }

    /**
     * @return masterSystemDiskCategory
     */
    public String getMasterSystemDiskCategory() {
        return this.masterSystemDiskCategory;
    }

    /**
     * @return masterSystemDiskSize
     */
    public Long getMasterSystemDiskSize() {
        return this.masterSystemDiskSize;
    }

    /**
     * @return masterSystemDiskPerformanceLevel
     */
    public String getMasterSystemDiskPerformanceLevel() {
        return this.masterSystemDiskPerformanceLevel;
    }

    /**
     * @return masterSystemDiskSnapshotPolicyId
     */
    public String getMasterSystemDiskSnapshotPolicyId() {
        return this.masterSystemDiskSnapshotPolicyId;
    }

    /**
     * @return masterInstanceChargeType
     */
    public String getMasterInstanceChargeType() {
        return this.masterInstanceChargeType;
    }

    /**
     * @return masterPeriodUnit
     */
    public String getMasterPeriodUnit() {
        return this.masterPeriodUnit;
    }

    /**
     * @return masterPeriod
     */
    public Long getMasterPeriod() {
        return this.masterPeriod;
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
     * @return numOfNodes
     */
    public Long getNumOfNodes() {
        return this.numOfNodes;
    }

    /**
     * @return vswitchIds
     */
    public java.util.List < String > getVswitchIds() {
        return this.vswitchIds;
    }

    /**
     * @return workerVswitchIds
     */
    public java.util.List < String > getWorkerVswitchIds() {
        return this.workerVswitchIds;
    }

    /**
     * @return workerInstanceTypes
     */
    public java.util.List < String > getWorkerInstanceTypes() {
        return this.workerInstanceTypes;
    }

    /**
     * @return workerSystemDiskCategory
     */
    public String getWorkerSystemDiskCategory() {
        return this.workerSystemDiskCategory;
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
     * @return workerSystemDiskPerformanceLevel
     */
    public String getWorkerSystemDiskPerformanceLevel() {
        return this.workerSystemDiskPerformanceLevel;
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
     * @return workerPeriodUnit
     */
    public String getWorkerPeriodUnit() {
        return this.workerPeriodUnit;
    }

    /**
     * @return workerPeriod
     */
    public Long getWorkerPeriod() {
        return this.workerPeriod;
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
     * @return instances
     */
    public java.util.List < String > getInstances() {
        return this.instances;
    }

    /**
     * @return formatDisk
     */
    public Boolean getFormatDisk() {
        return this.formatDisk;
    }

    /**
     * @return keepInstanceName
     */
    public Boolean getKeepInstanceName() {
        return this.keepInstanceName;
    }

    /**
     * @return serviceDiscoveryTypes
     */
    public java.util.List < String > getServiceDiscoveryTypes() {
        return this.serviceDiscoveryTypes;
    }

    /**
     * @return natGateway
     */
    public Boolean getNatGateway() {
        return this.natGateway;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * @return loggingType
     */
    public String getLoggingType() {
        return this.loggingType;
    }

    /**
     * @return controlplaneLogTtl
     */
    public String getControlplaneLogTtl() {
        return this.controlplaneLogTtl;
    }

    /**
     * @return controlplaneLogProject
     */
    public String getControlplaneLogProject() {
        return this.controlplaneLogProject;
    }

    /**
     * @return controlplaneLogComponents
     */
    public java.util.List < String > getControlplaneLogComponents() {
        return this.controlplaneLogComponents;
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
     * @return timeoutMins
     */
    public Long getTimeoutMins() {
        return this.timeoutMins;
    }

    /**
     * @return imageType
     */
    public String getImageType() {
        return this.imageType;
    }

    /**
     * @return loadBalancerSpec
     */
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

    /**
     * @return enableRrsa
     */
    public Boolean getEnableRrsa() {
        return this.enableRrsa;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private String name; 
        private String regionId; 
        private String clusterType; 
        private String clusterSpec; 
        private String kubernetesVersion; 
        private Runtime runtime; 
        private String vpcid; 
        private java.util.List < String > podVswitchIds; 
        private String containerCidr; 
        private String serviceCidr; 
        private String securityGroupId; 
        private Boolean isEnterpriseSecurityGroup; 
        private Boolean snatEntry; 
        private Boolean endpointPublicAccess; 
        private Boolean sshFlags; 
        private String timezone; 
        private String nodeCidrMask; 
        private String userCa; 
        private String userData; 
        private String clusterDomain; 
        private String nodeNameMode; 
        private String customSan; 
        private String encryptionProviderKey; 
        private String serviceAccountIssuer; 
        private String apiAudiences; 
        private String imageId; 
        private java.util.List < String > rdsInstances; 
        private java.util.List < Tag > tags; 
        private java.util.List < Addon > addons; 
        private java.util.List < Taint > taints; 
        private Boolean cloudMonitorFlags; 
        private String platform; 
        private String osType; 
        private Boolean socEnabled; 
        private Boolean cisEnabled; 
        private String cpuPolicy; 
        private String proxyMode; 
        private String nodePortRange; 
        private String keyPair; 
        private String loginPassword; 
        private Long masterCount; 
        private java.util.List < String > masterVswitchIds; 
        private java.util.List < String > masterInstanceTypes; 
        private String masterSystemDiskCategory; 
        private Long masterSystemDiskSize; 
        private String masterSystemDiskPerformanceLevel; 
        private String masterSystemDiskSnapshotPolicyId; 
        private String masterInstanceChargeType; 
        private String masterPeriodUnit; 
        private Long masterPeriod; 
        private Boolean masterAutoRenew; 
        private Long masterAutoRenewPeriod; 
        private Long numOfNodes; 
        private java.util.List < String > vswitchIds; 
        private java.util.List < String > workerVswitchIds; 
        private java.util.List < String > workerInstanceTypes; 
        private String workerSystemDiskCategory; 
        private Long workerSystemDiskSize; 
        private String workerSystemDiskSnapshotPolicyId; 
        private String workerSystemDiskPerformanceLevel; 
        private java.util.List < WorkerDataDisks> workerDataDisks; 
        private String workerInstanceChargeType; 
        private String workerPeriodUnit; 
        private Long workerPeriod; 
        private Boolean workerAutoRenew; 
        private Long workerAutoRenewPeriod; 
        private java.util.List < String > instances; 
        private Boolean formatDisk; 
        private Boolean keepInstanceName; 
        private java.util.List < String > serviceDiscoveryTypes; 
        private Boolean natGateway; 
        private String zoneId; 
        private String profile; 
        private String loggingType; 
        private String controlplaneLogTtl; 
        private String controlplaneLogProject; 
        private java.util.List < String > controlplaneLogComponents; 
        private Boolean deletionProtection; 
        private Boolean disableRollback; 
        private Long timeoutMins; 
        private String imageType; 
        private String loadBalancerSpec; 
        private Boolean enableRrsa; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.name = request.name;
            this.regionId = request.regionId;
            this.clusterType = request.clusterType;
            this.clusterSpec = request.clusterSpec;
            this.kubernetesVersion = request.kubernetesVersion;
            this.runtime = request.runtime;
            this.vpcid = request.vpcid;
            this.podVswitchIds = request.podVswitchIds;
            this.containerCidr = request.containerCidr;
            this.serviceCidr = request.serviceCidr;
            this.securityGroupId = request.securityGroupId;
            this.isEnterpriseSecurityGroup = request.isEnterpriseSecurityGroup;
            this.snatEntry = request.snatEntry;
            this.endpointPublicAccess = request.endpointPublicAccess;
            this.sshFlags = request.sshFlags;
            this.timezone = request.timezone;
            this.nodeCidrMask = request.nodeCidrMask;
            this.userCa = request.userCa;
            this.userData = request.userData;
            this.clusterDomain = request.clusterDomain;
            this.nodeNameMode = request.nodeNameMode;
            this.customSan = request.customSan;
            this.encryptionProviderKey = request.encryptionProviderKey;
            this.serviceAccountIssuer = request.serviceAccountIssuer;
            this.apiAudiences = request.apiAudiences;
            this.imageId = request.imageId;
            this.rdsInstances = request.rdsInstances;
            this.tags = request.tags;
            this.addons = request.addons;
            this.taints = request.taints;
            this.cloudMonitorFlags = request.cloudMonitorFlags;
            this.platform = request.platform;
            this.osType = request.osType;
            this.socEnabled = request.socEnabled;
            this.cisEnabled = request.cisEnabled;
            this.cpuPolicy = request.cpuPolicy;
            this.proxyMode = request.proxyMode;
            this.nodePortRange = request.nodePortRange;
            this.keyPair = request.keyPair;
            this.loginPassword = request.loginPassword;
            this.masterCount = request.masterCount;
            this.masterVswitchIds = request.masterVswitchIds;
            this.masterInstanceTypes = request.masterInstanceTypes;
            this.masterSystemDiskCategory = request.masterSystemDiskCategory;
            this.masterSystemDiskSize = request.masterSystemDiskSize;
            this.masterSystemDiskPerformanceLevel = request.masterSystemDiskPerformanceLevel;
            this.masterSystemDiskSnapshotPolicyId = request.masterSystemDiskSnapshotPolicyId;
            this.masterInstanceChargeType = request.masterInstanceChargeType;
            this.masterPeriodUnit = request.masterPeriodUnit;
            this.masterPeriod = request.masterPeriod;
            this.masterAutoRenew = request.masterAutoRenew;
            this.masterAutoRenewPeriod = request.masterAutoRenewPeriod;
            this.numOfNodes = request.numOfNodes;
            this.vswitchIds = request.vswitchIds;
            this.workerVswitchIds = request.workerVswitchIds;
            this.workerInstanceTypes = request.workerInstanceTypes;
            this.workerSystemDiskCategory = request.workerSystemDiskCategory;
            this.workerSystemDiskSize = request.workerSystemDiskSize;
            this.workerSystemDiskSnapshotPolicyId = request.workerSystemDiskSnapshotPolicyId;
            this.workerSystemDiskPerformanceLevel = request.workerSystemDiskPerformanceLevel;
            this.workerDataDisks = request.workerDataDisks;
            this.workerInstanceChargeType = request.workerInstanceChargeType;
            this.workerPeriodUnit = request.workerPeriodUnit;
            this.workerPeriod = request.workerPeriod;
            this.workerAutoRenew = request.workerAutoRenew;
            this.workerAutoRenewPeriod = request.workerAutoRenewPeriod;
            this.instances = request.instances;
            this.formatDisk = request.formatDisk;
            this.keepInstanceName = request.keepInstanceName;
            this.serviceDiscoveryTypes = request.serviceDiscoveryTypes;
            this.natGateway = request.natGateway;
            this.zoneId = request.zoneId;
            this.profile = request.profile;
            this.loggingType = request.loggingType;
            this.controlplaneLogTtl = request.controlplaneLogTtl;
            this.controlplaneLogProject = request.controlplaneLogProject;
            this.controlplaneLogComponents = request.controlplaneLogComponents;
            this.deletionProtection = request.deletionProtection;
            this.disableRollback = request.disableRollback;
            this.timeoutMins = request.timeoutMins;
            this.imageType = request.imageType;
            this.loadBalancerSpec = request.loadBalancerSpec;
            this.enableRrsa = request.enableRrsa;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The name of the cluster.
         * <p>
         * 
         * Naming rule: the name must be 1 to 63 characters in length and cannot start with a hyphen (-). It must be 1 to 63 characters in length.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * The region ID of the cluster.
         * <p>
         * 
         * 
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("region_id", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the cluster. Valid values:
         * <p>
         * 
         * -"Kubernetes": dedicated cluster.
         * -"ManagedKubernetes": Standard managed cluster and Edge managed cluster.
         * -"Ask": Standard Serverless cluster.
         * -"ExternalKubernetes": the external cluster registered with ACK.
         */
        public Builder clusterType(String clusterType) {
            this.putBodyParameter("cluster_type", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The type of the managed cluster. Valid values:
         * <p>
         * 
         * -"ack.pro.small": a professional managed cluster, that is, a ACK Pro cluster ".
         * -"ack.standard": Standard managed cluster.
         * 
         * Default value: "ack.standard ". The value can be empty. If it is empty, a standard managed cluster is created.
         * 
         * For more information, see [ACK Pro cluster introduction](https://help.aliyun.com/document_detail/173290.html).
         */
        public Builder clusterSpec(String clusterSpec) {
            this.putBodyParameter("cluster_spec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * The cluster version, which is consistent with the baseline version of the Kubernetes community. We recommend that you select the latest version. If not specified, the latest version is used by default.
         * <p>
         * 
         * You can create two latest clusters in the ACK console. You can use the API to create other Kubernetes clusters. For more information about the Kubernetes versions supported by ACK, see [Kubernetes release overview](~~ 185269 ~~).
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.putBodyParameter("kubernetes_version", kubernetesVersion);
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * Container Runtime in the cluster uses Docker runtime by default, and supports Containerd and sandbox Container Runtime.
         * <p>
         * 
         * For more information about container engine selection, see [how to select Docker runtime and sandbox runtime](https://help.aliyun.com/document_detail/160313.html).
         */
        public Builder runtime(Runtime runtime) {
            this.putBodyParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * The VPC used by the cluster.
         */
        public Builder vpcid(String vpcid) {
            this.putBodyParameter("vpcid", vpcid);
            this.vpcid = vpcid;
            return this;
        }

        /**
         * The list of Pod vswitches. You must specify at least one Pod vSwitch in the same zone for each node vSwitch and do not overlap with node "vswitch". We recommend that you select a vSwitch with a subnet mask greater than 19.
         * <p>
         * 
         * > When the Terway network type is used, you must specify pod_vswitch_ids for the cluster ".
         */
        public Builder podVswitchIds(java.util.List < String > podVswitchIds) {
            this.putBodyParameter("pod_vswitch_ids", podVswitchIds);
            this.podVswitchIds = podVswitchIds;
            return this;
        }

        /**
         * The cidr block of the Pod. It must be a valid private cidr block, that is, the following cidr blocks and their subnets: 10.0.0.0/8, 172.16-31.0.0/12-16, and 192.168.0.0/16. It cannot be the same as the cidr block used by the VPC or the existing Kubernetes cluster in the VPC. After the cluster is created, it cannot be modified.
         * <p>
         * 
         * For more information about cluster network planning, see [Kubernetes cidr block planning in VPC](~~ 86500 ~~).
         * 
         * > this parameter is required when you create a Flannel-network cluster.
         */
        public Builder containerCidr(String containerCidr) {
            this.putBodyParameter("container_cidr", containerCidr);
            this.containerCidr = containerCidr;
            return this;
        }

        /**
         * Service cidr block. Valid values: 10.0.0.0/16-24,172.16-31.0.0/16-24, and 192.168.0.0/16-24.
         * <p>
         * It cannot overlap with the cidr block 10.1.0.0/21 of the VPC or the cidr block used by an existing Kubernetes cluster in the VPC. After the cluster is created, it cannot be modified.
         * 
         * The default cidr block is 172.19.0.0/20.
         */
        public Builder serviceCidr(String serviceCidr) {
            this.putBodyParameter("service_cidr", serviceCidr);
            this.serviceCidr = serviceCidr;
            return this;
        }

        /**
         * When creating a cluster using an existing security group, you must specify the security group ID and "is_enterprise_security_group". The cluster nodes are automatically added to this security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putBodyParameter("security_group_id", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * An enterprise-level security group is automatically created. This parameter takes effect only when "security_group_id" is empty.
         * <p>
         * 
         * > when you use a common security group, the total number of nodes and Terway Pod in the cluster cannot exceed 2000. Therefore, we recommend that you use an enterprise security group when creating a Terway network cluster.
         * 
         * -"true": creates and uses an enterprise-level security group.
         * -"false": does not use enterprise-level security groups.
         * 
         * Default value: "true ".
         */
        public Builder isEnterpriseSecurityGroup(Boolean isEnterpriseSecurityGroup) {
            this.putBodyParameter("is_enterprise_security_group", isEnterpriseSecurityGroup);
            this.isEnterpriseSecurityGroup = isEnterpriseSecurityGroup;
            return this;
        }

        /**
         * Configure SNAT for the vpc. Valid values:
         * <p>
         * 
         * -"true": creates a NAT gateway and automatically configures SNAT rules. If nodes and applications in your cluster need to access the internet, set this parameter to "true ".
         * -"false": does not create NAT gateways or SNAT rules for you. In this mode, nodes and applications in the cluster cannot access the internet.
         * 
         * > if you do not enable this feature when creating a cluster, you can enable this feature to access the internet for subsequent services. For more information, see [manually enable](~~ 178480 ~~).
         * 
         * Default value: "true ".
         */
        public Builder snatEntry(Boolean snatEntry) {
            this.putBodyParameter("snat_entry", snatEntry);
            this.snatEntry = snatEntry;
            return this;
        }

        /**
         * Specifies whether to enable internet access. Expose API Server through EIP to enable public network access to the cluster.
         * <p>
         * 
         * -"true": enables internet access.
         * -"false": public network access is disabled. If you select disable, the cluster API Server cannot be accessed through the internet.
         * 
         * Default value: "false ".
         */
        public Builder endpointPublicAccess(Boolean endpointPublicAccess) {
            this.putBodyParameter("endpoint_public_access", endpointPublicAccess);
            this.endpointPublicAccess = endpointPublicAccess;
            return this;
        }

        /**
         * Specifies whether to enable SSH logon over the Internet. Log on to the Master node of the dedicated cluster. This parameter does not take effect in the managed cluster.
         * <p>
         * -"true": indicates open.
         * -"false": indicates that it is not open.
         * 
         * Default value: "false ".
         * 
         * 
         */
        public Builder sshFlags(Boolean sshFlags) {
            this.putBodyParameter("ssh_flags", sshFlags);
            this.sshFlags = sshFlags;
            return this;
        }

        /**
         * The time zone used by the cluster.
         */
        public Builder timezone(String timezone) {
            this.putBodyParameter("timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        /**
         * The number of node IP addresses. The number of IP addresses is determined by specifying the CIDR block of the network. This parameter takes effect only for Flannel network type clusters.
         * <p>
         * 
         * Default value: "26 ".
         */
        public Builder nodeCidrMask(String nodeCidrMask) {
            this.putBodyParameter("node_cidr_mask", nodeCidrMask);
            this.nodeCidrMask = nodeCidrMask;
            return this;
        }

        /**
         * Custom cluster CA.
         */
        public Builder userCa(String userCa) {
            this.putBodyParameter("user_ca", userCa);
            this.userCa = userCa;
            return this;
        }

        /**
         * Custom node data.
         */
        public Builder userData(String userData) {
            this.putBodyParameter("user_data", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The local domain name of the cluster.
         * <p>
         * 
         * Naming rule: a domain name consists of one or more parts separated by periods (.). Each part can be up to 63 characters in length and can contain lowercase letters, digits, and hyphens (-). The name must start and end with a lowercase letter or digit.
         */
        public Builder clusterDomain(String clusterDomain) {
            this.putBodyParameter("cluster_domain", clusterDomain);
            this.clusterDomain = clusterDomain;
            return this;
        }

        /**
         * The name of the custom node.
         * <p>
         * 
         * The node name consists of three parts: prefix + node ip address substring + suffix:
         * 
         * -The prefix and suffix can contain one or more parts separated by periods (.). Each part can contain lowercase letters, numbers, and hyphens (-). The prefix and suffix must be lowercase letters and numbers.
         * -The length of the cidr block refers to the number of digits at the end of the ip address of the truncated node. The value range is [5,12].
         * 
         * For example, if the ip address of the node is 192.168.0.55, the prefix is aliyun.com, the cidr block length is 5, and the suffix is test, the node name is aliyun.com00055test.
         */
        public Builder nodeNameMode(String nodeNameMode) {
            this.putBodyParameter("node_name_mode", nodeNameMode);
            this.nodeNameMode = nodeNameMode;
            return this;
        }

        /**
         * The custom certificate SAN. Separate multiple IP addresses or domain names with commas (,).
         */
        public Builder customSan(String customSan) {
            this.putBodyParameter("custom_san", customSan);
            this.customSan = customSan;
            return this;
        }

        /**
         * The KMS key ID, which is used to encrypt data disks. For more information, see [key management service](~~ 28935 ~~).
         * <p>
         * 
         * > this feature takes effect only in professional managed clusters (ACK Pro clusters).
         * 
         * 
         */
        public Builder encryptionProviderKey(String encryptionProviderKey) {
            this.putBodyParameter("encryption_provider_key", encryptionProviderKey);
            this.encryptionProviderKey = encryptionProviderKey;
            return this;
        }

        /**
         * ServiceAccount is the access credential for the communication between the Pod and the cluster "apiserver. "Service-account-issuer "is the issuer in "serviceaccount token", which is the "iss" field in "token payload.
         * <p>
         * 
         * For more information about "ServiceAccount", see [deploy service account token volume projection](~~ 160384 ~~).
         */
        public Builder serviceAccountIssuer(String serviceAccountIssuer) {
            this.putBodyParameter("service_account_issuer", serviceAccountIssuer);
            this.serviceAccountIssuer = serviceAccountIssuer;
            return this;
        }

        /**
         * ServiceAccount is the access credential for the Pod to communicate with the cluster "apiserver", and "api-audiences "is the valid request "token" identity, which is used for the "apiserver" server to authenticate whether the request "token" is valid. You can configure multiple "audienc" E. Separate them with commas (,).
         * <p>
         * 
         * For more information about "ServiceAccount", see [deploy service account token volume projection](~~ 160384 ~~).
         */
        public Builder apiAudiences(String apiAudiences) {
            this.putBodyParameter("api_audiences", apiAudiences);
            this.apiAudiences = apiAudiences;
            return this;
        }

        /**
         * The custom image of the node. The system image is used by default. If you select custom image, the default system image is replaced. For more information, see [custom image](~~ 146647 ~~).
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("image_id", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * RDS instance List. Select the RDS instance that you want to add to the whitelist. We recommend that you add the Pod CIDR block and Node CIDR block to the RDS instance. If you set the RDS instance, it cannot pop up because the instance is not running.
         */
        public Builder rdsInstances(java.util.List < String > rdsInstances) {
            this.putBodyParameter("rds_instances", rdsInstances);
            this.rdsInstances = rdsInstances;
            return this;
        }

        /**
         * The tag of the node. Tag definition rules:
         * <p>
         * 
         * -A tag consists of case-sensitive key-value pairs. You can set up to 20 tags.
         * -The tag key cannot be repeated. It can be up to 64 characters in length. The tag value can be empty and can be up to 128 characters in length. The tag key and tag value cannot start with aliyun, acs:, https://, or http. For more information, see [Labels and Selectors](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set).
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The list of cluster components. You can use "addons" to specify the cluster components to be installed when creating a cluster.
         * <p>
         * 
         * **Network component**: Required. The network type must be Flannel or Terway. Select either of the following types when creating a cluster:
         * 
         * -Flannel network:[{"name":"flannel","config":""}].
         * -Terway network:[{"name": "terway-eniip","config": ""}].
         * 
         * **Storage component**: Required. Valid values: CSI" and "flexvolume:
         * 
         * -"csi":[{"name": "csi-plugin","config": ""...,{"name": "csi-provisioner","config": ""}].
         * -"flexvolume":[{"name": "flexvolume","config": ""}].
         * 
         * **Log component**: Optional. We recommend that you enable this feature. If you do not enable log service, you cannot use the cluster audit feature.
         * 
         * -Use the existing "SLS Project":[{"name": "logtail-ds","config": "{" IngressDashboardEnabled ": "true "," sls_project_name ":" your_sls_project_name "}"}"].
         * -Create a new "SLS Project":[{"name": "logtail-ds","config": "{" IngressDashboardEnabled ": "true "}"}"].
         * 
         * **Ingress component**: Optional. By default, the Ingress component "nginx-ingress-controller "is installed in the ACK dedicated cluster".
         * 
         * -Install the Ingress and enable the internet:[{"name":"nginx-ingress-controller","config":"{" IngressSlbNetworkType ":" internet "}"}"].
         * -Disable default installation of Ingress:[{"name": "nginx-ingress-controller","config": "","disabled": true}].
         * 
         * **Event Center**: Optional. This parameter is enabled by default.
         * 
         * The event center can store, query, and alert Kubernetes events. Kubernetes Logstore associated with the event center are free of charge for 90 days. For more information about free policies, see [create and use Kubernetes Event Center](https://help.aliyun.com/document_detail/150476.html#task-2389213).
         * 
         * Example of enabling Event Center:[{"name":"ack-node-problem-detector","config":"{" sls_project_name ":" your_sls_project_name "}"}"].
         */
        public Builder addons(java.util.List < Addon > addons) {
            this.putBodyParameter("addons", addons);
            this.addons = addons;
            return this;
        }

        /**
         * The taint information of the node. Taints and tolerance (Toleration) work together to prevent pods from being assigned to inappropriate nodes. For more information, see [taint-and-toleration](https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/).
         */
        public Builder taints(java.util.List < Taint > taints) {
            this.putBodyParameter("taints", taints);
            this.taints = taints;
            return this;
        }

        /**
         * Whether the cloudmonitor plug-in is installed on the cluster. Valid values:
         * <p>
         * 
         * -"true": install the cloudmonitor plug-in.
         * -"false": the cloudmonitor plug-in is not installed.
         * 
         * Default value: "false ".
         * 
         * 
         */
        public Builder cloudMonitorFlags(Boolean cloudMonitorFlags) {
            this.putBodyParameter("cloud_monitor_flags", cloudMonitorFlags);
            this.cloudMonitorFlags = cloudMonitorFlags;
            return this;
        }

        /**
         * The operating system release. Valid values:
         * <p>
         * 
         * -CentOS
         * -AliyunLinux
         * -QbootAliyunLinux
         * -Qboot
         * -Windows
         * -WindowsCore
         * 
         * Default value: "CentOS ".
         */
        public Builder platform(String platform) {
            this.putBodyParameter("platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * The operating system platform type. Valid values:
         * <p>
         * -Windows
         * -Linux
         * 
         * Default value: "Linux ".
         */
        public Builder osType(String osType) {
            this.putBodyParameter("os_type", osType);
            this.osType = osType;
            return this;
        }

        /**
         * Classified protection reinforcement. For more information, see [ACK protection and reinforcement instructions](~~ 196148 ~~).
         * <p>
         * 
         * Valid values:
         * -"true": enable classified protection.
         * -"false": does not enable classified protection.
         * 
         * Default value: "false ".
         */
        public Builder socEnabled(Boolean socEnabled) {
            this.putBodyParameter("soc_enabled", socEnabled);
            this.socEnabled = socEnabled;
            return this;
        }

        /**
         * CIS security reinforcement. For more information, see [ACK CIS reinforcement instructions](~~ 223744 ~~).
         * <p>
         * 
         * Valid values:
         * 
         * -"true": enables CIS security hardening.
         * -"false": does not enable CIS security hardening.
         * 
         * Default value: "false ".
         */
        public Builder cisEnabled(Boolean cisEnabled) {
            this.putBodyParameter("cis_enabled", cisEnabled);
            this.cisEnabled = cisEnabled;
            return this;
        }

        /**
         * The CPU management policy of the node. When the cluster version is 1.12.6 or later, the following two policies are supported:
         * <p>
         * 
         * -"static": allows you to enhance CPU affinity and exclusiveness for pods with certain resource characteristics on nodes.
         * -"none": indicates that the existing default CPU affinity solution is enabled.
         * 
         * Default value: "none ".
         */
        public Builder cpuPolicy(String cpuPolicy) {
            this.putBodyParameter("cpu_policy", cpuPolicy);
            this.cpuPolicy = cpuPolicy;
            return this;
        }

        /**
         * kube-proxy mode
         * <p>
         * 
         * -"iptables": a mature and stable kube-proxy mode. Kubernetes Service Service discovery and server load balancer are configured using iptables rules, but the performance is average and is greatly affected by the scale. This mode is suitable for clusters with a small number of Service.
         * -"ipvs": the high-performance kube-proxy mode. Kubernetes Service Service discovery and server load balancer are configured using the Linux IPVS module. It is suitable for scenarios where clusters have a large number of Service and require high performance for server load balancer.
         * 
         * Default value: "ipvs ".
         */
        public Builder proxyMode(String proxyMode) {
            this.putBodyParameter("proxy_mode", proxyMode);
            this.proxyMode = proxyMode;
            return this;
        }

        /**
         * The service port of the node. Valid values:[30000,65535].
         * <p>
         * 
         * Default value: 30000-32767 ".
         */
        public Builder nodePortRange(String nodePortRange) {
            this.putBodyParameter("node_port_range", nodePortRange);
            this.nodePortRange = nodePortRange;
            return this;
        }

        /**
         * The name of the key pair, which must be either login_password or login_password.
         */
        public Builder keyPair(String keyPair) {
            this.putBodyParameter("key_pair", keyPair);
            this.keyPair = keyPair;
            return this;
        }

        /**
         * The SSH logon password. Select either the SSH logon password or the key_pair password. The password must be 8 to 30 characters in length and contain at least three characters (uppercase and lowercase letters, numbers, and special characters).
         */
        public Builder loginPassword(String loginPassword) {
            this.putBodyParameter("login_password", loginPassword);
            this.loginPassword = loginPassword;
            return this;
        }

        /**
         * The number of Master nodes. Valid values: 3 and 5 ".
         * <p>
         * 
         * Default value: "3".
         */
        public Builder masterCount(Long masterCount) {
            this.putBodyParameter("master_count", masterCount);
            this.masterCount = masterCount;
            return this;
        }

        /**
         * The list of Master node vswitches. Valid values: 1 to 3. To ensure high availability of the cluster, we recommend that you select three vswitches that are distributed in different zones.
         * <p>
         * 
         * The number of specified instance types must be consistent with the number of "master_count" and correspond to the elements in "master_vswitch_ids.
         */
        public Builder masterVswitchIds(java.util.List < String > masterVswitchIds) {
            this.putBodyParameter("master_vswitch_ids", masterVswitchIds);
            this.masterVswitchIds = masterVswitchIds;
            return this;
        }

        /**
         * The type of the Master node instance. For more information, see [instance type family](~~ 25378 ~~).
         */
        public Builder masterInstanceTypes(java.util.List < String > masterInstanceTypes) {
            this.putBodyParameter("master_instance_types", masterInstanceTypes);
            this.masterInstanceTypes = masterInstanceTypes;
            return this;
        }

        /**
         * The system disk type of the Master node. Valid values:
         * <p>
         * 
         * -"Cloud_efficiency ": Ultra disk.
         * -"Cloud_ssd ":SSD cloud disk.
         * -"Cloud_essd": ESSD.
         * 
         * Default value: cloud_ssd ". The default value may vary depending on the zone.
         */
        public Builder masterSystemDiskCategory(String masterSystemDiskCategory) {
            this.putBodyParameter("master_system_disk_category", masterSystemDiskCategory);
            this.masterSystemDiskCategory = masterSystemDiskCategory;
            return this;
        }

        /**
         * The system disk type of the Master node. Valid values: 40 to 500. Unit: GiB.
         * <p>
         * 
         * Default value: "120 ".
         */
        public Builder masterSystemDiskSize(Long masterSystemDiskSize) {
            this.putBodyParameter("master_system_disk_size", masterSystemDiskSize);
            this.masterSystemDiskSize = masterSystemDiskSize;
            return this;
        }

        /**
         * The system disk performance of the Master node of the cluster. This parameter takes effect only for ESSD disks. The disk performance level depends on the disk size. For more information, see [ESSD disk](~~ 122389 ~~).
         */
        public Builder masterSystemDiskPerformanceLevel(String masterSystemDiskPerformanceLevel) {
            this.putBodyParameter("master_system_disk_performance_level", masterSystemDiskPerformanceLevel);
            this.masterSystemDiskPerformanceLevel = masterSystemDiskPerformanceLevel;
            return this;
        }

        /**
         * The ID of the automatic snapshot policy used by the system disk of the Master node.
         */
        public Builder masterSystemDiskSnapshotPolicyId(String masterSystemDiskSnapshotPolicyId) {
            this.putBodyParameter("master_system_disk_snapshot_policy_id", masterSystemDiskSnapshotPolicyId);
            this.masterSystemDiskSnapshotPolicyId = masterSystemDiskSnapshotPolicyId;
            return this;
        }

        /**
         * The billing method of the Master node. Valid values:
         * <p>
         * 
         * -"PrePaid": subscription.
         * -"PostPaid": pay-as-you-go.
         * 
         * Default value: "PostPaid ".
         */
        public Builder masterInstanceChargeType(String masterInstanceChargeType) {
            this.putBodyParameter("master_instance_charge_type", masterInstanceChargeType);
            this.masterInstanceChargeType = masterInstanceChargeType;
            return this;
        }

        /**
         * The billing cycle of the Master node. You must specify the billing cycle when the billing type is "PrePaid.
         * <p>
         * 
         * Set the value to "month"". Currently, only months are supported.
         */
        public Builder masterPeriodUnit(String masterPeriodUnit) {
            this.putBodyParameter("master_period_unit", masterPeriodUnit);
            this.masterPeriodUnit = masterPeriodUnit;
            return this;
        }

        /**
         * The subscription duration of the Master node. This parameter is required only when the value of "master_instance_charge_type" is "PrePaid.
         * <p>
         * 
         * Valid values:{1, 2, 3, 6, 12, 24, 36, 48, 60}.
         * 
         * Default value: 1.
         * 
         * 
         */
        public Builder masterPeriod(Long masterPeriod) {
            this.putBodyParameter("master_period", masterPeriod);
            this.masterPeriod = masterPeriod;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for the Master node. This parameter takes effect only when the value of "master_instance_charge_type" is "PrePaid". Valid values:
         * <p>
         * 
         * -"true": auto renewal.
         * -"false": does not automatically renew the instance.
         * 
         * Default value: "true ".
         */
        public Builder masterAutoRenew(Boolean masterAutoRenew) {
            this.putBodyParameter("master_auto_renew", masterAutoRenew);
            this.masterAutoRenew = masterAutoRenew;
            return this;
        }

        /**
         * The auto-renewal period of the Master node. This parameter takes effect only when you select subscription. This parameter is required.
         * <p>
         * 
         * Valid values:{1, 2, 3, 6, 12}.
         * 
         * Default value: 1.
         */
        public Builder masterAutoRenewPeriod(Long masterAutoRenewPeriod) {
            this.putBodyParameter("master_auto_renew_period", masterAutoRenewPeriod);
            this.masterAutoRenewPeriod = masterAutoRenewPeriod;
            return this;
        }

        /**
         * The number of Worker nodes. Valid values: 0 to 100.
         */
        public Builder numOfNodes(Long numOfNodes) {
            this.putBodyParameter("num_of_nodes", numOfNodes);
            this.numOfNodes = numOfNodes;
            return this;
        }

        /**
         * The vSwitch where the cluster node is located. This parameter is required when you create a managed cluster with zero nodes.
         */
        public Builder vswitchIds(java.util.List < String > vswitchIds) {
            this.putBodyParameter("vswitch_ids", vswitchIds);
            this.vswitchIds = vswitchIds;
            return this;
        }

        /**
         * The list of vswitches used by cluster nodes. Each node corresponds to a value.
         * <p>
         * 
         * When creating a zero-node managed cluster, the field "worker_vswitch_ids "is not required, but "vswitch_ids" is required ".
         */
        public Builder workerVswitchIds(java.util.List < String > workerVswitchIds) {
            this.putBodyParameter("worker_vswitch_ids", workerVswitchIds);
            this.workerVswitchIds = workerVswitchIds;
            return this;
        }

        /**
         * Configure the Worker node instance.
         */
        public Builder workerInstanceTypes(java.util.List < String > workerInstanceTypes) {
            this.putBodyParameter("worker_instance_types", workerInstanceTypes);
            this.workerInstanceTypes = workerInstanceTypes;
            return this;
        }

        /**
         * The system disk type of the Worker node. For more information, see [block storage overview](~~ 63136 ~~).
         * <p>
         * 
         * Valid values:
         * 
         * -"Cloud_efficiency ": ultra disk.
         * -"Cloud_ssd ":SSD cloud disk.
         * 
         * 
         * Default value: cloud_ssd ".
         */
        public Builder workerSystemDiskCategory(String workerSystemDiskCategory) {
            this.putBodyParameter("worker_system_disk_category", workerSystemDiskCategory);
            this.workerSystemDiskCategory = workerSystemDiskCategory;
            return this;
        }

        /**
         * The system disk size of the Worker node. Unit: GiB.
         * <p>
         * 
         * Valid values: [40,500].
         * 
         * The value of this parameter must be greater than or equal to max{40, ImageSize}.
         * 
         * Default value: "120 ".
         */
        public Builder workerSystemDiskSize(Long workerSystemDiskSize) {
            this.putBodyParameter("worker_system_disk_size", workerSystemDiskSize);
            this.workerSystemDiskSize = workerSystemDiskSize;
            return this;
        }

        /**
         * The ID of the automatic snapshot policy used by the system disk of the Worker node.
         */
        public Builder workerSystemDiskSnapshotPolicyId(String workerSystemDiskSnapshotPolicyId) {
            this.putBodyParameter("worker_system_disk_snapshot_policy_id", workerSystemDiskSnapshotPolicyId);
            this.workerSystemDiskSnapshotPolicyId = workerSystemDiskSnapshotPolicyId;
            return this;
        }

        /**
         * If the system disk is an enhanced ssd, you can set the Performance Level PL(Performance Level) of the enhanced ssd. For more information, see [ESSD](~~ 122389 ~~).
         * <p>
         * 
         * Valid values:
         * 
         * -PL0
         * -PL1
         * -PL2
         * -PL3
         */
        public Builder workerSystemDiskPerformanceLevel(String workerSystemDiskPerformanceLevel) {
            this.putBodyParameter("worker_system_disk_performance_level", workerSystemDiskPerformanceLevel);
            this.workerSystemDiskPerformanceLevel = workerSystemDiskPerformanceLevel;
            return this;
        }

        /**
         * The combination of the data disk type and size of the Worker node.
         */
        public Builder workerDataDisks(java.util.List < WorkerDataDisks> workerDataDisks) {
            this.putBodyParameter("worker_data_disks", workerDataDisks);
            this.workerDataDisks = workerDataDisks;
            return this;
        }

        /**
         * The billing method of the Worker node. Valid values:
         * <p>
         * 
         * -"PrePaid": subscription.
         * -"PostPaid": pay-as-you-go.
         * 
         * Default value: pay-as-you-go.
         */
        public Builder workerInstanceChargeType(String workerInstanceChargeType) {
            this.putBodyParameter("worker_instance_charge_type", workerInstanceChargeType);
            this.workerInstanceChargeType = workerInstanceChargeType;
            return this;
        }

        /**
         * The billing cycle of the Wroker node. You must specify the billing cycle when the billing type is "PrePaid.
         * <p>
         * 
         * Set the value to "month"". Currently, only months are supported.
         */
        public Builder workerPeriodUnit(String workerPeriodUnit) {
            this.putBodyParameter("worker_period_unit", workerPeriodUnit);
            this.workerPeriodUnit = workerPeriodUnit;
            return this;
        }

        /**
         * The subscription duration of a Worker node. This parameter is required only when "worker_instance_charge_type" is set to "PrePaid.
         * <p>
         * 
         * Valid values:{1, 2, 3, 6, 12, 24, 36, 48, 60}.
         * 
         * Default value: 1.
         */
        public Builder workerPeriod(Long workerPeriod) {
            this.putBodyParameter("worker_period", workerPeriod);
            this.workerPeriod = workerPeriod;
            return this;
        }

        /**
         * Specifies whether to enable automatic renewal for Worker nodes. This parameter takes effect only when "worker_instance_charge_type" is set to "PrePaid". Valid values:
         * <p>
         * 
         * -"true": auto renewal.
         * -"false": does not automatically renew the instance.
         * 
         * Default value: "true ".
         */
        public Builder workerAutoRenew(Boolean workerAutoRenew) {
            this.putBodyParameter("worker_auto_renew", workerAutoRenew);
            this.workerAutoRenew = workerAutoRenew;
            return this;
        }

        /**
         * The auto-renewal period of the Worker node. This parameter takes effect only when the subscription billing method is selected. This parameter is required.
         * <p>
         * 
         * Valid values:{1, 2, 3, 6, 12}.
         */
        public Builder workerAutoRenewPeriod(Long workerAutoRenewPeriod) {
            this.putBodyParameter("worker_auto_renew_period", workerAutoRenewPeriod);
            this.workerAutoRenewPeriod = workerAutoRenewPeriod;
            return this;
        }

        /**
         * When creating a cluster from an existing node, you must specify the ECS instance list, which is added to the cluster as a Worker node.
         * <p>
         * 
         * > This field is required when you create a cluster from an existing instance.
         */
        public Builder instances(java.util.List < String > instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * Specifies whether to attach data disks to an existing instance when creating a cluster. Valid values:
         * <p>
         * 
         * -"true": store containers and images on a data disk. The original data in the data disk is lost.
         * 
         * -"false": Do not store containers and images on data disks.
         * 
         * Default value: "false ".
         * 
         * Data disk Mount rules:
         * 
         * -If a data disk is attached to an ECS instance and the file system of the last data disk is not initialized, the system automatically formats the data disk as ext4 to store/var/lib/docker,/var/lib/kubelet.
         * -If no data disk is attached to the ECS instance, no new data disk is attached.
         */
        public Builder formatDisk(Boolean formatDisk) {
            this.putBodyParameter("format_disk", formatDisk);
            this.formatDisk = formatDisk;
            return this;
        }

        /**
         * Specifies whether to retain the instance name when creating a cluster from an existing instance.
         * <p>
         * 
         * -"true": reserved.
         * -"false": it is not reserved and will be replaced by system rules.
         * 
         * Default value: "true ".
         */
        public Builder keepInstanceName(Boolean keepInstanceName) {
            this.putBodyParameter("keep_instance_name", keepInstanceName);
            this.keepInstanceName = keepInstanceName;
            return this;
        }

        /**
         * The service discovery type in the cluster. It is used to specify the service discovery method in the "ASK" cluster.
         * <p>
         * 
         * -"CoreDNS": to use Kubernetes native standard service to discover component CoreDNS, you need to deploy a set of containers in the cluster for DNS resolution. By default, two 0.25-Core 512 MiB ECI instances are used.
         * -"PrivateZone": to use Alibaba Cloud PrivateZone products to provide service discovery capabilities, you must enable PrivateZone service.
         * 
         * Default value: disabled.
         */
        public Builder serviceDiscoveryTypes(java.util.List < String > serviceDiscoveryTypes) {
            this.putBodyParameter("service_discovery_types", serviceDiscoveryTypes);
            this.serviceDiscoveryTypes = serviceDiscoveryTypes;
            return this;
        }

        /**
         * Specifies whether to create a NAT gateway and configure SNAT rules in the VPC when creating the ASK cluster. Valid values:
         * <p>
         * 
         * -"true": creates a NAT gateway and automatically configures SNAT rules. The cluster VPC can access the internet.
         * -"false": does not create NAT gateways or SNAT rules for you. The cluster VPC does not have the internet access capability.
         * 
         * Default value: "false ".
         */
        public Builder natGateway(Boolean natGateway) {
            this.putBodyParameter("nat_gateway", natGateway);
            this.natGateway = natGateway;
            return this;
        }

        /**
         * The ID of the zone to which the cluster belongs. This parameter is specific to the ASK cluster.
         * <p>
         * 
         * When you create a ASK cluster, if "vpc_id" and "vswitch_ids" are not specified, you must specify "zone_id" for the cluster to automatically create VPC network resources in this zone.
         * 
         * 
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("zone_id", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The id of the edge cluster. This parameter is required and must be set to edge ".
         * <p>
         * 
         * -"Default": non-edge cluster.
         * 
         * -"Edge": edge cluster.
         */
        public Builder profile(String profile) {
            this.putBodyParameter("profile", profile);
            this.profile = profile;
            return this;
        }

        /**
         * When Log service is enabled for a cluster, it takes effect only for the ASK cluster. The value must be "SLS ".
         */
        public Builder loggingType(String loggingType) {
            this.putBodyParameter("logging_type", loggingType);
            this.loggingType = loggingType;
            return this;
        }

        /**
         * Specifies the number of days that logs are stored for a flat widget.
         */
        public Builder controlplaneLogTtl(String controlplaneLogTtl) {
            this.putBodyParameter("controlplane_log_ttl", controlplaneLogTtl);
            this.controlplaneLogTtl = controlplaneLogTtl;
            return this;
        }

        /**
         * Project control plane component log service, you can use existing Project for log storage, or use the system to automatically create Project user log storage. If you select automatically create log service Project, a log service k8s-log named "ClusterID-{Project} "is automatically created.
         */
        public Builder controlplaneLogProject(String controlplaneLogProject) {
            this.putBodyParameter("controlplane_log_project", controlplaneLogProject);
            this.controlplaneLogProject = controlplaneLogProject;
            return this;
        }

        /**
         * The list of component names that specify the component logs of the control plane to be collected.
         * <p>
         * 
         * By default, logs of apiserver, kcm, and scheduler components are collected.
         */
        public Builder controlplaneLogComponents(java.util.List < String > controlplaneLogComponents) {
            this.putBodyParameter("controlplane_log_components", controlplaneLogComponents);
            this.controlplaneLogComponents = controlplaneLogComponents;
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
         * Indicates whether to roll back the cluster creation failure. Valid values:
         * <p>
         * 
         * -"true": rolls back when the cluster fails to be created.
         * -"false": when the cluster fails to be created, the rollback operation is not performed.
         * 
         * 
         * Default value: "true ".
         */
        public Builder disableRollback(Boolean disableRollback) {
            this.putBodyParameter("disable_rollback", disableRollback);
            this.disableRollback = disableRollback;
            return this;
        }

        /**
         * The timeout period for creating a cluster. Unit: minutes.
         * <p>
         * 
         * Default value: "60".
         */
        public Builder timeoutMins(Long timeoutMins) {
            this.putBodyParameter("timeout_mins", timeoutMins);
            this.timeoutMins = timeoutMins;
            return this;
        }

        /**
         * The operating system release type. We recommend that you use this field to specify the operating system of the node. Valid values:
         * <p>
         * 
         * -CentOS
         * -AliyunLinux
         * -AliyunLinux Qboot
         * -AliyunLinuxUEFI
         * -AliyunLinux3
         * -Windows
         * -WindowsCore
         * -AliyunLinux3Arm64
         * -ContainerOS
         * 
         * Default value: "CentOS ".
         */
        public Builder imageType(String imageType) {
            this.putBodyParameter("image_type", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * The specification of the SLB instance. Valid values:
         * <p>
         * -slb.s1.small
         * -slb.s2.small
         * -slb.s2.medium
         * -slb.s3.small
         * -slb.s3.medium
         * -slb.s3.large
         * 
         * Default value: "slb.s2.small ".
         */
        public Builder loadBalancerSpec(String loadBalancerSpec) {
            this.putBodyParameter("load_balancer_spec", loadBalancerSpec);
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }

        /**
         * Specifies whether to enable RRSA.
         */
        public Builder enableRrsa(Boolean enableRrsa) {
            this.putBodyParameter("enable_rrsa", enableRrsa);
            this.enableRrsa = enableRrsa;
            return this;
        }

        /**
         * The ID of the resource group to which the cluster belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resource_group_id", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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

        @NameInMap("size")
        @Validation(required = true)
        private String size;

        @NameInMap("performance_level")
        private String performanceLevel;

        private WorkerDataDisks(Builder builder) {
            this.category = builder.category;
            this.encrypted = builder.encrypted;
            this.size = builder.size;
            this.performanceLevel = builder.performanceLevel;
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
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public static final class Builder {
            private String category; 
            private String encrypted; 
            private String size; 
            private String performanceLevel; 

            /**
             * The data disk type.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Whether the data disk of the cluster Worker node is encrypted
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * The size of the data disk. Valid values: 40 to 32767.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * The performance level of the data disk of the Worker node in the cluster. This parameter takes effect only for ESSD disks.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            public WorkerDataDisks build() {
                return new WorkerDataDisks(this);
            } 

        } 

    }
}
