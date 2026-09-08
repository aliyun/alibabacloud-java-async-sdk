// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link SendChatMessageRequest} extends {@link RequestModel}
 *
 * <p>SendChatMessageRequest</p>
 */
public class SendChatMessageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSource")
    private DataSource dataSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSources")
    private java.util.List<DataSources> dataSources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageType")
    private String messageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentSessionId")
    private String parentSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Question")
    private String question;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotedMessage")
    private String quotedMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplyTo")
    private String replyTo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionConfig")
    private SessionConfig sessionConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskConfig")
    private TaskConfig taskConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserOssBucket")
    private String userOssBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private SendChatMessageRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.DMSUnit = builder.DMSUnit;
        this.dataSource = builder.dataSource;
        this.dataSources = builder.dataSources;
        this.message = builder.message;
        this.messageType = builder.messageType;
        this.parentSessionId = builder.parentSessionId;
        this.question = builder.question;
        this.quotedMessage = builder.quotedMessage;
        this.replyTo = builder.replyTo;
        this.sessionConfig = builder.sessionConfig;
        this.sessionId = builder.sessionId;
        this.taskConfig = builder.taskConfig;
        this.userOssBucket = builder.userOssBucket;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendChatMessageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return DMSUnit
     */
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    /**
     * @return dataSource
     */
    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * @return dataSources
     */
    public java.util.List<DataSources> getDataSources() {
        return this.dataSources;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return messageType
     */
    public String getMessageType() {
        return this.messageType;
    }

    /**
     * @return parentSessionId
     */
    public String getParentSessionId() {
        return this.parentSessionId;
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * @return quotedMessage
     */
    public String getQuotedMessage() {
        return this.quotedMessage;
    }

    /**
     * @return replyTo
     */
    public String getReplyTo() {
        return this.replyTo;
    }

    /**
     * @return sessionConfig
     */
    public SessionConfig getSessionConfig() {
        return this.sessionConfig;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return taskConfig
     */
    public TaskConfig getTaskConfig() {
        return this.taskConfig;
    }

    /**
     * @return userOssBucket
     */
    public String getUserOssBucket() {
        return this.userOssBucket;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SendChatMessageRequest, Builder> {
        private String agentId; 
        private String DMSUnit; 
        private DataSource dataSource; 
        private java.util.List<DataSources> dataSources; 
        private String message; 
        private String messageType; 
        private String parentSessionId; 
        private String question; 
        private String quotedMessage; 
        private String replyTo; 
        private SessionConfig sessionConfig; 
        private String sessionId; 
        private TaskConfig taskConfig; 
        private String userOssBucket; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SendChatMessageRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.DMSUnit = request.DMSUnit;
            this.dataSource = request.dataSource;
            this.dataSources = request.dataSources;
            this.message = request.message;
            this.messageType = request.messageType;
            this.parentSessionId = request.parentSessionId;
            this.question = request.question;
            this.quotedMessage = request.quotedMessage;
            this.replyTo = request.replyTo;
            this.sessionConfig = request.sessionConfig;
            this.sessionId = request.sessionId;
            this.taskConfig = request.taskConfig;
            this.userOssBucket = request.userOssBucket;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p><strong>[Optimized]</strong> This field is now automatically obtained by the backend. You do not need to specify this field.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_***</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p><strong>[Optimized]</strong> This field is now automatically obtained by the backend. You do not need to specify this field when calling the API.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * <p>The data source information. This parameter can be left empty. This parameter supports only one data source. Use the DataSources parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder dataSource(DataSource dataSource) {
            String dataSourceShrink = shrink(dataSource, "DataSource", "json");
            this.putQueryParameter("DataSource", dataSourceShrink);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * <p>The detailed data source information. This parameter can be left empty.</p>
         */
        public Builder dataSources(java.util.List<DataSources> dataSources) {
            String dataSourcesShrink = shrink(dataSources, "DataSources", "json");
            this.putQueryParameter("DataSources", dataSourcesShrink);
            this.dataSources = dataSources;
            return this;
        }

        /**
         * <p>The message content to send to the Agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>what can you do?</p>
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * <p>The message type. Default value: <code>[primary]</code>.  </p>
         * <ul>
         * <li><p>For regular interactions with the Agent, set the message type to <code>[primary]</code>.</p>
         * </li>
         * <li><p>When the message is a response to the Agent\&quot;s Human-in-Loop question, set the type to <code>[additional]</code>.</p>
         * </li>
         * <li><p>When the message is intended to trigger report generation, set the type to <code>[report]</code>.</p>
         * </li>
         * <li><p>When the message is intended to cancel the current session, set the type to <code>[cancel]</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>primary</p>
         */
        public Builder messageType(String messageType) {
            this.putQueryParameter("MessageType", messageType);
            this.messageType = messageType;
            return this;
        }

        /**
         * <p>The parent session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20qrliuoo7p2vlsfg*****</p>
         */
        public Builder parentSessionId(String parentSessionId) {
            this.putQueryParameter("ParentSessionId", parentSessionId);
            this.parentSessionId = parentSessionId;
            return this;
        }

        /**
         * <p>This field is required when the message type is <code>additional</code>. Specify the specific question that the Agent asks the user through Human-in-Loop.</p>
         * 
         * <strong>example:</strong>
         * <p>Provide the criteria for calculating GMV</p>
         */
        public Builder question(String question) {
            this.putQueryParameter("Question", question);
            this.question = question;
            return this;
        }

        /**
         * <p>The quoted content. This is typically used during interactions with the Agent.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;version&quot;:&quot;v0&quot;}</p>
         */
        public Builder quotedMessage(String quotedMessage) {
            this.putQueryParameter("QuotedMessage", quotedMessage);
            this.quotedMessage = quotedMessage;
            return this;
        }

        /**
         * <p><strong>Important</strong></p>
         * <p>When this message is a reply to an Agent message (for example, the Agent asks a clarifying question through ASK_HUMAN), set reply_to to the exact Checkpoint sequence number carried in that Agent message. If this message is not a targeted reply, such as requesting the Agent to perform further in-depth analysis after analysis is complete, you can leave reply_to empty or set it to &quot;0&quot;.  </p>
         * <p>This field affects how the Agent decides to process the message. Incorrect values may lead to analysis results that do not meet expectations.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder replyTo(String replyTo) {
            this.putQueryParameter("ReplyTo", replyTo);
            this.replyTo = replyTo;
            return this;
        }

        /**
         * <p>The special configuration for the current session. For the same session, only the configuration included in the first SendMessage call takes effect.</p>
         */
        public Builder sessionConfig(SessionConfig sessionConfig) {
            String sessionConfigShrink = shrink(sessionConfig, "SessionConfig", "json");
            this.putQueryParameter("SessionConfig", sessionConfigShrink);
            this.sessionConfig = sessionConfig;
            return this;
        }

        /**
         * <p>The session ID. This is an optional field used for multi-turn sessions.</p>
         * <ul>
         * <li>You can start a session without specifying this field. The response includes the SessionID of the current session.</li>
         * <li>You can also manually create a session ID by calling the CreateDataAgentSession operation and include the ID when initiating a session.</li>
         * <li>For multi-turn conversations (such as follow-up questions or confirming execution plans), specify the SessionID returned by the previous SendChatMessage call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sess_***</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The configuration items that affect only the current task.</p>
         */
        public Builder taskConfig(TaskConfig taskConfig) {
            String taskConfigShrink = shrink(taskConfig, "TaskConfig", "json");
            this.putQueryParameter("TaskConfig", taskConfigShrink);
            this.taskConfig = taskConfig;
            return this;
        }

        /**
         * <p>The OSS bucket of the user. If this parameter is not specified, the analysis data is securely stored in built-in storage.</p>
         * 
         * <strong>example:</strong>
         * <p>my-bucket</p>
         */
        public Builder userOssBucket(String userOssBucket) {
            this.putQueryParameter("UserOssBucket", userOssBucket);
            this.userOssBucket = userOssBucket;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c1p71ne***baexrt3o</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SendChatMessageRequest build() {
            return new SendChatMessageRequest(this);
        } 

    } 

    /**
     * 
     * {@link SendChatMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatMessageRequest</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedColumns")
        private java.util.List<String> allowedColumns;

        @com.aliyun.core.annotation.NameInMap("DisallowedColumns")
        private java.util.List<String> disallowedColumns;

        @com.aliyun.core.annotation.NameInMap("RequiredRowFilter")
        private String requiredRowFilter;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Tables(Builder builder) {
            this.allowedColumns = builder.allowedColumns;
            this.disallowedColumns = builder.disallowedColumns;
            this.requiredRowFilter = builder.requiredRowFilter;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return allowedColumns
         */
        public java.util.List<String> getAllowedColumns() {
            return this.allowedColumns;
        }

        /**
         * @return disallowedColumns
         */
        public java.util.List<String> getDisallowedColumns() {
            return this.disallowedColumns;
        }

        /**
         * @return requiredRowFilter
         */
        public String getRequiredRowFilter() {
            return this.requiredRowFilter;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private java.util.List<String> allowedColumns; 
            private java.util.List<String> disallowedColumns; 
            private String requiredRowFilter; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(Tables model) {
                this.allowedColumns = model.allowedColumns;
                this.disallowedColumns = model.disallowedColumns;
                this.requiredRowFilter = model.requiredRowFilter;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The list of columns that are allowed for querying in the current table. If this field is left empty, all columns can be queried. If specified, SQL statements that exceed the allowed scope are blocked. For example, syntax such as SELECT * is blocked. To ensure DataAgent analysis effectiveness, avoid specifying columns beyond the allowed scope in the DataAgent prompts, knowledge, or instructions modules. Otherwise, unauthorized SQL statements may be generated and blocked, which reduces DataAgent analysis speed and effectiveness.</p>
             */
            public Builder allowedColumns(java.util.List<String> allowedColumns) {
                this.allowedColumns = allowedColumns;
                return this;
            }

            /**
             * <p>The list of columns that are not allowed for querying in the current table. If this field is left empty, all columns <strong>can be queried</strong>. If specified, SQL statements that exceed the allowed scope are blocked. For example, syntax such as SELECT * is blocked.  </p>
             * <p>If both the disallowed list and the allowed list are configured, the disallowed list takes higher priority. For example, if Table 1 has columns A, B, C, and D, and columns A and B are configured as not queryable while columns B and C are configured as queryable, the final result is that only column C is queryable.</p>
             * <p>To ensure DataAgent analysis effectiveness, avoid specifying columns beyond the allowed scope in the DataAgent prompts, knowledge, or instructions modules. Otherwise, unauthorized SQL statements may be generated and blocked, which reduces DataAgent analysis speed and effectiveness.</p>
             */
            public Builder disallowedColumns(java.util.List<String> disallowedColumns) {
                this.disallowedColumns = disallowedColumns;
                return this;
            }

            /**
             * <p>The required row filter condition for the current table. If this field is left empty, it is ignored. If specified, all SQL statements involving this table are validated to check whether they carry the filter field and whether the WHERE condition meets the constraints. SQL statements that do not meet the constraints are rejected. Ensure the validation condition format is correct.</p>
             * 
             * <strong>example:</strong>
             * <p>region = \&quot;east\&quot;</p>
             */
            public Builder requiredRowFilter(String requiredRowFilter) {
                this.requiredRowFilter = requiredRowFilter;
                return this;
            }

            /**
             * <p>The table name to which the permission constraint rule applies.</p>
             * 
             * <strong>example:</strong>
             * <p>sample_table</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendChatMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatMessageRequest</p>
     */
    public static class Permission extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<Tables> tables;

        private Permission(Builder builder) {
            this.tables = builder.tables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permission create() {
            return builder().build();
        }

        /**
         * @return tables
         */
        public java.util.List<Tables> getTables() {
            return this.tables;
        }

        public static final class Builder {
            private java.util.List<Tables> tables; 

            private Builder() {
            } 

            private Builder(Permission model) {
                this.tables = model.tables;
            } 

            /**
             * <p>The table-level permission constraints for querying the current data source. Each item in the list represents the permission constraints for a table.</p>
             */
            public Builder tables(java.util.List<Tables> tables) {
                this.tables = tables;
                return this;
            }

            public Permission build() {
                return new Permission(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendChatMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatMessageRequest</p>
     */
    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceType")
        private String dataSourceType;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DmsDatabaseId")
        private String dmsDatabaseId;

        @com.aliyun.core.annotation.NameInMap("DmsInstanceId")
        private String dmsInstanceId;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Permission")
        private Permission permission;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<String> tables;

        private DataSource(Builder builder) {
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceType = builder.dataSourceType;
            this.database = builder.database;
            this.dbName = builder.dbName;
            this.dmsDatabaseId = builder.dmsDatabaseId;
            this.dmsInstanceId = builder.dmsInstanceId;
            this.engine = builder.engine;
            this.fileId = builder.fileId;
            this.location = builder.location;
            this.permission = builder.permission;
            this.regionId = builder.regionId;
            this.tables = builder.tables;
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
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return dataSourceType
         */
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return dmsDatabaseId
         */
        public String getDmsDatabaseId() {
            return this.dmsDatabaseId;
        }

        /**
         * @return dmsInstanceId
         */
        public String getDmsInstanceId() {
            return this.dmsInstanceId;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return permission
         */
        public Permission getPermission() {
            return this.permission;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return tables
         */
        public java.util.List<String> getTables() {
            return this.tables;
        }

        public static final class Builder {
            private String dataSourceId; 
            private String dataSourceType; 
            private String database; 
            private String dbName; 
            private String dmsDatabaseId; 
            private String dmsInstanceId; 
            private String engine; 
            private String fileId; 
            private String location; 
            private Permission permission; 
            private String regionId; 
            private java.util.List<String> tables; 

            private Builder() {
            } 

            private Builder(DataSource model) {
                this.dataSourceId = model.dataSourceId;
                this.dataSourceType = model.dataSourceType;
                this.database = model.database;
                this.dbName = model.dbName;
                this.dmsDatabaseId = model.dmsDatabaseId;
                this.dmsInstanceId = model.dmsInstanceId;
                this.engine = model.engine;
                this.fileId = model.fileId;
                this.location = model.location;
                this.permission = model.permission;
                this.regionId = model.regionId;
                this.tables = model.tables;
            } 

            /**
             * <p>Deprecated. You do not need to specify this field.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>The data source type. Valid values: <code>[remote_data_center, database]</code>, indicating that the analysis is performed on a file or a database.</p>
             * 
             * <strong>example:</strong>
             * <p>remote_data_center</p>
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * <p>Deprecated. You do not need to specify this field.</p>
             * 
             * <strong>example:</strong>
             * <p>test_db</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The ID of the database in Data Management.</p>
             * 
             * <strong>example:</strong>
             * <p>23******</p>
             */
            public Builder dmsDatabaseId(String dmsDatabaseId) {
                this.dmsDatabaseId = dmsDatabaseId;
                return this;
            }

            /**
             * <p>The ID of the instance in Data Management.</p>
             * 
             * <strong>example:</strong>
             * <p>12******</p>
             */
            public Builder dmsInstanceId(String dmsInstanceId) {
                this.dmsInstanceId = dmsInstanceId;
                return this;
            }

            /**
             * <p>The database engine type.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>35****</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>Deprecated. You do not need to specify this field.</p>
             * 
             * <strong>example:</strong>
             * <p>localhost</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The permission constraints for querying the current data source. The permission constraint feature is available through a canary release. This field does not take effect for users who are not included in the canary release.</p>
             */
            public Builder permission(Permission permission) {
                this.permission = permission;
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
             * <p>The list of table names to analyze.</p>
             */
            public Builder tables(java.util.List<String> tables) {
                this.tables = tables;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendChatMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatMessageRequest</p>
     */
    public static class PermissionTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedColumns")
        private java.util.List<String> allowedColumns;

        @com.aliyun.core.annotation.NameInMap("DisallowedColumns")
        private java.util.List<String> disallowedColumns;

        @com.aliyun.core.annotation.NameInMap("RequiredRowFilter")
        private String requiredRowFilter;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private PermissionTables(Builder builder) {
            this.allowedColumns = builder.allowedColumns;
            this.disallowedColumns = builder.disallowedColumns;
            this.requiredRowFilter = builder.requiredRowFilter;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PermissionTables create() {
            return builder().build();
        }

        /**
         * @return allowedColumns
         */
        public java.util.List<String> getAllowedColumns() {
            return this.allowedColumns;
        }

        /**
         * @return disallowedColumns
         */
        public java.util.List<String> getDisallowedColumns() {
            return this.disallowedColumns;
        }

        /**
         * @return requiredRowFilter
         */
        public String getRequiredRowFilter() {
            return this.requiredRowFilter;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private java.util.List<String> allowedColumns; 
            private java.util.List<String> disallowedColumns; 
            private String requiredRowFilter; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(PermissionTables model) {
                this.allowedColumns = model.allowedColumns;
                this.disallowedColumns = model.disallowedColumns;
                this.requiredRowFilter = model.requiredRowFilter;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The list of columns that are allowed for querying in the current table. If this field is left empty, all columns can be queried. If specified, SQL statements that exceed the allowed scope are blocked. For example, syntax such as SELECT * is blocked. To ensure DataAgent analysis effectiveness, avoid specifying columns beyond the allowed scope in the DataAgent prompts, knowledge, or instructions modules. Otherwise, unauthorized SQL statements may be generated and blocked, which reduces DataAgent analysis speed and effectiveness.</p>
             */
            public Builder allowedColumns(java.util.List<String> allowedColumns) {
                this.allowedColumns = allowedColumns;
                return this;
            }

            /**
             * <p>The list of columns that are not allowed for querying in the current table. If this field is left empty, all columns <strong>can be queried</strong>. If specified, SQL statements that exceed the allowed scope are blocked. For example, syntax such as SELECT * is blocked.  </p>
             * <p>If both the disallowed list and the allowed list are configured, the disallowed list takes higher priority. For example, if Table 1 has columns A, B, C, and D, and columns A and B are configured as not queryable while columns B and C are configured as queryable, the final result is that only column C is queryable.</p>
             * <p>To ensure DataAgent analysis effectiveness, avoid specifying columns beyond the allowed scope in the DataAgent prompts, knowledge, or instructions modules. Otherwise, unauthorized SQL statements may be generated and blocked, which reduces DataAgent analysis speed and effectiveness.</p>
             */
            public Builder disallowedColumns(java.util.List<String> disallowedColumns) {
                this.disallowedColumns = disallowedColumns;
                return this;
            }

            /**
             * <p>The required row filter condition for the current table. If this field is left empty, it is ignored. If specified, all SQL statements involving this table are validated to check whether they carry the filter field and whether the WHERE condition meets the constraints. SQL statements that do not meet the constraints are rejected. Ensure the validation condition format is correct.</p>
             * 
             * <strong>example:</strong>
             * <p>region = \&quot;east\&quot;</p>
             */
            public Builder requiredRowFilter(String requiredRowFilter) {
                this.requiredRowFilter = requiredRowFilter;
                return this;
            }

            /**
             * <p>The table name to which the permission constraint rule applies.</p>
             * 
             * <strong>example:</strong>
             * <p>sample_table</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public PermissionTables build() {
                return new PermissionTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendChatMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatMessageRequest</p>
     */
    public static class DataSourcesPermission extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<PermissionTables> tables;

        private DataSourcesPermission(Builder builder) {
            this.tables = builder.tables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourcesPermission create() {
            return builder().build();
        }

        /**
         * @return tables
         */
        public java.util.List<PermissionTables> getTables() {
            return this.tables;
        }

        public static final class Builder {
            private java.util.List<PermissionTables> tables; 

            private Builder() {
            } 

            private Builder(DataSourcesPermission model) {
                this.tables = model.tables;
            } 

            /**
             * <p>The table-level permission constraints for querying the current data source. Each item in the list represents the permission constraints for a table.</p>
             */
            public Builder tables(java.util.List<PermissionTables> tables) {
                this.tables = tables;
                return this;
            }

            public DataSourcesPermission build() {
                return new DataSourcesPermission(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendChatMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatMessageRequest</p>
     */
    public static class DataSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceType")
        private String dataSourceType;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DmsDatabaseId")
        private String dmsDatabaseId;

        @com.aliyun.core.annotation.NameInMap("DmsInstanceId")
        private String dmsInstanceId;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Permission")
        private DataSourcesPermission permission;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<String> tables;

        private DataSources(Builder builder) {
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceType = builder.dataSourceType;
            this.database = builder.database;
            this.dbName = builder.dbName;
            this.dmsDatabaseId = builder.dmsDatabaseId;
            this.dmsInstanceId = builder.dmsInstanceId;
            this.engine = builder.engine;
            this.fileId = builder.fileId;
            this.location = builder.location;
            this.permission = builder.permission;
            this.regionId = builder.regionId;
            this.tables = builder.tables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSources create() {
            return builder().build();
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return dataSourceType
         */
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return dmsDatabaseId
         */
        public String getDmsDatabaseId() {
            return this.dmsDatabaseId;
        }

        /**
         * @return dmsInstanceId
         */
        public String getDmsInstanceId() {
            return this.dmsInstanceId;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return permission
         */
        public DataSourcesPermission getPermission() {
            return this.permission;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return tables
         */
        public java.util.List<String> getTables() {
            return this.tables;
        }

        public static final class Builder {
            private String dataSourceId; 
            private String dataSourceType; 
            private String database; 
            private String dbName; 
            private String dmsDatabaseId; 
            private String dmsInstanceId; 
            private String engine; 
            private String fileId; 
            private String location; 
            private DataSourcesPermission permission; 
            private String regionId; 
            private java.util.List<String> tables; 

            private Builder() {
            } 

            private Builder(DataSources model) {
                this.dataSourceId = model.dataSourceId;
                this.dataSourceType = model.dataSourceType;
                this.database = model.database;
                this.dbName = model.dbName;
                this.dmsDatabaseId = model.dmsDatabaseId;
                this.dmsInstanceId = model.dmsInstanceId;
                this.engine = model.engine;
                this.fileId = model.fileId;
                this.location = model.location;
                this.permission = model.permission;
                this.regionId = model.regionId;
                this.tables = model.tables;
            } 

            /**
             * <p>Deprecated. You do not need to specify this field.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>The data source type. Valid values: remote_data_center, database. These values indicate that the analysis is performed on a file or a database.</p>
             * 
             * <strong>example:</strong>
             * <p>remote_data_center</p>
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * <p>Deprecated. You do not need to specify this field.</p>
             * 
             * <strong>example:</strong>
             * <p>test_db</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>mydatabase</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The ID of the database in Data Management.</p>
             * 
             * <strong>example:</strong>
             * <p>123****</p>
             */
            public Builder dmsDatabaseId(String dmsDatabaseId) {
                this.dmsDatabaseId = dmsDatabaseId;
                return this;
            }

            /**
             * <p>The ID of the instance in Data Management.</p>
             * 
             * <strong>example:</strong>
             * <p>248*****</p>
             */
            public Builder dmsInstanceId(String dmsInstanceId) {
                this.dmsInstanceId = dmsInstanceId;
                return this;
            }

            /**
             * <p>The database engine type.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>f-4w*******</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>Deprecated. You do not need to specify this field.</p>
             * 
             * <strong>example:</strong>
             * <p>localhost</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The permission constraints for querying the current data source. The permission constraint feature is available through a canary release. This field does not take effect for users who are not included in the canary release.</p>
             */
            public Builder permission(DataSourcesPermission permission) {
                this.permission = permission;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The list of table names to analyze.</p>
             */
            public Builder tables(java.util.List<String> tables) {
                this.tables = tables;
                return this;
            }

            public DataSources build() {
                return new DataSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendChatMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatMessageRequest</p>
     */
    public static class PermissionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultAction")
        private String defaultAction;

        private PermissionConfig(Builder builder) {
            this.defaultAction = builder.defaultAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PermissionConfig create() {
            return builder().build();
        }

        /**
         * @return defaultAction
         */
        public String getDefaultAction() {
            return this.defaultAction;
        }

        public static final class Builder {
            private String defaultAction; 

            private Builder() {
            } 

            private Builder(PermissionConfig model) {
                this.defaultAction = model.defaultAction;
            } 

            /**
             * <p>The default action for table-level permissions. This parameter controls whether tables that are not configured in DataSources.[item].Permission can be queried. Valid values: allow, deny.</p>
             * <ul>
             * <li><p>allow (default): works in blacklist mode. By default, all tables can be queried, and the actual permissions are subject to the permissions configured on the Data Management side. Row-level and column-level permissions are enforced only when you configure <strong>row-level and column-level</strong> permissions in DataSources.[item].Permission.</p>
             * </li>
             * <li><p>deny (must be manually specified): works in whitelist mode. By default, no tables can be queried. A table can be queried only when you configure permissions for it in DataSources.[item].Permission. You can grant full access to a table by not configuring any row-level or column-level restrictions.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>allow</p>
             */
            public Builder defaultAction(String defaultAction) {
                this.defaultAction = defaultAction;
                return this;
            }

            public PermissionConfig build() {
                return new PermissionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendChatMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatMessageRequest</p>
     */
    public static class SessionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomAgentId")
        private String customAgentId;

        @com.aliyun.core.annotation.NameInMap("CustomAgentStage")
        private String customAgentStage;

        @com.aliyun.core.annotation.NameInMap("EnableSearch")
        private Boolean enableSearch;

        @com.aliyun.core.annotation.NameInMap("KbUuidList")
        private java.util.List<String> kbUuidList;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("McpServerIds")
        private java.util.List<String> mcpServerIds;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("PermissionConfig")
        private PermissionConfig permissionConfig;

        @com.aliyun.core.annotation.NameInMap("PlanMode")
        private String planMode;

        @com.aliyun.core.annotation.NameInMap("ReportWaterMark")
        private String reportWaterMark;

        @com.aliyun.core.annotation.NameInMap("SkipAskHuman")
        private Boolean skipAskHuman;

        @com.aliyun.core.annotation.NameInMap("SkipPlan")
        private Boolean skipPlan;

        @com.aliyun.core.annotation.NameInMap("SkipSqlConfirm")
        private Boolean skipSqlConfirm;

        @com.aliyun.core.annotation.NameInMap("SkipWebReportConfirm")
        private Boolean skipWebReportConfirm;

        @com.aliyun.core.annotation.NameInMap("UserSpecifiedSkillList")
        private java.util.List<String> userSpecifiedSkillList;

        private SessionConfig(Builder builder) {
            this.customAgentId = builder.customAgentId;
            this.customAgentStage = builder.customAgentStage;
            this.enableSearch = builder.enableSearch;
            this.kbUuidList = builder.kbUuidList;
            this.language = builder.language;
            this.mcpServerIds = builder.mcpServerIds;
            this.mode = builder.mode;
            this.permissionConfig = builder.permissionConfig;
            this.planMode = builder.planMode;
            this.reportWaterMark = builder.reportWaterMark;
            this.skipAskHuman = builder.skipAskHuman;
            this.skipPlan = builder.skipPlan;
            this.skipSqlConfirm = builder.skipSqlConfirm;
            this.skipWebReportConfirm = builder.skipWebReportConfirm;
            this.userSpecifiedSkillList = builder.userSpecifiedSkillList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionConfig create() {
            return builder().build();
        }

        /**
         * @return customAgentId
         */
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        /**
         * @return customAgentStage
         */
        public String getCustomAgentStage() {
            return this.customAgentStage;
        }

        /**
         * @return enableSearch
         */
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        /**
         * @return kbUuidList
         */
        public java.util.List<String> getKbUuidList() {
            return this.kbUuidList;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return mcpServerIds
         */
        public java.util.List<String> getMcpServerIds() {
            return this.mcpServerIds;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return permissionConfig
         */
        public PermissionConfig getPermissionConfig() {
            return this.permissionConfig;
        }

        /**
         * @return planMode
         */
        public String getPlanMode() {
            return this.planMode;
        }

        /**
         * @return reportWaterMark
         */
        public String getReportWaterMark() {
            return this.reportWaterMark;
        }

        /**
         * @return skipAskHuman
         */
        public Boolean getSkipAskHuman() {
            return this.skipAskHuman;
        }

        /**
         * @return skipPlan
         */
        public Boolean getSkipPlan() {
            return this.skipPlan;
        }

        /**
         * @return skipSqlConfirm
         */
        public Boolean getSkipSqlConfirm() {
            return this.skipSqlConfirm;
        }

        /**
         * @return skipWebReportConfirm
         */
        public Boolean getSkipWebReportConfirm() {
            return this.skipWebReportConfirm;
        }

        /**
         * @return userSpecifiedSkillList
         */
        public java.util.List<String> getUserSpecifiedSkillList() {
            return this.userSpecifiedSkillList;
        }

        public static final class Builder {
            private String customAgentId; 
            private String customAgentStage; 
            private Boolean enableSearch; 
            private java.util.List<String> kbUuidList; 
            private String language; 
            private java.util.List<String> mcpServerIds; 
            private String mode; 
            private PermissionConfig permissionConfig; 
            private String planMode; 
            private String reportWaterMark; 
            private Boolean skipAskHuman; 
            private Boolean skipPlan; 
            private Boolean skipSqlConfirm; 
            private Boolean skipWebReportConfirm; 
            private java.util.List<String> userSpecifiedSkillList; 

            private Builder() {
            } 

            private Builder(SessionConfig model) {
                this.customAgentId = model.customAgentId;
                this.customAgentStage = model.customAgentStage;
                this.enableSearch = model.enableSearch;
                this.kbUuidList = model.kbUuidList;
                this.language = model.language;
                this.mcpServerIds = model.mcpServerIds;
                this.mode = model.mode;
                this.permissionConfig = model.permissionConfig;
                this.planMode = model.planMode;
                this.reportWaterMark = model.reportWaterMark;
                this.skipAskHuman = model.skipAskHuman;
                this.skipPlan = model.skipPlan;
                this.skipSqlConfirm = model.skipSqlConfirm;
                this.skipWebReportConfirm = model.skipWebReportConfirm;
                this.userSpecifiedSkillList = model.userSpecifiedSkillList;
            } 

            /**
             * <p>The custom agent ID. A custom agent is an entity used to customize the analysis process. You can create one in the DataAgent console or by calling the CreateCustomAgent operation. The custom agent ID is a string that starts with <code>ca-</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-asfkjhqwe***aesrfqa</p>
             */
            public Builder customAgentId(String customAgentId) {
                this.customAgentId = customAgentId;
                return this;
            }

            /**
             * <p>The stage of the custom agent.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder customAgentStage(String customAgentStage) {
                this.customAgentStage = customAgentStage;
                return this;
            }

            /**
             * <p>Specifies whether to enable web search.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableSearch(Boolean enableSearch) {
                this.enableSearch = enableSearch;
                return this;
            }

            /**
             * <p>The list of knowledge base IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>dasd***cc211</p>
             */
            public Builder kbUuidList(java.util.List<String> kbUuidList) {
                this.kbUuidList = kbUuidList;
                return this;
            }

            /**
             * <p>Currently only Chinese and English are supported. The default value is Chinese. Only uppercase values are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>ENGLISH</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The MCP server IDs in the session configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>2q1tu90**********6uttu2nw</p>
             */
            public Builder mcpServerIds(java.util.List<String> mcpServerIds) {
                this.mcpServerIds = mcpServerIds;
                return this;
            }

            /**
             * <p>The mode. Valid values:</p>
             * <ul>
             * <li><strong>ASK_DATA</strong>: data query mode.</li>
             * <li><strong>ANALYSIS</strong>: analysis mode.</li>
             * <li><strong>INSIGHT</strong>: insight mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ANALYSIS</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The session level data permission settings. If this parameter is set multiple times across multiple turns within the same session, the last setting takes effect.</p>
             */
            public Builder permissionConfig(PermissionConfig permissionConfig) {
                this.permissionConfig = permissionConfig;
                return this;
            }

            /**
             * <p>Specifies whether to enable the plan. Valid values: disable, enable, force. Default value: enable.</p>
             * 
             * <strong>example:</strong>
             * <p>disable</p>
             */
            public Builder planMode(String planMode) {
                this.planMode = planMode;
                return this;
            }

            /**
             * <p>The text of up to 64 characters that is used as a watermark in the generated PDF report.</p>
             * 
             * <strong>example:</strong>
             * <p>sample-watermark</p>
             */
            public Builder reportWaterMark(String reportWaterMark) {
                this.reportWaterMark = reportWaterMark;
                return this;
            }

            /**
             * <p>Specifies whether to disable user inquiries during the process.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder skipAskHuman(Boolean skipAskHuman) {
                this.skipAskHuman = skipAskHuman;
                return this;
            }

            /**
             * <p>Specifies whether to skip the plan confirmation step.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder skipPlan(Boolean skipPlan) {
                this.skipPlan = skipPlan;
                return this;
            }

            /**
             * <p>Specifies whether to skip all SQL confirmations.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder skipSqlConfirm(Boolean skipSqlConfirm) {
                this.skipSqlConfirm = skipSqlConfirm;
                return this;
            }

            /**
             * <p>Specifies whether to skip the web report generation confirmation.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder skipWebReportConfirm(Boolean skipWebReportConfirm) {
                this.skipWebReportConfirm = skipWebReportConfirm;
                return this;
            }

            /**
             * <p>The list of user-specified skills.</p>
             */
            public Builder userSpecifiedSkillList(java.util.List<String> userSpecifiedSkillList) {
                this.userSpecifiedSkillList = userSpecifiedSkillList;
                return this;
            }

            public SessionConfig build() {
                return new SessionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendChatMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatMessageRequest</p>
     */
    public static class ReportConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReportPrompt")
        private String reportPrompt;

        @com.aliyun.core.annotation.NameInMap("ReportTheme")
        private String reportTheme;

        @com.aliyun.core.annotation.NameInMap("ReportType")
        private String reportType;

        private ReportConfig(Builder builder) {
            this.reportPrompt = builder.reportPrompt;
            this.reportTheme = builder.reportTheme;
            this.reportType = builder.reportType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportConfig create() {
            return builder().build();
        }

        /**
         * @return reportPrompt
         */
        public String getReportPrompt() {
            return this.reportPrompt;
        }

        /**
         * @return reportTheme
         */
        public String getReportTheme() {
            return this.reportTheme;
        }

        /**
         * @return reportType
         */
        public String getReportType() {
            return this.reportType;
        }

        public static final class Builder {
            private String reportPrompt; 
            private String reportTheme; 
            private String reportType; 

            private Builder() {
            } 

            private Builder(ReportConfig model) {
                this.reportPrompt = model.reportPrompt;
                this.reportTheme = model.reportTheme;
                this.reportType = model.reportType;
            } 

            /**
             * <p>The prompt that the report must follow.</p>
             * 
             * <strong>example:</strong>
             * <p>generate a report</p>
             */
            public Builder reportPrompt(String reportPrompt) {
                this.reportPrompt = reportPrompt;
                return this;
            }

            /**
             * <p>The report theme. Valid values: default, journal, legacy, and neobrutalism.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder reportTheme(String reportTheme) {
                this.reportTheme = reportTheme;
                return this;
            }

            /**
             * <p>The service type. Valid values: TextReport and WebReport, which indicate that the task generates a text report or a web report. Currently, only WebReport is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>WebReport</p>
             */
            public Builder reportType(String reportType) {
                this.reportType = reportType;
                return this;
            }

            public ReportConfig build() {
                return new ReportConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendChatMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatMessageRequest</p>
     */
    public static class TaskConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReportConfig")
        private ReportConfig reportConfig;

        private TaskConfig(Builder builder) {
            this.reportConfig = builder.reportConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskConfig create() {
            return builder().build();
        }

        /**
         * @return reportConfig
         */
        public ReportConfig getReportConfig() {
            return this.reportConfig;
        }

        public static final class Builder {
            private ReportConfig reportConfig; 

            private Builder() {
            } 

            private Builder(TaskConfig model) {
                this.reportConfig = model.reportConfig;
            } 

            /**
             * <p>The configuration of the report rule. Only when MesageType is set to REPORT, a report task is executed based on this configuration.</p>
             */
            public Builder reportConfig(ReportConfig reportConfig) {
                this.reportConfig = reportConfig;
                return this;
            }

            public TaskConfig build() {
                return new TaskConfig(this);
            } 

        } 

    }
}
