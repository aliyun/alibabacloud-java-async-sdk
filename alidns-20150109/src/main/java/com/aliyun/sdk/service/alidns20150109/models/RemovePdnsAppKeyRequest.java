// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link RemovePdnsAppKeyRequest} extends {@link RequestModel}
 *
 * <p>RemovePdnsAppKeyRequest</p>
 */
public class RemovePdnsAppKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKeyId")
    private String appKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private RemovePdnsAppKeyRequest(Builder builder) {
        super(builder);
        this.appKeyId = builder.appKeyId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemovePdnsAppKeyRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<RemovePdnsAppKeyRequest, Builder> {
        private String appKeyId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(RemovePdnsAppKeyRequest request) {
            super(request);
            this.appKeyId = request.appKeyId;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public RemovePdnsAppKeyRequest build() {
            return new RemovePdnsAppKeyRequest(this);
        } 

    } 

}
