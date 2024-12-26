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
    @com.aliyun.core.annotation.NameInMap("Dotnet")
    private String dotnet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EdasContainerVersion")
    private String edasContainerVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableCpuBurst")
    private Boolean enableCpuBurst;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableEbpf")
    private String enableEbpf;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableNewArms")
    private Boolean enableNewArms;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableSidecarResourceIsolated")
    private Boolean enableSidecarResourceIsolated;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Envs")
    private String envs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImagePullSecrets")
    private String imagePullSecrets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

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
        this.dotnet = builder.dotnet;
        this.edasContainerVersion = builder.edasContainerVersion;
        this.enableCpuBurst = builder.enableCpuBurst;
        this.enableEbpf = builder.enableEbpf;
        this.enableNewArms = builder.enableNewArms;
        this.enableSidecarResourceIsolated = builder.enableSidecarResourceIsolated;
        this.envs = builder.envs;
        this.imagePullSecrets = builder.imagePullSecrets;
        this.imageUrl = builder.imageUrl;
        this.jarStartArgs = builder.jarStartArgs;
        this.jarStartOptions = builder.jarStartOptions;
        this.jdk = builder.jdk;
        this.kafkaConfigs = builder.kafkaConfigs;
        this.liveness = builder.liveness;
        this.memory = builder.memory;
        this.microRegistration = builder.microRegistration;
        this.microRegistrationConfig = builder.microRegistrationConfig;
        this.mountDesc = builder.mountDesc;
        this.mountHost = builder.mountHost;
        this.namespaceId = builder.namespaceId;
        this.nasConfigs = builder.nasConfigs;
        this.nasId = builder.nasId;
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
        this.saeVersion = builder.saeVersion;
        this.secretMountDesc = builder.secretMountDesc;
        this.securityGroupId = builder.securityGroupId;
        this.serviceTags = builder.serviceTags;
        this.sidecarContainersConfig = builder.sidecarContainersConfig;
        this.slsConfigs = builder.slsConfigs;
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
     * @return enableNewArms
     */
    public Boolean getEnableNewArms() {
        return this.enableNewArms;
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
        private String dotnet; 
        private String edasContainerVersion; 
        private Boolean enableCpuBurst; 
        private String enableEbpf; 
        private Boolean enableNewArms; 
        private Boolean enableSidecarResourceIsolated; 
        private String envs; 
        private String imagePullSecrets; 
        private String imageUrl; 
        private String jarStartArgs; 
        private String jarStartOptions; 
        private String jdk; 
        private String kafkaConfigs; 
        private String liveness; 
        private Integer memory; 
        private String microRegistration; 
        private String microRegistrationConfig; 
        private String mountDesc; 
        private String mountHost; 
        private String namespaceId; 
        private String nasConfigs; 
        private String nasId; 
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
        private String saeVersion; 
        private String secretMountDesc; 
        private String securityGroupId; 
        private String serviceTags; 
        private java.util.List<SidecarContainerConfig> sidecarContainersConfig; 
        private String slsConfigs; 
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
            this.dotnet = request.dotnet;
            this.edasContainerVersion = request.edasContainerVersion;
            this.enableCpuBurst = request.enableCpuBurst;
            this.enableEbpf = request.enableEbpf;
            this.enableNewArms = request.enableNewArms;
            this.enableSidecarResourceIsolated = request.enableSidecarResourceIsolated;
            this.envs = request.envs;
            this.imagePullSecrets = request.imagePullSecrets;
            this.imageUrl = request.imageUrl;
            this.jarStartArgs = request.jarStartArgs;
            this.jarStartOptions = request.jarStartOptions;
            this.jdk = request.jdk;
            this.kafkaConfigs = request.kafkaConfigs;
            this.liveness = request.liveness;
            this.memory = request.memory;
            this.microRegistration = request.microRegistration;
            this.microRegistrationConfig = request.microRegistrationConfig;
            this.mountDesc = request.mountDesc;
            this.mountHost = request.mountHost;
            this.namespaceId = request.namespaceId;
            this.nasConfigs = request.nasConfigs;
            this.nasId = request.nasId;
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
            this.saeVersion = request.saeVersion;
            this.secretMountDesc = request.secretMountDesc;
            this.securityGroupId = request.securityGroupId;
            this.serviceTags = request.serviceTags;
            this.sidecarContainersConfig = request.sidecarContainersConfig;
            this.slsConfigs = request.slsConfigs;
            this.terminationGracePeriodSeconds = request.terminationGracePeriodSeconds;
            this.timezone = request.timezone;
            this.tomcatConfig = request.tomcatConfig;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.warStartOptions = request.warStartOptions;
            this.webContainer = request.webContainer;
        } 

        /**
         * <p>acs:ram::123456789012****:role/adminrole</p>
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
         * <p>cri-xxxxxx</p>
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
         * <p>This is a test description.</p>
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
         * <p>test</p>
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
         * AppSource.
         */
        public Builder appSource(String appSource) {
            this.putQueryParameter("AppSource", appSource);
            this.appSource = appSource;
            return this;
        }

        /**
         * <p>true</p>
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
         * <p>true</p>
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
         * BaseAppId.
         */
        public Builder baseAppId(String baseAppId) {
            this.putBodyParameter("BaseAppId", baseAppId);
            this.baseAppId = baseAppId;
            return this;
        }

        /**
         * <p>sleep</p>
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
         * <p>1d</p>
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
         * <p>[{&quot;configMapId&quot;:16,&quot;key&quot;:&quot;test&quot;,&quot;mountPath&quot;:&quot;/tmp&quot;}]</p>
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
         * <p>1000</p>
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
         * <p>[{&quot;hostName&quot;:&quot;samplehost&quot;,&quot;ip&quot;:&quot;127.0.0.1&quot;}]</p>
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
         * CustomImageNetworkType.
         */
        public Builder customImageNetworkType(String customImageNetworkType) {
            this.putQueryParameter("CustomImageNetworkType", customImageNetworkType);
            this.customImageNetworkType = customImageNetworkType;
            return this;
        }

        /**
         * <p>true</p>
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
         * Dotnet.
         */
        public Builder dotnet(String dotnet) {
            this.putQueryParameter("Dotnet", dotnet);
            this.dotnet = dotnet;
            return this;
        }

        /**
         * <p>3.5.3</p>
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
         * EnableCpuBurst.
         */
        public Builder enableCpuBurst(Boolean enableCpuBurst) {
            this.putQueryParameter("EnableCpuBurst", enableCpuBurst);
            this.enableCpuBurst = enableCpuBurst;
            return this;
        }

        /**
         * EnableEbpf.
         */
        public Builder enableEbpf(String enableEbpf) {
            this.putQueryParameter("EnableEbpf", enableEbpf);
            this.enableEbpf = enableEbpf;
            return this;
        }

        /**
         * EnableNewArms.
         */
        public Builder enableNewArms(Boolean enableNewArms) {
            this.putQueryParameter("EnableNewArms", enableNewArms);
            this.enableNewArms = enableNewArms;
            return this;
        }

        /**
         * EnableSidecarResourceIsolated.
         */
        public Builder enableSidecarResourceIsolated(Boolean enableSidecarResourceIsolated) {
            this.putBodyParameter("EnableSidecarResourceIsolated", enableSidecarResourceIsolated);
            this.enableSidecarResourceIsolated = enableSidecarResourceIsolated;
            return this;
        }

        /**
         * <p>[{&quot;name&quot;:&quot;envtmp&quot;,&quot;value&quot;:&quot;0&quot;}]</p>
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
         * ImagePullSecrets.
         */
        public Builder imagePullSecrets(String imagePullSecrets) {
            this.putQueryParameter("ImagePullSecrets", imagePullSecrets);
            this.imagePullSecrets = imagePullSecrets;
            return this;
        }

        /**
         * <p>registry.cn-hangzhou.aliyuncs.com/sae_test/ali_sae_test:0.0.1</p>
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
         * <p>custom-args</p>
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
         * <p>-Xms4G -Xmx4G</p>
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
         * <p>Open JDK 8</p>
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
         * KafkaConfigs.
         */
        public Builder kafkaConfigs(String kafkaConfigs) {
            this.putQueryParameter("KafkaConfigs", kafkaConfigs);
            this.kafkaConfigs = kafkaConfigs;
            return this;
        }

        /**
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
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
         * <p>1024</p>
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
         * MicroRegistration.
         */
        public Builder microRegistration(String microRegistration) {
            this.putQueryParameter("MicroRegistration", microRegistration);
            this.microRegistration = microRegistration;
            return this;
        }

        /**
         * MicroRegistrationConfig.
         */
        public Builder microRegistrationConfig(String microRegistrationConfig) {
            this.putBodyParameter("MicroRegistrationConfig", microRegistrationConfig);
            this.microRegistrationConfig = microRegistrationConfig;
            return this;
        }

        /**
         * <p>[{mountPath: &quot;/tmp&quot;, nasPath: &quot;/&quot;}]</p>
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
         * <p>example.com</p>
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
         * <p>cn-beijing:test</p>
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
         * NasConfigs.
         */
        public Builder nasConfigs(String nasConfigs) {
            this.putQueryParameter("NasConfigs", nasConfigs);
            this.nasConfigs = nasConfigs;
            return this;
        }

        /**
         * <p>KSAK****</p>
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
         * OidcRoleName.
         */
        public Builder oidcRoleName(String oidcRoleName) {
            this.putQueryParameter("OidcRoleName", oidcRoleName);
            this.oidcRoleName = oidcRoleName;
            return this;
        }

        /**
         * <p>xxxxxx</p>
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
         * <p>xxxxxx</p>
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
         * <p>[{&quot;bucketName&quot;: &quot;oss-bucket&quot;, &quot;bucketPath&quot;: &quot;data/user.data&quot;, &quot;mountPath&quot;: &quot;/usr/data/user.data&quot;, &quot;readOnly&quot;: true}]</p>
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
         * <p>FatJar</p>
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
         * <p><a href="http://myoss.oss-cn-%5C*%5C*%5C*%5C*.aliyuncs.com/my-buc/2019-06-30/%5C*%5C*%5C*%5C*.jar">http://myoss.oss-cn-\*\*\*\*.aliyuncs.com/my-buc/2019-06-30/\*\*\*\*.jar</a></p>
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
         * <p>1.0.0</p>
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
         * Php.
         */
        public Builder php(String php) {
            this.putBodyParameter("Php", php);
            this.php = php;
            return this;
        }

        /**
         * <p>/usr/local/etc/php/conf.d/arms.ini</p>
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
         * <p>k1=v1</p>
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
         * <p>/usr/local/etc/php/php.ini</p>
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
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
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
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
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
         * ProgrammingLanguage.
         */
        public Builder programmingLanguage(String programmingLanguage) {
            this.putQueryParameter("ProgrammingLanguage", programmingLanguage);
            this.programmingLanguage = programmingLanguage;
            return this;
        }

        /**
         * PvtzDiscoverySvc.
         */
        public Builder pvtzDiscoverySvc(String pvtzDiscoverySvc) {
            this.putQueryParameter("PvtzDiscoverySvc", pvtzDiscoverySvc);
            this.pvtzDiscoverySvc = pvtzDiscoverySvc;
            return this;
        }

        /**
         * Python.
         */
        public Builder python(String python) {
            this.putQueryParameter("Python", python);
            this.python = python;
            return this;
        }

        /**
         * PythonModules.
         */
        public Builder pythonModules(String pythonModules) {
            this.putQueryParameter("PythonModules", pythonModules);
            this.pythonModules = pythonModules;
            return this;
        }

        /**
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
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
         * <p>1</p>
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
         * SaeVersion.
         */
        public Builder saeVersion(String saeVersion) {
            this.putQueryParameter("SaeVersion", saeVersion);
            this.saeVersion = saeVersion;
            return this;
        }

        /**
         * SecretMountDesc.
         */
        public Builder secretMountDesc(String secretMountDesc) {
            this.putQueryParameter("SecretMountDesc", secretMountDesc);
            this.secretMountDesc = secretMountDesc;
            return this;
        }

        /**
         * <p>sg-wz969ngg2e49q5i4****</p>
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
         * ServiceTags.
         */
        public Builder serviceTags(String serviceTags) {
            this.putBodyParameter("ServiceTags", serviceTags);
            this.serviceTags = serviceTags;
            return this;
        }

        /**
         * SidecarContainersConfig.
         */
        public Builder sidecarContainersConfig(java.util.List<SidecarContainerConfig> sidecarContainersConfig) {
            String sidecarContainersConfigShrink = shrink(sidecarContainersConfig, "SidecarContainersConfig", "json");
            this.putBodyParameter("SidecarContainersConfig", sidecarContainersConfigShrink);
            this.sidecarContainersConfig = sidecarContainersConfig;
            return this;
        }

        /**
         * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
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
         * <p>30</p>
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
         * <p>Asia/Shanghai</p>
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
         * <p>{&quot;port&quot;:8080,&quot;contextPath&quot;:&quot;/&quot;,&quot;maxThreads&quot;:400,&quot;uriEncoding&quot;:&quot;ISO-8859-1&quot;,&quot;useBodyEncodingForUri&quot;:true}</p>
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
         * <p>vsw-bp12mw1f8k3jgygk9****</p>
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
         * <p>vpc-bp1aevy8sofi8mh1q****</p>
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
         * <p>CATALINA_OPTS=\&quot;$CATALINA_OPTS $Options\&quot; catalina.sh run</p>
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
         * <p>apache-tomcat-7.0.91</p>
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
