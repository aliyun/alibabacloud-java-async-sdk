// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserInfoByAccountRequest} extends {@link RequestModel}
 *
 * <p>QueryUserInfoByAccountRequest</p>
 */
public class QueryUserInfoByAccountRequest extends Request {
    @Query
    @NameInMap("Account")
    @Validation(required = true)
    private String account;

    private QueryUserInfoByAccountRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserInfoByAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    public static final class Builder extends Request.Builder<QueryUserInfoByAccountRequest, Builder> {
        private String account; 

        private Builder() {
            super();
        } 

        private Builder(QueryUserInfoByAccountRequest request) {
            super(request);
            this.account = request.account;
        } 

        /**
         * Account.
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        @Override
        public QueryUserInfoByAccountRequest build() {
            return new QueryUserInfoByAccountRequest(this);
        } 

    } 

}
