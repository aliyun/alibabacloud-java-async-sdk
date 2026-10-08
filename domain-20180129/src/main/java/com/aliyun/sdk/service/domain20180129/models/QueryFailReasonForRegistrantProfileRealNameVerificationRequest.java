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
         * <p>The language of the error message returned by the API. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
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
         * <p>The ID of the information template for which identity verification failed. You can call the <a href="https://help.aliyun.com/document_detail/67701.html">QueryRegistrantProfiles</a> API to query the template ID.</p>
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
         * <p>The User IP address. You can set it to 127.0.0.1.</p>
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
        public QueryFailReasonForRegistrantProfileRealNameVerificationRequest build() {
            return new QueryFailReasonForRegistrantProfileRealNameVerificationRequest(this);
        } 

    } 

}
