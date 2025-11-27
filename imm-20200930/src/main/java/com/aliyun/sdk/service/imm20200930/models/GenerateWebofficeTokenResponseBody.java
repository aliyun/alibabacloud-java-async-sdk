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

        private Builder() {
        } 

        private Builder(GenerateWebofficeTokenResponseBody model) {
            this.accessToken = model.accessToken;
            this.accessTokenExpiredTime = model.accessTokenExpiredTime;
            this.refreshToken = model.refreshToken;
            this.refreshTokenExpiredTime = model.refreshTokenExpiredTime;
            this.requestId = model.requestId;
            this.webofficeURL = model.webofficeURL;
        } 

        /**
         * <p>Weboffice access token.</p>
         * 
         * <strong>example:</strong>
         * <p>2d73dd5d87524c5e8a194c3eb5********</p>
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * <p>Expiration time of the access token. The expiration time is 30 minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-30T13:13:11.347146982Z</p>
         */
        public Builder accessTokenExpiredTime(String accessTokenExpiredTime) {
            this.accessTokenExpiredTime = accessTokenExpiredTime;
            return this;
        }

        /**
         * <p>Weboffice refresh token.</p>
         * 
         * <strong>example:</strong>
         * <p>e374995ec532432bb678074d36********</p>
         */
        public Builder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * <p>Expiration time of the refresh token. The expiration time is 1 day.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-31T12:43:11.347146982Z</p>
         */
        public Builder refreshTokenExpiredTime(String refreshTokenExpiredTime) {
            this.refreshTokenExpiredTime = refreshTokenExpiredTime;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1759315A-CB33-0A75-A72B-62D7********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Weboffice entry URL. Used for online preview or editing of documents.</p>
         * <blockquote>
         * <p>Cannot be opened directly in a browser; it needs to be used with the Weboffice JS-SDK and access token (AccessToken) to preview or edit documents. For more information, see <a href="https://help.aliyun.com/document_detail/468066.html">Getting Started</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://office-cn-shanghai.imm.aliyuncs.com/office/s/dd221b2cdb44fb66e9070d1d70a8b9bbb6d6fff7?_w_tokentype=1">https://office-cn-shanghai.imm.aliyuncs.com/office/s/dd221b2cdb44fb66e9070d1d70a8b9bbb6d6fff7?_w_tokentype=1</a></p>
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
