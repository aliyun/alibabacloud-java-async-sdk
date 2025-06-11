// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
 * {@link DisableDelegateAccountRequest} extends {@link RequestModel}
 *
 * <p>DisableDelegateAccountRequest</p>
 */
public class DisableDelegateAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    private DisableDelegateAccountRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableDelegateAccountRequest create() {
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

    public static final class Builder extends Request.Builder<DisableDelegateAccountRequest, Builder> {
        private String accountId; 

        private Builder() {
            super();
        } 

        private Builder(DisableDelegateAccountRequest request) {
            super(request);
            this.accountId = request.accountId;
        } 

        /**
         * <p>The ID of the delegated administrator account of CloudSSO.</p>
         * 
         * <strong>example:</strong>
         * <p>1200971777065046</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        @Override
        public DisableDelegateAccountRequest build() {
            return new DisableDelegateAccountRequest(this);
        } 

    } 

}
