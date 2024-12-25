// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link GenerateWebofficeTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateWebofficeTokenResponseBody</p>
 */
public class GenerateWebofficeTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessToken")
    private String accessToken;

    @com.aliyun.core.annotation.NameInMap("AccessTokenExpiredTime")
    private String accessTokenExpiredTime;

    @com.aliyun.core.annotation.NameInMap("RefreshToken")
    private String refreshToken;

    @com.aliyun.core.annotation.NameInMap("RefreshTokenExpiredTime")
    private String refreshTokenExpiredTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WebofficeURL")
    private String webofficeURL;

    private GenerateWebofficeTokenResponseBody(Builder builder) {
        this.accessToken = builder.accessToken;
        this.accessTokenExpiredTime = builder.accessTokenExpiredTime;
        this.refreshToken = builder.refreshToken;
        this.refreshTokenExpiredTime = builder.refreshTokenExpiredTime;
        this.requestId = builder.requestId;
        this.webofficeURL = builder.webofficeURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateWebofficeTokenResponseBody create() {
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
    public String getAccessTokenExpiredTime() {
        return this.accessTokenExpiredTime;
    }

    /**
     * @return refreshToken
     */
    public String getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * @return refreshTokenExpiredTime
     */
    public String getRefreshTokenExpiredTime() {
        return this.refreshTokenExpiredTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return webofficeURL
     */
    public String getWebofficeURL() {
        return this.webofficeURL;
    }

    public static final class Builder {
        private String accessToken; 
        private String accessTokenExpiredTime; 
        private String refreshToken; 
        private String refreshTokenExpiredTime; 
        private String requestId; 
        private String webofficeURL; 

        /**
         * AccessToken.
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * AccessTokenExpiredTime.
         */
        public Builder accessTokenExpiredTime(String accessTokenExpiredTime) {
            this.accessTokenExpiredTime = accessTokenExpiredTime;
            return this;
        }

        /**
         * RefreshToken.
         */
        public Builder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * RefreshTokenExpiredTime.
         */
        public Builder refreshTokenExpiredTime(String refreshTokenExpiredTime) {
            this.refreshTokenExpiredTime = refreshTokenExpiredTime;
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
         * WebofficeURL.
         */
        public Builder webofficeURL(String webofficeURL) {
            this.webofficeURL = webofficeURL;
            return this;
        }

        public GenerateWebofficeTokenResponseBody build() {
            return new GenerateWebofficeTokenResponseBody(this);
        } 

    } 

}
