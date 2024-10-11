// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationConfigResponseBody</p>
 */
public class DescribeApplicationConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
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
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: The call was successful.</li>
         * <li><strong>3xx</strong>: The call was redirected.</li>
         * <li><strong>4xx</strong>: The call failed.</li>
         * <li><strong>5xx</strong>: A server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the application.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned error code. Valid values:</p>
         * <ul>
         * <li>If the call is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
         * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section of this topic.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned information.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>01CF26C7-00A3-4AA6-BA76-7E95F2A3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the configurations of an application were obtained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The configurations were obtained.</li>
         * <li><strong>false</strong>: The configurations failed to be obtained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The trace ID that is used to query the details of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ac1a0b2215622246421415014e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeApplicationConfigResponseBody build() {
            return new DescribeApplicationConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class ConfigMapMountDesc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigMapId")
        private Long configMapId;

        @com.aliyun.core.annotation.NameInMap("ConfigMapName")
        private String configMapName;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("MountPath")
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
             * <p>The ID of the ConfigMap.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder configMapId(Long configMapId) {
                this.configMapId = configMapId;
                return this;
            }

            /**
             * <p>The name of the ConfigMap.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder configMapName(String configMapName) {
                this.configMapName = configMapName;
                return this;
            }

            /**
             * <p>The key-value pair that is stored in the ConfigMap.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The path on which the ConfigMap is mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp</p>
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
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class MountDesc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("NasPath")
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
             * <p>The path on which the NAS file system is mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The directory in the NAS file system.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
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
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class OssMountDescs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("bucketPath")
        private String bucketPath;

        @com.aliyun.core.annotation.NameInMap("mountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("readOnly")
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
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-bucket</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The directory or object in OSS. If the specified directory or object does not exist, an error is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>data/user.data</p>
             */
            public Builder bucketPath(String bucketPath) {
                this.bucketPath = bucketPath;
                return this;
            }

            /**
             * <p>The path of the container in SAE. The parameter value that you specified overwrites the original value. If the specified path does not exist, SAE automatically creates the path.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/data/user.data</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>Indicates whether the application can use the container path to read data from or write data to resources in the directory of the OSS bucket. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The application has the read-only permissions.</li>
             * <li><strong>false</strong>: The application has the read and write permissions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
    /**
     * 
     * {@link DescribeApplicationConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcrAssumeRoleArn")
        private String acrAssumeRoleArn;

        @com.aliyun.core.annotation.NameInMap("AcrInstanceId")
        private String acrInstanceId;

        @com.aliyun.core.annotation.NameInMap("AppDescription")
        private String appDescription;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppSource")
        private String appSource;

        @com.aliyun.core.annotation.NameInMap("AssociateEip")
        private Boolean associateEip;

        @com.aliyun.core.annotation.NameInMap("BatchWaitTime")
        private Integer batchWaitTime;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("CommandArgs")
        private String commandArgs;

        @com.aliyun.core.annotation.NameInMap("ConfigMapMountDesc")
        private java.util.List < ConfigMapMountDesc> configMapMountDesc;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CustomHostAlias")
        private String customHostAlias;

        @com.aliyun.core.annotation.NameInMap("Dotnet")
        private String dotnet;

        @com.aliyun.core.annotation.NameInMap("EdasContainerVersion")
        private String edasContainerVersion;

        @com.aliyun.core.annotation.NameInMap("EnableAhas")
        private String enableAhas;

        @com.aliyun.core.annotation.NameInMap("EnableCpuBurst")
        private String enableCpuBurst;

        @com.aliyun.core.annotation.NameInMap("EnableGreyTagRoute")
        private Boolean enableGreyTagRoute;

        @com.aliyun.core.annotation.NameInMap("EnableIdle")
        private Boolean enableIdle;

        @com.aliyun.core.annotation.NameInMap("EnableNewArms")
        private Boolean enableNewArms;

        @com.aliyun.core.annotation.NameInMap("Envs")
        private String envs;

        @com.aliyun.core.annotation.NameInMap("ImagePullSecrets")
        private String imagePullSecrets;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("JarStartArgs")
        private String jarStartArgs;

        @com.aliyun.core.annotation.NameInMap("JarStartOptions")
        private String jarStartOptions;

        @com.aliyun.core.annotation.NameInMap("Jdk")
        private String jdk;

        @com.aliyun.core.annotation.NameInMap("KafkaConfigs")
        private String kafkaConfigs;

        @com.aliyun.core.annotation.NameInMap("Liveness")
        private String liveness;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("MicroRegistration")
        private String microRegistration;

        @com.aliyun.core.annotation.NameInMap("MicroRegistrationConfig")
        private String microRegistrationConfig;

        @com.aliyun.core.annotation.NameInMap("MinReadyInstanceRatio")
        private Integer minReadyInstanceRatio;

        @com.aliyun.core.annotation.NameInMap("MinReadyInstances")
        private Integer minReadyInstances;

        @com.aliyun.core.annotation.NameInMap("MountDesc")
        private java.util.List < MountDesc> mountDesc;

        @com.aliyun.core.annotation.NameInMap("MountHost")
        private String mountHost;

        @com.aliyun.core.annotation.NameInMap("MseApplicationId")
        private String mseApplicationId;

        @com.aliyun.core.annotation.NameInMap("MseApplicationName")
        private String mseApplicationName;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("NasConfigs")
        private String nasConfigs;

        @com.aliyun.core.annotation.NameInMap("NasId")
        private String nasId;

        @com.aliyun.core.annotation.NameInMap("OssAkId")
        private String ossAkId;

        @com.aliyun.core.annotation.NameInMap("OssAkSecret")
        private String ossAkSecret;

        @com.aliyun.core.annotation.NameInMap("OssMountDescs")
        private java.util.List < OssMountDescs> ossMountDescs;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("PackageUrl")
        private String packageUrl;

        @com.aliyun.core.annotation.NameInMap("PackageVersion")
        private String packageVersion;

        @com.aliyun.core.annotation.NameInMap("Php")
        private String php;

        @com.aliyun.core.annotation.NameInMap("PhpArmsConfigLocation")
        private String phpArmsConfigLocation;

        @com.aliyun.core.annotation.NameInMap("PhpConfig")
        private String phpConfig;

        @com.aliyun.core.annotation.NameInMap("PhpConfigLocation")
        private String phpConfigLocation;

        @com.aliyun.core.annotation.NameInMap("PostStart")
        private String postStart;

        @com.aliyun.core.annotation.NameInMap("PreStop")
        private String preStop;

        @com.aliyun.core.annotation.NameInMap("ProgrammingLanguage")
        private String programmingLanguage;

        @com.aliyun.core.annotation.NameInMap("PvtzDiscovery")
        private String pvtzDiscovery;

        @com.aliyun.core.annotation.NameInMap("Python")
        private String python;

        @com.aliyun.core.annotation.NameInMap("PythonModules")
        private String pythonModules;

        @com.aliyun.core.annotation.NameInMap("Readiness")
        private String readiness;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Replicas")
        private Integer replicas;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("ServiceTags")
        private java.util.Map < String, String > serviceTags;

        @com.aliyun.core.annotation.NameInMap("SlsConfigs")
        private String slsConfigs;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TerminationGracePeriodSeconds")
        private Integer terminationGracePeriodSeconds;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("TomcatConfig")
        private String tomcatConfig;

        @com.aliyun.core.annotation.NameInMap("UpdateStrategy")
        private String updateStrategy;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("WarStartOptions")
        private String warStartOptions;

        @com.aliyun.core.annotation.NameInMap("WebContainer")
        private String webContainer;

        private Data(Builder builder) {
            this.acrAssumeRoleArn = builder.acrAssumeRoleArn;
            this.acrInstanceId = builder.acrInstanceId;
            this.appDescription = builder.appDescription;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appSource = builder.appSource;
            this.associateEip = builder.associateEip;
            this.batchWaitTime = builder.batchWaitTime;
            this.command = builder.command;
            this.commandArgs = builder.commandArgs;
            this.configMapMountDesc = builder.configMapMountDesc;
            this.cpu = builder.cpu;
            this.customHostAlias = builder.customHostAlias;
            this.dotnet = builder.dotnet;
            this.edasContainerVersion = builder.edasContainerVersion;
            this.enableAhas = builder.enableAhas;
            this.enableCpuBurst = builder.enableCpuBurst;
            this.enableGreyTagRoute = builder.enableGreyTagRoute;
            this.enableIdle = builder.enableIdle;
            this.enableNewArms = builder.enableNewArms;
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
            this.securityGroupId = builder.securityGroupId;
            this.serviceTags = builder.serviceTags;
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
        public String getEnableCpuBurst() {
            return this.enableCpuBurst;
        }

        /**
         * @return enableGreyTagRoute
         */
        public Boolean getEnableGreyTagRoute() {
            return this.enableGreyTagRoute;
        }

        /**
         * @return enableIdle
         */
        public Boolean getEnableIdle() {
            return this.enableIdle;
        }

        /**
         * @return enableNewArms
         */
        public Boolean getEnableNewArms() {
            return this.enableNewArms;
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
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return serviceTags
         */
        public java.util.Map < String, String > getServiceTags() {
            return this.serviceTags;
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
            private String appSource; 
            private Boolean associateEip; 
            private Integer batchWaitTime; 
            private String command; 
            private String commandArgs; 
            private java.util.List < ConfigMapMountDesc> configMapMountDesc; 
            private Integer cpu; 
            private String customHostAlias; 
            private String dotnet; 
            private String edasContainerVersion; 
            private String enableAhas; 
            private String enableCpuBurst; 
            private Boolean enableGreyTagRoute; 
            private Boolean enableIdle; 
            private Boolean enableNewArms; 
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
            private String securityGroupId; 
            private java.util.Map < String, String > serviceTags; 
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
             * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is used to pull images across accounts. For more information, see <a href="https://help.aliyun.com/document_detail/190675.html">Pull images across Alibaba Cloud accounts</a> and <a href="https://help.aliyun.com/document_detail/223585.html">Grant permissions across Alibaba Cloud accounts by using a RAM role</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::123456789012****:role/adminrole</p>
             */
            public Builder acrAssumeRoleArn(String acrAssumeRoleArn) {
                this.acrAssumeRoleArn = acrAssumeRoleArn;
                return this;
            }

            /**
             * <p>The ID of the Container Registry Enterprise Edition instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-xxxxxx</p>
             */
            public Builder acrInstanceId(String acrInstanceId) {
                this.acrInstanceId = acrInstanceId;
                return this;
            }

            /**
             * <p>The description of the application.</p>
             */
            public Builder appDescription(String appDescription) {
                this.appDescription = appDescription;
                return this;
            }

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The SAE application type.</p>
             * 
             * <strong>example:</strong>
             * <p>micro_service</p>
             */
            public Builder appSource(String appSource) {
                this.appSource = appSource;
                return this;
            }

            /**
             * <p>Indicates whether an elastic IP address (EIP) is associated with the application instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The EIP is associated with the application instance.</li>
             * <li><strong>false</strong>: The EIP is not associated with the application instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder associateEip(Boolean associateEip) {
                this.associateEip = associateEip;
                return this;
            }

            /**
             * <p>The interval between batches in a phased release. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder batchWaitTime(Integer batchWaitTime) {
                this.batchWaitTime = batchWaitTime;
                return this;
            }

            /**
             * <p>The command that is used to start the image. The command must be an existing executable object in the container. Example:</p>
             * <pre><code>
             * command:
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
                this.command = command;
                return this;
            }

            /**
             * <p>The parameters of the image startup command. The CommandArgs parameter contains the parameters that are required for the <strong>Command</strong> parameter. Format:</p>
             * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
             * <p>In the preceding <strong>Command</strong> example, the CommandArgs parameter is set to <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>. The data type of <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be an array of strings in the JSON format. You do not need to configure this parameter if it does not exist in the Command parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;a&quot;,&quot;b&quot;]</p>
             */
            public Builder commandArgs(String commandArgs) {
                this.commandArgs = commandArgs;
                return this;
            }

            /**
             * <p>The details of the ConfigMap.</p>
             */
            public Builder configMapMountDesc(java.util.List < ConfigMapMountDesc> configMapMountDesc) {
                this.configMapMountDesc = configMapMountDesc;
                return this;
            }

            /**
             * <p>The CPU specifications that are required for each instance. Unit: millicores. You cannot set this parameter to 0. Valid values:</p>
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
                this.cpu = cpu;
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
             * <p>[{&quot;hostName&quot;:&quot;test.host.name&quot;,&quot;ip&quot;:&quot;0.0.0.0&quot;}]</p>
             */
            public Builder customHostAlias(String customHostAlias) {
                this.customHostAlias = customHostAlias;
                return this;
            }

            /**
             * Dotnet.
             */
            public Builder dotnet(String dotnet) {
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
                this.edasContainerVersion = edasContainerVersion;
                return this;
            }

            /**
             * <p>Indicates whether access to Application High Availability Service (AHAS) is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Access to AHAS is enabled.</li>
             * <li><strong>false</strong>: Access to AHAS is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAhas(String enableAhas) {
                this.enableAhas = enableAhas;
                return this;
            }

            /**
             * EnableCpuBurst.
             */
            public Builder enableCpuBurst(String enableCpuBurst) {
                this.enableCpuBurst = enableCpuBurst;
                return this;
            }

            /**
             * <p>Indicates whether canary release rules are enabled. Canary release rules apply only to applications in Spring Cloud and Dubbo frameworks. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The canary release rules are enabled.</li>
             * <li><strong>false</strong>: The canary release rules are disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableGreyTagRoute(Boolean enableGreyTagRoute) {
                this.enableGreyTagRoute = enableGreyTagRoute;
                return this;
            }

            /**
             * EnableIdle.
             */
            public Builder enableIdle(Boolean enableIdle) {
                this.enableIdle = enableIdle;
                return this;
            }

            /**
             * EnableNewArms.
             */
            public Builder enableNewArms(Boolean enableNewArms) {
                this.enableNewArms = enableNewArms;
                return this;
            }

            /**
             * <p>The environment variables. Variable description:</p>
             * <ul>
             * <li><strong>name</strong>: the name of the environment variable.</li>
             * <li><strong>value</strong>: the value or reference of the environment variable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;name&quot;:&quot;TEST_ENV_KEY&quot;,&quot;value&quot;:&quot;TEST_ENV_VAR&quot;}]</p>
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
             * <p>The URL of the image. This parameter is returned only if the <strong>PackageType</strong> parameter is set to <strong>Image</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>docker.io/library/nginx:1.14.2</p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The arguments in the JAR package. The arguments are used to start the application container. The default startup command is <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>start</p>
             */
            public Builder jarStartArgs(String jarStartArgs) {
                this.jarStartArgs = jarStartArgs;
                return this;
            }

            /**
             * <p>The option settings in the JAR package. The settings are used to start the application container. The default startup command is <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>-Dtest=true</p>
             */
            public Builder jarStartOptions(String jarStartOptions) {
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
                this.jdk = jdk;
                return this;
            }

            /**
             * <p>The logging configurations of Message Queue for Apache Kafka. The following parameters are involved:</p>
             * <ul>
             * <li><p><strong>KafkaConfigs</strong>: the configurations of Message Queue for Apache Kafka.</p>
             * </li>
             * <li><p><strong>createTime</strong>: the time when the Message Queue for Apache Kafka instance was created.</p>
             * </li>
             * <li><p><strong>kafkaTopic</strong>: the message topic that is used to classify messages.</p>
             * </li>
             * <li><p><strong>logDir</strong>: the path in which logs are stored.</p>
             * </li>
             * <li><p><strong>logType</strong>: the type of collected logs. Valid values:</p>
             * <ul>
             * <li><strong>file_log</strong>: the file log that is stored in the container. The path of the file logs in the container is returned.</li>
             * <li><strong>stdout</strong>: the standard output log of the container. You can specify only one stdout value.</li>
             * </ul>
             * </li>
             * <li><p><strong>kafkaEndpoint</strong>: the endpoint of the Message Queue for Apache Kafka service.</p>
             * </li>
             * <li><p><strong>kafkaInstanceId</strong>: the ID of the Message Queue for Apache Kafka instance.</p>
             * </li>
             * <li><p><strong>region</strong>: the region where the Message Queue for Apache Kafka instance resides.</p>
             * </li>
             * </ul>
             */
            public Builder kafkaConfigs(String kafkaConfigs) {
                this.kafkaConfigs = kafkaConfigs;
                return this;
            }

            /**
             * <p>The details of the availability check that was performed on the container. If the container fails this health check multiple times, the system disables and restarts the container. You can use one of the following methods to perform the health check:</p>
             * <ul>
             * <li>Sample code of the <strong>exec</strong> method: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat/home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</code></li>
             * <li>Sample code of the <strong>httpGet</strong> method: <code>{&quot;httpGet&quot;:{&quot;path&quot;:&quot;/&quot;,&quot;port&quot;:18091,&quot;scheme&quot;:&quot;HTTP&quot;,&quot;isContainKeyWord&quot;:true,&quot;keyWord&quot;:&quot;SAE&quot;},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></li>
             * <li>Sample code of the <strong>tcpSocket</strong> method: <code>{&quot;tcpSocket&quot;:{&quot;port&quot;:18091},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></li>
             * </ul>
             * <blockquote>
             * <p> You can use only one method to perform the health check.</p>
             * </blockquote>
             * <p>The following parameters are involved:</p>
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
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;curl <a href="http://localhost:8080%22%5D%7D,%22initialDelaySeconds%22:20,%22timeoutSeconds%22:3%7D">http://localhost:8080&quot;]},&quot;initialDelaySeconds&quot;:20,&quot;timeoutSeconds&quot;:3}</a></p>
             */
            public Builder liveness(String liveness) {
                this.liveness = liveness;
                return this;
            }

            /**
             * <p>The size of memory required by each instance. Unit: MB. You cannot set this parameter to 0. The values of this parameter correspond to the values of the Cpu parameter:</p>
             * <ul>
             * <li>This parameter is set to <strong>1024</strong> if the Cpu parameter is set to 500 or 1000.</li>
             * <li>This parameter is set to <strong>2048</strong> if the Cpu parameter is set to 500, 1000, or 1000.</li>
             * <li>This parameter is set to <strong>4096</strong> if the Cpu parameter is set to 1000, 2000, or 4000.</li>
             * <li>This parameter is set to <strong>8192</strong> if the Cpu parameter is set to 2000, 4000, or 8000.</li>
             * <li>This parameter is set to <strong>12288</strong> if the Cpu parameter is set to 12000.</li>
             * <li>This parameter is set to <strong>16384</strong> if the Cpu parameter is set to 4000, 8000, or 16000.</li>
             * <li>This parameter is set to <strong>24567</strong> if the Cpu parameter is set to 12000.</li>
             * <li>This parameter is set to <strong>32768</strong> if the Cpu parameter is set to 16000.</li>
             * <li>This parameter is set to <strong>65536</strong> if the Cpu parameter is set to 8000, 16000, or 32000.</li>
             * <li>This parameter is set to <strong>131072</strong> if the Cpu parameter is set to 32000.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
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
             * MicroRegistrationConfig.
             */
            public Builder microRegistrationConfig(String microRegistrationConfig) {
                this.microRegistrationConfig = microRegistrationConfig;
                return this;
            }

            /**
             * <p>The percentage of the minimum number of available instances. Valid values:</p>
             * <ul>
             * <li><strong>-1</strong>: the default value. This value indicates that the minimum number of available instances is not measured by percentage. If you do not configure this parameter, the default value <strong>-1</strong> is used.</li>
             * <li><strong>0 to 100</strong>: indicates that the minimum number of available instances is calculated by using the following formula: Current number of instances × (Value of MinReadyInstanceRatio × 100%). If the calculated result is not an integer, the result is rounded up to the nearest integer. For example, if the percentage is set to <strong>50</strong>% and five instances are available, the minimum number of available instances is 3.</li>
             * </ul>
             * <blockquote>
             * <p> If the <strong>MinReadyInstance</strong> and <strong>MinReadyInstanceRatio</strong> parameters are returned and the value of the <strong>MinReadyInstanceRatio</strong> parameter is not <strong>-1</strong>, the value of the <strong>MinReadyInstanceRatio</strong> parameter takes effect. If the <strong>MinReadyInstances</strong> parameter is set to <strong>5</strong> and the <strong>MinReadyInstanceRatio</strong> parameter is set to <strong>50</strong>, the value of the <strong>MinReadyInstanceRatio</strong> parameter determines the minimum number of available instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder minReadyInstanceRatio(Integer minReadyInstanceRatio) {
                this.minReadyInstanceRatio = minReadyInstanceRatio;
                return this;
            }

            /**
             * <p>The minimum number of available instances. Valid values:</p>
             * <ul>
             * <li>If you set the value to <strong>0</strong>, business interruptions occur when the application is updated.</li>
             * <li>If you set the value to <strong>-1</strong>, the minimum number of available instances is automatically set to a system-recommended value. The value is the nearest integer to which the calculated result of the following formula is rounded up: Current number of instances × 25%. For example, if five instances are available, the minimum number of available instances is calculated by using the following formula: 5 × 25% = 1.25. In this case, the minimum number of available instances is 2.</li>
             * </ul>
             * <blockquote>
             * <p> Make sure that at least one instance is available during application deployment and rollback to prevent business interruptions.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minReadyInstances(Integer minReadyInstances) {
                this.minReadyInstances = minReadyInstances;
                return this;
            }

            /**
             * <p>The details of the mounted NAS file system.</p>
             */
            public Builder mountDesc(java.util.List < MountDesc> mountDesc) {
                this.mountDesc = mountDesc;
                return this;
            }

            /**
             * <p>The mount target of the NAS file system in the VPC where the application is deployed. If you do not need to modify this configuration during the deployment, configure the <strong>MountHost</strong> parameter only in the first request. You do not need to include this parameter in subsequent requests. If you need to remove this configuration, leave the <strong>MountHost</strong> parameter empty in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder mountHost(String mountHost) {
                this.mountHost = mountHost;
                return this;
            }

            /**
             * <p>The ID of the microservice application.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxx@xxxxx</p>
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
             * <p>The ID of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing:test</p>
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
             * <p>The ID of the NAS file system.</p>
             * 
             * <strong>example:</strong>
             * <p>AKSN89**</p>
             */
            public Builder nasId(String nasId) {
                this.nasId = nasId;
                return this;
            }

            /**
             * <p>The AccessKey ID that is used to read data from and write data to Object Storage Service (OSS) buckets.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
             */
            public Builder ossAkId(String ossAkId) {
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
                this.ossAkSecret = ossAkSecret;
                return this;
            }

            /**
             * <p>The description of the mounted OSS bucket.</p>
             */
            public Builder ossMountDescs(java.util.List < OssMountDescs> ossMountDescs) {
                this.ossMountDescs = ossMountDescs;
                return this;
            }

            /**
             * <p>The type of the deployment package. Valid values:</p>
             * <ul>
             * <li><p>If you deploy the application by using a Java Archive (JAR) package, you can set this parameter to <strong>FatJar</strong>, <strong>War</strong>, or <strong>Image</strong>.</p>
             * </li>
             * <li><p>If you deploy the application by using a PHP package, you can set this parameter to one of the following values:</p>
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
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>War</p>
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * <p>The URL of the deployment package. This parameter is returned only if the <strong>PackageType</strong> parameter is set to <strong>FatJar</strong> or <strong>War</strong>.</p>
             */
            public Builder packageUrl(String packageUrl) {
                this.packageUrl = packageUrl;
                return this;
            }

            /**
             * <p>The version of the deployment package. This parameter is returned only if the <strong>PackageType</strong> parameter is set to <strong>FatJar</strong> or <strong>War</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
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
             * <p>The path on which the PHP configuration file for application monitoring is mounted. Make sure that the PHP server loads the configuration file.</p>
             * <p>SAE automatically generates the corresponding configuration file. No manual operations are required.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/etc/php/conf.d/arms.ini</p>
             */
            public Builder phpArmsConfigLocation(String phpArmsConfigLocation) {
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
                this.phpConfigLocation = phpConfigLocation;
                return this;
            }

            /**
             * <p>The script that is run immediately after the container is started. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code></p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
             */
            public Builder postStart(String postStart) {
                this.postStart = postStart;
                return this;
            }

            /**
             * <p>The script that is run before the container is stopped. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code></p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
             */
            public Builder preStop(String preStop) {
                this.preStop = preStop;
                return this;
            }

            /**
             * <p>The programming language that is used to create the application. Valid values:</p>
             * <ul>
             * <li><strong>java</strong>: Java</li>
             * <li><strong>php</strong>: PHP</li>
             * <li><strong>other</strong>: Other programming languages, such as Python, C++, Go, .NET, and Node.js.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>java</p>
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
             * <p>The details of the health check that was performed on the container. If the container fails this health check multiple times, the system disables and restarts the container. Containers that fail health checks cannot receive traffic from Server Load Balancer (SLB) instances. You can use the <strong>exec</strong>, <strong>httpGet</strong>, or <strong>tcpSocket</strong> method to perform health checks. For more information, see the description of the <strong>Liveness</strong> parameter.</p>
             * <blockquote>
             * <p> You can use only one method to perform the health check.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;curl <a href="http://localhost:8080%22%5D%7D,%22initialDelaySeconds%22:20,%22timeoutSeconds%22:5%7D">http://localhost:8080&quot;]},&quot;initialDelaySeconds&quot;:20,&quot;timeoutSeconds&quot;:5}</a></p>
             */
            public Builder readiness(String readiness) {
                this.readiness = readiness;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of application instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder replicas(Integer replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-wz969ngg2e49q5i4****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * ServiceTags.
             */
            public Builder serviceTags(java.util.Map < String, String > serviceTags) {
                this.serviceTags = serviceTags;
                return this;
            }

            /**
             * <p>The logging configurations of Log Service.</p>
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
             * 
             * <strong>example:</strong>
             * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
             */
            public Builder slsConfigs(String slsConfigs) {
                this.slsConfigs = slsConfigs;
                return this;
            }

            /**
             * <p>The details of the tags.</p>
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The timeout period for a graceful shutdown. Default value: 30. Unit: seconds. Valid values: 1 to 300.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder terminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
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
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The Tomcat configuration. If you want to delete the configuration, set this parameter to {} or leave this parameter empty. The following parameters are involved:</p>
             * <ul>
             * <li><strong>port</strong>: the port number. Valid values: 1024 to 65535. The root permissions are required to perform operations on ports whose number is smaller than 1024. Enter a value that ranges from 1025 to 65535 because the container has only the admin permissions. If you do not configure this parameter, the default port number 8080 is used.</li>
             * <li><strong>contextPath</strong>: the path. Default value: /. This value indicates the root directory.</li>
             * <li><strong>maxThreads</strong>: the maximum number of connections in the connection pool. Default value: 400.</li>
             * <li><strong>uriEncoding</strong>: the URI encoding scheme in the Tomcat container. Valid values: <strong>UTF-8</strong>, <strong>ISO-8859-1</strong>, <strong>GBK</strong>, and <strong>GB2312</strong>. If you do not configure this parameter, the default value <strong>ISO-8859-1</strong> is used.</li>
             * <li><strong>useBodyEncoding</strong>: indicates whether to use the encoding scheme that is specified by <strong>BodyEncoding for URL</strong>. Default value: <strong>true</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;port&quot;:8080,&quot;contextPath&quot;:&quot;/&quot;,&quot;maxThreads&quot;:400,&quot;uriEncoding&quot;:&quot;ISO-8859-1&quot;,&quot;useBodyEncodingForUri&quot;:true}</p>
             */
            public Builder tomcatConfig(String tomcatConfig) {
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
             * <p>The following parameters are involved:</p>
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
                this.updateStrategy = updateStrategy;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2ze559r1z1bpwqxwp****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze0i263cnn311nvj****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The option settings in the WAR package. The settings are used to start the application container. The default startup command is <code>java $JAVA_OPTS $CATALINA_OPTS -Options org.apache.catalina.startup.Bootstrap &quot;$@&quot; start</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>custom-option</p>
             */
            public Builder warStartOptions(String warStartOptions) {
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
                this.webContainer = webContainer;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
