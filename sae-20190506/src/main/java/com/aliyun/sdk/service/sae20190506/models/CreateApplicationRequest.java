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
    @com.aliyun.core.annotation.NameInMap("Liveness")
    private String liveness;

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
        this.liveness = builder.liveness;
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
     * @return liveness
     */
    public String getLiveness() {
        return this.liveness;
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
        private String liveness; 
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
            this.liveness = request.liveness;
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
         * <p>The Alibaba Cloud Resource Name (ARN) required for a RAM role to obtain images across accounts. For more information, see <a href="https://help.aliyun.com/document_detail/223585.html">Grant permissions across Alibaba Cloud accounts by using a RAM role</a>.</p>
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
         * <p>The ID of Container Registry Enterprise Edition instance N. This parameter is required when the <strong>ImageUrl</strong> parameter is set to the URL of an image in an ACR Enterprise Edition instance.</p>
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
         * AgentVersion.
         */
        public Builder agentVersion(String agentVersion) {
            this.putQueryParameter("AgentVersion", agentVersion);
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * <p>The description of the template. The description cannot exceed 1,024 characters in length.</p>
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
         * <p>The name of the application. The name can contain digits, letters, and hyphens (-). The name must start with a letter and cannot end with a hyphen (-). It cannot exceed 36 characters in length.</p>
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
         * <p>Select micro_service, which is the application.</p>
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
         * <p>Specifies whether to associate an EIP with the node pool. Take note of the following rules:</p>
         * <ul>
         * <li><strong>true</strong>: The EIP is associated with the application instance.</li>
         * <li><strong>false</strong>: The EIP is not associated with the application instance.</li>
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
         * <li><strong>true</strong>: SAE automatically configures the network environment when you create the application. If you set this parameter to true, the values of the <strong>NamespaceId</strong>, <strong>VpcId</strong>, <strong>vSwitchId</strong>, and <strong>SecurityGroupId</strong> parameters are ignored.</li>
         * <li><strong>false</strong>: SAE configures the network environment based on your settings when you create the application.</li>
         * </ul>
         * <blockquote>
         * <p> If you select <strong>true</strong>, other <strong>NamespaceId</strong> will be ignored.</p>
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
         * <p>The ID of the basic application.</p>
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
         * <p>The command that is used to start the image. The command must be an existing executable object in the container. Sample statements:</p>
         * <pre><code>command:
         *       - echo
         *       - abc
         *       - &gt;
         *       - file0
         * </code></pre>
         * <p>In this example, the Command parameter is set to <code>Command=&quot;echo&quot;, CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>.</p>
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
         * <p>The parameters of the image startup command. The CommandArgs parameter specifies the parameters that are required for the <strong>Command</strong> parameter. You can specify the name in one of the following formats:</p>
         * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
         * <p>In the preceding example, the CommandArgs parameter is set to <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>. The data type of <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be an array of strings in the JSON format. This parameter is optional.</p>
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
         * <p>The description of the <strong>ConfigMap</strong> instance mounted to the application. Use configurations created on the Configuration Items page to configure containers. The following table describes the parameters that are used in the preceding statements.</p>
         * <ul>
         * <li><strong>congfigMapId</strong>: the ID of the ConfigMap instance. You can call the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> operation to obtain the ID.</li>
         * <li><strong>key</strong>: the key.</li>
         * </ul>
         * <blockquote>
         * <p>You can use <code>sae-sys-configmap-all</code> to mount all keys.</p>
         * </blockquote>
         * <ul>
         * <li><strong>mountPath</strong>: the mount path in the container.</li>
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
         * <p>The CPU specifications that are required for each instance. Unit: millicores. This parameter cannot be set to 0. Valid values:</p>
         * <ul>
         * <li><strong>500</strong></li>
         * <li><strong>1000</strong></li>
         * <li><strong>2000</strong></li>
         * <li><strong>4000</strong></li>
         * <li><strong>8000</strong></li>
         * <li><strong>12000</strong></li>
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
         * <p>The custom mappings between hostnames and IP addresses in the container. Take note of the following rules:</p>
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
         * <p>Custom image type. To it to empty string to use pre-built image.</p>
         * <ul>
         * <li><p>internet: Public network image</p>
         * </li>
         * <li><p>intranet: Private network image</p>
         * </li>
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
         * <p>Whether to deploy now.</p>
         * <ul>
         * <li><strong>true</strong> (default): Deploy now.</li>
         * <li><strong>false</strong>: Deploy later.</li>
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
         * <p>The disk size. Unit: GB.</p>
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
         * <p>. NET Framework version number:</p>
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
         * <p>The version of the container in HSF.</p>
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
         * EmptyDirDesc.
         */
        public Builder emptyDirDesc(String emptyDirDesc) {
            this.putBodyParameter("EmptyDirDesc", emptyDirDesc);
            this.emptyDirDesc = emptyDirDesc;
            return this;
        }

        /**
         * <p>Enable CPU Burst.</p>
         * <ul>
         * <li>true: enable</li>
         * <li>false: disable</li>
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
         * <p>Enable application monitoring for non-Java applications based on eBPF technology. The value options are as follows:</p>
         * <ul>
         * <li>true: Enable.</li>
         * <li>false: Disable (default).</li>
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
         * EnableNamespaceAgentVersion.
         */
        public Builder enableNamespaceAgentVersion(Boolean enableNamespaceAgentVersion) {
            this.putQueryParameter("EnableNamespaceAgentVersion", enableNamespaceAgentVersion);
            this.enableNamespaceAgentVersion = enableNamespaceAgentVersion;
            return this;
        }

        /**
         * EnableNamespaceSlsConfig.
         */
        public Builder enableNamespaceSlsConfig(Boolean enableNamespaceSlsConfig) {
            this.putQueryParameter("EnableNamespaceSlsConfig", enableNamespaceSlsConfig);
            this.enableNamespaceSlsConfig = enableNamespaceSlsConfig;
            return this;
        }

        /**
         * <p>Indicates whether to enable the new ARMS feature:</p>
         * <ul>
         * <li>true: enables this parameter.</li>
         * <li>false: disables this parameter.</li>
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
         * EnablePrometheus.
         */
        public Builder enablePrometheus(Boolean enablePrometheus) {
            this.putQueryParameter("EnablePrometheus", enablePrometheus);
            this.enablePrometheus = enablePrometheus;
            return this;
        }

        /**
         * <p>Enable Sidecar resource isolation.</p>
         * <ul>
         * <li>true: enable</li>
         * <li>false: disable</li>
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
         * <p>The environment variables. You can configure custom environment variables or reference a ConfigMap. Before you can reference a ConfigMap, you must create a ConfigMap. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
         * <ul>
         * <li><p>Custom configuration</p>
         * <ul>
         * <li><strong>name</strong>: the name of the environment variable.</li>
         * <li><strong>value</strong>: the value of the environment variable. The priority of the custom configuration is higher than valueFrom.</li>
         * </ul>
         * </li>
         * <li><p>Reference a ConfigMap (valueFrom)</p>
         * <ul>
         * <li><strong>name</strong>: the name of the environment variable. You can reference one or all keys. To reference all keys, specify <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>. Example: <code>sae-sys-configmap-all-test1</code>.</li>
         * <li><strong>valueFrom</strong>: the reference of the environment variable. Valid value: <code>configMapRef</code>.</li>
         * <li><strong>configMapId</strong>: the ID of the ConfigMap.</li>
         * <li><strong>key</strong>: the key. If you want to reference all key values, you do not need to configure this parameter.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;envtmp&quot;,&quot;value&quot;:&quot;0&quot;}]</p>
         */
        public Builder envs(String envs) {
            this.putQueryParameter("Envs", envs);
            this.envs = envs;
            return this;
        }

        /**
         * GpuConfig.
         */
        public Builder gpuConfig(String gpuConfig) {
            this.putQueryParameter("GpuConfig", gpuConfig);
            this.gpuConfig = gpuConfig;
            return this;
        }

        /**
         * HeadlessPvtzDiscoverySvc.
         */
        public Builder headlessPvtzDiscoverySvc(String headlessPvtzDiscoverySvc) {
            this.putQueryParameter("HeadlessPvtzDiscoverySvc", headlessPvtzDiscoverySvc);
            this.headlessPvtzDiscoverySvc = headlessPvtzDiscoverySvc;
            return this;
        }

        /**
         * Html.
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
         * <p>The URL of the image. This parameter is required if you set the <code>PackageType</code> parameter to <code>Image</code>.</p>
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
         * <p>Initialize container configuration.</p>
         */
        public Builder initContainersConfig(java.util.List<InitContainerConfig> initContainersConfig) {
            String initContainersConfigShrink = shrink(initContainersConfig, "InitContainersConfig", "json");
            this.putBodyParameter("InitContainersConfig", initContainersConfigShrink);
            this.initContainersConfig = initContainersConfig;
            return this;
        }

        /**
         * IsStateful.
         */
        public Builder isStateful(Boolean isStateful) {
            this.putQueryParameter("IsStateful", isStateful);
            this.isStateful = isStateful;
            return this;
        }

        /**
         * <p>The arguments in the JAR package. The arguments are used to start the application container. The default startup command is <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code>.</p>
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
         * <p>The option settings in the JAR package. The settings are used to start the application container. The default startup command for application deployment is <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code>.</p>
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
         * <p>The version of the Java development kit (JDK) on which the deployment package of the application depends. The following versions are supported:</p>
         * <ul>
         * <li><strong>Open JDK 8</strong></li>
         * <li><strong>Open JDK 7</strong></li>
         * <li><strong>Dragonwell 11</strong></li>
         * <li><strong>Dragonwell 8</strong></li>
         * <li><strong>openjdk-8u191-jdk-alpine3.9</strong></li>
         * <li><strong>openjdk-7u201-jdk-alpine3.9</strong></li>
         * </ul>
         * <p>This parameter is not returned if the <strong>PackageType</strong> parameter is set to <strong>Image</strong>.</p>
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
         * <p>The logging configurations of Message Queue for Apache Kafka. Take note of the following rules:</p>
         * <ul>
         * <li><strong>kafkaEndpoint</strong>: the endpoint of the Message Queue for Apache Kafka API.</li>
         * <li><strong>kafkaInstanceId</strong>: the ID of the Message Queue for Apache Kafka instance.</li>
         * <li><strong>kafkaConfigs</strong>: One or more logging configurations of Message Queue for Apache Kafka. For information about sample values and parameters, see the request parameter <strong>KafkaLogfileConfig</strong> in this topic.</li>
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
         * <p>Container health check. If the container fails this check, it will be revoked and relaunch again. Use one of the following methods to perform the health check:</p>
         * <ul>
         * <li>Example of <strong>exec</strong>: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat/home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</code></li>
         * <li>Sample code of the <strong>httpGet</strong> method: <code>{&quot;httpGet&quot;:{&quot;path&quot;:&quot;/&quot;,&quot;port&quot;:18091,&quot;scheme&quot;:&quot;HTTP&quot;,&quot;isContainKeyWord&quot;:true,&quot;keyWord&quot;:&quot;SAE&quot;},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></li>
         * <li>Sample code of the <strong>tcpSocket</strong> method: <code>{&quot;tcpSocket&quot;:{&quot;port&quot;:18091},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></li>
         * </ul>
         * <blockquote>
         * <p>You can use only one method to perform the health check.</p>
         * </blockquote>
         * <p>The following table describes the parameters that are used in the preceding statements.</p>
         * <ul>
         * <li><strong>exec.command</strong>: the health check command.</li>
         * <li><strong>httpGet.path</strong>: the request path.</li>
         * <li><strong>httpGet.scheme</strong>: the protocol that is used to perform the health check. Valid values: <strong>HTTP</strong> and <strong>HTTPS</strong>.</li>
         * <li><strong>httpGet.isContainKeyWord</strong>: indicates whether the response contains keywords. Valid values: <strong>true</strong> and <strong>false</strong>. If this field is not returned, the advanced settings are not used.</li>
         * <li><strong>httpGet.keyWord</strong>: the custom keyword. This parameter is available only if the <strong>isContainKeyWord</strong> field is returned.</li>
         * <li><strong>tcpSocket.port</strong>: the port that is used to check the status of TCP connections.</li>
         * <li><strong>initialDelaySeconds</strong>: the delay of the health check. Default value: 10. Unit: seconds.</li>
         * <li><strong>periodSeconds</strong>: the interval at which health checks are performed. Default value: 30. Unit: seconds.</li>
         * <li><strong>timeoutSeconds</strong>: the timeout period of the health check. Default value: 1. Unit: seconds. If you set this parameter to 0 or leave this parameter empty, the timeout period is automatically set to 1 second.</li>
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
         * <p>The memory size that is required by each instance. Unit: MB. This parameter cannot be set to 0. The values of this parameter correspond to the values of the Cpu parameter:</p>
         * <ul>
         * <li>This parameter is set to <strong>1024</strong> if the Cpu parameter is set to 500 or 1000.</li>
         * <li>This parameter is set to <strong>2048</strong> if the Cpu parameter is set to 500, 1000, or 2000.</li>
         * <li>This parameter is set to <strong>4096</strong> if the Cpu parameter is set to 1000, 2000, or 4000.</li>
         * <li>This parameter is set to <strong>8192</strong> if the Cpu parameter is set to 2000, 4000, or 8,000.</li>
         * <li>This parameter is set to <strong>12288</strong> if the Cpu parameter is set to 12000.</li>
         * <li>This parameter is set to <strong>16384</strong> if the Cpu parameter is set to 4000, 8000, or 16000.</li>
         * <li>This parameter is set to <strong>24576</strong> if the Cpu parameter is set to 12000.</li>
         * <li>This parameter is set to <strong>32768</strong> if the Cpu parameter is set to 16000.</li>
         * <li>This parameter is set to <strong>65536</strong> if the Cpu parameter is set to 8000, 16000, or 32000.</li>
         * <li>This parameter is set to <strong>131072</strong> if the Cpu parameter is set to 32000.</li>
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
         * <li><strong>0</strong>: SAE built-in Nacos registry</li>
         * <li><strong>1</strong>: self-managed Nacos registry</li>
         * <li><strong>2</strong> : MSE enterprise edition Nacos registry</li>
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
         * <p>The Registry configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;instanceId&quot;:&quot;mse-cn-zvp2bh6h70r&quot;,&quot;namespace&quot;:&quot;4c0aa74f-57cb-423c-b6af-5d9f2d0e3dbd&quot;}</p>
         */
        public Builder microRegistrationConfig(String microRegistrationConfig) {
            this.putBodyParameter("MicroRegistrationConfig", microRegistrationConfig);
            this.microRegistrationConfig = microRegistrationConfig;
            return this;
        }

        /**
         * <p>Configure microservices governance</p>
         * <p>Whether to enable microservices governance (enable):</p>
         * <ul>
         * <li>true: Enable</li>
         * <li>false: Disable</li>
         * </ul>
         * <p>Configure lossless online/offline deployment (mseLosslessRule):</p>
         * <p>delayTime: Delay duration (unit: seconds)</p>
         * <p>enable: Whether to enable lossless deployment</p>
         * <ul>
         * <li><p>true: Enable</p>
         * </li>
         * <li><p>false: Disable</p>
         * </li>
         * </ul>
         * <p>notice: Whether to enable notifications</p>
         * <ul>
         * <li><p>true: Enable</p>
         * </li>
         * <li><p>false: Disable</p>
         * </li>
         * </ul>
         * <p>warmupTime: Small-traffic warm-up duration (unit: seconds)</p>
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
         * <p>It is not recommended to configure this field; configuring NasConfigs instead. This field specifies the NAS mount description. When deploying, if the configuration has not changed, you do not need to set this parameter (i.e., the MountDesc field does not need to be included in the request). If you need to clear the NAS configuration, set the value of this field to an empty string in the request (i.e., set the value of the MountDesc field to &quot;&quot;).</p>
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
         * <p>It is not recommended to configure this field; configuring NasConfigs instead. This field specifies the NAS mount point within the application&quot;s VPC. When deploying, if the configuration has not changed, you do not need to set this parameter (i.e., the MountHost field does not need to be included in the request). If you need to clear the NAS configuration, set the value of this field to an empty string in the request (i.e., set the value of the MountHost field to &quot;&quot;).</p>
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
         * <p>SAE namespace ID. Only namespaces consisting of lowercase letters and hyphens (-) are supported, and the name must start with a letter.</p>
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
         * <p>The configurations of mounting the NAS file system. Take note of the following rules:</p>
         * <ul>
         * <li><strong>mountPath</strong>: the mount path of the container.</li>
         * <li><strong>readOnly</strong>: If you set the value to <strong>false</strong>, the application has the read and write permissions.</li>
         * <li><strong>nasId</strong>: the ID of the NAS file system.</li>
         * <li><strong>mountDomain</strong>: the domain name of the mount target. For more information, see <a href="https://help.aliyun.com/document_detail/62626.html">DescribeMountTargets</a>.</li>
         * <li><strong>nasPath</strong>: the directory in the NAS file system.</li>
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
         * <p>It is not recommended to configure this field; configuring NasConfigs instead. The ID of the mounted NAS must be in the same region as the cluster. The NAS must have available mount point quota or its mount point must already be on a switch within the VPC. If this field is not specified and the mountDescs field exists, a NAS will be automatically purchased and mounted to a switch within the VPC by default.</p>
         * <p>When deploying, if the configuration has not changed, you do not need to set this parameter (i.e., the NASId field does not need to be included in the request). If you need to clear the NAS configuration, set the value of this field to an empty string in the request (i.e., set the value of the NASId field to &quot;&quot;).</p>
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
         * <p>SAE edition.</p>
         * <ul>
         * <li><p>lite: the lightweight edition.</p>
         * </li>
         * <li><p>std: the standard edition.</p>
         * </li>
         * <li><p>pro: the professional edition.</p>
         * </li>
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
         * <p>The name of the RAM role used to authenticate the user identity.</p>
         * <blockquote>
         * <p> You need to create an OpenID Connect (OIDC) identity provider (IdP) and an identity provider (IdP) for role-based single sign-on (SSO) in advance. For more information, see <a href="https://help.aliyun.com/document_detail/2331022.html">Creates an OpenID Connect (OIDC) identity provider (IdP)</a> and <a href="https://help.aliyun.com/document_detail/2331016.html">Creates an identity provider (IdP) for role-based single sign-on (SSO)</a>.</p>
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
         * <p>The Accesskey ID that the OSS reads and writes from.</p>
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
         * <p>The AccessKey Secret that the OSS reads and writes from.</p>
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
         * <p>Information of the Object Storage Service (OSS) bucket mounted to the application. The following table describes the parameters that are used in the preceding statements.</p>
         * <ul>
         * <li><p><strong>bucketName</strong>: the name of the OSS bucket.</p>
         * </li>
         * <li><p><strong>bucketPath</strong>: the directory or object in OSS. If the specified directory or object does not exist, an error is returned.</p>
         * </li>
         * <li><p><strong>mountPath</strong>: the directory of the container in SAE. If the path already exists, the newly specified path overwrites the previous one. If the path does not exist, it is created.</p>
         * </li>
         * <li><p><strong>readOnly</strong>: specifies whether to only allow the container path to read data from the OSS directory. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The container path only has read permission on the OSS directory.</li>
         * <li><strong>false</strong>: The application has read and write permissions.</li>
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
         * <p>The type of the deployment package. Take note of the following rules:</p>
         * <ul>
         * <li>If you deploy the application by using a Java Archive (JAR) package, you can set this parameter to <strong>FatJar</strong>, <strong>War</strong>, or <strong>Image</strong>.</li>
         * <li>If you deploy the application by using a PHP package, you can set this parameter to one of the following values:</li>
         * </ul>
         * <p><strong>PhpZip</strong> <strong>IMAGE_PHP_5_4</strong> <strong>IMAGE_PHP_5_4_ALPINE</strong> <strong>IMAGE_PHP_5_5</strong> <strong>IMAGE_PHP_5_5_ALPINE</strong> <strong>IMAGE_PHP_5_6</strong> <strong>IMAGE_PHP_5_6_ALPINE</strong> <strong>IMAGE_PHP_7_0</strong> <strong>IMAGE_PHP_7_0_ALPINE</strong> <strong>IMAGE_PHP_7_1</strong> <strong>IMAGE_PHP_7_1_ALPINE</strong> <strong>IMAGE_PHP_7_2</strong> <strong>IMAGE_PHP_7_2_ALPINE</strong> <strong>IMAGE_PHP_7_3</strong> <strong>IMAGE_PHP_7_3_ALPINE</strong></p>
         * <ul>
         * <li>If you deploy the application by using a <strong>Python</strong> package, you can set this parameter to <strong>PythonZip</strong> or <strong>Image</strong>:</li>
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
         * <p>The address of the deployment package. This parameter is required if you set <strong>PackageType</strong> to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
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
         * <p>The version of the deployment package. This parameter is required when the <strong>PackageType</strong> parameter is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
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
         * <p>The dependent PHP version of PHP package. Image is not supported.</p>
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
         * <p>The path on which the PHP configuration file for application monitoring is mounted. Make sure that the PHP server loads the configuration file. SAE automatically generates the corresponding configuration file. No manual operations are required.</p>
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
         * <p>The details of the PHP configuration file.</p>
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
         * <p>The path on which the PHP configuration file for application startup is mounted. Make sure that the PHP server uses this configuration file during the startup.</p>
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
         * <p>Control whether to run a script after the container is initialized. Example: {&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
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
         * <p>To controle whether to run a script before the container stops. Example: {&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
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
         * <p>The programming language for the application’s technology stack. The value options are as follows:</p>
         * <ul>
         * <li>java: Java language</li>
         * <li>php: PHP language</li>
         * <li>python: Python language</li>
         * <li>dotnet: .NET Core language</li>
         * <li>other: Multi-language, such as C++, Go, Node.js, etc.</li>
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
         * <p>The configurations of Kubernetes Service-based service registration and discovery. Take note of the following rules:</p>
         * <ul>
         * <li><strong>serviceName</strong>: the name of the Alibaba Cloud service. Format: <code>&lt;Custom content&gt;-&lt;Namespace ID&gt;</code>. <code>-&lt;Namespace ID&gt;</code> is automatically specified based on the namespace in which an application resides and cannot be changed. For example, if you select the default namespace in the China (Beijing) region, <code>-cn-beijing-default</code> is automatically specified.</li>
         * <li><strong>namespaceId</strong>: the namespace ID.</li>
         * <li><strong>portAndProtocol</strong>: the port number and protocol. Valid values of the port number: 1 to 65535. Valid values of the protocol: <strong>TCP</strong> and <strong>UDP</strong>.</li>
         * <li><strong>enable</strong>: enables the Kubernetes Service-based registration and discovery feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;serviceName&quot;:&quot;bwm-poc-sc-gateway-cn-beijing-front&quot;,&quot;namespaceId&quot;:&quot;cn-beijing:front&quot;,&quot;portAndProtocol&quot;:{&quot;18012&quot;:&quot;TCP&quot;},&quot;enable&quot;:true}</p>
         */
        public Builder pvtzDiscoverySvc(String pvtzDiscoverySvc) {
            this.putQueryParameter("PvtzDiscoverySvc", pvtzDiscoverySvc);
            this.pvtzDiscoverySvc = pvtzDiscoverySvc;
            return this;
        }

        /**
         * <p>The Python environment. Set the value to <strong>PYTHON 3.9.15</strong>.</p>
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
         * <p>The configurations for installing custom module dependencies. By default, the dependencies defined by the requirements.txt file in the root directory are installed. If the package does not contain this file and you do not configure custom dependencies in the package, specify the dependencies that you want to install in the text box.</p>
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
         * <p>Check the launch status of the container. Containers that fail health checks more than once will not receive traffic from Server Load Balancer (SLB) instances any loner. You can use the <strong>exec</strong>, <strong>httpGet</strong>, or <strong>tcpSocket</strong> method to perform health checks. For more information, see the description of the <strong>Liveness</strong> parameter.</p>
         * <blockquote>
         * <p>You can use only one method to perform the health check.</p>
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
         * <p>The number of instances when initialized.</p>
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
         * <p>The resource type. Supports NULL (default) and haiguang (haiguang server).</p>
         * 
         * <strong>example:</strong>
         * <p>UNLL</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The SAE version. Supported versions:</p>
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
         * <p>Secret Mount Description
         * Use the secret dictionaries created in the Namespace Secret Dictionary page to inject information into containers. Parameter descriptions are as follows:</p>
         * <ul>
         * <li><p>secretId: Secret instance ID. Obtain via the ListSecrets interface.</p>
         * </li>
         * <li><p>key: Key-value pair. Note: Set the parameter sae-sys-secret-all to mount all keys.</p>
         * </li>
         * <li><p>mountPath: Mount path.</p>
         * </li>
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
         * <p>Security group ID.</p>
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
         * <p>The canary tag configured for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;alicloud.service.tag&quot;:&quot;g1&quot;}</p>
         */
        public Builder serviceTags(String serviceTags) {
            this.putBodyParameter("ServiceTags", serviceTags);
            this.serviceTags = serviceTags;
            return this;
        }

        /**
         * <p>The configuration of the container.</p>
         */
        public Builder sidecarContainersConfig(java.util.List<SidecarContainerConfig> sidecarContainersConfig) {
            String sidecarContainersConfigShrink = shrink(sidecarContainersConfig, "SidecarContainersConfig", "json");
            this.putBodyParameter("SidecarContainersConfig", sidecarContainersConfigShrink);
            this.sidecarContainersConfig = sidecarContainersConfig;
            return this;
        }

        /**
         * <p>The logging configurations of Log Service.</p>
         * <ul>
         * <li>To use Log Service resources that are automatically created by SAE, set this parameter to <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</li>
         * <li>To use custom Log Service resources, set this parameter to <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</li>
         * </ul>
         * <p>The following table describes the parameters that are used in the preceding statements.</p>
         * <ul>
         * <li><strong>projectName</strong>: the name of the Log Service project.</li>
         * <li><strong>logDir</strong>: the path in which logs are stored.</li>
         * <li><strong>logType</strong>: the log type. <strong>stdout</strong>: the standard output log of the container. You can specify only one stdout value for this parameter. If you leave this parameter empty, file logs are collected.</li>
         * <li><strong>logstoreName</strong>: the name of the Logstore in Log Service.</li>
         * <li><strong>logtailName</strong>: the name of the Logtail configuration in Log Service. If you do not configure this parameter, a new Logtail configuration is created.</li>
         * </ul>
         * <p>If you do not need to modify the logging configurations when you deploy the application, configure the <strong>SlsConfigs</strong> parameter only in the first request. You do not need to include this parameter in subsequent requests. If you no longer need to use Log Service, leave the <strong>SlsConfigs</strong> parameter empty in the request.</p>
         * <blockquote>
         * <p>A Log Service project that is automatically created by SAE when you create an application is deleted when the application is deleted. Therefore, when you create an application, you cannot select a Log Service project that is automatically created by SAE for log collection.</p>
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
         * SlsLogEnvTags.
         */
        public Builder slsLogEnvTags(String slsLogEnvTags) {
            this.putQueryParameter("SlsLogEnvTags", slsLogEnvTags);
            this.slsLogEnvTags = slsLogEnvTags;
            return this;
        }

        /**
         * <p>Enable application startup probe.</p>
         * <p>Check succeeded: Indicates that the application has started successfully. If you have configured Liveness and Readiness checks, they will be performed after the application startup is successful.
         * Check failed: Indicates that the application failed to start; an exception will be reported and the application will be automatically restarted.</p>
         * <blockquote>
         * <ul>
         * <li>exec, httpGet, and tcpSocket methods are supported. For specific examples, see the Liveness parameter documentation.</li>
         * <li>Only one health check method can be selected.</li>
         * </ul>
         * </blockquote>
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
         * <p>The timeout period for a graceful shutdown. Default value: 30. Unit: seconds. Valid values: 1 to 300.</p>
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
         * <p>Time zone. Default to time zone of Asia/Shanghai.</p>
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
         * <p>The Tomcat configuration. If you want to cancel this configuration, set this parameter to &quot;&quot; or &quot;{}&quot;. The following variables are included in the configuration: Take note of the following rules:</p>
         * <ul>
         * <li><strong>port</strong>: the port number. The port number ranges from 1024 to 65535. Though the admin permissions are configured for the container, the root permissions are required to perform operations on ports whose number is smaller than 1024. Enter a value that ranges from 1025 to 65535 because the container has only the admin permissions. If you do not specify this parameter, the default port number 8080 is used.</li>
         * <li><strong>contextPath</strong>: the path. Default value: /. This value indicates the root directory.</li>
         * <li><strong>maxThreads</strong>: the maximum number of connections in the connection pool. Default value: 400.</li>
         * <li><strong>uriEncoding</strong>: the URI encoding scheme in the Tomcat container. Valid values: UTF-8, ISO-8859-1, GBK, and GB2312.************ If you do not specify this parameter, the default value <strong>ISO-8859-1</strong> is used.</li>
         * <li><strong>useBodyEncoding</strong>: specifies whether to use the encoding scheme specified in the request body for URI query parameters. Default value: true.</li>
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
         * <p>The vSwitch to which the elastic network interface (ENI) of the application instance is connected. The vSwitch must be located in the VPC specified by the VpcId parameter. The SAE namespace is bound with this vSwitch. The default value is the ID of the vSwitch that is bound to the namespace.</p>
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
         * <p>The ID of the virtual private cloud (VPC) that corresponds to the SAE namespace. In SAE, once correspondence is configured between a namespace and a VPC, the namespace cannot correspond to other VPCs. When the SAE application is created within the namespace, the application is bound with the VPC. Multiple namespaces can correspond to the same VPC. The default value is the ID of the VPC that is bound to the namespace.</p>
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
         * <p>The startup command of the WAR package. For information about how to configure the startup command, see <a href="https://help.aliyun.com/document_detail/96677.html">Configure startup commands</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>CATALINA_OPTS=&quot;$CATALINA_OPTS $Options&quot; catalina.sh run</p>
         */
        public Builder warStartOptions(String warStartOptions) {
            this.putQueryParameter("WarStartOptions", warStartOptions);
            this.warStartOptions = warStartOptions;
            return this;
        }

        /**
         * <p>The version of the Tomcat container on which the deployment package depends. Valid values:</p>
         * <ul>
         * <li><strong>apache-tomcat-7.0.91</strong></li>
         * <li><strong>apache-tomcat-8.5.42</strong></li>
         * </ul>
         * <p>This parameter is not returned if the <strong>PackageType</strong> parameter is set to <strong>Image</strong>.</p>
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

}
