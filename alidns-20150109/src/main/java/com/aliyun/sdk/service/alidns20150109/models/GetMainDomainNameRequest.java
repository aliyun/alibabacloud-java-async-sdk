// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMainDomainNameRequest} extends {@link RequestModel}
 *
 * <p>GetMainDomainNameRequest</p>
 */
public class GetMainDomainNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputString")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private GetMainDomainNameRequest(Builder builder) {
        super(builder);
        this.inputString = builder.inputString;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMainDomainNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inputString
     */
    public String getInputString() {
        return this.inputString;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<GetMainDomainNameRequest, Builder> {
        private String inputString; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(GetMainDomainNameRequest request) {
            super(request);
            this.inputString = request.inputString;
            this.lang = request.lang;
        } 

        /**
         * <p>The string. The string can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder inputString(String inputString) {
            this.putQueryParameter("InputString", inputString);
            this.inputString = inputString;
            return this;
        }

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public GetMainDomainNameRequest build() {
            return new GetMainDomainNameRequest(this);
        } 

    } 

}
