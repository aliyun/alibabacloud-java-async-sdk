// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qwenb2bmed20261116.models;

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
 * {@link MedicalModelInferenceRequest} extends {@link RequestModel}
 *
 * <p>MedicalModelInferenceRequest</p>
 */
public class MedicalModelInferenceRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private Params params;

    private MedicalModelInferenceRequest(Builder builder) {
        super(builder);
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

    public static MedicalModelInferenceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<MedicalModelInferenceRequest, Builder> {
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

        private Builder(MedicalModelInferenceRequest request) {
            super(request);
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
         * <p>The business AccessKey ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-ak-87019a070b49c9fc</p>
         */
        public Builder xGWAccess(String xGWAccess) {
            this.putHeaderParameter("X-GW-Access", xGWAccess);
            this.xGWAccess = xGWAccess;
            return this;
        }

        /**
         * <p>The random string for the current request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b46a9f08-fe98-4dd3-8885-405c4d032e02</p>
         */
        public Builder xGWNonce(String xGWNonce) {
            this.putHeaderParameter("X-GW-Nonce", xGWNonce);
            this.xGWNonce = xGWNonce;
            return this;
        }

        /**
         * <p>The format of the request and response fields.</p>
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
         * <p>The business request signature.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>234ad5ad03406bc34b605b3d59746563420d58cb4cdcd2979b677790551a7278</p>
         */
        public Builder xGWSignature(String xGWSignature) {
            this.putHeaderParameter("X-GW-Signature", xGWSignature);
            this.xGWSignature = xGWSignature;
            return this;
        }

        /**
         * <p>The request timestamp in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1794996000000</p>
         */
        public Builder xGWTimestamp(String xGWTimestamp) {
            this.putHeaderParameter("X-GW-Timestamp", xGWTimestamp);
            this.xGWTimestamp = xGWTimestamp;
            return this;
        }

        /**
         * <p>The business request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>med-req-001</p>
         */
        public Builder xRequestId(String xRequestId) {
            this.putHeaderParameter("X-Request-Id", xRequestId);
            this.xRequestId = xRequestId;
            return this;
        }

        /**
         * <p>The association ID, session, and application identity information for the current request.</p>
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
         * <p>The extensible JSON object. The modelName parameter is required and its value must be an activated model selector. The directAgent parameter cannot be passed.</p>
         * <p>This parameter is required.</p>
         */
        public Builder params(Params params) {
            this.putBodyParameter("params", params);
            this.params = params;
            return this;
        }

        @Override
        public MedicalModelInferenceRequest build() {
            return new MedicalModelInferenceRequest(this);
        } 

    } 

    /**
     * 
     * {@link MedicalModelInferenceRequest} extends {@link TeaModel}
     *
     * <p>MedicalModelInferenceRequest</p>
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
             * <p>demo-device-001</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>The business user identifier in the customer application. This value is provided based on the user binding or delegation configuration of the business gateway credentials.</p>
             * 
             * <strong>example:</strong>
             * <p>user-001</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The business user IP address provided by the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.2.10</p>
             */
            public Builder userIp(String userIp) {
                this.userIp = userIp;
                return this;
            }

            /**
             * <p>The business user name provided by the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample user</p>
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
     * {@link MedicalModelInferenceRequest} extends {@link TeaModel}
     *
     * <p>MedicalModelInferenceRequest</p>
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
             * <p>The business application ID. This parameter is required when no fixed application is configured.</p>
             * 
             * <strong>example:</strong>
             * <p>your-app-id</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The optional business scenario tag.</p>
             * 
             * <strong>example:</strong>
             * <p>health_qa</p>
             */
            public Builder appScene(String appScene) {
                this.appScene = appScene;
                return this;
            }

            /**
             * <p>The host of the session history. This value must be the same as the value specified in the first call of the session.</p>
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
             * <p>The customer business request ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>med-req-001</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The customer session ID, which is reused for continued conversations.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>med-session-001</p>
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
     * {@link MedicalModelInferenceRequest} extends {@link TeaModel}
     *
     * <p>MedicalModelInferenceRequest</p>
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
             * <p>The string or array of multimodal content blocks.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>What does hemoglobin mean in the physical examination report?</p>
             */
            public Builder content(Object content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The sender of the message. A value of user indicates the business user, and a value of assistant indicates the assistant.</p>
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
     * {@link MedicalModelInferenceRequest} extends {@link TeaModel}
     *
     * <p>MedicalModelInferenceRequest</p>
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
             * <p>The list of messages arranged in conversation order. When hosted by the client, this list can include the session history provided by the client.</p>
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
     * {@link MedicalModelInferenceRequest} extends {@link TeaModel}
     *
     * <p>MedicalModelInferenceRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("responseStreaming")
        private Boolean responseStreaming;

        private Params(Builder builder) {
            this.modelName = builder.modelName;
            this.responseStreaming = builder.responseStreaming;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return responseStreaming
         */
        public Boolean getResponseStreaming() {
            return this.responseStreaming;
        }

        public static final class Builder {
            private String modelName; 
            private Boolean responseStreaming; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.modelName = model.modelName;
                this.responseStreaming = model.responseStreaming;
            } 

            /**
             * <p>Required. The model selector for this medical API is med_qwen4-vl-125.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>med_qwen4-vl-125</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The response mode. A value of false indicates that a complete JSON object is returned. A value of true indicates that Server-Sent Events (SSE) is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder responseStreaming(Boolean responseStreaming) {
                this.responseStreaming = responseStreaming;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
}
