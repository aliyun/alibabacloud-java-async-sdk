// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDelegatedServicesForAccountRequest} extends {@link RequestModel}
 *
 * <p>ListDelegatedServicesForAccountRequest</p>
 */
public class ListDelegatedServicesForAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    private ListDelegatedServicesForAccountRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDelegatedServicesForAccountRequest create() {
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

    public static final class Builder extends Request.Builder<ListDelegatedServicesForAccountRequest, Builder> {
        private String accountId; 

        private Builder() {
            super();
        } 

        private Builder(ListDelegatedServicesForAccountRequest request) {
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
        public ListDelegatedServicesForAccountRequest build() {
            return new ListDelegatedServicesForAccountRequest(this);
        } 

    } 

}
