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
 * {@link CustomerSensitiveInfoLogicalDeleteRequest} extends {@link RequestModel}
 *
 * <p>CustomerSensitiveInfoLogicalDeleteRequest</p>
 */
public class CustomerSensitiveInfoLogicalDeleteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uid;

    private CustomerSensitiveInfoLogicalDeleteRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomerSensitiveInfoLogicalDeleteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<CustomerSensitiveInfoLogicalDeleteRequest, Builder> {
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(CustomerSensitiveInfoLogicalDeleteRequest request) {
            super(request);
            this.uid = request.uid;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public CustomerSensitiveInfoLogicalDeleteRequest build() {
            return new CustomerSensitiveInfoLogicalDeleteRequest(this);
        } 

    } 

}
