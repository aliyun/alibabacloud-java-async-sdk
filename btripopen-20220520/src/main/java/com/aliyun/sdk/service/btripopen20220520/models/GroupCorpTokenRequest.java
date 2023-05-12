// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GroupCorpTokenRequest} extends {@link RequestModel}
 *
 * <p>GroupCorpTokenRequest</p>
 */
public class GroupCorpTokenRequest extends Request {
    @Query
    @NameInMap("app_secret")
    @Validation(required = true)
    private String appSecret;

    @Query
    @NameInMap("corp_id")
    @Validation(required = true)
    private String corpId;

    @Query
    @NameInMap("sub_corp_id")
    @Validation(required = true)
    private String subCorpId;

    @Header
    @NameInMap("x-acs-btrip-access-token")
    private String xAcsBtripAccessToken;

    private GroupCorpTokenRequest(Builder builder) {
        super(builder);
        this.appSecret = builder.appSecret;
        this.corpId = builder.corpId;
        this.subCorpId = builder.subCorpId;
        this.xAcsBtripAccessToken = builder.xAcsBtripAccessToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GroupCorpTokenRequest create() {
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
     * @return subCorpId
     */
    public String getSubCorpId() {
        return this.subCorpId;
    }

    /**
     * @return xAcsBtripAccessToken
     */
    public String getXAcsBtripAccessToken() {
        return this.xAcsBtripAccessToken;
    }

    public static final class Builder extends Request.Builder<GroupCorpTokenRequest, Builder> {
        private String appSecret; 
        private String corpId; 
        private String subCorpId; 
        private String xAcsBtripAccessToken; 

        private Builder() {
            super();
        } 

        private Builder(GroupCorpTokenRequest request) {
            super(request);
            this.appSecret = request.appSecret;
            this.corpId = request.corpId;
            this.subCorpId = request.subCorpId;
            this.xAcsBtripAccessToken = request.xAcsBtripAccessToken;
        } 

        /**
         * 密钥
         */
        public Builder appSecret(String appSecret) {
            this.putQueryParameter("app_secret", appSecret);
            this.appSecret = appSecret;
            return this;
        }

        /**
         * 企业id
         */
        public Builder corpId(String corpId) {
            this.putQueryParameter("corp_id", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * 子企业id
         */
        public Builder subCorpId(String subCorpId) {
            this.putQueryParameter("sub_corp_id", subCorpId);
            this.subCorpId = subCorpId;
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
        public GroupCorpTokenRequest build() {
            return new GroupCorpTokenRequest(this);
        } 

    } 

}
