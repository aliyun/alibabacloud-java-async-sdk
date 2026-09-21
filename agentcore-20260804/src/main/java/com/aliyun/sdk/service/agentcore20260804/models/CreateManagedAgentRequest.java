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
 * {@link CreateManagedAgentRequest} extends {@link RequestModel}
 *
 * <p>CreateManagedAgentRequest</p>
 */
public class CreateManagedAgentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateManagedAgentRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateManagedAgentRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateManagedAgentRequest create() {
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
    public CreateManagedAgentRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateManagedAgentRequest, Builder> {
        private String workspaceId; 
        private CreateManagedAgentRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateManagedAgentRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The request body.</p>
         */
        public Builder body(CreateManagedAgentRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>The reserved idempotency token. The backend does not provide idempotency guarantees in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>client-token-1</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateManagedAgentRequest build() {
            return new CreateManagedAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
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
             * <p>The subdirectory under /mnt/agenticfs/ in the container. This field is validated as required by the backend for each mount entry. Mount targets must not be duplicated or have parent-child overlaps.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/agenticfs/data</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>A non-empty relative directory that exists under the AccessPoint. This field is validated as required by the backend for each mount entry. Root directories, absolute paths, and parent directory segments are not allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>workspace/data</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>Specifies whether to mount in read-only mode. Default value: false. This is not a RAM role read-only policy.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * <p>The AccessPoint domain name. This field is validated as required by the backend for each mount entry. Do not include the protocol, port, or path. Use the DomainName value from the NAS ListAccessPoints response.</p>
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
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class CredentialReferences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("credentialId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String credentialId;

        private CredentialReferences(Builder builder) {
            this.credentialId = builder.credentialId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CredentialReferences create() {
            return builder().build();
        }

        /**
         * @return credentialId
         */
        public String getCredentialId() {
            return this.credentialId;
        }

        public static final class Builder {
            private String credentialId; 

            private Builder() {
            } 

            private Builder(CredentialReferences model) {
                this.credentialId = model.credentialId;
            } 

            /**
             * <p>The credential ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cred-1</p>
             */
            public Builder credentialId(String credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            public CredentialReferences build() {
                return new CredentialReferences(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
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
             * <p>The name of the environment variable.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>API_KEY</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the environment variable.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-xxxx</p>
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
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class Environment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("credentialReferences")
        private java.util.List<CredentialReferences> credentialReferences;

        @com.aliyun.core.annotation.NameInMap("variables")
        private java.util.List<Variables> variables;

        private Environment(Builder builder) {
            this.credentialReferences = builder.credentialReferences;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Environment create() {
            return builder().build();
        }

        /**
         * @return credentialReferences
         */
        public java.util.List<CredentialReferences> getCredentialReferences() {
            return this.credentialReferences;
        }

        /**
         * @return variables
         */
        public java.util.List<Variables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private java.util.List<CredentialReferences> credentialReferences; 
            private java.util.List<Variables> variables; 

            private Builder() {
            } 

            private Builder(Environment model) {
                this.credentialReferences = model.credentialReferences;
                this.variables = model.variables;
            } 

            /**
             * <p>The list of credential references.</p>
             */
            public Builder credentialReferences(java.util.List<CredentialReferences> credentialReferences) {
                this.credentialReferences = credentialReferences;
                return this;
            }

            /**
             * <p>The list of environment variables.</p>
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
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("connectorServiceAccountKey")
        private String connectorServiceAccountKey;

        @com.aliyun.core.annotation.NameInMap("connectorServiceAccountName")
        private String connectorServiceAccountName;

        private Configuration(Builder builder) {
            this.connectorServiceAccountKey = builder.connectorServiceAccountKey;
            this.connectorServiceAccountName = builder.connectorServiceAccountName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return connectorServiceAccountKey
         */
        public String getConnectorServiceAccountKey() {
            return this.connectorServiceAccountKey;
        }

        /**
         * @return connectorServiceAccountName
         */
        public String getConnectorServiceAccountName() {
            return this.connectorServiceAccountName;
        }

        public static final class Builder {
            private String connectorServiceAccountKey; 
            private String connectorServiceAccountName; 

            private Builder() {
            } 

            private Builder(Configuration model) {
                this.connectorServiceAccountKey = model.connectorServiceAccountKey;
                this.connectorServiceAccountName = model.connectorServiceAccountName;
            } 

            /**
             * <p>The connector service account key.</p>
             * 
             * <strong>example:</strong>
             * <p>key-xxxx</p>
             */
            public Builder connectorServiceAccountKey(String connectorServiceAccountKey) {
                this.connectorServiceAccountKey = connectorServiceAccountKey;
                return this;
            }

            /**
             * <p>The connector service account name.</p>
             * 
             * <strong>example:</strong>
             * <p>my-connector-key</p>
             */
            public Builder connectorServiceAccountName(String connectorServiceAccountName) {
                this.connectorServiceAccountName = connectorServiceAccountName;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class Harness extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configuration")
        private Configuration configuration;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Harness(Builder builder) {
            this.configuration = builder.configuration;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Harness create() {
            return builder().build();
        }

        /**
         * @return configuration
         */
        public Configuration getConfiguration() {
            return this.configuration;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Configuration configuration; 
            private String type; 

            private Builder() {
            } 

            private Builder(Harness model) {
                this.configuration = model.configuration;
                this.type = model.type;
            } 

            /**
             * <p>The runtime harness configuration.</p>
             */
            public Builder configuration(Configuration configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>The runtime harness type.</p>
             * 
             * <strong>example:</strong>
             * <p>qodercli</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Harness build() {
                return new Harness(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("limitType")
        private String limitType;

        @com.aliyun.core.annotation.NameInMap("periodType")
        private String periodType;

        @com.aliyun.core.annotation.NameInMap("usageLimit")
        private Long usageLimit;

        private Quota(Builder builder) {
            this.enabled = builder.enabled;
            this.limitType = builder.limitType;
            this.periodType = builder.periodType;
            this.usageLimit = builder.usageLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return limitType
         */
        public String getLimitType() {
            return this.limitType;
        }

        /**
         * @return periodType
         */
        public String getPeriodType() {
            return this.periodType;
        }

        /**
         * @return usageLimit
         */
        public Long getUsageLimit() {
            return this.usageLimit;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String limitType; 
            private String periodType; 
            private Long usageLimit; 

            private Builder() {
            } 

            private Builder(Quota model) {
                this.enabled = model.enabled;
                this.limitType = model.limitType;
                this.periodType = model.periodType;
                this.usageLimit = model.usageLimit;
            } 

            /**
             * <p>Specifies whether to enable the token quota. Default value: true. Set to false to disable and delete existing quota rules.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The quota limit type. This field is validated as required by the backend when the quota is enabled. Fixed value: token.</p>
             * 
             * <strong>example:</strong>
             * <p>token</p>
             */
            public Builder limitType(String limitType) {
                this.limitType = limitType;
                return this;
            }

            /**
             * <p>The statistical period of the quota. This field is validated as required by the backend when the quota is enabled. Valid values:</p>
             * <ul>
             * <li>day: daily.</li>
             * <li>month: monthly.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>day</p>
             */
            public Builder periodType(String periodType) {
                this.periodType = periodType;
                return this;
            }

            /**
             * <p>The maximum number of tokens that can be consumed within a single period. This field is validated as required by the backend when the quota is enabled. The value must be greater than 0.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000</p>
             */
            public Builder usageLimit(Long usageLimit) {
                this.usageLimit = usageLimit;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelConnectionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String modelConnectionId;

        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("quota")
        private Quota quota;

        private Model(Builder builder) {
            this.modelConnectionId = builder.modelConnectionId;
            this.modelName = builder.modelName;
            this.quota = builder.quota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return modelConnectionId
         */
        public String getModelConnectionId() {
            return this.modelConnectionId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return quota
         */
        public Quota getQuota() {
            return this.quota;
        }

        public static final class Builder {
            private String modelConnectionId; 
            private String modelName; 
            private Quota quota; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.modelConnectionId = model.modelConnectionId;
                this.modelName = model.modelName;
                this.quota = model.quota;
            } 

            /**
             * <p>The model connection ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mc-1</p>
             */
            public Builder modelConnectionId(String modelConnectionId) {
                this.modelConnectionId = modelConnectionId;
                return this;
            }

            /**
             * <p>The upstream model name.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-max</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The model token quota configuration. If not specified, no quota is configured.</p>
             */
            public Builder quota(Quota quota) {
                this.quota = quota;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
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
             * <p>Specifies whether to allow public network access.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
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
             * <p>Specifies whether to allow VPC access.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
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
             * <p>The public network access configuration.</p>
             */
            public Builder accessInternet(AccessInternet accessInternet) {
                this.accessInternet = accessInternet;
                return this;
            }

            /**
             * <p>The VPC access configuration.</p>
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
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
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
             * <p>The OSS bucket name. This field is validated as required by the backend for each mount entry.</p>
             * 
             * <strong>example:</strong>
             * <p>bucket-001</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The absolute mount path in the container. This field is validated as required by the backend for each mount entry.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/oss/datasets</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The relative object prefix within the bucket. If not specified, the entire bucket is mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>datasets</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>Specifies whether to mount in read-only mode. Default value: false.</p>
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
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
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
             * <p>The compute class.</p>
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
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class Hpa extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("maxConcurrentSessionsPerSandbox")
        @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
        private Integer maxConcurrentSessionsPerSandbox;

        @com.aliyun.core.annotation.NameInMap("maxSandboxCount")
        private Integer maxSandboxCount;

        @com.aliyun.core.annotation.NameInMap("minSandboxCount")
        private Integer minSandboxCount;

        @com.aliyun.core.annotation.NameInMap("sessionTtlSeconds")
        @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
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
             * <p>Specifies whether to enable auto-scaling. This field is validated as required by the backend when hpa is present.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The maximum number of active sessions per sandbox. This field is validated as required by the backend when hpa is present.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxConcurrentSessionsPerSandbox(Integer maxConcurrentSessionsPerSandbox) {
                this.maxConcurrentSessionsPerSandbox = maxConcurrentSessionsPerSandbox;
                return this;
            }

            /**
             * <p>The maximum number of sandboxes. Required when HPA is enabled. The value must be greater than or equal to the minimum value.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxSandboxCount(Integer maxSandboxCount) {
                this.maxSandboxCount = maxSandboxCount;
                return this;
            }

            /**
             * <p>The minimum number of sandboxes. Required when HPA is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minSandboxCount(Integer minSandboxCount) {
                this.minSandboxCount = minSandboxCount;
                return this;
            }

            /**
             * <p>The time-to-live (TTL) for a session after inactivity, in seconds. This field is validated as required by the backend when hpa is present.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
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
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
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
             * <p>The name of the HTTP header used for session affinity. This parameter takes effect when sessionPolicy.type is set to ISOLATED_HEADER_FIELD.</p>
             * 
             * <strong>example:</strong>
             * <p>X-Session-Id</p>
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * <p>The session policy type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DISABLED</p>
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
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
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
             * <p>The compute configuration.</p>
             * <p>This parameter is required.</p>
             */
            public Builder compute(Compute compute) {
                this.compute = compute;
                return this;
            }

            /**
             * <p>The sandbox auto-scaling and session configuration.</p>
             */
            public Builder hpa(Hpa hpa) {
                this.hpa = hpa;
                return this;
            }

            /**
             * <p>The session policy configuration.</p>
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
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class VersionSelector extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private VersionSelector(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionSelector create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(VersionSelector model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The session policy type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DISABLED</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the environment variable.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-xxxx</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public VersionSelector build() {
                return new VersionSelector(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class Skills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("versionSelector")
        private VersionSelector versionSelector;

        private Skills(Builder builder) {
            this.name = builder.name;
            this.sourceType = builder.sourceType;
            this.version = builder.version;
            this.versionSelector = builder.versionSelector;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skills create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionSelector
         */
        public VersionSelector getVersionSelector() {
            return this.versionSelector;
        }

        public static final class Builder {
            private String name; 
            private String sourceType; 
            private String version; 
            private VersionSelector versionSelector; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.name = model.name;
                this.sourceType = model.sourceType;
                this.version = model.version;
                this.versionSelector = model.versionSelector;
            } 

            /**
             * <p>The skill name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>code-analysis</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The skill version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * versionSelector.
             */
            public Builder versionSelector(VersionSelector versionSelector) {
                this.versionSelector = versionSelector;
                return this;
            }

            public Skills build() {
                return new Skills(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class SubAgents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instruction")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private SubAgents(Builder builder) {
            this.instruction = builder.instruction;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubAgents create() {
            return builder().build();
        }

        /**
         * @return instruction
         */
        public String getInstruction() {
            return this.instruction;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String instruction; 
            private String name; 

            private Builder() {
            } 

            private Builder(SubAgents model) {
                this.instruction = model.instruction;
                this.name = model.name;
            } 

            /**
             * <p>The sub-agent instruction.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Review the code</p>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>The sub-agent name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>reviewer-agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SubAgents build() {
                return new SubAgents(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class AiRegistry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private AiRegistry(Builder builder) {
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiRegistry create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(AiRegistry model) {
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * <p>The name of the template in the AI registry.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>code-review-template</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version of the template in the AI registry.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public AiRegistry build() {
                return new AiRegistry(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aiRegistry")
        private AiRegistry aiRegistry;

        private Template(Builder builder) {
            this.aiRegistry = builder.aiRegistry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return aiRegistry
         */
        public AiRegistry getAiRegistry() {
            return this.aiRegistry;
        }

        public static final class Builder {
            private AiRegistry aiRegistry; 

            private Builder() {
            } 

            private Builder(Template model) {
                this.aiRegistry = model.aiRegistry;
            } 

            /**
             * <p>The AI registry template configuration.</p>
             */
            public Builder aiRegistry(AiRegistry aiRegistry) {
                this.aiRegistry = aiRegistry;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Tools(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The tool name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>code-reviewer</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The tool type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MCP</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateManagedAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateManagedAgentRequest</p>
     */
    public static class CreateManagedAgentRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agenticFsMounts")
        private java.util.List<AgenticFsMounts> agenticFsMounts;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("environment")
        private Environment environment;

        @com.aliyun.core.annotation.NameInMap("harness")
        private Harness harness;

        @com.aliyun.core.annotation.NameInMap("instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("model")
        @com.aliyun.core.annotation.Validation(required = true)
        private Model model;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("network")
        private Network network;

        @com.aliyun.core.annotation.NameInMap("ossMounts")
        private java.util.List<OssMounts> ossMounts;

        @com.aliyun.core.annotation.NameInMap("runtime")
        @com.aliyun.core.annotation.Validation(required = true)
        private Runtime runtime;

        @com.aliyun.core.annotation.NameInMap("skills")
        private java.util.List<Skills> skills;

        @com.aliyun.core.annotation.NameInMap("subAgents")
        private java.util.List<SubAgents> subAgents;

        @com.aliyun.core.annotation.NameInMap("template")
        private Template template;

        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<Tools> tools;

        private CreateManagedAgentRequestBody(Builder builder) {
            this.agenticFsMounts = builder.agenticFsMounts;
            this.description = builder.description;
            this.environment = builder.environment;
            this.harness = builder.harness;
            this.instruction = builder.instruction;
            this.model = builder.model;
            this.name = builder.name;
            this.network = builder.network;
            this.ossMounts = builder.ossMounts;
            this.runtime = builder.runtime;
            this.skills = builder.skills;
            this.subAgents = builder.subAgents;
            this.template = builder.template;
            this.tools = builder.tools;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateManagedAgentRequestBody create() {
            return builder().build();
        }

        /**
         * @return agenticFsMounts
         */
        public java.util.List<AgenticFsMounts> getAgenticFsMounts() {
            return this.agenticFsMounts;
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
         * @return harness
         */
        public Harness getHarness() {
            return this.harness;
        }

        /**
         * @return instruction
         */
        public String getInstruction() {
            return this.instruction;
        }

        /**
         * @return model
         */
        public Model getModel() {
            return this.model;
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
         * @return runtime
         */
        public Runtime getRuntime() {
            return this.runtime;
        }

        /**
         * @return skills
         */
        public java.util.List<Skills> getSkills() {
            return this.skills;
        }

        /**
         * @return subAgents
         */
        public java.util.List<SubAgents> getSubAgents() {
            return this.subAgents;
        }

        /**
         * @return template
         */
        public Template getTemplate() {
            return this.template;
        }

        /**
         * @return tools
         */
        public java.util.List<Tools> getTools() {
            return this.tools;
        }

        public static final class Builder {
            private java.util.List<AgenticFsMounts> agenticFsMounts; 
            private String description; 
            private Environment environment; 
            private Harness harness; 
            private String instruction; 
            private Model model; 
            private String name; 
            private Network network; 
            private java.util.List<OssMounts> ossMounts; 
            private Runtime runtime; 
            private java.util.List<Skills> skills; 
            private java.util.List<SubAgents> subAgents; 
            private Template template; 
            private java.util.List<Tools> tools; 

            private Builder() {
            } 

            private Builder(CreateManagedAgentRequestBody model) {
                this.agenticFsMounts = model.agenticFsMounts;
                this.description = model.description;
                this.environment = model.environment;
                this.harness = model.harness;
                this.instruction = model.instruction;
                this.model = model.model;
                this.name = model.name;
                this.network = model.network;
                this.ossMounts = model.ossMounts;
                this.runtime = model.runtime;
                this.skills = model.skills;
                this.subAgents = model.subAgents;
                this.template = model.template;
                this.tools = model.tools;
            } 

            /**
             * <p>Omit or set to [] during creation to indicate no AFS mounts. Set to null to reject. The total number of AFS and OSS mounts cannot exceed 10.</p>
             */
            public Builder agenticFsMounts(java.util.List<AgenticFsMounts> agenticFsMounts) {
                this.agenticFsMounts = agenticFsMounts;
                return this;
            }

            /**
             * <p>The description of the managed agent.</p>
             * 
             * <strong>example:</strong>
             * <p>An agent for code review</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The environment configuration.</p>
             */
            public Builder environment(Environment environment) {
                this.environment = environment;
                return this;
            }

            /**
             * <p>The agent runtime harness.</p>
             */
            public Builder harness(Harness harness) {
                this.harness = harness;
                return this;
            }

            /**
             * <p>The agent instruction that guides the behavior of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>You are a code review assistant</p>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>The model configuration.</p>
             * <p>This parameter is required.</p>
             */
            public Builder model(Model model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The name of the managed agent.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The network configuration.</p>
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The OSS mount list. A maximum of 10 entries are allowed.</p>
             */
            public Builder ossMounts(java.util.List<OssMounts> ossMounts) {
                this.ossMounts = ossMounts;
                return this;
            }

            /**
             * <p>The runtime configuration.</p>
             * <p>This parameter is required.</p>
             */
            public Builder runtime(Runtime runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>The list of skill configurations.</p>
             */
            public Builder skills(java.util.List<Skills> skills) {
                this.skills = skills;
                return this;
            }

            /**
             * <p>The list of sub-agent configurations.</p>
             */
            public Builder subAgents(java.util.List<SubAgents> subAgents) {
                this.subAgents = subAgents;
                return this;
            }

            /**
             * <p>The agent template configuration.</p>
             */
            public Builder template(Template template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The list of tool configurations.</p>
             */
            public Builder tools(java.util.List<Tools> tools) {
                this.tools = tools;
                return this;
            }

            public CreateManagedAgentRequestBody build() {
                return new CreateManagedAgentRequestBody(this);
            } 

        } 

    }
}
