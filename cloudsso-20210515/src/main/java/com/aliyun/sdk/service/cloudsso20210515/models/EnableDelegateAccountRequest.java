// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableDelegateAccountRequest} extends {@link RequestModel}
 *
 * <p>EnableDelegateAccountRequest</p>
 */
public class EnableDelegateAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    private EnableDelegateAccountRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableDelegateAccountRequest create() {
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

    public static final class Builder extends Request.Builder<EnableDelegateAccountRequest, Builder> {
        private String accountId; 

        private Builder() {
            super();
        } 

        private Builder(EnableDelegateAccountRequest request) {
            super(request);
            this.accountId = request.accountId;
        } 

        /**
         * <p>The ID of the delegated administrator account of CloudSSO.</p>
         * 
         * <strong>example:</strong>
         * <p>180658567986****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        @Override
        public EnableDelegateAccountRequest build() {
            return new EnableDelegateAccountRequest(this);
        } 

    } 

}
