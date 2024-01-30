// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFailReasonForDomainRealNameVerificationRequest} extends {@link RequestModel}
 *
 * <p>QueryFailReasonForDomainRealNameVerificationRequest</p>
 */
public class QueryFailReasonForDomainRealNameVerificationRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RealNameVerificationAction")
    @Validation(required = true)
    private String realNameVerificationAction;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private QueryFailReasonForDomainRealNameVerificationRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.realNameVerificationAction = builder.realNameVerificationAction;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFailReasonForDomainRealNameVerificationRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return realNameVerificationAction
     */
    public String getRealNameVerificationAction() {
        return this.realNameVerificationAction;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryFailReasonForDomainRealNameVerificationRequest, Builder> {
        private String domainName; 
        private String lang; 
        private String realNameVerificationAction; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryFailReasonForDomainRealNameVerificationRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.realNameVerificationAction = request.realNameVerificationAction;
            this.userClientIp = request.userClientIp;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RealNameVerificationAction.
         */
        public Builder realNameVerificationAction(String realNameVerificationAction) {
            this.putQueryParameter("RealNameVerificationAction", realNameVerificationAction);
            this.realNameVerificationAction = realNameVerificationAction;
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
        public QueryFailReasonForDomainRealNameVerificationRequest build() {
            return new QueryFailReasonForDomainRealNameVerificationRequest(this);
        } 

    } 

}
