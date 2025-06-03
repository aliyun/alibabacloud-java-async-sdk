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
 * {@link CreateRefundRequest} extends {@link RequestModel}
 *
 * <p>CreateRefundRequest</p>
 */
public class CreateRefundRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("data")
    private String data;

    private CreateRefundRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRefundRequest create() {
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

    public static final class Builder extends Request.Builder<CreateRefundRequest, Builder> {
        private String data; 

        private Builder() {
            super();
        } 

        private Builder(CreateRefundRequest request) {
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
        public CreateRefundRequest build() {
            return new CreateRefundRequest(this);
        } 

    } 

}
