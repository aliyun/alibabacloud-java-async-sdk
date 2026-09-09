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
 * {@link CreateAgentIMChannelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAgentIMChannelResponseBody</p>
 */
public class CreateAgentIMChannelResponseBody extends TeaModel {
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

    private CreateAgentIMChannelResponseBody(Builder builder) {
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

    public static CreateAgentIMChannelResponseBody create() {
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

        private Builder(CreateAgentIMChannelResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code. The value SUCCESS indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The IM channel information after creation.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code. The value 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request processing result message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateAgentIMChannelResponseBody build() {
            return new CreateAgentIMChannelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgentIMChannelResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAgentIMChannelResponseBody</p>
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
             * <p>Specifies whether to display the thinking process in IM messages. Default value: false.</p>
             */
            public Builder showThinking(Boolean showThinking) {
                this.showThinking = showThinking;
                return this;
            }

            /**
             * <p>Specifies whether to display the tool calling process in IM messages. Default value: false.</p>
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
     * {@link CreateAgentIMChannelResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAgentIMChannelResponseBody</p>
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
             * <p>The list of configured secret field names. Secret values are not included.</p>
             */
            public Builder configuredSecretFields(java.util.List<String> configuredSecretFields) {
                this.configuredSecretFields = configuredSecretFields;
                return this;
            }

            /**
             * <p>The non-sensitive credential fields and their values.</p>
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
     * {@link CreateAgentIMChannelResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAgentIMChannelResponseBody</p>
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
             * <p>The agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-1</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The channel behavior configuration.</p>
             */
            public Builder channelConfig(ChannelConfig channelConfig) {
                this.channelConfig = channelConfig;
                return this;
            }

            /**
             * <p>The IM channel type. Valid values:</p>
             * <ul>
             * <li>DINGTALK: DingTalk.</li>
             * <li>FEISHU: Lark.</li>
             * <li>WECOM: WeCom.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DINGTALK</p>
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>The creation time in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The channel credential summary. Only non-sensitive fields and configured secret field names are returned. Secret values are not returned.</p>
             */
            public Builder credentialSummary(CredentialSummary credentialSummary) {
                this.credentialSummary = credentialSummary;
                return this;
            }

            /**
             * <p>Specifies whether to enable the IM channel. Default value: true.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The public network access URL of the attached ServiceEndpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://agent.example.com">https://agent.example.com</a></p>
             */
            public Builder endpointUrl(String endpointUrl) {
                this.endpointUrl = endpointUrl;
                return this;
            }

            /**
             * <p>The IM channel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>imc-1</p>
             */
            public Builder imChannelId(String imChannelId) {
                this.imChannelId = imChannelId;
                return this;
            }

            /**
             * <p>The ID of the ServiceEndpoint to bind. The endpoint must belong to the specified agent and its current version, be in the ready state, and have a public network address.</p>
             * 
             * <strong>example:</strong>
             * <p>se-1</p>
             */
            public Builder serviceEndpointId(String serviceEndpointId) {
                this.serviceEndpointId = serviceEndpointId;
                return this;
            }

            /**
             * <p>The IM channel status. Valid values:</p>
             * <ul>
             * <li>CREATING: Being created.</li>
             * <li>READY: Ready.</li>
             * <li>UPDATING: Being updated.</li>
             * <li>FAILED: Failed.</li>
             * <li>DELETING: Being deleted.</li>
             * <li>DELETE_FAILED: Deletion failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason for the current IM channel status.</p>
             * 
             * <strong>example:</strong>
             * <p>AppFlow creation failed</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * <p>The update time in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-1</p>
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
