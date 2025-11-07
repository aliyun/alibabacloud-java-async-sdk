// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeOssStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeOssStatusRequest</p>
 */
public class DescribeOssStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    private DescribeOssStatusRequest(Builder builder) {
        super(builder);
        this.serviceCode = builder.serviceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssStatusRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeOssStatusRequest, Builder> {
        private String serviceCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOssStatusRequest request) {
            super(request);
            this.serviceCode = request.serviceCode;
        } 

        /**
         * <p>Service code:</p>
         * <ul>
         * <li>antcloudauth: Financial-grade real-person authentication</li>
         * <li>cloudauthst (discontinued): Enhanced real-person authentication</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>antcloudauth</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        @Override
        public DescribeOssStatusRequest build() {
            return new DescribeOssStatusRequest(this);
        } 

    } 

}
