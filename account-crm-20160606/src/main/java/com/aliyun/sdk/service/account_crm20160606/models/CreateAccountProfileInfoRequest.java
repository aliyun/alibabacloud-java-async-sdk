// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link CreateAccountProfileInfoRequest} extends {@link RequestModel}
 *
 * <p>CreateAccountProfileInfoRequest</p>
 */
public class CreateAccountProfileInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountJson")
    private String accountJson;

    private CreateAccountProfileInfoRequest(Builder builder) {
        super(builder);
        this.accountJson = builder.accountJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccountProfileInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountJson
     */
    public String getAccountJson() {
        return this.accountJson;
    }

    public static final class Builder extends Request.Builder<CreateAccountProfileInfoRequest, Builder> {
        private String accountJson; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccountProfileInfoRequest request) {
            super(request);
            this.accountJson = request.accountJson;
        } 

        /**
         * AccountJson.
         */
        public Builder accountJson(String accountJson) {
            this.putQueryParameter("AccountJson", accountJson);
            this.accountJson = accountJson;
            return this;
        }

        @Override
        public CreateAccountProfileInfoRequest build() {
            return new CreateAccountProfileInfoRequest(this);
        } 

    } 

}
