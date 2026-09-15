// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DeleteMonitorAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteMonitorAccountRequest</p>
 */
public class DeleteMonitorAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    private DeleteMonitorAccountRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMonitorAccountRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteMonitorAccountRequest, Builder> {
        private String accountId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMonitorAccountRequest request) {
            super(request);
            this.accountId = request.accountId;
        } 

        /**
         * <p>The ID of the member account that you want to delete from the Security Center monitoring account list.</p>
         * <blockquote>
         * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the list of member accounts IDs that are managed by Security Center.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1840517068******</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        @Override
        public DeleteMonitorAccountRequest build() {
            return new DeleteMonitorAccountRequest(this);
        } 

    } 

}
