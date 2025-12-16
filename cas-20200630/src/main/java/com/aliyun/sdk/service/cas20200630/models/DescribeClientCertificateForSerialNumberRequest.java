// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link DescribeClientCertificateForSerialNumberRequest} extends {@link RequestModel}
 *
 * <p>DescribeClientCertificateForSerialNumberRequest</p>
 */
public class DescribeClientCertificateForSerialNumberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serialNumber;

    private DescribeClientCertificateForSerialNumberRequest(Builder builder) {
        super(builder);
        this.serialNumber = builder.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientCertificateForSerialNumberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public static final class Builder extends Request.Builder<DescribeClientCertificateForSerialNumberRequest, Builder> {
        private String serialNumber; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClientCertificateForSerialNumberRequest request) {
            super(request);
            this.serialNumber = request.serialNumber;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>084bde9cd233f0ddae33adc438cfbbbd****</p>
         */
        public Builder serialNumber(String serialNumber) {
            this.putQueryParameter("SerialNumber", serialNumber);
            this.serialNumber = serialNumber;
            return this;
        }

        @Override
        public DescribeClientCertificateForSerialNumberRequest build() {
            return new DescribeClientCertificateForSerialNumberRequest(this);
        } 

    } 

}
