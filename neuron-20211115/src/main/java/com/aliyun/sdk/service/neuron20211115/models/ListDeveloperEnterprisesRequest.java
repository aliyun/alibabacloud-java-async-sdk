// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListDeveloperEnterprisesRequest} extends {@link RequestModel}
 *
 * <p>ListDeveloperEnterprisesRequest</p>
 */
public class ListDeveloperEnterprisesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    private ListDeveloperEnterprisesRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeveloperEnterprisesRequest create() {
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

    public static final class Builder extends Request.Builder<ListDeveloperEnterprisesRequest, Builder> {
        private String accountId; 

        private Builder() {
            super();
        } 

        private Builder(ListDeveloperEnterprisesRequest request) {
            super(request);
            this.accountId = request.accountId;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putPathParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        @Override
        public ListDeveloperEnterprisesRequest build() {
            return new ListDeveloperEnterprisesRequest(this);
        } 

    } 

}
