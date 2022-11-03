// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CorpTokenRequest} extends {@link RequestModel}
 *
 * <p>CorpTokenRequest</p>
 */
public class CorpTokenRequest extends Request {
    @Query
    @NameInMap("app_secret")
    private String appSecret;

    @Query
    @NameInMap("corp_id")
    @Validation(required = true)
    private String corpId;

    @Query
    @NameInMap("type")
    @Validation(required = true)
    private Integer type;

    @Header
    @NameInMap("x-acs-btrip-access-token")
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
         * 企业id，值可以在开放平台中的关联企业查看。
         */
        public Builder corpId(String corpId) {
            this.putQueryParameter("corp_id", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * 类型，0-自营 1-分销
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
