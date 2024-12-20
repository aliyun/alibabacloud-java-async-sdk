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
 * {@link UpdateJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateJobRequest</p>
 */
public class UpdateJobRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackoffLimit")
    private Long backoffLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Command")
    private String command;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandArgs")
    private String commandArgs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConcurrencyPolicy")
    private String concurrencyPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigMapMountDesc")
    private String configMapMountDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomHostAlias")
    private String customHostAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EdasContainerVersion")
    private String edasContainerVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableImageAccl")
    private Boolean enableImageAccl;

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
    @com.aliyun.core.annotation.NameInMap("MountDesc")
    private String mountDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MountHost")
    private String mountHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NasId")
    private String nasId;

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
    @com.aliyun.core.annotation.NameInMap("PackageUrl")
    private String packageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageVersion")
    private String packageVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Php")
    private String php;

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
    @com.aliyun.core.annotation.NameInMap("Python")
    private String python;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PythonModules")
    private String pythonModules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefAppId")
    private String refAppId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Replicas")
    private String replicas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Slice")
    private Boolean slice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SliceEnvs")
    private String sliceEnvs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsConfigs")
    private String slsConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminationGracePeriodSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 6000)
    private Integer terminationGracePeriodSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Long timeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timezone")
    private String timezone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TomcatConfig")
    private String tomcatConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerConfig")
    private String triggerConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarStartOptions")
    private String warStartOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebContainer")
    private String webContainer;

    private UpdateJobRequest(Builder builder) {
        super(builder);
        this.acrAssumeRoleArn = builder.acrAssumeRoleArn;
        this.acrInstanceId = builder.acrInstanceId;
        this.appId = builder.appId;
        this.backoffLimit = builder.backoffLimit;
        this.command = builder.command;
        this.commandArgs = builder.commandArgs;
        this.concurrencyPolicy = builder.concurrencyPolicy;
        this.configMapMountDesc = builder.configMapMountDesc;
        this.customHostAlias = builder.customHostAlias;
        this.edasContainerVersion = builder.edasContainerVersion;
        this.enableImageAccl = builder.enableImageAccl;
        this.envs = builder.envs;
        this.imagePullSecrets = builder.imagePullSecrets;
        this.imageUrl = builder.imageUrl;
        this.jarStartArgs = builder.jarStartArgs;
        this.jarStartOptions = builder.jarStartOptions;
        this.jdk = builder.jdk;
        this.mountDesc = builder.mountDesc;
        this.mountHost = builder.mountHost;
        this.nasId = builder.nasId;
        this.ossAkId = builder.ossAkId;
        this.ossAkSecret = builder.ossAkSecret;
        this.ossMountDescs = builder.ossMountDescs;
        this.packageUrl = builder.packageUrl;
        this.packageVersion = builder.packageVersion;
        this.php = builder.php;
        this.phpConfig = builder.phpConfig;
        this.phpConfigLocation = builder.phpConfigLocation;
        this.postStart = builder.postStart;
        this.preStop = builder.preStop;
        this.programmingLanguage = builder.programmingLanguage;
        this.python = builder.python;
        this.pythonModules = builder.pythonModules;
        this.refAppId = builder.refAppId;
        this.replicas = builder.replicas;
        this.slice = builder.slice;
        this.sliceEnvs = builder.sliceEnvs;
        this.slsConfigs = builder.slsConfigs;
        this.terminationGracePeriodSeconds = builder.terminationGracePeriodSeconds;
        this.timeout = builder.timeout;
        this.timezone = builder.timezone;
        this.tomcatConfig = builder.tomcatConfig;
        this.triggerConfig = builder.triggerConfig;
        this.warStartOptions = builder.warStartOptions;
        this.webContainer = builder.webContainer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateJobRequest create() {
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
    public String getReplicas() {
        return this.replicas;
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

    public static final class Builder extends Request.Builder<UpdateJobRequest, Builder> {
        private String acrAssumeRoleArn; 
        private String acrInstanceId; 
        private String appId; 
        private Long backoffLimit; 
        private String command; 
        private String commandArgs; 
        private String concurrencyPolicy; 
        private String configMapMountDesc; 
        private String customHostAlias; 
        private String edasContainerVersion; 
        private Boolean enableImageAccl; 
        private String envs; 
        private String imagePullSecrets; 
        private String imageUrl; 
        private String jarStartArgs; 
        private String jarStartOptions; 
        private String jdk; 
        private String mountDesc; 
        private String mountHost; 
        private String nasId; 
        private String ossAkId; 
        private String ossAkSecret; 
        private String ossMountDescs; 
        private String packageUrl; 
        private String packageVersion; 
        private String php; 
        private String phpConfig; 
        private String phpConfigLocation; 
        private String postStart; 
        private String preStop; 
        private String programmingLanguage; 
        private String python; 
        private String pythonModules; 
        private String refAppId; 
        private String replicas; 
        private Boolean slice; 
        private String sliceEnvs; 
        private String slsConfigs; 
        private Integer terminationGracePeriodSeconds; 
        private Long timeout; 
        private String timezone; 
        private String tomcatConfig; 
        private String triggerConfig; 
        private String warStartOptions; 
        private String webContainer; 

        private Builder() {
            super();
        } 

        private Builder(UpdateJobRequest request) {
            super(request);
            this.acrAssumeRoleArn = request.acrAssumeRoleArn;
            this.acrInstanceId = request.acrInstanceId;
            this.appId = request.appId;
            this.backoffLimit = request.backoffLimit;
            this.command = request.command;
            this.commandArgs = request.commandArgs;
            this.concurrencyPolicy = request.concurrencyPolicy;
            this.configMapMountDesc = request.configMapMountDesc;
            this.customHostAlias = request.customHostAlias;
            this.edasContainerVersion = request.edasContainerVersion;
            this.enableImageAccl = request.enableImageAccl;
            this.envs = request.envs;
            this.imagePullSecrets = request.imagePullSecrets;
            this.imageUrl = request.imageUrl;
            this.jarStartArgs = request.jarStartArgs;
            this.jarStartOptions = request.jarStartOptions;
            this.jdk = request.jdk;
            this.mountDesc = request.mountDesc;
            this.mountHost = request.mountHost;
            this.nasId = request.nasId;
            this.ossAkId = request.ossAkId;
            this.ossAkSecret = request.ossAkSecret;
            this.ossMountDescs = request.ossMountDescs;
            this.packageUrl = request.packageUrl;
            this.packageVersion = request.packageVersion;
            this.php = request.php;
            this.phpConfig = request.phpConfig;
            this.phpConfigLocation = request.phpConfigLocation;
            this.postStart = request.postStart;
            this.preStop = request.preStop;
            this.programmingLanguage = request.programmingLanguage;
            this.python = request.python;
            this.pythonModules = request.pythonModules;
            this.refAppId = request.refAppId;
            this.replicas = request.replicas;
            this.slice = request.slice;
            this.sliceEnvs = request.sliceEnvs;
            this.slsConfigs = request.slsConfigs;
            this.terminationGracePeriodSeconds = request.terminationGracePeriodSeconds;
            this.timeout = request.timeout;
            this.timezone = request.timezone;
            this.tomcatConfig = request.tomcatConfig;
            this.triggerConfig = request.triggerConfig;
            this.warStartOptions = request.warStartOptions;
            this.webContainer = request.webContainer;
        } 

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is used to pull images across accounts. For more information, see <a href="https://help.aliyun.com/document_detail/223585.html">Grant permissions across Alibaba Cloud accounts by using a RAM role</a>.</p>
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
         * <p>The number of times the job is retried.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder backoffLimit(Long backoffLimit) {
            this.putQueryParameter("BackoffLimit", backoffLimit);
            this.backoffLimit = backoffLimit;
            return this;
        }

        /**
         * <p>The command that is used to start the image. The command must be an existing executable object in the container. Example:</p>
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
         * <p>The parameters of the image startup command. The CommandArgs parameter specifies the parameters that are required for the <strong>Command</strong> parameter. The name must meet the following format requirements:</p>
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
         * <p>The concurrency policy of the job. Valid values:</p>
         * <ul>
         * <li><strong>Forbid</strong>: Prohibits concurrent running. If the previous job is not completed, no new job is created.</li>
         * <li><strong>Allow</strong>: Allows concurrent running.</li>
         * <li><strong>Replace</strong>: If the previous job is not completed when the time to create a new job is reached, the new job replaces the previous job.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        public Builder concurrencyPolicy(String concurrencyPolicy) {
            this.putQueryParameter("ConcurrencyPolicy", concurrencyPolicy);
            this.concurrencyPolicy = concurrencyPolicy;
            return this;
        }

        /**
         * <p>The description of the <strong>ConfigMap</strong> instance mounted to the application. Use configurations created on the Configuration Items page to configure containers. The following parameters are involved:</p>
         * <ul>
         * <li><strong>congfigMapId</strong>: the ID of the ConfigMap instance. You can call the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> operation to obtain the ID.</li>
         * <li><strong>key</strong>: the key.</li>
         * </ul>
         * <blockquote>
         * <p>You can use the <code>sae-sys-configmap-all</code> key to mount all keys.</p>
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
         * <p>The custom mappings between hostnames and IP addresses in the container. Valid values:</p>
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
         * EnableImageAccl.
         */
        public Builder enableImageAccl(Boolean enableImageAccl) {
            this.putBodyParameter("EnableImageAccl", enableImageAccl);
            this.enableImageAccl = enableImageAccl;
            return this;
        }

        /**
         * <p>The environment variables. You can configure custom environment variables or reference a ConfigMap. If you want to reference a ConfigMap, you must first create a ConfigMap. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
         * <ul>
         * <li><p>Configure custom environment variables</p>
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
         * <p>The configurations for mounting the NAS file system. If you do not need to modify the NAS configurations when you deploy the application, configure <strong>MountDesc</strong> only in the first request. If you no longer need to use NAS, leave <strong>MountDesc</strong> empty in the request.</p>
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
         * <p>The ID of the Apsara File Storage NAS file system. If you do not need to modify the NAS configurations when you deploy the application, configure <strong>NasId</strong> only in the first request. If you no longer need to use NAS, leave <strong>NasId</strong> empty in the request.</p>
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
         * <p>The AccessKey ID that is used to read data from and write data to OSS.</p>
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
         * <p>The AccessKey secret that is used to read data from and write data to OSS.</p>
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
         * <p>The information about the mounted Object Storage Service (OSS) bucket. The following parameters are involved:</p>
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
         * <p>The address of the deployment package. This parameter is required if you set <strong>PackageType</strong> to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
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
         * <p>The version of the deployment package. This parameter is required if you set <strong>PackageType</strong> to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
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
         * <p>The ID of Container Registry Enterprise Edition instance N.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xxxxxx</p>
         */
        public Builder php(String php) {
            this.putBodyParameter("Php", php);
            this.php = php;
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
         * <p>The script to be run after the container is started. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;\]}}</code></p>
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
         * <p>The programming language. Valid values: <strong>java</strong>, <strong>php</strong>, <strong>python</strong>, and <strong>shell</strong>.</p>
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
         * <p>The ID of the job that you reference.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        public Builder refAppId(String refAppId) {
            this.putQueryParameter("RefAppId", refAppId);
            this.refAppId = refAppId;
            return this;
        }

        /**
         * <p>The number of concurrent instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder replicas(String replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * <p>Specifies whether to enable job sharding.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder slice(Boolean slice) {
            this.putQueryParameter("Slice", slice);
            this.slice = slice;
            return this;
        }

        /**
         * <p>The parameters of job sharding.</p>
         * 
         * <strong>example:</strong>
         * <p>[0,1,2]</p>
         */
        public Builder sliceEnvs(String sliceEnvs) {
            this.putQueryParameter("SliceEnvs", sliceEnvs);
            this.sliceEnvs = sliceEnvs;
            return this;
        }

        /**
         * <p>The configurations of Log Service.</p>
         * <ul>
         * <li>To use Log Service resources that are automatically created by SAE, set this parameter to <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</li>
         * <li>To use custom Log Service resources, set this parameter to <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</li>
         * </ul>
         * <p>The following parameters are involved:</p>
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
         * <p>The timeout period. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
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
         * <p>The Tomcat configuration. If you want to delete the configuration, set this parameter to {} or leave this parameter empty. Valid values:</p>
         * <ul>
         * <li><strong>port</strong>: the port number. The port number ranges from 1024 to 65535. Though the admin permissions are configured for the container, the root permissions are required to perform operations on ports whose number is smaller than 1024. Enter a value that ranges from 1025 to 65535 because the container has only the admin permissions. If you do not specify this parameter, the default port number 8080 is used.</li>
         * <li><strong>contextPath</strong>: the path. Default value: /. This value indicates the root directory.</li>
         * <li><strong>maxThreads</strong>: the maximum number of connections in the connection pool. Default value: 400.</li>
         * <li><strong>uriEncoding</strong>: the URI encoding scheme in the Tomcat container. Valid values: <strong>UTF-8</strong>, <strong>ISO-8859-1</strong>, <strong>GBK</strong>, and GB2312. If you do not specify this parameter, the default value <strong>ISO-8859-1</strong> is used.</li>
         * <li><strong>useBodyEncoding</strong>: specifies whether to use the encoding scheme that is specified by <strong>BodyEncoding for URL</strong>. Default value: <strong>true</strong>.</li>
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
         * TriggerConfig.
         */
        public Builder triggerConfig(String triggerConfig) {
            this.putQueryParameter("TriggerConfig", triggerConfig);
            this.triggerConfig = triggerConfig;
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
         * <p>The version of the Tomcat container on which the deployment package depends. The following versions are supported:</p>
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
        public UpdateJobRequest build() {
            return new UpdateJobRequest(this);
        } 

    } 

}
