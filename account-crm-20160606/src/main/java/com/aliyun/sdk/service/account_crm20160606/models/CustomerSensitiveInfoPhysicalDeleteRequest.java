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
 * {@link CustomerSensitiveInfoPhysicalDeleteRequest} extends {@link RequestModel}
 *
 * <p>CustomerSensitiveInfoPhysicalDeleteRequest</p>
 */
public class CustomerSensitiveInfoPhysicalDeleteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uid;

    private CustomerSensitiveInfoPhysicalDeleteRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomerSensitiveInfoPhysicalDeleteRequest create() {
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

    public static final class Builder extends Request.Builder<CustomerSensitiveInfoPhysicalDeleteRequest, Builder> {
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(CustomerSensitiveInfoPhysicalDeleteRequest request) {
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
        public CustomerSensitiveInfoPhysicalDeleteRequest build() {
            return new CustomerSensitiveInfoPhysicalDeleteRequest(this);
        } 

    } 

}
