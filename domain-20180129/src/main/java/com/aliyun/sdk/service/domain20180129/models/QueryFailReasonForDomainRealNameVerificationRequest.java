// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link QueryFailReasonForDomainRealNameVerificationRequest} extends {@link RequestModel}
 *
 * <p>QueryFailReasonForDomainRealNameVerificationRequest</p>
 */
public class QueryFailReasonForDomainRealNameVerificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealNameVerificationAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String realNameVerificationAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
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
         * <p>Domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Language of error messages returned by the API. Valid values:  </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.  </li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Default value: <strong>en</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Review Type. Valid values:  </p>
         * <ul>
         * <li><strong>ACTIVATE</strong>: New registration.  </li>
         * <li><strong>CHGHOLDER</strong>: Change of holder.  </li>
         * <li><strong>TRANSFER</strong>: Transfer-in.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVATE</p>
         */
        public Builder realNameVerificationAction(String realNameVerificationAction) {
            this.putQueryParameter("RealNameVerificationAction", realNameVerificationAction);
            this.realNameVerificationAction = realNameVerificationAction;
            return this;
        }

        /**
         * <p>User IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
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
