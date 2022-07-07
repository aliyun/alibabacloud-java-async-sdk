// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployApplicationRequest} extends {@link RequestModel}
 *
 * <p>DeployApplicationRequest</p>
 */
public class DeployApplicationRequest extends Request {
    @Query
    @NameInMap("AcrAssumeRoleArn")
    private String acrAssumeRoleArn;

    @Body
    @NameInMap("AcrInstanceId")
    private String acrInstanceId;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("AssociateEip")
    private Boolean associateEip;

    @Query
    @NameInMap("AutoEnableApplicationScalingRule")
    private Boolean autoEnableApplicationScalingRule;

    @Query
    @NameInMap("BatchWaitTime")
    private Integer batchWaitTime;

    @Query
    @NameInMap("ChangeOrderDesc")
    private String changeOrderDesc;

    @Query
    @NameInMap("Command")
    private String command;

    @Query
    @NameInMap("CommandArgs")
    private String commandArgs;

    @Body
    @NameInMap("ConfigMapMountDesc")
    private String configMapMountDesc;

    @Query
    @NameInMap("CustomHostAlias")
    private String customHostAlias;

    @Query
    @NameInMap("EdasContainerVersion")
    private String edasContainerVersion;

    @Query
    @NameInMap("EnableAhas")
    private String enableAhas;

    @Query
    @NameInMap("EnableGreyTagRoute")
    private Boolean enableGreyTagRoute;

    @Query
    @NameInMap("Envs")
    private String envs;

    @Query
    @NameInMap("ImageUrl")
    private String imageUrl;

    @Query
    @NameInMap("JarStartArgs")
    private String jarStartArgs;

    @Query
    @NameInMap("JarStartOptions")
    private String jarStartOptions;

    @Query
    @NameInMap("Jdk")
    private String jdk;

    @Query
    @NameInMap("KafkaConfigs")
    private String kafkaConfigs;

    @Query
    @NameInMap("KafkaEndpoint")
    private String kafkaEndpoint;

    @Query
    @NameInMap("KafkaInstanceId")
    private String kafkaInstanceId;

    @Query
    @NameInMap("KafkaLogfileConfig")
    private String kafkaLogfileConfig;

    @Query
    @NameInMap("Liveness")
    private String liveness;

    @Query
    @NameInMap("MinReadyInstanceRatio")
    private Integer minReadyInstanceRatio;

    @Query
    @NameInMap("MinReadyInstances")
    private Integer minReadyInstances;

    @Query
    @NameInMap("MountDesc")
    private String mountDesc;

    @Query
    @NameInMap("MountHost")
    private String mountHost;

    @Query
    @NameInMap("MseFeatureConfig")
    private String mseFeatureConfig;

    @Query
    @NameInMap("NasId")
    private String nasId;

    @Query
    @NameInMap("OpenCollectToKafka")
    private Boolean openCollectToKafka;

    @Body
    @NameInMap("OssAkId")
    private String ossAkId;

    @Body
    @NameInMap("OssAkSecret")
    private String ossAkSecret;

    @Body
    @NameInMap("OssMountDescs")
    private String ossMountDescs;

    @Query
    @NameInMap("PackageUrl")
    private String packageUrl;

    @Query
    @NameInMap("PackageVersion")
    private String packageVersion;

    @Query
    @NameInMap("PhpArmsConfigLocation")
    private String phpArmsConfigLocation;

    @Body
    @NameInMap("PhpConfig")
    private String phpConfig;

    @Query
    @NameInMap("PhpConfigLocation")
    private String phpConfigLocation;

    @Query
    @NameInMap("PostStart")
    private String postStart;

    @Query
    @NameInMap("PreStop")
    private String preStop;

    @Query
    @NameInMap("Readiness")
    private String readiness;

    @Query
    @NameInMap("SlsConfigs")
    private String slsConfigs;

    @Query
    @NameInMap("TerminationGracePeriodSeconds")
    @Validation(maximum = 6000)
    private Integer terminationGracePeriodSeconds;

    @Query
    @NameInMap("Timezone")
    private String timezone;

    @Query
    @NameInMap("TomcatConfig")
    private String tomcatConfig;

    @Query
    @NameInMap("UpdateStrategy")
    private String updateStrategy;

    @Query
    @NameInMap("WarStartOptions")
    private String warStartOptions;

    @Query
    @NameInMap("WebContainer")
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
        this.customHostAlias = builder.customHostAlias;
        this.edasContainerVersion = builder.edasContainerVersion;
        this.enableAhas = builder.enableAhas;
        this.enableGreyTagRoute = builder.enableGreyTagRoute;
        this.envs = builder.envs;
        this.imageUrl = builder.imageUrl;
        this.jarStartArgs = builder.jarStartArgs;
        this.jarStartOptions = builder.jarStartOptions;
        this.jdk = builder.jdk;
        this.kafkaConfigs = builder.kafkaConfigs;
        this.kafkaEndpoint = builder.kafkaEndpoint;
        this.kafkaInstanceId = builder.kafkaInstanceId;
        this.kafkaLogfileConfig = builder.kafkaLogfileConfig;
        this.liveness = builder.liveness;
        this.minReadyInstanceRatio = builder.minReadyInstanceRatio;
        this.minReadyInstances = builder.minReadyInstances;
        this.mountDesc = builder.mountDesc;
        this.mountHost = builder.mountHost;
        this.mseFeatureConfig = builder.mseFeatureConfig;
        this.nasId = builder.nasId;
        this.openCollectToKafka = builder.openCollectToKafka;
        this.ossAkId = builder.ossAkId;
        this.ossAkSecret = builder.ossAkSecret;
        this.ossMountDescs = builder.ossMountDescs;
        this.packageUrl = builder.packageUrl;
        this.packageVersion = builder.packageVersion;
        this.phpArmsConfigLocation = builder.phpArmsConfigLocation;
        this.phpConfig = builder.phpConfig;
        this.phpConfigLocation = builder.phpConfigLocation;
        this.postStart = builder.postStart;
        this.preStop = builder.preStop;
        this.readiness = builder.readiness;
        this.slsConfigs = builder.slsConfigs;
        this.terminationGracePeriodSeconds = builder.terminationGracePeriodSeconds;
        this.timezone = builder.timezone;
        this.tomcatConfig = builder.tomcatConfig;
        this.updateStrategy = builder.updateStrategy;
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
     * @return customHostAlias
     */
    public String getCustomHostAlias() {
        return this.customHostAlias;
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
     * @return enableGreyTagRoute
     */
    public Boolean getEnableGreyTagRoute() {
        return this.enableGreyTagRoute;
    }

    /**
     * @return envs
     */
    public String getEnvs() {
        return this.envs;
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
     * @return kafkaEndpoint
     */
    public String getKafkaEndpoint() {
        return this.kafkaEndpoint;
    }

    /**
     * @return kafkaInstanceId
     */
    public String getKafkaInstanceId() {
        return this.kafkaInstanceId;
    }

    /**
     * @return kafkaLogfileConfig
     */
    public String getKafkaLogfileConfig() {
        return this.kafkaLogfileConfig;
    }

    /**
     * @return liveness
     */
    public String getLiveness() {
        return this.liveness;
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
     * @return mseFeatureConfig
     */
    public String getMseFeatureConfig() {
        return this.mseFeatureConfig;
    }

    /**
     * @return nasId
     */
    public String getNasId() {
        return this.nasId;
    }

    /**
     * @return openCollectToKafka
     */
    public Boolean getOpenCollectToKafka() {
        return this.openCollectToKafka;
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
     * @return readiness
     */
    public String getReadiness() {
        return this.readiness;
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
     * @return updateStrategy
     */
    public String getUpdateStrategy() {
        return this.updateStrategy;
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
        private String customHostAlias; 
        private String edasContainerVersion; 
        private String enableAhas; 
        private Boolean enableGreyTagRoute; 
        private String envs; 
        private String imageUrl; 
        private String jarStartArgs; 
        private String jarStartOptions; 
        private String jdk; 
        private String kafkaConfigs; 
        private String kafkaEndpoint; 
        private String kafkaInstanceId; 
        private String kafkaLogfileConfig; 
        private String liveness; 
        private Integer minReadyInstanceRatio; 
        private Integer minReadyInstances; 
        private String mountDesc; 
        private String mountHost; 
        private String mseFeatureConfig; 
        private String nasId; 
        private Boolean openCollectToKafka; 
        private String ossAkId; 
        private String ossAkSecret; 
        private String ossMountDescs; 
        private String packageUrl; 
        private String packageVersion; 
        private String phpArmsConfigLocation; 
        private String phpConfig; 
        private String phpConfigLocation; 
        private String postStart; 
        private String preStop; 
        private String readiness; 
        private String slsConfigs; 
        private Integer terminationGracePeriodSeconds; 
        private String timezone; 
        private String tomcatConfig; 
        private String updateStrategy; 
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
            this.customHostAlias = request.customHostAlias;
            this.edasContainerVersion = request.edasContainerVersion;
            this.enableAhas = request.enableAhas;
            this.enableGreyTagRoute = request.enableGreyTagRoute;
            this.envs = request.envs;
            this.imageUrl = request.imageUrl;
            this.jarStartArgs = request.jarStartArgs;
            this.jarStartOptions = request.jarStartOptions;
            this.jdk = request.jdk;
            this.kafkaConfigs = request.kafkaConfigs;
            this.kafkaEndpoint = request.kafkaEndpoint;
            this.kafkaInstanceId = request.kafkaInstanceId;
            this.kafkaLogfileConfig = request.kafkaLogfileConfig;
            this.liveness = request.liveness;
            this.minReadyInstanceRatio = request.minReadyInstanceRatio;
            this.minReadyInstances = request.minReadyInstances;
            this.mountDesc = request.mountDesc;
            this.mountHost = request.mountHost;
            this.mseFeatureConfig = request.mseFeatureConfig;
            this.nasId = request.nasId;
            this.openCollectToKafka = request.openCollectToKafka;
            this.ossAkId = request.ossAkId;
            this.ossAkSecret = request.ossAkSecret;
            this.ossMountDescs = request.ossMountDescs;
            this.packageUrl = request.packageUrl;
            this.packageVersion = request.packageVersion;
            this.phpArmsConfigLocation = request.phpArmsConfigLocation;
            this.phpConfig = request.phpConfig;
            this.phpConfigLocation = request.phpConfigLocation;
            this.postStart = request.postStart;
            this.preStop = request.preStop;
            this.readiness = request.readiness;
            this.slsConfigs = request.slsConfigs;
            this.terminationGracePeriodSeconds = request.terminationGracePeriodSeconds;
            this.timezone = request.timezone;
            this.tomcatConfig = request.tomcatConfig;
            this.updateStrategy = request.updateStrategy;
            this.warStartOptions = request.warStartOptions;
            this.webContainer = request.webContainer;
        } 

        /**
         * AcrAssumeRoleArn.
         */
        public Builder acrAssumeRoleArn(String acrAssumeRoleArn) {
            this.putQueryParameter("AcrAssumeRoleArn", acrAssumeRoleArn);
            this.acrAssumeRoleArn = acrAssumeRoleArn;
            return this;
        }

        /**
         * ACR 企业版实例 ID
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.putBodyParameter("AcrInstanceId", acrInstanceId);
            this.acrInstanceId = acrInstanceId;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 是否绑定EIP
         */
        public Builder associateEip(Boolean associateEip) {
            this.putBodyParameter("AssociateEip", associateEip);
            this.associateEip = associateEip;
            return this;
        }

        /**
         * AutoEnableApplicationScalingRule.
         */
        public Builder autoEnableApplicationScalingRule(Boolean autoEnableApplicationScalingRule) {
            this.putQueryParameter("AutoEnableApplicationScalingRule", autoEnableApplicationScalingRule);
            this.autoEnableApplicationScalingRule = autoEnableApplicationScalingRule;
            return this;
        }

        /**
         * BatchWaitTime.
         */
        public Builder batchWaitTime(Integer batchWaitTime) {
            this.putQueryParameter("BatchWaitTime", batchWaitTime);
            this.batchWaitTime = batchWaitTime;
            return this;
        }

        /**
         * ChangeOrderDesc.
         */
        public Builder changeOrderDesc(String changeOrderDesc) {
            this.putQueryParameter("ChangeOrderDesc", changeOrderDesc);
            this.changeOrderDesc = changeOrderDesc;
            return this;
        }

        /**
         * Command.
         */
        public Builder command(String command) {
            this.putQueryParameter("Command", command);
            this.command = command;
            return this;
        }

        /**
         * CommandArgs.
         */
        public Builder commandArgs(String commandArgs) {
            this.putQueryParameter("CommandArgs", commandArgs);
            this.commandArgs = commandArgs;
            return this;
        }

        /**
         * ConfigMapMountDesc.
         */
        public Builder configMapMountDesc(String configMapMountDesc) {
            this.putBodyParameter("ConfigMapMountDesc", configMapMountDesc);
            this.configMapMountDesc = configMapMountDesc;
            return this;
        }

        /**
         * CustomHostAlias.
         */
        public Builder customHostAlias(String customHostAlias) {
            this.putQueryParameter("CustomHostAlias", customHostAlias);
            this.customHostAlias = customHostAlias;
            return this;
        }

        /**
         * EdasContainerVersion.
         */
        public Builder edasContainerVersion(String edasContainerVersion) {
            this.putQueryParameter("EdasContainerVersion", edasContainerVersion);
            this.edasContainerVersion = edasContainerVersion;
            return this;
        }

        /**
         * EnableAhas.
         */
        public Builder enableAhas(String enableAhas) {
            this.putQueryParameter("EnableAhas", enableAhas);
            this.enableAhas = enableAhas;
            return this;
        }

        /**
         * 是否开启发布流量灰度规则
         */
        public Builder enableGreyTagRoute(Boolean enableGreyTagRoute) {
            this.putQueryParameter("EnableGreyTagRoute", enableGreyTagRoute);
            this.enableGreyTagRoute = enableGreyTagRoute;
            return this;
        }

        /**
         * Envs.
         */
        public Builder envs(String envs) {
            this.putQueryParameter("Envs", envs);
            this.envs = envs;
            return this;
        }

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * JarStartArgs.
         */
        public Builder jarStartArgs(String jarStartArgs) {
            this.putQueryParameter("JarStartArgs", jarStartArgs);
            this.jarStartArgs = jarStartArgs;
            return this;
        }

        /**
         * JarStartOptions.
         */
        public Builder jarStartOptions(String jarStartOptions) {
            this.putQueryParameter("JarStartOptions", jarStartOptions);
            this.jarStartOptions = jarStartOptions;
            return this;
        }

        /**
         * Jdk.
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
         * KafkaEndpoint.
         */
        public Builder kafkaEndpoint(String kafkaEndpoint) {
            this.putQueryParameter("KafkaEndpoint", kafkaEndpoint);
            this.kafkaEndpoint = kafkaEndpoint;
            return this;
        }

        /**
         * KafkaInstanceId.
         */
        public Builder kafkaInstanceId(String kafkaInstanceId) {
            this.putQueryParameter("KafkaInstanceId", kafkaInstanceId);
            this.kafkaInstanceId = kafkaInstanceId;
            return this;
        }

        /**
         * KafkaLogfileConfig.
         */
        public Builder kafkaLogfileConfig(String kafkaLogfileConfig) {
            this.putQueryParameter("KafkaLogfileConfig", kafkaLogfileConfig);
            this.kafkaLogfileConfig = kafkaLogfileConfig;
            return this;
        }

        /**
         * Liveness.
         */
        public Builder liveness(String liveness) {
            this.putQueryParameter("Liveness", liveness);
            this.liveness = liveness;
            return this;
        }

        /**
         * MinReadyInstanceRatio.
         */
        public Builder minReadyInstanceRatio(Integer minReadyInstanceRatio) {
            this.putQueryParameter("MinReadyInstanceRatio", minReadyInstanceRatio);
            this.minReadyInstanceRatio = minReadyInstanceRatio;
            return this;
        }

        /**
         * MinReadyInstances.
         */
        public Builder minReadyInstances(Integer minReadyInstances) {
            this.putQueryParameter("MinReadyInstances", minReadyInstances);
            this.minReadyInstances = minReadyInstances;
            return this;
        }

        /**
         * MountDesc.
         */
        public Builder mountDesc(String mountDesc) {
            this.putQueryParameter("MountDesc", mountDesc);
            this.mountDesc = mountDesc;
            return this;
        }

        /**
         * MountHost.
         */
        public Builder mountHost(String mountHost) {
            this.putQueryParameter("MountHost", mountHost);
            this.mountHost = mountHost;
            return this;
        }

        /**
         * MseFeatureConfig.
         */
        public Builder mseFeatureConfig(String mseFeatureConfig) {
            this.putQueryParameter("MseFeatureConfig", mseFeatureConfig);
            this.mseFeatureConfig = mseFeatureConfig;
            return this;
        }

        /**
         * NasId.
         */
        public Builder nasId(String nasId) {
            this.putQueryParameter("NasId", nasId);
            this.nasId = nasId;
            return this;
        }

        /**
         * OpenCollectToKafka.
         */
        public Builder openCollectToKafka(Boolean openCollectToKafka) {
            this.putQueryParameter("OpenCollectToKafka", openCollectToKafka);
            this.openCollectToKafka = openCollectToKafka;
            return this;
        }

        /**
         * OSS使用的AKID
         */
        public Builder ossAkId(String ossAkId) {
            this.putBodyParameter("OssAkId", ossAkId);
            this.ossAkId = ossAkId;
            return this;
        }

        /**
         * OSS AKID对应的secret
         */
        public Builder ossAkSecret(String ossAkSecret) {
            this.putBodyParameter("OssAkSecret", ossAkSecret);
            this.ossAkSecret = ossAkSecret;
            return this;
        }

        /**
         * OSS挂载描述信息
         */
        public Builder ossMountDescs(String ossMountDescs) {
            this.putBodyParameter("OssMountDescs", ossMountDescs);
            this.ossMountDescs = ossMountDescs;
            return this;
        }

        /**
         * PackageUrl.
         */
        public Builder packageUrl(String packageUrl) {
            this.putQueryParameter("PackageUrl", packageUrl);
            this.packageUrl = packageUrl;
            return this;
        }

        /**
         * PackageVersion.
         */
        public Builder packageVersion(String packageVersion) {
            this.putQueryParameter("PackageVersion", packageVersion);
            this.packageVersion = packageVersion;
            return this;
        }

        /**
         * PhpArmsConfigLocation.
         */
        public Builder phpArmsConfigLocation(String phpArmsConfigLocation) {
            this.putQueryParameter("PhpArmsConfigLocation", phpArmsConfigLocation);
            this.phpArmsConfigLocation = phpArmsConfigLocation;
            return this;
        }

        /**
         * PhpConfig.
         */
        public Builder phpConfig(String phpConfig) {
            this.putBodyParameter("PhpConfig", phpConfig);
            this.phpConfig = phpConfig;
            return this;
        }

        /**
         * PhpConfigLocation.
         */
        public Builder phpConfigLocation(String phpConfigLocation) {
            this.putQueryParameter("PhpConfigLocation", phpConfigLocation);
            this.phpConfigLocation = phpConfigLocation;
            return this;
        }

        /**
         * PostStart.
         */
        public Builder postStart(String postStart) {
            this.putQueryParameter("PostStart", postStart);
            this.postStart = postStart;
            return this;
        }

        /**
         * PreStop.
         */
        public Builder preStop(String preStop) {
            this.putQueryParameter("PreStop", preStop);
            this.preStop = preStop;
            return this;
        }

        /**
         * Readiness.
         */
        public Builder readiness(String readiness) {
            this.putQueryParameter("Readiness", readiness);
            this.readiness = readiness;
            return this;
        }

        /**
         * SlsConfigs.
         */
        public Builder slsConfigs(String slsConfigs) {
            this.putQueryParameter("SlsConfigs", slsConfigs);
            this.slsConfigs = slsConfigs;
            return this;
        }

        /**
         * TerminationGracePeriodSeconds.
         */
        public Builder terminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
            this.putQueryParameter("TerminationGracePeriodSeconds", terminationGracePeriodSeconds);
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }

        /**
         * Timezone.
         */
        public Builder timezone(String timezone) {
            this.putQueryParameter("Timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        /**
         * TomcatConfig.
         */
        public Builder tomcatConfig(String tomcatConfig) {
            this.putQueryParameter("TomcatConfig", tomcatConfig);
            this.tomcatConfig = tomcatConfig;
            return this;
        }

        /**
         * UpdateStrategy.
         */
        public Builder updateStrategy(String updateStrategy) {
            this.putQueryParameter("UpdateStrategy", updateStrategy);
            this.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * WarStartOptions.
         */
        public Builder warStartOptions(String warStartOptions) {
            this.putQueryParameter("WarStartOptions", warStartOptions);
            this.warStartOptions = warStartOptions;
            return this;
        }

        /**
         * WebContainer.
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
