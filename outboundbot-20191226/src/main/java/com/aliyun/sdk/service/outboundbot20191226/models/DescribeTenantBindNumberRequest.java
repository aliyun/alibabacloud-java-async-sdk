// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DescribeTenantBindNumberRequest} extends {@link RequestModel}
 *
 * <p>DescribeTenantBindNumberRequest</p>
 */
public class DescribeTenantBindNumberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Number")
    private String number;

    private DescribeTenantBindNumberRequest(Builder builder) {
        super(builder);
        this.number = builder.number;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTenantBindNumberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    public static final class Builder extends Request.Builder<DescribeTenantBindNumberRequest, Builder> {
        private String number; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTenantBindNumberRequest request) {
            super(request);
            this.number = request.number;
        } 

        /**
         * Number.
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        @Override
        public DescribeTenantBindNumberRequest build() {
            return new DescribeTenantBindNumberRequest(this);
        } 

    } 

}
