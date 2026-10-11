// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link CreateCustomAgentRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomAgentRequest</p>
 */
public class CreateCustomAgentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateCustomAgentRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateCustomAgentRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return body
     */
    public CreateCustomAgentRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateCustomAgentRequest, Builder> {
        private String workspaceId; 
        private CreateCustomAgentRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomAgentRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The ID of the workspace to which the custom agent belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-a1b2c3d4e5f6</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The JSON configuration of the custom agent. You must specify name, artifact, roleArn, and runtime.</p>
         */
        public Builder body(CreateCustomAgentRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>Idempotency is not currently guaranteed. Do not rely on this parameter to prevent duplicate requests.</p>
         * 
         * <strong>example:</strong>
         * <p>custom-agent-request-20261010-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateCustomAgentRequest build() {
            return new CreateCustomAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class AgenticFsMounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("readOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("server")
        private String server;

        private AgenticFsMounts(Builder builder) {
            this.mountPath = builder.mountPath;
            this.path = builder.path;
            this.readOnly = builder.readOnly;
            this.server = builder.server;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgenticFsMounts create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        public static final class Builder {
            private String mountPath; 
            private String path; 
            private Boolean readOnly; 
            private String server; 

            private Builder() {
            } 

            private Builder(AgenticFsMounts model) {
                this.mountPath = model.mountPath;
                this.path = model.path;
                this.readOnly = model.readOnly;
                this.server = model.server;
            } 

            /**
             * <p>The subdirectory under /mnt/agenticfs/ in the container. This parameter is required for each mount item. Mount targets must not be duplicated or overlap in a parent-child relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/agenticfs/data</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The existing non-empty relative directory under the access point. This parameter is required for each mount item. Root directories, absolute paths, and parent directory traversals are not allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>workspace/data</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>Specifies whether the mount is read-only. A value of true indicates read-only, and a value of false indicates read and write. If this parameter is omitted, the default value is false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * <p>The domain name of the access point. This parameter is required for each mount item. Use the DomainName value from the NAS ListAccessPoints response. Do not include the protocol, port, or path.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-0123456789abcdef0.0123456789-vlm36.cn-hangzhou.nas.aliyuncs.com</p>
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            public AgenticFsMounts build() {
                return new AgenticFsMounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class Code extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entrypoint")
        @com.aliyun.core.annotation.Validation(required = true)
        private String entrypoint;

        @com.aliyun.core.annotation.NameInMap("languageRuntime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String languageRuntime;

        @com.aliyun.core.annotation.NameInMap("sourceUri")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceUri;

        private Code(Builder builder) {
            this.entrypoint = builder.entrypoint;
            this.languageRuntime = builder.languageRuntime;
            this.sourceUri = builder.sourceUri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Code create() {
            return builder().build();
        }

        /**
         * @return entrypoint
         */
        public String getEntrypoint() {
            return this.entrypoint;
        }

        /**
         * @return languageRuntime
         */
        public String getLanguageRuntime() {
            return this.languageRuntime;
        }

        /**
         * @return sourceUri
         */
        public String getSourceUri() {
            return this.sourceUri;
        }

        public static final class Builder {
            private String entrypoint; 
            private String languageRuntime; 
            private String sourceUri; 

            private Builder() {
            } 

            private Builder(Code model) {
                this.entrypoint = model.entrypoint;
                this.languageRuntime = model.languageRuntime;
                this.sourceUri = model.sourceUri;
            } 

            /**
             * <p>The startup entry point of the code package. Code package deployment is currently not supported. Omit this parameter.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>python app.py</p>
             */
            public Builder entrypoint(String entrypoint) {
                this.entrypoint = entrypoint;
                return this;
            }

            /**
             * <p>The language runtime identifier of the code package. Code package deployment is currently not supported. Omit this parameter.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>python</p>
             */
            public Builder languageRuntime(String languageRuntime) {
                this.languageRuntime = languageRuntime;
                return this;
            }

            /**
             * <p>The source URI of the code package. Code package deployment is currently not supported. Omit this parameter.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://my-agent-bucket/packages/agent.zip</p>
             */
            public Builder sourceUri(String sourceUri) {
                this.sourceUri = sourceUri;
                return this;
            }

            public Code build() {
                return new Code(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class Container extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entrypoint")
        private String entrypoint;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("namespace")
        @com.aliyun.core.annotation.Validation(required = true)
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("repo")
        @com.aliyun.core.annotation.Validation(required = true)
        private String repo;

        @com.aliyun.core.annotation.NameInMap("tag")
        @com.aliyun.core.annotation.Validation(required = true)
        private String tag;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Container(Builder builder) {
            this.entrypoint = builder.entrypoint;
            this.instanceId = builder.instanceId;
            this.namespace = builder.namespace;
            this.repo = builder.repo;
            this.tag = builder.tag;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Container create() {
            return builder().build();
        }

        /**
         * @return entrypoint
         */
        public String getEntrypoint() {
            return this.entrypoint;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return repo
         */
        public String getRepo() {
            return this.repo;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String entrypoint; 
            private String instanceId; 
            private String namespace; 
            private String repo; 
            private String tag; 
            private String type; 

            private Builder() {
            } 

            private Builder(Container model) {
                this.entrypoint = model.entrypoint;
                this.instanceId = model.instanceId;
                this.namespace = model.namespace;
                this.repo = model.repo;
                this.tag = model.tag;
                this.type = model.type;
            } 

            /**
             * <p>The optional image startup command. If specified, it must be a non-empty string. If omitted, the default startup method of the image is used.</p>
             * 
             * <strong>example:</strong>
             * <p>python app.py</p>
             */
            public Builder entrypoint(String entrypoint) {
                this.entrypoint = entrypoint;
                return this;
            }

            /**
             * <p>The ID of the ACR instance to which the image repository belongs. This parameter cannot be empty.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-a1b2c3d4e5f6</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The namespace to which the ACR image repository belongs. This parameter cannot be empty.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The name of the image repository in the ACR namespace. This parameter cannot be empty.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>chat-agent</p>
             */
            public Builder repo(String repo) {
                this.repo = repo;
                return this;
            }

            /**
             * <p>The image tag used for deployment. This parameter cannot be empty. When updating the tag, you must also specify artifact.port and other required image fields.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.0.0</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The source type of the image. Currently, only acr is supported, which indicates Alibaba Cloud Container Registry (ACR).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>acr</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Container build() {
                return new Container(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class Artifact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private Code code;

        @com.aliyun.core.annotation.NameInMap("container")
        private Container container;

        @com.aliyun.core.annotation.NameInMap("port")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer port;

        private Artifact(Builder builder) {
            this.code = builder.code;
            this.container = builder.container;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Artifact create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Code getCode() {
            return this.code;
        }

        /**
         * @return container
         */
        public Container getContainer() {
            return this.container;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private Code code; 
            private Container container; 
            private Integer port; 

            private Builder() {
            } 

            private Builder(Artifact model) {
                this.code = model.code;
                this.container = model.container;
                this.port = model.port;
            } 

            /**
             * <p>The code package deployment configuration. This feature is currently not supported. Omit this parameter and use artifact.container.</p>
             */
            public Builder code(Code code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The ACR container image configuration. You must specify type, instanceId, namespace, repo, and tag. Do not configure code at the same time.</p>
             */
            public Builder container(Container container) {
                this.container = container;
                return this;
            }

            /**
             * <p>The TCP port on which the agent service listens. Valid values: 1 to 65535.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public Artifact build() {
                return new Artifact(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private Variables(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Variables model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the environment variable. This parameter cannot be empty and must be unique within the current environment variable list.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>LOG_LEVEL</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the environment variable. It must be a string. Empty strings are allowed.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>info</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class Environment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("variables")
        private java.util.List<Variables> variables;

        private Environment(Builder builder) {
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Environment create() {
            return builder().build();
        }

        /**
         * @return variables
         */
        public java.util.List<Variables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private java.util.List<Variables> variables; 

            private Builder() {
            } 

            private Builder(Environment model) {
                this.variables = model.variables;
            } 

            /**
             * <p>The list of environment variables. Each item includes a name and a value. The entire list is replaced during an update.</p>
             */
            public Builder variables(java.util.List<Variables> variables) {
                this.variables = variables;
                return this;
            }

            public Environment build() {
                return new Environment(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class HealthCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("healthyThreshold")
        private Integer healthyThreshold;

        @com.aliyun.core.annotation.NameInMap("intervalSeconds")
        private Integer intervalSeconds;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("timeoutSeconds")
        private Integer timeoutSeconds;

        @com.aliyun.core.annotation.NameInMap("unhealthyThreshold")
        private Integer unhealthyThreshold;

        private HealthCheck(Builder builder) {
            this.healthyThreshold = builder.healthyThreshold;
            this.intervalSeconds = builder.intervalSeconds;
            this.path = builder.path;
            this.port = builder.port;
            this.timeoutSeconds = builder.timeoutSeconds;
            this.unhealthyThreshold = builder.unhealthyThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheck create() {
            return builder().build();
        }

        /**
         * @return healthyThreshold
         */
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        /**
         * @return intervalSeconds
         */
        public Integer getIntervalSeconds() {
            return this.intervalSeconds;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return timeoutSeconds
         */
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        /**
         * @return unhealthyThreshold
         */
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public static final class Builder {
            private Integer healthyThreshold; 
            private Integer intervalSeconds; 
            private String path; 
            private Integer port; 
            private Integer timeoutSeconds; 
            private Integer unhealthyThreshold; 

            private Builder() {
            } 

            private Builder(HealthCheck model) {
                this.healthyThreshold = model.healthyThreshold;
                this.intervalSeconds = model.intervalSeconds;
                this.path = model.path;
                this.port = model.port;
                this.timeoutSeconds = model.timeoutSeconds;
                this.unhealthyThreshold = model.unhealthyThreshold;
            } 

            /**
             * <p>This parameter does not take effect. Omit this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The interval between two health checks, in seconds. It must be a positive integer. If omitted, the default value is 10.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder intervalSeconds(Integer intervalSeconds) {
                this.intervalSeconds = intervalSeconds;
                return this;
            }

            /**
             * <p>The HTTP health check path. It must start with a forward slash (/). If omitted, the default value is /healthz.</p>
             * 
             * <strong>example:</strong>
             * <p>/healthz</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The port accessed for health checks. This parameter is required when configuring health checks. Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The timeout period for a single health check, in seconds. It must be a positive integer and less than intervalSeconds. If omitted, the default value is 2.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder timeoutSeconds(Integer timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            /**
             * <p>The number of consecutive health check failures required to mark the target as unhealthy. It must be a positive integer. If omitted, the default value is 3.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            public HealthCheck build() {
                return new HealthCheck(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class Sls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        private Sls(Builder builder) {
            this.logstore = builder.logstore;
            this.project = builder.project;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sls create() {
            return builder().build();
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        public static final class Builder {
            private String logstore; 
            private String project; 

            private Builder() {
            } 

            private Builder(Sls model) {
                this.logstore = model.logstore;
                this.project = model.project;
            } 

            /**
             * <p>The name of the Simple Log Service Logstore that receives agent logs.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-runtime</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service project that receives agent logs.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-logs</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            public Sls build() {
                return new Sls(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class Logging extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sls")
        private Sls sls;

        private Logging(Builder builder) {
            this.sls = builder.sls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logging create() {
            return builder().build();
        }

        /**
         * @return sls
         */
        public Sls getSls() {
            return this.sls;
        }

        public static final class Builder {
            private Sls sls; 

            private Builder() {
            } 

            private Builder(Logging model) {
                this.sls = model.sls;
            } 

            /**
             * <p>The Simple Log Service log delivery destination. When configuring this object, neither project nor logstore can be empty.</p>
             */
            public Builder sls(Sls sls) {
                this.sls = sls;
                return this;
            }

            public Logging build() {
                return new Logging(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class AccessInternet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        private AccessInternet(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessInternet create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(AccessInternet model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>Specifies whether to allow the agent to access the Internet. A Boolean value must be provided when configuring accessInternet. For this setting to take effect, the workspace must also allow Internet access.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public AccessInternet build() {
                return new AccessInternet(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class AccessVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        private AccessVpc(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessVpc create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(AccessVpc model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>Specifies whether to allow the agent to access the user VPC configured for the workspace. A Boolean value must be provided when configuring accessVpc. For this setting to take effect, the workspace must also allow VPC access.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public AccessVpc build() {
                return new AccessVpc(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessInternet")
        private AccessInternet accessInternet;

        @com.aliyun.core.annotation.NameInMap("accessVpc")
        private AccessVpc accessVpc;

        private Network(Builder builder) {
            this.accessInternet = builder.accessInternet;
            this.accessVpc = builder.accessVpc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return accessInternet
         */
        public AccessInternet getAccessInternet() {
            return this.accessInternet;
        }

        /**
         * @return accessVpc
         */
        public AccessVpc getAccessVpc() {
            return this.accessVpc;
        }

        public static final class Builder {
            private AccessInternet accessInternet; 
            private AccessVpc accessVpc; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.accessInternet = model.accessInternet;
                this.accessVpc = model.accessVpc;
            } 

            /**
             * <p>The Internet access configuration. If this access item is omitted, Internet access is not restricted on the agent side. However, the workspace must still allow Internet access.</p>
             */
            public Builder accessInternet(AccessInternet accessInternet) {
                this.accessInternet = accessInternet;
                return this;
            }

            /**
             * <p>The user VPC access configuration. If this access item is omitted, VPC access is not restricted on the agent side. However, the workspace must still be configured to allow access to the user VPC.</p>
             */
            public Builder accessVpc(AccessVpc accessVpc) {
                this.accessVpc = accessVpc;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class OssMounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("mountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("readOnly")
        private Boolean readOnly;

        private OssMounts(Builder builder) {
            this.bucketName = builder.bucketName;
            this.mountPath = builder.mountPath;
            this.path = builder.path;
            this.readOnly = builder.readOnly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssMounts create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public static final class Builder {
            private String bucketName; 
            private String mountPath; 
            private String path; 
            private Boolean readOnly; 

            private Builder() {
            } 

            private Builder(OssMounts model) {
                this.bucketName = model.bucketName;
                this.mountPath = model.mountPath;
                this.path = model.path;
                this.readOnly = model.readOnly;
            } 

            /**
             * <p>The name of the OSS bucket. This parameter is required for each mount item. The name must be 3 to 63 characters in length and can contain only lowercase letters, digits, and hyphens. It cannot start or end with a hyphen.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-data</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The subdirectory under /mnt/oss/ in the container. This parameter is required for each mount item. Mount targets must not be duplicated or overlap in a parent-child relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/oss/train</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The non-empty object directory prefix in the bucket, such as datasets/train. Leading and trailing forward slashes (/) are removed. Root directories are not supported. Do not use parent directory traversals.</p>
             * 
             * <strong>example:</strong>
             * <p>datasets/train</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>Specifies whether the mount is read-only. A value of true indicates read-only, and a value of false indicates read and write. If this parameter is omitted, the default value is false.</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            public OssMounts build() {
                return new OssMounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class Paths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private Paths(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Paths create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private String name; 

            private Builder() {
            } 

            private Builder(Paths model) {
                this.description = model.description;
                this.name = model.name;
            } 

            /**
             * <p>The usage description of the current API path.</p>
             * 
             * <strong>example:</strong>
             * <p>AG-UI conversation API</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The non-empty API path corresponding to the current protocol.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/agui</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Paths build() {
                return new Paths(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class Protocol extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("headers")
        private java.util.Map<String, String> headers;

        @com.aliyun.core.annotation.NameInMap("paths")
        private java.util.List<Paths> paths;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Protocol(Builder builder) {
            this.headers = builder.headers;
            this.paths = builder.paths;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Protocol create() {
            return builder().build();
        }

        /**
         * @return headers
         */
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        /**
         * @return paths
         */
        public java.util.List<Paths> getPaths() {
            return this.paths;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.Map<String, String> headers; 
            private java.util.List<Paths> paths; 
            private String type; 

            private Builder() {
            } 

            private Builder(Protocol model) {
                this.headers = model.headers;
                this.paths = model.paths;
                this.type = model.type;
            } 

            /**
             * <p>The request header configuration for the current protocol. The key is a non-empty request header name, and the value must be a string.</p>
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The list of API paths corresponding to the current protocol.</p>
             */
            public Builder paths(java.util.List<Paths> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>The invocation protocol type. Valid values:</p>
             * <ul>
             * <li>agui: AG-UI protocol.</li>
             * <li>openai-chat-completion: OpenAI Chat Completions compatible protocol.</li>
             * <li>custom: Custom protocol.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>agui</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Protocol build() {
                return new Protocol(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class Compute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("computeClass")
        @com.aliyun.core.annotation.Validation(required = true)
        private String computeClass;

        private Compute(Builder builder) {
            this.computeClass = builder.computeClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Compute create() {
            return builder().build();
        }

        /**
         * @return computeClass
         */
        public String getComputeClass() {
            return this.computeClass;
        }

        public static final class Builder {
            private String computeClass; 

            private Builder() {
            } 

            private Builder(Compute model) {
                this.computeClass = model.computeClass;
            } 

            /**
             * <p>The compute specification. Valid values:</p>
             * <ul>
             * <li>INTERACTIVE: 1 vCPU and 2 GiB of memory.</li>
             * <li>STANDARD: 2 vCPUs and 4 GiB of memory.</li>
             * <li>HEAVY: 4 vCPUs and 8 GiB of memory.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>STANDARD</p>
             */
            public Builder computeClass(String computeClass) {
                this.computeClass = computeClass;
                return this;
            }

            public Compute build() {
                return new Compute(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class Hpa extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("maxConcurrentSessionsPerSandbox")
        private Integer maxConcurrentSessionsPerSandbox;

        @com.aliyun.core.annotation.NameInMap("maxSandboxCount")
        private Integer maxSandboxCount;

        @com.aliyun.core.annotation.NameInMap("minSandboxCount")
        private Integer minSandboxCount;

        @com.aliyun.core.annotation.NameInMap("sessionTtlSeconds")
        private Integer sessionTtlSeconds;

        private Hpa(Builder builder) {
            this.enabled = builder.enabled;
            this.maxConcurrentSessionsPerSandbox = builder.maxConcurrentSessionsPerSandbox;
            this.maxSandboxCount = builder.maxSandboxCount;
            this.minSandboxCount = builder.minSandboxCount;
            this.sessionTtlSeconds = builder.sessionTtlSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hpa create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return maxConcurrentSessionsPerSandbox
         */
        public Integer getMaxConcurrentSessionsPerSandbox() {
            return this.maxConcurrentSessionsPerSandbox;
        }

        /**
         * @return maxSandboxCount
         */
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        /**
         * @return minSandboxCount
         */
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

        /**
         * @return sessionTtlSeconds
         */
        public Integer getSessionTtlSeconds() {
            return this.sessionTtlSeconds;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Integer maxConcurrentSessionsPerSandbox; 
            private Integer maxSandboxCount; 
            private Integer minSandboxCount; 
            private Integer sessionTtlSeconds; 

            private Builder() {
            } 

            private Builder(Hpa model) {
                this.enabled = model.enabled;
                this.maxConcurrentSessionsPerSandbox = model.maxConcurrentSessionsPerSandbox;
                this.maxSandboxCount = model.maxSandboxCount;
                this.minSandboxCount = model.minSandboxCount;
                this.sessionTtlSeconds = model.sessionTtlSeconds;
            } 

            /**
             * <p>Specifies whether to enable elastic scaling. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.
             * Default value: false.</li>
             * </ul>
             * <p>This parameter is required.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The maximum number of concurrent sessions for a single runtime instance. Valid values: 1 to 100. Default value: 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxConcurrentSessionsPerSandbox(Integer maxConcurrentSessionsPerSandbox) {
                this.maxConcurrentSessionsPerSandbox = maxConcurrentSessionsPerSandbox;
                return this;
            }

            /**
             * <p>The maximum number of runtime instances. Valid values: 1 to 100. The value cannot be less than minSandboxCount. Default value: 10.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxSandboxCount(Integer maxSandboxCount) {
                this.maxSandboxCount = maxSandboxCount;
                return this;
            }

            /**
             * <p>The minimum number of runtime instances. Valid values: 1 to 100. The value cannot be greater than maxSandboxCount. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minSandboxCount(Integer minSandboxCount) {
                this.minSandboxCount = minSandboxCount;
                return this;
            }

            /**
             * <p>The session idle timeout in seconds. Valid values: 60 to 86400. Default value: 600.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder sessionTtlSeconds(Integer sessionTtlSeconds) {
                this.sessionTtlSeconds = sessionTtlSeconds;
                return this;
            }

            public Hpa build() {
                return new Hpa(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class SessionPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("headerName")
        private String headerName;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private SessionPolicy(Builder builder) {
            this.headerName = builder.headerName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionPolicy create() {
            return builder().build();
        }

        /**
         * @return headerName
         */
        public String getHeaderName() {
            return this.headerName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String headerName; 
            private String type; 

            private Builder() {
            } 

            private Builder(SessionPolicy model) {
                this.headerName = model.headerName;
                this.type = model.type;
            } 

            /**
             * <p>The name of the HTTP request header used by the session policy. This parameter is required when type is set to ISOLATED_HEADER_FIELD and must be a valid HTTP request header name. Omit this parameter for other policies.</p>
             * 
             * <strong>example:</strong>
             * <p>X-Session-Id</p>
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * <p>The session policy type. Valid values:</p>
             * <ul>
             * <li>AFFINITY: Session affinity.</li>
             * <li>ISOLATED_HEADER_FIELD: Associates sessions by using the request header specified by headerName.</li>
             * <li>ISOLATED_COOKIE: Not recommended.</li>
             * <li>DISABLED: A compatibility option. The response returns AFFINITY.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AFFINITY</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SessionPolicy build() {
                return new SessionPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class Runtime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("compute")
        @com.aliyun.core.annotation.Validation(required = true)
        private Compute compute;

        @com.aliyun.core.annotation.NameInMap("hpa")
        private Hpa hpa;

        @com.aliyun.core.annotation.NameInMap("sessionPolicy")
        @com.aliyun.core.annotation.Validation(required = true)
        private SessionPolicy sessionPolicy;

        private Runtime(Builder builder) {
            this.compute = builder.compute;
            this.hpa = builder.hpa;
            this.sessionPolicy = builder.sessionPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Runtime create() {
            return builder().build();
        }

        /**
         * @return compute
         */
        public Compute getCompute() {
            return this.compute;
        }

        /**
         * @return hpa
         */
        public Hpa getHpa() {
            return this.hpa;
        }

        /**
         * @return sessionPolicy
         */
        public SessionPolicy getSessionPolicy() {
            return this.sessionPolicy;
        }

        public static final class Builder {
            private Compute compute; 
            private Hpa hpa; 
            private SessionPolicy sessionPolicy; 

            private Builder() {
            } 

            private Builder(Runtime model) {
                this.compute = model.compute;
                this.hpa = model.hpa;
                this.sessionPolicy = model.sessionPolicy;
            } 

            /**
             * <p>The compute resource configuration for the agent runtime instance.</p>
             * <p>This parameter is required.</p>
             */
            public Builder compute(Compute compute) {
                this.compute = compute;
                return this;
            }

            /**
             * <p>The optional elastic policy. When runtime is provided, if hpa or its fields are omitted, the default values are used: enabled is false, the minimum number of instances is 1, the maximum number of instances is 10, the maximum number of concurrent sessions per instance is 100, and the session idle timeout is 600 seconds. To retain the original policy during an update, provide the complete hpa configuration.</p>
             */
            public Builder hpa(Hpa hpa) {
                this.hpa = hpa;
                return this;
            }

            /**
             * <p>The session policy configuration, which is used to set the session association method for requests.</p>
             * <p>This parameter is required.</p>
             */
            public Builder sessionPolicy(SessionPolicy sessionPolicy) {
                this.sessionPolicy = sessionPolicy;
                return this;
            }

            public Runtime build() {
                return new Runtime(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class CreateCustomAgentRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agenticFsMounts")
        private java.util.List<AgenticFsMounts> agenticFsMounts;

        @com.aliyun.core.annotation.NameInMap("artifact")
        @com.aliyun.core.annotation.Validation(required = true)
        private Artifact artifact;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("environment")
        private Environment environment;

        @com.aliyun.core.annotation.NameInMap("healthCheck")
        private HealthCheck healthCheck;

        @com.aliyun.core.annotation.NameInMap("logging")
        private Logging logging;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("network")
        private Network network;

        @com.aliyun.core.annotation.NameInMap("ossMounts")
        private java.util.List<OssMounts> ossMounts;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private java.util.List<Protocol> protocol;

        @com.aliyun.core.annotation.NameInMap("roleArn")
        @com.aliyun.core.annotation.Validation(required = true)
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("runtime")
        @com.aliyun.core.annotation.Validation(required = true)
        private Runtime runtime;

        private CreateCustomAgentRequestBody(Builder builder) {
            this.agenticFsMounts = builder.agenticFsMounts;
            this.artifact = builder.artifact;
            this.description = builder.description;
            this.environment = builder.environment;
            this.healthCheck = builder.healthCheck;
            this.logging = builder.logging;
            this.name = builder.name;
            this.network = builder.network;
            this.ossMounts = builder.ossMounts;
            this.protocol = builder.protocol;
            this.roleArn = builder.roleArn;
            this.runtime = builder.runtime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCustomAgentRequestBody create() {
            return builder().build();
        }

        /**
         * @return agenticFsMounts
         */
        public java.util.List<AgenticFsMounts> getAgenticFsMounts() {
            return this.agenticFsMounts;
        }

        /**
         * @return artifact
         */
        public Artifact getArtifact() {
            return this.artifact;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return environment
         */
        public Environment getEnvironment() {
            return this.environment;
        }

        /**
         * @return healthCheck
         */
        public HealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        /**
         * @return logging
         */
        public Logging getLogging() {
            return this.logging;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
        }

        /**
         * @return ossMounts
         */
        public java.util.List<OssMounts> getOssMounts() {
            return this.ossMounts;
        }

        /**
         * @return protocol
         */
        public java.util.List<Protocol> getProtocol() {
            return this.protocol;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return runtime
         */
        public Runtime getRuntime() {
            return this.runtime;
        }

        public static final class Builder {
            private java.util.List<AgenticFsMounts> agenticFsMounts; 
            private Artifact artifact; 
            private String description; 
            private Environment environment; 
            private HealthCheck healthCheck; 
            private Logging logging; 
            private String name; 
            private Network network; 
            private java.util.List<OssMounts> ossMounts; 
            private java.util.List<Protocol> protocol; 
            private String roleArn; 
            private Runtime runtime; 

            private Builder() {
            } 

            private Builder(CreateCustomAgentRequestBody model) {
                this.agenticFsMounts = model.agenticFsMounts;
                this.artifact = model.artifact;
                this.description = model.description;
                this.environment = model.environment;
                this.healthCheck = model.healthCheck;
                this.logging = model.logging;
                this.name = model.name;
                this.network = model.network;
                this.ossMounts = model.ossMounts;
                this.protocol = model.protocol;
                this.roleArn = model.roleArn;
                this.runtime = model.runtime;
            } 

            /**
             * <p>The list of additional AgenticFS mounts. The total number of AgenticFS and OSS mounts cannot exceed 10. If you omit this parameter or pass an empty array [] during creation, no additional mounts are configured. If you omit this parameter during an update, the original value is retained. If you pass an empty array [], the list is cleared. You cannot pass null.</p>
             */
            public Builder agenticFsMounts(java.util.List<AgenticFsMounts> agenticFsMounts) {
                this.agenticFsMounts = agenticFsMounts;
                return this;
            }

            /**
             * <p>The deployment artifact configuration. Currently, only ACR container images are supported. Specify container and the service listening port in port, and omit code.</p>
             * <p>This parameter is required.</p>
             */
            public Builder artifact(Artifact artifact) {
                this.artifact = artifact;
                return this;
            }

            /**
             * <p>The description of the agent purpose. The maximum length is 1,024 characters after leading and trailing whitespace is removed.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom agent that provides conversation services</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The environment variable configuration passed to the agent runtime process.</p>
             */
            public Builder environment(Environment environment) {
                this.environment = environment;
                return this;
            }

            /**
             * <p>The optional HTTP health check configuration. If this object is provided, you must specify port. Unspecified items use default values. If omitted during creation, no health check is configured. If this top-level field is omitted during an update, the original configuration is retained. If null is passed, the health check is removed.</p>
             */
            public Builder healthCheck(HealthCheck healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * <p>The agent log delivery configuration. You can specify the Simple Log Service project and Logstore. After a successful creation or update, verify that logs are delivered properly.</p>
             */
            public Builder logging(Logging logging) {
                this.logging = logging;
                return this;
            }

            /**
             * <p>The name of the custom agent. The length must be 1 to 128 characters after leading and trailing whitespace is removed. The name must be unique within the same workspace.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my-custom-agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The network access configuration of the agent. If this object is provided, omitted access items are treated as allowed. The actual accessible range is still limited by the workspace network configuration. To retain the original restrictions during an update, specify both accessInternet and accessVpc.</p>
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The list of OSS mounts. The total number of OSS and AgenticFS mounts cannot exceed 10. You must specify bucketName, path, and mountPath for each item. Mount targets must not be duplicated or overlap. The entire list is replaced during an update. Pass an empty array [] to clear the list.</p>
             */
            public Builder ossMounts(java.util.List<OssMounts> ossMounts) {
                this.ossMounts = ossMounts;
                return this;
            }

            /**
             * <p>The list of invocation protocols supported by the agent. Each item includes the protocol type and optional paths and request headers. The entire list is replaced during an update.</p>
             */
            public Builder protocol(java.util.List<Protocol> protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The ARN of the RAM role used when the agent accesses user cloud resources. The role must have permissions to access the cloud resources.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1234567890123456:role/agentcore-runtime-role</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>The runtime configuration, including compute specifications, session policies, and an optional elastic policy. Both compute and sessionPolicy must be specified.</p>
             * <p>This parameter is required.</p>
             */
            public Builder runtime(Runtime runtime) {
                this.runtime = runtime;
                return this;
            }

            public CreateCustomAgentRequestBody build() {
                return new CreateCustomAgentRequestBody(this);
            } 

        } 

    }
}
