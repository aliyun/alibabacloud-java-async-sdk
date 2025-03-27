// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetEdgeContainerAppVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetEdgeContainerAppVersionResponseBody</p>
 */
public class GetEdgeContainerAppVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Version")
    private Version version;

    private GetEdgeContainerAppVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeContainerAppVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return version
     */
    public Version getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String requestId; 
        private Version version; 

        private Builder() {
        } 

        private Builder(GetEdgeContainerAppVersionResponseBody model) {
            this.requestId = model.requestId;
            this.version = model.version;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the version.</p>
         */
        public Builder version(Version version) {
            this.version = version;
            return this;
        }

        public GetEdgeContainerAppVersionResponseBody build() {
            return new GetEdgeContainerAppVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEdgeContainerAppVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetEdgeContainerAppVersionResponseBody</p>
     */
    public static class ACRImageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IsEnterpriseRegistry")
        private Boolean isEnterpriseRegistry;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        private String repoId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespace")
        private String repoNamespace;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("TagUrl")
        private String tagUrl;

        private ACRImageInfo(Builder builder) {
            this.domain = builder.domain;
            this.instanceId = builder.instanceId;
            this.isEnterpriseRegistry = builder.isEnterpriseRegistry;
            this.regionId = builder.regionId;
            this.repoId = builder.repoId;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
            this.tag = builder.tag;
            this.tagUrl = builder.tagUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ACRImageInfo create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return isEnterpriseRegistry
         */
        public Boolean getIsEnterpriseRegistry() {
            return this.isEnterpriseRegistry;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespace
         */
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return tagUrl
         */
        public String getTagUrl() {
            return this.tagUrl;
        }

        public static final class Builder {
            private String domain; 
            private String instanceId; 
            private Boolean isEnterpriseRegistry; 
            private String regionId; 
            private String repoId; 
            private String repoName; 
            private String repoNamespace; 
            private String tag; 
            private String tagUrl; 

            private Builder() {
            } 

            private Builder(ACRImageInfo model) {
                this.domain = model.domain;
                this.instanceId = model.instanceId;
                this.isEnterpriseRegistry = model.isEnterpriseRegistry;
                this.regionId = model.regionId;
                this.repoId = model.repoId;
                this.repoName = model.repoName;
                this.repoNamespace = model.repoNamespace;
                this.tag = model.tag;
                this.tagUrl = model.tagUrl;
            } 

            /**
             * <p>The domain name of the Container Registry image.</p>
             * 
             * <strong>example:</strong>
             * <p>*.mooc.seewo.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The ID of the Container Registry instance.</p>
             * 
             * <strong>example:</strong>
             * <p>xcdn-9ak2thl14z5s</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the image is an enterprise-level image.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isEnterpriseRegistry(Boolean isEnterpriseRegistry) {
                this.isEnterpriseRegistry = isEnterpriseRegistry;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>crr-zeu0xyk28alyxozh</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>test_1</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The namespace to which the image repository belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>wpy1</p>
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test-healthy-100-soa-1710987653</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The URL of the Container Registry image tag.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-shenzhen.aliyuncs.com/lihetech/easywits_server_exam:3.40.2</p>
             */
            public Builder tagUrl(String tagUrl) {
                this.tagUrl = tagUrl;
                return this;
            }

            public ACRImageInfo build() {
                return new ACRImageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEdgeContainerAppVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetEdgeContainerAppVersionResponseBody</p>
     */
    public static class ProbeContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("FailureThreshold")
        private Integer failureThreshold;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("HttpHeaders")
        private String httpHeaders;

        @com.aliyun.core.annotation.NameInMap("InitialDelaySeconds")
        private Integer initialDelaySeconds;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("PeriodSeconds")
        private Integer periodSeconds;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Scheme")
        private String scheme;

        @com.aliyun.core.annotation.NameInMap("SuccessThreshold")
        private Integer successThreshold;

        @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
        private Integer timeoutSeconds;

        private ProbeContent(Builder builder) {
            this.command = builder.command;
            this.failureThreshold = builder.failureThreshold;
            this.host = builder.host;
            this.httpHeaders = builder.httpHeaders;
            this.initialDelaySeconds = builder.initialDelaySeconds;
            this.path = builder.path;
            this.periodSeconds = builder.periodSeconds;
            this.port = builder.port;
            this.scheme = builder.scheme;
            this.successThreshold = builder.successThreshold;
            this.timeoutSeconds = builder.timeoutSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProbeContent create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return failureThreshold
         */
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return httpHeaders
         */
        public String getHttpHeaders() {
            return this.httpHeaders;
        }

        /**
         * @return initialDelaySeconds
         */
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return periodSeconds
         */
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return scheme
         */
        public String getScheme() {
            return this.scheme;
        }

        /**
         * @return successThreshold
         */
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        /**
         * @return timeoutSeconds
         */
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public static final class Builder {
            private String command; 
            private Integer failureThreshold; 
            private String host; 
            private String httpHeaders; 
            private Integer initialDelaySeconds; 
            private String path; 
            private Integer periodSeconds; 
            private Integer port; 
            private String scheme; 
            private Integer successThreshold; 
            private Integer timeoutSeconds; 

            private Builder() {
            } 

            private Builder(ProbeContent model) {
                this.command = model.command;
                this.failureThreshold = model.failureThreshold;
                this.host = model.host;
                this.httpHeaders = model.httpHeaders;
                this.initialDelaySeconds = model.initialDelaySeconds;
                this.path = model.path;
                this.periodSeconds = model.periodSeconds;
                this.port = model.port;
                this.scheme = model.scheme;
                this.successThreshold = model.successThreshold;
                this.timeoutSeconds = model.timeoutSeconds;
            } 

            /**
             * <p>The probe command.</p>
             * 
             * <strong>example:</strong>
             * <p>sh test.sh</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The number of consecutive failed health checks required for a container to be considered as unhealthy.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder failureThreshold(Integer failureThreshold) {
                this.failureThreshold = failureThreshold;
                return this;
            }

            /**
             * <p>The domain name that is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The request headers that are included in the container health check request.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;Content-Type&quot;:&quot;application/json</p>
             */
            public Builder httpHeaders(String httpHeaders) {
                this.httpHeaders = httpHeaders;
                return this;
            }

            /**
             * <p>The latency for container probe initialization.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder initialDelaySeconds(Integer initialDelaySeconds) {
                this.initialDelaySeconds = initialDelaySeconds;
                return this;
            }

            /**
             * <p>The path of the container health check.</p>
             * 
             * <strong>example:</strong>
             * <p>/health_check</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The interval between container health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder periodSeconds(Integer periodSeconds) {
                this.periodSeconds = periodSeconds;
                return this;
            }

            /**
             * <p>The port of the container health check. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol that the container health check request uses.</p>
             * 
             * <strong>example:</strong>
             * <p>http</p>
             */
            public Builder scheme(String scheme) {
                this.scheme = scheme;
                return this;
            }

            /**
             * <p>The number of consecutive successful health checks required for a container to be considered as healthy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder successThreshold(Integer successThreshold) {
                this.successThreshold = successThreshold;
                return this;
            }

            /**
             * <p>The timeout period of the container health check.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder timeoutSeconds(Integer timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            public ProbeContent build() {
                return new ProbeContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEdgeContainerAppVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetEdgeContainerAppVersionResponseBody</p>
     */
    public static class Containers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ACRImageInfo")
        private ACRImageInfo ACRImageInfo;

        @com.aliyun.core.annotation.NameInMap("Args")
        private String args;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("EnvVariables")
        private String envVariables;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("IsACRImage")
        private Boolean isACRImage;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PostStart")
        private String postStart;

        @com.aliyun.core.annotation.NameInMap("PreStop")
        private String preStop;

        @com.aliyun.core.annotation.NameInMap("ProbeContent")
        private ProbeContent probeContent;

        @com.aliyun.core.annotation.NameInMap("ProbeType")
        private String probeType;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Storage")
        private String storage;

        private Containers(Builder builder) {
            this.ACRImageInfo = builder.ACRImageInfo;
            this.args = builder.args;
            this.command = builder.command;
            this.envVariables = builder.envVariables;
            this.image = builder.image;
            this.isACRImage = builder.isACRImage;
            this.name = builder.name;
            this.postStart = builder.postStart;
            this.preStop = builder.preStop;
            this.probeContent = builder.probeContent;
            this.probeType = builder.probeType;
            this.spec = builder.spec;
            this.storage = builder.storage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Containers create() {
            return builder().build();
        }

        /**
         * @return ACRImageInfo
         */
        public ACRImageInfo getACRImageInfo() {
            return this.ACRImageInfo;
        }

        /**
         * @return args
         */
        public String getArgs() {
            return this.args;
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return envVariables
         */
        public String getEnvVariables() {
            return this.envVariables;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return isACRImage
         */
        public Boolean getIsACRImage() {
            return this.isACRImage;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
         * @return probeContent
         */
        public ProbeContent getProbeContent() {
            return this.probeContent;
        }

        /**
         * @return probeType
         */
        public String getProbeType() {
            return this.probeType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return storage
         */
        public String getStorage() {
            return this.storage;
        }

        public static final class Builder {
            private ACRImageInfo ACRImageInfo; 
            private String args; 
            private String command; 
            private String envVariables; 
            private String image; 
            private Boolean isACRImage; 
            private String name; 
            private String postStart; 
            private String preStop; 
            private ProbeContent probeContent; 
            private String probeType; 
            private String spec; 
            private String storage; 

            private Builder() {
            } 

            private Builder(Containers model) {
                this.ACRImageInfo = model.ACRImageInfo;
                this.args = model.args;
                this.command = model.command;
                this.envVariables = model.envVariables;
                this.image = model.image;
                this.isACRImage = model.isACRImage;
                this.name = model.name;
                this.postStart = model.postStart;
                this.preStop = model.preStop;
                this.probeContent = model.probeContent;
                this.probeType = model.probeType;
                this.spec = model.spec;
                this.storage = model.storage;
            } 

            /**
             * <p>The information about the Container Registry image.</p>
             */
            public Builder ACRImageInfo(ACRImageInfo ACRImageInfo) {
                this.ACRImageInfo = ACRImageInfo;
                return this;
            }

            /**
             * <p>The arguments that are passed to the container startup command.</p>
             * 
             * <strong>example:</strong>
             * <p>-c /path/config.toml</p>
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The command that is used to start the container.</p>
             * 
             * <strong>example:</strong>
             * <p>sh abc.sh 1 2 3</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The environment variables.</p>
             * 
             * <strong>example:</strong>
             * <p>ENV=prod</p>
             */
            public Builder envVariables(String envVariables) {
                this.envVariables = envVariables;
                return this;
            }

            /**
             * <p>The image address.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx:1.14.0</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>Indicates whether the image is a Container Registry image.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isACRImage(Boolean isACRImage) {
                this.isACRImage = isACRImage;
                return this;
            }

            /**
             * <p>The version name.</p>
             * 
             * <strong>example:</strong>
             * <p>version01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The command that is run before the container is started. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;\]}}</code>. If you want to cancel this configuration, set the parameter value to <code>&quot;&quot;</code> or <code>{}</code>. If you do not specify this parameter, this configuration is ignored.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;touch&quot;,&quot;/home/admin/checkpoststartV1&quot;]}}</p>
             */
            public Builder postStart(String postStart) {
                this.postStart = postStart;
                return this;
            }

            /**
             * <p>The command that is run before the container is stopped.</p>
             * 
             * <strong>example:</strong>
             * <p>sh prestop.sh &quot;echo hello world&quot;</p>
             */
            public Builder preStop(String preStop) {
                this.preStop = preStop;
                return this;
            }

            /**
             * <p>The probe content.</p>
             */
            public Builder probeContent(ProbeContent probeContent) {
                this.probeContent = probeContent;
                return this;
            }

            /**
             * <p>The probe type.</p>
             * 
             * <strong>example:</strong>
             * <p>httpGet</p>
             */
            public Builder probeType(String probeType) {
                this.probeType = probeType;
                return this;
            }

            /**
             * <p>The compute specification.</p>
             * 
             * <strong>example:</strong>
             * <p>1C2G</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The storage capacity of the container. Valid values: 0.5G, 10G, 20G, and 30G.</p>
             */
            public Builder storage(String storage) {
                this.storage = storage;
                return this;
            }

            public Containers build() {
                return new Containers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEdgeContainerAppVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetEdgeContainerAppVersionResponseBody</p>
     */
    public static class Version extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Containers")
        private java.util.List<Containers> containers;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("LastPublishTime")
        private String lastPublishTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private String publishTime;

        @com.aliyun.core.annotation.NameInMap("Remarks")
        private String remarks;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private Version(Builder builder) {
            this.appId = builder.appId;
            this.containers = builder.containers;
            this.createTime = builder.createTime;
            this.lastPublishTime = builder.lastPublishTime;
            this.name = builder.name;
            this.publishTime = builder.publishTime;
            this.remarks = builder.remarks;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Version create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return containers
         */
        public java.util.List<Containers> getContainers() {
            return this.containers;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return lastPublishTime
         */
        public String getLastPublishTime() {
            return this.lastPublishTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return publishTime
         */
        public String getPublishTime() {
            return this.publishTime;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String appId; 
            private java.util.List<Containers> containers; 
            private String createTime; 
            private String lastPublishTime; 
            private String name; 
            private String publishTime; 
            private String remarks; 
            private String status; 
            private String updateTime; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(Version model) {
                this.appId = model.appId;
                this.containers = model.containers;
                this.createTime = model.createTime;
                this.lastPublishTime = model.lastPublishTime;
                this.name = model.name;
                this.publishTime = model.publishTime;
                this.remarks = model.remarks;
                this.status = model.status;
                this.updateTime = model.updateTime;
                this.versionId = model.versionId;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>app-88068867578379****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The container images deployed for this version.</p>
             */
            public Builder containers(java.util.List<Containers> containers) {
                this.containers = containers;
                return this;
            }

            /**
             * <p>The time when the version was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-01T09:32:33Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the version was last released. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-25T04:58:05Z</p>
             */
            public Builder lastPublishTime(String lastPublishTime) {
                this.lastPublishTime = lastPublishTime;
                return this;
            }

            /**
             * <p>The version name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the version was released. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-14T02:04:03Z</p>
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>aaa</p>
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * <p>The status of the current version. Valid values:</p>
             * <ul>
             * <li>created: The version is created.</li>
             * <li>failed: The version failed to be created.</li>
             * <li>creating: The version is being created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>created</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the version was last modified. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-03T10:52:52Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the created version.</p>
             * 
             * <strong>example:</strong>
             * <p>ver-87962637161651****</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public Version build() {
                return new Version(this);
            } 

        } 

    }
}
