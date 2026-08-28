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
 * {@link ListAgentIMChannelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentIMChannelsResponseBody</p>
 */
public class ListAgentIMChannelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListAgentIMChannelsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentIMChannelsResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAgentIMChannelsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAgentIMChannelsResponseBody build() {
            return new ListAgentIMChannelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentIMChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentIMChannelsResponseBody</p>
     */
    public static class ChannelConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("showThinking")
        private Boolean showThinking;

        @com.aliyun.core.annotation.NameInMap("showToolCalls")
        private Boolean showToolCalls;

        private ChannelConfig(Builder builder) {
            this.showThinking = builder.showThinking;
            this.showToolCalls = builder.showToolCalls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelConfig create() {
            return builder().build();
        }

        /**
         * @return showThinking
         */
        public Boolean getShowThinking() {
            return this.showThinking;
        }

        /**
         * @return showToolCalls
         */
        public Boolean getShowToolCalls() {
            return this.showToolCalls;
        }

        public static final class Builder {
            private Boolean showThinking; 
            private Boolean showToolCalls; 

            private Builder() {
            } 

            private Builder(ChannelConfig model) {
                this.showThinking = model.showThinking;
                this.showToolCalls = model.showToolCalls;
            } 

            /**
             * showThinking.
             */
            public Builder showThinking(Boolean showThinking) {
                this.showThinking = showThinking;
                return this;
            }

            /**
             * showToolCalls.
             */
            public Builder showToolCalls(Boolean showToolCalls) {
                this.showToolCalls = showToolCalls;
                return this;
            }

            public ChannelConfig build() {
                return new ChannelConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAgentIMChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentIMChannelsResponseBody</p>
     */
    public static class CredentialSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configuredSecretFields")
        private java.util.List<String> configuredSecretFields;

        @com.aliyun.core.annotation.NameInMap("nonSecretFields")
        private java.util.Map<String, String> nonSecretFields;

        private CredentialSummary(Builder builder) {
            this.configuredSecretFields = builder.configuredSecretFields;
            this.nonSecretFields = builder.nonSecretFields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CredentialSummary create() {
            return builder().build();
        }

        /**
         * @return configuredSecretFields
         */
        public java.util.List<String> getConfiguredSecretFields() {
            return this.configuredSecretFields;
        }

        /**
         * @return nonSecretFields
         */
        public java.util.Map<String, String> getNonSecretFields() {
            return this.nonSecretFields;
        }

        public static final class Builder {
            private java.util.List<String> configuredSecretFields; 
            private java.util.Map<String, String> nonSecretFields; 

            private Builder() {
            } 

            private Builder(CredentialSummary model) {
                this.configuredSecretFields = model.configuredSecretFields;
                this.nonSecretFields = model.nonSecretFields;
            } 

            /**
             * configuredSecretFields.
             */
            public Builder configuredSecretFields(java.util.List<String> configuredSecretFields) {
                this.configuredSecretFields = configuredSecretFields;
                return this;
            }

            /**
             * nonSecretFields.
             */
            public Builder nonSecretFields(java.util.Map<String, String> nonSecretFields) {
                this.nonSecretFields = nonSecretFields;
                return this;
            }

            public CredentialSummary build() {
                return new CredentialSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAgentIMChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentIMChannelsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("channelConfig")
        private ChannelConfig channelConfig;

        @com.aliyun.core.annotation.NameInMap("channelType")
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("credentialSummary")
        private CredentialSummary credentialSummary;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("endpointUrl")
        private String endpointUrl;

        @com.aliyun.core.annotation.NameInMap("imChannelId")
        private String imChannelId;

        @com.aliyun.core.annotation.NameInMap("serviceEndpointId")
        private String serviceEndpointId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Items(Builder builder) {
            this.agentId = builder.agentId;
            this.channelConfig = builder.channelConfig;
            this.channelType = builder.channelType;
            this.createTime = builder.createTime;
            this.credentialSummary = builder.credentialSummary;
            this.enabled = builder.enabled;
            this.endpointUrl = builder.endpointUrl;
            this.imChannelId = builder.imChannelId;
            this.serviceEndpointId = builder.serviceEndpointId;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.updateTime = builder.updateTime;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return channelConfig
         */
        public ChannelConfig getChannelConfig() {
            return this.channelConfig;
        }

        /**
         * @return channelType
         */
        public String getChannelType() {
            return this.channelType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return credentialSummary
         */
        public CredentialSummary getCredentialSummary() {
            return this.credentialSummary;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return endpointUrl
         */
        public String getEndpointUrl() {
            return this.endpointUrl;
        }

        /**
         * @return imChannelId
         */
        public String getImChannelId() {
            return this.imChannelId;
        }

        /**
         * @return serviceEndpointId
         */
        public String getServiceEndpointId() {
            return this.serviceEndpointId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String agentId; 
            private ChannelConfig channelConfig; 
            private String channelType; 
            private String createTime; 
            private CredentialSummary credentialSummary; 
            private Boolean enabled; 
            private String endpointUrl; 
            private String imChannelId; 
            private String serviceEndpointId; 
            private String status; 
            private String statusReason; 
            private String updateTime; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.agentId = model.agentId;
                this.channelConfig = model.channelConfig;
                this.channelType = model.channelType;
                this.createTime = model.createTime;
                this.credentialSummary = model.credentialSummary;
                this.enabled = model.enabled;
                this.endpointUrl = model.endpointUrl;
                this.imChannelId = model.imChannelId;
                this.serviceEndpointId = model.serviceEndpointId;
                this.status = model.status;
                this.statusReason = model.statusReason;
                this.updateTime = model.updateTime;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * agentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * channelConfig.
             */
            public Builder channelConfig(ChannelConfig channelConfig) {
                this.channelConfig = channelConfig;
                return this;
            }

            /**
             * channelType.
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * credentialSummary.
             */
            public Builder credentialSummary(CredentialSummary credentialSummary) {
                this.credentialSummary = credentialSummary;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * endpointUrl.
             */
            public Builder endpointUrl(String endpointUrl) {
                this.endpointUrl = endpointUrl;
                return this;
            }

            /**
             * imChannelId.
             */
            public Builder imChannelId(String imChannelId) {
                this.imChannelId = imChannelId;
                return this;
            }

            /**
             * serviceEndpointId.
             */
            public Builder serviceEndpointId(String serviceEndpointId) {
                this.serviceEndpointId = serviceEndpointId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * statusReason.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
