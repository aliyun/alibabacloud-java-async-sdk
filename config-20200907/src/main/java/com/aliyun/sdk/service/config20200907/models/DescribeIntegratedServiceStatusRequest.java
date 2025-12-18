// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link DescribeIntegratedServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeIntegratedServiceStatusRequest</p>
 */
public class DescribeIntegratedServiceStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    private DescribeIntegratedServiceStatusRequest(Builder builder) {
        super(builder);
        this.serviceCode = builder.serviceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIntegratedServiceStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    public static final class Builder extends Request.Builder<DescribeIntegratedServiceStatusRequest, Builder> {
        private String serviceCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIntegratedServiceStatusRequest request) {
            super(request);
            this.serviceCode = request.serviceCode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cadt</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        @Override
        public DescribeIntegratedServiceStatusRequest build() {
            return new DescribeIntegratedServiceStatusRequest(this);
        } 

    } 

}
