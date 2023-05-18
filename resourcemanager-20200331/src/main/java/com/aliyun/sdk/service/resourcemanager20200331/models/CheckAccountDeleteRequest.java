// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckAccountDeleteRequest} extends {@link RequestModel}
 *
 * <p>CheckAccountDeleteRequest</p>
 */
public class CheckAccountDeleteRequest extends Request {
    @Query
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    private CheckAccountDeleteRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAccountDeleteRequest create() {
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

    public static final class Builder extends Request.Builder<CheckAccountDeleteRequest, Builder> {
        private String accountId; 

        private Builder() {
            super();
        } 

        private Builder(CheckAccountDeleteRequest request) {
            super(request);
            this.accountId = request.accountId;
        } 

        /**
         * The ID of the member that you want to delete.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        @Override
        public CheckAccountDeleteRequest build() {
            return new CheckAccountDeleteRequest(this);
        } 

    } 

}
