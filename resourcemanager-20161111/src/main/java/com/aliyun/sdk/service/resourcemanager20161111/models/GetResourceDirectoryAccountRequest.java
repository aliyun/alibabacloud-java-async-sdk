// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceDirectoryAccountRequest} extends {@link RequestModel}
 *
 * <p>GetResourceDirectoryAccountRequest</p>
 */
public class GetResourceDirectoryAccountRequest extends Request {
    @Query
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    private GetResourceDirectoryAccountRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceDirectoryAccountRequest create() {
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

    public static final class Builder extends Request.Builder<GetResourceDirectoryAccountRequest, Builder> {
        private String accountId; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceDirectoryAccountRequest request) {
            super(request);
            this.accountId = request.accountId;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        @Override
        public GetResourceDirectoryAccountRequest build() {
            return new GetResourceDirectoryAccountRequest(this);
        } 

    } 

}
