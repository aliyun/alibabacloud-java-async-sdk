// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsUserInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribePdnsUserInfoRequest</p>
 */
public class DescribePdnsUserInfoRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    private DescribePdnsUserInfoRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePdnsUserInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribePdnsUserInfoRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribePdnsUserInfoRequest response) {
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
        public DescribePdnsUserInfoRequest build() {
            return new DescribePdnsUserInfoRequest(this);
        } 

    } 

}
