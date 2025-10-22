// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link CheckPushReceiverRequest} extends {@link RequestModel}
 *
 * <p>CheckPushReceiverRequest</p>
 */
public class CheckPushReceiverRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverAccount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverAccount;

    private CheckPushReceiverRequest(Builder builder) {
        super(builder);
        this.receiverAccount = builder.receiverAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckPushReceiverRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return receiverAccount
     */
    public String getReceiverAccount() {
        return this.receiverAccount;
    }

    public static final class Builder extends Request.Builder<CheckPushReceiverRequest, Builder> {
        private String receiverAccount; 

        private Builder() {
            super();
        } 

        private Builder(CheckPushReceiverRequest request) {
            super(request);
            this.receiverAccount = request.receiverAccount;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>破天荒的土豆</p>
         */
        public Builder receiverAccount(String receiverAccount) {
            this.putQueryParameter("ReceiverAccount", receiverAccount);
            this.receiverAccount = receiverAccount;
            return this;
        }

        @Override
        public CheckPushReceiverRequest build() {
            return new CheckPushReceiverRequest(this);
        } 

    } 

}
