// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyPhoneRequest} extends {@link RequestModel}
 *
 * <p>VerifyPhoneRequest</p>
 */
public class VerifyPhoneRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Phone")
    @Validation(required = true)
    private String phone;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("VerifyCode")
    @Validation(required = true)
    private String verifyCode;

    private VerifyPhoneRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.phone = builder.phone;
        this.sourceIp = builder.sourceIp;
        this.verifyCode = builder.verifyCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyPhoneRequest create() {
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
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return verifyCode
     */
    public String getVerifyCode() {
        return this.verifyCode;
    }

    public static final class Builder extends Request.Builder<VerifyPhoneRequest, Builder> {
        private String lang; 
        private String phone; 
        private String sourceIp; 
        private String verifyCode; 

        private Builder() {
            super();
        } 

        private Builder(VerifyPhoneRequest request) {
            super(request);
            this.lang = request.lang;
            this.phone = request.phone;
            this.sourceIp = request.sourceIp;
            this.verifyCode = request.verifyCode;
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
         * Phone.
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * VerifyCode.
         */
        public Builder verifyCode(String verifyCode) {
            this.putQueryParameter("VerifyCode", verifyCode);
            this.verifyCode = verifyCode;
            return this;
        }

        @Override
        public VerifyPhoneRequest build() {
            return new VerifyPhoneRequest(this);
        } 

    } 

}
