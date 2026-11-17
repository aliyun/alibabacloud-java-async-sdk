// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateKnowledgeSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateKnowledgeSourceRequest</p>
 */
public class CreateKnowledgeSourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSource")
    private DataSource dataSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Document")
    private Document document;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Project")
    private Project project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateKnowledgeSourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.dataSource = builder.dataSource;
        this.description = builder.description;
        this.document = builder.document;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.name = builder.name;
        this.project = builder.project;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dataSource
     */
    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return document
     */
    public Document getDocument() {
        return this.document;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return project
     */
    public Project getProject() {
        return this.project;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateKnowledgeSourceRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private DataSource dataSource; 
        private String description; 
        private Document document; 
        private String knowledgeBaseId; 
        private String name; 
        private Project project; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateKnowledgeSourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.dataSource = request.dataSource;
            this.description = request.description;
            this.document = request.document;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.name = request.name;
            this.project = request.project;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The client token used to ensure idempotence.</p>
         * 
         * <strong>example:</strong>
         * <p>source-create-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The data source configuration. This parameter is required when Type is set to DATA_SOURCE.</p>
         */
        public Builder dataSource(DataSource dataSource) {
            String dataSourceShrink = shrink(dataSource, "DataSource", "json");
            this.putBodyParameter("DataSource", dataSourceShrink);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales metrics and policy documents</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The document configuration. This parameter is required when Type is set to DOCUMENT.</p>
         */
        public Builder document(Document document) {
            String documentShrink = shrink(document, "Document", "json");
            this.putBodyParameter("Document", documentShrink);
            this.document = document;
            return this;
        }

        /**
         * <p>The ID of the knowledge base.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putBodyParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The name of the source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales topic project</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The project configuration. This parameter is required when Type is set to PROJECT.</p>
         */
        public Builder project(Project project) {
            String projectShrink = shrink(project, "Project", "json");
            this.putBodyParameter("Project", projectShrink);
            this.project = project;
            return this;
        }

        /**
         * <p>The type of the knowledge source. Valid values: PROJECT, DATA_SOURCE, and DOCUMENT.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateKnowledgeSourceRequest build() {
            return new CreateKnowledgeSourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateKnowledgeSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeSourceRequest</p>
     */
    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private Long dataSourceId;

        private DataSource(Builder builder) {
            this.dataSourceId = builder.dataSourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
            return builder().build();
        }

        /**
         * @return dataSourceId
         */
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public static final class Builder {
            private Long dataSourceId; 

            private Builder() {
            } 

            private Builder(DataSource model) {
                this.dataSourceId = model.dataSourceId;
            } 

            /**
             * <p>The ID of the DataWorks data source. The server uses this ID to resolve the associated workspace, environment, and data source type.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder dataSourceId(Long dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateKnowledgeSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeSourceRequest</p>
     */
    public static class DingTalk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("McpKey")
        private String mcpKey;

        @com.aliyun.core.annotation.NameInMap("SourceUrls")
        private java.util.List<String> sourceUrls;

        private DingTalk(Builder builder) {
            this.mcpKey = builder.mcpKey;
            this.sourceUrls = builder.sourceUrls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingTalk create() {
            return builder().build();
        }

        /**
         * @return mcpKey
         */
        public String getMcpKey() {
            return this.mcpKey;
        }

        /**
         * @return sourceUrls
         */
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

        public static final class Builder {
            private String mcpKey; 
            private java.util.List<String> sourceUrls; 

            private Builder() {
            } 

            private Builder(DingTalk model) {
                this.mcpKey = model.mcpKey;
                this.sourceUrls = model.sourceUrls;
            } 

            /**
             * <p>The MCP authorization credential for the DingTalk document connector. This credential is used only for creation or updates and is not returned in the response.</p>
             * 
             * <strong>example:</strong>
             * <p>123456****</p>
             */
            public Builder mcpKey(String mcpKey) {
                this.mcpKey = mcpKey;
                return this;
            }

            /**
             * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization settings.</p>
             */
            public Builder sourceUrls(java.util.List<String> sourceUrls) {
                this.sourceUrls = sourceUrls;
                return this;
            }

            public DingTalk build() {
                return new DingTalk(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateKnowledgeSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeSourceRequest</p>
     */
    public static class Feishu extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppSecret")
        private String appSecret;

        @com.aliyun.core.annotation.NameInMap("SourceUrls")
        private java.util.List<String> sourceUrls;

        private Feishu(Builder builder) {
            this.appId = builder.appId;
            this.appSecret = builder.appSecret;
            this.sourceUrls = builder.sourceUrls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Feishu create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appSecret
         */
        public String getAppSecret() {
            return this.appSecret;
        }

        /**
         * @return sourceUrls
         */
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

        public static final class Builder {
            private String appId; 
            private String appSecret; 
            private java.util.List<String> sourceUrls; 

            private Builder() {
            } 

            private Builder(Feishu model) {
                this.appId = model.appId;
                this.appSecret = model.appSecret;
                this.sourceUrls = model.sourceUrls;
            } 

            /**
             * <p>The ID of the Feishu or Lark application. This is not the AppSecret.</p>
             * 
             * <strong>example:</strong>
             * <p>app-001</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The secret of the Feishu or Lark application. This secret is used only for creation or updates and is not returned in the response.</p>
             * 
             * <strong>example:</strong>
             * <p>123456****</p>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization settings.</p>
             */
            public Builder sourceUrls(java.util.List<String> sourceUrls) {
                this.sourceUrls = sourceUrls;
                return this;
            }

            public Feishu build() {
                return new Feishu(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateKnowledgeSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeSourceRequest</p>
     */
    public static class Lark extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppSecret")
        private String appSecret;

        @com.aliyun.core.annotation.NameInMap("SourceUrls")
        private java.util.List<String> sourceUrls;

        private Lark(Builder builder) {
            this.appId = builder.appId;
            this.appSecret = builder.appSecret;
            this.sourceUrls = builder.sourceUrls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Lark create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appSecret
         */
        public String getAppSecret() {
            return this.appSecret;
        }

        /**
         * @return sourceUrls
         */
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

        public static final class Builder {
            private String appId; 
            private String appSecret; 
            private java.util.List<String> sourceUrls; 

            private Builder() {
            } 

            private Builder(Lark model) {
                this.appId = model.appId;
                this.appSecret = model.appSecret;
                this.sourceUrls = model.sourceUrls;
            } 

            /**
             * <p>The ID of the Feishu or Lark application. This is not the AppSecret.</p>
             * 
             * <strong>example:</strong>
             * <p>app-001</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The secret of the Feishu or Lark application. This secret is used only for creation or updates and is not returned in the response.</p>
             * 
             * <strong>example:</strong>
             * <p>123456****</p>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization settings.</p>
             */
            public Builder sourceUrls(java.util.List<String> sourceUrls) {
                this.sourceUrls = sourceUrls;
                return this;
            }

            public Lark build() {
                return new Lark(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateKnowledgeSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeSourceRequest</p>
     */
    public static class WeCom extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BotId")
        private String botId;

        @com.aliyun.core.annotation.NameInMap("BotSecret")
        private String botSecret;

        @com.aliyun.core.annotation.NameInMap("SpaceIds")
        private java.util.List<String> spaceIds;

        private WeCom(Builder builder) {
            this.botId = builder.botId;
            this.botSecret = builder.botSecret;
            this.spaceIds = builder.spaceIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WeCom create() {
            return builder().build();
        }

        /**
         * @return botId
         */
        public String getBotId() {
            return this.botId;
        }

        /**
         * @return botSecret
         */
        public String getBotSecret() {
            return this.botSecret;
        }

        /**
         * @return spaceIds
         */
        public java.util.List<String> getSpaceIds() {
            return this.spaceIds;
        }

        public static final class Builder {
            private String botId; 
            private String botSecret; 
            private java.util.List<String> spaceIds; 

            private Builder() {
            } 

            private Builder(WeCom model) {
                this.botId = model.botId;
                this.botSecret = model.botSecret;
                this.spaceIds = model.spaceIds;
            } 

            /**
             * <p>The ID of the WeCom bot.</p>
             * 
             * <strong>example:</strong>
             * <p>bot-001</p>
             */
            public Builder botId(String botId) {
                this.botId = botId;
                return this;
            }

            /**
             * <p>The secret of the WeCom bot. This secret is used only for creation or updates and is not returned in the response.</p>
             * 
             * <strong>example:</strong>
             * <p>123456****</p>
             */
            public Builder botSecret(String botSecret) {
                this.botSecret = botSecret;
                return this;
            }

            /**
             * <p>The IDs of the shared spaces selected for the WeCom connector.</p>
             */
            public Builder spaceIds(java.util.List<String> spaceIds) {
                this.spaceIds = spaceIds;
                return this;
            }

            public WeCom build() {
                return new WeCom(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateKnowledgeSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeSourceRequest</p>
     */
    public static class Teams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("SourceUrls")
        private java.util.List<String> sourceUrls;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        private Teams(Builder builder) {
            this.host = builder.host;
            this.sourceUrls = builder.sourceUrls;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Teams create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return sourceUrls
         */
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private String host; 
            private java.util.List<String> sourceUrls; 
            private String token; 

            private Builder() {
            } 

            private Builder(Teams model) {
                this.host = model.host;
                this.sourceUrls = model.sourceUrls;
                this.token = model.token;
            } 

            /**
             * <p>The URL of the team site.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.yuque.com">https://www.yuque.com</a></p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization settings.</p>
             */
            public Builder sourceUrls(java.util.List<String> sourceUrls) {
                this.sourceUrls = sourceUrls;
                return this;
            }

            /**
             * <p>The access token for the Yuque team. This token is used only for creation or updates and is not returned in the response.</p>
             * 
             * <strong>example:</strong>
             * <p>123456****</p>
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public Teams build() {
                return new Teams(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateKnowledgeSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeSourceRequest</p>
     */
    public static class Yuque extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Teams")
        private java.util.List<Teams> teams;

        private Yuque(Builder builder) {
            this.teams = builder.teams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Yuque create() {
            return builder().build();
        }

        /**
         * @return teams
         */
        public java.util.List<Teams> getTeams() {
            return this.teams;
        }

        public static final class Builder {
            private java.util.List<Teams> teams; 

            private Builder() {
            } 

            private Builder(Yuque model) {
                this.teams = model.teams;
            } 

            /**
             * <p>The Yuque team configurations. Each team independently selects the synchronization scope.</p>
             */
            public Builder teams(java.util.List<Teams> teams) {
                this.teams = teams;
                return this;
            }

            public Yuque build() {
                return new Yuque(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateKnowledgeSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeSourceRequest</p>
     */
    public static class Document extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectorType")
        private String connectorType;

        @com.aliyun.core.annotation.NameInMap("DingTalk")
        private DingTalk dingTalk;

        @com.aliyun.core.annotation.NameInMap("Feishu")
        private Feishu feishu;

        @com.aliyun.core.annotation.NameInMap("Lark")
        private Lark lark;

        @com.aliyun.core.annotation.NameInMap("WeCom")
        private WeCom weCom;

        @com.aliyun.core.annotation.NameInMap("Yuque")
        private Yuque yuque;

        private Document(Builder builder) {
            this.connectorType = builder.connectorType;
            this.dingTalk = builder.dingTalk;
            this.feishu = builder.feishu;
            this.lark = builder.lark;
            this.weCom = builder.weCom;
            this.yuque = builder.yuque;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Document create() {
            return builder().build();
        }

        /**
         * @return connectorType
         */
        public String getConnectorType() {
            return this.connectorType;
        }

        /**
         * @return dingTalk
         */
        public DingTalk getDingTalk() {
            return this.dingTalk;
        }

        /**
         * @return feishu
         */
        public Feishu getFeishu() {
            return this.feishu;
        }

        /**
         * @return lark
         */
        public Lark getLark() {
            return this.lark;
        }

        /**
         * @return weCom
         */
        public WeCom getWeCom() {
            return this.weCom;
        }

        /**
         * @return yuque
         */
        public Yuque getYuque() {
            return this.yuque;
        }

        public static final class Builder {
            private String connectorType; 
            private DingTalk dingTalk; 
            private Feishu feishu; 
            private Lark lark; 
            private WeCom weCom; 
            private Yuque yuque; 

            private Builder() {
            } 

            private Builder(Document model) {
                this.connectorType = model.connectorType;
                this.dingTalk = model.dingTalk;
                this.feishu = model.feishu;
                this.lark = model.lark;
                this.weCom = model.weCom;
                this.yuque = model.yuque;
            } 

            /**
             * <p>The type of the connector. Valid values: DINGTALK, FEISHU, LARK, WECOM, and YUQUE. The connector type cannot be changed after creation.</p>
             * 
             * <strong>example:</strong>
             * <p>WECOM</p>
             */
            public Builder connectorType(String connectorType) {
                this.connectorType = connectorType;
                return this;
            }

            /**
             * <p>The DingTalk configuration. This parameter is available only when ConnectorType is set to DINGTALK.</p>
             */
            public Builder dingTalk(DingTalk dingTalk) {
                this.dingTalk = dingTalk;
                return this;
            }

            /**
             * <p>The Feishu configuration. This parameter is available only when ConnectorType is set to FEISHU.</p>
             */
            public Builder feishu(Feishu feishu) {
                this.feishu = feishu;
                return this;
            }

            /**
             * <p>The Lark configuration. This parameter is available only when ConnectorType is set to LARK.</p>
             */
            public Builder lark(Lark lark) {
                this.lark = lark;
                return this;
            }

            /**
             * <p>The WeCom configuration. This parameter is available only when ConnectorType is set to WECOM.</p>
             */
            public Builder weCom(WeCom weCom) {
                this.weCom = weCom;
                return this;
            }

            /**
             * <p>The Yuque configuration. This parameter is available only when ConnectorType is set to YUQUE.</p>
             */
            public Builder yuque(Yuque yuque) {
                this.yuque = yuque;
                return this;
            }

            public Document build() {
                return new Document(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateKnowledgeSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeSourceRequest</p>
     */
    public static class Project extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        private Project(Builder builder) {
            this.envType = builder.envType;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Project create() {
            return builder().build();
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String envType; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(Project model) {
                this.envType = model.envType;
                this.projectId = model.projectId;
            } 

            /**
             * <p>The environment type. This parameter is optional and restricts the read environment to Dev or Prod. If this parameter is not specified, it does not mean that you have the permissions to read data from both environments.</p>
             * 
             * <strong>example:</strong>
             * <p>Prod</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The ID of the DataWorks workspace. This field is used to locate the source.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public Project build() {
                return new Project(this);
            } 

        } 

    }
}
