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
 * {@link RefreshWebofficeTokenResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshWebofficeTokenResponseBody</p>
 */
public class RefreshWebofficeTokenResponseBody extends TeaModel {
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

    private RefreshWebofficeTokenResponseBody(Builder builder) {
        this.accessToken = builder.accessToken;
        this.accessTokenExpiredTime = builder.accessTokenExpiredTime;
        this.refreshToken = builder.refreshToken;
        this.refreshTokenExpiredTime = builder.refreshTokenExpiredTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshWebofficeTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String accessToken; 
        private String accessTokenExpiredTime; 
        private String refreshToken; 
        private String refreshTokenExpiredTime; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RefreshWebofficeTokenResponseBody model) {
            this.accessToken = model.accessToken;
            this.accessTokenExpiredTime = model.accessTokenExpiredTime;
            this.refreshToken = model.refreshToken;
            this.refreshTokenExpiredTime = model.refreshTokenExpiredTime;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Weboffice access token.</p>
         * 
         * <strong>example:</strong>
         * <p>4996466c690a4902846ce00f96********</p>
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * <p>Expiration time of the access token. The expiration period is 30 minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-31T13:07:28.950065359Z</p>
         */
        public Builder accessTokenExpiredTime(String accessTokenExpiredTime) {
            this.accessTokenExpiredTime = accessTokenExpiredTime;
            return this;
        }

        /**
         * <p>Weboffice refresh token.</p>
         * 
         * <strong>example:</strong>
         * <p>72a52ab3702a4123ab5594671a********</p>
         */
        public Builder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * <p>Expiration time of the refresh token. The expiration period is 1 day.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-01T12:37:28.950065359Z</p>
         */
        public Builder refreshTokenExpiredTime(String refreshTokenExpiredTime) {
            this.refreshTokenExpiredTime = refreshTokenExpiredTime;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>501339F9-4B70-0CE2-AB8C-866C********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RefreshWebofficeTokenResponseBody build() {
            return new RefreshWebofficeTokenResponseBody(this);
        } 

    } 

}
