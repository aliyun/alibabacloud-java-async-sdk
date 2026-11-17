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
 * {@link ListKnowledgeSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListKnowledgeSourcesResponseBody</p>
 */
public class ListKnowledgeSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListKnowledgeSourcesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgeSourcesResponseBody create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer maxResults; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListKnowledgeSourcesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business error code. This code is used to determine the error type when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data returned when the request is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The error message returned when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The request parameters are invalid</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which can be used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListKnowledgeSourcesResponseBody build() {
            return new ListKnowledgeSourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKnowledgeSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeSourcesResponseBody</p>
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
             * <p>The ID of the DataWorks data source. The server uses this ID to resolve the workspace, environment, and data source type.</p>
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
     * {@link ListKnowledgeSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeSourcesResponseBody</p>
     */
    public static class DingTalk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("SourceUrls")
        private java.util.List<String> sourceUrls;

        private DingTalk(Builder builder) {
            this.appId = builder.appId;
            this.sourceUrls = builder.sourceUrls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingTalk create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return sourceUrls
         */
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

        public static final class Builder {
            private String appId; 
            private java.util.List<String> sourceUrls; 

            private Builder() {
            } 

            private Builder(DingTalk model) {
                this.appId = model.appId;
                this.sourceUrls = model.sourceUrls;
            } 

            /**
             * <p>The Feishu or Lark application ID. This is not the AppSecret.</p>
             * 
             * <strong>example:</strong>
             * <p>app-001</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization.</p>
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
     * {@link ListKnowledgeSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeSourcesResponseBody</p>
     */
    public static class Feishu extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("SourceUrls")
        private java.util.List<String> sourceUrls;

        private Feishu(Builder builder) {
            this.appId = builder.appId;
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
         * @return sourceUrls
         */
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

        public static final class Builder {
            private String appId; 
            private java.util.List<String> sourceUrls; 

            private Builder() {
            } 

            private Builder(Feishu model) {
                this.appId = model.appId;
                this.sourceUrls = model.sourceUrls;
            } 

            /**
             * <p>The Feishu or Lark application ID. This is not the AppSecret.</p>
             * 
             * <strong>example:</strong>
             * <p>app-001</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization.</p>
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
     * {@link ListKnowledgeSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeSourcesResponseBody</p>
     */
    public static class Lark extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("SourceUrls")
        private java.util.List<String> sourceUrls;

        private Lark(Builder builder) {
            this.appId = builder.appId;
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
         * @return sourceUrls
         */
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

        public static final class Builder {
            private String appId; 
            private java.util.List<String> sourceUrls; 

            private Builder() {
            } 

            private Builder(Lark model) {
                this.appId = model.appId;
                this.sourceUrls = model.sourceUrls;
            } 

            /**
             * <p>The Feishu or Lark application ID. This is not the AppSecret.</p>
             * 
             * <strong>example:</strong>
             * <p>app-001</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization.</p>
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
     * {@link ListKnowledgeSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeSourcesResponseBody</p>
     */
    public static class Spaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpaceId")
        private String spaceId;

        @com.aliyun.core.annotation.NameInMap("SpaceName")
        private String spaceName;

        private Spaces(Builder builder) {
            this.spaceId = builder.spaceId;
            this.spaceName = builder.spaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spaces create() {
            return builder().build();
        }

        /**
         * @return spaceId
         */
        public String getSpaceId() {
            return this.spaceId;
        }

        /**
         * @return spaceName
         */
        public String getSpaceName() {
            return this.spaceName;
        }

        public static final class Builder {
            private String spaceId; 
            private String spaceName; 

            private Builder() {
            } 

            private Builder(Spaces model) {
                this.spaceId = model.spaceId;
                this.spaceName = model.spaceName;
            } 

            /**
             * <p>The identity of the shared space.</p>
             * 
             * <strong>example:</strong>
             * <p>space-001</p>
             */
            public Builder spaceId(String spaceId) {
                this.spaceId = spaceId;
                return this;
            }

            /**
             * <p>The display name verified by the server. This field is not used for identity verification.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D Knowledge</p>
             */
            public Builder spaceName(String spaceName) {
                this.spaceName = spaceName;
                return this;
            }

            public Spaces build() {
                return new Spaces(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKnowledgeSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeSourcesResponseBody</p>
     */
    public static class WeCom extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BotId")
        private String botId;

        @com.aliyun.core.annotation.NameInMap("Spaces")
        private java.util.List<Spaces> spaces;

        private WeCom(Builder builder) {
            this.botId = builder.botId;
            this.spaces = builder.spaces;
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
         * @return spaces
         */
        public java.util.List<Spaces> getSpaces() {
            return this.spaces;
        }

        public static final class Builder {
            private String botId; 
            private java.util.List<Spaces> spaces; 

            private Builder() {
            } 

            private Builder(WeCom model) {
                this.botId = model.botId;
                this.spaces = model.spaces;
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
             * <p>The selected shared spaces, including their identities and display names.</p>
             */
            public Builder spaces(java.util.List<Spaces> spaces) {
                this.spaces = spaces;
                return this;
            }

            public WeCom build() {
                return new WeCom(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKnowledgeSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeSourcesResponseBody</p>
     */
    public static class Teams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("SourceUrls")
        private java.util.List<String> sourceUrls;

        @com.aliyun.core.annotation.NameInMap("TeamId")
        private String teamId;

        @com.aliyun.core.annotation.NameInMap("TeamLogin")
        private String teamLogin;

        @com.aliyun.core.annotation.NameInMap("TeamName")
        private String teamName;

        private Teams(Builder builder) {
            this.host = builder.host;
            this.sourceUrls = builder.sourceUrls;
            this.teamId = builder.teamId;
            this.teamLogin = builder.teamLogin;
            this.teamName = builder.teamName;
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
         * @return teamId
         */
        public String getTeamId() {
            return this.teamId;
        }

        /**
         * @return teamLogin
         */
        public String getTeamLogin() {
            return this.teamLogin;
        }

        /**
         * @return teamName
         */
        public String getTeamName() {
            return this.teamName;
        }

        public static final class Builder {
            private String host; 
            private java.util.List<String> sourceUrls; 
            private String teamId; 
            private String teamLogin; 
            private String teamName; 

            private Builder() {
            } 

            private Builder(Teams model) {
                this.host = model.host;
                this.sourceUrls = model.sourceUrls;
                this.teamId = model.teamId;
                this.teamLogin = model.teamLogin;
                this.teamName = model.teamName;
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
             * <p>The URLs of the knowledge bases, spaces, or documents selected for this connector. The actual allowed scope is determined by the connector and authorization.</p>
             */
            public Builder sourceUrls(java.util.List<String> sourceUrls) {
                this.sourceUrls = sourceUrls;
                return this;
            }

            /**
             * <p>The team ID verified by the server.</p>
             * 
             * <strong>example:</strong>
             * <p>team-001</p>
             */
            public Builder teamId(String teamId) {
                this.teamId = teamId;
                return this;
            }

            /**
             * <p>The team logon name. This is read-only display information.</p>
             * 
             * <strong>example:</strong>
             * <p>example-team</p>
             */
            public Builder teamLogin(String teamLogin) {
                this.teamLogin = teamLogin;
                return this;
            }

            /**
             * <p>The team name. This is read-only display information.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample Team</p>
             */
            public Builder teamName(String teamName) {
                this.teamName = teamName;
                return this;
            }

            public Teams build() {
                return new Teams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKnowledgeSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeSourcesResponseBody</p>
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
     * {@link ListKnowledgeSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeSourcesResponseBody</p>
     */
    public static class Document extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectorType")
        private String connectorType;

        @com.aliyun.core.annotation.NameInMap("CredentialConfigured")
        private Boolean credentialConfigured;

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
            this.credentialConfigured = builder.credentialConfigured;
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
         * @return credentialConfigured
         */
        public Boolean getCredentialConfigured() {
            return this.credentialConfigured;
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
            private Boolean credentialConfigured; 
            private DingTalk dingTalk; 
            private Feishu feishu; 
            private Lark lark; 
            private WeCom weCom; 
            private Yuque yuque; 

            private Builder() {
            } 

            private Builder(Document model) {
                this.connectorType = model.connectorType;
                this.credentialConfigured = model.credentialConfigured;
                this.dingTalk = model.dingTalk;
                this.feishu = model.feishu;
                this.lark = model.lark;
                this.weCom = model.weCom;
                this.yuque = model.yuque;
            } 

            /**
             * <p>The connector type. Valid values: DINGTALK, FEISHU, LARK, WECOM, or YUQUE. The connector type cannot be changed after the source is created.</p>
             * 
             * <strong>example:</strong>
             * <p>WECOM</p>
             */
            public Builder connectorType(String connectorType) {
                this.connectorType = connectorType;
                return this;
            }

            /**
             * <p>Indicates whether the credentials required by the connector are configured. This field is read-only, and the credential content or ciphertext is not returned.</p>
             */
            public Builder credentialConfigured(Boolean credentialConfigured) {
                this.credentialConfigured = credentialConfigured;
                return this;
            }

            /**
             * <p>The DingTalk configuration. This field is available only when the connector type is DingTalk.</p>
             */
            public Builder dingTalk(DingTalk dingTalk) {
                this.dingTalk = dingTalk;
                return this;
            }

            /**
             * <p>The Feishu configuration. This field is available only when the connector type is Feishu.</p>
             */
            public Builder feishu(Feishu feishu) {
                this.feishu = feishu;
                return this;
            }

            /**
             * <p>The Lark configuration. This field is available only when the connector type is Lark.</p>
             */
            public Builder lark(Lark lark) {
                this.lark = lark;
                return this;
            }

            /**
             * <p>The WeCom configuration. This field is available only when the connector type is WeCom.</p>
             */
            public Builder weCom(WeCom weCom) {
                this.weCom = weCom;
                return this;
            }

            /**
             * <p>The Yuque configuration. This field is available only when the connector type is Yuque.</p>
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
     * {@link ListKnowledgeSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeSourcesResponseBody</p>
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
             * <p>The environment type. This optional field restricts the read environment to Dev or Prod. If this field is not specified, it does not mean that you have the permissions to read both environments.</p>
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
    /**
     * 
     * {@link ListKnowledgeSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeSourcesResponseBody</p>
     */
    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private DataSource dataSource;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Document")
        private Document document;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Project")
        private Project project;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Sources(Builder builder) {
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.dataSource = builder.dataSource;
            this.description = builder.description;
            this.document = builder.document;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.project = builder.project;
            this.sourceId = builder.sourceId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
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
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
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
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long createTime; 
            private String createUser; 
            private DataSource dataSource; 
            private String description; 
            private Document document; 
            private String knowledgeBaseId; 
            private Long modifyTime; 
            private String name; 
            private Project project; 
            private String sourceId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Sources model) {
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.dataSource = model.dataSource;
                this.description = model.description;
                this.document = model.document;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.project = model.project;
                this.sourceId = model.sourceId;
                this.type = model.type;
            } 

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1790200400000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creator. This field is written by the server.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000000000000</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The data source information. This field is available only when Type is set to DATA_SOURCE.</p>
             */
            public Builder dataSource(DataSource dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>The optional description of the purpose.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales metrics and policy documents</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The document information. This field is available only when Type is set to DOCUMENT.</p>
             */
            public Builder document(Document document) {
                this.document = document;
                return this;
            }

            /**
             * <p>The ID of the knowledge base to which the source belongs. The source cannot be migrated to another knowledge base after it is created.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678-1234-4234-8234-123456789abc</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The last modification time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1790200300000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name used to identify the source.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales Topic Project</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The project information. This field is available only when Type is set to PROJECT.</p>
             */
            public Builder project(Project project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The stable source ID generated by the service.</p>
             * 
             * <strong>example:</strong>
             * <p>src-001</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The source type. Valid values: PROJECT (workspace), DATA_SOURCE (DataWorks data source), or DOCUMENT (external document source).</p>
             * 
             * <strong>example:</strong>
             * <p>PROJECT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Sources build() {
                return new Sources(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKnowledgeSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeSourcesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Sources")
        private java.util.List<Sources> sources;

        private Data(Builder builder) {
            this.nextToken = builder.nextToken;
            this.sources = builder.sources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return sources
         */
        public java.util.List<Sources> getSources() {
            return this.sources;
        }

        public static final class Builder {
            private String nextToken; 
            private java.util.List<Sources> sources; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.nextToken = model.nextToken;
                this.sources = model.sources;
            } 

            /**
             * <p>The pagination token for the next page. If no next page exists, the value is null.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJvZmZzZXQiOjIwfQ</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The knowledge sources that you have permission to read on the current page.</p>
             */
            public Builder sources(java.util.List<Sources> sources) {
                this.sources = sources;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
