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
 * {@link UpdateAgreementStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateAgreementStatusRequest</p>
 */
public class UpdateAgreementStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgreementCode")
    private String agreementCode;

    private UpdateAgreementStatusRequest(Builder builder) {
        super(builder);
        this.agreementCode = builder.agreementCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgreementStatusRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateAgreementStatusRequest, Builder> {
        private String agreementCode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgreementStatusRequest request) {
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
        public UpdateAgreementStatusRequest build() {
            return new UpdateAgreementStatusRequest(this);
        } 

    } 

}
