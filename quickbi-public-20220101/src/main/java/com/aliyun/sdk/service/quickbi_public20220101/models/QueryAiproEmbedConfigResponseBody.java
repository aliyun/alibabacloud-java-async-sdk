// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryAiproEmbedConfigResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAiproEmbedConfigResponseBody</p>
 */
public class QueryAiproEmbedConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAiproEmbedConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAiproEmbedConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAiproEmbedConfigResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAiproEmbedConfigResponseBody build() {
            return new QueryAiproEmbedConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAiproEmbedConfigResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiproEmbedConfigResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("AiProId")
        private String aiProId;

        @com.aliyun.core.annotation.NameInMap("ChatHistoryStatus")
        private Integer chatHistoryStatus;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("MemoryEnabled")
        private Integer memoryEnabled;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("UploadEnabled")
        private Integer uploadEnabled;

        private Result(Builder builder) {
            this.agentName = builder.agentName;
            this.aiProId = builder.aiProId;
            this.chatHistoryStatus = builder.chatHistoryStatus;
            this.config = builder.config;
            this.memoryEnabled = builder.memoryEnabled;
            this.showName = builder.showName;
            this.status = builder.status;
            this.uploadEnabled = builder.uploadEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return aiProId
         */
        public String getAiProId() {
            return this.aiProId;
        }

        /**
         * @return chatHistoryStatus
         */
        public Integer getChatHistoryStatus() {
            return this.chatHistoryStatus;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return memoryEnabled
         */
        public Integer getMemoryEnabled() {
            return this.memoryEnabled;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return uploadEnabled
         */
        public Integer getUploadEnabled() {
            return this.uploadEnabled;
        }

        public static final class Builder {
            private String agentName; 
            private String aiProId; 
            private Integer chatHistoryStatus; 
            private String config; 
            private Integer memoryEnabled; 
            private String showName; 
            private Integer status; 
            private Integer uploadEnabled; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.agentName = model.agentName;
                this.aiProId = model.aiProId;
                this.chatHistoryStatus = model.chatHistoryStatus;
                this.config = model.config;
                this.memoryEnabled = model.memoryEnabled;
                this.showName = model.showName;
                this.status = model.status;
                this.uploadEnabled = model.uploadEnabled;
            } 

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * AiProId.
             */
            public Builder aiProId(String aiProId) {
                this.aiProId = aiProId;
                return this;
            }

            /**
             * ChatHistoryStatus.
             */
            public Builder chatHistoryStatus(Integer chatHistoryStatus) {
                this.chatHistoryStatus = chatHistoryStatus;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * MemoryEnabled.
             */
            public Builder memoryEnabled(Integer memoryEnabled) {
                this.memoryEnabled = memoryEnabled;
                return this;
            }

            /**
             * ShowName.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * UploadEnabled.
             */
            public Builder uploadEnabled(Integer uploadEnabled) {
                this.uploadEnabled = uploadEnabled;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
