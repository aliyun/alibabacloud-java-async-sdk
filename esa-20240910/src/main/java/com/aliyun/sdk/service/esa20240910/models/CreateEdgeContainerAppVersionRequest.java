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
    private java.util.List<Containers> containers;

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
    public java.util.List<Containers> getContainers() {
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
        private java.util.List<Containers> containers; 
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
         * <p>The application ID. You can call the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation to obtain the application ID.</p>
         * <blockquote>
         * <p>Notice: 1) Your account must have an ESA plan with the Edge Container feature enabled. 2) Call CreateEdgeContainerApp first to create an application and obtain the AppId. 3) Complete call chain example: CreateEdgeContainerApp → ListEdgeContainerApps → CreateEdgeContainerAppVersion.</notice></p>
         * </blockquote>
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
         * <p>The container group to be deployed for this version, including specific image information. The image information consists of the image address, startup command, parameters, environment variables, and probe rules. Multiple images are supported in a JSON array structure.</p>
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
         *             &quot;ProbeContent&quot;: &quot;{\&quot;Port\&quot;:8080}&quot;
         *       },
         *       {
         *             &quot;Name&quot;: &quot;container2&quot;,
         *             &quot;Image&quot;: &quot;image2&quot;,
         *             &quot;Spec&quot;: &quot;2C4G&quot;,
         *             &quot;ProbeType&quot;: &quot;httpGet&quot;,
         *             &quot;ProbeContent&quot;: &quot;{\&quot;Path\&quot;:\&quot;/\&quot;,\&quot;Port\&quot;:80,\&quot;InitialDelaySeconds\&quot;:10}&quot;
         *       }
         * ]</p>
         */
        public Builder containers(java.util.List<Containers> containers) {
            String containersShrink = shrink(containers, "Containers", "json");
            this.putBodyParameter("Containers", containersShrink);
            this.containers = containers;
            return this;
        }

        /**
         * <p>The version name. The name must be <strong>6 to 128</strong> characters in length.</p>
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
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>test app</p>
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
             * <p>The ACR image domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>1500.***.net</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The ACR instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xcdn-9axbo****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Specifies whether the image is an enterprise-level image.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isEnterpriseRegistry(Boolean isEnterpriseRegistry) {
                this.isEnterpriseRegistry = isEnterpriseRegistry;
                return this;
            }

            /**
             * <p>The region list of the ACR instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The repository ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>crr-h1ghghu60ct****</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The image repository name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_71</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The namespace of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>safeline</p>
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * <p>The ACR image tag.</p>
             * 
             * <strong>example:</strong>
             * <p>3.40.2</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The ACR image tag URL.</p>
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
             * <p>The probe command for exec-type probes.</p>
             * 
             * <strong>example:</strong>
             * <p>echo ok</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The number of consecutive failed health checks required.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder failureThreshold(Integer failureThreshold) {
                this.failureThreshold = failureThreshold;
                return this;
            }

            /**
             * <p>The domain name for the health check.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.rewrite.com">www.rewrite.com</a></p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The HTTP request headers.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;Content-Type\&quot;:\&quot;application/json\&quot;}]</p>
             */
            public Builder httpHeaders(String httpHeaders) {
                this.httpHeaders = httpHeaders;
                return this;
            }

            /**
             * <p>The initial delay time for the container probe. Unit: seconds. For example, 5 indicates that the initial delay time is set to 5 seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder initialDelaySeconds(Integer initialDelaySeconds) {
                this.initialDelaySeconds = initialDelaySeconds;
                return this;
            }

            /**
             * <p>The path for the container health check.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The interval for the container health check. Unit: seconds. For example, 5 indicates that the health check interval is set to 5 seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodSeconds(Integer periodSeconds) {
                this.periodSeconds = periodSeconds;
                return this;
            }

            /**
             * <p>The port for the container health check.</p>
             * 
             * <strong>example:</strong>
             * <p>9991</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The request protocol for the health check.</p>
             * 
             * <strong>example:</strong>
             * <p>http</p>
             */
            public Builder scheme(String scheme) {
                this.scheme = scheme;
                return this;
            }

            /**
             * <p>The number of consecutive successful health checks required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder successThreshold(Integer successThreshold) {
                this.successThreshold = successThreshold;
                return this;
            }

            /**
             * <p>The timeout period for the container health check. Unit: seconds. For example, 5 indicates that the timeout period is set to 5 seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>The ACR image information.</p>
             */
            public Builder ACRImageInfo(ACRImageInfo ACRImageInfo) {
                this.ACRImageInfo = ACRImageInfo;
                return this;
            }

            /**
             * <p>The startup parameters. Separate multiple parameters with spaces.</p>
             * 
             * <strong>example:</strong>
             * <p>-a</p>
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The startup command. Separate multiple commands with spaces.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The environment variables. Format: key1=val1,key2=val2.</p>
             * 
             * <strong>example:</strong>
             * <p>VITE_APP_TITLE=My App</p>
             */
            public Builder envVariables(String envVariables) {
                this.envVariables = envVariables;
                return this;
            }

            /**
             * <p>The image address.</p>
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
             * <p>Specifies whether the image is an Alibaba Cloud Container Registry (ACR) image.</p>
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
             * <p>The container name. The name must be unique within the same container group.</p>
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
             * <p>The command to execute before the container starts. Separate multiple commands with spaces. This command is executed before the service starts and is typically used for initialization operations.</p>
             * 
             * <strong>example:</strong>
             * <p>sh poststart.sh &quot;echo hello world&quot;</p>
             */
            public Builder postStart(String postStart) {
                this.postStart = postStart;
                return this;
            }

            /**
             * <p>The command to execute before the container stops. Separate multiple commands with spaces. This command is executed before the service exits and is typically used for cleanup operations before exit.</p>
             * 
             * <strong>example:</strong>
             * <p>sh prestop.sh &quot;echo hello world&quot;</p>
             */
            public Builder preStop(String preStop) {
                this.preStop = preStop;
                return this;
            }

            /**
             * <p>The container health probe content.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>For specific fields, refer to the official Kubernetes readiness probe definition</p>
             */
            public Builder probeContent(ProbeContent probeContent) {
                this.probeContent = probeContent;
                return this;
            }

            /**
             * <p>The probe type. Valid values:</p>
             * <ul>
             * <li><strong>exec</strong>: Command-based.</li>
             * <li><strong>tcpSocket</strong>: TCP detection-based.</li>
             * <li><strong>httpGet</strong>: HTTP access-based.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>exec</p>
             */
            public Builder probeType(String probeType) {
                this.probeType = probeType;
                return this;
            }

            /**
             * <p>The container specifications. Specifies the computing specifications. Valid values: 1C2G, 2C4G, 2C8G, 4C8G, 4C16G, 8C16G, and 8C32G.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1C2G</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The storage capacity. Valid values: 0.5G, 10G, 20G, and 30G.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5G</p>
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
