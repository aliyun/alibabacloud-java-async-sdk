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
 * {@link CreateMonitorAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorAccountRequest</p>
 */
public class CreateMonitorAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountIds")
    private String accountIds;

    private CreateMonitorAccountRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorAccountRequest create() {
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

    public static final class Builder extends Request.Builder<CreateMonitorAccountRequest, Builder> {
        private String accountIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateMonitorAccountRequest request) {
            super(request);
            this.accountIds = request.accountIds;
        } 

        /**
         * <p>The account IDs of members in the resource directory.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListAccountsInResourceDirectory~~">ListAccountsInResourceDirectory</a> operation to obtain the account IDs. Separate multiple account IDs with commas (,). If you specify a value for this parameter, the existing list of members is replaced by the new list that you specify. Otherwise, the existing list is cleared.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1026780160******,1457515594******</p>
         */
        public Builder accountIds(String accountIds) {
            this.putQueryParameter("AccountIds", accountIds);
            this.accountIds = accountIds;
            return this;
        }

        @Override
        public CreateMonitorAccountRequest build() {
            return new CreateMonitorAccountRequest(this);
        } 

    } 

}
