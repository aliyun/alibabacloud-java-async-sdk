// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWebofficeURLResponseBody} extends {@link TeaModel}
 *
 * <p>GetWebofficeURLResponseBody</p>
 */
public class GetWebofficeURLResponseBody extends TeaModel {
    @NameInMap("AccessToken")
    private String accessToken;

    @NameInMap("AccessTokenExpiredTime")
    private String accessTokenExpiredTime;

    @NameInMap("RefreshToken")
    private String refreshToken;

    @NameInMap("RefreshTokenExpiredTime")
    private String refreshTokenExpiredTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WebofficeURL")
    private String webofficeURL;

    private GetWebofficeURLResponseBody(Builder builder) {
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

    public static GetWebofficeURLResponseBody create() {
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

        public GetWebofficeURLResponseBody build() {
            return new GetWebofficeURLResponseBody(this);
        } 

    } 

}
