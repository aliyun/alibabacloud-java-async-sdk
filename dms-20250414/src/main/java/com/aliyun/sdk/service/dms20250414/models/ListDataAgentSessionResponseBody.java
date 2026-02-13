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
 * {@link ListDataAgentSessionResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataAgentSessionResponseBody</p>
 */
public class ListDataAgentSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private ListDataAgentSessionResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAgentSessionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 
        private Integer totalPages; 

        private Builder() {
        } 

        private Builder(ListDataAgentSessionResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
            this.totalPages = model.totalPages;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E0D21075-CD3E-4D98-8264-****</p>
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

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public ListDataAgentSessionResponseBody build() {
            return new ListDataAgentSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataAgentSessionResponseBody</p>
     */
    public static class SessionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomAgentId")
        private String customAgentId;

        @com.aliyun.core.annotation.NameInMap("CustomAgentStage")
        private String customAgentStage;

        @com.aliyun.core.annotation.NameInMap("EnableSearch")
        private Boolean enableSearch;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("UserOssBucket")
        private String userOssBucket;

        private SessionConfig(Builder builder) {
            this.customAgentId = builder.customAgentId;
            this.customAgentStage = builder.customAgentStage;
            this.enableSearch = builder.enableSearch;
            this.language = builder.language;
            this.mode = builder.mode;
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
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
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
            private String language; 
            private String mode; 
            private String userOssBucket; 

            private Builder() {
            } 

            private Builder(SessionConfig model) {
                this.customAgentId = model.customAgentId;
                this.customAgentStage = model.customAgentStage;
                this.enableSearch = model.enableSearch;
                this.language = model.language;
                this.mode = model.mode;
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
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
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
     * {@link ListDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataAgentSessionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentStatus")
        private String agentStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("FavoriteInWorkspace")
        private Boolean favoriteInWorkspace;

        @com.aliyun.core.annotation.NameInMap("File")
        private String file;

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
            this.createTime = builder.createTime;
            this.favoriteInWorkspace = builder.favoriteInWorkspace;
            this.file = builder.file;
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
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return favoriteInWorkspace
         */
        public Boolean getFavoriteInWorkspace() {
            return this.favoriteInWorkspace;
        }

        /**
         * @return file
         */
        public String getFile() {
            return this.file;
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
            private Long createTime; 
            private Boolean favoriteInWorkspace; 
            private String file; 
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
                this.createTime = model.createTime;
                this.favoriteInWorkspace = model.favoriteInWorkspace;
                this.file = model.file;
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
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FavoriteInWorkspace.
             */
            public Builder favoriteInWorkspace(Boolean favoriteInWorkspace) {
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
