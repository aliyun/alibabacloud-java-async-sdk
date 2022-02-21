// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateDnsGtmAttributeInfoRequest} extends {@link RequestModel}
 *
 * <p>ValidateDnsGtmAttributeInfoRequest</p>
 */
public class ValidateDnsGtmAttributeInfoRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("LineCode")
    @Validation(required = true)
    private String lineCode;

    private ValidateDnsGtmAttributeInfoRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.lineCode = builder.lineCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateDnsGtmAttributeInfoRequest create() {
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
     * @return lineCode
     */
    public String getLineCode() {
        return this.lineCode;
    }

    public static final class Builder extends Request.Builder<ValidateDnsGtmAttributeInfoRequest, Builder> {
        private String lang; 
        private String lineCode; 

        private Builder() {
            super();
        } 

        private Builder(ValidateDnsGtmAttributeInfoRequest response) {
            super(response);
            this.lang = response.lang;
            this.lineCode = response.lineCode;
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
         * LineCode.
         */
        public Builder lineCode(String lineCode) {
            this.putQueryParameter("LineCode", lineCode);
            this.lineCode = lineCode;
            return this;
        }

        @Override
        public ValidateDnsGtmAttributeInfoRequest build() {
            return new ValidateDnsGtmAttributeInfoRequest(this);
        } 

    } 

}
