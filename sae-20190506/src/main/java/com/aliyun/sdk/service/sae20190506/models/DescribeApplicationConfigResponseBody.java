// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationConfigResponseBody</p>
 */
public class DescribeApplicationConfigResponseBody extends TeaModel {
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

    private DescribeApplicationConfigResponseBody(Builder builder) {
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

    public static DescribeApplicationConfigResponseBody create() {
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
         * The details of the application.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned error code. Valid values:
         * <p>
         * 
         * *   If the call is successful, the **ErrorCode** parameter is not returned.
         * *   If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The returned information.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the configurations of an application were obtained. Valid values:
         * <p>
         * 
         * *   **true**: The configurations were obtained.
         * *   **false**: The configurations failed to be obtained.
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

        public DescribeApplicationConfigResponseBody build() {
            return new DescribeApplicationConfigResponseBody(this);
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
             * The ID of the ConfigMap.
             */
            public Builder configMapId(Long configMapId) {
                this.configMapId = configMapId;
                return this;
            }

            /**
             * The name of the ConfigMap.
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
             * The path on which the ConfigMap is mounted.
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
             * The name of the bucket.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * The directory or object that you created in the OSS bucket. If the specified object or directory is invalid, an exception occurs.
             */
            public Builder bucketPath(String bucketPath) {
                this.bucketPath = bucketPath;
                return this;
            }

            /**
             * The directory of your container in SAE. The parameter value that you specified overwrites the original value. If the specified directory does not exist, SAE automatically creates the directory.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * Indicates whether the application can use the container directory to read data from or write data to resources in the directory of the OSS bucket. Valid values:
             * <p>
             * 
             * *   **true**: The application has read-only permissions.
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
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
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

        @NameInMap("AssociateEip")
        private Boolean associateEip;

        @NameInMap("BatchWaitTime")
        private Integer batchWaitTime;

        @NameInMap("Command")
        private String command;

        @NameInMap("CommandArgs")
        private String commandArgs;

        @NameInMap("ConfigMapMountDesc")
        private java.util.List < ConfigMapMountDesc> configMapMountDesc;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CustomHostAlias")
        private String customHostAlias;

        @NameInMap("EdasContainerVersion")
        private String edasContainerVersion;

        @NameInMap("EnableAhas")
        private String enableAhas;

        @NameInMap("EnableGreyTagRoute")
        private Boolean enableGreyTagRoute;

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

        @NameInMap("KafkaConfigs")
        private String kafkaConfigs;

        @NameInMap("Liveness")
        private String liveness;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("MicroRegistration")
        private String microRegistration;

        @NameInMap("MinReadyInstanceRatio")
        private Integer minReadyInstanceRatio;

        @NameInMap("MinReadyInstances")
        private Integer minReadyInstances;

        @NameInMap("MountDesc")
        private java.util.List < MountDesc> mountDesc;

        @NameInMap("MountHost")
        private String mountHost;

        @NameInMap("MseApplicationId")
        private String mseApplicationId;

        @NameInMap("MseApplicationName")
        private String mseApplicationName;

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

        @NameInMap("Php")
        private String php;

        @NameInMap("PhpArmsConfigLocation")
        private String phpArmsConfigLocation;

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

        @NameInMap("PvtzDiscovery")
        private String pvtzDiscovery;

        @NameInMap("Python")
        private String python;

        @NameInMap("PythonModules")
        private String pythonModules;

        @NameInMap("Readiness")
        private String readiness;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Replicas")
        private Integer replicas;

        @NameInMap("SaeVersion")
        private String saeVersion;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SlsConfigs")
        private String slsConfigs;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("TerminationGracePeriodSeconds")
        private Integer terminationGracePeriodSeconds;

        @NameInMap("Timezone")
        private String timezone;

        @NameInMap("TomcatConfig")
        private String tomcatConfig;

        @NameInMap("UpdateStrategy")
        private String updateStrategy;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

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
            this.associateEip = builder.associateEip;
            this.batchWaitTime = builder.batchWaitTime;
            this.command = builder.command;
            this.commandArgs = builder.commandArgs;
            this.configMapMountDesc = builder.configMapMountDesc;
            this.cpu = builder.cpu;
            this.customHostAlias = builder.customHostAlias;
            this.edasContainerVersion = builder.edasContainerVersion;
            this.enableAhas = builder.enableAhas;
            this.enableGreyTagRoute = builder.enableGreyTagRoute;
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
            this.minReadyInstanceRatio = builder.minReadyInstanceRatio;
            this.minReadyInstances = builder.minReadyInstances;
            this.mountDesc = builder.mountDesc;
            this.mountHost = builder.mountHost;
            this.mseApplicationId = builder.mseApplicationId;
            this.mseApplicationName = builder.mseApplicationName;
            this.namespaceId = builder.namespaceId;
            this.nasConfigs = builder.nasConfigs;
            this.nasId = builder.nasId;
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
            this.pvtzDiscovery = builder.pvtzDiscovery;
            this.python = builder.python;
            this.pythonModules = builder.pythonModules;
            this.readiness = builder.readiness;
            this.regionId = builder.regionId;
            this.replicas = builder.replicas;
            this.saeVersion = builder.saeVersion;
            this.securityGroupId = builder.securityGroupId;
            this.slsConfigs = builder.slsConfigs;
            this.tags = builder.tags;
            this.terminationGracePeriodSeconds = builder.terminationGracePeriodSeconds;
            this.timezone = builder.timezone;
            this.tomcatConfig = builder.tomcatConfig;
            this.updateStrategy = builder.updateStrategy;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
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
         * @return associateEip
         */
        public Boolean getAssociateEip() {
            return this.associateEip;
        }

        /**
         * @return batchWaitTime
         */
        public Integer getBatchWaitTime() {
            return this.batchWaitTime;
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
         * @return mseApplicationId
         */
        public String getMseApplicationId() {
            return this.mseApplicationId;
        }

        /**
         * @return mseApplicationName
         */
        public String getMseApplicationName() {
            return this.mseApplicationName;
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
         * @return pvtzDiscovery
         */
        public String getPvtzDiscovery() {
            return this.pvtzDiscovery;
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
         * @return saeVersion
         */
        public String getSaeVersion() {
            return this.saeVersion;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return slsConfigs
         */
        public String getSlsConfigs() {
            return this.slsConfigs;
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

        public static final class Builder {
            private String acrAssumeRoleArn; 
            private String acrInstanceId; 
            private String appDescription; 
            private String appId; 
            private String appName; 
            private Boolean associateEip; 
            private Integer batchWaitTime; 
            private String command; 
            private String commandArgs; 
            private java.util.List < ConfigMapMountDesc> configMapMountDesc; 
            private Integer cpu; 
            private String customHostAlias; 
            private String edasContainerVersion; 
            private String enableAhas; 
            private Boolean enableGreyTagRoute; 
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
            private Integer minReadyInstanceRatio; 
            private Integer minReadyInstances; 
            private java.util.List < MountDesc> mountDesc; 
            private String mountHost; 
            private String mseApplicationId; 
            private String mseApplicationName; 
            private String namespaceId; 
            private String nasConfigs; 
            private String nasId; 
            private String ossAkId; 
            private String ossAkSecret; 
            private java.util.List < OssMountDescs> ossMountDescs; 
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
            private String pvtzDiscovery; 
            private String python; 
            private String pythonModules; 
            private String readiness; 
            private String regionId; 
            private Integer replicas; 
            private String saeVersion; 
            private String securityGroupId; 
            private String slsConfigs; 
            private java.util.List < Tags> tags; 
            private Integer terminationGracePeriodSeconds; 
            private String timezone; 
            private String tomcatConfig; 
            private String updateStrategy; 
            private String vSwitchId; 
            private String vpcId; 
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
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Indicates whether an elastic IP address (EIP) is associated with the application instance. Valid values:
             * <p>
             * 
             * *   **true**: The EIP is associated with the application instance.
             * *   **false**: The EIP is not associated with the application instance.
             */
            public Builder associateEip(Boolean associateEip) {
                this.associateEip = associateEip;
                return this;
            }

            /**
             * The interval between batches in a phased release. Unit: seconds.
             */
            public Builder batchWaitTime(Integer batchWaitTime) {
                this.batchWaitTime = batchWaitTime;
                return this;
            }

            /**
             * The command that is used to start the image. The command must be an existing executable object in the container. Example:
             * <p>
             * 
             * ```
             * 
             * command:
             *       - echo
             *       - abc
             *       - >
             *       - file0
             * ```
             * 
             * In this example, the Command parameter is set to `Command="echo", CommandArgs=["abc", ">", "file0"]`.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * The parameters of the image startup command. The CommandArgs parameter contains the parameters that are required for the **Command** parameter. Format:
             * <p>
             * 
             * `["a","b"]`
             * 
             * In the preceding **Command** example, the CommandArgs parameter is set to `CommandArgs=["abc", ">", "file0"]`. The data type of `["abc", ">", "file0"]` must be an array of strings in the JSON format. You do not need to configure this parameter if it does not exist in the Command parameter.
             */
            public Builder commandArgs(String commandArgs) {
                this.commandArgs = commandArgs;
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
             * The CPU specifications that are required for each instance. Unit: millicores. You cannot set this parameter to 0. Valid values:
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
             * The custom mappings between hostnames and IP addresses in the container. Valid values:
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
             * Indicates whether access to Application High Availability Service (AHAS) is enabled. Valid values:
             * <p>
             * 
             * *   **true**: Access to AHAS is enabled.
             * *   **false**: Access to AHAS is disabled.
             */
            public Builder enableAhas(String enableAhas) {
                this.enableAhas = enableAhas;
                return this;
            }

            /**
             * Indicates whether canary release rules are enabled. Canary release rules apply only to applications in Spring Cloud and Dubbo frameworks. Valid values:
             * <p>
             * 
             * *   **true**: The canary release rules are enabled.
             * *   **false**: The canary release rules are disabled.
             */
            public Builder enableGreyTagRoute(Boolean enableGreyTagRoute) {
                this.enableGreyTagRoute = enableGreyTagRoute;
                return this;
            }

            /**
             * The environment variables. Variable description:
             * <p>
             * 
             * *   **name**: the name of the environment variable.
             * *   **value**: the value or reference of the environment variable.
             */
            public Builder envs(String envs) {
                this.envs = envs;
                return this;
            }

            /**
             * ImagePullSecrets.
             */
            public Builder imagePullSecrets(String imagePullSecrets) {
                this.imagePullSecrets = imagePullSecrets;
                return this;
            }

            /**
             * The URL of the image. This parameter is returned only if the **PackageType** parameter is set to **Image**.
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
                this.jdk = jdk;
                return this;
            }

            /**
             * The logging configurations of Message Queue for Apache Kafka. The following parameters are involved:
             * <p>
             * 
             * *   **KafkaConfigs**: the configurations of Message Queue for Apache Kafka.
             * 
             * *   **createTime**: the time when the Message Queue for Apache Kafka instance was created.
             * 
             * *   **kafkaTopic**: the message topic that is used to classify messages.
             * 
             * *   **logDir**: the path in which logs are stored.
             * 
             * *   **logType**: the type of collected logs. Valid values:
             * 
             *     *   **file_log**: the file log that is stored in the container. The path of the file logs in the container is returned.
             *     *   **stdout**: the standard output log of the container. You can specify only one stdout value.
             * 
             * *   **kafkaEndpoint**: the endpoint of the Message Queue for Apache Kafka service.
             * 
             * *   **kafkaInstanceId**: the ID of the Message Queue for Apache Kafka instance.
             * 
             * *   **region**: the region where the Message Queue for Apache Kafka instance resides.
             */
            public Builder kafkaConfigs(String kafkaConfigs) {
                this.kafkaConfigs = kafkaConfigs;
                return this;
            }

            /**
             * The details of the availability check that was performed on the container. If the container fails this health check multiple times, the system disables and restarts the container. You can use one of the following methods to perform the health check:
             * <p>
             * 
             * *   Sample code of the **exec** method: `{"exec":{"command":["sh","-c","cat/home/admin/start.sh"]},"initialDelaySeconds":30,"periodSeconds":30,"timeoutSeconds":2}`
             * *   Sample code of the **httpGet** method: `{"httpGet":{"path":"/","port":18091,"scheme":"HTTP","isContainKeyWord":true,"keyWord":"SAE"},"initialDelaySeconds":11,"periodSeconds":10,"timeoutSeconds":1}`
             * *   Sample code of the **tcpSocket** method: `{"tcpSocket":{"port":18091},"initialDelaySeconds":11,"periodSeconds":10,"timeoutSeconds":1}`
             * 
             * >  You can use only one method to perform the health check.
             * 
             * The following parameters are involved:
             * 
             * *   **exec.command**: the health check command.
             * *   **httpGet.path**: the request path.
             * *   **httpGet.scheme**: the protocol that is used to perform the health check. Valid values: **HTTP** and **HTTPS**.
             * *   **httpGet.isContainKeyWord**: indicates whether the response contains keywords. Valid values: **true** and **false**. If this field is not returned, the advanced settings are not used.
             * *   **httpGet.keyWord**: the custom keyword. This parameter is available only if the **isContainKeyWord** field is returned.
             * *   **tcpSocket.port**: the port that is used to check the status of TCP connections.
             * *   **initialDelaySeconds**: the delay of the health check. Default value: 10. Unit: seconds.
             * *   **periodSeconds**: the interval at which health checks are performed. Default value: 30. Unit: seconds.
             * *   **timeoutSeconds**: the timeout period of the health check. Default value: 1. Unit: seconds. If you set this parameter to 0 or leave this parameter empty, the timeout period is automatically set to 1 second.
             */
            public Builder liveness(String liveness) {
                this.liveness = liveness;
                return this;
            }

            /**
             * The size of memory required by each instance. Unit: MB. You cannot set this parameter to 0. The values of this parameter correspond to the values of the Cpu parameter:
             * <p>
             * 
             * *   This parameter is set to **1024** if the Cpu parameter is set to 500 or 1000.
             * *   This parameter is set to **2048** if the Cpu parameter is set to 500, 1000, or 1000.
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
             * MicroRegistration.
             */
            public Builder microRegistration(String microRegistration) {
                this.microRegistration = microRegistration;
                return this;
            }

            /**
             * The percentage of the minimum number of available instances. Valid values:
             * <p>
             * 
             * *   **-1**: the default value. This value indicates that the minimum number of available instances is not measured by percentage. If you do not configure this parameter, the default value **-1** is used.
             * *   **0 to 100**: indicates that the minimum number of available instances is calculated by using the following formula: Current number of instances × (Value of MinReadyInstanceRatio × 100%). If the calculated result is not an integer, the result is rounded up to the nearest integer. For example, if the percentage is set to **50**% and five instances are available, the minimum number of available instances is 3.
             * 
             * >  If the **MinReadyInstance** and **MinReadyInstanceRatio** parameters are returned and the value of the **MinReadyInstanceRatio** parameter is not **-1**, the value of the **MinReadyInstanceRatio** parameter takes effect. If the **MinReadyInstances** parameter is set to **5** and the **MinReadyInstanceRatio** parameter is set to **50**, the value of the **MinReadyInstanceRatio** parameter determines the minimum number of available instances.
             */
            public Builder minReadyInstanceRatio(Integer minReadyInstanceRatio) {
                this.minReadyInstanceRatio = minReadyInstanceRatio;
                return this;
            }

            /**
             * The minimum number of available instances. Valid values:
             * <p>
             * 
             * *   If you set the value to **0**, business interruptions occur when the application is updated.
             * *   If you set the value to **-1**, the minimum number of available instances is automatically set to a system-recommended value. The value is the nearest integer to which the calculated result of the following formula is rounded up: Current number of instances × 25%. For example, if five instances are available, the minimum number of available instances is calculated by using the following formula: 5 × 25% = 1.25. In this case, the minimum number of available instances is 2.
             * 
             * >  Make sure that at least one instance is available during application deployment and rollback to prevent business interruptions.
             */
            public Builder minReadyInstances(Integer minReadyInstances) {
                this.minReadyInstances = minReadyInstances;
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
             * The mount target of the NAS file system in the VPC where the application is deployed. If you do not need to modify this configuration during the deployment, configure the **MountHost** parameter only in the first request. You do not need to include this parameter in subsequent requests. If you need to remove this configuration, leave the **MountHost** parameter empty in the request.
             */
            public Builder mountHost(String mountHost) {
                this.mountHost = mountHost;
                return this;
            }

            /**
             * The ID of the microservice application.
             */
            public Builder mseApplicationId(String mseApplicationId) {
                this.mseApplicationId = mseApplicationId;
                return this;
            }

            /**
             * MseApplicationName.
             */
            public Builder mseApplicationName(String mseApplicationName) {
                this.mseApplicationName = mseApplicationName;
                return this;
            }

            /**
             * The ID of the namespace.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * NasConfigs.
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
             * The AccessKey ID that is used to read data from and write data to Object Storage Service (OSS) buckets.
             */
            public Builder ossAkId(String ossAkId) {
                this.ossAkId = ossAkId;
                return this;
            }

            /**
             * The AccessKey secret that is used to read data from and write data to OSS buckets.
             */
            public Builder ossAkSecret(String ossAkSecret) {
                this.ossAkSecret = ossAkSecret;
                return this;
            }

            /**
             * The description of the mounted OSS bucket.
             */
            public Builder ossMountDescs(java.util.List < OssMountDescs> ossMountDescs) {
                this.ossMountDescs = ossMountDescs;
                return this;
            }

            /**
             * The type of the deployment package. Valid values:
             * <p>
             * 
             * *   If you deploy the application by using a Java Archive (JAR) package, you can set this parameter to **FatJar**, **War**, or **Image**.
             * 
             * *   If you deploy the application by using a PHP package, you can set this parameter to one of the following values:
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
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * The URL of the deployment package. This parameter is returned only if the **PackageType** parameter is set to **FatJar** or **War**.
             */
            public Builder packageUrl(String packageUrl) {
                this.packageUrl = packageUrl;
                return this;
            }

            /**
             * The version of the deployment package. This parameter is returned only if the **PackageType** parameter is set to **FatJar** or **War**.
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * Php.
             */
            public Builder php(String php) {
                this.php = php;
                return this;
            }

            /**
             * The path on which the PHP configuration file for application monitoring is mounted. Make sure that the PHP server loads the configuration file.
             * <p>
             * 
             * SAE automatically generates the corresponding configuration file. No manual operations are required.
             */
            public Builder phpArmsConfigLocation(String phpArmsConfigLocation) {
                this.phpArmsConfigLocation = phpArmsConfigLocation;
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
             * The script that is run immediately after the container is started. Example: `{"exec":{"command":["cat","/etc/group"]}}`
             */
            public Builder postStart(String postStart) {
                this.postStart = postStart;
                return this;
            }

            /**
             * The script that is run before the container is stopped. Example: `{"exec":{"command":["cat","/etc/group"]}}`
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
             * *   **other**: Other programming languages, such as Python, C++, Go, .NET, and Node.js.
             */
            public Builder programmingLanguage(String programmingLanguage) {
                this.programmingLanguage = programmingLanguage;
                return this;
            }

            /**
             * PvtzDiscovery.
             */
            public Builder pvtzDiscovery(String pvtzDiscovery) {
                this.pvtzDiscovery = pvtzDiscovery;
                return this;
            }

            /**
             * Python.
             */
            public Builder python(String python) {
                this.python = python;
                return this;
            }

            /**
             * PythonModules.
             */
            public Builder pythonModules(String pythonModules) {
                this.pythonModules = pythonModules;
                return this;
            }

            /**
             * The details of the health check that was performed on the container. If the container fails this health check multiple times, the system disables and restarts the container. Containers that fail health checks cannot receive traffic from Server Load Balancer (SLB) instances. You can use the **exec**, **httpGet**, or **tcpSocket** method to perform health checks. For more information, see the description of the **Liveness** parameter.
             * <p>
             * 
             * >  You can use only one method to perform the health check.
             */
            public Builder readiness(String readiness) {
                this.readiness = readiness;
                return this;
            }

            /**
             * The ID of the region.
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
             * SaeVersion.
             */
            public Builder saeVersion(String saeVersion) {
                this.saeVersion = saeVersion;
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
             * The logging configurations of Log Service.
             * <p>
             * 
             * *   To use Log Service resources that are automatically created by SAE, set this parameter to `[{"logDir":"","logType":"stdout"},{"logDir":"/tmp/a.log"}]`.
             * *   To use custom Log Service resources, set this parameter to `[{"projectName":"test-sls","logType":"stdout","logDir":"","logstoreName":"sae","logtailName":""},{"projectName":"test","logDir":"/tmp/a.log","logstoreName":"sae","logtailName":""}]`.
             * 
             * The following parameters are involved:
             * 
             * *   **projectName**: the name of the Log Service project.
             * *   **logDir**: the path in which logs are stored.
             * *   **logType**: the log type. **stdout**: the standard output log of the container. You can specify only one stdout value for this parameter. If you leave this parameter empty, file logs are collected.
             * *   **logstoreName**: the name of the Logstore in Log Service.
             * *   **logtailName**: the name of the Logtail configuration in Log Service. If you do not configure this parameter, a new Logtail configuration is created.
             * 
             * If you do not need to modify the logging configurations when you deploy the application, configure the **SlsConfigs** parameter only in the first request. You do not need to include this parameter in subsequent requests. If you no longer need to use Log Service, leave the **SlsConfigs** parameter empty in the request.
             */
            public Builder slsConfigs(String slsConfigs) {
                this.slsConfigs = slsConfigs;
                return this;
            }

            /**
             * The details of the tags.
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
             * The time zone. Default value: **Asia/Shanghai**.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * The Tomcat configuration. If you want to delete the configuration, set this parameter to {} or leave this parameter empty. The following parameters are involved:
             * <p>
             * 
             * *   **port**: the port number. Valid values: 1024 to 65535. The root permissions are required to perform operations on ports whose number is smaller than 1024. Enter a value that ranges from 1025 to 65535 because the container has only the admin permissions. If you do not configure this parameter, the default port number 8080 is used.
             * *   **contextPath**: the path. Default value: /. This value indicates the root directory.
             * *   **maxThreads**: the maximum number of connections in the connection pool. Default value: 400.
             * *   **uriEncoding**: the URI encoding scheme in the Tomcat container. Valid values: **UTF-8**, **ISO-8859-1**, **GBK**, and **GB2312**. If you do not configure this parameter, the default value **ISO-8859-1** is used.
             * *   **useBodyEncoding**: indicates whether to use the encoding scheme that is specified by **BodyEncoding for URL**. Default value: **true**.
             */
            public Builder tomcatConfig(String tomcatConfig) {
                this.tomcatConfig = tomcatConfig;
                return this;
            }

            /**
             * The deployment policy. If the minimum number of available instances is 1, the value of the **UpdateStrategy** parameter is an empty string (""). If the minimum number of available instances is greater than 1, the following strategies can be configured:
             * <p>
             * 
             * *   The application is deployed on an instance. The remaining instances are automatically classified into two release batches whose interval is set to 1. In this case, the parameter is set to `{"type":"GrayBatchUpdate","batchUpdate":{"batch":2,"releaseType":"auto","batchWaitTime":1},"grayUpdate":{"gray":1}}`.
             * *   The application is deployed on an instance. The remaining instances are manually classified into two release batches. In this case, the parameter is set to `{"type":"GrayBatchUpdate","batchUpdate":{"batch":2,"releaseType":"manual"},"grayUpdate":{"gray":1}}`.
             * *   All instances are automatically classified into two release batches. The application is deployed on the instances of the two batches in parallel. In this case, the parameter is set to `{"type":"BatchUpdate","batchUpdate":{"batch":2,"releaseType":"auto","batchWaitTime":0}}`
             * 
             * The following parameters are involved:
             * 
             * *   **type**: the type of the release policy. Valid values: **GrayBatchUpdate** and **BatchUpdate**.
             * 
             * *   **batchUpdate**: the phased release policy.
             * 
             *     *   **batch**: the number of release batches.
             *     *   **releaseType**: the processing method for the batches. Valid values: **auto** and **manual**.
             *     *   **batchWaitTime**: the interval between release batches. Unit: seconds.
             * 
             * *   **grayUpdate**: the number of release batches in the phased release after a canary release. This parameter is returned only if the **type** parameter is set to **GrayBatchUpdate**.
             */
            public Builder updateStrategy(String updateStrategy) {
                this.updateStrategy = updateStrategy;
                return this;
            }

            /**
             * The ID of the vSwitch.
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
             * The option settings in the WAR package. The settings are used to start the application container. The default startup command is `java $JAVA_OPTS $CATALINA_OPTS -Options org.apache.catalina.startup.Bootstrap "$@" start`.
             */
            public Builder warStartOptions(String warStartOptions) {
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
                this.webContainer = webContainer;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
