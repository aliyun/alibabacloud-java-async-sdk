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
 * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataAgentSessionResponseBody</p>
 */
public class DescribeDataAgentSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDataAgentSessionResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataAgentSessionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeDataAgentSessionResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>18****-*****-*******7A3122F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDataAgentSessionResponseBody build() {
            return new DescribeDataAgentSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class Artifacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ReceiveTime")
        private String receiveTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Artifacts(Builder builder) {
            this.description = builder.description;
            this.finishTime = builder.finishTime;
            this.id = builder.id;
            this.name = builder.name;
            this.receiveTime = builder.receiveTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Artifacts create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return receiveTime
         */
        public String getReceiveTime() {
            return this.receiveTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String finishTime; 
            private String id; 
            private String name; 
            private String receiveTime; 
            private String startTime; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Artifacts model) {
                this.description = model.description;
                this.finishTime = model.finishTime;
                this.id = model.id;
                this.name = model.name;
                this.receiveTime = model.receiveTime;
                this.startTime = model.startTime;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ReceiveTime.
             */
            public Builder receiveTime(String receiveTime) {
                this.receiveTime = receiveTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Artifacts build() {
                return new Artifacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class ChatHistoryLocations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ChatHistoryLocations(Builder builder) {
            this.key = builder.key;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChatHistoryLocations create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String key; 
            private String url; 

            private Builder() {
            } 

            private Builder(ChatHistoryLocations model) {
                this.key = model.key;
                this.url = model.url;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ChatHistoryLocations build() {
                return new ChatHistoryLocations(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class DataSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        private DataSources(Builder builder) {
            this.category = builder.category;
            this.detail = builder.detail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSources create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        public static final class Builder {
            private String category; 
            private String detail; 

            private Builder() {
            } 

            private Builder(DataSources model) {
                this.category = model.category;
                this.detail = model.detail;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            public DataSources build() {
                return new DataSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class RecallResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RecallResults(Builder builder) {
            this.content = builder.content;
            this.score = builder.score;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallResults create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String content; 
            private Double score; 
            private String type; 

            private Builder() {
            } 

            private Builder(RecallResults model) {
                this.content = model.content;
                this.score = model.score;
                this.type = model.type;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RecallResults build() {
                return new RecallResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class SessionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomAgentId")
        private String customAgentId;

        @com.aliyun.core.annotation.NameInMap("CustomAgentStage")
        private String customAgentStage;

        @com.aliyun.core.annotation.NameInMap("EnableSearch")
        private Boolean enableSearch;

        @com.aliyun.core.annotation.NameInMap("EncryptKey")
        private String encryptKey;

        @com.aliyun.core.annotation.NameInMap("EncryptType")
        private String encryptType;

        @com.aliyun.core.annotation.NameInMap("KbUuidList")
        private java.util.List<String> kbUuidList;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("McpServerIds")
        private java.util.List<String> mcpServerIds;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("ReportPageWidth")
        private Long reportPageWidth;

        @com.aliyun.core.annotation.NameInMap("ReportWaterMark")
        private String reportWaterMark;

        @com.aliyun.core.annotation.NameInMap("UserOssBucket")
        private String userOssBucket;

        private SessionConfig(Builder builder) {
            this.customAgentId = builder.customAgentId;
            this.customAgentStage = builder.customAgentStage;
            this.enableSearch = builder.enableSearch;
            this.encryptKey = builder.encryptKey;
            this.encryptType = builder.encryptType;
            this.kbUuidList = builder.kbUuidList;
            this.language = builder.language;
            this.mcpServerIds = builder.mcpServerIds;
            this.mode = builder.mode;
            this.reportPageWidth = builder.reportPageWidth;
            this.reportWaterMark = builder.reportWaterMark;
            this.userOssBucket = builder.userOssBucket;
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
         * @return encryptKey
         */
        public String getEncryptKey() {
            return this.encryptKey;
        }

        /**
         * @return encryptType
         */
        public String getEncryptType() {
            return this.encryptType;
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
         * @return reportPageWidth
         */
        public Long getReportPageWidth() {
            return this.reportPageWidth;
        }

        /**
         * @return reportWaterMark
         */
        public String getReportWaterMark() {
            return this.reportWaterMark;
        }

        /**
         * @return userOssBucket
         */
        public String getUserOssBucket() {
            return this.userOssBucket;
        }

        public static final class Builder {
            private String customAgentId; 
            private String customAgentStage; 
            private Boolean enableSearch; 
            private String encryptKey; 
            private String encryptType; 
            private java.util.List<String> kbUuidList; 
            private String language; 
            private java.util.List<String> mcpServerIds; 
            private String mode; 
            private Long reportPageWidth; 
            private String reportWaterMark; 
            private String userOssBucket; 

            private Builder() {
            } 

            private Builder(SessionConfig model) {
                this.customAgentId = model.customAgentId;
                this.customAgentStage = model.customAgentStage;
                this.enableSearch = model.enableSearch;
                this.encryptKey = model.encryptKey;
                this.encryptType = model.encryptType;
                this.kbUuidList = model.kbUuidList;
                this.language = model.language;
                this.mcpServerIds = model.mcpServerIds;
                this.mode = model.mode;
                this.reportPageWidth = model.reportPageWidth;
                this.reportWaterMark = model.reportWaterMark;
                this.userOssBucket = model.userOssBucket;
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
             * EnableSearch.
             */
            public Builder enableSearch(Boolean enableSearch) {
                this.enableSearch = enableSearch;
                return this;
            }

            /**
             * EncryptKey.
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * EncryptType.
             */
            public Builder encryptType(String encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * KbUuidList.
             */
            public Builder kbUuidList(java.util.List<String> kbUuidList) {
                this.kbUuidList = kbUuidList;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * McpServerIds.
             */
            public Builder mcpServerIds(java.util.List<String> mcpServerIds) {
                this.mcpServerIds = mcpServerIds;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * ReportPageWidth.
             */
            public Builder reportPageWidth(Long reportPageWidth) {
                this.reportPageWidth = reportPageWidth;
                return this;
            }

            /**
             * ReportWaterMark.
             */
            public Builder reportWaterMark(String reportWaterMark) {
                this.reportWaterMark = reportWaterMark;
                return this;
            }

            /**
             * UserOssBucket.
             */
            public Builder userOssBucket(String userOssBucket) {
                this.userOssBucket = userOssBucket;
                return this;
            }

            public SessionConfig build() {
                return new SessionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentStatus")
        private String agentStatus;

        @com.aliyun.core.annotation.NameInMap("Artifacts")
        private java.util.List<Artifacts> artifacts;

        @com.aliyun.core.annotation.NameInMap("ChatHistoryLocations")
        private java.util.List<ChatHistoryLocations> chatHistoryLocations;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataSources")
        private java.util.List<DataSources> dataSources;

        @com.aliyun.core.annotation.NameInMap("FavoriteInWorkspace")
        private String favoriteInWorkspace;

        @com.aliyun.core.annotation.NameInMap("File")
        private String file;

        @com.aliyun.core.annotation.NameInMap("RecallResults")
        private java.util.List<RecallResults> recallResults;

        @com.aliyun.core.annotation.NameInMap("Saved")
        private Boolean saved;

        @com.aliyun.core.annotation.NameInMap("SessionConfig")
        private SessionConfig sessionConfig;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("SessionStatus")
        private String sessionStatus;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.agentStatus = builder.agentStatus;
            this.artifacts = builder.artifacts;
            this.chatHistoryLocations = builder.chatHistoryLocations;
            this.createTime = builder.createTime;
            this.dataSources = builder.dataSources;
            this.favoriteInWorkspace = builder.favoriteInWorkspace;
            this.file = builder.file;
            this.recallResults = builder.recallResults;
            this.saved = builder.saved;
            this.sessionConfig = builder.sessionConfig;
            this.sessionId = builder.sessionId;
            this.sessionStatus = builder.sessionStatus;
            this.title = builder.title;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentStatus
         */
        public String getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return artifacts
         */
        public java.util.List<Artifacts> getArtifacts() {
            return this.artifacts;
        }

        /**
         * @return chatHistoryLocations
         */
        public java.util.List<ChatHistoryLocations> getChatHistoryLocations() {
            return this.chatHistoryLocations;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSources
         */
        public java.util.List<DataSources> getDataSources() {
            return this.dataSources;
        }

        /**
         * @return favoriteInWorkspace
         */
        public String getFavoriteInWorkspace() {
            return this.favoriteInWorkspace;
        }

        /**
         * @return file
         */
        public String getFile() {
            return this.file;
        }

        /**
         * @return recallResults
         */
        public java.util.List<RecallResults> getRecallResults() {
            return this.recallResults;
        }

        /**
         * @return saved
         */
        public Boolean getSaved() {
            return this.saved;
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
         * @return sessionStatus
         */
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String agentId; 
            private String agentStatus; 
            private java.util.List<Artifacts> artifacts; 
            private java.util.List<ChatHistoryLocations> chatHistoryLocations; 
            private Long createTime; 
            private java.util.List<DataSources> dataSources; 
            private String favoriteInWorkspace; 
            private String file; 
            private java.util.List<RecallResults> recallResults; 
            private Boolean saved; 
            private SessionConfig sessionConfig; 
            private String sessionId; 
            private String sessionStatus; 
            private String title; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentId = model.agentId;
                this.agentStatus = model.agentStatus;
                this.artifacts = model.artifacts;
                this.chatHistoryLocations = model.chatHistoryLocations;
                this.createTime = model.createTime;
                this.dataSources = model.dataSources;
                this.favoriteInWorkspace = model.favoriteInWorkspace;
                this.file = model.file;
                this.recallResults = model.recallResults;
                this.saved = model.saved;
                this.sessionConfig = model.sessionConfig;
                this.sessionId = model.sessionId;
                this.sessionStatus = model.sessionStatus;
                this.title = model.title;
                this.userId = model.userId;
            } 

            /**
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * AgentStatus.
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * Artifacts.
             */
            public Builder artifacts(java.util.List<Artifacts> artifacts) {
                this.artifacts = artifacts;
                return this;
            }

            /**
             * ChatHistoryLocations.
             */
            public Builder chatHistoryLocations(java.util.List<ChatHistoryLocations> chatHistoryLocations) {
                this.chatHistoryLocations = chatHistoryLocations;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataSources.
             */
            public Builder dataSources(java.util.List<DataSources> dataSources) {
                this.dataSources = dataSources;
                return this;
            }

            /**
             * FavoriteInWorkspace.
             */
            public Builder favoriteInWorkspace(String favoriteInWorkspace) {
                this.favoriteInWorkspace = favoriteInWorkspace;
                return this;
            }

            /**
             * File.
             */
            public Builder file(String file) {
                this.file = file;
                return this;
            }

            /**
             * RecallResults.
             */
            public Builder recallResults(java.util.List<RecallResults> recallResults) {
                this.recallResults = recallResults;
                return this;
            }

            /**
             * Saved.
             */
            public Builder saved(Boolean saved) {
                this.saved = saved;
                return this;
            }

            /**
             * SessionConfig.
             */
            public Builder sessionConfig(SessionConfig sessionConfig) {
                this.sessionConfig = sessionConfig;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * SessionStatus.
             */
            public Builder sessionStatus(String sessionStatus) {
                this.sessionStatus = sessionStatus;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
