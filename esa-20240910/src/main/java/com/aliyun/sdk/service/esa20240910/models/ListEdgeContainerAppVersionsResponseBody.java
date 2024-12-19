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
 * {@link ListEdgeContainerAppVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEdgeContainerAppVersionsResponseBody</p>
 */
public class ListEdgeContainerAppVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Versions")
    private java.util.List<Versions> versions;

    private ListEdgeContainerAppVersionsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEdgeContainerAppVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return versions
     */
    public java.util.List<Versions> getVersions() {
        return this.versions;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<Versions> versions; 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F61CDR30-E83C-4FDA-BF73-9A94CDD44229</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The versions.</p>
         */
        public Builder versions(java.util.List<Versions> versions) {
            this.versions = versions;
            return this;
        }

        public ListEdgeContainerAppVersionsResponseBody build() {
            return new ListEdgeContainerAppVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEdgeContainerAppVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEdgeContainerAppVersionsResponseBody</p>
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
             * <p>The probe command.</p>
             * 
             * <strong>example:</strong>
             * <p>openresty -g  &quot;daemon off;</p>
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
             * <p>{&quot;Content-Type&quot;:&quot;application/json&quot;}</p>
             */
            public Builder httpHeaders(String httpHeaders) {
                this.httpHeaders = httpHeaders;
                return this;
            }

            /**
             * <p>The latency for container probe initialization.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
             * <p>The port of the container health check.</p>
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
             * <p>30</p>
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
     * {@link ListEdgeContainerAppVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEdgeContainerAppVersionsResponseBody</p>
     */
    public static class Containers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private String args;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("EnvVariables")
        private String envVariables;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

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

        private Containers(Builder builder) {
            this.args = builder.args;
            this.command = builder.command;
            this.envVariables = builder.envVariables;
            this.image = builder.image;
            this.name = builder.name;
            this.postStart = builder.postStart;
            this.preStop = builder.preStop;
            this.probeContent = builder.probeContent;
            this.probeType = builder.probeType;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Containers create() {
            return builder().build();
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

        public static final class Builder {
            private String args; 
            private String command; 
            private String envVariables; 
            private String image; 
            private String name; 
            private String postStart; 
            private String preStop; 
            private ProbeContent probeContent; 
            private String probeType; 
            private String spec; 

            /**
             * <p>The arguments that are passed to the container startup command.</p>
             * 
             * <strong>example:</strong>
             * <p>-c a=1</p>
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The command that is used to start the container.</p>
             * 
             * <strong>example:</strong>
             * <p>openresty -g &quot;daemon off;&quot;</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The environment variables of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>ENV=prod</p>
             */
            public Builder envVariables(String envVariables) {
                this.envVariables = envVariables;
                return this;
            }

            /**
             * <p>The address of the container image.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The container name.</p>
             * 
             * <strong>example:</strong>
             * <p>container1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The command that is run before the container is started. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;\]}}</code>.</p>
             * <p>If you want to cancel this configuration, set the parameter value to <code>&quot;&quot;</code> or <code>{}</code>. If you do not specify this parameter, this configuration is ignored.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;bash&quot;,&quot;-c&quot;,&quot;cd /home/admin/</p>
             */
            public Builder postStart(String postStart) {
                this.postStart = postStart;
                return this;
            }

            /**
             * <p>The command that is run before the container is stopped.</p>
             * 
             * <strong>example:</strong>
             * <p>sh stop.sh</p>
             */
            public Builder preStop(String preStop) {
                this.preStop = preStop;
                return this;
            }

            /**
             * <p>The container probe content.</p>
             */
            public Builder probeContent(ProbeContent probeContent) {
                this.probeContent = probeContent;
                return this;
            }

            /**
             * <p>The probe type of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>httpGet</p>
             */
            public Builder probeType(String probeType) {
                this.probeType = probeType;
                return this;
            }

            /**
             * <p>The compute specification of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>1C2G</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public Containers build() {
                return new Containers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEdgeContainerAppVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEdgeContainerAppVersionsResponseBody</p>
     */
    public static class Versions extends TeaModel {
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

        private Versions(Builder builder) {
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

        public static Versions create() {
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
             * <p>The containers in the version.</p>
             */
            public Builder containers(java.util.List<Containers> containers) {
                this.containers = containers;
                return this;
            }

            /**
             * <p>The time when the version was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-10T02:53:16Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the version was last released. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-10T02:48:36Z</p>
             */
            public Builder lastPublishTime(String lastPublishTime) {
                this.lastPublishTime = lastPublishTime;
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
             * <p>The time when the version was released. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-10T02:48:36Z</p>
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>test version</p>
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * <p>The status of the current version. Valid values:</p>
             * <ul>
             * <li><strong>created</strong></li>
             * <li><strong>failed</strong></li>
             * <li><strong>creating</strong></li>
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
             * <p>2023-04-16 10:51:00</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ver-87962637161651****</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
}
