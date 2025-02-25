// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendVerifyCodeToEmailRequest} extends {@link RequestModel}
 *
 * <p>SendVerifyCodeToEmailRequest</p>
 */
public class SendVerifyCodeToEmailRequest extends Request {
    @Query
    @NameInMap("Email")
    @Validation(required = true)
    private String email;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private SendVerifyCodeToEmailRequest(Builder builder) {
        super(builder);
        this.email = builder.email;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendVerifyCodeToEmailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<SendVerifyCodeToEmailRequest, Builder> {
        private String email; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(SendVerifyCodeToEmailRequest request) {
            super(request);
            this.email = request.email;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public SendVerifyCodeToEmailRequest build() {
            return new SendVerifyCodeToEmailRequest(this);
        } 

    } 

}
