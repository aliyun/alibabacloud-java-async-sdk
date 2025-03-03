// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link ChangeAccountEmailRequest} extends {@link RequestModel}
 *
 * <p>ChangeAccountEmailRequest</p>
 */
public class ChangeAccountEmailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(required = true)
    private String email;

    private ChangeAccountEmailRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.email = builder.email;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeAccountEmailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    public static final class Builder extends Request.Builder<ChangeAccountEmailRequest, Builder> {
        private String accountId; 
        private String email; 

        private Builder() {
            super();
        } 

        private Builder(ChangeAccountEmailRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.email = request.email;
        } 

        /**
         * <p>The Alibaba Cloud account ID of the member.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>181761095690****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The email address to be bound to the member.</p>
         * <blockquote>
         * <p> The system automatically sends a verification email to the email address. After the verification is passed, the email address takes effect, and the system changes both the logon email address and secure email address of the member.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        @Override
        public ChangeAccountEmailRequest build() {
            return new ChangeAccountEmailRequest(this);
        } 

    } 

}
