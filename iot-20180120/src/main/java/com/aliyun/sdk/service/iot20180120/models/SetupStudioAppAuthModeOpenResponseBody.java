// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetupStudioAppAuthModeOpenResponseBody} extends {@link TeaModel}
 *
 * <p>SetupStudioAppAuthModeOpenResponseBody</p>
 */
public class SetupStudioAppAuthModeOpenResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private SetupStudioAppAuthModeOpenResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetupStudioAppAuthModeOpenResponseBody create() {
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
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
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

        public SetupStudioAppAuthModeOpenResponseBody build() {
            return new SetupStudioAppAuthModeOpenResponseBody(this);
        } 

    } 

    public static class TokenInfo extends TeaModel {
        @NameInMap("BizId")
        private String bizId;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("IsEnable")
        private String isEnable;

        @NameInMap("Token")
        private String token;

        @NameInMap("Type")
        private String type;

        private TokenInfo(Builder builder) {
            this.bizId = builder.bizId;
            this.bizType = builder.bizType;
            this.isEnable = builder.isEnable;
            this.token = builder.token;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TokenInfo create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return isEnable
         */
        public String getIsEnable() {
            return this.isEnable;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bizId; 
            private String bizType; 
            private String isEnable; 
            private String token; 
            private String type; 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * IsEnable.
             */
            public Builder isEnable(String isEnable) {
                this.isEnable = isEnable;
                return this;
            }

            /**
             * Token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TokenInfo build() {
                return new TokenInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AuthMode")
        private Integer authMode;

        @NameInMap("TokenInfo")
        private TokenInfo tokenInfo;

        private Data(Builder builder) {
            this.authMode = builder.authMode;
            this.tokenInfo = builder.tokenInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authMode
         */
        public Integer getAuthMode() {
            return this.authMode;
        }

        /**
         * @return tokenInfo
         */
        public TokenInfo getTokenInfo() {
            return this.tokenInfo;
        }

        public static final class Builder {
            private Integer authMode; 
            private TokenInfo tokenInfo; 

            /**
             * AuthMode.
             */
            public Builder authMode(Integer authMode) {
                this.authMode = authMode;
                return this;
            }

            /**
             * TokenInfo.
             */
            public Builder tokenInfo(TokenInfo tokenInfo) {
                this.tokenInfo = tokenInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
