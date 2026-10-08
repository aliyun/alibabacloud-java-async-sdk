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
 * {@link SubmitEmailVerificationRequest} extends {@link RequestModel}
 *
 * <p>SubmitEmailVerificationRequest</p>
 */
public class SubmitEmailVerificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(required = true)
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendIfExist")
    private Boolean sendIfExist;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SubmitEmailVerificationRequest(Builder builder) {
        super(builder);
        this.email = builder.email;
        this.lang = builder.lang;
        this.sendIfExist = builder.sendIfExist;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitEmailVerificationRequest create() {
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
     * @return sendIfExist
     */
    public Boolean getSendIfExist() {
        return this.sendIfExist;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SubmitEmailVerificationRequest, Builder> {
        private String email; 
        private String lang; 
        private Boolean sendIfExist; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SubmitEmailVerificationRequest request) {
            super(request);
            this.email = request.email;
            this.lang = request.lang;
            this.sendIfExist = request.sendIfExist;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>The mailbox that requires verification. Separate multiple mailboxes with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>The language of the error message returned by the API. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Default Value: <strong>en</strong>.</p>
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
         * <p>Specifies whether to resend the verification email if it already exists. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Resend the verification email.</li>
         * <li><strong>false</strong>: Do not resend the verification email.</li>
         * </ul>
         * <p>Default Value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder sendIfExist(Boolean sendIfExist) {
            this.putQueryParameter("SendIfExist", sendIfExist);
            this.sendIfExist = sendIfExist;
            return this;
        }

        /**
         * <p>The user IP address. You can set it to 127.0.0.1.</p>
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
        public SubmitEmailVerificationRequest build() {
            return new SubmitEmailVerificationRequest(this);
        } 

    } 

}
