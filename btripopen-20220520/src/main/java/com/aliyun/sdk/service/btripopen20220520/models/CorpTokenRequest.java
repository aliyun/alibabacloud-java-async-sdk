// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CorpTokenRequest} extends {@link RequestModel}
 *
 * <p>CorpTokenRequest</p>
 */
public class CorpTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("app_secret")
    private String appSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("corp_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String corpId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer type;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-access-token")
    private String xAcsBtripAccessToken;

    private CorpTokenRequest(Builder builder) {
        super(builder);
        this.appSecret = builder.appSecret;
        this.corpId = builder.corpId;
        this.type = builder.type;
        this.xAcsBtripAccessToken = builder.xAcsBtripAccessToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CorpTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appSecret
     */
    public String getAppSecret() {
        return this.appSecret;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return xAcsBtripAccessToken
     */
    public String getXAcsBtripAccessToken() {
        return this.xAcsBtripAccessToken;
    }

    public static final class Builder extends Request.Builder<CorpTokenRequest, Builder> {
        private String appSecret; 
        private String corpId; 
        private Integer type; 
        private String xAcsBtripAccessToken; 

        private Builder() {
            super();
        } 

        private Builder(CorpTokenRequest request) {
            super(request);
            this.appSecret = request.appSecret;
            this.corpId = request.corpId;
            this.type = request.type;
            this.xAcsBtripAccessToken = request.xAcsBtripAccessToken;
        } 

        /**
         * app_secret.
         */
        public Builder appSecret(String appSecret) {
            this.putQueryParameter("app_secret", appSecret);
            this.appSecret = appSecret;
            return this;
        }

        /**
         * corp_id.
         */
        public Builder corpId(String corpId) {
            this.putQueryParameter("corp_id", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * x-acs-btrip-access-token.
         */
        public Builder xAcsBtripAccessToken(String xAcsBtripAccessToken) {
            this.putHeaderParameter("x-acs-btrip-access-token", xAcsBtripAccessToken);
            this.xAcsBtripAccessToken = xAcsBtripAccessToken;
            return this;
        }

        @Override
        public CorpTokenRequest build() {
            return new CorpTokenRequest(this);
        } 

    } 

}
