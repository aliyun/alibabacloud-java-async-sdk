// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link CreatePayOrderCallbackRequest} extends {@link RequestModel}
 *
 * <p>CreatePayOrderCallbackRequest</p>
 */
public class CreatePayOrderCallbackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("data")
    private String data;

    private CreatePayOrderCallbackRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePayOrderCallbackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    public static final class Builder extends Request.Builder<CreatePayOrderCallbackRequest, Builder> {
        private String data; 

        private Builder() {
            super();
        } 

        private Builder(CreatePayOrderCallbackRequest request) {
            super(request);
            this.data = request.data;
        } 

        /**
         * data.
         */
        public Builder data(String data) {
            this.putQueryParameter("data", data);
            this.data = data;
            return this;
        }

        @Override
        public CreatePayOrderCallbackRequest build() {
            return new CreatePayOrderCallbackRequest(this);
        } 

    } 

}
