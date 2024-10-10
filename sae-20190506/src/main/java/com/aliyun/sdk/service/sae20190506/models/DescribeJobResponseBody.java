// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobResponseBody</p>
 */
public class DescribeJobResponseBody extends TeaModel {
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
         * <p>The error code returned. Take note of the following rules:</p>
         * <ul>
         * <li>If the call is successful, <strong>ErrorCode</strong> is not returned.</li>
         * <li>If the call fails, <strong>ErrorCode</strong> is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Null</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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

        public DescribeJobResponseBody build() {
            return new DescribeJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeJobResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResponseBody</p>
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
             * <p>The ConfigMap ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder configMapId(Long configMapId) {
                this.configMapId = configMapId;
                return this;
            }

            /**
             * <p>The ConfigMap name.</p>
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
             * <p>The path on which the NAS file system is mounted.</p>
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
     * {@link DescribeJobResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResponseBody</p>
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
     * {@link DescribeJobResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResponseBody</p>
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
             * <p>The bucket name.</p>
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
             * <li><strong>true</strong>: The application has the read-only permission.</li>
             * <li><strong>false</strong>: The application has read and write permissions.</li>
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
     * {@link DescribeJobResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResponseBody</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
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
     * {@link DescribeJobResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("BackoffLimit")
        private Long backoffLimit;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("CommandArgs")
        private String commandArgs;

        @com.aliyun.core.annotation.NameInMap("ConcurrencyPolicy")
        private String concurrencyPolicy;

        @com.aliyun.core.annotation.NameInMap("ConfigMapMountDesc")
        private java.util.List < ConfigMapMountDesc> configMapMountDesc;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CustomHostAlias")
        private String customHostAlias;

        @com.aliyun.core.annotation.NameInMap("EdasContainerVersion")
        private String edasContainerVersion;

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

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("MountDesc")
        private java.util.List < MountDesc> mountDesc;

        @com.aliyun.core.annotation.NameInMap("MountHost")
        private String mountHost;

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

        @com.aliyun.core.annotation.NameInMap("PublicWebHookUrls")
        private java.util.List < String > publicWebHookUrls;

        @com.aliyun.core.annotation.NameInMap("Python")
        private String python;

        @com.aliyun.core.annotation.NameInMap("PythonModules")
        private String pythonModules;

        @com.aliyun.core.annotation.NameInMap("RefAppId")
        private String refAppId;

        @com.aliyun.core.annotation.NameInMap("RefedAppIds")
        private java.util.List < String > refedAppIds;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Replicas")
        private Integer replicas;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Slice")
        private Boolean slice;

        @com.aliyun.core.annotation.NameInMap("SliceEnvs")
        private String sliceEnvs;

        @com.aliyun.core.annotation.NameInMap("SlsConfigs")
        private String slsConfigs;

        @com.aliyun.core.annotation.NameInMap("Suspend")
        private Boolean suspend;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TerminationGracePeriodSeconds")
        private Integer terminationGracePeriodSeconds;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Long timeout;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("TomcatConfig")
        private String tomcatConfig;

        @com.aliyun.core.annotation.NameInMap("TriggerConfig")
        private String triggerConfig;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcWebHookUrls")
        private java.util.List < String > vpcWebHookUrls;

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
             * 
             * <strong>example:</strong>
             * <p>Sample application</p>
             */
            public Builder appDescription(String appDescription) {
                this.appDescription = appDescription;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The number of times that the job was retried.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder backoffLimit(Long backoffLimit) {
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
                this.command = command;
                return this;
            }

            /**
             * <p>The arguments of the image startup command. This parameter contains the arguments that are required for <strong>Command</strong>. Format:</p>
             * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
             * <p>In the preceding <strong>Command</strong> example, the CommandArgs parameter is set to <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>. The data type of <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be an array of strings in the JSON format. If this parameter does not exist in the Command parameter, you do not need to configure it.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;a&quot;,&quot;b&quot;]</p>
             */
            public Builder commandArgs(String commandArgs) {
                this.commandArgs = commandArgs;
                return this;
            }

            /**
             * <p>The concurrency policy of the job. Valid values:</p>
             * <ul>
             * <li><strong>Forbid</strong>: Concurrent running is prohibited. If the previous job is not completed, no new job is created.</li>
             * <li><strong>Allow</strong>: Concurrent running is allowed.</li>
             * <li><strong>Replace</strong>: If the previous job is not completed when the time to create a new job is reached, the new job replaces the previous job.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Allow</p>
             */
            public Builder concurrencyPolicy(String concurrencyPolicy) {
                this.concurrencyPolicy = concurrencyPolicy;
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
             * <p>The CPU specifications required for each instance. Unit: millicore. This parameter cannot be set to 0. Valid values:</p>
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
             * <p>The custom mapping between the hostname and IP address in the container. Valid values:</p>
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
             * <p>The environment variables. You can configure custom environment variables or reference a ConfigMap. If you want to reference a ConfigMap, you must first create a ConfigMap. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
             * <ul>
             * <li><p>Custom configuration</p>
             * <ul>
             * <li><strong>name</strong>: the name of the environment variable.</li>
             * <li><strong>value</strong>: the value of the environment variable.</li>
             * </ul>
             * </li>
             * <li><p>Reference a ConfigMap</p>
             * <ul>
             * <li><strong>name</strong>: the name of the environment variable. You can reference one or all keys. To reference all keys, specify <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>. Example: <code>sae-sys-configmap-all-test1</code>.</li>
             * <li><strong>valueFrom</strong>: the reference of the environment variable. Set the value to <code>configMapRef</code>.</li>
             * <li><strong>configMapId</strong>: the ID of the ConfigMap.</li>
             * <li><strong>key</strong>: the key. If you want to reference all keys, you do not need to configure this parameter.</li>
             * </ul>
             * </li>
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
             * <p>The ID of the corresponding secret.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder imagePullSecrets(String imagePullSecrets) {
                this.imagePullSecrets = imagePullSecrets;
                return this;
            }

            /**
             * <p>The URL of the image. This parameter is returned only if <strong>PackageType</strong> is set to <strong>Image</strong>.</p>
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
             * <p>The version of the Java Development Kit (JDK) on which the deployment package of the application depends. The following versions are supported:</p>
             * <ul>
             * <li><strong>Open JDK 8</strong></li>
             * <li><strong>Open JDK 7</strong></li>
             * <li><strong>Dragonwell 11</strong></li>
             * <li><strong>Dragonwell 8</strong></li>
             * <li><strong>openjdk-8u191-jdk-alpine3.9</strong></li>
             * <li><strong>openjdk-7u201-jdk-alpine3.9</strong></li>
             * </ul>
             * <p>This parameter is not returned if <strong>PackageType</strong> is set to <strong>Image</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Open JDK 8</p>
             */
            public Builder jdk(String jdk) {
                this.jdk = jdk;
                return this;
            }

            /**
             * <p>The size of memory that is required by each instance. Unit: MB. This parameter cannot be set to 0. The values of this parameter correspond to the values of the Cpu parameter:</p>
             * <ul>
             * <li>This parameter is set to <strong>1024</strong> if the Cpu parameter is set to 500 or 1000.</li>
             * <li>This parameter is set to <strong>2048</strong> if the Cpu parameter is set to 500, 1000, or 2000.</li>
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
             * <p>The details of the mounted NAS file system.</p>
             */
            public Builder mountDesc(java.util.List < MountDesc> mountDesc) {
                this.mountDesc = mountDesc;
                return this;
            }

            /**
             * <p>The mount target of the NAS file system in the VPC in which the application is deployed. If you do not need to modify this configuration during the deployment, configure <strong>MountHost</strong> only in the first request. If you need to remove this configuration, leave <strong>MountHost</strong> empty in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder mountHost(String mountHost) {
                this.mountHost = mountHost;
                return this;
            }

            /**
             * <p>The namespace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing:test</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The configurations for mounting the NAS file system.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;mountPath&quot;:&quot;/test1&quot;,&quot;readOnly&quot;:false,&quot;nasId&quot;:&quot;nasId1&quot;,&quot;mountDomain&quot;:&quot;nasId1.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;nasPath&quot;:&quot;/test1&quot;},{&quot;nasId&quot;:&quot;nasId2&quot;,&quot;mountDomain&quot;:&quot;nasId2.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;readOnly&quot;:false,&quot;nasPath&quot;:&quot;/test2&quot;,&quot;mountPath&quot;:&quot;/test2&quot;}]</p>
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
             * <p>The AccessKey ID that is used to read data from and write data to Object Storage Service (OSS).</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
             */
            public Builder ossAkId(String ossAkId) {
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
                this.ossAkSecret = ossAkSecret;
                return this;
            }

            /**
             * <p>The description of mounted OSS buckets.</p>
             */
            public Builder ossMountDescs(java.util.List < OssMountDescs> ossMountDescs) {
                this.ossMountDescs = ossMountDescs;
                return this;
            }

            /**
             * <p>The type of the deployment package. Valid values:</p>
             * <ul>
             * <li><p>If you deploy the application by using a Java Archive (JAR) package, this parameter is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>Image</strong>.</p>
             * </li>
             * <li><p>If you deploy the application by using a PHP package, this parameter is set to one of the following values:</p>
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
             * <li><p>If you deploy the application by using a Pythhon package, this parameter is set to <strong>PythonZip</strong> or <strong>Image</strong>.</p>
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
             * <p>The URL of the deployment package. This parameter is returned only if <strong>PackageType</strong> is set to <strong>FatJar</strong> or <strong>War</strong>.</p>
             */
            public Builder packageUrl(String packageUrl) {
                this.packageUrl = packageUrl;
                return this;
            }

            /**
             * <p>The version of the deployment package. This parameter is required only if <strong>PackageType</strong> is set to <strong>FatJar</strong> or <strong>War</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
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
             * <p>The script that is run immediately after the container is started. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;\]}}</code></p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
             */
            public Builder postStart(String postStart) {
                this.postStart = postStart;
                return this;
            }

            /**
             * <p>The script that is run before the container is stopped. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;\]}}</code></p>
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
             * <li><strong>python</strong>: Python</li>
             * <li><strong>other</strong>: other programming languages, such as C++, Go, .NET, and Node.js.</li>
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
             * <p>The Internet request URLs of one-time jobs.</p>
             */
            public Builder publicWebHookUrls(java.util.List < String > publicWebHookUrls) {
                this.publicWebHookUrls = publicWebHookUrls;
                return this;
            }

            /**
             * <p>The Python environment. PYTHON 3.9.15 is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>PYTHON 3.9.15</p>
             */
            public Builder python(String python) {
                this.python = python;
                return this;
            }

            /**
             * <p>The configurations for installing custom module dependencies. By default, the dependencies defined by the requirements.txt file in the root directory are installed. If no software package is configured, you can specify dependencies based on your business requirements.</p>
             * 
             * <strong>example:</strong>
             * <p>Flask==2.0</p>
             */
            public Builder pythonModules(String pythonModules) {
                this.pythonModules = pythonModules;
                return this;
            }

            /**
             * <p>The ID of the job template that you reference.</p>
             * 
             * <strong>example:</strong>
             * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
             */
            public Builder refAppId(String refAppId) {
                this.refAppId = refAppId;
                return this;
            }

            /**
             * <p>The IDs of the referenced job templates.</p>
             */
            public Builder refedAppIds(java.util.List < String > refedAppIds) {
                this.refedAppIds = refedAppIds;
                return this;
            }

            /**
             * <p>The region ID.</p>
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
             * <p>Indicates whether job sharding is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder slice(Boolean slice) {
                this.slice = slice;
                return this;
            }

            /**
             * <p>The parameters of job sharding.</p>
             * 
             * <strong>example:</strong>
             * <p>SliceEnvs</p>
             */
            public Builder sliceEnvs(String sliceEnvs) {
                this.sliceEnvs = sliceEnvs;
                return this;
            }

            /**
             * <p>The logging configurations of Log Service.</p>
             * <ul>
             * <li>To use Log Service resources that are automatically created by SAE, set this parameter to <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</li>
             * <li>To use custom Log Service resources, set this parameter to <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</li>
             * </ul>
             * <p>Parameter description:</p>
             * <ul>
             * <li><strong>projectName</strong>: the name of the Log Service project.</li>
             * <li><strong>logDir</strong>: the path in which logs are stored.</li>
             * <li><strong>logType</strong>: the log type. <strong>stdout</strong>: the standard output (stdout) log of the container. Only one stdout value for this parameter can be specified. If this parameter is not configured, file logs are collected.</li>
             * <li><strong>logstoreName</strong>: the name of the Logstore in Log Service.</li>
             * <li><strong>logtailName</strong>: the name of the Logtail in Log Service. If this parameter is not configured, a new Logtail is created.</li>
             * </ul>
             * <p>If you do not need to modify the logging configurations when you deploy the application, configure <strong>SlsConfigs</strong> only in the first request. If you no longer need to use Log Service, leave <strong>SlsConfigs</strong> empty in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
             */
            public Builder slsConfigs(String slsConfigs) {
                this.slsConfigs = slsConfigs;
                return this;
            }

            /**
             * <p>Indicates whether the job template is suspended.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder suspend(Boolean suspend) {
                this.suspend = suspend;
                return this;
            }

            /**
             * <p>The tags.</p>
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
             * <p>The timeout period for the job. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder timeout(Long timeout) {
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
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The Tomcat configuration. If you want to delete the configuration, set this parameter to {} or leave this parameter empty. Parameter description:</p>
             * <ul>
             * <li><strong>port</strong>: the port number. Valid values: 1024 to 65535. The root permissions are required to perform operations on ports whose number is smaller than 1024. Enter a value that ranges from 1025 to 65535 because the container has only the admin permissions. If this parameter is not configured, the default value 8080 is used.</li>
             * <li><strong>contextPath</strong>: the path. Default value: /. The value indicates the root directory.</li>
             * <li><strong>maxThreads</strong>: the maximum number of connections in the connection pool. Default value: 400.</li>
             * <li><strong>uriEncoding</strong>: the URI encoding scheme in the Tomcat container. Valid values: <strong>UTF-8</strong>, <strong>ISO-8859-1</strong>, <strong>GBK</strong>, and <strong>GB2312</strong>. If this parameter is not configured, the default value <strong>ISO-8859-1</strong> is used.</li>
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
             * TriggerConfig.
             */
            public Builder triggerConfig(String triggerConfig) {
                this.triggerConfig = triggerConfig;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
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
             * <p>The internal request URLs for one-time jobs.</p>
             */
            public Builder vpcWebHookUrls(java.util.List < String > vpcWebHookUrls) {
                this.vpcWebHookUrls = vpcWebHookUrls;
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
             * <p>The version of the Tomcat container on which the deployment package depends. The following versions are supported:</p>
             * <ul>
             * <li><strong>apache-tomcat-7.0.91</strong></li>
             * <li><strong>apache-tomcat-8.5.42</strong></li>
             * </ul>
             * <p>This parameter is not returned if <strong>PackageType</strong> is set to <strong>Image</strong>.</p>
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
