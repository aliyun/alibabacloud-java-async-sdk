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
 * {@link GetCustomerCategoryDictionaryRequest} extends {@link RequestModel}
 *
 * <p>GetCustomerCategoryDictionaryRequest</p>
 */
public class GetCustomerCategoryDictionaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private GetCustomerCategoryDictionaryRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomerCategoryDictionaryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetCustomerCategoryDictionaryRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetCustomerCategoryDictionaryRequest request) {
            super(request);
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetCustomerCategoryDictionaryRequest build() {
            return new GetCustomerCategoryDictionaryRequest(this);
        } 

    } 

}
