// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link DescribeWarehouseCertRequest} extends {@link RequestModel}
 *
 * <p>DescribeWarehouseCertRequest</p>
 */
public class DescribeWarehouseCertRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    private String certIdentifier;

    private DescribeWarehouseCertRequest(Builder builder) {
        super(builder);
        this.certIdentifier = builder.certIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWarehouseCertRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public static final class Builder extends Request.Builder<DescribeWarehouseCertRequest, Builder> {
        private String certIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWarehouseCertRequest request) {
            super(request);
            this.certIdentifier = request.certIdentifier;
        } 

        /**
         * CertIdentifier.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putQueryParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        @Override
        public DescribeWarehouseCertRequest build() {
            return new DescribeWarehouseCertRequest(this);
        } 

    } 

}
