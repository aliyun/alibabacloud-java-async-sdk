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
 * {@link DeployApplicationRequest} extends {@link RequestModel}
 *
 * <p>DeployApplicationRequest</p>
 */
public class DeployApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcrAssumeRoleArn")
    private String acrAssumeRoleArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AcrInstanceId")
    private String acrInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssociateEip")
    private Boolean associateEip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoEnableApplicationScalingRule")
    private Boolean autoEnableApplicationScalingRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchWaitTime")
    private Integer batchWaitTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeOrderDesc")
    private String changeOrderDesc;

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
    private String deploy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dotnet")
    private String dotnet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EdasContainerVersion")
    private String edasContainerVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAhas")
    private String enableAhas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableCpuBurst")
    private Boolean enableCpuBurst;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableGreyTagRoute")
    private Boolean enableGreyTagRoute;

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
    @com.aliyun.core.annotation.NameInMap("MinReadyInstanceRatio")
    private Integer minReadyInstanceRatio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinReadyInstances")
    private Integer minReadyInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MountDesc")
    private String mountDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MountHost")
    private String mountHost;

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
    private Integer replicas;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SwimlanePvtzDiscoverySvc")
    private String swimlanePvtzDiscoverySvc;

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
    @com.aliyun.core.annotation.NameInMap("UpdateStrategy")
    private String updateStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarStartOptions")
    private String warStartOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebContainer")
    private String webContainer;

    private DeployApplicationRequest(Builder builder) {
        super(builder);
        this.acrAssumeRoleArn = builder.acrAssumeRoleArn;
        this.acrInstanceId = builder.acrInstanceId;
        this.appId = builder.appId;
        this.associateEip = builder.associateEip;
        this.autoEnableApplicationScalingRule = builder.autoEnableApplicationScalingRule;
        this.batchWaitTime = builder.batchWaitTime;
        this.changeOrderDesc = builder.changeOrderDesc;
        this.command = builder.command;
        this.commandArgs = builder.commandArgs;
        this.configMapMountDesc = builder.configMapMountDesc;
        this.cpu = builder.cpu;
        this.customHostAlias = builder.customHostAlias;
        this.customImageNetworkType = builder.customImageNetworkType;
        this.deploy = builder.deploy;
        this.dotnet = builder.dotnet;
        this.edasContainerVersion = builder.edasContainerVersion;
        this.enableAhas = builder.enableAhas;
        this.enableCpuBurst = builder.enableCpuBurst;
        this.enableGreyTagRoute = builder.enableGreyTagRoute;
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
        this.minReadyInstanceRatio = builder.minReadyInstanceRatio;
        this.minReadyInstances = builder.minReadyInstances;
        this.mountDesc = builder.mountDesc;
        this.mountHost = builder.mountHost;
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
        this.pvtzDiscoverySvc = builder.pvtzDiscoverySvc;
        this.python = builder.python;
        this.pythonModules = builder.pythonModules;
        this.readiness = builder.readiness;
        this.replicas = builder.replicas;
        this.secretMountDesc = builder.secretMountDesc;
        this.securityGroupId = builder.securityGroupId;
        this.serviceTags = builder.serviceTags;
        this.sidecarContainersConfig = builder.sidecarContainersConfig;
        this.slsConfigs = builder.slsConfigs;
        this.swimlanePvtzDiscoverySvc = builder.swimlanePvtzDiscoverySvc;
        this.terminationGracePeriodSeconds = builder.terminationGracePeriodSeconds;
        this.timezone = builder.timezone;
        this.tomcatConfig = builder.tomcatConfig;
        this.updateStrategy = builder.updateStrategy;
        this.vSwitchId = builder.vSwitchId;
        this.warStartOptions = builder.warStartOptions;
        this.webContainer = builder.webContainer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployApplicationRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return associateEip
     */
    public Boolean getAssociateEip() {
        return this.associateEip;
    }

    /**
     * @return autoEnableApplicationScalingRule
     */
    public Boolean getAutoEnableApplicationScalingRule() {
        return this.autoEnableApplicationScalingRule;
    }

    /**
     * @return batchWaitTime
     */
    public Integer getBatchWaitTime() {
        return this.batchWaitTime;
    }

    /**
     * @return changeOrderDesc
     */
    public String getChangeOrderDesc() {
        return this.changeOrderDesc;
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
    public String getDeploy() {
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
     * @return enableAhas
     */
    public String getEnableAhas() {
        return this.enableAhas;
    }

    /**
     * @return enableCpuBurst
     */
    public Boolean getEnableCpuBurst() {
        return this.enableCpuBurst;
    }

    /**
     * @return enableGreyTagRoute
     */
    public Boolean getEnableGreyTagRoute() {
        return this.enableGreyTagRoute;
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
     * @return minReadyInstanceRatio
     */
    public Integer getMinReadyInstanceRatio() {
        return this.minReadyInstanceRatio;
    }

    /**
     * @return minReadyInstances
     */
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
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
     * @return swimlanePvtzDiscoverySvc
     */
    public String getSwimlanePvtzDiscoverySvc() {
        return this.swimlanePvtzDiscoverySvc;
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
     * @return updateStrategy
     */
    public String getUpdateStrategy() {
        return this.updateStrategy;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
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

    public static final class Builder extends Request.Builder<DeployApplicationRequest, Builder> {
        private String acrAssumeRoleArn; 
        private String acrInstanceId; 
        private String appId; 
        private Boolean associateEip; 
        private Boolean autoEnableApplicationScalingRule; 
        private Integer batchWaitTime; 
        private String changeOrderDesc; 
        private String command; 
        private String commandArgs; 
        private String configMapMountDesc; 
        private Integer cpu; 
        private String customHostAlias; 
        private String customImageNetworkType; 
        private String deploy; 
        private String dotnet; 
        private String edasContainerVersion; 
        private String enableAhas; 
        private Boolean enableCpuBurst; 
        private Boolean enableGreyTagRoute; 
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
        private Integer minReadyInstanceRatio; 
        private Integer minReadyInstances; 
        private String mountDesc; 
        private String mountHost; 
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
        private String pvtzDiscoverySvc; 
        private String python; 
        private String pythonModules; 
        private String readiness; 
        private Integer replicas; 
        private String secretMountDesc; 
        private String securityGroupId; 
        private String serviceTags; 
        private java.util.List<SidecarContainerConfig> sidecarContainersConfig; 
        private String slsConfigs; 
        private String swimlanePvtzDiscoverySvc; 
        private Integer terminationGracePeriodSeconds; 
        private String timezone; 
        private String tomcatConfig; 
        private String updateStrategy; 
        private String vSwitchId; 
        private String warStartOptions; 
        private String webContainer; 

        private Builder() {
            super();
        } 

        private Builder(DeployApplicationRequest request) {
            super(request);
            this.acrAssumeRoleArn = request.acrAssumeRoleArn;
            this.acrInstanceId = request.acrInstanceId;
            this.appId = request.appId;
            this.associateEip = request.associateEip;
            this.autoEnableApplicationScalingRule = request.autoEnableApplicationScalingRule;
            this.batchWaitTime = request.batchWaitTime;
            this.changeOrderDesc = request.changeOrderDesc;
            this.command = request.command;
            this.commandArgs = request.commandArgs;
            this.configMapMountDesc = request.configMapMountDesc;
            this.cpu = request.cpu;
            this.customHostAlias = request.customHostAlias;
            this.customImageNetworkType = request.customImageNetworkType;
            this.deploy = request.deploy;
            this.dotnet = request.dotnet;
            this.edasContainerVersion = request.edasContainerVersion;
            this.enableAhas = request.enableAhas;
            this.enableCpuBurst = request.enableCpuBurst;
            this.enableGreyTagRoute = request.enableGreyTagRoute;
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
            this.minReadyInstanceRatio = request.minReadyInstanceRatio;
            this.minReadyInstances = request.minReadyInstances;
            this.mountDesc = request.mountDesc;
            this.mountHost = request.mountHost;
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
            this.pvtzDiscoverySvc = request.pvtzDiscoverySvc;
            this.python = request.python;
            this.pythonModules = request.pythonModules;
            this.readiness = request.readiness;
            this.replicas = request.replicas;
            this.secretMountDesc = request.secretMountDesc;
            this.securityGroupId = request.securityGroupId;
            this.serviceTags = request.serviceTags;
            this.sidecarContainersConfig = request.sidecarContainersConfig;
            this.slsConfigs = request.slsConfigs;
            this.swimlanePvtzDiscoverySvc = request.swimlanePvtzDiscoverySvc;
            this.terminationGracePeriodSeconds = request.terminationGracePeriodSeconds;
            this.timezone = request.timezone;
            this.tomcatConfig = request.tomcatConfig;
            this.updateStrategy = request.updateStrategy;
            this.vSwitchId = request.vSwitchId;
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
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
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
         * <p>Specifies whether to automatically enable an auto scaling policy for the application. Take note of the following rules:</p>
         * <ul>
         * <li><strong>true</strong>: turns on Logon-free Sharing</li>
         * <li><strong>false</strong>: turns off Logon-free Sharing</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoEnableApplicationScalingRule(Boolean autoEnableApplicationScalingRule) {
            this.putQueryParameter("AutoEnableApplicationScalingRule", autoEnableApplicationScalingRule);
            this.autoEnableApplicationScalingRule = autoEnableApplicationScalingRule;
            return this;
        }

        /**
         * <p>The interval between batches during a batch release. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder batchWaitTime(Integer batchWaitTime) {
            this.putQueryParameter("BatchWaitTime", batchWaitTime);
            this.batchWaitTime = batchWaitTime;
            return this;
        }

        /**
         * <p>The description of the change order.</p>
         * 
         * <strong>example:</strong>
         * <p>Start the application</p>
         */
        public Builder changeOrderDesc(String changeOrderDesc) {
            this.putQueryParameter("ChangeOrderDesc", changeOrderDesc);
            this.changeOrderDesc = changeOrderDesc;
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
         * Cpu.
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
         * CustomImageNetworkType.
         */
        public Builder customImageNetworkType(String customImageNetworkType) {
            this.putQueryParameter("CustomImageNetworkType", customImageNetworkType);
            this.customImageNetworkType = customImageNetworkType;
            return this;
        }

        /**
         * <p>This parameter takes effect only for applications that are in the Stopped state. If you call the <strong>DeployApplication</strong> operation to manage a running application, the application is immediately redeployed.</p>
         * <ul>
         * <li><strong>true</strong> (default): specifies that the system immediately deploys the application, enables new configurations, and pulls application instances.</li>
         * <li><strong>false</strong>: specifies that the system only enables the new configurations.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deploy(String deploy) {
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
         * <p>The version of the container, such as Ali-Tomcat, in which an application developed based on High-speed Service Framework (HSF) is deployed.</p>
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
         * <p>Indicates whether access to Application High Availability Service (AHAS) is enabled. Take note of the following rules:</p>
         * <ul>
         * <li><strong>true</strong>: Access to AHAS is enabled.</li>
         * <li><strong>false</strong>: Access to AHAS is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableAhas(String enableAhas) {
            this.putQueryParameter("EnableAhas", enableAhas);
            this.enableAhas = enableAhas;
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
         * <p>Indicates whether canary release rules are enabled. Canary release rules apply only to applications in Spring Cloud and Dubbo frameworks. Take note of the following rules:</p>
         * <ul>
         * <li><strong>true</strong>: The canary release rules are enabled.</li>
         * <li><strong>false</strong>: The canary release rules are disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableGreyTagRoute(Boolean enableGreyTagRoute) {
            this.putQueryParameter("EnableGreyTagRoute", enableGreyTagRoute);
            this.enableGreyTagRoute = enableGreyTagRoute;
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
         * <p>The environment variables. You can configure custom environment variables or reference a ConfigMap. If you want to reference a ConfigMap, you must first create a ConfigMap. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Take note of the following rules:</p>
         * <ul>
         * <li><p>Customize</p>
         * <ul>
         * <li><strong>name</strong>: the name of the environment variable.</li>
         * <li><strong>value</strong>: the value of the environment variable.</li>
         * </ul>
         * </li>
         * <li><p>Reference ConfigMap</p>
         * <ul>
         * <li><strong>name</strong>: the name of the environment variable. You can reference one or all keys. If you want to reference all keys, specify <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>. Example: <code>sae-sys-configmap-all-test1</code>.</li>
         * <li><strong>valueFrom</strong>: the reference of the environment variable. Set the value to <code>configMapRef</code>.</li>
         * <li><strong>configMapId</strong>: the ConfigMap ID.</li>
         * <li><strong>key</strong>: the key. If you want to reference all keys, do not configure this parameter.</li>
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
         * <p>The URL of the image. This parameter is returned only if the <strong>PackageType</strong> parameter is set to <strong>Image</strong>.</p>
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
         * <p>The arguments in the JAR package. The arguments are used to start the application container. The default startup command is <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>-Xms4G -Xmx4G</p>
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
         * <p>custom-option</p>
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
         * <p>The details of the availability check that was performed on the container. If the container fails this health check multiple times, the system disables and restarts the container. You can use one of the following methods to perform the health check:</p>
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
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sleep&quot;,&quot;5s&quot;]},&quot;initialDelaySeconds&quot;:10,&quot;timeoutSeconds&quot;:11}</p>
         */
        public Builder liveness(String liveness) {
            this.putQueryParameter("Liveness", liveness);
            this.liveness = liveness;
            return this;
        }

        /**
         * Memory.
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
         * <li><strong>2</strong> : MSE Nacos registry</li>
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
         * MicroRegistrationConfig.
         */
        public Builder microRegistrationConfig(String microRegistrationConfig) {
            this.putBodyParameter("MicroRegistrationConfig", microRegistrationConfig);
            this.microRegistrationConfig = microRegistrationConfig;
            return this;
        }

        /**
         * <p>The percentage of the minimum number of available instances. Take note of the following rules:</p>
         * <ul>
         * <li>If you set the value to <strong>-1</strong>, the minimum number of available instances is not determined based on this parameter. Default value: -1.</li>
         * <li>If you set the value to a number <strong>from 0 to 100</strong>, the minimum number of available instances is calculated by using the following formula: Current number of instances × (Value of MinReadyInstanceRatio × 100%). The value is the nearest integer rounded up from the calculated result. For example, if the percentage is set to <strong>50</strong>% and five instances are available, the minimum number of available instances is 3.</li>
         * </ul>
         * <blockquote>
         * <p>When both <strong>MinReadyInstance</strong> and <strong>MinReadyInstanceRatio</strong> are specified and <strong>MinReadyInstanceRatio</strong> is set to a number from 0 to 100, the value of <strong>MinReadyInstanceRatio</strong>** takes precedence. For example, if <strong>MinReadyInstances</strong> is set to **5, and <strong>MinReadyInstanceRatio</strong> is set to <strong>50</strong>, the minimum number of available instances is set to the nearest integer rounded up from the calculated result of the following formula: Current number of instances × <strong>50%</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder minReadyInstanceRatio(Integer minReadyInstanceRatio) {
            this.putQueryParameter("MinReadyInstanceRatio", minReadyInstanceRatio);
            this.minReadyInstanceRatio = minReadyInstanceRatio;
            return this;
        }

        /**
         * <p>The minimum number of available instances. Special values:</p>
         * <ul>
         * <li>If you set the value to <strong>0</strong>, business interruptions occur when the application is updated.</li>
         * <li>If you set the value to **-1**, the minimum number of available instances is automatically set to a system-recommended value. The value is the nearest integer to which the calculated result of the following formula is rounded up: Current number of instances × 25%. For example, if five instances are available, the minimum number of available instances is calculated by using the following formula: 5 × 25% = 1.25. In this case, the minimum number of available instances is 2.</li>
         * </ul>
         * <blockquote>
         * <p>Make sure that at least one instance is available during application deployment and rollback to prevent business interruptions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minReadyInstances(Integer minReadyInstances) {
            this.putQueryParameter("MinReadyInstances", minReadyInstances);
            this.minReadyInstances = minReadyInstances;
            return this;
        }

        /**
         * <p>The configurations for mounting the NAS file system. After the application is created, you may want to call other operations to manage the application. If you do not want to change the NAS configurations in these subsequent operations, you can omit the <strong>MountDesc</strong> parameter in the requests. If you want to unmount the NAS file system, you must set the <strong>MountDesc</strong> values in the subsequent requests to an empty string (&quot;&quot;).</p>
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
         * <p>The mount target of the NAS file system in the VPC where the application is deployed. If you do not need to modify this configuration during the deployment, configure the <strong>MountHost</strong> parameter only in the first request. You do not need to include this parameter in subsequent requests. If you need to remove this configuration, leave the <strong>MountHost</strong> parameter empty in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>10d3b4bc9****.com</p>
         */
        public Builder mountHost(String mountHost) {
            this.putQueryParameter("MountHost", mountHost);
            this.mountHost = mountHost;
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
         * <p>The ID of the File Storage NAS file system. After the application is created, you may want to call other operations to manage the application. If you do not want to change the NAS configurations in these subsequent operations, you can omit the <strong>NasId</strong> parameter in the requests. If you want to unmount the NAS file system, you must set the <strong>NasId</strong> values in the subsequent requests to an empty string (&quot;&quot;).</p>
         * 
         * <strong>example:</strong>
         * <p>10d3b4****</p>
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
         * <p>The AccessKey ID that is used to read data from and write data to Object Storage Service (OSS) buckets.</p>
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
         * <p>The AccessKey secret that is used to read data from and write data to OSS buckets.</p>
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
         * PackageType.
         */
        public Builder packageType(String packageType) {
            this.putQueryParameter("PackageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * <p>The address of the deployment package. This parameter is required when the <strong>PackageType</strong> parameter is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://myoss.oss-cn-hangzhou.aliyuncs.com/my-buc/2019-06-30/****.jar">http://myoss.oss-cn-hangzhou.aliyuncs.com/my-buc/2019-06-30/****.jar</a></p>
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
         * <p>1.0.1</p>
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
         * <p>The script that is run immediately after the container is started. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;\]}}</code></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
         */
        public Builder postStart(String postStart) {
            this.putQueryParameter("PostStart", postStart);
            this.postStart = postStart;
            return this;
        }

        /**
         * <p>The script that is run before the container is stopped. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;\]}}</code></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
         */
        public Builder preStop(String preStop) {
            this.putQueryParameter("PreStop", preStop);
            this.preStop = preStop;
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
         * <p>The details of the health check that was performed on the container. If the container fails this health check multiple times, the system disables and restarts the container. Containers that fail health checks cannot receive traffic from Server Load Balancer (SLB) instances. You can use the <strong>exec</strong>, <strong>httpGet</strong>, or <strong>tcpSocket</strong> method to perform health checks. For more information, see the description of the <strong>Liveness</strong> parameter.</p>
         * <blockquote>
         * <p>You can use only one method to perform the health check.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sleep&quot;,&quot;6s&quot;]},&quot;initialDelaySeconds&quot;:15,&quot;timeoutSeconds&quot;:12}</p>
         */
        public Builder readiness(String readiness) {
            this.putQueryParameter("Readiness", readiness);
            this.readiness = readiness;
            return this;
        }

        /**
         * Replicas.
         */
        public Builder replicas(Integer replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
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
         * SecurityGroupId.
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
         * SwimlanePvtzDiscoverySvc.
         */
        public Builder swimlanePvtzDiscoverySvc(String swimlanePvtzDiscoverySvc) {
            this.putBodyParameter("SwimlanePvtzDiscoverySvc", swimlanePvtzDiscoverySvc);
            this.swimlanePvtzDiscoverySvc = swimlanePvtzDiscoverySvc;
            return this;
        }

        /**
         * <p>The timeout period for a graceful shutdown. Default value: 30. Unit: seconds. Valid values: 1 to 300.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The deployment policy. If the minimum number of available instances is 1, the value of the <strong>UpdateStrategy</strong> parameter is an empty string (&quot;&quot;). If the minimum number of available instances is greater than 1, the following strategies can be configured:</p>
         * <ul>
         * <li>The application is deployed on an instance. The remaining instances are automatically classified into two release batches whose interval is set to 1. In this case, the parameter is set to <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code>.</li>
         * <li>The application is deployed on an instance. The remaining instances are manually classified into two release batches. In this case, the parameter is set to <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;manual&quot;},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code>.</li>
         * <li>All instances are automatically classified into two release batches. The application is deployed on the instances of the two batches in parallel. In this case, the parameter is set to <code>{&quot;type&quot;:&quot;BatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:0}}</code></li>
         * </ul>
         * <p>The following table describes the parameters that are used in the preceding statements.</p>
         * <ul>
         * <li><p><strong>type</strong>: the type of the release policy. Valid values: <strong>GrayBatchUpdate</strong> and <strong>BatchUpdate</strong>.</p>
         * </li>
         * <li><p><strong>batchUpdate</strong>: the phased release policy.</p>
         * <ul>
         * <li><strong>batch</strong>: the number of release batches.</li>
         * <li><strong>releaseType</strong>: the processing method for the batches. Valid values: <strong>auto</strong> and <strong>manual</strong>.</li>
         * <li><strong>batchWaitTime</strong>: the interval between release batches. Unit: seconds.</li>
         * </ul>
         * </li>
         * <li><p><strong>grayUpdate</strong>: the number of release batches in the phased release after a canary release. This parameter is returned only if the <strong>type</strong> parameter is set to <strong>GrayBatchUpdate</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</p>
         */
        public Builder updateStrategy(String updateStrategy) {
            this.putQueryParameter("UpdateStrategy", updateStrategy);
            this.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
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
        public DeployApplicationRequest build() {
            return new DeployApplicationRequest(this);
        } 

    } 

}
