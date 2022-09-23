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
    @Validation(required = true)
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
    @Validation(required = true)
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
    @Validation(required = true)
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
    @Validation(required = true)
    private java.util.List < String > masterInstanceTypes;

    @Body
    @NameInMap("master_period")
    private Long masterPeriod;

    @Body
    @NameInMap("master_period_unit")
    private String masterPeriodUnit;

    @Body
    @NameInMap("master_system_disk_category")
    @Validation(required = true)
    private String masterSystemDiskCategory;

    @Body
    @NameInMap("master_system_disk_performance_level")
    private String masterSystemDiskPerformanceLevel;

    @Body
    @NameInMap("master_system_disk_size")
    @Validation(required = true)
    private Long masterSystemDiskSize;

    @Body
    @NameInMap("master_system_disk_snapshot_policy_id")
    private String masterSystemDiskSnapshotPolicyId;

    @Body
    @NameInMap("master_vswitch_ids")
    @Validation(required = true)
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
    @NameInMap("num_of_nodes")
    @Validation(required = true)
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
    private Boolean workerAutoRenew;

    @Body
    @NameInMap("worker_auto_renew_period")
    private Long workerAutoRenewPeriod;

    @Body
    @NameInMap("worker_data_disks")
    private java.util.List < WorkerDataDisks> workerDataDisks;

    @Body
    @NameInMap("worker_instance_charge_type")
    private String workerInstanceChargeType;

    @Body
    @NameInMap("worker_instance_types")
    @Validation(required = true)
    private java.util.List < String > workerInstanceTypes;

    @Body
    @NameInMap("worker_period")
    private Long workerPeriod;

    @Body
    @NameInMap("worker_period_unit")
    private String workerPeriodUnit;

    @Body
    @NameInMap("worker_system_disk_category")
    @Validation(required = true)
    private String workerSystemDiskCategory;

    @Body
    @NameInMap("worker_system_disk_performance_level")
    private String workerSystemDiskPerformanceLevel;

    @Body
    @NameInMap("worker_system_disk_size")
    @Validation(required = true)
    private Long workerSystemDiskSize;

    @Body
    @NameInMap("worker_system_disk_snapshot_policy_id")
    private String workerSystemDiskSnapshotPolicyId;

    @Body
    @NameInMap("worker_vswitch_ids")
    @Validation(required = true)
    private java.util.List < String > workerVswitchIds;

    @Body
    @NameInMap("zone_id")
    private String zoneId;

    private CreateClusterRequest(Builder builder) {
        super(builder);
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
         * 集群组件配置
         */
        public Builder addons(java.util.List < Addon > addons) {
            this.putBodyParameter("addons", addons);
            this.addons = addons;
            return this;
        }

        /**
         * 合法的请求token身份，用于apiserver服务端认证请求token是否合法。
         */
        public Builder apiAudiences(String apiAudiences) {
            this.putBodyParameter("api_audiences", apiAudiences);
            this.apiAudiences = apiAudiences;
            return this;
        }

        /**
         * 付费类型。
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("charge_type", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * CIS安全加固
         */
        public Builder cisEnabled(Boolean cisEnabled) {
            this.putBodyParameter("cis_enabled", cisEnabled);
            this.cisEnabled = cisEnabled;
            return this;
        }

        /**
         * 为ECS安装云监控
         */
        public Builder cloudMonitorFlags(Boolean cloudMonitorFlags) {
            this.putBodyParameter("cloud_monitor_flags", cloudMonitorFlags);
            this.cloudMonitorFlags = cloudMonitorFlags;
            return this;
        }

        /**
         * 集群本地域名
         */
        public Builder clusterDomain(String clusterDomain) {
            this.putBodyParameter("cluster_domain", clusterDomain);
            this.clusterDomain = clusterDomain;
            return this;
        }

        /**
         * 托管版集群类型
         */
        public Builder clusterSpec(String clusterSpec) {
            this.putBodyParameter("cluster_spec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * 集群类型
         */
        public Builder clusterType(String clusterType) {
            this.putBodyParameter("cluster_type", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * POD网络网段
         */
        public Builder containerCidr(String containerCidr) {
            this.putBodyParameter("container_cidr", containerCidr);
            this.containerCidr = containerCidr;
            return this;
        }

        /**
         * 需要采集日志的组件
         */
        public Builder controlplaneLogComponents(java.util.List < String > controlplaneLogComponents) {
            this.putBodyParameter("controlplane_log_components", controlplaneLogComponents);
            this.controlplaneLogComponents = controlplaneLogComponents;
            return this;
        }

        /**
         * 使用已有log project时，需要指定log project
         */
        public Builder controlplaneLogProject(String controlplaneLogProject) {
            this.putBodyParameter("controlplane_log_project", controlplaneLogProject);
            this.controlplaneLogProject = controlplaneLogProject;
            return this;
        }

        /**
         * 控制平面日志
         */
        public Builder controlplaneLogTtl(String controlplaneLogTtl) {
            this.putBodyParameter("controlplane_log_ttl", controlplaneLogTtl);
            this.controlplaneLogTtl = controlplaneLogTtl;
            return this;
        }

        /**
         * CPU策略
         */
        public Builder cpuPolicy(String cpuPolicy) {
            this.putBodyParameter("cpu_policy", cpuPolicy);
            this.cpuPolicy = cpuPolicy;
            return this;
        }

        /**
         * 自定义证书SAN
         */
        public Builder customSan(String customSan) {
            this.putBodyParameter("custom_san", customSan);
            this.customSan = customSan;
            return this;
        }

        /**
         * 集群删除保护
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putBodyParameter("deletion_protection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * 失败回滚
         */
        public Builder disableRollback(Boolean disableRollback) {
            this.putBodyParameter("disable_rollback", disableRollback);
            this.disableRollback = disableRollback;
            return this;
        }

        /**
         * 启用 RRSA 功能
         */
        public Builder enableRrsa(Boolean enableRrsa) {
            this.putBodyParameter("enable_rrsa", enableRrsa);
            this.enableRrsa = enableRrsa;
            return this;
        }

        /**
         * Secret落盘加密
         */
        public Builder encryptionProviderKey(String encryptionProviderKey) {
            this.putBodyParameter("encryption_provider_key", encryptionProviderKey);
            this.encryptionProviderKey = encryptionProviderKey;
            return this;
        }

        /**
         * 使用EIP暴露apiServer
         */
        public Builder endpointPublicAccess(Boolean endpointPublicAccess) {
            this.putBodyParameter("endpoint_public_access", endpointPublicAccess);
            this.endpointPublicAccess = endpointPublicAccess;
            return this;
        }

        /**
         * 使用已有节点创建集群时，是否格式化已有实例的磁盘
         */
        public Builder formatDisk(Boolean formatDisk) {
            this.putBodyParameter("format_disk", formatDisk);
            this.formatDisk = formatDisk;
            return this;
        }

        /**
         * 自定义镜像
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("image_id", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * 操作系统镜像类型
         */
        public Builder imageType(String imageType) {
            this.putBodyParameter("image_type", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * 使用已有节点创建集群时，已有实例列表
         */
        public Builder instances(java.util.List < String > instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * 集群IP Stack
         */
        public Builder ipStack(String ipStack) {
            this.putBodyParameter("ip_stack", ipStack);
            this.ipStack = ipStack;
            return this;
        }

        /**
         * 自动创建企业安全组
         */
        public Builder isEnterpriseSecurityGroup(Boolean isEnterpriseSecurityGroup) {
            this.putBodyParameter("is_enterprise_security_group", isEnterpriseSecurityGroup);
            this.isEnterpriseSecurityGroup = isEnterpriseSecurityGroup;
            return this;
        }

        /**
         * 使用已有节点创建集群时，是否保留实例名称。
         */
        public Builder keepInstanceName(Boolean keepInstanceName) {
            this.putBodyParameter("keep_instance_name", keepInstanceName);
            this.keepInstanceName = keepInstanceName;
            return this;
        }

        /**
         * 密钥对名称，和login_password二选一。
         */
        public Builder keyPair(String keyPair) {
            this.putBodyParameter("key_pair", keyPair);
            this.keyPair = keyPair;
            return this;
        }

        /**
         * 集群版本
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.putBodyParameter("kubernetes_version", kubernetesVersion);
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * 负载均衡规格
         */
        public Builder loadBalancerSpec(String loadBalancerSpec) {
            this.putBodyParameter("load_balancer_spec", loadBalancerSpec);
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }

        /**
         * ASK 集群开启日志服务
         */
        public Builder loggingType(String loggingType) {
            this.putBodyParameter("logging_type", loggingType);
            this.loggingType = loggingType;
            return this;
        }

        /**
         * SSH登录密码。密码规则为8~30 个字符，且至少同时包含三项（大小写字母、数字和特殊符号），和key_pair二选一。
         */
        public Builder loginPassword(String loginPassword) {
            this.putBodyParameter("login_password", loginPassword);
            this.loginPassword = loginPassword;
            return this;
        }

        /**
         * 集群Master节点是否自动续费
         */
        public Builder masterAutoRenew(Boolean masterAutoRenew) {
            this.putBodyParameter("master_auto_renew", masterAutoRenew);
            this.masterAutoRenew = masterAutoRenew;
            return this;
        }

        /**
         * 集群Master节点自动续费时长
         */
        public Builder masterAutoRenewPeriod(Long masterAutoRenewPeriod) {
            this.putBodyParameter("master_auto_renew_period", masterAutoRenewPeriod);
            this.masterAutoRenewPeriod = masterAutoRenewPeriod;
            return this;
        }

        /**
         * 集群Master节点数量
         */
        public Builder masterCount(Long masterCount) {
            this.putBodyParameter("master_count", masterCount);
            this.masterCount = masterCount;
            return this;
        }

        /**
         * 集群Master节点付费类型
         */
        public Builder masterInstanceChargeType(String masterInstanceChargeType) {
            this.putBodyParameter("master_instance_charge_type", masterInstanceChargeType);
            this.masterInstanceChargeType = masterInstanceChargeType;
            return this;
        }

        /**
         * 集群Master节点类型
         */
        public Builder masterInstanceTypes(java.util.List < String > masterInstanceTypes) {
            this.putBodyParameter("master_instance_types", masterInstanceTypes);
            this.masterInstanceTypes = masterInstanceTypes;
            return this;
        }

        /**
         * 集群Master节点包年包月时长
         */
        public Builder masterPeriod(Long masterPeriod) {
            this.putBodyParameter("master_period", masterPeriod);
            this.masterPeriod = masterPeriod;
            return this;
        }

        /**
         * 集群Master节点包年包月周期
         */
        public Builder masterPeriodUnit(String masterPeriodUnit) {
            this.putBodyParameter("master_period_unit", masterPeriodUnit);
            this.masterPeriodUnit = masterPeriodUnit;
            return this;
        }

        /**
         * 集群Master节点系统盘类型
         */
        public Builder masterSystemDiskCategory(String masterSystemDiskCategory) {
            this.putBodyParameter("master_system_disk_category", masterSystemDiskCategory);
            this.masterSystemDiskCategory = masterSystemDiskCategory;
            return this;
        }

        /**
         * Master节点系统盘磁盘性能，只针对ESSD磁盘生效
         */
        public Builder masterSystemDiskPerformanceLevel(String masterSystemDiskPerformanceLevel) {
            this.putBodyParameter("master_system_disk_performance_level", masterSystemDiskPerformanceLevel);
            this.masterSystemDiskPerformanceLevel = masterSystemDiskPerformanceLevel;
            return this;
        }

        /**
         * 集群Master节点系统盘大小，至少40
         */
        public Builder masterSystemDiskSize(Long masterSystemDiskSize) {
            this.putBodyParameter("master_system_disk_size", masterSystemDiskSize);
            this.masterSystemDiskSize = masterSystemDiskSize;
            return this;
        }

        /**
         * 集群Master节点自动快照备份策略
         */
        public Builder masterSystemDiskSnapshotPolicyId(String masterSystemDiskSnapshotPolicyId) {
            this.putBodyParameter("master_system_disk_snapshot_policy_id", masterSystemDiskSnapshotPolicyId);
            this.masterSystemDiskSnapshotPolicyId = masterSystemDiskSnapshotPolicyId;
            return this;
        }

        /**
         * 集群Master节点使用的虚拟交换机
         */
        public Builder masterVswitchIds(java.util.List < String > masterVswitchIds) {
            this.putBodyParameter("master_vswitch_ids", masterVswitchIds);
            this.masterVswitchIds = masterVswitchIds;
            return this;
        }

        /**
         * 集群名称。
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * 使用自动创建专有网络创建ASK集群时，是否在vpc中创建Nat网关并配置SNAT规则。
         */
        public Builder natGateway(Boolean natGateway) {
            this.putBodyParameter("nat_gateway", natGateway);
            this.natGateway = natGateway;
            return this;
        }

        /**
         * 节点IP数量
         */
        public Builder nodeCidrMask(String nodeCidrMask) {
            this.putBodyParameter("node_cidr_mask", nodeCidrMask);
            this.nodeCidrMask = nodeCidrMask;
            return this;
        }

        /**
         * 自定义节点名称
         */
        public Builder nodeNameMode(String nodeNameMode) {
            this.putBodyParameter("node_name_mode", nodeNameMode);
            this.nodeNameMode = nodeNameMode;
            return this;
        }

        /**
         * 节点服务端口范围
         */
        public Builder nodePortRange(String nodePortRange) {
            this.putBodyParameter("node_port_range", nodePortRange);
            this.nodePortRange = nodePortRange;
            return this;
        }

        /**
         * 集群Worker节点数量
         */
        public Builder numOfNodes(Long numOfNodes) {
            this.putBodyParameter("num_of_nodes", numOfNodes);
            this.numOfNodes = numOfNodes;
            return this;
        }

        /**
         * 操作系统平台类型
         */
        public Builder osType(String osType) {
            this.putBodyParameter("os_type", osType);
            this.osType = osType;
            return this;
        }

        /**
         * 包年包月时间。
         */
        public Builder period(Long period) {
            this.putBodyParameter("period", period);
            this.period = period;
            return this;
        }

        /**
         * 包年包月时间单位。
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("period_unit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * 操作系统发行版
         */
        public Builder platform(String platform) {
            this.putBodyParameter("platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * 创建Terway网络类型的集群时，需要为pod指定单独的虚拟交换机
         */
        public Builder podVswitchIds(java.util.List < String > podVswitchIds) {
            this.putBodyParameter("pod_vswitch_ids", podVswitchIds);
            this.podVswitchIds = podVswitchIds;
            return this;
        }

        /**
         * 面向场景时的集群类型。  Default：非边缘场景集群。 Edge：边缘场景集群。
         */
        public Builder profile(String profile) {
            this.putBodyParameter("profile", profile);
            this.profile = profile;
            return this;
        }

        /**
         * Proxy代理模式，ipvs|iptables
         */
        public Builder proxyMode(String proxyMode) {
            this.putBodyParameter("proxy_mode", proxyMode);
            this.proxyMode = proxyMode;
            return this;
        }

        /**
         * RDS白名单
         */
        public Builder rdsInstances(java.util.List < String > rdsInstances) {
            this.putBodyParameter("rds_instances", rdsInstances);
            this.rdsInstances = rdsInstances;
            return this;
        }

        /**
         * 地域ID
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("region_id", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 集群所属资源组ID
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resource_group_id", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * runtime.
         */
        public Builder runtime(Runtime runtime) {
            this.putBodyParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * 安全组ID，和is_enterprise_security_group二选一
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putBodyParameter("security_group_id", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * serviceaccount token中的签发身份，即token payload中的iss字段。
         */
        public Builder serviceAccountIssuer(String serviceAccountIssuer) {
            this.putBodyParameter("service_account_issuer", serviceAccountIssuer);
            this.serviceAccountIssuer = serviceAccountIssuer;
            return this;
        }

        /**
         * 服务网络网段
         */
        public Builder serviceCidr(String serviceCidr) {
            this.putBodyParameter("service_cidr", serviceCidr);
            this.serviceCidr = serviceCidr;
            return this;
        }

        /**
         * 创建ASK集群时，服务发现类型
         */
        public Builder serviceDiscoveryTypes(java.util.List < String > serviceDiscoveryTypes) {
            this.putBodyParameter("service_discovery_types", serviceDiscoveryTypes);
            this.serviceDiscoveryTypes = serviceDiscoveryTypes;
            return this;
        }

        /**
         * 若您集群内的节点、应用等需要访问公网，勾选该项后我们将为您创建 NAT 网关并自动配置 SNAT 规则
         */
        public Builder snatEntry(Boolean snatEntry) {
            this.putBodyParameter("snat_entry", snatEntry);
            this.snatEntry = snatEntry;
            return this;
        }

        /**
         * 等保安全加固
         */
        public Builder socEnabled(Boolean socEnabled) {
            this.putBodyParameter("soc_enabled", socEnabled);
            this.socEnabled = socEnabled;
            return this;
        }

        /**
         * 允许公网ssh登录
         */
        public Builder sshFlags(Boolean sshFlags) {
            this.putBodyParameter("ssh_flags", sshFlags);
            this.sshFlags = sshFlags;
            return this;
        }

        /**
         * 集群标签
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * 节点污点信息
         */
        public Builder taints(java.util.List < Taint > taints) {
            this.putBodyParameter("taints", taints);
            this.taints = taints;
            return this;
        }

        /**
         * 集群创建超时时间
         */
        public Builder timeoutMins(Long timeoutMins) {
            this.putBodyParameter("timeout_mins", timeoutMins);
            this.timeoutMins = timeoutMins;
            return this;
        }

        /**
         * 时区
         */
        public Builder timezone(String timezone) {
            this.putBodyParameter("timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        /**
         * 自定义集群CA
         */
        public Builder userCa(String userCa) {
            this.putBodyParameter("user_ca", userCa);
            this.userCa = userCa;
            return this;
        }

        /**
         * 节点自定义数据
         */
        public Builder userData(String userData) {
            this.putBodyParameter("user_data", userData);
            this.userData = userData;
            return this;
        }

        /**
         * 集群专有网络ID。
         */
        public Builder vpcid(String vpcid) {
            this.putBodyParameter("vpcid", vpcid);
            this.vpcid = vpcid;
            return this;
        }

        /**
         * 集群节点所在虚拟交换机。
         */
        public Builder vswitchIds(java.util.List < String > vswitchIds) {
            this.putBodyParameter("vswitch_ids", vswitchIds);
            this.vswitchIds = vswitchIds;
            return this;
        }

        /**
         * 集群Worker节点到期是否自动续费
         */
        public Builder workerAutoRenew(Boolean workerAutoRenew) {
            this.putBodyParameter("worker_auto_renew", workerAutoRenew);
            this.workerAutoRenew = workerAutoRenew;
            return this;
        }

        /**
         * 集群Worker节点自动续费时长
         */
        public Builder workerAutoRenewPeriod(Long workerAutoRenewPeriod) {
            this.putBodyParameter("worker_auto_renew_period", workerAutoRenewPeriod);
            this.workerAutoRenewPeriod = workerAutoRenewPeriod;
            return this;
        }

        /**
         * 集群Worker节点数据盘配置
         */
        public Builder workerDataDisks(java.util.List < WorkerDataDisks> workerDataDisks) {
            this.putBodyParameter("worker_data_disks", workerDataDisks);
            this.workerDataDisks = workerDataDisks;
            return this;
        }

        /**
         * 集群Worker节点付费类型
         */
        public Builder workerInstanceChargeType(String workerInstanceChargeType) {
            this.putBodyParameter("worker_instance_charge_type", workerInstanceChargeType);
            this.workerInstanceChargeType = workerInstanceChargeType;
            return this;
        }

        /**
         * 集群Worker节点类型
         */
        public Builder workerInstanceTypes(java.util.List < String > workerInstanceTypes) {
            this.putBodyParameter("worker_instance_types", workerInstanceTypes);
            this.workerInstanceTypes = workerInstanceTypes;
            return this;
        }

        /**
         * 集群Worker节点包年包月时长
         */
        public Builder workerPeriod(Long workerPeriod) {
            this.putBodyParameter("worker_period", workerPeriod);
            this.workerPeriod = workerPeriod;
            return this;
        }

        /**
         * 集群Worker节点包年包月周期
         */
        public Builder workerPeriodUnit(String workerPeriodUnit) {
            this.putBodyParameter("worker_period_unit", workerPeriodUnit);
            this.workerPeriodUnit = workerPeriodUnit;
            return this;
        }

        /**
         * 集群Worker节点系统盘类型
         */
        public Builder workerSystemDiskCategory(String workerSystemDiskCategory) {
            this.putBodyParameter("worker_system_disk_category", workerSystemDiskCategory);
            this.workerSystemDiskCategory = workerSystemDiskCategory;
            return this;
        }

        /**
         * 集群Worker节点磁盘性能，只对ESSD类型磁盘生效
         */
        public Builder workerSystemDiskPerformanceLevel(String workerSystemDiskPerformanceLevel) {
            this.putBodyParameter("worker_system_disk_performance_level", workerSystemDiskPerformanceLevel);
            this.workerSystemDiskPerformanceLevel = workerSystemDiskPerformanceLevel;
            return this;
        }

        /**
         * 集群Worker节点系统盘大小
         */
        public Builder workerSystemDiskSize(Long workerSystemDiskSize) {
            this.putBodyParameter("worker_system_disk_size", workerSystemDiskSize);
            this.workerSystemDiskSize = workerSystemDiskSize;
            return this;
        }

        /**
         * 集群Worker节点系统盘快照备份策略
         */
        public Builder workerSystemDiskSnapshotPolicyId(String workerSystemDiskSnapshotPolicyId) {
            this.putBodyParameter("worker_system_disk_snapshot_policy_id", workerSystemDiskSnapshotPolicyId);
            this.workerSystemDiskSnapshotPolicyId = workerSystemDiskSnapshotPolicyId;
            return this;
        }

        /**
         * 集群Worker节点所在虚拟交换机
         */
        public Builder workerVswitchIds(java.util.List < String > workerVswitchIds) {
            this.putBodyParameter("worker_vswitch_ids", workerVswitchIds);
            this.workerVswitchIds = workerVswitchIds;
            return this;
        }

        /**
         * 使用自动创建专有网络创建ASK集群时，需要指定专有网络的可用区
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
             * 集群Worker节点数据盘类型
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * 集群Worker节点数据盘是否加密
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * 集群Worker节点数据盘磁盘性能等级，仅对ESSD磁盘生效
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * 集群Worker节点数据盘大小
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
