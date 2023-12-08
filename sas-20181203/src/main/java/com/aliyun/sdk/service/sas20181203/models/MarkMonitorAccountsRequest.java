// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MarkMonitorAccountsRequest} extends {@link RequestModel}
 *
 * <p>MarkMonitorAccountsRequest</p>
 */
public class MarkMonitorAccountsRequest extends Request {
    @Query
    @NameInMap("AccountIds")
    @Validation(required = true)
    private String accountIds;

    private MarkMonitorAccountsRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarkMonitorAccountsRequest create() {
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

    public static final class Builder extends Request.Builder<MarkMonitorAccountsRequest, Builder> {
        private String accountIds; 

        private Builder() {
            super();
        } 

        private Builder(MarkMonitorAccountsRequest request) {
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
        public MarkMonitorAccountsRequest build() {
            return new MarkMonitorAccountsRequest(this);
        } 

    } 

}
