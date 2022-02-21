// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePdnsAppKeyRequest} extends {@link RequestModel}
 *
 * <p>CreatePdnsAppKeyRequest</p>
 */
public class CreatePdnsAppKeyRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    private CreatePdnsAppKeyRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePdnsAppKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<CreatePdnsAppKeyRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(CreatePdnsAppKeyRequest response) {
            super(response);
            this.lang = response.lang;
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
        public CreatePdnsAppKeyRequest build() {
            return new CreatePdnsAppKeyRequest(this);
        } 

    } 

}
