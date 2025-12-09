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
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSource")
    private DataSource dataSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageType")
    private String messageType;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    private SendChatMessageRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.DMSUnit = builder.DMSUnit;
        this.dataSource = builder.dataSource;
        this.message = builder.message;
        this.messageType = builder.messageType;
        this.question = builder.question;
        this.quotedMessage = builder.quotedMessage;
        this.replyTo = builder.replyTo;
        this.sessionConfig = builder.sessionConfig;
        this.sessionId = builder.sessionId;
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

    public static final class Builder extends Request.Builder<SendChatMessageRequest, Builder> {
        private String agentId; 
        private String DMSUnit; 
        private DataSource dataSource; 
        private String message; 
        private String messageType; 
        private String question; 
        private String quotedMessage; 
        private String replyTo; 
        private SessionConfig sessionConfig; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(SendChatMessageRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.DMSUnit = request.DMSUnit;
            this.dataSource = request.dataSource;
            this.message = request.message;
            this.messageType = request.messageType;
            this.question = request.question;
            this.quotedMessage = request.quotedMessage;
            this.replyTo = request.replyTo;
            this.sessionConfig = request.sessionConfig;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_12345</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * DMSUnit.
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * DataSource.
         */
        public Builder dataSource(DataSource dataSource) {
            String dataSourceShrink = shrink(dataSource, "DataSource", "json");
            this.putQueryParameter("DataSource", dataSourceShrink);
            this.dataSource = dataSource;
            return this;
        }

        /**
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
         * MessageType.
         */
        public Builder messageType(String messageType) {
            this.putQueryParameter("MessageType", messageType);
            this.messageType = messageType;
            return this;
        }

        /**
         * Question.
         */
        public Builder question(String question) {
            this.putQueryParameter("Question", question);
            this.question = question;
            return this;
        }

        /**
         * QuotedMessage.
         */
        public Builder quotedMessage(String quotedMessage) {
            this.putQueryParameter("QuotedMessage", quotedMessage);
            this.quotedMessage = quotedMessage;
            return this;
        }

        /**
         * ReplyTo.
         */
        public Builder replyTo(String replyTo) {
            this.putQueryParameter("ReplyTo", replyTo);
            this.replyTo = replyTo;
            return this;
        }

        /**
         * SessionConfig.
         */
        public Builder sessionConfig(SessionConfig sessionConfig) {
            String sessionConfigShrink = shrink(sessionConfig, "SessionConfig", "json");
            this.putQueryParameter("SessionConfig", sessionConfigShrink);
            this.sessionConfig = sessionConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sess_12345</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
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
                this.regionId = model.regionId;
                this.tables = model.tables;
            } 

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * DataSourceType.
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * Database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * DmsDatabaseId.
             */
            public Builder dmsDatabaseId(String dmsDatabaseId) {
                this.dmsDatabaseId = dmsDatabaseId;
                return this;
            }

            /**
             * DmsInstanceId.
             */
            public Builder dmsInstanceId(String dmsInstanceId) {
                this.dmsInstanceId = dmsInstanceId;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
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
             * Tables.
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
    public static class SessionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomAgentId")
        private String customAgentId;

        @com.aliyun.core.annotation.NameInMap("CustomAgentStage")
        private String customAgentStage;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        private SessionConfig(Builder builder) {
            this.customAgentId = builder.customAgentId;
            this.customAgentStage = builder.customAgentStage;
            this.language = builder.language;
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
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        public static final class Builder {
            private String customAgentId; 
            private String customAgentStage; 
            private String language; 

            private Builder() {
            } 

            private Builder(SessionConfig model) {
                this.customAgentId = model.customAgentId;
                this.customAgentStage = model.customAgentStage;
                this.language = model.language;
            } 

            /**
             * CustomAgentId.
             */
            public Builder customAgentId(String customAgentId) {
                this.customAgentId = customAgentId;
                return this;
            }

            /**
             * CustomAgentStage.
             */
            public Builder customAgentStage(String customAgentStage) {
                this.customAgentStage = customAgentStage;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            public SessionConfig build() {
                return new SessionConfig(this);
            } 

        } 

    }
}
