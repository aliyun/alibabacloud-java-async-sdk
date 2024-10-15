// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GroupCorpTokenRequest} extends {@link RequestModel}
 *
 * <p>GroupCorpTokenRequest</p>
 */
public class GroupCorpTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("app_secret")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("corp_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String corpId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sub_corp_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subCorpId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-access-token")
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZzljczY5dnFjNDAwVlNofiwoWX5ZWCxlcjVTKnVoZS0</p>
         */
        public Builder appSecret(String appSecret) {
            this.putQueryParameter("app_secret", appSecret);
            this.appSecret = appSecret;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>open12g9sfbmm5i07v10wDzRSK9w00</p>
         */
        public Builder corpId(String corpId) {
            this.putQueryParameter("corp_id", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>btripuyxmbg3cs286734u_mow6q</p>
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
