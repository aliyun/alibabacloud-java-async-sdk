// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qwenb2bchat20261105.models;

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
 * {@link ChatRequest} extends {@link RequestModel}
 *
 * <p>ChatRequest</p>
 */
public class ChatRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Accept")
    private String accept;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-DashScope-SSE")
    private String xDashScopeSSE;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-GW-Access")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xGWAccess;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-GW-Nonce")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xGWNonce;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-GW-Protocol")
    private String xGWProtocol;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-GW-Signature")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xGWSignature;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-GW-Timestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xGWTimestamp;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-Request-Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xRequestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("communication")
    @com.aliyun.core.annotation.Validation(required = true)
    private Communication communication;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("data")
    @com.aliyun.core.annotation.Validation(required = true)
    private Data data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("params")
    private Params params;

    private ChatRequest(Builder builder) {
        super(builder);
        this.accept = builder.accept;
        this.xDashScopeSSE = builder.xDashScopeSSE;
        this.xGWAccess = builder.xGWAccess;
        this.xGWNonce = builder.xGWNonce;
        this.xGWProtocol = builder.xGWProtocol;
        this.xGWSignature = builder.xGWSignature;
        this.xGWTimestamp = builder.xGWTimestamp;
        this.xRequestId = builder.xRequestId;
        this.communication = builder.communication;
        this.data = builder.data;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accept
     */
    public String getAccept() {
        return this.accept;
    }

    /**
     * @return xDashScopeSSE
     */
    public String getXDashScopeSSE() {
        return this.xDashScopeSSE;
    }

    /**
     * @return xGWAccess
     */
    public String getXGWAccess() {
        return this.xGWAccess;
    }

    /**
     * @return xGWNonce
     */
    public String getXGWNonce() {
        return this.xGWNonce;
    }

    /**
     * @return xGWProtocol
     */
    public String getXGWProtocol() {
        return this.xGWProtocol;
    }

    /**
     * @return xGWSignature
     */
    public String getXGWSignature() {
        return this.xGWSignature;
    }

    /**
     * @return xGWTimestamp
     */
    public String getXGWTimestamp() {
        return this.xGWTimestamp;
    }

    /**
     * @return xRequestId
     */
    public String getXRequestId() {
        return this.xRequestId;
    }

    /**
     * @return communication
     */
    public Communication getCommunication() {
        return this.communication;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return params
     */
    public Params getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<ChatRequest, Builder> {
        private String accept; 
        private String xDashScopeSSE; 
        private String xGWAccess; 
        private String xGWNonce; 
        private String xGWProtocol; 
        private String xGWSignature; 
        private String xGWTimestamp; 
        private String xRequestId; 
        private Communication communication; 
        private Data data; 
        private Params params; 

        private Builder() {
            super();
        } 

        private Builder(ChatRequest request) {
            super(request);
            this.accept = request.accept;
            this.xDashScopeSSE = request.xDashScopeSSE;
            this.xGWAccess = request.xGWAccess;
            this.xGWNonce = request.xGWNonce;
            this.xGWProtocol = request.xGWProtocol;
            this.xGWSignature = request.xGWSignature;
            this.xGWTimestamp = request.xGWTimestamp;
            this.xRequestId = request.xRequestId;
            this.communication = request.communication;
            this.data = request.data;
            this.params = request.params;
        } 

        /**
         * <p>The response media types accepted by the client.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        public Builder accept(String accept) {
            this.putHeaderParameter("Accept", accept);
            this.accept = accept;
            return this;
        }

        /**
         * <p>The compatible SSE selector header.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder xDashScopeSSE(String xDashScopeSSE) {
            this.putHeaderParameter("X-DashScope-SSE", xDashScopeSSE);
            this.xDashScopeSSE = xDashScopeSSE;
            return this;
        }

        /**
         * <p>The AccessKey ID for the business gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-gateway-access</p>
         */
        public Builder xGWAccess(String xGWAccess) {
            this.putHeaderParameter("X-GW-Access", xGWAccess);
            this.xGWAccess = xGWAccess;
            return this;
        }

        /**
         * <p>The random string used for each call.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c093adf9-287a-4684-982a-1aea5a248c2e</p>
         */
        public Builder xGWNonce(String xGWNonce) {
            this.putHeaderParameter("X-GW-Nonce", xGWNonce);
            this.xGWNonce = xGWNonce;
            return this;
        }

        /**
         * <p>The field naming protocol. Set to aliyun-roa to use lower camel case fields, or omit to use the legacy protocol. This header does not participate in HMAC signing.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-roa</p>
         */
        public Builder xGWProtocol(String xGWProtocol) {
            this.putHeaderParameter("X-GW-Protocol", xGWProtocol);
            this.xGWProtocol = xGWProtocol;
            return this;
        }

        /**
         * <p>The lowercase hexadecimal HMAC-SHA256 signature calculated based on the actual request bytes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0000000000000000000000000000000000000000000000000000000000000000</p>
         */
        public Builder xGWSignature(String xGWSignature) {
            this.putHeaderParameter("X-GW-Signature", xGWSignature);
            this.xGWSignature = xGWSignature;
            return this;
        }

        /**
         * <p>The current Unix millisecond timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1794787200000</p>
         */
        public Builder xGWTimestamp(String xGWTimestamp) {
            this.putHeaderParameter("X-GW-Timestamp", xGWTimestamp);
            this.xGWTimestamp = xGWTimestamp;
            return this;
        }

        /**
         * <p>The business request ID, which must be exactly the same as communication.requestId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>req-example-001</p>
         */
        public Builder xRequestId(String xRequestId) {
            this.putHeaderParameter("X-Request-Id", xRequestId);
            this.xRequestId = xRequestId;
            return this;
        }

        /**
         * <p>The correlation ID, session, and application identity information for the current request.</p>
         * <p>This parameter is required.</p>
         */
        public Builder communication(Communication communication) {
            this.putBodyParameter("communication", communication);
            this.communication = communication;
            return this;
        }

        /**
         * <p>The business data that carries the messages for the current request.</p>
         * <p>This parameter is required.</p>
         */
        public Builder data(Data data) {
            this.putBodyParameter("data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>An optional extensible JSON object. responseStreaming is an optional boolean value. A value of false returns a complete JSON response, and a value of true returns a Server-Sent Events (SSE) response.</p>
         */
        public Builder params(Params params) {
            this.putBodyParameter("params", params);
            this.params = params;
            return this;
        }

        @Override
        public ChatRequest build() {
            return new ChatRequest(this);
        } 

    } 

    /**
     * 
     * {@link ChatRequest} extends {@link TeaModel}
     *
     * <p>ChatRequest</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("userIp")
        private String userIp;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        private UserInfo(Builder builder) {
            this.deviceId = builder.deviceId;
            this.userId = builder.userId;
            this.userIp = builder.userIp;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userIp
         */
        public String getUserIp() {
            return this.userIp;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String deviceId; 
            private String userId; 
            private String userIp; 
            private String userName; 

            private Builder() {
            } 

            private Builder(UserInfo model) {
                this.deviceId = model.deviceId;
                this.userId = model.userId;
                this.userIp = model.userIp;
                this.userName = model.userName;
            } 

            /**
             * <p>The terminal device identifier provided by the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>device-example-001</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>The business user identifier within the customer application, provided based on the user binding or delegation configuration of the business gateway credentials.</p>
             * 
             * <strong>example:</strong>
             * <p>example-user-001</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The IP address of the business user provided by the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.2.10</p>
             */
            public Builder userIp(String userIp) {
                this.userIp = userIp;
                return this;
            }

            /**
             * <p>The username of the business user provided by the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>示例用户</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatRequest} extends {@link TeaModel}
     *
     * <p>ChatRequest</p>
     */
    public static class Communication extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("appScene")
        private String appScene;

        @com.aliyun.core.annotation.NameInMap("historyOwner")
        @com.aliyun.core.annotation.Validation(required = true)
        private String historyOwner;

        @com.aliyun.core.annotation.NameInMap("requestId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("userInfo")
        private UserInfo userInfo;

        private Communication(Builder builder) {
            this.appId = builder.appId;
            this.appScene = builder.appScene;
            this.historyOwner = builder.historyOwner;
            this.requestId = builder.requestId;
            this.sessionId = builder.sessionId;
            this.userInfo = builder.userInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Communication create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appScene
         */
        public String getAppScene() {
            return this.appScene;
        }

        /**
         * @return historyOwner
         */
        public String getHistoryOwner() {
            return this.historyOwner;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return userInfo
         */
        public UserInfo getUserInfo() {
            return this.userInfo;
        }

        public static final class Builder {
            private String appId; 
            private String appScene; 
            private String historyOwner; 
            private String requestId; 
            private String sessionId; 
            private UserInfo userInfo; 

            private Builder() {
            } 

            private Builder(Communication model) {
                this.appId = model.appId;
                this.appScene = model.appScene;
                this.historyOwner = model.historyOwner;
                this.requestId = model.requestId;
                this.sessionId = model.sessionId;
                this.userInfo = model.userInfo;
            } 

            /**
             * <p>The application ID provided based on the gateway credential identity configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>example-app</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The optional business scene marker.</p>
             * 
             * <strong>example:</strong>
             * <p>travel</p>
             */
            public Builder appScene(String appScene) {
                this.appScene = appScene;
                return this;
            }

            /**
             * <p>The owner of the session history, which must be consistent with the first call of the session.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CLIENT</p>
             */
            public Builder historyOwner(String historyOwner) {
                this.historyOwner = historyOwner;
                return this;
            }

            /**
             * <p>The business request ID of the customer.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>req-example-001</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The session ID of the customer, which is reused for continued chats.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>session-example-001</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The business user and device information provided by the customer. Identity fields are passed based on the configuration of the business gateway credentials.</p>
             */
            public Builder userInfo(UserInfo userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            public Communication build() {
                return new Communication(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatRequest} extends {@link TeaModel}
     *
     * <p>ChatRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private Object content;

        @com.aliyun.core.annotation.NameInMap("role")
        @com.aliyun.core.annotation.Validation(required = true)
        private String role;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public Object getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private Object content; 
            private String role; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * <p>The text or an array of supported multimodal content blocks.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>请介绍杭州西湖。</p>
             */
            public Builder content(Object content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The sender of the message. user indicates the business user, and assistant indicates the assistant.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatRequest} extends {@link TeaModel}
     *
     * <p>ChatRequest</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("messages")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Messages> messages;

        private Data(Builder builder) {
            this.messages = builder.messages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return messages
         */
        public java.util.List<Messages> getMessages() {
            return this.messages;
        }

        public static final class Builder {
            private java.util.List<Messages> messages; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.messages = model.messages;
            } 

            /**
             * <p>The list of messages arranged in conversational order. When history is managed by the client, it can include the session history provided by the client.</p>
             * <p>This parameter is required.</p>
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatRequest} extends {@link TeaModel}
     *
     * <p>ChatRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deepthink")
        private String deepthink;

        @com.aliyun.core.annotation.NameInMap("directAgent")
        private String directAgent;

        @com.aliyun.core.annotation.NameInMap("enableTextImageMixed")
        private Boolean enableTextImageMixed;

        @com.aliyun.core.annotation.NameInMap("maxTokens")
        private Integer maxTokens;

        @com.aliyun.core.annotation.NameInMap("outputAudio")
        private Boolean outputAudio;

        @com.aliyun.core.annotation.NameInMap("responseStreaming")
        private Boolean responseStreaming;

        @com.aliyun.core.annotation.NameInMap("temperature")
        private Float temperature;

        @com.aliyun.core.annotation.NameInMap("topP")
        private Float topP;

        private Params(Builder builder) {
            this.deepthink = builder.deepthink;
            this.directAgent = builder.directAgent;
            this.enableTextImageMixed = builder.enableTextImageMixed;
            this.maxTokens = builder.maxTokens;
            this.outputAudio = builder.outputAudio;
            this.responseStreaming = builder.responseStreaming;
            this.temperature = builder.temperature;
            this.topP = builder.topP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return deepthink
         */
        public String getDeepthink() {
            return this.deepthink;
        }

        /**
         * @return directAgent
         */
        public String getDirectAgent() {
            return this.directAgent;
        }

        /**
         * @return enableTextImageMixed
         */
        public Boolean getEnableTextImageMixed() {
            return this.enableTextImageMixed;
        }

        /**
         * @return maxTokens
         */
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        /**
         * @return outputAudio
         */
        public Boolean getOutputAudio() {
            return this.outputAudio;
        }

        /**
         * @return responseStreaming
         */
        public Boolean getResponseStreaming() {
            return this.responseStreaming;
        }

        /**
         * @return temperature
         */
        public Float getTemperature() {
            return this.temperature;
        }

        /**
         * @return topP
         */
        public Float getTopP() {
            return this.topP;
        }

        public static final class Builder {
            private String deepthink; 
            private String directAgent; 
            private Boolean enableTextImageMixed; 
            private Integer maxTokens; 
            private Boolean outputAudio; 
            private Boolean responseStreaming; 
            private Float temperature; 
            private Float topP; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.deepthink = model.deepthink;
                this.directAgent = model.directAgent;
                this.enableTextImageMixed = model.enableTextImageMixed;
                this.maxTokens = model.maxTokens;
                this.outputAudio = model.outputAudio;
                this.responseStreaming = model.responseStreaming;
                this.temperature = model.temperature;
                this.topP = model.topP;
            } 

            /**
             * <p>The deep thinking switch.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deepthink(String deepthink) {
                this.deepthink = deepthink;
                return this;
            }

            /**
             * <p>The agent selector for the current turn.</p>
             * 
             * <strong>example:</strong>
             * <p>study_qa</p>
             */
            public Builder directAgent(String directAgent) {
                this.directAgent = directAgent;
                return this;
            }

            /**
             * <p>The mixed text and image output switch.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableTextImageMixed(Boolean enableTextImageMixed) {
                this.enableTextImageMixed = enableTextImageMixed;
                return this;
            }

            /**
             * <p>The maximum number of output tokens for the model.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder maxTokens(Integer maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * <p>The HTTP audio output switch.</p>
             */
            public Builder outputAudio(Boolean outputAudio) {
                this.outputAudio = outputAudio;
                return this;
            }

            /**
             * <p>Specifies whether to use Server-Sent Events (SSE) for conversation responses.</p>
             */
            public Builder responseStreaming(Boolean responseStreaming) {
                this.responseStreaming = responseStreaming;
                return this;
            }

            /**
             * <p>The model sampling temperature.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7</p>
             */
            public Builder temperature(Float temperature) {
                this.temperature = temperature;
                return this;
            }

            /**
             * <p>The nucleus sampling probability for the model.</p>
             * 
             * <strong>example:</strong>
             * <p>0.8</p>
             */
            public Builder topP(Float topP) {
                this.topP = topP;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
}
