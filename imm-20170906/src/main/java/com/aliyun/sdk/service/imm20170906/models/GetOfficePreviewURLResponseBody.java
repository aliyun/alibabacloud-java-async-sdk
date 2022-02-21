// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOfficePreviewURLResponseBody} extends {@link TeaModel}
 *
 * <p>GetOfficePreviewURLResponseBody</p>
 */
public class GetOfficePreviewURLResponseBody extends TeaModel {
    @NameInMap("AccessToken")
    private String accessToken;

    @NameInMap("AccessTokenExpiredTime")
    private String accessTokenExpiredTime;

    @NameInMap("PreviewURL")
    private String previewURL;

    @NameInMap("RefreshToken")
    private String refreshToken;

    @NameInMap("RefreshTokenExpiredTime")
    private String refreshTokenExpiredTime;

    @NameInMap("RequestId")
    private String requestId;

    private GetOfficePreviewURLResponseBody(Builder builder) {
        this.accessToken = builder.accessToken;
        this.accessTokenExpiredTime = builder.accessTokenExpiredTime;
        this.previewURL = builder.previewURL;
        this.refreshToken = builder.refreshToken;
        this.refreshTokenExpiredTime = builder.refreshTokenExpiredTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOfficePreviewURLResponseBody create() {
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
     * @return previewURL
     */
    public String getPreviewURL() {
        return this.previewURL;
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
        private String previewURL; 
        private String refreshToken; 
        private String refreshTokenExpiredTime; 
        private String requestId; 

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
         * PreviewURL.
         */
        public Builder previewURL(String previewURL) {
            this.previewURL = previewURL;
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

        public GetOfficePreviewURLResponseBody build() {
            return new GetOfficePreviewURLResponseBody(this);
        } 

    } 

}
