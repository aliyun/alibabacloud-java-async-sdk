// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link GetAuthTokenToMsenceResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthTokenToMsenceResponseBody</p>
 */
public class GetAuthTokenToMsenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MpaasSystemOauthTokenResponse")
    private MpaasSystemOauthTokenResponse mpaasSystemOauthTokenResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMsg")
    private String resultMsg;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAuthTokenToMsenceResponseBody(Builder builder) {
        this.mpaasSystemOauthTokenResponse = builder.mpaasSystemOauthTokenResponse;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthTokenToMsenceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mpaasSystemOauthTokenResponse
     */
    public MpaasSystemOauthTokenResponse getMpaasSystemOauthTokenResponse() {
        return this.mpaasSystemOauthTokenResponse;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private MpaasSystemOauthTokenResponse mpaasSystemOauthTokenResponse; 
        private String requestId; 
        private String resultCode; 
        private String resultMsg; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAuthTokenToMsenceResponseBody model) {
            this.mpaasSystemOauthTokenResponse = model.mpaasSystemOauthTokenResponse;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMsg = model.resultMsg;
            this.success = model.success;
        } 

        /**
         * MpaasSystemOauthTokenResponse.
         */
        public Builder mpaasSystemOauthTokenResponse(MpaasSystemOauthTokenResponse mpaasSystemOauthTokenResponse) {
            this.mpaasSystemOauthTokenResponse = mpaasSystemOauthTokenResponse;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMsg.
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAuthTokenToMsenceResponseBody build() {
            return new GetAuthTokenToMsenceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAuthTokenToMsenceResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuthTokenToMsenceResponseBody</p>
     */
    public static class MpaasSystemOauthTokenResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthToken")
        private String authToken;

        @com.aliyun.core.annotation.NameInMap("ExpiresIn")
        private String expiresIn;

        @com.aliyun.core.annotation.NameInMap("OpenId")
        private String openId;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private MpaasSystemOauthTokenResponse(Builder builder) {
            this.authToken = builder.authToken;
            this.expiresIn = builder.expiresIn;
            this.openId = builder.openId;
            this.platform = builder.platform;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MpaasSystemOauthTokenResponse create() {
            return builder().build();
        }

        /**
         * @return authToken
         */
        public String getAuthToken() {
            return this.authToken;
        }

        /**
         * @return expiresIn
         */
        public String getExpiresIn() {
            return this.expiresIn;
        }

        /**
         * @return openId
         */
        public String getOpenId() {
            return this.openId;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String authToken; 
            private String expiresIn; 
            private String openId; 
            private String platform; 
            private String userId; 

            private Builder() {
            } 

            private Builder(MpaasSystemOauthTokenResponse model) {
                this.authToken = model.authToken;
                this.expiresIn = model.expiresIn;
                this.openId = model.openId;
                this.platform = model.platform;
                this.userId = model.userId;
            } 

            /**
             * AuthToken.
             */
            public Builder authToken(String authToken) {
                this.authToken = authToken;
                return this;
            }

            /**
             * ExpiresIn.
             */
            public Builder expiresIn(String expiresIn) {
                this.expiresIn = expiresIn;
                return this;
            }

            /**
             * OpenId.
             */
            public Builder openId(String openId) {
                this.openId = openId;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public MpaasSystemOauthTokenResponse build() {
                return new MpaasSystemOauthTokenResponse(this);
            } 

        } 

    }
}
