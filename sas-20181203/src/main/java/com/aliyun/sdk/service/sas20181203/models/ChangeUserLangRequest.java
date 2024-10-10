// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ChangeUserLangRequest} extends {@link RequestModel}
 *
 * <p>ChangeUserLangRequest</p>
 */
public class ChangeUserLangRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserLang")
    private String userLang;

    private ChangeUserLangRequest(Builder builder) {
        super(builder);
        this.userLang = builder.userLang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeUserLangRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userLang
     */
    public String getUserLang() {
        return this.userLang;
    }

    public static final class Builder extends Request.Builder<ChangeUserLangRequest, Builder> {
        private String userLang; 

        private Builder() {
            super();
        } 

        private Builder(ChangeUserLangRequest request) {
            super(request);
            this.userLang = request.userLang;
        } 

        /**
         * <p>The new language. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder userLang(String userLang) {
            this.putQueryParameter("UserLang", userLang);
            this.userLang = userLang;
            return this;
        }

        @Override
        public ChangeUserLangRequest build() {
            return new ChangeUserLangRequest(this);
        } 

    } 

}
