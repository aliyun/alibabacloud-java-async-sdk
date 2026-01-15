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
 * {@link DescribeModuleStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeModuleStatusRequest</p>
 */
public class DescribeModuleStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerModuleId")
    private Integer customerModuleId;

    private DescribeModuleStatusRequest(Builder builder) {
        super(builder);
        this.customerModuleId = builder.customerModuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModuleStatusRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeModuleStatusRequest, Builder> {
        private Integer customerModuleId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeModuleStatusRequest request) {
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
        public DescribeModuleStatusRequest build() {
            return new DescribeModuleStatusRequest(this);
        } 

    } 

}
