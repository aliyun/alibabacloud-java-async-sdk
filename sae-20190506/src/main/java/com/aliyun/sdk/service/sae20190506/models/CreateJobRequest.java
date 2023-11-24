// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJobRequest} extends {@link RequestModel}
 *
 * <p>CreateJobRequest</p>
 */
public class CreateJobRequest extends Request {
    @Query
    @NameInMap("AcrAssumeRoleArn")
    private String acrAssumeRoleArn;

    @Body
    @NameInMap("AcrInstanceId")
    private String acrInstanceId;

    @Query
    @NameInMap("AppDescription")
    private String appDescription;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("AutoConfig")
    private Boolean autoConfig;

    @Query
    @NameInMap("BackoffLimit")
    private Long backoffLimit;

    @Query
    @NameInMap("Command")
    private String command;

    @Query
    @NameInMap("CommandArgs")
    private String commandArgs;

    @Query
    @NameInMap("ConcurrencyPolicy")
    private String concurrencyPolicy;

    @Body
    @NameInMap("ConfigMapMountDesc")
    private String configMapMountDesc;

    @Query
    @NameInMap("Cpu")
    private Integer cpu;

    @Query
    @NameInMap("CustomHostAlias")
    private String customHostAlias;

    @Query
    @NameInMap("EdasContainerVersion")
    private String edasContainerVersion;

    @Body
    @NameInMap("EnableImageAccl")
    private Boolean enableImageAccl;

    @Query
    @NameInMap("Envs")
    private String envs;

    @Query
    @NameInMap("ImagePullSecrets")
    private String imagePullSecrets;

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
    @NameInMap("Memory")
    private Integer memory;

    @Query
    @NameInMap("MountDesc")
    private String mountDesc;

    @Query
    @NameInMap("MountHost")
    private String mountHost;

    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    @Query
    @NameInMap("NasId")
    private String nasId;

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
    @NameInMap("PackageType")
    @Validation(required = true)
    private String packageType;

    @Query
    @NameInMap("PackageUrl")
    private String packageUrl;

    @Query
    @NameInMap("PackageVersion")
    private String packageVersion;

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
    @NameInMap("ProgrammingLanguage")
    private String programmingLanguage;

    @Query
    @NameInMap("Python")
    private String python;

    @Query
    @NameInMap("PythonModules")
    private String pythonModules;

    @Query
    @NameInMap("RefAppId")
    private String refAppId;

    @Query
    @NameInMap("Replicas")
    @Validation(required = true)
    private Integer replicas;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("Slice")
    private Boolean slice;

    @Query
    @NameInMap("SliceEnvs")
    private String sliceEnvs;

    @Query
    @NameInMap("SlsConfigs")
    private String slsConfigs;

    @Query
    @NameInMap("TerminationGracePeriodSeconds")
    @Validation(maximum = 6000)
    private Integer terminationGracePeriodSeconds;

    @Query
    @NameInMap("Timeout")
    private Long timeout;

    @Query
    @NameInMap("Timezone")
    private String timezone;

    @Query
    @NameInMap("TomcatConfig")
    private String tomcatConfig;

    @Query
    @NameInMap("TriggerConfig")
    private String triggerConfig;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("WarStartOptions")
    private String warStartOptions;

    @Query
    @NameInMap("WebContainer")
    private String webContainer;

    @Query
    @NameInMap("Workload")
    @Validation(required = true)
    private String workload;

    private CreateJobRequest(Builder builder) {
        super(builder);
        this.acrAssumeRoleArn = builder.acrAssumeRoleArn;
        this.acrInstanceId = builder.acrInstanceId;
        this.appDescription = builder.appDescription;
        this.appName = builder.appName;
        this.autoConfig = builder.autoConfig;
        this.backoffLimit = builder.backoffLimit;
        this.command = builder.command;
        this.commandArgs = builder.commandArgs;
        this.concurrencyPolicy = builder.concurrencyPolicy;
        this.configMapMountDesc = builder.configMapMountDesc;
        this.cpu = builder.cpu;
        this.customHostAlias = builder.customHostAlias;
        this.edasContainerVersion = builder.edasContainerVersion;
        this.enableImageAccl = builder.enableImageAccl;
        this.envs = builder.envs;
        this.imagePullSecrets = builder.imagePullSecrets;
        this.imageUrl = builder.imageUrl;
        this.jarStartArgs = builder.jarStartArgs;
        this.jarStartOptions = builder.jarStartOptions;
        this.jdk = builder.jdk;
        this.memory = builder.memory;
        this.mountDesc = builder.mountDesc;
        this.mountHost = builder.mountHost;
        this.namespaceId = builder.namespaceId;
        this.nasId = builder.nasId;
        this.ossAkId = builder.ossAkId;
        this.ossAkSecret = builder.ossAkSecret;
        this.ossMountDescs = builder.ossMountDescs;
        this.packageType = builder.packageType;
        this.packageUrl = builder.packageUrl;
        this.packageVersion = builder.packageVersion;
        this.phpConfig = builder.phpConfig;
        this.phpConfigLocation = builder.phpConfigLocation;
        this.postStart = builder.postStart;
        this.preStop = builder.preStop;
        this.programmingLanguage = builder.programmingLanguage;
        this.python = builder.python;
        this.pythonModules = builder.pythonModules;
        this.refAppId = builder.refAppId;
        this.replicas = builder.replicas;
        this.securityGroupId = builder.securityGroupId;
        this.slice = builder.slice;
        this.sliceEnvs = builder.sliceEnvs;
        this.slsConfigs = builder.slsConfigs;
        this.terminationGracePeriodSeconds = builder.terminationGracePeriodSeconds;
        this.timeout = builder.timeout;
        this.timezone = builder.timezone;
        this.tomcatConfig = builder.tomcatConfig;
        this.triggerConfig = builder.triggerConfig;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.warStartOptions = builder.warStartOptions;
        this.webContainer = builder.webContainer;
        this.workload = builder.workload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobRequest create() {
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
     * @return autoConfig
     */
    public Boolean getAutoConfig() {
        return this.autoConfig;
    }

    /**
     * @return backoffLimit
     */
    public Long getBackoffLimit() {
        return this.backoffLimit;
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
     * @return concurrencyPolicy
     */
    public String getConcurrencyPolicy() {
        return this.concurrencyPolicy;
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
     * @return edasContainerVersion
     */
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    /**
     * @return enableImageAccl
     */
    public Boolean getEnableImageAccl() {
        return this.enableImageAccl;
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
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
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
     * @return nasId
     */
    public String getNasId() {
        return this.nasId;
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
     * @return refAppId
     */
    public String getRefAppId() {
        return this.refAppId;
    }

    /**
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return slice
     */
    public Boolean getSlice() {
        return this.slice;
    }

    /**
     * @return sliceEnvs
     */
    public String getSliceEnvs() {
        return this.sliceEnvs;
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
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
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
     * @return triggerConfig
     */
    public String getTriggerConfig() {
        return this.triggerConfig;
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

    /**
     * @return workload
     */
    public String getWorkload() {
        return this.workload;
    }

    public static final class Builder extends Request.Builder<CreateJobRequest, Builder> {
        private String acrAssumeRoleArn; 
        private String acrInstanceId; 
        private String appDescription; 
        private String appName; 
        private Boolean autoConfig; 
        private Long backoffLimit; 
        private String command; 
        private String commandArgs; 
        private String concurrencyPolicy; 
        private String configMapMountDesc; 
        private Integer cpu; 
        private String customHostAlias; 
        private String edasContainerVersion; 
        private Boolean enableImageAccl; 
        private String envs; 
        private String imagePullSecrets; 
        private String imageUrl; 
        private String jarStartArgs; 
        private String jarStartOptions; 
        private String jdk; 
        private Integer memory; 
        private String mountDesc; 
        private String mountHost; 
        private String namespaceId; 
        private String nasId; 
        private String ossAkId; 
        private String ossAkSecret; 
        private String ossMountDescs; 
        private String packageType; 
        private String packageUrl; 
        private String packageVersion; 
        private String phpConfig; 
        private String phpConfigLocation; 
        private String postStart; 
        private String preStop; 
        private String programmingLanguage; 
        private String python; 
        private String pythonModules; 
        private String refAppId; 
        private Integer replicas; 
        private String securityGroupId; 
        private Boolean slice; 
        private String sliceEnvs; 
        private String slsConfigs; 
        private Integer terminationGracePeriodSeconds; 
        private Long timeout; 
        private String timezone; 
        private String tomcatConfig; 
        private String triggerConfig; 
        private String vSwitchId; 
        private String vpcId; 
        private String warStartOptions; 
        private String webContainer; 
        private String workload; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobRequest request) {
            super(request);
            this.acrAssumeRoleArn = request.acrAssumeRoleArn;
            this.acrInstanceId = request.acrInstanceId;
            this.appDescription = request.appDescription;
            this.appName = request.appName;
            this.autoConfig = request.autoConfig;
            this.backoffLimit = request.backoffLimit;
            this.command = request.command;
            this.commandArgs = request.commandArgs;
            this.concurrencyPolicy = request.concurrencyPolicy;
            this.configMapMountDesc = request.configMapMountDesc;
            this.cpu = request.cpu;
            this.customHostAlias = request.customHostAlias;
            this.edasContainerVersion = request.edasContainerVersion;
            this.enableImageAccl = request.enableImageAccl;
            this.envs = request.envs;
            this.imagePullSecrets = request.imagePullSecrets;
            this.imageUrl = request.imageUrl;
            this.jarStartArgs = request.jarStartArgs;
            this.jarStartOptions = request.jarStartOptions;
            this.jdk = request.jdk;
            this.memory = request.memory;
            this.mountDesc = request.mountDesc;
            this.mountHost = request.mountHost;
            this.namespaceId = request.namespaceId;
            this.nasId = request.nasId;
            this.ossAkId = request.ossAkId;
            this.ossAkSecret = request.ossAkSecret;
            this.ossMountDescs = request.ossMountDescs;
            this.packageType = request.packageType;
            this.packageUrl = request.packageUrl;
            this.packageVersion = request.packageVersion;
            this.phpConfig = request.phpConfig;
            this.phpConfigLocation = request.phpConfigLocation;
            this.postStart = request.postStart;
            this.preStop = request.preStop;
            this.programmingLanguage = request.programmingLanguage;
            this.python = request.python;
            this.pythonModules = request.pythonModules;
            this.refAppId = request.refAppId;
            this.replicas = request.replicas;
            this.securityGroupId = request.securityGroupId;
            this.slice = request.slice;
            this.sliceEnvs = request.sliceEnvs;
            this.slsConfigs = request.slsConfigs;
            this.terminationGracePeriodSeconds = request.terminationGracePeriodSeconds;
            this.timeout = request.timeout;
            this.timezone = request.timezone;
            this.tomcatConfig = request.tomcatConfig;
            this.triggerConfig = request.triggerConfig;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.warStartOptions = request.warStartOptions;
            this.webContainer = request.webContainer;
            this.workload = request.workload;
        } 

        /**
         * The Alibaba Cloud Resource Name (ARN) required for a RAM role to obtain images across accounts. For more information, see [Grant permissions across Alibaba Cloud accounts by using a RAM role](~~223585~~).
         */
        public Builder acrAssumeRoleArn(String acrAssumeRoleArn) {
            this.putQueryParameter("AcrAssumeRoleArn", acrAssumeRoleArn);
            this.acrAssumeRoleArn = acrAssumeRoleArn;
            return this;
        }

        /**
         * The ID of Container Registry Enterprise Edition instance N. This parameter is required when the **ImageUrl** parameter is set to the URL of an image in an ACR Enterprise Edition instance.
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.putBodyParameter("AcrInstanceId", acrInstanceId);
            this.acrInstanceId = acrInstanceId;
            return this;
        }

        /**
         * The description of the template. The description cannot exceed 1,024 characters in length.
         */
        public Builder appDescription(String appDescription) {
            this.putQueryParameter("AppDescription", appDescription);
            this.appDescription = appDescription;
            return this;
        }

        /**
         * The name of the job template. The name can contain digits, letters, and hyphens (-). The name must start with a letter and cannot exceed 36 characters in length.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * Specifies whether to automatically configure the network environment. Take note of the following rules:
         * <p>
         * 
         * *   **true**: The network environment is automatically configured by SAE when the application is created. In this case, the values of the **NamespaceId**, **VpcId**, **vSwitchId**, and **SecurityGroupId** parameters are ignored.
         * *   **false**: The network environment is manually configured based on your settings when the application is created.
         */
        public Builder autoConfig(Boolean autoConfig) {
            this.putQueryParameter("AutoConfig", autoConfig);
            this.autoConfig = autoConfig;
            return this;
        }

        /**
         * The number of times the job is retried.
         */
        public Builder backoffLimit(Long backoffLimit) {
            this.putQueryParameter("BackoffLimit", backoffLimit);
            this.backoffLimit = backoffLimit;
            return this;
        }

        /**
         * The command that is used to start the image. The command must be an existing executable object in the container. Sample statements:
         * <p>
         * 
         *     command:
         *           - echo
         *           - abc
         *           - >
         *           - file0
         * 
         * In this example, the Command parameter is set to `Command="echo", CommandArgs=["abc", ">", "file0"]`.
         */
        public Builder command(String command) {
            this.putQueryParameter("Command", command);
            this.command = command;
            return this;
        }

        /**
         * The parameters of the image startup command. The CommandArgs parameter specifies the parameters that are required for the **Command** parameter. You can specify the name in one of the following formats:
         * <p>
         * 
         * `["a","b"]`
         * 
         * In the preceding example, the CommandArgs parameter is set to `CommandArgs=["abc", ">", "file0"]`. The data type of `["abc", ">", "file0"]` must be an array of strings in the JSON format. This parameter is optional.
         */
        public Builder commandArgs(String commandArgs) {
            this.putQueryParameter("CommandArgs", commandArgs);
            this.commandArgs = commandArgs;
            return this;
        }

        /**
         * The concurrency policy of the job. Take note of the following rules:
         * <p>
         * 
         * *   **Forbid**: Prohibits concurrent running. If the previous job is not completed, no new job is created.
         * *   **Allow**: Allows concurrent running.
         * *   **Replace**: If the previous job is not completed when the time to create a new job is reached, the new job replaces the previous job.
         */
        public Builder concurrencyPolicy(String concurrencyPolicy) {
            this.putQueryParameter("ConcurrencyPolicy", concurrencyPolicy);
            this.concurrencyPolicy = concurrencyPolicy;
            return this;
        }

        /**
         * The description of the **ConfigMap** instance mounted to the application. Use configurations created on the Configuration Items page to configure containers. The following table describes the parameters that are used in the preceding statements.
         * <p>
         * 
         * *   **congfigMapId**: the ID of the ConfigMap instance. You can call the [ListNamespacedConfigMaps](~~176917~~) operation to obtain the ID.
         * *   **key**: the key.
         * 
         * > You can use the `sae-sys-configmap-all` key to mount all keys.
         * 
         * *   **mountPath**: the mount path in the container.
         */
        public Builder configMapMountDesc(String configMapMountDesc) {
            this.putBodyParameter("ConfigMapMountDesc", configMapMountDesc);
            this.configMapMountDesc = configMapMountDesc;
            return this;
        }

        /**
         * The CPU specifications that are required for each instance. Unit: millicores. You cannot set this parameter to 0. Valid values:
         * <p>
         * 
         * *   500
         * *   1000
         * *   2000
         * *   4000
         * *   8000
         * *   16000
         * *   32000
         */
        public Builder cpu(Integer cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * The custom mappings between hostnames and IP addresses in the container. Take note of the following rules:
         * <p>
         * 
         * *   **hostName**: the domain name or hostname.
         * *   **ip**: the IP address.
         */
        public Builder customHostAlias(String customHostAlias) {
            this.putQueryParameter("CustomHostAlias", customHostAlias);
            this.customHostAlias = customHostAlias;
            return this;
        }

        /**
         * The version of the container, such as Ali-Tomcat, in which an application developed based on High-speed Service Framework (HSF) is deployed.
         */
        public Builder edasContainerVersion(String edasContainerVersion) {
            this.putQueryParameter("EdasContainerVersion", edasContainerVersion);
            this.edasContainerVersion = edasContainerVersion;
            return this;
        }

        /**
         * EnableImageAccl.
         */
        public Builder enableImageAccl(Boolean enableImageAccl) {
            this.putBodyParameter("EnableImageAccl", enableImageAccl);
            this.enableImageAccl = enableImageAccl;
            return this;
        }

        /**
         * The environment variables. You can configure custom environment variables or reference a ConfigMap. If you want to reference a ConfigMap, you must first create a ConfigMap. For more information, see [CreateConfigMap](~~176914~~). Take note of the following rules:
         * <p>
         * 
         * *   Customize
         * 
         *     *   **name**: the name of the environment variable.
         *     *   **value**: the value of the environment variable.
         * 
         * *   Reference ConfigMap
         * 
         *     *   **name**: the name of the environment variable. You can reference one or all keys. If you want to reference all keys, specify `sae-sys-configmap-all-<ConfigMap name>`. Example: `sae-sys-configmap-all-test1`.
         *     *   **valueFrom**: the reference of the environment variable. Set the value to `configMapRef`.
         *     *   **configMapId**: the ConfigMap ID.
         *     *   **key**: the key. If you want to reference all keys, do not configure this parameter.
         */
        public Builder envs(String envs) {
            this.putQueryParameter("Envs", envs);
            this.envs = envs;
            return this;
        }

        /**
         * The ID of the corresponding Secret.
         */
        public Builder imagePullSecrets(String imagePullSecrets) {
            this.putQueryParameter("ImagePullSecrets", imagePullSecrets);
            this.imagePullSecrets = imagePullSecrets;
            return this;
        }

        /**
         * The URL of the image. This parameter is returned only if the **PackageType** parameter is set to **Image**.
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * The arguments in the JAR package. The arguments are used to start the application container. The default startup command is `$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS "$package_path" $JarStartArgs`.
         */
        public Builder jarStartArgs(String jarStartArgs) {
            this.putQueryParameter("JarStartArgs", jarStartArgs);
            this.jarStartArgs = jarStartArgs;
            return this;
        }

        /**
         * The option settings in the JAR package. The settings are used to start the application container. The default startup command for application deployment is `$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS "$package_path" $JarStartArgs`.
         */
        public Builder jarStartOptions(String jarStartOptions) {
            this.putQueryParameter("JarStartOptions", jarStartOptions);
            this.jarStartOptions = jarStartOptions;
            return this;
        }

        /**
         * The version of the Java development kit (JDK) on which the deployment package of the application depends. The following versions are supported:
         * <p>
         * 
         * *   **Open JDK 8**
         * *   **Open JDK 7**
         * *   **Dragonwell 11**
         * *   **Dragonwell 8**
         * *   **openjdk-8u191-jdk-alpine3.9**
         * *   **openjdk-7u201-jdk-alpine3.9**
         * 
         * This parameter is not returned if the **PackageType** parameter is set to **Image**.
         */
        public Builder jdk(String jdk) {
            this.putQueryParameter("Jdk", jdk);
            this.jdk = jdk;
            return this;
        }

        /**
         * The size of memory required by each instance. Unit: MB. You cannot set this parameter to 0. The values of this parameter correspond to the values of the Cpu parameter:
         * <p>
         * 
         * *   Set the value to 1024 when Cpu is set to 500 or 1000.
         * *   Set the value to 2048 when Cpu is set to 500, 1000 or 2000.
         * *   Set the value to 4096 when Cpu is set to 1000, 2000, or 4000.
         * *   Set the value to 8192 when Cpu is set to 2000, 4000, or 8000.
         * *   Set the value to 12288 when Cpu is set to 12000.
         * *   Set the value to 16384 when Cpu is set to 4000, 8000, or 16000.
         * *   Set the value to 24576 when Cpu is set to 12000.
         * *   Set the value to 32768 when Cpu is set to 16000.
         * *   Set the value to 65536 when Cpu is set to 8000, 16000, or 32000.
         * *   Set the value to 131072 when Cpu is set to 32000.
         */
        public Builder memory(Integer memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * The configurations for mounting the NAS file system. After the application is created, you may want to call other operations to manage the application. If you do not want to change the NAS configurations in these subsequent operations, you can omit the **MountDesc** parameter in the requests. If you want to unmount the NAS file system, you must set the **MountDesc** values in the subsequent requests to an empty string ("").
         */
        public Builder mountDesc(String mountDesc) {
            this.putQueryParameter("MountDesc", mountDesc);
            this.mountDesc = mountDesc;
            return this;
        }

        /**
         * The mount target of the NAS file system in the VPC where the application is deployed. If you do not need to modify this configuration during the deployment, configure the **MountHost** parameter only in the first request. You do not need to include this parameter in subsequent requests. If you need to remove this configuration, leave the **MountHost** parameter empty in the request.
         */
        public Builder mountHost(String mountHost) {
            this.putQueryParameter("MountHost", mountHost);
            this.mountHost = mountHost;
            return this;
        }

        /**
         * The ID of the Serverless App Engine (SAE) namespace. The ID can contain only lowercase letters and hyphens (-). It must start with a lowercase letter.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * The ID of the Apsara File Storage NAS file system. After the application is created, you may want to call other operations to manage the application. If you do not want to change the NAS configurations in these subsequent operations, you can omit the **NasId** parameter in the requests. If you want to unmount the NAS file system, you must set the **NasId** values in the subsequent requests to an empty string ("").
         */
        public Builder nasId(String nasId) {
            this.putQueryParameter("NasId", nasId);
            this.nasId = nasId;
            return this;
        }

        /**
         * The AccessKey ID that is used to read data from and write data to Object Storage Service (OSS) buckets.
         */
        public Builder ossAkId(String ossAkId) {
            this.putBodyParameter("OssAkId", ossAkId);
            this.ossAkId = ossAkId;
            return this;
        }

        /**
         * The AccessKey secret that is used to read data from and write data to OSS buckets.
         */
        public Builder ossAkSecret(String ossAkSecret) {
            this.putBodyParameter("OssAkSecret", ossAkSecret);
            this.ossAkSecret = ossAkSecret;
            return this;
        }

        /**
         * Information of the Object Storage Service (OSS) bucket mounted to the application. The following table describes the parameters that are used in the preceding statements.
         * <p>
         * 
         * *   **bucketName**: the name of the OSS bucket.
         * 
         * *   **bucketPath**: the directory or object in OSS. If the specified directory or object does not exist, an error is returned.
         * 
         * *   **mountPath**: the directory of the container in SAE. If the path already exists, the newly specified path overwrites the previous one. If the path does not exist, it is created.
         * 
         * *   **readOnly**: specifies whether to only allow the container path to read data from the OSS directory. Valid values:
         * 
         *     *   **true**: The container path only has read permission on the OSS directory.
         *     *   **false**: The application has read and write permissions.
         */
        public Builder ossMountDescs(String ossMountDescs) {
            this.putBodyParameter("OssMountDescs", ossMountDescs);
            this.ossMountDescs = ossMountDescs;
            return this;
        }

        /**
         * The type of the deployment package. Take note of the following rules:
         * <p>
         * 
         * *   If you deploy the application by using a Java Archive (JAR) package, you can set this parameter to **FatJar**, **War**, or **Image**.
         * *   If you deploy the application by using a PHP package, you can set this parameter to one of the following values:
         * 
         * **PhpZip** **IMAGE_PHP\_5\_4** **IMAGE_PHP\_5\_4\_ALPINE** **IMAGE_PHP\_5\_5** **IMAGE_PHP\_5\_5\_ALPINE** **IMAGE_PHP\_5\_6** **IMAGE_PHP\_5\_6\_ALPINE** **IMAGE_PHP\_7\_0** **IMAGE_PHP\_7\_0\_ALPINE** **IMAGE_PHP\_7\_1** **IMAGE_PHP\_7\_1\_ALPINE** **IMAGE_PHP\_7\_2** **IMAGE_PHP\_7\_2\_ALPINE** **IMAGE_PHP\_7\_3** **IMAGE_PHP\_7\_3\_ALPINE**
         * 
         * *   If you deploy the application by using a **Python** package, you can set this parameter to **PythonZip** or **Image**:
         */
        public Builder packageType(String packageType) {
            this.putQueryParameter("PackageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * The address of the deployment package. This parameter is required if you set **PackageType** to **FatJar**, **War**, or **PythonZip**.
         */
        public Builder packageUrl(String packageUrl) {
            this.putQueryParameter("PackageUrl", packageUrl);
            this.packageUrl = packageUrl;
            return this;
        }

        /**
         * The version of the deployment package. This parameter is required if you set **PackageType** to **FatJar**, **War**, or **PythonZip**.
         */
        public Builder packageVersion(String packageVersion) {
            this.putQueryParameter("PackageVersion", packageVersion);
            this.packageVersion = packageVersion;
            return this;
        }

        /**
         * The details of the PHP configuration file.
         */
        public Builder phpConfig(String phpConfig) {
            this.putBodyParameter("PhpConfig", phpConfig);
            this.phpConfig = phpConfig;
            return this;
        }

        /**
         * The path on which the PHP configuration file for application startup is mounted. Make sure that the PHP server uses this configuration file during the startup.
         */
        public Builder phpConfigLocation(String phpConfigLocation) {
            this.putQueryParameter("PhpConfigLocation", phpConfigLocation);
            this.phpConfigLocation = phpConfigLocation;
            return this;
        }

        /**
         * The script that is run immediately after the container is started. Example: `{"exec":{"command":\["sh","-c","echo hello"\]}}`
         */
        public Builder postStart(String postStart) {
            this.putQueryParameter("PostStart", postStart);
            this.postStart = postStart;
            return this;
        }

        /**
         * The script that is run before the container is stopped. Example: `{"exec":{"command":\["sh","-c","echo hello"\]}}`
         */
        public Builder preStop(String preStop) {
            this.putQueryParameter("PreStop", preStop);
            this.preStop = preStop;
            return this;
        }

        /**
         * The programming language. Valid values: **java**, **php**, **python**, and **shell**.
         */
        public Builder programmingLanguage(String programmingLanguage) {
            this.putQueryParameter("ProgrammingLanguage", programmingLanguage);
            this.programmingLanguage = programmingLanguage;
            return this;
        }

        /**
         * The Python environment. Set the value to **PYTHON 3.9.15**.
         */
        public Builder python(String python) {
            this.putQueryParameter("Python", python);
            this.python = python;
            return this;
        }

        /**
         * The configurations for installing custom module dependencies. By default, the dependencies defined by the requirements.txt file in the root directory are installed. If the package does not contain this file and you do not configure custom dependencies in the package, specify the dependencies that you want to install in the text box.
         */
        public Builder pythonModules(String pythonModules) {
            this.putQueryParameter("PythonModules", pythonModules);
            this.pythonModules = pythonModules;
            return this;
        }

        /**
         * The ID of the job that you reference.
         */
        public Builder refAppId(String refAppId) {
            this.putQueryParameter("RefAppId", refAppId);
            this.refAppId = refAppId;
            return this;
        }

        /**
         * The number of concurrent instances.
         */
        public Builder replicas(Integer replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * The ID of the security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * Specifies whether to enable job sharding.
         */
        public Builder slice(Boolean slice) {
            this.putQueryParameter("Slice", slice);
            this.slice = slice;
            return this;
        }

        /**
         * The parameters of job sharding.
         */
        public Builder sliceEnvs(String sliceEnvs) {
            this.putQueryParameter("SliceEnvs", sliceEnvs);
            this.sliceEnvs = sliceEnvs;
            return this;
        }

        /**
         * The logging configurations of Log Service.
         * <p>
         * 
         * *   To use Log Service resources that are automatically created by SAE, set this parameter to `[{"logDir":"","logType":"stdout"},{"logDir":"/tmp/a.log"}]`.
         * *   To use custom Log Service resources, set this parameter to `[{"projectName":"test-sls","logType":"stdout","logDir":"","logstoreName":"sae","logtailName":""},{"projectName":"test","logDir":"/tmp/a.log","logstoreName":"sae","logtailName":""}]`.
         * 
         * The following table describes the parameters that are used in the preceding statements.
         * 
         * *   **projectName**: the name of the Log Service project.
         * *   **logDir**: the path in which logs are stored.
         * *   **logType**: the log type. **stdout**: the standard output log of the container. You can specify only one stdout value for this parameter. If you leave this parameter empty, file logs are collected.
         * *   **logstoreName**: the name of the Logstore in Log Service.
         * *   **logtailName**: the name of the Logtail configuration in Log Service. If you do not configure this parameter, a new Logtail configuration is created.
         * 
         * If you do not need to modify the logging configurations when you deploy the application, configure the **SlsConfigs** parameter only in the first request. You do not need to include this parameter in subsequent requests. If you no longer need to use Log Service, leave the **SlsConfigs** parameter empty in the request.
         * 
         * > A Log Service project that is automatically created by SAE when you create an application is deleted when the application is deleted. Therefore, when you create an application, you cannot select a Log Service project that is automatically created by SAE for log collection.
         */
        public Builder slsConfigs(String slsConfigs) {
            this.putQueryParameter("SlsConfigs", slsConfigs);
            this.slsConfigs = slsConfigs;
            return this;
        }

        /**
         * The timeout period for a graceful shutdown. Default value: 30. Unit: seconds. Valid values: 1 to 300.
         */
        public Builder terminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
            this.putQueryParameter("TerminationGracePeriodSeconds", terminationGracePeriodSeconds);
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }

        /**
         * The timeout period. Unit: seconds.
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * The time zone. Default value: **Asia/Shanghai**.
         */
        public Builder timezone(String timezone) {
            this.putQueryParameter("Timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        /**
         * The Tomcat configuration. If you want to cancel this configuration, set this parameter to "" or "{}". The following variables are included in the configuration: Take note of the following rules:
         * <p>
         * 
         * *   **port**: the port number. The port number ranges from 1024 to 65535. Though the admin permissions are configured for the container, the root permissions are required to perform operations on ports whose number is smaller than 1024. Enter a value that ranges from 1025 to 65535 because the container has only the admin permissions. If you do not specify this parameter, the default port number 8080 is used.
         * *   **contextPath**: the path. Default value: /. This value indicates the root directory.
         * *   **maxThreads**: the maximum number of connections in the connection pool. Default value: 400.
         * *   **uriEncoding**: the URI encoding scheme in the Tomcat container. Valid values: UTF-8, ISO-8859-1, GBK, and GB2312.************ If you do not specify this parameter, the default value **ISO-8859-1** is used.
         * *   **useBodyEncoding**: specifies whether to use the encoding scheme specified in the request body for URI query parameters. Default value: true.
         */
        public Builder tomcatConfig(String tomcatConfig) {
            this.putQueryParameter("TomcatConfig", tomcatConfig);
            this.tomcatConfig = tomcatConfig;
            return this;
        }

        /**
         * TriggerConfig.
         */
        public Builder triggerConfig(String triggerConfig) {
            this.putQueryParameter("TriggerConfig", triggerConfig);
            this.triggerConfig = triggerConfig;
            return this;
        }

        /**
         * The vSwitch to which the elastic network interface (ENI) of the application instance is connected. The vSwitch must be located in the VPC specified by the VpcId parameter. The SAE namespace is bound with this vSwitch. The default value is the ID of the vSwitch that is bound to the namespace.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) that corresponds to the SAE namespace. In SAE, once correspondence is configured between a namespace and a VPC, the namespace cannot correspond to other VPCs. When the SAE application is created within the namespace, the application is bound with the VPC. Multiple namespaces can correspond to the same VPC. The default value is the ID of the VPC that is bound to the namespace.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The startup command of the WAR package. For information about how to configure the startup command, see [Configure startup commands](~~96677~~).
         */
        public Builder warStartOptions(String warStartOptions) {
            this.putQueryParameter("WarStartOptions", warStartOptions);
            this.warStartOptions = warStartOptions;
            return this;
        }

        /**
         * The version of the Tomcat container on which the deployment package depends. Valid values:
         * <p>
         * 
         * *   **apache-tomcat-7.0.91**
         * *   **apache-tomcat-8.5.42**
         * 
         * This parameter is not returned if the **PackageType** parameter is set to **Image**.
         */
        public Builder webContainer(String webContainer) {
            this.putQueryParameter("WebContainer", webContainer);
            this.webContainer = webContainer;
            return this;
        }

        /**
         * Set the value to `job`.
         */
        public Builder workload(String workload) {
            this.putQueryParameter("Workload", workload);
            this.workload = workload;
            return this;
        }

        @Override
        public CreateJobRequest build() {
            return new CreateJobRequest(this);
        } 

    } 

}
