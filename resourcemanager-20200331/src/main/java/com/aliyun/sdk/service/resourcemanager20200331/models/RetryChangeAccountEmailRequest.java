// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryChangeAccountEmailRequest} extends {@link RequestModel}
 *
 * <p>RetryChangeAccountEmailRequest</p>
 */
public class RetryChangeAccountEmailRequest extends Request {
    @Query
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    private RetryChangeAccountEmailRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryChangeAccountEmailRequest create() {
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

    public static final class Builder extends Request.Builder<RetryChangeAccountEmailRequest, Builder> {
        private String accountId; 

        private Builder() {
            super();
        } 

        private Builder(RetryChangeAccountEmailRequest request) {
            super(request);
            this.accountId = request.accountId;
        } 

        /**
         * The Alibaba Cloud account ID of the member.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        @Override
        public RetryChangeAccountEmailRequest build() {
            return new RetryChangeAccountEmailRequest(this);
        } 

    } 

}
