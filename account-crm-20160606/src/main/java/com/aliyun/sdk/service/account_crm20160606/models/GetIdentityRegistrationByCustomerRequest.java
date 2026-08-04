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
 * {@link GetIdentityRegistrationByCustomerRequest} extends {@link RequestModel}
 *
 * <p>GetIdentityRegistrationByCustomerRequest</p>
 */
public class GetIdentityRegistrationByCustomerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customerId;

    private GetIdentityRegistrationByCustomerRequest(Builder builder) {
        super(builder);
        this.customerId = builder.customerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdentityRegistrationByCustomerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerId
     */
    public String getCustomerId() {
        return this.customerId;
    }

    public static final class Builder extends Request.Builder<GetIdentityRegistrationByCustomerRequest, Builder> {
        private String customerId; 

        private Builder() {
            super();
        } 

        private Builder(GetIdentityRegistrationByCustomerRequest request) {
            super(request);
            this.customerId = request.customerId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder customerId(String customerId) {
            this.putQueryParameter("CustomerId", customerId);
            this.customerId = customerId;
            return this;
        }

        @Override
        public GetIdentityRegistrationByCustomerRequest build() {
            return new GetIdentityRegistrationByCustomerRequest(this);
        } 

    } 

}
