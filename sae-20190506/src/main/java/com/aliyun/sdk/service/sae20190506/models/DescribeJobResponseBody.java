// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobResponseBody</p>
 */
public class DescribeJobResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
    private String traceId;

    private DescribeJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: The call was successful.
         * *   **3xx**: The call was redirected.
         * *   **4xx**: The call failed.
         * *   **5xx**: A server error occurred.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the application.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned. Take note of the following rules:
         * <p>
         * 
         * *   If the call is successful, **ErrorCode** is not returned.
         * *   If the call fails, **ErrorCode** is returned. For more information, see the "**Error codes**" section in this topic.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the configurations of an application were obtained. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The trace ID that is used to query the details of the request.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeJobResponseBody build() {
            return new DescribeJobResponseBody(this);
        } 

    } 

    public static class ConfigMapMountDesc extends TeaModel {
        @NameInMap("ConfigMapId")
        private Long configMapId;

        @NameInMap("ConfigMapName")
        private String configMapName;

        @NameInMap("Key")
        private String key;

        @NameInMap("MountPath")
        private String mountPath;

        private ConfigMapMountDesc(Builder builder) {
            this.configMapId = builder.configMapId;
            this.configMapName = builder.configMapName;
            this.key = builder.key;
            this.mountPath = builder.mountPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigMapMountDesc create() {
            return builder().build();
        }

        /**
         * @return configMapId
         */
        public Long getConfigMapId() {
            return this.configMapId;
        }

        /**
         * @return configMapName
         */
        public String getConfigMapName() {
            return this.configMapName;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        public static final class Builder {
            private Long configMapId; 
            private String configMapName; 
            private String key; 
            private String mountPath; 

            /**
             * The ConfigMap ID.
             */
            public Builder configMapId(Long configMapId) {
                this.configMapId = configMapId;
                return this;
            }

            /**
             * The ConfigMap name.
             */
            public Builder configMapName(String configMapName) {
                this.configMapName = configMapName;
                return this;
            }

            /**
             * The key-value pair that is stored in the ConfigMap.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The path on which the NAS file system is mounted.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            public ConfigMapMountDesc build() {
                return new ConfigMapMountDesc(this);
            } 

        } 

    }
    public static class MountDesc extends TeaModel {
        @NameInMap("MountPath")
        private String mountPath;

        @NameInMap("NasPath")
        private String nasPath;

        private MountDesc(Builder builder) {
            this.mountPath = builder.mountPath;
            this.nasPath = builder.nasPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountDesc create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return nasPath
         */
        public String getNasPath() {
            return this.nasPath;
        }

        public static final class Builder {
            private String mountPath; 
            private String nasPath; 

            /**
             * The path on which the NAS file system is mounted.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * The directory in the NAS file system.
             */
            public Builder nasPath(String nasPath) {
                this.nasPath = nasPath;
                return this;
            }

            public MountDesc build() {
                return new MountDesc(this);
            } 

        } 

    }
    public static class OssMountDescs extends TeaModel {
        @NameInMap("bucketName")
        private String bucketName;

        @NameInMap("bucketPath")
        private String bucketPath;

        @NameInMap("mountPath")
        private String mountPath;

        @NameInMap("readOnly")
        private Boolean readOnly;

        private OssMountDescs(Builder builder) {
            this.bucketName = builder.bucketName;
            this.bucketPath = builder.bucketPath;
            this.mountPath = builder.mountPath;
            this.readOnly = builder.readOnly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssMountDescs create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return bucketPath
         */
        public String getBucketPath() {
            return this.bucketPath;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public static final class Builder {
            private String bucketName; 
            private String bucketPath; 
            private String mountPath; 
            private Boolean readOnly; 

            /**
             * The bucket name.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * The directory or object in OSS. If the specified directory or object does not exist, an error is returned.
             */
            public Builder bucketPath(String bucketPath) {
                this.bucketPath = bucketPath;
                return this;
            }

            /**
             * The path of the container in SAE. The parameter value that you specified overwrites the original value. If the specified path does not exist, SAE automatically creates the path.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * Indicates whether the application can use the container path to read data from or write data to resources in the directory of the OSS bucket. Valid values:
             * <p>
             * 
             * *   **true**: The application has the read-only permission.
             * *   **false**: The application has read and write permissions.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            public OssMountDescs build() {
                return new OssMountDescs(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AcrAssumeRoleArn")
        private String acrAssumeRoleArn;

        @NameInMap("AcrInstanceId")
        private String acrInstanceId;

        @NameInMap("AppDescription")
        private String appDescription;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("BackoffLimit")
        private Long backoffLimit;

        @NameInMap("Command")
        private String command;

        @NameInMap("CommandArgs")
        private String commandArgs;

        @NameInMap("ConcurrencyPolicy")
        private String concurrencyPolicy;

        @NameInMap("ConfigMapMountDesc")
        private java.util.List < ConfigMapMountDesc> configMapMountDesc;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CustomHostAlias")
        private String customHostAlias;

        @NameInMap("EdasContainerVersion")
        private String edasContainerVersion;

        @NameInMap("Envs")
        private String envs;

        @NameInMap("ImagePullSecrets")
        private String imagePullSecrets;

        @NameInMap("ImageUrl")
        private String imageUrl;

        @NameInMap("JarStartArgs")
        private String jarStartArgs;

        @NameInMap("JarStartOptions")
        private String jarStartOptions;

        @NameInMap("Jdk")
        private String jdk;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("MountDesc")
        private java.util.List < MountDesc> mountDesc;

        @NameInMap("MountHost")
        private String mountHost;

        @NameInMap("NamespaceId")
        private String namespaceId;

        @NameInMap("NasConfigs")
        private String nasConfigs;

        @NameInMap("NasId")
        private String nasId;

        @NameInMap("OssAkId")
        private String ossAkId;

        @NameInMap("OssAkSecret")
        private String ossAkSecret;

        @NameInMap("OssMountDescs")
        private java.util.List < OssMountDescs> ossMountDescs;

        @NameInMap("PackageType")
        private String packageType;

        @NameInMap("PackageUrl")
        private String packageUrl;

        @NameInMap("PackageVersion")
        private String packageVersion;

        @NameInMap("PhpConfig")
        private String phpConfig;

        @NameInMap("PhpConfigLocation")
        private String phpConfigLocation;

        @NameInMap("PostStart")
        private String postStart;

        @NameInMap("PreStop")
        private String preStop;

        @NameInMap("ProgrammingLanguage")
        private String programmingLanguage;

        @NameInMap("PublicWebHookUrls")
        private java.util.List < String > publicWebHookUrls;

        @NameInMap("Python")
        private String python;

        @NameInMap("PythonModules")
        private String pythonModules;

        @NameInMap("RefAppId")
        private String refAppId;

        @NameInMap("RefedAppIds")
        private java.util.List < String > refedAppIds;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Replicas")
        private Integer replicas;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("Slice")
        private Boolean slice;

        @NameInMap("SliceEnvs")
        private String sliceEnvs;

        @NameInMap("SlsConfigs")
        private String slsConfigs;

        @NameInMap("Suspend")
        private Boolean suspend;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("TerminationGracePeriodSeconds")
        private Integer terminationGracePeriodSeconds;

        @NameInMap("Timeout")
        private Long timeout;

        @NameInMap("Timezone")
        private String timezone;

        @NameInMap("TomcatConfig")
        private String tomcatConfig;

        @NameInMap("TriggerConfig")
        private String triggerConfig;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcWebHookUrls")
        private java.util.List < String > vpcWebHookUrls;

        @NameInMap("WarStartOptions")
        private String warStartOptions;

        @NameInMap("WebContainer")
        private String webContainer;

        private Data(Builder builder) {
            this.acrAssumeRoleArn = builder.acrAssumeRoleArn;
            this.acrInstanceId = builder.acrInstanceId;
            this.appDescription = builder.appDescription;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.backoffLimit = builder.backoffLimit;
            this.command = builder.command;
            this.commandArgs = builder.commandArgs;
            this.concurrencyPolicy = builder.concurrencyPolicy;
            this.configMapMountDesc = builder.configMapMountDesc;
            this.cpu = builder.cpu;
            this.customHostAlias = builder.customHostAlias;
            this.edasContainerVersion = builder.edasContainerVersion;
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
            this.nasConfigs = builder.nasConfigs;
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
            this.publicWebHookUrls = builder.publicWebHookUrls;
            this.python = builder.python;
            this.pythonModules = builder.pythonModules;
            this.refAppId = builder.refAppId;
            this.refedAppIds = builder.refedAppIds;
            this.regionId = builder.regionId;
            this.replicas = builder.replicas;
            this.securityGroupId = builder.securityGroupId;
            this.slice = builder.slice;
            this.sliceEnvs = builder.sliceEnvs;
            this.slsConfigs = builder.slsConfigs;
            this.suspend = builder.suspend;
            this.tags = builder.tags;
            this.terminationGracePeriodSeconds = builder.terminationGracePeriodSeconds;
            this.timeout = builder.timeout;
            this.timezone = builder.timezone;
            this.tomcatConfig = builder.tomcatConfig;
            this.triggerConfig = builder.triggerConfig;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.vpcWebHookUrls = builder.vpcWebHookUrls;
            this.warStartOptions = builder.warStartOptions;
            this.webContainer = builder.webContainer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
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
        public java.util.List < ConfigMapMountDesc> getConfigMapMountDesc() {
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
        public java.util.List < MountDesc> getMountDesc() {
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
        public java.util.List < OssMountDescs> getOssMountDescs() {
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
         * @return publicWebHookUrls
         */
        public java.util.List < String > getPublicWebHookUrls() {
            return this.publicWebHookUrls;
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
         * @return refedAppIds
         */
        public java.util.List < String > getRefedAppIds() {
            return this.refedAppIds;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return suspend
         */
        public Boolean getSuspend() {
            return this.suspend;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
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
         * @return vpcWebHookUrls
         */
        public java.util.List < String > getVpcWebHookUrls() {
            return this.vpcWebHookUrls;
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

        public static final class Builder {
            private String acrAssumeRoleArn; 
            private String acrInstanceId; 
            private String appDescription; 
            private String appId; 
            private String appName; 
            private Long backoffLimit; 
            private String command; 
            private String commandArgs; 
            private String concurrencyPolicy; 
            private java.util.List < ConfigMapMountDesc> configMapMountDesc; 
            private Integer cpu; 
            private String customHostAlias; 
            private String edasContainerVersion; 
            private String envs; 
            private String imagePullSecrets; 
            private String imageUrl; 
            private String jarStartArgs; 
            private String jarStartOptions; 
            private String jdk; 
            private Integer memory; 
            private java.util.List < MountDesc> mountDesc; 
            private String mountHost; 
            private String namespaceId; 
            private String nasConfigs; 
            private String nasId; 
            private String ossAkId; 
            private String ossAkSecret; 
            private java.util.List < OssMountDescs> ossMountDescs; 
            private String packageType; 
            private String packageUrl; 
            private String packageVersion; 
            private String phpConfig; 
            private String phpConfigLocation; 
            private String postStart; 
            private String preStop; 
            private String programmingLanguage; 
            private java.util.List < String > publicWebHookUrls; 
            private String python; 
            private String pythonModules; 
            private String refAppId; 
            private java.util.List < String > refedAppIds; 
            private String regionId; 
            private Integer replicas; 
            private String securityGroupId; 
            private Boolean slice; 
            private String sliceEnvs; 
            private String slsConfigs; 
            private Boolean suspend; 
            private java.util.List < Tags> tags; 
            private Integer terminationGracePeriodSeconds; 
            private Long timeout; 
            private String timezone; 
            private String tomcatConfig; 
            private String triggerConfig; 
            private String vSwitchId; 
            private String vpcId; 
            private java.util.List < String > vpcWebHookUrls; 
            private String warStartOptions; 
            private String webContainer; 

            /**
             * The Alibaba Cloud Resource Name (ARN) of the RAM role that is used to pull images across accounts. For more information, see [Pull images across Alibaba Cloud accounts](~~190675~~) and [Grant permissions across Alibaba Cloud accounts by using a RAM role](~~223585~~).
             */
            public Builder acrAssumeRoleArn(String acrAssumeRoleArn) {
                this.acrAssumeRoleArn = acrAssumeRoleArn;
                return this;
            }

            /**
             * The ID of the Container Registry Enterprise Edition instance.
             */
            public Builder acrInstanceId(String acrInstanceId) {
                this.acrInstanceId = acrInstanceId;
                return this;
            }

            /**
             * The description of the application.
             */
            public Builder appDescription(String appDescription) {
                this.appDescription = appDescription;
                return this;
            }

            /**
             * The application ID.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The application name.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The number of times that the job was retried.
             */
            public Builder backoffLimit(Long backoffLimit) {
                this.backoffLimit = backoffLimit;
                return this;
            }

            /**
             * The command that is used to start the image. The command must be an existing executable object in the container. Example:
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
                this.command = command;
                return this;
            }

            /**
             * The arguments of the image startup command. This parameter contains the arguments that are required for **Command**. Format:
             * <p>
             * 
             * `["a","b"]`
             * 
             * In the preceding **Command** example, the CommandArgs parameter is set to `CommandArgs=["abc", ">", "file0"]`. The data type of `["abc", ">", "file0"]` must be an array of strings in the JSON format. If this parameter does not exist in the Command parameter, you do not need to configure it.
             */
            public Builder commandArgs(String commandArgs) {
                this.commandArgs = commandArgs;
                return this;
            }

            /**
             * The concurrency policy of the job. Valid values:
             * <p>
             * 
             * *   **Forbid**: Concurrent running is prohibited. If the previous job is not completed, no new job is created.
             * *   **Allow**: Concurrent running is allowed.
             * *   **Replace**: If the previous job is not completed when the time to create a new job is reached, the new job replaces the previous job.
             */
            public Builder concurrencyPolicy(String concurrencyPolicy) {
                this.concurrencyPolicy = concurrencyPolicy;
                return this;
            }

            /**
             * The details of the ConfigMap.
             */
            public Builder configMapMountDesc(java.util.List < ConfigMapMountDesc> configMapMountDesc) {
                this.configMapMountDesc = configMapMountDesc;
                return this;
            }

            /**
             * The CPU specifications required for each instance. Unit: millicore. This parameter cannot be set to 0. Valid values:
             * <p>
             * 
             * *   **500**
             * *   **1000**
             * *   **2000**
             * *   **4000**
             * *   **8000**
             * *   **16000**
             * *   **32000**
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The custom mapping between the hostname and IP address in the container. Valid values:
             * <p>
             * 
             * *   **hostName**: the domain name or hostname.
             * *   **ip**: the IP address.
             */
            public Builder customHostAlias(String customHostAlias) {
                this.customHostAlias = customHostAlias;
                return this;
            }

            /**
             * The version of the container, such as Ali-Tomcat, in which an application developed based on High-speed Service Framework (HSF) is deployed.
             */
            public Builder edasContainerVersion(String edasContainerVersion) {
                this.edasContainerVersion = edasContainerVersion;
                return this;
            }

            /**
             * The environment variables. You can configure custom environment variables or reference a ConfigMap. If you want to reference a ConfigMap, you must first create a ConfigMap. For more information, see [CreateConfigMap](~~176914~~). Valid values:
             * <p>
             * 
             * *   Custom configuration
             * 
             *     *   **name**: the name of the environment variable.
             *     *   **value**: the value of the environment variable.
             * 
             * *   Reference a ConfigMap
             * 
             *     *   **name**: the name of the environment variable. You can reference one or all keys. To reference all keys, specify `sae-sys-configmap-all-<ConfigMap name>`. Example: `sae-sys-configmap-all-test1`.
             *     *   **valueFrom**: the reference of the environment variable. Set the value to `configMapRef`.
             *     *   **configMapId**: the ID of the ConfigMap.
             *     *   **key**: the key. If you want to reference all keys, you do not need to configure this parameter.
             */
            public Builder envs(String envs) {
                this.envs = envs;
                return this;
            }

            /**
             * The ID of the corresponding secret.
             */
            public Builder imagePullSecrets(String imagePullSecrets) {
                this.imagePullSecrets = imagePullSecrets;
                return this;
            }

            /**
             * The URL of the image. This parameter is returned only if **PackageType** is set to **Image**.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * The arguments in the JAR package. The arguments are used to start the application container. The default startup command is `$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS "$package_path" $JarStartArgs`.
             */
            public Builder jarStartArgs(String jarStartArgs) {
                this.jarStartArgs = jarStartArgs;
                return this;
            }

            /**
             * The option settings in the JAR package. The settings are used to start the application container. The default startup command is `$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS "$package_path" $JarStartArgs`.
             */
            public Builder jarStartOptions(String jarStartOptions) {
                this.jarStartOptions = jarStartOptions;
                return this;
            }

            /**
             * The version of the Java Development Kit (JDK) on which the deployment package of the application depends. The following versions are supported:
             * <p>
             * 
             * *   **Open JDK 8**
             * *   **Open JDK 7**
             * *   **Dragonwell 11**
             * *   **Dragonwell 8**
             * *   **openjdk-8u191-jdk-alpine3.9**
             * *   **openjdk-7u201-jdk-alpine3.9**
             * 
             * This parameter is not returned if **PackageType** is set to **Image**.
             */
            public Builder jdk(String jdk) {
                this.jdk = jdk;
                return this;
            }

            /**
             * The size of memory that is required by each instance. Unit: MB. This parameter cannot be set to 0. The values of this parameter correspond to the values of the Cpu parameter:
             * <p>
             * 
             * *   This parameter is set to **1024** if the Cpu parameter is set to 500 or 1000.
             * *   This parameter is set to **2048** if the Cpu parameter is set to 500, 1000, or 2000.
             * *   This parameter is set to **4096** if the Cpu parameter is set to 1000, 2000, or 4000.
             * *   This parameter is set to **8192** if the Cpu parameter is set to 2000, 4000, or 8000.
             * *   This parameter is set to **12288** if the Cpu parameter is set to 12000.
             * *   This parameter is set to **16384** if the Cpu parameter is set to 4000, 8000, or 16000.
             * *   This parameter is set to **24567** if the Cpu parameter is set to 12000.
             * *   This parameter is set to **32768** if the Cpu parameter is set to 16000.
             * *   This parameter is set to **65536** if the Cpu parameter is set to 8000, 16000, or 32000.
             * *   This parameter is set to **131072** if the Cpu parameter is set to 32000.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The details of the mounted NAS file system.
             */
            public Builder mountDesc(java.util.List < MountDesc> mountDesc) {
                this.mountDesc = mountDesc;
                return this;
            }

            /**
             * The mount target of the NAS file system in the VPC in which the application is deployed. If you do not need to modify this configuration during the deployment, configure **MountHost** only in the first request. If you need to remove this configuration, leave **MountHost** empty in the request.
             */
            public Builder mountHost(String mountHost) {
                this.mountHost = mountHost;
                return this;
            }

            /**
             * The namespace ID.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * The configurations for mounting the NAS file system.
             */
            public Builder nasConfigs(String nasConfigs) {
                this.nasConfigs = nasConfigs;
                return this;
            }

            /**
             * The ID of the NAS file system.
             */
            public Builder nasId(String nasId) {
                this.nasId = nasId;
                return this;
            }

            /**
             * The AccessKey ID that is used to read data from and write data to Object Storage Service (OSS).
             */
            public Builder ossAkId(String ossAkId) {
                this.ossAkId = ossAkId;
                return this;
            }

            /**
             * The AccessKey secret that is used to read data from and write data to OSS.
             */
            public Builder ossAkSecret(String ossAkSecret) {
                this.ossAkSecret = ossAkSecret;
                return this;
            }

            /**
             * The description of mounted OSS buckets.
             */
            public Builder ossMountDescs(java.util.List < OssMountDescs> ossMountDescs) {
                this.ossMountDescs = ossMountDescs;
                return this;
            }

            /**
             * The type of the deployment package. Valid values:
             * <p>
             * 
             * *   If you deploy the application by using a Java Archive (JAR) package, this parameter is set to **FatJar**, **War**, or **Image**.
             * 
             * *   If you deploy the application by using a PHP package, this parameter is set to one of the following values:
             * 
             *     *   **PhpZip**
             *     *   **IMAGE_PHP\_5\_4**
             *     *   **IMAGE_PHP\_5\_4\_ALPINE**
             *     *   **IMAGE_PHP\_5\_5**
             *     *   **IMAGE_PHP\_5\_5\_ALPINE**
             *     *   **IMAGE_PHP\_5\_6**
             *     *   **IMAGE_PHP\_5\_6\_ALPINE**
             *     *   **IMAGE_PHP\_7\_0**
             *     *   **IMAGE_PHP\_7\_0\_ALPINE**
             *     *   **IMAGE_PHP\_7\_1**
             *     *   **IMAGE_PHP\_7\_1\_ALPINE**
             *     *   **IMAGE_PHP\_7\_2**
             *     *   **IMAGE_PHP\_7\_2\_ALPINE**
             *     *   **IMAGE_PHP\_7\_3**
             *     *   **IMAGE_PHP\_7\_3\_ALPINE**
             * 
             * *   If you deploy the application by using a Pythhon package, this parameter is set to **PythonZip** or **Image**.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * The URL of the deployment package. This parameter is returned only if **PackageType** is set to **FatJar** or **War**.
             */
            public Builder packageUrl(String packageUrl) {
                this.packageUrl = packageUrl;
                return this;
            }

            /**
             * The version of the deployment package. This parameter is required only if **PackageType** is set to **FatJar** or **War**.
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * The details of the PHP configuration file.
             */
            public Builder phpConfig(String phpConfig) {
                this.phpConfig = phpConfig;
                return this;
            }

            /**
             * The path on which the PHP configuration file for application startup is mounted. Make sure that the PHP server uses this configuration file during the startup.
             */
            public Builder phpConfigLocation(String phpConfigLocation) {
                this.phpConfigLocation = phpConfigLocation;
                return this;
            }

            /**
             * The script that is run immediately after the container is started. Example: `{"exec":{"command":\["cat","/etc/group"\]}}`
             */
            public Builder postStart(String postStart) {
                this.postStart = postStart;
                return this;
            }

            /**
             * The script that is run before the container is stopped. Example: `{"exec":{"command":\["cat","/etc/group"\]}}`
             */
            public Builder preStop(String preStop) {
                this.preStop = preStop;
                return this;
            }

            /**
             * The programming language that is used to create the application. Valid values:
             * <p>
             * 
             * *   **java**: Java
             * *   **php**: PHP
             * *   **python**: Python
             * *   **other**: other programming languages, such as C++, Go, .NET, and Node.js.
             */
            public Builder programmingLanguage(String programmingLanguage) {
                this.programmingLanguage = programmingLanguage;
                return this;
            }

            /**
             * The Internet request URLs of one-time jobs.
             */
            public Builder publicWebHookUrls(java.util.List < String > publicWebHookUrls) {
                this.publicWebHookUrls = publicWebHookUrls;
                return this;
            }

            /**
             * The Python environment. PYTHON 3.9.15 is supported.
             */
            public Builder python(String python) {
                this.python = python;
                return this;
            }

            /**
             * The configurations for installing custom module dependencies. By default, the dependencies defined by the requirements.txt file in the root directory are installed. If no software package is configured, you can specify dependencies based on your business requirements.
             */
            public Builder pythonModules(String pythonModules) {
                this.pythonModules = pythonModules;
                return this;
            }

            /**
             * The ID of the job template that you reference.
             */
            public Builder refAppId(String refAppId) {
                this.refAppId = refAppId;
                return this;
            }

            /**
             * The IDs of the referenced job templates.
             */
            public Builder refedAppIds(java.util.List < String > refedAppIds) {
                this.refedAppIds = refedAppIds;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The number of application instances.
             */
            public Builder replicas(Integer replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * The ID of the security group.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * Indicates whether job sharding is enabled.
             */
            public Builder slice(Boolean slice) {
                this.slice = slice;
                return this;
            }

            /**
             * The parameters of job sharding.
             */
            public Builder sliceEnvs(String sliceEnvs) {
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
             * Parameter description:
             * 
             * *   **projectName**: the name of the Log Service project.
             * *   **logDir**: the path in which logs are stored.
             * *   **logType**: the log type. **stdout**: the standard output (stdout) log of the container. Only one stdout value for this parameter can be specified. If this parameter is not configured, file logs are collected.
             * *   **logstoreName**: the name of the Logstore in Log Service.
             * *   **logtailName**: the name of the Logtail in Log Service. If this parameter is not configured, a new Logtail is created.
             * 
             * If you do not need to modify the logging configurations when you deploy the application, configure **SlsConfigs** only in the first request. If you no longer need to use Log Service, leave **SlsConfigs** empty in the request.
             */
            public Builder slsConfigs(String slsConfigs) {
                this.slsConfigs = slsConfigs;
                return this;
            }

            /**
             * Indicates whether the job template is suspended.
             */
            public Builder suspend(Boolean suspend) {
                this.suspend = suspend;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The timeout period for a graceful shutdown. Default value: 30. Unit: seconds. Valid values: 1 to 300.
             */
            public Builder terminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
                this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
                return this;
            }

            /**
             * The timeout period for the job. Unit: seconds.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * The time zone. Default value: **Asia/Shanghai**.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * The Tomcat configuration. If you want to delete the configuration, set this parameter to {} or leave this parameter empty. Parameter description:
             * <p>
             * 
             * *   **port**: the port number. Valid values: 1024 to 65535. The root permissions are required to perform operations on ports whose number is smaller than 1024. Enter a value that ranges from 1025 to 65535 because the container has only the admin permissions. If this parameter is not configured, the default value 8080 is used.
             * *   **contextPath**: the path. Default value: /. The value indicates the root directory.
             * *   **maxThreads**: the maximum number of connections in the connection pool. Default value: 400.
             * *   **uriEncoding**: the URI encoding scheme in the Tomcat container. Valid values: **UTF-8**, **ISO-8859-1**, **GBK**, and **GB2312**. If this parameter is not configured, the default value **ISO-8859-1** is used.
             * *   **useBodyEncoding**: indicates whether to use the encoding scheme that is specified by **BodyEncoding for URL**. Default value: **true**.
             */
            public Builder tomcatConfig(String tomcatConfig) {
                this.tomcatConfig = tomcatConfig;
                return this;
            }

            /**
             * TriggerConfig.
             */
            public Builder triggerConfig(String triggerConfig) {
                this.triggerConfig = triggerConfig;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The internal request URLs for one-time jobs.
             */
            public Builder vpcWebHookUrls(java.util.List < String > vpcWebHookUrls) {
                this.vpcWebHookUrls = vpcWebHookUrls;
                return this;
            }

            /**
             * The option settings in the WAR package. The settings are used to start the application container. The default startup command is `java $JAVA_OPTS $CATALINA_OPTS -Options org.apache.catalina.startup.Bootstrap "$@" start`.
             */
            public Builder warStartOptions(String warStartOptions) {
                this.warStartOptions = warStartOptions;
                return this;
            }

            /**
             * The version of the Tomcat container on which the deployment package depends. The following versions are supported:
             * <p>
             * 
             * *   **apache-tomcat-7.0.91**
             * *   **apache-tomcat-8.5.42**
             * 
             * This parameter is not returned if **PackageType** is set to **Image**.
             */
            public Builder webContainer(String webContainer) {
                this.webContainer = webContainer;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
