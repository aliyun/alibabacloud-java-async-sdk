// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateEdgeContainerAppVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateEdgeContainerAppVersionRequest</p>
 */
public class CreateEdgeContainerAppVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 20)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Containers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Containers> containers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 6)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Remarks")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String remarks;

    private CreateEdgeContainerAppVersionRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.containers = builder.containers;
        this.name = builder.name;
        this.remarks = builder.remarks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeContainerAppVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List < Containers> getContainers() {
        return this.containers;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return this.remarks;
    }

    public static final class Builder extends Request.Builder<CreateEdgeContainerAppVersionRequest, Builder> {
        private String appId; 
        private java.util.List < Containers> containers; 
        private String name; 
        private String remarks; 

        private Builder() {
            super();
        } 

        private Builder(CreateEdgeContainerAppVersionRequest request) {
            super(request);
            this.appId = request.appId;
            this.containers = request.containers;
            this.name = request.name;
            this.remarks = request.remarks;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-88068867578379****</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;Name&quot;: &quot;container1&quot;,
         *             &quot;Image&quot;: &quot;image1&quot;,
         *             &quot;Spec&quot;: &quot;1C2G&quot;,
         *             &quot;Command&quot;: &quot;/bin/sh&quot;,
         *             &quot;Args&quot;: &quot;-c hello&quot;,
         *             &quot;ProbeType&quot;: &quot;tcpSocket&quot;,
         *             &quot;ProbeContent&quot;: &quot;{&quot;Port&quot;:8080}&quot;
         *       },
         *       {
         *             &quot;Name&quot;: &quot;container2&quot;,
         *             &quot;Image&quot;: &quot;image2&quot;,
         *             &quot;Spec&quot;: &quot;2C4G&quot;,
         *             &quot;ProbeType&quot;: &quot;httpGet&quot;,
         *             &quot;ProbeContent&quot;: &quot;{&quot;Path&quot;:&quot;/&quot;,&quot;Port&quot;:80,&quot;InitialDelaySeconds&quot;:10}&quot;
         *       }
         * ]</p>
         */
        public Builder containers(java.util.List < Containers> containers) {
            String containersShrink = shrink(containers, "Containers", "json");
            this.putBodyParameter("Containers", containersShrink);
            this.containers = containers;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>verson1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Remarks.
         */
        public Builder remarks(String remarks) {
            this.putBodyParameter("Remarks", remarks);
            this.remarks = remarks;
            return this;
        }

        @Override
        public CreateEdgeContainerAppVersionRequest build() {
            return new CreateEdgeContainerAppVersionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEdgeContainerAppVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateEdgeContainerAppVersionRequest</p>
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

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IsEnterpriseRegistry.
             */
            public Builder isEnterpriseRegistry(Boolean isEnterpriseRegistry) {
                this.isEnterpriseRegistry = isEnterpriseRegistry;
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
             * RepoId.
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * RepoName.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * RepoNamespace.
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * TagUrl.
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
     * {@link CreateEdgeContainerAppVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateEdgeContainerAppVersionRequest</p>
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

            /**
             * Command.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * FailureThreshold.
             */
            public Builder failureThreshold(Integer failureThreshold) {
                this.failureThreshold = failureThreshold;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * HttpHeaders.
             */
            public Builder httpHeaders(String httpHeaders) {
                this.httpHeaders = httpHeaders;
                return this;
            }

            /**
             * InitialDelaySeconds.
             */
            public Builder initialDelaySeconds(Integer initialDelaySeconds) {
                this.initialDelaySeconds = initialDelaySeconds;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * PeriodSeconds.
             */
            public Builder periodSeconds(Integer periodSeconds) {
                this.periodSeconds = periodSeconds;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Scheme.
             */
            public Builder scheme(String scheme) {
                this.scheme = scheme;
                return this;
            }

            /**
             * SuccessThreshold.
             */
            public Builder successThreshold(Integer successThreshold) {
                this.successThreshold = successThreshold;
                return this;
            }

            /**
             * TimeoutSeconds.
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
     * {@link CreateEdgeContainerAppVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateEdgeContainerAppVersionRequest</p>
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
        @com.aliyun.core.annotation.Validation(required = true)
        private String image;

        @com.aliyun.core.annotation.NameInMap("IsACRImage")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean isACRImage;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("PostStart")
        private String postStart;

        @com.aliyun.core.annotation.NameInMap("PreStop")
        private String preStop;

        @com.aliyun.core.annotation.NameInMap("ProbeContent")
        @com.aliyun.core.annotation.Validation(required = true)
        private ProbeContent probeContent;

        @com.aliyun.core.annotation.NameInMap("ProbeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String probeType;

        @com.aliyun.core.annotation.NameInMap("Spec")
        @com.aliyun.core.annotation.Validation(required = true)
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Storage")
        @com.aliyun.core.annotation.Validation(required = true)
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

            /**
             * ACRImageInfo.
             */
            public Builder ACRImageInfo(ACRImageInfo ACRImageInfo) {
                this.ACRImageInfo = ACRImageInfo;
                return this;
            }

            /**
             * Args.
             */
            public Builder args(String args) {
                this.args = args;
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
             * EnvVariables.
             */
            public Builder envVariables(String envVariables) {
                this.envVariables = envVariables;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-shenzhen.aliyuncs.com/lihe<strong><strong>h/ea</strong></strong>ts_serv**<strong>am:3.</strong></p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isACRImage(Boolean isACRImage) {
                this.isACRImage = isACRImage;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>lxg-demo-er</p>
             */
            public Builder name(String name) {
                this.name = name;
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
             * <p>This parameter is required.</p>
             */
            public Builder probeContent(ProbeContent probeContent) {
                this.probeContent = probeContent;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder probeType(String probeType) {
                this.probeType = probeType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
}
