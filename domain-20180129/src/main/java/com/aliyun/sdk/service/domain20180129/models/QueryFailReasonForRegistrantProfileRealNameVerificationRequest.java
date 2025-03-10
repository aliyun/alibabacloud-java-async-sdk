// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryFailReasonForRegistrantProfileRealNameVerificationRequest} extends {@link RequestModel}
 *
 * <p>QueryFailReasonForRegistrantProfileRealNameVerificationRequest</p>
 */
public class QueryFailReasonForRegistrantProfileRealNameVerificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrantProfileID")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long registrantProfileID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private QueryFailReasonForRegistrantProfileRealNameVerificationRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.registrantProfileID = builder.registrantProfileID;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFailReasonForRegistrantProfileRealNameVerificationRequest create() {
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

    /**
     * @return registrantProfileID
     */
    public Long getRegistrantProfileID() {
        return this.registrantProfileID;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryFailReasonForRegistrantProfileRealNameVerificationRequest, Builder> {
        private String lang; 
        private Long registrantProfileID; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryFailReasonForRegistrantProfileRealNameVerificationRequest request) {
            super(request);
            this.lang = request.lang;
            this.registrantProfileID = request.registrantProfileID;
            this.userClientIp = request.userClientIp;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        public Builder registrantProfileID(Long registrantProfileID) {
            this.putQueryParameter("RegistrantProfileID", registrantProfileID);
            this.registrantProfileID = registrantProfileID;
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
        public QueryFailReasonForRegistrantProfileRealNameVerificationRequest build() {
            return new QueryFailReasonForRegistrantProfileRealNameVerificationRequest(this);
        } 

    } 

}
