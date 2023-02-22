// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeAccountEmailRequest} extends {@link RequestModel}
 *
 * <p>ChangeAccountEmailRequest</p>
 */
public class ChangeAccountEmailRequest extends Request {
    @Query
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    @Query
    @NameInMap("Email")
    @Validation(required = true)
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
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * Email.
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
