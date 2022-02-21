// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainRealNameVerificationInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryDomainRealNameVerificationInfoRequest</p>
 */
public class QueryDomainRealNameVerificationInfoRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("FetchImage")
    private Boolean fetchImage;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private QueryDomainRealNameVerificationInfoRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.fetchImage = builder.fetchImage;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainRealNameVerificationInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return fetchImage
     */
    public Boolean getFetchImage() {
        return this.fetchImage;
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

    public static final class Builder extends Request.Builder<QueryDomainRealNameVerificationInfoRequest, Builder> {
        private String domainName; 
        private Boolean fetchImage; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryDomainRealNameVerificationInfoRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.fetchImage = response.fetchImage;
            this.lang = response.lang;
            this.userClientIp = response.userClientIp;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * FetchImage.
         */
        public Builder fetchImage(Boolean fetchImage) {
            this.putQueryParameter("FetchImage", fetchImage);
            this.fetchImage = fetchImage;
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
        public QueryDomainRealNameVerificationInfoRequest build() {
            return new QueryDomainRealNameVerificationInfoRequest(this);
        } 

    } 

}
