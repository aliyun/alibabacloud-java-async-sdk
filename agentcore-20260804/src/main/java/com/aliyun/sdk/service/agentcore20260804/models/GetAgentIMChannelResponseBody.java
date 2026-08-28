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
 * {@link GetAgentIMChannelResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentIMChannelResponseBody</p>
 */
public class GetAgentIMChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetAgentIMChannelResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentIMChannelResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAgentIMChannelResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public GetAgentIMChannelResponseBody build() {
            return new GetAgentIMChannelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentIMChannelResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentIMChannelResponseBody</p>
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
     * {@link GetAgentIMChannelResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentIMChannelResponseBody</p>
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
     * {@link GetAgentIMChannelResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentIMChannelResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
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

            private Builder(Data model) {
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
