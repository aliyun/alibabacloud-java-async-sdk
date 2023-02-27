// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLoginDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>GetLoginDetailsResponseBody</p>
 */
public class GetLoginDetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("Params")
    private java.util.List < String > params;

    @NameInMap("RequestId")
    private String requestId;

    private GetLoginDetailsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoginDetailsResponseBody create() {
        return builder().build();
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
     * @return params
     */
    public java.util.List < String > getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List < String > params; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(java.util.List < String > params) {
            this.params = params;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLoginDetailsResponseBody build() {
            return new GetLoginDetailsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AgentServerUrl")
        private String agentServerUrl;

        @NameInMap("DeviceExt")
        private String deviceExt;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceState")
        private String deviceState;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Extension")
        private String extension;

        @NameInMap("Signature")
        private String signature;

        @NameInMap("Signature2")
        private String signature2;

        @NameInMap("SipServerUrl")
        private String sipServerUrl;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserKey")
        private String userKey;

        @NameInMap("UserKey2")
        private String userKey2;

        @NameInMap("WorkMode")
        private String workMode;

        private Data(Builder builder) {
            this.agentServerUrl = builder.agentServerUrl;
            this.deviceExt = builder.deviceExt;
            this.deviceId = builder.deviceId;
            this.deviceState = builder.deviceState;
            this.displayName = builder.displayName;
            this.extension = builder.extension;
            this.signature = builder.signature;
            this.signature2 = builder.signature2;
            this.sipServerUrl = builder.sipServerUrl;
            this.userId = builder.userId;
            this.userKey = builder.userKey;
            this.userKey2 = builder.userKey2;
            this.workMode = builder.workMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentServerUrl
         */
        public String getAgentServerUrl() {
            return this.agentServerUrl;
        }

        /**
         * @return deviceExt
         */
        public String getDeviceExt() {
            return this.deviceExt;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceState
         */
        public String getDeviceState() {
            return this.deviceState;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return signature2
         */
        public String getSignature2() {
            return this.signature2;
        }

        /**
         * @return sipServerUrl
         */
        public String getSipServerUrl() {
            return this.sipServerUrl;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userKey
         */
        public String getUserKey() {
            return this.userKey;
        }

        /**
         * @return userKey2
         */
        public String getUserKey2() {
            return this.userKey2;
        }

        /**
         * @return workMode
         */
        public String getWorkMode() {
            return this.workMode;
        }

        public static final class Builder {
            private String agentServerUrl; 
            private String deviceExt; 
            private String deviceId; 
            private String deviceState; 
            private String displayName; 
            private String extension; 
            private String signature; 
            private String signature2; 
            private String sipServerUrl; 
            private String userId; 
            private String userKey; 
            private String userKey2; 
            private String workMode; 

            /**
             * AgentServerUrl.
             */
            public Builder agentServerUrl(String agentServerUrl) {
                this.agentServerUrl = agentServerUrl;
                return this;
            }

            /**
             * DeviceExt.
             */
            public Builder deviceExt(String deviceExt) {
                this.deviceExt = deviceExt;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceState.
             */
            public Builder deviceState(String deviceState) {
                this.deviceState = deviceState;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * Signature2.
             */
            public Builder signature2(String signature2) {
                this.signature2 = signature2;
                return this;
            }

            /**
             * SipServerUrl.
             */
            public Builder sipServerUrl(String sipServerUrl) {
                this.sipServerUrl = sipServerUrl;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserKey.
             */
            public Builder userKey(String userKey) {
                this.userKey = userKey;
                return this;
            }

            /**
             * UserKey2.
             */
            public Builder userKey2(String userKey2) {
                this.userKey2 = userKey2;
                return this;
            }

            /**
             * WorkMode.
             */
            public Builder workMode(String workMode) {
                this.workMode = workMode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
