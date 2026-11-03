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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeJobResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The API status code or POP error code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: Success.</li>
         * <li><strong>3xx</strong>: Redirection.</li>
         * <li><strong>4xx</strong>: Request error.</li>
         * <li><strong>5xx</strong>: Server error.</li>
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
         * <p>The task template information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. </p>
         * <ul>
         * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
         * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InvalidAppId.NotFound</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The additional information about the call result.</p>
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
         * <p>Indicates whether the task template configuration was retrieved successfully. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Retrieved successfully.</li>
         * <li><strong>false</strong>: Failed to retrieve.</li>
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
         * <p>The trace ID, which is used to accurately query call information.</p>
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

            private Builder() {
            } 

            private Builder(ConfigMapMountDesc model) {
                this.configMapId = model.configMapId;
                this.configMapName = model.configMapName;
                this.key = model.key;
                this.mountPath = model.mountPath;
            } 

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
             * <p>The key of the ConfigMap.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The mount path of the container.</p>
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

            private Builder() {
            } 

            private Builder(MountDesc model) {
                this.mountPath = model.mountPath;
                this.nasPath = model.nasPath;
            } 

            /**
             * <p>The mount path of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The relative file directory of the NAS file system.</p>
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

            private Builder() {
            } 

            private Builder(OssMountDescs model) {
                this.bucketName = model.bucketName;
                this.bucketPath = model.bucketPath;
                this.mountPath = model.mountPath;
                this.readOnly = model.readOnly;
            } 

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
             * <p>The directory or OSS object that you created in OSS. If the OSS mount directory does not exist, an exception is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>data/user.data</p>
             */
            public Builder bucketPath(String bucketPath) {
                this.bucketPath = bucketPath;
                return this;
            }

            /**
             * <p>The container path in SAE. If the path already exists, the existing path is overwritten. If the path does not exist, a new path is created.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/data/user.data</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>Specifies whether the container path has read permissions on the resources in the mount directory. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: read-only permissions.</li>
             * <li><strong>false</strong>: read and write permissions.</li>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

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

        @com.aliyun.core.annotation.NameInMap("BestEffortType")
        private String bestEffortType;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("CommandArgs")
        private String commandArgs;

        @com.aliyun.core.annotation.NameInMap("ConcurrencyPolicy")
        private String concurrencyPolicy;

        @com.aliyun.core.annotation.NameInMap("ConfigMapMountDesc")
        private java.util.List<ConfigMapMountDesc> configMapMountDesc;

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
        private java.util.List<MountDesc> mountDesc;

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
        private java.util.List<OssMountDescs> ossMountDescs;

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
        private java.util.List<String> publicWebHookUrls;

        @com.aliyun.core.annotation.NameInMap("Python")
        private String python;

        @com.aliyun.core.annotation.NameInMap("PythonModules")
        private String pythonModules;

        @com.aliyun.core.annotation.NameInMap("RefAppId")
        private String refAppId;

        @com.aliyun.core.annotation.NameInMap("RefedAppIds")
        private java.util.List<String> refedAppIds;

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
        private java.util.List<Tags> tags;

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
        private java.util.List<String> vpcWebHookUrls;

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
            this.bestEffortType = builder.bestEffortType;
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
         * @return bestEffortType
         */
        public String getBestEffortType() {
            return this.bestEffortType;
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
        public java.util.List<ConfigMapMountDesc> getConfigMapMountDesc() {
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
        public java.util.List<MountDesc> getMountDesc() {
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
        public java.util.List<OssMountDescs> getOssMountDescs() {
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
        public java.util.List<String> getPublicWebHookUrls() {
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
        public java.util.List<String> getRefedAppIds() {
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
        public java.util.List<Tags> getTags() {
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
        public java.util.List<String> getVpcWebHookUrls() {
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
            private String bestEffortType; 
            private String command; 
            private String commandArgs; 
            private String concurrencyPolicy; 
            private java.util.List<ConfigMapMountDesc> configMapMountDesc; 
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
            private java.util.List<MountDesc> mountDesc; 
            private String mountHost; 
            private String namespaceId; 
            private String nasConfigs; 
            private String nasId; 
            private String ossAkId; 
            private String ossAkSecret; 
            private java.util.List<OssMountDescs> ossMountDescs; 
            private String packageType; 
            private String packageUrl; 
            private String packageVersion; 
            private String phpConfig; 
            private String phpConfigLocation; 
            private String postStart; 
            private String preStop; 
            private String programmingLanguage; 
            private java.util.List<String> publicWebHookUrls; 
            private String python; 
            private String pythonModules; 
            private String refAppId; 
            private java.util.List<String> refedAppIds; 
            private String regionId; 
            private Integer replicas; 
            private String securityGroupId; 
            private Boolean slice; 
            private String sliceEnvs; 
            private String slsConfigs; 
            private Boolean suspend; 
            private java.util.List<Tags> tags; 
            private Integer terminationGracePeriodSeconds; 
            private Long timeout; 
            private String timezone; 
            private String tomcatConfig; 
            private String triggerConfig; 
            private String vSwitchId; 
            private String vpcId; 
            private java.util.List<String> vpcWebHookUrls; 
            private String warStartOptions; 
            private String webContainer; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.acrAssumeRoleArn = model.acrAssumeRoleArn;
                this.acrInstanceId = model.acrInstanceId;
                this.appDescription = model.appDescription;
                this.appId = model.appId;
                this.appName = model.appName;
                this.backoffLimit = model.backoffLimit;
                this.bestEffortType = model.bestEffortType;
                this.command = model.command;
                this.commandArgs = model.commandArgs;
                this.concurrencyPolicy = model.concurrencyPolicy;
                this.configMapMountDesc = model.configMapMountDesc;
                this.cpu = model.cpu;
                this.customHostAlias = model.customHostAlias;
                this.edasContainerVersion = model.edasContainerVersion;
                this.envs = model.envs;
                this.imagePullSecrets = model.imagePullSecrets;
                this.imageUrl = model.imageUrl;
                this.jarStartArgs = model.jarStartArgs;
                this.jarStartOptions = model.jarStartOptions;
                this.jdk = model.jdk;
                this.memory = model.memory;
                this.mountDesc = model.mountDesc;
                this.mountHost = model.mountHost;
                this.namespaceId = model.namespaceId;
                this.nasConfigs = model.nasConfigs;
                this.nasId = model.nasId;
                this.ossAkId = model.ossAkId;
                this.ossAkSecret = model.ossAkSecret;
                this.ossMountDescs = model.ossMountDescs;
                this.packageType = model.packageType;
                this.packageUrl = model.packageUrl;
                this.packageVersion = model.packageVersion;
                this.phpConfig = model.phpConfig;
                this.phpConfigLocation = model.phpConfigLocation;
                this.postStart = model.postStart;
                this.preStop = model.preStop;
                this.programmingLanguage = model.programmingLanguage;
                this.publicWebHookUrls = model.publicWebHookUrls;
                this.python = model.python;
                this.pythonModules = model.pythonModules;
                this.refAppId = model.refAppId;
                this.refedAppIds = model.refedAppIds;
                this.regionId = model.regionId;
                this.replicas = model.replicas;
                this.securityGroupId = model.securityGroupId;
                this.slice = model.slice;
                this.sliceEnvs = model.sliceEnvs;
                this.slsConfigs = model.slsConfigs;
                this.suspend = model.suspend;
                this.tags = model.tags;
                this.terminationGracePeriodSeconds = model.terminationGracePeriodSeconds;
                this.timeout = model.timeout;
                this.timezone = model.timezone;
                this.tomcatConfig = model.tomcatConfig;
                this.triggerConfig = model.triggerConfig;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.vpcWebHookUrls = model.vpcWebHookUrls;
                this.warStartOptions = model.warStartOptions;
                this.webContainer = model.webContainer;
            } 

            /**
             * <p>The ARN of the RAM role required to pull images across accounts. For more information, see <a href="https://help.aliyun.com/document_detail/190675.html">Pull Alibaba Cloud images across accounts</a> and <a href="https://help.aliyun.com/document_detail/223585.html">Implement cross-account authorization by using RAM roles</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::123456789012****:role/adminrole</p>
             */
            public Builder acrAssumeRoleArn(String acrAssumeRoleArn) {
                this.acrAssumeRoleArn = acrAssumeRoleArn;
                return this;
            }

            /**
             * <p>The instance ID of the ACR Enterprise instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-xxxxxx</p>
             */
            public Builder acrInstanceId(String acrInstanceId) {
                this.acrInstanceId = acrInstanceId;
                return this;
            }

            /**
             * <p>The description of the task template.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample application</p>
             */
            public Builder appDescription(String appDescription) {
                this.appDescription = appDescription;
                return this;
            }

            /**
             * <p>The ID of the job template.</p>
             * 
             * <strong>example:</strong>
             * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the task template.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The number of task retries.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder backoffLimit(Long backoffLimit) {
                this.backoffLimit = backoffLimit;
                return this;
            }

            /**
             * <p>The best-effort policy.</p>
             * 
             * <strong>example:</strong>
             * <p>besteffort</p>
             */
            public Builder bestEffortType(String bestEffortType) {
                this.bestEffortType = bestEffortType;
                return this;
            }

            /**
             * <p>The image startup command. The command must be an executable object that exists in the container. Example:</p>
             * <pre><code>command:
             *       - echo
             *       - abc
             *       - &gt;
             *       - file0
             * </code></pre>
             * <p>Based on the preceding example, <code>Command=&quot;echo&quot;</code> and <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>echo</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The parameters for the image startup command. These are the parameters required by the <strong>Command</strong> startup command. Format:</p>
             * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
             * <p>In the example of the <strong>Command</strong> parameter, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>. The <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> part must be converted to a string in JSON array format. If this parameter is not required, you do not need to specify it.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;a&quot;,&quot;b&quot;]</p>
             */
            public Builder commandArgs(String commandArgs) {
                this.commandArgs = commandArgs;
                return this;
            }

            /**
             * <p>The task concurrency policy. Valid values:</p>
             * <ul>
             * <li><strong>Forbid</strong>: forbids concurrent execution. A new task is not created if the previous task is not completed.</li>
             * <li><strong>Allow</strong>: allows concurrent execution of tasks.</li>
             * <li><strong>Replace</strong>: replaces the previous task with a new task if the previous task is not completed when the creation time of the new task arrives.</li>
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
             * <p>The ConfigMap information.</p>
             */
            public Builder configMapMountDesc(java.util.List<ConfigMapMountDesc> configMapMountDesc) {
                this.configMapMountDesc = configMapMountDesc;
                return this;
            }

            /**
             * <p>The CPU required for each instance. Unit: millicores. The value cannot be 0. Only the following defined specifications are supported:</p>
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
             * <p>The custom host mapping in the container. Valid values:</p>
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
             * <p>The runtime environment version of the task in the HSF framework, such as the Ali-Tomcat container.</p>
             * 
             * <strong>example:</strong>
             * <p>3.5.3</p>
             */
            public Builder edasContainerVersion(String edasContainerVersion) {
                this.edasContainerVersion = edasContainerVersion;
                return this;
            }

            /**
             * <p>The container environment variable parameters. You can customize environment variables or reference ConfigMaps. To reference a ConfigMap, create a ConfigMap instance first. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
             * <ul>
             * <li>Custom configuration:<ul>
             * <li><strong>name</strong>: the name of the environment variable.</li>
             * <li><strong>value</strong>: the value of the environment variable.</li>
             * </ul>
             * </li>
             * <li>Reference ConfigMap:<ul>
             * <li><strong>name</strong>: the name of the environment variable. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>, for example, <code>sae-sys-configmap-all-test1</code>.</li>
             * <li><strong>valueFrom</strong>: the environment variable reference. Set the value to <code>configMapRef</code>.</li>
             * <li><strong>configMapId</strong>: the ConfigMap ID.</li>
             * <li><strong>key</strong>: the key. If you reference all key-value pairs, do not set this field.</li>
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
             * <p>The image address. This parameter is required when <strong>PackageType</strong> is set to <strong>Image</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>docker.io/library/nginx:1.14.2</p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The startup parameters for the JAR package task. Default task startup command: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
             * 
             * <strong>example:</strong>
             * <p>start</p>
             */
            public Builder jarStartArgs(String jarStartArgs) {
                this.jarStartArgs = jarStartArgs;
                return this;
            }

            /**
             * <p>The startup options for the JAR package task. Default task startup command: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
             * 
             * <strong>example:</strong>
             * <p>-Dtest=true</p>
             */
            public Builder jarStartOptions(String jarStartOptions) {
                this.jarStartOptions = jarStartOptions;
                return this;
            }

            /**
             * <p>The JDK version required by the deployment package. Valid values:</p>
             * <ul>
             * <li><strong>Open JDK 8</strong></li>
             * <li><strong>Open JDK 7</strong></li>
             * <li><strong>Dragonwell 11</strong></li>
             * <li><strong>Dragonwell 8</strong></li>
             * <li><strong>openjdk-8u191-jdk-alpine3.9</strong></li>
             * <li><strong>openjdk-7u201-jdk-alpine3.9</strong></li>
             * </ul>
             * <p>This parameter is not supported when <strong>PackageType</strong> is set to <strong>Image</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Open JDK 8</p>
             */
            public Builder jdk(String jdk) {
                this.jdk = jdk;
                return this;
            }

            /**
             * <p>The memory required for each instance. Unit: MB. The value cannot be 0. The memory has a one-to-one mapping with the CPU. Only the following defined specifications are supported:</p>
             * <ul>
             * <li><strong>1024</strong>: corresponds to 500 millicores and 1000 millicores.</li>
             * <li><strong>2048</strong>: corresponds to 500, 1000, and 2000 millicores.</li>
             * <li><strong>4096</strong>: corresponds to 1000, 2000, and 4000 millicores.</li>
             * <li><strong>8192</strong>: corresponds to 2000, 4000, and 8000 millicores.</li>
             * <li><strong>12288</strong>: corresponds to 12000 millicores.</li>
             * <li><strong>16384</strong>: corresponds to 4000, 8000, and 16000 millicores.</li>
             * <li><strong>24576</strong>: corresponds to 12000 millicores.</li>
             * <li><strong>32768</strong>: corresponds to 16000 millicores.</li>
             * <li><strong>65536</strong>: corresponds to 8000, 16000, and 32000 millicores.</li>
             * <li><strong>131072</strong>: corresponds to 32000 millicores.</li>
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
             * <p>The mount description.</p>
             */
            public Builder mountDesc(java.util.List<MountDesc> mountDesc) {
                this.mountDesc = mountDesc;
                return this;
            }

            /**
             * <p>The mount target of the NAS file system in the VPC of the task template. If the configuration remains unchanged during deployment, you do not need to set this parameter (that is, the <strong>MountHost</strong> field is not required in the request). If you need to clear the NAS configuration, you must set the value of this field to an empty string (that is, set <strong>MountHost</strong> to &quot;&quot;) in the request.</p>
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
             * <p>The configuration for mounting NAS.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;mountPath&quot;:&quot;/test1&quot;,&quot;readOnly&quot;:false,&quot;nasId&quot;:&quot;nasId1&quot;,&quot;mountDomain&quot;:&quot;nasId1.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;nasPath&quot;:&quot;/test1&quot;},{&quot;nasId&quot;:&quot;nasId2&quot;,&quot;mountDomain&quot;:&quot;nasId2.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;readOnly&quot;:false,&quot;nasPath&quot;:&quot;/test2&quot;,&quot;mountPath&quot;:&quot;/test2&quot;}]</p>
             */
            public Builder nasConfigs(String nasConfigs) {
                this.nasConfigs = nasConfigs;
                return this;
            }

            /**
             * <p>The NAS ID.</p>
             * 
             * <strong>example:</strong>
             * <p>AKSN89**</p>
             */
            public Builder nasId(String nasId) {
                this.nasId = nasId;
                return this;
            }

            /**
             * <p>The AccessKey ID for OSS read and write operations.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
             */
            public Builder ossAkId(String ossAkId) {
                this.ossAkId = ossAkId;
                return this;
            }

            /**
             * <p>The AccessKey Secret for OSS read and write operations.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
             */
            public Builder ossAkSecret(String ossAkSecret) {
                this.ossAkSecret = ossAkSecret;
                return this;
            }

            /**
             * <p>The OSS mount description.</p>
             */
            public Builder ossMountDescs(java.util.List<OssMountDescs> ossMountDescs) {
                this.ossMountDescs = ossMountDescs;
                return this;
            }

            /**
             * <p>The task package type. Valid values:</p>
             * <ul>
             * <li>If you deploy the task by using Java, valid values are <strong>FatJar</strong>, <strong>War</strong>, and <strong>Image</strong>.</li>
             * <li>If you deploy the task by using PHP, valid values are:<ul>
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
             * <li>If you deploy the task by using Python, valid values are <strong>PythonZip</strong> and <strong>Image</strong>.</li>
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
             * <p>The deployment package URL. This parameter is required when <strong>PackageType</strong> is set to <strong>FatJar</strong> or <strong>War</strong>.</p>
             */
            public Builder packageUrl(String packageUrl) {
                this.packageUrl = packageUrl;
                return this;
            }

            /**
             * <p>The version number of the deployment package. This parameter is required when <strong>PackageType</strong> is set to <strong>FatJar</strong> or <strong>War</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * <p>The content of the PHP configuration file.</p>
             * 
             * <strong>example:</strong>
             * <p>k1=v1</p>
             */
            public Builder phpConfig(String phpConfig) {
                this.phpConfig = phpConfig;
                return this;
            }

            /**
             * <p>The mount path of the PHP task startup configuration. You must ensure that the PHP server uses this configuration file to start.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/etc/php/php.ini</p>
             */
            public Builder phpConfigLocation(String phpConfigLocation) {
                this.phpConfigLocation = phpConfigLocation;
                return this;
            }

            /**
             * <p>The script to execute after the container starts. A script is triggered and executed immediately after the container is created. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code></p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
             */
            public Builder postStart(String postStart) {
                this.postStart = postStart;
                return this;
            }

            /**
             * <p>The script to execute before the container stops. A script is triggered and executed before the container is deleted. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code></p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
             */
            public Builder preStop(String preStop) {
                this.preStop = preStop;
                return this;
            }

            /**
             * <p>The programming language of the technology stack used to create the task template. Valid values:</p>
             * <ul>
             * <li><strong>java</strong>: Java.</li>
             * <li><strong>php</strong>: PHP.</li>
             * <li><strong>python</strong>: Python.</li>
             * <li><strong>other</strong>: Multiple languages, such as C++, Go, .NET, and Node.js.</li>
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
             * <p>The list of public request URLs for the one-time task.</p>
             */
            public Builder publicWebHookUrls(java.util.List<String> publicWebHookUrls) {
                this.publicWebHookUrls = publicWebHookUrls;
                return this;
            }

            /**
             * <p>The Python environment. Python 3.9.15 is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>PYTHON 3.9.15</p>
             */
            public Builder python(String python) {
                this.python = python;
                return this;
            }

            /**
             * <p>The module dependencies for custom installation. By default, the dependencies defined in the requirements.txt file in the root folder are installed. If no custom package is configured, you can specify the dependencies to install.</p>
             * 
             * <strong>example:</strong>
             * <p>Flask==2.0</p>
             */
            public Builder pythonModules(String pythonModules) {
                this.pythonModules = pythonModules;
                return this;
            }

            /**
             * <p>The ID of the referenced task template.</p>
             * 
             * <strong>example:</strong>
             * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
             */
            public Builder refAppId(String refAppId) {
                this.refAppId = refAppId;
                return this;
            }

            /**
             * <p>The list of IDs of the referenced task targets.</p>
             */
            public Builder refedAppIds(java.util.List<String> refedAppIds) {
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
             * <p>The number of task instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder replicas(Integer replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-wz969ngg2e49q5i4****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>Specifies whether to enable task slicing.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder slice(Boolean slice) {
                this.slice = slice;
                return this;
            }

            /**
             * <p>The task slicing parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>SliceEnvs</p>
             */
            public Builder sliceEnvs(String sliceEnvs) {
                this.sliceEnvs = sliceEnvs;
                return this;
            }

            /**
             * <p>The configuration for collecting logs to Simple Log Service (SLS).</p>
             * <ul>
             * <li>To use SLS resources automatically created by Serverless App Engine (SAE): <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</li>
             * <li>To use custom SLS resources: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</li>
             * </ul>
             * <p>Parameter descriptions:</p>
             * <ul>
             * <li><strong>projectName</strong>: the name of the SLS project.  </li>
             * <li><strong>logDir</strong>: the log path.</li>
             * <li><strong>logType</strong>: the log type. <strong>stdout</strong> indicates container standard output logs. Only one <strong>stdout</strong> log can be set. If this parameter is not set, file logs are collected.</li>
             * <li><strong>logstoreName</strong>: the name of the SLS Logstore.</li>
             * <li><strong>logtailName</strong>: the name of the SLS Logtail. If this parameter is not specified, a new Logtail is created.</li>
             * </ul>
             * <p>If the SLS collection configuration remains unchanged during multiple deployments, you do not need to set this parameter (that is, the <strong>SlsConfigs</strong> field is not required in the request). If you no longer need the SLS collection feature, you must set the value of this field to an empty string (that is, set <strong>SlsConfigs</strong> to &quot;&quot;) in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
             */
            public Builder slsConfigs(String slsConfigs) {
                this.slsConfigs = slsConfigs;
                return this;
            }

            /**
             * <p>Specifies whether to suspend the task template.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder suspend(Boolean suspend) {
                this.suspend = suspend;
                return this;
            }

            /**
             * <p>The tag information.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The graceful shutdown timeout period. Default value: 30. Unit: seconds. Valid values: 1 to 300.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder terminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
                this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
                return this;
            }

            /**
             * <p>The task timeout period. Unit: seconds.</p>
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
             * <p>The Tomcat file configuration. Set this parameter to &quot;&quot; or &quot;{}&quot; to delete the configuration:</p>
             * <ul>
             * <li><strong>port</strong>: the port range is 1024 to 65535. Ports smaller than 1024 require root permissions. Because the container is configured with admin permissions, specify a port greater than 1024. Default value: 8080.</li>
             * <li><strong>contextPath</strong>: the access path. Default value: the root directory &quot;/&quot;.</li>
             * <li><strong>maxThreads</strong>: the maximum number of connections in the connection pool. Default value: 400.</li>
             * <li><strong>uriEncoding</strong>: the Tomcat encoding format. Valid values: <strong>UTF-8</strong>, <strong>ISO-8859-1</strong>, <strong>GBK</strong>, and <strong>GB2312</strong>. Default value: <strong>ISO-8859-1</strong>.</li>
             * <li><strong>useBodyEncoding</strong>: specifies whether to use <strong>BodyEncoding for URL</strong>. Default value: <strong>true</strong>.</li>
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
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze0i263cnn311nvj****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The list of internal request URLs for one-time tasks.</p>
             */
            public Builder vpcWebHookUrls(java.util.List<String> vpcWebHookUrls) {
                this.vpcWebHookUrls = vpcWebHookUrls;
                return this;
            }

            /**
             * <p>The startup options for the WAR package task. Default task startup command: <code>java $JAVA_OPTS $CATALINA_OPTS -Options org.apache.catalina.startup.Bootstrap &quot;$@&quot; start</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>custom-option</p>
             */
            public Builder warStartOptions(String warStartOptions) {
                this.warStartOptions = warStartOptions;
                return this;
            }

            /**
             * <p>The Tomcat version required by the deployment package. Valid values:</p>
             * <ul>
             * <li><strong>apache-tomcat-7.0.91</strong></li>
             * <li><strong>apache-tomcat-8.5.42</strong></li>
             * </ul>
             * <p>This parameter is not supported when <strong>PackageType</strong> is set to <strong>Image</strong>.</p>
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
