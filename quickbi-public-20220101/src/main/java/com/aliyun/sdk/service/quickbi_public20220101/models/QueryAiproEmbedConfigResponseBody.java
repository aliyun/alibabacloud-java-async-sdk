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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D8749***C180FF3B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The array of AIPro configurations.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request is successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>The agent nickname.</p>
             * 
             * <strong>example:</strong>
             * <p>Xiao Q</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>The embed configuration ID, which is used for CreateTicket4AiPro.</p>
             * 
             * <strong>example:</strong>
             * <p>123124</p>
             */
            public Builder aiProId(String aiProId) {
                this.aiProId = aiProId;
                return this;
            }

            /**
             * <p>Indicates whether chat history is displayed. Valid values:</p>
             * <ul>
             * <li>1: Displayed.</li>
             * <li>0: Not displayed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chatHistoryStatus(Integer chatHistoryStatus) {
                this.chatHistoryStatus = chatHistoryStatus;
                return this;
            }

            /**
             * <p>The JSON string of the embed appearance configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>Specifies whether memory is enabled. Valid values:</p>
             * <ul>
             * <li>1: Enabled.</li>
             * <li>0: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder memoryEnabled(Integer memoryEnabled) {
                this.memoryEnabled = memoryEnabled;
                return this;
            }

            /**
             * <p>The configuration name.</p>
             * 
             * <strong>example:</strong>
             * <p>0327</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ul>
             * <li>1: Enabled.</li>
             * <li>0: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Specifies whether file upload is allowed. Valid values:</p>
             * <ul>
             * <li>1: Allowed.</li>
             * <li>0: Not allowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
