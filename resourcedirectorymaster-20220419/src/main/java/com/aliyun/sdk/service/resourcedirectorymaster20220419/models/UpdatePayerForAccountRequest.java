// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link UpdatePayerForAccountRequest} extends {@link RequestModel}
 *
 * <p>UpdatePayerForAccountRequest</p>
 */
public class UpdatePayerForAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayerAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payerAccountId;

    private UpdatePayerForAccountRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.payerAccountId = builder.payerAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePayerForAccountRequest create() {
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

    /**
     * @return payerAccountId
     */
    public String getPayerAccountId() {
        return this.payerAccountId;
    }

    public static final class Builder extends Request.Builder<UpdatePayerForAccountRequest, Builder> {
        private String accountId; 
        private String payerAccountId; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePayerForAccountRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.payerAccountId = request.payerAccountId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>138660628348****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        public Builder payerAccountId(String payerAccountId) {
            this.putQueryParameter("PayerAccountId", payerAccountId);
            this.payerAccountId = payerAccountId;
            return this;
        }

        @Override
        public UpdatePayerForAccountRequest build() {
            return new UpdatePayerForAccountRequest(this);
        } 

    } 

}
