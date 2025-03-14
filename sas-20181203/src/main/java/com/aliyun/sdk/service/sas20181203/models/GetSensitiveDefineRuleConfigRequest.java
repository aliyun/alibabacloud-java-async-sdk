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
 * {@link GetSensitiveDefineRuleConfigRequest} extends {@link RequestModel}
 *
 * <p>GetSensitiveDefineRuleConfigRequest</p>
 */
public class GetSensitiveDefineRuleConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private GetSensitiveDefineRuleConfigRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSensitiveDefineRuleConfigRequest create() {
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<GetSensitiveDefineRuleConfigRequest, Builder> {
        private String lang; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(GetSensitiveDefineRuleConfigRequest request) {
            super(request);
            this.lang = request.lang;
            this.source = request.source;
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

        /**
         * <p>The source of the check rules. Valid values:</p>
         * <ul>
         * <li><strong>image</strong>: image.</li>
         * <li><strong>agentless</strong>: agentless detection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public GetSensitiveDefineRuleConfigRequest build() {
            return new GetSensitiveDefineRuleConfigRequest(this);
        } 

    } 

}
