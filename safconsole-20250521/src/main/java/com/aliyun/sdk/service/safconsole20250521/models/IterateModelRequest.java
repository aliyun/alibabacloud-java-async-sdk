// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link IterateModelRequest} extends {@link RequestModel}
 *
 * <p>IterateModelRequest</p>
 */
public class IterateModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerModuleId")
    private Integer customerModuleId;

    private IterateModelRequest(Builder builder) {
        super(builder);
        this.customerModuleId = builder.customerModuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IterateModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerModuleId
     */
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

    public static final class Builder extends Request.Builder<IterateModelRequest, Builder> {
        private Integer customerModuleId; 

        private Builder() {
            super();
        } 

        private Builder(IterateModelRequest request) {
            super(request);
            this.customerModuleId = request.customerModuleId;
        } 

        /**
         * CustomerModuleId.
         */
        public Builder customerModuleId(Integer customerModuleId) {
            this.putQueryParameter("CustomerModuleId", customerModuleId);
            this.customerModuleId = customerModuleId;
            return this;
        }

        @Override
        public IterateModelRequest build() {
            return new IterateModelRequest(this);
        } 

    } 

}
