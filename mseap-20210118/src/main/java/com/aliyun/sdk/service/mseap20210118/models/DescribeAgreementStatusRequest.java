// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mseap20210118.models;

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
 * {@link DescribeAgreementStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeAgreementStatusRequest</p>
 */
public class DescribeAgreementStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgreementCode")
    private String agreementCode;

    private DescribeAgreementStatusRequest(Builder builder) {
        super(builder);
        this.agreementCode = builder.agreementCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgreementStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agreementCode
     */
    public String getAgreementCode() {
        return this.agreementCode;
    }

    public static final class Builder extends Request.Builder<DescribeAgreementStatusRequest, Builder> {
        private String agreementCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAgreementStatusRequest request) {
            super(request);
            this.agreementCode = request.agreementCode;
        } 

        /**
         * AgreementCode.
         */
        public Builder agreementCode(String agreementCode) {
            this.putQueryParameter("AgreementCode", agreementCode);
            this.agreementCode = agreementCode;
            return this;
        }

        @Override
        public DescribeAgreementStatusRequest build() {
            return new DescribeAgreementStatusRequest(this);
        } 

    } 

}
