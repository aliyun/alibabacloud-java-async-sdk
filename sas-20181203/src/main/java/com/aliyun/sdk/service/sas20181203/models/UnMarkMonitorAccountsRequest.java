// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnMarkMonitorAccountsRequest} extends {@link RequestModel}
 *
 * <p>UnMarkMonitorAccountsRequest</p>
 */
public class UnMarkMonitorAccountsRequest extends Request {
    @Query
    @NameInMap("AccountIds")
    @Validation(required = true)
    private String accountIds;

    private UnMarkMonitorAccountsRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnMarkMonitorAccountsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIds
     */
    public String getAccountIds() {
        return this.accountIds;
    }

    public static final class Builder extends Request.Builder<UnMarkMonitorAccountsRequest, Builder> {
        private String accountIds; 

        private Builder() {
            super();
        } 

        private Builder(UnMarkMonitorAccountsRequest request) {
            super(request);
            this.accountIds = request.accountIds;
        } 

        /**
         * The IDs of the members.
         */
        public Builder accountIds(String accountIds) {
            this.putQueryParameter("AccountIds", accountIds);
            this.accountIds = accountIds;
            return this;
        }

        @Override
        public UnMarkMonitorAccountsRequest build() {
            return new UnMarkMonitorAccountsRequest(this);
        } 

    } 

}
