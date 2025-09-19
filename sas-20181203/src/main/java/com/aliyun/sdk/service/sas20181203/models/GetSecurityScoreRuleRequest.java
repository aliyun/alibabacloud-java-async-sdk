// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetSecurityScoreRuleRequest} extends {@link RequestModel}
 *
 * <p>GetSecurityScoreRuleRequest</p>
 */
public class GetSecurityScoreRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalType")
    private String calType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private GetSecurityScoreRuleRequest(Builder builder) {
        super(builder);
        this.calType = builder.calType;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecurityScoreRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calType
     */
    public String getCalType() {
        return this.calType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<GetSecurityScoreRuleRequest, Builder> {
        private String calType; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(GetSecurityScoreRuleRequest request) {
            super(request);
            this.calType = request.calType;
            this.lang = request.lang;
        } 

        /**
         * <p>The old or new version of the security score rule. If you set this parameter to <strong>home_security_score</strong>, the new version of the security score rule is returned. Otherwise, the old version of the security score rule is returned by default.</p>
         * 
         * <strong>example:</strong>
         * <p>home_security_score</p>
         */
        public Builder calType(String calType) {
            this.putQueryParameter("CalType", calType);
            this.calType = calType;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public GetSecurityScoreRuleRequest build() {
            return new GetSecurityScoreRuleRequest(this);
        } 

    } 

}
