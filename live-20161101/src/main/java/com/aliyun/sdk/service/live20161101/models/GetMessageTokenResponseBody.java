// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link GetMessageTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageTokenResponseBody</p>
 */
public class GetMessageTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetMessageTokenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageTokenResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetMessageTokenResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-****-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetMessageTokenResponseBody build() {
            return new GetMessageTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMessageTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GetMessageTokenResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessToken")
        private String accessToken;

        @com.aliyun.core.annotation.NameInMap("AccessTokenExpiredTime")
        private Long accessTokenExpiredTime;

        @com.aliyun.core.annotation.NameInMap("RefreshToken")
        private String refreshToken;

        private Result(Builder builder) {
            this.accessToken = builder.accessToken;
            this.accessTokenExpiredTime = builder.accessTokenExpiredTime;
            this.refreshToken = builder.refreshToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return accessToken
         */
        public String getAccessToken() {
            return this.accessToken;
        }

        /**
         * @return accessTokenExpiredTime
         */
        public Long getAccessTokenExpiredTime() {
            return this.accessTokenExpiredTime;
        }

        /**
         * @return refreshToken
         */
        public String getRefreshToken() {
            return this.refreshToken;
        }

        public static final class Builder {
            private String accessToken; 
            private Long accessTokenExpiredTime; 
            private String refreshToken; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.accessToken = model.accessToken;
                this.accessTokenExpiredTime = model.accessTokenExpiredTime;
                this.refreshToken = model.refreshToken;
            } 

            /**
             * <p>The token used to establish a persistent connection.</p>
             * 
             * <strong>example:</strong>
             * <p>oauth_cloud_key:***-b0YY5Gy6Q</p>
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * <p>Indicates how long until the token expires. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400000</p>
             */
            public Builder accessTokenExpiredTime(Long accessTokenExpiredTime) {
                this.accessTokenExpiredTime = accessTokenExpiredTime;
                return this;
            }

            /**
             * <p>The updated token. If a token expires, you can call RefreshToken to obtain a new token.</p>
             * 
             * <strong>example:</strong>
             * <p>oauth_cloud_key:****-Q62xggOTdgk3gw=</p>
             */
            public Builder refreshToken(String refreshToken) {
                this.refreshToken = refreshToken;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
