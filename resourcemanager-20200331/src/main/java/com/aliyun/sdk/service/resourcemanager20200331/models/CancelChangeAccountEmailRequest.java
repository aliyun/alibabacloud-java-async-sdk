// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelChangeAccountEmailRequest} extends {@link RequestModel}
 *
 * <p>CancelChangeAccountEmailRequest</p>
 */
public class CancelChangeAccountEmailRequest extends Request {
    @Query
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    private CancelChangeAccountEmailRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelChangeAccountEmailRequest create() {
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

    public static final class Builder extends Request.Builder<CancelChangeAccountEmailRequest, Builder> {
        private String accountId; 

        private Builder() {
            super();
        } 

        private Builder(CancelChangeAccountEmailRequest request) {
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
        public CancelChangeAccountEmailRequest build() {
            return new CancelChangeAccountEmailRequest(this);
        } 

    } 

}
