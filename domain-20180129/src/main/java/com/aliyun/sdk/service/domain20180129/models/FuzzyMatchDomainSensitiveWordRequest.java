// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FuzzyMatchDomainSensitiveWordRequest} extends {@link RequestModel}
 *
 * <p>FuzzyMatchDomainSensitiveWordRequest</p>
 */
public class FuzzyMatchDomainSensitiveWordRequest extends Request {
    @Query
    @NameInMap("Keyword")
    @Validation(required = true)
    private String keyword;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private FuzzyMatchDomainSensitiveWordRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FuzzyMatchDomainSensitiveWordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<FuzzyMatchDomainSensitiveWordRequest, Builder> {
        private String keyword; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(FuzzyMatchDomainSensitiveWordRequest response) {
            super(response);
            this.keyword = response.keyword;
            this.lang = response.lang;
            this.userClientIp = response.userClientIp;
        } 

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
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

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public FuzzyMatchDomainSensitiveWordRequest build() {
            return new FuzzyMatchDomainSensitiveWordRequest(this);
        } 

    } 

}
