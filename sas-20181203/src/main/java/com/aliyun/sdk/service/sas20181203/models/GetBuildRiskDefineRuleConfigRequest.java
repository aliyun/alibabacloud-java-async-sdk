// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetBuildRiskDefineRuleConfigRequest} extends {@link RequestModel}
 *
 * <p>GetBuildRiskDefineRuleConfigRequest</p>
 */
public class GetBuildRiskDefineRuleConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private GetBuildRiskDefineRuleConfigRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBuildRiskDefineRuleConfigRequest create() {
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

    public static final class Builder extends Request.Builder<GetBuildRiskDefineRuleConfigRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(GetBuildRiskDefineRuleConfigRequest request) {
            super(request);
            this.lang = request.lang;
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
        public GetBuildRiskDefineRuleConfigRequest build() {
            return new GetBuildRiskDefineRuleConfigRequest(this);
        } 

    } 

}
