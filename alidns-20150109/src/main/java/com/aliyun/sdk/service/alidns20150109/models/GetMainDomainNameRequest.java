// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMainDomainNameRequest} extends {@link RequestModel}
 *
 * <p>GetMainDomainNameRequest</p>
 */
public class GetMainDomainNameRequest extends Request {
    @Query
    @NameInMap("InputString")
    @Validation(required = true)
    private String inputString;

    @Query
    @NameInMap("Lang")
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
         * The string. The string can be up to 128 characters in length.
         */
        public Builder inputString(String inputString) {
            this.putQueryParameter("InputString", inputString);
            this.inputString = inputString;
            return this;
        }

        /**
         * The language.
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
