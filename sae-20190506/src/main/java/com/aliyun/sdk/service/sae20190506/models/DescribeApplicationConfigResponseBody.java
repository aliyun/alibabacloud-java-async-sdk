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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TraceId.
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
             * ConfigMapId.
             */
            public Builder configMapId(Long configMapId) {
                this.configMapId = configMapId;
                return this;
            }

            /**
             * ConfigMapName.
             */
            public Builder configMapName(String configMapName) {
                this.configMapName = configMapName;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * MountPath.
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
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * NasPath.
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
             * Bucket名称
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * Bucket中Oss Key名称
             */
            public Builder bucketPath(String bucketPath) {
                this.bucketPath = bucketPath;
                return this;
            }

            /**
             * 挂载到容器的路径
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * 是否只读
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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

        @NameInMap("MseFeatureConfig")
        private String mseFeatureConfig;

        @NameInMap("NamespaceId")
        private String namespaceId;

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

        @NameInMap("Readiness")
        private String readiness;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Replicas")
        private Integer replicas;

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
            this.imageUrl = builder.imageUrl;
            this.jarStartArgs = builder.jarStartArgs;
            this.jarStartOptions = builder.jarStartOptions;
            this.jdk = builder.jdk;
            this.kafkaConfigs = builder.kafkaConfigs;
            this.liveness = builder.liveness;
            this.memory = builder.memory;
            this.minReadyInstanceRatio = builder.minReadyInstanceRatio;
            this.minReadyInstances = builder.minReadyInstances;
            this.mountDesc = builder.mountDesc;
            this.mountHost = builder.mountHost;
            this.mseApplicationId = builder.mseApplicationId;
            this.mseFeatureConfig = builder.mseFeatureConfig;
            this.namespaceId = builder.namespaceId;
            this.nasId = builder.nasId;
            this.ossAkId = builder.ossAkId;
            this.ossAkSecret = builder.ossAkSecret;
            this.ossMountDescs = builder.ossMountDescs;
            this.packageType = builder.packageType;
            this.packageUrl = builder.packageUrl;
            this.packageVersion = builder.packageVersion;
            this.phpArmsConfigLocation = builder.phpArmsConfigLocation;
            this.phpConfig = builder.phpConfig;
            this.phpConfigLocation = builder.phpConfigLocation;
            this.postStart = builder.postStart;
            this.preStop = builder.preStop;
            this.programmingLanguage = builder.programmingLanguage;
            this.readiness = builder.readiness;
            this.regionId = builder.regionId;
            this.replicas = builder.replicas;
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
         * @return mseFeatureConfig
         */
        public String getMseFeatureConfig() {
            return this.mseFeatureConfig;
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
            private String imageUrl; 
            private String jarStartArgs; 
            private String jarStartOptions; 
            private String jdk; 
            private String kafkaConfigs; 
            private String liveness; 
            private Integer memory; 
            private Integer minReadyInstanceRatio; 
            private Integer minReadyInstances; 
            private java.util.List < MountDesc> mountDesc; 
            private String mountHost; 
            private String mseApplicationId; 
            private String mseFeatureConfig; 
            private String namespaceId; 
            private String nasId; 
            private String ossAkId; 
            private String ossAkSecret; 
            private java.util.List < OssMountDescs> ossMountDescs; 
            private String packageType; 
            private String packageUrl; 
            private String packageVersion; 
            private String phpArmsConfigLocation; 
            private String phpConfig; 
            private String phpConfigLocation; 
            private String postStart; 
            private String preStop; 
            private String programmingLanguage; 
            private String readiness; 
            private String regionId; 
            private Integer replicas; 
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
             * AcrAssumeRoleArn.
             */
            public Builder acrAssumeRoleArn(String acrAssumeRoleArn) {
                this.acrAssumeRoleArn = acrAssumeRoleArn;
                return this;
            }

            /**
             * ACR 企业版实例 ID
             */
            public Builder acrInstanceId(String acrInstanceId) {
                this.acrInstanceId = acrInstanceId;
                return this;
            }

            /**
             * AppDescription.
             */
            public Builder appDescription(String appDescription) {
                this.appDescription = appDescription;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * 是否绑定EIP
             */
            public Builder associateEip(Boolean associateEip) {
                this.associateEip = associateEip;
                return this;
            }

            /**
             * BatchWaitTime.
             */
            public Builder batchWaitTime(Integer batchWaitTime) {
                this.batchWaitTime = batchWaitTime;
                return this;
            }

            /**
             * Command.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * CommandArgs.
             */
            public Builder commandArgs(String commandArgs) {
                this.commandArgs = commandArgs;
                return this;
            }

            /**
             * ConfigMapMountDesc.
             */
            public Builder configMapMountDesc(java.util.List < ConfigMapMountDesc> configMapMountDesc) {
                this.configMapMountDesc = configMapMountDesc;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * CustomHostAlias.
             */
            public Builder customHostAlias(String customHostAlias) {
                this.customHostAlias = customHostAlias;
                return this;
            }

            /**
             * EdasContainerVersion.
             */
            public Builder edasContainerVersion(String edasContainerVersion) {
                this.edasContainerVersion = edasContainerVersion;
                return this;
            }

            /**
             * EnableAhas.
             */
            public Builder enableAhas(String enableAhas) {
                this.enableAhas = enableAhas;
                return this;
            }

            /**
             * 开启流量灰度
             */
            public Builder enableGreyTagRoute(Boolean enableGreyTagRoute) {
                this.enableGreyTagRoute = enableGreyTagRoute;
                return this;
            }

            /**
             * Envs.
             */
            public Builder envs(String envs) {
                this.envs = envs;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * JarStartArgs.
             */
            public Builder jarStartArgs(String jarStartArgs) {
                this.jarStartArgs = jarStartArgs;
                return this;
            }

            /**
             * JarStartOptions.
             */
            public Builder jarStartOptions(String jarStartOptions) {
                this.jarStartOptions = jarStartOptions;
                return this;
            }

            /**
             * Jdk.
             */
            public Builder jdk(String jdk) {
                this.jdk = jdk;
                return this;
            }

            /**
             * KafkaConfigs.
             */
            public Builder kafkaConfigs(String kafkaConfigs) {
                this.kafkaConfigs = kafkaConfigs;
                return this;
            }

            /**
             * Liveness.
             */
            public Builder liveness(String liveness) {
                this.liveness = liveness;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * MinReadyInstanceRatio.
             */
            public Builder minReadyInstanceRatio(Integer minReadyInstanceRatio) {
                this.minReadyInstanceRatio = minReadyInstanceRatio;
                return this;
            }

            /**
             * MinReadyInstances.
             */
            public Builder minReadyInstances(Integer minReadyInstances) {
                this.minReadyInstances = minReadyInstances;
                return this;
            }

            /**
             * MountDesc.
             */
            public Builder mountDesc(java.util.List < MountDesc> mountDesc) {
                this.mountDesc = mountDesc;
                return this;
            }

            /**
             * MountHost.
             */
            public Builder mountHost(String mountHost) {
                this.mountHost = mountHost;
                return this;
            }

            /**
             * 对应MSE产品侧应用ID
             */
            public Builder mseApplicationId(String mseApplicationId) {
                this.mseApplicationId = mseApplicationId;
                return this;
            }

            /**
             * MseFeatureConfig.
             */
            public Builder mseFeatureConfig(String mseFeatureConfig) {
                this.mseFeatureConfig = mseFeatureConfig;
                return this;
            }

            /**
             * NamespaceId.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * NasId.
             */
            public Builder nasId(String nasId) {
                this.nasId = nasId;
                return this;
            }

            /**
             * OSS读写的AK
             */
            public Builder ossAkId(String ossAkId) {
                this.ossAkId = ossAkId;
                return this;
            }

            /**
             * OSS读写的secret
             */
            public Builder ossAkSecret(String ossAkSecret) {
                this.ossAkSecret = ossAkSecret;
                return this;
            }

            /**
             * OSS挂载描述信息
             */
            public Builder ossMountDescs(java.util.List < OssMountDescs> ossMountDescs) {
                this.ossMountDescs = ossMountDescs;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * PackageUrl.
             */
            public Builder packageUrl(String packageUrl) {
                this.packageUrl = packageUrl;
                return this;
            }

            /**
             * PackageVersion.
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * PhpArmsConfigLocation.
             */
            public Builder phpArmsConfigLocation(String phpArmsConfigLocation) {
                this.phpArmsConfigLocation = phpArmsConfigLocation;
                return this;
            }

            /**
             * PhpConfig.
             */
            public Builder phpConfig(String phpConfig) {
                this.phpConfig = phpConfig;
                return this;
            }

            /**
             * PhpConfigLocation.
             */
            public Builder phpConfigLocation(String phpConfigLocation) {
                this.phpConfigLocation = phpConfigLocation;
                return this;
            }

            /**
             * PostStart.
             */
            public Builder postStart(String postStart) {
                this.postStart = postStart;
                return this;
            }

            /**
             * PreStop.
             */
            public Builder preStop(String preStop) {
                this.preStop = preStop;
                return this;
            }

            /**
             * ProgrammingLanguage.
             */
            public Builder programmingLanguage(String programmingLanguage) {
                this.programmingLanguage = programmingLanguage;
                return this;
            }

            /**
             * Readiness.
             */
            public Builder readiness(String readiness) {
                this.readiness = readiness;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Replicas.
             */
            public Builder replicas(Integer replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SlsConfigs.
             */
            public Builder slsConfigs(String slsConfigs) {
                this.slsConfigs = slsConfigs;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TerminationGracePeriodSeconds.
             */
            public Builder terminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
                this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
                return this;
            }

            /**
             * Timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * TomcatConfig.
             */
            public Builder tomcatConfig(String tomcatConfig) {
                this.tomcatConfig = tomcatConfig;
                return this;
            }

            /**
             * UpdateStrategy.
             */
            public Builder updateStrategy(String updateStrategy) {
                this.updateStrategy = updateStrategy;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * WarStartOptions.
             */
            public Builder warStartOptions(String warStartOptions) {
                this.warStartOptions = warStartOptions;
                return this;
            }

            /**
             * WebContainer.
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
