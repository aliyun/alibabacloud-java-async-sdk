// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link CreateApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationRequest</p>
 */
public class CreateApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcrAssumeRoleArn")
    private String acrAssumeRoleArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AcrInstanceId")
    private String acrInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentVersion")
    private String agentVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppDescription")
    private String appDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppSource")
    private String appSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssociateEip")
    private Boolean associateEip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoConfig")
    private Boolean autoConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaseAppId")
    private String baseAppId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Command")
    private String command;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandArgs")
    private String commandArgs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigMapMountDesc")
    private String configMapMountDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Integer cpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomHostAlias")
    private String customHostAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomImageNetworkType")
    private String customImageNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Deploy")
    private Boolean deploy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskSize")
    private Integer diskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dotnet")
    private String dotnet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EdasContainerVersion")
    private String edasContainerVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EmptyDirDesc")
    private String emptyDirDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableCpuBurst")
    private Boolean enableCpuBurst;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableEbpf")
    private String enableEbpf;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableNamespaceAgentVersion")
    private Boolean enableNamespaceAgentVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableNamespaceSlsConfig")
    private Boolean enableNamespaceSlsConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableNewArms")
    private Boolean enableNewArms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnablePrometheus")
    private Boolean enablePrometheus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableSidecarResourceIsolated")
    private Boolean enableSidecarResourceIsolated;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Envs")
    private String envs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuConfig")
    private String gpuConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HeadlessPvtzDiscoverySvc")
    private String headlessPvtzDiscoverySvc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Html")
    private String html;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImagePullSecrets")
    private String imagePullSecrets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InitContainersConfig")
    private java.util.List<InitContainerConfig> initContainersConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsStateful")
    private Boolean isStateful;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JarStartArgs")
    private String jarStartArgs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JarStartOptions")
    private String jarStartOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Jdk")
    private String jdk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KafkaConfigs")
    private String kafkaConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.Map<String, String> labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Liveness")
    private String liveness;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LokiConfigs")
    private String lokiConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    private Integer memory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MicroRegistration")
    private String microRegistration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MicroRegistrationConfig")
    private String microRegistrationConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MicroserviceEngineConfig")
    private String microserviceEngineConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MountDesc")
    private String mountDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MountHost")
    private String mountHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NasConfigs")
    private String nasConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NasId")
    private String nasId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewSaeVersion")
    private String newSaeVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OidcRoleName")
    private String oidcRoleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssAkId")
    private String ossAkId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssAkSecret")
    private String ossAkSecret;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssMountDescs")
    private String ossMountDescs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String packageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageUrl")
    private String packageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageVersion")
    private String packageVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Php")
    private String php;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhpArmsConfigLocation")
    private String phpArmsConfigLocation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PhpConfig")
    private String phpConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhpConfigLocation")
    private String phpConfigLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostStart")
    private String postStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreStop")
    private String preStop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProgrammingLanguage")
    private String programmingLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PvtzDiscoverySvc")
    private String pvtzDiscoverySvc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Python")
    private String python;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PythonModules")
    private String pythonModules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RaspConfig")
    private RaspConfig raspConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Readiness")
    private String readiness;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Replicas")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer replicas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaeVersion")
    private String saeVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretMountDesc")
    private String secretMountDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceTags")
    private String serviceTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SidecarContainersConfig")
    private java.util.List<SidecarContainerConfig> sidecarContainersConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsConfigs")
    private String slsConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsLogEnvTags")
    private String slsLogEnvTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartupProbe")
    private String startupProbe;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminationGracePeriodSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 6000)
    private Integer terminationGracePeriodSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timezone")
    private String timezone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TomcatConfig")
    private String tomcatConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarStartOptions")
    private String warStartOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebContainer")
    private String webContainer;

    private CreateApplicationRequest(Builder builder) {
        super(builder);
        this.acrAssumeRoleArn = builder.acrAssumeRoleArn;
        this.acrInstanceId = builder.acrInstanceId;
        this.agentVersion = builder.agentVersion;
        this.appDescription = builder.appDescription;
        this.appName = builder.appName;
        this.appSource = builder.appSource;
        this.associateEip = builder.associateEip;
        this.autoConfig = builder.autoConfig;
        this.baseAppId = builder.baseAppId;
        this.command = builder.command;
        this.commandArgs = builder.commandArgs;
        this.configMapMountDesc = builder.configMapMountDesc;
        this.cpu = builder.cpu;
        this.customHostAlias = builder.customHostAlias;
        this.customImageNetworkType = builder.customImageNetworkType;
        this.deploy = builder.deploy;
        this.diskSize = builder.diskSize;
        this.dotnet = builder.dotnet;
        this.edasContainerVersion = builder.edasContainerVersion;
        this.emptyDirDesc = builder.emptyDirDesc;
        this.enableCpuBurst = builder.enableCpuBurst;
        this.enableEbpf = builder.enableEbpf;
        this.enableNamespaceAgentVersion = builder.enableNamespaceAgentVersion;
        this.enableNamespaceSlsConfig = builder.enableNamespaceSlsConfig;
        this.enableNewArms = builder.enableNewArms;
        this.enablePrometheus = builder.enablePrometheus;
        this.enableSidecarResourceIsolated = builder.enableSidecarResourceIsolated;
        this.envs = builder.envs;
        this.gpuConfig = builder.gpuConfig;
        this.headlessPvtzDiscoverySvc = builder.headlessPvtzDiscoverySvc;
        this.html = builder.html;
        this.imagePullSecrets = builder.imagePullSecrets;
        this.imageUrl = builder.imageUrl;
        this.initContainersConfig = builder.initContainersConfig;
        this.isStateful = builder.isStateful;
        this.jarStartArgs = builder.jarStartArgs;
        this.jarStartOptions = builder.jarStartOptions;
        this.jdk = builder.jdk;
        this.kafkaConfigs = builder.kafkaConfigs;
        this.labels = builder.labels;
        this.liveness = builder.liveness;
        this.lokiConfigs = builder.lokiConfigs;
        this.memory = builder.memory;
        this.microRegistration = builder.microRegistration;
        this.microRegistrationConfig = builder.microRegistrationConfig;
        this.microserviceEngineConfig = builder.microserviceEngineConfig;
        this.mountDesc = builder.mountDesc;
        this.mountHost = builder.mountHost;
        this.namespaceId = builder.namespaceId;
        this.nasConfigs = builder.nasConfigs;
        this.nasId = builder.nasId;
        this.newSaeVersion = builder.newSaeVersion;
        this.oidcRoleName = builder.oidcRoleName;
        this.ossAkId = builder.ossAkId;
        this.ossAkSecret = builder.ossAkSecret;
        this.ossMountDescs = builder.ossMountDescs;
        this.packageType = builder.packageType;
        this.packageUrl = builder.packageUrl;
        this.packageVersion = builder.packageVersion;
        this.php = builder.php;
        this.phpArmsConfigLocation = builder.phpArmsConfigLocation;
        this.phpConfig = builder.phpConfig;
        this.phpConfigLocation = builder.phpConfigLocation;
        this.postStart = builder.postStart;
        this.preStop = builder.preStop;
        this.programmingLanguage = builder.programmingLanguage;
        this.pvtzDiscoverySvc = builder.pvtzDiscoverySvc;
        this.python = builder.python;
        this.pythonModules = builder.pythonModules;
        this.raspConfig = builder.raspConfig;
        this.readiness = builder.readiness;
        this.replicas = builder.replicas;
        this.resourceType = builder.resourceType;
        this.saeVersion = builder.saeVersion;
        this.secretMountDesc = builder.secretMountDesc;
        this.securityGroupId = builder.securityGroupId;
        this.serviceTags = builder.serviceTags;
        this.sidecarContainersConfig = builder.sidecarContainersConfig;
        this.slsConfigs = builder.slsConfigs;
        this.slsLogEnvTags = builder.slsLogEnvTags;
        this.startupProbe = builder.startupProbe;
        this.terminationGracePeriodSeconds = builder.terminationGracePeriodSeconds;
        this.timezone = builder.timezone;
        this.tomcatConfig = builder.tomcatConfig;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.warStartOptions = builder.warStartOptions;
        this.webContainer = builder.webContainer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acrAssumeRoleArn
     */
    public String getAcrAssumeRoleArn() {
        return this.acrAssumeRoleArn;
    }

    /**
     * @return acrInstanceId
     */
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    /**
     * @return agentVersion
     */
    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * @return appDescription
     */
    public String getAppDescription() {
        return this.appDescription;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appSource
     */
    public String getAppSource() {
        return this.appSource;
    }

    /**
     * @return associateEip
     */
    public Boolean getAssociateEip() {
        return this.associateEip;
    }

    /**
     * @return autoConfig
     */
    public Boolean getAutoConfig() {
        return this.autoConfig;
    }

    /**
     * @return baseAppId
     */
    public String getBaseAppId() {
        return this.baseAppId;
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return commandArgs
     */
    public String getCommandArgs() {
        return this.commandArgs;
    }

    /**
     * @return configMapMountDesc
     */
    public String getConfigMapMountDesc() {
        return this.configMapMountDesc;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return customHostAlias
     */
    public String getCustomHostAlias() {
        return this.customHostAlias;
    }

    /**
     * @return customImageNetworkType
     */
    public String getCustomImageNetworkType() {
        return this.customImageNetworkType;
    }

    /**
     * @return deploy
     */
    public Boolean getDeploy() {
        return this.deploy;
    }

    /**
     * @return diskSize
     */
    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return dotnet
     */
    public String getDotnet() {
        return this.dotnet;
    }

    /**
     * @return edasContainerVersion
     */
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    /**
     * @return emptyDirDesc
     */
    public String getEmptyDirDesc() {
        return this.emptyDirDesc;
    }

    /**
     * @return enableCpuBurst
     */
    public Boolean getEnableCpuBurst() {
        return this.enableCpuBurst;
    }

    /**
     * @return enableEbpf
     */
    public String getEnableEbpf() {
        return this.enableEbpf;
    }

    /**
     * @return enableNamespaceAgentVersion
     */
    public Boolean getEnableNamespaceAgentVersion() {
        return this.enableNamespaceAgentVersion;
    }

    /**
     * @return enableNamespaceSlsConfig
     */
    public Boolean getEnableNamespaceSlsConfig() {
        return this.enableNamespaceSlsConfig;
    }

    /**
     * @return enableNewArms
     */
    public Boolean getEnableNewArms() {
        return this.enableNewArms;
    }

    /**
     * @return enablePrometheus
     */
    public Boolean getEnablePrometheus() {
        return this.enablePrometheus;
    }

    /**
     * @return enableSidecarResourceIsolated
     */
    public Boolean getEnableSidecarResourceIsolated() {
        return this.enableSidecarResourceIsolated;
    }

    /**
     * @return envs
     */
    public String getEnvs() {
        return this.envs;
    }

    /**
     * @return gpuConfig
     */
    public String getGpuConfig() {
        return this.gpuConfig;
    }

    /**
     * @return headlessPvtzDiscoverySvc
     */
    public String getHeadlessPvtzDiscoverySvc() {
        return this.headlessPvtzDiscoverySvc;
    }

    /**
     * @return html
     */
    public String getHtml() {
        return this.html;
    }

    /**
     * @return imagePullSecrets
     */
    public String getImagePullSecrets() {
        return this.imagePullSecrets;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return initContainersConfig
     */
    public java.util.List<InitContainerConfig> getInitContainersConfig() {
        return this.initContainersConfig;
    }

    /**
     * @return isStateful
     */
    public Boolean getIsStateful() {
        return this.isStateful;
    }

    /**
     * @return jarStartArgs
     */
    public String getJarStartArgs() {
        return this.jarStartArgs;
    }

    /**
     * @return jarStartOptions
     */
    public String getJarStartOptions() {
        return this.jarStartOptions;
    }

    /**
     * @return jdk
     */
    public String getJdk() {
        return this.jdk;
    }

    /**
     * @return kafkaConfigs
     */
    public String getKafkaConfigs() {
        return this.kafkaConfigs;
    }

    /**
     * @return labels
     */
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    /**
     * @return liveness
     */
    public String getLiveness() {
        return this.liveness;
    }

    /**
     * @return lokiConfigs
     */
    public String getLokiConfigs() {
        return this.lokiConfigs;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return microRegistration
     */
    public String getMicroRegistration() {
        return this.microRegistration;
    }

    /**
     * @return microRegistrationConfig
     */
    public String getMicroRegistrationConfig() {
        return this.microRegistrationConfig;
    }

    /**
     * @return microserviceEngineConfig
     */
    public String getMicroserviceEngineConfig() {
        return this.microserviceEngineConfig;
    }

    /**
     * @return mountDesc
     */
    public String getMountDesc() {
        return this.mountDesc;
    }

    /**
     * @return mountHost
     */
    public String getMountHost() {
        return this.mountHost;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return nasConfigs
     */
    public String getNasConfigs() {
        return this.nasConfigs;
    }

    /**
     * @return nasId
     */
    public String getNasId() {
        return this.nasId;
    }

    /**
     * @return newSaeVersion
     */
    public String getNewSaeVersion() {
        return this.newSaeVersion;
    }

    /**
     * @return oidcRoleName
     */
    public String getOidcRoleName() {
        return this.oidcRoleName;
    }

    /**
     * @return ossAkId
     */
    public String getOssAkId() {
        return this.ossAkId;
    }

    /**
     * @return ossAkSecret
     */
    public String getOssAkSecret() {
        return this.ossAkSecret;
    }

    /**
     * @return ossMountDescs
     */
    public String getOssMountDescs() {
        return this.ossMountDescs;
    }

    /**
     * @return packageType
     */
    public String getPackageType() {
        return this.packageType;
    }

    /**
     * @return packageUrl
     */
    public String getPackageUrl() {
        return this.packageUrl;
    }

    /**
     * @return packageVersion
     */
    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * @return php
     */
    public String getPhp() {
        return this.php;
    }

    /**
     * @return phpArmsConfigLocation
     */
    public String getPhpArmsConfigLocation() {
        return this.phpArmsConfigLocation;
    }

    /**
     * @return phpConfig
     */
    public String getPhpConfig() {
        return this.phpConfig;
    }

    /**
     * @return phpConfigLocation
     */
    public String getPhpConfigLocation() {
        return this.phpConfigLocation;
    }

    /**
     * @return postStart
     */
    public String getPostStart() {
        return this.postStart;
    }

    /**
     * @return preStop
     */
    public String getPreStop() {
        return this.preStop;
    }

    /**
     * @return programmingLanguage
     */
    public String getProgrammingLanguage() {
        return this.programmingLanguage;
    }

    /**
     * @return pvtzDiscoverySvc
     */
    public String getPvtzDiscoverySvc() {
        return this.pvtzDiscoverySvc;
    }

    /**
     * @return python
     */
    public String getPython() {
        return this.python;
    }

    /**
     * @return pythonModules
     */
    public String getPythonModules() {
        return this.pythonModules;
    }

    /**
     * @return raspConfig
     */
    public RaspConfig getRaspConfig() {
        return this.raspConfig;
    }

    /**
     * @return readiness
     */
    public String getReadiness() {
        return this.readiness;
    }

    /**
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return saeVersion
     */
    public String getSaeVersion() {
        return this.saeVersion;
    }

    /**
     * @return secretMountDesc
     */
    public String getSecretMountDesc() {
        return this.secretMountDesc;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return serviceTags
     */
    public String getServiceTags() {
        return this.serviceTags;
    }

    /**
     * @return sidecarContainersConfig
     */
    public java.util.List<SidecarContainerConfig> getSidecarContainersConfig() {
        return this.sidecarContainersConfig;
    }

    /**
     * @return slsConfigs
     */
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    /**
     * @return slsLogEnvTags
     */
    public String getSlsLogEnvTags() {
        return this.slsLogEnvTags;
    }

    /**
     * @return startupProbe
     */
    public String getStartupProbe() {
        return this.startupProbe;
    }

    /**
     * @return terminationGracePeriodSeconds
     */
    public Integer getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * @return tomcatConfig
     */
    public String getTomcatConfig() {
        return this.tomcatConfig;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return warStartOptions
     */
    public String getWarStartOptions() {
        return this.warStartOptions;
    }

    /**
     * @return webContainer
     */
    public String getWebContainer() {
        return this.webContainer;
    }

    public static final class Builder extends Request.Builder<CreateApplicationRequest, Builder> {
        private String acrAssumeRoleArn; 
        private String acrInstanceId; 
        private String agentVersion; 
        private String appDescription; 
        private String appName; 
        private String appSource; 
        private Boolean associateEip; 
        private Boolean autoConfig; 
        private String baseAppId; 
        private String command; 
        private String commandArgs; 
        private String configMapMountDesc; 
        private Integer cpu; 
        private String customHostAlias; 
        private String customImageNetworkType; 
        private Boolean deploy; 
        private Integer diskSize; 
        private String dotnet; 
        private String edasContainerVersion; 
        private String emptyDirDesc; 
        private Boolean enableCpuBurst; 
        private String enableEbpf; 
        private Boolean enableNamespaceAgentVersion; 
        private Boolean enableNamespaceSlsConfig; 
        private Boolean enableNewArms; 
        private Boolean enablePrometheus; 
        private Boolean enableSidecarResourceIsolated; 
        private String envs; 
        private String gpuConfig; 
        private String headlessPvtzDiscoverySvc; 
        private String html; 
        private String imagePullSecrets; 
        private String imageUrl; 
        private java.util.List<InitContainerConfig> initContainersConfig; 
        private Boolean isStateful; 
        private String jarStartArgs; 
        private String jarStartOptions; 
        private String jdk; 
        private String kafkaConfigs; 
        private java.util.Map<String, String> labels; 
        private String liveness; 
        private String lokiConfigs; 
        private Integer memory; 
        private String microRegistration; 
        private String microRegistrationConfig; 
        private String microserviceEngineConfig; 
        private String mountDesc; 
        private String mountHost; 
        private String namespaceId; 
        private String nasConfigs; 
        private String nasId; 
        private String newSaeVersion; 
        private String oidcRoleName; 
        private String ossAkId; 
        private String ossAkSecret; 
        private String ossMountDescs; 
        private String packageType; 
        private String packageUrl; 
        private String packageVersion; 
        private String php; 
        private String phpArmsConfigLocation; 
        private String phpConfig; 
        private String phpConfigLocation; 
        private String postStart; 
        private String preStop; 
        private String programmingLanguage; 
        private String pvtzDiscoverySvc; 
        private String python; 
        private String pythonModules; 
        private RaspConfig raspConfig; 
        private String readiness; 
        private Integer replicas; 
        private String resourceType; 
        private String saeVersion; 
        private String secretMountDesc; 
        private String securityGroupId; 
        private String serviceTags; 
        private java.util.List<SidecarContainerConfig> sidecarContainersConfig; 
        private String slsConfigs; 
        private String slsLogEnvTags; 
        private String startupProbe; 
        private Integer terminationGracePeriodSeconds; 
        private String timezone; 
        private String tomcatConfig; 
        private String vSwitchId; 
        private String vpcId; 
        private String warStartOptions; 
        private String webContainer; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationRequest request) {
            super(request);
            this.acrAssumeRoleArn = request.acrAssumeRoleArn;
            this.acrInstanceId = request.acrInstanceId;
            this.agentVersion = request.agentVersion;
            this.appDescription = request.appDescription;
            this.appName = request.appName;
            this.appSource = request.appSource;
            this.associateEip = request.associateEip;
            this.autoConfig = request.autoConfig;
            this.baseAppId = request.baseAppId;
            this.command = request.command;
            this.commandArgs = request.commandArgs;
            this.configMapMountDesc = request.configMapMountDesc;
            this.cpu = request.cpu;
            this.customHostAlias = request.customHostAlias;
            this.customImageNetworkType = request.customImageNetworkType;
            this.deploy = request.deploy;
            this.diskSize = request.diskSize;
            this.dotnet = request.dotnet;
            this.edasContainerVersion = request.edasContainerVersion;
            this.emptyDirDesc = request.emptyDirDesc;
            this.enableCpuBurst = request.enableCpuBurst;
            this.enableEbpf = request.enableEbpf;
            this.enableNamespaceAgentVersion = request.enableNamespaceAgentVersion;
            this.enableNamespaceSlsConfig = request.enableNamespaceSlsConfig;
            this.enableNewArms = request.enableNewArms;
            this.enablePrometheus = request.enablePrometheus;
            this.enableSidecarResourceIsolated = request.enableSidecarResourceIsolated;
            this.envs = request.envs;
            this.gpuConfig = request.gpuConfig;
            this.headlessPvtzDiscoverySvc = request.headlessPvtzDiscoverySvc;
            this.html = request.html;
            this.imagePullSecrets = request.imagePullSecrets;
            this.imageUrl = request.imageUrl;
            this.initContainersConfig = request.initContainersConfig;
            this.isStateful = request.isStateful;
            this.jarStartArgs = request.jarStartArgs;
            this.jarStartOptions = request.jarStartOptions;
            this.jdk = request.jdk;
            this.kafkaConfigs = request.kafkaConfigs;
            this.labels = request.labels;
            this.liveness = request.liveness;
            this.lokiConfigs = request.lokiConfigs;
            this.memory = request.memory;
            this.microRegistration = request.microRegistration;
            this.microRegistrationConfig = request.microRegistrationConfig;
            this.microserviceEngineConfig = request.microserviceEngineConfig;
            this.mountDesc = request.mountDesc;
            this.mountHost = request.mountHost;
            this.namespaceId = request.namespaceId;
            this.nasConfigs = request.nasConfigs;
            this.nasId = request.nasId;
            this.newSaeVersion = request.newSaeVersion;
            this.oidcRoleName = request.oidcRoleName;
            this.ossAkId = request.ossAkId;
            this.ossAkSecret = request.ossAkSecret;
            this.ossMountDescs = request.ossMountDescs;
            this.packageType = request.packageType;
            this.packageUrl = request.packageUrl;
            this.packageVersion = request.packageVersion;
            this.php = request.php;
            this.phpArmsConfigLocation = request.phpArmsConfigLocation;
            this.phpConfig = request.phpConfig;
            this.phpConfigLocation = request.phpConfigLocation;
            this.postStart = request.postStart;
            this.preStop = request.preStop;
            this.programmingLanguage = request.programmingLanguage;
            this.pvtzDiscoverySvc = request.pvtzDiscoverySvc;
            this.python = request.python;
            this.pythonModules = request.pythonModules;
            this.raspConfig = request.raspConfig;
            this.readiness = request.readiness;
            this.replicas = request.replicas;
            this.resourceType = request.resourceType;
            this.saeVersion = request.saeVersion;
            this.secretMountDesc = request.secretMountDesc;
            this.securityGroupId = request.securityGroupId;
            this.serviceTags = request.serviceTags;
            this.sidecarContainersConfig = request.sidecarContainersConfig;
            this.slsConfigs = request.slsConfigs;
            this.slsLogEnvTags = request.slsLogEnvTags;
            this.startupProbe = request.startupProbe;
            this.terminationGracePeriodSeconds = request.terminationGracePeriodSeconds;
            this.timezone = request.timezone;
            this.tomcatConfig = request.tomcatConfig;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.warStartOptions = request.warStartOptions;
            this.webContainer = request.webContainer;
        } 

        /**
         * <p>The ARN of the RAM role required to pull images across accounts. For more information, see <a href="https://help.aliyun.com/document_detail/223585.html">Use RAM roles to authorize access across Alibaba Cloud accounts</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/adminrole</p>
         */
        public Builder acrAssumeRoleArn(String acrAssumeRoleArn) {
            this.putQueryParameter("AcrAssumeRoleArn", acrAssumeRoleArn);
            this.acrAssumeRoleArn = acrAssumeRoleArn;
            return this;
        }

        /**
         * <p>The Container Registry ACR Enterprise instance ID. This parameter is required when <strong>ImageUrl</strong> is set to a Container Registry Enterprise instance image.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xxxxxx</p>
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.putBodyParameter("AcrInstanceId", acrInstanceId);
            this.acrInstanceId = acrInstanceId;
            return this;
        }

        /**
         * <p>The Aliyun Agent version.</p>
         * 
         * <strong>example:</strong>
         * <p>4.4.2</p>
         */
        public Builder agentVersion(String agentVersion) {
            this.putQueryParameter("AgentVersion", agentVersion);
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * <p>The description of the application. The description can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test description.</p>
         */
        public Builder appDescription(String appDescription) {
            this.putQueryParameter("AppDescription", appDescription);
            this.appDescription = appDescription;
            return this;
        }

        /**
         * <p>The name of the application. The name can contain digits, letters, and hyphens (-). It must start with a letter and cannot end with a hyphen (-). The name can be up to 36 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The source of the application. A value of micro_service indicates a microservice application.</p>
         * 
         * <strong>example:</strong>
         * <p>micro_service</p>
         */
        public Builder appSource(String appSource) {
            this.putQueryParameter("AppSource", appSource);
            this.appSource = appSource;
            return this;
        }

        /**
         * <p>Specifies whether to associate an elastic IP address (EIP). Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: associates an EIP.</li>
         * <li><strong>false</strong>: does not associate an EIP.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder associateEip(Boolean associateEip) {
            this.putBodyParameter("AssociateEip", associateEip);
            this.associateEip = associateEip;
            return this;
        }

        /**
         * <p>Specifies whether to automatically configure the network environment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: SAE automatically configures the network environment when the application is created. The values of <strong>NamespaceId</strong>, <strong>VpcId</strong>, <strong>vSwitchId</strong>, and <strong>SecurityGroupId</strong> are ignored.</li>
         * <li><strong>false</strong>: SAE manually configures the network environment when the application is created.</li>
         * </ul>
         * <blockquote>
         * <p>If you set this parameter to <strong>true</strong>, other <strong>NamespaceId</strong> values passed are ignored.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoConfig(Boolean autoConfig) {
            this.putQueryParameter("AutoConfig", autoConfig);
            this.autoConfig = autoConfig;
            return this;
        }

        /**
         * <p>The ID of the base application.</p>
         * 
         * <strong>example:</strong>
         * <p>ee99cce6-1c8e-4bfa-96c3-3e2fa9de8a41</p>
         */
        public Builder baseAppId(String baseAppId) {
            this.putBodyParameter("BaseAppId", baseAppId);
            this.baseAppId = baseAppId;
            return this;
        }

        /**
         * <p>The startup command of the image. The command must be an executable object that exists in the container. Example:</p>
         * <pre><code>command:
         *       - echo
         *       - abc
         *       - &gt;
         *       - file0
         * </code></pre>
         * <p>Based on the preceding example, Command=&quot;echo&quot;, CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;].</p>
         * <blockquote>
         * <p>Notice: This parameter is required when PackageType is set to DotnetZip.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>echo</p>
         */
        public Builder command(String command) {
            this.putQueryParameter("Command", command);
            this.command = command;
            return this;
        }

        /**
         * <p>The arguments for the image startup command, which are required by the startup command <strong>Command</strong>. The format is as follows:</p>
         * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
         * <p>In the preceding example, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>, where <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be converted to a string in JSON array format. If no arguments are required, leave this parameter empty.
         * <notice>This parameter is required when PackageType is set to DotnetZip.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;a&quot;,&quot;b&quot;]</p>
         */
        public Builder commandArgs(String commandArgs) {
            this.putQueryParameter("CommandArgs", commandArgs);
            this.commandArgs = commandArgs;
            return this;
        }

        /**
         * <p>The mount description of the <strong>ConfigMap</strong>. Uses the configuration item created on the configuration item page of the namespace to inject configuration information into the container. Parameter description:</p>
         * <ul>
         * <li><strong>configMapId</strong>: instance ID of the ConfigMap instance. You can invoke the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> operation to obtain the instance ID.</li>
         * <li><strong>key</strong>: the key value.</li>
         * </ul>
         * <blockquote>
         * <p>You can mount all keys by passing the sae-sys-configmap-all parameter.</p>
         * </blockquote>
         * <ul>
         * <li><strong>mountPath</strong>: the mount path.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;configMapId&quot;:16,&quot;key&quot;:&quot;test&quot;,&quot;mountPath&quot;:&quot;/tmp&quot;}]</p>
         */
        public Builder configMapMountDesc(String configMapMountDesc) {
            this.putBodyParameter("ConfigMapMountDesc", configMapMountDesc);
            this.configMapMountDesc = configMapMountDesc;
            return this;
        }

        /**
         * <p>The number of CPU cores required for each instance. Unit: millicore. The value cannot be 0. Only the following defined specifications are supported:</p>
         * <ul>
         * <li><strong>500</strong></li>
         * <li><strong>1000</strong></li>
         * <li><strong>2000</strong></li>
         * <li><strong>4000</strong></li>
         * <li><strong>8000</strong></li>
         * <li><strong>16000</strong></li>
         * <li><strong>32000</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder cpu(Integer cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The custom host mapping in the container. Valid values:</p>
         * <ul>
         * <li><strong>hostName</strong>: the domain name or hostname.</li>
         * <li><strong>ip</strong>: the IP address.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;hostName&quot;:&quot;samplehost&quot;,&quot;ip&quot;:&quot;127.0.0.1&quot;}]</p>
         */
        public Builder customHostAlias(String customHostAlias) {
            this.putQueryParameter("CustomHostAlias", customHostAlias);
            this.customHostAlias = customHostAlias;
            return this;
        }

        /**
         * <p>The custom image type. If the image is not a custom image, set this parameter to an empty string:</p>
         * <ul>
         * <li>internet: public network image.</li>
         * <li>intranet: private network image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>internet</p>
         */
        public Builder customImageNetworkType(String customImageNetworkType) {
            this.putQueryParameter("CustomImageNetworkType", customImageNetworkType);
            this.customImageNetworkType = customImageNetworkType;
            return this;
        }

        /**
         * <p>Specifies whether to deploy the application immediately. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: deploys the application immediately. This is the default value.</li>
         * <li><strong>false</strong>: deploys the application later.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deploy(Boolean deploy) {
            this.putQueryParameter("Deploy", deploy);
            this.deploy = deploy;
            return this;
        }

        /**
         * <p>The disk storage size, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder diskSize(Integer diskSize) {
            this.putQueryParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * <p>The version number of the .NET framework:</p>
         * <ul>
         * <li>.NET 3.1</li>
         * <li>.NET 5.0</li>
         * <li>.NET 6.0</li>
         * <li>.NET 7.0</li>
         * <li>.NET 8.0</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>.NET 3.1</p>
         */
        public Builder dotnet(String dotnet) {
            this.putQueryParameter("Dotnet", dotnet);
            this.dotnet = dotnet;
            return this;
        }

        /**
         * <p>The version of the application runtime environment in the High-Speed Service Framework (HSF), such as the Ali-Tomcat container.</p>
         * 
         * <strong>example:</strong>
         * <p>3.5.3</p>
         */
        public Builder edasContainerVersion(String edasContainerVersion) {
            this.putQueryParameter("EdasContainerVersion", edasContainerVersion);
            this.edasContainerVersion = edasContainerVersion;
            return this;
        }

        /**
         * <p>The shared ephemeral storage configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;workdir\&quot;,\&quot;mountPath\&quot;:\&quot;/usr/local/tomcat/webapps\&quot;}]</p>
         */
        public Builder emptyDirDesc(String emptyDirDesc) {
            this.putBodyParameter("EmptyDirDesc", emptyDirDesc);
            this.emptyDirDesc = emptyDirDesc;
            return this;
        }

        /**
         * <p>Specifies whether to enable the CPU Burst feature:</p>
         * <ul>
         * <li>true: enables the feature.</li>
         * <li>false: disables the feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableCpuBurst(Boolean enableCpuBurst) {
            this.putQueryParameter("EnableCpuBurst", enableCpuBurst);
            this.enableCpuBurst = enableCpuBurst;
            return this;
        }

        /**
         * <p>Specifies whether to enable application monitoring for non-Java applications based on eBPF technology. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the feature.</li>
         * <li><strong>false</strong>: disables the feature. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableEbpf(String enableEbpf) {
            this.putQueryParameter("EnableEbpf", enableEbpf);
            this.enableEbpf = enableEbpf;
            return this;
        }

        /**
         * <p>Specifies whether to reuse the namespace agent version configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableNamespaceAgentVersion(Boolean enableNamespaceAgentVersion) {
            this.putQueryParameter("EnableNamespaceAgentVersion", enableNamespaceAgentVersion);
            this.enableNamespaceAgentVersion = enableNamespaceAgentVersion;
            return this;
        }

        /**
         * <p>Specifies whether to reuse the namespace Simple Log Service (SLS) log configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableNamespaceSlsConfig(Boolean enableNamespaceSlsConfig) {
            this.putQueryParameter("EnableNamespaceSlsConfig", enableNamespaceSlsConfig);
            this.enableNamespaceSlsConfig = enableNamespaceSlsConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable the new Application Real-Time Monitoring Service (ARMS) features:</p>
         * <ul>
         * <li>true: enables the features.</li>
         * <li>false: disables the features.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableNewArms(Boolean enableNewArms) {
            this.putQueryParameter("EnableNewArms", enableNewArms);
            this.enableNewArms = enableNewArms;
            return this;
        }

        /**
         * <p>Specifies whether to enable Prometheus custom metric collection.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enablePrometheus(Boolean enablePrometheus) {
            this.putQueryParameter("EnablePrometheus", enablePrometheus);
            this.enablePrometheus = enablePrometheus;
            return this;
        }

        /**
         * <p>Specifies whether to enable sidecar resource isolation:</p>
         * <ul>
         * <li>true: enables isolation.</li>
         * <li>false: disables isolation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSidecarResourceIsolated(Boolean enableSidecarResourceIsolated) {
            this.putBodyParameter("EnableSidecarResourceIsolated", enableSidecarResourceIsolated);
            this.enableSidecarResourceIsolated = enableSidecarResourceIsolated;
            return this;
        }

        /**
         * <p>The environment variables of the container. You can customize environment variables or reference ConfigMaps. To reference a ConfigMap, you must create a ConfigMap instance first. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
         * <ul>
         * <li>Custom configuration<ul>
         * <li><strong>name</strong>: the name of the environment variable.</li>
         * <li><strong>value</strong>: the value of the environment variable. The priority of this parameter is higher than that of valueFrom.</li>
         * </ul>
         * </li>
         * <li>Reference a ConfigMap (valueFrom)<ul>
         * <li><strong>name</strong>: the name of the environment variable. You can reference a single key or all keys. To reference all keys, enter sae-sys-configmap-all-<ConfigMap name>, for example, sae-sys-configmap-all-test1.</li>
         * <li><strong>valueFrom</strong>: the reference of the environment variable. Set the value to configMapRef.<ul>
         * <li><strong>configMapId</strong>: the ID of the ConfigMap.</li>
         * <li><strong>key</strong>: the key. If you reference all key-value pairs, do not set this field.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;name&quot;: &quot;sae-sys-configmap-all-hello&quot;,
         *         &quot;valueFrom&quot;: {
         *             &quot;configMapRef&quot;: {
         *                 &quot;configMapId&quot;: 100,
         *                 &quot;key&quot;: &quot;&quot;
         *             }
         *         }
         *     },
         *     {
         *         &quot;name&quot;: &quot;hello&quot;,
         *         &quot;valueFrom&quot;: {
         *             &quot;configMapRef&quot;: {
         *                 &quot;configMapId&quot;: 101,
         *                 &quot;key&quot;: &quot;php-fpm&quot;
         *             }
         *         }
         *     },
         *     {
         *         &quot;name&quot;: &quot;envtmp&quot;,
         *         &quot;value&quot;: &quot;newenv&quot;
         *     }
         * ]</p>
         */
        public Builder envs(String envs) {
            this.putQueryParameter("Envs", envs);
            this.envs = envs;
            return this;
        }

        /**
         * <p>The GPU configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{\n\&quot;gpuType\&quot;:\&quot;PPU810E\&quot;,\n\&quot;gpuCount\&quot;:\&quot;1\&quot;\n}</p>
         */
        public Builder gpuConfig(String gpuConfig) {
            this.putQueryParameter("GpuConfig", gpuConfig);
            this.gpuConfig = gpuConfig;
            return this;
        }

        /**
         * <p>The Kubernetes headless service registration and discovery configuration.</p>
         * <ul>
         * <li>serviceName: The service name.</li>
         * <li>namespaceId: The namespace ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;serviceName\&quot;:\&quot;leaf-test-headless\&quot;,\&quot;namespaceId\&quot;:\&quot;cn-zhangjiakou:prod\&quot;}</p>
         */
        public Builder headlessPvtzDiscoverySvc(String headlessPvtzDiscoverySvc) {
            this.putQueryParameter("HeadlessPvtzDiscoverySvc", headlessPvtzDiscoverySvc);
            this.headlessPvtzDiscoverySvc = headlessPvtzDiscoverySvc;
            return this;
        }

        /**
         * <p>The NGINX version. Valid values:</p>
         * <ul>
         * <li>nginx 1.20</li>
         * <li>nginx 1.22</li>
         * <li>nginx 1.24</li>
         * <li>nginx 1.26</li>
         * <li>nginx 1.28</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nginx 1.28</p>
         */
        public Builder html(String html) {
            this.putQueryParameter("Html", html);
            this.html = html;
            return this;
        }

        /**
         * <p>The ID of the corresponding Secret.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder imagePullSecrets(String imagePullSecrets) {
            this.putQueryParameter("ImagePullSecrets", imagePullSecrets);
            this.imagePullSecrets = imagePullSecrets;
            return this;
        }

        /**
         * <p>The URL of the image. This parameter is required when <strong>PackageType</strong> is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.com/sae_test/ali_sae_test:0.0.1</p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The init container configuration.</p>
         */
        public Builder initContainersConfig(java.util.List<InitContainerConfig> initContainersConfig) {
            String initContainersConfigShrink = shrink(initContainersConfig, "InitContainersConfig", "json");
            this.putBodyParameter("InitContainersConfig", initContainersConfigShrink);
            this.initContainersConfig = initContainersConfig;
            return this;
        }

        /**
         * <p>Specifies whether the application is stateful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isStateful(Boolean isStateful) {
            this.putQueryParameter("IsStateful", isStateful);
            this.isStateful = isStateful;
            return this;
        }

        /**
         * <p>The startup arguments for the JAR package. Default startup command: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
         * 
         * <strong>example:</strong>
         * <p>custom-args</p>
         */
        public Builder jarStartArgs(String jarStartArgs) {
            this.putQueryParameter("JarStartArgs", jarStartArgs);
            this.jarStartArgs = jarStartArgs;
            return this;
        }

        /**
         * <p>The startup options for the JAR package. Default startup command: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
         * 
         * <strong>example:</strong>
         * <p>-Xms4G -Xmx4G</p>
         */
        public Builder jarStartOptions(String jarStartOptions) {
            this.putQueryParameter("JarStartOptions", jarStartOptions);
            this.jarStartOptions = jarStartOptions;
            return this;
        }

        /**
         * <p>The JDK version on which the deployment package depends. Valid values:</p>
         * <ul>
         * <li><strong>Open JDK 8</strong></li>
         * <li><strong>Open JDK 7</strong></li>
         * <li><strong>Dragonwell 11</strong></li>
         * <li><strong>Dragonwell 8</strong></li>
         * <li><strong>openjdk-8u191-jdk-alpine3.9</strong></li>
         * <li><strong>openjdk-7u201-jdk-alpine3.9</strong></li>
         * </ul>
         * <p>This parameter is not supported when <strong>PackageType</strong> is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Open JDK 8</p>
         */
        public Builder jdk(String jdk) {
            this.putQueryParameter("Jdk", jdk);
            this.jdk = jdk;
            return this;
        }

        /**
         * <p>The summary configuration for collecting logs to Kafka. Valid values:</p>
         * <ul>
         * <li><strong>kafkaEndpoint</strong>: the service registration address of the Kafka API.</li>
         * <li><strong>kafkaInstanceId</strong>: the Kafka instance ID.</li>
         * <li><strong>kafkaConfigs</strong>: the summary configuration for one or more logs. For value description, see the <strong>kafkaConfigs</strong> request parameter in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;kafkaEndpoint&quot;:&quot;10.0.X.XXX:XXXX,10.0.X.XXX:XXXX,10.0.X.XXX:XXXX&quot;,&quot;kafkaInstanceId&quot;:&quot;alikafka_pre-cn-7pp2l8kr****&quot;,&quot;kafkaConfigs&quot;:[{&quot;logType&quot;:&quot;file_log&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;kafkaTopic&quot;:&quot;test2&quot;},{&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;kafkaTopic&quot;:&quot;test&quot;}]}</p>
         */
        public Builder kafkaConfigs(String kafkaConfigs) {
            this.putQueryParameter("KafkaConfigs", kafkaConfigs);
            this.kafkaConfigs = kafkaConfigs;
            return this;
        }

        /**
         * <p>The application labels. Both keys and values are strings.</p>
         */
        public Builder labels(java.util.Map<String, String> labels) {
            String labelsShrink = shrink(labels, "Labels", "json");
            this.putQueryParameter("Labels", labelsShrink);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The liveness probe of the container. A container that failed the health check undergoes shutdown and recovers. The following methods are supported:</p>
         * <ul>
         * <li><strong>exec</strong>: for example, {&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat/home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</li>
         * <li><strong>httpGet</strong>: for example, {&quot;httpGet&quot;:{&quot;path&quot;:&quot;/&quot;,&quot;port&quot;:18091,&quot;scheme&quot;:&quot;HTTP&quot;,&quot;isContainKeyWord&quot;:true,&quot;keyWord&quot;:&quot;SAE&quot;},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</li>
         * <li><strong>tcpSocket</strong>: for example, {&quot;tcpSocket&quot;:{&quot;port&quot;:18091},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</li>
         * </ul>
         * <blockquote>
         * <p>You can select only one method for the health check.</p>
         * </blockquote>
         * <p>Parameter description:</p>
         * <ul>
         * <li><strong>exec.command</strong>: Settings for the health check command.</li>
         * <li><strong>httpGet.path</strong>: the access path.</li>
         * <li><strong>httpGet.scheme</strong>: <strong>HTTP</strong> or <strong>HTTPS</strong>.</li>
         * <li><strong>httpGet.isContainKeyWord</strong>: <strong>true</strong> indicates that the keyword is included, and <strong>false</strong> indicates that the keyword is not included. If this field is missing, the advanced feature is not used.</li>
         * <li><strong>httpGet.keyWord</strong>: the custom keyword. The <strong>isContainKeyWord</strong> field is required when this field is used.</li>
         * <li><strong>tcpSocket.port</strong>: the port for TCP connection detection.</li>
         * <li><strong>initialDelaySeconds</strong>: Settings for the delay before the health check starts. Default value: 10. Unit: seconds.</li>
         * <li><strong>periodSeconds</strong>: Settings for the health check epoch. Default value: 30. Unit: seconds.</li>
         * <li><strong>timeoutSeconds</strong>: Settings for the timeout period of the health check. Default value: 1. Unit: seconds. If this parameter is set to 0 or not set, the default timeout period is 1 second.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
         */
        public Builder liveness(String liveness) {
            this.putQueryParameter("Liveness", liveness);
            this.liveness = liveness;
            return this;
        }

        /**
         * <p>LokiConfigs</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder lokiConfigs(String lokiConfigs) {
            this.putQueryParameter("LokiConfigs", lokiConfigs);
            this.lokiConfigs = lokiConfigs;
            return this;
        }

        /**
         * <p>The memory size required for each instance. Unit: MB. The value cannot be 0. The memory size has a one-to-one correspondence with the number of CPU cores. Only the following defined specifications are supported:</p>
         * <ul>
         * <li><strong>1024</strong>: corresponds to 500 and 1,000 millicores.</li>
         * <li><strong>2048</strong>: corresponds to 500, 1,000, and 2,000 millicores.</li>
         * <li><strong>4096</strong>: corresponds to 1,000, 2,000, and 4,000 millicores.</li>
         * <li><strong>8192</strong>: corresponds to 2,000, 4,000, and 8,000 millicores.</li>
         * <li><strong>12288</strong>: corresponds to 12,000 millicores.</li>
         * <li><strong>16384</strong>: corresponds to 4,000, 8,000, and 16,000 millicores.</li>
         * <li><strong>24576</strong>: corresponds to 12,000 millicores.</li>
         * <li><strong>32768</strong>: corresponds to 16,000 millicores.</li>
         * <li><strong>65536</strong>: corresponds to 8,000, 16,000, and 32,000 millicores.</li>
         * <li><strong>131072</strong>: corresponds to 32,000 millicores.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder memory(Integer memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * <p>The Nacos registry. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: the built-in Nacos of SAE.</li>
         * <li><strong>1</strong>: a self-managed Nacos.</li>
         * <li><strong>2</strong>: Microservices Engine (MSE) Nacos.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;0&quot;</p>
         */
        public Builder microRegistration(String microRegistration) {
            this.putQueryParameter("MicroRegistration", microRegistration);
            this.microRegistration = microRegistration;
            return this;
        }

        /**
         * <p>The configuration of the registry.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;instanceId\&quot;:\&quot;mse-cn-zvp2bh6h70r\&quot;,\&quot;namespace\&quot;:\&quot;4c0aa74f-57cb-423c-b6af-5d9f2d0e3dbd\&quot;}</p>
         */
        public Builder microRegistrationConfig(String microRegistrationConfig) {
            this.putBodyParameter("MicroRegistrationConfig", microRegistrationConfig);
            this.microRegistrationConfig = microRegistrationConfig;
            return this;
        }

        /**
         * <p>Configures microservice governance features.</p>
         * <ul>
         * <li>enable: Specifies whether to enable microservice governance. Valid values:<ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * </li>
         * <li>mseLosslessRule: Configures lossless online and offline rules.<ul>
         * <li>delayTime: The delay time.</li>
         * <li>enable: Specifies whether to enable the lossless online feature. Valid values: true (enabled) and false (disabled).</li>
         * <li>notice: Specifies whether to enable the notification feature. Valid values: true (enabled) and false (disabled).</li>
         * <li>warmupTime: The warm-up duration for low traffic, in seconds.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enable&quot;: true,&quot;mseLosslessRule&quot;: {&quot;delayTime&quot;: 0,&quot;enable&quot;: false,&quot;notice&quot;: false,&quot;warmupTime&quot;: 120}}</p>
         */
        public Builder microserviceEngineConfig(String microserviceEngineConfig) {
            this.putQueryParameter("MicroserviceEngineConfig", microserviceEngineConfig);
            this.microserviceEngineConfig = microserviceEngineConfig;
            return this;
        }

        /**
         * <p>Do not configure this field. Configure <strong>NasConfigs</strong> instead. The mount description of the NAS file system. If the configuration remains unchanged during deployment, you do not need to set this parameter. That is, you do not need to include the <strong>MountDesc</strong> field in the request. If you need to clear the NAS configuration, set the value of this field to an empty string in the request. That is, set the <strong>MountDesc</strong> field to &quot;&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>[{mountPath: &quot;/tmp&quot;, nasPath: &quot;/&quot;}]</p>
         */
        public Builder mountDesc(String mountDesc) {
            this.putQueryParameter("MountDesc", mountDesc);
            this.mountDesc = mountDesc;
            return this;
        }

        /**
         * <p>Do not configure this field. Configure <strong>NasConfigs</strong> instead. The mount target of the NAS file system in the VPC of the application. If the configuration remains unchanged during deployment, you do not need to set this parameter. That is, you do not need to include the <strong>MountHost</strong> field in the request. If you need to clear the NAS configuration, set the value of this field to an empty string in the request. That is, set the <strong>MountHost</strong> field to &quot;&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder mountHost(String mountHost) {
            this.putQueryParameter("MountHost", mountHost);
            this.mountHost = mountHost;
            return this;
        }

        /**
         * <p>The ID of the Serverless App Engine (SAE) namespace. Only namespaces whose names contain lowercase letters and hyphens (-) are supported. The name must start with a letter.
         * You can obtain the namespace by calling the <a href="https://help.aliyun.com/document_detail/126547.html">DescribeNamespaceList</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The configuration for mounting the NAS file system. Valid values:</p>
         * <ul>
         * <li><strong>mountPath</strong>: the mount path of the container.</li>
         * <li><strong>readOnly</strong>: A value of <strong>false</strong> indicates read and write permissions.</li>
         * <li><strong>nasId</strong>: the ID of the NAS file system.</li>
         * <li><strong>mountDomain</strong>: the mount target address of the container. For more information, see <a href="https://help.aliyun.com/document_detail/62626.html">DescribeMountTargets</a>.</li>
         * <li><strong>nasPath</strong>: the relative file directory of the NAS file system.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;mountPath&quot;:&quot;/test1&quot;,&quot;readOnly&quot;:false,&quot;nasId&quot;:&quot;nasId1&quot;,&quot;mountDomain&quot;:&quot;nasId1.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;nasPath&quot;:&quot;/test1&quot;},{&quot;nasId&quot;:&quot;nasId2&quot;,&quot;mountDomain&quot;:&quot;nasId2.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;readOnly&quot;:false,&quot;nasPath&quot;:&quot;/test2&quot;,&quot;mountPath&quot;:&quot;/test2&quot;}]</p>
         */
        public Builder nasConfigs(String nasConfigs) {
            this.putQueryParameter("NasConfigs", nasConfigs);
            this.nasConfigs = nasConfigs;
            return this;
        }

        /**
         * <p>Do not configure this field. Configure <strong>NasConfigs</strong> instead. The ID of the mounted Apsara File Storage NAS file system. The NAS file system must reside in the same region as the cluster. It must have an available quota for creating mount targets, or its mount targets must already exist on a vSwitch in the VPC. If you do not specify this parameter and the <strong>mountDescs</strong> field exists, a NAS file system is automatically purchased and mounted to a vSwitch in the VPC by default.</p>
         * <p>If the configuration remains unchanged during deployment, you do not need to set this parameter. That is, you do not need to include the <strong>NASId</strong> field in the request. If you need to clear the NAS configuration, set the value of this field to an empty string in the request. That is, set the <strong>NASId</strong> field to &quot;&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>KSAK****</p>
         */
        public Builder nasId(String nasId) {
            this.putQueryParameter("NasId", nasId);
            this.nasId = nasId;
            return this;
        }

        /**
         * <p>The application version. Valid values:</p>
         * <ul>
         * <li>lite: Lite Edition.</li>
         * <li>std: Standard Edition.</li>
         * <li>pro: Professional Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pro</p>
         */
        public Builder newSaeVersion(String newSaeVersion) {
            this.putQueryParameter("NewSaeVersion", newSaeVersion);
            this.newSaeVersion = newSaeVersion;
            return this;
        }

        /**
         * <p>The RAM role for the identity authentication service.</p>
         * <blockquote>
         * <p>You must create an OIDC identity provider and an identity provider role in the same region in advance. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/ram/developer-reference/api-ims-2019-08-15-createoidcprovider">Create an OIDC identity provider</a> and <a href="https://www.alibabacloud.com/help/en/ram/developer-reference/api-ims-2019-08-15-createsamlprovider">Create a role-based SSO identity provider</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/ram/developer-reference/api-ims-2019-08-15-createoidcprovider">Create an OIDC identity provider</a> and <a href="https://www.alibabacloud.com/help/zh/ram/developer-reference/api-ims-2019-08-15-createsamlprovider">Create a role-based SSO identity provider</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sae-test</p>
         */
        public Builder oidcRoleName(String oidcRoleName) {
            this.putQueryParameter("OidcRoleName", oidcRoleName);
            this.oidcRoleName = oidcRoleName;
            return this;
        }

        /**
         * <p>The AccessKey ID used to read and write OSS data.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder ossAkId(String ossAkId) {
            this.putBodyParameter("OssAkId", ossAkId);
            this.ossAkId = ossAkId;
            return this;
        }

        /**
         * <p>The AccessKey Secret used to read and write OSS data.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder ossAkSecret(String ossAkSecret) {
            this.putBodyParameter("OssAkSecret", ossAkSecret);
            this.ossAkSecret = ossAkSecret;
            return this;
        }

        /**
         * <p>The OSS mount description. Parameter description:</p>
         * <ul>
         * <li><strong>bucketName</strong>: the name of the bucket.</li>
         * <li><strong>bucketPath</strong>: the folder or object that you created in OSS. If the OSS mount folder does not exist, an exception is triggered.</li>
         * <li><strong>mountPath</strong>: the container path in SAE. If the path already exists, it will overwrite the existing content. If the path does not exist, it is created.</li>
         * <li><strong>readOnly</strong>: specifies whether the container path has read permissions on the mounted folder resources. Valid values:<ul>
         * <li><strong>true</strong>: read-only permissions.</li>
         * <li><strong>false</strong>: read and write permissions.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;bucketName&quot;: &quot;oss-bucket&quot;, &quot;bucketPath&quot;: &quot;data/user.data&quot;, &quot;mountPath&quot;: &quot;/usr/data/user.data&quot;, &quot;readOnly&quot;: true}]</p>
         */
        public Builder ossMountDescs(String ossMountDescs) {
            this.putBodyParameter("OssMountDescs", ossMountDescs);
            this.ossMountDescs = ossMountDescs;
            return this;
        }

        /**
         * <p>The type of the application package. Valid values:</p>
         * <ul>
         * <li><p>When you deploy the application by using Java, <strong>FatJar</strong>, <strong>War</strong>, and <strong>Image</strong> are supported.</p>
         * </li>
         * <li><p>When you deploy the application by using PHP, the following types are supported:</p>
         * <ul>
         * <li><strong>PhpZip</strong></li>
         * <li><strong>IMAGE_PHP_5_4</strong></li>
         * <li><strong>IMAGE_PHP_5_4_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_5_5</strong></li>
         * <li><strong>IMAGE_PHP_5_5_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_5_6</strong></li>
         * <li><strong>IMAGE_PHP_5_6_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_7_0</strong></li>
         * <li><strong>IMAGE_PHP_7_0_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_7_1</strong></li>
         * <li><strong>IMAGE_PHP_7_1_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_7_2</strong></li>
         * <li><strong>IMAGE_PHP_7_2_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_7_3</strong></li>
         * <li><strong>IMAGE_PHP_7_3_ALPINE</strong></li>
         * </ul>
         * </li>
         * <li><p>When you deploy the application by using Python, <strong>PythonZip</strong> and <strong>Image</strong> are supported.</p>
         * </li>
         * <li><p>When you deploy the application by using .NET Core, <strong>DotnetZip</strong> and <strong>Image</strong> are supported.</p>
         * <blockquote>
         * <p>If you select DotnetZip, Dotnet specifies the version number of the .NET Core environment. .NET 3.1, .NET 5.0, .NET 6.0, .NET 7.0, and .NET 8.0 are supported. In this case, the Dotnet, Command, and CommandArgs parameters are required.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FatJar</p>
         */
        public Builder packageType(String packageType) {
            this.putQueryParameter("PackageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * <p>The URL of the deployment package. This parameter is required when <strong>PackageType</strong> is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://myoss.oss-cn-****.aliyuncs.com/my-buc/2019-06-30/****.jar">http://myoss.oss-cn-****.aliyuncs.com/my-buc/2019-06-30/****.jar</a></p>
         */
        public Builder packageUrl(String packageUrl) {
            this.putQueryParameter("PackageUrl", packageUrl);
            this.packageUrl = packageUrl;
            return this;
        }

        /**
         * <p>The version number of the deployment package. This parameter is required when <strong>PackageType</strong> is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder packageVersion(String packageVersion) {
            this.putQueryParameter("PackageVersion", packageVersion);
            this.packageVersion = packageVersion;
            return this;
        }

        /**
         * <p>The PHP version on which the PHP deployment package depends. Images are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>PHP-FPM 7.0</p>
         */
        public Builder php(String php) {
            this.putBodyParameter("Php", php);
            this.php = php;
            return this;
        }

        /**
         * <p>The mount path for PHP application monitoring. You must ensure that the PHP server loads the configuration file in this path.
         * You do not need to pay attention to the configuration content. SAE automatically renders the correct configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/etc/php/conf.d/arms.ini</p>
         */
        public Builder phpArmsConfigLocation(String phpArmsConfigLocation) {
            this.putQueryParameter("PhpArmsConfigLocation", phpArmsConfigLocation);
            this.phpArmsConfigLocation = phpArmsConfigLocation;
            return this;
        }

        /**
         * <p>The content of the PHP configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>k1=v1</p>
         */
        public Builder phpConfig(String phpConfig) {
            this.putBodyParameter("PhpConfig", phpConfig);
            this.phpConfig = phpConfig;
            return this;
        }

        /**
         * <p>The mount path for the PHP application startup configuration. You must ensure that the PHP server uses this configuration file to start.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/etc/php/php.ini</p>
         */
        public Builder phpConfigLocation(String phpConfigLocation) {
            this.putQueryParameter("PhpConfigLocation", phpConfigLocation);
            this.phpConfigLocation = phpConfigLocation;
            return this;
        }

        /**
         * <p>The script to execute after the container starts. A script is triggered and executed immediately after the container is created. Format: {&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
         */
        public Builder postStart(String postStart) {
            this.putQueryParameter("PostStart", postStart);
            this.postStart = postStart;
            return this;
        }

        /**
         * <p>The script to execute before the container stops. A script is triggered and executed before the container is deleted. Format: {&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
         */
        public Builder preStop(String preStop) {
            this.putQueryParameter("PreStop", preStop);
            this.preStop = preStop;
            return this;
        }

        /**
         * <p>The programming language used to create the application. Valid values:</p>
         * <ul>
         * <li><strong>java</strong>: Java.</li>
         * <li><strong>php</strong>: PHP.</li>
         * <li><strong>python</strong>: Python.</li>
         * <li><strong>dotnet</strong>: .NET Core.</li>
         * <li><strong>other</strong>: multiple languages, such as C++, Go, and Node.js.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>java</p>
         */
        public Builder programmingLanguage(String programmingLanguage) {
            this.putQueryParameter("ProgrammingLanguage", programmingLanguage);
            this.programmingLanguage = programmingLanguage;
            return this;
        }

        /**
         * <p>Enables Kubernetes Service registration and discovery. Valid values:</p>
         * <ul>
         * <li><strong>serviceName</strong>: the service name. The format is custom-namespace ID. The suffix -namespace ID cannot be customized and must be filled in based on the namespace where the application resides. For example, if you select the default namespace in the China (Beijing) region, the value is -cn-beijing-default.</li>
         * <li><strong>namespaceId</strong>: the ID of the namespace.</li>
         * <li><strong>portProtocols</strong>: the port and protocol. The port value ranges from 1 to 65535. The protocol supports <strong>TCP</strong> and <strong>UDP</strong>.</li>
         * <li><strong>portAndProtocol</strong>: the port and protocol. The port value ranges from 1 to 65535. The protocol supports <strong>TCP</strong> and <strong>UDP</strong>. <strong>We recommend that you use portProtocols. If portProtocols Settings are configured, only portProtocols takes effect</strong>.</li>
         * <li><strong>enable</strong>: enables Kubernetes Service registration and discovery.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;serviceName&quot;:&quot;bwm-poc-sc-gateway-cn-beijing-front&quot;,&quot;namespaceId&quot;:&quot;cn-beijing:front&quot;,&quot;portAndProtocol&quot;:{&quot;18012&quot;:&quot;TCP&quot;},&quot;enable&quot;:true,&quot;portProtocols&quot;:[{&quot;port&quot;:18012,&quot;protocol&quot;:&quot;TCP&quot;}]}</p>
         */
        public Builder pvtzDiscoverySvc(String pvtzDiscoverySvc) {
            this.putQueryParameter("PvtzDiscoverySvc", pvtzDiscoverySvc);
            this.pvtzDiscoverySvc = pvtzDiscoverySvc;
            return this;
        }

        /**
         * <p>The Python environment. <strong>PYTHON 3.9.15</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>PYTHON 3.9.15</p>
         */
        public Builder python(String python) {
            this.putQueryParameter("Python", python);
            this.python = python;
            return this;
        }

        /**
         * <p>The custom installation module dependencies. By default, the dependencies defined in the requirements.txt file in the root folder are installed. If no dependencies are configured or custom software packages are used, you can specify the dependencies to install.</p>
         * 
         * <strong>example:</strong>
         * <p>Flask==2.0</p>
         */
        public Builder pythonModules(String pythonModules) {
            this.putQueryParameter("PythonModules", pythonModules);
            this.pythonModules = pythonModules;
            return this;
        }

        /**
         * <p>The application runtime security protection (RASP) configuration.</p>
         */
        public Builder raspConfig(RaspConfig raspConfig) {
            String raspConfigShrink = shrink(raspConfig, "RaspConfig", "json");
            this.putQueryParameter("RaspConfig", raspConfigShrink);
            this.raspConfig = raspConfig;
            return this;
        }

        /**
         * <p>The readiness probe of the application. A container that fails multiple health checks is stopped and restarted. Traffic from Server Load Balancer (SLB) is not routed to containers that fail the health check. The <strong>exec</strong>, <strong>httpGet</strong>, and <strong>tcpSocket</strong> methods are supported. For specific examples, see the <strong>Liveness</strong> parameter.</p>
         * <blockquote>
         * <p>You can select only one method for the health check.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
         */
        public Builder readiness(String readiness) {
            this.putQueryParameter("Readiness", readiness);
            this.readiness = readiness;
            return this;
        }

        /**
         * <p>The initial number of instances.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder replicas(Integer replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * <p>The resource type. Valid values: NULL (default), default (default), and haiguang (Hygon servers).</p>
         * 
         * <strong>example:</strong>
         * <p>NULL</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The SAE version. Valid values:</p>
         * <ul>
         * <li><strong>v1</strong></li>
         * <li><strong>v2</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder saeVersion(String saeVersion) {
            this.putQueryParameter("SaeVersion", saeVersion);
            this.saeVersion = saeVersion;
            return this;
        }

        /**
         * <p>The mount description of the <strong>Secret</strong>. Uses the Secret created on the Secret page of the namespace to inject confidential information into the container. Parameter description:</p>
         * <ul>
         * <li><strong>secretId</strong>: instance ID of the Secret instance. You can obtain the instance ID by invoking the ListSecrets operation.</li>
         * <li><strong>key</strong>: the key value.</li>
         * </ul>
         * <blockquote>
         * <p>You can mount all keys by passing the sae-sys-secret-all parameter.</p>
         * </blockquote>
         * <ul>
         * <li><strong>mountPath</strong>: the mount path.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{“secretId&quot;:10,”key&quot;:&quot;test&quot;,&quot;mountPath&quot;:&quot;/tmp&quot;}]</p>
         */
        public Builder secretMountDesc(String secretMountDesc) {
            this.putQueryParameter("SecretMountDesc", secretMountDesc);
            this.secretMountDesc = secretMountDesc;
            return this;
        }

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-wz969ngg2e49q5i4****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The canary release tags configured for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;alicloud.service.tag\&quot;:\&quot;g1\&quot;}</p>
         */
        public Builder serviceTags(String serviceTags) {
            this.putBodyParameter("ServiceTags", serviceTags);
            this.serviceTags = serviceTags;
            return this;
        }

        /**
         * <p>The container configuration.</p>
         */
        public Builder sidecarContainersConfig(java.util.List<SidecarContainerConfig> sidecarContainersConfig) {
            String sidecarContainersConfigShrink = shrink(sidecarContainersConfig, "SidecarContainersConfig", "json");
            this.putBodyParameter("SidecarContainersConfig", sidecarContainersConfigShrink);
            this.sidecarContainersConfig = sidecarContainersConfig;
            return this;
        }

        /**
         * <p>The configuration for collecting logs to Simple Log Service (SLS).</p>
         * <ul>
         * <li>Use SLS resources from automatic creation by SAE: [{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}].</li>
         * <li>Use custom SLS resources: [{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}].</li>
         * </ul>
         * <p>Parameter description:</p>
         * <ul>
         * <li><strong>projectName</strong>: the name of the SLS project.  </li>
         * <li><strong>logDir</strong>: the log path.</li>
         * <li><strong>logType</strong>: the log type. <strong>stdout</strong> indicates container standard output logs. Only one stdout log Settings can be configured. If Settings are not specified, file logs are collected.</li>
         * <li><strong>logstoreName</strong>: the name of the SLS Logstore.</li>
         * <li><strong>logtailName</strong>: the name of the SLS Logtail. If this parameter is not specified, a new Logtail is created.</li>
         * </ul>
         * <p>If the SLS collection configuration remains unchanged during multiple deployments, you do not need to set this parameter. That is, you do not need to include the <strong>SlsConfigs</strong> field in the request. If you no longer need the SLS collection feature, you must set the value of this field to an empty string in the request. That is, set the <strong>SlsConfigs</strong> field to &quot;&quot;.</p>
         * <blockquote>
         * <p>Projects from automatic creation with the application are deleted when the application is deleted. Therefore, when selecting an existing project, you cannot select a project from automatic creation by SAE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
         */
        public Builder slsConfigs(String slsConfigs) {
            this.putQueryParameter("SlsConfigs", slsConfigs);
            this.slsConfigs = slsConfigs;
            return this;
        }

        /**
         * <p>sls log tags</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder slsLogEnvTags(String slsLogEnvTags) {
            this.putQueryParameter("SlsLogEnvTags", slsLogEnvTags);
            this.slsLogEnvTags = slsLogEnvTags;
            return this;
        }

        /**
         * <p>Enables application startup probes.</p>
         * <ul>
         * <li>Success: Indicates that the application is started. If you configure liveness and readiness probes, the liveness and readiness probes are executed after the application is started.</li>
         * <li>Failure: Indicates that the application fails to start. An exception is reported and the application is automatically restarted.<blockquote>
         * <ul>
         * <li>The exec, httpGet, and tcpSocket methods are supported. For specific examples, refer to the Liveness parameter.</li>
         * <li>You can select only one method for health checks.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
         */
        public Builder startupProbe(String startupProbe) {
            this.putQueryParameter("StartupProbe", startupProbe);
            this.startupProbe = startupProbe;
            return this;
        }

        /**
         * <p>The timeout period for graceful shutdown. Default value: 30. Unit: seconds. Valid values: 1 to 300.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder terminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
            this.putQueryParameter("TerminationGracePeriodSeconds", terminationGracePeriodSeconds);
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }

        /**
         * <p>The time zone. Default value: <strong>Asia/Shanghai</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        public Builder timezone(String timezone) {
            this.putQueryParameter("Timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        /**
         * <p>The Tomcat file configuration. Set the value to &quot;&quot; or &quot;{}&quot; to delete the configuration:</p>
         * <ul>
         * <li><strong>port</strong>: the port range is 1024 to 65535. Ports smaller than 1024 require root permissions. Because the container is configured with admin permissions, specify a port greater than 1024. If this parameter is not configured, the default value is 8080.</li>
         * <li><strong>contextPath</strong>: the access path. The default value is the root directory &quot;/&quot;.</li>
         * <li><strong>maxThreads</strong>: the maximum number of connections in the connection pool. The default value is 400.</li>
         * <li><strong>uriEncoding</strong>: the encoding format of Tomcat. Valid values: <strong>UTF-8</strong>, <strong>ISO-8859-1</strong>, <strong>GBK</strong>, and <strong>GB2312</strong>. If this parameter is not set, the default value is <strong>ISO-8859-1</strong>.</li>
         * <li><strong>useBodyEncodingForUri</strong>: specifies whether to use <strong>BodyEncoding for URL</strong>. Default value: <strong>true</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;port&quot;:8080,&quot;contextPath&quot;:&quot;/&quot;,&quot;maxThreads&quot;:400,&quot;uriEncoding&quot;:&quot;ISO-8859-1&quot;,&quot;useBodyEncodingForUri&quot;:true}</p>
         */
        public Builder tomcatConfig(String tomcatConfig) {
            this.putQueryParameter("TomcatConfig", tomcatConfig);
            this.tomcatConfig = tomcatConfig;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which the elastic network interface controllers (NICs) of the application instance belong. The vSwitch must reside in the preceding VPC. The vSwitch is also attached to the SAE namespace. If you do not specify this parameter, the ID of the vSwitch attached to the namespace is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp12mw1f8k3jgygk9****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) that corresponds to the SAE namespace. In SAE, a namespace can correspond to only one VPC, and the correspondence cannot be modified. The binding relationship is established when you create the first SAE application in the namespace. Multiple namespaces can correspond to one VPC. If you do not specify this parameter, the ID of the VPC bound to the namespace is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1aevy8sofi8mh1q****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The startup command for the application deployed by using a WAR package. The procedure is the same as that for configuring the startup command for image deployment. For more information, see <a href="https://help.aliyun.com/document_detail/96677.html">Set a startup command</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>CATALINA_OPTS=\&quot;$CATALINA_OPTS $Options\&quot; catalina.sh run</p>
         */
        public Builder warStartOptions(String warStartOptions) {
            this.putQueryParameter("WarStartOptions", warStartOptions);
            this.warStartOptions = warStartOptions;
            return this;
        }

        /**
         * <p>The Tomcat version on which the WebContainer deployment package depends. Valid values:</p>
         * <ul>
         * <li><strong>apache-tomcat-7.0.91</strong></li>
         * <li><strong>apache-tomcat-8.5.42</strong></li>
         * </ul>
         * <p>This parameter is not supported when <strong>PackageType</strong> is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>apache-tomcat-7.0.91</p>
         */
        public Builder webContainer(String webContainer) {
            this.putQueryParameter("WebContainer", webContainer);
            this.webContainer = webContainer;
            return this;
        }

        @Override
        public CreateApplicationRequest build() {
            return new CreateApplicationRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateApplicationRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationRequest</p>
     */
    public static class RaspConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableRasp")
        private Boolean enableRasp;

        @com.aliyun.core.annotation.NameInMap("RaspAppKey")
        private String raspAppKey;

        @com.aliyun.core.annotation.NameInMap("RaspAppName")
        private String raspAppName;

        private RaspConfig(Builder builder) {
            this.enableRasp = builder.enableRasp;
            this.raspAppKey = builder.raspAppKey;
            this.raspAppName = builder.raspAppName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RaspConfig create() {
            return builder().build();
        }

        /**
         * @return enableRasp
         */
        public Boolean getEnableRasp() {
            return this.enableRasp;
        }

        /**
         * @return raspAppKey
         */
        public String getRaspAppKey() {
            return this.raspAppKey;
        }

        /**
         * @return raspAppName
         */
        public String getRaspAppName() {
            return this.raspAppName;
        }

        public static final class Builder {
            private Boolean enableRasp; 
            private String raspAppKey; 
            private String raspAppName; 

            private Builder() {
            } 

            private Builder(RaspConfig model) {
                this.enableRasp = model.enableRasp;
                this.raspAppKey = model.raspAppKey;
                this.raspAppName = model.raspAppName;
            } 

            /**
             * <p>Specifies whether the application runtime security protection (RASP) is enabled.</p>
             */
            public Builder enableRasp(Boolean enableRasp) {
                this.enableRasp = enableRasp;
                return this;
            }

            /**
             * <p>The RASP application key.</p>
             * 
             * <strong>example:</strong>
             * <p>key-1</p>
             */
            public Builder raspAppKey(String raspAppKey) {
                this.raspAppKey = raspAppKey;
                return this;
            }

            /**
             * <p>The RASP application name.</p>
             * 
             * <strong>example:</strong>
             * <p>sae-test</p>
             */
            public Builder raspAppName(String raspAppName) {
                this.raspAppName = raspAppName;
                return this;
            }

            public RaspConfig build() {
                return new RaspConfig(this);
            } 

        } 

    }
}
