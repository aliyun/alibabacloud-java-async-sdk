// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePdnsAppKeyRequest} extends {@link RequestModel}
 *
 * <p>DescribePdnsAppKeyRequest</p>
 */
public class DescribePdnsAppKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKeyId")
    private String appKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    private String authCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribePdnsAppKeyRequest(Builder builder) {
        super(builder);
        this.appKeyId = builder.appKeyId;
        this.authCode = builder.authCode;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePdnsAppKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKeyId
     */
    public String getAppKeyId() {
        return this.appKeyId;
    }

    /**
     * @return authCode
     */
    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribePdnsAppKeyRequest, Builder> {
        private String appKeyId; 
        private String authCode; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribePdnsAppKeyRequest request) {
            super(request);
            this.appKeyId = request.appKeyId;
            this.authCode = request.authCode;
            this.lang = request.lang;
        } 

        /**
         * AppKeyId.
         */
        public Builder appKeyId(String appKeyId) {
            this.putQueryParameter("AppKeyId", appKeyId);
            this.appKeyId = appKeyId;
            return this;
        }

        /**
         * AuthCode.
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribePdnsAppKeyRequest build() {
            return new DescribePdnsAppKeyRequest(this);
        } 

    } 

}
